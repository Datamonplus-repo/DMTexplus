package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedcli_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Pedidos Clientes", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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
      nRC_GXsfl_155 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_155"))) ;
      nGXsfl_155_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_155_idx"))) ;
      sGXsfl_155_idx = httpContext.GetPar( "sGXsfl_155_idx") ;
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
      nRC_GXsfl_164 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_164"))) ;
      nGXsfl_164_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_164_idx"))) ;
      sGXsfl_164_idx = httpContext.GetPar( "sGXsfl_164_idx") ;
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

   public tpedcli_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpedcli_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedcli_impl.class ));
   }

   public tpedcli_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPEDCLi.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliPed_Internalname, GXutil.rtrim( A12816PEDCliPed), GXutil.rtrim( localUtil.format( A12816PEDCliPed, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliPed_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliPed_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPEDCliFPed_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliFPed_Internalname, localUtil.format(A12817PEDCliFPed, "99/99/99"), localUtil.format( A12817PEDCliFPed, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliFPed_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliFPed_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPEDCliFPed_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPEDCliFPed_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDCLi.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha Compromiso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPEDCliFcom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliFcom_Internalname, localUtil.format(A12818PEDCliFcom, "99/99/99"), localUtil.format( A12818PEDCliFcom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliFcom_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliFcom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPEDCliFcom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPEDCliFcom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDCLi.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Articulo Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliArt_Internalname, GXutil.rtrim( A12819PEDCliArt), GXutil.rtrim( localUtil.format( A12819PEDCliArt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliArt_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliArt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Empesa o Referencia Tela en crudo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliEmp_Internalname, GXutil.rtrim( A12820PEDCliEmp), GXutil.rtrim( localUtil.format( A12820PEDCliEmp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliEmp_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliEmp_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliCoNm_Internalname, GXutil.rtrim( A12822PEDCliCoNm), GXutil.rtrim( localUtil.format( A12822PEDCliCoNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliCoNm_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliCoNm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliCoNu_Internalname, GXutil.ltrim( localUtil.ntoc( A12823PEDCliCoNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliCoNu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12823PEDCliCoNu), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12823PEDCliCoNu), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliCoNu_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliCoNu_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A12824PEDCliAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12824PEDCliAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12824PEDCliAnc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliAnc_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliAnc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Rendimiento", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliRdto_Internalname, GXutil.ltrim( localUtil.ntoc( A12825PEDCliRdto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliRdto_Enabled!=0) ? localUtil.format( A12825PEDCliRdto, "ZZ9.99") : localUtil.format( A12825PEDCliRdto, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliRdto_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliRdto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Gramaje", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A12826PEDCliGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12826PEDCliGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12826PEDCliGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliGrm2_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPEDCliObs_Internalname, A12827PEDCliObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", (short)(0), 1, edtPEDCliObs_Enabled, 0, 80, "chr", 7, "row", (byte)(0), StyleString, ClassString, "", "", "540", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Estado Pedido", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliEst_Internalname, GXutil.ltrim( localUtil.ntoc( A12832PEDCliEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12832PEDCliEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A12832PEDCliEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliEst_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "N disposicion Interna", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliID_Internalname, GXutil.ltrim( localUtil.ntoc( A12815PEDCliID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12815PEDCliID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12815PEDCliID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliID_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliID_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Kilos Pedidos", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A12833PEDCliKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliKgs_Enabled!=0) ? localUtil.format( A12833PEDCliKgs, "ZZZZZ9.99") : localUtil.format( A12833PEDCliKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliKgs_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Metros Pedidos", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliMts_Internalname, GXutil.ltrim( localUtil.ntoc( A12834PEDCliMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliMts_Enabled!=0) ? localUtil.format( A12834PEDCliMts, "ZZZZZ9.99") : localUtil.format( A12834PEDCliMts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliMts_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Piezas Pedidos", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A12836PEDCliPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCliPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12836PEDCliPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12836PEDCliPzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliPzs_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Articulo Txp", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCliArtA_Internalname, GXutil.rtrim( A12835PEDCliArtA), GXutil.rtrim( localUtil.format( A12835PEDCliArtA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCliArtA_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCliArtA_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ultima linea Observaciones", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCLiObsU_Internalname, GXutil.ltrim( localUtil.ntoc( A12837PEDCLiObsU, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCLiObsU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12837PEDCLiObsU), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12837PEDCLiObsU), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCLiObsU_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCLiObsU_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Partida Trama", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCLiPTra_Internalname, GXutil.rtrim( A12852PEDCLiPTra), GXutil.rtrim( localUtil.format( A12852PEDCLiPTra, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCLiPTra_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCLiPTra_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Porcion", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCLiPorc_Internalname, GXutil.rtrim( A12853PEDCLiPorc), GXutil.rtrim( localUtil.format( A12853PEDCLiPorc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCLiPorc_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCLiPorc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Numero OF", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCLiOF_Internalname, GXutil.rtrim( A12854PEDCLiOF), GXutil.rtrim( localUtil.format( A12854PEDCLiOF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCLiOF_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCLiOF_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Numero Albaran", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCLiNAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A12855PEDCLiNAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDCLiNAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12855PEDCLiNAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12855PEDCLiNAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCLiNAlb_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCLiNAlb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Proceso Cliente", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDCLiProc_Internalname, GXutil.rtrim( A12856PEDCLiProc), GXutil.rtrim( localUtil.format( A12856PEDCLiProc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDCLiProc_Jsonclick, 0, "", "", "", "", "", 1, edtPEDCLiProc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDCLi.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol155( ) ;
      nGXsfl_155_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1763 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1763 = (short)(1) ;
            scanStart1LH1763( ) ;
            while ( RcdFound1763 != 0 )
            {
               init_level_properties1763( ) ;
               getByPrimaryKey1LH1763( ) ;
               addRow1LH1763( ) ;
               scanNext1LH1763( ) ;
            }
            scanEnd1LH1763( ) ;
            nBlankRcdCount1763 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1LH1763( ) ;
         standaloneModal1LH1763( ) ;
         sMode1763 = Gx_mode ;
         while ( nGXsfl_155_idx < nRC_GXsfl_155 )
         {
            bGXsfl_155_Refreshing = true ;
            readRow1LH1763( ) ;
            edtavnRcdDeleted_1763_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1763_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1763_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1763_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            edtPEDCliNpz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLINPZ_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEDCliNpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliNpz_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            edtPEDCliLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLILOC_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEDCliLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliLoc_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            edtPEDCliKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLIKG_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEDCliKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliKg_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            edtPEDCliMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLIMT_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEDCliMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliMt_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            if ( ( nRcdExists_1763 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LH1763( ) ;
            }
            sendRow1LH1763( ) ;
            bGXsfl_155_Refreshing = false ;
         }
         Gx_mode = sMode1763 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1763 = (short)(5) ;
         nRcdExists_1763 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LH1763( ) ;
            while ( RcdFound1763 != 0 )
            {
               sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1551763( ) ;
               init_level_properties1763( ) ;
               standaloneNotModal1LH1763( ) ;
               getByPrimaryKey1LH1763( ) ;
               standaloneModal1LH1763( ) ;
               addRow1LH1763( ) ;
               scanNext1LH1763( ) ;
            }
            scanEnd1LH1763( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1763 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1551763( ) ;
      initAll1LH1763( ) ;
      init_level_properties1763( ) ;
      nRcdExists_1763 = (short)(0) ;
      nIsMod_1763 = (short)(0) ;
      nRcdDeleted_1763 = (short)(0) ;
      nBlankRcdCount1763 = (short)(nBlankRcdUsr1763+nBlankRcdCount1763) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1763 > 0 )
      {
         standaloneNotModal1LH1763( ) ;
         standaloneModal1LH1763( ) ;
         addRow1LH1763( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPEDCliNpz_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1763 = (short)(nBlankRcdCount1763-1) ;
      }
      Gx_mode = sMode1763 ;
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
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol164( ) ;
      nGXsfl_164_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1764 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1764 = (short)(1) ;
            scanStart1LH1764( ) ;
            while ( RcdFound1764 != 0 )
            {
               init_level_properties1764( ) ;
               getByPrimaryKey1LH1764( ) ;
               addRow1LH1764( ) ;
               scanNext1LH1764( ) ;
            }
            scanEnd1LH1764( ) ;
            nBlankRcdCount1764 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1LH1764( ) ;
         standaloneModal1LH1764( ) ;
         sMode1764 = Gx_mode ;
         while ( nGXsfl_164_idx < nRC_GXsfl_164 )
         {
            bGXsfl_164_Refreshing = true ;
            readRow1LH1764( ) ;
            edtavnRcdDeleted_1764_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1764_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1764_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1764_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            edtPEDCliObsL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLIOBSL_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEDCliObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliObsL_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            edtPEDCLiObsT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLIOBST_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEDCLiObsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCLiObsT_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            if ( ( nRcdExists_1764 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LH1764( ) ;
            }
            sendRow1LH1764( ) ;
            bGXsfl_164_Refreshing = false ;
         }
         Gx_mode = sMode1764 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1764 = (short)(5) ;
         nRcdExists_1764 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LH1764( ) ;
            while ( RcdFound1764 != 0 )
            {
               sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1641764( ) ;
               init_level_properties1764( ) ;
               standaloneNotModal1LH1764( ) ;
               getByPrimaryKey1LH1764( ) ;
               standaloneModal1LH1764( ) ;
               addRow1LH1764( ) ;
               scanNext1LH1764( ) ;
            }
            scanEnd1LH1764( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1764 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1641764( ) ;
      initAll1LH1764( ) ;
      init_level_properties1764( ) ;
      nRcdExists_1764 = (short)(0) ;
      nIsMod_1764 = (short)(0) ;
      nRcdDeleted_1764 = (short)(0) ;
      nBlankRcdCount1764 = (short)(nBlankRcdUsr1764+nBlankRcdCount1764) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1764 > 0 )
      {
         standaloneNotModal1LH1764( ) ;
         standaloneModal1LH1764( ) ;
         addRow1LH1764( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPEDCliObsL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1764 = (short)(nBlankRcdCount1764-1) ;
      }
      Gx_mode = sMode1764 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container, subGrid2_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDCLi.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPEDCLi.htm");
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
      e111LH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12816PEDCliPed = httpContext.cgiGet( "Z12816PEDCliPed") ;
            Z12817PEDCliFPed = localUtil.ctod( httpContext.cgiGet( "Z12817PEDCliFPed"), 0) ;
            Z12818PEDCliFcom = localUtil.ctod( httpContext.cgiGet( "Z12818PEDCliFcom"), 0) ;
            Z12819PEDCliArt = httpContext.cgiGet( "Z12819PEDCliArt") ;
            Z12820PEDCliEmp = httpContext.cgiGet( "Z12820PEDCliEmp") ;
            Z12822PEDCliCoNm = httpContext.cgiGet( "Z12822PEDCliCoNm") ;
            Z12823PEDCliCoNu = (int)(localUtil.ctol( httpContext.cgiGet( "Z12823PEDCliCoNu"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12824PEDCliAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z12824PEDCliAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12825PEDCliRdto = localUtil.ctond( httpContext.cgiGet( "Z12825PEDCliRdto")) ;
            Z12826PEDCliGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12826PEDCliGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12827PEDCliObs = httpContext.cgiGet( "Z12827PEDCliObs") ;
            Z12832PEDCliEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12832PEDCliEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12815PEDCliID = (int)(localUtil.ctol( httpContext.cgiGet( "Z12815PEDCliID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12833PEDCliKgs = localUtil.ctond( httpContext.cgiGet( "Z12833PEDCliKgs")) ;
            Z12834PEDCliMts = localUtil.ctond( httpContext.cgiGet( "Z12834PEDCliMts")) ;
            Z12836PEDCliPzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z12836PEDCliPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12835PEDCliArtA = httpContext.cgiGet( "Z12835PEDCliArtA") ;
            Z12837PEDCLiObsU = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12837PEDCLiObsU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12852PEDCLiPTra = httpContext.cgiGet( "Z12852PEDCLiPTra") ;
            Z12853PEDCLiPorc = httpContext.cgiGet( "Z12853PEDCLiPorc") ;
            Z12854PEDCLiOF = httpContext.cgiGet( "Z12854PEDCLiOF") ;
            Z12855PEDCLiNAlb = (int)(localUtil.ctol( httpContext.cgiGet( "Z12855PEDCLiNAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12856PEDCLiProc = httpContext.cgiGet( "Z12856PEDCLiProc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_155 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_155"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_164 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_164"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A12816PEDCliPed = httpContext.cgiGet( edtPEDCliPed_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
            if ( localUtil.vcdate( httpContext.cgiGet( edtPEDCliFPed_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDCLIFPED");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliFPed_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12817PEDCliFPed = GXutil.nullDate() ;
               n12817PEDCliFPed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12817PEDCliFPed", localUtil.format(A12817PEDCliFPed, "99/99/99"));
            }
            else
            {
               A12817PEDCliFPed = localUtil.ctod( httpContext.cgiGet( edtPEDCliFPed_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n12817PEDCliFPed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12817PEDCliFPed", localUtil.format(A12817PEDCliFPed, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPEDCliFcom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDCLIFCOM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliFcom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12818PEDCliFcom = GXutil.nullDate() ;
               n12818PEDCliFcom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12818PEDCliFcom", localUtil.format(A12818PEDCliFcom, "99/99/99"));
            }
            else
            {
               A12818PEDCliFcom = localUtil.ctod( httpContext.cgiGet( edtPEDCliFcom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n12818PEDCliFcom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12818PEDCliFcom", localUtil.format(A12818PEDCliFcom, "99/99/99"));
            }
            A12819PEDCliArt = httpContext.cgiGet( edtPEDCliArt_Internalname) ;
            n12819PEDCliArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12819PEDCliArt", A12819PEDCliArt);
            A12820PEDCliEmp = httpContext.cgiGet( edtPEDCliEmp_Internalname) ;
            n12820PEDCliEmp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12820PEDCliEmp", A12820PEDCliEmp);
            A12822PEDCliCoNm = httpContext.cgiGet( edtPEDCliCoNm_Internalname) ;
            n12822PEDCliCoNm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12822PEDCliCoNm", A12822PEDCliCoNm);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliCoNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliCoNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLICONU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliCoNu_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12823PEDCliCoNu = 0 ;
               n12823PEDCliCoNu = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12823PEDCliCoNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12823PEDCliCoNu), 6, 0));
            }
            else
            {
               A12823PEDCliCoNu = (int)(localUtil.ctol( httpContext.cgiGet( edtPEDCliCoNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12823PEDCliCoNu = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12823PEDCliCoNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12823PEDCliCoNu), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12824PEDCliAnc = (short)(0) ;
               n12824PEDCliAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12824PEDCliAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12824PEDCliAnc), 3, 0));
            }
            else
            {
               A12824PEDCliAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtPEDCliAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12824PEDCliAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12824PEDCliAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12824PEDCliAnc), 3, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEDCliRdto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEDCliRdto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIRDTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliRdto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12825PEDCliRdto = DecimalUtil.ZERO ;
               n12825PEDCliRdto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12825PEDCliRdto", GXutil.ltrimstr( A12825PEDCliRdto, 6, 2));
            }
            else
            {
               A12825PEDCliRdto = localUtil.ctond( httpContext.cgiGet( edtPEDCliRdto_Internalname)) ;
               n12825PEDCliRdto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12825PEDCliRdto", GXutil.ltrimstr( A12825PEDCliRdto, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIGRM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliGrm2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12826PEDCliGrm2 = (short)(0) ;
               n12826PEDCliGrm2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12826PEDCliGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12826PEDCliGrm2), 4, 0));
            }
            else
            {
               A12826PEDCliGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtPEDCliGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12826PEDCliGrm2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12826PEDCliGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12826PEDCliGrm2), 4, 0));
            }
            A12827PEDCliObs = httpContext.cgiGet( edtPEDCliObs_Internalname) ;
            n12827PEDCliObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12827PEDCliObs", A12827PEDCliObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12832PEDCliEst = (byte)(0) ;
               n12832PEDCliEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12832PEDCliEst", GXutil.str( A12832PEDCliEst, 1, 0));
            }
            else
            {
               A12832PEDCliEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtPEDCliEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12832PEDCliEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12832PEDCliEst", GXutil.str( A12832PEDCliEst, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12815PEDCliID = 0 ;
               n12815PEDCliID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12815PEDCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12815PEDCliID), 8, 0));
            }
            else
            {
               A12815PEDCliID = (int)(localUtil.ctol( httpContext.cgiGet( edtPEDCliID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12815PEDCliID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12815PEDCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12815PEDCliID), 8, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEDCliKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEDCliKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIKGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12833PEDCliKgs = DecimalUtil.ZERO ;
               n12833PEDCliKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12833PEDCliKgs", GXutil.ltrimstr( A12833PEDCliKgs, 9, 2));
            }
            else
            {
               A12833PEDCliKgs = localUtil.ctond( httpContext.cgiGet( edtPEDCliKgs_Internalname)) ;
               n12833PEDCliKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12833PEDCliKgs", GXutil.ltrimstr( A12833PEDCliKgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEDCliMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEDCliMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIMTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliMts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12834PEDCliMts = DecimalUtil.ZERO ;
               n12834PEDCliMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12834PEDCliMts", GXutil.ltrimstr( A12834PEDCliMts, 9, 2));
            }
            else
            {
               A12834PEDCliMts = localUtil.ctond( httpContext.cgiGet( edtPEDCliMts_Internalname)) ;
               n12834PEDCliMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12834PEDCliMts", GXutil.ltrimstr( A12834PEDCliMts, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIPZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCliPzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12836PEDCliPzs = 0 ;
               n12836PEDCliPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12836PEDCliPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12836PEDCliPzs), 6, 0));
            }
            else
            {
               A12836PEDCliPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtPEDCliPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12836PEDCliPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12836PEDCliPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12836PEDCliPzs), 6, 0));
            }
            A12835PEDCliArtA = httpContext.cgiGet( edtPEDCliArtA_Internalname) ;
            n12835PEDCliArtA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12835PEDCliArtA", A12835PEDCliArtA);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCLiObsU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCLiObsU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLIOBSU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCLiObsU_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12837PEDCLiObsU = (byte)(0) ;
               n12837PEDCLiObsU = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12837PEDCLiObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12837PEDCLiObsU), 2, 0));
            }
            else
            {
               A12837PEDCLiObsU = (byte)(localUtil.ctol( httpContext.cgiGet( edtPEDCLiObsU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12837PEDCLiObsU = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12837PEDCLiObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12837PEDCLiObsU), 2, 0));
            }
            A12852PEDCLiPTra = httpContext.cgiGet( edtPEDCLiPTra_Internalname) ;
            n12852PEDCLiPTra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12852PEDCLiPTra", A12852PEDCLiPTra);
            A12853PEDCLiPorc = httpContext.cgiGet( edtPEDCLiPorc_Internalname) ;
            n12853PEDCLiPorc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12853PEDCLiPorc", A12853PEDCLiPorc);
            A12854PEDCLiOF = httpContext.cgiGet( edtPEDCLiOF_Internalname) ;
            n12854PEDCLiOF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12854PEDCLiOF", A12854PEDCLiOF);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCLiNAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCLiNAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCLINALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDCLiNAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12855PEDCLiNAlb = 0 ;
               n12855PEDCLiNAlb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12855PEDCLiNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12855PEDCLiNAlb), 8, 0));
            }
            else
            {
               A12855PEDCLiNAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtPEDCLiNAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12855PEDCLiNAlb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12855PEDCLiNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12855PEDCLiNAlb), 8, 0));
            }
            A12856PEDCLiProc = httpContext.cgiGet( edtPEDCLiProc_Internalname) ;
            n12856PEDCLiProc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12856PEDCLiProc", A12856PEDCLiProc);
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A12816PEDCliPed = httpContext.GetPar( "PEDCliPed") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
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
                        e111LH2 ();
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
            initAll1LH1762( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1763_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1763_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1764_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1764_Enabled), 5, 0), !bGXsfl_164_Refreshing);
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
      disableAttributes1LH1762( ) ;
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

   public void confirm_1LH0( )
   {
      beforeValidate1LH1762( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LH1762( ) ;
         }
         else
         {
            checkExtendedTable1LH1762( ) ;
            if ( AnyError == 0 )
            {
               zm1LH1762( 2) ;
               zm1LH1762( 3) ;
            }
            closeExtendedTableCursors1LH1762( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1762 = Gx_mode ;
         confirm_1LH1763( ) ;
         if ( AnyError == 0 )
         {
            confirm_1LH1764( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode1762 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1762 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1LH0( ) ;
      }
   }

   public void confirm_1LH1764( )
   {
      nGXsfl_164_idx = 0 ;
      while ( nGXsfl_164_idx < nRC_GXsfl_164 )
      {
         readRow1LH1764( ) ;
         if ( ( nRcdExists_1764 != 0 ) || ( nIsMod_1764 != 0 ) )
         {
            getKey1LH1764( ) ;
            if ( ( nRcdExists_1764 == 0 ) && ( nRcdDeleted_1764 == 0 ) )
            {
               if ( RcdFound1764 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LH1764( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LH1764( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1LH1764( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PEDCLIOBSL_" + sGXsfl_164_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPEDCliObsL_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1764 != 0 )
               {
                  if ( nRcdDeleted_1764 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LH1764( ) ;
                     load1LH1764( ) ;
                     beforeValidate1LH1764( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LH1764( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1764 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LH1764( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LH1764( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1LH1764( ) ;
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
                  if ( nRcdDeleted_1764 == 0 )
                  {
                     GXCCtl = "PEDCLIOBSL_" + sGXsfl_164_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPEDCliObsL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1764_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEDCliObsL_Internalname, GXutil.ltrim( localUtil.ntoc( A12838PEDCliObsL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEDCLiObsT_Internalname, GXutil.rtrim( A12839PEDCLiObsT)) ;
         httpContext.changePostValue( "ZT_"+"Z12838PEDCliObsL_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( Z12838PEDCliObsL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12839PEDCLiObsT_"+sGXsfl_164_idx, GXutil.rtrim( Z12839PEDCLiObsT)) ;
         httpContext.changePostValue( "nRcdDeleted_1764_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1764_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1764_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1764 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1764_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1764_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLIOBSL_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliObsL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLIOBST_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCLiObsT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1LH1763( )
   {
      nGXsfl_155_idx = 0 ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         readRow1LH1763( ) ;
         if ( ( nRcdExists_1763 != 0 ) || ( nIsMod_1763 != 0 ) )
         {
            getKey1LH1763( ) ;
            if ( ( nRcdExists_1763 == 0 ) && ( nRcdDeleted_1763 == 0 ) )
            {
               if ( RcdFound1763 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LH1763( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LH1763( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1LH1763( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PEDCLINPZ_" + sGXsfl_155_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPEDCliNpz_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1763 != 0 )
               {
                  if ( nRcdDeleted_1763 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LH1763( ) ;
                     load1LH1763( ) ;
                     beforeValidate1LH1763( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LH1763( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1763 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LH1763( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LH1763( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1LH1763( ) ;
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
                  if ( nRcdDeleted_1763 == 0 )
                  {
                     GXCCtl = "PEDCLINPZ_" + sGXsfl_155_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPEDCliNpz_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1763_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEDCliNpz_Internalname, GXutil.rtrim( A12828PEDCliNpz)) ;
         httpContext.changePostValue( edtPEDCliLoc_Internalname, GXutil.rtrim( A12829PEDCliLoc)) ;
         httpContext.changePostValue( edtPEDCliKg_Internalname, GXutil.ltrim( localUtil.ntoc( A12830PEDCliKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEDCliMt_Internalname, GXutil.ltrim( localUtil.ntoc( A12831PEDCliMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12828PEDCliNpz_"+sGXsfl_155_idx, GXutil.rtrim( Z12828PEDCliNpz)) ;
         httpContext.changePostValue( "ZT_"+"Z12829PEDCliLoc_"+sGXsfl_155_idx, GXutil.rtrim( Z12829PEDCliLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z12830PEDCliKg_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( Z12830PEDCliKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12831PEDCliMt_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( Z12831PEDCliMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1763_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1763_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1763_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1763 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1763_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1763_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLINPZ_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliNpz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLILOC_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLIKG_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLIMT_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LH0( )
   {
   }

   public void e111LH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpedcli_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tpedcli_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpedcli_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpedcli_impl.this.A396EmprCod = GXv_char2[0] ;
      tpedcli_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpedcli_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1LH1762( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12817PEDCliFPed = T01LH7_A12817PEDCliFPed[0] ;
            Z12818PEDCliFcom = T01LH7_A12818PEDCliFcom[0] ;
            Z12819PEDCliArt = T01LH7_A12819PEDCliArt[0] ;
            Z12820PEDCliEmp = T01LH7_A12820PEDCliEmp[0] ;
            Z12822PEDCliCoNm = T01LH7_A12822PEDCliCoNm[0] ;
            Z12823PEDCliCoNu = T01LH7_A12823PEDCliCoNu[0] ;
            Z12824PEDCliAnc = T01LH7_A12824PEDCliAnc[0] ;
            Z12825PEDCliRdto = T01LH7_A12825PEDCliRdto[0] ;
            Z12826PEDCliGrm2 = T01LH7_A12826PEDCliGrm2[0] ;
            Z12827PEDCliObs = T01LH7_A12827PEDCliObs[0] ;
            Z12832PEDCliEst = T01LH7_A12832PEDCliEst[0] ;
            Z12815PEDCliID = T01LH7_A12815PEDCliID[0] ;
            Z12833PEDCliKgs = T01LH7_A12833PEDCliKgs[0] ;
            Z12834PEDCliMts = T01LH7_A12834PEDCliMts[0] ;
            Z12836PEDCliPzs = T01LH7_A12836PEDCliPzs[0] ;
            Z12835PEDCliArtA = T01LH7_A12835PEDCliArtA[0] ;
            Z12837PEDCLiObsU = T01LH7_A12837PEDCLiObsU[0] ;
            Z12852PEDCLiPTra = T01LH7_A12852PEDCLiPTra[0] ;
            Z12853PEDCLiPorc = T01LH7_A12853PEDCLiPorc[0] ;
            Z12854PEDCLiOF = T01LH7_A12854PEDCLiOF[0] ;
            Z12855PEDCLiNAlb = T01LH7_A12855PEDCLiNAlb[0] ;
            Z12856PEDCLiProc = T01LH7_A12856PEDCLiProc[0] ;
         }
         else
         {
            Z12817PEDCliFPed = A12817PEDCliFPed ;
            Z12818PEDCliFcom = A12818PEDCliFcom ;
            Z12819PEDCliArt = A12819PEDCliArt ;
            Z12820PEDCliEmp = A12820PEDCliEmp ;
            Z12822PEDCliCoNm = A12822PEDCliCoNm ;
            Z12823PEDCliCoNu = A12823PEDCliCoNu ;
            Z12824PEDCliAnc = A12824PEDCliAnc ;
            Z12825PEDCliRdto = A12825PEDCliRdto ;
            Z12826PEDCliGrm2 = A12826PEDCliGrm2 ;
            Z12827PEDCliObs = A12827PEDCliObs ;
            Z12832PEDCliEst = A12832PEDCliEst ;
            Z12815PEDCliID = A12815PEDCliID ;
            Z12833PEDCliKgs = A12833PEDCliKgs ;
            Z12834PEDCliMts = A12834PEDCliMts ;
            Z12836PEDCliPzs = A12836PEDCliPzs ;
            Z12835PEDCliArtA = A12835PEDCliArtA ;
            Z12837PEDCLiObsU = A12837PEDCLiObsU ;
            Z12852PEDCLiPTra = A12852PEDCLiPTra ;
            Z12853PEDCLiPorc = A12853PEDCLiPorc ;
            Z12854PEDCLiOF = A12854PEDCLiOF ;
            Z12855PEDCLiNAlb = A12855PEDCLiNAlb ;
            Z12856PEDCLiProc = A12856PEDCLiProc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12816PEDCliPed = A12816PEDCliPed ;
         Z12817PEDCliFPed = A12817PEDCliFPed ;
         Z12818PEDCliFcom = A12818PEDCliFcom ;
         Z12819PEDCliArt = A12819PEDCliArt ;
         Z12820PEDCliEmp = A12820PEDCliEmp ;
         Z12822PEDCliCoNm = A12822PEDCliCoNm ;
         Z12823PEDCliCoNu = A12823PEDCliCoNu ;
         Z12824PEDCliAnc = A12824PEDCliAnc ;
         Z12825PEDCliRdto = A12825PEDCliRdto ;
         Z12826PEDCliGrm2 = A12826PEDCliGrm2 ;
         Z12827PEDCliObs = A12827PEDCliObs ;
         Z12832PEDCliEst = A12832PEDCliEst ;
         Z12815PEDCliID = A12815PEDCliID ;
         Z12833PEDCliKgs = A12833PEDCliKgs ;
         Z12834PEDCliMts = A12834PEDCliMts ;
         Z12836PEDCliPzs = A12836PEDCliPzs ;
         Z12835PEDCliArtA = A12835PEDCliArtA ;
         Z12837PEDCLiObsU = A12837PEDCLiObsU ;
         Z12852PEDCLiPTra = A12852PEDCLiPTra ;
         Z12853PEDCLiPorc = A12853PEDCLiPorc ;
         Z12854PEDCLiOF = A12854PEDCLiOF ;
         Z12855PEDCLiNAlb = A12855PEDCLiNAlb ;
         Z12856PEDCLiProc = A12856PEDCLiProc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TPEDCLi" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01LH8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LH8_A407EmprNom[0] ;
      n407EmprNom = T01LH8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
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

   public void load1LH1762( )
   {
      /* Using cursor T01LH10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1762 = (short)(1) ;
         A407EmprNom = T01LH10_A407EmprNom[0] ;
         n407EmprNom = T01LH10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01LH10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A12817PEDCliFPed = T01LH10_A12817PEDCliFPed[0] ;
         n12817PEDCliFPed = T01LH10_n12817PEDCliFPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12817PEDCliFPed", localUtil.format(A12817PEDCliFPed, "99/99/99"));
         A12818PEDCliFcom = T01LH10_A12818PEDCliFcom[0] ;
         n12818PEDCliFcom = T01LH10_n12818PEDCliFcom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12818PEDCliFcom", localUtil.format(A12818PEDCliFcom, "99/99/99"));
         A12819PEDCliArt = T01LH10_A12819PEDCliArt[0] ;
         n12819PEDCliArt = T01LH10_n12819PEDCliArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12819PEDCliArt", A12819PEDCliArt);
         A12820PEDCliEmp = T01LH10_A12820PEDCliEmp[0] ;
         n12820PEDCliEmp = T01LH10_n12820PEDCliEmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12820PEDCliEmp", A12820PEDCliEmp);
         A12822PEDCliCoNm = T01LH10_A12822PEDCliCoNm[0] ;
         n12822PEDCliCoNm = T01LH10_n12822PEDCliCoNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12822PEDCliCoNm", A12822PEDCliCoNm);
         A12823PEDCliCoNu = T01LH10_A12823PEDCliCoNu[0] ;
         n12823PEDCliCoNu = T01LH10_n12823PEDCliCoNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12823PEDCliCoNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12823PEDCliCoNu), 6, 0));
         A12824PEDCliAnc = T01LH10_A12824PEDCliAnc[0] ;
         n12824PEDCliAnc = T01LH10_n12824PEDCliAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12824PEDCliAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12824PEDCliAnc), 3, 0));
         A12825PEDCliRdto = T01LH10_A12825PEDCliRdto[0] ;
         n12825PEDCliRdto = T01LH10_n12825PEDCliRdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12825PEDCliRdto", GXutil.ltrimstr( A12825PEDCliRdto, 6, 2));
         A12826PEDCliGrm2 = T01LH10_A12826PEDCliGrm2[0] ;
         n12826PEDCliGrm2 = T01LH10_n12826PEDCliGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12826PEDCliGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12826PEDCliGrm2), 4, 0));
         A12827PEDCliObs = T01LH10_A12827PEDCliObs[0] ;
         n12827PEDCliObs = T01LH10_n12827PEDCliObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12827PEDCliObs", A12827PEDCliObs);
         A12832PEDCliEst = T01LH10_A12832PEDCliEst[0] ;
         n12832PEDCliEst = T01LH10_n12832PEDCliEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12832PEDCliEst", GXutil.str( A12832PEDCliEst, 1, 0));
         A12815PEDCliID = T01LH10_A12815PEDCliID[0] ;
         n12815PEDCliID = T01LH10_n12815PEDCliID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12815PEDCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12815PEDCliID), 8, 0));
         A12833PEDCliKgs = T01LH10_A12833PEDCliKgs[0] ;
         n12833PEDCliKgs = T01LH10_n12833PEDCliKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12833PEDCliKgs", GXutil.ltrimstr( A12833PEDCliKgs, 9, 2));
         A12834PEDCliMts = T01LH10_A12834PEDCliMts[0] ;
         n12834PEDCliMts = T01LH10_n12834PEDCliMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12834PEDCliMts", GXutil.ltrimstr( A12834PEDCliMts, 9, 2));
         A12836PEDCliPzs = T01LH10_A12836PEDCliPzs[0] ;
         n12836PEDCliPzs = T01LH10_n12836PEDCliPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12836PEDCliPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12836PEDCliPzs), 6, 0));
         A12835PEDCliArtA = T01LH10_A12835PEDCliArtA[0] ;
         n12835PEDCliArtA = T01LH10_n12835PEDCliArtA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12835PEDCliArtA", A12835PEDCliArtA);
         A12837PEDCLiObsU = T01LH10_A12837PEDCLiObsU[0] ;
         n12837PEDCLiObsU = T01LH10_n12837PEDCLiObsU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12837PEDCLiObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12837PEDCLiObsU), 2, 0));
         A12852PEDCLiPTra = T01LH10_A12852PEDCLiPTra[0] ;
         n12852PEDCLiPTra = T01LH10_n12852PEDCLiPTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12852PEDCLiPTra", A12852PEDCLiPTra);
         A12853PEDCLiPorc = T01LH10_A12853PEDCLiPorc[0] ;
         n12853PEDCLiPorc = T01LH10_n12853PEDCLiPorc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12853PEDCLiPorc", A12853PEDCLiPorc);
         A12854PEDCLiOF = T01LH10_A12854PEDCLiOF[0] ;
         n12854PEDCLiOF = T01LH10_n12854PEDCLiOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12854PEDCLiOF", A12854PEDCLiOF);
         A12855PEDCLiNAlb = T01LH10_A12855PEDCLiNAlb[0] ;
         n12855PEDCLiNAlb = T01LH10_n12855PEDCLiNAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12855PEDCLiNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12855PEDCLiNAlb), 8, 0));
         A12856PEDCLiProc = T01LH10_A12856PEDCLiProc[0] ;
         n12856PEDCLiProc = T01LH10_n12856PEDCLiProc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12856PEDCLiProc", A12856PEDCLiProc);
         zm1LH1762( -1) ;
      }
      pr_default.close(8);
      onLoadActions1LH1762( ) ;
   }

   public void onLoadActions1LH1762( )
   {
   }

   public void checkExtendedTable1LH1762( )
   {
      nIsDirty_1762 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01LH9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LH9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1LH1762( )
   {
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01LH11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LH11_A279CliNom[0] ;
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

   public void getKey1LH1762( )
   {
      /* Using cursor T01LH12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1762 = (short)(1) ;
      }
      else
      {
         RcdFound1762 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LH7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01LH7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LH1762( 1) ;
         RcdFound1762 = (short)(1) ;
         A12816PEDCliPed = T01LH7_A12816PEDCliPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
         A12817PEDCliFPed = T01LH7_A12817PEDCliFPed[0] ;
         n12817PEDCliFPed = T01LH7_n12817PEDCliFPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12817PEDCliFPed", localUtil.format(A12817PEDCliFPed, "99/99/99"));
         A12818PEDCliFcom = T01LH7_A12818PEDCliFcom[0] ;
         n12818PEDCliFcom = T01LH7_n12818PEDCliFcom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12818PEDCliFcom", localUtil.format(A12818PEDCliFcom, "99/99/99"));
         A12819PEDCliArt = T01LH7_A12819PEDCliArt[0] ;
         n12819PEDCliArt = T01LH7_n12819PEDCliArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12819PEDCliArt", A12819PEDCliArt);
         A12820PEDCliEmp = T01LH7_A12820PEDCliEmp[0] ;
         n12820PEDCliEmp = T01LH7_n12820PEDCliEmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12820PEDCliEmp", A12820PEDCliEmp);
         A12822PEDCliCoNm = T01LH7_A12822PEDCliCoNm[0] ;
         n12822PEDCliCoNm = T01LH7_n12822PEDCliCoNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12822PEDCliCoNm", A12822PEDCliCoNm);
         A12823PEDCliCoNu = T01LH7_A12823PEDCliCoNu[0] ;
         n12823PEDCliCoNu = T01LH7_n12823PEDCliCoNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12823PEDCliCoNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12823PEDCliCoNu), 6, 0));
         A12824PEDCliAnc = T01LH7_A12824PEDCliAnc[0] ;
         n12824PEDCliAnc = T01LH7_n12824PEDCliAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12824PEDCliAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12824PEDCliAnc), 3, 0));
         A12825PEDCliRdto = T01LH7_A12825PEDCliRdto[0] ;
         n12825PEDCliRdto = T01LH7_n12825PEDCliRdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12825PEDCliRdto", GXutil.ltrimstr( A12825PEDCliRdto, 6, 2));
         A12826PEDCliGrm2 = T01LH7_A12826PEDCliGrm2[0] ;
         n12826PEDCliGrm2 = T01LH7_n12826PEDCliGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12826PEDCliGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12826PEDCliGrm2), 4, 0));
         A12827PEDCliObs = T01LH7_A12827PEDCliObs[0] ;
         n12827PEDCliObs = T01LH7_n12827PEDCliObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12827PEDCliObs", A12827PEDCliObs);
         A12832PEDCliEst = T01LH7_A12832PEDCliEst[0] ;
         n12832PEDCliEst = T01LH7_n12832PEDCliEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12832PEDCliEst", GXutil.str( A12832PEDCliEst, 1, 0));
         A12815PEDCliID = T01LH7_A12815PEDCliID[0] ;
         n12815PEDCliID = T01LH7_n12815PEDCliID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12815PEDCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12815PEDCliID), 8, 0));
         A12833PEDCliKgs = T01LH7_A12833PEDCliKgs[0] ;
         n12833PEDCliKgs = T01LH7_n12833PEDCliKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12833PEDCliKgs", GXutil.ltrimstr( A12833PEDCliKgs, 9, 2));
         A12834PEDCliMts = T01LH7_A12834PEDCliMts[0] ;
         n12834PEDCliMts = T01LH7_n12834PEDCliMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12834PEDCliMts", GXutil.ltrimstr( A12834PEDCliMts, 9, 2));
         A12836PEDCliPzs = T01LH7_A12836PEDCliPzs[0] ;
         n12836PEDCliPzs = T01LH7_n12836PEDCliPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12836PEDCliPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12836PEDCliPzs), 6, 0));
         A12835PEDCliArtA = T01LH7_A12835PEDCliArtA[0] ;
         n12835PEDCliArtA = T01LH7_n12835PEDCliArtA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12835PEDCliArtA", A12835PEDCliArtA);
         A12837PEDCLiObsU = T01LH7_A12837PEDCLiObsU[0] ;
         n12837PEDCLiObsU = T01LH7_n12837PEDCLiObsU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12837PEDCLiObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12837PEDCLiObsU), 2, 0));
         A12852PEDCLiPTra = T01LH7_A12852PEDCLiPTra[0] ;
         n12852PEDCLiPTra = T01LH7_n12852PEDCLiPTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12852PEDCLiPTra", A12852PEDCLiPTra);
         A12853PEDCLiPorc = T01LH7_A12853PEDCLiPorc[0] ;
         n12853PEDCLiPorc = T01LH7_n12853PEDCLiPorc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12853PEDCLiPorc", A12853PEDCLiPorc);
         A12854PEDCLiOF = T01LH7_A12854PEDCLiOF[0] ;
         n12854PEDCLiOF = T01LH7_n12854PEDCLiOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12854PEDCLiOF", A12854PEDCLiOF);
         A12855PEDCLiNAlb = T01LH7_A12855PEDCLiNAlb[0] ;
         n12855PEDCLiNAlb = T01LH7_n12855PEDCLiNAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12855PEDCLiNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12855PEDCLiNAlb), 8, 0));
         A12856PEDCLiProc = T01LH7_A12856PEDCLiProc[0] ;
         n12856PEDCLiProc = T01LH7_n12856PEDCLiProc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12856PEDCLiProc", A12856PEDCLiProc);
         A252CliCod = T01LH7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z12816PEDCliPed = A12816PEDCliPed ;
         sMode1762 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1LH1762( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1762 = (short)(0) ;
            initializeNonKey1LH1762( ) ;
         }
         Gx_mode = sMode1762 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1762 = (short)(0) ;
         initializeNonKey1LH1762( ) ;
         sMode1762 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1762 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1LH1762( ) ;
      if ( RcdFound1762 == 0 )
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
      RcdFound1762 = (short)(0) ;
      /* Using cursor T01LH13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A12816PEDCliPed, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01LH13_A252CliCod[0] < A252CliCod ) || ( T01LH13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LH13_A12816PEDCliPed[0], A12816PEDCliPed) < 0 ) ) && ( GXutil.strcmp(T01LH13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01LH13_A252CliCod[0] > A252CliCod ) || ( T01LH13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LH13_A12816PEDCliPed[0], A12816PEDCliPed) > 0 ) ) && ( GXutil.strcmp(T01LH13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01LH13_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A12816PEDCliPed = T01LH13_A12816PEDCliPed[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
            RcdFound1762 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1762 = (short)(0) ;
      /* Using cursor T01LH14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A12816PEDCliPed, A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01LH14_A252CliCod[0] > A252CliCod ) || ( T01LH14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LH14_A12816PEDCliPed[0], A12816PEDCliPed) > 0 ) ) && ( GXutil.strcmp(T01LH14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01LH14_A252CliCod[0] < A252CliCod ) || ( T01LH14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LH14_A12816PEDCliPed[0], A12816PEDCliPed) < 0 ) ) && ( GXutil.strcmp(T01LH14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01LH14_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A12816PEDCliPed = T01LH14_A12816PEDCliPed[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
            RcdFound1762 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LH1762( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LH1762( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1762 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A12816PEDCliPed, Z12816PEDCliPed) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A12816PEDCliPed = Z12816PEDCliPed ;
               httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1LH1762( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A12816PEDCliPed, Z12816PEDCliPed) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LH1762( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1LH1762( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A12816PEDCliPed, Z12816PEDCliPed) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A12816PEDCliPed = Z12816PEDCliPed ;
         httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      getKey1LH1762( ) ;
      if ( RcdFound1762 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A12816PEDCliPed, Z12816PEDCliPed) != 0 ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A12816PEDCliPed = Z12816PEDCliPed ;
            httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A12816PEDCliPed, Z12816PEDCliPed) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedcli");
      GX_FocusControl = edtPEDCliFPed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1LH0( ) ;
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
      if ( RcdFound1762 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPEDCliFPed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1LH1762( ) ;
      if ( RcdFound1762 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPEDCliFPed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LH1762( ) ;
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
      if ( RcdFound1762 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPEDCliFPed_Internalname ;
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
      if ( RcdFound1762 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPEDCliFPed_Internalname ;
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
      scanStart1LH1762( ) ;
      if ( RcdFound1762 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1762 != 0 )
         {
            scanNext1LH1762( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPEDCliFPed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LH1762( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1LH1762( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LH6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDCLi"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z12817PEDCliFPed), GXutil.resetTime(T01LH6_A12817PEDCliFPed[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z12818PEDCliFcom), GXutil.resetTime(T01LH6_A12818PEDCliFcom[0])) ) || ( GXutil.strcmp(Z12819PEDCliArt, T01LH6_A12819PEDCliArt[0]) != 0 ) || ( GXutil.strcmp(Z12820PEDCliEmp, T01LH6_A12820PEDCliEmp[0]) != 0 ) || ( GXutil.strcmp(Z12822PEDCliCoNm, T01LH6_A12822PEDCliCoNm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12823PEDCliCoNu != T01LH6_A12823PEDCliCoNu[0] ) || ( Z12824PEDCliAnc != T01LH6_A12824PEDCliAnc[0] ) || ( DecimalUtil.compareTo(Z12825PEDCliRdto, T01LH6_A12825PEDCliRdto[0]) != 0 ) || ( Z12826PEDCliGrm2 != T01LH6_A12826PEDCliGrm2[0] ) || ( GXutil.strcmp(Z12827PEDCliObs, T01LH6_A12827PEDCliObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12832PEDCliEst != T01LH6_A12832PEDCliEst[0] ) || ( Z12815PEDCliID != T01LH6_A12815PEDCliID[0] ) || ( DecimalUtil.compareTo(Z12833PEDCliKgs, T01LH6_A12833PEDCliKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z12834PEDCliMts, T01LH6_A12834PEDCliMts[0]) != 0 ) || ( Z12836PEDCliPzs != T01LH6_A12836PEDCliPzs[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12835PEDCliArtA, T01LH6_A12835PEDCliArtA[0]) != 0 ) || ( Z12837PEDCLiObsU != T01LH6_A12837PEDCLiObsU[0] ) || ( GXutil.strcmp(Z12852PEDCLiPTra, T01LH6_A12852PEDCLiPTra[0]) != 0 ) || ( GXutil.strcmp(Z12853PEDCLiPorc, T01LH6_A12853PEDCLiPorc[0]) != 0 ) || ( GXutil.strcmp(Z12854PEDCLiOF, T01LH6_A12854PEDCLiOF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12855PEDCLiNAlb != T01LH6_A12855PEDCLiNAlb[0] ) || ( GXutil.strcmp(Z12856PEDCLiProc, T01LH6_A12856PEDCLiProc[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12817PEDCliFPed), GXutil.resetTime(T01LH6_A12817PEDCliFPed[0])) ) )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliFPed");
               GXutil.writeLogRaw("Old: ",Z12817PEDCliFPed);
               GXutil.writeLogRaw("Current: ",T01LH6_A12817PEDCliFPed[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12818PEDCliFcom), GXutil.resetTime(T01LH6_A12818PEDCliFcom[0])) ) )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliFcom");
               GXutil.writeLogRaw("Old: ",Z12818PEDCliFcom);
               GXutil.writeLogRaw("Current: ",T01LH6_A12818PEDCliFcom[0]);
            }
            if ( GXutil.strcmp(Z12819PEDCliArt, T01LH6_A12819PEDCliArt[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliArt");
               GXutil.writeLogRaw("Old: ",Z12819PEDCliArt);
               GXutil.writeLogRaw("Current: ",T01LH6_A12819PEDCliArt[0]);
            }
            if ( GXutil.strcmp(Z12820PEDCliEmp, T01LH6_A12820PEDCliEmp[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliEmp");
               GXutil.writeLogRaw("Old: ",Z12820PEDCliEmp);
               GXutil.writeLogRaw("Current: ",T01LH6_A12820PEDCliEmp[0]);
            }
            if ( GXutil.strcmp(Z12822PEDCliCoNm, T01LH6_A12822PEDCliCoNm[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliCoNm");
               GXutil.writeLogRaw("Old: ",Z12822PEDCliCoNm);
               GXutil.writeLogRaw("Current: ",T01LH6_A12822PEDCliCoNm[0]);
            }
            if ( Z12823PEDCliCoNu != T01LH6_A12823PEDCliCoNu[0] )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliCoNu");
               GXutil.writeLogRaw("Old: ",Z12823PEDCliCoNu);
               GXutil.writeLogRaw("Current: ",T01LH6_A12823PEDCliCoNu[0]);
            }
            if ( Z12824PEDCliAnc != T01LH6_A12824PEDCliAnc[0] )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliAnc");
               GXutil.writeLogRaw("Old: ",Z12824PEDCliAnc);
               GXutil.writeLogRaw("Current: ",T01LH6_A12824PEDCliAnc[0]);
            }
            if ( DecimalUtil.compareTo(Z12825PEDCliRdto, T01LH6_A12825PEDCliRdto[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliRdto");
               GXutil.writeLogRaw("Old: ",Z12825PEDCliRdto);
               GXutil.writeLogRaw("Current: ",T01LH6_A12825PEDCliRdto[0]);
            }
            if ( Z12826PEDCliGrm2 != T01LH6_A12826PEDCliGrm2[0] )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliGrm2");
               GXutil.writeLogRaw("Old: ",Z12826PEDCliGrm2);
               GXutil.writeLogRaw("Current: ",T01LH6_A12826PEDCliGrm2[0]);
            }
            if ( GXutil.strcmp(Z12827PEDCliObs, T01LH6_A12827PEDCliObs[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliObs");
               GXutil.writeLogRaw("Old: ",Z12827PEDCliObs);
               GXutil.writeLogRaw("Current: ",T01LH6_A12827PEDCliObs[0]);
            }
            if ( Z12832PEDCliEst != T01LH6_A12832PEDCliEst[0] )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliEst");
               GXutil.writeLogRaw("Old: ",Z12832PEDCliEst);
               GXutil.writeLogRaw("Current: ",T01LH6_A12832PEDCliEst[0]);
            }
            if ( Z12815PEDCliID != T01LH6_A12815PEDCliID[0] )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliID");
               GXutil.writeLogRaw("Old: ",Z12815PEDCliID);
               GXutil.writeLogRaw("Current: ",T01LH6_A12815PEDCliID[0]);
            }
            if ( DecimalUtil.compareTo(Z12833PEDCliKgs, T01LH6_A12833PEDCliKgs[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliKgs");
               GXutil.writeLogRaw("Old: ",Z12833PEDCliKgs);
               GXutil.writeLogRaw("Current: ",T01LH6_A12833PEDCliKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z12834PEDCliMts, T01LH6_A12834PEDCliMts[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliMts");
               GXutil.writeLogRaw("Old: ",Z12834PEDCliMts);
               GXutil.writeLogRaw("Current: ",T01LH6_A12834PEDCliMts[0]);
            }
            if ( Z12836PEDCliPzs != T01LH6_A12836PEDCliPzs[0] )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliPzs");
               GXutil.writeLogRaw("Old: ",Z12836PEDCliPzs);
               GXutil.writeLogRaw("Current: ",T01LH6_A12836PEDCliPzs[0]);
            }
            if ( GXutil.strcmp(Z12835PEDCliArtA, T01LH6_A12835PEDCliArtA[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliArtA");
               GXutil.writeLogRaw("Old: ",Z12835PEDCliArtA);
               GXutil.writeLogRaw("Current: ",T01LH6_A12835PEDCliArtA[0]);
            }
            if ( Z12837PEDCLiObsU != T01LH6_A12837PEDCLiObsU[0] )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCLiObsU");
               GXutil.writeLogRaw("Old: ",Z12837PEDCLiObsU);
               GXutil.writeLogRaw("Current: ",T01LH6_A12837PEDCLiObsU[0]);
            }
            if ( GXutil.strcmp(Z12852PEDCLiPTra, T01LH6_A12852PEDCLiPTra[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCLiPTra");
               GXutil.writeLogRaw("Old: ",Z12852PEDCLiPTra);
               GXutil.writeLogRaw("Current: ",T01LH6_A12852PEDCLiPTra[0]);
            }
            if ( GXutil.strcmp(Z12853PEDCLiPorc, T01LH6_A12853PEDCLiPorc[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCLiPorc");
               GXutil.writeLogRaw("Old: ",Z12853PEDCLiPorc);
               GXutil.writeLogRaw("Current: ",T01LH6_A12853PEDCLiPorc[0]);
            }
            if ( GXutil.strcmp(Z12854PEDCLiOF, T01LH6_A12854PEDCLiOF[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCLiOF");
               GXutil.writeLogRaw("Old: ",Z12854PEDCLiOF);
               GXutil.writeLogRaw("Current: ",T01LH6_A12854PEDCLiOF[0]);
            }
            if ( Z12855PEDCLiNAlb != T01LH6_A12855PEDCLiNAlb[0] )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCLiNAlb");
               GXutil.writeLogRaw("Old: ",Z12855PEDCLiNAlb);
               GXutil.writeLogRaw("Current: ",T01LH6_A12855PEDCLiNAlb[0]);
            }
            if ( GXutil.strcmp(Z12856PEDCLiProc, T01LH6_A12856PEDCLiProc[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCLiProc");
               GXutil.writeLogRaw("Old: ",Z12856PEDCLiProc);
               GXutil.writeLogRaw("Current: ",T01LH6_A12856PEDCLiProc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEDCLi"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LH1762( )
   {
      beforeValidate1LH1762( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LH1762( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LH1762( 0) ;
         checkOptimisticConcurrency1LH1762( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LH1762( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LH1762( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LH15 */
                  pr_default.execute(13, new Object[] {A12816PEDCliPed, Boolean.valueOf(n12817PEDCliFPed), A12817PEDCliFPed, Boolean.valueOf(n12818PEDCliFcom), A12818PEDCliFcom, Boolean.valueOf(n12819PEDCliArt), A12819PEDCliArt, Boolean.valueOf(n12820PEDCliEmp), A12820PEDCliEmp, Boolean.valueOf(n12822PEDCliCoNm), A12822PEDCliCoNm, Boolean.valueOf(n12823PEDCliCoNu), Integer.valueOf(A12823PEDCliCoNu), Boolean.valueOf(n12824PEDCliAnc), Short.valueOf(A12824PEDCliAnc), Boolean.valueOf(n12825PEDCliRdto), A12825PEDCliRdto, Boolean.valueOf(n12826PEDCliGrm2), Short.valueOf(A12826PEDCliGrm2), Boolean.valueOf(n12827PEDCliObs), A12827PEDCliObs, Boolean.valueOf(n12832PEDCliEst), Byte.valueOf(A12832PEDCliEst), Boolean.valueOf(n12815PEDCliID), Integer.valueOf(A12815PEDCliID), Boolean.valueOf(n12833PEDCliKgs), A12833PEDCliKgs, Boolean.valueOf(n12834PEDCliMts), A12834PEDCliMts, Boolean.valueOf(n12836PEDCliPzs), Integer.valueOf(A12836PEDCliPzs), Boolean.valueOf(n12835PEDCliArtA), A12835PEDCliArtA, Boolean.valueOf(n12837PEDCLiObsU), Byte.valueOf(A12837PEDCLiObsU), Boolean.valueOf(n12852PEDCLiPTra), A12852PEDCLiPTra, Boolean.valueOf(n12853PEDCLiPorc), A12853PEDCLiPorc, Boolean.valueOf(n12854PEDCLiOF), A12854PEDCLiOF, Boolean.valueOf(n12855PEDCLiNAlb), Integer.valueOf(A12855PEDCLiNAlb), Boolean.valueOf(n12856PEDCLiProc), A12856PEDCLiProc, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCLi");
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
                        processLevel1LH1762( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1LH0( ) ;
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
            load1LH1762( ) ;
         }
         endLevel1LH1762( ) ;
      }
      closeExtendedTableCursors1LH1762( ) ;
   }

   public void update1LH1762( )
   {
      beforeValidate1LH1762( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LH1762( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LH1762( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LH1762( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LH1762( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LH16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n12817PEDCliFPed), A12817PEDCliFPed, Boolean.valueOf(n12818PEDCliFcom), A12818PEDCliFcom, Boolean.valueOf(n12819PEDCliArt), A12819PEDCliArt, Boolean.valueOf(n12820PEDCliEmp), A12820PEDCliEmp, Boolean.valueOf(n12822PEDCliCoNm), A12822PEDCliCoNm, Boolean.valueOf(n12823PEDCliCoNu), Integer.valueOf(A12823PEDCliCoNu), Boolean.valueOf(n12824PEDCliAnc), Short.valueOf(A12824PEDCliAnc), Boolean.valueOf(n12825PEDCliRdto), A12825PEDCliRdto, Boolean.valueOf(n12826PEDCliGrm2), Short.valueOf(A12826PEDCliGrm2), Boolean.valueOf(n12827PEDCliObs), A12827PEDCliObs, Boolean.valueOf(n12832PEDCliEst), Byte.valueOf(A12832PEDCliEst), Boolean.valueOf(n12815PEDCliID), Integer.valueOf(A12815PEDCliID), Boolean.valueOf(n12833PEDCliKgs), A12833PEDCliKgs, Boolean.valueOf(n12834PEDCliMts), A12834PEDCliMts, Boolean.valueOf(n12836PEDCliPzs), Integer.valueOf(A12836PEDCliPzs), Boolean.valueOf(n12835PEDCliArtA), A12835PEDCliArtA, Boolean.valueOf(n12837PEDCLiObsU), Byte.valueOf(A12837PEDCLiObsU), Boolean.valueOf(n12852PEDCLiPTra), A12852PEDCLiPTra, Boolean.valueOf(n12853PEDCLiPorc), A12853PEDCLiPorc, Boolean.valueOf(n12854PEDCLiOF), A12854PEDCLiOF, Boolean.valueOf(n12855PEDCLiNAlb), Integer.valueOf(A12855PEDCLiNAlb), Boolean.valueOf(n12856PEDCLiProc), A12856PEDCLiProc, A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCLi");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDCLi"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LH1762( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LH1762( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1LH0( ) ;
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
         endLevel1LH1762( ) ;
      }
      closeExtendedTableCursors1LH1762( ) ;
   }

   public void deferredUpdate1LH1762( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LH1762( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LH1762( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LH1762( ) ;
         afterConfirm1LH1762( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LH1762( ) ;
            if ( AnyError == 0 )
            {
               scanStart1LH1764( ) ;
               while ( RcdFound1764 != 0 )
               {
                  getByPrimaryKey1LH1764( ) ;
                  delete1LH1764( ) ;
                  scanNext1LH1764( ) ;
               }
               scanEnd1LH1764( ) ;
               scanStart1LH1763( ) ;
               while ( RcdFound1763 != 0 )
               {
                  getByPrimaryKey1LH1763( ) ;
                  delete1LH1763( ) ;
                  scanNext1LH1763( ) ;
               }
               scanEnd1LH1763( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LH17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCLi");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1762 == 0 )
                        {
                           initAll1LH1762( ) ;
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
                        resetCaption1LH0( ) ;
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
      sMode1762 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LH1762( ) ;
      Gx_mode = sMode1762 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LH1762( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LH18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01LH18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
      }
   }

   public void processNestedLevel1LH1763( )
   {
      nGXsfl_155_idx = 0 ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         readRow1LH1763( ) ;
         if ( ( nRcdExists_1763 != 0 ) || ( nIsMod_1763 != 0 ) )
         {
            standaloneNotModal1LH1763( ) ;
            getKey1LH1763( ) ;
            if ( ( nRcdExists_1763 == 0 ) && ( nRcdDeleted_1763 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LH1763( ) ;
            }
            else
            {
               if ( RcdFound1763 != 0 )
               {
                  if ( ( nRcdDeleted_1763 != 0 ) && ( nRcdExists_1763 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LH1763( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1763 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LH1763( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1763 == 0 )
                  {
                     GXCCtl = "PEDCLINPZ_" + sGXsfl_155_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPEDCliNpz_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1763_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEDCliNpz_Internalname, GXutil.rtrim( A12828PEDCliNpz)) ;
         httpContext.changePostValue( edtPEDCliLoc_Internalname, GXutil.rtrim( A12829PEDCliLoc)) ;
         httpContext.changePostValue( edtPEDCliKg_Internalname, GXutil.ltrim( localUtil.ntoc( A12830PEDCliKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEDCliMt_Internalname, GXutil.ltrim( localUtil.ntoc( A12831PEDCliMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12828PEDCliNpz_"+sGXsfl_155_idx, GXutil.rtrim( Z12828PEDCliNpz)) ;
         httpContext.changePostValue( "ZT_"+"Z12829PEDCliLoc_"+sGXsfl_155_idx, GXutil.rtrim( Z12829PEDCliLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z12830PEDCliKg_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( Z12830PEDCliKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12831PEDCliMt_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( Z12831PEDCliMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1763_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1763_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1763_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1763 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1763_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1763_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLINPZ_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliNpz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLILOC_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLIKG_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLIMT_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LH1763( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1763 = (short)(0) ;
      nIsMod_1763 = (short)(0) ;
      nRcdDeleted_1763 = (short)(0) ;
   }

   public void processNestedLevel1LH1764( )
   {
      nGXsfl_164_idx = 0 ;
      while ( nGXsfl_164_idx < nRC_GXsfl_164 )
      {
         readRow1LH1764( ) ;
         if ( ( nRcdExists_1764 != 0 ) || ( nIsMod_1764 != 0 ) )
         {
            standaloneNotModal1LH1764( ) ;
            getKey1LH1764( ) ;
            if ( ( nRcdExists_1764 == 0 ) && ( nRcdDeleted_1764 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LH1764( ) ;
            }
            else
            {
               if ( RcdFound1764 != 0 )
               {
                  if ( ( nRcdDeleted_1764 != 0 ) && ( nRcdExists_1764 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LH1764( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1764 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LH1764( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1764 == 0 )
                  {
                     GXCCtl = "PEDCLIOBSL_" + sGXsfl_164_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPEDCliObsL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1764_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEDCliObsL_Internalname, GXutil.ltrim( localUtil.ntoc( A12838PEDCliObsL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEDCLiObsT_Internalname, GXutil.rtrim( A12839PEDCLiObsT)) ;
         httpContext.changePostValue( "ZT_"+"Z12838PEDCliObsL_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( Z12838PEDCliObsL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12839PEDCLiObsT_"+sGXsfl_164_idx, GXutil.rtrim( Z12839PEDCLiObsT)) ;
         httpContext.changePostValue( "nRcdDeleted_1764_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1764_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1764_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1764 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1764_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1764_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLIOBSL_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliObsL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCLIOBST_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCLiObsT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LH1764( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1764 = (short)(0) ;
      nIsMod_1764 = (short)(0) ;
      nRcdDeleted_1764 = (short)(0) ;
   }

   public void processLevel1LH1762( )
   {
      /* Save parent mode. */
      sMode1762 = Gx_mode ;
      processNestedLevel1LH1763( ) ;
      processNestedLevel1LH1764( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1762 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LH1762( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LH1762( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpedcli");
         if ( AnyError == 0 )
         {
            confirmValues1LH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedcli");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LH1762( )
   {
      /* Scan By routine */
      /* Using cursor T01LH19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound1762 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1762 = (short)(1) ;
         A252CliCod = T01LH19_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A12816PEDCliPed = T01LH19_A12816PEDCliPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LH1762( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1762 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1762 = (short)(1) ;
         A252CliCod = T01LH19_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A12816PEDCliPed = T01LH19_A12816PEDCliPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
      }
   }

   public void scanEnd1LH1762( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1LH1762( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LH1762( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LH1762( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LH1762( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LH1762( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LH1762( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LH1762( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtPEDCliPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliPed_Enabled), 5, 0), true);
      edtPEDCliFPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliFPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliFPed_Enabled), 5, 0), true);
      edtPEDCliFcom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliFcom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliFcom_Enabled), 5, 0), true);
      edtPEDCliArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliArt_Enabled), 5, 0), true);
      edtPEDCliEmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliEmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliEmp_Enabled), 5, 0), true);
      edtPEDCliCoNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliCoNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliCoNm_Enabled), 5, 0), true);
      edtPEDCliCoNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliCoNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliCoNu_Enabled), 5, 0), true);
      edtPEDCliAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliAnc_Enabled), 5, 0), true);
      edtPEDCliRdto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliRdto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliRdto_Enabled), 5, 0), true);
      edtPEDCliGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliGrm2_Enabled), 5, 0), true);
      edtPEDCliObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliObs_Enabled), 5, 0), true);
      edtPEDCliEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliEst_Enabled), 5, 0), true);
      edtPEDCliID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliID_Enabled), 5, 0), true);
      edtPEDCliKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliKgs_Enabled), 5, 0), true);
      edtPEDCliMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliMts_Enabled), 5, 0), true);
      edtPEDCliPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliPzs_Enabled), 5, 0), true);
      edtPEDCliArtA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliArtA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliArtA_Enabled), 5, 0), true);
      edtPEDCLiObsU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCLiObsU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCLiObsU_Enabled), 5, 0), true);
      edtPEDCLiPTra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCLiPTra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCLiPTra_Enabled), 5, 0), true);
      edtPEDCLiPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCLiPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCLiPorc_Enabled), 5, 0), true);
      edtPEDCLiOF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCLiOF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCLiOF_Enabled), 5, 0), true);
      edtPEDCLiNAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCLiNAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCLiNAlb_Enabled), 5, 0), true);
      edtPEDCLiProc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCLiProc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCLiProc_Enabled), 5, 0), true);
   }

   public void zm1LH1763( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12829PEDCliLoc = T01LH5_A12829PEDCliLoc[0] ;
            Z12830PEDCliKg = T01LH5_A12830PEDCliKg[0] ;
            Z12831PEDCliMt = T01LH5_A12831PEDCliMt[0] ;
         }
         else
         {
            Z12829PEDCliLoc = A12829PEDCliLoc ;
            Z12830PEDCliKg = A12830PEDCliKg ;
            Z12831PEDCliMt = A12831PEDCliMt ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z252CliCod = A252CliCod ;
         Z12816PEDCliPed = A12816PEDCliPed ;
         Z12828PEDCliNpz = A12828PEDCliNpz ;
         Z12829PEDCliLoc = A12829PEDCliLoc ;
         Z12830PEDCliKg = A12830PEDCliKg ;
         Z12831PEDCliMt = A12831PEDCliMt ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1LH1763( )
   {
   }

   public void standaloneModal1LH1763( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPEDCliNpz_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEDCliNpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliNpz_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      }
      else
      {
         edtPEDCliNpz_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEDCliNpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliNpz_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      }
   }

   public void load1LH1763( )
   {
      /* Using cursor T01LH20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, A12828PEDCliNpz});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1763 = (short)(1) ;
         A12829PEDCliLoc = T01LH20_A12829PEDCliLoc[0] ;
         n12829PEDCliLoc = T01LH20_n12829PEDCliLoc[0] ;
         A12830PEDCliKg = T01LH20_A12830PEDCliKg[0] ;
         n12830PEDCliKg = T01LH20_n12830PEDCliKg[0] ;
         A12831PEDCliMt = T01LH20_A12831PEDCliMt[0] ;
         n12831PEDCliMt = T01LH20_n12831PEDCliMt[0] ;
         zm1LH1763( -4) ;
      }
      pr_default.close(18);
      onLoadActions1LH1763( ) ;
   }

   public void onLoadActions1LH1763( )
   {
   }

   public void checkExtendedTable1LH1763( )
   {
      nIsDirty_1763 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LH1763( ) ;
   }

   public void closeExtendedTableCursors1LH1763( )
   {
   }

   public void enableDisable1LH1763( )
   {
   }

   public void getKey1LH1763( )
   {
      /* Using cursor T01LH21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, A12828PEDCliNpz});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1763 = (short)(1) ;
      }
      else
      {
         RcdFound1763 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1LH1763( )
   {
      /* Using cursor T01LH5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, A12828PEDCliNpz});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01LH5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LH1763( 4) ;
         RcdFound1763 = (short)(1) ;
         initializeNonKey1LH1763( ) ;
         A12828PEDCliNpz = T01LH5_A12828PEDCliNpz[0] ;
         A12829PEDCliLoc = T01LH5_A12829PEDCliLoc[0] ;
         n12829PEDCliLoc = T01LH5_n12829PEDCliLoc[0] ;
         A12830PEDCliKg = T01LH5_A12830PEDCliKg[0] ;
         n12830PEDCliKg = T01LH5_n12830PEDCliKg[0] ;
         A12831PEDCliMt = T01LH5_A12831PEDCliMt[0] ;
         n12831PEDCliMt = T01LH5_n12831PEDCliMt[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z12816PEDCliPed = A12816PEDCliPed ;
         Z12828PEDCliNpz = A12828PEDCliNpz ;
         sMode1763 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LH1763( ) ;
         load1LH1763( ) ;
         Gx_mode = sMode1763 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1763 = (short)(0) ;
         initializeNonKey1LH1763( ) ;
         sMode1763 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LH1763( ) ;
         Gx_mode = sMode1763 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LH1763( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1LH1763( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, A12828PEDCliNpz});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDCL1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z12829PEDCliLoc, T01LH4_A12829PEDCliLoc[0]) != 0 ) || ( DecimalUtil.compareTo(Z12830PEDCliKg, T01LH4_A12830PEDCliKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z12831PEDCliMt, T01LH4_A12831PEDCliMt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12829PEDCliLoc, T01LH4_A12829PEDCliLoc[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliLoc");
               GXutil.writeLogRaw("Old: ",Z12829PEDCliLoc);
               GXutil.writeLogRaw("Current: ",T01LH4_A12829PEDCliLoc[0]);
            }
            if ( DecimalUtil.compareTo(Z12830PEDCliKg, T01LH4_A12830PEDCliKg[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliKg");
               GXutil.writeLogRaw("Old: ",Z12830PEDCliKg);
               GXutil.writeLogRaw("Current: ",T01LH4_A12830PEDCliKg[0]);
            }
            if ( DecimalUtil.compareTo(Z12831PEDCliMt, T01LH4_A12831PEDCliMt[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCliMt");
               GXutil.writeLogRaw("Old: ",Z12831PEDCliMt);
               GXutil.writeLogRaw("Current: ",T01LH4_A12831PEDCliMt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEDCL1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LH1763( )
   {
      beforeValidate1LH1763( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LH1763( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LH1763( 0) ;
         checkOptimisticConcurrency1LH1763( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LH1763( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LH1763( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LH22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A252CliCod), A12816PEDCliPed, A12828PEDCliNpz, Boolean.valueOf(n12829PEDCliLoc), A12829PEDCliLoc, Boolean.valueOf(n12830PEDCliKg), A12830PEDCliKg, Boolean.valueOf(n12831PEDCliMt), A12831PEDCliMt, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCL1");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1LH1763( ) ;
         }
         endLevel1LH1763( ) ;
      }
      closeExtendedTableCursors1LH1763( ) ;
   }

   public void update1LH1763( )
   {
      beforeValidate1LH1763( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LH1763( ) ;
      }
      if ( ( nIsMod_1763 != 0 ) || ( nIsDirty_1763 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LH1763( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LH1763( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LH1763( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LH23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n12829PEDCliLoc), A12829PEDCliLoc, Boolean.valueOf(n12830PEDCliKg), A12830PEDCliKg, Boolean.valueOf(n12831PEDCliMt), A12831PEDCliMt, A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, A12828PEDCliNpz});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCL1");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDCL1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LH1763( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LH1763( ) ;
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
            endLevel1LH1763( ) ;
         }
      }
      closeExtendedTableCursors1LH1763( ) ;
   }

   public void deferredUpdate1LH1763( )
   {
   }

   public void delete1LH1763( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LH1763( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LH1763( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LH1763( ) ;
         afterConfirm1LH1763( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LH1763( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LH24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, A12828PEDCliNpz});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCL1");
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
      sMode1763 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LH1763( ) ;
      Gx_mode = sMode1763 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LH1763( )
   {
      standaloneModal1LH1763( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1LH1763( )
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

   public void scanStart1LH1763( )
   {
      /* Scan By routine */
      /* Using cursor T01LH25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed});
      RcdFound1763 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1763 = (short)(1) ;
         A12828PEDCliNpz = T01LH25_A12828PEDCliNpz[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LH1763( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1763 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1763 = (short)(1) ;
         A12828PEDCliNpz = T01LH25_A12828PEDCliNpz[0] ;
      }
   }

   public void scanEnd1LH1763( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1LH1763( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LH1763( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LH1763( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LH1763( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LH1763( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LH1763( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LH1763( )
   {
      edtPEDCliNpz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliNpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliNpz_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      edtPEDCliLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliLoc_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      edtPEDCliKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliKg_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      edtPEDCliMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliMt_Enabled), 5, 0), !bGXsfl_155_Refreshing);
   }

   public void send_integrity_lvl_hashes1LH1763( )
   {
   }

   public void zm1LH1764( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12839PEDCLiObsT = T01LH3_A12839PEDCLiObsT[0] ;
         }
         else
         {
            Z12839PEDCLiObsT = A12839PEDCLiObsT ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z252CliCod = A252CliCod ;
         Z12816PEDCliPed = A12816PEDCliPed ;
         Z12838PEDCliObsL = A12838PEDCliObsL ;
         Z12839PEDCLiObsT = A12839PEDCLiObsT ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1LH1764( )
   {
   }

   public void standaloneModal1LH1764( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPEDCliObsL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEDCliObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliObsL_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      }
      else
      {
         edtPEDCliObsL_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEDCliObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliObsL_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      }
   }

   public void load1LH1764( )
   {
      /* Using cursor T01LH26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, Byte.valueOf(A12838PEDCliObsL)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1764 = (short)(1) ;
         A12839PEDCLiObsT = T01LH26_A12839PEDCLiObsT[0] ;
         n12839PEDCLiObsT = T01LH26_n12839PEDCLiObsT[0] ;
         zm1LH1764( -5) ;
      }
      pr_default.close(24);
      onLoadActions1LH1764( ) ;
   }

   public void onLoadActions1LH1764( )
   {
   }

   public void checkExtendedTable1LH1764( )
   {
      nIsDirty_1764 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LH1764( ) ;
   }

   public void closeExtendedTableCursors1LH1764( )
   {
   }

   public void enableDisable1LH1764( )
   {
   }

   public void getKey1LH1764( )
   {
      /* Using cursor T01LH27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, Byte.valueOf(A12838PEDCliObsL)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1764 = (short)(1) ;
      }
      else
      {
         RcdFound1764 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1LH1764( )
   {
      /* Using cursor T01LH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, Byte.valueOf(A12838PEDCliObsL)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01LH3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LH1764( 5) ;
         RcdFound1764 = (short)(1) ;
         initializeNonKey1LH1764( ) ;
         A12838PEDCliObsL = T01LH3_A12838PEDCliObsL[0] ;
         A12839PEDCLiObsT = T01LH3_A12839PEDCLiObsT[0] ;
         n12839PEDCLiObsT = T01LH3_n12839PEDCLiObsT[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z12816PEDCliPed = A12816PEDCliPed ;
         Z12838PEDCliObsL = A12838PEDCliObsL ;
         sMode1764 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LH1764( ) ;
         load1LH1764( ) ;
         Gx_mode = sMode1764 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1764 = (short)(0) ;
         initializeNonKey1LH1764( ) ;
         sMode1764 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LH1764( ) ;
         Gx_mode = sMode1764 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LH1764( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LH1764( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, Byte.valueOf(A12838PEDCliObsL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDCL2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12839PEDCLiObsT, T01LH2_A12839PEDCLiObsT[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12839PEDCLiObsT, T01LH2_A12839PEDCLiObsT[0]) != 0 )
            {
               GXutil.writeLogln("tpedcli:[seudo value changed for attri]"+"PEDCLiObsT");
               GXutil.writeLogRaw("Old: ",Z12839PEDCLiObsT);
               GXutil.writeLogRaw("Current: ",T01LH2_A12839PEDCLiObsT[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEDCL2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LH1764( )
   {
      beforeValidate1LH1764( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LH1764( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LH1764( 0) ;
         checkOptimisticConcurrency1LH1764( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LH1764( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LH1764( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LH28 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A252CliCod), A12816PEDCliPed, Byte.valueOf(A12838PEDCliObsL), Boolean.valueOf(n12839PEDCLiObsT), A12839PEDCLiObsT, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCL2");
                  if ( (pr_default.getStatus(26) == 1) )
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
            load1LH1764( ) ;
         }
         endLevel1LH1764( ) ;
      }
      closeExtendedTableCursors1LH1764( ) ;
   }

   public void update1LH1764( )
   {
      beforeValidate1LH1764( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LH1764( ) ;
      }
      if ( ( nIsMod_1764 != 0 ) || ( nIsDirty_1764 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LH1764( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LH1764( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LH1764( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LH29 */
                     pr_default.execute(27, new Object[] {Boolean.valueOf(n12839PEDCLiObsT), A12839PEDCLiObsT, A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, Byte.valueOf(A12838PEDCliObsL)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCL2");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDCL2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LH1764( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LH1764( ) ;
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
            endLevel1LH1764( ) ;
         }
      }
      closeExtendedTableCursors1LH1764( ) ;
   }

   public void deferredUpdate1LH1764( )
   {
   }

   public void delete1LH1764( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LH1764( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LH1764( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LH1764( ) ;
         afterConfirm1LH1764( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LH1764( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LH30 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed, Byte.valueOf(A12838PEDCliObsL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDCL2");
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
      sMode1764 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LH1764( ) ;
      Gx_mode = sMode1764 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LH1764( )
   {
      standaloneModal1LH1764( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1LH1764( )
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

   public void scanStart1LH1764( )
   {
      /* Scan By routine */
      /* Using cursor T01LH31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A12816PEDCliPed});
      RcdFound1764 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1764 = (short)(1) ;
         A12838PEDCliObsL = T01LH31_A12838PEDCliObsL[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LH1764( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound1764 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1764 = (short)(1) ;
         A12838PEDCliObsL = T01LH31_A12838PEDCliObsL[0] ;
      }
   }

   public void scanEnd1LH1764( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1LH1764( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LH1764( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LH1764( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LH1764( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LH1764( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LH1764( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LH1764( )
   {
      edtPEDCliObsL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliObsL_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      edtPEDCLiObsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCLiObsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCLiObsT_Enabled), 5, 0), !bGXsfl_164_Refreshing);
   }

   public void send_integrity_lvl_hashes1LH1764( )
   {
   }

   public void send_integrity_lvl_hashes1LH1762( )
   {
   }

   public void subsflControlProps_1551763( )
   {
      edtavnRcdDeleted_1763_Internalname = "vNRCDDELETED_1763_"+sGXsfl_155_idx ;
      edtPEDCliNpz_Internalname = "PEDCLINPZ_"+sGXsfl_155_idx ;
      edtPEDCliLoc_Internalname = "PEDCLILOC_"+sGXsfl_155_idx ;
      edtPEDCliKg_Internalname = "PEDCLIKG_"+sGXsfl_155_idx ;
      edtPEDCliMt_Internalname = "PEDCLIMT_"+sGXsfl_155_idx ;
   }

   public void subsflControlProps_fel_1551763( )
   {
      edtavnRcdDeleted_1763_Internalname = "vNRCDDELETED_1763_"+sGXsfl_155_fel_idx ;
      edtPEDCliNpz_Internalname = "PEDCLINPZ_"+sGXsfl_155_fel_idx ;
      edtPEDCliLoc_Internalname = "PEDCLILOC_"+sGXsfl_155_fel_idx ;
      edtPEDCliKg_Internalname = "PEDCLIKG_"+sGXsfl_155_fel_idx ;
      edtPEDCliMt_Internalname = "PEDCLIMT_"+sGXsfl_155_fel_idx ;
   }

   public void addRow1LH1763( )
   {
      nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1551763( ) ;
      sendRow1LH1763( ) ;
   }

   public void sendRow1LH1763( )
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
         if ( ((int)((nGXsfl_155_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1763_" + sGXsfl_155_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 156,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1763_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1763_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1763), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1763), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1763_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1763_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1763_" + sGXsfl_155_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEDCliNpz_Internalname,GXutil.rtrim( A12828PEDCliNpz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEDCliNpz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEDCliNpz_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1763_" + sGXsfl_155_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEDCliLoc_Internalname,GXutil.rtrim( A12829PEDCliLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,158);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEDCliLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEDCliLoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1763_" + sGXsfl_155_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 159,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEDCliKg_Internalname,GXutil.ltrim( localUtil.ntoc( A12830PEDCliKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPEDCliKg_Enabled!=0) ? localUtil.format( A12830PEDCliKg, "ZZZZZ9.99") : localUtil.format( A12830PEDCliKg, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,159);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEDCliKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEDCliKg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1763_" + sGXsfl_155_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEDCliMt_Internalname,GXutil.ltrim( localUtil.ntoc( A12831PEDCliMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPEDCliMt_Enabled!=0) ? localUtil.format( A12831PEDCliMt, "ZZZZZ9.99") : localUtil.format( A12831PEDCliMt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,160);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEDCliMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEDCliMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1LH1763( ) ;
      GXCCtl = "Z12828PEDCliNpz_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12828PEDCliNpz));
      GXCCtl = "Z12829PEDCliLoc_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12829PEDCliLoc));
      GXCCtl = "Z12830PEDCliKg_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12830PEDCliKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12831PEDCliMt_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12831PEDCliMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1763_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1763_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1763_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1763, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1763_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1763_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCLINPZ_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliNpz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCLILOC_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCLIKG_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCLIMT_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1LH1763( )
   {
      nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1551763( ) ;
      edtavnRcdDeleted_1763_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1763_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEDCliNpz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLINPZ_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEDCliLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLILOC_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEDCliKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLIKG_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEDCliMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLIMT_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1763_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1763_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1763");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1763_Internalname ;
         wbErr = true ;
         nRcdDeleted_1763 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1763 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1763_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12828PEDCliNpz = httpContext.cgiGet( edtPEDCliNpz_Internalname) ;
      A12829PEDCliLoc = httpContext.cgiGet( edtPEDCliLoc_Internalname) ;
      n12829PEDCliLoc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEDCliKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEDCliKg_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PEDCLIKG_" + sGXsfl_155_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEDCliKg_Internalname ;
         wbErr = true ;
         A12830PEDCliKg = DecimalUtil.ZERO ;
         n12830PEDCliKg = false ;
      }
      else
      {
         A12830PEDCliKg = localUtil.ctond( httpContext.cgiGet( edtPEDCliKg_Internalname)) ;
         n12830PEDCliKg = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEDCliMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEDCliMt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PEDCLIMT_" + sGXsfl_155_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEDCliMt_Internalname ;
         wbErr = true ;
         A12831PEDCliMt = DecimalUtil.ZERO ;
         n12831PEDCliMt = false ;
      }
      else
      {
         A12831PEDCliMt = localUtil.ctond( httpContext.cgiGet( edtPEDCliMt_Internalname)) ;
         n12831PEDCliMt = false ;
      }
      GXCCtl = "Z12828PEDCliNpz_" + sGXsfl_155_idx ;
      Z12828PEDCliNpz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12829PEDCliLoc_" + sGXsfl_155_idx ;
      Z12829PEDCliLoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12830PEDCliKg_" + sGXsfl_155_idx ;
      Z12830PEDCliKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12831PEDCliMt_" + sGXsfl_155_idx ;
      Z12831PEDCliMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1763_" + sGXsfl_155_idx ;
      nRcdDeleted_1763 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1763_" + sGXsfl_155_idx ;
      nRcdExists_1763 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1763_" + sGXsfl_155_idx ;
      nIsMod_1763 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1641764( )
   {
      edtavnRcdDeleted_1764_Internalname = "vNRCDDELETED_1764_"+sGXsfl_164_idx ;
      edtPEDCliObsL_Internalname = "PEDCLIOBSL_"+sGXsfl_164_idx ;
      edtPEDCLiObsT_Internalname = "PEDCLIOBST_"+sGXsfl_164_idx ;
   }

   public void subsflControlProps_fel_1641764( )
   {
      edtavnRcdDeleted_1764_Internalname = "vNRCDDELETED_1764_"+sGXsfl_164_fel_idx ;
      edtPEDCliObsL_Internalname = "PEDCLIOBSL_"+sGXsfl_164_fel_idx ;
      edtPEDCLiObsT_Internalname = "PEDCLIOBST_"+sGXsfl_164_fel_idx ;
   }

   public void addRow1LH1764( )
   {
      nGXsfl_164_idx = (int)(nGXsfl_164_idx+1) ;
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1641764( ) ;
      sendRow1LH1764( ) ;
   }

   public void sendRow1LH1764( )
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
         if ( ((int)((nGXsfl_164_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1764_" + sGXsfl_164_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 165,'',false,'" + sGXsfl_164_idx + "',164)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1764_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1764_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1764), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1764), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,165);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1764_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1764_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1764_" + sGXsfl_164_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 166,'',false,'" + sGXsfl_164_idx + "',164)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEDCliObsL_Internalname,GXutil.ltrim( localUtil.ntoc( A12838PEDCliObsL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12838PEDCliObsL), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEDCliObsL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEDCliObsL_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1764_" + sGXsfl_164_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 167,'',false,'" + sGXsfl_164_idx + "',164)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEDCLiObsT_Internalname,GXutil.rtrim( A12839PEDCLiObsT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,167);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEDCLiObsT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEDCLiObsT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1LH1764( ) ;
      GXCCtl = "Z12838PEDCliObsL_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12838PEDCliObsL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12839PEDCLiObsT_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12839PEDCLiObsT));
      GXCCtl = "nRcdDeleted_1764_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1764_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1764_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1764_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1764_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCLIOBSL_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliObsL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCLIOBST_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCLiObsT_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1LH1764( )
   {
      nGXsfl_164_idx = (int)(nGXsfl_164_idx+1) ;
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1641764( ) ;
      edtavnRcdDeleted_1764_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1764_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEDCliObsL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLIOBSL_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEDCLiObsT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCLIOBST_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1764_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1764_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1764");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1764_Internalname ;
         wbErr = true ;
         nRcdDeleted_1764 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1764 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1764_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliObsL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDCliObsL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "PEDCLIOBSL_" + sGXsfl_164_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEDCliObsL_Internalname ;
         wbErr = true ;
         A12838PEDCliObsL = (byte)(0) ;
      }
      else
      {
         A12838PEDCliObsL = (byte)(localUtil.ctol( httpContext.cgiGet( edtPEDCliObsL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12839PEDCLiObsT = httpContext.cgiGet( edtPEDCLiObsT_Internalname) ;
      n12839PEDCLiObsT = false ;
      GXCCtl = "Z12838PEDCliObsL_" + sGXsfl_164_idx ;
      Z12838PEDCliObsL = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12839PEDCLiObsT_" + sGXsfl_164_idx ;
      Z12839PEDCLiObsT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1764_" + sGXsfl_164_idx ;
      nRcdDeleted_1764 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1764_" + sGXsfl_164_idx ;
      nRcdExists_1764 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1764_" + sGXsfl_164_idx ;
      nIsMod_1764 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPEDCliObsL_Enabled = edtPEDCliObsL_Enabled ;
      defedtPEDCliNpz_Enabled = edtPEDCliNpz_Enabled ;
   }

   public void confirmValues1LH0( )
   {
      nGXsfl_155_idx = 0 ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1551763( ) ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
         sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1551763( ) ;
         httpContext.changePostValue( "Z12828PEDCliNpz_"+sGXsfl_155_idx, httpContext.cgiGet( "ZT_"+"Z12828PEDCliNpz_"+sGXsfl_155_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12828PEDCliNpz_"+sGXsfl_155_idx) ;
         httpContext.changePostValue( "Z12829PEDCliLoc_"+sGXsfl_155_idx, httpContext.cgiGet( "ZT_"+"Z12829PEDCliLoc_"+sGXsfl_155_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12829PEDCliLoc_"+sGXsfl_155_idx) ;
         httpContext.changePostValue( "Z12830PEDCliKg_"+sGXsfl_155_idx, httpContext.cgiGet( "ZT_"+"Z12830PEDCliKg_"+sGXsfl_155_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12830PEDCliKg_"+sGXsfl_155_idx) ;
         httpContext.changePostValue( "Z12831PEDCliMt_"+sGXsfl_155_idx, httpContext.cgiGet( "ZT_"+"Z12831PEDCliMt_"+sGXsfl_155_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12831PEDCliMt_"+sGXsfl_155_idx) ;
      }
      nGXsfl_164_idx = 0 ;
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1641764( ) ;
      while ( nGXsfl_164_idx < nRC_GXsfl_164 )
      {
         nGXsfl_164_idx = (int)(nGXsfl_164_idx+1) ;
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1641764( ) ;
         httpContext.changePostValue( "Z12838PEDCliObsL_"+sGXsfl_164_idx, httpContext.cgiGet( "ZT_"+"Z12838PEDCliObsL_"+sGXsfl_164_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12838PEDCliObsL_"+sGXsfl_164_idx) ;
         httpContext.changePostValue( "Z12839PEDCLiObsT_"+sGXsfl_164_idx, httpContext.cgiGet( "ZT_"+"Z12839PEDCLiObsT_"+sGXsfl_164_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12839PEDCLiObsT_"+sGXsfl_164_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpedcli", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12816PEDCliPed", GXutil.rtrim( Z12816PEDCliPed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12817PEDCliFPed", localUtil.dtoc( Z12817PEDCliFPed, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12818PEDCliFcom", localUtil.dtoc( Z12818PEDCliFcom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12819PEDCliArt", GXutil.rtrim( Z12819PEDCliArt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12820PEDCliEmp", GXutil.rtrim( Z12820PEDCliEmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12822PEDCliCoNm", GXutil.rtrim( Z12822PEDCliCoNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12823PEDCliCoNu", GXutil.ltrim( localUtil.ntoc( Z12823PEDCliCoNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12824PEDCliAnc", GXutil.ltrim( localUtil.ntoc( Z12824PEDCliAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12825PEDCliRdto", GXutil.ltrim( localUtil.ntoc( Z12825PEDCliRdto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12826PEDCliGrm2", GXutil.ltrim( localUtil.ntoc( Z12826PEDCliGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12827PEDCliObs", Z12827PEDCliObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12832PEDCliEst", GXutil.ltrim( localUtil.ntoc( Z12832PEDCliEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12815PEDCliID", GXutil.ltrim( localUtil.ntoc( Z12815PEDCliID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12833PEDCliKgs", GXutil.ltrim( localUtil.ntoc( Z12833PEDCliKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12834PEDCliMts", GXutil.ltrim( localUtil.ntoc( Z12834PEDCliMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12836PEDCliPzs", GXutil.ltrim( localUtil.ntoc( Z12836PEDCliPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12835PEDCliArtA", GXutil.rtrim( Z12835PEDCliArtA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12837PEDCLiObsU", GXutil.ltrim( localUtil.ntoc( Z12837PEDCLiObsU, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12852PEDCLiPTra", GXutil.rtrim( Z12852PEDCLiPTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12853PEDCLiPorc", GXutil.rtrim( Z12853PEDCLiPorc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12854PEDCLiOF", GXutil.rtrim( Z12854PEDCLiOF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12855PEDCLiNAlb", GXutil.ltrim( localUtil.ntoc( Z12855PEDCLiNAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12856PEDCLiProc", GXutil.rtrim( Z12856PEDCLiProc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_155", GXutil.ltrim( localUtil.ntoc( nGXsfl_155_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_164", GXutil.ltrim( localUtil.ntoc( nGXsfl_164_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpedcli", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPEDCLi" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Pedidos Clientes", "") ;
   }

   public void initializeNonKey1LH1762( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A12817PEDCliFPed = GXutil.nullDate() ;
      n12817PEDCliFPed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12817PEDCliFPed", localUtil.format(A12817PEDCliFPed, "99/99/99"));
      A12818PEDCliFcom = GXutil.nullDate() ;
      n12818PEDCliFcom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12818PEDCliFcom", localUtil.format(A12818PEDCliFcom, "99/99/99"));
      A12819PEDCliArt = "" ;
      n12819PEDCliArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12819PEDCliArt", A12819PEDCliArt);
      A12820PEDCliEmp = "" ;
      n12820PEDCliEmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12820PEDCliEmp", A12820PEDCliEmp);
      A12822PEDCliCoNm = "" ;
      n12822PEDCliCoNm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12822PEDCliCoNm", A12822PEDCliCoNm);
      A12823PEDCliCoNu = 0 ;
      n12823PEDCliCoNu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12823PEDCliCoNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12823PEDCliCoNu), 6, 0));
      A12824PEDCliAnc = (short)(0) ;
      n12824PEDCliAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12824PEDCliAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12824PEDCliAnc), 3, 0));
      A12825PEDCliRdto = DecimalUtil.ZERO ;
      n12825PEDCliRdto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12825PEDCliRdto", GXutil.ltrimstr( A12825PEDCliRdto, 6, 2));
      A12826PEDCliGrm2 = (short)(0) ;
      n12826PEDCliGrm2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12826PEDCliGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12826PEDCliGrm2), 4, 0));
      A12827PEDCliObs = "" ;
      n12827PEDCliObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12827PEDCliObs", A12827PEDCliObs);
      A12832PEDCliEst = (byte)(0) ;
      n12832PEDCliEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12832PEDCliEst", GXutil.str( A12832PEDCliEst, 1, 0));
      A12815PEDCliID = 0 ;
      n12815PEDCliID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12815PEDCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12815PEDCliID), 8, 0));
      A12833PEDCliKgs = DecimalUtil.ZERO ;
      n12833PEDCliKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12833PEDCliKgs", GXutil.ltrimstr( A12833PEDCliKgs, 9, 2));
      A12834PEDCliMts = DecimalUtil.ZERO ;
      n12834PEDCliMts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12834PEDCliMts", GXutil.ltrimstr( A12834PEDCliMts, 9, 2));
      A12836PEDCliPzs = 0 ;
      n12836PEDCliPzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12836PEDCliPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12836PEDCliPzs), 6, 0));
      A12835PEDCliArtA = "" ;
      n12835PEDCliArtA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12835PEDCliArtA", A12835PEDCliArtA);
      A12837PEDCLiObsU = (byte)(0) ;
      n12837PEDCLiObsU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12837PEDCLiObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12837PEDCLiObsU), 2, 0));
      A12852PEDCLiPTra = "" ;
      n12852PEDCLiPTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12852PEDCLiPTra", A12852PEDCLiPTra);
      A12853PEDCLiPorc = "" ;
      n12853PEDCLiPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12853PEDCLiPorc", A12853PEDCLiPorc);
      A12854PEDCLiOF = "" ;
      n12854PEDCLiOF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12854PEDCLiOF", A12854PEDCLiOF);
      A12855PEDCLiNAlb = 0 ;
      n12855PEDCLiNAlb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12855PEDCLiNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12855PEDCLiNAlb), 8, 0));
      A12856PEDCLiProc = "" ;
      n12856PEDCLiProc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12856PEDCLiProc", A12856PEDCLiProc);
      Z12817PEDCliFPed = GXutil.nullDate() ;
      Z12818PEDCliFcom = GXutil.nullDate() ;
      Z12819PEDCliArt = "" ;
      Z12820PEDCliEmp = "" ;
      Z12822PEDCliCoNm = "" ;
      Z12823PEDCliCoNu = 0 ;
      Z12824PEDCliAnc = (short)(0) ;
      Z12825PEDCliRdto = DecimalUtil.ZERO ;
      Z12826PEDCliGrm2 = (short)(0) ;
      Z12827PEDCliObs = "" ;
      Z12832PEDCliEst = (byte)(0) ;
      Z12815PEDCliID = 0 ;
      Z12833PEDCliKgs = DecimalUtil.ZERO ;
      Z12834PEDCliMts = DecimalUtil.ZERO ;
      Z12836PEDCliPzs = 0 ;
      Z12835PEDCliArtA = "" ;
      Z12837PEDCLiObsU = (byte)(0) ;
      Z12852PEDCLiPTra = "" ;
      Z12853PEDCLiPorc = "" ;
      Z12854PEDCLiOF = "" ;
      Z12855PEDCLiNAlb = 0 ;
      Z12856PEDCLiProc = "" ;
   }

   public void initAll1LH1762( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A12816PEDCliPed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12816PEDCliPed", A12816PEDCliPed);
      initializeNonKey1LH1762( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LH1763( )
   {
      A12829PEDCliLoc = "" ;
      n12829PEDCliLoc = false ;
      A12830PEDCliKg = DecimalUtil.ZERO ;
      n12830PEDCliKg = false ;
      A12831PEDCliMt = DecimalUtil.ZERO ;
      n12831PEDCliMt = false ;
      Z12829PEDCliLoc = "" ;
      Z12830PEDCliKg = DecimalUtil.ZERO ;
      Z12831PEDCliMt = DecimalUtil.ZERO ;
   }

   public void initAll1LH1763( )
   {
      A12828PEDCliNpz = "" ;
      initializeNonKey1LH1763( ) ;
   }

   public void standaloneModalInsert1LH1763( )
   {
   }

   public void initializeNonKey1LH1764( )
   {
      A12839PEDCLiObsT = "" ;
      n12839PEDCLiObsT = false ;
      Z12839PEDCLiObsT = "" ;
   }

   public void initAll1LH1764( )
   {
      A12838PEDCliObsL = (byte)(0) ;
      initializeNonKey1LH1764( ) ;
   }

   public void standaloneModalInsert1LH1764( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241591784", true, true);
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
      httpContext.AddJavascriptSource("tpedcli.js", "?20268241591784", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1763( )
   {
      edtPEDCliNpz_Enabled = defedtPEDCliNpz_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliNpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliNpz_Enabled), 5, 0), !bGXsfl_155_Refreshing);
   }

   public void init_level_properties1764( )
   {
      edtPEDCliObsL_Enabled = defedtPEDCliObsL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDCliObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDCliObsL_Enabled), 5, 0), !bGXsfl_164_Refreshing);
   }

   public void startgridcontrol155( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1763, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1763_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12828PEDCliNpz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliNpz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12829PEDCliLoc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12830PEDCliKg, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12831PEDCliMt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol164( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1764, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1764_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12838PEDCliObsL, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCliObsL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A12839PEDCLiObsT));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEDCLiObsT_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPEDCliPed_Internalname = "PEDCLIPED" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPEDCliFPed_Internalname = "PEDCLIFPED" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPEDCliFcom_Internalname = "PEDCLIFCOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPEDCliArt_Internalname = "PEDCLIART" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPEDCliEmp_Internalname = "PEDCLIEMP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPEDCliCoNm_Internalname = "PEDCLICONM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPEDCliCoNu_Internalname = "PEDCLICONU" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPEDCliAnc_Internalname = "PEDCLIANC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPEDCliRdto_Internalname = "PEDCLIRDTO" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtPEDCliGrm2_Internalname = "PEDCLIGRM2" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtPEDCliObs_Internalname = "PEDCLIOBS" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtPEDCliEst_Internalname = "PEDCLIEST" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtPEDCliID_Internalname = "PEDCLIID" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtPEDCliKgs_Internalname = "PEDCLIKGS" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtPEDCliMts_Internalname = "PEDCLIMTS" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtPEDCliPzs_Internalname = "PEDCLIPZS" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtPEDCliArtA_Internalname = "PEDCLIARTA" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtPEDCLiObsU_Internalname = "PEDCLIOBSU" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtPEDCLiPTra_Internalname = "PEDCLIPTRA" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtPEDCLiPorc_Internalname = "PEDCLIPORC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtPEDCLiOF_Internalname = "PEDCLIOF" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtPEDCLiNAlb_Internalname = "PEDCLINALB" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtPEDCLiProc_Internalname = "PEDCLIPROC" ;
      edtavnRcdDeleted_1763_Internalname = "vNRCDDELETED_1763" ;
      edtPEDCliNpz_Internalname = "PEDCLINPZ" ;
      edtPEDCliLoc_Internalname = "PEDCLILOC" ;
      edtPEDCliKg_Internalname = "PEDCLIKG" ;
      edtPEDCliMt_Internalname = "PEDCLIMT" ;
      edtavnRcdDeleted_1764_Internalname = "vNRCDDELETED_1764" ;
      edtPEDCliObsL_Internalname = "PEDCLIOBSL" ;
      edtPEDCLiObsT_Internalname = "PEDCLIOBST" ;
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
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tabla Pedidos Clientes", "") );
      edtPEDCLiObsT_Jsonclick = "" ;
      edtPEDCliObsL_Jsonclick = "" ;
      edtavnRcdDeleted_1764_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtPEDCliMt_Jsonclick = "" ;
      edtPEDCliKg_Jsonclick = "" ;
      edtPEDCliLoc_Jsonclick = "" ;
      edtPEDCliNpz_Jsonclick = "" ;
      edtavnRcdDeleted_1763_Jsonclick = "" ;
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
      edtPEDCLiObsT_Enabled = 1 ;
      edtPEDCliObsL_Enabled = 1 ;
      edtavnRcdDeleted_1764_Enabled = 1 ;
      edtPEDCliMt_Enabled = 1 ;
      edtPEDCliKg_Enabled = 1 ;
      edtPEDCliLoc_Enabled = 1 ;
      edtPEDCliNpz_Enabled = 1 ;
      edtavnRcdDeleted_1763_Enabled = 1 ;
      edtPEDCLiProc_Jsonclick = "" ;
      edtPEDCLiProc_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCLiProc_Enabled = 1 ;
      edtPEDCLiNAlb_Jsonclick = "" ;
      edtPEDCLiNAlb_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCLiNAlb_Enabled = 1 ;
      edtPEDCLiOF_Jsonclick = "" ;
      edtPEDCLiOF_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCLiOF_Enabled = 1 ;
      edtPEDCLiPorc_Jsonclick = "" ;
      edtPEDCLiPorc_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCLiPorc_Enabled = 1 ;
      edtPEDCLiPTra_Jsonclick = "" ;
      edtPEDCLiPTra_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCLiPTra_Enabled = 1 ;
      edtPEDCLiObsU_Jsonclick = "" ;
      edtPEDCLiObsU_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCLiObsU_Enabled = 1 ;
      edtPEDCliArtA_Jsonclick = "" ;
      edtPEDCliArtA_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliArtA_Enabled = 1 ;
      edtPEDCliPzs_Jsonclick = "" ;
      edtPEDCliPzs_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliPzs_Enabled = 1 ;
      edtPEDCliMts_Jsonclick = "" ;
      edtPEDCliMts_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliMts_Enabled = 1 ;
      edtPEDCliKgs_Jsonclick = "" ;
      edtPEDCliKgs_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliKgs_Enabled = 1 ;
      edtPEDCliID_Jsonclick = "" ;
      edtPEDCliID_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliID_Enabled = 1 ;
      edtPEDCliEst_Jsonclick = "" ;
      edtPEDCliEst_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliEst_Enabled = 1 ;
      edtPEDCliObs_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliObs_Enabled = 1 ;
      edtPEDCliGrm2_Jsonclick = "" ;
      edtPEDCliGrm2_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliGrm2_Enabled = 1 ;
      edtPEDCliRdto_Jsonclick = "" ;
      edtPEDCliRdto_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliRdto_Enabled = 1 ;
      edtPEDCliAnc_Jsonclick = "" ;
      edtPEDCliAnc_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliAnc_Enabled = 1 ;
      edtPEDCliCoNu_Jsonclick = "" ;
      edtPEDCliCoNu_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliCoNu_Enabled = 1 ;
      edtPEDCliCoNm_Jsonclick = "" ;
      edtPEDCliCoNm_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliCoNm_Enabled = 1 ;
      edtPEDCliEmp_Jsonclick = "" ;
      edtPEDCliEmp_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliEmp_Enabled = 1 ;
      edtPEDCliArt_Jsonclick = "" ;
      edtPEDCliArt_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliArt_Enabled = 1 ;
      edtPEDCliFcom_Jsonclick = "" ;
      edtPEDCliFcom_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliFcom_Enabled = 1 ;
      edtPEDCliFPed_Jsonclick = "" ;
      edtPEDCliFPed_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliFPed_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPEDCliPed_Jsonclick = "" ;
      edtPEDCliPed_Backcolor = (int)(0xFFFFFF) ;
      edtPEDCliPed_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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
      subsflControlProps_1551763( ) ;
      while ( nGXsfl_155_idx <= nRC_GXsfl_155 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LH1763( ) ;
         standaloneModal1LH1763( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LH1763( ) ;
         nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
         sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1551763( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1641764( ) ;
      while ( nGXsfl_164_idx <= nRC_GXsfl_164 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LH1764( ) ;
         standaloneModal1LH1764( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LH1764( ) ;
         nGXsfl_164_idx = (int)(nGXsfl_164_idx+1) ;
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1641764( ) ;
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
      /* Using cursor T01LH32 */
      pr_default.execute(30, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LH32_A407EmprNom[0] ;
      n407EmprNom = T01LH32_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(30);
      /* Using cursor T01LH18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LH18_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(16);
      GX_FocusControl = edtPEDCliFPed_Internalname ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01LH18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01LH18_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Pedcliped( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12817PEDCliFPed", localUtil.format(A12817PEDCliFPed, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12818PEDCliFcom", localUtil.format(A12818PEDCliFcom, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12819PEDCliArt", GXutil.rtrim( A12819PEDCliArt));
      httpContext.ajax_rsp_assign_attri("", false, "A12820PEDCliEmp", GXutil.rtrim( A12820PEDCliEmp));
      httpContext.ajax_rsp_assign_attri("", false, "A12822PEDCliCoNm", GXutil.rtrim( A12822PEDCliCoNm));
      httpContext.ajax_rsp_assign_attri("", false, "A12823PEDCliCoNu", GXutil.ltrim( localUtil.ntoc( A12823PEDCliCoNu, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12824PEDCliAnc", GXutil.ltrim( localUtil.ntoc( A12824PEDCliAnc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12825PEDCliRdto", GXutil.ltrim( localUtil.ntoc( A12825PEDCliRdto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12826PEDCliGrm2", GXutil.ltrim( localUtil.ntoc( A12826PEDCliGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12827PEDCliObs", A12827PEDCliObs);
      httpContext.ajax_rsp_assign_attri("", false, "A12832PEDCliEst", GXutil.ltrim( localUtil.ntoc( A12832PEDCliEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12815PEDCliID", GXutil.ltrim( localUtil.ntoc( A12815PEDCliID, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12833PEDCliKgs", GXutil.ltrim( localUtil.ntoc( A12833PEDCliKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12834PEDCliMts", GXutil.ltrim( localUtil.ntoc( A12834PEDCliMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12836PEDCliPzs", GXutil.ltrim( localUtil.ntoc( A12836PEDCliPzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12835PEDCliArtA", GXutil.rtrim( A12835PEDCliArtA));
      httpContext.ajax_rsp_assign_attri("", false, "A12837PEDCLiObsU", GXutil.ltrim( localUtil.ntoc( A12837PEDCLiObsU, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12852PEDCLiPTra", GXutil.rtrim( A12852PEDCLiPTra));
      httpContext.ajax_rsp_assign_attri("", false, "A12853PEDCLiPorc", GXutil.rtrim( A12853PEDCLiPorc));
      httpContext.ajax_rsp_assign_attri("", false, "A12854PEDCLiOF", GXutil.rtrim( A12854PEDCLiOF));
      httpContext.ajax_rsp_assign_attri("", false, "A12855PEDCLiNAlb", GXutil.ltrim( localUtil.ntoc( A12855PEDCLiNAlb, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12856PEDCLiProc", GXutil.rtrim( A12856PEDCLiProc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12816PEDCliPed", GXutil.rtrim( Z12816PEDCliPed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12817PEDCliFPed", localUtil.format(Z12817PEDCliFPed, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12818PEDCliFcom", localUtil.format(Z12818PEDCliFcom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12819PEDCliArt", GXutil.rtrim( Z12819PEDCliArt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12820PEDCliEmp", GXutil.rtrim( Z12820PEDCliEmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12822PEDCliCoNm", GXutil.rtrim( Z12822PEDCliCoNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12823PEDCliCoNu", GXutil.ltrim( localUtil.ntoc( Z12823PEDCliCoNu, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12824PEDCliAnc", GXutil.ltrim( localUtil.ntoc( Z12824PEDCliAnc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12825PEDCliRdto", GXutil.ltrim( localUtil.ntoc( Z12825PEDCliRdto, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12826PEDCliGrm2", GXutil.ltrim( localUtil.ntoc( Z12826PEDCliGrm2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12827PEDCliObs", Z12827PEDCliObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12832PEDCliEst", GXutil.ltrim( localUtil.ntoc( Z12832PEDCliEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12815PEDCliID", GXutil.ltrim( localUtil.ntoc( Z12815PEDCliID, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12833PEDCliKgs", GXutil.ltrim( localUtil.ntoc( Z12833PEDCliKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12834PEDCliMts", GXutil.ltrim( localUtil.ntoc( Z12834PEDCliMts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12836PEDCliPzs", GXutil.ltrim( localUtil.ntoc( Z12836PEDCliPzs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12835PEDCliArtA", GXutil.rtrim( Z12835PEDCliArtA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12837PEDCLiObsU", GXutil.ltrim( localUtil.ntoc( Z12837PEDCLiObsU, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12852PEDCLiPTra", GXutil.rtrim( Z12852PEDCLiPTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12853PEDCLiPorc", GXutil.rtrim( Z12853PEDCLiPorc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12854PEDCLiOF", GXutil.rtrim( Z12854PEDCLiOF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12855PEDCLiNAlb", GXutil.ltrim( localUtil.ntoc( Z12855PEDCLiNAlb, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12856PEDCLiProc", GXutil.rtrim( Z12856PEDCLiProc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_PEDCLIPED","{handler:'valid_Pedcliped',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A12816PEDCliPed',fld:'PEDCLIPED',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PEDCLIPED",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12817PEDCliFPed',fld:'PEDCLIFPED',pic:''},{av:'A12818PEDCliFcom',fld:'PEDCLIFCOM',pic:''},{av:'A12819PEDCliArt',fld:'PEDCLIART',pic:''},{av:'A12820PEDCliEmp',fld:'PEDCLIEMP',pic:''},{av:'A12822PEDCliCoNm',fld:'PEDCLICONM',pic:''},{av:'A12823PEDCliCoNu',fld:'PEDCLICONU',pic:'ZZZZZ9'},{av:'A12824PEDCliAnc',fld:'PEDCLIANC',pic:'ZZ9'},{av:'A12825PEDCliRdto',fld:'PEDCLIRDTO',pic:'ZZ9.99'},{av:'A12826PEDCliGrm2',fld:'PEDCLIGRM2',pic:'ZZZ9'},{av:'A12827PEDCliObs',fld:'PEDCLIOBS',pic:''},{av:'A12832PEDCliEst',fld:'PEDCLIEST',pic:'9'},{av:'A12815PEDCliID',fld:'PEDCLIID',pic:'ZZZZZZZ9'},{av:'A12833PEDCliKgs',fld:'PEDCLIKGS',pic:'ZZZZZ9.99'},{av:'A12834PEDCliMts',fld:'PEDCLIMTS',pic:'ZZZZZ9.99'},{av:'A12836PEDCliPzs',fld:'PEDCLIPZS',pic:'ZZZZZ9'},{av:'A12835PEDCliArtA',fld:'PEDCLIARTA',pic:''},{av:'A12837PEDCLiObsU',fld:'PEDCLIOBSU',pic:'Z9'},{av:'A12852PEDCLiPTra',fld:'PEDCLIPTRA',pic:''},{av:'A12853PEDCLiPorc',fld:'PEDCLIPORC',pic:''},{av:'A12854PEDCLiOF',fld:'PEDCLIOF',pic:''},{av:'A12855PEDCLiNAlb',fld:'PEDCLINALB',pic:'ZZZZZZZ9'},{av:'A12856PEDCLiProc',fld:'PEDCLIPROC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z12816PEDCliPed'},{av:'Z407EmprNom'},{av:'Z12817PEDCliFPed'},{av:'Z12818PEDCliFcom'},{av:'Z12819PEDCliArt'},{av:'Z12820PEDCliEmp'},{av:'Z12822PEDCliCoNm'},{av:'Z12823PEDCliCoNu'},{av:'Z12824PEDCliAnc'},{av:'Z12825PEDCliRdto'},{av:'Z12826PEDCliGrm2'},{av:'Z12827PEDCliObs'},{av:'Z12832PEDCliEst'},{av:'Z12815PEDCliID'},{av:'Z12833PEDCliKgs'},{av:'Z12834PEDCliMts'},{av:'Z12836PEDCliPzs'},{av:'Z12835PEDCliArtA'},{av:'Z12837PEDCLiObsU'},{av:'Z12852PEDCLiPTra'},{av:'Z12853PEDCLiPorc'},{av:'Z12854PEDCLiOF'},{av:'Z12855PEDCLiNAlb'},{av:'Z12856PEDCLiProc'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PEDCLINPZ","{handler:'valid_Pedclinpz',iparms:[]");
      setEventMetadata("VALID_PEDCLINPZ",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pedclimt',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_PEDCLIOBSL","{handler:'valid_Pedcliobsl',iparms:[]");
      setEventMetadata("VALID_PEDCLIOBSL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pedcliobst',iparms:[]");
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
      pr_default.close(30);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12816PEDCliPed = "" ;
      Z12817PEDCliFPed = GXutil.nullDate() ;
      Z12818PEDCliFcom = GXutil.nullDate() ;
      Z12819PEDCliArt = "" ;
      Z12820PEDCliEmp = "" ;
      Z12822PEDCliCoNm = "" ;
      Z12825PEDCliRdto = DecimalUtil.ZERO ;
      Z12827PEDCliObs = "" ;
      Z12833PEDCliKgs = DecimalUtil.ZERO ;
      Z12834PEDCliMts = DecimalUtil.ZERO ;
      Z12835PEDCliArtA = "" ;
      Z12852PEDCLiPTra = "" ;
      Z12853PEDCLiPorc = "" ;
      Z12854PEDCLiOF = "" ;
      Z12856PEDCLiProc = "" ;
      Z12828PEDCliNpz = "" ;
      Z12829PEDCliLoc = "" ;
      Z12830PEDCliKg = DecimalUtil.ZERO ;
      Z12831PEDCliMt = DecimalUtil.ZERO ;
      Z12839PEDCLiObsT = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12816PEDCliPed = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12817PEDCliFPed = GXutil.nullDate() ;
      lblTextblock7_Jsonclick = "" ;
      A12818PEDCliFcom = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A12819PEDCliArt = "" ;
      lblTextblock9_Jsonclick = "" ;
      A12820PEDCliEmp = "" ;
      lblTextblock10_Jsonclick = "" ;
      A12822PEDCliCoNm = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A12825PEDCliRdto = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A12827PEDCliObs = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A12833PEDCliKgs = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A12834PEDCliMts = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A12835PEDCliArtA = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A12852PEDCLiPTra = "" ;
      lblTextblock24_Jsonclick = "" ;
      A12853PEDCLiPorc = "" ;
      lblTextblock25_Jsonclick = "" ;
      A12854PEDCLiOF = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A12856PEDCLiProc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1763 = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1764 = "" ;
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
      sMode1762 = "" ;
      GXCCtl = "" ;
      A12839PEDCLiObsT = "" ;
      A12828PEDCliNpz = "" ;
      A12829PEDCliLoc = "" ;
      A12830PEDCliKg = DecimalUtil.ZERO ;
      A12831PEDCliMt = DecimalUtil.ZERO ;
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
      T01LH8_A407EmprNom = new String[] {""} ;
      T01LH8_n407EmprNom = new boolean[] {false} ;
      T01LH10_A12816PEDCliPed = new String[] {""} ;
      T01LH10_A407EmprNom = new String[] {""} ;
      T01LH10_n407EmprNom = new boolean[] {false} ;
      T01LH10_A279CliNom = new String[] {""} ;
      T01LH10_A12817PEDCliFPed = new java.util.Date[] {GXutil.nullDate()} ;
      T01LH10_n12817PEDCliFPed = new boolean[] {false} ;
      T01LH10_A12818PEDCliFcom = new java.util.Date[] {GXutil.nullDate()} ;
      T01LH10_n12818PEDCliFcom = new boolean[] {false} ;
      T01LH10_A12819PEDCliArt = new String[] {""} ;
      T01LH10_n12819PEDCliArt = new boolean[] {false} ;
      T01LH10_A12820PEDCliEmp = new String[] {""} ;
      T01LH10_n12820PEDCliEmp = new boolean[] {false} ;
      T01LH10_A12822PEDCliCoNm = new String[] {""} ;
      T01LH10_n12822PEDCliCoNm = new boolean[] {false} ;
      T01LH10_A12823PEDCliCoNu = new int[1] ;
      T01LH10_n12823PEDCliCoNu = new boolean[] {false} ;
      T01LH10_A12824PEDCliAnc = new short[1] ;
      T01LH10_n12824PEDCliAnc = new boolean[] {false} ;
      T01LH10_A12825PEDCliRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH10_n12825PEDCliRdto = new boolean[] {false} ;
      T01LH10_A12826PEDCliGrm2 = new short[1] ;
      T01LH10_n12826PEDCliGrm2 = new boolean[] {false} ;
      T01LH10_A12827PEDCliObs = new String[] {""} ;
      T01LH10_n12827PEDCliObs = new boolean[] {false} ;
      T01LH10_A12832PEDCliEst = new byte[1] ;
      T01LH10_n12832PEDCliEst = new boolean[] {false} ;
      T01LH10_A12815PEDCliID = new int[1] ;
      T01LH10_n12815PEDCliID = new boolean[] {false} ;
      T01LH10_A12833PEDCliKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH10_n12833PEDCliKgs = new boolean[] {false} ;
      T01LH10_A12834PEDCliMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH10_n12834PEDCliMts = new boolean[] {false} ;
      T01LH10_A12836PEDCliPzs = new int[1] ;
      T01LH10_n12836PEDCliPzs = new boolean[] {false} ;
      T01LH10_A12835PEDCliArtA = new String[] {""} ;
      T01LH10_n12835PEDCliArtA = new boolean[] {false} ;
      T01LH10_A12837PEDCLiObsU = new byte[1] ;
      T01LH10_n12837PEDCLiObsU = new boolean[] {false} ;
      T01LH10_A12852PEDCLiPTra = new String[] {""} ;
      T01LH10_n12852PEDCLiPTra = new boolean[] {false} ;
      T01LH10_A12853PEDCLiPorc = new String[] {""} ;
      T01LH10_n12853PEDCLiPorc = new boolean[] {false} ;
      T01LH10_A12854PEDCLiOF = new String[] {""} ;
      T01LH10_n12854PEDCLiOF = new boolean[] {false} ;
      T01LH10_A12855PEDCLiNAlb = new int[1] ;
      T01LH10_n12855PEDCLiNAlb = new boolean[] {false} ;
      T01LH10_A12856PEDCLiProc = new String[] {""} ;
      T01LH10_n12856PEDCLiProc = new boolean[] {false} ;
      T01LH10_A396EmprCod = new String[] {""} ;
      T01LH10_A252CliCod = new int[1] ;
      T01LH9_A279CliNom = new String[] {""} ;
      T01LH11_A279CliNom = new String[] {""} ;
      T01LH12_A396EmprCod = new String[] {""} ;
      T01LH12_A252CliCod = new int[1] ;
      T01LH12_A12816PEDCliPed = new String[] {""} ;
      T01LH7_A12816PEDCliPed = new String[] {""} ;
      T01LH7_A12817PEDCliFPed = new java.util.Date[] {GXutil.nullDate()} ;
      T01LH7_n12817PEDCliFPed = new boolean[] {false} ;
      T01LH7_A12818PEDCliFcom = new java.util.Date[] {GXutil.nullDate()} ;
      T01LH7_n12818PEDCliFcom = new boolean[] {false} ;
      T01LH7_A12819PEDCliArt = new String[] {""} ;
      T01LH7_n12819PEDCliArt = new boolean[] {false} ;
      T01LH7_A12820PEDCliEmp = new String[] {""} ;
      T01LH7_n12820PEDCliEmp = new boolean[] {false} ;
      T01LH7_A12822PEDCliCoNm = new String[] {""} ;
      T01LH7_n12822PEDCliCoNm = new boolean[] {false} ;
      T01LH7_A12823PEDCliCoNu = new int[1] ;
      T01LH7_n12823PEDCliCoNu = new boolean[] {false} ;
      T01LH7_A12824PEDCliAnc = new short[1] ;
      T01LH7_n12824PEDCliAnc = new boolean[] {false} ;
      T01LH7_A12825PEDCliRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH7_n12825PEDCliRdto = new boolean[] {false} ;
      T01LH7_A12826PEDCliGrm2 = new short[1] ;
      T01LH7_n12826PEDCliGrm2 = new boolean[] {false} ;
      T01LH7_A12827PEDCliObs = new String[] {""} ;
      T01LH7_n12827PEDCliObs = new boolean[] {false} ;
      T01LH7_A12832PEDCliEst = new byte[1] ;
      T01LH7_n12832PEDCliEst = new boolean[] {false} ;
      T01LH7_A12815PEDCliID = new int[1] ;
      T01LH7_n12815PEDCliID = new boolean[] {false} ;
      T01LH7_A12833PEDCliKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH7_n12833PEDCliKgs = new boolean[] {false} ;
      T01LH7_A12834PEDCliMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH7_n12834PEDCliMts = new boolean[] {false} ;
      T01LH7_A12836PEDCliPzs = new int[1] ;
      T01LH7_n12836PEDCliPzs = new boolean[] {false} ;
      T01LH7_A12835PEDCliArtA = new String[] {""} ;
      T01LH7_n12835PEDCliArtA = new boolean[] {false} ;
      T01LH7_A12837PEDCLiObsU = new byte[1] ;
      T01LH7_n12837PEDCLiObsU = new boolean[] {false} ;
      T01LH7_A12852PEDCLiPTra = new String[] {""} ;
      T01LH7_n12852PEDCLiPTra = new boolean[] {false} ;
      T01LH7_A12853PEDCLiPorc = new String[] {""} ;
      T01LH7_n12853PEDCLiPorc = new boolean[] {false} ;
      T01LH7_A12854PEDCLiOF = new String[] {""} ;
      T01LH7_n12854PEDCLiOF = new boolean[] {false} ;
      T01LH7_A12855PEDCLiNAlb = new int[1] ;
      T01LH7_n12855PEDCLiNAlb = new boolean[] {false} ;
      T01LH7_A12856PEDCLiProc = new String[] {""} ;
      T01LH7_n12856PEDCLiProc = new boolean[] {false} ;
      T01LH7_A396EmprCod = new String[] {""} ;
      T01LH7_A252CliCod = new int[1] ;
      T01LH13_A396EmprCod = new String[] {""} ;
      T01LH13_A252CliCod = new int[1] ;
      T01LH13_A12816PEDCliPed = new String[] {""} ;
      T01LH14_A396EmprCod = new String[] {""} ;
      T01LH14_A252CliCod = new int[1] ;
      T01LH14_A12816PEDCliPed = new String[] {""} ;
      T01LH6_A12816PEDCliPed = new String[] {""} ;
      T01LH6_A12817PEDCliFPed = new java.util.Date[] {GXutil.nullDate()} ;
      T01LH6_n12817PEDCliFPed = new boolean[] {false} ;
      T01LH6_A12818PEDCliFcom = new java.util.Date[] {GXutil.nullDate()} ;
      T01LH6_n12818PEDCliFcom = new boolean[] {false} ;
      T01LH6_A12819PEDCliArt = new String[] {""} ;
      T01LH6_n12819PEDCliArt = new boolean[] {false} ;
      T01LH6_A12820PEDCliEmp = new String[] {""} ;
      T01LH6_n12820PEDCliEmp = new boolean[] {false} ;
      T01LH6_A12822PEDCliCoNm = new String[] {""} ;
      T01LH6_n12822PEDCliCoNm = new boolean[] {false} ;
      T01LH6_A12823PEDCliCoNu = new int[1] ;
      T01LH6_n12823PEDCliCoNu = new boolean[] {false} ;
      T01LH6_A12824PEDCliAnc = new short[1] ;
      T01LH6_n12824PEDCliAnc = new boolean[] {false} ;
      T01LH6_A12825PEDCliRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH6_n12825PEDCliRdto = new boolean[] {false} ;
      T01LH6_A12826PEDCliGrm2 = new short[1] ;
      T01LH6_n12826PEDCliGrm2 = new boolean[] {false} ;
      T01LH6_A12827PEDCliObs = new String[] {""} ;
      T01LH6_n12827PEDCliObs = new boolean[] {false} ;
      T01LH6_A12832PEDCliEst = new byte[1] ;
      T01LH6_n12832PEDCliEst = new boolean[] {false} ;
      T01LH6_A12815PEDCliID = new int[1] ;
      T01LH6_n12815PEDCliID = new boolean[] {false} ;
      T01LH6_A12833PEDCliKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH6_n12833PEDCliKgs = new boolean[] {false} ;
      T01LH6_A12834PEDCliMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH6_n12834PEDCliMts = new boolean[] {false} ;
      T01LH6_A12836PEDCliPzs = new int[1] ;
      T01LH6_n12836PEDCliPzs = new boolean[] {false} ;
      T01LH6_A12835PEDCliArtA = new String[] {""} ;
      T01LH6_n12835PEDCliArtA = new boolean[] {false} ;
      T01LH6_A12837PEDCLiObsU = new byte[1] ;
      T01LH6_n12837PEDCLiObsU = new boolean[] {false} ;
      T01LH6_A12852PEDCLiPTra = new String[] {""} ;
      T01LH6_n12852PEDCLiPTra = new boolean[] {false} ;
      T01LH6_A12853PEDCLiPorc = new String[] {""} ;
      T01LH6_n12853PEDCLiPorc = new boolean[] {false} ;
      T01LH6_A12854PEDCLiOF = new String[] {""} ;
      T01LH6_n12854PEDCLiOF = new boolean[] {false} ;
      T01LH6_A12855PEDCLiNAlb = new int[1] ;
      T01LH6_n12855PEDCLiNAlb = new boolean[] {false} ;
      T01LH6_A12856PEDCLiProc = new String[] {""} ;
      T01LH6_n12856PEDCLiProc = new boolean[] {false} ;
      T01LH6_A396EmprCod = new String[] {""} ;
      T01LH6_A252CliCod = new int[1] ;
      T01LH18_A279CliNom = new String[] {""} ;
      T01LH19_A396EmprCod = new String[] {""} ;
      T01LH19_A252CliCod = new int[1] ;
      T01LH19_A12816PEDCliPed = new String[] {""} ;
      T01LH20_A252CliCod = new int[1] ;
      T01LH20_A12816PEDCliPed = new String[] {""} ;
      T01LH20_A12828PEDCliNpz = new String[] {""} ;
      T01LH20_A12829PEDCliLoc = new String[] {""} ;
      T01LH20_n12829PEDCliLoc = new boolean[] {false} ;
      T01LH20_A12830PEDCliKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH20_n12830PEDCliKg = new boolean[] {false} ;
      T01LH20_A12831PEDCliMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH20_n12831PEDCliMt = new boolean[] {false} ;
      T01LH20_A396EmprCod = new String[] {""} ;
      T01LH21_A396EmprCod = new String[] {""} ;
      T01LH21_A252CliCod = new int[1] ;
      T01LH21_A12816PEDCliPed = new String[] {""} ;
      T01LH21_A12828PEDCliNpz = new String[] {""} ;
      T01LH5_A252CliCod = new int[1] ;
      T01LH5_A12816PEDCliPed = new String[] {""} ;
      T01LH5_A12828PEDCliNpz = new String[] {""} ;
      T01LH5_A12829PEDCliLoc = new String[] {""} ;
      T01LH5_n12829PEDCliLoc = new boolean[] {false} ;
      T01LH5_A12830PEDCliKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH5_n12830PEDCliKg = new boolean[] {false} ;
      T01LH5_A12831PEDCliMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH5_n12831PEDCliMt = new boolean[] {false} ;
      T01LH5_A396EmprCod = new String[] {""} ;
      T01LH4_A252CliCod = new int[1] ;
      T01LH4_A12816PEDCliPed = new String[] {""} ;
      T01LH4_A12828PEDCliNpz = new String[] {""} ;
      T01LH4_A12829PEDCliLoc = new String[] {""} ;
      T01LH4_n12829PEDCliLoc = new boolean[] {false} ;
      T01LH4_A12830PEDCliKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH4_n12830PEDCliKg = new boolean[] {false} ;
      T01LH4_A12831PEDCliMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LH4_n12831PEDCliMt = new boolean[] {false} ;
      T01LH4_A396EmprCod = new String[] {""} ;
      T01LH25_A396EmprCod = new String[] {""} ;
      T01LH25_A252CliCod = new int[1] ;
      T01LH25_A12816PEDCliPed = new String[] {""} ;
      T01LH25_A12828PEDCliNpz = new String[] {""} ;
      T01LH26_A252CliCod = new int[1] ;
      T01LH26_A12816PEDCliPed = new String[] {""} ;
      T01LH26_A12838PEDCliObsL = new byte[1] ;
      T01LH26_A12839PEDCLiObsT = new String[] {""} ;
      T01LH26_n12839PEDCLiObsT = new boolean[] {false} ;
      T01LH26_A396EmprCod = new String[] {""} ;
      T01LH27_A396EmprCod = new String[] {""} ;
      T01LH27_A252CliCod = new int[1] ;
      T01LH27_A12816PEDCliPed = new String[] {""} ;
      T01LH27_A12838PEDCliObsL = new byte[1] ;
      T01LH3_A252CliCod = new int[1] ;
      T01LH3_A12816PEDCliPed = new String[] {""} ;
      T01LH3_A12838PEDCliObsL = new byte[1] ;
      T01LH3_A12839PEDCLiObsT = new String[] {""} ;
      T01LH3_n12839PEDCLiObsT = new boolean[] {false} ;
      T01LH3_A396EmprCod = new String[] {""} ;
      T01LH2_A252CliCod = new int[1] ;
      T01LH2_A12816PEDCliPed = new String[] {""} ;
      T01LH2_A12838PEDCliObsL = new byte[1] ;
      T01LH2_A12839PEDCLiObsT = new String[] {""} ;
      T01LH2_n12839PEDCLiObsT = new boolean[] {false} ;
      T01LH2_A396EmprCod = new String[] {""} ;
      T01LH31_A396EmprCod = new String[] {""} ;
      T01LH31_A252CliCod = new int[1] ;
      T01LH31_A12816PEDCliPed = new String[] {""} ;
      T01LH31_A12838PEDCliObsL = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01LH32_A407EmprNom = new String[] {""} ;
      T01LH32_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ12816PEDCliPed = "" ;
      ZZ407EmprNom = "" ;
      ZZ12817PEDCliFPed = GXutil.nullDate() ;
      ZZ12818PEDCliFcom = GXutil.nullDate() ;
      ZZ12819PEDCliArt = "" ;
      ZZ12820PEDCliEmp = "" ;
      ZZ12822PEDCliCoNm = "" ;
      ZZ12825PEDCliRdto = DecimalUtil.ZERO ;
      ZZ12827PEDCliObs = "" ;
      ZZ12833PEDCliKgs = DecimalUtil.ZERO ;
      ZZ12834PEDCliMts = DecimalUtil.ZERO ;
      ZZ12835PEDCliArtA = "" ;
      ZZ12852PEDCLiPTra = "" ;
      ZZ12853PEDCLiPorc = "" ;
      ZZ12854PEDCLiOF = "" ;
      ZZ12856PEDCLiProc = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpedcli__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpedcli__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpedcli__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpedcli__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedcli__default(),
         new Object[] {
             new Object[] {
            T01LH2_A252CliCod, T01LH2_A12816PEDCliPed, T01LH2_A12838PEDCliObsL, T01LH2_A12839PEDCLiObsT, T01LH2_n12839PEDCLiObsT, T01LH2_A396EmprCod
            }
            , new Object[] {
            T01LH3_A252CliCod, T01LH3_A12816PEDCliPed, T01LH3_A12838PEDCliObsL, T01LH3_A12839PEDCLiObsT, T01LH3_n12839PEDCLiObsT, T01LH3_A396EmprCod
            }
            , new Object[] {
            T01LH4_A252CliCod, T01LH4_A12816PEDCliPed, T01LH4_A12828PEDCliNpz, T01LH4_A12829PEDCliLoc, T01LH4_n12829PEDCliLoc, T01LH4_A12830PEDCliKg, T01LH4_n12830PEDCliKg, T01LH4_A12831PEDCliMt, T01LH4_n12831PEDCliMt, T01LH4_A396EmprCod
            }
            , new Object[] {
            T01LH5_A252CliCod, T01LH5_A12816PEDCliPed, T01LH5_A12828PEDCliNpz, T01LH5_A12829PEDCliLoc, T01LH5_n12829PEDCliLoc, T01LH5_A12830PEDCliKg, T01LH5_n12830PEDCliKg, T01LH5_A12831PEDCliMt, T01LH5_n12831PEDCliMt, T01LH5_A396EmprCod
            }
            , new Object[] {
            T01LH6_A12816PEDCliPed, T01LH6_A12817PEDCliFPed, T01LH6_n12817PEDCliFPed, T01LH6_A12818PEDCliFcom, T01LH6_n12818PEDCliFcom, T01LH6_A12819PEDCliArt, T01LH6_n12819PEDCliArt, T01LH6_A12820PEDCliEmp, T01LH6_n12820PEDCliEmp, T01LH6_A12822PEDCliCoNm,
            T01LH6_n12822PEDCliCoNm, T01LH6_A12823PEDCliCoNu, T01LH6_n12823PEDCliCoNu, T01LH6_A12824PEDCliAnc, T01LH6_n12824PEDCliAnc, T01LH6_A12825PEDCliRdto, T01LH6_n12825PEDCliRdto, T01LH6_A12826PEDCliGrm2, T01LH6_n12826PEDCliGrm2, T01LH6_A12827PEDCliObs,
            T01LH6_n12827PEDCliObs, T01LH6_A12832PEDCliEst, T01LH6_n12832PEDCliEst, T01LH6_A12815PEDCliID, T01LH6_n12815PEDCliID, T01LH6_A12833PEDCliKgs, T01LH6_n12833PEDCliKgs, T01LH6_A12834PEDCliMts, T01LH6_n12834PEDCliMts, T01LH6_A12836PEDCliPzs,
            T01LH6_n12836PEDCliPzs, T01LH6_A12835PEDCliArtA, T01LH6_n12835PEDCliArtA, T01LH6_A12837PEDCLiObsU, T01LH6_n12837PEDCLiObsU, T01LH6_A12852PEDCLiPTra, T01LH6_n12852PEDCLiPTra, T01LH6_A12853PEDCLiPorc, T01LH6_n12853PEDCLiPorc, T01LH6_A12854PEDCLiOF,
            T01LH6_n12854PEDCLiOF, T01LH6_A12855PEDCLiNAlb, T01LH6_n12855PEDCLiNAlb, T01LH6_A12856PEDCLiProc, T01LH6_n12856PEDCLiProc, T01LH6_A396EmprCod, T01LH6_A252CliCod
            }
            , new Object[] {
            T01LH7_A12816PEDCliPed, T01LH7_A12817PEDCliFPed, T01LH7_n12817PEDCliFPed, T01LH7_A12818PEDCliFcom, T01LH7_n12818PEDCliFcom, T01LH7_A12819PEDCliArt, T01LH7_n12819PEDCliArt, T01LH7_A12820PEDCliEmp, T01LH7_n12820PEDCliEmp, T01LH7_A12822PEDCliCoNm,
            T01LH7_n12822PEDCliCoNm, T01LH7_A12823PEDCliCoNu, T01LH7_n12823PEDCliCoNu, T01LH7_A12824PEDCliAnc, T01LH7_n12824PEDCliAnc, T01LH7_A12825PEDCliRdto, T01LH7_n12825PEDCliRdto, T01LH7_A12826PEDCliGrm2, T01LH7_n12826PEDCliGrm2, T01LH7_A12827PEDCliObs,
            T01LH7_n12827PEDCliObs, T01LH7_A12832PEDCliEst, T01LH7_n12832PEDCliEst, T01LH7_A12815PEDCliID, T01LH7_n12815PEDCliID, T01LH7_A12833PEDCliKgs, T01LH7_n12833PEDCliKgs, T01LH7_A12834PEDCliMts, T01LH7_n12834PEDCliMts, T01LH7_A12836PEDCliPzs,
            T01LH7_n12836PEDCliPzs, T01LH7_A12835PEDCliArtA, T01LH7_n12835PEDCliArtA, T01LH7_A12837PEDCLiObsU, T01LH7_n12837PEDCLiObsU, T01LH7_A12852PEDCLiPTra, T01LH7_n12852PEDCLiPTra, T01LH7_A12853PEDCLiPorc, T01LH7_n12853PEDCLiPorc, T01LH7_A12854PEDCLiOF,
            T01LH7_n12854PEDCLiOF, T01LH7_A12855PEDCLiNAlb, T01LH7_n12855PEDCLiNAlb, T01LH7_A12856PEDCLiProc, T01LH7_n12856PEDCLiProc, T01LH7_A396EmprCod, T01LH7_A252CliCod
            }
            , new Object[] {
            T01LH8_A407EmprNom, T01LH8_n407EmprNom
            }
            , new Object[] {
            T01LH9_A279CliNom
            }
            , new Object[] {
            T01LH10_A12816PEDCliPed, T01LH10_A407EmprNom, T01LH10_n407EmprNom, T01LH10_A279CliNom, T01LH10_A12817PEDCliFPed, T01LH10_n12817PEDCliFPed, T01LH10_A12818PEDCliFcom, T01LH10_n12818PEDCliFcom, T01LH10_A12819PEDCliArt, T01LH10_n12819PEDCliArt,
            T01LH10_A12820PEDCliEmp, T01LH10_n12820PEDCliEmp, T01LH10_A12822PEDCliCoNm, T01LH10_n12822PEDCliCoNm, T01LH10_A12823PEDCliCoNu, T01LH10_n12823PEDCliCoNu, T01LH10_A12824PEDCliAnc, T01LH10_n12824PEDCliAnc, T01LH10_A12825PEDCliRdto, T01LH10_n12825PEDCliRdto,
            T01LH10_A12826PEDCliGrm2, T01LH10_n12826PEDCliGrm2, T01LH10_A12827PEDCliObs, T01LH10_n12827PEDCliObs, T01LH10_A12832PEDCliEst, T01LH10_n12832PEDCliEst, T01LH10_A12815PEDCliID, T01LH10_n12815PEDCliID, T01LH10_A12833PEDCliKgs, T01LH10_n12833PEDCliKgs,
            T01LH10_A12834PEDCliMts, T01LH10_n12834PEDCliMts, T01LH10_A12836PEDCliPzs, T01LH10_n12836PEDCliPzs, T01LH10_A12835PEDCliArtA, T01LH10_n12835PEDCliArtA, T01LH10_A12837PEDCLiObsU, T01LH10_n12837PEDCLiObsU, T01LH10_A12852PEDCLiPTra, T01LH10_n12852PEDCLiPTra,
            T01LH10_A12853PEDCLiPorc, T01LH10_n12853PEDCLiPorc, T01LH10_A12854PEDCLiOF, T01LH10_n12854PEDCLiOF, T01LH10_A12855PEDCLiNAlb, T01LH10_n12855PEDCLiNAlb, T01LH10_A12856PEDCLiProc, T01LH10_n12856PEDCLiProc, T01LH10_A396EmprCod, T01LH10_A252CliCod
            }
            , new Object[] {
            T01LH11_A279CliNom
            }
            , new Object[] {
            T01LH12_A396EmprCod, T01LH12_A252CliCod, T01LH12_A12816PEDCliPed
            }
            , new Object[] {
            T01LH13_A396EmprCod, T01LH13_A252CliCod, T01LH13_A12816PEDCliPed
            }
            , new Object[] {
            T01LH14_A396EmprCod, T01LH14_A252CliCod, T01LH14_A12816PEDCliPed
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LH18_A279CliNom
            }
            , new Object[] {
            T01LH19_A396EmprCod, T01LH19_A252CliCod, T01LH19_A12816PEDCliPed
            }
            , new Object[] {
            T01LH20_A252CliCod, T01LH20_A12816PEDCliPed, T01LH20_A12828PEDCliNpz, T01LH20_A12829PEDCliLoc, T01LH20_n12829PEDCliLoc, T01LH20_A12830PEDCliKg, T01LH20_n12830PEDCliKg, T01LH20_A12831PEDCliMt, T01LH20_n12831PEDCliMt, T01LH20_A396EmprCod
            }
            , new Object[] {
            T01LH21_A396EmprCod, T01LH21_A252CliCod, T01LH21_A12816PEDCliPed, T01LH21_A12828PEDCliNpz
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LH25_A396EmprCod, T01LH25_A252CliCod, T01LH25_A12816PEDCliPed, T01LH25_A12828PEDCliNpz
            }
            , new Object[] {
            T01LH26_A252CliCod, T01LH26_A12816PEDCliPed, T01LH26_A12838PEDCliObsL, T01LH26_A12839PEDCLiObsT, T01LH26_n12839PEDCLiObsT, T01LH26_A396EmprCod
            }
            , new Object[] {
            T01LH27_A396EmprCod, T01LH27_A252CliCod, T01LH27_A12816PEDCliPed, T01LH27_A12838PEDCliObsL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LH31_A396EmprCod, T01LH31_A252CliCod, T01LH31_A12816PEDCliPed, T01LH31_A12838PEDCliObsL
            }
            , new Object[] {
            T01LH32_A407EmprNom, T01LH32_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TPEDCLi" ;
   }

   private byte Z12832PEDCliEst ;
   private byte Z12837PEDCLiObsU ;
   private byte Z12838PEDCliObsL ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12832PEDCliEst ;
   private byte A12837PEDCLiObsU ;
   private byte A12838PEDCliObsL ;
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
   private byte ZZ12832PEDCliEst ;
   private byte ZZ12837PEDCLiObsU ;
   private short Z12824PEDCliAnc ;
   private short Z12826PEDCliGrm2 ;
   private short nRcdDeleted_1763 ;
   private short nRcdExists_1763 ;
   private short nIsMod_1763 ;
   private short nRcdDeleted_1764 ;
   private short nRcdExists_1764 ;
   private short nIsMod_1764 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12824PEDCliAnc ;
   private short A12826PEDCliGrm2 ;
   private short nBlankRcdCount1763 ;
   private short RcdFound1763 ;
   private short nBlankRcdUsr1763 ;
   private short nBlankRcdCount1764 ;
   private short RcdFound1764 ;
   private short nBlankRcdUsr1764 ;
   private short RcdFound1762 ;
   private short nIsDirty_1762 ;
   private short nIsDirty_1763 ;
   private short nIsDirty_1764 ;
   private short ZZ12824PEDCliAnc ;
   private short ZZ12826PEDCliGrm2 ;
   private int Z252CliCod ;
   private int Z12823PEDCliCoNu ;
   private int Z12815PEDCliID ;
   private int Z12836PEDCliPzs ;
   private int Z12855PEDCLiNAlb ;
   private int nRC_GXsfl_155 ;
   private int nGXsfl_155_idx=1 ;
   private int nRC_GXsfl_164 ;
   private int nGXsfl_164_idx=1 ;
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
   private int edtPEDCliPed_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPEDCliFPed_Enabled ;
   private int edtPEDCliFcom_Enabled ;
   private int edtPEDCliArt_Enabled ;
   private int edtPEDCliEmp_Enabled ;
   private int edtPEDCliCoNm_Enabled ;
   private int A12823PEDCliCoNu ;
   private int edtPEDCliCoNu_Enabled ;
   private int edtPEDCliAnc_Enabled ;
   private int edtPEDCliRdto_Enabled ;
   private int edtPEDCliGrm2_Enabled ;
   private int edtPEDCliObs_Enabled ;
   private int edtPEDCliEst_Enabled ;
   private int A12815PEDCliID ;
   private int edtPEDCliID_Enabled ;
   private int edtPEDCliKgs_Enabled ;
   private int edtPEDCliMts_Enabled ;
   private int A12836PEDCliPzs ;
   private int edtPEDCliPzs_Enabled ;
   private int edtPEDCliArtA_Enabled ;
   private int edtPEDCLiObsU_Enabled ;
   private int edtPEDCLiPTra_Enabled ;
   private int edtPEDCLiPorc_Enabled ;
   private int edtPEDCLiOF_Enabled ;
   private int A12855PEDCLiNAlb ;
   private int edtPEDCLiNAlb_Enabled ;
   private int edtPEDCLiProc_Enabled ;
   private int edtavnRcdDeleted_1763_Enabled ;
   private int edtPEDCliNpz_Enabled ;
   private int edtPEDCliLoc_Enabled ;
   private int edtPEDCliKg_Enabled ;
   private int edtPEDCliMt_Enabled ;
   private int fRowAdded ;
   private int edtavnRcdDeleted_1764_Enabled ;
   private int edtPEDCliObsL_Enabled ;
   private int edtPEDCLiObsT_Enabled ;
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
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtPEDCliObsL_Enabled ;
   private int defedtPEDCliNpz_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtPEDCLiProc_Backcolor ;
   private int edtPEDCLiNAlb_Backcolor ;
   private int edtPEDCLiOF_Backcolor ;
   private int edtPEDCLiPorc_Backcolor ;
   private int edtPEDCLiPTra_Backcolor ;
   private int edtPEDCLiObsU_Backcolor ;
   private int edtPEDCliArtA_Backcolor ;
   private int edtPEDCliPzs_Backcolor ;
   private int edtPEDCliMts_Backcolor ;
   private int edtPEDCliKgs_Backcolor ;
   private int edtPEDCliID_Backcolor ;
   private int edtPEDCliEst_Backcolor ;
   private int edtPEDCliObs_Backcolor ;
   private int edtPEDCliGrm2_Backcolor ;
   private int edtPEDCliRdto_Backcolor ;
   private int edtPEDCliAnc_Backcolor ;
   private int edtPEDCliCoNu_Backcolor ;
   private int edtPEDCliCoNm_Backcolor ;
   private int edtPEDCliEmp_Backcolor ;
   private int edtPEDCliArt_Backcolor ;
   private int edtPEDCliFcom_Backcolor ;
   private int edtPEDCliFPed_Backcolor ;
   private int edtPEDCliPed_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ12823PEDCliCoNu ;
   private int ZZ12815PEDCliID ;
   private int ZZ12836PEDCliPzs ;
   private int ZZ12855PEDCLiNAlb ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12825PEDCliRdto ;
   private java.math.BigDecimal Z12833PEDCliKgs ;
   private java.math.BigDecimal Z12834PEDCliMts ;
   private java.math.BigDecimal Z12830PEDCliKg ;
   private java.math.BigDecimal Z12831PEDCliMt ;
   private java.math.BigDecimal A12825PEDCliRdto ;
   private java.math.BigDecimal A12833PEDCliKgs ;
   private java.math.BigDecimal A12834PEDCliMts ;
   private java.math.BigDecimal A12830PEDCliKg ;
   private java.math.BigDecimal A12831PEDCliMt ;
   private java.math.BigDecimal ZZ12825PEDCliRdto ;
   private java.math.BigDecimal ZZ12833PEDCliKgs ;
   private java.math.BigDecimal ZZ12834PEDCliMts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12816PEDCliPed ;
   private String Z12819PEDCliArt ;
   private String Z12820PEDCliEmp ;
   private String Z12822PEDCliCoNm ;
   private String Z12835PEDCliArtA ;
   private String Z12852PEDCLiPTra ;
   private String Z12853PEDCLiPorc ;
   private String Z12854PEDCLiOF ;
   private String Z12856PEDCLiProc ;
   private String Z12828PEDCliNpz ;
   private String Z12829PEDCliLoc ;
   private String Z12839PEDCLiObsT ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_155_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_164_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPEDCliPed_Internalname ;
   private String A12816PEDCliPed ;
   private String edtPEDCliPed_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPEDCliFPed_Internalname ;
   private String edtPEDCliFPed_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPEDCliFcom_Internalname ;
   private String edtPEDCliFcom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPEDCliArt_Internalname ;
   private String A12819PEDCliArt ;
   private String edtPEDCliArt_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPEDCliEmp_Internalname ;
   private String A12820PEDCliEmp ;
   private String edtPEDCliEmp_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPEDCliCoNm_Internalname ;
   private String A12822PEDCliCoNm ;
   private String edtPEDCliCoNm_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPEDCliCoNu_Internalname ;
   private String edtPEDCliCoNu_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPEDCliAnc_Internalname ;
   private String edtPEDCliAnc_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPEDCliRdto_Internalname ;
   private String edtPEDCliRdto_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtPEDCliGrm2_Internalname ;
   private String edtPEDCliGrm2_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtPEDCliObs_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtPEDCliEst_Internalname ;
   private String edtPEDCliEst_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtPEDCliID_Internalname ;
   private String edtPEDCliID_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtPEDCliKgs_Internalname ;
   private String edtPEDCliKgs_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtPEDCliMts_Internalname ;
   private String edtPEDCliMts_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtPEDCliPzs_Internalname ;
   private String edtPEDCliPzs_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtPEDCliArtA_Internalname ;
   private String A12835PEDCliArtA ;
   private String edtPEDCliArtA_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtPEDCLiObsU_Internalname ;
   private String edtPEDCLiObsU_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtPEDCLiPTra_Internalname ;
   private String A12852PEDCLiPTra ;
   private String edtPEDCLiPTra_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtPEDCLiPorc_Internalname ;
   private String A12853PEDCLiPorc ;
   private String edtPEDCLiPorc_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtPEDCLiOF_Internalname ;
   private String A12854PEDCLiOF ;
   private String edtPEDCLiOF_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtPEDCLiNAlb_Internalname ;
   private String edtPEDCLiNAlb_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtPEDCLiProc_Internalname ;
   private String A12856PEDCLiProc ;
   private String edtPEDCLiProc_Jsonclick ;
   private String sMode1763 ;
   private String edtavnRcdDeleted_1763_Internalname ;
   private String edtPEDCliNpz_Internalname ;
   private String edtPEDCliLoc_Internalname ;
   private String edtPEDCliKg_Internalname ;
   private String edtPEDCliMt_Internalname ;
   private String subGrid1_Internalname ;
   private String sMode1764 ;
   private String edtavnRcdDeleted_1764_Internalname ;
   private String edtPEDCliObsL_Internalname ;
   private String edtPEDCLiObsT_Internalname ;
   private String subGrid2_Internalname ;
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
   private String sMode1762 ;
   private String GXCCtl ;
   private String A12839PEDCLiObsT ;
   private String A12828PEDCliNpz ;
   private String A12829PEDCliLoc ;
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
   private String sGXsfl_155_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1763_Jsonclick ;
   private String edtPEDCliNpz_Jsonclick ;
   private String edtPEDCliLoc_Jsonclick ;
   private String edtPEDCliKg_Jsonclick ;
   private String edtPEDCliMt_Jsonclick ;
   private String sGXsfl_164_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1764_Jsonclick ;
   private String edtPEDCliObsL_Jsonclick ;
   private String edtPEDCLiObsT_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ12816PEDCliPed ;
   private String ZZ407EmprNom ;
   private String ZZ12819PEDCliArt ;
   private String ZZ12820PEDCliEmp ;
   private String ZZ12822PEDCliCoNm ;
   private String ZZ12835PEDCliArtA ;
   private String ZZ12852PEDCLiPTra ;
   private String ZZ12853PEDCLiPorc ;
   private String ZZ12854PEDCLiOF ;
   private String ZZ12856PEDCLiProc ;
   private String ZZ279CliNom ;
   private java.util.Date Z12817PEDCliFPed ;
   private java.util.Date Z12818PEDCliFcom ;
   private java.util.Date A12817PEDCliFPed ;
   private java.util.Date A12818PEDCliFcom ;
   private java.util.Date ZZ12817PEDCliFPed ;
   private java.util.Date ZZ12818PEDCliFcom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_155_Refreshing=false ;
   private boolean bGXsfl_164_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12817PEDCliFPed ;
   private boolean n12818PEDCliFcom ;
   private boolean n12819PEDCliArt ;
   private boolean n12820PEDCliEmp ;
   private boolean n12822PEDCliCoNm ;
   private boolean n12823PEDCliCoNu ;
   private boolean n12824PEDCliAnc ;
   private boolean n12825PEDCliRdto ;
   private boolean n12826PEDCliGrm2 ;
   private boolean n12827PEDCliObs ;
   private boolean n12832PEDCliEst ;
   private boolean n12815PEDCliID ;
   private boolean n12833PEDCliKgs ;
   private boolean n12834PEDCliMts ;
   private boolean n12836PEDCliPzs ;
   private boolean n12835PEDCliArtA ;
   private boolean n12837PEDCLiObsU ;
   private boolean n12852PEDCLiPTra ;
   private boolean n12853PEDCLiPorc ;
   private boolean n12854PEDCLiOF ;
   private boolean n12855PEDCLiNAlb ;
   private boolean n12856PEDCLiProc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n12829PEDCliLoc ;
   private boolean n12830PEDCliKg ;
   private boolean n12831PEDCliMt ;
   private boolean n12839PEDCLiObsT ;
   private String Z12827PEDCliObs ;
   private String A12827PEDCliObs ;
   private String ZZ12827PEDCliObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01LH8_A407EmprNom ;
   private boolean[] T01LH8_n407EmprNom ;
   private String[] T01LH10_A12816PEDCliPed ;
   private String[] T01LH10_A407EmprNom ;
   private boolean[] T01LH10_n407EmprNom ;
   private String[] T01LH10_A279CliNom ;
   private java.util.Date[] T01LH10_A12817PEDCliFPed ;
   private boolean[] T01LH10_n12817PEDCliFPed ;
   private java.util.Date[] T01LH10_A12818PEDCliFcom ;
   private boolean[] T01LH10_n12818PEDCliFcom ;
   private String[] T01LH10_A12819PEDCliArt ;
   private boolean[] T01LH10_n12819PEDCliArt ;
   private String[] T01LH10_A12820PEDCliEmp ;
   private boolean[] T01LH10_n12820PEDCliEmp ;
   private String[] T01LH10_A12822PEDCliCoNm ;
   private boolean[] T01LH10_n12822PEDCliCoNm ;
   private int[] T01LH10_A12823PEDCliCoNu ;
   private boolean[] T01LH10_n12823PEDCliCoNu ;
   private short[] T01LH10_A12824PEDCliAnc ;
   private boolean[] T01LH10_n12824PEDCliAnc ;
   private java.math.BigDecimal[] T01LH10_A12825PEDCliRdto ;
   private boolean[] T01LH10_n12825PEDCliRdto ;
   private short[] T01LH10_A12826PEDCliGrm2 ;
   private boolean[] T01LH10_n12826PEDCliGrm2 ;
   private String[] T01LH10_A12827PEDCliObs ;
   private boolean[] T01LH10_n12827PEDCliObs ;
   private byte[] T01LH10_A12832PEDCliEst ;
   private boolean[] T01LH10_n12832PEDCliEst ;
   private int[] T01LH10_A12815PEDCliID ;
   private boolean[] T01LH10_n12815PEDCliID ;
   private java.math.BigDecimal[] T01LH10_A12833PEDCliKgs ;
   private boolean[] T01LH10_n12833PEDCliKgs ;
   private java.math.BigDecimal[] T01LH10_A12834PEDCliMts ;
   private boolean[] T01LH10_n12834PEDCliMts ;
   private int[] T01LH10_A12836PEDCliPzs ;
   private boolean[] T01LH10_n12836PEDCliPzs ;
   private String[] T01LH10_A12835PEDCliArtA ;
   private boolean[] T01LH10_n12835PEDCliArtA ;
   private byte[] T01LH10_A12837PEDCLiObsU ;
   private boolean[] T01LH10_n12837PEDCLiObsU ;
   private String[] T01LH10_A12852PEDCLiPTra ;
   private boolean[] T01LH10_n12852PEDCLiPTra ;
   private String[] T01LH10_A12853PEDCLiPorc ;
   private boolean[] T01LH10_n12853PEDCLiPorc ;
   private String[] T01LH10_A12854PEDCLiOF ;
   private boolean[] T01LH10_n12854PEDCLiOF ;
   private int[] T01LH10_A12855PEDCLiNAlb ;
   private boolean[] T01LH10_n12855PEDCLiNAlb ;
   private String[] T01LH10_A12856PEDCLiProc ;
   private boolean[] T01LH10_n12856PEDCLiProc ;
   private String[] T01LH10_A396EmprCod ;
   private int[] T01LH10_A252CliCod ;
   private String[] T01LH9_A279CliNom ;
   private String[] T01LH11_A279CliNom ;
   private String[] T01LH12_A396EmprCod ;
   private int[] T01LH12_A252CliCod ;
   private String[] T01LH12_A12816PEDCliPed ;
   private String[] T01LH7_A12816PEDCliPed ;
   private java.util.Date[] T01LH7_A12817PEDCliFPed ;
   private boolean[] T01LH7_n12817PEDCliFPed ;
   private java.util.Date[] T01LH7_A12818PEDCliFcom ;
   private boolean[] T01LH7_n12818PEDCliFcom ;
   private String[] T01LH7_A12819PEDCliArt ;
   private boolean[] T01LH7_n12819PEDCliArt ;
   private String[] T01LH7_A12820PEDCliEmp ;
   private boolean[] T01LH7_n12820PEDCliEmp ;
   private String[] T01LH7_A12822PEDCliCoNm ;
   private boolean[] T01LH7_n12822PEDCliCoNm ;
   private int[] T01LH7_A12823PEDCliCoNu ;
   private boolean[] T01LH7_n12823PEDCliCoNu ;
   private short[] T01LH7_A12824PEDCliAnc ;
   private boolean[] T01LH7_n12824PEDCliAnc ;
   private java.math.BigDecimal[] T01LH7_A12825PEDCliRdto ;
   private boolean[] T01LH7_n12825PEDCliRdto ;
   private short[] T01LH7_A12826PEDCliGrm2 ;
   private boolean[] T01LH7_n12826PEDCliGrm2 ;
   private String[] T01LH7_A12827PEDCliObs ;
   private boolean[] T01LH7_n12827PEDCliObs ;
   private byte[] T01LH7_A12832PEDCliEst ;
   private boolean[] T01LH7_n12832PEDCliEst ;
   private int[] T01LH7_A12815PEDCliID ;
   private boolean[] T01LH7_n12815PEDCliID ;
   private java.math.BigDecimal[] T01LH7_A12833PEDCliKgs ;
   private boolean[] T01LH7_n12833PEDCliKgs ;
   private java.math.BigDecimal[] T01LH7_A12834PEDCliMts ;
   private boolean[] T01LH7_n12834PEDCliMts ;
   private int[] T01LH7_A12836PEDCliPzs ;
   private boolean[] T01LH7_n12836PEDCliPzs ;
   private String[] T01LH7_A12835PEDCliArtA ;
   private boolean[] T01LH7_n12835PEDCliArtA ;
   private byte[] T01LH7_A12837PEDCLiObsU ;
   private boolean[] T01LH7_n12837PEDCLiObsU ;
   private String[] T01LH7_A12852PEDCLiPTra ;
   private boolean[] T01LH7_n12852PEDCLiPTra ;
   private String[] T01LH7_A12853PEDCLiPorc ;
   private boolean[] T01LH7_n12853PEDCLiPorc ;
   private String[] T01LH7_A12854PEDCLiOF ;
   private boolean[] T01LH7_n12854PEDCLiOF ;
   private int[] T01LH7_A12855PEDCLiNAlb ;
   private boolean[] T01LH7_n12855PEDCLiNAlb ;
   private String[] T01LH7_A12856PEDCLiProc ;
   private boolean[] T01LH7_n12856PEDCLiProc ;
   private String[] T01LH7_A396EmprCod ;
   private int[] T01LH7_A252CliCod ;
   private String[] T01LH13_A396EmprCod ;
   private int[] T01LH13_A252CliCod ;
   private String[] T01LH13_A12816PEDCliPed ;
   private String[] T01LH14_A396EmprCod ;
   private int[] T01LH14_A252CliCod ;
   private String[] T01LH14_A12816PEDCliPed ;
   private String[] T01LH6_A12816PEDCliPed ;
   private java.util.Date[] T01LH6_A12817PEDCliFPed ;
   private boolean[] T01LH6_n12817PEDCliFPed ;
   private java.util.Date[] T01LH6_A12818PEDCliFcom ;
   private boolean[] T01LH6_n12818PEDCliFcom ;
   private String[] T01LH6_A12819PEDCliArt ;
   private boolean[] T01LH6_n12819PEDCliArt ;
   private String[] T01LH6_A12820PEDCliEmp ;
   private boolean[] T01LH6_n12820PEDCliEmp ;
   private String[] T01LH6_A12822PEDCliCoNm ;
   private boolean[] T01LH6_n12822PEDCliCoNm ;
   private int[] T01LH6_A12823PEDCliCoNu ;
   private boolean[] T01LH6_n12823PEDCliCoNu ;
   private short[] T01LH6_A12824PEDCliAnc ;
   private boolean[] T01LH6_n12824PEDCliAnc ;
   private java.math.BigDecimal[] T01LH6_A12825PEDCliRdto ;
   private boolean[] T01LH6_n12825PEDCliRdto ;
   private short[] T01LH6_A12826PEDCliGrm2 ;
   private boolean[] T01LH6_n12826PEDCliGrm2 ;
   private String[] T01LH6_A12827PEDCliObs ;
   private boolean[] T01LH6_n12827PEDCliObs ;
   private byte[] T01LH6_A12832PEDCliEst ;
   private boolean[] T01LH6_n12832PEDCliEst ;
   private int[] T01LH6_A12815PEDCliID ;
   private boolean[] T01LH6_n12815PEDCliID ;
   private java.math.BigDecimal[] T01LH6_A12833PEDCliKgs ;
   private boolean[] T01LH6_n12833PEDCliKgs ;
   private java.math.BigDecimal[] T01LH6_A12834PEDCliMts ;
   private boolean[] T01LH6_n12834PEDCliMts ;
   private int[] T01LH6_A12836PEDCliPzs ;
   private boolean[] T01LH6_n12836PEDCliPzs ;
   private String[] T01LH6_A12835PEDCliArtA ;
   private boolean[] T01LH6_n12835PEDCliArtA ;
   private byte[] T01LH6_A12837PEDCLiObsU ;
   private boolean[] T01LH6_n12837PEDCLiObsU ;
   private String[] T01LH6_A12852PEDCLiPTra ;
   private boolean[] T01LH6_n12852PEDCLiPTra ;
   private String[] T01LH6_A12853PEDCLiPorc ;
   private boolean[] T01LH6_n12853PEDCLiPorc ;
   private String[] T01LH6_A12854PEDCLiOF ;
   private boolean[] T01LH6_n12854PEDCLiOF ;
   private int[] T01LH6_A12855PEDCLiNAlb ;
   private boolean[] T01LH6_n12855PEDCLiNAlb ;
   private String[] T01LH6_A12856PEDCLiProc ;
   private boolean[] T01LH6_n12856PEDCLiProc ;
   private String[] T01LH6_A396EmprCod ;
   private int[] T01LH6_A252CliCod ;
   private String[] T01LH18_A279CliNom ;
   private String[] T01LH19_A396EmprCod ;
   private int[] T01LH19_A252CliCod ;
   private String[] T01LH19_A12816PEDCliPed ;
   private int[] T01LH20_A252CliCod ;
   private String[] T01LH20_A12816PEDCliPed ;
   private String[] T01LH20_A12828PEDCliNpz ;
   private String[] T01LH20_A12829PEDCliLoc ;
   private boolean[] T01LH20_n12829PEDCliLoc ;
   private java.math.BigDecimal[] T01LH20_A12830PEDCliKg ;
   private boolean[] T01LH20_n12830PEDCliKg ;
   private java.math.BigDecimal[] T01LH20_A12831PEDCliMt ;
   private boolean[] T01LH20_n12831PEDCliMt ;
   private String[] T01LH20_A396EmprCod ;
   private String[] T01LH21_A396EmprCod ;
   private int[] T01LH21_A252CliCod ;
   private String[] T01LH21_A12816PEDCliPed ;
   private String[] T01LH21_A12828PEDCliNpz ;
   private int[] T01LH5_A252CliCod ;
   private String[] T01LH5_A12816PEDCliPed ;
   private String[] T01LH5_A12828PEDCliNpz ;
   private String[] T01LH5_A12829PEDCliLoc ;
   private boolean[] T01LH5_n12829PEDCliLoc ;
   private java.math.BigDecimal[] T01LH5_A12830PEDCliKg ;
   private boolean[] T01LH5_n12830PEDCliKg ;
   private java.math.BigDecimal[] T01LH5_A12831PEDCliMt ;
   private boolean[] T01LH5_n12831PEDCliMt ;
   private String[] T01LH5_A396EmprCod ;
   private int[] T01LH4_A252CliCod ;
   private String[] T01LH4_A12816PEDCliPed ;
   private String[] T01LH4_A12828PEDCliNpz ;
   private String[] T01LH4_A12829PEDCliLoc ;
   private boolean[] T01LH4_n12829PEDCliLoc ;
   private java.math.BigDecimal[] T01LH4_A12830PEDCliKg ;
   private boolean[] T01LH4_n12830PEDCliKg ;
   private java.math.BigDecimal[] T01LH4_A12831PEDCliMt ;
   private boolean[] T01LH4_n12831PEDCliMt ;
   private String[] T01LH4_A396EmprCod ;
   private String[] T01LH25_A396EmprCod ;
   private int[] T01LH25_A252CliCod ;
   private String[] T01LH25_A12816PEDCliPed ;
   private String[] T01LH25_A12828PEDCliNpz ;
   private int[] T01LH26_A252CliCod ;
   private String[] T01LH26_A12816PEDCliPed ;
   private byte[] T01LH26_A12838PEDCliObsL ;
   private String[] T01LH26_A12839PEDCLiObsT ;
   private boolean[] T01LH26_n12839PEDCLiObsT ;
   private String[] T01LH26_A396EmprCod ;
   private String[] T01LH27_A396EmprCod ;
   private int[] T01LH27_A252CliCod ;
   private String[] T01LH27_A12816PEDCliPed ;
   private byte[] T01LH27_A12838PEDCliObsL ;
   private int[] T01LH3_A252CliCod ;
   private String[] T01LH3_A12816PEDCliPed ;
   private byte[] T01LH3_A12838PEDCliObsL ;
   private String[] T01LH3_A12839PEDCLiObsT ;
   private boolean[] T01LH3_n12839PEDCLiObsT ;
   private String[] T01LH3_A396EmprCod ;
   private int[] T01LH2_A252CliCod ;
   private String[] T01LH2_A12816PEDCliPed ;
   private byte[] T01LH2_A12838PEDCliObsL ;
   private String[] T01LH2_A12839PEDCLiObsT ;
   private boolean[] T01LH2_n12839PEDCLiObsT ;
   private String[] T01LH2_A396EmprCod ;
   private String[] T01LH31_A396EmprCod ;
   private int[] T01LH31_A252CliCod ;
   private String[] T01LH31_A12816PEDCliPed ;
   private byte[] T01LH31_A12838PEDCliObsL ;
   private String[] T01LH32_A407EmprNom ;
   private boolean[] T01LH32_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpedcli__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedcli__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedcli__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedcli__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LH2", "SELECT CliCod, PEDCliPed, PEDCliObsL, PEDCLiObsT, EmprCod FROM TXPPEDCL2 WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliObsL = ?  FOR UPDATE OF PEDCLiObsT NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH3", "SELECT CliCod, PEDCliPed, PEDCliObsL, PEDCLiObsT, EmprCod FROM TXPPEDCL2 WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliObsL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH4", "SELECT CliCod, PEDCliPed, PEDCliNpz, PEDCliLoc, PEDCliKg, PEDCliMt, EmprCod FROM TXPPEDCL1 WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliNpz = ?  FOR UPDATE OF PEDCliLoc, PEDCliKg, PEDCliMt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH5", "SELECT CliCod, PEDCliPed, PEDCliNpz, PEDCliLoc, PEDCliKg, PEDCliMt, EmprCod FROM TXPPEDCL1 WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliNpz = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH6", "SELECT PEDCliPed, PEDCliFPed, PEDCliFcom, PEDCliArt, PEDCliEmp, PEDCliCoNm, PEDCliCoNu, PEDCliAnc, PEDCliRdto, PEDCliGrm2, PEDCliObs, PEDCliEst, PEDCliID, PEDCliKgs, PEDCliMts, PEDCliPzs, PEDCliArtA, PEDCLiObsU, PEDCLiPTra, PEDCLiPorc, PEDCLiOF, PEDCLiNAlb, PEDCLiProc, EmprCod, CliCod FROM TXPPEDCLi WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ?  FOR UPDATE OF PEDCliFPed, PEDCliFcom, PEDCliArt, PEDCliEmp, PEDCliCoNm, PEDCliCoNu, PEDCliAnc, PEDCliRdto, PEDCliGrm2, PEDCliObs, PEDCliEst, PEDCliID, PEDCliKgs, PEDCliMts, PEDCliPzs, PEDCliArtA, PEDCLiObsU, PEDCLiPTra, PEDCLiPorc, PEDCLiOF, PEDCLiNAlb, PEDCLiProc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH7", "SELECT PEDCliPed, PEDCliFPed, PEDCliFcom, PEDCliArt, PEDCliEmp, PEDCliCoNm, PEDCliCoNu, PEDCliAnc, PEDCliRdto, PEDCliGrm2, PEDCliObs, PEDCliEst, PEDCliID, PEDCliKgs, PEDCliMts, PEDCliPzs, PEDCliArtA, PEDCLiObsU, PEDCLiPTra, PEDCLiPorc, PEDCLiOF, PEDCLiNAlb, PEDCLiProc, EmprCod, CliCod FROM TXPPEDCLi WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH10", "SELECT /*+ FIRST_ROWS(100) */ TM1.PEDCliPed, T2.EmprNom, T3.CliNom, TM1.PEDCliFPed, TM1.PEDCliFcom, TM1.PEDCliArt, TM1.PEDCliEmp, TM1.PEDCliCoNm, TM1.PEDCliCoNu, TM1.PEDCliAnc, TM1.PEDCliRdto, TM1.PEDCliGrm2, TM1.PEDCliObs, TM1.PEDCliEst, TM1.PEDCliID, TM1.PEDCliKgs, TM1.PEDCliMts, TM1.PEDCliPzs, TM1.PEDCliArtA, TM1.PEDCLiObsU, TM1.PEDCLiPTra, TM1.PEDCLiPorc, TM1.PEDCLiOF, TM1.PEDCLiNAlb, TM1.PEDCLiProc, TM1.EmprCod, TM1.CliCod FROM ((TXPPEDCLi TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.PEDCliPed = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.PEDCliPed ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PEDCliPed FROM TXPPEDCLi WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PEDCliPed FROM TXPPEDCLi WHERE ( CliCod > ? or CliCod = ? and PEDCliPed > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, PEDCliPed) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LH14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PEDCliPed FROM TXPPEDCLi WHERE ( CliCod < ? or CliCod = ? and PEDCliPed < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, PEDCliPed DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LH15", "INSERT INTO TXPPEDCLi(PEDCliPed, PEDCliFPed, PEDCliFcom, PEDCliArt, PEDCliEmp, PEDCliCoNm, PEDCliCoNu, PEDCliAnc, PEDCliRdto, PEDCliGrm2, PEDCliObs, PEDCliEst, PEDCliID, PEDCliKgs, PEDCliMts, PEDCliPzs, PEDCliArtA, PEDCLiObsU, PEDCLiPTra, PEDCLiPorc, PEDCLiOF, PEDCLiNAlb, PEDCLiProc, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPEDCLi")
         ,new UpdateCursor("T01LH16", "UPDATE TXPPEDCLi SET PEDCliFPed=?, PEDCliFcom=?, PEDCliArt=?, PEDCliEmp=?, PEDCliCoNm=?, PEDCliCoNu=?, PEDCliAnc=?, PEDCliRdto=?, PEDCliGrm2=?, PEDCliObs=?, PEDCliEst=?, PEDCliID=?, PEDCliKgs=?, PEDCliMts=?, PEDCliPzs=?, PEDCliArtA=?, PEDCLiObsU=?, PEDCLiPTra=?, PEDCLiPorc=?, PEDCLiOF=?, PEDCLiNAlb=?, PEDCLiProc=?  WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ?", GX_NOMASK, "TXPPEDCLi")
         ,new UpdateCursor("T01LH17", "DELETE FROM TXPPEDCLi  WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ?", GX_NOMASK, "TXPPEDCLi")
         ,new ForEachCursor("T01LH18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, PEDCliPed FROM TXPPEDCLi WHERE EmprCod = ? ORDER BY EmprCod, CliCod, PEDCliPed ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH20", "SELECT CliCod, PEDCliPed, PEDCliNpz, PEDCliLoc, PEDCliKg, PEDCliMt, EmprCod FROM TXPPEDCL1 WHERE EmprCod = ? and CliCod = ? and PEDCliPed = ? and PEDCliNpz = ? ORDER BY EmprCod, CliCod, PEDCliPed, PEDCliNpz ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH21", "SELECT EmprCod, CliCod, PEDCliPed, PEDCliNpz FROM TXPPEDCL1 WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliNpz = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LH22", "INSERT INTO TXPPEDCL1(CliCod, PEDCliPed, PEDCliNpz, PEDCliLoc, PEDCliKg, PEDCliMt, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPEDCL1")
         ,new UpdateCursor("T01LH23", "UPDATE TXPPEDCL1 SET PEDCliLoc=?, PEDCliKg=?, PEDCliMt=?  WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliNpz = ?", GX_NOMASK, "TXPPEDCL1")
         ,new UpdateCursor("T01LH24", "DELETE FROM TXPPEDCL1  WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliNpz = ?", GX_NOMASK, "TXPPEDCL1")
         ,new ForEachCursor("T01LH25", "SELECT EmprCod, CliCod, PEDCliPed, PEDCliNpz FROM TXPPEDCL1 WHERE EmprCod = ? and CliCod = ? and PEDCliPed = ? ORDER BY EmprCod, CliCod, PEDCliPed, PEDCliNpz ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH26", "SELECT CliCod, PEDCliPed, PEDCliObsL, PEDCLiObsT, EmprCod FROM TXPPEDCL2 WHERE EmprCod = ? and CliCod = ? and PEDCliPed = ? and PEDCliObsL = ? ORDER BY EmprCod, CliCod, PEDCliPed, PEDCliObsL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH27", "SELECT EmprCod, CliCod, PEDCliPed, PEDCliObsL FROM TXPPEDCL2 WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliObsL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LH28", "INSERT INTO TXPPEDCL2(CliCod, PEDCliPed, PEDCliObsL, PEDCLiObsT, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPEDCL2")
         ,new UpdateCursor("T01LH29", "UPDATE TXPPEDCL2 SET PEDCLiObsT=?  WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliObsL = ?", GX_NOMASK, "TXPPEDCL2")
         ,new UpdateCursor("T01LH30", "DELETE FROM TXPPEDCL2  WHERE EmprCod = ? AND CliCod = ? AND PEDCliPed = ? AND PEDCliObsL = ?", GX_NOMASK, "TXPPEDCL2")
         ,new ForEachCursor("T01LH31", "SELECT EmprCod, CliCod, PEDCliPed, PEDCliObsL FROM TXPPEDCL2 WHERE EmprCod = ? and CliCod = ? and PEDCliPed = ? ORDER BY EmprCod, CliCod, PEDCliPed, PEDCliObsL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LH32", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((int[]) buf[46])[0] = rslt.getInt(25);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((int[]) buf[46])[0] = rslt.getInt(25);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 16);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((int[]) buf[44])[0] = rslt.getInt(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 3);
               ((int[]) buf[49])[0] = rslt.getInt(27);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setString(3, (String)parms[2], 10);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 13);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 540);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 16);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[34]).byteValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 10);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 10);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 10);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 20);
               }
               stmt.setString(24, (String)parms[45], 3);
               stmt.setInt(25, ((Number) parms[46]).intValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 13);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 540);
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
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
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
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 10);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 10);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 10);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[41]).intValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 20);
               }
               stmt.setString(23, (String)parms[44], 3);
               stmt.setInt(24, ((Number) parms[45]).intValue());
               stmt.setString(25, (String)parms[46], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 9);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               stmt.setString(7, (String)parms[9], 3);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
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
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 10);
               stmt.setString(7, (String)parms[9], 9);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 60);
               }
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 10);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
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
               return;
      }
   }

}

