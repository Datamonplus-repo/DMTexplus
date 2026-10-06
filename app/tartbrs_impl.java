package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tartbrs_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_57") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_57( A396EmprCod, A840TrnCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A10978Bros_Art = httpContext.GetPar( "Bros_Art") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10978Bros_Art", A10978Bros_Art);
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FICHA TECNICA ARTICULO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBros_Mcot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tartbrs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tartbrs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tartbrs_impl.class ));
   }

   public tartbrs_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbBrosBov = new HTMLChoice();
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
      if ( cmbBrosBov.getItemCount() > 0 )
      {
         A10988BrosBov = cmbBrosBov.getValidValue(A10988BrosBov) ;
         n10988BrosBov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", A10988BrosBov);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBrosBov.setValue( GXutil.rtrim( A10988BrosBov) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBrosBov.getInternalname(), "Values", cmbBrosBov.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TARTBRS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_Art_Internalname, GXutil.rtrim( A10978Bros_Art), GXutil.rtrim( localUtil.format( A10978Bros_Art, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_Art_Jsonclick, 0, "", "", "", "", "", 1, edtBros_Art_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Materia Crudo Oeko Tex", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_Mcot_Internalname, GXutil.rtrim( A10979Bros_Mcot), GXutil.rtrim( localUtil.format( A10979Bros_Mcot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_Mcot_Jsonclick, 0, "", "", "", "", "", 1, edtBros_Mcot_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Portes debido", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_Pd_Internalname, GXutil.rtrim( A10980Bros_Pd), GXutil.rtrim( localUtil.format( A10980Bros_Pd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_Pd_Jsonclick, 0, "", "", "", "", "", 1, edtBros_Pd_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Portes Pagados", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_Pp_Internalname, GXutil.rtrim( A10981Bros_Pp), GXutil.rtrim( localUtil.format( A10981Bros_Pp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_Pp_Jsonclick, 0, "", "", "", "", "", 1, edtBros_Pp_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Agencia", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_Ag_Internalname, GXutil.rtrim( A10982Bros_Ag), GXutil.rtrim( localUtil.format( A10982Bros_Ag, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_Ag_Jsonclick, 0, "", "", "", "", "", 1, edtBros_Ag_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Comentario Oficinas", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c1_Internalname, A10983Bros_c1, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtBros_c1_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Comentarios Almacen", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c2_Internalname, A10984Bros_c2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtBros_c2_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Bobinado?", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_bo_Internalname, GXutil.rtrim( A10985Bros_bo), GXutil.rtrim( localUtil.format( A10985Bros_bo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_bo_Jsonclick, 0, "", "", "", "", "", 1, edtBros_bo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Bobinado Bros?", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_bob_Internalname, GXutil.rtrim( A10986Bros_bob), GXutil.rtrim( localUtil.format( A10986Bros_bob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_bob_Jsonclick, 0, "", "", "", "", "", 1, edtBros_bob_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Bobinado Externo?", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_boe_Internalname, GXutil.rtrim( A10987Bros_boe), GXutil.rtrim( localUtil.format( A10987Bros_boe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_boe_Jsonclick, 0, "", "", "", "", "", 1, edtBros_boe_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Vaporado?", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBrosBov, cmbBrosBov.getInternalname(), GXutil.rtrim( A10988BrosBov), 1, cmbBrosBov.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbBrosBov.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "", true, (byte)(0), "HLP_TARTBRS.htm");
      cmbBrosBov.setValue( GXutil.rtrim( A10988BrosBov) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBrosBov.getInternalname(), "Values", cmbBrosBov.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Comentarios Bobinado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c3_Internalname, A10989Bros_c3, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", (short)(0), 1, edtBros_c3_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tinte, solidez?", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_tns_Internalname, GXutil.rtrim( A10990Bros_tns), GXutil.rtrim( localUtil.format( A10990Bros_tns, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_tns_Jsonclick, 0, "", "", "", "", "", 1, edtBros_tns_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Tinte, Ctw", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_tnc_Internalname, GXutil.rtrim( A10991Bros_tnc), GXutil.rtrim( localUtil.format( A10991Bros_tnc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_tnc_Jsonclick, 0, "", "", "", "", "", 1, edtBros_tnc_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Comentarios Tinte", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c4_Internalname, A10992Bros_c4, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", (short)(0), 1, edtBros_c4_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Centrigugado?", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ct_Internalname, GXutil.rtrim( A10993Bros_ct), GXutil.rtrim( localUtil.format( A10993Bros_ct, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ct_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ct_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Comentarios Centrigugado", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c5_Internalname, A10994Bros_c5, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", (short)(0), 1, edtBros_c5_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Secado Stalam?", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_scs_Internalname, GXutil.rtrim( A10995Bros_scs), GXutil.rtrim( localUtil.format( A10995Bros_scs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_scs_Jsonclick, 0, "", "", "", "", "", 1, edtBros_scs_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Secado Camara?", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_scc_Internalname, GXutil.rtrim( A10996Bros_scc), GXutil.rtrim( localUtil.format( A10996Bros_scc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_scc_Jsonclick, 0, "", "", "", "", "", 1, edtBros_scc_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Comentarios Secado", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c6_Internalname, A10997Bros_c6, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", (short)(0), 1, edtBros_c6_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Tejido Solo Exterior?", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_cctse_Internalname, GXutil.rtrim( A10998Bros_cctse), GXutil.rtrim( localUtil.format( A10998Bros_cctse, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_cctse_Jsonclick, 0, "", "", "", "", "", 1, edtBros_cctse_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Tejido Tres Partes", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccttp_Internalname, GXutil.rtrim( A10999Bros_ccttp), GXutil.rtrim( localUtil.format( A10999Bros_ccttp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccttp_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccttp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Tejido en tipos?", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_cctet_Internalname, GXutil.rtrim( A11000Bros_cctet), GXutil.rtrim( localUtil.format( A11000Bros_cctet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_cctet_Jsonclick, 0, "", "", "", "", "", 1, edtBros_cctet_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Pestaña", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccp_Internalname, GXutil.ltrim( localUtil.ntoc( A11001Bros_ccp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBros_ccp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11001Bros_ccp), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11001Bros_ccp), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccp_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccp_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_cct_Internalname, GXutil.ltrim( localUtil.ntoc( A11002Bros_cct, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBros_cct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11002Bros_cct), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11002Bros_cct), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_cct_Jsonclick, 0, "", "", "", "", "", 1, edtBros_cct_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Placa?", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccpc_Internalname, GXutil.rtrim( A11003Bros_ccpc), GXutil.rtrim( localUtil.format( A11003Bros_ccpc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccpc_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccpc_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Troquillo?", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_cctq_Internalname, GXutil.rtrim( A11004Bros_cctq), GXutil.rtrim( localUtil.format( A11004Bros_cctq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_cctq_Jsonclick, 0, "", "", "", "", "", 1, edtBros_cctq_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Conformidad Cliente?", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_cccc_Internalname, GXutil.rtrim( A11005Bros_cccc), GXutil.rtrim( localUtil.format( A11005Bros_cccc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_cccc_Jsonclick, 0, "", "", "", "", "", 1, edtBros_cccc_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Etiquetas cono?", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccec_Internalname, GXutil.rtrim( A11006Bros_ccec), GXutil.rtrim( localUtil.format( A11006Bros_ccec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccec_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Muestras para el cliente Tipo?", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccmc1_Internalname, GXutil.rtrim( A11008Bros_ccmc1), GXutil.rtrim( localUtil.format( A11008Bros_ccmc1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccmc1_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccmc1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Muestras para el cliente Tejido?", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccmc2_Internalname, GXutil.rtrim( A11009Bros_ccmc2), GXutil.rtrim( localUtil.format( A11009Bros_ccmc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccmc2_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccmc2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Muestras para el cliente Pestaña?", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccmc3_Internalname, GXutil.rtrim( A11010Bros_ccmc3), GXutil.rtrim( localUtil.format( A11010Bros_ccmc3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccmc3_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccmc3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Muestras para el cliente Culote?", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccmc4_Internalname, GXutil.rtrim( A11011Bros_ccmc4), GXutil.rtrim( localUtil.format( A11011Bros_ccmc4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccmc4_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccmc4_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Muestras para el cliente Placa?", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccmc5_Internalname, GXutil.rtrim( A11012Bros_ccmc5), GXutil.rtrim( localUtil.format( A11012Bros_ccmc5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccmc5_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccmc5_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Muestras para el cliente Colorimetria?", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ccmc6_Internalname, GXutil.rtrim( A11013Bros_ccmc6), GXutil.rtrim( localUtil.format( A11013Bros_ccmc6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ccmc6_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ccmc6_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Comentarios Control Calidad", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c7_Internalname, A11014Bros_c7, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", (short)(0), 1, edtBros_c7_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Rebobinado?", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_rb_Internalname, GXutil.rtrim( A11015Bros_rb), GXutil.rtrim( localUtil.format( A11015Bros_rb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_rb_Jsonclick, 0, "", "", "", "", "", 1, edtBros_rb_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Rebobinado Interno?", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_rbi_Internalname, GXutil.rtrim( A11016Bros_rbi), GXutil.rtrim( localUtil.format( A11016Bros_rbi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_rbi_Jsonclick, 0, "", "", "", "", "", 1, edtBros_rbi_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Rebobinado Externo?", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_rbe_Internalname, GXutil.rtrim( A11017Bros_rbe), GXutil.rtrim( localUtil.format( A11017Bros_rbe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_rbe_Jsonclick, 0, "", "", "", "", "", 1, edtBros_rbe_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Parafinado?", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_rbp_Internalname, GXutil.rtrim( A11018Bros_rbp), GXutil.rtrim( localUtil.format( A11018Bros_rbp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_rbp_Jsonclick, 0, "", "", "", "", "", 1, edtBros_rbp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Obtener Conos", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_rboc_Internalname, GXutil.ltrim( localUtil.ntoc( A11019Bros_rboc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBros_rboc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11019Bros_rboc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11019Bros_rboc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_rboc_Jsonclick, 0, "", "", "", "", "", 1, edtBros_rboc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Conos para el control, Un Cono?", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_rb1_Internalname, GXutil.rtrim( A11020Bros_rb1), GXutil.rtrim( localUtil.format( A11020Bros_rb1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_rb1_Jsonclick, 0, "", "", "", "", "", 1, edtBros_rb1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Conos para el control, Tres partes?", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_rb3_Internalname, GXutil.rtrim( A11021Bros_rb3), GXutil.rtrim( localUtil.format( A11021Bros_rb3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_rb3_Jsonclick, 0, "", "", "", "", "", 1, edtBros_rb3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Comentarios Rebobinado", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c8_Internalname, A11022Bros_c8, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", (short)(0), 1, edtBros_c8_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Empaquetado Paletizado?", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep1_Internalname, GXutil.rtrim( A11023Bros_ep1), GXutil.rtrim( localUtil.format( A11023Bros_ep1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep1_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Empaquetado Cajas sin concretar?", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep2_Internalname, GXutil.rtrim( A11024Bros_ep2), GXutil.rtrim( localUtil.format( A11024Bros_ep2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep2_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Empaquetado Cajas Bros?", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep3_Internalname, GXutil.rtrim( A11025Bros_ep3), GXutil.rtrim( localUtil.format( A11025Bros_ep3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep3_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Empaquetado Cajas Cliente?", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep4_Internalname, GXutil.rtrim( A11026Bros_ep4), GXutil.rtrim( localUtil.format( A11026Bros_ep4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep4_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep4_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Empaquetado Bolsas?", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep5_Internalname, GXutil.rtrim( A11027Bros_ep5), GXutil.rtrim( localUtil.format( A11027Bros_ep5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep5_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep5_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Conos en Bolsas normales?", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep6_Internalname, GXutil.rtrim( A11028Bros_ep6), GXutil.rtrim( localUtil.format( A11028Bros_ep6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep6_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep6_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Conos en Bolsas perforadas?", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep7_Internalname, GXutil.rtrim( A11029Bros_ep7), GXutil.rtrim( localUtil.format( A11029Bros_ep7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep7_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep7_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Etiquetas conos?", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep8_Internalname, GXutil.rtrim( A11030Bros_ep8), GXutil.rtrim( localUtil.format( A11030Bros_ep8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep8_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep8_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Packing List?", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep9_Internalname, GXutil.rtrim( A11031Bros_ep9), GXutil.rtrim( localUtil.format( A11031Bros_ep9, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,306);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep9_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep9_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Bruto-Tara-Neto?", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_ep10_Internalname, GXutil.rtrim( A11032Bros_ep10), GXutil.rtrim( localUtil.format( A11032Bros_ep10, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_ep10_Jsonclick, 0, "", "", "", "", "", 1, edtBros_ep10_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Comentarios Empaquetado", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c9_Internalname, A11033Bros_c9, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,316);\"", (short)(0), 1, edtBros_c9_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Packing List?", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_sa1_Internalname, GXutil.rtrim( A11034Bros_sa1), GXutil.rtrim( localUtil.format( A11034Bros_sa1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_sa1_Jsonclick, 0, "", "", "", "", "", 1, edtBros_sa1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Bruto-Tara-Neto?", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_sa2_Internalname, GXutil.rtrim( A11035Bros_sa2), GXutil.rtrim( localUtil.format( A11035Bros_sa2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_sa2_Jsonclick, 0, "", "", "", "", "", 1, edtBros_sa2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Portes Pagados?", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_sa3_Internalname, GXutil.rtrim( A11036Bros_sa3), GXutil.rtrim( localUtil.format( A11036Bros_sa3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,331);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_sa3_Jsonclick, 0, "", "", "", "", "", 1, edtBros_sa3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Portes Debidos?", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_sa4_Internalname, GXutil.rtrim( A11037Bros_sa4), GXutil.rtrim( localUtil.format( A11037Bros_sa4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_sa4_Jsonclick, 0, "", "", "", "", "", 1, edtBros_sa4_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Merma Asumida por BROS?", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_sa5_Internalname, GXutil.rtrim( A11038Bros_sa5), GXutil.rtrim( localUtil.format( A11038Bros_sa5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_sa5_Jsonclick, 0, "", "", "", "", "", 1, edtBros_sa5_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Merma Asumida por el CLIENTE?", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_sa6_Internalname, GXutil.rtrim( A11039Bros_sa6), GXutil.rtrim( localUtil.format( A11039Bros_sa6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,346);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_sa6_Jsonclick, 0, "", "", "", "", "", 1, edtBros_sa6_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "Comentarios Salida", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 351,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c10_Internalname, A11040Bros_c10, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,351);\"", (short)(0), 1, edtBros_c10_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "Nof para dejar en stock", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_stk_Internalname, GXutil.rtrim( A11066Bros_stk), GXutil.rtrim( localUtil.format( A11066Bros_stk, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,356);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_stk_Jsonclick, 0, "", "", "", "", "", 1, edtBros_stk_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "Tipo de Articulo", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 361,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_Lbta_Internalname, GXutil.rtrim( A11067Bros_Lbta), GXutil.rtrim( localUtil.format( A11067Bros_Lbta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,361);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_Lbta_Jsonclick, 0, "", "", "", "", "", 1, edtBros_Lbta_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "Temperatura del acabado", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 366,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_Lbtp_Internalname, GXutil.ltrim( localUtil.ntoc( A11068Bros_Lbtp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBros_Lbtp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11068Bros_Lbtp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11068Bros_Lbtp), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,366);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_Lbtp_Jsonclick, 0, "", "", "", "", "", 1, edtBros_Lbtp_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, httpContext.getMessage( "Comentarios Nof en Stock", ""), "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 371,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c11_Internalname, A11069Bros_c11, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,371);\"", (short)(0), 1, edtBros_c11_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, httpContext.getMessage( "Comentarios Laboratorio", ""), "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBros_c12_Internalname, A11070Bros_c12, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,376);\"", (short)(0), 1, edtBros_c12_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, httpContext.getMessage( "Imprimir Page 1", ""), "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 381,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp1_Internalname, GXutil.rtrim( A11369Bros_imp1), GXutil.rtrim( localUtil.format( A11369Bros_imp1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,381);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp1_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, httpContext.getMessage( "Imprimir Page 2", ""), "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp2_Internalname, GXutil.rtrim( A11370Bros_imp2), GXutil.rtrim( localUtil.format( A11370Bros_imp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,386);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp2_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock75_Internalname, httpContext.getMessage( "Imprimir Page 3", ""), "", "", lblTextblock75_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp3_Internalname, GXutil.rtrim( A11371Bros_imp3), GXutil.rtrim( localUtil.format( A11371Bros_imp3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,391);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp3_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock76_Internalname, httpContext.getMessage( "Imprimir Page 4", ""), "", "", lblTextblock76_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 396,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp4_Internalname, GXutil.rtrim( A11372Bros_imp4), GXutil.rtrim( localUtil.format( A11372Bros_imp4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,396);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp4_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp4_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock77_Internalname, httpContext.getMessage( "Imprimir Page 5", ""), "", "", lblTextblock77_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 401,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp5_Internalname, GXutil.rtrim( A11373Bros_imp5), GXutil.rtrim( localUtil.format( A11373Bros_imp5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,401);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp5_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp5_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock78_Internalname, httpContext.getMessage( "Imprimir Page 6", ""), "", "", lblTextblock78_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 406,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp6_Internalname, GXutil.rtrim( A11374Bros_imp6), GXutil.rtrim( localUtil.format( A11374Bros_imp6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,406);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp6_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp6_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, httpContext.getMessage( "Imprimir Page 7", ""), "", "", lblTextblock79_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp7_Internalname, GXutil.rtrim( A11375Bros_imp7), GXutil.rtrim( localUtil.format( A11375Bros_imp7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,411);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp7_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp7_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, httpContext.getMessage( "Imprimir Page 8", ""), "", "", lblTextblock80_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 416,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp8_Internalname, GXutil.rtrim( A11376Bros_imp8), GXutil.rtrim( localUtil.format( A11376Bros_imp8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,416);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp8_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp8_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock81_Internalname, httpContext.getMessage( "Imprimir Page 9", ""), "", "", lblTextblock81_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 421,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp9_Internalname, GXutil.rtrim( A11377Bros_imp9), GXutil.rtrim( localUtil.format( A11377Bros_imp9, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,421);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp9_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp9_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock82_Internalname, httpContext.getMessage( "Imprimir Page 10", ""), "", "", lblTextblock82_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 426,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp10_Internalname, GXutil.rtrim( A11378Bros_imp10), GXutil.rtrim( localUtil.format( A11378Bros_imp10, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,426);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp10_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp10_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock83_Internalname, httpContext.getMessage( "Imprimir Page 11", ""), "", "", lblTextblock83_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 431,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_imp11_Internalname, GXutil.rtrim( A11379Bros_imp11), GXutil.rtrim( localUtil.format( A11379Bros_imp11, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,431);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_imp11_Jsonclick, 0, "", "", "", "", "", 1, edtBros_imp11_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, httpContext.getMessage( "Tintura OEKO TEX", ""), "", "", lblTextblock84_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 436,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_oekot_Internalname, GXutil.rtrim( A11380Bros_oekot), GXutil.rtrim( localUtil.format( A11380Bros_oekot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,436);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_oekot_Jsonclick, 0, "", "", "", "", "", 1, edtBros_oekot_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock85_Internalname, httpContext.getMessage( "Lavado", ""), "", "", lblTextblock85_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 441,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_lavad_Internalname, GXutil.rtrim( A11381Bros_lavad), GXutil.rtrim( localUtil.format( A11381Bros_lavad, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,441);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_lavad_Jsonclick, 0, "", "", "", "", "", 1, edtBros_lavad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock86_Internalname, httpContext.getMessage( "Luz", ""), "", "", lblTextblock86_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 446,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_luz_Internalname, GXutil.rtrim( A11382Bros_luz), GXutil.rtrim( localUtil.format( A11382Bros_luz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,446);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_luz_Jsonclick, 0, "", "", "", "", "", 1, edtBros_luz_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock87_Internalname, httpContext.getMessage( "Sudor", ""), "", "", lblTextblock87_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 451,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_sudor_Internalname, GXutil.rtrim( A11383Bros_sudor), GXutil.rtrim( localUtil.format( A11383Bros_sudor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,451);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_sudor_Jsonclick, 0, "", "", "", "", "", 1, edtBros_sudor_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock88_Internalname, httpContext.getMessage( "Cloro", ""), "", "", lblTextblock88_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 456,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_cloro_Internalname, GXutil.rtrim( A11384Bros_cloro), GXutil.rtrim( localUtil.format( A11384Bros_cloro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,456);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_cloro_Jsonclick, 0, "", "", "", "", "", 1, edtBros_cloro_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock89_Internalname, httpContext.getMessage( "Agua de mar", ""), "", "", lblTextblock89_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 461,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_aguam_Internalname, GXutil.rtrim( A11385Bros_aguam), GXutil.rtrim( localUtil.format( A11385Bros_aguam, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,461);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_aguam_Jsonclick, 0, "", "", "", "", "", 1, edtBros_aguam_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock90_Internalname, httpContext.getMessage( "Termomigracion", ""), "", "", lblTextblock90_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 466,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_termo_Internalname, GXutil.rtrim( A11386Bros_termo), GXutil.rtrim( localUtil.format( A11386Bros_termo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,466);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_termo_Jsonclick, 0, "", "", "", "", "", 1, edtBros_termo_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock91_Internalname, httpContext.getMessage( "% Humedad", ""), "", "", lblTextblock91_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 471,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_humed_Internalname, GXutil.ltrim( localUtil.ntoc( A11387Bros_humed, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBros_humed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11387Bros_humed), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11387Bros_humed), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,471);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_humed_Jsonclick, 0, "", "", "", "", "", 1, edtBros_humed_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock92_Internalname, httpContext.getMessage( "Imprimir Obs Page 1", ""), "", "", lblTextblock92_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 476,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs1_Internalname, GXutil.rtrim( A11407Bros_obs1), GXutil.rtrim( localUtil.format( A11407Bros_obs1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,476);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs1_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock93_Internalname, httpContext.getMessage( "Imprimir Obs Page 2", ""), "", "", lblTextblock93_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 481,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs2_Internalname, GXutil.rtrim( A11408Bros_obs2), GXutil.rtrim( localUtil.format( A11408Bros_obs2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,481);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs2_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock94_Internalname, httpContext.getMessage( "Imprimir Obs Page 3", ""), "", "", lblTextblock94_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 486,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs3_Internalname, GXutil.rtrim( A11409Bros_obs3), GXutil.rtrim( localUtil.format( A11409Bros_obs3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,486);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs3_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock95_Internalname, httpContext.getMessage( "Imprimir Obs Page 4", ""), "", "", lblTextblock95_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 491,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs4_Internalname, GXutil.rtrim( A11410Bros_obs4), GXutil.rtrim( localUtil.format( A11410Bros_obs4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,491);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs4_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs4_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock96_Internalname, httpContext.getMessage( "Imprimir Obs Page 5", ""), "", "", lblTextblock96_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 496,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs5_Internalname, GXutil.rtrim( A11411Bros_obs5), GXutil.rtrim( localUtil.format( A11411Bros_obs5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,496);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs5_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs5_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock97_Internalname, httpContext.getMessage( "Imprimir Obs Page 6", ""), "", "", lblTextblock97_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 501,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs6_Internalname, GXutil.rtrim( A11412Bros_obs6), GXutil.rtrim( localUtil.format( A11412Bros_obs6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,501);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs6_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs6_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock98_Internalname, httpContext.getMessage( "Imprimir Obs Page 7", ""), "", "", lblTextblock98_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 506,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs7_Internalname, GXutil.rtrim( A11413Bros_obs7), GXutil.rtrim( localUtil.format( A11413Bros_obs7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,506);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs7_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs7_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock99_Internalname, httpContext.getMessage( "Imprimir Obs Page 8", ""), "", "", lblTextblock99_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 511,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs8_Internalname, GXutil.rtrim( A11414Bros_obs8), GXutil.rtrim( localUtil.format( A11414Bros_obs8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,511);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs8_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs8_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock100_Internalname, httpContext.getMessage( "Imprimir Obs Page 9", ""), "", "", lblTextblock100_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 516,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs9_Internalname, GXutil.rtrim( A11415Bros_obs9), GXutil.rtrim( localUtil.format( A11415Bros_obs9, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,516);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs9_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs9_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock101_Internalname, httpContext.getMessage( "Imprimir Obs Page 10", ""), "", "", lblTextblock101_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 521,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs10_Internalname, GXutil.rtrim( A11416Bros_obs10), GXutil.rtrim( localUtil.format( A11416Bros_obs10, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,521);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs10_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs10_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock102_Internalname, httpContext.getMessage( "Imprimir Obs Page 11", ""), "", "", lblTextblock102_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 526,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_obs11_Internalname, GXutil.rtrim( A11417Bros_obs11), GXutil.rtrim( localUtil.format( A11417Bros_obs11, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,526);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_obs11_Jsonclick, 0, "", "", "", "", "", 1, edtBros_obs11_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock103_Internalname, httpContext.getMessage( "N Copias Albaran", ""), "", "", lblTextblock103_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 531,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_nc_Internalname, GXutil.ltrim( localUtil.ntoc( A11703Bros_nc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBros_nc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11703Bros_nc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11703Bros_nc), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,531);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_nc_Jsonclick, 0, "", "", "", "", "", 1, edtBros_nc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock104_Internalname, httpContext.getMessage( "Encogimiento", ""), "", "", lblTextblock104_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 536,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBros_enc_Internalname, GXutil.ltrim( localUtil.ntoc( A11704Bros_enc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBros_enc_Enabled!=0) ? localUtil.format( A11704Bros_enc, "ZZ9.99") : localUtil.format( A11704Bros_enc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,536);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBros_enc_Jsonclick, 0, "", "", "", "", "", 1, edtBros_enc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTBRS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 539,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 540,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 541,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 542,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTBRS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 543,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TARTBRS.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10978Bros_Art = httpContext.cgiGet( "Z10978Bros_Art") ;
         Z10979Bros_Mcot = httpContext.cgiGet( "Z10979Bros_Mcot") ;
         Z10980Bros_Pd = httpContext.cgiGet( "Z10980Bros_Pd") ;
         Z10981Bros_Pp = httpContext.cgiGet( "Z10981Bros_Pp") ;
         Z10982Bros_Ag = httpContext.cgiGet( "Z10982Bros_Ag") ;
         Z10983Bros_c1 = httpContext.cgiGet( "Z10983Bros_c1") ;
         Z10984Bros_c2 = httpContext.cgiGet( "Z10984Bros_c2") ;
         Z10985Bros_bo = httpContext.cgiGet( "Z10985Bros_bo") ;
         Z10986Bros_bob = httpContext.cgiGet( "Z10986Bros_bob") ;
         Z10987Bros_boe = httpContext.cgiGet( "Z10987Bros_boe") ;
         Z10988BrosBov = httpContext.cgiGet( "Z10988BrosBov") ;
         Z10989Bros_c3 = httpContext.cgiGet( "Z10989Bros_c3") ;
         Z10990Bros_tns = httpContext.cgiGet( "Z10990Bros_tns") ;
         Z10991Bros_tnc = httpContext.cgiGet( "Z10991Bros_tnc") ;
         Z10992Bros_c4 = httpContext.cgiGet( "Z10992Bros_c4") ;
         Z10993Bros_ct = httpContext.cgiGet( "Z10993Bros_ct") ;
         Z10994Bros_c5 = httpContext.cgiGet( "Z10994Bros_c5") ;
         Z10995Bros_scs = httpContext.cgiGet( "Z10995Bros_scs") ;
         Z10996Bros_scc = httpContext.cgiGet( "Z10996Bros_scc") ;
         Z10997Bros_c6 = httpContext.cgiGet( "Z10997Bros_c6") ;
         Z10998Bros_cctse = httpContext.cgiGet( "Z10998Bros_cctse") ;
         Z10999Bros_ccttp = httpContext.cgiGet( "Z10999Bros_ccttp") ;
         Z11000Bros_cctet = httpContext.cgiGet( "Z11000Bros_cctet") ;
         Z11001Bros_ccp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11001Bros_ccp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11002Bros_cct = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11002Bros_cct"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11003Bros_ccpc = httpContext.cgiGet( "Z11003Bros_ccpc") ;
         Z11004Bros_cctq = httpContext.cgiGet( "Z11004Bros_cctq") ;
         Z11005Bros_cccc = httpContext.cgiGet( "Z11005Bros_cccc") ;
         Z11006Bros_ccec = httpContext.cgiGet( "Z11006Bros_ccec") ;
         Z11008Bros_ccmc1 = httpContext.cgiGet( "Z11008Bros_ccmc1") ;
         Z11009Bros_ccmc2 = httpContext.cgiGet( "Z11009Bros_ccmc2") ;
         Z11010Bros_ccmc3 = httpContext.cgiGet( "Z11010Bros_ccmc3") ;
         Z11011Bros_ccmc4 = httpContext.cgiGet( "Z11011Bros_ccmc4") ;
         Z11012Bros_ccmc5 = httpContext.cgiGet( "Z11012Bros_ccmc5") ;
         Z11013Bros_ccmc6 = httpContext.cgiGet( "Z11013Bros_ccmc6") ;
         Z11014Bros_c7 = httpContext.cgiGet( "Z11014Bros_c7") ;
         Z11015Bros_rb = httpContext.cgiGet( "Z11015Bros_rb") ;
         Z11016Bros_rbi = httpContext.cgiGet( "Z11016Bros_rbi") ;
         Z11017Bros_rbe = httpContext.cgiGet( "Z11017Bros_rbe") ;
         Z11018Bros_rbp = httpContext.cgiGet( "Z11018Bros_rbp") ;
         Z11019Bros_rboc = (short)(localUtil.ctol( httpContext.cgiGet( "Z11019Bros_rboc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11020Bros_rb1 = httpContext.cgiGet( "Z11020Bros_rb1") ;
         Z11021Bros_rb3 = httpContext.cgiGet( "Z11021Bros_rb3") ;
         Z11022Bros_c8 = httpContext.cgiGet( "Z11022Bros_c8") ;
         Z11023Bros_ep1 = httpContext.cgiGet( "Z11023Bros_ep1") ;
         Z11024Bros_ep2 = httpContext.cgiGet( "Z11024Bros_ep2") ;
         Z11025Bros_ep3 = httpContext.cgiGet( "Z11025Bros_ep3") ;
         Z11026Bros_ep4 = httpContext.cgiGet( "Z11026Bros_ep4") ;
         Z11027Bros_ep5 = httpContext.cgiGet( "Z11027Bros_ep5") ;
         Z11028Bros_ep6 = httpContext.cgiGet( "Z11028Bros_ep6") ;
         Z11029Bros_ep7 = httpContext.cgiGet( "Z11029Bros_ep7") ;
         Z11030Bros_ep8 = httpContext.cgiGet( "Z11030Bros_ep8") ;
         Z11031Bros_ep9 = httpContext.cgiGet( "Z11031Bros_ep9") ;
         Z11032Bros_ep10 = httpContext.cgiGet( "Z11032Bros_ep10") ;
         Z11033Bros_c9 = httpContext.cgiGet( "Z11033Bros_c9") ;
         Z11034Bros_sa1 = httpContext.cgiGet( "Z11034Bros_sa1") ;
         Z11035Bros_sa2 = httpContext.cgiGet( "Z11035Bros_sa2") ;
         Z11036Bros_sa3 = httpContext.cgiGet( "Z11036Bros_sa3") ;
         Z11037Bros_sa4 = httpContext.cgiGet( "Z11037Bros_sa4") ;
         Z11038Bros_sa5 = httpContext.cgiGet( "Z11038Bros_sa5") ;
         Z11039Bros_sa6 = httpContext.cgiGet( "Z11039Bros_sa6") ;
         Z11040Bros_c10 = httpContext.cgiGet( "Z11040Bros_c10") ;
         Z11066Bros_stk = httpContext.cgiGet( "Z11066Bros_stk") ;
         Z11067Bros_Lbta = httpContext.cgiGet( "Z11067Bros_Lbta") ;
         Z11068Bros_Lbtp = (short)(localUtil.ctol( httpContext.cgiGet( "Z11068Bros_Lbtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11069Bros_c11 = httpContext.cgiGet( "Z11069Bros_c11") ;
         Z11070Bros_c12 = httpContext.cgiGet( "Z11070Bros_c12") ;
         Z11369Bros_imp1 = httpContext.cgiGet( "Z11369Bros_imp1") ;
         Z11370Bros_imp2 = httpContext.cgiGet( "Z11370Bros_imp2") ;
         Z11371Bros_imp3 = httpContext.cgiGet( "Z11371Bros_imp3") ;
         Z11372Bros_imp4 = httpContext.cgiGet( "Z11372Bros_imp4") ;
         Z11373Bros_imp5 = httpContext.cgiGet( "Z11373Bros_imp5") ;
         Z11374Bros_imp6 = httpContext.cgiGet( "Z11374Bros_imp6") ;
         Z11375Bros_imp7 = httpContext.cgiGet( "Z11375Bros_imp7") ;
         Z11376Bros_imp8 = httpContext.cgiGet( "Z11376Bros_imp8") ;
         Z11377Bros_imp9 = httpContext.cgiGet( "Z11377Bros_imp9") ;
         Z11378Bros_imp10 = httpContext.cgiGet( "Z11378Bros_imp10") ;
         Z11379Bros_imp11 = httpContext.cgiGet( "Z11379Bros_imp11") ;
         Z11380Bros_oekot = httpContext.cgiGet( "Z11380Bros_oekot") ;
         Z11381Bros_lavad = httpContext.cgiGet( "Z11381Bros_lavad") ;
         Z11382Bros_luz = httpContext.cgiGet( "Z11382Bros_luz") ;
         Z11383Bros_sudor = httpContext.cgiGet( "Z11383Bros_sudor") ;
         Z11384Bros_cloro = httpContext.cgiGet( "Z11384Bros_cloro") ;
         Z11385Bros_aguam = httpContext.cgiGet( "Z11385Bros_aguam") ;
         Z11386Bros_termo = httpContext.cgiGet( "Z11386Bros_termo") ;
         Z11387Bros_humed = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11387Bros_humed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11407Bros_obs1 = httpContext.cgiGet( "Z11407Bros_obs1") ;
         Z11408Bros_obs2 = httpContext.cgiGet( "Z11408Bros_obs2") ;
         Z11409Bros_obs3 = httpContext.cgiGet( "Z11409Bros_obs3") ;
         Z11410Bros_obs4 = httpContext.cgiGet( "Z11410Bros_obs4") ;
         Z11411Bros_obs5 = httpContext.cgiGet( "Z11411Bros_obs5") ;
         Z11412Bros_obs6 = httpContext.cgiGet( "Z11412Bros_obs6") ;
         Z11413Bros_obs7 = httpContext.cgiGet( "Z11413Bros_obs7") ;
         Z11414Bros_obs8 = httpContext.cgiGet( "Z11414Bros_obs8") ;
         Z11415Bros_obs9 = httpContext.cgiGet( "Z11415Bros_obs9") ;
         Z11416Bros_obs10 = httpContext.cgiGet( "Z11416Bros_obs10") ;
         Z11417Bros_obs11 = httpContext.cgiGet( "Z11417Bros_obs11") ;
         Z11703Bros_nc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11703Bros_nc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11704Bros_enc = localUtil.ctond( httpContext.cgiGet( "Z11704Bros_enc")) ;
         Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A10978Bros_Art = httpContext.cgiGet( edtBros_Art_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10978Bros_Art", A10978Bros_Art);
         A10979Bros_Mcot = httpContext.cgiGet( edtBros_Mcot_Internalname) ;
         n10979Bros_Mcot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10979Bros_Mcot", A10979Bros_Mcot);
         A10980Bros_Pd = httpContext.cgiGet( edtBros_Pd_Internalname) ;
         n10980Bros_Pd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10980Bros_Pd", A10980Bros_Pd);
         A10981Bros_Pp = httpContext.cgiGet( edtBros_Pp_Internalname) ;
         n10981Bros_Pp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10981Bros_Pp", A10981Bros_Pp);
         A10982Bros_Ag = httpContext.cgiGet( edtBros_Ag_Internalname) ;
         n10982Bros_Ag = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10982Bros_Ag", A10982Bros_Ag);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         A10983Bros_c1 = httpContext.cgiGet( edtBros_c1_Internalname) ;
         n10983Bros_c1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10983Bros_c1", A10983Bros_c1);
         A10984Bros_c2 = httpContext.cgiGet( edtBros_c2_Internalname) ;
         n10984Bros_c2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10984Bros_c2", A10984Bros_c2);
         A10985Bros_bo = httpContext.cgiGet( edtBros_bo_Internalname) ;
         n10985Bros_bo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10985Bros_bo", A10985Bros_bo);
         A10986Bros_bob = httpContext.cgiGet( edtBros_bob_Internalname) ;
         n10986Bros_bob = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10986Bros_bob", A10986Bros_bob);
         A10987Bros_boe = httpContext.cgiGet( edtBros_boe_Internalname) ;
         n10987Bros_boe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10987Bros_boe", A10987Bros_boe);
         cmbBrosBov.setValue( httpContext.cgiGet( cmbBrosBov.getInternalname()) );
         A10988BrosBov = httpContext.cgiGet( cmbBrosBov.getInternalname()) ;
         n10988BrosBov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", A10988BrosBov);
         A10989Bros_c3 = httpContext.cgiGet( edtBros_c3_Internalname) ;
         n10989Bros_c3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10989Bros_c3", A10989Bros_c3);
         A10990Bros_tns = httpContext.cgiGet( edtBros_tns_Internalname) ;
         n10990Bros_tns = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10990Bros_tns", A10990Bros_tns);
         A10991Bros_tnc = httpContext.cgiGet( edtBros_tnc_Internalname) ;
         n10991Bros_tnc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10991Bros_tnc", A10991Bros_tnc);
         A10992Bros_c4 = httpContext.cgiGet( edtBros_c4_Internalname) ;
         n10992Bros_c4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10992Bros_c4", A10992Bros_c4);
         A10993Bros_ct = httpContext.cgiGet( edtBros_ct_Internalname) ;
         n10993Bros_ct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10993Bros_ct", A10993Bros_ct);
         A10994Bros_c5 = httpContext.cgiGet( edtBros_c5_Internalname) ;
         n10994Bros_c5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10994Bros_c5", A10994Bros_c5);
         A10995Bros_scs = httpContext.cgiGet( edtBros_scs_Internalname) ;
         n10995Bros_scs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10995Bros_scs", A10995Bros_scs);
         A10996Bros_scc = httpContext.cgiGet( edtBros_scc_Internalname) ;
         n10996Bros_scc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10996Bros_scc", A10996Bros_scc);
         A10997Bros_c6 = httpContext.cgiGet( edtBros_c6_Internalname) ;
         n10997Bros_c6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10997Bros_c6", A10997Bros_c6);
         A10998Bros_cctse = httpContext.cgiGet( edtBros_cctse_Internalname) ;
         n10998Bros_cctse = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10998Bros_cctse", A10998Bros_cctse);
         A10999Bros_ccttp = httpContext.cgiGet( edtBros_ccttp_Internalname) ;
         n10999Bros_ccttp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10999Bros_ccttp", A10999Bros_ccttp);
         A11000Bros_cctet = httpContext.cgiGet( edtBros_cctet_Internalname) ;
         n11000Bros_cctet = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11000Bros_cctet", A11000Bros_cctet);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBros_ccp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBros_ccp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BROS_CCP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBros_ccp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11001Bros_ccp = (byte)(0) ;
            n11001Bros_ccp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11001Bros_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11001Bros_ccp), 2, 0));
         }
         else
         {
            A11001Bros_ccp = (byte)(localUtil.ctol( httpContext.cgiGet( edtBros_ccp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11001Bros_ccp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11001Bros_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11001Bros_ccp), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBros_cct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBros_cct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BROS_CCT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBros_cct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11002Bros_cct = (byte)(0) ;
            n11002Bros_cct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11002Bros_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11002Bros_cct), 2, 0));
         }
         else
         {
            A11002Bros_cct = (byte)(localUtil.ctol( httpContext.cgiGet( edtBros_cct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11002Bros_cct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11002Bros_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11002Bros_cct), 2, 0));
         }
         A11003Bros_ccpc = httpContext.cgiGet( edtBros_ccpc_Internalname) ;
         n11003Bros_ccpc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11003Bros_ccpc", A11003Bros_ccpc);
         A11004Bros_cctq = httpContext.cgiGet( edtBros_cctq_Internalname) ;
         n11004Bros_cctq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11004Bros_cctq", A11004Bros_cctq);
         A11005Bros_cccc = httpContext.cgiGet( edtBros_cccc_Internalname) ;
         n11005Bros_cccc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11005Bros_cccc", A11005Bros_cccc);
         A11006Bros_ccec = httpContext.cgiGet( edtBros_ccec_Internalname) ;
         n11006Bros_ccec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11006Bros_ccec", A11006Bros_ccec);
         A11008Bros_ccmc1 = httpContext.cgiGet( edtBros_ccmc1_Internalname) ;
         n11008Bros_ccmc1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11008Bros_ccmc1", A11008Bros_ccmc1);
         A11009Bros_ccmc2 = httpContext.cgiGet( edtBros_ccmc2_Internalname) ;
         n11009Bros_ccmc2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11009Bros_ccmc2", A11009Bros_ccmc2);
         A11010Bros_ccmc3 = httpContext.cgiGet( edtBros_ccmc3_Internalname) ;
         n11010Bros_ccmc3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11010Bros_ccmc3", A11010Bros_ccmc3);
         A11011Bros_ccmc4 = httpContext.cgiGet( edtBros_ccmc4_Internalname) ;
         n11011Bros_ccmc4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11011Bros_ccmc4", A11011Bros_ccmc4);
         A11012Bros_ccmc5 = httpContext.cgiGet( edtBros_ccmc5_Internalname) ;
         n11012Bros_ccmc5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11012Bros_ccmc5", A11012Bros_ccmc5);
         A11013Bros_ccmc6 = httpContext.cgiGet( edtBros_ccmc6_Internalname) ;
         n11013Bros_ccmc6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11013Bros_ccmc6", A11013Bros_ccmc6);
         A11014Bros_c7 = httpContext.cgiGet( edtBros_c7_Internalname) ;
         n11014Bros_c7 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11014Bros_c7", A11014Bros_c7);
         A11015Bros_rb = httpContext.cgiGet( edtBros_rb_Internalname) ;
         n11015Bros_rb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11015Bros_rb", A11015Bros_rb);
         A11016Bros_rbi = httpContext.cgiGet( edtBros_rbi_Internalname) ;
         n11016Bros_rbi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11016Bros_rbi", A11016Bros_rbi);
         A11017Bros_rbe = httpContext.cgiGet( edtBros_rbe_Internalname) ;
         n11017Bros_rbe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11017Bros_rbe", A11017Bros_rbe);
         A11018Bros_rbp = httpContext.cgiGet( edtBros_rbp_Internalname) ;
         n11018Bros_rbp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11018Bros_rbp", A11018Bros_rbp);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBros_rboc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBros_rboc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BROS_RBOC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBros_rboc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11019Bros_rboc = (short)(0) ;
            n11019Bros_rboc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11019Bros_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11019Bros_rboc), 3, 0));
         }
         else
         {
            A11019Bros_rboc = (short)(localUtil.ctol( httpContext.cgiGet( edtBros_rboc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11019Bros_rboc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11019Bros_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11019Bros_rboc), 3, 0));
         }
         A11020Bros_rb1 = httpContext.cgiGet( edtBros_rb1_Internalname) ;
         n11020Bros_rb1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11020Bros_rb1", A11020Bros_rb1);
         A11021Bros_rb3 = httpContext.cgiGet( edtBros_rb3_Internalname) ;
         n11021Bros_rb3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11021Bros_rb3", A11021Bros_rb3);
         A11022Bros_c8 = httpContext.cgiGet( edtBros_c8_Internalname) ;
         n11022Bros_c8 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11022Bros_c8", A11022Bros_c8);
         A11023Bros_ep1 = httpContext.cgiGet( edtBros_ep1_Internalname) ;
         n11023Bros_ep1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11023Bros_ep1", A11023Bros_ep1);
         A11024Bros_ep2 = httpContext.cgiGet( edtBros_ep2_Internalname) ;
         n11024Bros_ep2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11024Bros_ep2", A11024Bros_ep2);
         A11025Bros_ep3 = httpContext.cgiGet( edtBros_ep3_Internalname) ;
         n11025Bros_ep3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11025Bros_ep3", A11025Bros_ep3);
         A11026Bros_ep4 = httpContext.cgiGet( edtBros_ep4_Internalname) ;
         n11026Bros_ep4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11026Bros_ep4", A11026Bros_ep4);
         A11027Bros_ep5 = httpContext.cgiGet( edtBros_ep5_Internalname) ;
         n11027Bros_ep5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11027Bros_ep5", A11027Bros_ep5);
         A11028Bros_ep6 = httpContext.cgiGet( edtBros_ep6_Internalname) ;
         n11028Bros_ep6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11028Bros_ep6", A11028Bros_ep6);
         A11029Bros_ep7 = httpContext.cgiGet( edtBros_ep7_Internalname) ;
         n11029Bros_ep7 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11029Bros_ep7", A11029Bros_ep7);
         A11030Bros_ep8 = httpContext.cgiGet( edtBros_ep8_Internalname) ;
         n11030Bros_ep8 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11030Bros_ep8", A11030Bros_ep8);
         A11031Bros_ep9 = httpContext.cgiGet( edtBros_ep9_Internalname) ;
         n11031Bros_ep9 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11031Bros_ep9", A11031Bros_ep9);
         A11032Bros_ep10 = httpContext.cgiGet( edtBros_ep10_Internalname) ;
         n11032Bros_ep10 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11032Bros_ep10", A11032Bros_ep10);
         A11033Bros_c9 = httpContext.cgiGet( edtBros_c9_Internalname) ;
         n11033Bros_c9 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11033Bros_c9", A11033Bros_c9);
         A11034Bros_sa1 = httpContext.cgiGet( edtBros_sa1_Internalname) ;
         n11034Bros_sa1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11034Bros_sa1", A11034Bros_sa1);
         A11035Bros_sa2 = httpContext.cgiGet( edtBros_sa2_Internalname) ;
         n11035Bros_sa2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11035Bros_sa2", A11035Bros_sa2);
         A11036Bros_sa3 = httpContext.cgiGet( edtBros_sa3_Internalname) ;
         n11036Bros_sa3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11036Bros_sa3", A11036Bros_sa3);
         A11037Bros_sa4 = httpContext.cgiGet( edtBros_sa4_Internalname) ;
         n11037Bros_sa4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11037Bros_sa4", A11037Bros_sa4);
         A11038Bros_sa5 = httpContext.cgiGet( edtBros_sa5_Internalname) ;
         n11038Bros_sa5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11038Bros_sa5", A11038Bros_sa5);
         A11039Bros_sa6 = httpContext.cgiGet( edtBros_sa6_Internalname) ;
         n11039Bros_sa6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11039Bros_sa6", A11039Bros_sa6);
         A11040Bros_c10 = httpContext.cgiGet( edtBros_c10_Internalname) ;
         n11040Bros_c10 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11040Bros_c10", A11040Bros_c10);
         A11066Bros_stk = httpContext.cgiGet( edtBros_stk_Internalname) ;
         n11066Bros_stk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11066Bros_stk", A11066Bros_stk);
         A11067Bros_Lbta = httpContext.cgiGet( edtBros_Lbta_Internalname) ;
         n11067Bros_Lbta = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11067Bros_Lbta", A11067Bros_Lbta);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBros_Lbtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBros_Lbtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BROS_LBTP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBros_Lbtp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11068Bros_Lbtp = (short)(0) ;
            n11068Bros_Lbtp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11068Bros_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11068Bros_Lbtp), 4, 0));
         }
         else
         {
            A11068Bros_Lbtp = (short)(localUtil.ctol( httpContext.cgiGet( edtBros_Lbtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11068Bros_Lbtp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11068Bros_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11068Bros_Lbtp), 4, 0));
         }
         A11069Bros_c11 = httpContext.cgiGet( edtBros_c11_Internalname) ;
         n11069Bros_c11 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11069Bros_c11", A11069Bros_c11);
         A11070Bros_c12 = httpContext.cgiGet( edtBros_c12_Internalname) ;
         n11070Bros_c12 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11070Bros_c12", A11070Bros_c12);
         A11369Bros_imp1 = httpContext.cgiGet( edtBros_imp1_Internalname) ;
         n11369Bros_imp1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11369Bros_imp1", A11369Bros_imp1);
         A11370Bros_imp2 = httpContext.cgiGet( edtBros_imp2_Internalname) ;
         n11370Bros_imp2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11370Bros_imp2", A11370Bros_imp2);
         A11371Bros_imp3 = httpContext.cgiGet( edtBros_imp3_Internalname) ;
         n11371Bros_imp3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11371Bros_imp3", A11371Bros_imp3);
         A11372Bros_imp4 = httpContext.cgiGet( edtBros_imp4_Internalname) ;
         n11372Bros_imp4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11372Bros_imp4", A11372Bros_imp4);
         A11373Bros_imp5 = httpContext.cgiGet( edtBros_imp5_Internalname) ;
         n11373Bros_imp5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11373Bros_imp5", A11373Bros_imp5);
         A11374Bros_imp6 = httpContext.cgiGet( edtBros_imp6_Internalname) ;
         n11374Bros_imp6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11374Bros_imp6", A11374Bros_imp6);
         A11375Bros_imp7 = httpContext.cgiGet( edtBros_imp7_Internalname) ;
         n11375Bros_imp7 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11375Bros_imp7", A11375Bros_imp7);
         A11376Bros_imp8 = httpContext.cgiGet( edtBros_imp8_Internalname) ;
         n11376Bros_imp8 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11376Bros_imp8", A11376Bros_imp8);
         A11377Bros_imp9 = httpContext.cgiGet( edtBros_imp9_Internalname) ;
         n11377Bros_imp9 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11377Bros_imp9", A11377Bros_imp9);
         A11378Bros_imp10 = httpContext.cgiGet( edtBros_imp10_Internalname) ;
         n11378Bros_imp10 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11378Bros_imp10", A11378Bros_imp10);
         A11379Bros_imp11 = httpContext.cgiGet( edtBros_imp11_Internalname) ;
         n11379Bros_imp11 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11379Bros_imp11", A11379Bros_imp11);
         A11380Bros_oekot = httpContext.cgiGet( edtBros_oekot_Internalname) ;
         n11380Bros_oekot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11380Bros_oekot", A11380Bros_oekot);
         A11381Bros_lavad = httpContext.cgiGet( edtBros_lavad_Internalname) ;
         n11381Bros_lavad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11381Bros_lavad", A11381Bros_lavad);
         A11382Bros_luz = httpContext.cgiGet( edtBros_luz_Internalname) ;
         n11382Bros_luz = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11382Bros_luz", A11382Bros_luz);
         A11383Bros_sudor = httpContext.cgiGet( edtBros_sudor_Internalname) ;
         n11383Bros_sudor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11383Bros_sudor", A11383Bros_sudor);
         A11384Bros_cloro = httpContext.cgiGet( edtBros_cloro_Internalname) ;
         n11384Bros_cloro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11384Bros_cloro", A11384Bros_cloro);
         A11385Bros_aguam = httpContext.cgiGet( edtBros_aguam_Internalname) ;
         n11385Bros_aguam = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11385Bros_aguam", A11385Bros_aguam);
         A11386Bros_termo = httpContext.cgiGet( edtBros_termo_Internalname) ;
         n11386Bros_termo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11386Bros_termo", A11386Bros_termo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBros_humed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBros_humed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BROS_HUMED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBros_humed_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11387Bros_humed = (byte)(0) ;
            n11387Bros_humed = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11387Bros_humed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11387Bros_humed), 2, 0));
         }
         else
         {
            A11387Bros_humed = (byte)(localUtil.ctol( httpContext.cgiGet( edtBros_humed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11387Bros_humed = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11387Bros_humed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11387Bros_humed), 2, 0));
         }
         A11407Bros_obs1 = httpContext.cgiGet( edtBros_obs1_Internalname) ;
         n11407Bros_obs1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11407Bros_obs1", A11407Bros_obs1);
         A11408Bros_obs2 = httpContext.cgiGet( edtBros_obs2_Internalname) ;
         n11408Bros_obs2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11408Bros_obs2", A11408Bros_obs2);
         A11409Bros_obs3 = httpContext.cgiGet( edtBros_obs3_Internalname) ;
         n11409Bros_obs3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11409Bros_obs3", A11409Bros_obs3);
         A11410Bros_obs4 = httpContext.cgiGet( edtBros_obs4_Internalname) ;
         n11410Bros_obs4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11410Bros_obs4", A11410Bros_obs4);
         A11411Bros_obs5 = httpContext.cgiGet( edtBros_obs5_Internalname) ;
         n11411Bros_obs5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11411Bros_obs5", A11411Bros_obs5);
         A11412Bros_obs6 = httpContext.cgiGet( edtBros_obs6_Internalname) ;
         n11412Bros_obs6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11412Bros_obs6", A11412Bros_obs6);
         A11413Bros_obs7 = httpContext.cgiGet( edtBros_obs7_Internalname) ;
         n11413Bros_obs7 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11413Bros_obs7", A11413Bros_obs7);
         A11414Bros_obs8 = httpContext.cgiGet( edtBros_obs8_Internalname) ;
         n11414Bros_obs8 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11414Bros_obs8", A11414Bros_obs8);
         A11415Bros_obs9 = httpContext.cgiGet( edtBros_obs9_Internalname) ;
         n11415Bros_obs9 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11415Bros_obs9", A11415Bros_obs9);
         A11416Bros_obs10 = httpContext.cgiGet( edtBros_obs10_Internalname) ;
         n11416Bros_obs10 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11416Bros_obs10", A11416Bros_obs10);
         A11417Bros_obs11 = httpContext.cgiGet( edtBros_obs11_Internalname) ;
         n11417Bros_obs11 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11417Bros_obs11", A11417Bros_obs11);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBros_nc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBros_nc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BROS_NC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBros_nc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11703Bros_nc = (byte)(0) ;
            n11703Bros_nc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11703Bros_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11703Bros_nc), 2, 0));
         }
         else
         {
            A11703Bros_nc = (byte)(localUtil.ctol( httpContext.cgiGet( edtBros_nc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11703Bros_nc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11703Bros_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11703Bros_nc), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBros_enc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBros_enc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BROS_ENC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBros_enc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11704Bros_enc = DecimalUtil.ZERO ;
            n11704Bros_enc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11704Bros_enc", GXutil.ltrimstr( A11704Bros_enc, 6, 2));
         }
         else
         {
            A11704Bros_enc = localUtil.ctond( httpContext.cgiGet( edtBros_enc_Internalname)) ;
            n11704Bros_enc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11704Bros_enc", GXutil.ltrimstr( A11704Bros_enc, 6, 2));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A10978Bros_Art = httpContext.GetPar( "Bros_Art") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10978Bros_Art", A10978Bros_Art);
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            getEqualNoModal( ) ;
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
            initAll1AF1467( ) ;
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
      disableAttributes1AF1467( ) ;
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

   public void confirm_1AF0( )
   {
      beforeValidate1AF1467( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AF1467( ) ;
         }
         else
         {
            checkExtendedTable1AF1467( ) ;
            if ( AnyError == 0 )
            {
               zm1AF1467( 55) ;
               zm1AF1467( 56) ;
               zm1AF1467( 57) ;
            }
            closeExtendedTableCursors1AF1467( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1AF0( ) ;
      }
   }

   public void resetCaption1AF0( )
   {
   }

   public void zm1AF1467( int GX_JID )
   {
      if ( ( GX_JID == 54 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10979Bros_Mcot = T01AF3_A10979Bros_Mcot[0] ;
            Z10980Bros_Pd = T01AF3_A10980Bros_Pd[0] ;
            Z10981Bros_Pp = T01AF3_A10981Bros_Pp[0] ;
            Z10982Bros_Ag = T01AF3_A10982Bros_Ag[0] ;
            Z10983Bros_c1 = T01AF3_A10983Bros_c1[0] ;
            Z10984Bros_c2 = T01AF3_A10984Bros_c2[0] ;
            Z10985Bros_bo = T01AF3_A10985Bros_bo[0] ;
            Z10986Bros_bob = T01AF3_A10986Bros_bob[0] ;
            Z10987Bros_boe = T01AF3_A10987Bros_boe[0] ;
            Z10988BrosBov = T01AF3_A10988BrosBov[0] ;
            Z10989Bros_c3 = T01AF3_A10989Bros_c3[0] ;
            Z10990Bros_tns = T01AF3_A10990Bros_tns[0] ;
            Z10991Bros_tnc = T01AF3_A10991Bros_tnc[0] ;
            Z10992Bros_c4 = T01AF3_A10992Bros_c4[0] ;
            Z10993Bros_ct = T01AF3_A10993Bros_ct[0] ;
            Z10994Bros_c5 = T01AF3_A10994Bros_c5[0] ;
            Z10995Bros_scs = T01AF3_A10995Bros_scs[0] ;
            Z10996Bros_scc = T01AF3_A10996Bros_scc[0] ;
            Z10997Bros_c6 = T01AF3_A10997Bros_c6[0] ;
            Z10998Bros_cctse = T01AF3_A10998Bros_cctse[0] ;
            Z10999Bros_ccttp = T01AF3_A10999Bros_ccttp[0] ;
            Z11000Bros_cctet = T01AF3_A11000Bros_cctet[0] ;
            Z11001Bros_ccp = T01AF3_A11001Bros_ccp[0] ;
            Z11002Bros_cct = T01AF3_A11002Bros_cct[0] ;
            Z11003Bros_ccpc = T01AF3_A11003Bros_ccpc[0] ;
            Z11004Bros_cctq = T01AF3_A11004Bros_cctq[0] ;
            Z11005Bros_cccc = T01AF3_A11005Bros_cccc[0] ;
            Z11006Bros_ccec = T01AF3_A11006Bros_ccec[0] ;
            Z11008Bros_ccmc1 = T01AF3_A11008Bros_ccmc1[0] ;
            Z11009Bros_ccmc2 = T01AF3_A11009Bros_ccmc2[0] ;
            Z11010Bros_ccmc3 = T01AF3_A11010Bros_ccmc3[0] ;
            Z11011Bros_ccmc4 = T01AF3_A11011Bros_ccmc4[0] ;
            Z11012Bros_ccmc5 = T01AF3_A11012Bros_ccmc5[0] ;
            Z11013Bros_ccmc6 = T01AF3_A11013Bros_ccmc6[0] ;
            Z11014Bros_c7 = T01AF3_A11014Bros_c7[0] ;
            Z11015Bros_rb = T01AF3_A11015Bros_rb[0] ;
            Z11016Bros_rbi = T01AF3_A11016Bros_rbi[0] ;
            Z11017Bros_rbe = T01AF3_A11017Bros_rbe[0] ;
            Z11018Bros_rbp = T01AF3_A11018Bros_rbp[0] ;
            Z11019Bros_rboc = T01AF3_A11019Bros_rboc[0] ;
            Z11020Bros_rb1 = T01AF3_A11020Bros_rb1[0] ;
            Z11021Bros_rb3 = T01AF3_A11021Bros_rb3[0] ;
            Z11022Bros_c8 = T01AF3_A11022Bros_c8[0] ;
            Z11023Bros_ep1 = T01AF3_A11023Bros_ep1[0] ;
            Z11024Bros_ep2 = T01AF3_A11024Bros_ep2[0] ;
            Z11025Bros_ep3 = T01AF3_A11025Bros_ep3[0] ;
            Z11026Bros_ep4 = T01AF3_A11026Bros_ep4[0] ;
            Z11027Bros_ep5 = T01AF3_A11027Bros_ep5[0] ;
            Z11028Bros_ep6 = T01AF3_A11028Bros_ep6[0] ;
            Z11029Bros_ep7 = T01AF3_A11029Bros_ep7[0] ;
            Z11030Bros_ep8 = T01AF3_A11030Bros_ep8[0] ;
            Z11031Bros_ep9 = T01AF3_A11031Bros_ep9[0] ;
            Z11032Bros_ep10 = T01AF3_A11032Bros_ep10[0] ;
            Z11033Bros_c9 = T01AF3_A11033Bros_c9[0] ;
            Z11034Bros_sa1 = T01AF3_A11034Bros_sa1[0] ;
            Z11035Bros_sa2 = T01AF3_A11035Bros_sa2[0] ;
            Z11036Bros_sa3 = T01AF3_A11036Bros_sa3[0] ;
            Z11037Bros_sa4 = T01AF3_A11037Bros_sa4[0] ;
            Z11038Bros_sa5 = T01AF3_A11038Bros_sa5[0] ;
            Z11039Bros_sa6 = T01AF3_A11039Bros_sa6[0] ;
            Z11040Bros_c10 = T01AF3_A11040Bros_c10[0] ;
            Z11066Bros_stk = T01AF3_A11066Bros_stk[0] ;
            Z11067Bros_Lbta = T01AF3_A11067Bros_Lbta[0] ;
            Z11068Bros_Lbtp = T01AF3_A11068Bros_Lbtp[0] ;
            Z11069Bros_c11 = T01AF3_A11069Bros_c11[0] ;
            Z11070Bros_c12 = T01AF3_A11070Bros_c12[0] ;
            Z11369Bros_imp1 = T01AF3_A11369Bros_imp1[0] ;
            Z11370Bros_imp2 = T01AF3_A11370Bros_imp2[0] ;
            Z11371Bros_imp3 = T01AF3_A11371Bros_imp3[0] ;
            Z11372Bros_imp4 = T01AF3_A11372Bros_imp4[0] ;
            Z11373Bros_imp5 = T01AF3_A11373Bros_imp5[0] ;
            Z11374Bros_imp6 = T01AF3_A11374Bros_imp6[0] ;
            Z11375Bros_imp7 = T01AF3_A11375Bros_imp7[0] ;
            Z11376Bros_imp8 = T01AF3_A11376Bros_imp8[0] ;
            Z11377Bros_imp9 = T01AF3_A11377Bros_imp9[0] ;
            Z11378Bros_imp10 = T01AF3_A11378Bros_imp10[0] ;
            Z11379Bros_imp11 = T01AF3_A11379Bros_imp11[0] ;
            Z11380Bros_oekot = T01AF3_A11380Bros_oekot[0] ;
            Z11381Bros_lavad = T01AF3_A11381Bros_lavad[0] ;
            Z11382Bros_luz = T01AF3_A11382Bros_luz[0] ;
            Z11383Bros_sudor = T01AF3_A11383Bros_sudor[0] ;
            Z11384Bros_cloro = T01AF3_A11384Bros_cloro[0] ;
            Z11385Bros_aguam = T01AF3_A11385Bros_aguam[0] ;
            Z11386Bros_termo = T01AF3_A11386Bros_termo[0] ;
            Z11387Bros_humed = T01AF3_A11387Bros_humed[0] ;
            Z11407Bros_obs1 = T01AF3_A11407Bros_obs1[0] ;
            Z11408Bros_obs2 = T01AF3_A11408Bros_obs2[0] ;
            Z11409Bros_obs3 = T01AF3_A11409Bros_obs3[0] ;
            Z11410Bros_obs4 = T01AF3_A11410Bros_obs4[0] ;
            Z11411Bros_obs5 = T01AF3_A11411Bros_obs5[0] ;
            Z11412Bros_obs6 = T01AF3_A11412Bros_obs6[0] ;
            Z11413Bros_obs7 = T01AF3_A11413Bros_obs7[0] ;
            Z11414Bros_obs8 = T01AF3_A11414Bros_obs8[0] ;
            Z11415Bros_obs9 = T01AF3_A11415Bros_obs9[0] ;
            Z11416Bros_obs10 = T01AF3_A11416Bros_obs10[0] ;
            Z11417Bros_obs11 = T01AF3_A11417Bros_obs11[0] ;
            Z11703Bros_nc = T01AF3_A11703Bros_nc[0] ;
            Z11704Bros_enc = T01AF3_A11704Bros_enc[0] ;
            Z840TrnCod = T01AF3_A840TrnCod[0] ;
         }
         else
         {
            Z10979Bros_Mcot = A10979Bros_Mcot ;
            Z10980Bros_Pd = A10980Bros_Pd ;
            Z10981Bros_Pp = A10981Bros_Pp ;
            Z10982Bros_Ag = A10982Bros_Ag ;
            Z10983Bros_c1 = A10983Bros_c1 ;
            Z10984Bros_c2 = A10984Bros_c2 ;
            Z10985Bros_bo = A10985Bros_bo ;
            Z10986Bros_bob = A10986Bros_bob ;
            Z10987Bros_boe = A10987Bros_boe ;
            Z10988BrosBov = A10988BrosBov ;
            Z10989Bros_c3 = A10989Bros_c3 ;
            Z10990Bros_tns = A10990Bros_tns ;
            Z10991Bros_tnc = A10991Bros_tnc ;
            Z10992Bros_c4 = A10992Bros_c4 ;
            Z10993Bros_ct = A10993Bros_ct ;
            Z10994Bros_c5 = A10994Bros_c5 ;
            Z10995Bros_scs = A10995Bros_scs ;
            Z10996Bros_scc = A10996Bros_scc ;
            Z10997Bros_c6 = A10997Bros_c6 ;
            Z10998Bros_cctse = A10998Bros_cctse ;
            Z10999Bros_ccttp = A10999Bros_ccttp ;
            Z11000Bros_cctet = A11000Bros_cctet ;
            Z11001Bros_ccp = A11001Bros_ccp ;
            Z11002Bros_cct = A11002Bros_cct ;
            Z11003Bros_ccpc = A11003Bros_ccpc ;
            Z11004Bros_cctq = A11004Bros_cctq ;
            Z11005Bros_cccc = A11005Bros_cccc ;
            Z11006Bros_ccec = A11006Bros_ccec ;
            Z11008Bros_ccmc1 = A11008Bros_ccmc1 ;
            Z11009Bros_ccmc2 = A11009Bros_ccmc2 ;
            Z11010Bros_ccmc3 = A11010Bros_ccmc3 ;
            Z11011Bros_ccmc4 = A11011Bros_ccmc4 ;
            Z11012Bros_ccmc5 = A11012Bros_ccmc5 ;
            Z11013Bros_ccmc6 = A11013Bros_ccmc6 ;
            Z11014Bros_c7 = A11014Bros_c7 ;
            Z11015Bros_rb = A11015Bros_rb ;
            Z11016Bros_rbi = A11016Bros_rbi ;
            Z11017Bros_rbe = A11017Bros_rbe ;
            Z11018Bros_rbp = A11018Bros_rbp ;
            Z11019Bros_rboc = A11019Bros_rboc ;
            Z11020Bros_rb1 = A11020Bros_rb1 ;
            Z11021Bros_rb3 = A11021Bros_rb3 ;
            Z11022Bros_c8 = A11022Bros_c8 ;
            Z11023Bros_ep1 = A11023Bros_ep1 ;
            Z11024Bros_ep2 = A11024Bros_ep2 ;
            Z11025Bros_ep3 = A11025Bros_ep3 ;
            Z11026Bros_ep4 = A11026Bros_ep4 ;
            Z11027Bros_ep5 = A11027Bros_ep5 ;
            Z11028Bros_ep6 = A11028Bros_ep6 ;
            Z11029Bros_ep7 = A11029Bros_ep7 ;
            Z11030Bros_ep8 = A11030Bros_ep8 ;
            Z11031Bros_ep9 = A11031Bros_ep9 ;
            Z11032Bros_ep10 = A11032Bros_ep10 ;
            Z11033Bros_c9 = A11033Bros_c9 ;
            Z11034Bros_sa1 = A11034Bros_sa1 ;
            Z11035Bros_sa2 = A11035Bros_sa2 ;
            Z11036Bros_sa3 = A11036Bros_sa3 ;
            Z11037Bros_sa4 = A11037Bros_sa4 ;
            Z11038Bros_sa5 = A11038Bros_sa5 ;
            Z11039Bros_sa6 = A11039Bros_sa6 ;
            Z11040Bros_c10 = A11040Bros_c10 ;
            Z11066Bros_stk = A11066Bros_stk ;
            Z11067Bros_Lbta = A11067Bros_Lbta ;
            Z11068Bros_Lbtp = A11068Bros_Lbtp ;
            Z11069Bros_c11 = A11069Bros_c11 ;
            Z11070Bros_c12 = A11070Bros_c12 ;
            Z11369Bros_imp1 = A11369Bros_imp1 ;
            Z11370Bros_imp2 = A11370Bros_imp2 ;
            Z11371Bros_imp3 = A11371Bros_imp3 ;
            Z11372Bros_imp4 = A11372Bros_imp4 ;
            Z11373Bros_imp5 = A11373Bros_imp5 ;
            Z11374Bros_imp6 = A11374Bros_imp6 ;
            Z11375Bros_imp7 = A11375Bros_imp7 ;
            Z11376Bros_imp8 = A11376Bros_imp8 ;
            Z11377Bros_imp9 = A11377Bros_imp9 ;
            Z11378Bros_imp10 = A11378Bros_imp10 ;
            Z11379Bros_imp11 = A11379Bros_imp11 ;
            Z11380Bros_oekot = A11380Bros_oekot ;
            Z11381Bros_lavad = A11381Bros_lavad ;
            Z11382Bros_luz = A11382Bros_luz ;
            Z11383Bros_sudor = A11383Bros_sudor ;
            Z11384Bros_cloro = A11384Bros_cloro ;
            Z11385Bros_aguam = A11385Bros_aguam ;
            Z11386Bros_termo = A11386Bros_termo ;
            Z11387Bros_humed = A11387Bros_humed ;
            Z11407Bros_obs1 = A11407Bros_obs1 ;
            Z11408Bros_obs2 = A11408Bros_obs2 ;
            Z11409Bros_obs3 = A11409Bros_obs3 ;
            Z11410Bros_obs4 = A11410Bros_obs4 ;
            Z11411Bros_obs5 = A11411Bros_obs5 ;
            Z11412Bros_obs6 = A11412Bros_obs6 ;
            Z11413Bros_obs7 = A11413Bros_obs7 ;
            Z11414Bros_obs8 = A11414Bros_obs8 ;
            Z11415Bros_obs9 = A11415Bros_obs9 ;
            Z11416Bros_obs10 = A11416Bros_obs10 ;
            Z11417Bros_obs11 = A11417Bros_obs11 ;
            Z11703Bros_nc = A11703Bros_nc ;
            Z11704Bros_enc = A11704Bros_enc ;
            Z840TrnCod = A840TrnCod ;
         }
      }
      if ( GX_JID == -54 )
      {
         Z11704Bros_enc = A11704Bros_enc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z10978Bros_Art = A10978Bros_Art ;
         Z10979Bros_Mcot = A10979Bros_Mcot ;
         Z10980Bros_Pd = A10980Bros_Pd ;
         Z10981Bros_Pp = A10981Bros_Pp ;
         Z10982Bros_Ag = A10982Bros_Ag ;
         Z10983Bros_c1 = A10983Bros_c1 ;
         Z10984Bros_c2 = A10984Bros_c2 ;
         Z10985Bros_bo = A10985Bros_bo ;
         Z10986Bros_bob = A10986Bros_bob ;
         Z10987Bros_boe = A10987Bros_boe ;
         Z10988BrosBov = A10988BrosBov ;
         Z10989Bros_c3 = A10989Bros_c3 ;
         Z10990Bros_tns = A10990Bros_tns ;
         Z10991Bros_tnc = A10991Bros_tnc ;
         Z10992Bros_c4 = A10992Bros_c4 ;
         Z10993Bros_ct = A10993Bros_ct ;
         Z10994Bros_c5 = A10994Bros_c5 ;
         Z10995Bros_scs = A10995Bros_scs ;
         Z10996Bros_scc = A10996Bros_scc ;
         Z10997Bros_c6 = A10997Bros_c6 ;
         Z10998Bros_cctse = A10998Bros_cctse ;
         Z10999Bros_ccttp = A10999Bros_ccttp ;
         Z11000Bros_cctet = A11000Bros_cctet ;
         Z11001Bros_ccp = A11001Bros_ccp ;
         Z11002Bros_cct = A11002Bros_cct ;
         Z11003Bros_ccpc = A11003Bros_ccpc ;
         Z11004Bros_cctq = A11004Bros_cctq ;
         Z11005Bros_cccc = A11005Bros_cccc ;
         Z11006Bros_ccec = A11006Bros_ccec ;
         Z11008Bros_ccmc1 = A11008Bros_ccmc1 ;
         Z11009Bros_ccmc2 = A11009Bros_ccmc2 ;
         Z11010Bros_ccmc3 = A11010Bros_ccmc3 ;
         Z11011Bros_ccmc4 = A11011Bros_ccmc4 ;
         Z11012Bros_ccmc5 = A11012Bros_ccmc5 ;
         Z11013Bros_ccmc6 = A11013Bros_ccmc6 ;
         Z11014Bros_c7 = A11014Bros_c7 ;
         Z11015Bros_rb = A11015Bros_rb ;
         Z11016Bros_rbi = A11016Bros_rbi ;
         Z11017Bros_rbe = A11017Bros_rbe ;
         Z11018Bros_rbp = A11018Bros_rbp ;
         Z11019Bros_rboc = A11019Bros_rboc ;
         Z11020Bros_rb1 = A11020Bros_rb1 ;
         Z11021Bros_rb3 = A11021Bros_rb3 ;
         Z11022Bros_c8 = A11022Bros_c8 ;
         Z11023Bros_ep1 = A11023Bros_ep1 ;
         Z11024Bros_ep2 = A11024Bros_ep2 ;
         Z11025Bros_ep3 = A11025Bros_ep3 ;
         Z11026Bros_ep4 = A11026Bros_ep4 ;
         Z11027Bros_ep5 = A11027Bros_ep5 ;
         Z11028Bros_ep6 = A11028Bros_ep6 ;
         Z11029Bros_ep7 = A11029Bros_ep7 ;
         Z11030Bros_ep8 = A11030Bros_ep8 ;
         Z11031Bros_ep9 = A11031Bros_ep9 ;
         Z11032Bros_ep10 = A11032Bros_ep10 ;
         Z11033Bros_c9 = A11033Bros_c9 ;
         Z11034Bros_sa1 = A11034Bros_sa1 ;
         Z11035Bros_sa2 = A11035Bros_sa2 ;
         Z11036Bros_sa3 = A11036Bros_sa3 ;
         Z11037Bros_sa4 = A11037Bros_sa4 ;
         Z11038Bros_sa5 = A11038Bros_sa5 ;
         Z11039Bros_sa6 = A11039Bros_sa6 ;
         Z11040Bros_c10 = A11040Bros_c10 ;
         Z11066Bros_stk = A11066Bros_stk ;
         Z11067Bros_Lbta = A11067Bros_Lbta ;
         Z11068Bros_Lbtp = A11068Bros_Lbtp ;
         Z11069Bros_c11 = A11069Bros_c11 ;
         Z11070Bros_c12 = A11070Bros_c12 ;
         Z11369Bros_imp1 = A11369Bros_imp1 ;
         Z11370Bros_imp2 = A11370Bros_imp2 ;
         Z11371Bros_imp3 = A11371Bros_imp3 ;
         Z11372Bros_imp4 = A11372Bros_imp4 ;
         Z11373Bros_imp5 = A11373Bros_imp5 ;
         Z11374Bros_imp6 = A11374Bros_imp6 ;
         Z11375Bros_imp7 = A11375Bros_imp7 ;
         Z11376Bros_imp8 = A11376Bros_imp8 ;
         Z11377Bros_imp9 = A11377Bros_imp9 ;
         Z11378Bros_imp10 = A11378Bros_imp10 ;
         Z11379Bros_imp11 = A11379Bros_imp11 ;
         Z11380Bros_oekot = A11380Bros_oekot ;
         Z11381Bros_lavad = A11381Bros_lavad ;
         Z11382Bros_luz = A11382Bros_luz ;
         Z11383Bros_sudor = A11383Bros_sudor ;
         Z11384Bros_cloro = A11384Bros_cloro ;
         Z11385Bros_aguam = A11385Bros_aguam ;
         Z11386Bros_termo = A11386Bros_termo ;
         Z11387Bros_humed = A11387Bros_humed ;
         Z11407Bros_obs1 = A11407Bros_obs1 ;
         Z11408Bros_obs2 = A11408Bros_obs2 ;
         Z11409Bros_obs3 = A11409Bros_obs3 ;
         Z11410Bros_obs4 = A11410Bros_obs4 ;
         Z11411Bros_obs5 = A11411Bros_obs5 ;
         Z11412Bros_obs6 = A11412Bros_obs6 ;
         Z11413Bros_obs7 = A11413Bros_obs7 ;
         Z11414Bros_obs8 = A11414Bros_obs8 ;
         Z11415Bros_obs9 = A11415Bros_obs9 ;
         Z11416Bros_obs10 = A11416Bros_obs10 ;
         Z11417Bros_obs11 = A11417Bros_obs11 ;
         Z11703Bros_nc = A11703Bros_nc ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01AF4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AF4_A407EmprNom[0] ;
      n407EmprNom = T01AF4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01AF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01AF5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
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
      if ( isIns( )  && (GXutil.strcmp("", A10979Bros_Mcot)==0) && ( Gx_BScreen == 0 ) )
      {
         A10979Bros_Mcot = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10979Bros_Mcot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10979Bros_Mcot", A10979Bros_Mcot);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10980Bros_Pd)==0) && ( Gx_BScreen == 0 ) )
      {
         A10980Bros_Pd = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10980Bros_Pd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10980Bros_Pd", A10980Bros_Pd);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10981Bros_Pp)==0) && ( Gx_BScreen == 0 ) )
      {
         A10981Bros_Pp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10981Bros_Pp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10981Bros_Pp", A10981Bros_Pp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10982Bros_Ag)==0) && ( Gx_BScreen == 0 ) )
      {
         A10982Bros_Ag = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10982Bros_Ag = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10982Bros_Ag", A10982Bros_Ag);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10985Bros_bo)==0) && ( Gx_BScreen == 0 ) )
      {
         A10985Bros_bo = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10985Bros_bo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10985Bros_bo", A10985Bros_bo);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10986Bros_bob)==0) && ( Gx_BScreen == 0 ) )
      {
         A10986Bros_bob = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10986Bros_bob = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10986Bros_bob", A10986Bros_bob);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10988BrosBov)==0) && ( Gx_BScreen == 0 ) )
      {
         A10988BrosBov = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10988BrosBov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", A10988BrosBov);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10987Bros_boe)==0) && ( Gx_BScreen == 0 ) )
      {
         A10987Bros_boe = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10987Bros_boe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10987Bros_boe", A10987Bros_boe);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10990Bros_tns)==0) && ( Gx_BScreen == 0 ) )
      {
         A10990Bros_tns = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10990Bros_tns = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10990Bros_tns", A10990Bros_tns);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10991Bros_tnc)==0) && ( Gx_BScreen == 0 ) )
      {
         A10991Bros_tnc = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10991Bros_tnc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10991Bros_tnc", A10991Bros_tnc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10993Bros_ct)==0) && ( Gx_BScreen == 0 ) )
      {
         A10993Bros_ct = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10993Bros_ct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10993Bros_ct", A10993Bros_ct);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10995Bros_scs)==0) && ( Gx_BScreen == 0 ) )
      {
         A10995Bros_scs = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10995Bros_scs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10995Bros_scs", A10995Bros_scs);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10996Bros_scc)==0) && ( Gx_BScreen == 0 ) )
      {
         A10996Bros_scc = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10996Bros_scc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10996Bros_scc", A10996Bros_scc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10998Bros_cctse)==0) && ( Gx_BScreen == 0 ) )
      {
         A10998Bros_cctse = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10998Bros_cctse = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10998Bros_cctse", A10998Bros_cctse);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10999Bros_ccttp)==0) && ( Gx_BScreen == 0 ) )
      {
         A10999Bros_ccttp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10999Bros_ccttp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10999Bros_ccttp", A10999Bros_ccttp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11000Bros_cctet)==0) && ( Gx_BScreen == 0 ) )
      {
         A11000Bros_cctet = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11000Bros_cctet = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11000Bros_cctet", A11000Bros_cctet);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11003Bros_ccpc)==0) && ( Gx_BScreen == 0 ) )
      {
         A11003Bros_ccpc = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11003Bros_ccpc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11003Bros_ccpc", A11003Bros_ccpc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11004Bros_cctq)==0) && ( Gx_BScreen == 0 ) )
      {
         A11004Bros_cctq = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11004Bros_cctq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11004Bros_cctq", A11004Bros_cctq);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11005Bros_cccc)==0) && ( Gx_BScreen == 0 ) )
      {
         A11005Bros_cccc = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11005Bros_cccc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11005Bros_cccc", A11005Bros_cccc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11006Bros_ccec)==0) && ( Gx_BScreen == 0 ) )
      {
         A11006Bros_ccec = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11006Bros_ccec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11006Bros_ccec", A11006Bros_ccec);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11008Bros_ccmc1)==0) && ( Gx_BScreen == 0 ) )
      {
         A11008Bros_ccmc1 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11008Bros_ccmc1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11008Bros_ccmc1", A11008Bros_ccmc1);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11009Bros_ccmc2)==0) && ( Gx_BScreen == 0 ) )
      {
         A11009Bros_ccmc2 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11009Bros_ccmc2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11009Bros_ccmc2", A11009Bros_ccmc2);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11010Bros_ccmc3)==0) && ( Gx_BScreen == 0 ) )
      {
         A11010Bros_ccmc3 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11010Bros_ccmc3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11010Bros_ccmc3", A11010Bros_ccmc3);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11011Bros_ccmc4)==0) && ( Gx_BScreen == 0 ) )
      {
         A11011Bros_ccmc4 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11011Bros_ccmc4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11011Bros_ccmc4", A11011Bros_ccmc4);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11012Bros_ccmc5)==0) && ( Gx_BScreen == 0 ) )
      {
         A11012Bros_ccmc5 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11012Bros_ccmc5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11012Bros_ccmc5", A11012Bros_ccmc5);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11013Bros_ccmc6)==0) && ( Gx_BScreen == 0 ) )
      {
         A11013Bros_ccmc6 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11013Bros_ccmc6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11013Bros_ccmc6", A11013Bros_ccmc6);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11015Bros_rb)==0) && ( Gx_BScreen == 0 ) )
      {
         A11015Bros_rb = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11015Bros_rb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11015Bros_rb", A11015Bros_rb);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11017Bros_rbe)==0) && ( Gx_BScreen == 0 ) )
      {
         A11017Bros_rbe = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11017Bros_rbe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11017Bros_rbe", A11017Bros_rbe);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11016Bros_rbi)==0) && ( Gx_BScreen == 0 ) )
      {
         A11016Bros_rbi = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11016Bros_rbi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11016Bros_rbi", A11016Bros_rbi);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11018Bros_rbp)==0) && ( Gx_BScreen == 0 ) )
      {
         A11018Bros_rbp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11018Bros_rbp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11018Bros_rbp", A11018Bros_rbp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11020Bros_rb1)==0) && ( Gx_BScreen == 0 ) )
      {
         A11020Bros_rb1 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11020Bros_rb1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11020Bros_rb1", A11020Bros_rb1);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11021Bros_rb3)==0) && ( Gx_BScreen == 0 ) )
      {
         A11021Bros_rb3 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11021Bros_rb3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11021Bros_rb3", A11021Bros_rb3);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11023Bros_ep1)==0) && ( Gx_BScreen == 0 ) )
      {
         A11023Bros_ep1 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11023Bros_ep1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11023Bros_ep1", A11023Bros_ep1);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11024Bros_ep2)==0) && ( Gx_BScreen == 0 ) )
      {
         A11024Bros_ep2 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11024Bros_ep2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11024Bros_ep2", A11024Bros_ep2);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11025Bros_ep3)==0) && ( Gx_BScreen == 0 ) )
      {
         A11025Bros_ep3 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11025Bros_ep3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11025Bros_ep3", A11025Bros_ep3);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11026Bros_ep4)==0) && ( Gx_BScreen == 0 ) )
      {
         A11026Bros_ep4 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11026Bros_ep4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11026Bros_ep4", A11026Bros_ep4);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11027Bros_ep5)==0) && ( Gx_BScreen == 0 ) )
      {
         A11027Bros_ep5 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11027Bros_ep5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11027Bros_ep5", A11027Bros_ep5);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11028Bros_ep6)==0) && ( Gx_BScreen == 0 ) )
      {
         A11028Bros_ep6 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11028Bros_ep6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11028Bros_ep6", A11028Bros_ep6);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11029Bros_ep7)==0) && ( Gx_BScreen == 0 ) )
      {
         A11029Bros_ep7 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11029Bros_ep7 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11029Bros_ep7", A11029Bros_ep7);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11030Bros_ep8)==0) && ( Gx_BScreen == 0 ) )
      {
         A11030Bros_ep8 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11030Bros_ep8 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11030Bros_ep8", A11030Bros_ep8);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11031Bros_ep9)==0) && ( Gx_BScreen == 0 ) )
      {
         A11031Bros_ep9 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11031Bros_ep9 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11031Bros_ep9", A11031Bros_ep9);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11032Bros_ep10)==0) && ( Gx_BScreen == 0 ) )
      {
         A11032Bros_ep10 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11032Bros_ep10 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11032Bros_ep10", A11032Bros_ep10);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11034Bros_sa1)==0) && ( Gx_BScreen == 0 ) )
      {
         A11034Bros_sa1 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11034Bros_sa1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11034Bros_sa1", A11034Bros_sa1);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11035Bros_sa2)==0) && ( Gx_BScreen == 0 ) )
      {
         A11035Bros_sa2 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11035Bros_sa2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11035Bros_sa2", A11035Bros_sa2);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11036Bros_sa3)==0) && ( Gx_BScreen == 0 ) )
      {
         A11036Bros_sa3 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11036Bros_sa3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11036Bros_sa3", A11036Bros_sa3);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11038Bros_sa5)==0) && ( Gx_BScreen == 0 ) )
      {
         A11038Bros_sa5 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11038Bros_sa5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11038Bros_sa5", A11038Bros_sa5);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11039Bros_sa6)==0) && ( Gx_BScreen == 0 ) )
      {
         A11039Bros_sa6 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11039Bros_sa6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11039Bros_sa6", A11039Bros_sa6);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11066Bros_stk)==0) && ( Gx_BScreen == 0 ) )
      {
         A11066Bros_stk = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11066Bros_stk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11066Bros_stk", A11066Bros_stk);
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
         if ( GXutil.strcmp(A10980Bros_Pd, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtBros_Pp_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10980Bros_Pd, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               edtBros_Pp_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A10981Bros_Pp, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtBros_Pd_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10981Bros_Pp, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               edtBros_Pd_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A10982Bros_Ag, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtTrnCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10982Bros_Ag, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtTrnCod_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtBros_boe_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtBros_boe_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A10986Bros_bob, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  edtBros_boe_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
               }
               else
               {
                  if ( GXutil.strcmp(A10986Bros_bob, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
                  {
                     edtBros_boe_Enabled = 1 ;
                     httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
                  }
               }
            }
         }
         if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtBros_bob_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtBros_bob_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A10987Bros_boe, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  edtBros_bob_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
               }
               else
               {
                  if ( GXutil.strcmp(A10987Bros_boe, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
                  {
                     edtBros_bob_Enabled = 1 ;
                     httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
                  }
               }
            }
         }
      }
   }

   public void load1AF1467( )
   {
      /* Using cursor T01AF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1467 = (short)(1) ;
         A11704Bros_enc = T01AF7_A11704Bros_enc[0] ;
         n11704Bros_enc = T01AF7_n11704Bros_enc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11704Bros_enc", GXutil.ltrimstr( A11704Bros_enc, 6, 2));
         A840TrnCod = T01AF7_A840TrnCod[0] ;
         n840TrnCod = T01AF7_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A407EmprNom = T01AF7_A407EmprNom[0] ;
         n407EmprNom = T01AF7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01AF7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A10979Bros_Mcot = T01AF7_A10979Bros_Mcot[0] ;
         n10979Bros_Mcot = T01AF7_n10979Bros_Mcot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10979Bros_Mcot", A10979Bros_Mcot);
         A10980Bros_Pd = T01AF7_A10980Bros_Pd[0] ;
         n10980Bros_Pd = T01AF7_n10980Bros_Pd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10980Bros_Pd", A10980Bros_Pd);
         A10981Bros_Pp = T01AF7_A10981Bros_Pp[0] ;
         n10981Bros_Pp = T01AF7_n10981Bros_Pp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10981Bros_Pp", A10981Bros_Pp);
         A10982Bros_Ag = T01AF7_A10982Bros_Ag[0] ;
         n10982Bros_Ag = T01AF7_n10982Bros_Ag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10982Bros_Ag", A10982Bros_Ag);
         A10983Bros_c1 = T01AF7_A10983Bros_c1[0] ;
         n10983Bros_c1 = T01AF7_n10983Bros_c1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10983Bros_c1", A10983Bros_c1);
         A10984Bros_c2 = T01AF7_A10984Bros_c2[0] ;
         n10984Bros_c2 = T01AF7_n10984Bros_c2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10984Bros_c2", A10984Bros_c2);
         A10985Bros_bo = T01AF7_A10985Bros_bo[0] ;
         n10985Bros_bo = T01AF7_n10985Bros_bo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10985Bros_bo", A10985Bros_bo);
         A10986Bros_bob = T01AF7_A10986Bros_bob[0] ;
         n10986Bros_bob = T01AF7_n10986Bros_bob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10986Bros_bob", A10986Bros_bob);
         A10987Bros_boe = T01AF7_A10987Bros_boe[0] ;
         n10987Bros_boe = T01AF7_n10987Bros_boe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10987Bros_boe", A10987Bros_boe);
         A10988BrosBov = T01AF7_A10988BrosBov[0] ;
         n10988BrosBov = T01AF7_n10988BrosBov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", A10988BrosBov);
         A10989Bros_c3 = T01AF7_A10989Bros_c3[0] ;
         n10989Bros_c3 = T01AF7_n10989Bros_c3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10989Bros_c3", A10989Bros_c3);
         A10990Bros_tns = T01AF7_A10990Bros_tns[0] ;
         n10990Bros_tns = T01AF7_n10990Bros_tns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10990Bros_tns", A10990Bros_tns);
         A10991Bros_tnc = T01AF7_A10991Bros_tnc[0] ;
         n10991Bros_tnc = T01AF7_n10991Bros_tnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10991Bros_tnc", A10991Bros_tnc);
         A10992Bros_c4 = T01AF7_A10992Bros_c4[0] ;
         n10992Bros_c4 = T01AF7_n10992Bros_c4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10992Bros_c4", A10992Bros_c4);
         A10993Bros_ct = T01AF7_A10993Bros_ct[0] ;
         n10993Bros_ct = T01AF7_n10993Bros_ct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10993Bros_ct", A10993Bros_ct);
         A10994Bros_c5 = T01AF7_A10994Bros_c5[0] ;
         n10994Bros_c5 = T01AF7_n10994Bros_c5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10994Bros_c5", A10994Bros_c5);
         A10995Bros_scs = T01AF7_A10995Bros_scs[0] ;
         n10995Bros_scs = T01AF7_n10995Bros_scs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10995Bros_scs", A10995Bros_scs);
         A10996Bros_scc = T01AF7_A10996Bros_scc[0] ;
         n10996Bros_scc = T01AF7_n10996Bros_scc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10996Bros_scc", A10996Bros_scc);
         A10997Bros_c6 = T01AF7_A10997Bros_c6[0] ;
         n10997Bros_c6 = T01AF7_n10997Bros_c6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10997Bros_c6", A10997Bros_c6);
         A10998Bros_cctse = T01AF7_A10998Bros_cctse[0] ;
         n10998Bros_cctse = T01AF7_n10998Bros_cctse[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10998Bros_cctse", A10998Bros_cctse);
         A10999Bros_ccttp = T01AF7_A10999Bros_ccttp[0] ;
         n10999Bros_ccttp = T01AF7_n10999Bros_ccttp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10999Bros_ccttp", A10999Bros_ccttp);
         A11000Bros_cctet = T01AF7_A11000Bros_cctet[0] ;
         n11000Bros_cctet = T01AF7_n11000Bros_cctet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11000Bros_cctet", A11000Bros_cctet);
         A11001Bros_ccp = T01AF7_A11001Bros_ccp[0] ;
         n11001Bros_ccp = T01AF7_n11001Bros_ccp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11001Bros_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11001Bros_ccp), 2, 0));
         A11002Bros_cct = T01AF7_A11002Bros_cct[0] ;
         n11002Bros_cct = T01AF7_n11002Bros_cct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11002Bros_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11002Bros_cct), 2, 0));
         A11003Bros_ccpc = T01AF7_A11003Bros_ccpc[0] ;
         n11003Bros_ccpc = T01AF7_n11003Bros_ccpc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11003Bros_ccpc", A11003Bros_ccpc);
         A11004Bros_cctq = T01AF7_A11004Bros_cctq[0] ;
         n11004Bros_cctq = T01AF7_n11004Bros_cctq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11004Bros_cctq", A11004Bros_cctq);
         A11005Bros_cccc = T01AF7_A11005Bros_cccc[0] ;
         n11005Bros_cccc = T01AF7_n11005Bros_cccc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11005Bros_cccc", A11005Bros_cccc);
         A11006Bros_ccec = T01AF7_A11006Bros_ccec[0] ;
         n11006Bros_ccec = T01AF7_n11006Bros_ccec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11006Bros_ccec", A11006Bros_ccec);
         A11008Bros_ccmc1 = T01AF7_A11008Bros_ccmc1[0] ;
         n11008Bros_ccmc1 = T01AF7_n11008Bros_ccmc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11008Bros_ccmc1", A11008Bros_ccmc1);
         A11009Bros_ccmc2 = T01AF7_A11009Bros_ccmc2[0] ;
         n11009Bros_ccmc2 = T01AF7_n11009Bros_ccmc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11009Bros_ccmc2", A11009Bros_ccmc2);
         A11010Bros_ccmc3 = T01AF7_A11010Bros_ccmc3[0] ;
         n11010Bros_ccmc3 = T01AF7_n11010Bros_ccmc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11010Bros_ccmc3", A11010Bros_ccmc3);
         A11011Bros_ccmc4 = T01AF7_A11011Bros_ccmc4[0] ;
         n11011Bros_ccmc4 = T01AF7_n11011Bros_ccmc4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11011Bros_ccmc4", A11011Bros_ccmc4);
         A11012Bros_ccmc5 = T01AF7_A11012Bros_ccmc5[0] ;
         n11012Bros_ccmc5 = T01AF7_n11012Bros_ccmc5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11012Bros_ccmc5", A11012Bros_ccmc5);
         A11013Bros_ccmc6 = T01AF7_A11013Bros_ccmc6[0] ;
         n11013Bros_ccmc6 = T01AF7_n11013Bros_ccmc6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11013Bros_ccmc6", A11013Bros_ccmc6);
         A11014Bros_c7 = T01AF7_A11014Bros_c7[0] ;
         n11014Bros_c7 = T01AF7_n11014Bros_c7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11014Bros_c7", A11014Bros_c7);
         A11015Bros_rb = T01AF7_A11015Bros_rb[0] ;
         n11015Bros_rb = T01AF7_n11015Bros_rb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11015Bros_rb", A11015Bros_rb);
         A11016Bros_rbi = T01AF7_A11016Bros_rbi[0] ;
         n11016Bros_rbi = T01AF7_n11016Bros_rbi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11016Bros_rbi", A11016Bros_rbi);
         A11017Bros_rbe = T01AF7_A11017Bros_rbe[0] ;
         n11017Bros_rbe = T01AF7_n11017Bros_rbe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11017Bros_rbe", A11017Bros_rbe);
         A11018Bros_rbp = T01AF7_A11018Bros_rbp[0] ;
         n11018Bros_rbp = T01AF7_n11018Bros_rbp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11018Bros_rbp", A11018Bros_rbp);
         A11019Bros_rboc = T01AF7_A11019Bros_rboc[0] ;
         n11019Bros_rboc = T01AF7_n11019Bros_rboc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11019Bros_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11019Bros_rboc), 3, 0));
         A11020Bros_rb1 = T01AF7_A11020Bros_rb1[0] ;
         n11020Bros_rb1 = T01AF7_n11020Bros_rb1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11020Bros_rb1", A11020Bros_rb1);
         A11021Bros_rb3 = T01AF7_A11021Bros_rb3[0] ;
         n11021Bros_rb3 = T01AF7_n11021Bros_rb3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11021Bros_rb3", A11021Bros_rb3);
         A11022Bros_c8 = T01AF7_A11022Bros_c8[0] ;
         n11022Bros_c8 = T01AF7_n11022Bros_c8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11022Bros_c8", A11022Bros_c8);
         A11023Bros_ep1 = T01AF7_A11023Bros_ep1[0] ;
         n11023Bros_ep1 = T01AF7_n11023Bros_ep1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11023Bros_ep1", A11023Bros_ep1);
         A11024Bros_ep2 = T01AF7_A11024Bros_ep2[0] ;
         n11024Bros_ep2 = T01AF7_n11024Bros_ep2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11024Bros_ep2", A11024Bros_ep2);
         A11025Bros_ep3 = T01AF7_A11025Bros_ep3[0] ;
         n11025Bros_ep3 = T01AF7_n11025Bros_ep3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11025Bros_ep3", A11025Bros_ep3);
         A11026Bros_ep4 = T01AF7_A11026Bros_ep4[0] ;
         n11026Bros_ep4 = T01AF7_n11026Bros_ep4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11026Bros_ep4", A11026Bros_ep4);
         A11027Bros_ep5 = T01AF7_A11027Bros_ep5[0] ;
         n11027Bros_ep5 = T01AF7_n11027Bros_ep5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11027Bros_ep5", A11027Bros_ep5);
         A11028Bros_ep6 = T01AF7_A11028Bros_ep6[0] ;
         n11028Bros_ep6 = T01AF7_n11028Bros_ep6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11028Bros_ep6", A11028Bros_ep6);
         A11029Bros_ep7 = T01AF7_A11029Bros_ep7[0] ;
         n11029Bros_ep7 = T01AF7_n11029Bros_ep7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11029Bros_ep7", A11029Bros_ep7);
         A11030Bros_ep8 = T01AF7_A11030Bros_ep8[0] ;
         n11030Bros_ep8 = T01AF7_n11030Bros_ep8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11030Bros_ep8", A11030Bros_ep8);
         A11031Bros_ep9 = T01AF7_A11031Bros_ep9[0] ;
         n11031Bros_ep9 = T01AF7_n11031Bros_ep9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11031Bros_ep9", A11031Bros_ep9);
         A11032Bros_ep10 = T01AF7_A11032Bros_ep10[0] ;
         n11032Bros_ep10 = T01AF7_n11032Bros_ep10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11032Bros_ep10", A11032Bros_ep10);
         A11033Bros_c9 = T01AF7_A11033Bros_c9[0] ;
         n11033Bros_c9 = T01AF7_n11033Bros_c9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11033Bros_c9", A11033Bros_c9);
         A11034Bros_sa1 = T01AF7_A11034Bros_sa1[0] ;
         n11034Bros_sa1 = T01AF7_n11034Bros_sa1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11034Bros_sa1", A11034Bros_sa1);
         A11035Bros_sa2 = T01AF7_A11035Bros_sa2[0] ;
         n11035Bros_sa2 = T01AF7_n11035Bros_sa2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11035Bros_sa2", A11035Bros_sa2);
         A11036Bros_sa3 = T01AF7_A11036Bros_sa3[0] ;
         n11036Bros_sa3 = T01AF7_n11036Bros_sa3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11036Bros_sa3", A11036Bros_sa3);
         A11037Bros_sa4 = T01AF7_A11037Bros_sa4[0] ;
         n11037Bros_sa4 = T01AF7_n11037Bros_sa4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11037Bros_sa4", A11037Bros_sa4);
         A11038Bros_sa5 = T01AF7_A11038Bros_sa5[0] ;
         n11038Bros_sa5 = T01AF7_n11038Bros_sa5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11038Bros_sa5", A11038Bros_sa5);
         A11039Bros_sa6 = T01AF7_A11039Bros_sa6[0] ;
         n11039Bros_sa6 = T01AF7_n11039Bros_sa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11039Bros_sa6", A11039Bros_sa6);
         A11040Bros_c10 = T01AF7_A11040Bros_c10[0] ;
         n11040Bros_c10 = T01AF7_n11040Bros_c10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11040Bros_c10", A11040Bros_c10);
         A11066Bros_stk = T01AF7_A11066Bros_stk[0] ;
         n11066Bros_stk = T01AF7_n11066Bros_stk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11066Bros_stk", A11066Bros_stk);
         A11067Bros_Lbta = T01AF7_A11067Bros_Lbta[0] ;
         n11067Bros_Lbta = T01AF7_n11067Bros_Lbta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11067Bros_Lbta", A11067Bros_Lbta);
         A11068Bros_Lbtp = T01AF7_A11068Bros_Lbtp[0] ;
         n11068Bros_Lbtp = T01AF7_n11068Bros_Lbtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11068Bros_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11068Bros_Lbtp), 4, 0));
         A11069Bros_c11 = T01AF7_A11069Bros_c11[0] ;
         n11069Bros_c11 = T01AF7_n11069Bros_c11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11069Bros_c11", A11069Bros_c11);
         A11070Bros_c12 = T01AF7_A11070Bros_c12[0] ;
         n11070Bros_c12 = T01AF7_n11070Bros_c12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11070Bros_c12", A11070Bros_c12);
         A11369Bros_imp1 = T01AF7_A11369Bros_imp1[0] ;
         n11369Bros_imp1 = T01AF7_n11369Bros_imp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11369Bros_imp1", A11369Bros_imp1);
         A11370Bros_imp2 = T01AF7_A11370Bros_imp2[0] ;
         n11370Bros_imp2 = T01AF7_n11370Bros_imp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11370Bros_imp2", A11370Bros_imp2);
         A11371Bros_imp3 = T01AF7_A11371Bros_imp3[0] ;
         n11371Bros_imp3 = T01AF7_n11371Bros_imp3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11371Bros_imp3", A11371Bros_imp3);
         A11372Bros_imp4 = T01AF7_A11372Bros_imp4[0] ;
         n11372Bros_imp4 = T01AF7_n11372Bros_imp4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11372Bros_imp4", A11372Bros_imp4);
         A11373Bros_imp5 = T01AF7_A11373Bros_imp5[0] ;
         n11373Bros_imp5 = T01AF7_n11373Bros_imp5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11373Bros_imp5", A11373Bros_imp5);
         A11374Bros_imp6 = T01AF7_A11374Bros_imp6[0] ;
         n11374Bros_imp6 = T01AF7_n11374Bros_imp6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11374Bros_imp6", A11374Bros_imp6);
         A11375Bros_imp7 = T01AF7_A11375Bros_imp7[0] ;
         n11375Bros_imp7 = T01AF7_n11375Bros_imp7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11375Bros_imp7", A11375Bros_imp7);
         A11376Bros_imp8 = T01AF7_A11376Bros_imp8[0] ;
         n11376Bros_imp8 = T01AF7_n11376Bros_imp8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11376Bros_imp8", A11376Bros_imp8);
         A11377Bros_imp9 = T01AF7_A11377Bros_imp9[0] ;
         n11377Bros_imp9 = T01AF7_n11377Bros_imp9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11377Bros_imp9", A11377Bros_imp9);
         A11378Bros_imp10 = T01AF7_A11378Bros_imp10[0] ;
         n11378Bros_imp10 = T01AF7_n11378Bros_imp10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11378Bros_imp10", A11378Bros_imp10);
         A11379Bros_imp11 = T01AF7_A11379Bros_imp11[0] ;
         n11379Bros_imp11 = T01AF7_n11379Bros_imp11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11379Bros_imp11", A11379Bros_imp11);
         A11380Bros_oekot = T01AF7_A11380Bros_oekot[0] ;
         n11380Bros_oekot = T01AF7_n11380Bros_oekot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11380Bros_oekot", A11380Bros_oekot);
         A11381Bros_lavad = T01AF7_A11381Bros_lavad[0] ;
         n11381Bros_lavad = T01AF7_n11381Bros_lavad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11381Bros_lavad", A11381Bros_lavad);
         A11382Bros_luz = T01AF7_A11382Bros_luz[0] ;
         n11382Bros_luz = T01AF7_n11382Bros_luz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11382Bros_luz", A11382Bros_luz);
         A11383Bros_sudor = T01AF7_A11383Bros_sudor[0] ;
         n11383Bros_sudor = T01AF7_n11383Bros_sudor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11383Bros_sudor", A11383Bros_sudor);
         A11384Bros_cloro = T01AF7_A11384Bros_cloro[0] ;
         n11384Bros_cloro = T01AF7_n11384Bros_cloro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11384Bros_cloro", A11384Bros_cloro);
         A11385Bros_aguam = T01AF7_A11385Bros_aguam[0] ;
         n11385Bros_aguam = T01AF7_n11385Bros_aguam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11385Bros_aguam", A11385Bros_aguam);
         A11386Bros_termo = T01AF7_A11386Bros_termo[0] ;
         n11386Bros_termo = T01AF7_n11386Bros_termo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11386Bros_termo", A11386Bros_termo);
         A11387Bros_humed = T01AF7_A11387Bros_humed[0] ;
         n11387Bros_humed = T01AF7_n11387Bros_humed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11387Bros_humed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11387Bros_humed), 2, 0));
         A11407Bros_obs1 = T01AF7_A11407Bros_obs1[0] ;
         n11407Bros_obs1 = T01AF7_n11407Bros_obs1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11407Bros_obs1", A11407Bros_obs1);
         A11408Bros_obs2 = T01AF7_A11408Bros_obs2[0] ;
         n11408Bros_obs2 = T01AF7_n11408Bros_obs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11408Bros_obs2", A11408Bros_obs2);
         A11409Bros_obs3 = T01AF7_A11409Bros_obs3[0] ;
         n11409Bros_obs3 = T01AF7_n11409Bros_obs3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11409Bros_obs3", A11409Bros_obs3);
         A11410Bros_obs4 = T01AF7_A11410Bros_obs4[0] ;
         n11410Bros_obs4 = T01AF7_n11410Bros_obs4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11410Bros_obs4", A11410Bros_obs4);
         A11411Bros_obs5 = T01AF7_A11411Bros_obs5[0] ;
         n11411Bros_obs5 = T01AF7_n11411Bros_obs5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11411Bros_obs5", A11411Bros_obs5);
         A11412Bros_obs6 = T01AF7_A11412Bros_obs6[0] ;
         n11412Bros_obs6 = T01AF7_n11412Bros_obs6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11412Bros_obs6", A11412Bros_obs6);
         A11413Bros_obs7 = T01AF7_A11413Bros_obs7[0] ;
         n11413Bros_obs7 = T01AF7_n11413Bros_obs7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11413Bros_obs7", A11413Bros_obs7);
         A11414Bros_obs8 = T01AF7_A11414Bros_obs8[0] ;
         n11414Bros_obs8 = T01AF7_n11414Bros_obs8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11414Bros_obs8", A11414Bros_obs8);
         A11415Bros_obs9 = T01AF7_A11415Bros_obs9[0] ;
         n11415Bros_obs9 = T01AF7_n11415Bros_obs9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11415Bros_obs9", A11415Bros_obs9);
         A11416Bros_obs10 = T01AF7_A11416Bros_obs10[0] ;
         n11416Bros_obs10 = T01AF7_n11416Bros_obs10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11416Bros_obs10", A11416Bros_obs10);
         A11417Bros_obs11 = T01AF7_A11417Bros_obs11[0] ;
         n11417Bros_obs11 = T01AF7_n11417Bros_obs11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11417Bros_obs11", A11417Bros_obs11);
         A11703Bros_nc = T01AF7_A11703Bros_nc[0] ;
         n11703Bros_nc = T01AF7_n11703Bros_nc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11703Bros_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11703Bros_nc), 2, 0));
         zm1AF1467( -54) ;
      }
      pr_default.close(5);
      onLoadActions1AF1467( ) ;
   }

   public void onLoadActions1AF1467( )
   {
      if ( GXutil.strcmp(A10980Bros_Pd, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
      {
         edtBros_Pp_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10980Bros_Pd, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtBros_Pp_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A10981Bros_Pp, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
      {
         edtBros_Pd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10981Bros_Pp, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtBros_Pd_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A10982Bros_Ag, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10982Bros_Ag, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtTrnCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtBros_bob_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtBros_bob_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10987Bros_boe, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtBros_bob_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A10987Bros_boe, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  edtBros_bob_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
               }
            }
         }
      }
      if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtBros_boe_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtBros_boe_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10986Bros_bob, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtBros_boe_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A10986Bros_bob, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  edtBros_boe_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
               }
            }
         }
      }
   }

   public void checkExtendedTable1AF1467( )
   {
      nIsDirty_1467 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01AF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(A10980Bros_Pd, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
      {
         edtBros_Pp_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10980Bros_Pd, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtBros_Pp_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A10981Bros_Pp, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
      {
         edtBros_Pd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10981Bros_Pp, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtBros_Pd_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A10982Bros_Ag, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10982Bros_Ag, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtTrnCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtBros_bob_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtBros_bob_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10987Bros_boe, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtBros_bob_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A10987Bros_boe, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  edtBros_bob_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
               }
            }
         }
      }
      if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtBros_boe_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtBros_boe_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10986Bros_bob, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtBros_boe_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A10986Bros_bob, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  edtBros_boe_Enabled = 1 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
               }
            }
         }
      }
   }

   public void closeExtendedTableCursors1AF1467( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_57( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01AF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1AF1467( )
   {
      /* Using cursor T01AF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1467 = (short)(1) ;
      }
      else
      {
         RcdFound1467 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01AF3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AF3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AF3_A10978Bros_Art[0], A10978Bros_Art) == 0 ) )
      {
         zm1AF1467( 54) ;
         RcdFound1467 = (short)(1) ;
         A11704Bros_enc = T01AF3_A11704Bros_enc[0] ;
         n11704Bros_enc = T01AF3_n11704Bros_enc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11704Bros_enc", GXutil.ltrimstr( A11704Bros_enc, 6, 2));
         A840TrnCod = T01AF3_A840TrnCod[0] ;
         n840TrnCod = T01AF3_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A10979Bros_Mcot = T01AF3_A10979Bros_Mcot[0] ;
         n10979Bros_Mcot = T01AF3_n10979Bros_Mcot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10979Bros_Mcot", A10979Bros_Mcot);
         A10980Bros_Pd = T01AF3_A10980Bros_Pd[0] ;
         n10980Bros_Pd = T01AF3_n10980Bros_Pd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10980Bros_Pd", A10980Bros_Pd);
         A10981Bros_Pp = T01AF3_A10981Bros_Pp[0] ;
         n10981Bros_Pp = T01AF3_n10981Bros_Pp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10981Bros_Pp", A10981Bros_Pp);
         A10982Bros_Ag = T01AF3_A10982Bros_Ag[0] ;
         n10982Bros_Ag = T01AF3_n10982Bros_Ag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10982Bros_Ag", A10982Bros_Ag);
         A10983Bros_c1 = T01AF3_A10983Bros_c1[0] ;
         n10983Bros_c1 = T01AF3_n10983Bros_c1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10983Bros_c1", A10983Bros_c1);
         A10984Bros_c2 = T01AF3_A10984Bros_c2[0] ;
         n10984Bros_c2 = T01AF3_n10984Bros_c2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10984Bros_c2", A10984Bros_c2);
         A10985Bros_bo = T01AF3_A10985Bros_bo[0] ;
         n10985Bros_bo = T01AF3_n10985Bros_bo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10985Bros_bo", A10985Bros_bo);
         A10986Bros_bob = T01AF3_A10986Bros_bob[0] ;
         n10986Bros_bob = T01AF3_n10986Bros_bob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10986Bros_bob", A10986Bros_bob);
         A10987Bros_boe = T01AF3_A10987Bros_boe[0] ;
         n10987Bros_boe = T01AF3_n10987Bros_boe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10987Bros_boe", A10987Bros_boe);
         A10988BrosBov = T01AF3_A10988BrosBov[0] ;
         n10988BrosBov = T01AF3_n10988BrosBov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", A10988BrosBov);
         A10989Bros_c3 = T01AF3_A10989Bros_c3[0] ;
         n10989Bros_c3 = T01AF3_n10989Bros_c3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10989Bros_c3", A10989Bros_c3);
         A10990Bros_tns = T01AF3_A10990Bros_tns[0] ;
         n10990Bros_tns = T01AF3_n10990Bros_tns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10990Bros_tns", A10990Bros_tns);
         A10991Bros_tnc = T01AF3_A10991Bros_tnc[0] ;
         n10991Bros_tnc = T01AF3_n10991Bros_tnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10991Bros_tnc", A10991Bros_tnc);
         A10992Bros_c4 = T01AF3_A10992Bros_c4[0] ;
         n10992Bros_c4 = T01AF3_n10992Bros_c4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10992Bros_c4", A10992Bros_c4);
         A10993Bros_ct = T01AF3_A10993Bros_ct[0] ;
         n10993Bros_ct = T01AF3_n10993Bros_ct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10993Bros_ct", A10993Bros_ct);
         A10994Bros_c5 = T01AF3_A10994Bros_c5[0] ;
         n10994Bros_c5 = T01AF3_n10994Bros_c5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10994Bros_c5", A10994Bros_c5);
         A10995Bros_scs = T01AF3_A10995Bros_scs[0] ;
         n10995Bros_scs = T01AF3_n10995Bros_scs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10995Bros_scs", A10995Bros_scs);
         A10996Bros_scc = T01AF3_A10996Bros_scc[0] ;
         n10996Bros_scc = T01AF3_n10996Bros_scc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10996Bros_scc", A10996Bros_scc);
         A10997Bros_c6 = T01AF3_A10997Bros_c6[0] ;
         n10997Bros_c6 = T01AF3_n10997Bros_c6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10997Bros_c6", A10997Bros_c6);
         A10998Bros_cctse = T01AF3_A10998Bros_cctse[0] ;
         n10998Bros_cctse = T01AF3_n10998Bros_cctse[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10998Bros_cctse", A10998Bros_cctse);
         A10999Bros_ccttp = T01AF3_A10999Bros_ccttp[0] ;
         n10999Bros_ccttp = T01AF3_n10999Bros_ccttp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10999Bros_ccttp", A10999Bros_ccttp);
         A11000Bros_cctet = T01AF3_A11000Bros_cctet[0] ;
         n11000Bros_cctet = T01AF3_n11000Bros_cctet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11000Bros_cctet", A11000Bros_cctet);
         A11001Bros_ccp = T01AF3_A11001Bros_ccp[0] ;
         n11001Bros_ccp = T01AF3_n11001Bros_ccp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11001Bros_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11001Bros_ccp), 2, 0));
         A11002Bros_cct = T01AF3_A11002Bros_cct[0] ;
         n11002Bros_cct = T01AF3_n11002Bros_cct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11002Bros_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11002Bros_cct), 2, 0));
         A11003Bros_ccpc = T01AF3_A11003Bros_ccpc[0] ;
         n11003Bros_ccpc = T01AF3_n11003Bros_ccpc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11003Bros_ccpc", A11003Bros_ccpc);
         A11004Bros_cctq = T01AF3_A11004Bros_cctq[0] ;
         n11004Bros_cctq = T01AF3_n11004Bros_cctq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11004Bros_cctq", A11004Bros_cctq);
         A11005Bros_cccc = T01AF3_A11005Bros_cccc[0] ;
         n11005Bros_cccc = T01AF3_n11005Bros_cccc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11005Bros_cccc", A11005Bros_cccc);
         A11006Bros_ccec = T01AF3_A11006Bros_ccec[0] ;
         n11006Bros_ccec = T01AF3_n11006Bros_ccec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11006Bros_ccec", A11006Bros_ccec);
         A11008Bros_ccmc1 = T01AF3_A11008Bros_ccmc1[0] ;
         n11008Bros_ccmc1 = T01AF3_n11008Bros_ccmc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11008Bros_ccmc1", A11008Bros_ccmc1);
         A11009Bros_ccmc2 = T01AF3_A11009Bros_ccmc2[0] ;
         n11009Bros_ccmc2 = T01AF3_n11009Bros_ccmc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11009Bros_ccmc2", A11009Bros_ccmc2);
         A11010Bros_ccmc3 = T01AF3_A11010Bros_ccmc3[0] ;
         n11010Bros_ccmc3 = T01AF3_n11010Bros_ccmc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11010Bros_ccmc3", A11010Bros_ccmc3);
         A11011Bros_ccmc4 = T01AF3_A11011Bros_ccmc4[0] ;
         n11011Bros_ccmc4 = T01AF3_n11011Bros_ccmc4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11011Bros_ccmc4", A11011Bros_ccmc4);
         A11012Bros_ccmc5 = T01AF3_A11012Bros_ccmc5[0] ;
         n11012Bros_ccmc5 = T01AF3_n11012Bros_ccmc5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11012Bros_ccmc5", A11012Bros_ccmc5);
         A11013Bros_ccmc6 = T01AF3_A11013Bros_ccmc6[0] ;
         n11013Bros_ccmc6 = T01AF3_n11013Bros_ccmc6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11013Bros_ccmc6", A11013Bros_ccmc6);
         A11014Bros_c7 = T01AF3_A11014Bros_c7[0] ;
         n11014Bros_c7 = T01AF3_n11014Bros_c7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11014Bros_c7", A11014Bros_c7);
         A11015Bros_rb = T01AF3_A11015Bros_rb[0] ;
         n11015Bros_rb = T01AF3_n11015Bros_rb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11015Bros_rb", A11015Bros_rb);
         A11016Bros_rbi = T01AF3_A11016Bros_rbi[0] ;
         n11016Bros_rbi = T01AF3_n11016Bros_rbi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11016Bros_rbi", A11016Bros_rbi);
         A11017Bros_rbe = T01AF3_A11017Bros_rbe[0] ;
         n11017Bros_rbe = T01AF3_n11017Bros_rbe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11017Bros_rbe", A11017Bros_rbe);
         A11018Bros_rbp = T01AF3_A11018Bros_rbp[0] ;
         n11018Bros_rbp = T01AF3_n11018Bros_rbp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11018Bros_rbp", A11018Bros_rbp);
         A11019Bros_rboc = T01AF3_A11019Bros_rboc[0] ;
         n11019Bros_rboc = T01AF3_n11019Bros_rboc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11019Bros_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11019Bros_rboc), 3, 0));
         A11020Bros_rb1 = T01AF3_A11020Bros_rb1[0] ;
         n11020Bros_rb1 = T01AF3_n11020Bros_rb1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11020Bros_rb1", A11020Bros_rb1);
         A11021Bros_rb3 = T01AF3_A11021Bros_rb3[0] ;
         n11021Bros_rb3 = T01AF3_n11021Bros_rb3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11021Bros_rb3", A11021Bros_rb3);
         A11022Bros_c8 = T01AF3_A11022Bros_c8[0] ;
         n11022Bros_c8 = T01AF3_n11022Bros_c8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11022Bros_c8", A11022Bros_c8);
         A11023Bros_ep1 = T01AF3_A11023Bros_ep1[0] ;
         n11023Bros_ep1 = T01AF3_n11023Bros_ep1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11023Bros_ep1", A11023Bros_ep1);
         A11024Bros_ep2 = T01AF3_A11024Bros_ep2[0] ;
         n11024Bros_ep2 = T01AF3_n11024Bros_ep2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11024Bros_ep2", A11024Bros_ep2);
         A11025Bros_ep3 = T01AF3_A11025Bros_ep3[0] ;
         n11025Bros_ep3 = T01AF3_n11025Bros_ep3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11025Bros_ep3", A11025Bros_ep3);
         A11026Bros_ep4 = T01AF3_A11026Bros_ep4[0] ;
         n11026Bros_ep4 = T01AF3_n11026Bros_ep4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11026Bros_ep4", A11026Bros_ep4);
         A11027Bros_ep5 = T01AF3_A11027Bros_ep5[0] ;
         n11027Bros_ep5 = T01AF3_n11027Bros_ep5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11027Bros_ep5", A11027Bros_ep5);
         A11028Bros_ep6 = T01AF3_A11028Bros_ep6[0] ;
         n11028Bros_ep6 = T01AF3_n11028Bros_ep6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11028Bros_ep6", A11028Bros_ep6);
         A11029Bros_ep7 = T01AF3_A11029Bros_ep7[0] ;
         n11029Bros_ep7 = T01AF3_n11029Bros_ep7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11029Bros_ep7", A11029Bros_ep7);
         A11030Bros_ep8 = T01AF3_A11030Bros_ep8[0] ;
         n11030Bros_ep8 = T01AF3_n11030Bros_ep8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11030Bros_ep8", A11030Bros_ep8);
         A11031Bros_ep9 = T01AF3_A11031Bros_ep9[0] ;
         n11031Bros_ep9 = T01AF3_n11031Bros_ep9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11031Bros_ep9", A11031Bros_ep9);
         A11032Bros_ep10 = T01AF3_A11032Bros_ep10[0] ;
         n11032Bros_ep10 = T01AF3_n11032Bros_ep10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11032Bros_ep10", A11032Bros_ep10);
         A11033Bros_c9 = T01AF3_A11033Bros_c9[0] ;
         n11033Bros_c9 = T01AF3_n11033Bros_c9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11033Bros_c9", A11033Bros_c9);
         A11034Bros_sa1 = T01AF3_A11034Bros_sa1[0] ;
         n11034Bros_sa1 = T01AF3_n11034Bros_sa1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11034Bros_sa1", A11034Bros_sa1);
         A11035Bros_sa2 = T01AF3_A11035Bros_sa2[0] ;
         n11035Bros_sa2 = T01AF3_n11035Bros_sa2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11035Bros_sa2", A11035Bros_sa2);
         A11036Bros_sa3 = T01AF3_A11036Bros_sa3[0] ;
         n11036Bros_sa3 = T01AF3_n11036Bros_sa3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11036Bros_sa3", A11036Bros_sa3);
         A11037Bros_sa4 = T01AF3_A11037Bros_sa4[0] ;
         n11037Bros_sa4 = T01AF3_n11037Bros_sa4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11037Bros_sa4", A11037Bros_sa4);
         A11038Bros_sa5 = T01AF3_A11038Bros_sa5[0] ;
         n11038Bros_sa5 = T01AF3_n11038Bros_sa5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11038Bros_sa5", A11038Bros_sa5);
         A11039Bros_sa6 = T01AF3_A11039Bros_sa6[0] ;
         n11039Bros_sa6 = T01AF3_n11039Bros_sa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11039Bros_sa6", A11039Bros_sa6);
         A11040Bros_c10 = T01AF3_A11040Bros_c10[0] ;
         n11040Bros_c10 = T01AF3_n11040Bros_c10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11040Bros_c10", A11040Bros_c10);
         A11066Bros_stk = T01AF3_A11066Bros_stk[0] ;
         n11066Bros_stk = T01AF3_n11066Bros_stk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11066Bros_stk", A11066Bros_stk);
         A11067Bros_Lbta = T01AF3_A11067Bros_Lbta[0] ;
         n11067Bros_Lbta = T01AF3_n11067Bros_Lbta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11067Bros_Lbta", A11067Bros_Lbta);
         A11068Bros_Lbtp = T01AF3_A11068Bros_Lbtp[0] ;
         n11068Bros_Lbtp = T01AF3_n11068Bros_Lbtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11068Bros_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11068Bros_Lbtp), 4, 0));
         A11069Bros_c11 = T01AF3_A11069Bros_c11[0] ;
         n11069Bros_c11 = T01AF3_n11069Bros_c11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11069Bros_c11", A11069Bros_c11);
         A11070Bros_c12 = T01AF3_A11070Bros_c12[0] ;
         n11070Bros_c12 = T01AF3_n11070Bros_c12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11070Bros_c12", A11070Bros_c12);
         A11369Bros_imp1 = T01AF3_A11369Bros_imp1[0] ;
         n11369Bros_imp1 = T01AF3_n11369Bros_imp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11369Bros_imp1", A11369Bros_imp1);
         A11370Bros_imp2 = T01AF3_A11370Bros_imp2[0] ;
         n11370Bros_imp2 = T01AF3_n11370Bros_imp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11370Bros_imp2", A11370Bros_imp2);
         A11371Bros_imp3 = T01AF3_A11371Bros_imp3[0] ;
         n11371Bros_imp3 = T01AF3_n11371Bros_imp3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11371Bros_imp3", A11371Bros_imp3);
         A11372Bros_imp4 = T01AF3_A11372Bros_imp4[0] ;
         n11372Bros_imp4 = T01AF3_n11372Bros_imp4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11372Bros_imp4", A11372Bros_imp4);
         A11373Bros_imp5 = T01AF3_A11373Bros_imp5[0] ;
         n11373Bros_imp5 = T01AF3_n11373Bros_imp5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11373Bros_imp5", A11373Bros_imp5);
         A11374Bros_imp6 = T01AF3_A11374Bros_imp6[0] ;
         n11374Bros_imp6 = T01AF3_n11374Bros_imp6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11374Bros_imp6", A11374Bros_imp6);
         A11375Bros_imp7 = T01AF3_A11375Bros_imp7[0] ;
         n11375Bros_imp7 = T01AF3_n11375Bros_imp7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11375Bros_imp7", A11375Bros_imp7);
         A11376Bros_imp8 = T01AF3_A11376Bros_imp8[0] ;
         n11376Bros_imp8 = T01AF3_n11376Bros_imp8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11376Bros_imp8", A11376Bros_imp8);
         A11377Bros_imp9 = T01AF3_A11377Bros_imp9[0] ;
         n11377Bros_imp9 = T01AF3_n11377Bros_imp9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11377Bros_imp9", A11377Bros_imp9);
         A11378Bros_imp10 = T01AF3_A11378Bros_imp10[0] ;
         n11378Bros_imp10 = T01AF3_n11378Bros_imp10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11378Bros_imp10", A11378Bros_imp10);
         A11379Bros_imp11 = T01AF3_A11379Bros_imp11[0] ;
         n11379Bros_imp11 = T01AF3_n11379Bros_imp11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11379Bros_imp11", A11379Bros_imp11);
         A11380Bros_oekot = T01AF3_A11380Bros_oekot[0] ;
         n11380Bros_oekot = T01AF3_n11380Bros_oekot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11380Bros_oekot", A11380Bros_oekot);
         A11381Bros_lavad = T01AF3_A11381Bros_lavad[0] ;
         n11381Bros_lavad = T01AF3_n11381Bros_lavad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11381Bros_lavad", A11381Bros_lavad);
         A11382Bros_luz = T01AF3_A11382Bros_luz[0] ;
         n11382Bros_luz = T01AF3_n11382Bros_luz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11382Bros_luz", A11382Bros_luz);
         A11383Bros_sudor = T01AF3_A11383Bros_sudor[0] ;
         n11383Bros_sudor = T01AF3_n11383Bros_sudor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11383Bros_sudor", A11383Bros_sudor);
         A11384Bros_cloro = T01AF3_A11384Bros_cloro[0] ;
         n11384Bros_cloro = T01AF3_n11384Bros_cloro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11384Bros_cloro", A11384Bros_cloro);
         A11385Bros_aguam = T01AF3_A11385Bros_aguam[0] ;
         n11385Bros_aguam = T01AF3_n11385Bros_aguam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11385Bros_aguam", A11385Bros_aguam);
         A11386Bros_termo = T01AF3_A11386Bros_termo[0] ;
         n11386Bros_termo = T01AF3_n11386Bros_termo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11386Bros_termo", A11386Bros_termo);
         A11387Bros_humed = T01AF3_A11387Bros_humed[0] ;
         n11387Bros_humed = T01AF3_n11387Bros_humed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11387Bros_humed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11387Bros_humed), 2, 0));
         A11407Bros_obs1 = T01AF3_A11407Bros_obs1[0] ;
         n11407Bros_obs1 = T01AF3_n11407Bros_obs1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11407Bros_obs1", A11407Bros_obs1);
         A11408Bros_obs2 = T01AF3_A11408Bros_obs2[0] ;
         n11408Bros_obs2 = T01AF3_n11408Bros_obs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11408Bros_obs2", A11408Bros_obs2);
         A11409Bros_obs3 = T01AF3_A11409Bros_obs3[0] ;
         n11409Bros_obs3 = T01AF3_n11409Bros_obs3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11409Bros_obs3", A11409Bros_obs3);
         A11410Bros_obs4 = T01AF3_A11410Bros_obs4[0] ;
         n11410Bros_obs4 = T01AF3_n11410Bros_obs4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11410Bros_obs4", A11410Bros_obs4);
         A11411Bros_obs5 = T01AF3_A11411Bros_obs5[0] ;
         n11411Bros_obs5 = T01AF3_n11411Bros_obs5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11411Bros_obs5", A11411Bros_obs5);
         A11412Bros_obs6 = T01AF3_A11412Bros_obs6[0] ;
         n11412Bros_obs6 = T01AF3_n11412Bros_obs6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11412Bros_obs6", A11412Bros_obs6);
         A11413Bros_obs7 = T01AF3_A11413Bros_obs7[0] ;
         n11413Bros_obs7 = T01AF3_n11413Bros_obs7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11413Bros_obs7", A11413Bros_obs7);
         A11414Bros_obs8 = T01AF3_A11414Bros_obs8[0] ;
         n11414Bros_obs8 = T01AF3_n11414Bros_obs8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11414Bros_obs8", A11414Bros_obs8);
         A11415Bros_obs9 = T01AF3_A11415Bros_obs9[0] ;
         n11415Bros_obs9 = T01AF3_n11415Bros_obs9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11415Bros_obs9", A11415Bros_obs9);
         A11416Bros_obs10 = T01AF3_A11416Bros_obs10[0] ;
         n11416Bros_obs10 = T01AF3_n11416Bros_obs10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11416Bros_obs10", A11416Bros_obs10);
         A11417Bros_obs11 = T01AF3_A11417Bros_obs11[0] ;
         n11417Bros_obs11 = T01AF3_n11417Bros_obs11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11417Bros_obs11", A11417Bros_obs11);
         A11703Bros_nc = T01AF3_A11703Bros_nc[0] ;
         n11703Bros_nc = T01AF3_n11703Bros_nc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11703Bros_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11703Bros_nc), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z10978Bros_Art = A10978Bros_Art ;
         sMode1467 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AF1467( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1467 = (short)(0) ;
            initializeNonKey1AF1467( ) ;
         }
         Gx_mode = sMode1467 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1467 = (short)(0) ;
         initializeNonKey1AF1467( ) ;
         sMode1467 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1467 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1AF1467( ) ;
      if ( RcdFound1467 == 0 )
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
      RcdFound1467 = (short)(0) ;
      /* Using cursor T01AF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01AF10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AF10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AF10_A10978Bros_Art[0], A10978Bros_Art) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01AF10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AF10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AF10_A10978Bros_Art[0], A10978Bros_Art) == 0 ) )
         {
            RcdFound1467 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1467 = (short)(0) ;
      /* Using cursor T01AF11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01AF11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AF11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AF11_A10978Bros_Art[0], A10978Bros_Art) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01AF11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AF11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AF11_A10978Bros_Art[0], A10978Bros_Art) == 0 ) )
         {
            RcdFound1467 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AF1467( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBros_Mcot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AF1467( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1467 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A10978Bros_Art, Z10978Bros_Art) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBros_Mcot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1AF1467( ) ;
               GX_FocusControl = edtBros_Mcot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A10978Bros_Art, Z10978Bros_Art) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBros_Mcot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AF1467( ) ;
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
                  GX_FocusControl = edtBros_Mcot_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1AF1467( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A10978Bros_Art, Z10978Bros_Art) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBros_Mcot_Internalname ;
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
      getKey1AF1467( ) ;
      if ( RcdFound1467 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A10978Bros_Art, Z10978Bros_Art) != 0 ) )
         {
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A10978Bros_Art, Z10978Bros_Art) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tartbrs");
      GX_FocusControl = edtBros_Mcot_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1AF0( ) ;
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
      if ( RcdFound1467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBros_Mcot_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AF1467( ) ;
      if ( RcdFound1467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBros_Mcot_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AF1467( ) ;
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
      if ( RcdFound1467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBros_Mcot_Internalname ;
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
      if ( RcdFound1467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBros_Mcot_Internalname ;
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
      scanStart1AF1467( ) ;
      if ( RcdFound1467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1467 != 0 )
         {
            scanNext1AF1467( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBros_Mcot_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AF1467( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AF1467( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTBRS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10979Bros_Mcot, T01AF2_A10979Bros_Mcot[0]) != 0 ) || ( GXutil.strcmp(Z10980Bros_Pd, T01AF2_A10980Bros_Pd[0]) != 0 ) || ( GXutil.strcmp(Z10981Bros_Pp, T01AF2_A10981Bros_Pp[0]) != 0 ) || ( GXutil.strcmp(Z10982Bros_Ag, T01AF2_A10982Bros_Ag[0]) != 0 ) || ( GXutil.strcmp(Z10983Bros_c1, T01AF2_A10983Bros_c1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10984Bros_c2, T01AF2_A10984Bros_c2[0]) != 0 ) || ( GXutil.strcmp(Z10985Bros_bo, T01AF2_A10985Bros_bo[0]) != 0 ) || ( GXutil.strcmp(Z10986Bros_bob, T01AF2_A10986Bros_bob[0]) != 0 ) || ( GXutil.strcmp(Z10987Bros_boe, T01AF2_A10987Bros_boe[0]) != 0 ) || ( GXutil.strcmp(Z10988BrosBov, T01AF2_A10988BrosBov[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10989Bros_c3, T01AF2_A10989Bros_c3[0]) != 0 ) || ( GXutil.strcmp(Z10990Bros_tns, T01AF2_A10990Bros_tns[0]) != 0 ) || ( GXutil.strcmp(Z10991Bros_tnc, T01AF2_A10991Bros_tnc[0]) != 0 ) || ( GXutil.strcmp(Z10992Bros_c4, T01AF2_A10992Bros_c4[0]) != 0 ) || ( GXutil.strcmp(Z10993Bros_ct, T01AF2_A10993Bros_ct[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10994Bros_c5, T01AF2_A10994Bros_c5[0]) != 0 ) || ( GXutil.strcmp(Z10995Bros_scs, T01AF2_A10995Bros_scs[0]) != 0 ) || ( GXutil.strcmp(Z10996Bros_scc, T01AF2_A10996Bros_scc[0]) != 0 ) || ( GXutil.strcmp(Z10997Bros_c6, T01AF2_A10997Bros_c6[0]) != 0 ) || ( GXutil.strcmp(Z10998Bros_cctse, T01AF2_A10998Bros_cctse[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10999Bros_ccttp, T01AF2_A10999Bros_ccttp[0]) != 0 ) || ( GXutil.strcmp(Z11000Bros_cctet, T01AF2_A11000Bros_cctet[0]) != 0 ) || ( Z11001Bros_ccp != T01AF2_A11001Bros_ccp[0] ) || ( Z11002Bros_cct != T01AF2_A11002Bros_cct[0] ) || ( GXutil.strcmp(Z11003Bros_ccpc, T01AF2_A11003Bros_ccpc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11004Bros_cctq, T01AF2_A11004Bros_cctq[0]) != 0 ) || ( GXutil.strcmp(Z11005Bros_cccc, T01AF2_A11005Bros_cccc[0]) != 0 ) || ( GXutil.strcmp(Z11006Bros_ccec, T01AF2_A11006Bros_ccec[0]) != 0 ) || ( GXutil.strcmp(Z11008Bros_ccmc1, T01AF2_A11008Bros_ccmc1[0]) != 0 ) || ( GXutil.strcmp(Z11009Bros_ccmc2, T01AF2_A11009Bros_ccmc2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11010Bros_ccmc3, T01AF2_A11010Bros_ccmc3[0]) != 0 ) || ( GXutil.strcmp(Z11011Bros_ccmc4, T01AF2_A11011Bros_ccmc4[0]) != 0 ) || ( GXutil.strcmp(Z11012Bros_ccmc5, T01AF2_A11012Bros_ccmc5[0]) != 0 ) || ( GXutil.strcmp(Z11013Bros_ccmc6, T01AF2_A11013Bros_ccmc6[0]) != 0 ) || ( GXutil.strcmp(Z11014Bros_c7, T01AF2_A11014Bros_c7[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11015Bros_rb, T01AF2_A11015Bros_rb[0]) != 0 ) || ( GXutil.strcmp(Z11016Bros_rbi, T01AF2_A11016Bros_rbi[0]) != 0 ) || ( GXutil.strcmp(Z11017Bros_rbe, T01AF2_A11017Bros_rbe[0]) != 0 ) || ( GXutil.strcmp(Z11018Bros_rbp, T01AF2_A11018Bros_rbp[0]) != 0 ) || ( Z11019Bros_rboc != T01AF2_A11019Bros_rboc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11020Bros_rb1, T01AF2_A11020Bros_rb1[0]) != 0 ) || ( GXutil.strcmp(Z11021Bros_rb3, T01AF2_A11021Bros_rb3[0]) != 0 ) || ( GXutil.strcmp(Z11022Bros_c8, T01AF2_A11022Bros_c8[0]) != 0 ) || ( GXutil.strcmp(Z11023Bros_ep1, T01AF2_A11023Bros_ep1[0]) != 0 ) || ( GXutil.strcmp(Z11024Bros_ep2, T01AF2_A11024Bros_ep2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11025Bros_ep3, T01AF2_A11025Bros_ep3[0]) != 0 ) || ( GXutil.strcmp(Z11026Bros_ep4, T01AF2_A11026Bros_ep4[0]) != 0 ) || ( GXutil.strcmp(Z11027Bros_ep5, T01AF2_A11027Bros_ep5[0]) != 0 ) || ( GXutil.strcmp(Z11028Bros_ep6, T01AF2_A11028Bros_ep6[0]) != 0 ) || ( GXutil.strcmp(Z11029Bros_ep7, T01AF2_A11029Bros_ep7[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11030Bros_ep8, T01AF2_A11030Bros_ep8[0]) != 0 ) || ( GXutil.strcmp(Z11031Bros_ep9, T01AF2_A11031Bros_ep9[0]) != 0 ) || ( GXutil.strcmp(Z11032Bros_ep10, T01AF2_A11032Bros_ep10[0]) != 0 ) || ( GXutil.strcmp(Z11033Bros_c9, T01AF2_A11033Bros_c9[0]) != 0 ) || ( GXutil.strcmp(Z11034Bros_sa1, T01AF2_A11034Bros_sa1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11035Bros_sa2, T01AF2_A11035Bros_sa2[0]) != 0 ) || ( GXutil.strcmp(Z11036Bros_sa3, T01AF2_A11036Bros_sa3[0]) != 0 ) || ( GXutil.strcmp(Z11037Bros_sa4, T01AF2_A11037Bros_sa4[0]) != 0 ) || ( GXutil.strcmp(Z11038Bros_sa5, T01AF2_A11038Bros_sa5[0]) != 0 ) || ( GXutil.strcmp(Z11039Bros_sa6, T01AF2_A11039Bros_sa6[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11040Bros_c10, T01AF2_A11040Bros_c10[0]) != 0 ) || ( GXutil.strcmp(Z11066Bros_stk, T01AF2_A11066Bros_stk[0]) != 0 ) || ( GXutil.strcmp(Z11067Bros_Lbta, T01AF2_A11067Bros_Lbta[0]) != 0 ) || ( Z11068Bros_Lbtp != T01AF2_A11068Bros_Lbtp[0] ) || ( GXutil.strcmp(Z11069Bros_c11, T01AF2_A11069Bros_c11[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11070Bros_c12, T01AF2_A11070Bros_c12[0]) != 0 ) || ( GXutil.strcmp(Z11369Bros_imp1, T01AF2_A11369Bros_imp1[0]) != 0 ) || ( GXutil.strcmp(Z11370Bros_imp2, T01AF2_A11370Bros_imp2[0]) != 0 ) || ( GXutil.strcmp(Z11371Bros_imp3, T01AF2_A11371Bros_imp3[0]) != 0 ) || ( GXutil.strcmp(Z11372Bros_imp4, T01AF2_A11372Bros_imp4[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11373Bros_imp5, T01AF2_A11373Bros_imp5[0]) != 0 ) || ( GXutil.strcmp(Z11374Bros_imp6, T01AF2_A11374Bros_imp6[0]) != 0 ) || ( GXutil.strcmp(Z11375Bros_imp7, T01AF2_A11375Bros_imp7[0]) != 0 ) || ( GXutil.strcmp(Z11376Bros_imp8, T01AF2_A11376Bros_imp8[0]) != 0 ) || ( GXutil.strcmp(Z11377Bros_imp9, T01AF2_A11377Bros_imp9[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11378Bros_imp10, T01AF2_A11378Bros_imp10[0]) != 0 ) || ( GXutil.strcmp(Z11379Bros_imp11, T01AF2_A11379Bros_imp11[0]) != 0 ) || ( GXutil.strcmp(Z11380Bros_oekot, T01AF2_A11380Bros_oekot[0]) != 0 ) || ( GXutil.strcmp(Z11381Bros_lavad, T01AF2_A11381Bros_lavad[0]) != 0 ) || ( GXutil.strcmp(Z11382Bros_luz, T01AF2_A11382Bros_luz[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11383Bros_sudor, T01AF2_A11383Bros_sudor[0]) != 0 ) || ( GXutil.strcmp(Z11384Bros_cloro, T01AF2_A11384Bros_cloro[0]) != 0 ) || ( GXutil.strcmp(Z11385Bros_aguam, T01AF2_A11385Bros_aguam[0]) != 0 ) || ( GXutil.strcmp(Z11386Bros_termo, T01AF2_A11386Bros_termo[0]) != 0 ) || ( Z11387Bros_humed != T01AF2_A11387Bros_humed[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11407Bros_obs1, T01AF2_A11407Bros_obs1[0]) != 0 ) || ( GXutil.strcmp(Z11408Bros_obs2, T01AF2_A11408Bros_obs2[0]) != 0 ) || ( GXutil.strcmp(Z11409Bros_obs3, T01AF2_A11409Bros_obs3[0]) != 0 ) || ( GXutil.strcmp(Z11410Bros_obs4, T01AF2_A11410Bros_obs4[0]) != 0 ) || ( GXutil.strcmp(Z11411Bros_obs5, T01AF2_A11411Bros_obs5[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11412Bros_obs6, T01AF2_A11412Bros_obs6[0]) != 0 ) || ( GXutil.strcmp(Z11413Bros_obs7, T01AF2_A11413Bros_obs7[0]) != 0 ) || ( GXutil.strcmp(Z11414Bros_obs8, T01AF2_A11414Bros_obs8[0]) != 0 ) || ( GXutil.strcmp(Z11415Bros_obs9, T01AF2_A11415Bros_obs9[0]) != 0 ) || ( GXutil.strcmp(Z11416Bros_obs10, T01AF2_A11416Bros_obs10[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11417Bros_obs11, T01AF2_A11417Bros_obs11[0]) != 0 ) || ( Z11703Bros_nc != T01AF2_A11703Bros_nc[0] ) || ( DecimalUtil.compareTo(Z11704Bros_enc, T01AF2_A11704Bros_enc[0]) != 0 ) || ( Z840TrnCod != T01AF2_A840TrnCod[0] ) )
         {
            if ( GXutil.strcmp(Z10979Bros_Mcot, T01AF2_A10979Bros_Mcot[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_Mcot");
               GXutil.writeLogRaw("Old: ",Z10979Bros_Mcot);
               GXutil.writeLogRaw("Current: ",T01AF2_A10979Bros_Mcot[0]);
            }
            if ( GXutil.strcmp(Z10980Bros_Pd, T01AF2_A10980Bros_Pd[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_Pd");
               GXutil.writeLogRaw("Old: ",Z10980Bros_Pd);
               GXutil.writeLogRaw("Current: ",T01AF2_A10980Bros_Pd[0]);
            }
            if ( GXutil.strcmp(Z10981Bros_Pp, T01AF2_A10981Bros_Pp[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_Pp");
               GXutil.writeLogRaw("Old: ",Z10981Bros_Pp);
               GXutil.writeLogRaw("Current: ",T01AF2_A10981Bros_Pp[0]);
            }
            if ( GXutil.strcmp(Z10982Bros_Ag, T01AF2_A10982Bros_Ag[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_Ag");
               GXutil.writeLogRaw("Old: ",Z10982Bros_Ag);
               GXutil.writeLogRaw("Current: ",T01AF2_A10982Bros_Ag[0]);
            }
            if ( GXutil.strcmp(Z10983Bros_c1, T01AF2_A10983Bros_c1[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c1");
               GXutil.writeLogRaw("Old: ",Z10983Bros_c1);
               GXutil.writeLogRaw("Current: ",T01AF2_A10983Bros_c1[0]);
            }
            if ( GXutil.strcmp(Z10984Bros_c2, T01AF2_A10984Bros_c2[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c2");
               GXutil.writeLogRaw("Old: ",Z10984Bros_c2);
               GXutil.writeLogRaw("Current: ",T01AF2_A10984Bros_c2[0]);
            }
            if ( GXutil.strcmp(Z10985Bros_bo, T01AF2_A10985Bros_bo[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_bo");
               GXutil.writeLogRaw("Old: ",Z10985Bros_bo);
               GXutil.writeLogRaw("Current: ",T01AF2_A10985Bros_bo[0]);
            }
            if ( GXutil.strcmp(Z10986Bros_bob, T01AF2_A10986Bros_bob[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_bob");
               GXutil.writeLogRaw("Old: ",Z10986Bros_bob);
               GXutil.writeLogRaw("Current: ",T01AF2_A10986Bros_bob[0]);
            }
            if ( GXutil.strcmp(Z10987Bros_boe, T01AF2_A10987Bros_boe[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_boe");
               GXutil.writeLogRaw("Old: ",Z10987Bros_boe);
               GXutil.writeLogRaw("Current: ",T01AF2_A10987Bros_boe[0]);
            }
            if ( GXutil.strcmp(Z10988BrosBov, T01AF2_A10988BrosBov[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"BrosBov");
               GXutil.writeLogRaw("Old: ",Z10988BrosBov);
               GXutil.writeLogRaw("Current: ",T01AF2_A10988BrosBov[0]);
            }
            if ( GXutil.strcmp(Z10989Bros_c3, T01AF2_A10989Bros_c3[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c3");
               GXutil.writeLogRaw("Old: ",Z10989Bros_c3);
               GXutil.writeLogRaw("Current: ",T01AF2_A10989Bros_c3[0]);
            }
            if ( GXutil.strcmp(Z10990Bros_tns, T01AF2_A10990Bros_tns[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_tns");
               GXutil.writeLogRaw("Old: ",Z10990Bros_tns);
               GXutil.writeLogRaw("Current: ",T01AF2_A10990Bros_tns[0]);
            }
            if ( GXutil.strcmp(Z10991Bros_tnc, T01AF2_A10991Bros_tnc[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_tnc");
               GXutil.writeLogRaw("Old: ",Z10991Bros_tnc);
               GXutil.writeLogRaw("Current: ",T01AF2_A10991Bros_tnc[0]);
            }
            if ( GXutil.strcmp(Z10992Bros_c4, T01AF2_A10992Bros_c4[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c4");
               GXutil.writeLogRaw("Old: ",Z10992Bros_c4);
               GXutil.writeLogRaw("Current: ",T01AF2_A10992Bros_c4[0]);
            }
            if ( GXutil.strcmp(Z10993Bros_ct, T01AF2_A10993Bros_ct[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ct");
               GXutil.writeLogRaw("Old: ",Z10993Bros_ct);
               GXutil.writeLogRaw("Current: ",T01AF2_A10993Bros_ct[0]);
            }
            if ( GXutil.strcmp(Z10994Bros_c5, T01AF2_A10994Bros_c5[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c5");
               GXutil.writeLogRaw("Old: ",Z10994Bros_c5);
               GXutil.writeLogRaw("Current: ",T01AF2_A10994Bros_c5[0]);
            }
            if ( GXutil.strcmp(Z10995Bros_scs, T01AF2_A10995Bros_scs[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_scs");
               GXutil.writeLogRaw("Old: ",Z10995Bros_scs);
               GXutil.writeLogRaw("Current: ",T01AF2_A10995Bros_scs[0]);
            }
            if ( GXutil.strcmp(Z10996Bros_scc, T01AF2_A10996Bros_scc[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_scc");
               GXutil.writeLogRaw("Old: ",Z10996Bros_scc);
               GXutil.writeLogRaw("Current: ",T01AF2_A10996Bros_scc[0]);
            }
            if ( GXutil.strcmp(Z10997Bros_c6, T01AF2_A10997Bros_c6[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c6");
               GXutil.writeLogRaw("Old: ",Z10997Bros_c6);
               GXutil.writeLogRaw("Current: ",T01AF2_A10997Bros_c6[0]);
            }
            if ( GXutil.strcmp(Z10998Bros_cctse, T01AF2_A10998Bros_cctse[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_cctse");
               GXutil.writeLogRaw("Old: ",Z10998Bros_cctse);
               GXutil.writeLogRaw("Current: ",T01AF2_A10998Bros_cctse[0]);
            }
            if ( GXutil.strcmp(Z10999Bros_ccttp, T01AF2_A10999Bros_ccttp[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccttp");
               GXutil.writeLogRaw("Old: ",Z10999Bros_ccttp);
               GXutil.writeLogRaw("Current: ",T01AF2_A10999Bros_ccttp[0]);
            }
            if ( GXutil.strcmp(Z11000Bros_cctet, T01AF2_A11000Bros_cctet[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_cctet");
               GXutil.writeLogRaw("Old: ",Z11000Bros_cctet);
               GXutil.writeLogRaw("Current: ",T01AF2_A11000Bros_cctet[0]);
            }
            if ( Z11001Bros_ccp != T01AF2_A11001Bros_ccp[0] )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccp");
               GXutil.writeLogRaw("Old: ",Z11001Bros_ccp);
               GXutil.writeLogRaw("Current: ",T01AF2_A11001Bros_ccp[0]);
            }
            if ( Z11002Bros_cct != T01AF2_A11002Bros_cct[0] )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_cct");
               GXutil.writeLogRaw("Old: ",Z11002Bros_cct);
               GXutil.writeLogRaw("Current: ",T01AF2_A11002Bros_cct[0]);
            }
            if ( GXutil.strcmp(Z11003Bros_ccpc, T01AF2_A11003Bros_ccpc[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccpc");
               GXutil.writeLogRaw("Old: ",Z11003Bros_ccpc);
               GXutil.writeLogRaw("Current: ",T01AF2_A11003Bros_ccpc[0]);
            }
            if ( GXutil.strcmp(Z11004Bros_cctq, T01AF2_A11004Bros_cctq[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_cctq");
               GXutil.writeLogRaw("Old: ",Z11004Bros_cctq);
               GXutil.writeLogRaw("Current: ",T01AF2_A11004Bros_cctq[0]);
            }
            if ( GXutil.strcmp(Z11005Bros_cccc, T01AF2_A11005Bros_cccc[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_cccc");
               GXutil.writeLogRaw("Old: ",Z11005Bros_cccc);
               GXutil.writeLogRaw("Current: ",T01AF2_A11005Bros_cccc[0]);
            }
            if ( GXutil.strcmp(Z11006Bros_ccec, T01AF2_A11006Bros_ccec[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccec");
               GXutil.writeLogRaw("Old: ",Z11006Bros_ccec);
               GXutil.writeLogRaw("Current: ",T01AF2_A11006Bros_ccec[0]);
            }
            if ( GXutil.strcmp(Z11008Bros_ccmc1, T01AF2_A11008Bros_ccmc1[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccmc1");
               GXutil.writeLogRaw("Old: ",Z11008Bros_ccmc1);
               GXutil.writeLogRaw("Current: ",T01AF2_A11008Bros_ccmc1[0]);
            }
            if ( GXutil.strcmp(Z11009Bros_ccmc2, T01AF2_A11009Bros_ccmc2[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccmc2");
               GXutil.writeLogRaw("Old: ",Z11009Bros_ccmc2);
               GXutil.writeLogRaw("Current: ",T01AF2_A11009Bros_ccmc2[0]);
            }
            if ( GXutil.strcmp(Z11010Bros_ccmc3, T01AF2_A11010Bros_ccmc3[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccmc3");
               GXutil.writeLogRaw("Old: ",Z11010Bros_ccmc3);
               GXutil.writeLogRaw("Current: ",T01AF2_A11010Bros_ccmc3[0]);
            }
            if ( GXutil.strcmp(Z11011Bros_ccmc4, T01AF2_A11011Bros_ccmc4[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccmc4");
               GXutil.writeLogRaw("Old: ",Z11011Bros_ccmc4);
               GXutil.writeLogRaw("Current: ",T01AF2_A11011Bros_ccmc4[0]);
            }
            if ( GXutil.strcmp(Z11012Bros_ccmc5, T01AF2_A11012Bros_ccmc5[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccmc5");
               GXutil.writeLogRaw("Old: ",Z11012Bros_ccmc5);
               GXutil.writeLogRaw("Current: ",T01AF2_A11012Bros_ccmc5[0]);
            }
            if ( GXutil.strcmp(Z11013Bros_ccmc6, T01AF2_A11013Bros_ccmc6[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ccmc6");
               GXutil.writeLogRaw("Old: ",Z11013Bros_ccmc6);
               GXutil.writeLogRaw("Current: ",T01AF2_A11013Bros_ccmc6[0]);
            }
            if ( GXutil.strcmp(Z11014Bros_c7, T01AF2_A11014Bros_c7[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c7");
               GXutil.writeLogRaw("Old: ",Z11014Bros_c7);
               GXutil.writeLogRaw("Current: ",T01AF2_A11014Bros_c7[0]);
            }
            if ( GXutil.strcmp(Z11015Bros_rb, T01AF2_A11015Bros_rb[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_rb");
               GXutil.writeLogRaw("Old: ",Z11015Bros_rb);
               GXutil.writeLogRaw("Current: ",T01AF2_A11015Bros_rb[0]);
            }
            if ( GXutil.strcmp(Z11016Bros_rbi, T01AF2_A11016Bros_rbi[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_rbi");
               GXutil.writeLogRaw("Old: ",Z11016Bros_rbi);
               GXutil.writeLogRaw("Current: ",T01AF2_A11016Bros_rbi[0]);
            }
            if ( GXutil.strcmp(Z11017Bros_rbe, T01AF2_A11017Bros_rbe[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_rbe");
               GXutil.writeLogRaw("Old: ",Z11017Bros_rbe);
               GXutil.writeLogRaw("Current: ",T01AF2_A11017Bros_rbe[0]);
            }
            if ( GXutil.strcmp(Z11018Bros_rbp, T01AF2_A11018Bros_rbp[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_rbp");
               GXutil.writeLogRaw("Old: ",Z11018Bros_rbp);
               GXutil.writeLogRaw("Current: ",T01AF2_A11018Bros_rbp[0]);
            }
            if ( Z11019Bros_rboc != T01AF2_A11019Bros_rboc[0] )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_rboc");
               GXutil.writeLogRaw("Old: ",Z11019Bros_rboc);
               GXutil.writeLogRaw("Current: ",T01AF2_A11019Bros_rboc[0]);
            }
            if ( GXutil.strcmp(Z11020Bros_rb1, T01AF2_A11020Bros_rb1[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_rb1");
               GXutil.writeLogRaw("Old: ",Z11020Bros_rb1);
               GXutil.writeLogRaw("Current: ",T01AF2_A11020Bros_rb1[0]);
            }
            if ( GXutil.strcmp(Z11021Bros_rb3, T01AF2_A11021Bros_rb3[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_rb3");
               GXutil.writeLogRaw("Old: ",Z11021Bros_rb3);
               GXutil.writeLogRaw("Current: ",T01AF2_A11021Bros_rb3[0]);
            }
            if ( GXutil.strcmp(Z11022Bros_c8, T01AF2_A11022Bros_c8[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c8");
               GXutil.writeLogRaw("Old: ",Z11022Bros_c8);
               GXutil.writeLogRaw("Current: ",T01AF2_A11022Bros_c8[0]);
            }
            if ( GXutil.strcmp(Z11023Bros_ep1, T01AF2_A11023Bros_ep1[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep1");
               GXutil.writeLogRaw("Old: ",Z11023Bros_ep1);
               GXutil.writeLogRaw("Current: ",T01AF2_A11023Bros_ep1[0]);
            }
            if ( GXutil.strcmp(Z11024Bros_ep2, T01AF2_A11024Bros_ep2[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep2");
               GXutil.writeLogRaw("Old: ",Z11024Bros_ep2);
               GXutil.writeLogRaw("Current: ",T01AF2_A11024Bros_ep2[0]);
            }
            if ( GXutil.strcmp(Z11025Bros_ep3, T01AF2_A11025Bros_ep3[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep3");
               GXutil.writeLogRaw("Old: ",Z11025Bros_ep3);
               GXutil.writeLogRaw("Current: ",T01AF2_A11025Bros_ep3[0]);
            }
            if ( GXutil.strcmp(Z11026Bros_ep4, T01AF2_A11026Bros_ep4[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep4");
               GXutil.writeLogRaw("Old: ",Z11026Bros_ep4);
               GXutil.writeLogRaw("Current: ",T01AF2_A11026Bros_ep4[0]);
            }
            if ( GXutil.strcmp(Z11027Bros_ep5, T01AF2_A11027Bros_ep5[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep5");
               GXutil.writeLogRaw("Old: ",Z11027Bros_ep5);
               GXutil.writeLogRaw("Current: ",T01AF2_A11027Bros_ep5[0]);
            }
            if ( GXutil.strcmp(Z11028Bros_ep6, T01AF2_A11028Bros_ep6[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep6");
               GXutil.writeLogRaw("Old: ",Z11028Bros_ep6);
               GXutil.writeLogRaw("Current: ",T01AF2_A11028Bros_ep6[0]);
            }
            if ( GXutil.strcmp(Z11029Bros_ep7, T01AF2_A11029Bros_ep7[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep7");
               GXutil.writeLogRaw("Old: ",Z11029Bros_ep7);
               GXutil.writeLogRaw("Current: ",T01AF2_A11029Bros_ep7[0]);
            }
            if ( GXutil.strcmp(Z11030Bros_ep8, T01AF2_A11030Bros_ep8[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep8");
               GXutil.writeLogRaw("Old: ",Z11030Bros_ep8);
               GXutil.writeLogRaw("Current: ",T01AF2_A11030Bros_ep8[0]);
            }
            if ( GXutil.strcmp(Z11031Bros_ep9, T01AF2_A11031Bros_ep9[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep9");
               GXutil.writeLogRaw("Old: ",Z11031Bros_ep9);
               GXutil.writeLogRaw("Current: ",T01AF2_A11031Bros_ep9[0]);
            }
            if ( GXutil.strcmp(Z11032Bros_ep10, T01AF2_A11032Bros_ep10[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_ep10");
               GXutil.writeLogRaw("Old: ",Z11032Bros_ep10);
               GXutil.writeLogRaw("Current: ",T01AF2_A11032Bros_ep10[0]);
            }
            if ( GXutil.strcmp(Z11033Bros_c9, T01AF2_A11033Bros_c9[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c9");
               GXutil.writeLogRaw("Old: ",Z11033Bros_c9);
               GXutil.writeLogRaw("Current: ",T01AF2_A11033Bros_c9[0]);
            }
            if ( GXutil.strcmp(Z11034Bros_sa1, T01AF2_A11034Bros_sa1[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_sa1");
               GXutil.writeLogRaw("Old: ",Z11034Bros_sa1);
               GXutil.writeLogRaw("Current: ",T01AF2_A11034Bros_sa1[0]);
            }
            if ( GXutil.strcmp(Z11035Bros_sa2, T01AF2_A11035Bros_sa2[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_sa2");
               GXutil.writeLogRaw("Old: ",Z11035Bros_sa2);
               GXutil.writeLogRaw("Current: ",T01AF2_A11035Bros_sa2[0]);
            }
            if ( GXutil.strcmp(Z11036Bros_sa3, T01AF2_A11036Bros_sa3[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_sa3");
               GXutil.writeLogRaw("Old: ",Z11036Bros_sa3);
               GXutil.writeLogRaw("Current: ",T01AF2_A11036Bros_sa3[0]);
            }
            if ( GXutil.strcmp(Z11037Bros_sa4, T01AF2_A11037Bros_sa4[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_sa4");
               GXutil.writeLogRaw("Old: ",Z11037Bros_sa4);
               GXutil.writeLogRaw("Current: ",T01AF2_A11037Bros_sa4[0]);
            }
            if ( GXutil.strcmp(Z11038Bros_sa5, T01AF2_A11038Bros_sa5[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_sa5");
               GXutil.writeLogRaw("Old: ",Z11038Bros_sa5);
               GXutil.writeLogRaw("Current: ",T01AF2_A11038Bros_sa5[0]);
            }
            if ( GXutil.strcmp(Z11039Bros_sa6, T01AF2_A11039Bros_sa6[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_sa6");
               GXutil.writeLogRaw("Old: ",Z11039Bros_sa6);
               GXutil.writeLogRaw("Current: ",T01AF2_A11039Bros_sa6[0]);
            }
            if ( GXutil.strcmp(Z11040Bros_c10, T01AF2_A11040Bros_c10[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c10");
               GXutil.writeLogRaw("Old: ",Z11040Bros_c10);
               GXutil.writeLogRaw("Current: ",T01AF2_A11040Bros_c10[0]);
            }
            if ( GXutil.strcmp(Z11066Bros_stk, T01AF2_A11066Bros_stk[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_stk");
               GXutil.writeLogRaw("Old: ",Z11066Bros_stk);
               GXutil.writeLogRaw("Current: ",T01AF2_A11066Bros_stk[0]);
            }
            if ( GXutil.strcmp(Z11067Bros_Lbta, T01AF2_A11067Bros_Lbta[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_Lbta");
               GXutil.writeLogRaw("Old: ",Z11067Bros_Lbta);
               GXutil.writeLogRaw("Current: ",T01AF2_A11067Bros_Lbta[0]);
            }
            if ( Z11068Bros_Lbtp != T01AF2_A11068Bros_Lbtp[0] )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_Lbtp");
               GXutil.writeLogRaw("Old: ",Z11068Bros_Lbtp);
               GXutil.writeLogRaw("Current: ",T01AF2_A11068Bros_Lbtp[0]);
            }
            if ( GXutil.strcmp(Z11069Bros_c11, T01AF2_A11069Bros_c11[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c11");
               GXutil.writeLogRaw("Old: ",Z11069Bros_c11);
               GXutil.writeLogRaw("Current: ",T01AF2_A11069Bros_c11[0]);
            }
            if ( GXutil.strcmp(Z11070Bros_c12, T01AF2_A11070Bros_c12[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_c12");
               GXutil.writeLogRaw("Old: ",Z11070Bros_c12);
               GXutil.writeLogRaw("Current: ",T01AF2_A11070Bros_c12[0]);
            }
            if ( GXutil.strcmp(Z11369Bros_imp1, T01AF2_A11369Bros_imp1[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp1");
               GXutil.writeLogRaw("Old: ",Z11369Bros_imp1);
               GXutil.writeLogRaw("Current: ",T01AF2_A11369Bros_imp1[0]);
            }
            if ( GXutil.strcmp(Z11370Bros_imp2, T01AF2_A11370Bros_imp2[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp2");
               GXutil.writeLogRaw("Old: ",Z11370Bros_imp2);
               GXutil.writeLogRaw("Current: ",T01AF2_A11370Bros_imp2[0]);
            }
            if ( GXutil.strcmp(Z11371Bros_imp3, T01AF2_A11371Bros_imp3[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp3");
               GXutil.writeLogRaw("Old: ",Z11371Bros_imp3);
               GXutil.writeLogRaw("Current: ",T01AF2_A11371Bros_imp3[0]);
            }
            if ( GXutil.strcmp(Z11372Bros_imp4, T01AF2_A11372Bros_imp4[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp4");
               GXutil.writeLogRaw("Old: ",Z11372Bros_imp4);
               GXutil.writeLogRaw("Current: ",T01AF2_A11372Bros_imp4[0]);
            }
            if ( GXutil.strcmp(Z11373Bros_imp5, T01AF2_A11373Bros_imp5[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp5");
               GXutil.writeLogRaw("Old: ",Z11373Bros_imp5);
               GXutil.writeLogRaw("Current: ",T01AF2_A11373Bros_imp5[0]);
            }
            if ( GXutil.strcmp(Z11374Bros_imp6, T01AF2_A11374Bros_imp6[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp6");
               GXutil.writeLogRaw("Old: ",Z11374Bros_imp6);
               GXutil.writeLogRaw("Current: ",T01AF2_A11374Bros_imp6[0]);
            }
            if ( GXutil.strcmp(Z11375Bros_imp7, T01AF2_A11375Bros_imp7[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp7");
               GXutil.writeLogRaw("Old: ",Z11375Bros_imp7);
               GXutil.writeLogRaw("Current: ",T01AF2_A11375Bros_imp7[0]);
            }
            if ( GXutil.strcmp(Z11376Bros_imp8, T01AF2_A11376Bros_imp8[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp8");
               GXutil.writeLogRaw("Old: ",Z11376Bros_imp8);
               GXutil.writeLogRaw("Current: ",T01AF2_A11376Bros_imp8[0]);
            }
            if ( GXutil.strcmp(Z11377Bros_imp9, T01AF2_A11377Bros_imp9[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp9");
               GXutil.writeLogRaw("Old: ",Z11377Bros_imp9);
               GXutil.writeLogRaw("Current: ",T01AF2_A11377Bros_imp9[0]);
            }
            if ( GXutil.strcmp(Z11378Bros_imp10, T01AF2_A11378Bros_imp10[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp10");
               GXutil.writeLogRaw("Old: ",Z11378Bros_imp10);
               GXutil.writeLogRaw("Current: ",T01AF2_A11378Bros_imp10[0]);
            }
            if ( GXutil.strcmp(Z11379Bros_imp11, T01AF2_A11379Bros_imp11[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_imp11");
               GXutil.writeLogRaw("Old: ",Z11379Bros_imp11);
               GXutil.writeLogRaw("Current: ",T01AF2_A11379Bros_imp11[0]);
            }
            if ( GXutil.strcmp(Z11380Bros_oekot, T01AF2_A11380Bros_oekot[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_oekot");
               GXutil.writeLogRaw("Old: ",Z11380Bros_oekot);
               GXutil.writeLogRaw("Current: ",T01AF2_A11380Bros_oekot[0]);
            }
            if ( GXutil.strcmp(Z11381Bros_lavad, T01AF2_A11381Bros_lavad[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_lavad");
               GXutil.writeLogRaw("Old: ",Z11381Bros_lavad);
               GXutil.writeLogRaw("Current: ",T01AF2_A11381Bros_lavad[0]);
            }
            if ( GXutil.strcmp(Z11382Bros_luz, T01AF2_A11382Bros_luz[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_luz");
               GXutil.writeLogRaw("Old: ",Z11382Bros_luz);
               GXutil.writeLogRaw("Current: ",T01AF2_A11382Bros_luz[0]);
            }
            if ( GXutil.strcmp(Z11383Bros_sudor, T01AF2_A11383Bros_sudor[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_sudor");
               GXutil.writeLogRaw("Old: ",Z11383Bros_sudor);
               GXutil.writeLogRaw("Current: ",T01AF2_A11383Bros_sudor[0]);
            }
            if ( GXutil.strcmp(Z11384Bros_cloro, T01AF2_A11384Bros_cloro[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_cloro");
               GXutil.writeLogRaw("Old: ",Z11384Bros_cloro);
               GXutil.writeLogRaw("Current: ",T01AF2_A11384Bros_cloro[0]);
            }
            if ( GXutil.strcmp(Z11385Bros_aguam, T01AF2_A11385Bros_aguam[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_aguam");
               GXutil.writeLogRaw("Old: ",Z11385Bros_aguam);
               GXutil.writeLogRaw("Current: ",T01AF2_A11385Bros_aguam[0]);
            }
            if ( GXutil.strcmp(Z11386Bros_termo, T01AF2_A11386Bros_termo[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_termo");
               GXutil.writeLogRaw("Old: ",Z11386Bros_termo);
               GXutil.writeLogRaw("Current: ",T01AF2_A11386Bros_termo[0]);
            }
            if ( Z11387Bros_humed != T01AF2_A11387Bros_humed[0] )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_humed");
               GXutil.writeLogRaw("Old: ",Z11387Bros_humed);
               GXutil.writeLogRaw("Current: ",T01AF2_A11387Bros_humed[0]);
            }
            if ( GXutil.strcmp(Z11407Bros_obs1, T01AF2_A11407Bros_obs1[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs1");
               GXutil.writeLogRaw("Old: ",Z11407Bros_obs1);
               GXutil.writeLogRaw("Current: ",T01AF2_A11407Bros_obs1[0]);
            }
            if ( GXutil.strcmp(Z11408Bros_obs2, T01AF2_A11408Bros_obs2[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs2");
               GXutil.writeLogRaw("Old: ",Z11408Bros_obs2);
               GXutil.writeLogRaw("Current: ",T01AF2_A11408Bros_obs2[0]);
            }
            if ( GXutil.strcmp(Z11409Bros_obs3, T01AF2_A11409Bros_obs3[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs3");
               GXutil.writeLogRaw("Old: ",Z11409Bros_obs3);
               GXutil.writeLogRaw("Current: ",T01AF2_A11409Bros_obs3[0]);
            }
            if ( GXutil.strcmp(Z11410Bros_obs4, T01AF2_A11410Bros_obs4[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs4");
               GXutil.writeLogRaw("Old: ",Z11410Bros_obs4);
               GXutil.writeLogRaw("Current: ",T01AF2_A11410Bros_obs4[0]);
            }
            if ( GXutil.strcmp(Z11411Bros_obs5, T01AF2_A11411Bros_obs5[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs5");
               GXutil.writeLogRaw("Old: ",Z11411Bros_obs5);
               GXutil.writeLogRaw("Current: ",T01AF2_A11411Bros_obs5[0]);
            }
            if ( GXutil.strcmp(Z11412Bros_obs6, T01AF2_A11412Bros_obs6[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs6");
               GXutil.writeLogRaw("Old: ",Z11412Bros_obs6);
               GXutil.writeLogRaw("Current: ",T01AF2_A11412Bros_obs6[0]);
            }
            if ( GXutil.strcmp(Z11413Bros_obs7, T01AF2_A11413Bros_obs7[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs7");
               GXutil.writeLogRaw("Old: ",Z11413Bros_obs7);
               GXutil.writeLogRaw("Current: ",T01AF2_A11413Bros_obs7[0]);
            }
            if ( GXutil.strcmp(Z11414Bros_obs8, T01AF2_A11414Bros_obs8[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs8");
               GXutil.writeLogRaw("Old: ",Z11414Bros_obs8);
               GXutil.writeLogRaw("Current: ",T01AF2_A11414Bros_obs8[0]);
            }
            if ( GXutil.strcmp(Z11415Bros_obs9, T01AF2_A11415Bros_obs9[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs9");
               GXutil.writeLogRaw("Old: ",Z11415Bros_obs9);
               GXutil.writeLogRaw("Current: ",T01AF2_A11415Bros_obs9[0]);
            }
            if ( GXutil.strcmp(Z11416Bros_obs10, T01AF2_A11416Bros_obs10[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs10");
               GXutil.writeLogRaw("Old: ",Z11416Bros_obs10);
               GXutil.writeLogRaw("Current: ",T01AF2_A11416Bros_obs10[0]);
            }
            if ( GXutil.strcmp(Z11417Bros_obs11, T01AF2_A11417Bros_obs11[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_obs11");
               GXutil.writeLogRaw("Old: ",Z11417Bros_obs11);
               GXutil.writeLogRaw("Current: ",T01AF2_A11417Bros_obs11[0]);
            }
            if ( Z11703Bros_nc != T01AF2_A11703Bros_nc[0] )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_nc");
               GXutil.writeLogRaw("Old: ",Z11703Bros_nc);
               GXutil.writeLogRaw("Current: ",T01AF2_A11703Bros_nc[0]);
            }
            if ( DecimalUtil.compareTo(Z11704Bros_enc, T01AF2_A11704Bros_enc[0]) != 0 )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"Bros_enc");
               GXutil.writeLogRaw("Old: ",Z11704Bros_enc);
               GXutil.writeLogRaw("Current: ",T01AF2_A11704Bros_enc[0]);
            }
            if ( Z840TrnCod != T01AF2_A840TrnCod[0] )
            {
               GXutil.writeLogln("tartbrs:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01AF2_A840TrnCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTBRS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AF1467( )
   {
      beforeValidate1AF1467( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AF1467( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AF1467( 0) ;
         checkOptimisticConcurrency1AF1467( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AF1467( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AF1467( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AF12 */
                  pr_default.execute(10, new Object[] {A10978Bros_Art, Boolean.valueOf(n10979Bros_Mcot), A10979Bros_Mcot, Boolean.valueOf(n10980Bros_Pd), A10980Bros_Pd, Boolean.valueOf(n10981Bros_Pp), A10981Bros_Pp, Boolean.valueOf(n10982Bros_Ag), A10982Bros_Ag, Boolean.valueOf(n10983Bros_c1), A10983Bros_c1, Boolean.valueOf(n10984Bros_c2), A10984Bros_c2, Boolean.valueOf(n10985Bros_bo), A10985Bros_bo, Boolean.valueOf(n10986Bros_bob), A10986Bros_bob, Boolean.valueOf(n10987Bros_boe), A10987Bros_boe, Boolean.valueOf(n10988BrosBov), A10988BrosBov, Boolean.valueOf(n10989Bros_c3), A10989Bros_c3, Boolean.valueOf(n10990Bros_tns), A10990Bros_tns, Boolean.valueOf(n10991Bros_tnc), A10991Bros_tnc, Boolean.valueOf(n10992Bros_c4), A10992Bros_c4, Boolean.valueOf(n10993Bros_ct), A10993Bros_ct, Boolean.valueOf(n10994Bros_c5), A10994Bros_c5, Boolean.valueOf(n10995Bros_scs), A10995Bros_scs, Boolean.valueOf(n10996Bros_scc), A10996Bros_scc, Boolean.valueOf(n10997Bros_c6), A10997Bros_c6, Boolean.valueOf(n10998Bros_cctse), A10998Bros_cctse, Boolean.valueOf(n10999Bros_ccttp), A10999Bros_ccttp, Boolean.valueOf(n11000Bros_cctet), A11000Bros_cctet, Boolean.valueOf(n11001Bros_ccp), Byte.valueOf(A11001Bros_ccp), Boolean.valueOf(n11002Bros_cct), Byte.valueOf(A11002Bros_cct), Boolean.valueOf(n11003Bros_ccpc), A11003Bros_ccpc, Boolean.valueOf(n11004Bros_cctq), A11004Bros_cctq, Boolean.valueOf(n11005Bros_cccc), A11005Bros_cccc, Boolean.valueOf(n11006Bros_ccec), A11006Bros_ccec, Boolean.valueOf(n11008Bros_ccmc1), A11008Bros_ccmc1, Boolean.valueOf(n11009Bros_ccmc2), A11009Bros_ccmc2, Boolean.valueOf(n11010Bros_ccmc3), A11010Bros_ccmc3, Boolean.valueOf(n11011Bros_ccmc4), A11011Bros_ccmc4, Boolean.valueOf(n11012Bros_ccmc5), A11012Bros_ccmc5, Boolean.valueOf(n11013Bros_ccmc6), A11013Bros_ccmc6, Boolean.valueOf(n11014Bros_c7), A11014Bros_c7, Boolean.valueOf(n11015Bros_rb), A11015Bros_rb, Boolean.valueOf(n11016Bros_rbi), A11016Bros_rbi, Boolean.valueOf(n11017Bros_rbe), A11017Bros_rbe, Boolean.valueOf(n11018Bros_rbp), A11018Bros_rbp, Boolean.valueOf(n11019Bros_rboc), Short.valueOf(A11019Bros_rboc), Boolean.valueOf(n11020Bros_rb1), A11020Bros_rb1, Boolean.valueOf(n11021Bros_rb3), A11021Bros_rb3, Boolean.valueOf(n11022Bros_c8), A11022Bros_c8, Boolean.valueOf(n11023Bros_ep1), A11023Bros_ep1, Boolean.valueOf(n11024Bros_ep2), A11024Bros_ep2, Boolean.valueOf(n11025Bros_ep3), A11025Bros_ep3, Boolean.valueOf(n11026Bros_ep4), A11026Bros_ep4, Boolean.valueOf(n11027Bros_ep5), A11027Bros_ep5, Boolean.valueOf(n11028Bros_ep6), A11028Bros_ep6, Boolean.valueOf(n11029Bros_ep7), A11029Bros_ep7, Boolean.valueOf(n11030Bros_ep8), A11030Bros_ep8, Boolean.valueOf(n11031Bros_ep9), A11031Bros_ep9, Boolean.valueOf(n11032Bros_ep10), A11032Bros_ep10, Boolean.valueOf(n11033Bros_c9), A11033Bros_c9, Boolean.valueOf(n11034Bros_sa1), A11034Bros_sa1, Boolean.valueOf(n11035Bros_sa2), A11035Bros_sa2, Boolean.valueOf(n11036Bros_sa3), A11036Bros_sa3, Boolean.valueOf(n11037Bros_sa4), A11037Bros_sa4, Boolean.valueOf(n11038Bros_sa5), A11038Bros_sa5, Boolean.valueOf(n11039Bros_sa6), A11039Bros_sa6, Boolean.valueOf(n11040Bros_c10),
                  A11040Bros_c10, Boolean.valueOf(n11066Bros_stk), A11066Bros_stk, Boolean.valueOf(n11067Bros_Lbta), A11067Bros_Lbta, Boolean.valueOf(n11068Bros_Lbtp), Short.valueOf(A11068Bros_Lbtp), Boolean.valueOf(n11069Bros_c11), A11069Bros_c11, Boolean.valueOf(n11070Bros_c12), A11070Bros_c12, Boolean.valueOf(n11369Bros_imp1), A11369Bros_imp1, Boolean.valueOf(n11370Bros_imp2), A11370Bros_imp2, Boolean.valueOf(n11371Bros_imp3), A11371Bros_imp3, Boolean.valueOf(n11372Bros_imp4), A11372Bros_imp4, Boolean.valueOf(n11373Bros_imp5), A11373Bros_imp5, Boolean.valueOf(n11374Bros_imp6), A11374Bros_imp6, Boolean.valueOf(n11375Bros_imp7), A11375Bros_imp7, Boolean.valueOf(n11376Bros_imp8), A11376Bros_imp8, Boolean.valueOf(n11377Bros_imp9), A11377Bros_imp9, Boolean.valueOf(n11378Bros_imp10), A11378Bros_imp10, Boolean.valueOf(n11379Bros_imp11), A11379Bros_imp11, Boolean.valueOf(n11380Bros_oekot), A11380Bros_oekot, Boolean.valueOf(n11381Bros_lavad), A11381Bros_lavad, Boolean.valueOf(n11382Bros_luz), A11382Bros_luz, Boolean.valueOf(n11383Bros_sudor), A11383Bros_sudor, Boolean.valueOf(n11384Bros_cloro), A11384Bros_cloro, Boolean.valueOf(n11385Bros_aguam), A11385Bros_aguam, Boolean.valueOf(n11386Bros_termo), A11386Bros_termo, Boolean.valueOf(n11387Bros_humed), Byte.valueOf(A11387Bros_humed), Boolean.valueOf(n11407Bros_obs1), A11407Bros_obs1, Boolean.valueOf(n11408Bros_obs2), A11408Bros_obs2, Boolean.valueOf(n11409Bros_obs3), A11409Bros_obs3, Boolean.valueOf(n11410Bros_obs4), A11410Bros_obs4, Boolean.valueOf(n11411Bros_obs5), A11411Bros_obs5, Boolean.valueOf(n11412Bros_obs6), A11412Bros_obs6, Boolean.valueOf(n11413Bros_obs7), A11413Bros_obs7, Boolean.valueOf(n11414Bros_obs8), A11414Bros_obs8, Boolean.valueOf(n11415Bros_obs9), A11415Bros_obs9, Boolean.valueOf(n11416Bros_obs10), A11416Bros_obs10, Boolean.valueOf(n11417Bros_obs11), A11417Bros_obs11, Boolean.valueOf(n11703Bros_nc), Byte.valueOf(A11703Bros_nc), Boolean.valueOf(n11704Bros_enc), A11704Bros_enc, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTBRS");
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
                        resetCaption1AF0( ) ;
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
            load1AF1467( ) ;
         }
         endLevel1AF1467( ) ;
      }
      closeExtendedTableCursors1AF1467( ) ;
   }

   public void update1AF1467( )
   {
      beforeValidate1AF1467( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AF1467( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AF1467( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AF1467( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AF1467( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AF13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n10979Bros_Mcot), A10979Bros_Mcot, Boolean.valueOf(n10980Bros_Pd), A10980Bros_Pd, Boolean.valueOf(n10981Bros_Pp), A10981Bros_Pp, Boolean.valueOf(n10982Bros_Ag), A10982Bros_Ag, Boolean.valueOf(n10983Bros_c1), A10983Bros_c1, Boolean.valueOf(n10984Bros_c2), A10984Bros_c2, Boolean.valueOf(n10985Bros_bo), A10985Bros_bo, Boolean.valueOf(n10986Bros_bob), A10986Bros_bob, Boolean.valueOf(n10987Bros_boe), A10987Bros_boe, Boolean.valueOf(n10988BrosBov), A10988BrosBov, Boolean.valueOf(n10989Bros_c3), A10989Bros_c3, Boolean.valueOf(n10990Bros_tns), A10990Bros_tns, Boolean.valueOf(n10991Bros_tnc), A10991Bros_tnc, Boolean.valueOf(n10992Bros_c4), A10992Bros_c4, Boolean.valueOf(n10993Bros_ct), A10993Bros_ct, Boolean.valueOf(n10994Bros_c5), A10994Bros_c5, Boolean.valueOf(n10995Bros_scs), A10995Bros_scs, Boolean.valueOf(n10996Bros_scc), A10996Bros_scc, Boolean.valueOf(n10997Bros_c6), A10997Bros_c6, Boolean.valueOf(n10998Bros_cctse), A10998Bros_cctse, Boolean.valueOf(n10999Bros_ccttp), A10999Bros_ccttp, Boolean.valueOf(n11000Bros_cctet), A11000Bros_cctet, Boolean.valueOf(n11001Bros_ccp), Byte.valueOf(A11001Bros_ccp), Boolean.valueOf(n11002Bros_cct), Byte.valueOf(A11002Bros_cct), Boolean.valueOf(n11003Bros_ccpc), A11003Bros_ccpc, Boolean.valueOf(n11004Bros_cctq), A11004Bros_cctq, Boolean.valueOf(n11005Bros_cccc), A11005Bros_cccc, Boolean.valueOf(n11006Bros_ccec), A11006Bros_ccec, Boolean.valueOf(n11008Bros_ccmc1), A11008Bros_ccmc1, Boolean.valueOf(n11009Bros_ccmc2), A11009Bros_ccmc2, Boolean.valueOf(n11010Bros_ccmc3), A11010Bros_ccmc3, Boolean.valueOf(n11011Bros_ccmc4), A11011Bros_ccmc4, Boolean.valueOf(n11012Bros_ccmc5), A11012Bros_ccmc5, Boolean.valueOf(n11013Bros_ccmc6), A11013Bros_ccmc6, Boolean.valueOf(n11014Bros_c7), A11014Bros_c7, Boolean.valueOf(n11015Bros_rb), A11015Bros_rb, Boolean.valueOf(n11016Bros_rbi), A11016Bros_rbi, Boolean.valueOf(n11017Bros_rbe), A11017Bros_rbe, Boolean.valueOf(n11018Bros_rbp), A11018Bros_rbp, Boolean.valueOf(n11019Bros_rboc), Short.valueOf(A11019Bros_rboc), Boolean.valueOf(n11020Bros_rb1), A11020Bros_rb1, Boolean.valueOf(n11021Bros_rb3), A11021Bros_rb3, Boolean.valueOf(n11022Bros_c8), A11022Bros_c8, Boolean.valueOf(n11023Bros_ep1), A11023Bros_ep1, Boolean.valueOf(n11024Bros_ep2), A11024Bros_ep2, Boolean.valueOf(n11025Bros_ep3), A11025Bros_ep3, Boolean.valueOf(n11026Bros_ep4), A11026Bros_ep4, Boolean.valueOf(n11027Bros_ep5), A11027Bros_ep5, Boolean.valueOf(n11028Bros_ep6), A11028Bros_ep6, Boolean.valueOf(n11029Bros_ep7), A11029Bros_ep7, Boolean.valueOf(n11030Bros_ep8), A11030Bros_ep8, Boolean.valueOf(n11031Bros_ep9), A11031Bros_ep9, Boolean.valueOf(n11032Bros_ep10), A11032Bros_ep10, Boolean.valueOf(n11033Bros_c9), A11033Bros_c9, Boolean.valueOf(n11034Bros_sa1), A11034Bros_sa1, Boolean.valueOf(n11035Bros_sa2), A11035Bros_sa2, Boolean.valueOf(n11036Bros_sa3), A11036Bros_sa3, Boolean.valueOf(n11037Bros_sa4), A11037Bros_sa4, Boolean.valueOf(n11038Bros_sa5), A11038Bros_sa5, Boolean.valueOf(n11039Bros_sa6), A11039Bros_sa6, Boolean.valueOf(n11040Bros_c10), A11040Bros_c10,
                  Boolean.valueOf(n11066Bros_stk), A11066Bros_stk, Boolean.valueOf(n11067Bros_Lbta), A11067Bros_Lbta, Boolean.valueOf(n11068Bros_Lbtp), Short.valueOf(A11068Bros_Lbtp), Boolean.valueOf(n11069Bros_c11), A11069Bros_c11, Boolean.valueOf(n11070Bros_c12), A11070Bros_c12, Boolean.valueOf(n11369Bros_imp1), A11369Bros_imp1, Boolean.valueOf(n11370Bros_imp2), A11370Bros_imp2, Boolean.valueOf(n11371Bros_imp3), A11371Bros_imp3, Boolean.valueOf(n11372Bros_imp4), A11372Bros_imp4, Boolean.valueOf(n11373Bros_imp5), A11373Bros_imp5, Boolean.valueOf(n11374Bros_imp6), A11374Bros_imp6, Boolean.valueOf(n11375Bros_imp7), A11375Bros_imp7, Boolean.valueOf(n11376Bros_imp8), A11376Bros_imp8, Boolean.valueOf(n11377Bros_imp9), A11377Bros_imp9, Boolean.valueOf(n11378Bros_imp10), A11378Bros_imp10, Boolean.valueOf(n11379Bros_imp11), A11379Bros_imp11, Boolean.valueOf(n11380Bros_oekot), A11380Bros_oekot, Boolean.valueOf(n11381Bros_lavad), A11381Bros_lavad, Boolean.valueOf(n11382Bros_luz), A11382Bros_luz, Boolean.valueOf(n11383Bros_sudor), A11383Bros_sudor, Boolean.valueOf(n11384Bros_cloro), A11384Bros_cloro, Boolean.valueOf(n11385Bros_aguam), A11385Bros_aguam, Boolean.valueOf(n11386Bros_termo), A11386Bros_termo, Boolean.valueOf(n11387Bros_humed), Byte.valueOf(A11387Bros_humed), Boolean.valueOf(n11407Bros_obs1), A11407Bros_obs1, Boolean.valueOf(n11408Bros_obs2), A11408Bros_obs2, Boolean.valueOf(n11409Bros_obs3), A11409Bros_obs3, Boolean.valueOf(n11410Bros_obs4), A11410Bros_obs4, Boolean.valueOf(n11411Bros_obs5), A11411Bros_obs5, Boolean.valueOf(n11412Bros_obs6), A11412Bros_obs6, Boolean.valueOf(n11413Bros_obs7), A11413Bros_obs7, Boolean.valueOf(n11414Bros_obs8), A11414Bros_obs8, Boolean.valueOf(n11415Bros_obs9), A11415Bros_obs9, Boolean.valueOf(n11416Bros_obs10), A11416Bros_obs10, Boolean.valueOf(n11417Bros_obs11), A11417Bros_obs11, Boolean.valueOf(n11703Bros_nc), Byte.valueOf(A11703Bros_nc), Boolean.valueOf(n11704Bros_enc), A11704Bros_enc, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTBRS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTBRS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AF1467( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1AF0( ) ;
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
         endLevel1AF1467( ) ;
      }
      closeExtendedTableCursors1AF1467( ) ;
   }

   public void deferredUpdate1AF1467( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AF1467( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AF1467( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AF1467( ) ;
         afterConfirm1AF1467( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AF1467( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AF14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTBRS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1467 == 0 )
                     {
                        initAll1AF1467( ) ;
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
                     resetCaption1AF0( ) ;
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
      sMode1467 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AF1467( ) ;
      Gx_mode = sMode1467 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AF1467( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( GXutil.strcmp(A10980Bros_Pd, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtBros_Pp_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10980Bros_Pd, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               edtBros_Pp_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A10981Bros_Pp, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtBros_Pd_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10981Bros_Pp, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               edtBros_Pd_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A10982Bros_Ag, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtTrnCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10982Bros_Ag, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtTrnCod_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtBros_boe_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtBros_boe_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A10986Bros_bob, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  edtBros_boe_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
               }
               else
               {
                  if ( GXutil.strcmp(A10986Bros_bob, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
                  {
                     edtBros_boe_Enabled = 1 ;
                     httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
                  }
               }
            }
         }
         if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtBros_bob_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A10985Bros_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtBros_bob_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A10987Bros_boe, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  edtBros_bob_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
               }
               else
               {
                  if ( GXutil.strcmp(A10987Bros_boe, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
                  {
                     edtBros_bob_Enabled = 1 ;
                     httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
                  }
               }
            }
         }
      }
   }

   public void endLevel1AF1467( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AF1467( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tartbrs");
         if ( AnyError == 0 )
         {
            confirmValues1AF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tartbrs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AF1467( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A10978Bros_Art = A10978Bros_Art ;
      /* Scan By routine */
      /* Using cursor T01AF15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art});
      RcdFound1467 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1467 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AF1467( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1467 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1467 = (short)(1) ;
      }
   }

   public void scanEnd1AF1467( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1AF1467( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AF1467( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AF1467( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AF1467( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AF1467( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AF1467( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AF1467( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBros_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Art_Enabled), 5, 0), true);
      edtBros_Mcot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Mcot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Mcot_Enabled), 5, 0), true);
      edtBros_Pd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
      edtBros_Pp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
      edtBros_Ag_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Ag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Ag_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtBros_c1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c1_Enabled), 5, 0), true);
      edtBros_c2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c2_Enabled), 5, 0), true);
      edtBros_bo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_bo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bo_Enabled), 5, 0), true);
      edtBros_bob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
      edtBros_boe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
      cmbBrosBov.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBrosBov.getInternalname(), "Enabled", GXutil.ltrimstr( cmbBrosBov.getEnabled(), 5, 0), true);
      edtBros_c3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c3_Enabled), 5, 0), true);
      edtBros_tns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_tns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_tns_Enabled), 5, 0), true);
      edtBros_tnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_tnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_tnc_Enabled), 5, 0), true);
      edtBros_c4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c4_Enabled), 5, 0), true);
      edtBros_ct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ct_Enabled), 5, 0), true);
      edtBros_c5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c5_Enabled), 5, 0), true);
      edtBros_scs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_scs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_scs_Enabled), 5, 0), true);
      edtBros_scc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_scc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_scc_Enabled), 5, 0), true);
      edtBros_c6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c6_Enabled), 5, 0), true);
      edtBros_cctse_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_cctse_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_cctse_Enabled), 5, 0), true);
      edtBros_ccttp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccttp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccttp_Enabled), 5, 0), true);
      edtBros_cctet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_cctet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_cctet_Enabled), 5, 0), true);
      edtBros_ccp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccp_Enabled), 5, 0), true);
      edtBros_cct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_cct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_cct_Enabled), 5, 0), true);
      edtBros_ccpc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccpc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccpc_Enabled), 5, 0), true);
      edtBros_cctq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_cctq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_cctq_Enabled), 5, 0), true);
      edtBros_cccc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_cccc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_cccc_Enabled), 5, 0), true);
      edtBros_ccec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccec_Enabled), 5, 0), true);
      edtBros_ccmc1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccmc1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccmc1_Enabled), 5, 0), true);
      edtBros_ccmc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccmc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccmc2_Enabled), 5, 0), true);
      edtBros_ccmc3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccmc3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccmc3_Enabled), 5, 0), true);
      edtBros_ccmc4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccmc4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccmc4_Enabled), 5, 0), true);
      edtBros_ccmc5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccmc5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccmc5_Enabled), 5, 0), true);
      edtBros_ccmc6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ccmc6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ccmc6_Enabled), 5, 0), true);
      edtBros_c7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c7_Enabled), 5, 0), true);
      edtBros_rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_rb_Enabled), 5, 0), true);
      edtBros_rbi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_rbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_rbi_Enabled), 5, 0), true);
      edtBros_rbe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_rbe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_rbe_Enabled), 5, 0), true);
      edtBros_rbp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_rbp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_rbp_Enabled), 5, 0), true);
      edtBros_rboc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_rboc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_rboc_Enabled), 5, 0), true);
      edtBros_rb1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_rb1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_rb1_Enabled), 5, 0), true);
      edtBros_rb3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_rb3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_rb3_Enabled), 5, 0), true);
      edtBros_c8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c8_Enabled), 5, 0), true);
      edtBros_ep1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep1_Enabled), 5, 0), true);
      edtBros_ep2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep2_Enabled), 5, 0), true);
      edtBros_ep3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep3_Enabled), 5, 0), true);
      edtBros_ep4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep4_Enabled), 5, 0), true);
      edtBros_ep5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep5_Enabled), 5, 0), true);
      edtBros_ep6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep6_Enabled), 5, 0), true);
      edtBros_ep7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep7_Enabled), 5, 0), true);
      edtBros_ep8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep8_Enabled), 5, 0), true);
      edtBros_ep9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep9_Enabled), 5, 0), true);
      edtBros_ep10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_ep10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_ep10_Enabled), 5, 0), true);
      edtBros_c9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c9_Enabled), 5, 0), true);
      edtBros_sa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_sa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_sa1_Enabled), 5, 0), true);
      edtBros_sa2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_sa2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_sa2_Enabled), 5, 0), true);
      edtBros_sa3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_sa3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_sa3_Enabled), 5, 0), true);
      edtBros_sa4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_sa4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_sa4_Enabled), 5, 0), true);
      edtBros_sa5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_sa5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_sa5_Enabled), 5, 0), true);
      edtBros_sa6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_sa6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_sa6_Enabled), 5, 0), true);
      edtBros_c10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c10_Enabled), 5, 0), true);
      edtBros_stk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_stk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_stk_Enabled), 5, 0), true);
      edtBros_Lbta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Lbta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Lbta_Enabled), 5, 0), true);
      edtBros_Lbtp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Lbtp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Lbtp_Enabled), 5, 0), true);
      edtBros_c11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c11_Enabled), 5, 0), true);
      edtBros_c12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_c12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_c12_Enabled), 5, 0), true);
      edtBros_imp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp1_Enabled), 5, 0), true);
      edtBros_imp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp2_Enabled), 5, 0), true);
      edtBros_imp3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp3_Enabled), 5, 0), true);
      edtBros_imp4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp4_Enabled), 5, 0), true);
      edtBros_imp5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp5_Enabled), 5, 0), true);
      edtBros_imp6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp6_Enabled), 5, 0), true);
      edtBros_imp7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp7_Enabled), 5, 0), true);
      edtBros_imp8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp8_Enabled), 5, 0), true);
      edtBros_imp9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp9_Enabled), 5, 0), true);
      edtBros_imp10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp10_Enabled), 5, 0), true);
      edtBros_imp11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_imp11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_imp11_Enabled), 5, 0), true);
      edtBros_oekot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_oekot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_oekot_Enabled), 5, 0), true);
      edtBros_lavad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_lavad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_lavad_Enabled), 5, 0), true);
      edtBros_luz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_luz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_luz_Enabled), 5, 0), true);
      edtBros_sudor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_sudor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_sudor_Enabled), 5, 0), true);
      edtBros_cloro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_cloro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_cloro_Enabled), 5, 0), true);
      edtBros_aguam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_aguam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_aguam_Enabled), 5, 0), true);
      edtBros_termo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_termo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_termo_Enabled), 5, 0), true);
      edtBros_humed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_humed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_humed_Enabled), 5, 0), true);
      edtBros_obs1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs1_Enabled), 5, 0), true);
      edtBros_obs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs2_Enabled), 5, 0), true);
      edtBros_obs3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs3_Enabled), 5, 0), true);
      edtBros_obs4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs4_Enabled), 5, 0), true);
      edtBros_obs5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs5_Enabled), 5, 0), true);
      edtBros_obs6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs6_Enabled), 5, 0), true);
      edtBros_obs7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs7_Enabled), 5, 0), true);
      edtBros_obs8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs8_Enabled), 5, 0), true);
      edtBros_obs9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs9_Enabled), 5, 0), true);
      edtBros_obs10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs10_Enabled), 5, 0), true);
      edtBros_obs11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_obs11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_obs11_Enabled), 5, 0), true);
      edtBros_nc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_nc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_nc_Enabled), 5, 0), true);
      edtBros_enc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBros_enc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_enc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1AF1467( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1AF0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tartbrs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A10978Bros_Art))}, new String[] {"EmprCod","CliCod","Bros_Art"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10978Bros_Art", GXutil.rtrim( Z10978Bros_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10979Bros_Mcot", GXutil.rtrim( Z10979Bros_Mcot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10980Bros_Pd", GXutil.rtrim( Z10980Bros_Pd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10981Bros_Pp", GXutil.rtrim( Z10981Bros_Pp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10982Bros_Ag", GXutil.rtrim( Z10982Bros_Ag));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10983Bros_c1", Z10983Bros_c1);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10984Bros_c2", Z10984Bros_c2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10985Bros_bo", GXutil.rtrim( Z10985Bros_bo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10986Bros_bob", GXutil.rtrim( Z10986Bros_bob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10987Bros_boe", GXutil.rtrim( Z10987Bros_boe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10988BrosBov", GXutil.rtrim( Z10988BrosBov));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10989Bros_c3", Z10989Bros_c3);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10990Bros_tns", GXutil.rtrim( Z10990Bros_tns));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10991Bros_tnc", GXutil.rtrim( Z10991Bros_tnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10992Bros_c4", Z10992Bros_c4);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10993Bros_ct", GXutil.rtrim( Z10993Bros_ct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10994Bros_c5", Z10994Bros_c5);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10995Bros_scs", GXutil.rtrim( Z10995Bros_scs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10996Bros_scc", GXutil.rtrim( Z10996Bros_scc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10997Bros_c6", Z10997Bros_c6);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10998Bros_cctse", GXutil.rtrim( Z10998Bros_cctse));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10999Bros_ccttp", GXutil.rtrim( Z10999Bros_ccttp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11000Bros_cctet", GXutil.rtrim( Z11000Bros_cctet));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11001Bros_ccp", GXutil.ltrim( localUtil.ntoc( Z11001Bros_ccp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11002Bros_cct", GXutil.ltrim( localUtil.ntoc( Z11002Bros_cct, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11003Bros_ccpc", GXutil.rtrim( Z11003Bros_ccpc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11004Bros_cctq", GXutil.rtrim( Z11004Bros_cctq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11005Bros_cccc", GXutil.rtrim( Z11005Bros_cccc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11006Bros_ccec", GXutil.rtrim( Z11006Bros_ccec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11008Bros_ccmc1", GXutil.rtrim( Z11008Bros_ccmc1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11009Bros_ccmc2", GXutil.rtrim( Z11009Bros_ccmc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11010Bros_ccmc3", GXutil.rtrim( Z11010Bros_ccmc3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11011Bros_ccmc4", GXutil.rtrim( Z11011Bros_ccmc4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11012Bros_ccmc5", GXutil.rtrim( Z11012Bros_ccmc5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11013Bros_ccmc6", GXutil.rtrim( Z11013Bros_ccmc6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11014Bros_c7", Z11014Bros_c7);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11015Bros_rb", GXutil.rtrim( Z11015Bros_rb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11016Bros_rbi", GXutil.rtrim( Z11016Bros_rbi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11017Bros_rbe", GXutil.rtrim( Z11017Bros_rbe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11018Bros_rbp", GXutil.rtrim( Z11018Bros_rbp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11019Bros_rboc", GXutil.ltrim( localUtil.ntoc( Z11019Bros_rboc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11020Bros_rb1", GXutil.rtrim( Z11020Bros_rb1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11021Bros_rb3", GXutil.rtrim( Z11021Bros_rb3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11022Bros_c8", Z11022Bros_c8);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11023Bros_ep1", GXutil.rtrim( Z11023Bros_ep1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11024Bros_ep2", GXutil.rtrim( Z11024Bros_ep2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11025Bros_ep3", GXutil.rtrim( Z11025Bros_ep3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11026Bros_ep4", GXutil.rtrim( Z11026Bros_ep4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11027Bros_ep5", GXutil.rtrim( Z11027Bros_ep5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11028Bros_ep6", GXutil.rtrim( Z11028Bros_ep6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11029Bros_ep7", GXutil.rtrim( Z11029Bros_ep7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11030Bros_ep8", GXutil.rtrim( Z11030Bros_ep8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11031Bros_ep9", GXutil.rtrim( Z11031Bros_ep9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11032Bros_ep10", GXutil.rtrim( Z11032Bros_ep10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11033Bros_c9", Z11033Bros_c9);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11034Bros_sa1", GXutil.rtrim( Z11034Bros_sa1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11035Bros_sa2", GXutil.rtrim( Z11035Bros_sa2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11036Bros_sa3", GXutil.rtrim( Z11036Bros_sa3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11037Bros_sa4", GXutil.rtrim( Z11037Bros_sa4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11038Bros_sa5", GXutil.rtrim( Z11038Bros_sa5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11039Bros_sa6", GXutil.rtrim( Z11039Bros_sa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11040Bros_c10", Z11040Bros_c10);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11066Bros_stk", GXutil.rtrim( Z11066Bros_stk));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11067Bros_Lbta", GXutil.rtrim( Z11067Bros_Lbta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11068Bros_Lbtp", GXutil.ltrim( localUtil.ntoc( Z11068Bros_Lbtp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11069Bros_c11", Z11069Bros_c11);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11070Bros_c12", Z11070Bros_c12);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11369Bros_imp1", GXutil.rtrim( Z11369Bros_imp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11370Bros_imp2", GXutil.rtrim( Z11370Bros_imp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11371Bros_imp3", GXutil.rtrim( Z11371Bros_imp3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11372Bros_imp4", GXutil.rtrim( Z11372Bros_imp4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11373Bros_imp5", GXutil.rtrim( Z11373Bros_imp5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11374Bros_imp6", GXutil.rtrim( Z11374Bros_imp6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11375Bros_imp7", GXutil.rtrim( Z11375Bros_imp7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11376Bros_imp8", GXutil.rtrim( Z11376Bros_imp8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11377Bros_imp9", GXutil.rtrim( Z11377Bros_imp9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11378Bros_imp10", GXutil.rtrim( Z11378Bros_imp10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11379Bros_imp11", GXutil.rtrim( Z11379Bros_imp11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11380Bros_oekot", GXutil.rtrim( Z11380Bros_oekot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11381Bros_lavad", GXutil.rtrim( Z11381Bros_lavad));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11382Bros_luz", GXutil.rtrim( Z11382Bros_luz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11383Bros_sudor", GXutil.rtrim( Z11383Bros_sudor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11384Bros_cloro", GXutil.rtrim( Z11384Bros_cloro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11385Bros_aguam", GXutil.rtrim( Z11385Bros_aguam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11386Bros_termo", GXutil.rtrim( Z11386Bros_termo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11387Bros_humed", GXutil.ltrim( localUtil.ntoc( Z11387Bros_humed, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11407Bros_obs1", GXutil.rtrim( Z11407Bros_obs1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11408Bros_obs2", GXutil.rtrim( Z11408Bros_obs2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11409Bros_obs3", GXutil.rtrim( Z11409Bros_obs3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11410Bros_obs4", GXutil.rtrim( Z11410Bros_obs4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11411Bros_obs5", GXutil.rtrim( Z11411Bros_obs5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11412Bros_obs6", GXutil.rtrim( Z11412Bros_obs6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11413Bros_obs7", GXutil.rtrim( Z11413Bros_obs7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11414Bros_obs8", GXutil.rtrim( Z11414Bros_obs8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11415Bros_obs9", GXutil.rtrim( Z11415Bros_obs9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11416Bros_obs10", GXutil.rtrim( Z11416Bros_obs10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11417Bros_obs11", GXutil.rtrim( Z11417Bros_obs11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11703Bros_nc", GXutil.ltrim( localUtil.ntoc( Z11703Bros_nc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11704Bros_enc", GXutil.ltrim( localUtil.ntoc( Z11704Bros_enc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tartbrs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A10978Bros_Art))}, new String[] {"EmprCod","CliCod","Bros_Art"})  ;
   }

   public String getPgmname( )
   {
      return "TARTBRS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FICHA TECNICA ARTICULO", "") ;
   }

   public void initializeNonKey1AF1467( )
   {
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A10983Bros_c1 = "" ;
      n10983Bros_c1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10983Bros_c1", A10983Bros_c1);
      A10984Bros_c2 = "" ;
      n10984Bros_c2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10984Bros_c2", A10984Bros_c2);
      A10989Bros_c3 = "" ;
      n10989Bros_c3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10989Bros_c3", A10989Bros_c3);
      A10992Bros_c4 = "" ;
      n10992Bros_c4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10992Bros_c4", A10992Bros_c4);
      A10994Bros_c5 = "" ;
      n10994Bros_c5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10994Bros_c5", A10994Bros_c5);
      A10997Bros_c6 = "" ;
      n10997Bros_c6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10997Bros_c6", A10997Bros_c6);
      A11001Bros_ccp = (byte)(0) ;
      n11001Bros_ccp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11001Bros_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11001Bros_ccp), 2, 0));
      A11002Bros_cct = (byte)(0) ;
      n11002Bros_cct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11002Bros_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11002Bros_cct), 2, 0));
      A11014Bros_c7 = "" ;
      n11014Bros_c7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11014Bros_c7", A11014Bros_c7);
      A11019Bros_rboc = (short)(0) ;
      n11019Bros_rboc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11019Bros_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11019Bros_rboc), 3, 0));
      A11022Bros_c8 = "" ;
      n11022Bros_c8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11022Bros_c8", A11022Bros_c8);
      A11033Bros_c9 = "" ;
      n11033Bros_c9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11033Bros_c9", A11033Bros_c9);
      A11037Bros_sa4 = "" ;
      n11037Bros_sa4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11037Bros_sa4", A11037Bros_sa4);
      A11040Bros_c10 = "" ;
      n11040Bros_c10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11040Bros_c10", A11040Bros_c10);
      A11067Bros_Lbta = "" ;
      n11067Bros_Lbta = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11067Bros_Lbta", A11067Bros_Lbta);
      A11068Bros_Lbtp = (short)(0) ;
      n11068Bros_Lbtp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11068Bros_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11068Bros_Lbtp), 4, 0));
      A11069Bros_c11 = "" ;
      n11069Bros_c11 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11069Bros_c11", A11069Bros_c11);
      A11070Bros_c12 = "" ;
      n11070Bros_c12 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11070Bros_c12", A11070Bros_c12);
      A11369Bros_imp1 = "" ;
      n11369Bros_imp1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11369Bros_imp1", A11369Bros_imp1);
      A11370Bros_imp2 = "" ;
      n11370Bros_imp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11370Bros_imp2", A11370Bros_imp2);
      A11371Bros_imp3 = "" ;
      n11371Bros_imp3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11371Bros_imp3", A11371Bros_imp3);
      A11372Bros_imp4 = "" ;
      n11372Bros_imp4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11372Bros_imp4", A11372Bros_imp4);
      A11373Bros_imp5 = "" ;
      n11373Bros_imp5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11373Bros_imp5", A11373Bros_imp5);
      A11374Bros_imp6 = "" ;
      n11374Bros_imp6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11374Bros_imp6", A11374Bros_imp6);
      A11375Bros_imp7 = "" ;
      n11375Bros_imp7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11375Bros_imp7", A11375Bros_imp7);
      A11376Bros_imp8 = "" ;
      n11376Bros_imp8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11376Bros_imp8", A11376Bros_imp8);
      A11377Bros_imp9 = "" ;
      n11377Bros_imp9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11377Bros_imp9", A11377Bros_imp9);
      A11378Bros_imp10 = "" ;
      n11378Bros_imp10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11378Bros_imp10", A11378Bros_imp10);
      A11379Bros_imp11 = "" ;
      n11379Bros_imp11 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11379Bros_imp11", A11379Bros_imp11);
      A11380Bros_oekot = "" ;
      n11380Bros_oekot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11380Bros_oekot", A11380Bros_oekot);
      A11381Bros_lavad = "" ;
      n11381Bros_lavad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11381Bros_lavad", A11381Bros_lavad);
      A11382Bros_luz = "" ;
      n11382Bros_luz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11382Bros_luz", A11382Bros_luz);
      A11383Bros_sudor = "" ;
      n11383Bros_sudor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11383Bros_sudor", A11383Bros_sudor);
      A11384Bros_cloro = "" ;
      n11384Bros_cloro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11384Bros_cloro", A11384Bros_cloro);
      A11385Bros_aguam = "" ;
      n11385Bros_aguam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11385Bros_aguam", A11385Bros_aguam);
      A11386Bros_termo = "" ;
      n11386Bros_termo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11386Bros_termo", A11386Bros_termo);
      A11387Bros_humed = (byte)(0) ;
      n11387Bros_humed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11387Bros_humed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11387Bros_humed), 2, 0));
      A11407Bros_obs1 = "" ;
      n11407Bros_obs1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11407Bros_obs1", A11407Bros_obs1);
      A11408Bros_obs2 = "" ;
      n11408Bros_obs2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11408Bros_obs2", A11408Bros_obs2);
      A11409Bros_obs3 = "" ;
      n11409Bros_obs3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11409Bros_obs3", A11409Bros_obs3);
      A11410Bros_obs4 = "" ;
      n11410Bros_obs4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11410Bros_obs4", A11410Bros_obs4);
      A11411Bros_obs5 = "" ;
      n11411Bros_obs5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11411Bros_obs5", A11411Bros_obs5);
      A11412Bros_obs6 = "" ;
      n11412Bros_obs6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11412Bros_obs6", A11412Bros_obs6);
      A11413Bros_obs7 = "" ;
      n11413Bros_obs7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11413Bros_obs7", A11413Bros_obs7);
      A11414Bros_obs8 = "" ;
      n11414Bros_obs8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11414Bros_obs8", A11414Bros_obs8);
      A11415Bros_obs9 = "" ;
      n11415Bros_obs9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11415Bros_obs9", A11415Bros_obs9);
      A11416Bros_obs10 = "" ;
      n11416Bros_obs10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11416Bros_obs10", A11416Bros_obs10);
      A11417Bros_obs11 = "" ;
      n11417Bros_obs11 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11417Bros_obs11", A11417Bros_obs11);
      A11703Bros_nc = (byte)(0) ;
      n11703Bros_nc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11703Bros_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11703Bros_nc), 2, 0));
      A11704Bros_enc = DecimalUtil.ZERO ;
      n11704Bros_enc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11704Bros_enc", GXutil.ltrimstr( A11704Bros_enc, 6, 2));
      A10979Bros_Mcot = httpContext.getMessage( "N", "") ;
      n10979Bros_Mcot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10979Bros_Mcot", A10979Bros_Mcot);
      A10980Bros_Pd = httpContext.getMessage( "N", "") ;
      n10980Bros_Pd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10980Bros_Pd", A10980Bros_Pd);
      A10981Bros_Pp = httpContext.getMessage( "N", "") ;
      n10981Bros_Pp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10981Bros_Pp", A10981Bros_Pp);
      A10982Bros_Ag = httpContext.getMessage( "N", "") ;
      n10982Bros_Ag = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10982Bros_Ag", A10982Bros_Ag);
      A10985Bros_bo = httpContext.getMessage( "N", "") ;
      n10985Bros_bo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10985Bros_bo", A10985Bros_bo);
      A10986Bros_bob = httpContext.getMessage( "N", "") ;
      n10986Bros_bob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10986Bros_bob", A10986Bros_bob);
      A10987Bros_boe = httpContext.getMessage( "N", "") ;
      n10987Bros_boe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10987Bros_boe", A10987Bros_boe);
      A10988BrosBov = httpContext.getMessage( "N", "") ;
      n10988BrosBov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", A10988BrosBov);
      A10990Bros_tns = httpContext.getMessage( "N", "") ;
      n10990Bros_tns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10990Bros_tns", A10990Bros_tns);
      A10991Bros_tnc = httpContext.getMessage( "N", "") ;
      n10991Bros_tnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10991Bros_tnc", A10991Bros_tnc);
      A10993Bros_ct = httpContext.getMessage( "N", "") ;
      n10993Bros_ct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10993Bros_ct", A10993Bros_ct);
      A10995Bros_scs = httpContext.getMessage( "N", "") ;
      n10995Bros_scs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10995Bros_scs", A10995Bros_scs);
      A10996Bros_scc = httpContext.getMessage( "N", "") ;
      n10996Bros_scc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10996Bros_scc", A10996Bros_scc);
      A10998Bros_cctse = httpContext.getMessage( "N", "") ;
      n10998Bros_cctse = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10998Bros_cctse", A10998Bros_cctse);
      A10999Bros_ccttp = httpContext.getMessage( "N", "") ;
      n10999Bros_ccttp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10999Bros_ccttp", A10999Bros_ccttp);
      A11000Bros_cctet = httpContext.getMessage( "N", "") ;
      n11000Bros_cctet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11000Bros_cctet", A11000Bros_cctet);
      A11003Bros_ccpc = httpContext.getMessage( "N", "") ;
      n11003Bros_ccpc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11003Bros_ccpc", A11003Bros_ccpc);
      A11004Bros_cctq = httpContext.getMessage( "N", "") ;
      n11004Bros_cctq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11004Bros_cctq", A11004Bros_cctq);
      A11005Bros_cccc = httpContext.getMessage( "N", "") ;
      n11005Bros_cccc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11005Bros_cccc", A11005Bros_cccc);
      A11006Bros_ccec = httpContext.getMessage( "N", "") ;
      n11006Bros_ccec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11006Bros_ccec", A11006Bros_ccec);
      A11008Bros_ccmc1 = httpContext.getMessage( "N", "") ;
      n11008Bros_ccmc1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11008Bros_ccmc1", A11008Bros_ccmc1);
      A11009Bros_ccmc2 = httpContext.getMessage( "N", "") ;
      n11009Bros_ccmc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11009Bros_ccmc2", A11009Bros_ccmc2);
      A11010Bros_ccmc3 = httpContext.getMessage( "N", "") ;
      n11010Bros_ccmc3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11010Bros_ccmc3", A11010Bros_ccmc3);
      A11011Bros_ccmc4 = httpContext.getMessage( "N", "") ;
      n11011Bros_ccmc4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11011Bros_ccmc4", A11011Bros_ccmc4);
      A11012Bros_ccmc5 = httpContext.getMessage( "N", "") ;
      n11012Bros_ccmc5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11012Bros_ccmc5", A11012Bros_ccmc5);
      A11013Bros_ccmc6 = httpContext.getMessage( "N", "") ;
      n11013Bros_ccmc6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11013Bros_ccmc6", A11013Bros_ccmc6);
      A11015Bros_rb = httpContext.getMessage( "N", "") ;
      n11015Bros_rb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11015Bros_rb", A11015Bros_rb);
      A11016Bros_rbi = httpContext.getMessage( "N", "") ;
      n11016Bros_rbi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11016Bros_rbi", A11016Bros_rbi);
      A11017Bros_rbe = httpContext.getMessage( "N", "") ;
      n11017Bros_rbe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11017Bros_rbe", A11017Bros_rbe);
      A11018Bros_rbp = httpContext.getMessage( "N", "") ;
      n11018Bros_rbp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11018Bros_rbp", A11018Bros_rbp);
      A11020Bros_rb1 = httpContext.getMessage( "N", "") ;
      n11020Bros_rb1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11020Bros_rb1", A11020Bros_rb1);
      A11021Bros_rb3 = httpContext.getMessage( "N", "") ;
      n11021Bros_rb3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11021Bros_rb3", A11021Bros_rb3);
      A11023Bros_ep1 = httpContext.getMessage( "N", "") ;
      n11023Bros_ep1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11023Bros_ep1", A11023Bros_ep1);
      A11024Bros_ep2 = httpContext.getMessage( "N", "") ;
      n11024Bros_ep2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11024Bros_ep2", A11024Bros_ep2);
      A11025Bros_ep3 = httpContext.getMessage( "N", "") ;
      n11025Bros_ep3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11025Bros_ep3", A11025Bros_ep3);
      A11026Bros_ep4 = httpContext.getMessage( "N", "") ;
      n11026Bros_ep4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11026Bros_ep4", A11026Bros_ep4);
      A11027Bros_ep5 = httpContext.getMessage( "N", "") ;
      n11027Bros_ep5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11027Bros_ep5", A11027Bros_ep5);
      A11028Bros_ep6 = httpContext.getMessage( "N", "") ;
      n11028Bros_ep6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11028Bros_ep6", A11028Bros_ep6);
      A11029Bros_ep7 = httpContext.getMessage( "N", "") ;
      n11029Bros_ep7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11029Bros_ep7", A11029Bros_ep7);
      A11030Bros_ep8 = httpContext.getMessage( "N", "") ;
      n11030Bros_ep8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11030Bros_ep8", A11030Bros_ep8);
      A11031Bros_ep9 = httpContext.getMessage( "N", "") ;
      n11031Bros_ep9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11031Bros_ep9", A11031Bros_ep9);
      A11032Bros_ep10 = httpContext.getMessage( "N", "") ;
      n11032Bros_ep10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11032Bros_ep10", A11032Bros_ep10);
      A11034Bros_sa1 = httpContext.getMessage( "N", "") ;
      n11034Bros_sa1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11034Bros_sa1", A11034Bros_sa1);
      A11035Bros_sa2 = httpContext.getMessage( "N", "") ;
      n11035Bros_sa2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11035Bros_sa2", A11035Bros_sa2);
      A11036Bros_sa3 = httpContext.getMessage( "N", "") ;
      n11036Bros_sa3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11036Bros_sa3", A11036Bros_sa3);
      A11038Bros_sa5 = httpContext.getMessage( "N", "") ;
      n11038Bros_sa5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11038Bros_sa5", A11038Bros_sa5);
      A11039Bros_sa6 = httpContext.getMessage( "N", "") ;
      n11039Bros_sa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11039Bros_sa6", A11039Bros_sa6);
      A11066Bros_stk = httpContext.getMessage( "N", "") ;
      n11066Bros_stk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11066Bros_stk", A11066Bros_stk);
      Z10979Bros_Mcot = "" ;
      Z10980Bros_Pd = "" ;
      Z10981Bros_Pp = "" ;
      Z10982Bros_Ag = "" ;
      Z10983Bros_c1 = "" ;
      Z10984Bros_c2 = "" ;
      Z10985Bros_bo = "" ;
      Z10986Bros_bob = "" ;
      Z10987Bros_boe = "" ;
      Z10988BrosBov = "" ;
      Z10989Bros_c3 = "" ;
      Z10990Bros_tns = "" ;
      Z10991Bros_tnc = "" ;
      Z10992Bros_c4 = "" ;
      Z10993Bros_ct = "" ;
      Z10994Bros_c5 = "" ;
      Z10995Bros_scs = "" ;
      Z10996Bros_scc = "" ;
      Z10997Bros_c6 = "" ;
      Z10998Bros_cctse = "" ;
      Z10999Bros_ccttp = "" ;
      Z11000Bros_cctet = "" ;
      Z11001Bros_ccp = (byte)(0) ;
      Z11002Bros_cct = (byte)(0) ;
      Z11003Bros_ccpc = "" ;
      Z11004Bros_cctq = "" ;
      Z11005Bros_cccc = "" ;
      Z11006Bros_ccec = "" ;
      Z11008Bros_ccmc1 = "" ;
      Z11009Bros_ccmc2 = "" ;
      Z11010Bros_ccmc3 = "" ;
      Z11011Bros_ccmc4 = "" ;
      Z11012Bros_ccmc5 = "" ;
      Z11013Bros_ccmc6 = "" ;
      Z11014Bros_c7 = "" ;
      Z11015Bros_rb = "" ;
      Z11016Bros_rbi = "" ;
      Z11017Bros_rbe = "" ;
      Z11018Bros_rbp = "" ;
      Z11019Bros_rboc = (short)(0) ;
      Z11020Bros_rb1 = "" ;
      Z11021Bros_rb3 = "" ;
      Z11022Bros_c8 = "" ;
      Z11023Bros_ep1 = "" ;
      Z11024Bros_ep2 = "" ;
      Z11025Bros_ep3 = "" ;
      Z11026Bros_ep4 = "" ;
      Z11027Bros_ep5 = "" ;
      Z11028Bros_ep6 = "" ;
      Z11029Bros_ep7 = "" ;
      Z11030Bros_ep8 = "" ;
      Z11031Bros_ep9 = "" ;
      Z11032Bros_ep10 = "" ;
      Z11033Bros_c9 = "" ;
      Z11034Bros_sa1 = "" ;
      Z11035Bros_sa2 = "" ;
      Z11036Bros_sa3 = "" ;
      Z11037Bros_sa4 = "" ;
      Z11038Bros_sa5 = "" ;
      Z11039Bros_sa6 = "" ;
      Z11040Bros_c10 = "" ;
      Z11066Bros_stk = "" ;
      Z11067Bros_Lbta = "" ;
      Z11068Bros_Lbtp = (short)(0) ;
      Z11069Bros_c11 = "" ;
      Z11070Bros_c12 = "" ;
      Z11369Bros_imp1 = "" ;
      Z11370Bros_imp2 = "" ;
      Z11371Bros_imp3 = "" ;
      Z11372Bros_imp4 = "" ;
      Z11373Bros_imp5 = "" ;
      Z11374Bros_imp6 = "" ;
      Z11375Bros_imp7 = "" ;
      Z11376Bros_imp8 = "" ;
      Z11377Bros_imp9 = "" ;
      Z11378Bros_imp10 = "" ;
      Z11379Bros_imp11 = "" ;
      Z11380Bros_oekot = "" ;
      Z11381Bros_lavad = "" ;
      Z11382Bros_luz = "" ;
      Z11383Bros_sudor = "" ;
      Z11384Bros_cloro = "" ;
      Z11385Bros_aguam = "" ;
      Z11386Bros_termo = "" ;
      Z11387Bros_humed = (byte)(0) ;
      Z11407Bros_obs1 = "" ;
      Z11408Bros_obs2 = "" ;
      Z11409Bros_obs3 = "" ;
      Z11410Bros_obs4 = "" ;
      Z11411Bros_obs5 = "" ;
      Z11412Bros_obs6 = "" ;
      Z11413Bros_obs7 = "" ;
      Z11414Bros_obs8 = "" ;
      Z11415Bros_obs9 = "" ;
      Z11416Bros_obs10 = "" ;
      Z11417Bros_obs11 = "" ;
      Z11703Bros_nc = (byte)(0) ;
      Z11704Bros_enc = DecimalUtil.ZERO ;
      Z840TrnCod = (short)(0) ;
   }

   public void initAll1AF1467( )
   {
      initializeNonKey1AF1467( ) ;
   }

   public void standaloneModalInsert( )
   {
      A10979Bros_Mcot = i10979Bros_Mcot ;
      n10979Bros_Mcot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10979Bros_Mcot", A10979Bros_Mcot);
      A10980Bros_Pd = i10980Bros_Pd ;
      n10980Bros_Pd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10980Bros_Pd", A10980Bros_Pd);
      A10981Bros_Pp = i10981Bros_Pp ;
      n10981Bros_Pp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10981Bros_Pp", A10981Bros_Pp);
      A10982Bros_Ag = i10982Bros_Ag ;
      n10982Bros_Ag = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10982Bros_Ag", A10982Bros_Ag);
      A10985Bros_bo = i10985Bros_bo ;
      n10985Bros_bo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10985Bros_bo", A10985Bros_bo);
      A10986Bros_bob = i10986Bros_bob ;
      n10986Bros_bob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10986Bros_bob", A10986Bros_bob);
      A10988BrosBov = i10988BrosBov ;
      n10988BrosBov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", A10988BrosBov);
      A10987Bros_boe = i10987Bros_boe ;
      n10987Bros_boe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10987Bros_boe", A10987Bros_boe);
      A10990Bros_tns = i10990Bros_tns ;
      n10990Bros_tns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10990Bros_tns", A10990Bros_tns);
      A10991Bros_tnc = i10991Bros_tnc ;
      n10991Bros_tnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10991Bros_tnc", A10991Bros_tnc);
      A10993Bros_ct = i10993Bros_ct ;
      n10993Bros_ct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10993Bros_ct", A10993Bros_ct);
      A10995Bros_scs = i10995Bros_scs ;
      n10995Bros_scs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10995Bros_scs", A10995Bros_scs);
      A10996Bros_scc = i10996Bros_scc ;
      n10996Bros_scc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10996Bros_scc", A10996Bros_scc);
      A10998Bros_cctse = i10998Bros_cctse ;
      n10998Bros_cctse = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10998Bros_cctse", A10998Bros_cctse);
      A10999Bros_ccttp = i10999Bros_ccttp ;
      n10999Bros_ccttp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10999Bros_ccttp", A10999Bros_ccttp);
      A11000Bros_cctet = i11000Bros_cctet ;
      n11000Bros_cctet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11000Bros_cctet", A11000Bros_cctet);
      A11003Bros_ccpc = i11003Bros_ccpc ;
      n11003Bros_ccpc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11003Bros_ccpc", A11003Bros_ccpc);
      A11004Bros_cctq = i11004Bros_cctq ;
      n11004Bros_cctq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11004Bros_cctq", A11004Bros_cctq);
      A11005Bros_cccc = i11005Bros_cccc ;
      n11005Bros_cccc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11005Bros_cccc", A11005Bros_cccc);
      A11006Bros_ccec = i11006Bros_ccec ;
      n11006Bros_ccec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11006Bros_ccec", A11006Bros_ccec);
      A11008Bros_ccmc1 = i11008Bros_ccmc1 ;
      n11008Bros_ccmc1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11008Bros_ccmc1", A11008Bros_ccmc1);
      A11009Bros_ccmc2 = i11009Bros_ccmc2 ;
      n11009Bros_ccmc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11009Bros_ccmc2", A11009Bros_ccmc2);
      A11010Bros_ccmc3 = i11010Bros_ccmc3 ;
      n11010Bros_ccmc3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11010Bros_ccmc3", A11010Bros_ccmc3);
      A11011Bros_ccmc4 = i11011Bros_ccmc4 ;
      n11011Bros_ccmc4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11011Bros_ccmc4", A11011Bros_ccmc4);
      A11012Bros_ccmc5 = i11012Bros_ccmc5 ;
      n11012Bros_ccmc5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11012Bros_ccmc5", A11012Bros_ccmc5);
      A11013Bros_ccmc6 = i11013Bros_ccmc6 ;
      n11013Bros_ccmc6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11013Bros_ccmc6", A11013Bros_ccmc6);
      A11015Bros_rb = i11015Bros_rb ;
      n11015Bros_rb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11015Bros_rb", A11015Bros_rb);
      A11017Bros_rbe = i11017Bros_rbe ;
      n11017Bros_rbe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11017Bros_rbe", A11017Bros_rbe);
      A11016Bros_rbi = i11016Bros_rbi ;
      n11016Bros_rbi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11016Bros_rbi", A11016Bros_rbi);
      A11018Bros_rbp = i11018Bros_rbp ;
      n11018Bros_rbp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11018Bros_rbp", A11018Bros_rbp);
      A11020Bros_rb1 = i11020Bros_rb1 ;
      n11020Bros_rb1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11020Bros_rb1", A11020Bros_rb1);
      A11021Bros_rb3 = i11021Bros_rb3 ;
      n11021Bros_rb3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11021Bros_rb3", A11021Bros_rb3);
      A11023Bros_ep1 = i11023Bros_ep1 ;
      n11023Bros_ep1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11023Bros_ep1", A11023Bros_ep1);
      A11024Bros_ep2 = i11024Bros_ep2 ;
      n11024Bros_ep2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11024Bros_ep2", A11024Bros_ep2);
      A11025Bros_ep3 = i11025Bros_ep3 ;
      n11025Bros_ep3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11025Bros_ep3", A11025Bros_ep3);
      A11026Bros_ep4 = i11026Bros_ep4 ;
      n11026Bros_ep4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11026Bros_ep4", A11026Bros_ep4);
      A11027Bros_ep5 = i11027Bros_ep5 ;
      n11027Bros_ep5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11027Bros_ep5", A11027Bros_ep5);
      A11028Bros_ep6 = i11028Bros_ep6 ;
      n11028Bros_ep6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11028Bros_ep6", A11028Bros_ep6);
      A11029Bros_ep7 = i11029Bros_ep7 ;
      n11029Bros_ep7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11029Bros_ep7", A11029Bros_ep7);
      A11030Bros_ep8 = i11030Bros_ep8 ;
      n11030Bros_ep8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11030Bros_ep8", A11030Bros_ep8);
      A11031Bros_ep9 = i11031Bros_ep9 ;
      n11031Bros_ep9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11031Bros_ep9", A11031Bros_ep9);
      A11032Bros_ep10 = i11032Bros_ep10 ;
      n11032Bros_ep10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11032Bros_ep10", A11032Bros_ep10);
      A11034Bros_sa1 = i11034Bros_sa1 ;
      n11034Bros_sa1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11034Bros_sa1", A11034Bros_sa1);
      A11035Bros_sa2 = i11035Bros_sa2 ;
      n11035Bros_sa2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11035Bros_sa2", A11035Bros_sa2);
      A11036Bros_sa3 = i11036Bros_sa3 ;
      n11036Bros_sa3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11036Bros_sa3", A11036Bros_sa3);
      A11038Bros_sa5 = i11038Bros_sa5 ;
      n11038Bros_sa5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11038Bros_sa5", A11038Bros_sa5);
      A11039Bros_sa6 = i11039Bros_sa6 ;
      n11039Bros_sa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11039Bros_sa6", A11039Bros_sa6);
      A11066Bros_stk = i11066Bros_stk ;
      n11066Bros_stk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11066Bros_stk", A11066Bros_stk);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241562147", true, true);
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
      httpContext.AddJavascriptSource("tartbrs.js", "?20268241562147", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBros_Art_Internalname = "BROS_ART" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBros_Mcot_Internalname = "BROS_MCOT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBros_Pd_Internalname = "BROS_PD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBros_Pp_Internalname = "BROS_PP" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBros_Ag_Internalname = "BROS_AG" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBros_c1_Internalname = "BROS_C1" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBros_c2_Internalname = "BROS_C2" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBros_bo_Internalname = "BROS_BO" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBros_bob_Internalname = "BROS_BOB" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBros_boe_Internalname = "BROS_BOE" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      cmbBrosBov.setInternalname( "BROSBOV" );
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBros_c3_Internalname = "BROS_C3" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBros_tns_Internalname = "BROS_TNS" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBros_tnc_Internalname = "BROS_TNC" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBros_c4_Internalname = "BROS_C4" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBros_ct_Internalname = "BROS_CT" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBros_c5_Internalname = "BROS_C5" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtBros_scs_Internalname = "BROS_SCS" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtBros_scc_Internalname = "BROS_SCC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtBros_c6_Internalname = "BROS_C6" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtBros_cctse_Internalname = "BROS_CCTSE" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtBros_ccttp_Internalname = "BROS_CCTTP" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtBros_cctet_Internalname = "BROS_CCTET" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtBros_ccp_Internalname = "BROS_CCP" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtBros_cct_Internalname = "BROS_CCT" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtBros_ccpc_Internalname = "BROS_CCPC" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtBros_cctq_Internalname = "BROS_CCTQ" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtBros_cccc_Internalname = "BROS_CCCC" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtBros_ccec_Internalname = "BROS_CCEC" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtBros_ccmc1_Internalname = "BROS_CCMC1" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtBros_ccmc2_Internalname = "BROS_CCMC2" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtBros_ccmc3_Internalname = "BROS_CCMC3" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtBros_ccmc4_Internalname = "BROS_CCMC4" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtBros_ccmc5_Internalname = "BROS_CCMC5" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtBros_ccmc6_Internalname = "BROS_CCMC6" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtBros_c7_Internalname = "BROS_C7" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtBros_rb_Internalname = "BROS_RB" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtBros_rbi_Internalname = "BROS_RBI" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtBros_rbe_Internalname = "BROS_RBE" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtBros_rbp_Internalname = "BROS_RBP" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtBros_rboc_Internalname = "BROS_RBOC" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtBros_rb1_Internalname = "BROS_RB1" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtBros_rb3_Internalname = "BROS_RB3" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtBros_c8_Internalname = "BROS_C8" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtBros_ep1_Internalname = "BROS_EP1" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtBros_ep2_Internalname = "BROS_EP2" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtBros_ep3_Internalname = "BROS_EP3" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtBros_ep4_Internalname = "BROS_EP4" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtBros_ep5_Internalname = "BROS_EP5" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtBros_ep6_Internalname = "BROS_EP6" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtBros_ep7_Internalname = "BROS_EP7" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtBros_ep8_Internalname = "BROS_EP8" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtBros_ep9_Internalname = "BROS_EP9" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtBros_ep10_Internalname = "BROS_EP10" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtBros_c9_Internalname = "BROS_C9" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtBros_sa1_Internalname = "BROS_SA1" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtBros_sa2_Internalname = "BROS_SA2" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtBros_sa3_Internalname = "BROS_SA3" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtBros_sa4_Internalname = "BROS_SA4" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtBros_sa5_Internalname = "BROS_SA5" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtBros_sa6_Internalname = "BROS_SA6" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtBros_c10_Internalname = "BROS_C10" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtBros_stk_Internalname = "BROS_STK" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtBros_Lbta_Internalname = "BROS_LBTA" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtBros_Lbtp_Internalname = "BROS_LBTP" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtBros_c11_Internalname = "BROS_C11" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtBros_c12_Internalname = "BROS_C12" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtBros_imp1_Internalname = "BROS_IMP1" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtBros_imp2_Internalname = "BROS_IMP2" ;
      lblTextblock75_Internalname = "TEXTBLOCK75" ;
      edtBros_imp3_Internalname = "BROS_IMP3" ;
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      edtBros_imp4_Internalname = "BROS_IMP4" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      edtBros_imp5_Internalname = "BROS_IMP5" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      edtBros_imp6_Internalname = "BROS_IMP6" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtBros_imp7_Internalname = "BROS_IMP7" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      edtBros_imp8_Internalname = "BROS_IMP8" ;
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtBros_imp9_Internalname = "BROS_IMP9" ;
      lblTextblock82_Internalname = "TEXTBLOCK82" ;
      edtBros_imp10_Internalname = "BROS_IMP10" ;
      lblTextblock83_Internalname = "TEXTBLOCK83" ;
      edtBros_imp11_Internalname = "BROS_IMP11" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      edtBros_oekot_Internalname = "BROS_OEKOT" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      edtBros_lavad_Internalname = "BROS_LAVAD" ;
      lblTextblock86_Internalname = "TEXTBLOCK86" ;
      edtBros_luz_Internalname = "BROS_LUZ" ;
      lblTextblock87_Internalname = "TEXTBLOCK87" ;
      edtBros_sudor_Internalname = "BROS_SUDOR" ;
      lblTextblock88_Internalname = "TEXTBLOCK88" ;
      edtBros_cloro_Internalname = "BROS_CLORO" ;
      lblTextblock89_Internalname = "TEXTBLOCK89" ;
      edtBros_aguam_Internalname = "BROS_AGUAM" ;
      lblTextblock90_Internalname = "TEXTBLOCK90" ;
      edtBros_termo_Internalname = "BROS_TERMO" ;
      lblTextblock91_Internalname = "TEXTBLOCK91" ;
      edtBros_humed_Internalname = "BROS_HUMED" ;
      lblTextblock92_Internalname = "TEXTBLOCK92" ;
      edtBros_obs1_Internalname = "BROS_OBS1" ;
      lblTextblock93_Internalname = "TEXTBLOCK93" ;
      edtBros_obs2_Internalname = "BROS_OBS2" ;
      lblTextblock94_Internalname = "TEXTBLOCK94" ;
      edtBros_obs3_Internalname = "BROS_OBS3" ;
      lblTextblock95_Internalname = "TEXTBLOCK95" ;
      edtBros_obs4_Internalname = "BROS_OBS4" ;
      lblTextblock96_Internalname = "TEXTBLOCK96" ;
      edtBros_obs5_Internalname = "BROS_OBS5" ;
      lblTextblock97_Internalname = "TEXTBLOCK97" ;
      edtBros_obs6_Internalname = "BROS_OBS6" ;
      lblTextblock98_Internalname = "TEXTBLOCK98" ;
      edtBros_obs7_Internalname = "BROS_OBS7" ;
      lblTextblock99_Internalname = "TEXTBLOCK99" ;
      edtBros_obs8_Internalname = "BROS_OBS8" ;
      lblTextblock100_Internalname = "TEXTBLOCK100" ;
      edtBros_obs9_Internalname = "BROS_OBS9" ;
      lblTextblock101_Internalname = "TEXTBLOCK101" ;
      edtBros_obs10_Internalname = "BROS_OBS10" ;
      lblTextblock102_Internalname = "TEXTBLOCK102" ;
      edtBros_obs11_Internalname = "BROS_OBS11" ;
      lblTextblock103_Internalname = "TEXTBLOCK103" ;
      edtBros_nc_Internalname = "BROS_NC" ;
      lblTextblock104_Internalname = "TEXTBLOCK104" ;
      edtBros_enc_Internalname = "BROS_ENC" ;
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
      Form.setCaption( httpContext.getMessage( "FICHA TECNICA ARTICULO", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBros_enc_Jsonclick = "" ;
      edtBros_enc_Backcolor = (int)(0xFFFFFF) ;
      edtBros_enc_Enabled = 1 ;
      edtBros_nc_Jsonclick = "" ;
      edtBros_nc_Backcolor = (int)(0xFFFFFF) ;
      edtBros_nc_Enabled = 1 ;
      edtBros_obs11_Jsonclick = "" ;
      edtBros_obs11_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs11_Enabled = 1 ;
      edtBros_obs10_Jsonclick = "" ;
      edtBros_obs10_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs10_Enabled = 1 ;
      edtBros_obs9_Jsonclick = "" ;
      edtBros_obs9_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs9_Enabled = 1 ;
      edtBros_obs8_Jsonclick = "" ;
      edtBros_obs8_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs8_Enabled = 1 ;
      edtBros_obs7_Jsonclick = "" ;
      edtBros_obs7_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs7_Enabled = 1 ;
      edtBros_obs6_Jsonclick = "" ;
      edtBros_obs6_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs6_Enabled = 1 ;
      edtBros_obs5_Jsonclick = "" ;
      edtBros_obs5_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs5_Enabled = 1 ;
      edtBros_obs4_Jsonclick = "" ;
      edtBros_obs4_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs4_Enabled = 1 ;
      edtBros_obs3_Jsonclick = "" ;
      edtBros_obs3_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs3_Enabled = 1 ;
      edtBros_obs2_Jsonclick = "" ;
      edtBros_obs2_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs2_Enabled = 1 ;
      edtBros_obs1_Jsonclick = "" ;
      edtBros_obs1_Backcolor = (int)(0xFFFFFF) ;
      edtBros_obs1_Enabled = 1 ;
      edtBros_humed_Jsonclick = "" ;
      edtBros_humed_Backcolor = (int)(0xFFFFFF) ;
      edtBros_humed_Enabled = 1 ;
      edtBros_termo_Jsonclick = "" ;
      edtBros_termo_Backcolor = (int)(0xFFFFFF) ;
      edtBros_termo_Enabled = 1 ;
      edtBros_aguam_Jsonclick = "" ;
      edtBros_aguam_Backcolor = (int)(0xFFFFFF) ;
      edtBros_aguam_Enabled = 1 ;
      edtBros_cloro_Jsonclick = "" ;
      edtBros_cloro_Backcolor = (int)(0xFFFFFF) ;
      edtBros_cloro_Enabled = 1 ;
      edtBros_sudor_Jsonclick = "" ;
      edtBros_sudor_Backcolor = (int)(0xFFFFFF) ;
      edtBros_sudor_Enabled = 1 ;
      edtBros_luz_Jsonclick = "" ;
      edtBros_luz_Backcolor = (int)(0xFFFFFF) ;
      edtBros_luz_Enabled = 1 ;
      edtBros_lavad_Jsonclick = "" ;
      edtBros_lavad_Backcolor = (int)(0xFFFFFF) ;
      edtBros_lavad_Enabled = 1 ;
      edtBros_oekot_Jsonclick = "" ;
      edtBros_oekot_Backcolor = (int)(0xFFFFFF) ;
      edtBros_oekot_Enabled = 1 ;
      edtBros_imp11_Jsonclick = "" ;
      edtBros_imp11_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp11_Enabled = 1 ;
      edtBros_imp10_Jsonclick = "" ;
      edtBros_imp10_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp10_Enabled = 1 ;
      edtBros_imp9_Jsonclick = "" ;
      edtBros_imp9_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp9_Enabled = 1 ;
      edtBros_imp8_Jsonclick = "" ;
      edtBros_imp8_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp8_Enabled = 1 ;
      edtBros_imp7_Jsonclick = "" ;
      edtBros_imp7_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp7_Enabled = 1 ;
      edtBros_imp6_Jsonclick = "" ;
      edtBros_imp6_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp6_Enabled = 1 ;
      edtBros_imp5_Jsonclick = "" ;
      edtBros_imp5_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp5_Enabled = 1 ;
      edtBros_imp4_Jsonclick = "" ;
      edtBros_imp4_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp4_Enabled = 1 ;
      edtBros_imp3_Jsonclick = "" ;
      edtBros_imp3_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp3_Enabled = 1 ;
      edtBros_imp2_Jsonclick = "" ;
      edtBros_imp2_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp2_Enabled = 1 ;
      edtBros_imp1_Jsonclick = "" ;
      edtBros_imp1_Backcolor = (int)(0xFFFFFF) ;
      edtBros_imp1_Enabled = 1 ;
      edtBros_c12_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c12_Enabled = 1 ;
      edtBros_c11_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c11_Enabled = 1 ;
      edtBros_Lbtp_Jsonclick = "" ;
      edtBros_Lbtp_Backcolor = (int)(0xFFFFFF) ;
      edtBros_Lbtp_Enabled = 1 ;
      edtBros_Lbta_Jsonclick = "" ;
      edtBros_Lbta_Backcolor = (int)(0xFFFFFF) ;
      edtBros_Lbta_Enabled = 1 ;
      edtBros_stk_Jsonclick = "" ;
      edtBros_stk_Backcolor = (int)(0xFFFFFF) ;
      edtBros_stk_Enabled = 1 ;
      edtBros_c10_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c10_Enabled = 1 ;
      edtBros_sa6_Jsonclick = "" ;
      edtBros_sa6_Backcolor = (int)(0xFFFFFF) ;
      edtBros_sa6_Enabled = 1 ;
      edtBros_sa5_Jsonclick = "" ;
      edtBros_sa5_Backcolor = (int)(0xFFFFFF) ;
      edtBros_sa5_Enabled = 1 ;
      edtBros_sa4_Jsonclick = "" ;
      edtBros_sa4_Backcolor = (int)(0xFFFFFF) ;
      edtBros_sa4_Enabled = 1 ;
      edtBros_sa3_Jsonclick = "" ;
      edtBros_sa3_Backcolor = (int)(0xFFFFFF) ;
      edtBros_sa3_Enabled = 1 ;
      edtBros_sa2_Jsonclick = "" ;
      edtBros_sa2_Backcolor = (int)(0xFFFFFF) ;
      edtBros_sa2_Enabled = 1 ;
      edtBros_sa1_Jsonclick = "" ;
      edtBros_sa1_Backcolor = (int)(0xFFFFFF) ;
      edtBros_sa1_Enabled = 1 ;
      edtBros_c9_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c9_Enabled = 1 ;
      edtBros_ep10_Jsonclick = "" ;
      edtBros_ep10_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep10_Enabled = 1 ;
      edtBros_ep9_Jsonclick = "" ;
      edtBros_ep9_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep9_Enabled = 1 ;
      edtBros_ep8_Jsonclick = "" ;
      edtBros_ep8_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep8_Enabled = 1 ;
      edtBros_ep7_Jsonclick = "" ;
      edtBros_ep7_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep7_Enabled = 1 ;
      edtBros_ep6_Jsonclick = "" ;
      edtBros_ep6_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep6_Enabled = 1 ;
      edtBros_ep5_Jsonclick = "" ;
      edtBros_ep5_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep5_Enabled = 1 ;
      edtBros_ep4_Jsonclick = "" ;
      edtBros_ep4_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep4_Enabled = 1 ;
      edtBros_ep3_Jsonclick = "" ;
      edtBros_ep3_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep3_Enabled = 1 ;
      edtBros_ep2_Jsonclick = "" ;
      edtBros_ep2_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep2_Enabled = 1 ;
      edtBros_ep1_Jsonclick = "" ;
      edtBros_ep1_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ep1_Enabled = 1 ;
      edtBros_c8_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c8_Enabled = 1 ;
      edtBros_rb3_Jsonclick = "" ;
      edtBros_rb3_Backcolor = (int)(0xFFFFFF) ;
      edtBros_rb3_Enabled = 1 ;
      edtBros_rb1_Jsonclick = "" ;
      edtBros_rb1_Backcolor = (int)(0xFFFFFF) ;
      edtBros_rb1_Enabled = 1 ;
      edtBros_rboc_Jsonclick = "" ;
      edtBros_rboc_Backcolor = (int)(0xFFFFFF) ;
      edtBros_rboc_Enabled = 1 ;
      edtBros_rbp_Jsonclick = "" ;
      edtBros_rbp_Backcolor = (int)(0xFFFFFF) ;
      edtBros_rbp_Enabled = 1 ;
      edtBros_rbe_Jsonclick = "" ;
      edtBros_rbe_Backcolor = (int)(0xFFFFFF) ;
      edtBros_rbe_Enabled = 1 ;
      edtBros_rbi_Jsonclick = "" ;
      edtBros_rbi_Backcolor = (int)(0xFFFFFF) ;
      edtBros_rbi_Enabled = 1 ;
      edtBros_rb_Jsonclick = "" ;
      edtBros_rb_Backcolor = (int)(0xFFFFFF) ;
      edtBros_rb_Enabled = 1 ;
      edtBros_c7_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c7_Enabled = 1 ;
      edtBros_ccmc6_Jsonclick = "" ;
      edtBros_ccmc6_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccmc6_Enabled = 1 ;
      edtBros_ccmc5_Jsonclick = "" ;
      edtBros_ccmc5_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccmc5_Enabled = 1 ;
      edtBros_ccmc4_Jsonclick = "" ;
      edtBros_ccmc4_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccmc4_Enabled = 1 ;
      edtBros_ccmc3_Jsonclick = "" ;
      edtBros_ccmc3_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccmc3_Enabled = 1 ;
      edtBros_ccmc2_Jsonclick = "" ;
      edtBros_ccmc2_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccmc2_Enabled = 1 ;
      edtBros_ccmc1_Jsonclick = "" ;
      edtBros_ccmc1_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccmc1_Enabled = 1 ;
      edtBros_ccec_Jsonclick = "" ;
      edtBros_ccec_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccec_Enabled = 1 ;
      edtBros_cccc_Jsonclick = "" ;
      edtBros_cccc_Backcolor = (int)(0xFFFFFF) ;
      edtBros_cccc_Enabled = 1 ;
      edtBros_cctq_Jsonclick = "" ;
      edtBros_cctq_Backcolor = (int)(0xFFFFFF) ;
      edtBros_cctq_Enabled = 1 ;
      edtBros_ccpc_Jsonclick = "" ;
      edtBros_ccpc_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccpc_Enabled = 1 ;
      edtBros_cct_Jsonclick = "" ;
      edtBros_cct_Backcolor = (int)(0xFFFFFF) ;
      edtBros_cct_Enabled = 1 ;
      edtBros_ccp_Jsonclick = "" ;
      edtBros_ccp_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccp_Enabled = 1 ;
      edtBros_cctet_Jsonclick = "" ;
      edtBros_cctet_Backcolor = (int)(0xFFFFFF) ;
      edtBros_cctet_Enabled = 1 ;
      edtBros_ccttp_Jsonclick = "" ;
      edtBros_ccttp_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ccttp_Enabled = 1 ;
      edtBros_cctse_Jsonclick = "" ;
      edtBros_cctse_Backcolor = (int)(0xFFFFFF) ;
      edtBros_cctse_Enabled = 1 ;
      edtBros_c6_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c6_Enabled = 1 ;
      edtBros_scc_Jsonclick = "" ;
      edtBros_scc_Backcolor = (int)(0xFFFFFF) ;
      edtBros_scc_Enabled = 1 ;
      edtBros_scs_Jsonclick = "" ;
      edtBros_scs_Backcolor = (int)(0xFFFFFF) ;
      edtBros_scs_Enabled = 1 ;
      edtBros_c5_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c5_Enabled = 1 ;
      edtBros_ct_Jsonclick = "" ;
      edtBros_ct_Backcolor = (int)(0xFFFFFF) ;
      edtBros_ct_Enabled = 1 ;
      edtBros_c4_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c4_Enabled = 1 ;
      edtBros_tnc_Jsonclick = "" ;
      edtBros_tnc_Backcolor = (int)(0xFFFFFF) ;
      edtBros_tnc_Enabled = 1 ;
      edtBros_tns_Jsonclick = "" ;
      edtBros_tns_Backcolor = (int)(0xFFFFFF) ;
      edtBros_tns_Enabled = 1 ;
      edtBros_c3_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c3_Enabled = 1 ;
      cmbBrosBov.setJsonclick( "" );
      cmbBrosBov.setEnabled( 1 );
      cmbBrosBov.setIBackground( (int)(0xFFFFFF) );
      edtBros_boe_Jsonclick = "" ;
      edtBros_boe_Backcolor = (int)(0xFFFFFF) ;
      edtBros_boe_Enabled = 1 ;
      edtBros_bob_Jsonclick = "" ;
      edtBros_bob_Backcolor = (int)(0xFFFFFF) ;
      edtBros_bob_Enabled = 1 ;
      edtBros_bo_Jsonclick = "" ;
      edtBros_bo_Backcolor = (int)(0xFFFFFF) ;
      edtBros_bo_Enabled = 1 ;
      edtBros_c2_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c2_Enabled = 1 ;
      edtBros_c1_Backcolor = (int)(0xFFFFFF) ;
      edtBros_c1_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
      edtBros_Ag_Jsonclick = "" ;
      edtBros_Ag_Backcolor = (int)(0xFFFFFF) ;
      edtBros_Ag_Enabled = 1 ;
      edtBros_Pp_Jsonclick = "" ;
      edtBros_Pp_Backcolor = (int)(0xFFFFFF) ;
      edtBros_Pp_Enabled = 1 ;
      edtBros_Pd_Jsonclick = "" ;
      edtBros_Pd_Backcolor = (int)(0xFFFFFF) ;
      edtBros_Pd_Enabled = 1 ;
      edtBros_Mcot_Jsonclick = "" ;
      edtBros_Mcot_Backcolor = (int)(0xFFFFFF) ;
      edtBros_Mcot_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBros_Art_Jsonclick = "" ;
      edtBros_Art_Backcolor = (int)(0xFFFFFF) ;
      edtBros_Art_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      cmbBrosBov.setName( "BROSBOV" );
      cmbBrosBov.setWebtags( "" );
      cmbBrosBov.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbBrosBov.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbBrosBov.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A10988BrosBov)==0) )
         {
            A10988BrosBov = httpContext.getMessage( "N", "") ;
            n10988BrosBov = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", A10988BrosBov);
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01AF16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AF16_A407EmprNom[0] ;
      n407EmprNom = T01AF16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T01AF17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01AF17_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(15);
      GX_FocusControl = edtBros_Mcot_Internalname ;
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

   public void valid_Bros_art( )
   {
      n10979Bros_Mcot = false ;
      n10980Bros_Pd = false ;
      n10981Bros_Pp = false ;
      n10982Bros_Ag = false ;
      n10985Bros_bo = false ;
      n10986Bros_bob = false ;
      n10988BrosBov = false ;
      A10988BrosBov = cmbBrosBov.getValue() ;
      n10988BrosBov = false ;
      cmbBrosBov.setValue( A10988BrosBov );
      n10987Bros_boe = false ;
      n10990Bros_tns = false ;
      n10991Bros_tnc = false ;
      n10993Bros_ct = false ;
      n10995Bros_scs = false ;
      n10996Bros_scc = false ;
      n10998Bros_cctse = false ;
      n10999Bros_ccttp = false ;
      n11000Bros_cctet = false ;
      n11003Bros_ccpc = false ;
      n11004Bros_cctq = false ;
      n11005Bros_cccc = false ;
      n11006Bros_ccec = false ;
      n11008Bros_ccmc1 = false ;
      n11009Bros_ccmc2 = false ;
      n11010Bros_ccmc3 = false ;
      n11011Bros_ccmc4 = false ;
      n11012Bros_ccmc5 = false ;
      n11013Bros_ccmc6 = false ;
      n11015Bros_rb = false ;
      n11017Bros_rbe = false ;
      n11016Bros_rbi = false ;
      n11018Bros_rbp = false ;
      n11020Bros_rb1 = false ;
      n11021Bros_rb3 = false ;
      n11023Bros_ep1 = false ;
      n11024Bros_ep2 = false ;
      n11025Bros_ep3 = false ;
      n11026Bros_ep4 = false ;
      n11027Bros_ep5 = false ;
      n11028Bros_ep6 = false ;
      n11029Bros_ep7 = false ;
      n11030Bros_ep8 = false ;
      n11031Bros_ep9 = false ;
      n11032Bros_ep10 = false ;
      n11034Bros_sa1 = false ;
      n11035Bros_sa2 = false ;
      n11036Bros_sa3 = false ;
      n11038Bros_sa5 = false ;
      n11039Bros_sa6 = false ;
      n11066Bros_stk = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbBrosBov.getItemCount() > 0 )
      {
         A10988BrosBov = cmbBrosBov.getValidValue(A10988BrosBov) ;
         n10988BrosBov = false ;
         cmbBrosBov.setValue( A10988BrosBov );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBrosBov.setValue( GXutil.rtrim( A10988BrosBov) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10979Bros_Mcot", GXutil.rtrim( A10979Bros_Mcot));
      httpContext.ajax_rsp_assign_attri("", false, "A10980Bros_Pd", GXutil.rtrim( A10980Bros_Pd));
      httpContext.ajax_rsp_assign_attri("", false, "A10981Bros_Pp", GXutil.rtrim( A10981Bros_Pp));
      httpContext.ajax_rsp_assign_attri("", false, "A10982Bros_Ag", GXutil.rtrim( A10982Bros_Ag));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10983Bros_c1", A10983Bros_c1);
      httpContext.ajax_rsp_assign_attri("", false, "A10984Bros_c2", A10984Bros_c2);
      httpContext.ajax_rsp_assign_attri("", false, "A10985Bros_bo", GXutil.rtrim( A10985Bros_bo));
      httpContext.ajax_rsp_assign_attri("", false, "A10986Bros_bob", GXutil.rtrim( A10986Bros_bob));
      httpContext.ajax_rsp_assign_attri("", false, "A10987Bros_boe", GXutil.rtrim( A10987Bros_boe));
      httpContext.ajax_rsp_assign_attri("", false, "A10988BrosBov", GXutil.rtrim( A10988BrosBov));
      cmbBrosBov.setValue( GXutil.rtrim( A10988BrosBov) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBrosBov.getInternalname(), "Values", cmbBrosBov.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10989Bros_c3", A10989Bros_c3);
      httpContext.ajax_rsp_assign_attri("", false, "A10990Bros_tns", GXutil.rtrim( A10990Bros_tns));
      httpContext.ajax_rsp_assign_attri("", false, "A10991Bros_tnc", GXutil.rtrim( A10991Bros_tnc));
      httpContext.ajax_rsp_assign_attri("", false, "A10992Bros_c4", A10992Bros_c4);
      httpContext.ajax_rsp_assign_attri("", false, "A10993Bros_ct", GXutil.rtrim( A10993Bros_ct));
      httpContext.ajax_rsp_assign_attri("", false, "A10994Bros_c5", A10994Bros_c5);
      httpContext.ajax_rsp_assign_attri("", false, "A10995Bros_scs", GXutil.rtrim( A10995Bros_scs));
      httpContext.ajax_rsp_assign_attri("", false, "A10996Bros_scc", GXutil.rtrim( A10996Bros_scc));
      httpContext.ajax_rsp_assign_attri("", false, "A10997Bros_c6", A10997Bros_c6);
      httpContext.ajax_rsp_assign_attri("", false, "A10998Bros_cctse", GXutil.rtrim( A10998Bros_cctse));
      httpContext.ajax_rsp_assign_attri("", false, "A10999Bros_ccttp", GXutil.rtrim( A10999Bros_ccttp));
      httpContext.ajax_rsp_assign_attri("", false, "A11000Bros_cctet", GXutil.rtrim( A11000Bros_cctet));
      httpContext.ajax_rsp_assign_attri("", false, "A11001Bros_ccp", GXutil.ltrim( localUtil.ntoc( A11001Bros_ccp, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11002Bros_cct", GXutil.ltrim( localUtil.ntoc( A11002Bros_cct, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11003Bros_ccpc", GXutil.rtrim( A11003Bros_ccpc));
      httpContext.ajax_rsp_assign_attri("", false, "A11004Bros_cctq", GXutil.rtrim( A11004Bros_cctq));
      httpContext.ajax_rsp_assign_attri("", false, "A11005Bros_cccc", GXutil.rtrim( A11005Bros_cccc));
      httpContext.ajax_rsp_assign_attri("", false, "A11006Bros_ccec", GXutil.rtrim( A11006Bros_ccec));
      httpContext.ajax_rsp_assign_attri("", false, "A11008Bros_ccmc1", GXutil.rtrim( A11008Bros_ccmc1));
      httpContext.ajax_rsp_assign_attri("", false, "A11009Bros_ccmc2", GXutil.rtrim( A11009Bros_ccmc2));
      httpContext.ajax_rsp_assign_attri("", false, "A11010Bros_ccmc3", GXutil.rtrim( A11010Bros_ccmc3));
      httpContext.ajax_rsp_assign_attri("", false, "A11011Bros_ccmc4", GXutil.rtrim( A11011Bros_ccmc4));
      httpContext.ajax_rsp_assign_attri("", false, "A11012Bros_ccmc5", GXutil.rtrim( A11012Bros_ccmc5));
      httpContext.ajax_rsp_assign_attri("", false, "A11013Bros_ccmc6", GXutil.rtrim( A11013Bros_ccmc6));
      httpContext.ajax_rsp_assign_attri("", false, "A11014Bros_c7", A11014Bros_c7);
      httpContext.ajax_rsp_assign_attri("", false, "A11015Bros_rb", GXutil.rtrim( A11015Bros_rb));
      httpContext.ajax_rsp_assign_attri("", false, "A11016Bros_rbi", GXutil.rtrim( A11016Bros_rbi));
      httpContext.ajax_rsp_assign_attri("", false, "A11017Bros_rbe", GXutil.rtrim( A11017Bros_rbe));
      httpContext.ajax_rsp_assign_attri("", false, "A11018Bros_rbp", GXutil.rtrim( A11018Bros_rbp));
      httpContext.ajax_rsp_assign_attri("", false, "A11019Bros_rboc", GXutil.ltrim( localUtil.ntoc( A11019Bros_rboc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11020Bros_rb1", GXutil.rtrim( A11020Bros_rb1));
      httpContext.ajax_rsp_assign_attri("", false, "A11021Bros_rb3", GXutil.rtrim( A11021Bros_rb3));
      httpContext.ajax_rsp_assign_attri("", false, "A11022Bros_c8", A11022Bros_c8);
      httpContext.ajax_rsp_assign_attri("", false, "A11023Bros_ep1", GXutil.rtrim( A11023Bros_ep1));
      httpContext.ajax_rsp_assign_attri("", false, "A11024Bros_ep2", GXutil.rtrim( A11024Bros_ep2));
      httpContext.ajax_rsp_assign_attri("", false, "A11025Bros_ep3", GXutil.rtrim( A11025Bros_ep3));
      httpContext.ajax_rsp_assign_attri("", false, "A11026Bros_ep4", GXutil.rtrim( A11026Bros_ep4));
      httpContext.ajax_rsp_assign_attri("", false, "A11027Bros_ep5", GXutil.rtrim( A11027Bros_ep5));
      httpContext.ajax_rsp_assign_attri("", false, "A11028Bros_ep6", GXutil.rtrim( A11028Bros_ep6));
      httpContext.ajax_rsp_assign_attri("", false, "A11029Bros_ep7", GXutil.rtrim( A11029Bros_ep7));
      httpContext.ajax_rsp_assign_attri("", false, "A11030Bros_ep8", GXutil.rtrim( A11030Bros_ep8));
      httpContext.ajax_rsp_assign_attri("", false, "A11031Bros_ep9", GXutil.rtrim( A11031Bros_ep9));
      httpContext.ajax_rsp_assign_attri("", false, "A11032Bros_ep10", GXutil.rtrim( A11032Bros_ep10));
      httpContext.ajax_rsp_assign_attri("", false, "A11033Bros_c9", A11033Bros_c9);
      httpContext.ajax_rsp_assign_attri("", false, "A11034Bros_sa1", GXutil.rtrim( A11034Bros_sa1));
      httpContext.ajax_rsp_assign_attri("", false, "A11035Bros_sa2", GXutil.rtrim( A11035Bros_sa2));
      httpContext.ajax_rsp_assign_attri("", false, "A11036Bros_sa3", GXutil.rtrim( A11036Bros_sa3));
      httpContext.ajax_rsp_assign_attri("", false, "A11037Bros_sa4", GXutil.rtrim( A11037Bros_sa4));
      httpContext.ajax_rsp_assign_attri("", false, "A11038Bros_sa5", GXutil.rtrim( A11038Bros_sa5));
      httpContext.ajax_rsp_assign_attri("", false, "A11039Bros_sa6", GXutil.rtrim( A11039Bros_sa6));
      httpContext.ajax_rsp_assign_attri("", false, "A11040Bros_c10", A11040Bros_c10);
      httpContext.ajax_rsp_assign_attri("", false, "A11066Bros_stk", GXutil.rtrim( A11066Bros_stk));
      httpContext.ajax_rsp_assign_attri("", false, "A11067Bros_Lbta", GXutil.rtrim( A11067Bros_Lbta));
      httpContext.ajax_rsp_assign_attri("", false, "A11068Bros_Lbtp", GXutil.ltrim( localUtil.ntoc( A11068Bros_Lbtp, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11069Bros_c11", A11069Bros_c11);
      httpContext.ajax_rsp_assign_attri("", false, "A11070Bros_c12", A11070Bros_c12);
      httpContext.ajax_rsp_assign_attri("", false, "A11369Bros_imp1", GXutil.rtrim( A11369Bros_imp1));
      httpContext.ajax_rsp_assign_attri("", false, "A11370Bros_imp2", GXutil.rtrim( A11370Bros_imp2));
      httpContext.ajax_rsp_assign_attri("", false, "A11371Bros_imp3", GXutil.rtrim( A11371Bros_imp3));
      httpContext.ajax_rsp_assign_attri("", false, "A11372Bros_imp4", GXutil.rtrim( A11372Bros_imp4));
      httpContext.ajax_rsp_assign_attri("", false, "A11373Bros_imp5", GXutil.rtrim( A11373Bros_imp5));
      httpContext.ajax_rsp_assign_attri("", false, "A11374Bros_imp6", GXutil.rtrim( A11374Bros_imp6));
      httpContext.ajax_rsp_assign_attri("", false, "A11375Bros_imp7", GXutil.rtrim( A11375Bros_imp7));
      httpContext.ajax_rsp_assign_attri("", false, "A11376Bros_imp8", GXutil.rtrim( A11376Bros_imp8));
      httpContext.ajax_rsp_assign_attri("", false, "A11377Bros_imp9", GXutil.rtrim( A11377Bros_imp9));
      httpContext.ajax_rsp_assign_attri("", false, "A11378Bros_imp10", GXutil.rtrim( A11378Bros_imp10));
      httpContext.ajax_rsp_assign_attri("", false, "A11379Bros_imp11", GXutil.rtrim( A11379Bros_imp11));
      httpContext.ajax_rsp_assign_attri("", false, "A11380Bros_oekot", GXutil.rtrim( A11380Bros_oekot));
      httpContext.ajax_rsp_assign_attri("", false, "A11381Bros_lavad", GXutil.rtrim( A11381Bros_lavad));
      httpContext.ajax_rsp_assign_attri("", false, "A11382Bros_luz", GXutil.rtrim( A11382Bros_luz));
      httpContext.ajax_rsp_assign_attri("", false, "A11383Bros_sudor", GXutil.rtrim( A11383Bros_sudor));
      httpContext.ajax_rsp_assign_attri("", false, "A11384Bros_cloro", GXutil.rtrim( A11384Bros_cloro));
      httpContext.ajax_rsp_assign_attri("", false, "A11385Bros_aguam", GXutil.rtrim( A11385Bros_aguam));
      httpContext.ajax_rsp_assign_attri("", false, "A11386Bros_termo", GXutil.rtrim( A11386Bros_termo));
      httpContext.ajax_rsp_assign_attri("", false, "A11387Bros_humed", GXutil.ltrim( localUtil.ntoc( A11387Bros_humed, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11407Bros_obs1", GXutil.rtrim( A11407Bros_obs1));
      httpContext.ajax_rsp_assign_attri("", false, "A11408Bros_obs2", GXutil.rtrim( A11408Bros_obs2));
      httpContext.ajax_rsp_assign_attri("", false, "A11409Bros_obs3", GXutil.rtrim( A11409Bros_obs3));
      httpContext.ajax_rsp_assign_attri("", false, "A11410Bros_obs4", GXutil.rtrim( A11410Bros_obs4));
      httpContext.ajax_rsp_assign_attri("", false, "A11411Bros_obs5", GXutil.rtrim( A11411Bros_obs5));
      httpContext.ajax_rsp_assign_attri("", false, "A11412Bros_obs6", GXutil.rtrim( A11412Bros_obs6));
      httpContext.ajax_rsp_assign_attri("", false, "A11413Bros_obs7", GXutil.rtrim( A11413Bros_obs7));
      httpContext.ajax_rsp_assign_attri("", false, "A11414Bros_obs8", GXutil.rtrim( A11414Bros_obs8));
      httpContext.ajax_rsp_assign_attri("", false, "A11415Bros_obs9", GXutil.rtrim( A11415Bros_obs9));
      httpContext.ajax_rsp_assign_attri("", false, "A11416Bros_obs10", GXutil.rtrim( A11416Bros_obs10));
      httpContext.ajax_rsp_assign_attri("", false, "A11417Bros_obs11", GXutil.rtrim( A11417Bros_obs11));
      httpContext.ajax_rsp_assign_attri("", false, "A11703Bros_nc", GXutil.ltrim( localUtil.ntoc( A11703Bros_nc, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11704Bros_enc", GXutil.ltrim( localUtil.ntoc( A11704Bros_enc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Pp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pp_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBros_Pd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_Pd_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBros_bob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_bob_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBros_boe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBros_boe_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10978Bros_Art", GXutil.rtrim( Z10978Bros_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10979Bros_Mcot", GXutil.rtrim( Z10979Bros_Mcot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10980Bros_Pd", GXutil.rtrim( Z10980Bros_Pd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10981Bros_Pp", GXutil.rtrim( Z10981Bros_Pp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10982Bros_Ag", GXutil.rtrim( Z10982Bros_Ag));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10983Bros_c1", Z10983Bros_c1);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10984Bros_c2", Z10984Bros_c2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10985Bros_bo", GXutil.rtrim( Z10985Bros_bo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10986Bros_bob", GXutil.rtrim( Z10986Bros_bob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10987Bros_boe", GXutil.rtrim( Z10987Bros_boe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10988BrosBov", GXutil.rtrim( Z10988BrosBov));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10989Bros_c3", Z10989Bros_c3);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10990Bros_tns", GXutil.rtrim( Z10990Bros_tns));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10991Bros_tnc", GXutil.rtrim( Z10991Bros_tnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10992Bros_c4", Z10992Bros_c4);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10993Bros_ct", GXutil.rtrim( Z10993Bros_ct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10994Bros_c5", Z10994Bros_c5);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10995Bros_scs", GXutil.rtrim( Z10995Bros_scs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10996Bros_scc", GXutil.rtrim( Z10996Bros_scc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10997Bros_c6", Z10997Bros_c6);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10998Bros_cctse", GXutil.rtrim( Z10998Bros_cctse));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10999Bros_ccttp", GXutil.rtrim( Z10999Bros_ccttp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11000Bros_cctet", GXutil.rtrim( Z11000Bros_cctet));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11001Bros_ccp", GXutil.ltrim( localUtil.ntoc( Z11001Bros_ccp, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11002Bros_cct", GXutil.ltrim( localUtil.ntoc( Z11002Bros_cct, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11003Bros_ccpc", GXutil.rtrim( Z11003Bros_ccpc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11004Bros_cctq", GXutil.rtrim( Z11004Bros_cctq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11005Bros_cccc", GXutil.rtrim( Z11005Bros_cccc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11006Bros_ccec", GXutil.rtrim( Z11006Bros_ccec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11008Bros_ccmc1", GXutil.rtrim( Z11008Bros_ccmc1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11009Bros_ccmc2", GXutil.rtrim( Z11009Bros_ccmc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11010Bros_ccmc3", GXutil.rtrim( Z11010Bros_ccmc3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11011Bros_ccmc4", GXutil.rtrim( Z11011Bros_ccmc4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11012Bros_ccmc5", GXutil.rtrim( Z11012Bros_ccmc5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11013Bros_ccmc6", GXutil.rtrim( Z11013Bros_ccmc6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11014Bros_c7", Z11014Bros_c7);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11015Bros_rb", GXutil.rtrim( Z11015Bros_rb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11016Bros_rbi", GXutil.rtrim( Z11016Bros_rbi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11017Bros_rbe", GXutil.rtrim( Z11017Bros_rbe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11018Bros_rbp", GXutil.rtrim( Z11018Bros_rbp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11019Bros_rboc", GXutil.ltrim( localUtil.ntoc( Z11019Bros_rboc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11020Bros_rb1", GXutil.rtrim( Z11020Bros_rb1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11021Bros_rb3", GXutil.rtrim( Z11021Bros_rb3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11022Bros_c8", Z11022Bros_c8);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11023Bros_ep1", GXutil.rtrim( Z11023Bros_ep1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11024Bros_ep2", GXutil.rtrim( Z11024Bros_ep2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11025Bros_ep3", GXutil.rtrim( Z11025Bros_ep3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11026Bros_ep4", GXutil.rtrim( Z11026Bros_ep4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11027Bros_ep5", GXutil.rtrim( Z11027Bros_ep5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11028Bros_ep6", GXutil.rtrim( Z11028Bros_ep6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11029Bros_ep7", GXutil.rtrim( Z11029Bros_ep7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11030Bros_ep8", GXutil.rtrim( Z11030Bros_ep8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11031Bros_ep9", GXutil.rtrim( Z11031Bros_ep9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11032Bros_ep10", GXutil.rtrim( Z11032Bros_ep10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11033Bros_c9", Z11033Bros_c9);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11034Bros_sa1", GXutil.rtrim( Z11034Bros_sa1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11035Bros_sa2", GXutil.rtrim( Z11035Bros_sa2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11036Bros_sa3", GXutil.rtrim( Z11036Bros_sa3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11037Bros_sa4", GXutil.rtrim( Z11037Bros_sa4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11038Bros_sa5", GXutil.rtrim( Z11038Bros_sa5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11039Bros_sa6", GXutil.rtrim( Z11039Bros_sa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11040Bros_c10", Z11040Bros_c10);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11066Bros_stk", GXutil.rtrim( Z11066Bros_stk));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11067Bros_Lbta", GXutil.rtrim( Z11067Bros_Lbta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11068Bros_Lbtp", GXutil.ltrim( localUtil.ntoc( Z11068Bros_Lbtp, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11069Bros_c11", Z11069Bros_c11);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11070Bros_c12", Z11070Bros_c12);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11369Bros_imp1", GXutil.rtrim( Z11369Bros_imp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11370Bros_imp2", GXutil.rtrim( Z11370Bros_imp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11371Bros_imp3", GXutil.rtrim( Z11371Bros_imp3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11372Bros_imp4", GXutil.rtrim( Z11372Bros_imp4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11373Bros_imp5", GXutil.rtrim( Z11373Bros_imp5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11374Bros_imp6", GXutil.rtrim( Z11374Bros_imp6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11375Bros_imp7", GXutil.rtrim( Z11375Bros_imp7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11376Bros_imp8", GXutil.rtrim( Z11376Bros_imp8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11377Bros_imp9", GXutil.rtrim( Z11377Bros_imp9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11378Bros_imp10", GXutil.rtrim( Z11378Bros_imp10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11379Bros_imp11", GXutil.rtrim( Z11379Bros_imp11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11380Bros_oekot", GXutil.rtrim( Z11380Bros_oekot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11381Bros_lavad", GXutil.rtrim( Z11381Bros_lavad));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11382Bros_luz", GXutil.rtrim( Z11382Bros_luz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11383Bros_sudor", GXutil.rtrim( Z11383Bros_sudor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11384Bros_cloro", GXutil.rtrim( Z11384Bros_cloro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11385Bros_aguam", GXutil.rtrim( Z11385Bros_aguam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11386Bros_termo", GXutil.rtrim( Z11386Bros_termo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11387Bros_humed", GXutil.ltrim( localUtil.ntoc( Z11387Bros_humed, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11407Bros_obs1", GXutil.rtrim( Z11407Bros_obs1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11408Bros_obs2", GXutil.rtrim( Z11408Bros_obs2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11409Bros_obs3", GXutil.rtrim( Z11409Bros_obs3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11410Bros_obs4", GXutil.rtrim( Z11410Bros_obs4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11411Bros_obs5", GXutil.rtrim( Z11411Bros_obs5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11412Bros_obs6", GXutil.rtrim( Z11412Bros_obs6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11413Bros_obs7", GXutil.rtrim( Z11413Bros_obs7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11414Bros_obs8", GXutil.rtrim( Z11414Bros_obs8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11415Bros_obs9", GXutil.rtrim( Z11415Bros_obs9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11416Bros_obs10", GXutil.rtrim( Z11416Bros_obs10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11417Bros_obs11", GXutil.rtrim( Z11417Bros_obs11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11703Bros_nc", GXutil.ltrim( localUtil.ntoc( Z11703Bros_nc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11704Bros_enc", GXutil.ltrim( localUtil.ntoc( Z11704Bros_enc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      /* Using cursor T01AF18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
      }
      pr_default.close(16);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A10978Bros_Art',fld:'BROS_ART',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BROS_ART","{handler:'valid_Bros_art',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A10978Bros_Art',fld:'BROS_ART',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A10979Bros_Mcot',fld:'BROS_MCOT',pic:''},{av:'A10980Bros_Pd',fld:'BROS_PD',pic:''},{av:'A10981Bros_Pp',fld:'BROS_PP',pic:''},{av:'A10982Bros_Ag',fld:'BROS_AG',pic:''},{av:'A10985Bros_bo',fld:'BROS_BO',pic:''},{av:'A10986Bros_bob',fld:'BROS_BOB',pic:''},{av:'cmbBrosBov'},{av:'A10988BrosBov',fld:'BROSBOV',pic:''},{av:'A10987Bros_boe',fld:'BROS_BOE',pic:''},{av:'A10990Bros_tns',fld:'BROS_TNS',pic:''},{av:'A10991Bros_tnc',fld:'BROS_TNC',pic:''},{av:'A10993Bros_ct',fld:'BROS_CT',pic:''},{av:'A10995Bros_scs',fld:'BROS_SCS',pic:''},{av:'A10996Bros_scc',fld:'BROS_SCC',pic:''},{av:'A10998Bros_cctse',fld:'BROS_CCTSE',pic:''},{av:'A10999Bros_ccttp',fld:'BROS_CCTTP',pic:''},{av:'A11000Bros_cctet',fld:'BROS_CCTET',pic:''},{av:'A11003Bros_ccpc',fld:'BROS_CCPC',pic:''},{av:'A11004Bros_cctq',fld:'BROS_CCTQ',pic:''},{av:'A11005Bros_cccc',fld:'BROS_CCCC',pic:''},{av:'A11006Bros_ccec',fld:'BROS_CCEC',pic:''},{av:'A11008Bros_ccmc1',fld:'BROS_CCMC1',pic:''},{av:'A11009Bros_ccmc2',fld:'BROS_CCMC2',pic:''},{av:'A11010Bros_ccmc3',fld:'BROS_CCMC3',pic:''},{av:'A11011Bros_ccmc4',fld:'BROS_CCMC4',pic:''},{av:'A11012Bros_ccmc5',fld:'BROS_CCMC5',pic:''},{av:'A11013Bros_ccmc6',fld:'BROS_CCMC6',pic:''},{av:'A11015Bros_rb',fld:'BROS_RB',pic:''},{av:'A11017Bros_rbe',fld:'BROS_RBE',pic:''},{av:'A11016Bros_rbi',fld:'BROS_RBI',pic:''},{av:'A11018Bros_rbp',fld:'BROS_RBP',pic:''},{av:'A11020Bros_rb1',fld:'BROS_RB1',pic:''},{av:'A11021Bros_rb3',fld:'BROS_RB3',pic:''},{av:'A11023Bros_ep1',fld:'BROS_EP1',pic:''},{av:'A11024Bros_ep2',fld:'BROS_EP2',pic:''},{av:'A11025Bros_ep3',fld:'BROS_EP3',pic:''},{av:'A11026Bros_ep4',fld:'BROS_EP4',pic:''},{av:'A11027Bros_ep5',fld:'BROS_EP5',pic:''},{av:'A11028Bros_ep6',fld:'BROS_EP6',pic:''},{av:'A11029Bros_ep7',fld:'BROS_EP7',pic:''},{av:'A11030Bros_ep8',fld:'BROS_EP8',pic:''},{av:'A11031Bros_ep9',fld:'BROS_EP9',pic:''},{av:'A11032Bros_ep10',fld:'BROS_EP10',pic:''},{av:'A11034Bros_sa1',fld:'BROS_SA1',pic:''},{av:'A11035Bros_sa2',fld:'BROS_SA2',pic:''},{av:'A11036Bros_sa3',fld:'BROS_SA3',pic:''},{av:'A11038Bros_sa5',fld:'BROS_SA5',pic:''},{av:'A11039Bros_sa6',fld:'BROS_SA6',pic:''},{av:'A11066Bros_stk',fld:'BROS_STK',pic:''},{av:'edtBros_Pp_Enabled',ctrl:'BROS_PP',prop:'Enabled'},{av:'edtBros_Pd_Enabled',ctrl:'BROS_PD',prop:'Enabled'},{av:'edtTrnCod_Enabled',ctrl:'TRNCOD',prop:'Enabled'},{av:'edtBros_bob_Enabled',ctrl:'BROS_BOB',prop:'Enabled'},{av:'edtBros_boe_Enabled',ctrl:'BROS_BOE',prop:'Enabled'}]");
      setEventMetadata("VALID_BROS_ART",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10979Bros_Mcot',fld:'BROS_MCOT',pic:''},{av:'A10980Bros_Pd',fld:'BROS_PD',pic:''},{av:'A10981Bros_Pp',fld:'BROS_PP',pic:''},{av:'A10982Bros_Ag',fld:'BROS_AG',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A10983Bros_c1',fld:'BROS_C1',pic:''},{av:'A10984Bros_c2',fld:'BROS_C2',pic:''},{av:'A10985Bros_bo',fld:'BROS_BO',pic:''},{av:'A10986Bros_bob',fld:'BROS_BOB',pic:''},{av:'A10987Bros_boe',fld:'BROS_BOE',pic:''},{av:'cmbBrosBov'},{av:'A10988BrosBov',fld:'BROSBOV',pic:''},{av:'A10989Bros_c3',fld:'BROS_C3',pic:''},{av:'A10990Bros_tns',fld:'BROS_TNS',pic:''},{av:'A10991Bros_tnc',fld:'BROS_TNC',pic:''},{av:'A10992Bros_c4',fld:'BROS_C4',pic:''},{av:'A10993Bros_ct',fld:'BROS_CT',pic:''},{av:'A10994Bros_c5',fld:'BROS_C5',pic:''},{av:'A10995Bros_scs',fld:'BROS_SCS',pic:''},{av:'A10996Bros_scc',fld:'BROS_SCC',pic:''},{av:'A10997Bros_c6',fld:'BROS_C6',pic:''},{av:'A10998Bros_cctse',fld:'BROS_CCTSE',pic:''},{av:'A10999Bros_ccttp',fld:'BROS_CCTTP',pic:''},{av:'A11000Bros_cctet',fld:'BROS_CCTET',pic:''},{av:'A11001Bros_ccp',fld:'BROS_CCP',pic:'Z9'},{av:'A11002Bros_cct',fld:'BROS_CCT',pic:'Z9'},{av:'A11003Bros_ccpc',fld:'BROS_CCPC',pic:''},{av:'A11004Bros_cctq',fld:'BROS_CCTQ',pic:''},{av:'A11005Bros_cccc',fld:'BROS_CCCC',pic:''},{av:'A11006Bros_ccec',fld:'BROS_CCEC',pic:''},{av:'A11008Bros_ccmc1',fld:'BROS_CCMC1',pic:''},{av:'A11009Bros_ccmc2',fld:'BROS_CCMC2',pic:''},{av:'A11010Bros_ccmc3',fld:'BROS_CCMC3',pic:''},{av:'A11011Bros_ccmc4',fld:'BROS_CCMC4',pic:''},{av:'A11012Bros_ccmc5',fld:'BROS_CCMC5',pic:''},{av:'A11013Bros_ccmc6',fld:'BROS_CCMC6',pic:''},{av:'A11014Bros_c7',fld:'BROS_C7',pic:''},{av:'A11015Bros_rb',fld:'BROS_RB',pic:''},{av:'A11016Bros_rbi',fld:'BROS_RBI',pic:''},{av:'A11017Bros_rbe',fld:'BROS_RBE',pic:''},{av:'A11018Bros_rbp',fld:'BROS_RBP',pic:''},{av:'A11019Bros_rboc',fld:'BROS_RBOC',pic:'ZZ9'},{av:'A11020Bros_rb1',fld:'BROS_RB1',pic:''},{av:'A11021Bros_rb3',fld:'BROS_RB3',pic:''},{av:'A11022Bros_c8',fld:'BROS_C8',pic:''},{av:'A11023Bros_ep1',fld:'BROS_EP1',pic:''},{av:'A11024Bros_ep2',fld:'BROS_EP2',pic:''},{av:'A11025Bros_ep3',fld:'BROS_EP3',pic:''},{av:'A11026Bros_ep4',fld:'BROS_EP4',pic:''},{av:'A11027Bros_ep5',fld:'BROS_EP5',pic:''},{av:'A11028Bros_ep6',fld:'BROS_EP6',pic:''},{av:'A11029Bros_ep7',fld:'BROS_EP7',pic:''},{av:'A11030Bros_ep8',fld:'BROS_EP8',pic:''},{av:'A11031Bros_ep9',fld:'BROS_EP9',pic:''},{av:'A11032Bros_ep10',fld:'BROS_EP10',pic:''},{av:'A11033Bros_c9',fld:'BROS_C9',pic:''},{av:'A11034Bros_sa1',fld:'BROS_SA1',pic:''},{av:'A11035Bros_sa2',fld:'BROS_SA2',pic:''},{av:'A11036Bros_sa3',fld:'BROS_SA3',pic:''},{av:'A11037Bros_sa4',fld:'BROS_SA4',pic:''},{av:'A11038Bros_sa5',fld:'BROS_SA5',pic:''},{av:'A11039Bros_sa6',fld:'BROS_SA6',pic:''},{av:'A11040Bros_c10',fld:'BROS_C10',pic:''},{av:'A11066Bros_stk',fld:'BROS_STK',pic:''},{av:'A11067Bros_Lbta',fld:'BROS_LBTA',pic:''},{av:'A11068Bros_Lbtp',fld:'BROS_LBTP',pic:'ZZZ9'},{av:'A11069Bros_c11',fld:'BROS_C11',pic:''},{av:'A11070Bros_c12',fld:'BROS_C12',pic:''},{av:'A11369Bros_imp1',fld:'BROS_IMP1',pic:''},{av:'A11370Bros_imp2',fld:'BROS_IMP2',pic:''},{av:'A11371Bros_imp3',fld:'BROS_IMP3',pic:''},{av:'A11372Bros_imp4',fld:'BROS_IMP4',pic:''},{av:'A11373Bros_imp5',fld:'BROS_IMP5',pic:''},{av:'A11374Bros_imp6',fld:'BROS_IMP6',pic:''},{av:'A11375Bros_imp7',fld:'BROS_IMP7',pic:''},{av:'A11376Bros_imp8',fld:'BROS_IMP8',pic:''},{av:'A11377Bros_imp9',fld:'BROS_IMP9',pic:''},{av:'A11378Bros_imp10',fld:'BROS_IMP10',pic:''},{av:'A11379Bros_imp11',fld:'BROS_IMP11',pic:''},{av:'A11380Bros_oekot',fld:'BROS_OEKOT',pic:''},{av:'A11381Bros_lavad',fld:'BROS_LAVAD',pic:''},{av:'A11382Bros_luz',fld:'BROS_LUZ',pic:''},{av:'A11383Bros_sudor',fld:'BROS_SUDOR',pic:''},{av:'A11384Bros_cloro',fld:'BROS_CLORO',pic:''},{av:'A11385Bros_aguam',fld:'BROS_AGUAM',pic:''},{av:'A11386Bros_termo',fld:'BROS_TERMO',pic:''},{av:'A11387Bros_humed',fld:'BROS_HUMED',pic:'Z9'},{av:'A11407Bros_obs1',fld:'BROS_OBS1',pic:''},{av:'A11408Bros_obs2',fld:'BROS_OBS2',pic:''},{av:'A11409Bros_obs3',fld:'BROS_OBS3',pic:''},{av:'A11410Bros_obs4',fld:'BROS_OBS4',pic:''},{av:'A11411Bros_obs5',fld:'BROS_OBS5',pic:''},{av:'A11412Bros_obs6',fld:'BROS_OBS6',pic:''},{av:'A11413Bros_obs7',fld:'BROS_OBS7',pic:''},{av:'A11414Bros_obs8',fld:'BROS_OBS8',pic:''},{av:'A11415Bros_obs9',fld:'BROS_OBS9',pic:''},{av:'A11416Bros_obs10',fld:'BROS_OBS10',pic:''},{av:'A11417Bros_obs11',fld:'BROS_OBS11',pic:''},{av:'A11703Bros_nc',fld:'BROS_NC',pic:'Z9'},{av:'A11704Bros_enc',fld:'BROS_ENC',pic:'ZZ9.99'},{av:'edtBros_Pp_Enabled',ctrl:'BROS_PP',prop:'Enabled'},{av:'edtBros_Pd_Enabled',ctrl:'BROS_PD',prop:'Enabled'},{av:'edtTrnCod_Enabled',ctrl:'TRNCOD',prop:'Enabled'},{av:'edtBros_bob_Enabled',ctrl:'BROS_BOB',prop:'Enabled'},{av:'edtBros_boe_Enabled',ctrl:'BROS_BOE',prop:'Enabled'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z10978Bros_Art'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z10979Bros_Mcot'},{av:'Z10980Bros_Pd'},{av:'Z10981Bros_Pp'},{av:'Z10982Bros_Ag'},{av:'Z840TrnCod'},{av:'Z10983Bros_c1'},{av:'Z10984Bros_c2'},{av:'Z10985Bros_bo'},{av:'Z10986Bros_bob'},{av:'Z10987Bros_boe'},{av:'Z10988BrosBov'},{av:'Z10989Bros_c3'},{av:'Z10990Bros_tns'},{av:'Z10991Bros_tnc'},{av:'Z10992Bros_c4'},{av:'Z10993Bros_ct'},{av:'Z10994Bros_c5'},{av:'Z10995Bros_scs'},{av:'Z10996Bros_scc'},{av:'Z10997Bros_c6'},{av:'Z10998Bros_cctse'},{av:'Z10999Bros_ccttp'},{av:'Z11000Bros_cctet'},{av:'Z11001Bros_ccp'},{av:'Z11002Bros_cct'},{av:'Z11003Bros_ccpc'},{av:'Z11004Bros_cctq'},{av:'Z11005Bros_cccc'},{av:'Z11006Bros_ccec'},{av:'Z11008Bros_ccmc1'},{av:'Z11009Bros_ccmc2'},{av:'Z11010Bros_ccmc3'},{av:'Z11011Bros_ccmc4'},{av:'Z11012Bros_ccmc5'},{av:'Z11013Bros_ccmc6'},{av:'Z11014Bros_c7'},{av:'Z11015Bros_rb'},{av:'Z11016Bros_rbi'},{av:'Z11017Bros_rbe'},{av:'Z11018Bros_rbp'},{av:'Z11019Bros_rboc'},{av:'Z11020Bros_rb1'},{av:'Z11021Bros_rb3'},{av:'Z11022Bros_c8'},{av:'Z11023Bros_ep1'},{av:'Z11024Bros_ep2'},{av:'Z11025Bros_ep3'},{av:'Z11026Bros_ep4'},{av:'Z11027Bros_ep5'},{av:'Z11028Bros_ep6'},{av:'Z11029Bros_ep7'},{av:'Z11030Bros_ep8'},{av:'Z11031Bros_ep9'},{av:'Z11032Bros_ep10'},{av:'Z11033Bros_c9'},{av:'Z11034Bros_sa1'},{av:'Z11035Bros_sa2'},{av:'Z11036Bros_sa3'},{av:'Z11037Bros_sa4'},{av:'Z11038Bros_sa5'},{av:'Z11039Bros_sa6'},{av:'Z11040Bros_c10'},{av:'Z11066Bros_stk'},{av:'Z11067Bros_Lbta'},{av:'Z11068Bros_Lbtp'},{av:'Z11069Bros_c11'},{av:'Z11070Bros_c12'},{av:'Z11369Bros_imp1'},{av:'Z11370Bros_imp2'},{av:'Z11371Bros_imp3'},{av:'Z11372Bros_imp4'},{av:'Z11373Bros_imp5'},{av:'Z11374Bros_imp6'},{av:'Z11375Bros_imp7'},{av:'Z11376Bros_imp8'},{av:'Z11377Bros_imp9'},{av:'Z11378Bros_imp10'},{av:'Z11379Bros_imp11'},{av:'Z11380Bros_oekot'},{av:'Z11381Bros_lavad'},{av:'Z11382Bros_luz'},{av:'Z11383Bros_sudor'},{av:'Z11384Bros_cloro'},{av:'Z11385Bros_aguam'},{av:'Z11386Bros_termo'},{av:'Z11387Bros_humed'},{av:'Z11407Bros_obs1'},{av:'Z11408Bros_obs2'},{av:'Z11409Bros_obs3'},{av:'Z11410Bros_obs4'},{av:'Z11411Bros_obs5'},{av:'Z11412Bros_obs6'},{av:'Z11413Bros_obs7'},{av:'Z11414Bros_obs8'},{av:'Z11415Bros_obs9'},{av:'Z11416Bros_obs10'},{av:'Z11417Bros_obs11'},{av:'Z11703Bros_nc'},{av:'Z11704Bros_enc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BROS_PD","{handler:'valid_Bros_pd',iparms:[]");
      setEventMetadata("VALID_BROS_PD",",oparms:[]}");
      setEventMetadata("VALID_BROS_PP","{handler:'valid_Bros_pp',iparms:[]");
      setEventMetadata("VALID_BROS_PP",",oparms:[]}");
      setEventMetadata("VALID_BROS_AG","{handler:'valid_Bros_ag',iparms:[]");
      setEventMetadata("VALID_BROS_AG",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_BROS_BO","{handler:'valid_Bros_bo',iparms:[]");
      setEventMetadata("VALID_BROS_BO",",oparms:[]}");
      setEventMetadata("VALID_BROS_BOB","{handler:'valid_Bros_bob',iparms:[]");
      setEventMetadata("VALID_BROS_BOB",",oparms:[]}");
      setEventMetadata("VALID_BROS_BOE","{handler:'valid_Bros_boe',iparms:[]");
      setEventMetadata("VALID_BROS_BOE",",oparms:[]}");
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
      pr_default.close(15);
      pr_default.close(14);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA10978Bros_Art = "" ;
      Z396EmprCod = "" ;
      Z10978Bros_Art = "" ;
      Z10979Bros_Mcot = "" ;
      Z10980Bros_Pd = "" ;
      Z10981Bros_Pp = "" ;
      Z10982Bros_Ag = "" ;
      Z10983Bros_c1 = "" ;
      Z10984Bros_c2 = "" ;
      Z10985Bros_bo = "" ;
      Z10986Bros_bob = "" ;
      Z10987Bros_boe = "" ;
      Z10988BrosBov = "" ;
      Z10989Bros_c3 = "" ;
      Z10990Bros_tns = "" ;
      Z10991Bros_tnc = "" ;
      Z10992Bros_c4 = "" ;
      Z10993Bros_ct = "" ;
      Z10994Bros_c5 = "" ;
      Z10995Bros_scs = "" ;
      Z10996Bros_scc = "" ;
      Z10997Bros_c6 = "" ;
      Z10998Bros_cctse = "" ;
      Z10999Bros_ccttp = "" ;
      Z11000Bros_cctet = "" ;
      Z11003Bros_ccpc = "" ;
      Z11004Bros_cctq = "" ;
      Z11005Bros_cccc = "" ;
      Z11006Bros_ccec = "" ;
      Z11008Bros_ccmc1 = "" ;
      Z11009Bros_ccmc2 = "" ;
      Z11010Bros_ccmc3 = "" ;
      Z11011Bros_ccmc4 = "" ;
      Z11012Bros_ccmc5 = "" ;
      Z11013Bros_ccmc6 = "" ;
      Z11014Bros_c7 = "" ;
      Z11015Bros_rb = "" ;
      Z11016Bros_rbi = "" ;
      Z11017Bros_rbe = "" ;
      Z11018Bros_rbp = "" ;
      Z11020Bros_rb1 = "" ;
      Z11021Bros_rb3 = "" ;
      Z11022Bros_c8 = "" ;
      Z11023Bros_ep1 = "" ;
      Z11024Bros_ep2 = "" ;
      Z11025Bros_ep3 = "" ;
      Z11026Bros_ep4 = "" ;
      Z11027Bros_ep5 = "" ;
      Z11028Bros_ep6 = "" ;
      Z11029Bros_ep7 = "" ;
      Z11030Bros_ep8 = "" ;
      Z11031Bros_ep9 = "" ;
      Z11032Bros_ep10 = "" ;
      Z11033Bros_c9 = "" ;
      Z11034Bros_sa1 = "" ;
      Z11035Bros_sa2 = "" ;
      Z11036Bros_sa3 = "" ;
      Z11037Bros_sa4 = "" ;
      Z11038Bros_sa5 = "" ;
      Z11039Bros_sa6 = "" ;
      Z11040Bros_c10 = "" ;
      Z11066Bros_stk = "" ;
      Z11067Bros_Lbta = "" ;
      Z11069Bros_c11 = "" ;
      Z11070Bros_c12 = "" ;
      Z11369Bros_imp1 = "" ;
      Z11370Bros_imp2 = "" ;
      Z11371Bros_imp3 = "" ;
      Z11372Bros_imp4 = "" ;
      Z11373Bros_imp5 = "" ;
      Z11374Bros_imp6 = "" ;
      Z11375Bros_imp7 = "" ;
      Z11376Bros_imp8 = "" ;
      Z11377Bros_imp9 = "" ;
      Z11378Bros_imp10 = "" ;
      Z11379Bros_imp11 = "" ;
      Z11380Bros_oekot = "" ;
      Z11381Bros_lavad = "" ;
      Z11382Bros_luz = "" ;
      Z11383Bros_sudor = "" ;
      Z11384Bros_cloro = "" ;
      Z11385Bros_aguam = "" ;
      Z11386Bros_termo = "" ;
      Z11407Bros_obs1 = "" ;
      Z11408Bros_obs2 = "" ;
      Z11409Bros_obs3 = "" ;
      Z11410Bros_obs4 = "" ;
      Z11411Bros_obs5 = "" ;
      Z11412Bros_obs6 = "" ;
      Z11413Bros_obs7 = "" ;
      Z11414Bros_obs8 = "" ;
      Z11415Bros_obs9 = "" ;
      Z11416Bros_obs10 = "" ;
      Z11417Bros_obs11 = "" ;
      Z11704Bros_enc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10978Bros_Art = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10988BrosBov = "" ;
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
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10979Bros_Mcot = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10980Bros_Pd = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10981Bros_Pp = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10982Bros_Ag = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10983Bros_c1 = "" ;
      lblTextblock12_Jsonclick = "" ;
      A10984Bros_c2 = "" ;
      lblTextblock13_Jsonclick = "" ;
      A10985Bros_bo = "" ;
      lblTextblock14_Jsonclick = "" ;
      A10986Bros_bob = "" ;
      lblTextblock15_Jsonclick = "" ;
      A10987Bros_boe = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A10989Bros_c3 = "" ;
      lblTextblock18_Jsonclick = "" ;
      A10990Bros_tns = "" ;
      lblTextblock19_Jsonclick = "" ;
      A10991Bros_tnc = "" ;
      lblTextblock20_Jsonclick = "" ;
      A10992Bros_c4 = "" ;
      lblTextblock21_Jsonclick = "" ;
      A10993Bros_ct = "" ;
      lblTextblock22_Jsonclick = "" ;
      A10994Bros_c5 = "" ;
      lblTextblock23_Jsonclick = "" ;
      A10995Bros_scs = "" ;
      lblTextblock24_Jsonclick = "" ;
      A10996Bros_scc = "" ;
      lblTextblock25_Jsonclick = "" ;
      A10997Bros_c6 = "" ;
      lblTextblock26_Jsonclick = "" ;
      A10998Bros_cctse = "" ;
      lblTextblock27_Jsonclick = "" ;
      A10999Bros_ccttp = "" ;
      lblTextblock28_Jsonclick = "" ;
      A11000Bros_cctet = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A11003Bros_ccpc = "" ;
      lblTextblock32_Jsonclick = "" ;
      A11004Bros_cctq = "" ;
      lblTextblock33_Jsonclick = "" ;
      A11005Bros_cccc = "" ;
      lblTextblock34_Jsonclick = "" ;
      A11006Bros_ccec = "" ;
      lblTextblock35_Jsonclick = "" ;
      A11008Bros_ccmc1 = "" ;
      lblTextblock36_Jsonclick = "" ;
      A11009Bros_ccmc2 = "" ;
      lblTextblock37_Jsonclick = "" ;
      A11010Bros_ccmc3 = "" ;
      lblTextblock38_Jsonclick = "" ;
      A11011Bros_ccmc4 = "" ;
      lblTextblock39_Jsonclick = "" ;
      A11012Bros_ccmc5 = "" ;
      lblTextblock40_Jsonclick = "" ;
      A11013Bros_ccmc6 = "" ;
      lblTextblock41_Jsonclick = "" ;
      A11014Bros_c7 = "" ;
      lblTextblock42_Jsonclick = "" ;
      A11015Bros_rb = "" ;
      lblTextblock43_Jsonclick = "" ;
      A11016Bros_rbi = "" ;
      lblTextblock44_Jsonclick = "" ;
      A11017Bros_rbe = "" ;
      lblTextblock45_Jsonclick = "" ;
      A11018Bros_rbp = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
      A11020Bros_rb1 = "" ;
      lblTextblock48_Jsonclick = "" ;
      A11021Bros_rb3 = "" ;
      lblTextblock49_Jsonclick = "" ;
      A11022Bros_c8 = "" ;
      lblTextblock50_Jsonclick = "" ;
      A11023Bros_ep1 = "" ;
      lblTextblock51_Jsonclick = "" ;
      A11024Bros_ep2 = "" ;
      lblTextblock52_Jsonclick = "" ;
      A11025Bros_ep3 = "" ;
      lblTextblock53_Jsonclick = "" ;
      A11026Bros_ep4 = "" ;
      lblTextblock54_Jsonclick = "" ;
      A11027Bros_ep5 = "" ;
      lblTextblock55_Jsonclick = "" ;
      A11028Bros_ep6 = "" ;
      lblTextblock56_Jsonclick = "" ;
      A11029Bros_ep7 = "" ;
      lblTextblock57_Jsonclick = "" ;
      A11030Bros_ep8 = "" ;
      lblTextblock58_Jsonclick = "" ;
      A11031Bros_ep9 = "" ;
      lblTextblock59_Jsonclick = "" ;
      A11032Bros_ep10 = "" ;
      lblTextblock60_Jsonclick = "" ;
      A11033Bros_c9 = "" ;
      lblTextblock61_Jsonclick = "" ;
      A11034Bros_sa1 = "" ;
      lblTextblock62_Jsonclick = "" ;
      A11035Bros_sa2 = "" ;
      lblTextblock63_Jsonclick = "" ;
      A11036Bros_sa3 = "" ;
      lblTextblock64_Jsonclick = "" ;
      A11037Bros_sa4 = "" ;
      lblTextblock65_Jsonclick = "" ;
      A11038Bros_sa5 = "" ;
      lblTextblock66_Jsonclick = "" ;
      A11039Bros_sa6 = "" ;
      lblTextblock67_Jsonclick = "" ;
      A11040Bros_c10 = "" ;
      lblTextblock68_Jsonclick = "" ;
      A11066Bros_stk = "" ;
      lblTextblock69_Jsonclick = "" ;
      A11067Bros_Lbta = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock71_Jsonclick = "" ;
      A11069Bros_c11 = "" ;
      lblTextblock72_Jsonclick = "" ;
      A11070Bros_c12 = "" ;
      lblTextblock73_Jsonclick = "" ;
      A11369Bros_imp1 = "" ;
      lblTextblock74_Jsonclick = "" ;
      A11370Bros_imp2 = "" ;
      lblTextblock75_Jsonclick = "" ;
      A11371Bros_imp3 = "" ;
      lblTextblock76_Jsonclick = "" ;
      A11372Bros_imp4 = "" ;
      lblTextblock77_Jsonclick = "" ;
      A11373Bros_imp5 = "" ;
      lblTextblock78_Jsonclick = "" ;
      A11374Bros_imp6 = "" ;
      lblTextblock79_Jsonclick = "" ;
      A11375Bros_imp7 = "" ;
      lblTextblock80_Jsonclick = "" ;
      A11376Bros_imp8 = "" ;
      lblTextblock81_Jsonclick = "" ;
      A11377Bros_imp9 = "" ;
      lblTextblock82_Jsonclick = "" ;
      A11378Bros_imp10 = "" ;
      lblTextblock83_Jsonclick = "" ;
      A11379Bros_imp11 = "" ;
      lblTextblock84_Jsonclick = "" ;
      A11380Bros_oekot = "" ;
      lblTextblock85_Jsonclick = "" ;
      A11381Bros_lavad = "" ;
      lblTextblock86_Jsonclick = "" ;
      A11382Bros_luz = "" ;
      lblTextblock87_Jsonclick = "" ;
      A11383Bros_sudor = "" ;
      lblTextblock88_Jsonclick = "" ;
      A11384Bros_cloro = "" ;
      lblTextblock89_Jsonclick = "" ;
      A11385Bros_aguam = "" ;
      lblTextblock90_Jsonclick = "" ;
      A11386Bros_termo = "" ;
      lblTextblock91_Jsonclick = "" ;
      lblTextblock92_Jsonclick = "" ;
      A11407Bros_obs1 = "" ;
      lblTextblock93_Jsonclick = "" ;
      A11408Bros_obs2 = "" ;
      lblTextblock94_Jsonclick = "" ;
      A11409Bros_obs3 = "" ;
      lblTextblock95_Jsonclick = "" ;
      A11410Bros_obs4 = "" ;
      lblTextblock96_Jsonclick = "" ;
      A11411Bros_obs5 = "" ;
      lblTextblock97_Jsonclick = "" ;
      A11412Bros_obs6 = "" ;
      lblTextblock98_Jsonclick = "" ;
      A11413Bros_obs7 = "" ;
      lblTextblock99_Jsonclick = "" ;
      A11414Bros_obs8 = "" ;
      lblTextblock100_Jsonclick = "" ;
      A11415Bros_obs9 = "" ;
      lblTextblock101_Jsonclick = "" ;
      A11416Bros_obs10 = "" ;
      lblTextblock102_Jsonclick = "" ;
      A11417Bros_obs11 = "" ;
      lblTextblock103_Jsonclick = "" ;
      lblTextblock104_Jsonclick = "" ;
      A11704Bros_enc = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01AF4_A407EmprNom = new String[] {""} ;
      T01AF4_n407EmprNom = new boolean[] {false} ;
      T01AF5_A279CliNom = new String[] {""} ;
      T01AF7_A11704Bros_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AF7_n11704Bros_enc = new boolean[] {false} ;
      T01AF7_A396EmprCod = new String[] {""} ;
      T01AF7_A252CliCod = new int[1] ;
      T01AF7_A840TrnCod = new short[1] ;
      T01AF7_n840TrnCod = new boolean[] {false} ;
      T01AF7_A10978Bros_Art = new String[] {""} ;
      T01AF7_A407EmprNom = new String[] {""} ;
      T01AF7_n407EmprNom = new boolean[] {false} ;
      T01AF7_A279CliNom = new String[] {""} ;
      T01AF7_A10979Bros_Mcot = new String[] {""} ;
      T01AF7_n10979Bros_Mcot = new boolean[] {false} ;
      T01AF7_A10980Bros_Pd = new String[] {""} ;
      T01AF7_n10980Bros_Pd = new boolean[] {false} ;
      T01AF7_A10981Bros_Pp = new String[] {""} ;
      T01AF7_n10981Bros_Pp = new boolean[] {false} ;
      T01AF7_A10982Bros_Ag = new String[] {""} ;
      T01AF7_n10982Bros_Ag = new boolean[] {false} ;
      T01AF7_A10983Bros_c1 = new String[] {""} ;
      T01AF7_n10983Bros_c1 = new boolean[] {false} ;
      T01AF7_A10984Bros_c2 = new String[] {""} ;
      T01AF7_n10984Bros_c2 = new boolean[] {false} ;
      T01AF7_A10985Bros_bo = new String[] {""} ;
      T01AF7_n10985Bros_bo = new boolean[] {false} ;
      T01AF7_A10986Bros_bob = new String[] {""} ;
      T01AF7_n10986Bros_bob = new boolean[] {false} ;
      T01AF7_A10987Bros_boe = new String[] {""} ;
      T01AF7_n10987Bros_boe = new boolean[] {false} ;
      T01AF7_A10988BrosBov = new String[] {""} ;
      T01AF7_n10988BrosBov = new boolean[] {false} ;
      T01AF7_A10989Bros_c3 = new String[] {""} ;
      T01AF7_n10989Bros_c3 = new boolean[] {false} ;
      T01AF7_A10990Bros_tns = new String[] {""} ;
      T01AF7_n10990Bros_tns = new boolean[] {false} ;
      T01AF7_A10991Bros_tnc = new String[] {""} ;
      T01AF7_n10991Bros_tnc = new boolean[] {false} ;
      T01AF7_A10992Bros_c4 = new String[] {""} ;
      T01AF7_n10992Bros_c4 = new boolean[] {false} ;
      T01AF7_A10993Bros_ct = new String[] {""} ;
      T01AF7_n10993Bros_ct = new boolean[] {false} ;
      T01AF7_A10994Bros_c5 = new String[] {""} ;
      T01AF7_n10994Bros_c5 = new boolean[] {false} ;
      T01AF7_A10995Bros_scs = new String[] {""} ;
      T01AF7_n10995Bros_scs = new boolean[] {false} ;
      T01AF7_A10996Bros_scc = new String[] {""} ;
      T01AF7_n10996Bros_scc = new boolean[] {false} ;
      T01AF7_A10997Bros_c6 = new String[] {""} ;
      T01AF7_n10997Bros_c6 = new boolean[] {false} ;
      T01AF7_A10998Bros_cctse = new String[] {""} ;
      T01AF7_n10998Bros_cctse = new boolean[] {false} ;
      T01AF7_A10999Bros_ccttp = new String[] {""} ;
      T01AF7_n10999Bros_ccttp = new boolean[] {false} ;
      T01AF7_A11000Bros_cctet = new String[] {""} ;
      T01AF7_n11000Bros_cctet = new boolean[] {false} ;
      T01AF7_A11001Bros_ccp = new byte[1] ;
      T01AF7_n11001Bros_ccp = new boolean[] {false} ;
      T01AF7_A11002Bros_cct = new byte[1] ;
      T01AF7_n11002Bros_cct = new boolean[] {false} ;
      T01AF7_A11003Bros_ccpc = new String[] {""} ;
      T01AF7_n11003Bros_ccpc = new boolean[] {false} ;
      T01AF7_A11004Bros_cctq = new String[] {""} ;
      T01AF7_n11004Bros_cctq = new boolean[] {false} ;
      T01AF7_A11005Bros_cccc = new String[] {""} ;
      T01AF7_n11005Bros_cccc = new boolean[] {false} ;
      T01AF7_A11006Bros_ccec = new String[] {""} ;
      T01AF7_n11006Bros_ccec = new boolean[] {false} ;
      T01AF7_A11008Bros_ccmc1 = new String[] {""} ;
      T01AF7_n11008Bros_ccmc1 = new boolean[] {false} ;
      T01AF7_A11009Bros_ccmc2 = new String[] {""} ;
      T01AF7_n11009Bros_ccmc2 = new boolean[] {false} ;
      T01AF7_A11010Bros_ccmc3 = new String[] {""} ;
      T01AF7_n11010Bros_ccmc3 = new boolean[] {false} ;
      T01AF7_A11011Bros_ccmc4 = new String[] {""} ;
      T01AF7_n11011Bros_ccmc4 = new boolean[] {false} ;
      T01AF7_A11012Bros_ccmc5 = new String[] {""} ;
      T01AF7_n11012Bros_ccmc5 = new boolean[] {false} ;
      T01AF7_A11013Bros_ccmc6 = new String[] {""} ;
      T01AF7_n11013Bros_ccmc6 = new boolean[] {false} ;
      T01AF7_A11014Bros_c7 = new String[] {""} ;
      T01AF7_n11014Bros_c7 = new boolean[] {false} ;
      T01AF7_A11015Bros_rb = new String[] {""} ;
      T01AF7_n11015Bros_rb = new boolean[] {false} ;
      T01AF7_A11016Bros_rbi = new String[] {""} ;
      T01AF7_n11016Bros_rbi = new boolean[] {false} ;
      T01AF7_A11017Bros_rbe = new String[] {""} ;
      T01AF7_n11017Bros_rbe = new boolean[] {false} ;
      T01AF7_A11018Bros_rbp = new String[] {""} ;
      T01AF7_n11018Bros_rbp = new boolean[] {false} ;
      T01AF7_A11019Bros_rboc = new short[1] ;
      T01AF7_n11019Bros_rboc = new boolean[] {false} ;
      T01AF7_A11020Bros_rb1 = new String[] {""} ;
      T01AF7_n11020Bros_rb1 = new boolean[] {false} ;
      T01AF7_A11021Bros_rb3 = new String[] {""} ;
      T01AF7_n11021Bros_rb3 = new boolean[] {false} ;
      T01AF7_A11022Bros_c8 = new String[] {""} ;
      T01AF7_n11022Bros_c8 = new boolean[] {false} ;
      T01AF7_A11023Bros_ep1 = new String[] {""} ;
      T01AF7_n11023Bros_ep1 = new boolean[] {false} ;
      T01AF7_A11024Bros_ep2 = new String[] {""} ;
      T01AF7_n11024Bros_ep2 = new boolean[] {false} ;
      T01AF7_A11025Bros_ep3 = new String[] {""} ;
      T01AF7_n11025Bros_ep3 = new boolean[] {false} ;
      T01AF7_A11026Bros_ep4 = new String[] {""} ;
      T01AF7_n11026Bros_ep4 = new boolean[] {false} ;
      T01AF7_A11027Bros_ep5 = new String[] {""} ;
      T01AF7_n11027Bros_ep5 = new boolean[] {false} ;
      T01AF7_A11028Bros_ep6 = new String[] {""} ;
      T01AF7_n11028Bros_ep6 = new boolean[] {false} ;
      T01AF7_A11029Bros_ep7 = new String[] {""} ;
      T01AF7_n11029Bros_ep7 = new boolean[] {false} ;
      T01AF7_A11030Bros_ep8 = new String[] {""} ;
      T01AF7_n11030Bros_ep8 = new boolean[] {false} ;
      T01AF7_A11031Bros_ep9 = new String[] {""} ;
      T01AF7_n11031Bros_ep9 = new boolean[] {false} ;
      T01AF7_A11032Bros_ep10 = new String[] {""} ;
      T01AF7_n11032Bros_ep10 = new boolean[] {false} ;
      T01AF7_A11033Bros_c9 = new String[] {""} ;
      T01AF7_n11033Bros_c9 = new boolean[] {false} ;
      T01AF7_A11034Bros_sa1 = new String[] {""} ;
      T01AF7_n11034Bros_sa1 = new boolean[] {false} ;
      T01AF7_A11035Bros_sa2 = new String[] {""} ;
      T01AF7_n11035Bros_sa2 = new boolean[] {false} ;
      T01AF7_A11036Bros_sa3 = new String[] {""} ;
      T01AF7_n11036Bros_sa3 = new boolean[] {false} ;
      T01AF7_A11037Bros_sa4 = new String[] {""} ;
      T01AF7_n11037Bros_sa4 = new boolean[] {false} ;
      T01AF7_A11038Bros_sa5 = new String[] {""} ;
      T01AF7_n11038Bros_sa5 = new boolean[] {false} ;
      T01AF7_A11039Bros_sa6 = new String[] {""} ;
      T01AF7_n11039Bros_sa6 = new boolean[] {false} ;
      T01AF7_A11040Bros_c10 = new String[] {""} ;
      T01AF7_n11040Bros_c10 = new boolean[] {false} ;
      T01AF7_A11066Bros_stk = new String[] {""} ;
      T01AF7_n11066Bros_stk = new boolean[] {false} ;
      T01AF7_A11067Bros_Lbta = new String[] {""} ;
      T01AF7_n11067Bros_Lbta = new boolean[] {false} ;
      T01AF7_A11068Bros_Lbtp = new short[1] ;
      T01AF7_n11068Bros_Lbtp = new boolean[] {false} ;
      T01AF7_A11069Bros_c11 = new String[] {""} ;
      T01AF7_n11069Bros_c11 = new boolean[] {false} ;
      T01AF7_A11070Bros_c12 = new String[] {""} ;
      T01AF7_n11070Bros_c12 = new boolean[] {false} ;
      T01AF7_A11369Bros_imp1 = new String[] {""} ;
      T01AF7_n11369Bros_imp1 = new boolean[] {false} ;
      T01AF7_A11370Bros_imp2 = new String[] {""} ;
      T01AF7_n11370Bros_imp2 = new boolean[] {false} ;
      T01AF7_A11371Bros_imp3 = new String[] {""} ;
      T01AF7_n11371Bros_imp3 = new boolean[] {false} ;
      T01AF7_A11372Bros_imp4 = new String[] {""} ;
      T01AF7_n11372Bros_imp4 = new boolean[] {false} ;
      T01AF7_A11373Bros_imp5 = new String[] {""} ;
      T01AF7_n11373Bros_imp5 = new boolean[] {false} ;
      T01AF7_A11374Bros_imp6 = new String[] {""} ;
      T01AF7_n11374Bros_imp6 = new boolean[] {false} ;
      T01AF7_A11375Bros_imp7 = new String[] {""} ;
      T01AF7_n11375Bros_imp7 = new boolean[] {false} ;
      T01AF7_A11376Bros_imp8 = new String[] {""} ;
      T01AF7_n11376Bros_imp8 = new boolean[] {false} ;
      T01AF7_A11377Bros_imp9 = new String[] {""} ;
      T01AF7_n11377Bros_imp9 = new boolean[] {false} ;
      T01AF7_A11378Bros_imp10 = new String[] {""} ;
      T01AF7_n11378Bros_imp10 = new boolean[] {false} ;
      T01AF7_A11379Bros_imp11 = new String[] {""} ;
      T01AF7_n11379Bros_imp11 = new boolean[] {false} ;
      T01AF7_A11380Bros_oekot = new String[] {""} ;
      T01AF7_n11380Bros_oekot = new boolean[] {false} ;
      T01AF7_A11381Bros_lavad = new String[] {""} ;
      T01AF7_n11381Bros_lavad = new boolean[] {false} ;
      T01AF7_A11382Bros_luz = new String[] {""} ;
      T01AF7_n11382Bros_luz = new boolean[] {false} ;
      T01AF7_A11383Bros_sudor = new String[] {""} ;
      T01AF7_n11383Bros_sudor = new boolean[] {false} ;
      T01AF7_A11384Bros_cloro = new String[] {""} ;
      T01AF7_n11384Bros_cloro = new boolean[] {false} ;
      T01AF7_A11385Bros_aguam = new String[] {""} ;
      T01AF7_n11385Bros_aguam = new boolean[] {false} ;
      T01AF7_A11386Bros_termo = new String[] {""} ;
      T01AF7_n11386Bros_termo = new boolean[] {false} ;
      T01AF7_A11387Bros_humed = new byte[1] ;
      T01AF7_n11387Bros_humed = new boolean[] {false} ;
      T01AF7_A11407Bros_obs1 = new String[] {""} ;
      T01AF7_n11407Bros_obs1 = new boolean[] {false} ;
      T01AF7_A11408Bros_obs2 = new String[] {""} ;
      T01AF7_n11408Bros_obs2 = new boolean[] {false} ;
      T01AF7_A11409Bros_obs3 = new String[] {""} ;
      T01AF7_n11409Bros_obs3 = new boolean[] {false} ;
      T01AF7_A11410Bros_obs4 = new String[] {""} ;
      T01AF7_n11410Bros_obs4 = new boolean[] {false} ;
      T01AF7_A11411Bros_obs5 = new String[] {""} ;
      T01AF7_n11411Bros_obs5 = new boolean[] {false} ;
      T01AF7_A11412Bros_obs6 = new String[] {""} ;
      T01AF7_n11412Bros_obs6 = new boolean[] {false} ;
      T01AF7_A11413Bros_obs7 = new String[] {""} ;
      T01AF7_n11413Bros_obs7 = new boolean[] {false} ;
      T01AF7_A11414Bros_obs8 = new String[] {""} ;
      T01AF7_n11414Bros_obs8 = new boolean[] {false} ;
      T01AF7_A11415Bros_obs9 = new String[] {""} ;
      T01AF7_n11415Bros_obs9 = new boolean[] {false} ;
      T01AF7_A11416Bros_obs10 = new String[] {""} ;
      T01AF7_n11416Bros_obs10 = new boolean[] {false} ;
      T01AF7_A11417Bros_obs11 = new String[] {""} ;
      T01AF7_n11417Bros_obs11 = new boolean[] {false} ;
      T01AF7_A11703Bros_nc = new byte[1] ;
      T01AF7_n11703Bros_nc = new boolean[] {false} ;
      T01AF6_A396EmprCod = new String[] {""} ;
      T01AF8_A396EmprCod = new String[] {""} ;
      T01AF9_A396EmprCod = new String[] {""} ;
      T01AF9_A252CliCod = new int[1] ;
      T01AF9_A10978Bros_Art = new String[] {""} ;
      T01AF3_A11704Bros_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AF3_n11704Bros_enc = new boolean[] {false} ;
      T01AF3_A396EmprCod = new String[] {""} ;
      T01AF3_A252CliCod = new int[1] ;
      T01AF3_A840TrnCod = new short[1] ;
      T01AF3_n840TrnCod = new boolean[] {false} ;
      T01AF3_A10978Bros_Art = new String[] {""} ;
      T01AF3_A10979Bros_Mcot = new String[] {""} ;
      T01AF3_n10979Bros_Mcot = new boolean[] {false} ;
      T01AF3_A10980Bros_Pd = new String[] {""} ;
      T01AF3_n10980Bros_Pd = new boolean[] {false} ;
      T01AF3_A10981Bros_Pp = new String[] {""} ;
      T01AF3_n10981Bros_Pp = new boolean[] {false} ;
      T01AF3_A10982Bros_Ag = new String[] {""} ;
      T01AF3_n10982Bros_Ag = new boolean[] {false} ;
      T01AF3_A10983Bros_c1 = new String[] {""} ;
      T01AF3_n10983Bros_c1 = new boolean[] {false} ;
      T01AF3_A10984Bros_c2 = new String[] {""} ;
      T01AF3_n10984Bros_c2 = new boolean[] {false} ;
      T01AF3_A10985Bros_bo = new String[] {""} ;
      T01AF3_n10985Bros_bo = new boolean[] {false} ;
      T01AF3_A10986Bros_bob = new String[] {""} ;
      T01AF3_n10986Bros_bob = new boolean[] {false} ;
      T01AF3_A10987Bros_boe = new String[] {""} ;
      T01AF3_n10987Bros_boe = new boolean[] {false} ;
      T01AF3_A10988BrosBov = new String[] {""} ;
      T01AF3_n10988BrosBov = new boolean[] {false} ;
      T01AF3_A10989Bros_c3 = new String[] {""} ;
      T01AF3_n10989Bros_c3 = new boolean[] {false} ;
      T01AF3_A10990Bros_tns = new String[] {""} ;
      T01AF3_n10990Bros_tns = new boolean[] {false} ;
      T01AF3_A10991Bros_tnc = new String[] {""} ;
      T01AF3_n10991Bros_tnc = new boolean[] {false} ;
      T01AF3_A10992Bros_c4 = new String[] {""} ;
      T01AF3_n10992Bros_c4 = new boolean[] {false} ;
      T01AF3_A10993Bros_ct = new String[] {""} ;
      T01AF3_n10993Bros_ct = new boolean[] {false} ;
      T01AF3_A10994Bros_c5 = new String[] {""} ;
      T01AF3_n10994Bros_c5 = new boolean[] {false} ;
      T01AF3_A10995Bros_scs = new String[] {""} ;
      T01AF3_n10995Bros_scs = new boolean[] {false} ;
      T01AF3_A10996Bros_scc = new String[] {""} ;
      T01AF3_n10996Bros_scc = new boolean[] {false} ;
      T01AF3_A10997Bros_c6 = new String[] {""} ;
      T01AF3_n10997Bros_c6 = new boolean[] {false} ;
      T01AF3_A10998Bros_cctse = new String[] {""} ;
      T01AF3_n10998Bros_cctse = new boolean[] {false} ;
      T01AF3_A10999Bros_ccttp = new String[] {""} ;
      T01AF3_n10999Bros_ccttp = new boolean[] {false} ;
      T01AF3_A11000Bros_cctet = new String[] {""} ;
      T01AF3_n11000Bros_cctet = new boolean[] {false} ;
      T01AF3_A11001Bros_ccp = new byte[1] ;
      T01AF3_n11001Bros_ccp = new boolean[] {false} ;
      T01AF3_A11002Bros_cct = new byte[1] ;
      T01AF3_n11002Bros_cct = new boolean[] {false} ;
      T01AF3_A11003Bros_ccpc = new String[] {""} ;
      T01AF3_n11003Bros_ccpc = new boolean[] {false} ;
      T01AF3_A11004Bros_cctq = new String[] {""} ;
      T01AF3_n11004Bros_cctq = new boolean[] {false} ;
      T01AF3_A11005Bros_cccc = new String[] {""} ;
      T01AF3_n11005Bros_cccc = new boolean[] {false} ;
      T01AF3_A11006Bros_ccec = new String[] {""} ;
      T01AF3_n11006Bros_ccec = new boolean[] {false} ;
      T01AF3_A11008Bros_ccmc1 = new String[] {""} ;
      T01AF3_n11008Bros_ccmc1 = new boolean[] {false} ;
      T01AF3_A11009Bros_ccmc2 = new String[] {""} ;
      T01AF3_n11009Bros_ccmc2 = new boolean[] {false} ;
      T01AF3_A11010Bros_ccmc3 = new String[] {""} ;
      T01AF3_n11010Bros_ccmc3 = new boolean[] {false} ;
      T01AF3_A11011Bros_ccmc4 = new String[] {""} ;
      T01AF3_n11011Bros_ccmc4 = new boolean[] {false} ;
      T01AF3_A11012Bros_ccmc5 = new String[] {""} ;
      T01AF3_n11012Bros_ccmc5 = new boolean[] {false} ;
      T01AF3_A11013Bros_ccmc6 = new String[] {""} ;
      T01AF3_n11013Bros_ccmc6 = new boolean[] {false} ;
      T01AF3_A11014Bros_c7 = new String[] {""} ;
      T01AF3_n11014Bros_c7 = new boolean[] {false} ;
      T01AF3_A11015Bros_rb = new String[] {""} ;
      T01AF3_n11015Bros_rb = new boolean[] {false} ;
      T01AF3_A11016Bros_rbi = new String[] {""} ;
      T01AF3_n11016Bros_rbi = new boolean[] {false} ;
      T01AF3_A11017Bros_rbe = new String[] {""} ;
      T01AF3_n11017Bros_rbe = new boolean[] {false} ;
      T01AF3_A11018Bros_rbp = new String[] {""} ;
      T01AF3_n11018Bros_rbp = new boolean[] {false} ;
      T01AF3_A11019Bros_rboc = new short[1] ;
      T01AF3_n11019Bros_rboc = new boolean[] {false} ;
      T01AF3_A11020Bros_rb1 = new String[] {""} ;
      T01AF3_n11020Bros_rb1 = new boolean[] {false} ;
      T01AF3_A11021Bros_rb3 = new String[] {""} ;
      T01AF3_n11021Bros_rb3 = new boolean[] {false} ;
      T01AF3_A11022Bros_c8 = new String[] {""} ;
      T01AF3_n11022Bros_c8 = new boolean[] {false} ;
      T01AF3_A11023Bros_ep1 = new String[] {""} ;
      T01AF3_n11023Bros_ep1 = new boolean[] {false} ;
      T01AF3_A11024Bros_ep2 = new String[] {""} ;
      T01AF3_n11024Bros_ep2 = new boolean[] {false} ;
      T01AF3_A11025Bros_ep3 = new String[] {""} ;
      T01AF3_n11025Bros_ep3 = new boolean[] {false} ;
      T01AF3_A11026Bros_ep4 = new String[] {""} ;
      T01AF3_n11026Bros_ep4 = new boolean[] {false} ;
      T01AF3_A11027Bros_ep5 = new String[] {""} ;
      T01AF3_n11027Bros_ep5 = new boolean[] {false} ;
      T01AF3_A11028Bros_ep6 = new String[] {""} ;
      T01AF3_n11028Bros_ep6 = new boolean[] {false} ;
      T01AF3_A11029Bros_ep7 = new String[] {""} ;
      T01AF3_n11029Bros_ep7 = new boolean[] {false} ;
      T01AF3_A11030Bros_ep8 = new String[] {""} ;
      T01AF3_n11030Bros_ep8 = new boolean[] {false} ;
      T01AF3_A11031Bros_ep9 = new String[] {""} ;
      T01AF3_n11031Bros_ep9 = new boolean[] {false} ;
      T01AF3_A11032Bros_ep10 = new String[] {""} ;
      T01AF3_n11032Bros_ep10 = new boolean[] {false} ;
      T01AF3_A11033Bros_c9 = new String[] {""} ;
      T01AF3_n11033Bros_c9 = new boolean[] {false} ;
      T01AF3_A11034Bros_sa1 = new String[] {""} ;
      T01AF3_n11034Bros_sa1 = new boolean[] {false} ;
      T01AF3_A11035Bros_sa2 = new String[] {""} ;
      T01AF3_n11035Bros_sa2 = new boolean[] {false} ;
      T01AF3_A11036Bros_sa3 = new String[] {""} ;
      T01AF3_n11036Bros_sa3 = new boolean[] {false} ;
      T01AF3_A11037Bros_sa4 = new String[] {""} ;
      T01AF3_n11037Bros_sa4 = new boolean[] {false} ;
      T01AF3_A11038Bros_sa5 = new String[] {""} ;
      T01AF3_n11038Bros_sa5 = new boolean[] {false} ;
      T01AF3_A11039Bros_sa6 = new String[] {""} ;
      T01AF3_n11039Bros_sa6 = new boolean[] {false} ;
      T01AF3_A11040Bros_c10 = new String[] {""} ;
      T01AF3_n11040Bros_c10 = new boolean[] {false} ;
      T01AF3_A11066Bros_stk = new String[] {""} ;
      T01AF3_n11066Bros_stk = new boolean[] {false} ;
      T01AF3_A11067Bros_Lbta = new String[] {""} ;
      T01AF3_n11067Bros_Lbta = new boolean[] {false} ;
      T01AF3_A11068Bros_Lbtp = new short[1] ;
      T01AF3_n11068Bros_Lbtp = new boolean[] {false} ;
      T01AF3_A11069Bros_c11 = new String[] {""} ;
      T01AF3_n11069Bros_c11 = new boolean[] {false} ;
      T01AF3_A11070Bros_c12 = new String[] {""} ;
      T01AF3_n11070Bros_c12 = new boolean[] {false} ;
      T01AF3_A11369Bros_imp1 = new String[] {""} ;
      T01AF3_n11369Bros_imp1 = new boolean[] {false} ;
      T01AF3_A11370Bros_imp2 = new String[] {""} ;
      T01AF3_n11370Bros_imp2 = new boolean[] {false} ;
      T01AF3_A11371Bros_imp3 = new String[] {""} ;
      T01AF3_n11371Bros_imp3 = new boolean[] {false} ;
      T01AF3_A11372Bros_imp4 = new String[] {""} ;
      T01AF3_n11372Bros_imp4 = new boolean[] {false} ;
      T01AF3_A11373Bros_imp5 = new String[] {""} ;
      T01AF3_n11373Bros_imp5 = new boolean[] {false} ;
      T01AF3_A11374Bros_imp6 = new String[] {""} ;
      T01AF3_n11374Bros_imp6 = new boolean[] {false} ;
      T01AF3_A11375Bros_imp7 = new String[] {""} ;
      T01AF3_n11375Bros_imp7 = new boolean[] {false} ;
      T01AF3_A11376Bros_imp8 = new String[] {""} ;
      T01AF3_n11376Bros_imp8 = new boolean[] {false} ;
      T01AF3_A11377Bros_imp9 = new String[] {""} ;
      T01AF3_n11377Bros_imp9 = new boolean[] {false} ;
      T01AF3_A11378Bros_imp10 = new String[] {""} ;
      T01AF3_n11378Bros_imp10 = new boolean[] {false} ;
      T01AF3_A11379Bros_imp11 = new String[] {""} ;
      T01AF3_n11379Bros_imp11 = new boolean[] {false} ;
      T01AF3_A11380Bros_oekot = new String[] {""} ;
      T01AF3_n11380Bros_oekot = new boolean[] {false} ;
      T01AF3_A11381Bros_lavad = new String[] {""} ;
      T01AF3_n11381Bros_lavad = new boolean[] {false} ;
      T01AF3_A11382Bros_luz = new String[] {""} ;
      T01AF3_n11382Bros_luz = new boolean[] {false} ;
      T01AF3_A11383Bros_sudor = new String[] {""} ;
      T01AF3_n11383Bros_sudor = new boolean[] {false} ;
      T01AF3_A11384Bros_cloro = new String[] {""} ;
      T01AF3_n11384Bros_cloro = new boolean[] {false} ;
      T01AF3_A11385Bros_aguam = new String[] {""} ;
      T01AF3_n11385Bros_aguam = new boolean[] {false} ;
      T01AF3_A11386Bros_termo = new String[] {""} ;
      T01AF3_n11386Bros_termo = new boolean[] {false} ;
      T01AF3_A11387Bros_humed = new byte[1] ;
      T01AF3_n11387Bros_humed = new boolean[] {false} ;
      T01AF3_A11407Bros_obs1 = new String[] {""} ;
      T01AF3_n11407Bros_obs1 = new boolean[] {false} ;
      T01AF3_A11408Bros_obs2 = new String[] {""} ;
      T01AF3_n11408Bros_obs2 = new boolean[] {false} ;
      T01AF3_A11409Bros_obs3 = new String[] {""} ;
      T01AF3_n11409Bros_obs3 = new boolean[] {false} ;
      T01AF3_A11410Bros_obs4 = new String[] {""} ;
      T01AF3_n11410Bros_obs4 = new boolean[] {false} ;
      T01AF3_A11411Bros_obs5 = new String[] {""} ;
      T01AF3_n11411Bros_obs5 = new boolean[] {false} ;
      T01AF3_A11412Bros_obs6 = new String[] {""} ;
      T01AF3_n11412Bros_obs6 = new boolean[] {false} ;
      T01AF3_A11413Bros_obs7 = new String[] {""} ;
      T01AF3_n11413Bros_obs7 = new boolean[] {false} ;
      T01AF3_A11414Bros_obs8 = new String[] {""} ;
      T01AF3_n11414Bros_obs8 = new boolean[] {false} ;
      T01AF3_A11415Bros_obs9 = new String[] {""} ;
      T01AF3_n11415Bros_obs9 = new boolean[] {false} ;
      T01AF3_A11416Bros_obs10 = new String[] {""} ;
      T01AF3_n11416Bros_obs10 = new boolean[] {false} ;
      T01AF3_A11417Bros_obs11 = new String[] {""} ;
      T01AF3_n11417Bros_obs11 = new boolean[] {false} ;
      T01AF3_A11703Bros_nc = new byte[1] ;
      T01AF3_n11703Bros_nc = new boolean[] {false} ;
      sMode1467 = "" ;
      T01AF10_A396EmprCod = new String[] {""} ;
      T01AF10_A252CliCod = new int[1] ;
      T01AF10_A10978Bros_Art = new String[] {""} ;
      T01AF11_A396EmprCod = new String[] {""} ;
      T01AF11_A252CliCod = new int[1] ;
      T01AF11_A10978Bros_Art = new String[] {""} ;
      T01AF2_A11704Bros_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AF2_n11704Bros_enc = new boolean[] {false} ;
      T01AF2_A396EmprCod = new String[] {""} ;
      T01AF2_A252CliCod = new int[1] ;
      T01AF2_A840TrnCod = new short[1] ;
      T01AF2_n840TrnCod = new boolean[] {false} ;
      T01AF2_A10978Bros_Art = new String[] {""} ;
      T01AF2_A10979Bros_Mcot = new String[] {""} ;
      T01AF2_n10979Bros_Mcot = new boolean[] {false} ;
      T01AF2_A10980Bros_Pd = new String[] {""} ;
      T01AF2_n10980Bros_Pd = new boolean[] {false} ;
      T01AF2_A10981Bros_Pp = new String[] {""} ;
      T01AF2_n10981Bros_Pp = new boolean[] {false} ;
      T01AF2_A10982Bros_Ag = new String[] {""} ;
      T01AF2_n10982Bros_Ag = new boolean[] {false} ;
      T01AF2_A10983Bros_c1 = new String[] {""} ;
      T01AF2_n10983Bros_c1 = new boolean[] {false} ;
      T01AF2_A10984Bros_c2 = new String[] {""} ;
      T01AF2_n10984Bros_c2 = new boolean[] {false} ;
      T01AF2_A10985Bros_bo = new String[] {""} ;
      T01AF2_n10985Bros_bo = new boolean[] {false} ;
      T01AF2_A10986Bros_bob = new String[] {""} ;
      T01AF2_n10986Bros_bob = new boolean[] {false} ;
      T01AF2_A10987Bros_boe = new String[] {""} ;
      T01AF2_n10987Bros_boe = new boolean[] {false} ;
      T01AF2_A10988BrosBov = new String[] {""} ;
      T01AF2_n10988BrosBov = new boolean[] {false} ;
      T01AF2_A10989Bros_c3 = new String[] {""} ;
      T01AF2_n10989Bros_c3 = new boolean[] {false} ;
      T01AF2_A10990Bros_tns = new String[] {""} ;
      T01AF2_n10990Bros_tns = new boolean[] {false} ;
      T01AF2_A10991Bros_tnc = new String[] {""} ;
      T01AF2_n10991Bros_tnc = new boolean[] {false} ;
      T01AF2_A10992Bros_c4 = new String[] {""} ;
      T01AF2_n10992Bros_c4 = new boolean[] {false} ;
      T01AF2_A10993Bros_ct = new String[] {""} ;
      T01AF2_n10993Bros_ct = new boolean[] {false} ;
      T01AF2_A10994Bros_c5 = new String[] {""} ;
      T01AF2_n10994Bros_c5 = new boolean[] {false} ;
      T01AF2_A10995Bros_scs = new String[] {""} ;
      T01AF2_n10995Bros_scs = new boolean[] {false} ;
      T01AF2_A10996Bros_scc = new String[] {""} ;
      T01AF2_n10996Bros_scc = new boolean[] {false} ;
      T01AF2_A10997Bros_c6 = new String[] {""} ;
      T01AF2_n10997Bros_c6 = new boolean[] {false} ;
      T01AF2_A10998Bros_cctse = new String[] {""} ;
      T01AF2_n10998Bros_cctse = new boolean[] {false} ;
      T01AF2_A10999Bros_ccttp = new String[] {""} ;
      T01AF2_n10999Bros_ccttp = new boolean[] {false} ;
      T01AF2_A11000Bros_cctet = new String[] {""} ;
      T01AF2_n11000Bros_cctet = new boolean[] {false} ;
      T01AF2_A11001Bros_ccp = new byte[1] ;
      T01AF2_n11001Bros_ccp = new boolean[] {false} ;
      T01AF2_A11002Bros_cct = new byte[1] ;
      T01AF2_n11002Bros_cct = new boolean[] {false} ;
      T01AF2_A11003Bros_ccpc = new String[] {""} ;
      T01AF2_n11003Bros_ccpc = new boolean[] {false} ;
      T01AF2_A11004Bros_cctq = new String[] {""} ;
      T01AF2_n11004Bros_cctq = new boolean[] {false} ;
      T01AF2_A11005Bros_cccc = new String[] {""} ;
      T01AF2_n11005Bros_cccc = new boolean[] {false} ;
      T01AF2_A11006Bros_ccec = new String[] {""} ;
      T01AF2_n11006Bros_ccec = new boolean[] {false} ;
      T01AF2_A11008Bros_ccmc1 = new String[] {""} ;
      T01AF2_n11008Bros_ccmc1 = new boolean[] {false} ;
      T01AF2_A11009Bros_ccmc2 = new String[] {""} ;
      T01AF2_n11009Bros_ccmc2 = new boolean[] {false} ;
      T01AF2_A11010Bros_ccmc3 = new String[] {""} ;
      T01AF2_n11010Bros_ccmc3 = new boolean[] {false} ;
      T01AF2_A11011Bros_ccmc4 = new String[] {""} ;
      T01AF2_n11011Bros_ccmc4 = new boolean[] {false} ;
      T01AF2_A11012Bros_ccmc5 = new String[] {""} ;
      T01AF2_n11012Bros_ccmc5 = new boolean[] {false} ;
      T01AF2_A11013Bros_ccmc6 = new String[] {""} ;
      T01AF2_n11013Bros_ccmc6 = new boolean[] {false} ;
      T01AF2_A11014Bros_c7 = new String[] {""} ;
      T01AF2_n11014Bros_c7 = new boolean[] {false} ;
      T01AF2_A11015Bros_rb = new String[] {""} ;
      T01AF2_n11015Bros_rb = new boolean[] {false} ;
      T01AF2_A11016Bros_rbi = new String[] {""} ;
      T01AF2_n11016Bros_rbi = new boolean[] {false} ;
      T01AF2_A11017Bros_rbe = new String[] {""} ;
      T01AF2_n11017Bros_rbe = new boolean[] {false} ;
      T01AF2_A11018Bros_rbp = new String[] {""} ;
      T01AF2_n11018Bros_rbp = new boolean[] {false} ;
      T01AF2_A11019Bros_rboc = new short[1] ;
      T01AF2_n11019Bros_rboc = new boolean[] {false} ;
      T01AF2_A11020Bros_rb1 = new String[] {""} ;
      T01AF2_n11020Bros_rb1 = new boolean[] {false} ;
      T01AF2_A11021Bros_rb3 = new String[] {""} ;
      T01AF2_n11021Bros_rb3 = new boolean[] {false} ;
      T01AF2_A11022Bros_c8 = new String[] {""} ;
      T01AF2_n11022Bros_c8 = new boolean[] {false} ;
      T01AF2_A11023Bros_ep1 = new String[] {""} ;
      T01AF2_n11023Bros_ep1 = new boolean[] {false} ;
      T01AF2_A11024Bros_ep2 = new String[] {""} ;
      T01AF2_n11024Bros_ep2 = new boolean[] {false} ;
      T01AF2_A11025Bros_ep3 = new String[] {""} ;
      T01AF2_n11025Bros_ep3 = new boolean[] {false} ;
      T01AF2_A11026Bros_ep4 = new String[] {""} ;
      T01AF2_n11026Bros_ep4 = new boolean[] {false} ;
      T01AF2_A11027Bros_ep5 = new String[] {""} ;
      T01AF2_n11027Bros_ep5 = new boolean[] {false} ;
      T01AF2_A11028Bros_ep6 = new String[] {""} ;
      T01AF2_n11028Bros_ep6 = new boolean[] {false} ;
      T01AF2_A11029Bros_ep7 = new String[] {""} ;
      T01AF2_n11029Bros_ep7 = new boolean[] {false} ;
      T01AF2_A11030Bros_ep8 = new String[] {""} ;
      T01AF2_n11030Bros_ep8 = new boolean[] {false} ;
      T01AF2_A11031Bros_ep9 = new String[] {""} ;
      T01AF2_n11031Bros_ep9 = new boolean[] {false} ;
      T01AF2_A11032Bros_ep10 = new String[] {""} ;
      T01AF2_n11032Bros_ep10 = new boolean[] {false} ;
      T01AF2_A11033Bros_c9 = new String[] {""} ;
      T01AF2_n11033Bros_c9 = new boolean[] {false} ;
      T01AF2_A11034Bros_sa1 = new String[] {""} ;
      T01AF2_n11034Bros_sa1 = new boolean[] {false} ;
      T01AF2_A11035Bros_sa2 = new String[] {""} ;
      T01AF2_n11035Bros_sa2 = new boolean[] {false} ;
      T01AF2_A11036Bros_sa3 = new String[] {""} ;
      T01AF2_n11036Bros_sa3 = new boolean[] {false} ;
      T01AF2_A11037Bros_sa4 = new String[] {""} ;
      T01AF2_n11037Bros_sa4 = new boolean[] {false} ;
      T01AF2_A11038Bros_sa5 = new String[] {""} ;
      T01AF2_n11038Bros_sa5 = new boolean[] {false} ;
      T01AF2_A11039Bros_sa6 = new String[] {""} ;
      T01AF2_n11039Bros_sa6 = new boolean[] {false} ;
      T01AF2_A11040Bros_c10 = new String[] {""} ;
      T01AF2_n11040Bros_c10 = new boolean[] {false} ;
      T01AF2_A11066Bros_stk = new String[] {""} ;
      T01AF2_n11066Bros_stk = new boolean[] {false} ;
      T01AF2_A11067Bros_Lbta = new String[] {""} ;
      T01AF2_n11067Bros_Lbta = new boolean[] {false} ;
      T01AF2_A11068Bros_Lbtp = new short[1] ;
      T01AF2_n11068Bros_Lbtp = new boolean[] {false} ;
      T01AF2_A11069Bros_c11 = new String[] {""} ;
      T01AF2_n11069Bros_c11 = new boolean[] {false} ;
      T01AF2_A11070Bros_c12 = new String[] {""} ;
      T01AF2_n11070Bros_c12 = new boolean[] {false} ;
      T01AF2_A11369Bros_imp1 = new String[] {""} ;
      T01AF2_n11369Bros_imp1 = new boolean[] {false} ;
      T01AF2_A11370Bros_imp2 = new String[] {""} ;
      T01AF2_n11370Bros_imp2 = new boolean[] {false} ;
      T01AF2_A11371Bros_imp3 = new String[] {""} ;
      T01AF2_n11371Bros_imp3 = new boolean[] {false} ;
      T01AF2_A11372Bros_imp4 = new String[] {""} ;
      T01AF2_n11372Bros_imp4 = new boolean[] {false} ;
      T01AF2_A11373Bros_imp5 = new String[] {""} ;
      T01AF2_n11373Bros_imp5 = new boolean[] {false} ;
      T01AF2_A11374Bros_imp6 = new String[] {""} ;
      T01AF2_n11374Bros_imp6 = new boolean[] {false} ;
      T01AF2_A11375Bros_imp7 = new String[] {""} ;
      T01AF2_n11375Bros_imp7 = new boolean[] {false} ;
      T01AF2_A11376Bros_imp8 = new String[] {""} ;
      T01AF2_n11376Bros_imp8 = new boolean[] {false} ;
      T01AF2_A11377Bros_imp9 = new String[] {""} ;
      T01AF2_n11377Bros_imp9 = new boolean[] {false} ;
      T01AF2_A11378Bros_imp10 = new String[] {""} ;
      T01AF2_n11378Bros_imp10 = new boolean[] {false} ;
      T01AF2_A11379Bros_imp11 = new String[] {""} ;
      T01AF2_n11379Bros_imp11 = new boolean[] {false} ;
      T01AF2_A11380Bros_oekot = new String[] {""} ;
      T01AF2_n11380Bros_oekot = new boolean[] {false} ;
      T01AF2_A11381Bros_lavad = new String[] {""} ;
      T01AF2_n11381Bros_lavad = new boolean[] {false} ;
      T01AF2_A11382Bros_luz = new String[] {""} ;
      T01AF2_n11382Bros_luz = new boolean[] {false} ;
      T01AF2_A11383Bros_sudor = new String[] {""} ;
      T01AF2_n11383Bros_sudor = new boolean[] {false} ;
      T01AF2_A11384Bros_cloro = new String[] {""} ;
      T01AF2_n11384Bros_cloro = new boolean[] {false} ;
      T01AF2_A11385Bros_aguam = new String[] {""} ;
      T01AF2_n11385Bros_aguam = new boolean[] {false} ;
      T01AF2_A11386Bros_termo = new String[] {""} ;
      T01AF2_n11386Bros_termo = new boolean[] {false} ;
      T01AF2_A11387Bros_humed = new byte[1] ;
      T01AF2_n11387Bros_humed = new boolean[] {false} ;
      T01AF2_A11407Bros_obs1 = new String[] {""} ;
      T01AF2_n11407Bros_obs1 = new boolean[] {false} ;
      T01AF2_A11408Bros_obs2 = new String[] {""} ;
      T01AF2_n11408Bros_obs2 = new boolean[] {false} ;
      T01AF2_A11409Bros_obs3 = new String[] {""} ;
      T01AF2_n11409Bros_obs3 = new boolean[] {false} ;
      T01AF2_A11410Bros_obs4 = new String[] {""} ;
      T01AF2_n11410Bros_obs4 = new boolean[] {false} ;
      T01AF2_A11411Bros_obs5 = new String[] {""} ;
      T01AF2_n11411Bros_obs5 = new boolean[] {false} ;
      T01AF2_A11412Bros_obs6 = new String[] {""} ;
      T01AF2_n11412Bros_obs6 = new boolean[] {false} ;
      T01AF2_A11413Bros_obs7 = new String[] {""} ;
      T01AF2_n11413Bros_obs7 = new boolean[] {false} ;
      T01AF2_A11414Bros_obs8 = new String[] {""} ;
      T01AF2_n11414Bros_obs8 = new boolean[] {false} ;
      T01AF2_A11415Bros_obs9 = new String[] {""} ;
      T01AF2_n11415Bros_obs9 = new boolean[] {false} ;
      T01AF2_A11416Bros_obs10 = new String[] {""} ;
      T01AF2_n11416Bros_obs10 = new boolean[] {false} ;
      T01AF2_A11417Bros_obs11 = new String[] {""} ;
      T01AF2_n11417Bros_obs11 = new boolean[] {false} ;
      T01AF2_A11703Bros_nc = new byte[1] ;
      T01AF2_n11703Bros_nc = new boolean[] {false} ;
      T01AF15_A396EmprCod = new String[] {""} ;
      T01AF15_A252CliCod = new int[1] ;
      T01AF15_A10978Bros_Art = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10979Bros_Mcot = "" ;
      i10980Bros_Pd = "" ;
      i10981Bros_Pp = "" ;
      i10982Bros_Ag = "" ;
      i10985Bros_bo = "" ;
      i10986Bros_bob = "" ;
      i10988BrosBov = "" ;
      i10987Bros_boe = "" ;
      i10990Bros_tns = "" ;
      i10991Bros_tnc = "" ;
      i10993Bros_ct = "" ;
      i10995Bros_scs = "" ;
      i10996Bros_scc = "" ;
      i10998Bros_cctse = "" ;
      i10999Bros_ccttp = "" ;
      i11000Bros_cctet = "" ;
      i11003Bros_ccpc = "" ;
      i11004Bros_cctq = "" ;
      i11005Bros_cccc = "" ;
      i11006Bros_ccec = "" ;
      i11008Bros_ccmc1 = "" ;
      i11009Bros_ccmc2 = "" ;
      i11010Bros_ccmc3 = "" ;
      i11011Bros_ccmc4 = "" ;
      i11012Bros_ccmc5 = "" ;
      i11013Bros_ccmc6 = "" ;
      i11015Bros_rb = "" ;
      i11017Bros_rbe = "" ;
      i11016Bros_rbi = "" ;
      i11018Bros_rbp = "" ;
      i11020Bros_rb1 = "" ;
      i11021Bros_rb3 = "" ;
      i11023Bros_ep1 = "" ;
      i11024Bros_ep2 = "" ;
      i11025Bros_ep3 = "" ;
      i11026Bros_ep4 = "" ;
      i11027Bros_ep5 = "" ;
      i11028Bros_ep6 = "" ;
      i11029Bros_ep7 = "" ;
      i11030Bros_ep8 = "" ;
      i11031Bros_ep9 = "" ;
      i11032Bros_ep10 = "" ;
      i11034Bros_sa1 = "" ;
      i11035Bros_sa2 = "" ;
      i11036Bros_sa3 = "" ;
      i11038Bros_sa5 = "" ;
      i11039Bros_sa6 = "" ;
      i11066Bros_stk = "" ;
      T01AF16_A407EmprNom = new String[] {""} ;
      T01AF16_n407EmprNom = new boolean[] {false} ;
      T01AF17_A279CliNom = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ10978Bros_Art = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ10979Bros_Mcot = "" ;
      ZZ10980Bros_Pd = "" ;
      ZZ10981Bros_Pp = "" ;
      ZZ10982Bros_Ag = "" ;
      ZZ10983Bros_c1 = "" ;
      ZZ10984Bros_c2 = "" ;
      ZZ10985Bros_bo = "" ;
      ZZ10986Bros_bob = "" ;
      ZZ10987Bros_boe = "" ;
      ZZ10988BrosBov = "" ;
      ZZ10989Bros_c3 = "" ;
      ZZ10990Bros_tns = "" ;
      ZZ10991Bros_tnc = "" ;
      ZZ10992Bros_c4 = "" ;
      ZZ10993Bros_ct = "" ;
      ZZ10994Bros_c5 = "" ;
      ZZ10995Bros_scs = "" ;
      ZZ10996Bros_scc = "" ;
      ZZ10997Bros_c6 = "" ;
      ZZ10998Bros_cctse = "" ;
      ZZ10999Bros_ccttp = "" ;
      ZZ11000Bros_cctet = "" ;
      ZZ11003Bros_ccpc = "" ;
      ZZ11004Bros_cctq = "" ;
      ZZ11005Bros_cccc = "" ;
      ZZ11006Bros_ccec = "" ;
      ZZ11008Bros_ccmc1 = "" ;
      ZZ11009Bros_ccmc2 = "" ;
      ZZ11010Bros_ccmc3 = "" ;
      ZZ11011Bros_ccmc4 = "" ;
      ZZ11012Bros_ccmc5 = "" ;
      ZZ11013Bros_ccmc6 = "" ;
      ZZ11014Bros_c7 = "" ;
      ZZ11015Bros_rb = "" ;
      ZZ11016Bros_rbi = "" ;
      ZZ11017Bros_rbe = "" ;
      ZZ11018Bros_rbp = "" ;
      ZZ11020Bros_rb1 = "" ;
      ZZ11021Bros_rb3 = "" ;
      ZZ11022Bros_c8 = "" ;
      ZZ11023Bros_ep1 = "" ;
      ZZ11024Bros_ep2 = "" ;
      ZZ11025Bros_ep3 = "" ;
      ZZ11026Bros_ep4 = "" ;
      ZZ11027Bros_ep5 = "" ;
      ZZ11028Bros_ep6 = "" ;
      ZZ11029Bros_ep7 = "" ;
      ZZ11030Bros_ep8 = "" ;
      ZZ11031Bros_ep9 = "" ;
      ZZ11032Bros_ep10 = "" ;
      ZZ11033Bros_c9 = "" ;
      ZZ11034Bros_sa1 = "" ;
      ZZ11035Bros_sa2 = "" ;
      ZZ11036Bros_sa3 = "" ;
      ZZ11037Bros_sa4 = "" ;
      ZZ11038Bros_sa5 = "" ;
      ZZ11039Bros_sa6 = "" ;
      ZZ11040Bros_c10 = "" ;
      ZZ11066Bros_stk = "" ;
      ZZ11067Bros_Lbta = "" ;
      ZZ11069Bros_c11 = "" ;
      ZZ11070Bros_c12 = "" ;
      ZZ11369Bros_imp1 = "" ;
      ZZ11370Bros_imp2 = "" ;
      ZZ11371Bros_imp3 = "" ;
      ZZ11372Bros_imp4 = "" ;
      ZZ11373Bros_imp5 = "" ;
      ZZ11374Bros_imp6 = "" ;
      ZZ11375Bros_imp7 = "" ;
      ZZ11376Bros_imp8 = "" ;
      ZZ11377Bros_imp9 = "" ;
      ZZ11378Bros_imp10 = "" ;
      ZZ11379Bros_imp11 = "" ;
      ZZ11380Bros_oekot = "" ;
      ZZ11381Bros_lavad = "" ;
      ZZ11382Bros_luz = "" ;
      ZZ11383Bros_sudor = "" ;
      ZZ11384Bros_cloro = "" ;
      ZZ11385Bros_aguam = "" ;
      ZZ11386Bros_termo = "" ;
      ZZ11407Bros_obs1 = "" ;
      ZZ11408Bros_obs2 = "" ;
      ZZ11409Bros_obs3 = "" ;
      ZZ11410Bros_obs4 = "" ;
      ZZ11411Bros_obs5 = "" ;
      ZZ11412Bros_obs6 = "" ;
      ZZ11413Bros_obs7 = "" ;
      ZZ11414Bros_obs8 = "" ;
      ZZ11415Bros_obs9 = "" ;
      ZZ11416Bros_obs10 = "" ;
      ZZ11417Bros_obs11 = "" ;
      ZZ11704Bros_enc = DecimalUtil.ZERO ;
      T01AF18_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tartbrs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tartbrs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tartbrs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tartbrs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tartbrs__default(),
         new Object[] {
             new Object[] {
            T01AF2_A11704Bros_enc, T01AF2_n11704Bros_enc, T01AF2_A396EmprCod, T01AF2_A252CliCod, T01AF2_A840TrnCod, T01AF2_n840TrnCod, T01AF2_A10978Bros_Art, T01AF2_A10979Bros_Mcot, T01AF2_n10979Bros_Mcot, T01AF2_A10980Bros_Pd,
            T01AF2_n10980Bros_Pd, T01AF2_A10981Bros_Pp, T01AF2_n10981Bros_Pp, T01AF2_A10982Bros_Ag, T01AF2_n10982Bros_Ag, T01AF2_A10983Bros_c1, T01AF2_n10983Bros_c1, T01AF2_A10984Bros_c2, T01AF2_n10984Bros_c2, T01AF2_A10985Bros_bo,
            T01AF2_n10985Bros_bo, T01AF2_A10986Bros_bob, T01AF2_n10986Bros_bob, T01AF2_A10987Bros_boe, T01AF2_n10987Bros_boe, T01AF2_A10988BrosBov, T01AF2_n10988BrosBov, T01AF2_A10989Bros_c3, T01AF2_n10989Bros_c3, T01AF2_A10990Bros_tns,
            T01AF2_n10990Bros_tns, T01AF2_A10991Bros_tnc, T01AF2_n10991Bros_tnc, T01AF2_A10992Bros_c4, T01AF2_n10992Bros_c4, T01AF2_A10993Bros_ct, T01AF2_n10993Bros_ct, T01AF2_A10994Bros_c5, T01AF2_n10994Bros_c5, T01AF2_A10995Bros_scs,
            T01AF2_n10995Bros_scs, T01AF2_A10996Bros_scc, T01AF2_n10996Bros_scc, T01AF2_A10997Bros_c6, T01AF2_n10997Bros_c6, T01AF2_A10998Bros_cctse, T01AF2_n10998Bros_cctse, T01AF2_A10999Bros_ccttp, T01AF2_n10999Bros_ccttp, T01AF2_A11000Bros_cctet,
            T01AF2_n11000Bros_cctet, T01AF2_A11001Bros_ccp, T01AF2_n11001Bros_ccp, T01AF2_A11002Bros_cct, T01AF2_n11002Bros_cct, T01AF2_A11003Bros_ccpc, T01AF2_n11003Bros_ccpc, T01AF2_A11004Bros_cctq, T01AF2_n11004Bros_cctq, T01AF2_A11005Bros_cccc,
            T01AF2_n11005Bros_cccc, T01AF2_A11006Bros_ccec, T01AF2_n11006Bros_ccec, T01AF2_A11008Bros_ccmc1, T01AF2_n11008Bros_ccmc1, T01AF2_A11009Bros_ccmc2, T01AF2_n11009Bros_ccmc2, T01AF2_A11010Bros_ccmc3, T01AF2_n11010Bros_ccmc3, T01AF2_A11011Bros_ccmc4,
            T01AF2_n11011Bros_ccmc4, T01AF2_A11012Bros_ccmc5, T01AF2_n11012Bros_ccmc5, T01AF2_A11013Bros_ccmc6, T01AF2_n11013Bros_ccmc6, T01AF2_A11014Bros_c7, T01AF2_n11014Bros_c7, T01AF2_A11015Bros_rb, T01AF2_n11015Bros_rb, T01AF2_A11016Bros_rbi,
            T01AF2_n11016Bros_rbi, T01AF2_A11017Bros_rbe, T01AF2_n11017Bros_rbe, T01AF2_A11018Bros_rbp, T01AF2_n11018Bros_rbp, T01AF2_A11019Bros_rboc, T01AF2_n11019Bros_rboc, T01AF2_A11020Bros_rb1, T01AF2_n11020Bros_rb1, T01AF2_A11021Bros_rb3,
            T01AF2_n11021Bros_rb3, T01AF2_A11022Bros_c8, T01AF2_n11022Bros_c8, T01AF2_A11023Bros_ep1, T01AF2_n11023Bros_ep1, T01AF2_A11024Bros_ep2, T01AF2_n11024Bros_ep2, T01AF2_A11025Bros_ep3, T01AF2_n11025Bros_ep3, T01AF2_A11026Bros_ep4,
            T01AF2_n11026Bros_ep4, T01AF2_A11027Bros_ep5, T01AF2_n11027Bros_ep5, T01AF2_A11028Bros_ep6, T01AF2_n11028Bros_ep6, T01AF2_A11029Bros_ep7, T01AF2_n11029Bros_ep7, T01AF2_A11030Bros_ep8, T01AF2_n11030Bros_ep8, T01AF2_A11031Bros_ep9,
            T01AF2_n11031Bros_ep9, T01AF2_A11032Bros_ep10, T01AF2_n11032Bros_ep10, T01AF2_A11033Bros_c9, T01AF2_n11033Bros_c9, T01AF2_A11034Bros_sa1, T01AF2_n11034Bros_sa1, T01AF2_A11035Bros_sa2, T01AF2_n11035Bros_sa2, T01AF2_A11036Bros_sa3,
            T01AF2_n11036Bros_sa3, T01AF2_A11037Bros_sa4, T01AF2_n11037Bros_sa4, T01AF2_A11038Bros_sa5, T01AF2_n11038Bros_sa5, T01AF2_A11039Bros_sa6, T01AF2_n11039Bros_sa6, T01AF2_A11040Bros_c10, T01AF2_n11040Bros_c10, T01AF2_A11066Bros_stk,
            T01AF2_n11066Bros_stk, T01AF2_A11067Bros_Lbta, T01AF2_n11067Bros_Lbta, T01AF2_A11068Bros_Lbtp, T01AF2_n11068Bros_Lbtp, T01AF2_A11069Bros_c11, T01AF2_n11069Bros_c11, T01AF2_A11070Bros_c12, T01AF2_n11070Bros_c12, T01AF2_A11369Bros_imp1,
            T01AF2_n11369Bros_imp1, T01AF2_A11370Bros_imp2, T01AF2_n11370Bros_imp2, T01AF2_A11371Bros_imp3, T01AF2_n11371Bros_imp3, T01AF2_A11372Bros_imp4, T01AF2_n11372Bros_imp4, T01AF2_A11373Bros_imp5, T01AF2_n11373Bros_imp5, T01AF2_A11374Bros_imp6,
            T01AF2_n11374Bros_imp6, T01AF2_A11375Bros_imp7, T01AF2_n11375Bros_imp7, T01AF2_A11376Bros_imp8, T01AF2_n11376Bros_imp8, T01AF2_A11377Bros_imp9, T01AF2_n11377Bros_imp9, T01AF2_A11378Bros_imp10, T01AF2_n11378Bros_imp10, T01AF2_A11379Bros_imp11,
            T01AF2_n11379Bros_imp11, T01AF2_A11380Bros_oekot, T01AF2_n11380Bros_oekot, T01AF2_A11381Bros_lavad, T01AF2_n11381Bros_lavad, T01AF2_A11382Bros_luz, T01AF2_n11382Bros_luz, T01AF2_A11383Bros_sudor, T01AF2_n11383Bros_sudor, T01AF2_A11384Bros_cloro,
            T01AF2_n11384Bros_cloro, T01AF2_A11385Bros_aguam, T01AF2_n11385Bros_aguam, T01AF2_A11386Bros_termo, T01AF2_n11386Bros_termo, T01AF2_A11387Bros_humed, T01AF2_n11387Bros_humed, T01AF2_A11407Bros_obs1, T01AF2_n11407Bros_obs1, T01AF2_A11408Bros_obs2,
            T01AF2_n11408Bros_obs2, T01AF2_A11409Bros_obs3, T01AF2_n11409Bros_obs3, T01AF2_A11410Bros_obs4, T01AF2_n11410Bros_obs4, T01AF2_A11411Bros_obs5, T01AF2_n11411Bros_obs5, T01AF2_A11412Bros_obs6, T01AF2_n11412Bros_obs6, T01AF2_A11413Bros_obs7,
            T01AF2_n11413Bros_obs7, T01AF2_A11414Bros_obs8, T01AF2_n11414Bros_obs8, T01AF2_A11415Bros_obs9, T01AF2_n11415Bros_obs9, T01AF2_A11416Bros_obs10, T01AF2_n11416Bros_obs10, T01AF2_A11417Bros_obs11, T01AF2_n11417Bros_obs11, T01AF2_A11703Bros_nc,
            T01AF2_n11703Bros_nc
            }
            , new Object[] {
            T01AF3_A11704Bros_enc, T01AF3_n11704Bros_enc, T01AF3_A396EmprCod, T01AF3_A252CliCod, T01AF3_A840TrnCod, T01AF3_n840TrnCod, T01AF3_A10978Bros_Art, T01AF3_A10979Bros_Mcot, T01AF3_n10979Bros_Mcot, T01AF3_A10980Bros_Pd,
            T01AF3_n10980Bros_Pd, T01AF3_A10981Bros_Pp, T01AF3_n10981Bros_Pp, T01AF3_A10982Bros_Ag, T01AF3_n10982Bros_Ag, T01AF3_A10983Bros_c1, T01AF3_n10983Bros_c1, T01AF3_A10984Bros_c2, T01AF3_n10984Bros_c2, T01AF3_A10985Bros_bo,
            T01AF3_n10985Bros_bo, T01AF3_A10986Bros_bob, T01AF3_n10986Bros_bob, T01AF3_A10987Bros_boe, T01AF3_n10987Bros_boe, T01AF3_A10988BrosBov, T01AF3_n10988BrosBov, T01AF3_A10989Bros_c3, T01AF3_n10989Bros_c3, T01AF3_A10990Bros_tns,
            T01AF3_n10990Bros_tns, T01AF3_A10991Bros_tnc, T01AF3_n10991Bros_tnc, T01AF3_A10992Bros_c4, T01AF3_n10992Bros_c4, T01AF3_A10993Bros_ct, T01AF3_n10993Bros_ct, T01AF3_A10994Bros_c5, T01AF3_n10994Bros_c5, T01AF3_A10995Bros_scs,
            T01AF3_n10995Bros_scs, T01AF3_A10996Bros_scc, T01AF3_n10996Bros_scc, T01AF3_A10997Bros_c6, T01AF3_n10997Bros_c6, T01AF3_A10998Bros_cctse, T01AF3_n10998Bros_cctse, T01AF3_A10999Bros_ccttp, T01AF3_n10999Bros_ccttp, T01AF3_A11000Bros_cctet,
            T01AF3_n11000Bros_cctet, T01AF3_A11001Bros_ccp, T01AF3_n11001Bros_ccp, T01AF3_A11002Bros_cct, T01AF3_n11002Bros_cct, T01AF3_A11003Bros_ccpc, T01AF3_n11003Bros_ccpc, T01AF3_A11004Bros_cctq, T01AF3_n11004Bros_cctq, T01AF3_A11005Bros_cccc,
            T01AF3_n11005Bros_cccc, T01AF3_A11006Bros_ccec, T01AF3_n11006Bros_ccec, T01AF3_A11008Bros_ccmc1, T01AF3_n11008Bros_ccmc1, T01AF3_A11009Bros_ccmc2, T01AF3_n11009Bros_ccmc2, T01AF3_A11010Bros_ccmc3, T01AF3_n11010Bros_ccmc3, T01AF3_A11011Bros_ccmc4,
            T01AF3_n11011Bros_ccmc4, T01AF3_A11012Bros_ccmc5, T01AF3_n11012Bros_ccmc5, T01AF3_A11013Bros_ccmc6, T01AF3_n11013Bros_ccmc6, T01AF3_A11014Bros_c7, T01AF3_n11014Bros_c7, T01AF3_A11015Bros_rb, T01AF3_n11015Bros_rb, T01AF3_A11016Bros_rbi,
            T01AF3_n11016Bros_rbi, T01AF3_A11017Bros_rbe, T01AF3_n11017Bros_rbe, T01AF3_A11018Bros_rbp, T01AF3_n11018Bros_rbp, T01AF3_A11019Bros_rboc, T01AF3_n11019Bros_rboc, T01AF3_A11020Bros_rb1, T01AF3_n11020Bros_rb1, T01AF3_A11021Bros_rb3,
            T01AF3_n11021Bros_rb3, T01AF3_A11022Bros_c8, T01AF3_n11022Bros_c8, T01AF3_A11023Bros_ep1, T01AF3_n11023Bros_ep1, T01AF3_A11024Bros_ep2, T01AF3_n11024Bros_ep2, T01AF3_A11025Bros_ep3, T01AF3_n11025Bros_ep3, T01AF3_A11026Bros_ep4,
            T01AF3_n11026Bros_ep4, T01AF3_A11027Bros_ep5, T01AF3_n11027Bros_ep5, T01AF3_A11028Bros_ep6, T01AF3_n11028Bros_ep6, T01AF3_A11029Bros_ep7, T01AF3_n11029Bros_ep7, T01AF3_A11030Bros_ep8, T01AF3_n11030Bros_ep8, T01AF3_A11031Bros_ep9,
            T01AF3_n11031Bros_ep9, T01AF3_A11032Bros_ep10, T01AF3_n11032Bros_ep10, T01AF3_A11033Bros_c9, T01AF3_n11033Bros_c9, T01AF3_A11034Bros_sa1, T01AF3_n11034Bros_sa1, T01AF3_A11035Bros_sa2, T01AF3_n11035Bros_sa2, T01AF3_A11036Bros_sa3,
            T01AF3_n11036Bros_sa3, T01AF3_A11037Bros_sa4, T01AF3_n11037Bros_sa4, T01AF3_A11038Bros_sa5, T01AF3_n11038Bros_sa5, T01AF3_A11039Bros_sa6, T01AF3_n11039Bros_sa6, T01AF3_A11040Bros_c10, T01AF3_n11040Bros_c10, T01AF3_A11066Bros_stk,
            T01AF3_n11066Bros_stk, T01AF3_A11067Bros_Lbta, T01AF3_n11067Bros_Lbta, T01AF3_A11068Bros_Lbtp, T01AF3_n11068Bros_Lbtp, T01AF3_A11069Bros_c11, T01AF3_n11069Bros_c11, T01AF3_A11070Bros_c12, T01AF3_n11070Bros_c12, T01AF3_A11369Bros_imp1,
            T01AF3_n11369Bros_imp1, T01AF3_A11370Bros_imp2, T01AF3_n11370Bros_imp2, T01AF3_A11371Bros_imp3, T01AF3_n11371Bros_imp3, T01AF3_A11372Bros_imp4, T01AF3_n11372Bros_imp4, T01AF3_A11373Bros_imp5, T01AF3_n11373Bros_imp5, T01AF3_A11374Bros_imp6,
            T01AF3_n11374Bros_imp6, T01AF3_A11375Bros_imp7, T01AF3_n11375Bros_imp7, T01AF3_A11376Bros_imp8, T01AF3_n11376Bros_imp8, T01AF3_A11377Bros_imp9, T01AF3_n11377Bros_imp9, T01AF3_A11378Bros_imp10, T01AF3_n11378Bros_imp10, T01AF3_A11379Bros_imp11,
            T01AF3_n11379Bros_imp11, T01AF3_A11380Bros_oekot, T01AF3_n11380Bros_oekot, T01AF3_A11381Bros_lavad, T01AF3_n11381Bros_lavad, T01AF3_A11382Bros_luz, T01AF3_n11382Bros_luz, T01AF3_A11383Bros_sudor, T01AF3_n11383Bros_sudor, T01AF3_A11384Bros_cloro,
            T01AF3_n11384Bros_cloro, T01AF3_A11385Bros_aguam, T01AF3_n11385Bros_aguam, T01AF3_A11386Bros_termo, T01AF3_n11386Bros_termo, T01AF3_A11387Bros_humed, T01AF3_n11387Bros_humed, T01AF3_A11407Bros_obs1, T01AF3_n11407Bros_obs1, T01AF3_A11408Bros_obs2,
            T01AF3_n11408Bros_obs2, T01AF3_A11409Bros_obs3, T01AF3_n11409Bros_obs3, T01AF3_A11410Bros_obs4, T01AF3_n11410Bros_obs4, T01AF3_A11411Bros_obs5, T01AF3_n11411Bros_obs5, T01AF3_A11412Bros_obs6, T01AF3_n11412Bros_obs6, T01AF3_A11413Bros_obs7,
            T01AF3_n11413Bros_obs7, T01AF3_A11414Bros_obs8, T01AF3_n11414Bros_obs8, T01AF3_A11415Bros_obs9, T01AF3_n11415Bros_obs9, T01AF3_A11416Bros_obs10, T01AF3_n11416Bros_obs10, T01AF3_A11417Bros_obs11, T01AF3_n11417Bros_obs11, T01AF3_A11703Bros_nc,
            T01AF3_n11703Bros_nc
            }
            , new Object[] {
            T01AF4_A407EmprNom, T01AF4_n407EmprNom
            }
            , new Object[] {
            T01AF5_A279CliNom
            }
            , new Object[] {
            T01AF6_A396EmprCod
            }
            , new Object[] {
            T01AF7_A11704Bros_enc, T01AF7_n11704Bros_enc, T01AF7_A396EmprCod, T01AF7_A252CliCod, T01AF7_A840TrnCod, T01AF7_n840TrnCod, T01AF7_A10978Bros_Art, T01AF7_A407EmprNom, T01AF7_n407EmprNom, T01AF7_A279CliNom,
            T01AF7_A10979Bros_Mcot, T01AF7_n10979Bros_Mcot, T01AF7_A10980Bros_Pd, T01AF7_n10980Bros_Pd, T01AF7_A10981Bros_Pp, T01AF7_n10981Bros_Pp, T01AF7_A10982Bros_Ag, T01AF7_n10982Bros_Ag, T01AF7_A10983Bros_c1, T01AF7_n10983Bros_c1,
            T01AF7_A10984Bros_c2, T01AF7_n10984Bros_c2, T01AF7_A10985Bros_bo, T01AF7_n10985Bros_bo, T01AF7_A10986Bros_bob, T01AF7_n10986Bros_bob, T01AF7_A10987Bros_boe, T01AF7_n10987Bros_boe, T01AF7_A10988BrosBov, T01AF7_n10988BrosBov,
            T01AF7_A10989Bros_c3, T01AF7_n10989Bros_c3, T01AF7_A10990Bros_tns, T01AF7_n10990Bros_tns, T01AF7_A10991Bros_tnc, T01AF7_n10991Bros_tnc, T01AF7_A10992Bros_c4, T01AF7_n10992Bros_c4, T01AF7_A10993Bros_ct, T01AF7_n10993Bros_ct,
            T01AF7_A10994Bros_c5, T01AF7_n10994Bros_c5, T01AF7_A10995Bros_scs, T01AF7_n10995Bros_scs, T01AF7_A10996Bros_scc, T01AF7_n10996Bros_scc, T01AF7_A10997Bros_c6, T01AF7_n10997Bros_c6, T01AF7_A10998Bros_cctse, T01AF7_n10998Bros_cctse,
            T01AF7_A10999Bros_ccttp, T01AF7_n10999Bros_ccttp, T01AF7_A11000Bros_cctet, T01AF7_n11000Bros_cctet, T01AF7_A11001Bros_ccp, T01AF7_n11001Bros_ccp, T01AF7_A11002Bros_cct, T01AF7_n11002Bros_cct, T01AF7_A11003Bros_ccpc, T01AF7_n11003Bros_ccpc,
            T01AF7_A11004Bros_cctq, T01AF7_n11004Bros_cctq, T01AF7_A11005Bros_cccc, T01AF7_n11005Bros_cccc, T01AF7_A11006Bros_ccec, T01AF7_n11006Bros_ccec, T01AF7_A11008Bros_ccmc1, T01AF7_n11008Bros_ccmc1, T01AF7_A11009Bros_ccmc2, T01AF7_n11009Bros_ccmc2,
            T01AF7_A11010Bros_ccmc3, T01AF7_n11010Bros_ccmc3, T01AF7_A11011Bros_ccmc4, T01AF7_n11011Bros_ccmc4, T01AF7_A11012Bros_ccmc5, T01AF7_n11012Bros_ccmc5, T01AF7_A11013Bros_ccmc6, T01AF7_n11013Bros_ccmc6, T01AF7_A11014Bros_c7, T01AF7_n11014Bros_c7,
            T01AF7_A11015Bros_rb, T01AF7_n11015Bros_rb, T01AF7_A11016Bros_rbi, T01AF7_n11016Bros_rbi, T01AF7_A11017Bros_rbe, T01AF7_n11017Bros_rbe, T01AF7_A11018Bros_rbp, T01AF7_n11018Bros_rbp, T01AF7_A11019Bros_rboc, T01AF7_n11019Bros_rboc,
            T01AF7_A11020Bros_rb1, T01AF7_n11020Bros_rb1, T01AF7_A11021Bros_rb3, T01AF7_n11021Bros_rb3, T01AF7_A11022Bros_c8, T01AF7_n11022Bros_c8, T01AF7_A11023Bros_ep1, T01AF7_n11023Bros_ep1, T01AF7_A11024Bros_ep2, T01AF7_n11024Bros_ep2,
            T01AF7_A11025Bros_ep3, T01AF7_n11025Bros_ep3, T01AF7_A11026Bros_ep4, T01AF7_n11026Bros_ep4, T01AF7_A11027Bros_ep5, T01AF7_n11027Bros_ep5, T01AF7_A11028Bros_ep6, T01AF7_n11028Bros_ep6, T01AF7_A11029Bros_ep7, T01AF7_n11029Bros_ep7,
            T01AF7_A11030Bros_ep8, T01AF7_n11030Bros_ep8, T01AF7_A11031Bros_ep9, T01AF7_n11031Bros_ep9, T01AF7_A11032Bros_ep10, T01AF7_n11032Bros_ep10, T01AF7_A11033Bros_c9, T01AF7_n11033Bros_c9, T01AF7_A11034Bros_sa1, T01AF7_n11034Bros_sa1,
            T01AF7_A11035Bros_sa2, T01AF7_n11035Bros_sa2, T01AF7_A11036Bros_sa3, T01AF7_n11036Bros_sa3, T01AF7_A11037Bros_sa4, T01AF7_n11037Bros_sa4, T01AF7_A11038Bros_sa5, T01AF7_n11038Bros_sa5, T01AF7_A11039Bros_sa6, T01AF7_n11039Bros_sa6,
            T01AF7_A11040Bros_c10, T01AF7_n11040Bros_c10, T01AF7_A11066Bros_stk, T01AF7_n11066Bros_stk, T01AF7_A11067Bros_Lbta, T01AF7_n11067Bros_Lbta, T01AF7_A11068Bros_Lbtp, T01AF7_n11068Bros_Lbtp, T01AF7_A11069Bros_c11, T01AF7_n11069Bros_c11,
            T01AF7_A11070Bros_c12, T01AF7_n11070Bros_c12, T01AF7_A11369Bros_imp1, T01AF7_n11369Bros_imp1, T01AF7_A11370Bros_imp2, T01AF7_n11370Bros_imp2, T01AF7_A11371Bros_imp3, T01AF7_n11371Bros_imp3, T01AF7_A11372Bros_imp4, T01AF7_n11372Bros_imp4,
            T01AF7_A11373Bros_imp5, T01AF7_n11373Bros_imp5, T01AF7_A11374Bros_imp6, T01AF7_n11374Bros_imp6, T01AF7_A11375Bros_imp7, T01AF7_n11375Bros_imp7, T01AF7_A11376Bros_imp8, T01AF7_n11376Bros_imp8, T01AF7_A11377Bros_imp9, T01AF7_n11377Bros_imp9,
            T01AF7_A11378Bros_imp10, T01AF7_n11378Bros_imp10, T01AF7_A11379Bros_imp11, T01AF7_n11379Bros_imp11, T01AF7_A11380Bros_oekot, T01AF7_n11380Bros_oekot, T01AF7_A11381Bros_lavad, T01AF7_n11381Bros_lavad, T01AF7_A11382Bros_luz, T01AF7_n11382Bros_luz,
            T01AF7_A11383Bros_sudor, T01AF7_n11383Bros_sudor, T01AF7_A11384Bros_cloro, T01AF7_n11384Bros_cloro, T01AF7_A11385Bros_aguam, T01AF7_n11385Bros_aguam, T01AF7_A11386Bros_termo, T01AF7_n11386Bros_termo, T01AF7_A11387Bros_humed, T01AF7_n11387Bros_humed,
            T01AF7_A11407Bros_obs1, T01AF7_n11407Bros_obs1, T01AF7_A11408Bros_obs2, T01AF7_n11408Bros_obs2, T01AF7_A11409Bros_obs3, T01AF7_n11409Bros_obs3, T01AF7_A11410Bros_obs4, T01AF7_n11410Bros_obs4, T01AF7_A11411Bros_obs5, T01AF7_n11411Bros_obs5,
            T01AF7_A11412Bros_obs6, T01AF7_n11412Bros_obs6, T01AF7_A11413Bros_obs7, T01AF7_n11413Bros_obs7, T01AF7_A11414Bros_obs8, T01AF7_n11414Bros_obs8, T01AF7_A11415Bros_obs9, T01AF7_n11415Bros_obs9, T01AF7_A11416Bros_obs10, T01AF7_n11416Bros_obs10,
            T01AF7_A11417Bros_obs11, T01AF7_n11417Bros_obs11, T01AF7_A11703Bros_nc, T01AF7_n11703Bros_nc
            }
            , new Object[] {
            T01AF8_A396EmprCod
            }
            , new Object[] {
            T01AF9_A396EmprCod, T01AF9_A252CliCod, T01AF9_A10978Bros_Art
            }
            , new Object[] {
            T01AF10_A396EmprCod, T01AF10_A252CliCod, T01AF10_A10978Bros_Art
            }
            , new Object[] {
            T01AF11_A396EmprCod, T01AF11_A252CliCod, T01AF11_A10978Bros_Art
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AF15_A396EmprCod, T01AF15_A252CliCod, T01AF15_A10978Bros_Art
            }
            , new Object[] {
            T01AF16_A407EmprNom, T01AF16_n407EmprNom
            }
            , new Object[] {
            T01AF17_A279CliNom
            }
            , new Object[] {
            T01AF18_A396EmprCod
            }
         }
      );
      Z10978Bros_Art = "" ;
      A10978Bros_Art = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z11066Bros_stk = httpContext.getMessage( "N", "") ;
      n11066Bros_stk = false ;
      A11066Bros_stk = httpContext.getMessage( "N", "") ;
      n11066Bros_stk = false ;
      i11066Bros_stk = httpContext.getMessage( "N", "") ;
      n11066Bros_stk = false ;
      Z11039Bros_sa6 = httpContext.getMessage( "N", "") ;
      n11039Bros_sa6 = false ;
      A11039Bros_sa6 = httpContext.getMessage( "N", "") ;
      n11039Bros_sa6 = false ;
      i11039Bros_sa6 = httpContext.getMessage( "N", "") ;
      n11039Bros_sa6 = false ;
      Z11038Bros_sa5 = httpContext.getMessage( "N", "") ;
      n11038Bros_sa5 = false ;
      A11038Bros_sa5 = httpContext.getMessage( "N", "") ;
      n11038Bros_sa5 = false ;
      i11038Bros_sa5 = httpContext.getMessage( "N", "") ;
      n11038Bros_sa5 = false ;
      Z11036Bros_sa3 = httpContext.getMessage( "N", "") ;
      n11036Bros_sa3 = false ;
      A11036Bros_sa3 = httpContext.getMessage( "N", "") ;
      n11036Bros_sa3 = false ;
      i11036Bros_sa3 = httpContext.getMessage( "N", "") ;
      n11036Bros_sa3 = false ;
      Z11035Bros_sa2 = httpContext.getMessage( "N", "") ;
      n11035Bros_sa2 = false ;
      A11035Bros_sa2 = httpContext.getMessage( "N", "") ;
      n11035Bros_sa2 = false ;
      i11035Bros_sa2 = httpContext.getMessage( "N", "") ;
      n11035Bros_sa2 = false ;
      Z11034Bros_sa1 = httpContext.getMessage( "N", "") ;
      n11034Bros_sa1 = false ;
      A11034Bros_sa1 = httpContext.getMessage( "N", "") ;
      n11034Bros_sa1 = false ;
      i11034Bros_sa1 = httpContext.getMessage( "N", "") ;
      n11034Bros_sa1 = false ;
      Z11032Bros_ep10 = httpContext.getMessage( "N", "") ;
      n11032Bros_ep10 = false ;
      A11032Bros_ep10 = httpContext.getMessage( "N", "") ;
      n11032Bros_ep10 = false ;
      i11032Bros_ep10 = httpContext.getMessage( "N", "") ;
      n11032Bros_ep10 = false ;
      Z11031Bros_ep9 = httpContext.getMessage( "N", "") ;
      n11031Bros_ep9 = false ;
      A11031Bros_ep9 = httpContext.getMessage( "N", "") ;
      n11031Bros_ep9 = false ;
      i11031Bros_ep9 = httpContext.getMessage( "N", "") ;
      n11031Bros_ep9 = false ;
      Z11030Bros_ep8 = httpContext.getMessage( "N", "") ;
      n11030Bros_ep8 = false ;
      A11030Bros_ep8 = httpContext.getMessage( "N", "") ;
      n11030Bros_ep8 = false ;
      i11030Bros_ep8 = httpContext.getMessage( "N", "") ;
      n11030Bros_ep8 = false ;
      Z11029Bros_ep7 = httpContext.getMessage( "N", "") ;
      n11029Bros_ep7 = false ;
      A11029Bros_ep7 = httpContext.getMessage( "N", "") ;
      n11029Bros_ep7 = false ;
      i11029Bros_ep7 = httpContext.getMessage( "N", "") ;
      n11029Bros_ep7 = false ;
      Z11028Bros_ep6 = httpContext.getMessage( "N", "") ;
      n11028Bros_ep6 = false ;
      A11028Bros_ep6 = httpContext.getMessage( "N", "") ;
      n11028Bros_ep6 = false ;
      i11028Bros_ep6 = httpContext.getMessage( "N", "") ;
      n11028Bros_ep6 = false ;
      Z11027Bros_ep5 = httpContext.getMessage( "N", "") ;
      n11027Bros_ep5 = false ;
      A11027Bros_ep5 = httpContext.getMessage( "N", "") ;
      n11027Bros_ep5 = false ;
      i11027Bros_ep5 = httpContext.getMessage( "N", "") ;
      n11027Bros_ep5 = false ;
      Z11026Bros_ep4 = httpContext.getMessage( "N", "") ;
      n11026Bros_ep4 = false ;
      A11026Bros_ep4 = httpContext.getMessage( "N", "") ;
      n11026Bros_ep4 = false ;
      i11026Bros_ep4 = httpContext.getMessage( "N", "") ;
      n11026Bros_ep4 = false ;
      Z11025Bros_ep3 = httpContext.getMessage( "N", "") ;
      n11025Bros_ep3 = false ;
      A11025Bros_ep3 = httpContext.getMessage( "N", "") ;
      n11025Bros_ep3 = false ;
      i11025Bros_ep3 = httpContext.getMessage( "N", "") ;
      n11025Bros_ep3 = false ;
      Z11024Bros_ep2 = httpContext.getMessage( "N", "") ;
      n11024Bros_ep2 = false ;
      A11024Bros_ep2 = httpContext.getMessage( "N", "") ;
      n11024Bros_ep2 = false ;
      i11024Bros_ep2 = httpContext.getMessage( "N", "") ;
      n11024Bros_ep2 = false ;
      Z11023Bros_ep1 = httpContext.getMessage( "N", "") ;
      n11023Bros_ep1 = false ;
      A11023Bros_ep1 = httpContext.getMessage( "N", "") ;
      n11023Bros_ep1 = false ;
      i11023Bros_ep1 = httpContext.getMessage( "N", "") ;
      n11023Bros_ep1 = false ;
      Z11021Bros_rb3 = httpContext.getMessage( "N", "") ;
      n11021Bros_rb3 = false ;
      A11021Bros_rb3 = httpContext.getMessage( "N", "") ;
      n11021Bros_rb3 = false ;
      i11021Bros_rb3 = httpContext.getMessage( "N", "") ;
      n11021Bros_rb3 = false ;
      Z11020Bros_rb1 = httpContext.getMessage( "N", "") ;
      n11020Bros_rb1 = false ;
      A11020Bros_rb1 = httpContext.getMessage( "N", "") ;
      n11020Bros_rb1 = false ;
      i11020Bros_rb1 = httpContext.getMessage( "N", "") ;
      n11020Bros_rb1 = false ;
      Z11018Bros_rbp = httpContext.getMessage( "N", "") ;
      n11018Bros_rbp = false ;
      A11018Bros_rbp = httpContext.getMessage( "N", "") ;
      n11018Bros_rbp = false ;
      i11018Bros_rbp = httpContext.getMessage( "N", "") ;
      n11018Bros_rbp = false ;
      Z11016Bros_rbi = httpContext.getMessage( "N", "") ;
      n11016Bros_rbi = false ;
      A11016Bros_rbi = httpContext.getMessage( "N", "") ;
      n11016Bros_rbi = false ;
      i11016Bros_rbi = httpContext.getMessage( "N", "") ;
      n11016Bros_rbi = false ;
      Z11017Bros_rbe = httpContext.getMessage( "N", "") ;
      n11017Bros_rbe = false ;
      A11017Bros_rbe = httpContext.getMessage( "N", "") ;
      n11017Bros_rbe = false ;
      i11017Bros_rbe = httpContext.getMessage( "N", "") ;
      n11017Bros_rbe = false ;
      Z11015Bros_rb = httpContext.getMessage( "N", "") ;
      n11015Bros_rb = false ;
      A11015Bros_rb = httpContext.getMessage( "N", "") ;
      n11015Bros_rb = false ;
      i11015Bros_rb = httpContext.getMessage( "N", "") ;
      n11015Bros_rb = false ;
      Z11013Bros_ccmc6 = httpContext.getMessage( "N", "") ;
      n11013Bros_ccmc6 = false ;
      A11013Bros_ccmc6 = httpContext.getMessage( "N", "") ;
      n11013Bros_ccmc6 = false ;
      i11013Bros_ccmc6 = httpContext.getMessage( "N", "") ;
      n11013Bros_ccmc6 = false ;
      Z11012Bros_ccmc5 = httpContext.getMessage( "N", "") ;
      n11012Bros_ccmc5 = false ;
      A11012Bros_ccmc5 = httpContext.getMessage( "N", "") ;
      n11012Bros_ccmc5 = false ;
      i11012Bros_ccmc5 = httpContext.getMessage( "N", "") ;
      n11012Bros_ccmc5 = false ;
      Z11011Bros_ccmc4 = httpContext.getMessage( "N", "") ;
      n11011Bros_ccmc4 = false ;
      A11011Bros_ccmc4 = httpContext.getMessage( "N", "") ;
      n11011Bros_ccmc4 = false ;
      i11011Bros_ccmc4 = httpContext.getMessage( "N", "") ;
      n11011Bros_ccmc4 = false ;
      Z11010Bros_ccmc3 = httpContext.getMessage( "N", "") ;
      n11010Bros_ccmc3 = false ;
      A11010Bros_ccmc3 = httpContext.getMessage( "N", "") ;
      n11010Bros_ccmc3 = false ;
      i11010Bros_ccmc3 = httpContext.getMessage( "N", "") ;
      n11010Bros_ccmc3 = false ;
      Z11009Bros_ccmc2 = httpContext.getMessage( "N", "") ;
      n11009Bros_ccmc2 = false ;
      A11009Bros_ccmc2 = httpContext.getMessage( "N", "") ;
      n11009Bros_ccmc2 = false ;
      i11009Bros_ccmc2 = httpContext.getMessage( "N", "") ;
      n11009Bros_ccmc2 = false ;
      Z11008Bros_ccmc1 = httpContext.getMessage( "N", "") ;
      n11008Bros_ccmc1 = false ;
      A11008Bros_ccmc1 = httpContext.getMessage( "N", "") ;
      n11008Bros_ccmc1 = false ;
      i11008Bros_ccmc1 = httpContext.getMessage( "N", "") ;
      n11008Bros_ccmc1 = false ;
      Z11006Bros_ccec = httpContext.getMessage( "N", "") ;
      n11006Bros_ccec = false ;
      A11006Bros_ccec = httpContext.getMessage( "N", "") ;
      n11006Bros_ccec = false ;
      i11006Bros_ccec = httpContext.getMessage( "N", "") ;
      n11006Bros_ccec = false ;
      Z11005Bros_cccc = httpContext.getMessage( "N", "") ;
      n11005Bros_cccc = false ;
      A11005Bros_cccc = httpContext.getMessage( "N", "") ;
      n11005Bros_cccc = false ;
      i11005Bros_cccc = httpContext.getMessage( "N", "") ;
      n11005Bros_cccc = false ;
      Z11004Bros_cctq = httpContext.getMessage( "N", "") ;
      n11004Bros_cctq = false ;
      A11004Bros_cctq = httpContext.getMessage( "N", "") ;
      n11004Bros_cctq = false ;
      i11004Bros_cctq = httpContext.getMessage( "N", "") ;
      n11004Bros_cctq = false ;
      Z11003Bros_ccpc = httpContext.getMessage( "N", "") ;
      n11003Bros_ccpc = false ;
      A11003Bros_ccpc = httpContext.getMessage( "N", "") ;
      n11003Bros_ccpc = false ;
      i11003Bros_ccpc = httpContext.getMessage( "N", "") ;
      n11003Bros_ccpc = false ;
      Z11000Bros_cctet = httpContext.getMessage( "N", "") ;
      n11000Bros_cctet = false ;
      A11000Bros_cctet = httpContext.getMessage( "N", "") ;
      n11000Bros_cctet = false ;
      i11000Bros_cctet = httpContext.getMessage( "N", "") ;
      n11000Bros_cctet = false ;
      Z10999Bros_ccttp = httpContext.getMessage( "N", "") ;
      n10999Bros_ccttp = false ;
      A10999Bros_ccttp = httpContext.getMessage( "N", "") ;
      n10999Bros_ccttp = false ;
      i10999Bros_ccttp = httpContext.getMessage( "N", "") ;
      n10999Bros_ccttp = false ;
      Z10998Bros_cctse = httpContext.getMessage( "N", "") ;
      n10998Bros_cctse = false ;
      A10998Bros_cctse = httpContext.getMessage( "N", "") ;
      n10998Bros_cctse = false ;
      i10998Bros_cctse = httpContext.getMessage( "N", "") ;
      n10998Bros_cctse = false ;
      Z10996Bros_scc = httpContext.getMessage( "N", "") ;
      n10996Bros_scc = false ;
      A10996Bros_scc = httpContext.getMessage( "N", "") ;
      n10996Bros_scc = false ;
      i10996Bros_scc = httpContext.getMessage( "N", "") ;
      n10996Bros_scc = false ;
      Z10995Bros_scs = httpContext.getMessage( "N", "") ;
      n10995Bros_scs = false ;
      A10995Bros_scs = httpContext.getMessage( "N", "") ;
      n10995Bros_scs = false ;
      i10995Bros_scs = httpContext.getMessage( "N", "") ;
      n10995Bros_scs = false ;
      Z10993Bros_ct = httpContext.getMessage( "N", "") ;
      n10993Bros_ct = false ;
      A10993Bros_ct = httpContext.getMessage( "N", "") ;
      n10993Bros_ct = false ;
      i10993Bros_ct = httpContext.getMessage( "N", "") ;
      n10993Bros_ct = false ;
      Z10991Bros_tnc = httpContext.getMessage( "N", "") ;
      n10991Bros_tnc = false ;
      A10991Bros_tnc = httpContext.getMessage( "N", "") ;
      n10991Bros_tnc = false ;
      i10991Bros_tnc = httpContext.getMessage( "N", "") ;
      n10991Bros_tnc = false ;
      Z10990Bros_tns = httpContext.getMessage( "N", "") ;
      n10990Bros_tns = false ;
      A10990Bros_tns = httpContext.getMessage( "N", "") ;
      n10990Bros_tns = false ;
      i10990Bros_tns = httpContext.getMessage( "N", "") ;
      n10990Bros_tns = false ;
      Z10987Bros_boe = httpContext.getMessage( "N", "") ;
      n10987Bros_boe = false ;
      A10987Bros_boe = httpContext.getMessage( "N", "") ;
      n10987Bros_boe = false ;
      i10987Bros_boe = httpContext.getMessage( "N", "") ;
      n10987Bros_boe = false ;
      Z10988BrosBov = httpContext.getMessage( "N", "") ;
      n10988BrosBov = false ;
      A10988BrosBov = httpContext.getMessage( "N", "") ;
      n10988BrosBov = false ;
      i10988BrosBov = httpContext.getMessage( "N", "") ;
      n10988BrosBov = false ;
      Z10986Bros_bob = httpContext.getMessage( "N", "") ;
      n10986Bros_bob = false ;
      A10986Bros_bob = httpContext.getMessage( "N", "") ;
      n10986Bros_bob = false ;
      i10986Bros_bob = httpContext.getMessage( "N", "") ;
      n10986Bros_bob = false ;
      Z10985Bros_bo = httpContext.getMessage( "N", "") ;
      n10985Bros_bo = false ;
      A10985Bros_bo = httpContext.getMessage( "N", "") ;
      n10985Bros_bo = false ;
      i10985Bros_bo = httpContext.getMessage( "N", "") ;
      n10985Bros_bo = false ;
      Z10982Bros_Ag = httpContext.getMessage( "N", "") ;
      n10982Bros_Ag = false ;
      A10982Bros_Ag = httpContext.getMessage( "N", "") ;
      n10982Bros_Ag = false ;
      i10982Bros_Ag = httpContext.getMessage( "N", "") ;
      n10982Bros_Ag = false ;
      Z10981Bros_Pp = httpContext.getMessage( "N", "") ;
      n10981Bros_Pp = false ;
      A10981Bros_Pp = httpContext.getMessage( "N", "") ;
      n10981Bros_Pp = false ;
      i10981Bros_Pp = httpContext.getMessage( "N", "") ;
      n10981Bros_Pp = false ;
      Z10980Bros_Pd = httpContext.getMessage( "N", "") ;
      n10980Bros_Pd = false ;
      A10980Bros_Pd = httpContext.getMessage( "N", "") ;
      n10980Bros_Pd = false ;
      i10980Bros_Pd = httpContext.getMessage( "N", "") ;
      n10980Bros_Pd = false ;
      Z10979Bros_Mcot = httpContext.getMessage( "N", "") ;
      n10979Bros_Mcot = false ;
      A10979Bros_Mcot = httpContext.getMessage( "N", "") ;
      n10979Bros_Mcot = false ;
      i10979Bros_Mcot = httpContext.getMessage( "N", "") ;
      n10979Bros_Mcot = false ;
   }

   private byte Z11001Bros_ccp ;
   private byte Z11002Bros_cct ;
   private byte Z11387Bros_humed ;
   private byte Z11703Bros_nc ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11001Bros_ccp ;
   private byte A11002Bros_cct ;
   private byte A11387Bros_humed ;
   private byte A11703Bros_nc ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11001Bros_ccp ;
   private byte ZZ11002Bros_cct ;
   private byte ZZ11387Bros_humed ;
   private byte ZZ11703Bros_nc ;
   private short Z11019Bros_rboc ;
   private short Z11068Bros_Lbtp ;
   private short Z840TrnCod ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11019Bros_rboc ;
   private short A11068Bros_Lbtp ;
   private short RcdFound1467 ;
   private short nIsDirty_1467 ;
   private short ZZ840TrnCod ;
   private short ZZ11019Bros_rboc ;
   private short ZZ11068Bros_Lbtp ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBros_Art_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBros_Mcot_Enabled ;
   private int edtBros_Pd_Enabled ;
   private int edtBros_Pp_Enabled ;
   private int edtBros_Ag_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtBros_c1_Enabled ;
   private int edtBros_c2_Enabled ;
   private int edtBros_bo_Enabled ;
   private int edtBros_bob_Enabled ;
   private int edtBros_boe_Enabled ;
   private int edtBros_c3_Enabled ;
   private int edtBros_tns_Enabled ;
   private int edtBros_tnc_Enabled ;
   private int edtBros_c4_Enabled ;
   private int edtBros_ct_Enabled ;
   private int edtBros_c5_Enabled ;
   private int edtBros_scs_Enabled ;
   private int edtBros_scc_Enabled ;
   private int edtBros_c6_Enabled ;
   private int edtBros_cctse_Enabled ;
   private int edtBros_ccttp_Enabled ;
   private int edtBros_cctet_Enabled ;
   private int edtBros_ccp_Enabled ;
   private int edtBros_cct_Enabled ;
   private int edtBros_ccpc_Enabled ;
   private int edtBros_cctq_Enabled ;
   private int edtBros_cccc_Enabled ;
   private int edtBros_ccec_Enabled ;
   private int edtBros_ccmc1_Enabled ;
   private int edtBros_ccmc2_Enabled ;
   private int edtBros_ccmc3_Enabled ;
   private int edtBros_ccmc4_Enabled ;
   private int edtBros_ccmc5_Enabled ;
   private int edtBros_ccmc6_Enabled ;
   private int edtBros_c7_Enabled ;
   private int edtBros_rb_Enabled ;
   private int edtBros_rbi_Enabled ;
   private int edtBros_rbe_Enabled ;
   private int edtBros_rbp_Enabled ;
   private int edtBros_rboc_Enabled ;
   private int edtBros_rb1_Enabled ;
   private int edtBros_rb3_Enabled ;
   private int edtBros_c8_Enabled ;
   private int edtBros_ep1_Enabled ;
   private int edtBros_ep2_Enabled ;
   private int edtBros_ep3_Enabled ;
   private int edtBros_ep4_Enabled ;
   private int edtBros_ep5_Enabled ;
   private int edtBros_ep6_Enabled ;
   private int edtBros_ep7_Enabled ;
   private int edtBros_ep8_Enabled ;
   private int edtBros_ep9_Enabled ;
   private int edtBros_ep10_Enabled ;
   private int edtBros_c9_Enabled ;
   private int edtBros_sa1_Enabled ;
   private int edtBros_sa2_Enabled ;
   private int edtBros_sa3_Enabled ;
   private int edtBros_sa4_Enabled ;
   private int edtBros_sa5_Enabled ;
   private int edtBros_sa6_Enabled ;
   private int edtBros_c10_Enabled ;
   private int edtBros_stk_Enabled ;
   private int edtBros_Lbta_Enabled ;
   private int edtBros_Lbtp_Enabled ;
   private int edtBros_c11_Enabled ;
   private int edtBros_c12_Enabled ;
   private int edtBros_imp1_Enabled ;
   private int edtBros_imp2_Enabled ;
   private int edtBros_imp3_Enabled ;
   private int edtBros_imp4_Enabled ;
   private int edtBros_imp5_Enabled ;
   private int edtBros_imp6_Enabled ;
   private int edtBros_imp7_Enabled ;
   private int edtBros_imp8_Enabled ;
   private int edtBros_imp9_Enabled ;
   private int edtBros_imp10_Enabled ;
   private int edtBros_imp11_Enabled ;
   private int edtBros_oekot_Enabled ;
   private int edtBros_lavad_Enabled ;
   private int edtBros_luz_Enabled ;
   private int edtBros_sudor_Enabled ;
   private int edtBros_cloro_Enabled ;
   private int edtBros_aguam_Enabled ;
   private int edtBros_termo_Enabled ;
   private int edtBros_humed_Enabled ;
   private int edtBros_obs1_Enabled ;
   private int edtBros_obs2_Enabled ;
   private int edtBros_obs3_Enabled ;
   private int edtBros_obs4_Enabled ;
   private int edtBros_obs5_Enabled ;
   private int edtBros_obs6_Enabled ;
   private int edtBros_obs7_Enabled ;
   private int edtBros_obs8_Enabled ;
   private int edtBros_obs9_Enabled ;
   private int edtBros_obs10_Enabled ;
   private int edtBros_obs11_Enabled ;
   private int edtBros_nc_Enabled ;
   private int edtBros_enc_Enabled ;
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
   private int edtBros_enc_Backcolor ;
   private int edtBros_nc_Backcolor ;
   private int edtBros_obs11_Backcolor ;
   private int edtBros_obs10_Backcolor ;
   private int edtBros_obs9_Backcolor ;
   private int edtBros_obs8_Backcolor ;
   private int edtBros_obs7_Backcolor ;
   private int edtBros_obs6_Backcolor ;
   private int edtBros_obs5_Backcolor ;
   private int edtBros_obs4_Backcolor ;
   private int edtBros_obs3_Backcolor ;
   private int edtBros_obs2_Backcolor ;
   private int edtBros_obs1_Backcolor ;
   private int edtBros_humed_Backcolor ;
   private int edtBros_termo_Backcolor ;
   private int edtBros_aguam_Backcolor ;
   private int edtBros_cloro_Backcolor ;
   private int edtBros_sudor_Backcolor ;
   private int edtBros_luz_Backcolor ;
   private int edtBros_lavad_Backcolor ;
   private int edtBros_oekot_Backcolor ;
   private int edtBros_imp11_Backcolor ;
   private int edtBros_imp10_Backcolor ;
   private int edtBros_imp9_Backcolor ;
   private int edtBros_imp8_Backcolor ;
   private int edtBros_imp7_Backcolor ;
   private int edtBros_imp6_Backcolor ;
   private int edtBros_imp5_Backcolor ;
   private int edtBros_imp4_Backcolor ;
   private int edtBros_imp3_Backcolor ;
   private int edtBros_imp2_Backcolor ;
   private int edtBros_imp1_Backcolor ;
   private int edtBros_c12_Backcolor ;
   private int edtBros_c11_Backcolor ;
   private int edtBros_Lbtp_Backcolor ;
   private int edtBros_Lbta_Backcolor ;
   private int edtBros_stk_Backcolor ;
   private int edtBros_c10_Backcolor ;
   private int edtBros_sa6_Backcolor ;
   private int edtBros_sa5_Backcolor ;
   private int edtBros_sa4_Backcolor ;
   private int edtBros_sa3_Backcolor ;
   private int edtBros_sa2_Backcolor ;
   private int edtBros_sa1_Backcolor ;
   private int edtBros_c9_Backcolor ;
   private int edtBros_ep10_Backcolor ;
   private int edtBros_ep9_Backcolor ;
   private int edtBros_ep8_Backcolor ;
   private int edtBros_ep7_Backcolor ;
   private int edtBros_ep6_Backcolor ;
   private int edtBros_ep5_Backcolor ;
   private int edtBros_ep4_Backcolor ;
   private int edtBros_ep3_Backcolor ;
   private int edtBros_ep2_Backcolor ;
   private int edtBros_ep1_Backcolor ;
   private int edtBros_c8_Backcolor ;
   private int edtBros_rb3_Backcolor ;
   private int edtBros_rb1_Backcolor ;
   private int edtBros_rboc_Backcolor ;
   private int edtBros_rbp_Backcolor ;
   private int edtBros_rbe_Backcolor ;
   private int edtBros_rbi_Backcolor ;
   private int edtBros_rb_Backcolor ;
   private int edtBros_c7_Backcolor ;
   private int edtBros_ccmc6_Backcolor ;
   private int edtBros_ccmc5_Backcolor ;
   private int edtBros_ccmc4_Backcolor ;
   private int edtBros_ccmc3_Backcolor ;
   private int edtBros_ccmc2_Backcolor ;
   private int edtBros_ccmc1_Backcolor ;
   private int edtBros_ccec_Backcolor ;
   private int edtBros_cccc_Backcolor ;
   private int edtBros_cctq_Backcolor ;
   private int edtBros_ccpc_Backcolor ;
   private int edtBros_cct_Backcolor ;
   private int edtBros_ccp_Backcolor ;
   private int edtBros_cctet_Backcolor ;
   private int edtBros_ccttp_Backcolor ;
   private int edtBros_cctse_Backcolor ;
   private int edtBros_c6_Backcolor ;
   private int edtBros_scc_Backcolor ;
   private int edtBros_scs_Backcolor ;
   private int edtBros_c5_Backcolor ;
   private int edtBros_ct_Backcolor ;
   private int edtBros_c4_Backcolor ;
   private int edtBros_tnc_Backcolor ;
   private int edtBros_tns_Backcolor ;
   private int edtBros_c3_Backcolor ;
   private int edtBros_boe_Backcolor ;
   private int edtBros_bob_Backcolor ;
   private int edtBros_bo_Backcolor ;
   private int edtBros_c2_Backcolor ;
   private int edtBros_c1_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtBros_Ag_Backcolor ;
   private int edtBros_Pp_Backcolor ;
   private int edtBros_Pd_Backcolor ;
   private int edtBros_Mcot_Backcolor ;
   private int edtBros_Art_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z11704Bros_enc ;
   private java.math.BigDecimal A11704Bros_enc ;
   private java.math.BigDecimal ZZ11704Bros_enc ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA10978Bros_Art ;
   private String Z396EmprCod ;
   private String Z10978Bros_Art ;
   private String Z10979Bros_Mcot ;
   private String Z10980Bros_Pd ;
   private String Z10981Bros_Pp ;
   private String Z10982Bros_Ag ;
   private String Z10985Bros_bo ;
   private String Z10986Bros_bob ;
   private String Z10987Bros_boe ;
   private String Z10988BrosBov ;
   private String Z10990Bros_tns ;
   private String Z10991Bros_tnc ;
   private String Z10993Bros_ct ;
   private String Z10995Bros_scs ;
   private String Z10996Bros_scc ;
   private String Z10998Bros_cctse ;
   private String Z10999Bros_ccttp ;
   private String Z11000Bros_cctet ;
   private String Z11003Bros_ccpc ;
   private String Z11004Bros_cctq ;
   private String Z11005Bros_cccc ;
   private String Z11006Bros_ccec ;
   private String Z11008Bros_ccmc1 ;
   private String Z11009Bros_ccmc2 ;
   private String Z11010Bros_ccmc3 ;
   private String Z11011Bros_ccmc4 ;
   private String Z11012Bros_ccmc5 ;
   private String Z11013Bros_ccmc6 ;
   private String Z11015Bros_rb ;
   private String Z11016Bros_rbi ;
   private String Z11017Bros_rbe ;
   private String Z11018Bros_rbp ;
   private String Z11020Bros_rb1 ;
   private String Z11021Bros_rb3 ;
   private String Z11023Bros_ep1 ;
   private String Z11024Bros_ep2 ;
   private String Z11025Bros_ep3 ;
   private String Z11026Bros_ep4 ;
   private String Z11027Bros_ep5 ;
   private String Z11028Bros_ep6 ;
   private String Z11029Bros_ep7 ;
   private String Z11030Bros_ep8 ;
   private String Z11031Bros_ep9 ;
   private String Z11032Bros_ep10 ;
   private String Z11034Bros_sa1 ;
   private String Z11035Bros_sa2 ;
   private String Z11036Bros_sa3 ;
   private String Z11037Bros_sa4 ;
   private String Z11038Bros_sa5 ;
   private String Z11039Bros_sa6 ;
   private String Z11066Bros_stk ;
   private String Z11067Bros_Lbta ;
   private String Z11369Bros_imp1 ;
   private String Z11370Bros_imp2 ;
   private String Z11371Bros_imp3 ;
   private String Z11372Bros_imp4 ;
   private String Z11373Bros_imp5 ;
   private String Z11374Bros_imp6 ;
   private String Z11375Bros_imp7 ;
   private String Z11376Bros_imp8 ;
   private String Z11377Bros_imp9 ;
   private String Z11378Bros_imp10 ;
   private String Z11379Bros_imp11 ;
   private String Z11380Bros_oekot ;
   private String Z11381Bros_lavad ;
   private String Z11382Bros_luz ;
   private String Z11383Bros_sudor ;
   private String Z11384Bros_cloro ;
   private String Z11385Bros_aguam ;
   private String Z11386Bros_termo ;
   private String Z11407Bros_obs1 ;
   private String Z11408Bros_obs2 ;
   private String Z11409Bros_obs3 ;
   private String Z11410Bros_obs4 ;
   private String Z11411Bros_obs5 ;
   private String Z11412Bros_obs6 ;
   private String Z11413Bros_obs7 ;
   private String Z11414Bros_obs8 ;
   private String Z11415Bros_obs9 ;
   private String Z11416Bros_obs10 ;
   private String Z11417Bros_obs11 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10978Bros_Art ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBros_Mcot_Internalname ;
   private String A10988BrosBov ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBros_Art_Internalname ;
   private String edtBros_Art_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String A10979Bros_Mcot ;
   private String edtBros_Mcot_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBros_Pd_Internalname ;
   private String A10980Bros_Pd ;
   private String edtBros_Pd_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBros_Pp_Internalname ;
   private String A10981Bros_Pp ;
   private String edtBros_Pp_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBros_Ag_Internalname ;
   private String A10982Bros_Ag ;
   private String edtBros_Ag_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBros_c1_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBros_c2_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBros_bo_Internalname ;
   private String A10985Bros_bo ;
   private String edtBros_bo_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBros_bob_Internalname ;
   private String A10986Bros_bob ;
   private String edtBros_bob_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBros_boe_Internalname ;
   private String A10987Bros_boe ;
   private String edtBros_boe_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBros_c3_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBros_tns_Internalname ;
   private String A10990Bros_tns ;
   private String edtBros_tns_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBros_tnc_Internalname ;
   private String A10991Bros_tnc ;
   private String edtBros_tnc_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBros_c4_Internalname ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBros_ct_Internalname ;
   private String A10993Bros_ct ;
   private String edtBros_ct_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBros_c5_Internalname ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtBros_scs_Internalname ;
   private String A10995Bros_scs ;
   private String edtBros_scs_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtBros_scc_Internalname ;
   private String A10996Bros_scc ;
   private String edtBros_scc_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtBros_c6_Internalname ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtBros_cctse_Internalname ;
   private String A10998Bros_cctse ;
   private String edtBros_cctse_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtBros_ccttp_Internalname ;
   private String A10999Bros_ccttp ;
   private String edtBros_ccttp_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtBros_cctet_Internalname ;
   private String A11000Bros_cctet ;
   private String edtBros_cctet_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtBros_ccp_Internalname ;
   private String edtBros_ccp_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtBros_cct_Internalname ;
   private String edtBros_cct_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtBros_ccpc_Internalname ;
   private String A11003Bros_ccpc ;
   private String edtBros_ccpc_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtBros_cctq_Internalname ;
   private String A11004Bros_cctq ;
   private String edtBros_cctq_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtBros_cccc_Internalname ;
   private String A11005Bros_cccc ;
   private String edtBros_cccc_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtBros_ccec_Internalname ;
   private String A11006Bros_ccec ;
   private String edtBros_ccec_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtBros_ccmc1_Internalname ;
   private String A11008Bros_ccmc1 ;
   private String edtBros_ccmc1_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtBros_ccmc2_Internalname ;
   private String A11009Bros_ccmc2 ;
   private String edtBros_ccmc2_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtBros_ccmc3_Internalname ;
   private String A11010Bros_ccmc3 ;
   private String edtBros_ccmc3_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtBros_ccmc4_Internalname ;
   private String A11011Bros_ccmc4 ;
   private String edtBros_ccmc4_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtBros_ccmc5_Internalname ;
   private String A11012Bros_ccmc5 ;
   private String edtBros_ccmc5_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtBros_ccmc6_Internalname ;
   private String A11013Bros_ccmc6 ;
   private String edtBros_ccmc6_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtBros_c7_Internalname ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtBros_rb_Internalname ;
   private String A11015Bros_rb ;
   private String edtBros_rb_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtBros_rbi_Internalname ;
   private String A11016Bros_rbi ;
   private String edtBros_rbi_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtBros_rbe_Internalname ;
   private String A11017Bros_rbe ;
   private String edtBros_rbe_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtBros_rbp_Internalname ;
   private String A11018Bros_rbp ;
   private String edtBros_rbp_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtBros_rboc_Internalname ;
   private String edtBros_rboc_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtBros_rb1_Internalname ;
   private String A11020Bros_rb1 ;
   private String edtBros_rb1_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtBros_rb3_Internalname ;
   private String A11021Bros_rb3 ;
   private String edtBros_rb3_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtBros_c8_Internalname ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtBros_ep1_Internalname ;
   private String A11023Bros_ep1 ;
   private String edtBros_ep1_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtBros_ep2_Internalname ;
   private String A11024Bros_ep2 ;
   private String edtBros_ep2_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtBros_ep3_Internalname ;
   private String A11025Bros_ep3 ;
   private String edtBros_ep3_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtBros_ep4_Internalname ;
   private String A11026Bros_ep4 ;
   private String edtBros_ep4_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtBros_ep5_Internalname ;
   private String A11027Bros_ep5 ;
   private String edtBros_ep5_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtBros_ep6_Internalname ;
   private String A11028Bros_ep6 ;
   private String edtBros_ep6_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtBros_ep7_Internalname ;
   private String A11029Bros_ep7 ;
   private String edtBros_ep7_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtBros_ep8_Internalname ;
   private String A11030Bros_ep8 ;
   private String edtBros_ep8_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtBros_ep9_Internalname ;
   private String A11031Bros_ep9 ;
   private String edtBros_ep9_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtBros_ep10_Internalname ;
   private String A11032Bros_ep10 ;
   private String edtBros_ep10_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtBros_c9_Internalname ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtBros_sa1_Internalname ;
   private String A11034Bros_sa1 ;
   private String edtBros_sa1_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtBros_sa2_Internalname ;
   private String A11035Bros_sa2 ;
   private String edtBros_sa2_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtBros_sa3_Internalname ;
   private String A11036Bros_sa3 ;
   private String edtBros_sa3_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtBros_sa4_Internalname ;
   private String A11037Bros_sa4 ;
   private String edtBros_sa4_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtBros_sa5_Internalname ;
   private String A11038Bros_sa5 ;
   private String edtBros_sa5_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtBros_sa6_Internalname ;
   private String A11039Bros_sa6 ;
   private String edtBros_sa6_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtBros_c10_Internalname ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtBros_stk_Internalname ;
   private String A11066Bros_stk ;
   private String edtBros_stk_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtBros_Lbta_Internalname ;
   private String A11067Bros_Lbta ;
   private String edtBros_Lbta_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtBros_Lbtp_Internalname ;
   private String edtBros_Lbtp_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtBros_c11_Internalname ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtBros_c12_Internalname ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String edtBros_imp1_Internalname ;
   private String A11369Bros_imp1 ;
   private String edtBros_imp1_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtBros_imp2_Internalname ;
   private String A11370Bros_imp2 ;
   private String edtBros_imp2_Jsonclick ;
   private String lblTextblock75_Internalname ;
   private String lblTextblock75_Jsonclick ;
   private String edtBros_imp3_Internalname ;
   private String A11371Bros_imp3 ;
   private String edtBros_imp3_Jsonclick ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock76_Jsonclick ;
   private String edtBros_imp4_Internalname ;
   private String A11372Bros_imp4 ;
   private String edtBros_imp4_Jsonclick ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock77_Jsonclick ;
   private String edtBros_imp5_Internalname ;
   private String A11373Bros_imp5 ;
   private String edtBros_imp5_Jsonclick ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock78_Jsonclick ;
   private String edtBros_imp6_Internalname ;
   private String A11374Bros_imp6 ;
   private String edtBros_imp6_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtBros_imp7_Internalname ;
   private String A11375Bros_imp7 ;
   private String edtBros_imp7_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String edtBros_imp8_Internalname ;
   private String A11376Bros_imp8 ;
   private String edtBros_imp8_Jsonclick ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock81_Jsonclick ;
   private String edtBros_imp9_Internalname ;
   private String A11377Bros_imp9 ;
   private String edtBros_imp9_Jsonclick ;
   private String lblTextblock82_Internalname ;
   private String lblTextblock82_Jsonclick ;
   private String edtBros_imp10_Internalname ;
   private String A11378Bros_imp10 ;
   private String edtBros_imp10_Jsonclick ;
   private String lblTextblock83_Internalname ;
   private String lblTextblock83_Jsonclick ;
   private String edtBros_imp11_Internalname ;
   private String A11379Bros_imp11 ;
   private String edtBros_imp11_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String edtBros_oekot_Internalname ;
   private String A11380Bros_oekot ;
   private String edtBros_oekot_Jsonclick ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock85_Jsonclick ;
   private String edtBros_lavad_Internalname ;
   private String A11381Bros_lavad ;
   private String edtBros_lavad_Jsonclick ;
   private String lblTextblock86_Internalname ;
   private String lblTextblock86_Jsonclick ;
   private String edtBros_luz_Internalname ;
   private String A11382Bros_luz ;
   private String edtBros_luz_Jsonclick ;
   private String lblTextblock87_Internalname ;
   private String lblTextblock87_Jsonclick ;
   private String edtBros_sudor_Internalname ;
   private String A11383Bros_sudor ;
   private String edtBros_sudor_Jsonclick ;
   private String lblTextblock88_Internalname ;
   private String lblTextblock88_Jsonclick ;
   private String edtBros_cloro_Internalname ;
   private String A11384Bros_cloro ;
   private String edtBros_cloro_Jsonclick ;
   private String lblTextblock89_Internalname ;
   private String lblTextblock89_Jsonclick ;
   private String edtBros_aguam_Internalname ;
   private String A11385Bros_aguam ;
   private String edtBros_aguam_Jsonclick ;
   private String lblTextblock90_Internalname ;
   private String lblTextblock90_Jsonclick ;
   private String edtBros_termo_Internalname ;
   private String A11386Bros_termo ;
   private String edtBros_termo_Jsonclick ;
   private String lblTextblock91_Internalname ;
   private String lblTextblock91_Jsonclick ;
   private String edtBros_humed_Internalname ;
   private String edtBros_humed_Jsonclick ;
   private String lblTextblock92_Internalname ;
   private String lblTextblock92_Jsonclick ;
   private String edtBros_obs1_Internalname ;
   private String A11407Bros_obs1 ;
   private String edtBros_obs1_Jsonclick ;
   private String lblTextblock93_Internalname ;
   private String lblTextblock93_Jsonclick ;
   private String edtBros_obs2_Internalname ;
   private String A11408Bros_obs2 ;
   private String edtBros_obs2_Jsonclick ;
   private String lblTextblock94_Internalname ;
   private String lblTextblock94_Jsonclick ;
   private String edtBros_obs3_Internalname ;
   private String A11409Bros_obs3 ;
   private String edtBros_obs3_Jsonclick ;
   private String lblTextblock95_Internalname ;
   private String lblTextblock95_Jsonclick ;
   private String edtBros_obs4_Internalname ;
   private String A11410Bros_obs4 ;
   private String edtBros_obs4_Jsonclick ;
   private String lblTextblock96_Internalname ;
   private String lblTextblock96_Jsonclick ;
   private String edtBros_obs5_Internalname ;
   private String A11411Bros_obs5 ;
   private String edtBros_obs5_Jsonclick ;
   private String lblTextblock97_Internalname ;
   private String lblTextblock97_Jsonclick ;
   private String edtBros_obs6_Internalname ;
   private String A11412Bros_obs6 ;
   private String edtBros_obs6_Jsonclick ;
   private String lblTextblock98_Internalname ;
   private String lblTextblock98_Jsonclick ;
   private String edtBros_obs7_Internalname ;
   private String A11413Bros_obs7 ;
   private String edtBros_obs7_Jsonclick ;
   private String lblTextblock99_Internalname ;
   private String lblTextblock99_Jsonclick ;
   private String edtBros_obs8_Internalname ;
   private String A11414Bros_obs8 ;
   private String edtBros_obs8_Jsonclick ;
   private String lblTextblock100_Internalname ;
   private String lblTextblock100_Jsonclick ;
   private String edtBros_obs9_Internalname ;
   private String A11415Bros_obs9 ;
   private String edtBros_obs9_Jsonclick ;
   private String lblTextblock101_Internalname ;
   private String lblTextblock101_Jsonclick ;
   private String edtBros_obs10_Internalname ;
   private String A11416Bros_obs10 ;
   private String edtBros_obs10_Jsonclick ;
   private String lblTextblock102_Internalname ;
   private String lblTextblock102_Jsonclick ;
   private String edtBros_obs11_Internalname ;
   private String A11417Bros_obs11 ;
   private String edtBros_obs11_Jsonclick ;
   private String lblTextblock103_Internalname ;
   private String lblTextblock103_Jsonclick ;
   private String edtBros_nc_Internalname ;
   private String edtBros_nc_Jsonclick ;
   private String lblTextblock104_Internalname ;
   private String lblTextblock104_Jsonclick ;
   private String edtBros_enc_Internalname ;
   private String edtBros_enc_Jsonclick ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode1467 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10979Bros_Mcot ;
   private String i10980Bros_Pd ;
   private String i10981Bros_Pp ;
   private String i10982Bros_Ag ;
   private String i10985Bros_bo ;
   private String i10986Bros_bob ;
   private String i10988BrosBov ;
   private String i10987Bros_boe ;
   private String i10990Bros_tns ;
   private String i10991Bros_tnc ;
   private String i10993Bros_ct ;
   private String i10995Bros_scs ;
   private String i10996Bros_scc ;
   private String i10998Bros_cctse ;
   private String i10999Bros_ccttp ;
   private String i11000Bros_cctet ;
   private String i11003Bros_ccpc ;
   private String i11004Bros_cctq ;
   private String i11005Bros_cccc ;
   private String i11006Bros_ccec ;
   private String i11008Bros_ccmc1 ;
   private String i11009Bros_ccmc2 ;
   private String i11010Bros_ccmc3 ;
   private String i11011Bros_ccmc4 ;
   private String i11012Bros_ccmc5 ;
   private String i11013Bros_ccmc6 ;
   private String i11015Bros_rb ;
   private String i11017Bros_rbe ;
   private String i11016Bros_rbi ;
   private String i11018Bros_rbp ;
   private String i11020Bros_rb1 ;
   private String i11021Bros_rb3 ;
   private String i11023Bros_ep1 ;
   private String i11024Bros_ep2 ;
   private String i11025Bros_ep3 ;
   private String i11026Bros_ep4 ;
   private String i11027Bros_ep5 ;
   private String i11028Bros_ep6 ;
   private String i11029Bros_ep7 ;
   private String i11030Bros_ep8 ;
   private String i11031Bros_ep9 ;
   private String i11032Bros_ep10 ;
   private String i11034Bros_sa1 ;
   private String i11035Bros_sa2 ;
   private String i11036Bros_sa3 ;
   private String i11038Bros_sa5 ;
   private String i11039Bros_sa6 ;
   private String i11066Bros_stk ;
   private String ZZ396EmprCod ;
   private String ZZ10978Bros_Art ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ10979Bros_Mcot ;
   private String ZZ10980Bros_Pd ;
   private String ZZ10981Bros_Pp ;
   private String ZZ10982Bros_Ag ;
   private String ZZ10985Bros_bo ;
   private String ZZ10986Bros_bob ;
   private String ZZ10987Bros_boe ;
   private String ZZ10988BrosBov ;
   private String ZZ10990Bros_tns ;
   private String ZZ10991Bros_tnc ;
   private String ZZ10993Bros_ct ;
   private String ZZ10995Bros_scs ;
   private String ZZ10996Bros_scc ;
   private String ZZ10998Bros_cctse ;
   private String ZZ10999Bros_ccttp ;
   private String ZZ11000Bros_cctet ;
   private String ZZ11003Bros_ccpc ;
   private String ZZ11004Bros_cctq ;
   private String ZZ11005Bros_cccc ;
   private String ZZ11006Bros_ccec ;
   private String ZZ11008Bros_ccmc1 ;
   private String ZZ11009Bros_ccmc2 ;
   private String ZZ11010Bros_ccmc3 ;
   private String ZZ11011Bros_ccmc4 ;
   private String ZZ11012Bros_ccmc5 ;
   private String ZZ11013Bros_ccmc6 ;
   private String ZZ11015Bros_rb ;
   private String ZZ11016Bros_rbi ;
   private String ZZ11017Bros_rbe ;
   private String ZZ11018Bros_rbp ;
   private String ZZ11020Bros_rb1 ;
   private String ZZ11021Bros_rb3 ;
   private String ZZ11023Bros_ep1 ;
   private String ZZ11024Bros_ep2 ;
   private String ZZ11025Bros_ep3 ;
   private String ZZ11026Bros_ep4 ;
   private String ZZ11027Bros_ep5 ;
   private String ZZ11028Bros_ep6 ;
   private String ZZ11029Bros_ep7 ;
   private String ZZ11030Bros_ep8 ;
   private String ZZ11031Bros_ep9 ;
   private String ZZ11032Bros_ep10 ;
   private String ZZ11034Bros_sa1 ;
   private String ZZ11035Bros_sa2 ;
   private String ZZ11036Bros_sa3 ;
   private String ZZ11037Bros_sa4 ;
   private String ZZ11038Bros_sa5 ;
   private String ZZ11039Bros_sa6 ;
   private String ZZ11066Bros_stk ;
   private String ZZ11067Bros_Lbta ;
   private String ZZ11369Bros_imp1 ;
   private String ZZ11370Bros_imp2 ;
   private String ZZ11371Bros_imp3 ;
   private String ZZ11372Bros_imp4 ;
   private String ZZ11373Bros_imp5 ;
   private String ZZ11374Bros_imp6 ;
   private String ZZ11375Bros_imp7 ;
   private String ZZ11376Bros_imp8 ;
   private String ZZ11377Bros_imp9 ;
   private String ZZ11378Bros_imp10 ;
   private String ZZ11379Bros_imp11 ;
   private String ZZ11380Bros_oekot ;
   private String ZZ11381Bros_lavad ;
   private String ZZ11382Bros_luz ;
   private String ZZ11383Bros_sudor ;
   private String ZZ11384Bros_cloro ;
   private String ZZ11385Bros_aguam ;
   private String ZZ11386Bros_termo ;
   private String ZZ11407Bros_obs1 ;
   private String ZZ11408Bros_obs2 ;
   private String ZZ11409Bros_obs3 ;
   private String ZZ11410Bros_obs4 ;
   private String ZZ11411Bros_obs5 ;
   private String ZZ11412Bros_obs6 ;
   private String ZZ11413Bros_obs7 ;
   private String ZZ11414Bros_obs8 ;
   private String ZZ11415Bros_obs9 ;
   private String ZZ11416Bros_obs10 ;
   private String ZZ11417Bros_obs11 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean n10988BrosBov ;
   private boolean n407EmprNom ;
   private boolean n10979Bros_Mcot ;
   private boolean n10980Bros_Pd ;
   private boolean n10981Bros_Pp ;
   private boolean n10982Bros_Ag ;
   private boolean n10983Bros_c1 ;
   private boolean n10984Bros_c2 ;
   private boolean n10985Bros_bo ;
   private boolean n10986Bros_bob ;
   private boolean n10987Bros_boe ;
   private boolean n10989Bros_c3 ;
   private boolean n10990Bros_tns ;
   private boolean n10991Bros_tnc ;
   private boolean n10992Bros_c4 ;
   private boolean n10993Bros_ct ;
   private boolean n10994Bros_c5 ;
   private boolean n10995Bros_scs ;
   private boolean n10996Bros_scc ;
   private boolean n10997Bros_c6 ;
   private boolean n10998Bros_cctse ;
   private boolean n10999Bros_ccttp ;
   private boolean n11000Bros_cctet ;
   private boolean n11001Bros_ccp ;
   private boolean n11002Bros_cct ;
   private boolean n11003Bros_ccpc ;
   private boolean n11004Bros_cctq ;
   private boolean n11005Bros_cccc ;
   private boolean n11006Bros_ccec ;
   private boolean n11008Bros_ccmc1 ;
   private boolean n11009Bros_ccmc2 ;
   private boolean n11010Bros_ccmc3 ;
   private boolean n11011Bros_ccmc4 ;
   private boolean n11012Bros_ccmc5 ;
   private boolean n11013Bros_ccmc6 ;
   private boolean n11014Bros_c7 ;
   private boolean n11015Bros_rb ;
   private boolean n11016Bros_rbi ;
   private boolean n11017Bros_rbe ;
   private boolean n11018Bros_rbp ;
   private boolean n11019Bros_rboc ;
   private boolean n11020Bros_rb1 ;
   private boolean n11021Bros_rb3 ;
   private boolean n11022Bros_c8 ;
   private boolean n11023Bros_ep1 ;
   private boolean n11024Bros_ep2 ;
   private boolean n11025Bros_ep3 ;
   private boolean n11026Bros_ep4 ;
   private boolean n11027Bros_ep5 ;
   private boolean n11028Bros_ep6 ;
   private boolean n11029Bros_ep7 ;
   private boolean n11030Bros_ep8 ;
   private boolean n11031Bros_ep9 ;
   private boolean n11032Bros_ep10 ;
   private boolean n11033Bros_c9 ;
   private boolean n11034Bros_sa1 ;
   private boolean n11035Bros_sa2 ;
   private boolean n11036Bros_sa3 ;
   private boolean n11037Bros_sa4 ;
   private boolean n11038Bros_sa5 ;
   private boolean n11039Bros_sa6 ;
   private boolean n11040Bros_c10 ;
   private boolean n11066Bros_stk ;
   private boolean n11067Bros_Lbta ;
   private boolean n11068Bros_Lbtp ;
   private boolean n11069Bros_c11 ;
   private boolean n11070Bros_c12 ;
   private boolean n11369Bros_imp1 ;
   private boolean n11370Bros_imp2 ;
   private boolean n11371Bros_imp3 ;
   private boolean n11372Bros_imp4 ;
   private boolean n11373Bros_imp5 ;
   private boolean n11374Bros_imp6 ;
   private boolean n11375Bros_imp7 ;
   private boolean n11376Bros_imp8 ;
   private boolean n11377Bros_imp9 ;
   private boolean n11378Bros_imp10 ;
   private boolean n11379Bros_imp11 ;
   private boolean n11380Bros_oekot ;
   private boolean n11381Bros_lavad ;
   private boolean n11382Bros_luz ;
   private boolean n11383Bros_sudor ;
   private boolean n11384Bros_cloro ;
   private boolean n11385Bros_aguam ;
   private boolean n11386Bros_termo ;
   private boolean n11387Bros_humed ;
   private boolean n11407Bros_obs1 ;
   private boolean n11408Bros_obs2 ;
   private boolean n11409Bros_obs3 ;
   private boolean n11410Bros_obs4 ;
   private boolean n11411Bros_obs5 ;
   private boolean n11412Bros_obs6 ;
   private boolean n11413Bros_obs7 ;
   private boolean n11414Bros_obs8 ;
   private boolean n11415Bros_obs9 ;
   private boolean n11416Bros_obs10 ;
   private boolean n11417Bros_obs11 ;
   private boolean n11703Bros_nc ;
   private boolean n11704Bros_enc ;
   private boolean Gx_longc ;
   private String Z10983Bros_c1 ;
   private String Z10984Bros_c2 ;
   private String Z10989Bros_c3 ;
   private String Z10992Bros_c4 ;
   private String Z10994Bros_c5 ;
   private String Z10997Bros_c6 ;
   private String Z11014Bros_c7 ;
   private String Z11022Bros_c8 ;
   private String Z11033Bros_c9 ;
   private String Z11040Bros_c10 ;
   private String Z11069Bros_c11 ;
   private String Z11070Bros_c12 ;
   private String A10983Bros_c1 ;
   private String A10984Bros_c2 ;
   private String A10989Bros_c3 ;
   private String A10992Bros_c4 ;
   private String A10994Bros_c5 ;
   private String A10997Bros_c6 ;
   private String A11014Bros_c7 ;
   private String A11022Bros_c8 ;
   private String A11033Bros_c9 ;
   private String A11040Bros_c10 ;
   private String A11069Bros_c11 ;
   private String A11070Bros_c12 ;
   private String ZZ10983Bros_c1 ;
   private String ZZ10984Bros_c2 ;
   private String ZZ10989Bros_c3 ;
   private String ZZ10992Bros_c4 ;
   private String ZZ10994Bros_c5 ;
   private String ZZ10997Bros_c6 ;
   private String ZZ11014Bros_c7 ;
   private String ZZ11022Bros_c8 ;
   private String ZZ11033Bros_c9 ;
   private String ZZ11040Bros_c10 ;
   private String ZZ11069Bros_c11 ;
   private String ZZ11070Bros_c12 ;
   private HTMLChoice cmbBrosBov ;
   private IDataStoreProvider pr_default ;
   private String[] T01AF4_A407EmprNom ;
   private boolean[] T01AF4_n407EmprNom ;
   private String[] T01AF5_A279CliNom ;
   private java.math.BigDecimal[] T01AF7_A11704Bros_enc ;
   private boolean[] T01AF7_n11704Bros_enc ;
   private String[] T01AF7_A396EmprCod ;
   private int[] T01AF7_A252CliCod ;
   private short[] T01AF7_A840TrnCod ;
   private boolean[] T01AF7_n840TrnCod ;
   private String[] T01AF7_A10978Bros_Art ;
   private String[] T01AF7_A407EmprNom ;
   private boolean[] T01AF7_n407EmprNom ;
   private String[] T01AF7_A279CliNom ;
   private String[] T01AF7_A10979Bros_Mcot ;
   private boolean[] T01AF7_n10979Bros_Mcot ;
   private String[] T01AF7_A10980Bros_Pd ;
   private boolean[] T01AF7_n10980Bros_Pd ;
   private String[] T01AF7_A10981Bros_Pp ;
   private boolean[] T01AF7_n10981Bros_Pp ;
   private String[] T01AF7_A10982Bros_Ag ;
   private boolean[] T01AF7_n10982Bros_Ag ;
   private String[] T01AF7_A10983Bros_c1 ;
   private boolean[] T01AF7_n10983Bros_c1 ;
   private String[] T01AF7_A10984Bros_c2 ;
   private boolean[] T01AF7_n10984Bros_c2 ;
   private String[] T01AF7_A10985Bros_bo ;
   private boolean[] T01AF7_n10985Bros_bo ;
   private String[] T01AF7_A10986Bros_bob ;
   private boolean[] T01AF7_n10986Bros_bob ;
   private String[] T01AF7_A10987Bros_boe ;
   private boolean[] T01AF7_n10987Bros_boe ;
   private String[] T01AF7_A10988BrosBov ;
   private boolean[] T01AF7_n10988BrosBov ;
   private String[] T01AF7_A10989Bros_c3 ;
   private boolean[] T01AF7_n10989Bros_c3 ;
   private String[] T01AF7_A10990Bros_tns ;
   private boolean[] T01AF7_n10990Bros_tns ;
   private String[] T01AF7_A10991Bros_tnc ;
   private boolean[] T01AF7_n10991Bros_tnc ;
   private String[] T01AF7_A10992Bros_c4 ;
   private boolean[] T01AF7_n10992Bros_c4 ;
   private String[] T01AF7_A10993Bros_ct ;
   private boolean[] T01AF7_n10993Bros_ct ;
   private String[] T01AF7_A10994Bros_c5 ;
   private boolean[] T01AF7_n10994Bros_c5 ;
   private String[] T01AF7_A10995Bros_scs ;
   private boolean[] T01AF7_n10995Bros_scs ;
   private String[] T01AF7_A10996Bros_scc ;
   private boolean[] T01AF7_n10996Bros_scc ;
   private String[] T01AF7_A10997Bros_c6 ;
   private boolean[] T01AF7_n10997Bros_c6 ;
   private String[] T01AF7_A10998Bros_cctse ;
   private boolean[] T01AF7_n10998Bros_cctse ;
   private String[] T01AF7_A10999Bros_ccttp ;
   private boolean[] T01AF7_n10999Bros_ccttp ;
   private String[] T01AF7_A11000Bros_cctet ;
   private boolean[] T01AF7_n11000Bros_cctet ;
   private byte[] T01AF7_A11001Bros_ccp ;
   private boolean[] T01AF7_n11001Bros_ccp ;
   private byte[] T01AF7_A11002Bros_cct ;
   private boolean[] T01AF7_n11002Bros_cct ;
   private String[] T01AF7_A11003Bros_ccpc ;
   private boolean[] T01AF7_n11003Bros_ccpc ;
   private String[] T01AF7_A11004Bros_cctq ;
   private boolean[] T01AF7_n11004Bros_cctq ;
   private String[] T01AF7_A11005Bros_cccc ;
   private boolean[] T01AF7_n11005Bros_cccc ;
   private String[] T01AF7_A11006Bros_ccec ;
   private boolean[] T01AF7_n11006Bros_ccec ;
   private String[] T01AF7_A11008Bros_ccmc1 ;
   private boolean[] T01AF7_n11008Bros_ccmc1 ;
   private String[] T01AF7_A11009Bros_ccmc2 ;
   private boolean[] T01AF7_n11009Bros_ccmc2 ;
   private String[] T01AF7_A11010Bros_ccmc3 ;
   private boolean[] T01AF7_n11010Bros_ccmc3 ;
   private String[] T01AF7_A11011Bros_ccmc4 ;
   private boolean[] T01AF7_n11011Bros_ccmc4 ;
   private String[] T01AF7_A11012Bros_ccmc5 ;
   private boolean[] T01AF7_n11012Bros_ccmc5 ;
   private String[] T01AF7_A11013Bros_ccmc6 ;
   private boolean[] T01AF7_n11013Bros_ccmc6 ;
   private String[] T01AF7_A11014Bros_c7 ;
   private boolean[] T01AF7_n11014Bros_c7 ;
   private String[] T01AF7_A11015Bros_rb ;
   private boolean[] T01AF7_n11015Bros_rb ;
   private String[] T01AF7_A11016Bros_rbi ;
   private boolean[] T01AF7_n11016Bros_rbi ;
   private String[] T01AF7_A11017Bros_rbe ;
   private boolean[] T01AF7_n11017Bros_rbe ;
   private String[] T01AF7_A11018Bros_rbp ;
   private boolean[] T01AF7_n11018Bros_rbp ;
   private short[] T01AF7_A11019Bros_rboc ;
   private boolean[] T01AF7_n11019Bros_rboc ;
   private String[] T01AF7_A11020Bros_rb1 ;
   private boolean[] T01AF7_n11020Bros_rb1 ;
   private String[] T01AF7_A11021Bros_rb3 ;
   private boolean[] T01AF7_n11021Bros_rb3 ;
   private String[] T01AF7_A11022Bros_c8 ;
   private boolean[] T01AF7_n11022Bros_c8 ;
   private String[] T01AF7_A11023Bros_ep1 ;
   private boolean[] T01AF7_n11023Bros_ep1 ;
   private String[] T01AF7_A11024Bros_ep2 ;
   private boolean[] T01AF7_n11024Bros_ep2 ;
   private String[] T01AF7_A11025Bros_ep3 ;
   private boolean[] T01AF7_n11025Bros_ep3 ;
   private String[] T01AF7_A11026Bros_ep4 ;
   private boolean[] T01AF7_n11026Bros_ep4 ;
   private String[] T01AF7_A11027Bros_ep5 ;
   private boolean[] T01AF7_n11027Bros_ep5 ;
   private String[] T01AF7_A11028Bros_ep6 ;
   private boolean[] T01AF7_n11028Bros_ep6 ;
   private String[] T01AF7_A11029Bros_ep7 ;
   private boolean[] T01AF7_n11029Bros_ep7 ;
   private String[] T01AF7_A11030Bros_ep8 ;
   private boolean[] T01AF7_n11030Bros_ep8 ;
   private String[] T01AF7_A11031Bros_ep9 ;
   private boolean[] T01AF7_n11031Bros_ep9 ;
   private String[] T01AF7_A11032Bros_ep10 ;
   private boolean[] T01AF7_n11032Bros_ep10 ;
   private String[] T01AF7_A11033Bros_c9 ;
   private boolean[] T01AF7_n11033Bros_c9 ;
   private String[] T01AF7_A11034Bros_sa1 ;
   private boolean[] T01AF7_n11034Bros_sa1 ;
   private String[] T01AF7_A11035Bros_sa2 ;
   private boolean[] T01AF7_n11035Bros_sa2 ;
   private String[] T01AF7_A11036Bros_sa3 ;
   private boolean[] T01AF7_n11036Bros_sa3 ;
   private String[] T01AF7_A11037Bros_sa4 ;
   private boolean[] T01AF7_n11037Bros_sa4 ;
   private String[] T01AF7_A11038Bros_sa5 ;
   private boolean[] T01AF7_n11038Bros_sa5 ;
   private String[] T01AF7_A11039Bros_sa6 ;
   private boolean[] T01AF7_n11039Bros_sa6 ;
   private String[] T01AF7_A11040Bros_c10 ;
   private boolean[] T01AF7_n11040Bros_c10 ;
   private String[] T01AF7_A11066Bros_stk ;
   private boolean[] T01AF7_n11066Bros_stk ;
   private String[] T01AF7_A11067Bros_Lbta ;
   private boolean[] T01AF7_n11067Bros_Lbta ;
   private short[] T01AF7_A11068Bros_Lbtp ;
   private boolean[] T01AF7_n11068Bros_Lbtp ;
   private String[] T01AF7_A11069Bros_c11 ;
   private boolean[] T01AF7_n11069Bros_c11 ;
   private String[] T01AF7_A11070Bros_c12 ;
   private boolean[] T01AF7_n11070Bros_c12 ;
   private String[] T01AF7_A11369Bros_imp1 ;
   private boolean[] T01AF7_n11369Bros_imp1 ;
   private String[] T01AF7_A11370Bros_imp2 ;
   private boolean[] T01AF7_n11370Bros_imp2 ;
   private String[] T01AF7_A11371Bros_imp3 ;
   private boolean[] T01AF7_n11371Bros_imp3 ;
   private String[] T01AF7_A11372Bros_imp4 ;
   private boolean[] T01AF7_n11372Bros_imp4 ;
   private String[] T01AF7_A11373Bros_imp5 ;
   private boolean[] T01AF7_n11373Bros_imp5 ;
   private String[] T01AF7_A11374Bros_imp6 ;
   private boolean[] T01AF7_n11374Bros_imp6 ;
   private String[] T01AF7_A11375Bros_imp7 ;
   private boolean[] T01AF7_n11375Bros_imp7 ;
   private String[] T01AF7_A11376Bros_imp8 ;
   private boolean[] T01AF7_n11376Bros_imp8 ;
   private String[] T01AF7_A11377Bros_imp9 ;
   private boolean[] T01AF7_n11377Bros_imp9 ;
   private String[] T01AF7_A11378Bros_imp10 ;
   private boolean[] T01AF7_n11378Bros_imp10 ;
   private String[] T01AF7_A11379Bros_imp11 ;
   private boolean[] T01AF7_n11379Bros_imp11 ;
   private String[] T01AF7_A11380Bros_oekot ;
   private boolean[] T01AF7_n11380Bros_oekot ;
   private String[] T01AF7_A11381Bros_lavad ;
   private boolean[] T01AF7_n11381Bros_lavad ;
   private String[] T01AF7_A11382Bros_luz ;
   private boolean[] T01AF7_n11382Bros_luz ;
   private String[] T01AF7_A11383Bros_sudor ;
   private boolean[] T01AF7_n11383Bros_sudor ;
   private String[] T01AF7_A11384Bros_cloro ;
   private boolean[] T01AF7_n11384Bros_cloro ;
   private String[] T01AF7_A11385Bros_aguam ;
   private boolean[] T01AF7_n11385Bros_aguam ;
   private String[] T01AF7_A11386Bros_termo ;
   private boolean[] T01AF7_n11386Bros_termo ;
   private byte[] T01AF7_A11387Bros_humed ;
   private boolean[] T01AF7_n11387Bros_humed ;
   private String[] T01AF7_A11407Bros_obs1 ;
   private boolean[] T01AF7_n11407Bros_obs1 ;
   private String[] T01AF7_A11408Bros_obs2 ;
   private boolean[] T01AF7_n11408Bros_obs2 ;
   private String[] T01AF7_A11409Bros_obs3 ;
   private boolean[] T01AF7_n11409Bros_obs3 ;
   private String[] T01AF7_A11410Bros_obs4 ;
   private boolean[] T01AF7_n11410Bros_obs4 ;
   private String[] T01AF7_A11411Bros_obs5 ;
   private boolean[] T01AF7_n11411Bros_obs5 ;
   private String[] T01AF7_A11412Bros_obs6 ;
   private boolean[] T01AF7_n11412Bros_obs6 ;
   private String[] T01AF7_A11413Bros_obs7 ;
   private boolean[] T01AF7_n11413Bros_obs7 ;
   private String[] T01AF7_A11414Bros_obs8 ;
   private boolean[] T01AF7_n11414Bros_obs8 ;
   private String[] T01AF7_A11415Bros_obs9 ;
   private boolean[] T01AF7_n11415Bros_obs9 ;
   private String[] T01AF7_A11416Bros_obs10 ;
   private boolean[] T01AF7_n11416Bros_obs10 ;
   private String[] T01AF7_A11417Bros_obs11 ;
   private boolean[] T01AF7_n11417Bros_obs11 ;
   private byte[] T01AF7_A11703Bros_nc ;
   private boolean[] T01AF7_n11703Bros_nc ;
   private String[] T01AF6_A396EmprCod ;
   private String[] T01AF8_A396EmprCod ;
   private String[] T01AF9_A396EmprCod ;
   private int[] T01AF9_A252CliCod ;
   private String[] T01AF9_A10978Bros_Art ;
   private java.math.BigDecimal[] T01AF3_A11704Bros_enc ;
   private boolean[] T01AF3_n11704Bros_enc ;
   private String[] T01AF3_A396EmprCod ;
   private int[] T01AF3_A252CliCod ;
   private short[] T01AF3_A840TrnCod ;
   private boolean[] T01AF3_n840TrnCod ;
   private String[] T01AF3_A10978Bros_Art ;
   private String[] T01AF3_A10979Bros_Mcot ;
   private boolean[] T01AF3_n10979Bros_Mcot ;
   private String[] T01AF3_A10980Bros_Pd ;
   private boolean[] T01AF3_n10980Bros_Pd ;
   private String[] T01AF3_A10981Bros_Pp ;
   private boolean[] T01AF3_n10981Bros_Pp ;
   private String[] T01AF3_A10982Bros_Ag ;
   private boolean[] T01AF3_n10982Bros_Ag ;
   private String[] T01AF3_A10983Bros_c1 ;
   private boolean[] T01AF3_n10983Bros_c1 ;
   private String[] T01AF3_A10984Bros_c2 ;
   private boolean[] T01AF3_n10984Bros_c2 ;
   private String[] T01AF3_A10985Bros_bo ;
   private boolean[] T01AF3_n10985Bros_bo ;
   private String[] T01AF3_A10986Bros_bob ;
   private boolean[] T01AF3_n10986Bros_bob ;
   private String[] T01AF3_A10987Bros_boe ;
   private boolean[] T01AF3_n10987Bros_boe ;
   private String[] T01AF3_A10988BrosBov ;
   private boolean[] T01AF3_n10988BrosBov ;
   private String[] T01AF3_A10989Bros_c3 ;
   private boolean[] T01AF3_n10989Bros_c3 ;
   private String[] T01AF3_A10990Bros_tns ;
   private boolean[] T01AF3_n10990Bros_tns ;
   private String[] T01AF3_A10991Bros_tnc ;
   private boolean[] T01AF3_n10991Bros_tnc ;
   private String[] T01AF3_A10992Bros_c4 ;
   private boolean[] T01AF3_n10992Bros_c4 ;
   private String[] T01AF3_A10993Bros_ct ;
   private boolean[] T01AF3_n10993Bros_ct ;
   private String[] T01AF3_A10994Bros_c5 ;
   private boolean[] T01AF3_n10994Bros_c5 ;
   private String[] T01AF3_A10995Bros_scs ;
   private boolean[] T01AF3_n10995Bros_scs ;
   private String[] T01AF3_A10996Bros_scc ;
   private boolean[] T01AF3_n10996Bros_scc ;
   private String[] T01AF3_A10997Bros_c6 ;
   private boolean[] T01AF3_n10997Bros_c6 ;
   private String[] T01AF3_A10998Bros_cctse ;
   private boolean[] T01AF3_n10998Bros_cctse ;
   private String[] T01AF3_A10999Bros_ccttp ;
   private boolean[] T01AF3_n10999Bros_ccttp ;
   private String[] T01AF3_A11000Bros_cctet ;
   private boolean[] T01AF3_n11000Bros_cctet ;
   private byte[] T01AF3_A11001Bros_ccp ;
   private boolean[] T01AF3_n11001Bros_ccp ;
   private byte[] T01AF3_A11002Bros_cct ;
   private boolean[] T01AF3_n11002Bros_cct ;
   private String[] T01AF3_A11003Bros_ccpc ;
   private boolean[] T01AF3_n11003Bros_ccpc ;
   private String[] T01AF3_A11004Bros_cctq ;
   private boolean[] T01AF3_n11004Bros_cctq ;
   private String[] T01AF3_A11005Bros_cccc ;
   private boolean[] T01AF3_n11005Bros_cccc ;
   private String[] T01AF3_A11006Bros_ccec ;
   private boolean[] T01AF3_n11006Bros_ccec ;
   private String[] T01AF3_A11008Bros_ccmc1 ;
   private boolean[] T01AF3_n11008Bros_ccmc1 ;
   private String[] T01AF3_A11009Bros_ccmc2 ;
   private boolean[] T01AF3_n11009Bros_ccmc2 ;
   private String[] T01AF3_A11010Bros_ccmc3 ;
   private boolean[] T01AF3_n11010Bros_ccmc3 ;
   private String[] T01AF3_A11011Bros_ccmc4 ;
   private boolean[] T01AF3_n11011Bros_ccmc4 ;
   private String[] T01AF3_A11012Bros_ccmc5 ;
   private boolean[] T01AF3_n11012Bros_ccmc5 ;
   private String[] T01AF3_A11013Bros_ccmc6 ;
   private boolean[] T01AF3_n11013Bros_ccmc6 ;
   private String[] T01AF3_A11014Bros_c7 ;
   private boolean[] T01AF3_n11014Bros_c7 ;
   private String[] T01AF3_A11015Bros_rb ;
   private boolean[] T01AF3_n11015Bros_rb ;
   private String[] T01AF3_A11016Bros_rbi ;
   private boolean[] T01AF3_n11016Bros_rbi ;
   private String[] T01AF3_A11017Bros_rbe ;
   private boolean[] T01AF3_n11017Bros_rbe ;
   private String[] T01AF3_A11018Bros_rbp ;
   private boolean[] T01AF3_n11018Bros_rbp ;
   private short[] T01AF3_A11019Bros_rboc ;
   private boolean[] T01AF3_n11019Bros_rboc ;
   private String[] T01AF3_A11020Bros_rb1 ;
   private boolean[] T01AF3_n11020Bros_rb1 ;
   private String[] T01AF3_A11021Bros_rb3 ;
   private boolean[] T01AF3_n11021Bros_rb3 ;
   private String[] T01AF3_A11022Bros_c8 ;
   private boolean[] T01AF3_n11022Bros_c8 ;
   private String[] T01AF3_A11023Bros_ep1 ;
   private boolean[] T01AF3_n11023Bros_ep1 ;
   private String[] T01AF3_A11024Bros_ep2 ;
   private boolean[] T01AF3_n11024Bros_ep2 ;
   private String[] T01AF3_A11025Bros_ep3 ;
   private boolean[] T01AF3_n11025Bros_ep3 ;
   private String[] T01AF3_A11026Bros_ep4 ;
   private boolean[] T01AF3_n11026Bros_ep4 ;
   private String[] T01AF3_A11027Bros_ep5 ;
   private boolean[] T01AF3_n11027Bros_ep5 ;
   private String[] T01AF3_A11028Bros_ep6 ;
   private boolean[] T01AF3_n11028Bros_ep6 ;
   private String[] T01AF3_A11029Bros_ep7 ;
   private boolean[] T01AF3_n11029Bros_ep7 ;
   private String[] T01AF3_A11030Bros_ep8 ;
   private boolean[] T01AF3_n11030Bros_ep8 ;
   private String[] T01AF3_A11031Bros_ep9 ;
   private boolean[] T01AF3_n11031Bros_ep9 ;
   private String[] T01AF3_A11032Bros_ep10 ;
   private boolean[] T01AF3_n11032Bros_ep10 ;
   private String[] T01AF3_A11033Bros_c9 ;
   private boolean[] T01AF3_n11033Bros_c9 ;
   private String[] T01AF3_A11034Bros_sa1 ;
   private boolean[] T01AF3_n11034Bros_sa1 ;
   private String[] T01AF3_A11035Bros_sa2 ;
   private boolean[] T01AF3_n11035Bros_sa2 ;
   private String[] T01AF3_A11036Bros_sa3 ;
   private boolean[] T01AF3_n11036Bros_sa3 ;
   private String[] T01AF3_A11037Bros_sa4 ;
   private boolean[] T01AF3_n11037Bros_sa4 ;
   private String[] T01AF3_A11038Bros_sa5 ;
   private boolean[] T01AF3_n11038Bros_sa5 ;
   private String[] T01AF3_A11039Bros_sa6 ;
   private boolean[] T01AF3_n11039Bros_sa6 ;
   private String[] T01AF3_A11040Bros_c10 ;
   private boolean[] T01AF3_n11040Bros_c10 ;
   private String[] T01AF3_A11066Bros_stk ;
   private boolean[] T01AF3_n11066Bros_stk ;
   private String[] T01AF3_A11067Bros_Lbta ;
   private boolean[] T01AF3_n11067Bros_Lbta ;
   private short[] T01AF3_A11068Bros_Lbtp ;
   private boolean[] T01AF3_n11068Bros_Lbtp ;
   private String[] T01AF3_A11069Bros_c11 ;
   private boolean[] T01AF3_n11069Bros_c11 ;
   private String[] T01AF3_A11070Bros_c12 ;
   private boolean[] T01AF3_n11070Bros_c12 ;
   private String[] T01AF3_A11369Bros_imp1 ;
   private boolean[] T01AF3_n11369Bros_imp1 ;
   private String[] T01AF3_A11370Bros_imp2 ;
   private boolean[] T01AF3_n11370Bros_imp2 ;
   private String[] T01AF3_A11371Bros_imp3 ;
   private boolean[] T01AF3_n11371Bros_imp3 ;
   private String[] T01AF3_A11372Bros_imp4 ;
   private boolean[] T01AF3_n11372Bros_imp4 ;
   private String[] T01AF3_A11373Bros_imp5 ;
   private boolean[] T01AF3_n11373Bros_imp5 ;
   private String[] T01AF3_A11374Bros_imp6 ;
   private boolean[] T01AF3_n11374Bros_imp6 ;
   private String[] T01AF3_A11375Bros_imp7 ;
   private boolean[] T01AF3_n11375Bros_imp7 ;
   private String[] T01AF3_A11376Bros_imp8 ;
   private boolean[] T01AF3_n11376Bros_imp8 ;
   private String[] T01AF3_A11377Bros_imp9 ;
   private boolean[] T01AF3_n11377Bros_imp9 ;
   private String[] T01AF3_A11378Bros_imp10 ;
   private boolean[] T01AF3_n11378Bros_imp10 ;
   private String[] T01AF3_A11379Bros_imp11 ;
   private boolean[] T01AF3_n11379Bros_imp11 ;
   private String[] T01AF3_A11380Bros_oekot ;
   private boolean[] T01AF3_n11380Bros_oekot ;
   private String[] T01AF3_A11381Bros_lavad ;
   private boolean[] T01AF3_n11381Bros_lavad ;
   private String[] T01AF3_A11382Bros_luz ;
   private boolean[] T01AF3_n11382Bros_luz ;
   private String[] T01AF3_A11383Bros_sudor ;
   private boolean[] T01AF3_n11383Bros_sudor ;
   private String[] T01AF3_A11384Bros_cloro ;
   private boolean[] T01AF3_n11384Bros_cloro ;
   private String[] T01AF3_A11385Bros_aguam ;
   private boolean[] T01AF3_n11385Bros_aguam ;
   private String[] T01AF3_A11386Bros_termo ;
   private boolean[] T01AF3_n11386Bros_termo ;
   private byte[] T01AF3_A11387Bros_humed ;
   private boolean[] T01AF3_n11387Bros_humed ;
   private String[] T01AF3_A11407Bros_obs1 ;
   private boolean[] T01AF3_n11407Bros_obs1 ;
   private String[] T01AF3_A11408Bros_obs2 ;
   private boolean[] T01AF3_n11408Bros_obs2 ;
   private String[] T01AF3_A11409Bros_obs3 ;
   private boolean[] T01AF3_n11409Bros_obs3 ;
   private String[] T01AF3_A11410Bros_obs4 ;
   private boolean[] T01AF3_n11410Bros_obs4 ;
   private String[] T01AF3_A11411Bros_obs5 ;
   private boolean[] T01AF3_n11411Bros_obs5 ;
   private String[] T01AF3_A11412Bros_obs6 ;
   private boolean[] T01AF3_n11412Bros_obs6 ;
   private String[] T01AF3_A11413Bros_obs7 ;
   private boolean[] T01AF3_n11413Bros_obs7 ;
   private String[] T01AF3_A11414Bros_obs8 ;
   private boolean[] T01AF3_n11414Bros_obs8 ;
   private String[] T01AF3_A11415Bros_obs9 ;
   private boolean[] T01AF3_n11415Bros_obs9 ;
   private String[] T01AF3_A11416Bros_obs10 ;
   private boolean[] T01AF3_n11416Bros_obs10 ;
   private String[] T01AF3_A11417Bros_obs11 ;
   private boolean[] T01AF3_n11417Bros_obs11 ;
   private byte[] T01AF3_A11703Bros_nc ;
   private boolean[] T01AF3_n11703Bros_nc ;
   private String[] T01AF10_A396EmprCod ;
   private int[] T01AF10_A252CliCod ;
   private String[] T01AF10_A10978Bros_Art ;
   private String[] T01AF11_A396EmprCod ;
   private int[] T01AF11_A252CliCod ;
   private String[] T01AF11_A10978Bros_Art ;
   private java.math.BigDecimal[] T01AF2_A11704Bros_enc ;
   private boolean[] T01AF2_n11704Bros_enc ;
   private String[] T01AF2_A396EmprCod ;
   private int[] T01AF2_A252CliCod ;
   private short[] T01AF2_A840TrnCod ;
   private boolean[] T01AF2_n840TrnCod ;
   private String[] T01AF2_A10978Bros_Art ;
   private String[] T01AF2_A10979Bros_Mcot ;
   private boolean[] T01AF2_n10979Bros_Mcot ;
   private String[] T01AF2_A10980Bros_Pd ;
   private boolean[] T01AF2_n10980Bros_Pd ;
   private String[] T01AF2_A10981Bros_Pp ;
   private boolean[] T01AF2_n10981Bros_Pp ;
   private String[] T01AF2_A10982Bros_Ag ;
   private boolean[] T01AF2_n10982Bros_Ag ;
   private String[] T01AF2_A10983Bros_c1 ;
   private boolean[] T01AF2_n10983Bros_c1 ;
   private String[] T01AF2_A10984Bros_c2 ;
   private boolean[] T01AF2_n10984Bros_c2 ;
   private String[] T01AF2_A10985Bros_bo ;
   private boolean[] T01AF2_n10985Bros_bo ;
   private String[] T01AF2_A10986Bros_bob ;
   private boolean[] T01AF2_n10986Bros_bob ;
   private String[] T01AF2_A10987Bros_boe ;
   private boolean[] T01AF2_n10987Bros_boe ;
   private String[] T01AF2_A10988BrosBov ;
   private boolean[] T01AF2_n10988BrosBov ;
   private String[] T01AF2_A10989Bros_c3 ;
   private boolean[] T01AF2_n10989Bros_c3 ;
   private String[] T01AF2_A10990Bros_tns ;
   private boolean[] T01AF2_n10990Bros_tns ;
   private String[] T01AF2_A10991Bros_tnc ;
   private boolean[] T01AF2_n10991Bros_tnc ;
   private String[] T01AF2_A10992Bros_c4 ;
   private boolean[] T01AF2_n10992Bros_c4 ;
   private String[] T01AF2_A10993Bros_ct ;
   private boolean[] T01AF2_n10993Bros_ct ;
   private String[] T01AF2_A10994Bros_c5 ;
   private boolean[] T01AF2_n10994Bros_c5 ;
   private String[] T01AF2_A10995Bros_scs ;
   private boolean[] T01AF2_n10995Bros_scs ;
   private String[] T01AF2_A10996Bros_scc ;
   private boolean[] T01AF2_n10996Bros_scc ;
   private String[] T01AF2_A10997Bros_c6 ;
   private boolean[] T01AF2_n10997Bros_c6 ;
   private String[] T01AF2_A10998Bros_cctse ;
   private boolean[] T01AF2_n10998Bros_cctse ;
   private String[] T01AF2_A10999Bros_ccttp ;
   private boolean[] T01AF2_n10999Bros_ccttp ;
   private String[] T01AF2_A11000Bros_cctet ;
   private boolean[] T01AF2_n11000Bros_cctet ;
   private byte[] T01AF2_A11001Bros_ccp ;
   private boolean[] T01AF2_n11001Bros_ccp ;
   private byte[] T01AF2_A11002Bros_cct ;
   private boolean[] T01AF2_n11002Bros_cct ;
   private String[] T01AF2_A11003Bros_ccpc ;
   private boolean[] T01AF2_n11003Bros_ccpc ;
   private String[] T01AF2_A11004Bros_cctq ;
   private boolean[] T01AF2_n11004Bros_cctq ;
   private String[] T01AF2_A11005Bros_cccc ;
   private boolean[] T01AF2_n11005Bros_cccc ;
   private String[] T01AF2_A11006Bros_ccec ;
   private boolean[] T01AF2_n11006Bros_ccec ;
   private String[] T01AF2_A11008Bros_ccmc1 ;
   private boolean[] T01AF2_n11008Bros_ccmc1 ;
   private String[] T01AF2_A11009Bros_ccmc2 ;
   private boolean[] T01AF2_n11009Bros_ccmc2 ;
   private String[] T01AF2_A11010Bros_ccmc3 ;
   private boolean[] T01AF2_n11010Bros_ccmc3 ;
   private String[] T01AF2_A11011Bros_ccmc4 ;
   private boolean[] T01AF2_n11011Bros_ccmc4 ;
   private String[] T01AF2_A11012Bros_ccmc5 ;
   private boolean[] T01AF2_n11012Bros_ccmc5 ;
   private String[] T01AF2_A11013Bros_ccmc6 ;
   private boolean[] T01AF2_n11013Bros_ccmc6 ;
   private String[] T01AF2_A11014Bros_c7 ;
   private boolean[] T01AF2_n11014Bros_c7 ;
   private String[] T01AF2_A11015Bros_rb ;
   private boolean[] T01AF2_n11015Bros_rb ;
   private String[] T01AF2_A11016Bros_rbi ;
   private boolean[] T01AF2_n11016Bros_rbi ;
   private String[] T01AF2_A11017Bros_rbe ;
   private boolean[] T01AF2_n11017Bros_rbe ;
   private String[] T01AF2_A11018Bros_rbp ;
   private boolean[] T01AF2_n11018Bros_rbp ;
   private short[] T01AF2_A11019Bros_rboc ;
   private boolean[] T01AF2_n11019Bros_rboc ;
   private String[] T01AF2_A11020Bros_rb1 ;
   private boolean[] T01AF2_n11020Bros_rb1 ;
   private String[] T01AF2_A11021Bros_rb3 ;
   private boolean[] T01AF2_n11021Bros_rb3 ;
   private String[] T01AF2_A11022Bros_c8 ;
   private boolean[] T01AF2_n11022Bros_c8 ;
   private String[] T01AF2_A11023Bros_ep1 ;
   private boolean[] T01AF2_n11023Bros_ep1 ;
   private String[] T01AF2_A11024Bros_ep2 ;
   private boolean[] T01AF2_n11024Bros_ep2 ;
   private String[] T01AF2_A11025Bros_ep3 ;
   private boolean[] T01AF2_n11025Bros_ep3 ;
   private String[] T01AF2_A11026Bros_ep4 ;
   private boolean[] T01AF2_n11026Bros_ep4 ;
   private String[] T01AF2_A11027Bros_ep5 ;
   private boolean[] T01AF2_n11027Bros_ep5 ;
   private String[] T01AF2_A11028Bros_ep6 ;
   private boolean[] T01AF2_n11028Bros_ep6 ;
   private String[] T01AF2_A11029Bros_ep7 ;
   private boolean[] T01AF2_n11029Bros_ep7 ;
   private String[] T01AF2_A11030Bros_ep8 ;
   private boolean[] T01AF2_n11030Bros_ep8 ;
   private String[] T01AF2_A11031Bros_ep9 ;
   private boolean[] T01AF2_n11031Bros_ep9 ;
   private String[] T01AF2_A11032Bros_ep10 ;
   private boolean[] T01AF2_n11032Bros_ep10 ;
   private String[] T01AF2_A11033Bros_c9 ;
   private boolean[] T01AF2_n11033Bros_c9 ;
   private String[] T01AF2_A11034Bros_sa1 ;
   private boolean[] T01AF2_n11034Bros_sa1 ;
   private String[] T01AF2_A11035Bros_sa2 ;
   private boolean[] T01AF2_n11035Bros_sa2 ;
   private String[] T01AF2_A11036Bros_sa3 ;
   private boolean[] T01AF2_n11036Bros_sa3 ;
   private String[] T01AF2_A11037Bros_sa4 ;
   private boolean[] T01AF2_n11037Bros_sa4 ;
   private String[] T01AF2_A11038Bros_sa5 ;
   private boolean[] T01AF2_n11038Bros_sa5 ;
   private String[] T01AF2_A11039Bros_sa6 ;
   private boolean[] T01AF2_n11039Bros_sa6 ;
   private String[] T01AF2_A11040Bros_c10 ;
   private boolean[] T01AF2_n11040Bros_c10 ;
   private String[] T01AF2_A11066Bros_stk ;
   private boolean[] T01AF2_n11066Bros_stk ;
   private String[] T01AF2_A11067Bros_Lbta ;
   private boolean[] T01AF2_n11067Bros_Lbta ;
   private short[] T01AF2_A11068Bros_Lbtp ;
   private boolean[] T01AF2_n11068Bros_Lbtp ;
   private String[] T01AF2_A11069Bros_c11 ;
   private boolean[] T01AF2_n11069Bros_c11 ;
   private String[] T01AF2_A11070Bros_c12 ;
   private boolean[] T01AF2_n11070Bros_c12 ;
   private String[] T01AF2_A11369Bros_imp1 ;
   private boolean[] T01AF2_n11369Bros_imp1 ;
   private String[] T01AF2_A11370Bros_imp2 ;
   private boolean[] T01AF2_n11370Bros_imp2 ;
   private String[] T01AF2_A11371Bros_imp3 ;
   private boolean[] T01AF2_n11371Bros_imp3 ;
   private String[] T01AF2_A11372Bros_imp4 ;
   private boolean[] T01AF2_n11372Bros_imp4 ;
   private String[] T01AF2_A11373Bros_imp5 ;
   private boolean[] T01AF2_n11373Bros_imp5 ;
   private String[] T01AF2_A11374Bros_imp6 ;
   private boolean[] T01AF2_n11374Bros_imp6 ;
   private String[] T01AF2_A11375Bros_imp7 ;
   private boolean[] T01AF2_n11375Bros_imp7 ;
   private String[] T01AF2_A11376Bros_imp8 ;
   private boolean[] T01AF2_n11376Bros_imp8 ;
   private String[] T01AF2_A11377Bros_imp9 ;
   private boolean[] T01AF2_n11377Bros_imp9 ;
   private String[] T01AF2_A11378Bros_imp10 ;
   private boolean[] T01AF2_n11378Bros_imp10 ;
   private String[] T01AF2_A11379Bros_imp11 ;
   private boolean[] T01AF2_n11379Bros_imp11 ;
   private String[] T01AF2_A11380Bros_oekot ;
   private boolean[] T01AF2_n11380Bros_oekot ;
   private String[] T01AF2_A11381Bros_lavad ;
   private boolean[] T01AF2_n11381Bros_lavad ;
   private String[] T01AF2_A11382Bros_luz ;
   private boolean[] T01AF2_n11382Bros_luz ;
   private String[] T01AF2_A11383Bros_sudor ;
   private boolean[] T01AF2_n11383Bros_sudor ;
   private String[] T01AF2_A11384Bros_cloro ;
   private boolean[] T01AF2_n11384Bros_cloro ;
   private String[] T01AF2_A11385Bros_aguam ;
   private boolean[] T01AF2_n11385Bros_aguam ;
   private String[] T01AF2_A11386Bros_termo ;
   private boolean[] T01AF2_n11386Bros_termo ;
   private byte[] T01AF2_A11387Bros_humed ;
   private boolean[] T01AF2_n11387Bros_humed ;
   private String[] T01AF2_A11407Bros_obs1 ;
   private boolean[] T01AF2_n11407Bros_obs1 ;
   private String[] T01AF2_A11408Bros_obs2 ;
   private boolean[] T01AF2_n11408Bros_obs2 ;
   private String[] T01AF2_A11409Bros_obs3 ;
   private boolean[] T01AF2_n11409Bros_obs3 ;
   private String[] T01AF2_A11410Bros_obs4 ;
   private boolean[] T01AF2_n11410Bros_obs4 ;
   private String[] T01AF2_A11411Bros_obs5 ;
   private boolean[] T01AF2_n11411Bros_obs5 ;
   private String[] T01AF2_A11412Bros_obs6 ;
   private boolean[] T01AF2_n11412Bros_obs6 ;
   private String[] T01AF2_A11413Bros_obs7 ;
   private boolean[] T01AF2_n11413Bros_obs7 ;
   private String[] T01AF2_A11414Bros_obs8 ;
   private boolean[] T01AF2_n11414Bros_obs8 ;
   private String[] T01AF2_A11415Bros_obs9 ;
   private boolean[] T01AF2_n11415Bros_obs9 ;
   private String[] T01AF2_A11416Bros_obs10 ;
   private boolean[] T01AF2_n11416Bros_obs10 ;
   private String[] T01AF2_A11417Bros_obs11 ;
   private boolean[] T01AF2_n11417Bros_obs11 ;
   private byte[] T01AF2_A11703Bros_nc ;
   private boolean[] T01AF2_n11703Bros_nc ;
   private String[] T01AF15_A396EmprCod ;
   private int[] T01AF15_A252CliCod ;
   private String[] T01AF15_A10978Bros_Art ;
   private String[] T01AF16_A407EmprNom ;
   private boolean[] T01AF16_n407EmprNom ;
   private String[] T01AF17_A279CliNom ;
   private String[] T01AF18_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tartbrs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartbrs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartbrs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartbrs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartbrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AF2", "SELECT Bros_enc, EmprCod, CliCod, TrnCod, Bros_Art, Bros_Mcot, Bros_Pd, Bros_Pp, Bros_Ag, Bros_c1, Bros_c2, Bros_bo, Bros_bob, Bros_boe, BrosBov, Bros_c3, Bros_tns, Bros_tnc, Bros_c4, Bros_ct, Bros_c5, Bros_scs, Bros_scc, Bros_c6, Bros_cctse, Bros_ccttp, Bros_cctet, Bros_ccp, Bros_cct, Bros_ccpc, Bros_cctq, Bros_cccc, Bros_ccec, Bros_ccmc1, Bros_ccmc2, Bros_ccmc3, Bros_ccmc4, Bros_ccmc5, Bros_ccmc6, Bros_c7, Bros_rb, Bros_rbi, Bros_rbe, Bros_rbp, Bros_rboc, Bros_rb1, Bros_rb3, Bros_c8, Bros_ep1, Bros_ep2, Bros_ep3, Bros_ep4, Bros_ep5, Bros_ep6, Bros_ep7, Bros_ep8, Bros_ep9, Bros_ep10, Bros_c9, Bros_sa1, Bros_sa2, Bros_sa3, Bros_sa4, Bros_sa5, Bros_sa6, Bros_c10, Bros_stk, Bros_Lbta, Bros_Lbtp, Bros_c11, Bros_c12, Bros_imp1, Bros_imp2, Bros_imp3, Bros_imp4, Bros_imp5, Bros_imp6, Bros_imp7, Bros_imp8, Bros_imp9, Bros_imp10, Bros_imp11, Bros_oekot, Bros_lavad, Bros_luz, Bros_sudor, Bros_cloro, Bros_aguam, Bros_termo, Bros_humed, Bros_obs1, Bros_obs2, Bros_obs3, Bros_obs4, Bros_obs5, Bros_obs6, Bros_obs7, Bros_obs8, Bros_obs9, Bros_obs10, Bros_obs11, Bros_nc FROM TXPARTBRS WHERE EmprCod = ? AND CliCod = ? AND Bros_Art = ?  FOR UPDATE OF Bros_Mcot, Bros_Pd, Bros_Pp, Bros_Ag, Bros_c1, Bros_c2, Bros_bo, Bros_bob, Bros_boe, BrosBov, Bros_c3, Bros_tns, Bros_tnc, Bros_c4, Bros_ct, Bros_c5, Bros_scs, Bros_scc, Bros_c6, Bros_cctse, Bros_ccttp, Bros_cctet, Bros_ccp, Bros_cct, Bros_ccpc, Bros_cctq, Bros_cccc, Bros_ccec, Bros_ccmc1, Bros_ccmc2, Bros_ccmc3, Bros_ccmc4, Bros_ccmc5, Bros_ccmc6, Bros_c7, Bros_rb, Bros_rbi, Bros_rbe, Bros_rbp, Bros_rboc, Bros_rb1, Bros_rb3, Bros_c8, Bros_ep1, Bros_ep2, Bros_ep3, Bros_ep4, Bros_ep5, Bros_ep6, Bros_ep7, Bros_ep8, Bros_ep9, Bros_ep10, Bros_c9, Bros_sa1, Bros_sa2, Bros_sa3, Bros_sa4, Bros_sa5, Bros_sa6, Bros_c10, Bros_stk, Bros_Lbta, Bros_Lbtp, Bros_c11, Bros_c12, Bros_imp1, Bros_imp2, Bros_imp3, Bros_imp4, Bros_imp5, Bros_imp6, Bros_imp7, Bros_imp8, Bros_imp9, Bros_imp10, Bros_imp11, Bros_oekot, Bros_lavad, Bros_luz, Bros_sudor, Bros_cloro, Bros_aguam, Bros_termo, Bros_humed, Bros_obs1, Bros_obs2, Bros_obs3, Bros_obs4, Bros_obs5, Bros_obs6, Bros_obs7, Bros_obs8, Bros_obs9, Bros_obs10, Bros_obs11, Bros_nc, Bros_enc, TrnCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF3", "SELECT Bros_enc, EmprCod, CliCod, TrnCod, Bros_Art, Bros_Mcot, Bros_Pd, Bros_Pp, Bros_Ag, Bros_c1, Bros_c2, Bros_bo, Bros_bob, Bros_boe, BrosBov, Bros_c3, Bros_tns, Bros_tnc, Bros_c4, Bros_ct, Bros_c5, Bros_scs, Bros_scc, Bros_c6, Bros_cctse, Bros_ccttp, Bros_cctet, Bros_ccp, Bros_cct, Bros_ccpc, Bros_cctq, Bros_cccc, Bros_ccec, Bros_ccmc1, Bros_ccmc2, Bros_ccmc3, Bros_ccmc4, Bros_ccmc5, Bros_ccmc6, Bros_c7, Bros_rb, Bros_rbi, Bros_rbe, Bros_rbp, Bros_rboc, Bros_rb1, Bros_rb3, Bros_c8, Bros_ep1, Bros_ep2, Bros_ep3, Bros_ep4, Bros_ep5, Bros_ep6, Bros_ep7, Bros_ep8, Bros_ep9, Bros_ep10, Bros_c9, Bros_sa1, Bros_sa2, Bros_sa3, Bros_sa4, Bros_sa5, Bros_sa6, Bros_c10, Bros_stk, Bros_Lbta, Bros_Lbtp, Bros_c11, Bros_c12, Bros_imp1, Bros_imp2, Bros_imp3, Bros_imp4, Bros_imp5, Bros_imp6, Bros_imp7, Bros_imp8, Bros_imp9, Bros_imp10, Bros_imp11, Bros_oekot, Bros_lavad, Bros_luz, Bros_sudor, Bros_cloro, Bros_aguam, Bros_termo, Bros_humed, Bros_obs1, Bros_obs2, Bros_obs3, Bros_obs4, Bros_obs5, Bros_obs6, Bros_obs7, Bros_obs8, Bros_obs9, Bros_obs10, Bros_obs11, Bros_nc FROM TXPARTBRS WHERE EmprCod = ? AND CliCod = ? AND Bros_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF6", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF7", "SELECT /*+ FIRST_ROWS(1) */ TM1.Bros_enc, TM1.EmprCod, TM1.CliCod, TM1.TrnCod, TM1.Bros_Art, T2.EmprNom, T3.CliNom, TM1.Bros_Mcot, TM1.Bros_Pd, TM1.Bros_Pp, TM1.Bros_Ag, TM1.Bros_c1, TM1.Bros_c2, TM1.Bros_bo, TM1.Bros_bob, TM1.Bros_boe, TM1.BrosBov, TM1.Bros_c3, TM1.Bros_tns, TM1.Bros_tnc, TM1.Bros_c4, TM1.Bros_ct, TM1.Bros_c5, TM1.Bros_scs, TM1.Bros_scc, TM1.Bros_c6, TM1.Bros_cctse, TM1.Bros_ccttp, TM1.Bros_cctet, TM1.Bros_ccp, TM1.Bros_cct, TM1.Bros_ccpc, TM1.Bros_cctq, TM1.Bros_cccc, TM1.Bros_ccec, TM1.Bros_ccmc1, TM1.Bros_ccmc2, TM1.Bros_ccmc3, TM1.Bros_ccmc4, TM1.Bros_ccmc5, TM1.Bros_ccmc6, TM1.Bros_c7, TM1.Bros_rb, TM1.Bros_rbi, TM1.Bros_rbe, TM1.Bros_rbp, TM1.Bros_rboc, TM1.Bros_rb1, TM1.Bros_rb3, TM1.Bros_c8, TM1.Bros_ep1, TM1.Bros_ep2, TM1.Bros_ep3, TM1.Bros_ep4, TM1.Bros_ep5, TM1.Bros_ep6, TM1.Bros_ep7, TM1.Bros_ep8, TM1.Bros_ep9, TM1.Bros_ep10, TM1.Bros_c9, TM1.Bros_sa1, TM1.Bros_sa2, TM1.Bros_sa3, TM1.Bros_sa4, TM1.Bros_sa5, TM1.Bros_sa6, TM1.Bros_c10, TM1.Bros_stk, TM1.Bros_Lbta, TM1.Bros_Lbtp, TM1.Bros_c11, TM1.Bros_c12, TM1.Bros_imp1, TM1.Bros_imp2, TM1.Bros_imp3, TM1.Bros_imp4, TM1.Bros_imp5, TM1.Bros_imp6, TM1.Bros_imp7, TM1.Bros_imp8, TM1.Bros_imp9, TM1.Bros_imp10, TM1.Bros_imp11, TM1.Bros_oekot, TM1.Bros_lavad, TM1.Bros_luz, TM1.Bros_sudor, TM1.Bros_cloro, TM1.Bros_aguam, TM1.Bros_termo, TM1.Bros_humed, TM1.Bros_obs1, TM1.Bros_obs2, TM1.Bros_obs3, TM1.Bros_obs4, TM1.Bros_obs5, TM1.Bros_obs6, TM1.Bros_obs7, TM1.Bros_obs8, TM1.Bros_obs9, TM1.Bros_obs10, TM1.Bros_obs11, TM1.Bros_nc FROM ((TXPARTBRS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.Bros_Art = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.Bros_Art ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF8", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, Bros_Art FROM TXPARTBRS WHERE EmprCod = ? AND CliCod = ? AND Bros_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, Bros_Art FROM TXPARTBRS WHERE EmprCod = ? and CliCod = ? and Bros_Art = ? ORDER BY EmprCod, CliCod, Bros_Art) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, Bros_Art FROM TXPARTBRS WHERE EmprCod = ? and CliCod = ? and Bros_Art = ? ORDER BY EmprCod DESC, CliCod DESC, Bros_Art DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AF12", "INSERT INTO TXPARTBRS(Bros_Art, Bros_Mcot, Bros_Pd, Bros_Pp, Bros_Ag, Bros_c1, Bros_c2, Bros_bo, Bros_bob, Bros_boe, BrosBov, Bros_c3, Bros_tns, Bros_tnc, Bros_c4, Bros_ct, Bros_c5, Bros_scs, Bros_scc, Bros_c6, Bros_cctse, Bros_ccttp, Bros_cctet, Bros_ccp, Bros_cct, Bros_ccpc, Bros_cctq, Bros_cccc, Bros_ccec, Bros_ccmc1, Bros_ccmc2, Bros_ccmc3, Bros_ccmc4, Bros_ccmc5, Bros_ccmc6, Bros_c7, Bros_rb, Bros_rbi, Bros_rbe, Bros_rbp, Bros_rboc, Bros_rb1, Bros_rb3, Bros_c8, Bros_ep1, Bros_ep2, Bros_ep3, Bros_ep4, Bros_ep5, Bros_ep6, Bros_ep7, Bros_ep8, Bros_ep9, Bros_ep10, Bros_c9, Bros_sa1, Bros_sa2, Bros_sa3, Bros_sa4, Bros_sa5, Bros_sa6, Bros_c10, Bros_stk, Bros_Lbta, Bros_Lbtp, Bros_c11, Bros_c12, Bros_imp1, Bros_imp2, Bros_imp3, Bros_imp4, Bros_imp5, Bros_imp6, Bros_imp7, Bros_imp8, Bros_imp9, Bros_imp10, Bros_imp11, Bros_oekot, Bros_lavad, Bros_luz, Bros_sudor, Bros_cloro, Bros_aguam, Bros_termo, Bros_humed, Bros_obs1, Bros_obs2, Bros_obs3, Bros_obs4, Bros_obs5, Bros_obs6, Bros_obs7, Bros_obs8, Bros_obs9, Bros_obs10, Bros_obs11, Bros_nc, Bros_enc, EmprCod, CliCod, TrnCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPARTBRS")
         ,new UpdateCursor("T01AF13", "UPDATE TXPARTBRS SET Bros_Mcot=?, Bros_Pd=?, Bros_Pp=?, Bros_Ag=?, Bros_c1=?, Bros_c2=?, Bros_bo=?, Bros_bob=?, Bros_boe=?, BrosBov=?, Bros_c3=?, Bros_tns=?, Bros_tnc=?, Bros_c4=?, Bros_ct=?, Bros_c5=?, Bros_scs=?, Bros_scc=?, Bros_c6=?, Bros_cctse=?, Bros_ccttp=?, Bros_cctet=?, Bros_ccp=?, Bros_cct=?, Bros_ccpc=?, Bros_cctq=?, Bros_cccc=?, Bros_ccec=?, Bros_ccmc1=?, Bros_ccmc2=?, Bros_ccmc3=?, Bros_ccmc4=?, Bros_ccmc5=?, Bros_ccmc6=?, Bros_c7=?, Bros_rb=?, Bros_rbi=?, Bros_rbe=?, Bros_rbp=?, Bros_rboc=?, Bros_rb1=?, Bros_rb3=?, Bros_c8=?, Bros_ep1=?, Bros_ep2=?, Bros_ep3=?, Bros_ep4=?, Bros_ep5=?, Bros_ep6=?, Bros_ep7=?, Bros_ep8=?, Bros_ep9=?, Bros_ep10=?, Bros_c9=?, Bros_sa1=?, Bros_sa2=?, Bros_sa3=?, Bros_sa4=?, Bros_sa5=?, Bros_sa6=?, Bros_c10=?, Bros_stk=?, Bros_Lbta=?, Bros_Lbtp=?, Bros_c11=?, Bros_c12=?, Bros_imp1=?, Bros_imp2=?, Bros_imp3=?, Bros_imp4=?, Bros_imp5=?, Bros_imp6=?, Bros_imp7=?, Bros_imp8=?, Bros_imp9=?, Bros_imp10=?, Bros_imp11=?, Bros_oekot=?, Bros_lavad=?, Bros_luz=?, Bros_sudor=?, Bros_cloro=?, Bros_aguam=?, Bros_termo=?, Bros_humed=?, Bros_obs1=?, Bros_obs2=?, Bros_obs3=?, Bros_obs4=?, Bros_obs5=?, Bros_obs6=?, Bros_obs7=?, Bros_obs8=?, Bros_obs9=?, Bros_obs10=?, Bros_obs11=?, Bros_nc=?, Bros_enc=?, TrnCod=?  WHERE EmprCod = ? AND CliCod = ? AND Bros_Art = ?", GX_NOMASK, "TXPARTBRS")
         ,new UpdateCursor("T01AF14", "DELETE FROM TXPARTBRS  WHERE EmprCod = ? AND CliCod = ? AND Bros_Art = ?", GX_NOMASK, "TXPARTBRS")
         ,new ForEachCursor("T01AF15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, Bros_Art FROM TXPARTBRS WHERE EmprCod = ? and CliCod = ? and Bros_Art = ? ORDER BY EmprCod, CliCod, Bros_Art ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF17", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AF18", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(45);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(50, 1);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((String[]) buf[123])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((String[]) buf[125])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((String[]) buf[127])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((String[]) buf[129])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((String[]) buf[131])[0] = rslt.getString(68, 40);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((short[]) buf[133])[0] = rslt.getShort(69);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((String[]) buf[135])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((String[]) buf[137])[0] = rslt.getVarchar(71);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((String[]) buf[139])[0] = rslt.getString(72, 1);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((String[]) buf[141])[0] = rslt.getString(73, 1);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((String[]) buf[143])[0] = rslt.getString(74, 1);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((String[]) buf[145])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((String[]) buf[147])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((String[]) buf[149])[0] = rslt.getString(77, 1);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((String[]) buf[151])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((String[]) buf[153])[0] = rslt.getString(79, 1);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((String[]) buf[155])[0] = rslt.getString(80, 1);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((String[]) buf[157])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((String[]) buf[159])[0] = rslt.getString(82, 1);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((String[]) buf[161])[0] = rslt.getString(83, 1);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((String[]) buf[163])[0] = rslt.getString(84, 10);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((String[]) buf[165])[0] = rslt.getString(85, 10);
               ((boolean[]) buf[166])[0] = rslt.wasNull();
               ((String[]) buf[167])[0] = rslt.getString(86, 10);
               ((boolean[]) buf[168])[0] = rslt.wasNull();
               ((String[]) buf[169])[0] = rslt.getString(87, 10);
               ((boolean[]) buf[170])[0] = rslt.wasNull();
               ((String[]) buf[171])[0] = rslt.getString(88, 10);
               ((boolean[]) buf[172])[0] = rslt.wasNull();
               ((String[]) buf[173])[0] = rslt.getString(89, 10);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((byte[]) buf[175])[0] = rslt.getByte(90);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((String[]) buf[177])[0] = rslt.getString(91, 1);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((String[]) buf[179])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((String[]) buf[183])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(95, 1);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((String[]) buf[187])[0] = rslt.getString(96, 1);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((String[]) buf[189])[0] = rslt.getString(97, 1);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(98, 1);
               ((boolean[]) buf[192])[0] = rslt.wasNull();
               ((String[]) buf[193])[0] = rslt.getString(99, 1);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((String[]) buf[195])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((String[]) buf[197])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((byte[]) buf[199])[0] = rslt.getByte(102);
               ((boolean[]) buf[200])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(45);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(50, 1);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((String[]) buf[123])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((String[]) buf[125])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((String[]) buf[127])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((String[]) buf[129])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((String[]) buf[131])[0] = rslt.getString(68, 40);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((short[]) buf[133])[0] = rslt.getShort(69);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((String[]) buf[135])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((String[]) buf[137])[0] = rslt.getVarchar(71);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((String[]) buf[139])[0] = rslt.getString(72, 1);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((String[]) buf[141])[0] = rslt.getString(73, 1);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((String[]) buf[143])[0] = rslt.getString(74, 1);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((String[]) buf[145])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((String[]) buf[147])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((String[]) buf[149])[0] = rslt.getString(77, 1);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((String[]) buf[151])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((String[]) buf[153])[0] = rslt.getString(79, 1);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((String[]) buf[155])[0] = rslt.getString(80, 1);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((String[]) buf[157])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((String[]) buf[159])[0] = rslt.getString(82, 1);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((String[]) buf[161])[0] = rslt.getString(83, 1);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((String[]) buf[163])[0] = rslt.getString(84, 10);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((String[]) buf[165])[0] = rslt.getString(85, 10);
               ((boolean[]) buf[166])[0] = rslt.wasNull();
               ((String[]) buf[167])[0] = rslt.getString(86, 10);
               ((boolean[]) buf[168])[0] = rslt.wasNull();
               ((String[]) buf[169])[0] = rslt.getString(87, 10);
               ((boolean[]) buf[170])[0] = rslt.wasNull();
               ((String[]) buf[171])[0] = rslt.getString(88, 10);
               ((boolean[]) buf[172])[0] = rslt.wasNull();
               ((String[]) buf[173])[0] = rslt.getString(89, 10);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((byte[]) buf[175])[0] = rslt.getByte(90);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((String[]) buf[177])[0] = rslt.getString(91, 1);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((String[]) buf[179])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((String[]) buf[183])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(95, 1);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((String[]) buf[187])[0] = rslt.getString(96, 1);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((String[]) buf[189])[0] = rslt.getString(97, 1);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(98, 1);
               ((boolean[]) buf[192])[0] = rslt.wasNull();
               ((String[]) buf[193])[0] = rslt.getString(99, 1);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((String[]) buf[195])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((String[]) buf[197])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((byte[]) buf[199])[0] = rslt.getByte(102);
               ((boolean[]) buf[200])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(59, 1);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(61);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(69, 1);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(70, 40);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((short[]) buf[136])[0] = rslt.getShort(71);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getVarchar(72);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getVarchar(73);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((String[]) buf[142])[0] = rslt.getString(74, 1);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((String[]) buf[144])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(77, 1);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(79, 1);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(80, 1);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((String[]) buf[156])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(82, 1);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((String[]) buf[160])[0] = rslt.getString(83, 1);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(84, 1);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(85, 1);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((String[]) buf[166])[0] = rslt.getString(86, 10);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getString(87, 10);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((String[]) buf[170])[0] = rslt.getString(88, 10);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((String[]) buf[172])[0] = rslt.getString(89, 10);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getString(90, 10);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((String[]) buf[176])[0] = rslt.getString(91, 10);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((byte[]) buf[178])[0] = rslt.getByte(92);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getString(95, 1);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((String[]) buf[186])[0] = rslt.getString(96, 1);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(97, 1);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((String[]) buf[190])[0] = rslt.getString(98, 1);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(99, 1);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(102, 1);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((String[]) buf[200])[0] = rslt.getString(103, 1);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((byte[]) buf[202])[0] = rslt.getByte(104);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 16);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 200);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 200);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 200);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 200);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 200);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 200);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[46]).byteValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 1);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 1);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[60], 1);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[62], 1);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[66], 1);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[68], 1);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[70], 200);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[72], 1);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[74], 1);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[76], 1);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[78], 1);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[80]).shortValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[82], 1);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[84], 1);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[86], 200);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[88], 1);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[90], 1);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[92], 1);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[94], 1);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[96], 1);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[98], 1);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[100], 1);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[102], 1);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[104], 1);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[106], 1);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(55, (String)parms[108], 200);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[110], 1);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[112], 1);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[114], 1);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[116], 1);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[118], 1);
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[120], 1);
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(62, (String)parms[122], 200);
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[124], 1);
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[126], 40);
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[128]).shortValue());
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[130], 200);
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(67, (String)parms[132], 200);
               }
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[134], 1);
               }
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[136], 1);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[138], 1);
               }
               if ( ((Boolean) parms[139]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[140], 1);
               }
               if ( ((Boolean) parms[141]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[142], 1);
               }
               if ( ((Boolean) parms[143]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[144], 1);
               }
               if ( ((Boolean) parms[145]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[146], 1);
               }
               if ( ((Boolean) parms[147]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[148], 1);
               }
               if ( ((Boolean) parms[149]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[150], 1);
               }
               if ( ((Boolean) parms[151]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[152], 1);
               }
               if ( ((Boolean) parms[153]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[154], 1);
               }
               if ( ((Boolean) parms[155]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[156], 1);
               }
               if ( ((Boolean) parms[157]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[158], 10);
               }
               if ( ((Boolean) parms[159]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[160], 10);
               }
               if ( ((Boolean) parms[161]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[162], 10);
               }
               if ( ((Boolean) parms[163]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[164], 10);
               }
               if ( ((Boolean) parms[165]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(84, (String)parms[166], 10);
               }
               if ( ((Boolean) parms[167]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[168], 10);
               }
               if ( ((Boolean) parms[169]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(86, ((Number) parms[170]).byteValue());
               }
               if ( ((Boolean) parms[171]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[172], 1);
               }
               if ( ((Boolean) parms[173]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[174], 1);
               }
               if ( ((Boolean) parms[175]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[176], 1);
               }
               if ( ((Boolean) parms[177]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[178], 1);
               }
               if ( ((Boolean) parms[179]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[180], 1);
               }
               if ( ((Boolean) parms[181]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[182], 1);
               }
               if ( ((Boolean) parms[183]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[184], 1);
               }
               if ( ((Boolean) parms[185]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[186], 1);
               }
               if ( ((Boolean) parms[187]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[188], 1);
               }
               if ( ((Boolean) parms[189]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[190], 1);
               }
               if ( ((Boolean) parms[191]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[192], 1);
               }
               if ( ((Boolean) parms[193]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(98, ((Number) parms[194]).byteValue());
               }
               if ( ((Boolean) parms[195]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(99, (java.math.BigDecimal)parms[196], 2);
               }
               stmt.setString(100, (String)parms[197], 3);
               stmt.setInt(101, ((Number) parms[198]).intValue());
               if ( ((Boolean) parms[199]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(102, ((Number) parms[200]).shortValue());
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 200);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 200);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 200);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 200);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 200);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
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
                  stmt.setString(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 1);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 1);
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
                  stmt.setString(29, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 1);
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
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[69], 200);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 1);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 1);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 1);
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
                  stmt.setString(41, (String)parms[81], 1);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[85], 200);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[87], 1);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[89], 1);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[91], 1);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[93], 1);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[95], 1);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[97], 1);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[99], 1);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[101], 1);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 1);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 1);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(54, (String)parms[107], 200);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[109], 1);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[111], 1);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[113], 1);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[115], 1);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[117], 1);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[119], 1);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(61, (String)parms[121], 200);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[123], 1);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[125], 40);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[127]).shortValue());
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(65, (String)parms[129], 200);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[131], 200);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[133], 1);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[135], 1);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[137], 1);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[139], 1);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[141], 1);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[143], 1);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[145], 1);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[147], 1);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[149], 1);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[151], 1);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[153], 1);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[155], 1);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[157], 10);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[159], 10);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[161], 10);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[163], 10);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[165], 10);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(84, (String)parms[167], 10);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(85, ((Number) parms[169]).byteValue());
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[171], 1);
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[173], 1);
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[175], 1);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[177], 1);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[179], 1);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[181], 1);
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[183], 1);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[185], 1);
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[187], 1);
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[189], 1);
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[191], 1);
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(97, ((Number) parms[193]).byteValue());
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(98, (java.math.BigDecimal)parms[195], 2);
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(99, ((Number) parms[197]).shortValue());
               }
               stmt.setString(100, (String)parms[198], 3);
               stmt.setInt(101, ((Number) parms[199]).intValue());
               stmt.setString(102, (String)parms[200], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

