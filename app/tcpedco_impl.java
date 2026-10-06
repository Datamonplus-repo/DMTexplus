package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcpedco_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A252CliCod, A65ArtCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PEDIDOS COMERCIALES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtErpNped_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tcpedco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcpedco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcpedco_impl.class ));
   }

   public tcpedco_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkErpKgs = UIFactory.getCheckbox(this);
      cmbErpTc = new HTMLChoice();
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
      A7498ErpKgs = ((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7498ErpKgs, (byte)(9), (byte)(2), ".", "")), "1")==0) ? DecimalUtil.stringToDec( "1") : DecimalUtil.stringToDec( "0")) ;
      n7498ErpKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7498ErpKgs", GXutil.ltrimstr( A7498ErpKgs, 9, 2));
      if ( cmbErpTc.getItemCount() > 0 )
      {
         A7437ErpTc = (byte)(GXutil.lval( cmbErpTc.getValidValue(GXutil.trim( GXutil.str( A7437ErpTc, 2, 0))))) ;
         n7437ErpTc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7437ErpTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7437ErpTc), 2, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbErpTc.setValue( GXutil.trim( GXutil.str( A7437ErpTc, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbErpTc.getInternalname(), "Values", cmbErpTc.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCPEDCO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N pedido Interno ERP", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpNped_Internalname, GXutil.rtrim( A9705ErpNped), GXutil.rtrim( localUtil.format( A9705ErpNped, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpNped_Jsonclick, 0, "", "", "", "", "", 1, edtErpNped_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpLin_Internalname, GXutil.ltrim( localUtil.ntoc( A8652ErpLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErpLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8652ErpLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8652ErpLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpLin_Jsonclick, 0, "", "", "", "", "", 1, edtErpLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpPedCl_Internalname, GXutil.rtrim( A9797ErpPedCl), GXutil.rtrim( localUtil.format( A9797ErpPedCl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpPedCl_Jsonclick, 0, "", "", "", "", "", 1, edtErpPedCl_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtErpFPC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpFPC_Internalname, localUtil.format(A8651ErpFPC, "99/99/99"), localUtil.format( A8651ErpFPC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpFPC_Jsonclick, 0, "", "", "", "", "", 1, edtErpFPC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtErpFPC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtErpFPC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPEDCO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha Ped Comercial", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtErpFPCm_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpFPCm_Internalname, localUtil.format(A8514ErpFPCm, "99/99/99"), localUtil.format( A8514ErpFPCm, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpFPCm_Jsonclick, 0, "", "", "", "", "", 1, edtErpFPCm_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtErpFPCm_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtErpFPCm_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPEDCO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Entrega Prevista", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtErpFEP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpFEP_Internalname, localUtil.format(A8222ErpFEP, "99/99/99"), localUtil.format( A8222ErpFEP, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpFEP_Jsonclick, 0, "", "", "", "", "", 1, edtErpFEP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtErpFEP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtErpFEP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPEDCO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Orden Compra", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpOc_Internalname, GXutil.rtrim( A8218ErpOc), GXutil.rtrim( localUtil.format( A8218ErpOc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpOc_Jsonclick, 0, "", "", "", "", "", 1, edtErpOc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Partida Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpPCl_Internalname, GXutil.rtrim( A8217ErpPCl), GXutil.rtrim( localUtil.format( A8217ErpPCl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpPCl_Jsonclick, 0, "", "", "", "", "", 1, edtErpPCl_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "N Pedido Comercial", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpNPC_Internalname, GXutil.rtrim( A8162ErpNPC), GXutil.rtrim( localUtil.format( A8162ErpNPC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpNPC_Jsonclick, 0, "", "", "", "", "", 1, edtErpNPC_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Partida", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpPda_Internalname, GXutil.rtrim( A7842ErpPda), GXutil.rtrim( localUtil.format( A7842ErpPda, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpPda_Jsonclick, 0, "", "", "", "", "", 1, edtErpPda_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpLote_Internalname, GXutil.rtrim( A7749ErpLote), GXutil.rtrim( localUtil.format( A7749ErpLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpLote_Jsonclick, 0, "", "", "", "", "", 1, edtErpLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkErpKgs.getInternalname(), GXutil.strNoRound( A7498ErpKgs, 9, 2), "", "", 1, chkErpKgs.getEnabled(), GXutil.strNoRound( DecimalUtil.doubleToDec(1), 9, 2), httpContext.getMessage( "Divisible", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(85, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Metros Pedido", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpMts_Internalname, GXutil.ltrim( localUtil.ntoc( A7490ErpMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErpMts_Enabled!=0) ? localUtil.format( A7490ErpMts, "ZZZZZ9.99") : localUtil.format( A7490ErpMts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpMts_Jsonclick, 0, "", "", "", "", "", 1, edtErpMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Piezas Pedido", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A7489ErpPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErpPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7489ErpPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7489ErpPzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpPzs_Jsonclick, 0, "", "", "", "", "", 1, edtErpPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Tipo Pedido T o E", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpTipo_Internalname, GXutil.rtrim( A7488ErpTipo), GXutil.rtrim( localUtil.format( A7488ErpTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpTipo_Jsonclick, 0, "", "", "", "", "", 1, edtErpTipo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpColNo_Internalname, GXutil.rtrim( A7487ErpColNo), GXutil.rtrim( localUtil.format( A7487ErpColNo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpColNo_Jsonclick, 0, "", "", "", "", "", 1, edtErpColNo_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpColNu_Internalname, GXutil.ltrim( localUtil.ntoc( A7486ErpColNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErpColNu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7486ErpColNu), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7486ErpColNu), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpColNu_Jsonclick, 0, "", "", "", "", "", 1, edtErpColNu_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbErpTc, cmbErpTc.getInternalname(), GXutil.trim( GXutil.str( A7437ErpTc, 2, 0)), 1, cmbErpTc.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbErpTc.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "", true, (byte)(0), "HLP_TCPEDCO.htm");
      cmbErpTc.setValue( GXutil.trim( GXutil.str( A7437ErpTc, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbErpTc.getInternalname(), "Values", cmbErpTc.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Color Cliente", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpColNC_Internalname, GXutil.rtrim( A6613ErpColNC), GXutil.rtrim( localUtil.format( A6613ErpColNC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpColNC_Jsonclick, 0, "", "", "", "", "", 1, edtErpColNC_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Numero Color Cli", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpColNuC_Internalname, GXutil.ltrim( localUtil.ntoc( A6280ErpColNuC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErpColNuC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6280ErpColNuC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6280ErpColNuC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpColNuC_Jsonclick, 0, "", "", "", "", "", 1, edtErpColNuC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Dibujo Cliente", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpDibCl_Internalname, GXutil.rtrim( A6227ErpDibCl), GXutil.rtrim( localUtil.format( A6227ErpDibCl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpDibCl_Jsonclick, 0, "", "", "", "", "", 1, edtErpDibCl_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "N Dib Interno", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A6226ErpDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErpDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6226ErpDibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6226ErpDibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtErpDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Estado Linea 0,1", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpEst_Internalname, GXutil.ltrim( localUtil.ntoc( A6225ErpEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErpEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6225ErpEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A6225ErpEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpEst_Jsonclick, 0, "", "", "", "", "", 1, edtErpEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCPEDCO.htm");
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
      e111FF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9705ErpNped = httpContext.cgiGet( "Z9705ErpNped") ;
            Z8652ErpLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z8652ErpLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9797ErpPedCl = httpContext.cgiGet( "Z9797ErpPedCl") ;
            Z8651ErpFPC = localUtil.ctod( httpContext.cgiGet( "Z8651ErpFPC"), 0) ;
            Z8514ErpFPCm = localUtil.ctod( httpContext.cgiGet( "Z8514ErpFPCm"), 0) ;
            Z8222ErpFEP = localUtil.ctod( httpContext.cgiGet( "Z8222ErpFEP"), 0) ;
            Z8218ErpOc = httpContext.cgiGet( "Z8218ErpOc") ;
            Z8217ErpPCl = httpContext.cgiGet( "Z8217ErpPCl") ;
            Z8162ErpNPC = httpContext.cgiGet( "Z8162ErpNPC") ;
            Z7842ErpPda = httpContext.cgiGet( "Z7842ErpPda") ;
            Z7749ErpLote = httpContext.cgiGet( "Z7749ErpLote") ;
            Z7498ErpKgs = localUtil.ctond( httpContext.cgiGet( "Z7498ErpKgs")) ;
            Z7490ErpMts = localUtil.ctond( httpContext.cgiGet( "Z7490ErpMts")) ;
            Z7489ErpPzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z7489ErpPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7488ErpTipo = httpContext.cgiGet( "Z7488ErpTipo") ;
            Z7487ErpColNo = httpContext.cgiGet( "Z7487ErpColNo") ;
            Z7486ErpColNu = (int)(localUtil.ctol( httpContext.cgiGet( "Z7486ErpColNu"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7437ErpTc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7437ErpTc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6613ErpColNC = httpContext.cgiGet( "Z6613ErpColNC") ;
            Z6280ErpColNuC = (int)(localUtil.ctol( httpContext.cgiGet( "Z6280ErpColNuC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6227ErpDibCl = httpContext.cgiGet( "Z6227ErpDibCl") ;
            Z6226ErpDibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z6226ErpDibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6225ErpEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6225ErpEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9705ErpNped = httpContext.cgiGet( edtErpNped_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtErpLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtErpLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8652ErpLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
            }
            else
            {
               A8652ErpLin = (short)(localUtil.ctol( httpContext.cgiGet( edtErpLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
            }
            A9797ErpPedCl = httpContext.cgiGet( edtErpPedCl_Internalname) ;
            n9797ErpPedCl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9797ErpPedCl", A9797ErpPedCl);
            if ( localUtil.vcdate( httpContext.cgiGet( edtErpFPC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ERPFPC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpFPC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8651ErpFPC = GXutil.nullDate() ;
               n8651ErpFPC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8651ErpFPC", localUtil.format(A8651ErpFPC, "99/99/99"));
            }
            else
            {
               A8651ErpFPC = localUtil.ctod( httpContext.cgiGet( edtErpFPC_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8651ErpFPC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8651ErpFPC", localUtil.format(A8651ErpFPC, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtErpFPCm_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ERPFPCM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpFPCm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8514ErpFPCm = GXutil.nullDate() ;
               n8514ErpFPCm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8514ErpFPCm", localUtil.format(A8514ErpFPCm, "99/99/99"));
            }
            else
            {
               A8514ErpFPCm = localUtil.ctod( httpContext.cgiGet( edtErpFPCm_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8514ErpFPCm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8514ErpFPCm", localUtil.format(A8514ErpFPCm, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtErpFEP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ERPFEP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpFEP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8222ErpFEP = GXutil.nullDate() ;
               n8222ErpFEP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8222ErpFEP", localUtil.format(A8222ErpFEP, "99/99/99"));
            }
            else
            {
               A8222ErpFEP = localUtil.ctod( httpContext.cgiGet( edtErpFEP_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8222ErpFEP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8222ErpFEP", localUtil.format(A8222ErpFEP, "99/99/99"));
            }
            A8218ErpOc = httpContext.cgiGet( edtErpOc_Internalname) ;
            n8218ErpOc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8218ErpOc", A8218ErpOc);
            A8217ErpPCl = httpContext.cgiGet( edtErpPCl_Internalname) ;
            n8217ErpPCl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8217ErpPCl", A8217ErpPCl);
            A8162ErpNPC = httpContext.cgiGet( edtErpNPC_Internalname) ;
            n8162ErpNPC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8162ErpNPC", A8162ErpNPC);
            A7842ErpPda = httpContext.cgiGet( edtErpPda_Internalname) ;
            n7842ErpPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7842ErpPda", A7842ErpPda);
            A7749ErpLote = httpContext.cgiGet( edtErpLote_Internalname) ;
            n7749ErpLote = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7749ErpLote", A7749ErpLote);
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkErpKgs.getInternalname()), "1")==0) ? DecimalUtil.stringToDec( "1") : DecimalUtil.stringToDec( "0")).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(((GXutil.strcmp(httpContext.cgiGet( chkErpKgs.getInternalname()), "1")==0) ? DecimalUtil.stringToDec( "1") : DecimalUtil.stringToDec( "0")), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPKGS");
               AnyError = (short)(1) ;
               GX_FocusControl = chkErpKgs.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7498ErpKgs = DecimalUtil.ZERO ;
               n7498ErpKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7498ErpKgs", GXutil.ltrimstr( A7498ErpKgs, 9, 2));
            }
            else
            {
               A7498ErpKgs = ((GXutil.strcmp(httpContext.cgiGet( chkErpKgs.getInternalname()), "1")==0) ? DecimalUtil.stringToDec( "1") : DecimalUtil.stringToDec( "0")) ;
               n7498ErpKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7498ErpKgs", GXutil.ltrimstr( A7498ErpKgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtErpMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtErpMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPMTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpMts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7490ErpMts = DecimalUtil.ZERO ;
               n7490ErpMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7490ErpMts", GXutil.ltrimstr( A7490ErpMts, 9, 2));
            }
            else
            {
               A7490ErpMts = localUtil.ctond( httpContext.cgiGet( edtErpMts_Internalname)) ;
               n7490ErpMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7490ErpMts", GXutil.ltrimstr( A7490ErpMts, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtErpPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtErpPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPPZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpPzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7489ErpPzs = 0 ;
               n7489ErpPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7489ErpPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7489ErpPzs), 6, 0));
            }
            else
            {
               A7489ErpPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtErpPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n7489ErpPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7489ErpPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7489ErpPzs), 6, 0));
            }
            A7488ErpTipo = httpContext.cgiGet( edtErpTipo_Internalname) ;
            n7488ErpTipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7488ErpTipo", A7488ErpTipo);
            A7487ErpColNo = httpContext.cgiGet( edtErpColNo_Internalname) ;
            n7487ErpColNo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7487ErpColNo", A7487ErpColNo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtErpColNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtErpColNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPCOLNU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpColNu_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7486ErpColNu = 0 ;
               n7486ErpColNu = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7486ErpColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7486ErpColNu), 6, 0));
            }
            else
            {
               A7486ErpColNu = (int)(localUtil.ctol( httpContext.cgiGet( edtErpColNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n7486ErpColNu = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7486ErpColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7486ErpColNu), 6, 0));
            }
            cmbErpTc.setValue( httpContext.cgiGet( cmbErpTc.getInternalname()) );
            A7437ErpTc = (byte)(GXutil.lval( httpContext.cgiGet( cmbErpTc.getInternalname()))) ;
            n7437ErpTc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7437ErpTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7437ErpTc), 2, 0));
            A6613ErpColNC = httpContext.cgiGet( edtErpColNC_Internalname) ;
            n6613ErpColNC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6613ErpColNC", A6613ErpColNC);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtErpColNuC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtErpColNuC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPCOLNUC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpColNuC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6280ErpColNuC = 0 ;
               n6280ErpColNuC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6280ErpColNuC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6280ErpColNuC), 6, 0));
            }
            else
            {
               A6280ErpColNuC = (int)(localUtil.ctol( httpContext.cgiGet( edtErpColNuC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6280ErpColNuC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6280ErpColNuC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6280ErpColNuC), 6, 0));
            }
            A6227ErpDibCl = httpContext.cgiGet( edtErpDibCl_Internalname) ;
            n6227ErpDibCl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6227ErpDibCl", A6227ErpDibCl);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtErpDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtErpDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPDIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6226ErpDibInt = 0 ;
               n6226ErpDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6226ErpDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6226ErpDibInt), 8, 0));
            }
            else
            {
               A6226ErpDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtErpDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6226ErpDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6226ErpDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6226ErpDibInt), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtErpEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtErpEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6225ErpEst = (byte)(0) ;
               n6225ErpEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6225ErpEst", GXutil.str( A6225ErpEst, 1, 0));
            }
            else
            {
               A6225ErpEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtErpEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6225ErpEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6225ErpEst", GXutil.str( A6225ErpEst, 1, 0));
            }
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
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
               A9705ErpNped = httpContext.GetPar( "ErpNped") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
               A8652ErpLin = (short)(GXutil.lval( httpContext.GetPar( "ErpLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
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
                        e111FF2 ();
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
            initAll1FF1568( ) ;
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
      disableAttributes1FF1568( ) ;
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

   public void confirm_1FF0( )
   {
      beforeValidate1FF1568( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FF1568( ) ;
         }
         else
         {
            checkExtendedTable1FF1568( ) ;
            if ( AnyError == 0 )
            {
               zm1FF1568( 3) ;
               zm1FF1568( 4) ;
               zm1FF1568( 5) ;
            }
            closeExtendedTableCursors1FF1568( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1FF0( ) ;
      }
   }

   public void resetCaption1FF0( )
   {
   }

   public void e111FF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcpedco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tcpedco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcpedco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcpedco_impl.this.A396EmprCod = GXv_char2[0] ;
      tcpedco_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcpedco_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1FF1568( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9797ErpPedCl = T01FF3_A9797ErpPedCl[0] ;
            Z8651ErpFPC = T01FF3_A8651ErpFPC[0] ;
            Z8514ErpFPCm = T01FF3_A8514ErpFPCm[0] ;
            Z8222ErpFEP = T01FF3_A8222ErpFEP[0] ;
            Z8218ErpOc = T01FF3_A8218ErpOc[0] ;
            Z8217ErpPCl = T01FF3_A8217ErpPCl[0] ;
            Z8162ErpNPC = T01FF3_A8162ErpNPC[0] ;
            Z7842ErpPda = T01FF3_A7842ErpPda[0] ;
            Z7749ErpLote = T01FF3_A7749ErpLote[0] ;
            Z7498ErpKgs = T01FF3_A7498ErpKgs[0] ;
            Z7490ErpMts = T01FF3_A7490ErpMts[0] ;
            Z7489ErpPzs = T01FF3_A7489ErpPzs[0] ;
            Z7488ErpTipo = T01FF3_A7488ErpTipo[0] ;
            Z7487ErpColNo = T01FF3_A7487ErpColNo[0] ;
            Z7486ErpColNu = T01FF3_A7486ErpColNu[0] ;
            Z7437ErpTc = T01FF3_A7437ErpTc[0] ;
            Z6613ErpColNC = T01FF3_A6613ErpColNC[0] ;
            Z6280ErpColNuC = T01FF3_A6280ErpColNuC[0] ;
            Z6227ErpDibCl = T01FF3_A6227ErpDibCl[0] ;
            Z6226ErpDibInt = T01FF3_A6226ErpDibInt[0] ;
            Z6225ErpEst = T01FF3_A6225ErpEst[0] ;
            Z252CliCod = T01FF3_A252CliCod[0] ;
            Z65ArtCod = T01FF3_A65ArtCod[0] ;
         }
         else
         {
            Z9797ErpPedCl = A9797ErpPedCl ;
            Z8651ErpFPC = A8651ErpFPC ;
            Z8514ErpFPCm = A8514ErpFPCm ;
            Z8222ErpFEP = A8222ErpFEP ;
            Z8218ErpOc = A8218ErpOc ;
            Z8217ErpPCl = A8217ErpPCl ;
            Z8162ErpNPC = A8162ErpNPC ;
            Z7842ErpPda = A7842ErpPda ;
            Z7749ErpLote = A7749ErpLote ;
            Z7498ErpKgs = A7498ErpKgs ;
            Z7490ErpMts = A7490ErpMts ;
            Z7489ErpPzs = A7489ErpPzs ;
            Z7488ErpTipo = A7488ErpTipo ;
            Z7487ErpColNo = A7487ErpColNo ;
            Z7486ErpColNu = A7486ErpColNu ;
            Z7437ErpTc = A7437ErpTc ;
            Z6613ErpColNC = A6613ErpColNC ;
            Z6280ErpColNuC = A6280ErpColNuC ;
            Z6227ErpDibCl = A6227ErpDibCl ;
            Z6226ErpDibInt = A6226ErpDibInt ;
            Z6225ErpEst = A6225ErpEst ;
            Z252CliCod = A252CliCod ;
            Z65ArtCod = A65ArtCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z9705ErpNped = A9705ErpNped ;
         Z8652ErpLin = A8652ErpLin ;
         Z9797ErpPedCl = A9797ErpPedCl ;
         Z8651ErpFPC = A8651ErpFPC ;
         Z8514ErpFPCm = A8514ErpFPCm ;
         Z8222ErpFEP = A8222ErpFEP ;
         Z8218ErpOc = A8218ErpOc ;
         Z8217ErpPCl = A8217ErpPCl ;
         Z8162ErpNPC = A8162ErpNPC ;
         Z7842ErpPda = A7842ErpPda ;
         Z7749ErpLote = A7749ErpLote ;
         Z7498ErpKgs = A7498ErpKgs ;
         Z7490ErpMts = A7490ErpMts ;
         Z7489ErpPzs = A7489ErpPzs ;
         Z7488ErpTipo = A7488ErpTipo ;
         Z7487ErpColNo = A7487ErpColNo ;
         Z7486ErpColNu = A7486ErpColNu ;
         Z7437ErpTc = A7437ErpTc ;
         Z6613ErpColNC = A6613ErpColNC ;
         Z6280ErpColNuC = A6280ErpColNuC ;
         Z6227ErpDibCl = A6227ErpDibCl ;
         Z6226ErpDibInt = A6226ErpDibInt ;
         Z6225ErpEst = A6225ErpEst ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TCPEDCO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01FF4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FF4_A407EmprNom[0] ;
      n407EmprNom = T01FF4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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

   public void load1FF1568( )
   {
      /* Using cursor T01FF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1568 = (short)(1) ;
         A407EmprNom = T01FF7_A407EmprNom[0] ;
         n407EmprNom = T01FF7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9797ErpPedCl = T01FF7_A9797ErpPedCl[0] ;
         n9797ErpPedCl = T01FF7_n9797ErpPedCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9797ErpPedCl", A9797ErpPedCl);
         A8651ErpFPC = T01FF7_A8651ErpFPC[0] ;
         n8651ErpFPC = T01FF7_n8651ErpFPC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8651ErpFPC", localUtil.format(A8651ErpFPC, "99/99/99"));
         A8514ErpFPCm = T01FF7_A8514ErpFPCm[0] ;
         n8514ErpFPCm = T01FF7_n8514ErpFPCm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8514ErpFPCm", localUtil.format(A8514ErpFPCm, "99/99/99"));
         A8222ErpFEP = T01FF7_A8222ErpFEP[0] ;
         n8222ErpFEP = T01FF7_n8222ErpFEP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8222ErpFEP", localUtil.format(A8222ErpFEP, "99/99/99"));
         A8218ErpOc = T01FF7_A8218ErpOc[0] ;
         n8218ErpOc = T01FF7_n8218ErpOc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8218ErpOc", A8218ErpOc);
         A8217ErpPCl = T01FF7_A8217ErpPCl[0] ;
         n8217ErpPCl = T01FF7_n8217ErpPCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8217ErpPCl", A8217ErpPCl);
         A8162ErpNPC = T01FF7_A8162ErpNPC[0] ;
         n8162ErpNPC = T01FF7_n8162ErpNPC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8162ErpNPC", A8162ErpNPC);
         A7842ErpPda = T01FF7_A7842ErpPda[0] ;
         n7842ErpPda = T01FF7_n7842ErpPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7842ErpPda", A7842ErpPda);
         A7749ErpLote = T01FF7_A7749ErpLote[0] ;
         n7749ErpLote = T01FF7_n7749ErpLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7749ErpLote", A7749ErpLote);
         A7498ErpKgs = T01FF7_A7498ErpKgs[0] ;
         n7498ErpKgs = T01FF7_n7498ErpKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7498ErpKgs", GXutil.ltrimstr( A7498ErpKgs, 9, 2));
         A7490ErpMts = T01FF7_A7490ErpMts[0] ;
         n7490ErpMts = T01FF7_n7490ErpMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7490ErpMts", GXutil.ltrimstr( A7490ErpMts, 9, 2));
         A7489ErpPzs = T01FF7_A7489ErpPzs[0] ;
         n7489ErpPzs = T01FF7_n7489ErpPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7489ErpPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7489ErpPzs), 6, 0));
         A7488ErpTipo = T01FF7_A7488ErpTipo[0] ;
         n7488ErpTipo = T01FF7_n7488ErpTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7488ErpTipo", A7488ErpTipo);
         A7487ErpColNo = T01FF7_A7487ErpColNo[0] ;
         n7487ErpColNo = T01FF7_n7487ErpColNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7487ErpColNo", A7487ErpColNo);
         A7486ErpColNu = T01FF7_A7486ErpColNu[0] ;
         n7486ErpColNu = T01FF7_n7486ErpColNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7486ErpColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7486ErpColNu), 6, 0));
         A7437ErpTc = T01FF7_A7437ErpTc[0] ;
         n7437ErpTc = T01FF7_n7437ErpTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7437ErpTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7437ErpTc), 2, 0));
         A6613ErpColNC = T01FF7_A6613ErpColNC[0] ;
         n6613ErpColNC = T01FF7_n6613ErpColNC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6613ErpColNC", A6613ErpColNC);
         A6280ErpColNuC = T01FF7_A6280ErpColNuC[0] ;
         n6280ErpColNuC = T01FF7_n6280ErpColNuC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6280ErpColNuC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6280ErpColNuC), 6, 0));
         A6227ErpDibCl = T01FF7_A6227ErpDibCl[0] ;
         n6227ErpDibCl = T01FF7_n6227ErpDibCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6227ErpDibCl", A6227ErpDibCl);
         A6226ErpDibInt = T01FF7_A6226ErpDibInt[0] ;
         n6226ErpDibInt = T01FF7_n6226ErpDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6226ErpDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6226ErpDibInt), 8, 0));
         A6225ErpEst = T01FF7_A6225ErpEst[0] ;
         n6225ErpEst = T01FF7_n6225ErpEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6225ErpEst", GXutil.str( A6225ErpEst, 1, 0));
         A279CliNom = T01FF7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A252CliCod = T01FF7_A252CliCod[0] ;
         n252CliCod = T01FF7_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01FF7_A65ArtCod[0] ;
         n65ArtCod = T01FF7_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         zm1FF1568( -2) ;
      }
      pr_default.close(5);
      onLoadActions1FF1568( ) ;
   }

   public void onLoadActions1FF1568( )
   {
   }

   public void checkExtendedTable1FF1568( )
   {
      nIsDirty_1568 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01FF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FF5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T01FF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      if ( ! ( ( ( A7498ErpKgs.doubleValue() >= 0 ) && ( A7498ErpKgs.doubleValue() <= 1 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Kilos Pedido", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ERPKGS");
         AnyError = (short)(1) ;
         GX_FocusControl = chkErpKgs.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1FF1568( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01FF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FF8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod )
   {
      /* Using cursor T01FF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
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

   public void getKey1FF1568( )
   {
      /* Using cursor T01FF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1568 = (short)(1) ;
      }
      else
      {
         RcdFound1568 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FF1568( 2) ;
         RcdFound1568 = (short)(1) ;
         A9705ErpNped = T01FF3_A9705ErpNped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
         A8652ErpLin = T01FF3_A8652ErpLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
         A9797ErpPedCl = T01FF3_A9797ErpPedCl[0] ;
         n9797ErpPedCl = T01FF3_n9797ErpPedCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9797ErpPedCl", A9797ErpPedCl);
         A8651ErpFPC = T01FF3_A8651ErpFPC[0] ;
         n8651ErpFPC = T01FF3_n8651ErpFPC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8651ErpFPC", localUtil.format(A8651ErpFPC, "99/99/99"));
         A8514ErpFPCm = T01FF3_A8514ErpFPCm[0] ;
         n8514ErpFPCm = T01FF3_n8514ErpFPCm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8514ErpFPCm", localUtil.format(A8514ErpFPCm, "99/99/99"));
         A8222ErpFEP = T01FF3_A8222ErpFEP[0] ;
         n8222ErpFEP = T01FF3_n8222ErpFEP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8222ErpFEP", localUtil.format(A8222ErpFEP, "99/99/99"));
         A8218ErpOc = T01FF3_A8218ErpOc[0] ;
         n8218ErpOc = T01FF3_n8218ErpOc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8218ErpOc", A8218ErpOc);
         A8217ErpPCl = T01FF3_A8217ErpPCl[0] ;
         n8217ErpPCl = T01FF3_n8217ErpPCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8217ErpPCl", A8217ErpPCl);
         A8162ErpNPC = T01FF3_A8162ErpNPC[0] ;
         n8162ErpNPC = T01FF3_n8162ErpNPC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8162ErpNPC", A8162ErpNPC);
         A7842ErpPda = T01FF3_A7842ErpPda[0] ;
         n7842ErpPda = T01FF3_n7842ErpPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7842ErpPda", A7842ErpPda);
         A7749ErpLote = T01FF3_A7749ErpLote[0] ;
         n7749ErpLote = T01FF3_n7749ErpLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7749ErpLote", A7749ErpLote);
         A7498ErpKgs = T01FF3_A7498ErpKgs[0] ;
         n7498ErpKgs = T01FF3_n7498ErpKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7498ErpKgs", GXutil.ltrimstr( A7498ErpKgs, 9, 2));
         A7490ErpMts = T01FF3_A7490ErpMts[0] ;
         n7490ErpMts = T01FF3_n7490ErpMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7490ErpMts", GXutil.ltrimstr( A7490ErpMts, 9, 2));
         A7489ErpPzs = T01FF3_A7489ErpPzs[0] ;
         n7489ErpPzs = T01FF3_n7489ErpPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7489ErpPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7489ErpPzs), 6, 0));
         A7488ErpTipo = T01FF3_A7488ErpTipo[0] ;
         n7488ErpTipo = T01FF3_n7488ErpTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7488ErpTipo", A7488ErpTipo);
         A7487ErpColNo = T01FF3_A7487ErpColNo[0] ;
         n7487ErpColNo = T01FF3_n7487ErpColNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7487ErpColNo", A7487ErpColNo);
         A7486ErpColNu = T01FF3_A7486ErpColNu[0] ;
         n7486ErpColNu = T01FF3_n7486ErpColNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7486ErpColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7486ErpColNu), 6, 0));
         A7437ErpTc = T01FF3_A7437ErpTc[0] ;
         n7437ErpTc = T01FF3_n7437ErpTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7437ErpTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7437ErpTc), 2, 0));
         A6613ErpColNC = T01FF3_A6613ErpColNC[0] ;
         n6613ErpColNC = T01FF3_n6613ErpColNC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6613ErpColNC", A6613ErpColNC);
         A6280ErpColNuC = T01FF3_A6280ErpColNuC[0] ;
         n6280ErpColNuC = T01FF3_n6280ErpColNuC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6280ErpColNuC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6280ErpColNuC), 6, 0));
         A6227ErpDibCl = T01FF3_A6227ErpDibCl[0] ;
         n6227ErpDibCl = T01FF3_n6227ErpDibCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6227ErpDibCl", A6227ErpDibCl);
         A6226ErpDibInt = T01FF3_A6226ErpDibInt[0] ;
         n6226ErpDibInt = T01FF3_n6226ErpDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6226ErpDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6226ErpDibInt), 8, 0));
         A6225ErpEst = T01FF3_A6225ErpEst[0] ;
         n6225ErpEst = T01FF3_n6225ErpEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6225ErpEst", GXutil.str( A6225ErpEst, 1, 0));
         A252CliCod = T01FF3_A252CliCod[0] ;
         n252CliCod = T01FF3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01FF3_A65ArtCod[0] ;
         n65ArtCod = T01FF3_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         Z396EmprCod = A396EmprCod ;
         Z9705ErpNped = A9705ErpNped ;
         Z8652ErpLin = A8652ErpLin ;
         sMode1568 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FF1568( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1568 = (short)(0) ;
            initializeNonKey1FF1568( ) ;
         }
         Gx_mode = sMode1568 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1568 = (short)(0) ;
         initializeNonKey1FF1568( ) ;
         sMode1568 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1568 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1FF1568( ) ;
      if ( RcdFound1568 == 0 )
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
      RcdFound1568 = (short)(0) ;
      /* Using cursor T01FF11 */
      pr_default.execute(9, new Object[] {A9705ErpNped, A9705ErpNped, Short.valueOf(A8652ErpLin), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01FF11_A9705ErpNped[0], A9705ErpNped) < 0 ) || ( GXutil.strcmp(T01FF11_A9705ErpNped[0], A9705ErpNped) == 0 ) && ( T01FF11_A8652ErpLin[0] < A8652ErpLin ) ) && ( GXutil.strcmp(T01FF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01FF11_A9705ErpNped[0], A9705ErpNped) > 0 ) || ( GXutil.strcmp(T01FF11_A9705ErpNped[0], A9705ErpNped) == 0 ) && ( T01FF11_A8652ErpLin[0] > A8652ErpLin ) ) && ( GXutil.strcmp(T01FF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9705ErpNped = T01FF11_A9705ErpNped[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
            A8652ErpLin = T01FF11_A8652ErpLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
            RcdFound1568 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1568 = (short)(0) ;
      /* Using cursor T01FF12 */
      pr_default.execute(10, new Object[] {A9705ErpNped, A9705ErpNped, Short.valueOf(A8652ErpLin), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01FF12_A9705ErpNped[0], A9705ErpNped) > 0 ) || ( GXutil.strcmp(T01FF12_A9705ErpNped[0], A9705ErpNped) == 0 ) && ( T01FF12_A8652ErpLin[0] > A8652ErpLin ) ) && ( GXutil.strcmp(T01FF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01FF12_A9705ErpNped[0], A9705ErpNped) < 0 ) || ( GXutil.strcmp(T01FF12_A9705ErpNped[0], A9705ErpNped) == 0 ) && ( T01FF12_A8652ErpLin[0] < A8652ErpLin ) ) && ( GXutil.strcmp(T01FF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9705ErpNped = T01FF12_A9705ErpNped[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
            A8652ErpLin = T01FF12_A8652ErpLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
            RcdFound1568 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FF1568( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtErpNped_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FF1568( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1568 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
            {
               A9705ErpNped = Z9705ErpNped ;
               httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
               A8652ErpLin = Z8652ErpLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtErpNped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1FF1568( ) ;
               GX_FocusControl = edtErpNped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtErpNped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FF1568( ) ;
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
                  GX_FocusControl = edtErpNped_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FF1568( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
      {
         A9705ErpNped = Z9705ErpNped ;
         httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
         A8652ErpLin = Z8652ErpLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtErpNped_Internalname ;
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
      getKey1FF1568( ) ;
      if ( RcdFound1568 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
         {
            A9705ErpNped = Z9705ErpNped ;
            httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
            A8652ErpLin = Z8652ErpLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcpedco");
      GX_FocusControl = edtErpPedCl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FF0( ) ;
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
      if ( RcdFound1568 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtErpPedCl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FF1568( ) ;
      if ( RcdFound1568 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtErpPedCl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FF1568( ) ;
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
      if ( RcdFound1568 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtErpPedCl_Internalname ;
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
      if ( RcdFound1568 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtErpPedCl_Internalname ;
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
      scanStart1FF1568( ) ;
      if ( RcdFound1568 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1568 != 0 )
         {
            scanNext1FF1568( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtErpPedCl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FF1568( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FF1568( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPEDCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9797ErpPedCl, T01FF2_A9797ErpPedCl[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8651ErpFPC), GXutil.resetTime(T01FF2_A8651ErpFPC[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z8514ErpFPCm), GXutil.resetTime(T01FF2_A8514ErpFPCm[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z8222ErpFEP), GXutil.resetTime(T01FF2_A8222ErpFEP[0])) ) || ( GXutil.strcmp(Z8218ErpOc, T01FF2_A8218ErpOc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8217ErpPCl, T01FF2_A8217ErpPCl[0]) != 0 ) || ( GXutil.strcmp(Z8162ErpNPC, T01FF2_A8162ErpNPC[0]) != 0 ) || ( GXutil.strcmp(Z7842ErpPda, T01FF2_A7842ErpPda[0]) != 0 ) || ( GXutil.strcmp(Z7749ErpLote, T01FF2_A7749ErpLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z7498ErpKgs, T01FF2_A7498ErpKgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7490ErpMts, T01FF2_A7490ErpMts[0]) != 0 ) || ( Z7489ErpPzs != T01FF2_A7489ErpPzs[0] ) || ( GXutil.strcmp(Z7488ErpTipo, T01FF2_A7488ErpTipo[0]) != 0 ) || ( GXutil.strcmp(Z7487ErpColNo, T01FF2_A7487ErpColNo[0]) != 0 ) || ( Z7486ErpColNu != T01FF2_A7486ErpColNu[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7437ErpTc != T01FF2_A7437ErpTc[0] ) || ( GXutil.strcmp(Z6613ErpColNC, T01FF2_A6613ErpColNC[0]) != 0 ) || ( Z6280ErpColNuC != T01FF2_A6280ErpColNuC[0] ) || ( GXutil.strcmp(Z6227ErpDibCl, T01FF2_A6227ErpDibCl[0]) != 0 ) || ( Z6226ErpDibInt != T01FF2_A6226ErpDibInt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6225ErpEst != T01FF2_A6225ErpEst[0] ) || ( Z252CliCod != T01FF2_A252CliCod[0] ) || ( GXutil.strcmp(Z65ArtCod, T01FF2_A65ArtCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9797ErpPedCl, T01FF2_A9797ErpPedCl[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpPedCl");
               GXutil.writeLogRaw("Old: ",Z9797ErpPedCl);
               GXutil.writeLogRaw("Current: ",T01FF2_A9797ErpPedCl[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8651ErpFPC), GXutil.resetTime(T01FF2_A8651ErpFPC[0])) ) )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpFPC");
               GXutil.writeLogRaw("Old: ",Z8651ErpFPC);
               GXutil.writeLogRaw("Current: ",T01FF2_A8651ErpFPC[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8514ErpFPCm), GXutil.resetTime(T01FF2_A8514ErpFPCm[0])) ) )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpFPCm");
               GXutil.writeLogRaw("Old: ",Z8514ErpFPCm);
               GXutil.writeLogRaw("Current: ",T01FF2_A8514ErpFPCm[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8222ErpFEP), GXutil.resetTime(T01FF2_A8222ErpFEP[0])) ) )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpFEP");
               GXutil.writeLogRaw("Old: ",Z8222ErpFEP);
               GXutil.writeLogRaw("Current: ",T01FF2_A8222ErpFEP[0]);
            }
            if ( GXutil.strcmp(Z8218ErpOc, T01FF2_A8218ErpOc[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpOc");
               GXutil.writeLogRaw("Old: ",Z8218ErpOc);
               GXutil.writeLogRaw("Current: ",T01FF2_A8218ErpOc[0]);
            }
            if ( GXutil.strcmp(Z8217ErpPCl, T01FF2_A8217ErpPCl[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpPCl");
               GXutil.writeLogRaw("Old: ",Z8217ErpPCl);
               GXutil.writeLogRaw("Current: ",T01FF2_A8217ErpPCl[0]);
            }
            if ( GXutil.strcmp(Z8162ErpNPC, T01FF2_A8162ErpNPC[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpNPC");
               GXutil.writeLogRaw("Old: ",Z8162ErpNPC);
               GXutil.writeLogRaw("Current: ",T01FF2_A8162ErpNPC[0]);
            }
            if ( GXutil.strcmp(Z7842ErpPda, T01FF2_A7842ErpPda[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpPda");
               GXutil.writeLogRaw("Old: ",Z7842ErpPda);
               GXutil.writeLogRaw("Current: ",T01FF2_A7842ErpPda[0]);
            }
            if ( GXutil.strcmp(Z7749ErpLote, T01FF2_A7749ErpLote[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpLote");
               GXutil.writeLogRaw("Old: ",Z7749ErpLote);
               GXutil.writeLogRaw("Current: ",T01FF2_A7749ErpLote[0]);
            }
            if ( DecimalUtil.compareTo(Z7498ErpKgs, T01FF2_A7498ErpKgs[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpKgs");
               GXutil.writeLogRaw("Old: ",Z7498ErpKgs);
               GXutil.writeLogRaw("Current: ",T01FF2_A7498ErpKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z7490ErpMts, T01FF2_A7490ErpMts[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpMts");
               GXutil.writeLogRaw("Old: ",Z7490ErpMts);
               GXutil.writeLogRaw("Current: ",T01FF2_A7490ErpMts[0]);
            }
            if ( Z7489ErpPzs != T01FF2_A7489ErpPzs[0] )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpPzs");
               GXutil.writeLogRaw("Old: ",Z7489ErpPzs);
               GXutil.writeLogRaw("Current: ",T01FF2_A7489ErpPzs[0]);
            }
            if ( GXutil.strcmp(Z7488ErpTipo, T01FF2_A7488ErpTipo[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpTipo");
               GXutil.writeLogRaw("Old: ",Z7488ErpTipo);
               GXutil.writeLogRaw("Current: ",T01FF2_A7488ErpTipo[0]);
            }
            if ( GXutil.strcmp(Z7487ErpColNo, T01FF2_A7487ErpColNo[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpColNo");
               GXutil.writeLogRaw("Old: ",Z7487ErpColNo);
               GXutil.writeLogRaw("Current: ",T01FF2_A7487ErpColNo[0]);
            }
            if ( Z7486ErpColNu != T01FF2_A7486ErpColNu[0] )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpColNu");
               GXutil.writeLogRaw("Old: ",Z7486ErpColNu);
               GXutil.writeLogRaw("Current: ",T01FF2_A7486ErpColNu[0]);
            }
            if ( Z7437ErpTc != T01FF2_A7437ErpTc[0] )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpTc");
               GXutil.writeLogRaw("Old: ",Z7437ErpTc);
               GXutil.writeLogRaw("Current: ",T01FF2_A7437ErpTc[0]);
            }
            if ( GXutil.strcmp(Z6613ErpColNC, T01FF2_A6613ErpColNC[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpColNC");
               GXutil.writeLogRaw("Old: ",Z6613ErpColNC);
               GXutil.writeLogRaw("Current: ",T01FF2_A6613ErpColNC[0]);
            }
            if ( Z6280ErpColNuC != T01FF2_A6280ErpColNuC[0] )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpColNuC");
               GXutil.writeLogRaw("Old: ",Z6280ErpColNuC);
               GXutil.writeLogRaw("Current: ",T01FF2_A6280ErpColNuC[0]);
            }
            if ( GXutil.strcmp(Z6227ErpDibCl, T01FF2_A6227ErpDibCl[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpDibCl");
               GXutil.writeLogRaw("Old: ",Z6227ErpDibCl);
               GXutil.writeLogRaw("Current: ",T01FF2_A6227ErpDibCl[0]);
            }
            if ( Z6226ErpDibInt != T01FF2_A6226ErpDibInt[0] )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpDibInt");
               GXutil.writeLogRaw("Old: ",Z6226ErpDibInt);
               GXutil.writeLogRaw("Current: ",T01FF2_A6226ErpDibInt[0]);
            }
            if ( Z6225ErpEst != T01FF2_A6225ErpEst[0] )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ErpEst");
               GXutil.writeLogRaw("Old: ",Z6225ErpEst);
               GXutil.writeLogRaw("Current: ",T01FF2_A6225ErpEst[0]);
            }
            if ( Z252CliCod != T01FF2_A252CliCod[0] )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01FF2_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z65ArtCod, T01FF2_A65ArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tcpedco:[seudo value changed for attri]"+"ArtCod");
               GXutil.writeLogRaw("Old: ",Z65ArtCod);
               GXutil.writeLogRaw("Current: ",T01FF2_A65ArtCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPEDCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FF1568( )
   {
      beforeValidate1FF1568( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FF1568( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FF1568( 0) ;
         checkOptimisticConcurrency1FF1568( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FF1568( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FF1568( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FF13 */
                  pr_default.execute(11, new Object[] {A9705ErpNped, Short.valueOf(A8652ErpLin), Boolean.valueOf(n9797ErpPedCl), A9797ErpPedCl, Boolean.valueOf(n8651ErpFPC), A8651ErpFPC, Boolean.valueOf(n8514ErpFPCm), A8514ErpFPCm, Boolean.valueOf(n8222ErpFEP), A8222ErpFEP, Boolean.valueOf(n8218ErpOc), A8218ErpOc, Boolean.valueOf(n8217ErpPCl), A8217ErpPCl, Boolean.valueOf(n8162ErpNPC), A8162ErpNPC, Boolean.valueOf(n7842ErpPda), A7842ErpPda, Boolean.valueOf(n7749ErpLote), A7749ErpLote, Boolean.valueOf(n7498ErpKgs), A7498ErpKgs, Boolean.valueOf(n7490ErpMts), A7490ErpMts, Boolean.valueOf(n7489ErpPzs), Integer.valueOf(A7489ErpPzs), Boolean.valueOf(n7488ErpTipo), A7488ErpTipo, Boolean.valueOf(n7487ErpColNo), A7487ErpColNo, Boolean.valueOf(n7486ErpColNu), Integer.valueOf(A7486ErpColNu), Boolean.valueOf(n7437ErpTc), Byte.valueOf(A7437ErpTc), Boolean.valueOf(n6613ErpColNC), A6613ErpColNC, Boolean.valueOf(n6280ErpColNuC), Integer.valueOf(A6280ErpColNuC), Boolean.valueOf(n6227ErpDibCl), A6227ErpDibCl, Boolean.valueOf(n6226ErpDibInt), Integer.valueOf(A6226ErpDibInt), Boolean.valueOf(n6225ErpEst), Byte.valueOf(A6225ErpEst), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDCO");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1FF0( ) ;
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
            load1FF1568( ) ;
         }
         endLevel1FF1568( ) ;
      }
      closeExtendedTableCursors1FF1568( ) ;
   }

   public void update1FF1568( )
   {
      beforeValidate1FF1568( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FF1568( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FF1568( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FF1568( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FF1568( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FF14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n9797ErpPedCl), A9797ErpPedCl, Boolean.valueOf(n8651ErpFPC), A8651ErpFPC, Boolean.valueOf(n8514ErpFPCm), A8514ErpFPCm, Boolean.valueOf(n8222ErpFEP), A8222ErpFEP, Boolean.valueOf(n8218ErpOc), A8218ErpOc, Boolean.valueOf(n8217ErpPCl), A8217ErpPCl, Boolean.valueOf(n8162ErpNPC), A8162ErpNPC, Boolean.valueOf(n7842ErpPda), A7842ErpPda, Boolean.valueOf(n7749ErpLote), A7749ErpLote, Boolean.valueOf(n7498ErpKgs), A7498ErpKgs, Boolean.valueOf(n7490ErpMts), A7490ErpMts, Boolean.valueOf(n7489ErpPzs), Integer.valueOf(A7489ErpPzs), Boolean.valueOf(n7488ErpTipo), A7488ErpTipo, Boolean.valueOf(n7487ErpColNo), A7487ErpColNo, Boolean.valueOf(n7486ErpColNu), Integer.valueOf(A7486ErpColNu), Boolean.valueOf(n7437ErpTc), Byte.valueOf(A7437ErpTc), Boolean.valueOf(n6613ErpColNC), A6613ErpColNC, Boolean.valueOf(n6280ErpColNuC), Integer.valueOf(A6280ErpColNuC), Boolean.valueOf(n6227ErpDibCl), A6227ErpDibCl, Boolean.valueOf(n6226ErpDibInt), Integer.valueOf(A6226ErpDibInt), Boolean.valueOf(n6225ErpEst), Byte.valueOf(A6225ErpEst), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDCO");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPEDCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FF1568( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1FF0( ) ;
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
         endLevel1FF1568( ) ;
      }
      closeExtendedTableCursors1FF1568( ) ;
   }

   public void deferredUpdate1FF1568( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FF1568( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FF1568( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FF1568( ) ;
         afterConfirm1FF1568( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FF1568( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FF15 */
               pr_default.execute(13, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDCO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1568 == 0 )
                     {
                        initAll1FF1568( ) ;
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
                     resetCaption1FF0( ) ;
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
      sMode1568 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FF1568( ) ;
      Gx_mode = sMode1568 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FF1568( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FF16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01FF16_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01FF17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1FF1568( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FF1568( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcpedco");
         if ( AnyError == 0 )
         {
            confirmValues1FF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcpedco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FF1568( )
   {
      /* Scan By routine */
      /* Using cursor T01FF18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1568 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1568 = (short)(1) ;
         A9705ErpNped = T01FF18_A9705ErpNped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
         A8652ErpLin = T01FF18_A8652ErpLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FF1568( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1568 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1568 = (short)(1) ;
         A9705ErpNped = T01FF18_A9705ErpNped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
         A8652ErpLin = T01FF18_A8652ErpLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
      }
   }

   public void scanEnd1FF1568( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1FF1568( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FF1568( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FF1568( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FF1568( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FF1568( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FF1568( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FF1568( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtErpNped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpNped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpNped_Enabled), 5, 0), true);
      edtErpLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpLin_Enabled), 5, 0), true);
      edtErpPedCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpPedCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpPedCl_Enabled), 5, 0), true);
      edtErpFPC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpFPC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpFPC_Enabled), 5, 0), true);
      edtErpFPCm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpFPCm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpFPCm_Enabled), 5, 0), true);
      edtErpFEP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpFEP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpFEP_Enabled), 5, 0), true);
      edtErpOc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpOc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpOc_Enabled), 5, 0), true);
      edtErpPCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpPCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpPCl_Enabled), 5, 0), true);
      edtErpNPC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpNPC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpNPC_Enabled), 5, 0), true);
      edtErpPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpPda_Enabled), 5, 0), true);
      edtErpLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpLote_Enabled), 5, 0), true);
      chkErpKgs.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkErpKgs.getInternalname(), "Enabled", GXutil.ltrimstr( chkErpKgs.getEnabled(), 5, 0), true);
      edtErpMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpMts_Enabled), 5, 0), true);
      edtErpPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpPzs_Enabled), 5, 0), true);
      edtErpTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpTipo_Enabled), 5, 0), true);
      edtErpColNo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpColNo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpColNo_Enabled), 5, 0), true);
      edtErpColNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpColNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpColNu_Enabled), 5, 0), true);
      cmbErpTc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbErpTc.getInternalname(), "Enabled", GXutil.ltrimstr( cmbErpTc.getEnabled(), 5, 0), true);
      edtErpColNC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpColNC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpColNC_Enabled), 5, 0), true);
      edtErpColNuC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpColNuC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpColNuC_Enabled), 5, 0), true);
      edtErpDibCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpDibCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpDibCl_Enabled), 5, 0), true);
      edtErpDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpDibInt_Enabled), 5, 0), true);
      edtErpEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpEst_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1FF1568( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1FF0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcpedco", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9705ErpNped", GXutil.rtrim( Z9705ErpNped));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8652ErpLin", GXutil.ltrim( localUtil.ntoc( Z8652ErpLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9797ErpPedCl", GXutil.rtrim( Z9797ErpPedCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8651ErpFPC", localUtil.dtoc( Z8651ErpFPC, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8514ErpFPCm", localUtil.dtoc( Z8514ErpFPCm, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8222ErpFEP", localUtil.dtoc( Z8222ErpFEP, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8218ErpOc", GXutil.rtrim( Z8218ErpOc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8217ErpPCl", GXutil.rtrim( Z8217ErpPCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8162ErpNPC", GXutil.rtrim( Z8162ErpNPC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7842ErpPda", GXutil.rtrim( Z7842ErpPda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7749ErpLote", GXutil.rtrim( Z7749ErpLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7498ErpKgs", GXutil.ltrim( localUtil.ntoc( Z7498ErpKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7490ErpMts", GXutil.ltrim( localUtil.ntoc( Z7490ErpMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7489ErpPzs", GXutil.ltrim( localUtil.ntoc( Z7489ErpPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7488ErpTipo", GXutil.rtrim( Z7488ErpTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7487ErpColNo", GXutil.rtrim( Z7487ErpColNo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7486ErpColNu", GXutil.ltrim( localUtil.ntoc( Z7486ErpColNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7437ErpTc", GXutil.ltrim( localUtil.ntoc( Z7437ErpTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6613ErpColNC", GXutil.rtrim( Z6613ErpColNC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6280ErpColNuC", GXutil.ltrim( localUtil.ntoc( Z6280ErpColNuC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6227ErpDibCl", GXutil.rtrim( Z6227ErpDibCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6226ErpDibInt", GXutil.ltrim( localUtil.ntoc( Z6226ErpDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6225ErpEst", GXutil.ltrim( localUtil.ntoc( Z6225ErpEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tcpedco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCPEDCO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PEDIDOS COMERCIALES", "") ;
   }

   public void initializeNonKey1FF1568( )
   {
      A9797ErpPedCl = "" ;
      n9797ErpPedCl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9797ErpPedCl", A9797ErpPedCl);
      A8651ErpFPC = GXutil.nullDate() ;
      n8651ErpFPC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8651ErpFPC", localUtil.format(A8651ErpFPC, "99/99/99"));
      A8514ErpFPCm = GXutil.nullDate() ;
      n8514ErpFPCm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8514ErpFPCm", localUtil.format(A8514ErpFPCm, "99/99/99"));
      A8222ErpFEP = GXutil.nullDate() ;
      n8222ErpFEP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8222ErpFEP", localUtil.format(A8222ErpFEP, "99/99/99"));
      A8218ErpOc = "" ;
      n8218ErpOc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8218ErpOc", A8218ErpOc);
      A8217ErpPCl = "" ;
      n8217ErpPCl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8217ErpPCl", A8217ErpPCl);
      A8162ErpNPC = "" ;
      n8162ErpNPC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8162ErpNPC", A8162ErpNPC);
      A7842ErpPda = "" ;
      n7842ErpPda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7842ErpPda", A7842ErpPda);
      A7749ErpLote = "" ;
      n7749ErpLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7749ErpLote", A7749ErpLote);
      A7498ErpKgs = DecimalUtil.ZERO ;
      n7498ErpKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7498ErpKgs", GXutil.ltrimstr( A7498ErpKgs, 9, 2));
      A7490ErpMts = DecimalUtil.ZERO ;
      n7490ErpMts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7490ErpMts", GXutil.ltrimstr( A7490ErpMts, 9, 2));
      A7489ErpPzs = 0 ;
      n7489ErpPzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7489ErpPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7489ErpPzs), 6, 0));
      A7488ErpTipo = "" ;
      n7488ErpTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7488ErpTipo", A7488ErpTipo);
      A7487ErpColNo = "" ;
      n7487ErpColNo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7487ErpColNo", A7487ErpColNo);
      A7486ErpColNu = 0 ;
      n7486ErpColNu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7486ErpColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7486ErpColNu), 6, 0));
      A7437ErpTc = (byte)(0) ;
      n7437ErpTc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7437ErpTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7437ErpTc), 2, 0));
      A6613ErpColNC = "" ;
      n6613ErpColNC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6613ErpColNC", A6613ErpColNC);
      A6280ErpColNuC = 0 ;
      n6280ErpColNuC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6280ErpColNuC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6280ErpColNuC), 6, 0));
      A6227ErpDibCl = "" ;
      n6227ErpDibCl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6227ErpDibCl", A6227ErpDibCl);
      A6226ErpDibInt = 0 ;
      n6226ErpDibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6226ErpDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6226ErpDibInt), 8, 0));
      A6225ErpEst = (byte)(0) ;
      n6225ErpEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6225ErpEst", GXutil.str( A6225ErpEst, 1, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A65ArtCod = "" ;
      n65ArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      Z9797ErpPedCl = "" ;
      Z8651ErpFPC = GXutil.nullDate() ;
      Z8514ErpFPCm = GXutil.nullDate() ;
      Z8222ErpFEP = GXutil.nullDate() ;
      Z8218ErpOc = "" ;
      Z8217ErpPCl = "" ;
      Z8162ErpNPC = "" ;
      Z7842ErpPda = "" ;
      Z7749ErpLote = "" ;
      Z7498ErpKgs = DecimalUtil.ZERO ;
      Z7490ErpMts = DecimalUtil.ZERO ;
      Z7489ErpPzs = 0 ;
      Z7488ErpTipo = "" ;
      Z7487ErpColNo = "" ;
      Z7486ErpColNu = 0 ;
      Z7437ErpTc = (byte)(0) ;
      Z6613ErpColNC = "" ;
      Z6280ErpColNuC = 0 ;
      Z6227ErpDibCl = "" ;
      Z6226ErpDibInt = 0 ;
      Z6225ErpEst = (byte)(0) ;
      Z252CliCod = 0 ;
      Z65ArtCod = "" ;
   }

   public void initAll1FF1568( )
   {
      A9705ErpNped = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
      A8652ErpLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
      initializeNonKey1FF1568( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241571291", true, true);
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
      httpContext.AddJavascriptSource("tcpedco.js", "?20268241571292", false, true);
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
      edtErpNped_Internalname = "ERPNPED" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtErpLin_Internalname = "ERPLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtErpPedCl_Internalname = "ERPPEDCL" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtErpFPC_Internalname = "ERPFPC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtErpFPCm_Internalname = "ERPFPCM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtErpFEP_Internalname = "ERPFEP" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtErpOc_Internalname = "ERPOC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtErpPCl_Internalname = "ERPPCL" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtErpNPC_Internalname = "ERPNPC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtErpPda_Internalname = "ERPPDA" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtErpLote_Internalname = "ERPLOTE" ;
      chkErpKgs.setInternalname( "ERPKGS" );
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtErpMts_Internalname = "ERPMTS" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtErpPzs_Internalname = "ERPPZS" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtErpTipo_Internalname = "ERPTIPO" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtErpColNo_Internalname = "ERPCOLNO" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtErpColNu_Internalname = "ERPCOLNU" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      cmbErpTc.setInternalname( "ERPTC" );
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtErpColNC_Internalname = "ERPCOLNC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtErpColNuC_Internalname = "ERPCOLNUC" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtErpDibCl_Internalname = "ERPDIBCL" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtErpDibInt_Internalname = "ERPDIBINT" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtErpEst_Internalname = "ERPEST" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtArtCod_Internalname = "ARTCOD" ;
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
      Form.setCaption( httpContext.getMessage( "PEDIDOS COMERCIALES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtErpEst_Jsonclick = "" ;
      edtErpEst_Backcolor = (int)(0xFFFFFF) ;
      edtErpEst_Enabled = 1 ;
      edtErpDibInt_Jsonclick = "" ;
      edtErpDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtErpDibInt_Enabled = 1 ;
      edtErpDibCl_Jsonclick = "" ;
      edtErpDibCl_Backcolor = (int)(0xFFFFFF) ;
      edtErpDibCl_Enabled = 1 ;
      edtErpColNuC_Jsonclick = "" ;
      edtErpColNuC_Backcolor = (int)(0xFFFFFF) ;
      edtErpColNuC_Enabled = 1 ;
      edtErpColNC_Jsonclick = "" ;
      edtErpColNC_Backcolor = (int)(0xFFFFFF) ;
      edtErpColNC_Enabled = 1 ;
      cmbErpTc.setJsonclick( "" );
      cmbErpTc.setEnabled( 1 );
      cmbErpTc.setIBackground( (int)(0xFFFFFF) );
      edtErpColNu_Jsonclick = "" ;
      edtErpColNu_Backcolor = (int)(0xFFFFFF) ;
      edtErpColNu_Enabled = 1 ;
      edtErpColNo_Jsonclick = "" ;
      edtErpColNo_Backcolor = (int)(0xFFFFFF) ;
      edtErpColNo_Enabled = 1 ;
      edtErpTipo_Jsonclick = "" ;
      edtErpTipo_Backcolor = (int)(0xFFFFFF) ;
      edtErpTipo_Enabled = 1 ;
      edtErpPzs_Jsonclick = "" ;
      edtErpPzs_Backcolor = (int)(0xFFFFFF) ;
      edtErpPzs_Enabled = 1 ;
      edtErpMts_Jsonclick = "" ;
      edtErpMts_Backcolor = (int)(0xFFFFFF) ;
      edtErpMts_Enabled = 1 ;
      chkErpKgs.setIBackground( (int)(0xFFFFFF) );
      chkErpKgs.setEnabled( 1 );
      edtErpLote_Jsonclick = "" ;
      edtErpLote_Backcolor = (int)(0xFFFFFF) ;
      edtErpLote_Enabled = 1 ;
      edtErpPda_Jsonclick = "" ;
      edtErpPda_Backcolor = (int)(0xFFFFFF) ;
      edtErpPda_Enabled = 1 ;
      edtErpNPC_Jsonclick = "" ;
      edtErpNPC_Backcolor = (int)(0xFFFFFF) ;
      edtErpNPC_Enabled = 1 ;
      edtErpPCl_Jsonclick = "" ;
      edtErpPCl_Backcolor = (int)(0xFFFFFF) ;
      edtErpPCl_Enabled = 1 ;
      edtErpOc_Jsonclick = "" ;
      edtErpOc_Backcolor = (int)(0xFFFFFF) ;
      edtErpOc_Enabled = 1 ;
      edtErpFEP_Jsonclick = "" ;
      edtErpFEP_Backcolor = (int)(0xFFFFFF) ;
      edtErpFEP_Enabled = 1 ;
      edtErpFPCm_Jsonclick = "" ;
      edtErpFPCm_Backcolor = (int)(0xFFFFFF) ;
      edtErpFPCm_Enabled = 1 ;
      edtErpFPC_Jsonclick = "" ;
      edtErpFPC_Backcolor = (int)(0xFFFFFF) ;
      edtErpFPC_Enabled = 1 ;
      edtErpPedCl_Jsonclick = "" ;
      edtErpPedCl_Backcolor = (int)(0xFFFFFF) ;
      edtErpPedCl_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtErpLin_Jsonclick = "" ;
      edtErpLin_Backcolor = (int)(0xFFFFFF) ;
      edtErpLin_Enabled = 1 ;
      edtErpNped_Jsonclick = "" ;
      edtErpNped_Backcolor = (int)(0xFFFFFF) ;
      edtErpNped_Enabled = 1 ;
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
      chkErpKgs.setName( "ERPKGS" );
      chkErpKgs.setWebtags( "" );
      chkErpKgs.setCaption( httpContext.getMessage( "Divisible", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkErpKgs.getInternalname(), "TitleCaption", chkErpKgs.getCaption(), true);
      chkErpKgs.setCheckedValue( "0" );
      A7498ErpKgs = ((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7498ErpKgs, (byte)(9), (byte)(2), ".", "")), "1")==0) ? DecimalUtil.stringToDec( "1") : DecimalUtil.stringToDec( "0")) ;
      n7498ErpKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7498ErpKgs", GXutil.ltrimstr( A7498ErpKgs, 9, 2));
      cmbErpTc.setName( "ERPTC" );
      cmbErpTc.setWebtags( "" );
      cmbErpTc.addItem("1", httpContext.getMessage( "1 - Máxima", ""), (short)(0));
      cmbErpTc.addItem("2", httpContext.getMessage( "2 - Muy alta", ""), (short)(0));
      cmbErpTc.addItem("3", httpContext.getMessage( "3 - Alta", ""), (short)(0));
      cmbErpTc.addItem("4", httpContext.getMessage( "4 - Media/alta", ""), (short)(0));
      cmbErpTc.addItem("5", httpContext.getMessage( "5 - Media", ""), (short)(0));
      cmbErpTc.addItem("6", httpContext.getMessage( "6 - Media/baja", ""), (short)(0));
      cmbErpTc.addItem("7", httpContext.getMessage( "7 - Baja", ""), (short)(0));
      cmbErpTc.addItem("8", httpContext.getMessage( "8 - Muy baja", ""), (short)(0));
      cmbErpTc.addItem("9", httpContext.getMessage( "9 - Mínima", ""), (short)(0));
      if ( cmbErpTc.getItemCount() > 0 )
      {
         A7437ErpTc = (byte)(GXutil.lval( cmbErpTc.getValidValue(GXutil.trim( GXutil.str( A7437ErpTc, 2, 0))))) ;
         n7437ErpTc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7437ErpTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7437ErpTc), 2, 0));
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01FF19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FF19_A407EmprNom[0] ;
      n407EmprNom = T01FF19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      GX_FocusControl = edtErpPedCl_Internalname ;
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

   public void valid_Erplin( )
   {
      n7437ErpTc = false ;
      A7437ErpTc = (byte)(GXutil.lval( cmbErpTc.getValue())) ;
      n7437ErpTc = false ;
      cmbErpTc.setValue( GXutil.ltrimstr( DecimalUtil.doubleToDec(A7437ErpTc), 2, 0) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A7498ErpKgs = ((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7498ErpKgs, (byte)(9), (byte)(2), ".", "")), "1")==0) ? DecimalUtil.stringToDec( "1") : DecimalUtil.stringToDec( "0")) ;
      n7498ErpKgs = false ;
      if ( cmbErpTc.getItemCount() > 0 )
      {
         A7437ErpTc = (byte)(GXutil.lval( cmbErpTc.getValidValue(GXutil.trim( GXutil.str( A7437ErpTc, 2, 0))))) ;
         n7437ErpTc = false ;
         cmbErpTc.setValue( GXutil.ltrimstr( DecimalUtil.doubleToDec(A7437ErpTc), 2, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbErpTc.setValue( GXutil.trim( GXutil.str( A7437ErpTc, 2, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9797ErpPedCl", GXutil.rtrim( A9797ErpPedCl));
      httpContext.ajax_rsp_assign_attri("", false, "A8651ErpFPC", localUtil.format(A8651ErpFPC, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8514ErpFPCm", localUtil.format(A8514ErpFPCm, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8222ErpFEP", localUtil.format(A8222ErpFEP, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8218ErpOc", GXutil.rtrim( A8218ErpOc));
      httpContext.ajax_rsp_assign_attri("", false, "A8217ErpPCl", GXutil.rtrim( A8217ErpPCl));
      httpContext.ajax_rsp_assign_attri("", false, "A8162ErpNPC", GXutil.rtrim( A8162ErpNPC));
      httpContext.ajax_rsp_assign_attri("", false, "A7842ErpPda", GXutil.rtrim( A7842ErpPda));
      httpContext.ajax_rsp_assign_attri("", false, "A7749ErpLote", GXutil.rtrim( A7749ErpLote));
      httpContext.ajax_rsp_assign_attri("", false, "A7498ErpKgs", GXutil.ltrim( localUtil.ntoc( A7498ErpKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7490ErpMts", GXutil.ltrim( localUtil.ntoc( A7490ErpMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7489ErpPzs", GXutil.ltrim( localUtil.ntoc( A7489ErpPzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7488ErpTipo", GXutil.rtrim( A7488ErpTipo));
      httpContext.ajax_rsp_assign_attri("", false, "A7487ErpColNo", GXutil.rtrim( A7487ErpColNo));
      httpContext.ajax_rsp_assign_attri("", false, "A7486ErpColNu", GXutil.ltrim( localUtil.ntoc( A7486ErpColNu, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7437ErpTc", GXutil.ltrim( localUtil.ntoc( A7437ErpTc, (byte)(2), (byte)(0), ".", "")));
      cmbErpTc.setValue( GXutil.trim( GXutil.str( A7437ErpTc, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbErpTc.getInternalname(), "Values", cmbErpTc.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A6613ErpColNC", GXutil.rtrim( A6613ErpColNC));
      httpContext.ajax_rsp_assign_attri("", false, "A6280ErpColNuC", GXutil.ltrim( localUtil.ntoc( A6280ErpColNuC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6227ErpDibCl", GXutil.rtrim( A6227ErpDibCl));
      httpContext.ajax_rsp_assign_attri("", false, "A6226ErpDibInt", GXutil.ltrim( localUtil.ntoc( A6226ErpDibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6225ErpEst", GXutil.ltrim( localUtil.ntoc( A6225ErpEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", GXutil.rtrim( A65ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9705ErpNped", GXutil.rtrim( Z9705ErpNped));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8652ErpLin", GXutil.ltrim( localUtil.ntoc( Z8652ErpLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9797ErpPedCl", GXutil.rtrim( Z9797ErpPedCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8651ErpFPC", localUtil.format(Z8651ErpFPC, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8514ErpFPCm", localUtil.format(Z8514ErpFPCm, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8222ErpFEP", localUtil.format(Z8222ErpFEP, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8218ErpOc", GXutil.rtrim( Z8218ErpOc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8217ErpPCl", GXutil.rtrim( Z8217ErpPCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8162ErpNPC", GXutil.rtrim( Z8162ErpNPC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7842ErpPda", GXutil.rtrim( Z7842ErpPda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7749ErpLote", GXutil.rtrim( Z7749ErpLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7498ErpKgs", GXutil.ltrim( localUtil.ntoc( Z7498ErpKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7490ErpMts", GXutil.ltrim( localUtil.ntoc( Z7490ErpMts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7489ErpPzs", GXutil.ltrim( localUtil.ntoc( Z7489ErpPzs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7488ErpTipo", GXutil.rtrim( Z7488ErpTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7487ErpColNo", GXutil.rtrim( Z7487ErpColNo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7486ErpColNu", GXutil.ltrim( localUtil.ntoc( Z7486ErpColNu, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7437ErpTc", GXutil.ltrim( localUtil.ntoc( Z7437ErpTc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6613ErpColNC", GXutil.rtrim( Z6613ErpColNC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6280ErpColNuC", GXutil.ltrim( localUtil.ntoc( Z6280ErpColNuC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6227ErpDibCl", GXutil.rtrim( Z6227ErpDibCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6226ErpDibInt", GXutil.ltrim( localUtil.ntoc( Z6226ErpDibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6225ErpEst", GXutil.ltrim( localUtil.ntoc( Z6225ErpEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
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
      /* Using cursor T01FF16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01FF16_A279CliNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      /* Using cursor T01FF20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(18);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_ERPNPED","{handler:'valid_Erpnped',iparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ERPNPED",",oparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_ERPLIN","{handler:'valid_Erplin',iparms:[{av:'cmbErpTc'},{av:'A7437ErpTc',fld:'ERPTC',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9705ErpNped',fld:'ERPNPED',pic:''},{av:'A8652ErpLin',fld:'ERPLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ERPLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9797ErpPedCl',fld:'ERPPEDCL',pic:''},{av:'A8651ErpFPC',fld:'ERPFPC',pic:''},{av:'A8514ErpFPCm',fld:'ERPFPCM',pic:''},{av:'A8222ErpFEP',fld:'ERPFEP',pic:''},{av:'A8218ErpOc',fld:'ERPOC',pic:''},{av:'A8217ErpPCl',fld:'ERPPCL',pic:''},{av:'A8162ErpNPC',fld:'ERPNPC',pic:''},{av:'A7842ErpPda',fld:'ERPPDA',pic:''},{av:'A7749ErpLote',fld:'ERPLOTE',pic:''},{av:'A7490ErpMts',fld:'ERPMTS',pic:'ZZZZZ9.99'},{av:'A7489ErpPzs',fld:'ERPPZS',pic:'ZZZZZ9'},{av:'A7488ErpTipo',fld:'ERPTIPO',pic:''},{av:'A7487ErpColNo',fld:'ERPCOLNO',pic:''},{av:'A7486ErpColNu',fld:'ERPCOLNU',pic:'ZZZZZ9'},{av:'cmbErpTc'},{av:'A7437ErpTc',fld:'ERPTC',pic:'Z9'},{av:'A6613ErpColNC',fld:'ERPCOLNC',pic:''},{av:'A6280ErpColNuC',fld:'ERPCOLNUC',pic:'ZZZZZ9'},{av:'A6227ErpDibCl',fld:'ERPDIBCL',pic:''},{av:'A6226ErpDibInt',fld:'ERPDIBINT',pic:'ZZZZZZZ9'},{av:'A6225ErpEst',fld:'ERPEST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9705ErpNped'},{av:'Z8652ErpLin'},{av:'Z407EmprNom'},{av:'Z9797ErpPedCl'},{av:'Z8651ErpFPC'},{av:'Z8514ErpFPCm'},{av:'Z8222ErpFEP'},{av:'Z8218ErpOc'},{av:'Z8217ErpPCl'},{av:'Z8162ErpNPC'},{av:'Z7842ErpPda'},{av:'Z7749ErpLote'},{av:'Z7498ErpKgs'},{av:'Z7490ErpMts'},{av:'Z7489ErpPzs'},{av:'Z7488ErpTipo'},{av:'Z7487ErpColNo'},{av:'Z7486ErpColNu'},{av:'Z7437ErpTc'},{av:'Z6613ErpColNC'},{av:'Z6280ErpColNuC'},{av:'Z6227ErpDibCl'},{av:'Z6226ErpDibInt'},{av:'Z6225ErpEst'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_ERPKGS","{handler:'valid_Erpkgs',iparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ERPKGS",",oparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A7498ErpKgs',fld:'ERPKGS',pic:'ZZZZZ9.99'}]}");
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
      pr_default.close(14);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z9705ErpNped = "" ;
      Z9797ErpPedCl = "" ;
      Z8651ErpFPC = GXutil.nullDate() ;
      Z8514ErpFPCm = GXutil.nullDate() ;
      Z8222ErpFEP = GXutil.nullDate() ;
      Z8218ErpOc = "" ;
      Z8217ErpPCl = "" ;
      Z8162ErpNPC = "" ;
      Z7842ErpPda = "" ;
      Z7749ErpLote = "" ;
      Z7498ErpKgs = DecimalUtil.ZERO ;
      Z7490ErpMts = DecimalUtil.ZERO ;
      Z7488ErpTipo = "" ;
      Z7487ErpColNo = "" ;
      Z6613ErpColNC = "" ;
      Z6227ErpDibCl = "" ;
      Z65ArtCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A7498ErpKgs = DecimalUtil.ZERO ;
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
      A9705ErpNped = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A9797ErpPedCl = "" ;
      lblTextblock6_Jsonclick = "" ;
      A8651ErpFPC = GXutil.nullDate() ;
      lblTextblock7_Jsonclick = "" ;
      A8514ErpFPCm = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A8222ErpFEP = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A8218ErpOc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A8217ErpPCl = "" ;
      lblTextblock11_Jsonclick = "" ;
      A8162ErpNPC = "" ;
      lblTextblock12_Jsonclick = "" ;
      A7842ErpPda = "" ;
      lblTextblock13_Jsonclick = "" ;
      A7749ErpLote = "" ;
      lblTextblock14_Jsonclick = "" ;
      A7490ErpMts = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A7488ErpTipo = "" ;
      lblTextblock17_Jsonclick = "" ;
      A7487ErpColNo = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A6613ErpColNC = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A6227ErpDibCl = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock27_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
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
      Z279CliNom = "" ;
      T01FF4_A407EmprNom = new String[] {""} ;
      T01FF4_n407EmprNom = new boolean[] {false} ;
      T01FF7_A9705ErpNped = new String[] {""} ;
      T01FF7_A8652ErpLin = new short[1] ;
      T01FF7_A407EmprNom = new String[] {""} ;
      T01FF7_n407EmprNom = new boolean[] {false} ;
      T01FF7_A9797ErpPedCl = new String[] {""} ;
      T01FF7_n9797ErpPedCl = new boolean[] {false} ;
      T01FF7_A8651ErpFPC = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF7_n8651ErpFPC = new boolean[] {false} ;
      T01FF7_A8514ErpFPCm = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF7_n8514ErpFPCm = new boolean[] {false} ;
      T01FF7_A8222ErpFEP = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF7_n8222ErpFEP = new boolean[] {false} ;
      T01FF7_A8218ErpOc = new String[] {""} ;
      T01FF7_n8218ErpOc = new boolean[] {false} ;
      T01FF7_A8217ErpPCl = new String[] {""} ;
      T01FF7_n8217ErpPCl = new boolean[] {false} ;
      T01FF7_A8162ErpNPC = new String[] {""} ;
      T01FF7_n8162ErpNPC = new boolean[] {false} ;
      T01FF7_A7842ErpPda = new String[] {""} ;
      T01FF7_n7842ErpPda = new boolean[] {false} ;
      T01FF7_A7749ErpLote = new String[] {""} ;
      T01FF7_n7749ErpLote = new boolean[] {false} ;
      T01FF7_A7498ErpKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FF7_n7498ErpKgs = new boolean[] {false} ;
      T01FF7_A7490ErpMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FF7_n7490ErpMts = new boolean[] {false} ;
      T01FF7_A7489ErpPzs = new int[1] ;
      T01FF7_n7489ErpPzs = new boolean[] {false} ;
      T01FF7_A7488ErpTipo = new String[] {""} ;
      T01FF7_n7488ErpTipo = new boolean[] {false} ;
      T01FF7_A7487ErpColNo = new String[] {""} ;
      T01FF7_n7487ErpColNo = new boolean[] {false} ;
      T01FF7_A7486ErpColNu = new int[1] ;
      T01FF7_n7486ErpColNu = new boolean[] {false} ;
      T01FF7_A7437ErpTc = new byte[1] ;
      T01FF7_n7437ErpTc = new boolean[] {false} ;
      T01FF7_A6613ErpColNC = new String[] {""} ;
      T01FF7_n6613ErpColNC = new boolean[] {false} ;
      T01FF7_A6280ErpColNuC = new int[1] ;
      T01FF7_n6280ErpColNuC = new boolean[] {false} ;
      T01FF7_A6227ErpDibCl = new String[] {""} ;
      T01FF7_n6227ErpDibCl = new boolean[] {false} ;
      T01FF7_A6226ErpDibInt = new int[1] ;
      T01FF7_n6226ErpDibInt = new boolean[] {false} ;
      T01FF7_A6225ErpEst = new byte[1] ;
      T01FF7_n6225ErpEst = new boolean[] {false} ;
      T01FF7_A279CliNom = new String[] {""} ;
      T01FF7_A396EmprCod = new String[] {""} ;
      T01FF7_A252CliCod = new int[1] ;
      T01FF7_n252CliCod = new boolean[] {false} ;
      T01FF7_A65ArtCod = new String[] {""} ;
      T01FF7_n65ArtCod = new boolean[] {false} ;
      T01FF5_A279CliNom = new String[] {""} ;
      T01FF6_A396EmprCod = new String[] {""} ;
      T01FF8_A279CliNom = new String[] {""} ;
      T01FF9_A396EmprCod = new String[] {""} ;
      T01FF10_A396EmprCod = new String[] {""} ;
      T01FF10_A9705ErpNped = new String[] {""} ;
      T01FF10_A8652ErpLin = new short[1] ;
      T01FF3_A9705ErpNped = new String[] {""} ;
      T01FF3_A8652ErpLin = new short[1] ;
      T01FF3_A9797ErpPedCl = new String[] {""} ;
      T01FF3_n9797ErpPedCl = new boolean[] {false} ;
      T01FF3_A8651ErpFPC = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF3_n8651ErpFPC = new boolean[] {false} ;
      T01FF3_A8514ErpFPCm = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF3_n8514ErpFPCm = new boolean[] {false} ;
      T01FF3_A8222ErpFEP = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF3_n8222ErpFEP = new boolean[] {false} ;
      T01FF3_A8218ErpOc = new String[] {""} ;
      T01FF3_n8218ErpOc = new boolean[] {false} ;
      T01FF3_A8217ErpPCl = new String[] {""} ;
      T01FF3_n8217ErpPCl = new boolean[] {false} ;
      T01FF3_A8162ErpNPC = new String[] {""} ;
      T01FF3_n8162ErpNPC = new boolean[] {false} ;
      T01FF3_A7842ErpPda = new String[] {""} ;
      T01FF3_n7842ErpPda = new boolean[] {false} ;
      T01FF3_A7749ErpLote = new String[] {""} ;
      T01FF3_n7749ErpLote = new boolean[] {false} ;
      T01FF3_A7498ErpKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FF3_n7498ErpKgs = new boolean[] {false} ;
      T01FF3_A7490ErpMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FF3_n7490ErpMts = new boolean[] {false} ;
      T01FF3_A7489ErpPzs = new int[1] ;
      T01FF3_n7489ErpPzs = new boolean[] {false} ;
      T01FF3_A7488ErpTipo = new String[] {""} ;
      T01FF3_n7488ErpTipo = new boolean[] {false} ;
      T01FF3_A7487ErpColNo = new String[] {""} ;
      T01FF3_n7487ErpColNo = new boolean[] {false} ;
      T01FF3_A7486ErpColNu = new int[1] ;
      T01FF3_n7486ErpColNu = new boolean[] {false} ;
      T01FF3_A7437ErpTc = new byte[1] ;
      T01FF3_n7437ErpTc = new boolean[] {false} ;
      T01FF3_A6613ErpColNC = new String[] {""} ;
      T01FF3_n6613ErpColNC = new boolean[] {false} ;
      T01FF3_A6280ErpColNuC = new int[1] ;
      T01FF3_n6280ErpColNuC = new boolean[] {false} ;
      T01FF3_A6227ErpDibCl = new String[] {""} ;
      T01FF3_n6227ErpDibCl = new boolean[] {false} ;
      T01FF3_A6226ErpDibInt = new int[1] ;
      T01FF3_n6226ErpDibInt = new boolean[] {false} ;
      T01FF3_A6225ErpEst = new byte[1] ;
      T01FF3_n6225ErpEst = new boolean[] {false} ;
      T01FF3_A396EmprCod = new String[] {""} ;
      T01FF3_A252CliCod = new int[1] ;
      T01FF3_n252CliCod = new boolean[] {false} ;
      T01FF3_A65ArtCod = new String[] {""} ;
      T01FF3_n65ArtCod = new boolean[] {false} ;
      sMode1568 = "" ;
      T01FF11_A396EmprCod = new String[] {""} ;
      T01FF11_A9705ErpNped = new String[] {""} ;
      T01FF11_A8652ErpLin = new short[1] ;
      T01FF12_A396EmprCod = new String[] {""} ;
      T01FF12_A9705ErpNped = new String[] {""} ;
      T01FF12_A8652ErpLin = new short[1] ;
      T01FF2_A9705ErpNped = new String[] {""} ;
      T01FF2_A8652ErpLin = new short[1] ;
      T01FF2_A9797ErpPedCl = new String[] {""} ;
      T01FF2_n9797ErpPedCl = new boolean[] {false} ;
      T01FF2_A8651ErpFPC = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF2_n8651ErpFPC = new boolean[] {false} ;
      T01FF2_A8514ErpFPCm = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF2_n8514ErpFPCm = new boolean[] {false} ;
      T01FF2_A8222ErpFEP = new java.util.Date[] {GXutil.nullDate()} ;
      T01FF2_n8222ErpFEP = new boolean[] {false} ;
      T01FF2_A8218ErpOc = new String[] {""} ;
      T01FF2_n8218ErpOc = new boolean[] {false} ;
      T01FF2_A8217ErpPCl = new String[] {""} ;
      T01FF2_n8217ErpPCl = new boolean[] {false} ;
      T01FF2_A8162ErpNPC = new String[] {""} ;
      T01FF2_n8162ErpNPC = new boolean[] {false} ;
      T01FF2_A7842ErpPda = new String[] {""} ;
      T01FF2_n7842ErpPda = new boolean[] {false} ;
      T01FF2_A7749ErpLote = new String[] {""} ;
      T01FF2_n7749ErpLote = new boolean[] {false} ;
      T01FF2_A7498ErpKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FF2_n7498ErpKgs = new boolean[] {false} ;
      T01FF2_A7490ErpMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FF2_n7490ErpMts = new boolean[] {false} ;
      T01FF2_A7489ErpPzs = new int[1] ;
      T01FF2_n7489ErpPzs = new boolean[] {false} ;
      T01FF2_A7488ErpTipo = new String[] {""} ;
      T01FF2_n7488ErpTipo = new boolean[] {false} ;
      T01FF2_A7487ErpColNo = new String[] {""} ;
      T01FF2_n7487ErpColNo = new boolean[] {false} ;
      T01FF2_A7486ErpColNu = new int[1] ;
      T01FF2_n7486ErpColNu = new boolean[] {false} ;
      T01FF2_A7437ErpTc = new byte[1] ;
      T01FF2_n7437ErpTc = new boolean[] {false} ;
      T01FF2_A6613ErpColNC = new String[] {""} ;
      T01FF2_n6613ErpColNC = new boolean[] {false} ;
      T01FF2_A6280ErpColNuC = new int[1] ;
      T01FF2_n6280ErpColNuC = new boolean[] {false} ;
      T01FF2_A6227ErpDibCl = new String[] {""} ;
      T01FF2_n6227ErpDibCl = new boolean[] {false} ;
      T01FF2_A6226ErpDibInt = new int[1] ;
      T01FF2_n6226ErpDibInt = new boolean[] {false} ;
      T01FF2_A6225ErpEst = new byte[1] ;
      T01FF2_n6225ErpEst = new boolean[] {false} ;
      T01FF2_A396EmprCod = new String[] {""} ;
      T01FF2_A252CliCod = new int[1] ;
      T01FF2_n252CliCod = new boolean[] {false} ;
      T01FF2_A65ArtCod = new String[] {""} ;
      T01FF2_n65ArtCod = new boolean[] {false} ;
      T01FF16_A279CliNom = new String[] {""} ;
      T01FF17_A396EmprCod = new String[] {""} ;
      T01FF17_A9705ErpNped = new String[] {""} ;
      T01FF17_A8652ErpLin = new short[1] ;
      T01FF17_A6219ErpCPza = new String[] {""} ;
      T01FF18_A396EmprCod = new String[] {""} ;
      T01FF18_A9705ErpNped = new String[] {""} ;
      T01FF18_A8652ErpLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01FF19_A407EmprNom = new String[] {""} ;
      T01FF19_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9705ErpNped = "" ;
      ZZ407EmprNom = "" ;
      ZZ9797ErpPedCl = "" ;
      ZZ8651ErpFPC = GXutil.nullDate() ;
      ZZ8514ErpFPCm = GXutil.nullDate() ;
      ZZ8222ErpFEP = GXutil.nullDate() ;
      ZZ8218ErpOc = "" ;
      ZZ8217ErpPCl = "" ;
      ZZ8162ErpNPC = "" ;
      ZZ7842ErpPda = "" ;
      ZZ7749ErpLote = "" ;
      ZZ7498ErpKgs = DecimalUtil.ZERO ;
      ZZ7490ErpMts = DecimalUtil.ZERO ;
      ZZ7488ErpTipo = "" ;
      ZZ7487ErpColNo = "" ;
      ZZ6613ErpColNC = "" ;
      ZZ6227ErpDibCl = "" ;
      ZZ65ArtCod = "" ;
      ZZ279CliNom = "" ;
      T01FF20_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcpedco__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcpedco__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcpedco__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcpedco__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcpedco__default(),
         new Object[] {
             new Object[] {
            T01FF2_A9705ErpNped, T01FF2_A8652ErpLin, T01FF2_A9797ErpPedCl, T01FF2_n9797ErpPedCl, T01FF2_A8651ErpFPC, T01FF2_n8651ErpFPC, T01FF2_A8514ErpFPCm, T01FF2_n8514ErpFPCm, T01FF2_A8222ErpFEP, T01FF2_n8222ErpFEP,
            T01FF2_A8218ErpOc, T01FF2_n8218ErpOc, T01FF2_A8217ErpPCl, T01FF2_n8217ErpPCl, T01FF2_A8162ErpNPC, T01FF2_n8162ErpNPC, T01FF2_A7842ErpPda, T01FF2_n7842ErpPda, T01FF2_A7749ErpLote, T01FF2_n7749ErpLote,
            T01FF2_A7498ErpKgs, T01FF2_n7498ErpKgs, T01FF2_A7490ErpMts, T01FF2_n7490ErpMts, T01FF2_A7489ErpPzs, T01FF2_n7489ErpPzs, T01FF2_A7488ErpTipo, T01FF2_n7488ErpTipo, T01FF2_A7487ErpColNo, T01FF2_n7487ErpColNo,
            T01FF2_A7486ErpColNu, T01FF2_n7486ErpColNu, T01FF2_A7437ErpTc, T01FF2_n7437ErpTc, T01FF2_A6613ErpColNC, T01FF2_n6613ErpColNC, T01FF2_A6280ErpColNuC, T01FF2_n6280ErpColNuC, T01FF2_A6227ErpDibCl, T01FF2_n6227ErpDibCl,
            T01FF2_A6226ErpDibInt, T01FF2_n6226ErpDibInt, T01FF2_A6225ErpEst, T01FF2_n6225ErpEst, T01FF2_A396EmprCod, T01FF2_A252CliCod, T01FF2_n252CliCod, T01FF2_A65ArtCod, T01FF2_n65ArtCod
            }
            , new Object[] {
            T01FF3_A9705ErpNped, T01FF3_A8652ErpLin, T01FF3_A9797ErpPedCl, T01FF3_n9797ErpPedCl, T01FF3_A8651ErpFPC, T01FF3_n8651ErpFPC, T01FF3_A8514ErpFPCm, T01FF3_n8514ErpFPCm, T01FF3_A8222ErpFEP, T01FF3_n8222ErpFEP,
            T01FF3_A8218ErpOc, T01FF3_n8218ErpOc, T01FF3_A8217ErpPCl, T01FF3_n8217ErpPCl, T01FF3_A8162ErpNPC, T01FF3_n8162ErpNPC, T01FF3_A7842ErpPda, T01FF3_n7842ErpPda, T01FF3_A7749ErpLote, T01FF3_n7749ErpLote,
            T01FF3_A7498ErpKgs, T01FF3_n7498ErpKgs, T01FF3_A7490ErpMts, T01FF3_n7490ErpMts, T01FF3_A7489ErpPzs, T01FF3_n7489ErpPzs, T01FF3_A7488ErpTipo, T01FF3_n7488ErpTipo, T01FF3_A7487ErpColNo, T01FF3_n7487ErpColNo,
            T01FF3_A7486ErpColNu, T01FF3_n7486ErpColNu, T01FF3_A7437ErpTc, T01FF3_n7437ErpTc, T01FF3_A6613ErpColNC, T01FF3_n6613ErpColNC, T01FF3_A6280ErpColNuC, T01FF3_n6280ErpColNuC, T01FF3_A6227ErpDibCl, T01FF3_n6227ErpDibCl,
            T01FF3_A6226ErpDibInt, T01FF3_n6226ErpDibInt, T01FF3_A6225ErpEst, T01FF3_n6225ErpEst, T01FF3_A396EmprCod, T01FF3_A252CliCod, T01FF3_n252CliCod, T01FF3_A65ArtCod, T01FF3_n65ArtCod
            }
            , new Object[] {
            T01FF4_A407EmprNom, T01FF4_n407EmprNom
            }
            , new Object[] {
            T01FF5_A279CliNom
            }
            , new Object[] {
            T01FF6_A396EmprCod
            }
            , new Object[] {
            T01FF7_A9705ErpNped, T01FF7_A8652ErpLin, T01FF7_A407EmprNom, T01FF7_n407EmprNom, T01FF7_A9797ErpPedCl, T01FF7_n9797ErpPedCl, T01FF7_A8651ErpFPC, T01FF7_n8651ErpFPC, T01FF7_A8514ErpFPCm, T01FF7_n8514ErpFPCm,
            T01FF7_A8222ErpFEP, T01FF7_n8222ErpFEP, T01FF7_A8218ErpOc, T01FF7_n8218ErpOc, T01FF7_A8217ErpPCl, T01FF7_n8217ErpPCl, T01FF7_A8162ErpNPC, T01FF7_n8162ErpNPC, T01FF7_A7842ErpPda, T01FF7_n7842ErpPda,
            T01FF7_A7749ErpLote, T01FF7_n7749ErpLote, T01FF7_A7498ErpKgs, T01FF7_n7498ErpKgs, T01FF7_A7490ErpMts, T01FF7_n7490ErpMts, T01FF7_A7489ErpPzs, T01FF7_n7489ErpPzs, T01FF7_A7488ErpTipo, T01FF7_n7488ErpTipo,
            T01FF7_A7487ErpColNo, T01FF7_n7487ErpColNo, T01FF7_A7486ErpColNu, T01FF7_n7486ErpColNu, T01FF7_A7437ErpTc, T01FF7_n7437ErpTc, T01FF7_A6613ErpColNC, T01FF7_n6613ErpColNC, T01FF7_A6280ErpColNuC, T01FF7_n6280ErpColNuC,
            T01FF7_A6227ErpDibCl, T01FF7_n6227ErpDibCl, T01FF7_A6226ErpDibInt, T01FF7_n6226ErpDibInt, T01FF7_A6225ErpEst, T01FF7_n6225ErpEst, T01FF7_A279CliNom, T01FF7_A396EmprCod, T01FF7_A252CliCod, T01FF7_n252CliCod,
            T01FF7_A65ArtCod, T01FF7_n65ArtCod
            }
            , new Object[] {
            T01FF8_A279CliNom
            }
            , new Object[] {
            T01FF9_A396EmprCod
            }
            , new Object[] {
            T01FF10_A396EmprCod, T01FF10_A9705ErpNped, T01FF10_A8652ErpLin
            }
            , new Object[] {
            T01FF11_A396EmprCod, T01FF11_A9705ErpNped, T01FF11_A8652ErpLin
            }
            , new Object[] {
            T01FF12_A396EmprCod, T01FF12_A9705ErpNped, T01FF12_A8652ErpLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FF16_A279CliNom
            }
            , new Object[] {
            T01FF17_A396EmprCod, T01FF17_A9705ErpNped, T01FF17_A8652ErpLin, T01FF17_A6219ErpCPza
            }
            , new Object[] {
            T01FF18_A396EmprCod, T01FF18_A9705ErpNped, T01FF18_A8652ErpLin
            }
            , new Object[] {
            T01FF19_A407EmprNom, T01FF19_n407EmprNom
            }
            , new Object[] {
            T01FF20_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TCPEDCO" ;
   }

   private byte Z7437ErpTc ;
   private byte Z6225ErpEst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A7437ErpTc ;
   private byte A6225ErpEst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ7437ErpTc ;
   private byte ZZ6225ErpEst ;
   private short Z8652ErpLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8652ErpLin ;
   private short RcdFound1568 ;
   private short nIsDirty_1568 ;
   private short ZZ8652ErpLin ;
   private int Z7489ErpPzs ;
   private int Z7486ErpColNu ;
   private int Z6280ErpColNuC ;
   private int Z6226ErpDibInt ;
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
   private int edtErpNped_Enabled ;
   private int edtErpLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtErpPedCl_Enabled ;
   private int edtErpFPC_Enabled ;
   private int edtErpFPCm_Enabled ;
   private int edtErpFEP_Enabled ;
   private int edtErpOc_Enabled ;
   private int edtErpPCl_Enabled ;
   private int edtErpNPC_Enabled ;
   private int edtErpPda_Enabled ;
   private int edtErpLote_Enabled ;
   private int edtErpMts_Enabled ;
   private int A7489ErpPzs ;
   private int edtErpPzs_Enabled ;
   private int edtErpTipo_Enabled ;
   private int edtErpColNo_Enabled ;
   private int A7486ErpColNu ;
   private int edtErpColNu_Enabled ;
   private int edtErpColNC_Enabled ;
   private int A6280ErpColNuC ;
   private int edtErpColNuC_Enabled ;
   private int edtErpDibCl_Enabled ;
   private int A6226ErpDibInt ;
   private int edtErpDibInt_Enabled ;
   private int edtErpEst_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
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
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtErpEst_Backcolor ;
   private int edtErpDibInt_Backcolor ;
   private int edtErpDibCl_Backcolor ;
   private int edtErpColNuC_Backcolor ;
   private int edtErpColNC_Backcolor ;
   private int edtErpColNu_Backcolor ;
   private int edtErpColNo_Backcolor ;
   private int edtErpTipo_Backcolor ;
   private int edtErpPzs_Backcolor ;
   private int edtErpMts_Backcolor ;
   private int edtErpLote_Backcolor ;
   private int edtErpPda_Backcolor ;
   private int edtErpNPC_Backcolor ;
   private int edtErpPCl_Backcolor ;
   private int edtErpOc_Backcolor ;
   private int edtErpFEP_Backcolor ;
   private int edtErpFPCm_Backcolor ;
   private int edtErpFPC_Backcolor ;
   private int edtErpPedCl_Backcolor ;
   private int edtErpLin_Backcolor ;
   private int edtErpNped_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ7489ErpPzs ;
   private int ZZ7486ErpColNu ;
   private int ZZ6280ErpColNuC ;
   private int ZZ6226ErpDibInt ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z7498ErpKgs ;
   private java.math.BigDecimal Z7490ErpMts ;
   private java.math.BigDecimal A7498ErpKgs ;
   private java.math.BigDecimal A7490ErpMts ;
   private java.math.BigDecimal ZZ7498ErpKgs ;
   private java.math.BigDecimal ZZ7490ErpMts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9705ErpNped ;
   private String Z9797ErpPedCl ;
   private String Z8218ErpOc ;
   private String Z8217ErpPCl ;
   private String Z8162ErpNPC ;
   private String Z7842ErpPda ;
   private String Z7749ErpLote ;
   private String Z7488ErpTipo ;
   private String Z7487ErpColNo ;
   private String Z6613ErpColNC ;
   private String Z6227ErpDibCl ;
   private String Z65ArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtErpNped_Internalname ;
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
   private String A9705ErpNped ;
   private String edtErpNped_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtErpLin_Internalname ;
   private String edtErpLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtErpPedCl_Internalname ;
   private String A9797ErpPedCl ;
   private String edtErpPedCl_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtErpFPC_Internalname ;
   private String edtErpFPC_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtErpFPCm_Internalname ;
   private String edtErpFPCm_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtErpFEP_Internalname ;
   private String edtErpFEP_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtErpOc_Internalname ;
   private String A8218ErpOc ;
   private String edtErpOc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtErpPCl_Internalname ;
   private String A8217ErpPCl ;
   private String edtErpPCl_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtErpNPC_Internalname ;
   private String A8162ErpNPC ;
   private String edtErpNPC_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtErpPda_Internalname ;
   private String A7842ErpPda ;
   private String edtErpPda_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtErpLote_Internalname ;
   private String A7749ErpLote ;
   private String edtErpLote_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtErpMts_Internalname ;
   private String edtErpMts_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtErpPzs_Internalname ;
   private String edtErpPzs_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtErpTipo_Internalname ;
   private String A7488ErpTipo ;
   private String edtErpTipo_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtErpColNo_Internalname ;
   private String A7487ErpColNo ;
   private String edtErpColNo_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtErpColNu_Internalname ;
   private String edtErpColNu_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtErpColNC_Internalname ;
   private String A6613ErpColNC ;
   private String edtErpColNC_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtErpColNuC_Internalname ;
   private String edtErpColNuC_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtErpDibCl_Internalname ;
   private String A6227ErpDibCl ;
   private String edtErpDibCl_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtErpDibInt_Internalname ;
   private String edtErpDibInt_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtErpEst_Internalname ;
   private String edtErpEst_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
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
   private String Z279CliNom ;
   private String sMode1568 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9705ErpNped ;
   private String ZZ407EmprNom ;
   private String ZZ9797ErpPedCl ;
   private String ZZ8218ErpOc ;
   private String ZZ8217ErpPCl ;
   private String ZZ8162ErpNPC ;
   private String ZZ7842ErpPda ;
   private String ZZ7749ErpLote ;
   private String ZZ7488ErpTipo ;
   private String ZZ7487ErpColNo ;
   private String ZZ6613ErpColNC ;
   private String ZZ6227ErpDibCl ;
   private String ZZ65ArtCod ;
   private String ZZ279CliNom ;
   private java.util.Date Z8651ErpFPC ;
   private java.util.Date Z8514ErpFPCm ;
   private java.util.Date Z8222ErpFEP ;
   private java.util.Date A8651ErpFPC ;
   private java.util.Date A8514ErpFPCm ;
   private java.util.Date A8222ErpFEP ;
   private java.util.Date ZZ8651ErpFPC ;
   private java.util.Date ZZ8514ErpFPCm ;
   private java.util.Date ZZ8222ErpFEP ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean wbErr ;
   private boolean n7498ErpKgs ;
   private boolean n7437ErpTc ;
   private boolean n407EmprNom ;
   private boolean n9797ErpPedCl ;
   private boolean n8651ErpFPC ;
   private boolean n8514ErpFPCm ;
   private boolean n8222ErpFEP ;
   private boolean n8218ErpOc ;
   private boolean n8217ErpPCl ;
   private boolean n8162ErpNPC ;
   private boolean n7842ErpPda ;
   private boolean n7749ErpLote ;
   private boolean n7490ErpMts ;
   private boolean n7489ErpPzs ;
   private boolean n7488ErpTipo ;
   private boolean n7487ErpColNo ;
   private boolean n7486ErpColNu ;
   private boolean n6613ErpColNC ;
   private boolean n6280ErpColNuC ;
   private boolean n6227ErpDibCl ;
   private boolean n6226ErpDibInt ;
   private boolean n6225ErpEst ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private ICheckbox chkErpKgs ;
   private HTMLChoice cmbErpTc ;
   private IDataStoreProvider pr_default ;
   private String[] T01FF4_A407EmprNom ;
   private boolean[] T01FF4_n407EmprNom ;
   private String[] T01FF7_A9705ErpNped ;
   private short[] T01FF7_A8652ErpLin ;
   private String[] T01FF7_A407EmprNom ;
   private boolean[] T01FF7_n407EmprNom ;
   private String[] T01FF7_A9797ErpPedCl ;
   private boolean[] T01FF7_n9797ErpPedCl ;
   private java.util.Date[] T01FF7_A8651ErpFPC ;
   private boolean[] T01FF7_n8651ErpFPC ;
   private java.util.Date[] T01FF7_A8514ErpFPCm ;
   private boolean[] T01FF7_n8514ErpFPCm ;
   private java.util.Date[] T01FF7_A8222ErpFEP ;
   private boolean[] T01FF7_n8222ErpFEP ;
   private String[] T01FF7_A8218ErpOc ;
   private boolean[] T01FF7_n8218ErpOc ;
   private String[] T01FF7_A8217ErpPCl ;
   private boolean[] T01FF7_n8217ErpPCl ;
   private String[] T01FF7_A8162ErpNPC ;
   private boolean[] T01FF7_n8162ErpNPC ;
   private String[] T01FF7_A7842ErpPda ;
   private boolean[] T01FF7_n7842ErpPda ;
   private String[] T01FF7_A7749ErpLote ;
   private boolean[] T01FF7_n7749ErpLote ;
   private java.math.BigDecimal[] T01FF7_A7498ErpKgs ;
   private boolean[] T01FF7_n7498ErpKgs ;
   private java.math.BigDecimal[] T01FF7_A7490ErpMts ;
   private boolean[] T01FF7_n7490ErpMts ;
   private int[] T01FF7_A7489ErpPzs ;
   private boolean[] T01FF7_n7489ErpPzs ;
   private String[] T01FF7_A7488ErpTipo ;
   private boolean[] T01FF7_n7488ErpTipo ;
   private String[] T01FF7_A7487ErpColNo ;
   private boolean[] T01FF7_n7487ErpColNo ;
   private int[] T01FF7_A7486ErpColNu ;
   private boolean[] T01FF7_n7486ErpColNu ;
   private byte[] T01FF7_A7437ErpTc ;
   private boolean[] T01FF7_n7437ErpTc ;
   private String[] T01FF7_A6613ErpColNC ;
   private boolean[] T01FF7_n6613ErpColNC ;
   private int[] T01FF7_A6280ErpColNuC ;
   private boolean[] T01FF7_n6280ErpColNuC ;
   private String[] T01FF7_A6227ErpDibCl ;
   private boolean[] T01FF7_n6227ErpDibCl ;
   private int[] T01FF7_A6226ErpDibInt ;
   private boolean[] T01FF7_n6226ErpDibInt ;
   private byte[] T01FF7_A6225ErpEst ;
   private boolean[] T01FF7_n6225ErpEst ;
   private String[] T01FF7_A279CliNom ;
   private String[] T01FF7_A396EmprCod ;
   private int[] T01FF7_A252CliCod ;
   private boolean[] T01FF7_n252CliCod ;
   private String[] T01FF7_A65ArtCod ;
   private boolean[] T01FF7_n65ArtCod ;
   private String[] T01FF5_A279CliNom ;
   private String[] T01FF6_A396EmprCod ;
   private String[] T01FF8_A279CliNom ;
   private String[] T01FF9_A396EmprCod ;
   private String[] T01FF10_A396EmprCod ;
   private String[] T01FF10_A9705ErpNped ;
   private short[] T01FF10_A8652ErpLin ;
   private String[] T01FF3_A9705ErpNped ;
   private short[] T01FF3_A8652ErpLin ;
   private String[] T01FF3_A9797ErpPedCl ;
   private boolean[] T01FF3_n9797ErpPedCl ;
   private java.util.Date[] T01FF3_A8651ErpFPC ;
   private boolean[] T01FF3_n8651ErpFPC ;
   private java.util.Date[] T01FF3_A8514ErpFPCm ;
   private boolean[] T01FF3_n8514ErpFPCm ;
   private java.util.Date[] T01FF3_A8222ErpFEP ;
   private boolean[] T01FF3_n8222ErpFEP ;
   private String[] T01FF3_A8218ErpOc ;
   private boolean[] T01FF3_n8218ErpOc ;
   private String[] T01FF3_A8217ErpPCl ;
   private boolean[] T01FF3_n8217ErpPCl ;
   private String[] T01FF3_A8162ErpNPC ;
   private boolean[] T01FF3_n8162ErpNPC ;
   private String[] T01FF3_A7842ErpPda ;
   private boolean[] T01FF3_n7842ErpPda ;
   private String[] T01FF3_A7749ErpLote ;
   private boolean[] T01FF3_n7749ErpLote ;
   private java.math.BigDecimal[] T01FF3_A7498ErpKgs ;
   private boolean[] T01FF3_n7498ErpKgs ;
   private java.math.BigDecimal[] T01FF3_A7490ErpMts ;
   private boolean[] T01FF3_n7490ErpMts ;
   private int[] T01FF3_A7489ErpPzs ;
   private boolean[] T01FF3_n7489ErpPzs ;
   private String[] T01FF3_A7488ErpTipo ;
   private boolean[] T01FF3_n7488ErpTipo ;
   private String[] T01FF3_A7487ErpColNo ;
   private boolean[] T01FF3_n7487ErpColNo ;
   private int[] T01FF3_A7486ErpColNu ;
   private boolean[] T01FF3_n7486ErpColNu ;
   private byte[] T01FF3_A7437ErpTc ;
   private boolean[] T01FF3_n7437ErpTc ;
   private String[] T01FF3_A6613ErpColNC ;
   private boolean[] T01FF3_n6613ErpColNC ;
   private int[] T01FF3_A6280ErpColNuC ;
   private boolean[] T01FF3_n6280ErpColNuC ;
   private String[] T01FF3_A6227ErpDibCl ;
   private boolean[] T01FF3_n6227ErpDibCl ;
   private int[] T01FF3_A6226ErpDibInt ;
   private boolean[] T01FF3_n6226ErpDibInt ;
   private byte[] T01FF3_A6225ErpEst ;
   private boolean[] T01FF3_n6225ErpEst ;
   private String[] T01FF3_A396EmprCod ;
   private int[] T01FF3_A252CliCod ;
   private boolean[] T01FF3_n252CliCod ;
   private String[] T01FF3_A65ArtCod ;
   private boolean[] T01FF3_n65ArtCod ;
   private String[] T01FF11_A396EmprCod ;
   private String[] T01FF11_A9705ErpNped ;
   private short[] T01FF11_A8652ErpLin ;
   private String[] T01FF12_A396EmprCod ;
   private String[] T01FF12_A9705ErpNped ;
   private short[] T01FF12_A8652ErpLin ;
   private String[] T01FF2_A9705ErpNped ;
   private short[] T01FF2_A8652ErpLin ;
   private String[] T01FF2_A9797ErpPedCl ;
   private boolean[] T01FF2_n9797ErpPedCl ;
   private java.util.Date[] T01FF2_A8651ErpFPC ;
   private boolean[] T01FF2_n8651ErpFPC ;
   private java.util.Date[] T01FF2_A8514ErpFPCm ;
   private boolean[] T01FF2_n8514ErpFPCm ;
   private java.util.Date[] T01FF2_A8222ErpFEP ;
   private boolean[] T01FF2_n8222ErpFEP ;
   private String[] T01FF2_A8218ErpOc ;
   private boolean[] T01FF2_n8218ErpOc ;
   private String[] T01FF2_A8217ErpPCl ;
   private boolean[] T01FF2_n8217ErpPCl ;
   private String[] T01FF2_A8162ErpNPC ;
   private boolean[] T01FF2_n8162ErpNPC ;
   private String[] T01FF2_A7842ErpPda ;
   private boolean[] T01FF2_n7842ErpPda ;
   private String[] T01FF2_A7749ErpLote ;
   private boolean[] T01FF2_n7749ErpLote ;
   private java.math.BigDecimal[] T01FF2_A7498ErpKgs ;
   private boolean[] T01FF2_n7498ErpKgs ;
   private java.math.BigDecimal[] T01FF2_A7490ErpMts ;
   private boolean[] T01FF2_n7490ErpMts ;
   private int[] T01FF2_A7489ErpPzs ;
   private boolean[] T01FF2_n7489ErpPzs ;
   private String[] T01FF2_A7488ErpTipo ;
   private boolean[] T01FF2_n7488ErpTipo ;
   private String[] T01FF2_A7487ErpColNo ;
   private boolean[] T01FF2_n7487ErpColNo ;
   private int[] T01FF2_A7486ErpColNu ;
   private boolean[] T01FF2_n7486ErpColNu ;
   private byte[] T01FF2_A7437ErpTc ;
   private boolean[] T01FF2_n7437ErpTc ;
   private String[] T01FF2_A6613ErpColNC ;
   private boolean[] T01FF2_n6613ErpColNC ;
   private int[] T01FF2_A6280ErpColNuC ;
   private boolean[] T01FF2_n6280ErpColNuC ;
   private String[] T01FF2_A6227ErpDibCl ;
   private boolean[] T01FF2_n6227ErpDibCl ;
   private int[] T01FF2_A6226ErpDibInt ;
   private boolean[] T01FF2_n6226ErpDibInt ;
   private byte[] T01FF2_A6225ErpEst ;
   private boolean[] T01FF2_n6225ErpEst ;
   private String[] T01FF2_A396EmprCod ;
   private int[] T01FF2_A252CliCod ;
   private boolean[] T01FF2_n252CliCod ;
   private String[] T01FF2_A65ArtCod ;
   private boolean[] T01FF2_n65ArtCod ;
   private String[] T01FF16_A279CliNom ;
   private String[] T01FF17_A396EmprCod ;
   private String[] T01FF17_A9705ErpNped ;
   private short[] T01FF17_A8652ErpLin ;
   private String[] T01FF17_A6219ErpCPza ;
   private String[] T01FF18_A396EmprCod ;
   private String[] T01FF18_A9705ErpNped ;
   private short[] T01FF18_A8652ErpLin ;
   private String[] T01FF19_A407EmprNom ;
   private boolean[] T01FF19_n407EmprNom ;
   private String[] T01FF20_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcpedco__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcpedco__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcpedco__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcpedco__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcpedco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FF2", "SELECT ErpNped, ErpLin, ErpPedCl, ErpFPC, ErpFPCm, ErpFEP, ErpOc, ErpPCl, ErpNPC, ErpPda, ErpLote, ErpKgs, ErpMts, ErpPzs, ErpTipo, ErpColNo, ErpColNu, ErpTc, ErpColNC, ErpColNuC, ErpDibCl, ErpDibInt, ErpEst, EmprCod, CliCod, ArtCod FROM TXPCPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ?  FOR UPDATE OF ErpPedCl, ErpFPC, ErpFPCm, ErpFEP, ErpOc, ErpPCl, ErpNPC, ErpPda, ErpLote, ErpKgs, ErpMts, ErpPzs, ErpTipo, ErpColNo, ErpColNu, ErpTc, ErpColNC, ErpColNuC, ErpDibCl, ErpDibInt, ErpEst, CliCod, ArtCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF3", "SELECT ErpNped, ErpLin, ErpPedCl, ErpFPC, ErpFPCm, ErpFEP, ErpOc, ErpPCl, ErpNPC, ErpPda, ErpLote, ErpKgs, ErpMts, ErpPzs, ErpTipo, ErpColNo, ErpColNu, ErpTc, ErpColNC, ErpColNuC, ErpDibCl, ErpDibInt, ErpEst, EmprCod, CliCod, ArtCod FROM TXPCPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF6", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF7", "SELECT /*+ FIRST_ROWS(100) */ TM1.ErpNped, TM1.ErpLin, T2.EmprNom, TM1.ErpPedCl, TM1.ErpFPC, TM1.ErpFPCm, TM1.ErpFEP, TM1.ErpOc, TM1.ErpPCl, TM1.ErpNPC, TM1.ErpPda, TM1.ErpLote, TM1.ErpKgs, TM1.ErpMts, TM1.ErpPzs, TM1.ErpTipo, TM1.ErpColNo, TM1.ErpColNu, TM1.ErpTc, TM1.ErpColNC, TM1.ErpColNuC, TM1.ErpDibCl, TM1.ErpDibInt, TM1.ErpEst, T3.CliNom, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM ((TXPCPEDCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.ErpNped = ? and TM1.ErpLin = ? ORDER BY TM1.EmprCod, TM1.ErpNped, TM1.ErpLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF9", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE ( ErpNped > ? or ErpNped = ? and ErpLin > ?) and EmprCod = ? ORDER BY EmprCod, ErpNped, ErpLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FF12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE ( ErpNped < ? or ErpNped = ? and ErpLin < ?) and EmprCod = ? ORDER BY EmprCod DESC, ErpNped DESC, ErpLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FF13", "INSERT INTO TXPCPEDCO(ErpNped, ErpLin, ErpPedCl, ErpFPC, ErpFPCm, ErpFEP, ErpOc, ErpPCl, ErpNPC, ErpPda, ErpLote, ErpKgs, ErpMts, ErpPzs, ErpTipo, ErpColNo, ErpColNu, ErpTc, ErpColNC, ErpColNuC, ErpDibCl, ErpDibInt, ErpEst, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCPEDCO")
         ,new UpdateCursor("T01FF14", "UPDATE TXPCPEDCO SET ErpPedCl=?, ErpFPC=?, ErpFPCm=?, ErpFEP=?, ErpOc=?, ErpPCl=?, ErpNPC=?, ErpPda=?, ErpLote=?, ErpKgs=?, ErpMts=?, ErpPzs=?, ErpTipo=?, ErpColNo=?, ErpColNu=?, ErpTc=?, ErpColNC=?, ErpColNuC=?, ErpDibCl=?, ErpDibInt=?, ErpEst=?, CliCod=?, ArtCod=?  WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ?", GX_NOMASK, "TXPCPEDCO")
         ,new UpdateCursor("T01FF15", "DELETE FROM TXPCPEDCO  WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ?", GX_NOMASK, "TXPCPEDCO")
         ,new ForEachCursor("T01FF16", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF17", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin, ErpCPza FROM TXPLPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FF18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? ORDER BY EmprCod, ErpNped, ErpLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FF20", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 16);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((byte[]) buf[42])[0] = rslt.getByte(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 3);
               ((int[]) buf[45])[0] = rslt.getInt(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 16);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 16);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((byte[]) buf[42])[0] = rslt.getByte(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 3);
               ((int[]) buf[45])[0] = rslt.getInt(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 16);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 13);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 13);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 30);
               ((String[]) buf[47])[0] = rslt.getString(26, 3);
               ((int[]) buf[48])[0] = rslt.getInt(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 16);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
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
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 20);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 20);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[29], 13);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[35], 13);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[39], 16);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[41]).intValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[43]).byteValue());
               }
               stmt.setString(24, (String)parms[44], 3);
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[46]).intValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[48], 16);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 20);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
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
                  stmt.setString(14, (String)parms[27], 13);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
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
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 13);
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
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 16);
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
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[43]).intValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 16);
               }
               stmt.setString(24, (String)parms[46], 3);
               stmt.setString(25, (String)parms[47], 20);
               stmt.setShort(26, ((Number) parms[48]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
      }
   }

}

