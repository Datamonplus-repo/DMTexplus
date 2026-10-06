package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcostas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A457FasCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "SIMULACION COSTES TAS", ""), (short)(0)) ;
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
      nRC_GXsfl_245 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_245"))) ;
      nGXsfl_245_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_245_idx"))) ;
      sGXsfl_245_idx = httpContext.GetPar( "sGXsfl_245_idx") ;
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

   public tcostas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcostas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcostas_impl.class ));
   }

   public tcostas_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCOSTAS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Numero Simulacion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_num_Internalname, GXutil.ltrim( localUtil.ntoc( A6882Tas_num, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_num_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6882Tas_num), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6882Tas_num), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_num_Jsonclick, 0, "", "", "", "", "", 1, edtTas_num_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_Artcod_Internalname, GXutil.rtrim( A6883Tas_Artcod), GXutil.rtrim( localUtil.format( A6883Tas_Artcod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_Artcod_Jsonclick, 0, "", "", "", "", "", 1, edtTas_Artcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Grm2", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_grm2_Internalname, GXutil.ltrim( localUtil.ntoc( A6884Tas_grm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_grm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6884Tas_grm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6884Tas_grm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_grm2_Jsonclick, 0, "", "", "", "", "", 1, edtTas_grm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_anccr_Internalname, GXutil.ltrim( localUtil.ntoc( A6885Tas_anccr, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_anccr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6885Tas_anccr), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6885Tas_anccr), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_anccr_Jsonclick, 0, "", "", "", "", "", 1, edtTas_anccr_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Pml", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_pml_Internalname, GXutil.ltrim( localUtil.ntoc( A6886Tas_pml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_pml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6886Tas_pml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6886Tas_pml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_pml_Jsonclick, 0, "", "", "", "", "", 1, edtTas_pml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Kgs", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A6887Tas_kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_kgs_Enabled!=0) ? localUtil.format( A6887Tas_kgs, "ZZZZZ9.99") : localUtil.format( A6887Tas_kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_kgs_Jsonclick, 0, "", "", "", "", "", 1, edtTas_kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Mts", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_mts_Internalname, GXutil.ltrim( localUtil.ntoc( A6888Tas_mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_mts_Enabled!=0) ? localUtil.format( A6888Tas_mts, "ZZZZZ9.99") : localUtil.format( A6888Tas_mts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_mts_Jsonclick, 0, "", "", "", "", "", 1, edtTas_mts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Factor Abs", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_facab_Internalname, GXutil.ltrim( localUtil.ntoc( A6889Tas_facab, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_facab_Enabled!=0) ? localUtil.format( A6889Tas_facab, "ZZ9.99") : localUtil.format( A6889Tas_facab, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_facab_Jsonclick, 0, "", "", "", "", "", 1, edtTas_facab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Volumen", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_Vol_Internalname, GXutil.ltrim( localUtil.ntoc( A6890Tas_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_Vol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6890Tas_Vol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6890Tas_Vol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_Vol_Jsonclick, 0, "", "", "", "", "", 1, edtTas_Vol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_ColNom_Internalname, GXutil.rtrim( A6891Tas_ColNom), GXutil.rtrim( localUtil.format( A6891Tas_ColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_ColNom_Jsonclick, 0, "", "", "", "", "", 1, edtTas_ColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_ColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A6892Tas_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_ColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6892Tas_ColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6892Tas_ColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_ColNum_Jsonclick, 0, "", "", "", "", "", 1, edtTas_ColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Tc", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_Tc_Internalname, GXutil.ltrim( localUtil.ntoc( A6893Tas_Tc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_Tc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6893Tas_Tc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6893Tas_Tc), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_Tc_Jsonclick, 0, "", "", "", "", "", 1, edtTas_Tc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "CosteColor", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_coscol_Internalname, GXutil.ltrim( localUtil.ntoc( A6894Tas_coscol, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_coscol_Enabled!=0) ? localUtil.format( A6894Tas_coscol, "ZZZZ9.99999") : localUtil.format( A6894Tas_coscol, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_coscol_Jsonclick, 0, "", "", "", "", "", 1, edtTas_coscol_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Receta Preparacion Codigo 1", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_rpcod1_Internalname, GXutil.rtrim( A6895Tas_rpcod1), GXutil.rtrim( localUtil.format( A6895Tas_rpcod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_rpcod1_Jsonclick, 0, "", "", "", "", "", 1, edtTas_rpcod1_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Coste Preparacion 1", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_cosrp1_Internalname, GXutil.ltrim( localUtil.ntoc( A6896Tas_cosrp1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_cosrp1_Enabled!=0) ? localUtil.format( A6896Tas_cosrp1, "ZZZZ9.99999") : localUtil.format( A6896Tas_cosrp1, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_cosrp1_Jsonclick, 0, "", "", "", "", "", 1, edtTas_cosrp1_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Receta Preparacion Dsc 1", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_rpdsc1_Internalname, GXutil.rtrim( A6897Tas_rpdsc1), GXutil.rtrim( localUtil.format( A6897Tas_rpdsc1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_rpdsc1_Jsonclick, 0, "", "", "", "", "", 1, edtTas_rpdsc1_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Receta Preparacion Codigo 2", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_rpcod2_Internalname, GXutil.rtrim( A6898Tas_rpcod2), GXutil.rtrim( localUtil.format( A6898Tas_rpcod2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_rpcod2_Jsonclick, 0, "", "", "", "", "", 1, edtTas_rpcod2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Receta Preparacion Dsc 2", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_rpdsc2_Internalname, GXutil.rtrim( A6899Tas_rpdsc2), GXutil.rtrim( localUtil.format( A6899Tas_rpdsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_rpdsc2_Jsonclick, 0, "", "", "", "", "", 1, edtTas_rpdsc2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Coste Preparacion  2", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_cosrp2_Internalname, GXutil.ltrim( localUtil.ntoc( A6900Tas_cosrp2, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_cosrp2_Enabled!=0) ? localUtil.format( A6900Tas_cosrp2, "ZZZZ9.99999") : localUtil.format( A6900Tas_cosrp2, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_cosrp2_Jsonclick, 0, "", "", "", "", "", 1, edtTas_cosrp2_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Receta Preparacion Codigo 3", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_rpcod3_Internalname, GXutil.rtrim( A6901Tas_rpcod3), GXutil.rtrim( localUtil.format( A6901Tas_rpcod3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_rpcod3_Jsonclick, 0, "", "", "", "", "", 1, edtTas_rpcod3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Receta Preparacion Dsc 3", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_rpdsc3_Internalname, GXutil.rtrim( A6902Tas_rpdsc3), GXutil.rtrim( localUtil.format( A6902Tas_rpdsc3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_rpdsc3_Jsonclick, 0, "", "", "", "", "", 1, edtTas_rpdsc3_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Coste Preparacion 3", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_cosrp3_Internalname, GXutil.ltrim( localUtil.ntoc( A6903Tas_cosrp3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_cosrp3_Enabled!=0) ? localUtil.format( A6903Tas_cosrp3, "ZZZZ9.99999") : localUtil.format( A6903Tas_cosrp3, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_cosrp3_Jsonclick, 0, "", "", "", "", "", 1, edtTas_cosrp3_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Receta Acabado Codigo 1", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_racod1_Internalname, GXutil.rtrim( A6904Tas_racod1), GXutil.rtrim( localUtil.format( A6904Tas_racod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_racod1_Jsonclick, 0, "", "", "", "", "", 1, edtTas_racod1_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Receta Acabado Dsc 1", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_radsc1_Internalname, GXutil.rtrim( A6905Tas_radsc1), GXutil.rtrim( localUtil.format( A6905Tas_radsc1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_radsc1_Jsonclick, 0, "", "", "", "", "", 1, edtTas_radsc1_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Coste Acabado Codigo 3", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_cosra1_Internalname, GXutil.ltrim( localUtil.ntoc( A6906Tas_cosra1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_cosra1_Enabled!=0) ? localUtil.format( A6906Tas_cosra1, "ZZZZ9.99999") : localUtil.format( A6906Tas_cosra1, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_cosra1_Jsonclick, 0, "", "", "", "", "", 1, edtTas_cosra1_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Receta Acabado Codigo 2", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_racod2_Internalname, GXutil.rtrim( A6907Tas_racod2), GXutil.rtrim( localUtil.format( A6907Tas_racod2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_racod2_Jsonclick, 0, "", "", "", "", "", 1, edtTas_racod2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Receta Acabado Dsc 2", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_radsc2_Internalname, GXutil.rtrim( A6908Tas_radsc2), GXutil.rtrim( localUtil.format( A6908Tas_radsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_radsc2_Jsonclick, 0, "", "", "", "", "", 1, edtTas_radsc2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Coste Acabado Codigo 2", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_cosra2_Internalname, GXutil.ltrim( localUtil.ntoc( A6909Tas_cosra2, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_cosra2_Enabled!=0) ? localUtil.format( A6909Tas_cosra2, "ZZZZ9.99999") : localUtil.format( A6909Tas_cosra2, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_cosra2_Jsonclick, 0, "", "", "", "", "", 1, edtTas_cosra2_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Receta Acabado Codigo 3", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_racod3_Internalname, GXutil.rtrim( A6910Tas_racod3), GXutil.rtrim( localUtil.format( A6910Tas_racod3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_racod3_Jsonclick, 0, "", "", "", "", "", 1, edtTas_racod3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Receta Acabado Dsc 3", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_radsc3_Internalname, GXutil.rtrim( A6911Tas_radsc3), GXutil.rtrim( localUtil.format( A6911Tas_radsc3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_radsc3_Jsonclick, 0, "", "", "", "", "", 1, edtTas_radsc3_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Coste Acabado 3", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_cosra3_Internalname, GXutil.ltrim( localUtil.ntoc( A6912Tas_cosra3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_cosra3_Enabled!=0) ? localUtil.format( A6912Tas_cosra3, "ZZZZ9.99999") : localUtil.format( A6912Tas_cosra3, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_cosra3_Jsonclick, 0, "", "", "", "", "", 1, edtTas_cosra3_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Coste Total 1", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_cost1_Internalname, GXutil.ltrim( localUtil.ntoc( A6913Tas_cost1, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_cost1_Enabled!=0) ? localUtil.format( A6913Tas_cost1, "ZZZZZZ9.999") : localUtil.format( A6913Tas_cost1, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_cost1_Jsonclick, 0, "", "", "", "", "", 1, edtTas_cost1_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Coste Total 2", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_cost2_Internalname, GXutil.ltrim( localUtil.ntoc( A6914Tas_cost2, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_cost2_Enabled!=0) ? localUtil.format( A6914Tas_cost2, "ZZZZZZ9.999") : localUtil.format( A6914Tas_cost2, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_cost2_Jsonclick, 0, "", "", "", "", "", 1, edtTas_cost2_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_ultlin_Internalname, GXutil.ltrim( localUtil.ntoc( A6915Tas_ultlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_ultlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6915Tas_ultlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6915Tas_ultlin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_ultlin_Jsonclick, 0, "", "", "", "", "", 1, edtTas_ultlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_Procod_Internalname, GXutil.rtrim( A6916Tas_Procod), GXutil.rtrim( localUtil.format( A6916Tas_Procod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_Procod_Jsonclick, 0, "", "", "", "", "", 1, edtTas_Procod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_Prodsc_Internalname, GXutil.rtrim( A6917Tas_Prodsc), GXutil.rtrim( localUtil.format( A6917Tas_Prodsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_Prodsc_Jsonclick, 0, "", "", "", "", "", 1, edtTas_Prodsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Tas Porc", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_Porc_Internalname, GXutil.ltrim( localUtil.ntoc( A6918Tas_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_Porc_Enabled!=0) ? localUtil.format( A6918Tas_Porc, "ZZ9.99") : localUtil.format( A6918Tas_Porc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_Porc_Jsonclick, 0, "", "", "", "", "", 1, edtTas_Porc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Fecha_Hora", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTas_fecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_fecha_Internalname, localUtil.ttoc( A6919Tas_fecha, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6919Tas_fecha, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_fecha_Jsonclick, 0, "", "", "", "", "", 1, edtTas_fecha_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTas_fecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTas_fecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCOSTAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "usuario", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_usuari_Internalname, GXutil.rtrim( A6920Tas_usuari), GXutil.rtrim( localUtil.format( A6920Tas_usuari, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_usuari_Jsonclick, 0, "", "", "", "", "", 1, edtTas_usuari_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Terminal", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_termin_Internalname, GXutil.rtrim( A6921Tas_termin), GXutil.rtrim( localUtil.format( A6921Tas_termin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_termin_Jsonclick, 0, "", "", "", "", "", 1, edtTas_termin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Preço Venda(Informativo)", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTas_precio_Internalname, GXutil.ltrim( localUtil.ntoc( A7006Tas_precio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTas_precio_Enabled!=0) ? localUtil.format( A7006Tas_precio, "ZZZZZZ9.99999") : localUtil.format( A7006Tas_precio, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTas_precio_Jsonclick, 0, "", "", "", "", "", 1, edtTas_precio_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol245( ) ;
      nGXsfl_245_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1622 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1622 = (short)(1) ;
            scanStart1GQ1622( ) ;
            while ( RcdFound1622 != 0 )
            {
               init_level_properties1622( ) ;
               getByPrimaryKey1GQ1622( ) ;
               addRow1GQ1622( ) ;
               scanNext1GQ1622( ) ;
            }
            scanEnd1GQ1622( ) ;
            nBlankRcdCount1622 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1GQ1622( ) ;
         standaloneModal1GQ1622( ) ;
         sMode1622 = Gx_mode ;
         while ( nGXsfl_245_idx < nRC_GXsfl_245 )
         {
            bGXsfl_245_Refreshing = true ;
            readRow1GQ1622( ) ;
            edtavnRcdDeleted_1622_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1622_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1622_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1622_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtTas_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_LIN_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTas_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_lin_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtTas_vel_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_VEL_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTas_vel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_vel_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtTas_maqc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_MAQC_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTas_maqc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_maqc_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtTas_maqd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_MAQD_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTas_maqd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_maqd_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtTas_costm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_COSTM_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTas_costm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_costm_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtTas_costmt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_COSTMT_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTas_costmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_costmt_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            edtTas_costt1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_COSTT1_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTas_costt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_costt1_Enabled), 5, 0), !bGXsfl_245_Refreshing);
            if ( ( nRcdExists_1622 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1GQ1622( ) ;
            }
            sendRow1GQ1622( ) ;
            bGXsfl_245_Refreshing = false ;
         }
         Gx_mode = sMode1622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1622 = (short)(5) ;
         nRcdExists_1622 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1GQ1622( ) ;
            while ( RcdFound1622 != 0 )
            {
               sGXsfl_245_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_245_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2451622( ) ;
               init_level_properties1622( ) ;
               standaloneNotModal1GQ1622( ) ;
               getByPrimaryKey1GQ1622( ) ;
               standaloneModal1GQ1622( ) ;
               addRow1GQ1622( ) ;
               scanNext1GQ1622( ) ;
            }
            scanEnd1GQ1622( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1622 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_245_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_245_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_2451622( ) ;
      initAll1GQ1622( ) ;
      init_level_properties1622( ) ;
      nRcdExists_1622 = (short)(0) ;
      nIsMod_1622 = (short)(0) ;
      nRcdDeleted_1622 = (short)(0) ;
      nBlankRcdCount1622 = (short)(nBlankRcdUsr1622+nBlankRcdCount1622) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1622 > 0 )
      {
         standaloneNotModal1GQ1622( ) ;
         standaloneModal1GQ1622( ) ;
         addRow1GQ1622( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTas_lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1622 = (short)(nBlankRcdCount1622-1) ;
      }
      Gx_mode = sMode1622 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 258,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 260,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 262,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCOSTAS.htm");
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
         Z6882Tas_num = (int)(localUtil.ctol( httpContext.cgiGet( "Z6882Tas_num"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6883Tas_Artcod = httpContext.cgiGet( "Z6883Tas_Artcod") ;
         Z6884Tas_grm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6884Tas_grm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6885Tas_anccr = (short)(localUtil.ctol( httpContext.cgiGet( "Z6885Tas_anccr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6886Tas_pml = (short)(localUtil.ctol( httpContext.cgiGet( "Z6886Tas_pml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6887Tas_kgs = localUtil.ctond( httpContext.cgiGet( "Z6887Tas_kgs")) ;
         Z6888Tas_mts = localUtil.ctond( httpContext.cgiGet( "Z6888Tas_mts")) ;
         Z6889Tas_facab = localUtil.ctond( httpContext.cgiGet( "Z6889Tas_facab")) ;
         Z6890Tas_Vol = (int)(localUtil.ctol( httpContext.cgiGet( "Z6890Tas_Vol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6891Tas_ColNom = httpContext.cgiGet( "Z6891Tas_ColNom") ;
         Z6892Tas_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z6892Tas_ColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6893Tas_Tc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6893Tas_Tc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6894Tas_coscol = localUtil.ctond( httpContext.cgiGet( "Z6894Tas_coscol")) ;
         Z6895Tas_rpcod1 = httpContext.cgiGet( "Z6895Tas_rpcod1") ;
         Z6896Tas_cosrp1 = localUtil.ctond( httpContext.cgiGet( "Z6896Tas_cosrp1")) ;
         Z6897Tas_rpdsc1 = httpContext.cgiGet( "Z6897Tas_rpdsc1") ;
         Z6898Tas_rpcod2 = httpContext.cgiGet( "Z6898Tas_rpcod2") ;
         Z6899Tas_rpdsc2 = httpContext.cgiGet( "Z6899Tas_rpdsc2") ;
         Z6900Tas_cosrp2 = localUtil.ctond( httpContext.cgiGet( "Z6900Tas_cosrp2")) ;
         Z6901Tas_rpcod3 = httpContext.cgiGet( "Z6901Tas_rpcod3") ;
         Z6902Tas_rpdsc3 = httpContext.cgiGet( "Z6902Tas_rpdsc3") ;
         Z6903Tas_cosrp3 = localUtil.ctond( httpContext.cgiGet( "Z6903Tas_cosrp3")) ;
         Z6904Tas_racod1 = httpContext.cgiGet( "Z6904Tas_racod1") ;
         Z6905Tas_radsc1 = httpContext.cgiGet( "Z6905Tas_radsc1") ;
         Z6906Tas_cosra1 = localUtil.ctond( httpContext.cgiGet( "Z6906Tas_cosra1")) ;
         Z6907Tas_racod2 = httpContext.cgiGet( "Z6907Tas_racod2") ;
         Z6908Tas_radsc2 = httpContext.cgiGet( "Z6908Tas_radsc2") ;
         Z6909Tas_cosra2 = localUtil.ctond( httpContext.cgiGet( "Z6909Tas_cosra2")) ;
         Z6910Tas_racod3 = httpContext.cgiGet( "Z6910Tas_racod3") ;
         Z6911Tas_radsc3 = httpContext.cgiGet( "Z6911Tas_radsc3") ;
         Z6912Tas_cosra3 = localUtil.ctond( httpContext.cgiGet( "Z6912Tas_cosra3")) ;
         Z6913Tas_cost1 = localUtil.ctond( httpContext.cgiGet( "Z6913Tas_cost1")) ;
         Z6914Tas_cost2 = localUtil.ctond( httpContext.cgiGet( "Z6914Tas_cost2")) ;
         Z6915Tas_ultlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z6915Tas_ultlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6916Tas_Procod = httpContext.cgiGet( "Z6916Tas_Procod") ;
         Z6917Tas_Prodsc = httpContext.cgiGet( "Z6917Tas_Prodsc") ;
         Z6918Tas_Porc = localUtil.ctond( httpContext.cgiGet( "Z6918Tas_Porc")) ;
         Z6919Tas_fecha = localUtil.ctot( httpContext.cgiGet( "Z6919Tas_fecha"), 0) ;
         Z6920Tas_usuari = httpContext.cgiGet( "Z6920Tas_usuari") ;
         Z6921Tas_termin = httpContext.cgiGet( "Z6921Tas_termin") ;
         Z7006Tas_precio = localUtil.ctond( httpContext.cgiGet( "Z7006Tas_precio")) ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_245 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_245"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_NUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_num_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6882Tas_num = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
         }
         else
         {
            A6882Tas_num = (int)(localUtil.ctol( httpContext.cgiGet( edtTas_num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
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
         A6883Tas_Artcod = httpContext.cgiGet( edtTas_Artcod_Internalname) ;
         n6883Tas_Artcod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6883Tas_Artcod", A6883Tas_Artcod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_grm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_grm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_GRM2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_grm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6884Tas_grm2 = (short)(0) ;
            n6884Tas_grm2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6884Tas_grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6884Tas_grm2), 4, 0));
         }
         else
         {
            A6884Tas_grm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtTas_grm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6884Tas_grm2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6884Tas_grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6884Tas_grm2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_anccr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_anccr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_ANCCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_anccr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6885Tas_anccr = (short)(0) ;
            n6885Tas_anccr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6885Tas_anccr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6885Tas_anccr), 3, 0));
         }
         else
         {
            A6885Tas_anccr = (short)(localUtil.ctol( httpContext.cgiGet( edtTas_anccr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6885Tas_anccr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6885Tas_anccr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6885Tas_anccr), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_pml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_pml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_PML");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_pml_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6886Tas_pml = (short)(0) ;
            n6886Tas_pml = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6886Tas_pml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6886Tas_pml), 4, 0));
         }
         else
         {
            A6886Tas_pml = (short)(localUtil.ctol( httpContext.cgiGet( edtTas_pml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6886Tas_pml = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6886Tas_pml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6886Tas_pml), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_KGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_kgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6887Tas_kgs = DecimalUtil.ZERO ;
            n6887Tas_kgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6887Tas_kgs", GXutil.ltrimstr( A6887Tas_kgs, 9, 2));
         }
         else
         {
            A6887Tas_kgs = localUtil.ctond( httpContext.cgiGet( edtTas_kgs_Internalname)) ;
            n6887Tas_kgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6887Tas_kgs", GXutil.ltrimstr( A6887Tas_kgs, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_MTS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_mts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6888Tas_mts = DecimalUtil.ZERO ;
            n6888Tas_mts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6888Tas_mts", GXutil.ltrimstr( A6888Tas_mts, 9, 2));
         }
         else
         {
            A6888Tas_mts = localUtil.ctond( httpContext.cgiGet( edtTas_mts_Internalname)) ;
            n6888Tas_mts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6888Tas_mts", GXutil.ltrimstr( A6888Tas_mts, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_facab_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_facab_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_FACAB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_facab_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6889Tas_facab = DecimalUtil.ZERO ;
            n6889Tas_facab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6889Tas_facab", GXutil.ltrimstr( A6889Tas_facab, 6, 2));
         }
         else
         {
            A6889Tas_facab = localUtil.ctond( httpContext.cgiGet( edtTas_facab_Internalname)) ;
            n6889Tas_facab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6889Tas_facab", GXutil.ltrimstr( A6889Tas_facab, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_VOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_Vol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6890Tas_Vol = 0 ;
            n6890Tas_Vol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6890Tas_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6890Tas_Vol), 5, 0));
         }
         else
         {
            A6890Tas_Vol = (int)(localUtil.ctol( httpContext.cgiGet( edtTas_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6890Tas_Vol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6890Tas_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6890Tas_Vol), 5, 0));
         }
         A6891Tas_ColNom = httpContext.cgiGet( edtTas_ColNom_Internalname) ;
         n6891Tas_ColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6891Tas_ColNom", A6891Tas_ColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_ColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6892Tas_ColNum = 0 ;
            n6892Tas_ColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6892Tas_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6892Tas_ColNum), 6, 0));
         }
         else
         {
            A6892Tas_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtTas_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6892Tas_ColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6892Tas_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6892Tas_ColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_TC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_Tc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6893Tas_Tc = (byte)(0) ;
            n6893Tas_Tc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6893Tas_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6893Tas_Tc), 2, 0));
         }
         else
         {
            A6893Tas_Tc = (byte)(localUtil.ctol( httpContext.cgiGet( edtTas_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6893Tas_Tc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6893Tas_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6893Tas_Tc), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_coscol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_coscol_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COSCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_coscol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6894Tas_coscol = DecimalUtil.ZERO ;
            n6894Tas_coscol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6894Tas_coscol", GXutil.ltrimstr( A6894Tas_coscol, 11, 5));
         }
         else
         {
            A6894Tas_coscol = localUtil.ctond( httpContext.cgiGet( edtTas_coscol_Internalname)) ;
            n6894Tas_coscol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6894Tas_coscol", GXutil.ltrimstr( A6894Tas_coscol, 11, 5));
         }
         A6895Tas_rpcod1 = httpContext.cgiGet( edtTas_rpcod1_Internalname) ;
         n6895Tas_rpcod1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6895Tas_rpcod1", A6895Tas_rpcod1);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_cosrp1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_cosrp1_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COSRP1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_cosrp1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6896Tas_cosrp1 = DecimalUtil.ZERO ;
            n6896Tas_cosrp1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6896Tas_cosrp1", GXutil.ltrimstr( A6896Tas_cosrp1, 11, 5));
         }
         else
         {
            A6896Tas_cosrp1 = localUtil.ctond( httpContext.cgiGet( edtTas_cosrp1_Internalname)) ;
            n6896Tas_cosrp1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6896Tas_cosrp1", GXutil.ltrimstr( A6896Tas_cosrp1, 11, 5));
         }
         A6897Tas_rpdsc1 = httpContext.cgiGet( edtTas_rpdsc1_Internalname) ;
         n6897Tas_rpdsc1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6897Tas_rpdsc1", A6897Tas_rpdsc1);
         A6898Tas_rpcod2 = httpContext.cgiGet( edtTas_rpcod2_Internalname) ;
         n6898Tas_rpcod2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6898Tas_rpcod2", A6898Tas_rpcod2);
         A6899Tas_rpdsc2 = httpContext.cgiGet( edtTas_rpdsc2_Internalname) ;
         n6899Tas_rpdsc2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6899Tas_rpdsc2", A6899Tas_rpdsc2);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_cosrp2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_cosrp2_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COSRP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_cosrp2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6900Tas_cosrp2 = DecimalUtil.ZERO ;
            n6900Tas_cosrp2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6900Tas_cosrp2", GXutil.ltrimstr( A6900Tas_cosrp2, 11, 5));
         }
         else
         {
            A6900Tas_cosrp2 = localUtil.ctond( httpContext.cgiGet( edtTas_cosrp2_Internalname)) ;
            n6900Tas_cosrp2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6900Tas_cosrp2", GXutil.ltrimstr( A6900Tas_cosrp2, 11, 5));
         }
         A6901Tas_rpcod3 = httpContext.cgiGet( edtTas_rpcod3_Internalname) ;
         n6901Tas_rpcod3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6901Tas_rpcod3", A6901Tas_rpcod3);
         A6902Tas_rpdsc3 = httpContext.cgiGet( edtTas_rpdsc3_Internalname) ;
         n6902Tas_rpdsc3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6902Tas_rpdsc3", A6902Tas_rpdsc3);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_cosrp3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_cosrp3_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COSRP3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_cosrp3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6903Tas_cosrp3 = DecimalUtil.ZERO ;
            n6903Tas_cosrp3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6903Tas_cosrp3", GXutil.ltrimstr( A6903Tas_cosrp3, 11, 5));
         }
         else
         {
            A6903Tas_cosrp3 = localUtil.ctond( httpContext.cgiGet( edtTas_cosrp3_Internalname)) ;
            n6903Tas_cosrp3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6903Tas_cosrp3", GXutil.ltrimstr( A6903Tas_cosrp3, 11, 5));
         }
         A6904Tas_racod1 = httpContext.cgiGet( edtTas_racod1_Internalname) ;
         n6904Tas_racod1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6904Tas_racod1", A6904Tas_racod1);
         A6905Tas_radsc1 = httpContext.cgiGet( edtTas_radsc1_Internalname) ;
         n6905Tas_radsc1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6905Tas_radsc1", A6905Tas_radsc1);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_cosra1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_cosra1_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COSRA1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_cosra1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6906Tas_cosra1 = DecimalUtil.ZERO ;
            n6906Tas_cosra1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6906Tas_cosra1", GXutil.ltrimstr( A6906Tas_cosra1, 11, 5));
         }
         else
         {
            A6906Tas_cosra1 = localUtil.ctond( httpContext.cgiGet( edtTas_cosra1_Internalname)) ;
            n6906Tas_cosra1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6906Tas_cosra1", GXutil.ltrimstr( A6906Tas_cosra1, 11, 5));
         }
         A6907Tas_racod2 = httpContext.cgiGet( edtTas_racod2_Internalname) ;
         n6907Tas_racod2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6907Tas_racod2", A6907Tas_racod2);
         A6908Tas_radsc2 = httpContext.cgiGet( edtTas_radsc2_Internalname) ;
         n6908Tas_radsc2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6908Tas_radsc2", A6908Tas_radsc2);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_cosra2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_cosra2_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COSRA2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_cosra2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6909Tas_cosra2 = DecimalUtil.ZERO ;
            n6909Tas_cosra2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6909Tas_cosra2", GXutil.ltrimstr( A6909Tas_cosra2, 11, 5));
         }
         else
         {
            A6909Tas_cosra2 = localUtil.ctond( httpContext.cgiGet( edtTas_cosra2_Internalname)) ;
            n6909Tas_cosra2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6909Tas_cosra2", GXutil.ltrimstr( A6909Tas_cosra2, 11, 5));
         }
         A6910Tas_racod3 = httpContext.cgiGet( edtTas_racod3_Internalname) ;
         n6910Tas_racod3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6910Tas_racod3", A6910Tas_racod3);
         A6911Tas_radsc3 = httpContext.cgiGet( edtTas_radsc3_Internalname) ;
         n6911Tas_radsc3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6911Tas_radsc3", A6911Tas_radsc3);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_cosra3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_cosra3_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COSRA3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_cosra3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6912Tas_cosra3 = DecimalUtil.ZERO ;
            n6912Tas_cosra3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6912Tas_cosra3", GXutil.ltrimstr( A6912Tas_cosra3, 11, 5));
         }
         else
         {
            A6912Tas_cosra3 = localUtil.ctond( httpContext.cgiGet( edtTas_cosra3_Internalname)) ;
            n6912Tas_cosra3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6912Tas_cosra3", GXutil.ltrimstr( A6912Tas_cosra3, 11, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_cost1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_cost1_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COST1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_cost1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6913Tas_cost1 = DecimalUtil.ZERO ;
            n6913Tas_cost1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6913Tas_cost1", GXutil.ltrimstr( A6913Tas_cost1, 11, 3));
         }
         else
         {
            A6913Tas_cost1 = localUtil.ctond( httpContext.cgiGet( edtTas_cost1_Internalname)) ;
            n6913Tas_cost1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6913Tas_cost1", GXutil.ltrimstr( A6913Tas_cost1, 11, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_cost2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_cost2_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_COST2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_cost2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6914Tas_cost2 = DecimalUtil.ZERO ;
            n6914Tas_cost2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6914Tas_cost2", GXutil.ltrimstr( A6914Tas_cost2, 11, 3));
         }
         else
         {
            A6914Tas_cost2 = localUtil.ctond( httpContext.cgiGet( edtTas_cost2_Internalname)) ;
            n6914Tas_cost2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6914Tas_cost2", GXutil.ltrimstr( A6914Tas_cost2, 11, 3));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_ultlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_ultlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_ULTLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_ultlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6915Tas_ultlin = (short)(0) ;
            n6915Tas_ultlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6915Tas_ultlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6915Tas_ultlin), 4, 0));
         }
         else
         {
            A6915Tas_ultlin = (short)(localUtil.ctol( httpContext.cgiGet( edtTas_ultlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6915Tas_ultlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6915Tas_ultlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6915Tas_ultlin), 4, 0));
         }
         A6916Tas_Procod = httpContext.cgiGet( edtTas_Procod_Internalname) ;
         n6916Tas_Procod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6916Tas_Procod", A6916Tas_Procod);
         A6917Tas_Prodsc = httpContext.cgiGet( edtTas_Prodsc_Internalname) ;
         n6917Tas_Prodsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6917Tas_Prodsc", A6917Tas_Prodsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_Porc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_Porc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_PORC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_Porc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6918Tas_Porc = DecimalUtil.ZERO ;
            n6918Tas_Porc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6918Tas_Porc", GXutil.ltrimstr( A6918Tas_Porc, 6, 2));
         }
         else
         {
            A6918Tas_Porc = localUtil.ctond( httpContext.cgiGet( edtTas_Porc_Internalname)) ;
            n6918Tas_Porc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6918Tas_Porc", GXutil.ltrimstr( A6918Tas_Porc, 6, 2));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtTas_fecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAS_FECHA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_fecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6919Tas_fecha = GXutil.resetTime( GXutil.nullDate() );
            n6919Tas_fecha = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6919Tas_fecha", localUtil.ttoc( A6919Tas_fecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A6919Tas_fecha = localUtil.ctot( httpContext.cgiGet( edtTas_fecha_Internalname)) ;
            n6919Tas_fecha = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6919Tas_fecha", localUtil.ttoc( A6919Tas_fecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A6920Tas_usuari = httpContext.cgiGet( edtTas_usuari_Internalname) ;
         n6920Tas_usuari = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6920Tas_usuari", A6920Tas_usuari);
         A6921Tas_termin = httpContext.cgiGet( edtTas_termin_Internalname) ;
         n6921Tas_termin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6921Tas_termin", A6921Tas_termin);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_precio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_precio_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS_PRECIO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTas_precio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7006Tas_precio = DecimalUtil.ZERO ;
            n7006Tas_precio = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7006Tas_precio", GXutil.ltrimstr( A7006Tas_precio, 13, 5));
         }
         else
         {
            A7006Tas_precio = localUtil.ctond( httpContext.cgiGet( edtTas_precio_Internalname)) ;
            n7006Tas_precio = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7006Tas_precio", GXutil.ltrimstr( A7006Tas_precio, 13, 5));
         }
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
            A6882Tas_num = (int)(GXutil.lval( httpContext.GetPar( "Tas_num"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
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
            initAll1GQ1620( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1622_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1622_Enabled), 5, 0), !bGXsfl_245_Refreshing);
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
      disableAttributes1GQ1620( ) ;
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

   public void confirm_1GQ0( )
   {
      beforeValidate1GQ1620( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GQ1620( ) ;
         }
         else
         {
            checkExtendedTable1GQ1620( ) ;
            if ( AnyError == 0 )
            {
               zm1GQ1620( 2) ;
               zm1GQ1620( 3) ;
            }
            closeExtendedTableCursors1GQ1620( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1620 = Gx_mode ;
         confirm_1GQ1622( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1620 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1GQ0( ) ;
      }
   }

   public void confirm_1GQ1622( )
   {
      nGXsfl_245_idx = 0 ;
      while ( nGXsfl_245_idx < nRC_GXsfl_245 )
      {
         readRow1GQ1622( ) ;
         if ( ( nRcdExists_1622 != 0 ) || ( nIsMod_1622 != 0 ) )
         {
            getKey1GQ1622( ) ;
            if ( ( nRcdExists_1622 == 0 ) && ( nRcdDeleted_1622 == 0 ) )
            {
               if ( RcdFound1622 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1GQ1622( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1GQ1622( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1GQ1622( 5) ;
                     }
                     closeExtendedTableCursors1GQ1622( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TAS_LIN_" + sGXsfl_245_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTas_lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1622 != 0 )
               {
                  if ( nRcdDeleted_1622 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1GQ1622( ) ;
                     load1GQ1622( ) ;
                     beforeValidate1GQ1622( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1GQ1622( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1622 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1GQ1622( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1GQ1622( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1GQ1622( 5) ;
                           }
                           closeExtendedTableCursors1GQ1622( ) ;
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
                  if ( nRcdDeleted_1622 == 0 )
                  {
                     GXCCtl = "TAS_LIN_" + sGXsfl_245_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTas_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1622_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTas_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A6922Tas_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtTas_vel_Internalname, GXutil.ltrim( localUtil.ntoc( A6923Tas_vel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTas_maqc_Internalname, GXutil.rtrim( A6924Tas_maqc)) ;
         httpContext.changePostValue( edtTas_maqd_Internalname, GXutil.rtrim( A6925Tas_maqd)) ;
         httpContext.changePostValue( edtTas_costm_Internalname, GXutil.ltrim( localUtil.ntoc( A6926Tas_costm, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTas_costmt_Internalname, GXutil.ltrim( localUtil.ntoc( A6927Tas_costmt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTas_costt1_Internalname, GXutil.ltrim( localUtil.ntoc( A6928Tas_costt1, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6922Tas_lin_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6922Tas_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6923Tas_vel_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6923Tas_vel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6924Tas_maqc_"+sGXsfl_245_idx, GXutil.rtrim( Z6924Tas_maqc)) ;
         httpContext.changePostValue( "ZT_"+"Z6925Tas_maqd_"+sGXsfl_245_idx, GXutil.rtrim( Z6925Tas_maqd)) ;
         httpContext.changePostValue( "ZT_"+"Z6926Tas_costm_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6926Tas_costm, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6927Tas_costmt_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6927Tas_costmt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6928Tas_costt1_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6928Tas_costt1, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_245_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1622_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1622_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1622_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1622 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1622_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1622_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_LIN_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_VEL_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_vel_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_MAQC_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_maqc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_MAQD_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_maqd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_COSTM_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_COSTMT_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costmt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_COSTT1_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costt1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1GQ0( )
   {
   }

   public void zm1GQ1620( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6883Tas_Artcod = T01GQ6_A6883Tas_Artcod[0] ;
            Z6884Tas_grm2 = T01GQ6_A6884Tas_grm2[0] ;
            Z6885Tas_anccr = T01GQ6_A6885Tas_anccr[0] ;
            Z6886Tas_pml = T01GQ6_A6886Tas_pml[0] ;
            Z6887Tas_kgs = T01GQ6_A6887Tas_kgs[0] ;
            Z6888Tas_mts = T01GQ6_A6888Tas_mts[0] ;
            Z6889Tas_facab = T01GQ6_A6889Tas_facab[0] ;
            Z6890Tas_Vol = T01GQ6_A6890Tas_Vol[0] ;
            Z6891Tas_ColNom = T01GQ6_A6891Tas_ColNom[0] ;
            Z6892Tas_ColNum = T01GQ6_A6892Tas_ColNum[0] ;
            Z6893Tas_Tc = T01GQ6_A6893Tas_Tc[0] ;
            Z6894Tas_coscol = T01GQ6_A6894Tas_coscol[0] ;
            Z6895Tas_rpcod1 = T01GQ6_A6895Tas_rpcod1[0] ;
            Z6896Tas_cosrp1 = T01GQ6_A6896Tas_cosrp1[0] ;
            Z6897Tas_rpdsc1 = T01GQ6_A6897Tas_rpdsc1[0] ;
            Z6898Tas_rpcod2 = T01GQ6_A6898Tas_rpcod2[0] ;
            Z6899Tas_rpdsc2 = T01GQ6_A6899Tas_rpdsc2[0] ;
            Z6900Tas_cosrp2 = T01GQ6_A6900Tas_cosrp2[0] ;
            Z6901Tas_rpcod3 = T01GQ6_A6901Tas_rpcod3[0] ;
            Z6902Tas_rpdsc3 = T01GQ6_A6902Tas_rpdsc3[0] ;
            Z6903Tas_cosrp3 = T01GQ6_A6903Tas_cosrp3[0] ;
            Z6904Tas_racod1 = T01GQ6_A6904Tas_racod1[0] ;
            Z6905Tas_radsc1 = T01GQ6_A6905Tas_radsc1[0] ;
            Z6906Tas_cosra1 = T01GQ6_A6906Tas_cosra1[0] ;
            Z6907Tas_racod2 = T01GQ6_A6907Tas_racod2[0] ;
            Z6908Tas_radsc2 = T01GQ6_A6908Tas_radsc2[0] ;
            Z6909Tas_cosra2 = T01GQ6_A6909Tas_cosra2[0] ;
            Z6910Tas_racod3 = T01GQ6_A6910Tas_racod3[0] ;
            Z6911Tas_radsc3 = T01GQ6_A6911Tas_radsc3[0] ;
            Z6912Tas_cosra3 = T01GQ6_A6912Tas_cosra3[0] ;
            Z6913Tas_cost1 = T01GQ6_A6913Tas_cost1[0] ;
            Z6914Tas_cost2 = T01GQ6_A6914Tas_cost2[0] ;
            Z6915Tas_ultlin = T01GQ6_A6915Tas_ultlin[0] ;
            Z6916Tas_Procod = T01GQ6_A6916Tas_Procod[0] ;
            Z6917Tas_Prodsc = T01GQ6_A6917Tas_Prodsc[0] ;
            Z6918Tas_Porc = T01GQ6_A6918Tas_Porc[0] ;
            Z6919Tas_fecha = T01GQ6_A6919Tas_fecha[0] ;
            Z6920Tas_usuari = T01GQ6_A6920Tas_usuari[0] ;
            Z6921Tas_termin = T01GQ6_A6921Tas_termin[0] ;
            Z7006Tas_precio = T01GQ6_A7006Tas_precio[0] ;
            Z252CliCod = T01GQ6_A252CliCod[0] ;
         }
         else
         {
            Z6883Tas_Artcod = A6883Tas_Artcod ;
            Z6884Tas_grm2 = A6884Tas_grm2 ;
            Z6885Tas_anccr = A6885Tas_anccr ;
            Z6886Tas_pml = A6886Tas_pml ;
            Z6887Tas_kgs = A6887Tas_kgs ;
            Z6888Tas_mts = A6888Tas_mts ;
            Z6889Tas_facab = A6889Tas_facab ;
            Z6890Tas_Vol = A6890Tas_Vol ;
            Z6891Tas_ColNom = A6891Tas_ColNom ;
            Z6892Tas_ColNum = A6892Tas_ColNum ;
            Z6893Tas_Tc = A6893Tas_Tc ;
            Z6894Tas_coscol = A6894Tas_coscol ;
            Z6895Tas_rpcod1 = A6895Tas_rpcod1 ;
            Z6896Tas_cosrp1 = A6896Tas_cosrp1 ;
            Z6897Tas_rpdsc1 = A6897Tas_rpdsc1 ;
            Z6898Tas_rpcod2 = A6898Tas_rpcod2 ;
            Z6899Tas_rpdsc2 = A6899Tas_rpdsc2 ;
            Z6900Tas_cosrp2 = A6900Tas_cosrp2 ;
            Z6901Tas_rpcod3 = A6901Tas_rpcod3 ;
            Z6902Tas_rpdsc3 = A6902Tas_rpdsc3 ;
            Z6903Tas_cosrp3 = A6903Tas_cosrp3 ;
            Z6904Tas_racod1 = A6904Tas_racod1 ;
            Z6905Tas_radsc1 = A6905Tas_radsc1 ;
            Z6906Tas_cosra1 = A6906Tas_cosra1 ;
            Z6907Tas_racod2 = A6907Tas_racod2 ;
            Z6908Tas_radsc2 = A6908Tas_radsc2 ;
            Z6909Tas_cosra2 = A6909Tas_cosra2 ;
            Z6910Tas_racod3 = A6910Tas_racod3 ;
            Z6911Tas_radsc3 = A6911Tas_radsc3 ;
            Z6912Tas_cosra3 = A6912Tas_cosra3 ;
            Z6913Tas_cost1 = A6913Tas_cost1 ;
            Z6914Tas_cost2 = A6914Tas_cost2 ;
            Z6915Tas_ultlin = A6915Tas_ultlin ;
            Z6916Tas_Procod = A6916Tas_Procod ;
            Z6917Tas_Prodsc = A6917Tas_Prodsc ;
            Z6918Tas_Porc = A6918Tas_Porc ;
            Z6919Tas_fecha = A6919Tas_fecha ;
            Z6920Tas_usuari = A6920Tas_usuari ;
            Z6921Tas_termin = A6921Tas_termin ;
            Z7006Tas_precio = A7006Tas_precio ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z6882Tas_num = A6882Tas_num ;
         Z6883Tas_Artcod = A6883Tas_Artcod ;
         Z6884Tas_grm2 = A6884Tas_grm2 ;
         Z6885Tas_anccr = A6885Tas_anccr ;
         Z6886Tas_pml = A6886Tas_pml ;
         Z6887Tas_kgs = A6887Tas_kgs ;
         Z6888Tas_mts = A6888Tas_mts ;
         Z6889Tas_facab = A6889Tas_facab ;
         Z6890Tas_Vol = A6890Tas_Vol ;
         Z6891Tas_ColNom = A6891Tas_ColNom ;
         Z6892Tas_ColNum = A6892Tas_ColNum ;
         Z6893Tas_Tc = A6893Tas_Tc ;
         Z6894Tas_coscol = A6894Tas_coscol ;
         Z6895Tas_rpcod1 = A6895Tas_rpcod1 ;
         Z6896Tas_cosrp1 = A6896Tas_cosrp1 ;
         Z6897Tas_rpdsc1 = A6897Tas_rpdsc1 ;
         Z6898Tas_rpcod2 = A6898Tas_rpcod2 ;
         Z6899Tas_rpdsc2 = A6899Tas_rpdsc2 ;
         Z6900Tas_cosrp2 = A6900Tas_cosrp2 ;
         Z6901Tas_rpcod3 = A6901Tas_rpcod3 ;
         Z6902Tas_rpdsc3 = A6902Tas_rpdsc3 ;
         Z6903Tas_cosrp3 = A6903Tas_cosrp3 ;
         Z6904Tas_racod1 = A6904Tas_racod1 ;
         Z6905Tas_radsc1 = A6905Tas_radsc1 ;
         Z6906Tas_cosra1 = A6906Tas_cosra1 ;
         Z6907Tas_racod2 = A6907Tas_racod2 ;
         Z6908Tas_radsc2 = A6908Tas_radsc2 ;
         Z6909Tas_cosra2 = A6909Tas_cosra2 ;
         Z6910Tas_racod3 = A6910Tas_racod3 ;
         Z6911Tas_radsc3 = A6911Tas_radsc3 ;
         Z6912Tas_cosra3 = A6912Tas_cosra3 ;
         Z6913Tas_cost1 = A6913Tas_cost1 ;
         Z6914Tas_cost2 = A6914Tas_cost2 ;
         Z6915Tas_ultlin = A6915Tas_ultlin ;
         Z6916Tas_Procod = A6916Tas_Procod ;
         Z6917Tas_Prodsc = A6917Tas_Prodsc ;
         Z6918Tas_Porc = A6918Tas_Porc ;
         Z6919Tas_fecha = A6919Tas_fecha ;
         Z6920Tas_usuari = A6920Tas_usuari ;
         Z6921Tas_termin = A6921Tas_termin ;
         Z7006Tas_precio = A7006Tas_precio ;
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

   public void load1GQ1620( )
   {
      /* Using cursor T01GQ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1620 = (short)(1) ;
         A407EmprNom = T01GQ9_A407EmprNom[0] ;
         n407EmprNom = T01GQ9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01GQ9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A6883Tas_Artcod = T01GQ9_A6883Tas_Artcod[0] ;
         n6883Tas_Artcod = T01GQ9_n6883Tas_Artcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6883Tas_Artcod", A6883Tas_Artcod);
         A6884Tas_grm2 = T01GQ9_A6884Tas_grm2[0] ;
         n6884Tas_grm2 = T01GQ9_n6884Tas_grm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6884Tas_grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6884Tas_grm2), 4, 0));
         A6885Tas_anccr = T01GQ9_A6885Tas_anccr[0] ;
         n6885Tas_anccr = T01GQ9_n6885Tas_anccr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6885Tas_anccr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6885Tas_anccr), 3, 0));
         A6886Tas_pml = T01GQ9_A6886Tas_pml[0] ;
         n6886Tas_pml = T01GQ9_n6886Tas_pml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6886Tas_pml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6886Tas_pml), 4, 0));
         A6887Tas_kgs = T01GQ9_A6887Tas_kgs[0] ;
         n6887Tas_kgs = T01GQ9_n6887Tas_kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6887Tas_kgs", GXutil.ltrimstr( A6887Tas_kgs, 9, 2));
         A6888Tas_mts = T01GQ9_A6888Tas_mts[0] ;
         n6888Tas_mts = T01GQ9_n6888Tas_mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6888Tas_mts", GXutil.ltrimstr( A6888Tas_mts, 9, 2));
         A6889Tas_facab = T01GQ9_A6889Tas_facab[0] ;
         n6889Tas_facab = T01GQ9_n6889Tas_facab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6889Tas_facab", GXutil.ltrimstr( A6889Tas_facab, 6, 2));
         A6890Tas_Vol = T01GQ9_A6890Tas_Vol[0] ;
         n6890Tas_Vol = T01GQ9_n6890Tas_Vol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6890Tas_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6890Tas_Vol), 5, 0));
         A6891Tas_ColNom = T01GQ9_A6891Tas_ColNom[0] ;
         n6891Tas_ColNom = T01GQ9_n6891Tas_ColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6891Tas_ColNom", A6891Tas_ColNom);
         A6892Tas_ColNum = T01GQ9_A6892Tas_ColNum[0] ;
         n6892Tas_ColNum = T01GQ9_n6892Tas_ColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6892Tas_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6892Tas_ColNum), 6, 0));
         A6893Tas_Tc = T01GQ9_A6893Tas_Tc[0] ;
         n6893Tas_Tc = T01GQ9_n6893Tas_Tc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6893Tas_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6893Tas_Tc), 2, 0));
         A6894Tas_coscol = T01GQ9_A6894Tas_coscol[0] ;
         n6894Tas_coscol = T01GQ9_n6894Tas_coscol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6894Tas_coscol", GXutil.ltrimstr( A6894Tas_coscol, 11, 5));
         A6895Tas_rpcod1 = T01GQ9_A6895Tas_rpcod1[0] ;
         n6895Tas_rpcod1 = T01GQ9_n6895Tas_rpcod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6895Tas_rpcod1", A6895Tas_rpcod1);
         A6896Tas_cosrp1 = T01GQ9_A6896Tas_cosrp1[0] ;
         n6896Tas_cosrp1 = T01GQ9_n6896Tas_cosrp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6896Tas_cosrp1", GXutil.ltrimstr( A6896Tas_cosrp1, 11, 5));
         A6897Tas_rpdsc1 = T01GQ9_A6897Tas_rpdsc1[0] ;
         n6897Tas_rpdsc1 = T01GQ9_n6897Tas_rpdsc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6897Tas_rpdsc1", A6897Tas_rpdsc1);
         A6898Tas_rpcod2 = T01GQ9_A6898Tas_rpcod2[0] ;
         n6898Tas_rpcod2 = T01GQ9_n6898Tas_rpcod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6898Tas_rpcod2", A6898Tas_rpcod2);
         A6899Tas_rpdsc2 = T01GQ9_A6899Tas_rpdsc2[0] ;
         n6899Tas_rpdsc2 = T01GQ9_n6899Tas_rpdsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6899Tas_rpdsc2", A6899Tas_rpdsc2);
         A6900Tas_cosrp2 = T01GQ9_A6900Tas_cosrp2[0] ;
         n6900Tas_cosrp2 = T01GQ9_n6900Tas_cosrp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6900Tas_cosrp2", GXutil.ltrimstr( A6900Tas_cosrp2, 11, 5));
         A6901Tas_rpcod3 = T01GQ9_A6901Tas_rpcod3[0] ;
         n6901Tas_rpcod3 = T01GQ9_n6901Tas_rpcod3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6901Tas_rpcod3", A6901Tas_rpcod3);
         A6902Tas_rpdsc3 = T01GQ9_A6902Tas_rpdsc3[0] ;
         n6902Tas_rpdsc3 = T01GQ9_n6902Tas_rpdsc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6902Tas_rpdsc3", A6902Tas_rpdsc3);
         A6903Tas_cosrp3 = T01GQ9_A6903Tas_cosrp3[0] ;
         n6903Tas_cosrp3 = T01GQ9_n6903Tas_cosrp3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6903Tas_cosrp3", GXutil.ltrimstr( A6903Tas_cosrp3, 11, 5));
         A6904Tas_racod1 = T01GQ9_A6904Tas_racod1[0] ;
         n6904Tas_racod1 = T01GQ9_n6904Tas_racod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6904Tas_racod1", A6904Tas_racod1);
         A6905Tas_radsc1 = T01GQ9_A6905Tas_radsc1[0] ;
         n6905Tas_radsc1 = T01GQ9_n6905Tas_radsc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6905Tas_radsc1", A6905Tas_radsc1);
         A6906Tas_cosra1 = T01GQ9_A6906Tas_cosra1[0] ;
         n6906Tas_cosra1 = T01GQ9_n6906Tas_cosra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6906Tas_cosra1", GXutil.ltrimstr( A6906Tas_cosra1, 11, 5));
         A6907Tas_racod2 = T01GQ9_A6907Tas_racod2[0] ;
         n6907Tas_racod2 = T01GQ9_n6907Tas_racod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6907Tas_racod2", A6907Tas_racod2);
         A6908Tas_radsc2 = T01GQ9_A6908Tas_radsc2[0] ;
         n6908Tas_radsc2 = T01GQ9_n6908Tas_radsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6908Tas_radsc2", A6908Tas_radsc2);
         A6909Tas_cosra2 = T01GQ9_A6909Tas_cosra2[0] ;
         n6909Tas_cosra2 = T01GQ9_n6909Tas_cosra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6909Tas_cosra2", GXutil.ltrimstr( A6909Tas_cosra2, 11, 5));
         A6910Tas_racod3 = T01GQ9_A6910Tas_racod3[0] ;
         n6910Tas_racod3 = T01GQ9_n6910Tas_racod3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6910Tas_racod3", A6910Tas_racod3);
         A6911Tas_radsc3 = T01GQ9_A6911Tas_radsc3[0] ;
         n6911Tas_radsc3 = T01GQ9_n6911Tas_radsc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6911Tas_radsc3", A6911Tas_radsc3);
         A6912Tas_cosra3 = T01GQ9_A6912Tas_cosra3[0] ;
         n6912Tas_cosra3 = T01GQ9_n6912Tas_cosra3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6912Tas_cosra3", GXutil.ltrimstr( A6912Tas_cosra3, 11, 5));
         A6913Tas_cost1 = T01GQ9_A6913Tas_cost1[0] ;
         n6913Tas_cost1 = T01GQ9_n6913Tas_cost1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6913Tas_cost1", GXutil.ltrimstr( A6913Tas_cost1, 11, 3));
         A6914Tas_cost2 = T01GQ9_A6914Tas_cost2[0] ;
         n6914Tas_cost2 = T01GQ9_n6914Tas_cost2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6914Tas_cost2", GXutil.ltrimstr( A6914Tas_cost2, 11, 3));
         A6915Tas_ultlin = T01GQ9_A6915Tas_ultlin[0] ;
         n6915Tas_ultlin = T01GQ9_n6915Tas_ultlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6915Tas_ultlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6915Tas_ultlin), 4, 0));
         A6916Tas_Procod = T01GQ9_A6916Tas_Procod[0] ;
         n6916Tas_Procod = T01GQ9_n6916Tas_Procod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6916Tas_Procod", A6916Tas_Procod);
         A6917Tas_Prodsc = T01GQ9_A6917Tas_Prodsc[0] ;
         n6917Tas_Prodsc = T01GQ9_n6917Tas_Prodsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6917Tas_Prodsc", A6917Tas_Prodsc);
         A6918Tas_Porc = T01GQ9_A6918Tas_Porc[0] ;
         n6918Tas_Porc = T01GQ9_n6918Tas_Porc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6918Tas_Porc", GXutil.ltrimstr( A6918Tas_Porc, 6, 2));
         A6919Tas_fecha = T01GQ9_A6919Tas_fecha[0] ;
         n6919Tas_fecha = T01GQ9_n6919Tas_fecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6919Tas_fecha", localUtil.ttoc( A6919Tas_fecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6920Tas_usuari = T01GQ9_A6920Tas_usuari[0] ;
         n6920Tas_usuari = T01GQ9_n6920Tas_usuari[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6920Tas_usuari", A6920Tas_usuari);
         A6921Tas_termin = T01GQ9_A6921Tas_termin[0] ;
         n6921Tas_termin = T01GQ9_n6921Tas_termin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6921Tas_termin", A6921Tas_termin);
         A7006Tas_precio = T01GQ9_A7006Tas_precio[0] ;
         n7006Tas_precio = T01GQ9_n7006Tas_precio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7006Tas_precio", GXutil.ltrimstr( A7006Tas_precio, 13, 5));
         A252CliCod = T01GQ9_A252CliCod[0] ;
         n252CliCod = T01GQ9_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1GQ1620( -1) ;
      }
      pr_default.close(7);
      onLoadActions1GQ1620( ) ;
   }

   public void onLoadActions1GQ1620( )
   {
   }

   public void checkExtendedTable1GQ1620( )
   {
      nIsDirty_1620 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01GQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GQ7_A407EmprNom[0] ;
      n407EmprNom = T01GQ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01GQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01GQ8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1GQ1620( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01GQ10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GQ10_A407EmprNom[0] ;
      n407EmprNom = T01GQ10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01GQ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01GQ11_A279CliNom[0] ;
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

   public void getKey1GQ1620( )
   {
      /* Using cursor T01GQ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1620 = (short)(1) ;
      }
      else
      {
         RcdFound1620 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1GQ1620( 1) ;
         RcdFound1620 = (short)(1) ;
         A6882Tas_num = T01GQ6_A6882Tas_num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
         A6883Tas_Artcod = T01GQ6_A6883Tas_Artcod[0] ;
         n6883Tas_Artcod = T01GQ6_n6883Tas_Artcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6883Tas_Artcod", A6883Tas_Artcod);
         A6884Tas_grm2 = T01GQ6_A6884Tas_grm2[0] ;
         n6884Tas_grm2 = T01GQ6_n6884Tas_grm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6884Tas_grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6884Tas_grm2), 4, 0));
         A6885Tas_anccr = T01GQ6_A6885Tas_anccr[0] ;
         n6885Tas_anccr = T01GQ6_n6885Tas_anccr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6885Tas_anccr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6885Tas_anccr), 3, 0));
         A6886Tas_pml = T01GQ6_A6886Tas_pml[0] ;
         n6886Tas_pml = T01GQ6_n6886Tas_pml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6886Tas_pml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6886Tas_pml), 4, 0));
         A6887Tas_kgs = T01GQ6_A6887Tas_kgs[0] ;
         n6887Tas_kgs = T01GQ6_n6887Tas_kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6887Tas_kgs", GXutil.ltrimstr( A6887Tas_kgs, 9, 2));
         A6888Tas_mts = T01GQ6_A6888Tas_mts[0] ;
         n6888Tas_mts = T01GQ6_n6888Tas_mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6888Tas_mts", GXutil.ltrimstr( A6888Tas_mts, 9, 2));
         A6889Tas_facab = T01GQ6_A6889Tas_facab[0] ;
         n6889Tas_facab = T01GQ6_n6889Tas_facab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6889Tas_facab", GXutil.ltrimstr( A6889Tas_facab, 6, 2));
         A6890Tas_Vol = T01GQ6_A6890Tas_Vol[0] ;
         n6890Tas_Vol = T01GQ6_n6890Tas_Vol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6890Tas_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6890Tas_Vol), 5, 0));
         A6891Tas_ColNom = T01GQ6_A6891Tas_ColNom[0] ;
         n6891Tas_ColNom = T01GQ6_n6891Tas_ColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6891Tas_ColNom", A6891Tas_ColNom);
         A6892Tas_ColNum = T01GQ6_A6892Tas_ColNum[0] ;
         n6892Tas_ColNum = T01GQ6_n6892Tas_ColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6892Tas_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6892Tas_ColNum), 6, 0));
         A6893Tas_Tc = T01GQ6_A6893Tas_Tc[0] ;
         n6893Tas_Tc = T01GQ6_n6893Tas_Tc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6893Tas_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6893Tas_Tc), 2, 0));
         A6894Tas_coscol = T01GQ6_A6894Tas_coscol[0] ;
         n6894Tas_coscol = T01GQ6_n6894Tas_coscol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6894Tas_coscol", GXutil.ltrimstr( A6894Tas_coscol, 11, 5));
         A6895Tas_rpcod1 = T01GQ6_A6895Tas_rpcod1[0] ;
         n6895Tas_rpcod1 = T01GQ6_n6895Tas_rpcod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6895Tas_rpcod1", A6895Tas_rpcod1);
         A6896Tas_cosrp1 = T01GQ6_A6896Tas_cosrp1[0] ;
         n6896Tas_cosrp1 = T01GQ6_n6896Tas_cosrp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6896Tas_cosrp1", GXutil.ltrimstr( A6896Tas_cosrp1, 11, 5));
         A6897Tas_rpdsc1 = T01GQ6_A6897Tas_rpdsc1[0] ;
         n6897Tas_rpdsc1 = T01GQ6_n6897Tas_rpdsc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6897Tas_rpdsc1", A6897Tas_rpdsc1);
         A6898Tas_rpcod2 = T01GQ6_A6898Tas_rpcod2[0] ;
         n6898Tas_rpcod2 = T01GQ6_n6898Tas_rpcod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6898Tas_rpcod2", A6898Tas_rpcod2);
         A6899Tas_rpdsc2 = T01GQ6_A6899Tas_rpdsc2[0] ;
         n6899Tas_rpdsc2 = T01GQ6_n6899Tas_rpdsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6899Tas_rpdsc2", A6899Tas_rpdsc2);
         A6900Tas_cosrp2 = T01GQ6_A6900Tas_cosrp2[0] ;
         n6900Tas_cosrp2 = T01GQ6_n6900Tas_cosrp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6900Tas_cosrp2", GXutil.ltrimstr( A6900Tas_cosrp2, 11, 5));
         A6901Tas_rpcod3 = T01GQ6_A6901Tas_rpcod3[0] ;
         n6901Tas_rpcod3 = T01GQ6_n6901Tas_rpcod3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6901Tas_rpcod3", A6901Tas_rpcod3);
         A6902Tas_rpdsc3 = T01GQ6_A6902Tas_rpdsc3[0] ;
         n6902Tas_rpdsc3 = T01GQ6_n6902Tas_rpdsc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6902Tas_rpdsc3", A6902Tas_rpdsc3);
         A6903Tas_cosrp3 = T01GQ6_A6903Tas_cosrp3[0] ;
         n6903Tas_cosrp3 = T01GQ6_n6903Tas_cosrp3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6903Tas_cosrp3", GXutil.ltrimstr( A6903Tas_cosrp3, 11, 5));
         A6904Tas_racod1 = T01GQ6_A6904Tas_racod1[0] ;
         n6904Tas_racod1 = T01GQ6_n6904Tas_racod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6904Tas_racod1", A6904Tas_racod1);
         A6905Tas_radsc1 = T01GQ6_A6905Tas_radsc1[0] ;
         n6905Tas_radsc1 = T01GQ6_n6905Tas_radsc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6905Tas_radsc1", A6905Tas_radsc1);
         A6906Tas_cosra1 = T01GQ6_A6906Tas_cosra1[0] ;
         n6906Tas_cosra1 = T01GQ6_n6906Tas_cosra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6906Tas_cosra1", GXutil.ltrimstr( A6906Tas_cosra1, 11, 5));
         A6907Tas_racod2 = T01GQ6_A6907Tas_racod2[0] ;
         n6907Tas_racod2 = T01GQ6_n6907Tas_racod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6907Tas_racod2", A6907Tas_racod2);
         A6908Tas_radsc2 = T01GQ6_A6908Tas_radsc2[0] ;
         n6908Tas_radsc2 = T01GQ6_n6908Tas_radsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6908Tas_radsc2", A6908Tas_radsc2);
         A6909Tas_cosra2 = T01GQ6_A6909Tas_cosra2[0] ;
         n6909Tas_cosra2 = T01GQ6_n6909Tas_cosra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6909Tas_cosra2", GXutil.ltrimstr( A6909Tas_cosra2, 11, 5));
         A6910Tas_racod3 = T01GQ6_A6910Tas_racod3[0] ;
         n6910Tas_racod3 = T01GQ6_n6910Tas_racod3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6910Tas_racod3", A6910Tas_racod3);
         A6911Tas_radsc3 = T01GQ6_A6911Tas_radsc3[0] ;
         n6911Tas_radsc3 = T01GQ6_n6911Tas_radsc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6911Tas_radsc3", A6911Tas_radsc3);
         A6912Tas_cosra3 = T01GQ6_A6912Tas_cosra3[0] ;
         n6912Tas_cosra3 = T01GQ6_n6912Tas_cosra3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6912Tas_cosra3", GXutil.ltrimstr( A6912Tas_cosra3, 11, 5));
         A6913Tas_cost1 = T01GQ6_A6913Tas_cost1[0] ;
         n6913Tas_cost1 = T01GQ6_n6913Tas_cost1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6913Tas_cost1", GXutil.ltrimstr( A6913Tas_cost1, 11, 3));
         A6914Tas_cost2 = T01GQ6_A6914Tas_cost2[0] ;
         n6914Tas_cost2 = T01GQ6_n6914Tas_cost2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6914Tas_cost2", GXutil.ltrimstr( A6914Tas_cost2, 11, 3));
         A6915Tas_ultlin = T01GQ6_A6915Tas_ultlin[0] ;
         n6915Tas_ultlin = T01GQ6_n6915Tas_ultlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6915Tas_ultlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6915Tas_ultlin), 4, 0));
         A6916Tas_Procod = T01GQ6_A6916Tas_Procod[0] ;
         n6916Tas_Procod = T01GQ6_n6916Tas_Procod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6916Tas_Procod", A6916Tas_Procod);
         A6917Tas_Prodsc = T01GQ6_A6917Tas_Prodsc[0] ;
         n6917Tas_Prodsc = T01GQ6_n6917Tas_Prodsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6917Tas_Prodsc", A6917Tas_Prodsc);
         A6918Tas_Porc = T01GQ6_A6918Tas_Porc[0] ;
         n6918Tas_Porc = T01GQ6_n6918Tas_Porc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6918Tas_Porc", GXutil.ltrimstr( A6918Tas_Porc, 6, 2));
         A6919Tas_fecha = T01GQ6_A6919Tas_fecha[0] ;
         n6919Tas_fecha = T01GQ6_n6919Tas_fecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6919Tas_fecha", localUtil.ttoc( A6919Tas_fecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6920Tas_usuari = T01GQ6_A6920Tas_usuari[0] ;
         n6920Tas_usuari = T01GQ6_n6920Tas_usuari[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6920Tas_usuari", A6920Tas_usuari);
         A6921Tas_termin = T01GQ6_A6921Tas_termin[0] ;
         n6921Tas_termin = T01GQ6_n6921Tas_termin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6921Tas_termin", A6921Tas_termin);
         A7006Tas_precio = T01GQ6_A7006Tas_precio[0] ;
         n7006Tas_precio = T01GQ6_n7006Tas_precio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7006Tas_precio", GXutil.ltrimstr( A7006Tas_precio, 13, 5));
         A396EmprCod = T01GQ6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01GQ6_A252CliCod[0] ;
         n252CliCod = T01GQ6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z6882Tas_num = A6882Tas_num ;
         sMode1620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GQ1620( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1620 = (short)(0) ;
            initializeNonKey1GQ1620( ) ;
         }
         Gx_mode = sMode1620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1620 = (short)(0) ;
         initializeNonKey1GQ1620( ) ;
         sMode1620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1GQ1620( ) ;
      if ( RcdFound1620 == 0 )
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
      RcdFound1620 = (short)(0) ;
      /* Using cursor T01GQ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A6882Tas_num)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01GQ13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GQ13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GQ13_A6882Tas_num[0] < A6882Tas_num ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01GQ13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GQ13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GQ13_A6882Tas_num[0] > A6882Tas_num ) ) )
         {
            A396EmprCod = T01GQ13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6882Tas_num = T01GQ13_A6882Tas_num[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
            RcdFound1620 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1620 = (short)(0) ;
      /* Using cursor T01GQ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A6882Tas_num)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01GQ14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GQ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GQ14_A6882Tas_num[0] > A6882Tas_num ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01GQ14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GQ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GQ14_A6882Tas_num[0] < A6882Tas_num ) ) )
         {
            A396EmprCod = T01GQ14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6882Tas_num = T01GQ14_A6882Tas_num[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
            RcdFound1620 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GQ1620( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GQ1620( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1620 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6882Tas_num != Z6882Tas_num ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A6882Tas_num = Z6882Tas_num ;
               httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
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
               update1GQ1620( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6882Tas_num != Z6882Tas_num ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GQ1620( ) ;
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
                  insert1GQ1620( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6882Tas_num != Z6882Tas_num ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6882Tas_num = Z6882Tas_num ;
         httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
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
      getKey1GQ1620( ) ;
      if ( RcdFound1620 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6882Tas_num != Z6882Tas_num ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6882Tas_num = Z6882Tas_num ;
            httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6882Tas_num != Z6882Tas_num ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcostas");
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GQ0( ) ;
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
      if ( RcdFound1620 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GQ1620( ) ;
      if ( RcdFound1620 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GQ1620( ) ;
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
      if ( RcdFound1620 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      if ( RcdFound1620 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      scanStart1GQ1620( ) ;
      if ( RcdFound1620 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1620 != 0 )
         {
            scanNext1GQ1620( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GQ1620( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GQ1620( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSTAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z6883Tas_Artcod, T01GQ5_A6883Tas_Artcod[0]) != 0 ) || ( Z6884Tas_grm2 != T01GQ5_A6884Tas_grm2[0] ) || ( Z6885Tas_anccr != T01GQ5_A6885Tas_anccr[0] ) || ( Z6886Tas_pml != T01GQ5_A6886Tas_pml[0] ) || ( DecimalUtil.compareTo(Z6887Tas_kgs, T01GQ5_A6887Tas_kgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6888Tas_mts, T01GQ5_A6888Tas_mts[0]) != 0 ) || ( DecimalUtil.compareTo(Z6889Tas_facab, T01GQ5_A6889Tas_facab[0]) != 0 ) || ( Z6890Tas_Vol != T01GQ5_A6890Tas_Vol[0] ) || ( GXutil.strcmp(Z6891Tas_ColNom, T01GQ5_A6891Tas_ColNom[0]) != 0 ) || ( Z6892Tas_ColNum != T01GQ5_A6892Tas_ColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6893Tas_Tc != T01GQ5_A6893Tas_Tc[0] ) || ( DecimalUtil.compareTo(Z6894Tas_coscol, T01GQ5_A6894Tas_coscol[0]) != 0 ) || ( GXutil.strcmp(Z6895Tas_rpcod1, T01GQ5_A6895Tas_rpcod1[0]) != 0 ) || ( DecimalUtil.compareTo(Z6896Tas_cosrp1, T01GQ5_A6896Tas_cosrp1[0]) != 0 ) || ( GXutil.strcmp(Z6897Tas_rpdsc1, T01GQ5_A6897Tas_rpdsc1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6898Tas_rpcod2, T01GQ5_A6898Tas_rpcod2[0]) != 0 ) || ( GXutil.strcmp(Z6899Tas_rpdsc2, T01GQ5_A6899Tas_rpdsc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z6900Tas_cosrp2, T01GQ5_A6900Tas_cosrp2[0]) != 0 ) || ( GXutil.strcmp(Z6901Tas_rpcod3, T01GQ5_A6901Tas_rpcod3[0]) != 0 ) || ( GXutil.strcmp(Z6902Tas_rpdsc3, T01GQ5_A6902Tas_rpdsc3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6903Tas_cosrp3, T01GQ5_A6903Tas_cosrp3[0]) != 0 ) || ( GXutil.strcmp(Z6904Tas_racod1, T01GQ5_A6904Tas_racod1[0]) != 0 ) || ( GXutil.strcmp(Z6905Tas_radsc1, T01GQ5_A6905Tas_radsc1[0]) != 0 ) || ( DecimalUtil.compareTo(Z6906Tas_cosra1, T01GQ5_A6906Tas_cosra1[0]) != 0 ) || ( GXutil.strcmp(Z6907Tas_racod2, T01GQ5_A6907Tas_racod2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6908Tas_radsc2, T01GQ5_A6908Tas_radsc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z6909Tas_cosra2, T01GQ5_A6909Tas_cosra2[0]) != 0 ) || ( GXutil.strcmp(Z6910Tas_racod3, T01GQ5_A6910Tas_racod3[0]) != 0 ) || ( GXutil.strcmp(Z6911Tas_radsc3, T01GQ5_A6911Tas_radsc3[0]) != 0 ) || ( DecimalUtil.compareTo(Z6912Tas_cosra3, T01GQ5_A6912Tas_cosra3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6913Tas_cost1, T01GQ5_A6913Tas_cost1[0]) != 0 ) || ( DecimalUtil.compareTo(Z6914Tas_cost2, T01GQ5_A6914Tas_cost2[0]) != 0 ) || ( Z6915Tas_ultlin != T01GQ5_A6915Tas_ultlin[0] ) || ( GXutil.strcmp(Z6916Tas_Procod, T01GQ5_A6916Tas_Procod[0]) != 0 ) || ( GXutil.strcmp(Z6917Tas_Prodsc, T01GQ5_A6917Tas_Prodsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6918Tas_Porc, T01GQ5_A6918Tas_Porc[0]) != 0 ) || !( GXutil.dateCompare(Z6919Tas_fecha, T01GQ5_A6919Tas_fecha[0]) ) || ( GXutil.strcmp(Z6920Tas_usuari, T01GQ5_A6920Tas_usuari[0]) != 0 ) || ( GXutil.strcmp(Z6921Tas_termin, T01GQ5_A6921Tas_termin[0]) != 0 ) || ( DecimalUtil.compareTo(Z7006Tas_precio, T01GQ5_A7006Tas_precio[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z252CliCod != T01GQ5_A252CliCod[0] ) )
         {
            if ( GXutil.strcmp(Z6883Tas_Artcod, T01GQ5_A6883Tas_Artcod[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_Artcod");
               GXutil.writeLogRaw("Old: ",Z6883Tas_Artcod);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6883Tas_Artcod[0]);
            }
            if ( Z6884Tas_grm2 != T01GQ5_A6884Tas_grm2[0] )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_grm2");
               GXutil.writeLogRaw("Old: ",Z6884Tas_grm2);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6884Tas_grm2[0]);
            }
            if ( Z6885Tas_anccr != T01GQ5_A6885Tas_anccr[0] )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_anccr");
               GXutil.writeLogRaw("Old: ",Z6885Tas_anccr);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6885Tas_anccr[0]);
            }
            if ( Z6886Tas_pml != T01GQ5_A6886Tas_pml[0] )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_pml");
               GXutil.writeLogRaw("Old: ",Z6886Tas_pml);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6886Tas_pml[0]);
            }
            if ( DecimalUtil.compareTo(Z6887Tas_kgs, T01GQ5_A6887Tas_kgs[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_kgs");
               GXutil.writeLogRaw("Old: ",Z6887Tas_kgs);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6887Tas_kgs[0]);
            }
            if ( DecimalUtil.compareTo(Z6888Tas_mts, T01GQ5_A6888Tas_mts[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_mts");
               GXutil.writeLogRaw("Old: ",Z6888Tas_mts);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6888Tas_mts[0]);
            }
            if ( DecimalUtil.compareTo(Z6889Tas_facab, T01GQ5_A6889Tas_facab[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_facab");
               GXutil.writeLogRaw("Old: ",Z6889Tas_facab);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6889Tas_facab[0]);
            }
            if ( Z6890Tas_Vol != T01GQ5_A6890Tas_Vol[0] )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_Vol");
               GXutil.writeLogRaw("Old: ",Z6890Tas_Vol);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6890Tas_Vol[0]);
            }
            if ( GXutil.strcmp(Z6891Tas_ColNom, T01GQ5_A6891Tas_ColNom[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_ColNom");
               GXutil.writeLogRaw("Old: ",Z6891Tas_ColNom);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6891Tas_ColNom[0]);
            }
            if ( Z6892Tas_ColNum != T01GQ5_A6892Tas_ColNum[0] )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_ColNum");
               GXutil.writeLogRaw("Old: ",Z6892Tas_ColNum);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6892Tas_ColNum[0]);
            }
            if ( Z6893Tas_Tc != T01GQ5_A6893Tas_Tc[0] )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_Tc");
               GXutil.writeLogRaw("Old: ",Z6893Tas_Tc);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6893Tas_Tc[0]);
            }
            if ( DecimalUtil.compareTo(Z6894Tas_coscol, T01GQ5_A6894Tas_coscol[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_coscol");
               GXutil.writeLogRaw("Old: ",Z6894Tas_coscol);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6894Tas_coscol[0]);
            }
            if ( GXutil.strcmp(Z6895Tas_rpcod1, T01GQ5_A6895Tas_rpcod1[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_rpcod1");
               GXutil.writeLogRaw("Old: ",Z6895Tas_rpcod1);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6895Tas_rpcod1[0]);
            }
            if ( DecimalUtil.compareTo(Z6896Tas_cosrp1, T01GQ5_A6896Tas_cosrp1[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_cosrp1");
               GXutil.writeLogRaw("Old: ",Z6896Tas_cosrp1);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6896Tas_cosrp1[0]);
            }
            if ( GXutil.strcmp(Z6897Tas_rpdsc1, T01GQ5_A6897Tas_rpdsc1[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_rpdsc1");
               GXutil.writeLogRaw("Old: ",Z6897Tas_rpdsc1);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6897Tas_rpdsc1[0]);
            }
            if ( GXutil.strcmp(Z6898Tas_rpcod2, T01GQ5_A6898Tas_rpcod2[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_rpcod2");
               GXutil.writeLogRaw("Old: ",Z6898Tas_rpcod2);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6898Tas_rpcod2[0]);
            }
            if ( GXutil.strcmp(Z6899Tas_rpdsc2, T01GQ5_A6899Tas_rpdsc2[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_rpdsc2");
               GXutil.writeLogRaw("Old: ",Z6899Tas_rpdsc2);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6899Tas_rpdsc2[0]);
            }
            if ( DecimalUtil.compareTo(Z6900Tas_cosrp2, T01GQ5_A6900Tas_cosrp2[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_cosrp2");
               GXutil.writeLogRaw("Old: ",Z6900Tas_cosrp2);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6900Tas_cosrp2[0]);
            }
            if ( GXutil.strcmp(Z6901Tas_rpcod3, T01GQ5_A6901Tas_rpcod3[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_rpcod3");
               GXutil.writeLogRaw("Old: ",Z6901Tas_rpcod3);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6901Tas_rpcod3[0]);
            }
            if ( GXutil.strcmp(Z6902Tas_rpdsc3, T01GQ5_A6902Tas_rpdsc3[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_rpdsc3");
               GXutil.writeLogRaw("Old: ",Z6902Tas_rpdsc3);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6902Tas_rpdsc3[0]);
            }
            if ( DecimalUtil.compareTo(Z6903Tas_cosrp3, T01GQ5_A6903Tas_cosrp3[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_cosrp3");
               GXutil.writeLogRaw("Old: ",Z6903Tas_cosrp3);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6903Tas_cosrp3[0]);
            }
            if ( GXutil.strcmp(Z6904Tas_racod1, T01GQ5_A6904Tas_racod1[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_racod1");
               GXutil.writeLogRaw("Old: ",Z6904Tas_racod1);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6904Tas_racod1[0]);
            }
            if ( GXutil.strcmp(Z6905Tas_radsc1, T01GQ5_A6905Tas_radsc1[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_radsc1");
               GXutil.writeLogRaw("Old: ",Z6905Tas_radsc1);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6905Tas_radsc1[0]);
            }
            if ( DecimalUtil.compareTo(Z6906Tas_cosra1, T01GQ5_A6906Tas_cosra1[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_cosra1");
               GXutil.writeLogRaw("Old: ",Z6906Tas_cosra1);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6906Tas_cosra1[0]);
            }
            if ( GXutil.strcmp(Z6907Tas_racod2, T01GQ5_A6907Tas_racod2[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_racod2");
               GXutil.writeLogRaw("Old: ",Z6907Tas_racod2);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6907Tas_racod2[0]);
            }
            if ( GXutil.strcmp(Z6908Tas_radsc2, T01GQ5_A6908Tas_radsc2[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_radsc2");
               GXutil.writeLogRaw("Old: ",Z6908Tas_radsc2);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6908Tas_radsc2[0]);
            }
            if ( DecimalUtil.compareTo(Z6909Tas_cosra2, T01GQ5_A6909Tas_cosra2[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_cosra2");
               GXutil.writeLogRaw("Old: ",Z6909Tas_cosra2);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6909Tas_cosra2[0]);
            }
            if ( GXutil.strcmp(Z6910Tas_racod3, T01GQ5_A6910Tas_racod3[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_racod3");
               GXutil.writeLogRaw("Old: ",Z6910Tas_racod3);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6910Tas_racod3[0]);
            }
            if ( GXutil.strcmp(Z6911Tas_radsc3, T01GQ5_A6911Tas_radsc3[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_radsc3");
               GXutil.writeLogRaw("Old: ",Z6911Tas_radsc3);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6911Tas_radsc3[0]);
            }
            if ( DecimalUtil.compareTo(Z6912Tas_cosra3, T01GQ5_A6912Tas_cosra3[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_cosra3");
               GXutil.writeLogRaw("Old: ",Z6912Tas_cosra3);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6912Tas_cosra3[0]);
            }
            if ( DecimalUtil.compareTo(Z6913Tas_cost1, T01GQ5_A6913Tas_cost1[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_cost1");
               GXutil.writeLogRaw("Old: ",Z6913Tas_cost1);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6913Tas_cost1[0]);
            }
            if ( DecimalUtil.compareTo(Z6914Tas_cost2, T01GQ5_A6914Tas_cost2[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_cost2");
               GXutil.writeLogRaw("Old: ",Z6914Tas_cost2);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6914Tas_cost2[0]);
            }
            if ( Z6915Tas_ultlin != T01GQ5_A6915Tas_ultlin[0] )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_ultlin");
               GXutil.writeLogRaw("Old: ",Z6915Tas_ultlin);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6915Tas_ultlin[0]);
            }
            if ( GXutil.strcmp(Z6916Tas_Procod, T01GQ5_A6916Tas_Procod[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_Procod");
               GXutil.writeLogRaw("Old: ",Z6916Tas_Procod);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6916Tas_Procod[0]);
            }
            if ( GXutil.strcmp(Z6917Tas_Prodsc, T01GQ5_A6917Tas_Prodsc[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_Prodsc");
               GXutil.writeLogRaw("Old: ",Z6917Tas_Prodsc);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6917Tas_Prodsc[0]);
            }
            if ( DecimalUtil.compareTo(Z6918Tas_Porc, T01GQ5_A6918Tas_Porc[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_Porc");
               GXutil.writeLogRaw("Old: ",Z6918Tas_Porc);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6918Tas_Porc[0]);
            }
            if ( !( GXutil.dateCompare(Z6919Tas_fecha, T01GQ5_A6919Tas_fecha[0]) ) )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_fecha");
               GXutil.writeLogRaw("Old: ",Z6919Tas_fecha);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6919Tas_fecha[0]);
            }
            if ( GXutil.strcmp(Z6920Tas_usuari, T01GQ5_A6920Tas_usuari[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_usuari");
               GXutil.writeLogRaw("Old: ",Z6920Tas_usuari);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6920Tas_usuari[0]);
            }
            if ( GXutil.strcmp(Z6921Tas_termin, T01GQ5_A6921Tas_termin[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_termin");
               GXutil.writeLogRaw("Old: ",Z6921Tas_termin);
               GXutil.writeLogRaw("Current: ",T01GQ5_A6921Tas_termin[0]);
            }
            if ( DecimalUtil.compareTo(Z7006Tas_precio, T01GQ5_A7006Tas_precio[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_precio");
               GXutil.writeLogRaw("Old: ",Z7006Tas_precio);
               GXutil.writeLogRaw("Current: ",T01GQ5_A7006Tas_precio[0]);
            }
            if ( Z252CliCod != T01GQ5_A252CliCod[0] )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01GQ5_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCOSTAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GQ1620( )
   {
      beforeValidate1GQ1620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GQ1620( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GQ1620( 0) ;
         checkOptimisticConcurrency1GQ1620( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GQ1620( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GQ1620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GQ15 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A6882Tas_num), Boolean.valueOf(n6883Tas_Artcod), A6883Tas_Artcod, Boolean.valueOf(n6884Tas_grm2), Short.valueOf(A6884Tas_grm2), Boolean.valueOf(n6885Tas_anccr), Short.valueOf(A6885Tas_anccr), Boolean.valueOf(n6886Tas_pml), Short.valueOf(A6886Tas_pml), Boolean.valueOf(n6887Tas_kgs), A6887Tas_kgs, Boolean.valueOf(n6888Tas_mts), A6888Tas_mts, Boolean.valueOf(n6889Tas_facab), A6889Tas_facab, Boolean.valueOf(n6890Tas_Vol), Integer.valueOf(A6890Tas_Vol), Boolean.valueOf(n6891Tas_ColNom), A6891Tas_ColNom, Boolean.valueOf(n6892Tas_ColNum), Integer.valueOf(A6892Tas_ColNum), Boolean.valueOf(n6893Tas_Tc), Byte.valueOf(A6893Tas_Tc), Boolean.valueOf(n6894Tas_coscol), A6894Tas_coscol, Boolean.valueOf(n6895Tas_rpcod1), A6895Tas_rpcod1, Boolean.valueOf(n6896Tas_cosrp1), A6896Tas_cosrp1, Boolean.valueOf(n6897Tas_rpdsc1), A6897Tas_rpdsc1, Boolean.valueOf(n6898Tas_rpcod2), A6898Tas_rpcod2, Boolean.valueOf(n6899Tas_rpdsc2), A6899Tas_rpdsc2, Boolean.valueOf(n6900Tas_cosrp2), A6900Tas_cosrp2, Boolean.valueOf(n6901Tas_rpcod3), A6901Tas_rpcod3, Boolean.valueOf(n6902Tas_rpdsc3), A6902Tas_rpdsc3, Boolean.valueOf(n6903Tas_cosrp3), A6903Tas_cosrp3, Boolean.valueOf(n6904Tas_racod1), A6904Tas_racod1, Boolean.valueOf(n6905Tas_radsc1), A6905Tas_radsc1, Boolean.valueOf(n6906Tas_cosra1), A6906Tas_cosra1, Boolean.valueOf(n6907Tas_racod2), A6907Tas_racod2, Boolean.valueOf(n6908Tas_radsc2), A6908Tas_radsc2, Boolean.valueOf(n6909Tas_cosra2), A6909Tas_cosra2, Boolean.valueOf(n6910Tas_racod3), A6910Tas_racod3, Boolean.valueOf(n6911Tas_radsc3), A6911Tas_radsc3, Boolean.valueOf(n6912Tas_cosra3), A6912Tas_cosra3, Boolean.valueOf(n6913Tas_cost1), A6913Tas_cost1, Boolean.valueOf(n6914Tas_cost2), A6914Tas_cost2, Boolean.valueOf(n6915Tas_ultlin), Short.valueOf(A6915Tas_ultlin), Boolean.valueOf(n6916Tas_Procod), A6916Tas_Procod, Boolean.valueOf(n6917Tas_Prodsc), A6917Tas_Prodsc, Boolean.valueOf(n6918Tas_Porc), A6918Tas_Porc, Boolean.valueOf(n6919Tas_fecha), A6919Tas_fecha, Boolean.valueOf(n6920Tas_usuari), A6920Tas_usuari, Boolean.valueOf(n6921Tas_termin), A6921Tas_termin, Boolean.valueOf(n7006Tas_precio), A7006Tas_precio, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTAS");
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
                        processLevel1GQ1620( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1GQ0( ) ;
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
            load1GQ1620( ) ;
         }
         endLevel1GQ1620( ) ;
      }
      closeExtendedTableCursors1GQ1620( ) ;
   }

   public void update1GQ1620( )
   {
      beforeValidate1GQ1620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GQ1620( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GQ1620( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GQ1620( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GQ1620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GQ16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n6883Tas_Artcod), A6883Tas_Artcod, Boolean.valueOf(n6884Tas_grm2), Short.valueOf(A6884Tas_grm2), Boolean.valueOf(n6885Tas_anccr), Short.valueOf(A6885Tas_anccr), Boolean.valueOf(n6886Tas_pml), Short.valueOf(A6886Tas_pml), Boolean.valueOf(n6887Tas_kgs), A6887Tas_kgs, Boolean.valueOf(n6888Tas_mts), A6888Tas_mts, Boolean.valueOf(n6889Tas_facab), A6889Tas_facab, Boolean.valueOf(n6890Tas_Vol), Integer.valueOf(A6890Tas_Vol), Boolean.valueOf(n6891Tas_ColNom), A6891Tas_ColNom, Boolean.valueOf(n6892Tas_ColNum), Integer.valueOf(A6892Tas_ColNum), Boolean.valueOf(n6893Tas_Tc), Byte.valueOf(A6893Tas_Tc), Boolean.valueOf(n6894Tas_coscol), A6894Tas_coscol, Boolean.valueOf(n6895Tas_rpcod1), A6895Tas_rpcod1, Boolean.valueOf(n6896Tas_cosrp1), A6896Tas_cosrp1, Boolean.valueOf(n6897Tas_rpdsc1), A6897Tas_rpdsc1, Boolean.valueOf(n6898Tas_rpcod2), A6898Tas_rpcod2, Boolean.valueOf(n6899Tas_rpdsc2), A6899Tas_rpdsc2, Boolean.valueOf(n6900Tas_cosrp2), A6900Tas_cosrp2, Boolean.valueOf(n6901Tas_rpcod3), A6901Tas_rpcod3, Boolean.valueOf(n6902Tas_rpdsc3), A6902Tas_rpdsc3, Boolean.valueOf(n6903Tas_cosrp3), A6903Tas_cosrp3, Boolean.valueOf(n6904Tas_racod1), A6904Tas_racod1, Boolean.valueOf(n6905Tas_radsc1), A6905Tas_radsc1, Boolean.valueOf(n6906Tas_cosra1), A6906Tas_cosra1, Boolean.valueOf(n6907Tas_racod2), A6907Tas_racod2, Boolean.valueOf(n6908Tas_radsc2), A6908Tas_radsc2, Boolean.valueOf(n6909Tas_cosra2), A6909Tas_cosra2, Boolean.valueOf(n6910Tas_racod3), A6910Tas_racod3, Boolean.valueOf(n6911Tas_radsc3), A6911Tas_radsc3, Boolean.valueOf(n6912Tas_cosra3), A6912Tas_cosra3, Boolean.valueOf(n6913Tas_cost1), A6913Tas_cost1, Boolean.valueOf(n6914Tas_cost2), A6914Tas_cost2, Boolean.valueOf(n6915Tas_ultlin), Short.valueOf(A6915Tas_ultlin), Boolean.valueOf(n6916Tas_Procod), A6916Tas_Procod, Boolean.valueOf(n6917Tas_Prodsc), A6917Tas_Prodsc, Boolean.valueOf(n6918Tas_Porc), A6918Tas_Porc, Boolean.valueOf(n6919Tas_fecha), A6919Tas_fecha, Boolean.valueOf(n6920Tas_usuari), A6920Tas_usuari, Boolean.valueOf(n6921Tas_termin), A6921Tas_termin, Boolean.valueOf(n7006Tas_precio), A7006Tas_precio, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A6882Tas_num)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTAS");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSTAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GQ1620( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1GQ1620( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1GQ0( ) ;
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
         endLevel1GQ1620( ) ;
      }
      closeExtendedTableCursors1GQ1620( ) ;
   }

   public void deferredUpdate1GQ1620( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GQ1620( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GQ1620( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GQ1620( ) ;
         afterConfirm1GQ1620( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GQ1620( ) ;
            if ( AnyError == 0 )
            {
               scanStart1GQ1622( ) ;
               while ( RcdFound1622 != 0 )
               {
                  getByPrimaryKey1GQ1622( ) ;
                  delete1GQ1622( ) ;
                  scanNext1GQ1622( ) ;
               }
               scanEnd1GQ1622( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GQ17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTAS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1620 == 0 )
                        {
                           initAll1GQ1620( ) ;
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
                        resetCaption1GQ0( ) ;
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
      sMode1620 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GQ1620( ) ;
      Gx_mode = sMode1620 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GQ1620( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01GQ18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T01GQ18_A407EmprNom[0] ;
         n407EmprNom = T01GQ18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(16);
         /* Using cursor T01GQ19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01GQ19_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(17);
      }
   }

   public void processNestedLevel1GQ1622( )
   {
      nGXsfl_245_idx = 0 ;
      while ( nGXsfl_245_idx < nRC_GXsfl_245 )
      {
         readRow1GQ1622( ) ;
         if ( ( nRcdExists_1622 != 0 ) || ( nIsMod_1622 != 0 ) )
         {
            standaloneNotModal1GQ1622( ) ;
            getKey1GQ1622( ) ;
            if ( ( nRcdExists_1622 == 0 ) && ( nRcdDeleted_1622 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1GQ1622( ) ;
            }
            else
            {
               if ( RcdFound1622 != 0 )
               {
                  if ( ( nRcdDeleted_1622 != 0 ) && ( nRcdExists_1622 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1GQ1622( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1622 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1GQ1622( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1622 == 0 )
                  {
                     GXCCtl = "TAS_LIN_" + sGXsfl_245_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTas_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1622_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTas_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A6922Tas_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtTas_vel_Internalname, GXutil.ltrim( localUtil.ntoc( A6923Tas_vel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTas_maqc_Internalname, GXutil.rtrim( A6924Tas_maqc)) ;
         httpContext.changePostValue( edtTas_maqd_Internalname, GXutil.rtrim( A6925Tas_maqd)) ;
         httpContext.changePostValue( edtTas_costm_Internalname, GXutil.ltrim( localUtil.ntoc( A6926Tas_costm, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTas_costmt_Internalname, GXutil.ltrim( localUtil.ntoc( A6927Tas_costmt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTas_costt1_Internalname, GXutil.ltrim( localUtil.ntoc( A6928Tas_costt1, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6922Tas_lin_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6922Tas_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6923Tas_vel_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6923Tas_vel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6924Tas_maqc_"+sGXsfl_245_idx, GXutil.rtrim( Z6924Tas_maqc)) ;
         httpContext.changePostValue( "ZT_"+"Z6925Tas_maqd_"+sGXsfl_245_idx, GXutil.rtrim( Z6925Tas_maqd)) ;
         httpContext.changePostValue( "ZT_"+"Z6926Tas_costm_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6926Tas_costm, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6927Tas_costmt_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6927Tas_costmt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6928Tas_costt1_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( Z6928Tas_costt1, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_245_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1622_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1622_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1622_"+sGXsfl_245_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1622 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1622_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1622_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_LIN_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_VEL_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_vel_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_MAQC_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_maqc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_MAQD_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_maqd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_COSTM_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_COSTMT_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costmt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAS_COSTT1_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costt1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1GQ1622( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1622 = (short)(0) ;
      nIsMod_1622 = (short)(0) ;
      nRcdDeleted_1622 = (short)(0) ;
   }

   public void processLevel1GQ1620( )
   {
      /* Save parent mode. */
      sMode1620 = Gx_mode ;
      processNestedLevel1GQ1622( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1620 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1GQ1620( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GQ1620( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcostas");
         if ( AnyError == 0 )
         {
            confirmValues1GQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcostas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GQ1620( )
   {
      /* Using cursor T01GQ20 */
      pr_default.execute(18);
      RcdFound1620 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1620 = (short)(1) ;
         A396EmprCod = T01GQ20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6882Tas_num = T01GQ20_A6882Tas_num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GQ1620( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1620 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1620 = (short)(1) ;
         A396EmprCod = T01GQ20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6882Tas_num = T01GQ20_A6882Tas_num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
      }
   }

   public void scanEnd1GQ1620( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1GQ1620( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GQ1620( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GQ1620( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GQ1620( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GQ1620( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GQ1620( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GQ1620( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTas_num_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_num_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_num_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtTas_Artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_Artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_Artcod_Enabled), 5, 0), true);
      edtTas_grm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_grm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_grm2_Enabled), 5, 0), true);
      edtTas_anccr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_anccr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_anccr_Enabled), 5, 0), true);
      edtTas_pml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_pml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_pml_Enabled), 5, 0), true);
      edtTas_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_kgs_Enabled), 5, 0), true);
      edtTas_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_mts_Enabled), 5, 0), true);
      edtTas_facab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_facab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_facab_Enabled), 5, 0), true);
      edtTas_Vol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_Vol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_Vol_Enabled), 5, 0), true);
      edtTas_ColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_ColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_ColNom_Enabled), 5, 0), true);
      edtTas_ColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_ColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_ColNum_Enabled), 5, 0), true);
      edtTas_Tc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_Tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_Tc_Enabled), 5, 0), true);
      edtTas_coscol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_coscol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_coscol_Enabled), 5, 0), true);
      edtTas_rpcod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_rpcod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_rpcod1_Enabled), 5, 0), true);
      edtTas_cosrp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_cosrp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_cosrp1_Enabled), 5, 0), true);
      edtTas_rpdsc1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_rpdsc1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_rpdsc1_Enabled), 5, 0), true);
      edtTas_rpcod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_rpcod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_rpcod2_Enabled), 5, 0), true);
      edtTas_rpdsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_rpdsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_rpdsc2_Enabled), 5, 0), true);
      edtTas_cosrp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_cosrp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_cosrp2_Enabled), 5, 0), true);
      edtTas_rpcod3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_rpcod3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_rpcod3_Enabled), 5, 0), true);
      edtTas_rpdsc3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_rpdsc3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_rpdsc3_Enabled), 5, 0), true);
      edtTas_cosrp3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_cosrp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_cosrp3_Enabled), 5, 0), true);
      edtTas_racod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_racod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_racod1_Enabled), 5, 0), true);
      edtTas_radsc1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_radsc1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_radsc1_Enabled), 5, 0), true);
      edtTas_cosra1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_cosra1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_cosra1_Enabled), 5, 0), true);
      edtTas_racod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_racod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_racod2_Enabled), 5, 0), true);
      edtTas_radsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_radsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_radsc2_Enabled), 5, 0), true);
      edtTas_cosra2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_cosra2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_cosra2_Enabled), 5, 0), true);
      edtTas_racod3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_racod3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_racod3_Enabled), 5, 0), true);
      edtTas_radsc3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_radsc3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_radsc3_Enabled), 5, 0), true);
      edtTas_cosra3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_cosra3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_cosra3_Enabled), 5, 0), true);
      edtTas_cost1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_cost1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_cost1_Enabled), 5, 0), true);
      edtTas_cost2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_cost2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_cost2_Enabled), 5, 0), true);
      edtTas_ultlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_ultlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_ultlin_Enabled), 5, 0), true);
      edtTas_Procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_Procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_Procod_Enabled), 5, 0), true);
      edtTas_Prodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_Prodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_Prodsc_Enabled), 5, 0), true);
      edtTas_Porc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_Porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_Porc_Enabled), 5, 0), true);
      edtTas_fecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_fecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_fecha_Enabled), 5, 0), true);
      edtTas_usuari_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_usuari_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_usuari_Enabled), 5, 0), true);
      edtTas_termin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_termin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_termin_Enabled), 5, 0), true);
      edtTas_precio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_precio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_precio_Enabled), 5, 0), true);
   }

   public void zm1GQ1622( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6923Tas_vel = T01GQ3_A6923Tas_vel[0] ;
            Z6924Tas_maqc = T01GQ3_A6924Tas_maqc[0] ;
            Z6925Tas_maqd = T01GQ3_A6925Tas_maqd[0] ;
            Z6926Tas_costm = T01GQ3_A6926Tas_costm[0] ;
            Z6927Tas_costmt = T01GQ3_A6927Tas_costmt[0] ;
            Z6928Tas_costt1 = T01GQ3_A6928Tas_costt1[0] ;
            Z457FasCod = T01GQ3_A457FasCod[0] ;
         }
         else
         {
            Z6923Tas_vel = A6923Tas_vel ;
            Z6924Tas_maqc = A6924Tas_maqc ;
            Z6925Tas_maqd = A6925Tas_maqd ;
            Z6926Tas_costm = A6926Tas_costm ;
            Z6927Tas_costmt = A6927Tas_costmt ;
            Z6928Tas_costt1 = A6928Tas_costt1 ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z6882Tas_num = A6882Tas_num ;
         Z6922Tas_lin = A6922Tas_lin ;
         Z6923Tas_vel = A6923Tas_vel ;
         Z6924Tas_maqc = A6924Tas_maqc ;
         Z6925Tas_maqd = A6925Tas_maqd ;
         Z6926Tas_costm = A6926Tas_costm ;
         Z6927Tas_costmt = A6927Tas_costmt ;
         Z6928Tas_costt1 = A6928Tas_costt1 ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal1GQ1622( )
   {
   }

   public void standaloneModal1GQ1622( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTas_lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTas_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_lin_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      }
      else
      {
         edtTas_lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTas_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_lin_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      }
   }

   public void load1GQ1622( )
   {
      /* Using cursor T01GQ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num), Short.valueOf(A6922Tas_lin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1622 = (short)(1) ;
         A460FasDsc = T01GQ21_A460FasDsc[0] ;
         A6923Tas_vel = T01GQ21_A6923Tas_vel[0] ;
         n6923Tas_vel = T01GQ21_n6923Tas_vel[0] ;
         A6924Tas_maqc = T01GQ21_A6924Tas_maqc[0] ;
         n6924Tas_maqc = T01GQ21_n6924Tas_maqc[0] ;
         A6925Tas_maqd = T01GQ21_A6925Tas_maqd[0] ;
         n6925Tas_maqd = T01GQ21_n6925Tas_maqd[0] ;
         A6926Tas_costm = T01GQ21_A6926Tas_costm[0] ;
         n6926Tas_costm = T01GQ21_n6926Tas_costm[0] ;
         A6927Tas_costmt = T01GQ21_A6927Tas_costmt[0] ;
         n6927Tas_costmt = T01GQ21_n6927Tas_costmt[0] ;
         A6928Tas_costt1 = T01GQ21_A6928Tas_costt1[0] ;
         n6928Tas_costt1 = T01GQ21_n6928Tas_costt1[0] ;
         A457FasCod = T01GQ21_A457FasCod[0] ;
         n457FasCod = T01GQ21_n457FasCod[0] ;
         zm1GQ1622( -4) ;
      }
      pr_default.close(19);
      onLoadActions1GQ1622( ) ;
   }

   public void onLoadActions1GQ1622( )
   {
   }

   public void checkExtendedTable1GQ1622( )
   {
      nIsDirty_1622 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1GQ1622( ) ;
      /* Using cursor T01GQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_245_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01GQ4_A460FasDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1GQ1622( )
   {
      pr_default.close(2);
   }

   public void enableDisable1GQ1622( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01GQ22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_245_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01GQ22_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1GQ1622( )
   {
      /* Using cursor T01GQ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num), Short.valueOf(A6922Tas_lin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1622 = (short)(1) ;
      }
      else
      {
         RcdFound1622 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1GQ1622( )
   {
      /* Using cursor T01GQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num), Short.valueOf(A6922Tas_lin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GQ1622( 4) ;
         RcdFound1622 = (short)(1) ;
         initializeNonKey1GQ1622( ) ;
         A6922Tas_lin = T01GQ3_A6922Tas_lin[0] ;
         A6923Tas_vel = T01GQ3_A6923Tas_vel[0] ;
         n6923Tas_vel = T01GQ3_n6923Tas_vel[0] ;
         A6924Tas_maqc = T01GQ3_A6924Tas_maqc[0] ;
         n6924Tas_maqc = T01GQ3_n6924Tas_maqc[0] ;
         A6925Tas_maqd = T01GQ3_A6925Tas_maqd[0] ;
         n6925Tas_maqd = T01GQ3_n6925Tas_maqd[0] ;
         A6926Tas_costm = T01GQ3_A6926Tas_costm[0] ;
         n6926Tas_costm = T01GQ3_n6926Tas_costm[0] ;
         A6927Tas_costmt = T01GQ3_A6927Tas_costmt[0] ;
         n6927Tas_costmt = T01GQ3_n6927Tas_costmt[0] ;
         A6928Tas_costt1 = T01GQ3_A6928Tas_costt1[0] ;
         n6928Tas_costt1 = T01GQ3_n6928Tas_costt1[0] ;
         A457FasCod = T01GQ3_A457FasCod[0] ;
         n457FasCod = T01GQ3_n457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6882Tas_num = A6882Tas_num ;
         Z6922Tas_lin = A6922Tas_lin ;
         sMode1622 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GQ1622( ) ;
         load1GQ1622( ) ;
         Gx_mode = sMode1622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1622 = (short)(0) ;
         initializeNonKey1GQ1622( ) ;
         sMode1622 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GQ1622( ) ;
         Gx_mode = sMode1622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1GQ1622( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1GQ1622( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num), Short.valueOf(A6922Tas_lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSTA1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6923Tas_vel, T01GQ2_A6923Tas_vel[0]) != 0 ) || ( GXutil.strcmp(Z6924Tas_maqc, T01GQ2_A6924Tas_maqc[0]) != 0 ) || ( GXutil.strcmp(Z6925Tas_maqd, T01GQ2_A6925Tas_maqd[0]) != 0 ) || ( DecimalUtil.compareTo(Z6926Tas_costm, T01GQ2_A6926Tas_costm[0]) != 0 ) || ( DecimalUtil.compareTo(Z6927Tas_costmt, T01GQ2_A6927Tas_costmt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6928Tas_costt1, T01GQ2_A6928Tas_costt1[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T01GQ2_A457FasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6923Tas_vel, T01GQ2_A6923Tas_vel[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_vel");
               GXutil.writeLogRaw("Old: ",Z6923Tas_vel);
               GXutil.writeLogRaw("Current: ",T01GQ2_A6923Tas_vel[0]);
            }
            if ( GXutil.strcmp(Z6924Tas_maqc, T01GQ2_A6924Tas_maqc[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_maqc");
               GXutil.writeLogRaw("Old: ",Z6924Tas_maqc);
               GXutil.writeLogRaw("Current: ",T01GQ2_A6924Tas_maqc[0]);
            }
            if ( GXutil.strcmp(Z6925Tas_maqd, T01GQ2_A6925Tas_maqd[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_maqd");
               GXutil.writeLogRaw("Old: ",Z6925Tas_maqd);
               GXutil.writeLogRaw("Current: ",T01GQ2_A6925Tas_maqd[0]);
            }
            if ( DecimalUtil.compareTo(Z6926Tas_costm, T01GQ2_A6926Tas_costm[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_costm");
               GXutil.writeLogRaw("Old: ",Z6926Tas_costm);
               GXutil.writeLogRaw("Current: ",T01GQ2_A6926Tas_costm[0]);
            }
            if ( DecimalUtil.compareTo(Z6927Tas_costmt, T01GQ2_A6927Tas_costmt[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_costmt");
               GXutil.writeLogRaw("Old: ",Z6927Tas_costmt);
               GXutil.writeLogRaw("Current: ",T01GQ2_A6927Tas_costmt[0]);
            }
            if ( DecimalUtil.compareTo(Z6928Tas_costt1, T01GQ2_A6928Tas_costt1[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"Tas_costt1");
               GXutil.writeLogRaw("Old: ",Z6928Tas_costt1);
               GXutil.writeLogRaw("Current: ",T01GQ2_A6928Tas_costt1[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01GQ2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tcostas:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01GQ2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCOSTA1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GQ1622( )
   {
      beforeValidate1GQ1622( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GQ1622( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GQ1622( 0) ;
         checkOptimisticConcurrency1GQ1622( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GQ1622( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GQ1622( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GQ24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A6882Tas_num), Short.valueOf(A6922Tas_lin), Boolean.valueOf(n6923Tas_vel), A6923Tas_vel, Boolean.valueOf(n6924Tas_maqc), A6924Tas_maqc, Boolean.valueOf(n6925Tas_maqd), A6925Tas_maqd, Boolean.valueOf(n6926Tas_costm), A6926Tas_costm, Boolean.valueOf(n6927Tas_costmt), A6927Tas_costmt, Boolean.valueOf(n6928Tas_costt1), A6928Tas_costt1, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTA1");
                  if ( (pr_default.getStatus(22) == 1) )
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
            load1GQ1622( ) ;
         }
         endLevel1GQ1622( ) ;
      }
      closeExtendedTableCursors1GQ1622( ) ;
   }

   public void update1GQ1622( )
   {
      beforeValidate1GQ1622( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GQ1622( ) ;
      }
      if ( ( nIsMod_1622 != 0 ) || ( nIsDirty_1622 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1GQ1622( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1GQ1622( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1GQ1622( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01GQ25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n6923Tas_vel), A6923Tas_vel, Boolean.valueOf(n6924Tas_maqc), A6924Tas_maqc, Boolean.valueOf(n6925Tas_maqd), A6925Tas_maqd, Boolean.valueOf(n6926Tas_costm), A6926Tas_costm, Boolean.valueOf(n6927Tas_costmt), A6927Tas_costmt, Boolean.valueOf(n6928Tas_costt1), A6928Tas_costt1, Boolean.valueOf(n457FasCod), A457FasCod, A396EmprCod, Integer.valueOf(A6882Tas_num), Short.valueOf(A6922Tas_lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTA1");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSTA1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1GQ1622( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1GQ1622( ) ;
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
            endLevel1GQ1622( ) ;
         }
      }
      closeExtendedTableCursors1GQ1622( ) ;
   }

   public void deferredUpdate1GQ1622( )
   {
   }

   public void delete1GQ1622( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GQ1622( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GQ1622( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GQ1622( ) ;
         afterConfirm1GQ1622( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GQ1622( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GQ26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num), Short.valueOf(A6922Tas_lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTA1");
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
      sMode1622 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GQ1622( ) ;
      Gx_mode = sMode1622 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GQ1622( )
   {
      standaloneModal1GQ1622( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01GQ27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         A460FasDsc = T01GQ27_A460FasDsc[0] ;
         pr_default.close(25);
      }
   }

   public void endLevel1GQ1622( )
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

   public void scanStart1GQ1622( )
   {
      /* Scan By routine */
      /* Using cursor T01GQ28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A6882Tas_num)});
      RcdFound1622 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1622 = (short)(1) ;
         A6922Tas_lin = T01GQ28_A6922Tas_lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GQ1622( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1622 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1622 = (short)(1) ;
         A6922Tas_lin = T01GQ28_A6922Tas_lin[0] ;
      }
   }

   public void scanEnd1GQ1622( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1GQ1622( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GQ1622( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GQ1622( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GQ1622( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GQ1622( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GQ1622( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GQ1622( )
   {
      edtTas_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_lin_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      edtTas_vel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_vel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_vel_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      edtTas_maqc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_maqc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_maqc_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      edtTas_maqd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_maqd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_maqd_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      edtTas_costm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_costm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_costm_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      edtTas_costmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_costmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_costmt_Enabled), 5, 0), !bGXsfl_245_Refreshing);
      edtTas_costt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_costt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_costt1_Enabled), 5, 0), !bGXsfl_245_Refreshing);
   }

   public void send_integrity_lvl_hashes1GQ1622( )
   {
   }

   public void send_integrity_lvl_hashes1GQ1620( )
   {
   }

   public void subsflControlProps_2451622( )
   {
      edtavnRcdDeleted_1622_Internalname = "vNRCDDELETED_1622_"+sGXsfl_245_idx ;
      edtTas_lin_Internalname = "TAS_LIN_"+sGXsfl_245_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_245_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_245_idx ;
      edtTas_vel_Internalname = "TAS_VEL_"+sGXsfl_245_idx ;
      edtTas_maqc_Internalname = "TAS_MAQC_"+sGXsfl_245_idx ;
      edtTas_maqd_Internalname = "TAS_MAQD_"+sGXsfl_245_idx ;
      edtTas_costm_Internalname = "TAS_COSTM_"+sGXsfl_245_idx ;
      edtTas_costmt_Internalname = "TAS_COSTMT_"+sGXsfl_245_idx ;
      edtTas_costt1_Internalname = "TAS_COSTT1_"+sGXsfl_245_idx ;
   }

   public void subsflControlProps_fel_2451622( )
   {
      edtavnRcdDeleted_1622_Internalname = "vNRCDDELETED_1622_"+sGXsfl_245_fel_idx ;
      edtTas_lin_Internalname = "TAS_LIN_"+sGXsfl_245_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_245_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_245_fel_idx ;
      edtTas_vel_Internalname = "TAS_VEL_"+sGXsfl_245_fel_idx ;
      edtTas_maqc_Internalname = "TAS_MAQC_"+sGXsfl_245_fel_idx ;
      edtTas_maqd_Internalname = "TAS_MAQD_"+sGXsfl_245_fel_idx ;
      edtTas_costm_Internalname = "TAS_COSTM_"+sGXsfl_245_fel_idx ;
      edtTas_costmt_Internalname = "TAS_COSTMT_"+sGXsfl_245_fel_idx ;
      edtTas_costt1_Internalname = "TAS_COSTT1_"+sGXsfl_245_fel_idx ;
   }

   public void addRow1GQ1622( )
   {
      nGXsfl_245_idx = (int)(nGXsfl_245_idx+1) ;
      sGXsfl_245_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_245_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2451622( ) ;
      sendRow1GQ1622( ) ;
   }

   public void sendRow1GQ1622( )
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
         if ( ((int)((nGXsfl_245_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 246,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1622_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1622_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1622), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1622), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,246);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1622_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1622_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 247,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTas_lin_Internalname,GXutil.ltrim( localUtil.ntoc( A6922Tas_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6922Tas_lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,247);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTas_lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTas_lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 248,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,248);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 250,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTas_vel_Internalname,GXutil.ltrim( localUtil.ntoc( A6923Tas_vel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTas_vel_Enabled!=0) ? localUtil.format( A6923Tas_vel, "ZZ9.9") : localUtil.format( A6923Tas_vel, "ZZ9.9"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,250);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTas_vel_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTas_vel_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 251,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTas_maqc_Internalname,GXutil.rtrim( A6924Tas_maqc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTas_maqc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTas_maqc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 252,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTas_maqd_Internalname,GXutil.rtrim( A6925Tas_maqd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,252);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTas_maqd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTas_maqd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 253,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTas_costm_Internalname,GXutil.ltrim( localUtil.ntoc( A6926Tas_costm, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTas_costm_Enabled!=0) ? localUtil.format( A6926Tas_costm, "ZZZZ9.9999") : localUtil.format( A6926Tas_costm, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,253);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTas_costm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTas_costm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 254,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTas_costmt_Internalname,GXutil.ltrim( localUtil.ntoc( A6927Tas_costmt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTas_costmt_Enabled!=0) ? localUtil.format( A6927Tas_costmt, "ZZZZZZ9.999") : localUtil.format( A6927Tas_costmt, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,254);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTas_costmt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTas_costmt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1622_" + sGXsfl_245_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 255,'',false,'" + sGXsfl_245_idx + "',245)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTas_costt1_Internalname,GXutil.ltrim( localUtil.ntoc( A6928Tas_costt1, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTas_costt1_Enabled!=0) ? localUtil.format( A6928Tas_costt1, "ZZZZZZ9.999") : localUtil.format( A6928Tas_costt1, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,255);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTas_costt1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTas_costt1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(245),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1GQ1622( ) ;
      GXCCtl = "Z6922Tas_lin_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6922Tas_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6923Tas_vel_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6923Tas_vel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6924Tas_maqc_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6924Tas_maqc));
      GXCCtl = "Z6925Tas_maqd_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6925Tas_maqd));
      GXCCtl = "Z6926Tas_costm_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6926Tas_costm, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6927Tas_costmt_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6927Tas_costmt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6928Tas_costt1_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6928Tas_costt1, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_1622_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1622_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1622_" + sGXsfl_245_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1622_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1622_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAS_LIN_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAS_VEL_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_vel_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAS_MAQC_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_maqc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAS_MAQD_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_maqd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAS_COSTM_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAS_COSTMT_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costmt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAS_COSTT1_"+sGXsfl_245_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costt1_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1GQ1622( )
   {
      nGXsfl_245_idx = (int)(nGXsfl_245_idx+1) ;
      sGXsfl_245_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_245_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2451622( ) ;
      edtavnRcdDeleted_1622_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1622_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTas_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_LIN_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTas_vel_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_VEL_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTas_maqc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_MAQC_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTas_maqd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_MAQD_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTas_costm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_COSTM_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTas_costmt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_COSTMT_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTas_costt1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAS_COSTT1_"+sGXsfl_245_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1622_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1622_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1622");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1622_Internalname ;
         wbErr = true ;
         nRcdDeleted_1622 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1622 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1622_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTas_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTas_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TAS_LIN_" + sGXsfl_245_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTas_lin_Internalname ;
         wbErr = true ;
         A6922Tas_lin = (short)(0) ;
      }
      else
      {
         A6922Tas_lin = (short)(localUtil.ctol( httpContext.cgiGet( edtTas_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      n457FasCod = false ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_vel_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_vel_Internalname)), DecimalUtil.stringToDec("999.9")) > 0 ) ) )
      {
         GXCCtl = "TAS_VEL_" + sGXsfl_245_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTas_vel_Internalname ;
         wbErr = true ;
         A6923Tas_vel = DecimalUtil.ZERO ;
         n6923Tas_vel = false ;
      }
      else
      {
         A6923Tas_vel = localUtil.ctond( httpContext.cgiGet( edtTas_vel_Internalname)) ;
         n6923Tas_vel = false ;
      }
      A6924Tas_maqc = httpContext.cgiGet( edtTas_maqc_Internalname) ;
      n6924Tas_maqc = false ;
      A6925Tas_maqd = httpContext.cgiGet( edtTas_maqd_Internalname) ;
      n6925Tas_maqd = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_costm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_costm_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "TAS_COSTM_" + sGXsfl_245_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTas_costm_Internalname ;
         wbErr = true ;
         A6926Tas_costm = DecimalUtil.ZERO ;
         n6926Tas_costm = false ;
      }
      else
      {
         A6926Tas_costm = localUtil.ctond( httpContext.cgiGet( edtTas_costm_Internalname)) ;
         n6926Tas_costm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_costmt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_costmt_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "TAS_COSTMT_" + sGXsfl_245_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTas_costmt_Internalname ;
         wbErr = true ;
         A6927Tas_costmt = DecimalUtil.ZERO ;
         n6927Tas_costmt = false ;
      }
      else
      {
         A6927Tas_costmt = localUtil.ctond( httpContext.cgiGet( edtTas_costmt_Internalname)) ;
         n6927Tas_costmt = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTas_costt1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTas_costt1_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "TAS_COSTT1_" + sGXsfl_245_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTas_costt1_Internalname ;
         wbErr = true ;
         A6928Tas_costt1 = DecimalUtil.ZERO ;
         n6928Tas_costt1 = false ;
      }
      else
      {
         A6928Tas_costt1 = localUtil.ctond( httpContext.cgiGet( edtTas_costt1_Internalname)) ;
         n6928Tas_costt1 = false ;
      }
      GXCCtl = "Z6922Tas_lin_" + sGXsfl_245_idx ;
      Z6922Tas_lin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6923Tas_vel_" + sGXsfl_245_idx ;
      Z6923Tas_vel = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6924Tas_maqc_" + sGXsfl_245_idx ;
      Z6924Tas_maqc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6925Tas_maqd_" + sGXsfl_245_idx ;
      Z6925Tas_maqd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6926Tas_costm_" + sGXsfl_245_idx ;
      Z6926Tas_costm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6927Tas_costmt_" + sGXsfl_245_idx ;
      Z6927Tas_costmt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6928Tas_costt1_" + sGXsfl_245_idx ;
      Z6928Tas_costt1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_245_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1622_" + sGXsfl_245_idx ;
      nRcdDeleted_1622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1622_" + sGXsfl_245_idx ;
      nRcdExists_1622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1622_" + sGXsfl_245_idx ;
      nIsMod_1622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTas_lin_Enabled = edtTas_lin_Enabled ;
   }

   public void confirmValues1GQ0( )
   {
      nGXsfl_245_idx = 0 ;
      sGXsfl_245_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_245_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2451622( ) ;
      while ( nGXsfl_245_idx < nRC_GXsfl_245 )
      {
         nGXsfl_245_idx = (int)(nGXsfl_245_idx+1) ;
         sGXsfl_245_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_245_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2451622( ) ;
         httpContext.changePostValue( "Z6922Tas_lin_"+sGXsfl_245_idx, httpContext.cgiGet( "ZT_"+"Z6922Tas_lin_"+sGXsfl_245_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6922Tas_lin_"+sGXsfl_245_idx) ;
         httpContext.changePostValue( "Z6923Tas_vel_"+sGXsfl_245_idx, httpContext.cgiGet( "ZT_"+"Z6923Tas_vel_"+sGXsfl_245_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6923Tas_vel_"+sGXsfl_245_idx) ;
         httpContext.changePostValue( "Z6924Tas_maqc_"+sGXsfl_245_idx, httpContext.cgiGet( "ZT_"+"Z6924Tas_maqc_"+sGXsfl_245_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6924Tas_maqc_"+sGXsfl_245_idx) ;
         httpContext.changePostValue( "Z6925Tas_maqd_"+sGXsfl_245_idx, httpContext.cgiGet( "ZT_"+"Z6925Tas_maqd_"+sGXsfl_245_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6925Tas_maqd_"+sGXsfl_245_idx) ;
         httpContext.changePostValue( "Z6926Tas_costm_"+sGXsfl_245_idx, httpContext.cgiGet( "ZT_"+"Z6926Tas_costm_"+sGXsfl_245_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6926Tas_costm_"+sGXsfl_245_idx) ;
         httpContext.changePostValue( "Z6927Tas_costmt_"+sGXsfl_245_idx, httpContext.cgiGet( "ZT_"+"Z6927Tas_costmt_"+sGXsfl_245_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6927Tas_costmt_"+sGXsfl_245_idx) ;
         httpContext.changePostValue( "Z6928Tas_costt1_"+sGXsfl_245_idx, httpContext.cgiGet( "ZT_"+"Z6928Tas_costt1_"+sGXsfl_245_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6928Tas_costt1_"+sGXsfl_245_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_245_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_245_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_245_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcostas", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6882Tas_num", GXutil.ltrim( localUtil.ntoc( Z6882Tas_num, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6883Tas_Artcod", GXutil.rtrim( Z6883Tas_Artcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6884Tas_grm2", GXutil.ltrim( localUtil.ntoc( Z6884Tas_grm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6885Tas_anccr", GXutil.ltrim( localUtil.ntoc( Z6885Tas_anccr, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6886Tas_pml", GXutil.ltrim( localUtil.ntoc( Z6886Tas_pml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6887Tas_kgs", GXutil.ltrim( localUtil.ntoc( Z6887Tas_kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6888Tas_mts", GXutil.ltrim( localUtil.ntoc( Z6888Tas_mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6889Tas_facab", GXutil.ltrim( localUtil.ntoc( Z6889Tas_facab, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6890Tas_Vol", GXutil.ltrim( localUtil.ntoc( Z6890Tas_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6891Tas_ColNom", GXutil.rtrim( Z6891Tas_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6892Tas_ColNum", GXutil.ltrim( localUtil.ntoc( Z6892Tas_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6893Tas_Tc", GXutil.ltrim( localUtil.ntoc( Z6893Tas_Tc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6894Tas_coscol", GXutil.ltrim( localUtil.ntoc( Z6894Tas_coscol, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6895Tas_rpcod1", GXutil.rtrim( Z6895Tas_rpcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6896Tas_cosrp1", GXutil.ltrim( localUtil.ntoc( Z6896Tas_cosrp1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6897Tas_rpdsc1", GXutil.rtrim( Z6897Tas_rpdsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6898Tas_rpcod2", GXutil.rtrim( Z6898Tas_rpcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6899Tas_rpdsc2", GXutil.rtrim( Z6899Tas_rpdsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6900Tas_cosrp2", GXutil.ltrim( localUtil.ntoc( Z6900Tas_cosrp2, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6901Tas_rpcod3", GXutil.rtrim( Z6901Tas_rpcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6902Tas_rpdsc3", GXutil.rtrim( Z6902Tas_rpdsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6903Tas_cosrp3", GXutil.ltrim( localUtil.ntoc( Z6903Tas_cosrp3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6904Tas_racod1", GXutil.rtrim( Z6904Tas_racod1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6905Tas_radsc1", GXutil.rtrim( Z6905Tas_radsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6906Tas_cosra1", GXutil.ltrim( localUtil.ntoc( Z6906Tas_cosra1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6907Tas_racod2", GXutil.rtrim( Z6907Tas_racod2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6908Tas_radsc2", GXutil.rtrim( Z6908Tas_radsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6909Tas_cosra2", GXutil.ltrim( localUtil.ntoc( Z6909Tas_cosra2, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6910Tas_racod3", GXutil.rtrim( Z6910Tas_racod3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6911Tas_radsc3", GXutil.rtrim( Z6911Tas_radsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6912Tas_cosra3", GXutil.ltrim( localUtil.ntoc( Z6912Tas_cosra3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6913Tas_cost1", GXutil.ltrim( localUtil.ntoc( Z6913Tas_cost1, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6914Tas_cost2", GXutil.ltrim( localUtil.ntoc( Z6914Tas_cost2, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6915Tas_ultlin", GXutil.ltrim( localUtil.ntoc( Z6915Tas_ultlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6916Tas_Procod", GXutil.rtrim( Z6916Tas_Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6917Tas_Prodsc", GXutil.rtrim( Z6917Tas_Prodsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6918Tas_Porc", GXutil.ltrim( localUtil.ntoc( Z6918Tas_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6919Tas_fecha", localUtil.ttoc( Z6919Tas_fecha, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6920Tas_usuari", GXutil.rtrim( Z6920Tas_usuari));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6921Tas_termin", GXutil.rtrim( Z6921Tas_termin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7006Tas_precio", GXutil.ltrim( localUtil.ntoc( Z7006Tas_precio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_245", GXutil.ltrim( localUtil.ntoc( nGXsfl_245_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcostas", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCOSTAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "SIMULACION COSTES TAS", "") ;
   }

   public void initializeNonKey1GQ1620( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A6883Tas_Artcod = "" ;
      n6883Tas_Artcod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6883Tas_Artcod", A6883Tas_Artcod);
      A6884Tas_grm2 = (short)(0) ;
      n6884Tas_grm2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6884Tas_grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6884Tas_grm2), 4, 0));
      A6885Tas_anccr = (short)(0) ;
      n6885Tas_anccr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6885Tas_anccr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6885Tas_anccr), 3, 0));
      A6886Tas_pml = (short)(0) ;
      n6886Tas_pml = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6886Tas_pml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6886Tas_pml), 4, 0));
      A6887Tas_kgs = DecimalUtil.ZERO ;
      n6887Tas_kgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6887Tas_kgs", GXutil.ltrimstr( A6887Tas_kgs, 9, 2));
      A6888Tas_mts = DecimalUtil.ZERO ;
      n6888Tas_mts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6888Tas_mts", GXutil.ltrimstr( A6888Tas_mts, 9, 2));
      A6889Tas_facab = DecimalUtil.ZERO ;
      n6889Tas_facab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6889Tas_facab", GXutil.ltrimstr( A6889Tas_facab, 6, 2));
      A6890Tas_Vol = 0 ;
      n6890Tas_Vol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6890Tas_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6890Tas_Vol), 5, 0));
      A6891Tas_ColNom = "" ;
      n6891Tas_ColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6891Tas_ColNom", A6891Tas_ColNom);
      A6892Tas_ColNum = 0 ;
      n6892Tas_ColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6892Tas_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6892Tas_ColNum), 6, 0));
      A6893Tas_Tc = (byte)(0) ;
      n6893Tas_Tc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6893Tas_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6893Tas_Tc), 2, 0));
      A6894Tas_coscol = DecimalUtil.ZERO ;
      n6894Tas_coscol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6894Tas_coscol", GXutil.ltrimstr( A6894Tas_coscol, 11, 5));
      A6895Tas_rpcod1 = "" ;
      n6895Tas_rpcod1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6895Tas_rpcod1", A6895Tas_rpcod1);
      A6896Tas_cosrp1 = DecimalUtil.ZERO ;
      n6896Tas_cosrp1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6896Tas_cosrp1", GXutil.ltrimstr( A6896Tas_cosrp1, 11, 5));
      A6897Tas_rpdsc1 = "" ;
      n6897Tas_rpdsc1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6897Tas_rpdsc1", A6897Tas_rpdsc1);
      A6898Tas_rpcod2 = "" ;
      n6898Tas_rpcod2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6898Tas_rpcod2", A6898Tas_rpcod2);
      A6899Tas_rpdsc2 = "" ;
      n6899Tas_rpdsc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6899Tas_rpdsc2", A6899Tas_rpdsc2);
      A6900Tas_cosrp2 = DecimalUtil.ZERO ;
      n6900Tas_cosrp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6900Tas_cosrp2", GXutil.ltrimstr( A6900Tas_cosrp2, 11, 5));
      A6901Tas_rpcod3 = "" ;
      n6901Tas_rpcod3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6901Tas_rpcod3", A6901Tas_rpcod3);
      A6902Tas_rpdsc3 = "" ;
      n6902Tas_rpdsc3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6902Tas_rpdsc3", A6902Tas_rpdsc3);
      A6903Tas_cosrp3 = DecimalUtil.ZERO ;
      n6903Tas_cosrp3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6903Tas_cosrp3", GXutil.ltrimstr( A6903Tas_cosrp3, 11, 5));
      A6904Tas_racod1 = "" ;
      n6904Tas_racod1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6904Tas_racod1", A6904Tas_racod1);
      A6905Tas_radsc1 = "" ;
      n6905Tas_radsc1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6905Tas_radsc1", A6905Tas_radsc1);
      A6906Tas_cosra1 = DecimalUtil.ZERO ;
      n6906Tas_cosra1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6906Tas_cosra1", GXutil.ltrimstr( A6906Tas_cosra1, 11, 5));
      A6907Tas_racod2 = "" ;
      n6907Tas_racod2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6907Tas_racod2", A6907Tas_racod2);
      A6908Tas_radsc2 = "" ;
      n6908Tas_radsc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6908Tas_radsc2", A6908Tas_radsc2);
      A6909Tas_cosra2 = DecimalUtil.ZERO ;
      n6909Tas_cosra2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6909Tas_cosra2", GXutil.ltrimstr( A6909Tas_cosra2, 11, 5));
      A6910Tas_racod3 = "" ;
      n6910Tas_racod3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6910Tas_racod3", A6910Tas_racod3);
      A6911Tas_radsc3 = "" ;
      n6911Tas_radsc3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6911Tas_radsc3", A6911Tas_radsc3);
      A6912Tas_cosra3 = DecimalUtil.ZERO ;
      n6912Tas_cosra3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6912Tas_cosra3", GXutil.ltrimstr( A6912Tas_cosra3, 11, 5));
      A6913Tas_cost1 = DecimalUtil.ZERO ;
      n6913Tas_cost1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6913Tas_cost1", GXutil.ltrimstr( A6913Tas_cost1, 11, 3));
      A6914Tas_cost2 = DecimalUtil.ZERO ;
      n6914Tas_cost2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6914Tas_cost2", GXutil.ltrimstr( A6914Tas_cost2, 11, 3));
      A6915Tas_ultlin = (short)(0) ;
      n6915Tas_ultlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6915Tas_ultlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6915Tas_ultlin), 4, 0));
      A6916Tas_Procod = "" ;
      n6916Tas_Procod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6916Tas_Procod", A6916Tas_Procod);
      A6917Tas_Prodsc = "" ;
      n6917Tas_Prodsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6917Tas_Prodsc", A6917Tas_Prodsc);
      A6918Tas_Porc = DecimalUtil.ZERO ;
      n6918Tas_Porc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6918Tas_Porc", GXutil.ltrimstr( A6918Tas_Porc, 6, 2));
      A6919Tas_fecha = GXutil.resetTime( GXutil.nullDate() );
      n6919Tas_fecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6919Tas_fecha", localUtil.ttoc( A6919Tas_fecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6920Tas_usuari = "" ;
      n6920Tas_usuari = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6920Tas_usuari", A6920Tas_usuari);
      A6921Tas_termin = "" ;
      n6921Tas_termin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6921Tas_termin", A6921Tas_termin);
      A7006Tas_precio = DecimalUtil.ZERO ;
      n7006Tas_precio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7006Tas_precio", GXutil.ltrimstr( A7006Tas_precio, 13, 5));
      Z6883Tas_Artcod = "" ;
      Z6884Tas_grm2 = (short)(0) ;
      Z6885Tas_anccr = (short)(0) ;
      Z6886Tas_pml = (short)(0) ;
      Z6887Tas_kgs = DecimalUtil.ZERO ;
      Z6888Tas_mts = DecimalUtil.ZERO ;
      Z6889Tas_facab = DecimalUtil.ZERO ;
      Z6890Tas_Vol = 0 ;
      Z6891Tas_ColNom = "" ;
      Z6892Tas_ColNum = 0 ;
      Z6893Tas_Tc = (byte)(0) ;
      Z6894Tas_coscol = DecimalUtil.ZERO ;
      Z6895Tas_rpcod1 = "" ;
      Z6896Tas_cosrp1 = DecimalUtil.ZERO ;
      Z6897Tas_rpdsc1 = "" ;
      Z6898Tas_rpcod2 = "" ;
      Z6899Tas_rpdsc2 = "" ;
      Z6900Tas_cosrp2 = DecimalUtil.ZERO ;
      Z6901Tas_rpcod3 = "" ;
      Z6902Tas_rpdsc3 = "" ;
      Z6903Tas_cosrp3 = DecimalUtil.ZERO ;
      Z6904Tas_racod1 = "" ;
      Z6905Tas_radsc1 = "" ;
      Z6906Tas_cosra1 = DecimalUtil.ZERO ;
      Z6907Tas_racod2 = "" ;
      Z6908Tas_radsc2 = "" ;
      Z6909Tas_cosra2 = DecimalUtil.ZERO ;
      Z6910Tas_racod3 = "" ;
      Z6911Tas_radsc3 = "" ;
      Z6912Tas_cosra3 = DecimalUtil.ZERO ;
      Z6913Tas_cost1 = DecimalUtil.ZERO ;
      Z6914Tas_cost2 = DecimalUtil.ZERO ;
      Z6915Tas_ultlin = (short)(0) ;
      Z6916Tas_Procod = "" ;
      Z6917Tas_Prodsc = "" ;
      Z6918Tas_Porc = DecimalUtil.ZERO ;
      Z6919Tas_fecha = GXutil.resetTime( GXutil.nullDate() );
      Z6920Tas_usuari = "" ;
      Z6921Tas_termin = "" ;
      Z7006Tas_precio = DecimalUtil.ZERO ;
      Z252CliCod = 0 ;
   }

   public void initAll1GQ1620( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6882Tas_num = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6882Tas_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6882Tas_num), 8, 0));
      initializeNonKey1GQ1620( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1GQ1622( )
   {
      A457FasCod = "" ;
      n457FasCod = false ;
      A460FasDsc = "" ;
      A6923Tas_vel = DecimalUtil.ZERO ;
      n6923Tas_vel = false ;
      A6924Tas_maqc = "" ;
      n6924Tas_maqc = false ;
      A6925Tas_maqd = "" ;
      n6925Tas_maqd = false ;
      A6926Tas_costm = DecimalUtil.ZERO ;
      n6926Tas_costm = false ;
      A6927Tas_costmt = DecimalUtil.ZERO ;
      n6927Tas_costmt = false ;
      A6928Tas_costt1 = DecimalUtil.ZERO ;
      n6928Tas_costt1 = false ;
      Z6923Tas_vel = DecimalUtil.ZERO ;
      Z6924Tas_maqc = "" ;
      Z6925Tas_maqd = "" ;
      Z6926Tas_costm = DecimalUtil.ZERO ;
      Z6927Tas_costmt = DecimalUtil.ZERO ;
      Z6928Tas_costt1 = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
   }

   public void initAll1GQ1622( )
   {
      A6922Tas_lin = (short)(0) ;
      initializeNonKey1GQ1622( ) ;
   }

   public void standaloneModalInsert1GQ1622( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241575860", true, true);
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
      httpContext.AddJavascriptSource("tcostas.js", "?20268241575860", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1622( )
   {
      edtTas_lin_Enabled = defedtTas_lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTas_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTas_lin_Enabled), 5, 0), !bGXsfl_245_Refreshing);
   }

   public void startgridcontrol245( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1622, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1622_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6922Tas_lin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6923Tas_vel, (byte)(5), (byte)(1), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_vel_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6924Tas_maqc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_maqc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6925Tas_maqd));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_maqd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6926Tas_costm, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6927Tas_costmt, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costmt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6928Tas_costt1, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTas_costt1_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTas_num_Internalname = "TAS_NUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTas_Artcod_Internalname = "TAS_ARTCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTas_grm2_Internalname = "TAS_GRM2" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTas_anccr_Internalname = "TAS_ANCCR" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTas_pml_Internalname = "TAS_PML" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTas_kgs_Internalname = "TAS_KGS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtTas_mts_Internalname = "TAS_MTS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTas_facab_Internalname = "TAS_FACAB" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTas_Vol_Internalname = "TAS_VOL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtTas_ColNom_Internalname = "TAS_COLNOM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtTas_ColNum_Internalname = "TAS_COLNUM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtTas_Tc_Internalname = "TAS_TC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtTas_coscol_Internalname = "TAS_COSCOL" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtTas_rpcod1_Internalname = "TAS_RPCOD1" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtTas_cosrp1_Internalname = "TAS_COSRP1" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtTas_rpdsc1_Internalname = "TAS_RPDSC1" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtTas_rpcod2_Internalname = "TAS_RPCOD2" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtTas_rpdsc2_Internalname = "TAS_RPDSC2" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtTas_cosrp2_Internalname = "TAS_COSRP2" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtTas_rpcod3_Internalname = "TAS_RPCOD3" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtTas_rpdsc3_Internalname = "TAS_RPDSC3" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtTas_cosrp3_Internalname = "TAS_COSRP3" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtTas_racod1_Internalname = "TAS_RACOD1" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtTas_radsc1_Internalname = "TAS_RADSC1" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtTas_cosra1_Internalname = "TAS_COSRA1" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtTas_racod2_Internalname = "TAS_RACOD2" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtTas_radsc2_Internalname = "TAS_RADSC2" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtTas_cosra2_Internalname = "TAS_COSRA2" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtTas_racod3_Internalname = "TAS_RACOD3" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtTas_radsc3_Internalname = "TAS_RADSC3" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtTas_cosra3_Internalname = "TAS_COSRA3" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtTas_cost1_Internalname = "TAS_COST1" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtTas_cost2_Internalname = "TAS_COST2" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtTas_ultlin_Internalname = "TAS_ULTLIN" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtTas_Procod_Internalname = "TAS_PROCOD" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtTas_Prodsc_Internalname = "TAS_PRODSC" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtTas_Porc_Internalname = "TAS_PORC" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtTas_fecha_Internalname = "TAS_FECHA" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtTas_usuari_Internalname = "TAS_USUARI" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtTas_termin_Internalname = "TAS_TERMIN" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtTas_precio_Internalname = "TAS_PRECIO" ;
      edtavnRcdDeleted_1622_Internalname = "vNRCDDELETED_1622" ;
      edtTas_lin_Internalname = "TAS_LIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtTas_vel_Internalname = "TAS_VEL" ;
      edtTas_maqc_Internalname = "TAS_MAQC" ;
      edtTas_maqd_Internalname = "TAS_MAQD" ;
      edtTas_costm_Internalname = "TAS_COSTM" ;
      edtTas_costmt_Internalname = "TAS_COSTMT" ;
      edtTas_costt1_Internalname = "TAS_COSTT1" ;
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
      Form.setCaption( httpContext.getMessage( "SIMULACION COSTES TAS", "") );
      edtTas_costt1_Jsonclick = "" ;
      edtTas_costmt_Jsonclick = "" ;
      edtTas_costm_Jsonclick = "" ;
      edtTas_maqd_Jsonclick = "" ;
      edtTas_maqc_Jsonclick = "" ;
      edtTas_vel_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtTas_lin_Jsonclick = "" ;
      edtavnRcdDeleted_1622_Jsonclick = "" ;
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
      edtTas_costt1_Enabled = 1 ;
      edtTas_costmt_Enabled = 1 ;
      edtTas_costm_Enabled = 1 ;
      edtTas_maqd_Enabled = 1 ;
      edtTas_maqc_Enabled = 1 ;
      edtTas_vel_Enabled = 1 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtTas_lin_Enabled = 1 ;
      edtavnRcdDeleted_1622_Enabled = 1 ;
      edtTas_precio_Jsonclick = "" ;
      edtTas_precio_Backcolor = (int)(0xFFFFFF) ;
      edtTas_precio_Enabled = 1 ;
      edtTas_termin_Jsonclick = "" ;
      edtTas_termin_Backcolor = (int)(0xFFFFFF) ;
      edtTas_termin_Enabled = 1 ;
      edtTas_usuari_Jsonclick = "" ;
      edtTas_usuari_Backcolor = (int)(0xFFFFFF) ;
      edtTas_usuari_Enabled = 1 ;
      edtTas_fecha_Jsonclick = "" ;
      edtTas_fecha_Backcolor = (int)(0xFFFFFF) ;
      edtTas_fecha_Enabled = 1 ;
      edtTas_Porc_Jsonclick = "" ;
      edtTas_Porc_Backcolor = (int)(0xFFFFFF) ;
      edtTas_Porc_Enabled = 1 ;
      edtTas_Prodsc_Jsonclick = "" ;
      edtTas_Prodsc_Backcolor = (int)(0xFFFFFF) ;
      edtTas_Prodsc_Enabled = 1 ;
      edtTas_Procod_Jsonclick = "" ;
      edtTas_Procod_Backcolor = (int)(0xFFFFFF) ;
      edtTas_Procod_Enabled = 1 ;
      edtTas_ultlin_Jsonclick = "" ;
      edtTas_ultlin_Backcolor = (int)(0xFFFFFF) ;
      edtTas_ultlin_Enabled = 1 ;
      edtTas_cost2_Jsonclick = "" ;
      edtTas_cost2_Backcolor = (int)(0xFFFFFF) ;
      edtTas_cost2_Enabled = 1 ;
      edtTas_cost1_Jsonclick = "" ;
      edtTas_cost1_Backcolor = (int)(0xFFFFFF) ;
      edtTas_cost1_Enabled = 1 ;
      edtTas_cosra3_Jsonclick = "" ;
      edtTas_cosra3_Backcolor = (int)(0xFFFFFF) ;
      edtTas_cosra3_Enabled = 1 ;
      edtTas_radsc3_Jsonclick = "" ;
      edtTas_radsc3_Backcolor = (int)(0xFFFFFF) ;
      edtTas_radsc3_Enabled = 1 ;
      edtTas_racod3_Jsonclick = "" ;
      edtTas_racod3_Backcolor = (int)(0xFFFFFF) ;
      edtTas_racod3_Enabled = 1 ;
      edtTas_cosra2_Jsonclick = "" ;
      edtTas_cosra2_Backcolor = (int)(0xFFFFFF) ;
      edtTas_cosra2_Enabled = 1 ;
      edtTas_radsc2_Jsonclick = "" ;
      edtTas_radsc2_Backcolor = (int)(0xFFFFFF) ;
      edtTas_radsc2_Enabled = 1 ;
      edtTas_racod2_Jsonclick = "" ;
      edtTas_racod2_Backcolor = (int)(0xFFFFFF) ;
      edtTas_racod2_Enabled = 1 ;
      edtTas_cosra1_Jsonclick = "" ;
      edtTas_cosra1_Backcolor = (int)(0xFFFFFF) ;
      edtTas_cosra1_Enabled = 1 ;
      edtTas_radsc1_Jsonclick = "" ;
      edtTas_radsc1_Backcolor = (int)(0xFFFFFF) ;
      edtTas_radsc1_Enabled = 1 ;
      edtTas_racod1_Jsonclick = "" ;
      edtTas_racod1_Backcolor = (int)(0xFFFFFF) ;
      edtTas_racod1_Enabled = 1 ;
      edtTas_cosrp3_Jsonclick = "" ;
      edtTas_cosrp3_Backcolor = (int)(0xFFFFFF) ;
      edtTas_cosrp3_Enabled = 1 ;
      edtTas_rpdsc3_Jsonclick = "" ;
      edtTas_rpdsc3_Backcolor = (int)(0xFFFFFF) ;
      edtTas_rpdsc3_Enabled = 1 ;
      edtTas_rpcod3_Jsonclick = "" ;
      edtTas_rpcod3_Backcolor = (int)(0xFFFFFF) ;
      edtTas_rpcod3_Enabled = 1 ;
      edtTas_cosrp2_Jsonclick = "" ;
      edtTas_cosrp2_Backcolor = (int)(0xFFFFFF) ;
      edtTas_cosrp2_Enabled = 1 ;
      edtTas_rpdsc2_Jsonclick = "" ;
      edtTas_rpdsc2_Backcolor = (int)(0xFFFFFF) ;
      edtTas_rpdsc2_Enabled = 1 ;
      edtTas_rpcod2_Jsonclick = "" ;
      edtTas_rpcod2_Backcolor = (int)(0xFFFFFF) ;
      edtTas_rpcod2_Enabled = 1 ;
      edtTas_rpdsc1_Jsonclick = "" ;
      edtTas_rpdsc1_Backcolor = (int)(0xFFFFFF) ;
      edtTas_rpdsc1_Enabled = 1 ;
      edtTas_cosrp1_Jsonclick = "" ;
      edtTas_cosrp1_Backcolor = (int)(0xFFFFFF) ;
      edtTas_cosrp1_Enabled = 1 ;
      edtTas_rpcod1_Jsonclick = "" ;
      edtTas_rpcod1_Backcolor = (int)(0xFFFFFF) ;
      edtTas_rpcod1_Enabled = 1 ;
      edtTas_coscol_Jsonclick = "" ;
      edtTas_coscol_Backcolor = (int)(0xFFFFFF) ;
      edtTas_coscol_Enabled = 1 ;
      edtTas_Tc_Jsonclick = "" ;
      edtTas_Tc_Backcolor = (int)(0xFFFFFF) ;
      edtTas_Tc_Enabled = 1 ;
      edtTas_ColNum_Jsonclick = "" ;
      edtTas_ColNum_Backcolor = (int)(0xFFFFFF) ;
      edtTas_ColNum_Enabled = 1 ;
      edtTas_ColNom_Jsonclick = "" ;
      edtTas_ColNom_Backcolor = (int)(0xFFFFFF) ;
      edtTas_ColNom_Enabled = 1 ;
      edtTas_Vol_Jsonclick = "" ;
      edtTas_Vol_Backcolor = (int)(0xFFFFFF) ;
      edtTas_Vol_Enabled = 1 ;
      edtTas_facab_Jsonclick = "" ;
      edtTas_facab_Backcolor = (int)(0xFFFFFF) ;
      edtTas_facab_Enabled = 1 ;
      edtTas_mts_Jsonclick = "" ;
      edtTas_mts_Backcolor = (int)(0xFFFFFF) ;
      edtTas_mts_Enabled = 1 ;
      edtTas_kgs_Jsonclick = "" ;
      edtTas_kgs_Backcolor = (int)(0xFFFFFF) ;
      edtTas_kgs_Enabled = 1 ;
      edtTas_pml_Jsonclick = "" ;
      edtTas_pml_Backcolor = (int)(0xFFFFFF) ;
      edtTas_pml_Enabled = 1 ;
      edtTas_anccr_Jsonclick = "" ;
      edtTas_anccr_Backcolor = (int)(0xFFFFFF) ;
      edtTas_anccr_Enabled = 1 ;
      edtTas_grm2_Jsonclick = "" ;
      edtTas_grm2_Backcolor = (int)(0xFFFFFF) ;
      edtTas_grm2_Enabled = 1 ;
      edtTas_Artcod_Jsonclick = "" ;
      edtTas_Artcod_Backcolor = (int)(0xFFFFFF) ;
      edtTas_Artcod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTas_num_Jsonclick = "" ;
      edtTas_num_Backcolor = (int)(0xFFFFFF) ;
      edtTas_num_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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
      subsflControlProps_2451622( ) ;
      while ( nGXsfl_245_idx <= nRC_GXsfl_245 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1GQ1622( ) ;
         standaloneModal1GQ1622( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1GQ1622( ) ;
         nGXsfl_245_idx = (int)(nGXsfl_245_idx+1) ;
         sGXsfl_245_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_245_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2451622( ) ;
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
      /* Using cursor T01GQ18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GQ18_A407EmprNom[0] ;
      n407EmprNom = T01GQ18_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(16);
      GX_FocusControl = edtCliCod_Internalname ;
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
      /* Using cursor T01GQ18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01GQ18_A407EmprNom[0] ;
      n407EmprNom = T01GQ18_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Tas_num( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6883Tas_Artcod", GXutil.rtrim( A6883Tas_Artcod));
      httpContext.ajax_rsp_assign_attri("", false, "A6884Tas_grm2", GXutil.ltrim( localUtil.ntoc( A6884Tas_grm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6885Tas_anccr", GXutil.ltrim( localUtil.ntoc( A6885Tas_anccr, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6886Tas_pml", GXutil.ltrim( localUtil.ntoc( A6886Tas_pml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6887Tas_kgs", GXutil.ltrim( localUtil.ntoc( A6887Tas_kgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6888Tas_mts", GXutil.ltrim( localUtil.ntoc( A6888Tas_mts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6889Tas_facab", GXutil.ltrim( localUtil.ntoc( A6889Tas_facab, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6890Tas_Vol", GXutil.ltrim( localUtil.ntoc( A6890Tas_Vol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6891Tas_ColNom", GXutil.rtrim( A6891Tas_ColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6892Tas_ColNum", GXutil.ltrim( localUtil.ntoc( A6892Tas_ColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6893Tas_Tc", GXutil.ltrim( localUtil.ntoc( A6893Tas_Tc, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6894Tas_coscol", GXutil.ltrim( localUtil.ntoc( A6894Tas_coscol, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6895Tas_rpcod1", GXutil.rtrim( A6895Tas_rpcod1));
      httpContext.ajax_rsp_assign_attri("", false, "A6896Tas_cosrp1", GXutil.ltrim( localUtil.ntoc( A6896Tas_cosrp1, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6897Tas_rpdsc1", GXutil.rtrim( A6897Tas_rpdsc1));
      httpContext.ajax_rsp_assign_attri("", false, "A6898Tas_rpcod2", GXutil.rtrim( A6898Tas_rpcod2));
      httpContext.ajax_rsp_assign_attri("", false, "A6899Tas_rpdsc2", GXutil.rtrim( A6899Tas_rpdsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A6900Tas_cosrp2", GXutil.ltrim( localUtil.ntoc( A6900Tas_cosrp2, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6901Tas_rpcod3", GXutil.rtrim( A6901Tas_rpcod3));
      httpContext.ajax_rsp_assign_attri("", false, "A6902Tas_rpdsc3", GXutil.rtrim( A6902Tas_rpdsc3));
      httpContext.ajax_rsp_assign_attri("", false, "A6903Tas_cosrp3", GXutil.ltrim( localUtil.ntoc( A6903Tas_cosrp3, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6904Tas_racod1", GXutil.rtrim( A6904Tas_racod1));
      httpContext.ajax_rsp_assign_attri("", false, "A6905Tas_radsc1", GXutil.rtrim( A6905Tas_radsc1));
      httpContext.ajax_rsp_assign_attri("", false, "A6906Tas_cosra1", GXutil.ltrim( localUtil.ntoc( A6906Tas_cosra1, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6907Tas_racod2", GXutil.rtrim( A6907Tas_racod2));
      httpContext.ajax_rsp_assign_attri("", false, "A6908Tas_radsc2", GXutil.rtrim( A6908Tas_radsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A6909Tas_cosra2", GXutil.ltrim( localUtil.ntoc( A6909Tas_cosra2, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6910Tas_racod3", GXutil.rtrim( A6910Tas_racod3));
      httpContext.ajax_rsp_assign_attri("", false, "A6911Tas_radsc3", GXutil.rtrim( A6911Tas_radsc3));
      httpContext.ajax_rsp_assign_attri("", false, "A6912Tas_cosra3", GXutil.ltrim( localUtil.ntoc( A6912Tas_cosra3, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6913Tas_cost1", GXutil.ltrim( localUtil.ntoc( A6913Tas_cost1, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6914Tas_cost2", GXutil.ltrim( localUtil.ntoc( A6914Tas_cost2, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6915Tas_ultlin", GXutil.ltrim( localUtil.ntoc( A6915Tas_ultlin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6916Tas_Procod", GXutil.rtrim( A6916Tas_Procod));
      httpContext.ajax_rsp_assign_attri("", false, "A6917Tas_Prodsc", GXutil.rtrim( A6917Tas_Prodsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6918Tas_Porc", GXutil.ltrim( localUtil.ntoc( A6918Tas_Porc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6919Tas_fecha", localUtil.ttoc( A6919Tas_fecha, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6920Tas_usuari", GXutil.rtrim( A6920Tas_usuari));
      httpContext.ajax_rsp_assign_attri("", false, "A6921Tas_termin", GXutil.rtrim( A6921Tas_termin));
      httpContext.ajax_rsp_assign_attri("", false, "A7006Tas_precio", GXutil.ltrim( localUtil.ntoc( A7006Tas_precio, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6882Tas_num", GXutil.ltrim( localUtil.ntoc( Z6882Tas_num, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6883Tas_Artcod", GXutil.rtrim( Z6883Tas_Artcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6884Tas_grm2", GXutil.ltrim( localUtil.ntoc( Z6884Tas_grm2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6885Tas_anccr", GXutil.ltrim( localUtil.ntoc( Z6885Tas_anccr, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6886Tas_pml", GXutil.ltrim( localUtil.ntoc( Z6886Tas_pml, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6887Tas_kgs", GXutil.ltrim( localUtil.ntoc( Z6887Tas_kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6888Tas_mts", GXutil.ltrim( localUtil.ntoc( Z6888Tas_mts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6889Tas_facab", GXutil.ltrim( localUtil.ntoc( Z6889Tas_facab, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6890Tas_Vol", GXutil.ltrim( localUtil.ntoc( Z6890Tas_Vol, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6891Tas_ColNom", GXutil.rtrim( Z6891Tas_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6892Tas_ColNum", GXutil.ltrim( localUtil.ntoc( Z6892Tas_ColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6893Tas_Tc", GXutil.ltrim( localUtil.ntoc( Z6893Tas_Tc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6894Tas_coscol", GXutil.ltrim( localUtil.ntoc( Z6894Tas_coscol, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6895Tas_rpcod1", GXutil.rtrim( Z6895Tas_rpcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6896Tas_cosrp1", GXutil.ltrim( localUtil.ntoc( Z6896Tas_cosrp1, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6897Tas_rpdsc1", GXutil.rtrim( Z6897Tas_rpdsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6898Tas_rpcod2", GXutil.rtrim( Z6898Tas_rpcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6899Tas_rpdsc2", GXutil.rtrim( Z6899Tas_rpdsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6900Tas_cosrp2", GXutil.ltrim( localUtil.ntoc( Z6900Tas_cosrp2, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6901Tas_rpcod3", GXutil.rtrim( Z6901Tas_rpcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6902Tas_rpdsc3", GXutil.rtrim( Z6902Tas_rpdsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6903Tas_cosrp3", GXutil.ltrim( localUtil.ntoc( Z6903Tas_cosrp3, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6904Tas_racod1", GXutil.rtrim( Z6904Tas_racod1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6905Tas_radsc1", GXutil.rtrim( Z6905Tas_radsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6906Tas_cosra1", GXutil.ltrim( localUtil.ntoc( Z6906Tas_cosra1, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6907Tas_racod2", GXutil.rtrim( Z6907Tas_racod2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6908Tas_radsc2", GXutil.rtrim( Z6908Tas_radsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6909Tas_cosra2", GXutil.ltrim( localUtil.ntoc( Z6909Tas_cosra2, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6910Tas_racod3", GXutil.rtrim( Z6910Tas_racod3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6911Tas_radsc3", GXutil.rtrim( Z6911Tas_radsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6912Tas_cosra3", GXutil.ltrim( localUtil.ntoc( Z6912Tas_cosra3, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6913Tas_cost1", GXutil.ltrim( localUtil.ntoc( Z6913Tas_cost1, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6914Tas_cost2", GXutil.ltrim( localUtil.ntoc( Z6914Tas_cost2, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6915Tas_ultlin", GXutil.ltrim( localUtil.ntoc( Z6915Tas_ultlin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6916Tas_Procod", GXutil.rtrim( Z6916Tas_Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6917Tas_Prodsc", GXutil.rtrim( Z6917Tas_Prodsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6918Tas_Porc", GXutil.ltrim( localUtil.ntoc( Z6918Tas_Porc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6919Tas_fecha", localUtil.ttoc( Z6919Tas_fecha, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6920Tas_usuari", GXutil.rtrim( Z6920Tas_usuari));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6921Tas_termin", GXutil.rtrim( Z6921Tas_termin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7006Tas_precio", GXutil.ltrim( localUtil.ntoc( Z7006Tas_precio, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      /* Using cursor T01GQ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01GQ19_A279CliNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Fascod( )
   {
      n457FasCod = false ;
      /* Using cursor T01GQ27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01GQ27_A460FasDsc[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_TAS_NUM","{handler:'valid_Tas_num',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6882Tas_num',fld:'TAS_NUM',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TAS_NUM",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6883Tas_Artcod',fld:'TAS_ARTCOD',pic:''},{av:'A6884Tas_grm2',fld:'TAS_GRM2',pic:'ZZZ9'},{av:'A6885Tas_anccr',fld:'TAS_ANCCR',pic:'ZZ9'},{av:'A6886Tas_pml',fld:'TAS_PML',pic:'ZZZ9'},{av:'A6887Tas_kgs',fld:'TAS_KGS',pic:'ZZZZZ9.99'},{av:'A6888Tas_mts',fld:'TAS_MTS',pic:'ZZZZZ9.99'},{av:'A6889Tas_facab',fld:'TAS_FACAB',pic:'ZZ9.99'},{av:'A6890Tas_Vol',fld:'TAS_VOL',pic:'ZZZZ9'},{av:'A6891Tas_ColNom',fld:'TAS_COLNOM',pic:''},{av:'A6892Tas_ColNum',fld:'TAS_COLNUM',pic:'ZZZZZ9'},{av:'A6893Tas_Tc',fld:'TAS_TC',pic:'Z9'},{av:'A6894Tas_coscol',fld:'TAS_COSCOL',pic:'ZZZZ9.99999'},{av:'A6895Tas_rpcod1',fld:'TAS_RPCOD1',pic:''},{av:'A6896Tas_cosrp1',fld:'TAS_COSRP1',pic:'ZZZZ9.99999'},{av:'A6897Tas_rpdsc1',fld:'TAS_RPDSC1',pic:''},{av:'A6898Tas_rpcod2',fld:'TAS_RPCOD2',pic:''},{av:'A6899Tas_rpdsc2',fld:'TAS_RPDSC2',pic:''},{av:'A6900Tas_cosrp2',fld:'TAS_COSRP2',pic:'ZZZZ9.99999'},{av:'A6901Tas_rpcod3',fld:'TAS_RPCOD3',pic:''},{av:'A6902Tas_rpdsc3',fld:'TAS_RPDSC3',pic:''},{av:'A6903Tas_cosrp3',fld:'TAS_COSRP3',pic:'ZZZZ9.99999'},{av:'A6904Tas_racod1',fld:'TAS_RACOD1',pic:''},{av:'A6905Tas_radsc1',fld:'TAS_RADSC1',pic:''},{av:'A6906Tas_cosra1',fld:'TAS_COSRA1',pic:'ZZZZ9.99999'},{av:'A6907Tas_racod2',fld:'TAS_RACOD2',pic:''},{av:'A6908Tas_radsc2',fld:'TAS_RADSC2',pic:''},{av:'A6909Tas_cosra2',fld:'TAS_COSRA2',pic:'ZZZZ9.99999'},{av:'A6910Tas_racod3',fld:'TAS_RACOD3',pic:''},{av:'A6911Tas_radsc3',fld:'TAS_RADSC3',pic:''},{av:'A6912Tas_cosra3',fld:'TAS_COSRA3',pic:'ZZZZ9.99999'},{av:'A6913Tas_cost1',fld:'TAS_COST1',pic:'ZZZZZZ9.999'},{av:'A6914Tas_cost2',fld:'TAS_COST2',pic:'ZZZZZZ9.999'},{av:'A6915Tas_ultlin',fld:'TAS_ULTLIN',pic:'ZZZ9'},{av:'A6916Tas_Procod',fld:'TAS_PROCOD',pic:''},{av:'A6917Tas_Prodsc',fld:'TAS_PRODSC',pic:''},{av:'A6918Tas_Porc',fld:'TAS_PORC',pic:'ZZ9.99'},{av:'A6919Tas_fecha',fld:'TAS_FECHA',pic:'99/99/99 99:99'},{av:'A6920Tas_usuari',fld:'TAS_USUARI',pic:''},{av:'A6921Tas_termin',fld:'TAS_TERMIN',pic:''},{av:'A7006Tas_precio',fld:'TAS_PRECIO',pic:'ZZZZZZ9.99999'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z6882Tas_num'},{av:'Z252CliCod'},{av:'Z6883Tas_Artcod'},{av:'Z6884Tas_grm2'},{av:'Z6885Tas_anccr'},{av:'Z6886Tas_pml'},{av:'Z6887Tas_kgs'},{av:'Z6888Tas_mts'},{av:'Z6889Tas_facab'},{av:'Z6890Tas_Vol'},{av:'Z6891Tas_ColNom'},{av:'Z6892Tas_ColNum'},{av:'Z6893Tas_Tc'},{av:'Z6894Tas_coscol'},{av:'Z6895Tas_rpcod1'},{av:'Z6896Tas_cosrp1'},{av:'Z6897Tas_rpdsc1'},{av:'Z6898Tas_rpcod2'},{av:'Z6899Tas_rpdsc2'},{av:'Z6900Tas_cosrp2'},{av:'Z6901Tas_rpcod3'},{av:'Z6902Tas_rpdsc3'},{av:'Z6903Tas_cosrp3'},{av:'Z6904Tas_racod1'},{av:'Z6905Tas_radsc1'},{av:'Z6906Tas_cosra1'},{av:'Z6907Tas_racod2'},{av:'Z6908Tas_radsc2'},{av:'Z6909Tas_cosra2'},{av:'Z6910Tas_racod3'},{av:'Z6911Tas_radsc3'},{av:'Z6912Tas_cosra3'},{av:'Z6913Tas_cost1'},{av:'Z6914Tas_cost2'},{av:'Z6915Tas_ultlin'},{av:'Z6916Tas_Procod'},{av:'Z6917Tas_Prodsc'},{av:'Z6918Tas_Porc'},{av:'Z6919Tas_fecha'},{av:'Z6920Tas_usuari'},{av:'Z6921Tas_termin'},{av:'Z7006Tas_precio'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_TAS_LIN","{handler:'valid_Tas_lin',iparms:[]");
      setEventMetadata("VALID_TAS_LIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Tas_costt1',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(17);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z6883Tas_Artcod = "" ;
      Z6887Tas_kgs = DecimalUtil.ZERO ;
      Z6888Tas_mts = DecimalUtil.ZERO ;
      Z6889Tas_facab = DecimalUtil.ZERO ;
      Z6891Tas_ColNom = "" ;
      Z6894Tas_coscol = DecimalUtil.ZERO ;
      Z6895Tas_rpcod1 = "" ;
      Z6896Tas_cosrp1 = DecimalUtil.ZERO ;
      Z6897Tas_rpdsc1 = "" ;
      Z6898Tas_rpcod2 = "" ;
      Z6899Tas_rpdsc2 = "" ;
      Z6900Tas_cosrp2 = DecimalUtil.ZERO ;
      Z6901Tas_rpcod3 = "" ;
      Z6902Tas_rpdsc3 = "" ;
      Z6903Tas_cosrp3 = DecimalUtil.ZERO ;
      Z6904Tas_racod1 = "" ;
      Z6905Tas_radsc1 = "" ;
      Z6906Tas_cosra1 = DecimalUtil.ZERO ;
      Z6907Tas_racod2 = "" ;
      Z6908Tas_radsc2 = "" ;
      Z6909Tas_cosra2 = DecimalUtil.ZERO ;
      Z6910Tas_racod3 = "" ;
      Z6911Tas_radsc3 = "" ;
      Z6912Tas_cosra3 = DecimalUtil.ZERO ;
      Z6913Tas_cost1 = DecimalUtil.ZERO ;
      Z6914Tas_cost2 = DecimalUtil.ZERO ;
      Z6916Tas_Procod = "" ;
      Z6917Tas_Prodsc = "" ;
      Z6918Tas_Porc = DecimalUtil.ZERO ;
      Z6919Tas_fecha = GXutil.resetTime( GXutil.nullDate() );
      Z6920Tas_usuari = "" ;
      Z6921Tas_termin = "" ;
      Z7006Tas_precio = DecimalUtil.ZERO ;
      Z6923Tas_vel = DecimalUtil.ZERO ;
      Z6924Tas_maqc = "" ;
      Z6925Tas_maqd = "" ;
      Z6926Tas_costm = DecimalUtil.ZERO ;
      Z6927Tas_costmt = DecimalUtil.ZERO ;
      Z6928Tas_costt1 = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A6883Tas_Artcod = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A6887Tas_kgs = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A6888Tas_mts = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A6889Tas_facab = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A6891Tas_ColNom = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A6894Tas_coscol = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A6895Tas_rpcod1 = "" ;
      lblTextblock19_Jsonclick = "" ;
      A6896Tas_cosrp1 = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A6897Tas_rpdsc1 = "" ;
      lblTextblock21_Jsonclick = "" ;
      A6898Tas_rpcod2 = "" ;
      lblTextblock22_Jsonclick = "" ;
      A6899Tas_rpdsc2 = "" ;
      lblTextblock23_Jsonclick = "" ;
      A6900Tas_cosrp2 = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A6901Tas_rpcod3 = "" ;
      lblTextblock25_Jsonclick = "" ;
      A6902Tas_rpdsc3 = "" ;
      lblTextblock26_Jsonclick = "" ;
      A6903Tas_cosrp3 = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      A6904Tas_racod1 = "" ;
      lblTextblock28_Jsonclick = "" ;
      A6905Tas_radsc1 = "" ;
      lblTextblock29_Jsonclick = "" ;
      A6906Tas_cosra1 = DecimalUtil.ZERO ;
      lblTextblock30_Jsonclick = "" ;
      A6907Tas_racod2 = "" ;
      lblTextblock31_Jsonclick = "" ;
      A6908Tas_radsc2 = "" ;
      lblTextblock32_Jsonclick = "" ;
      A6909Tas_cosra2 = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      A6910Tas_racod3 = "" ;
      lblTextblock34_Jsonclick = "" ;
      A6911Tas_radsc3 = "" ;
      lblTextblock35_Jsonclick = "" ;
      A6912Tas_cosra3 = DecimalUtil.ZERO ;
      lblTextblock36_Jsonclick = "" ;
      A6913Tas_cost1 = DecimalUtil.ZERO ;
      lblTextblock37_Jsonclick = "" ;
      A6914Tas_cost2 = DecimalUtil.ZERO ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      A6916Tas_Procod = "" ;
      lblTextblock40_Jsonclick = "" ;
      A6917Tas_Prodsc = "" ;
      lblTextblock41_Jsonclick = "" ;
      A6918Tas_Porc = DecimalUtil.ZERO ;
      lblTextblock42_Jsonclick = "" ;
      A6919Tas_fecha = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock43_Jsonclick = "" ;
      A6920Tas_usuari = "" ;
      lblTextblock44_Jsonclick = "" ;
      A6921Tas_termin = "" ;
      lblTextblock45_Jsonclick = "" ;
      A7006Tas_precio = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1622 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1620 = "" ;
      GXCCtl = "" ;
      A460FasDsc = "" ;
      A6923Tas_vel = DecimalUtil.ZERO ;
      A6924Tas_maqc = "" ;
      A6925Tas_maqd = "" ;
      A6926Tas_costm = DecimalUtil.ZERO ;
      A6927Tas_costmt = DecimalUtil.ZERO ;
      A6928Tas_costt1 = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01GQ9_A6882Tas_num = new int[1] ;
      T01GQ9_A407EmprNom = new String[] {""} ;
      T01GQ9_n407EmprNom = new boolean[] {false} ;
      T01GQ9_A279CliNom = new String[] {""} ;
      T01GQ9_A6883Tas_Artcod = new String[] {""} ;
      T01GQ9_n6883Tas_Artcod = new boolean[] {false} ;
      T01GQ9_A6884Tas_grm2 = new short[1] ;
      T01GQ9_n6884Tas_grm2 = new boolean[] {false} ;
      T01GQ9_A6885Tas_anccr = new short[1] ;
      T01GQ9_n6885Tas_anccr = new boolean[] {false} ;
      T01GQ9_A6886Tas_pml = new short[1] ;
      T01GQ9_n6886Tas_pml = new boolean[] {false} ;
      T01GQ9_A6887Tas_kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6887Tas_kgs = new boolean[] {false} ;
      T01GQ9_A6888Tas_mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6888Tas_mts = new boolean[] {false} ;
      T01GQ9_A6889Tas_facab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6889Tas_facab = new boolean[] {false} ;
      T01GQ9_A6890Tas_Vol = new int[1] ;
      T01GQ9_n6890Tas_Vol = new boolean[] {false} ;
      T01GQ9_A6891Tas_ColNom = new String[] {""} ;
      T01GQ9_n6891Tas_ColNom = new boolean[] {false} ;
      T01GQ9_A6892Tas_ColNum = new int[1] ;
      T01GQ9_n6892Tas_ColNum = new boolean[] {false} ;
      T01GQ9_A6893Tas_Tc = new byte[1] ;
      T01GQ9_n6893Tas_Tc = new boolean[] {false} ;
      T01GQ9_A6894Tas_coscol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6894Tas_coscol = new boolean[] {false} ;
      T01GQ9_A6895Tas_rpcod1 = new String[] {""} ;
      T01GQ9_n6895Tas_rpcod1 = new boolean[] {false} ;
      T01GQ9_A6896Tas_cosrp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6896Tas_cosrp1 = new boolean[] {false} ;
      T01GQ9_A6897Tas_rpdsc1 = new String[] {""} ;
      T01GQ9_n6897Tas_rpdsc1 = new boolean[] {false} ;
      T01GQ9_A6898Tas_rpcod2 = new String[] {""} ;
      T01GQ9_n6898Tas_rpcod2 = new boolean[] {false} ;
      T01GQ9_A6899Tas_rpdsc2 = new String[] {""} ;
      T01GQ9_n6899Tas_rpdsc2 = new boolean[] {false} ;
      T01GQ9_A6900Tas_cosrp2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6900Tas_cosrp2 = new boolean[] {false} ;
      T01GQ9_A6901Tas_rpcod3 = new String[] {""} ;
      T01GQ9_n6901Tas_rpcod3 = new boolean[] {false} ;
      T01GQ9_A6902Tas_rpdsc3 = new String[] {""} ;
      T01GQ9_n6902Tas_rpdsc3 = new boolean[] {false} ;
      T01GQ9_A6903Tas_cosrp3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6903Tas_cosrp3 = new boolean[] {false} ;
      T01GQ9_A6904Tas_racod1 = new String[] {""} ;
      T01GQ9_n6904Tas_racod1 = new boolean[] {false} ;
      T01GQ9_A6905Tas_radsc1 = new String[] {""} ;
      T01GQ9_n6905Tas_radsc1 = new boolean[] {false} ;
      T01GQ9_A6906Tas_cosra1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6906Tas_cosra1 = new boolean[] {false} ;
      T01GQ9_A6907Tas_racod2 = new String[] {""} ;
      T01GQ9_n6907Tas_racod2 = new boolean[] {false} ;
      T01GQ9_A6908Tas_radsc2 = new String[] {""} ;
      T01GQ9_n6908Tas_radsc2 = new boolean[] {false} ;
      T01GQ9_A6909Tas_cosra2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6909Tas_cosra2 = new boolean[] {false} ;
      T01GQ9_A6910Tas_racod3 = new String[] {""} ;
      T01GQ9_n6910Tas_racod3 = new boolean[] {false} ;
      T01GQ9_A6911Tas_radsc3 = new String[] {""} ;
      T01GQ9_n6911Tas_radsc3 = new boolean[] {false} ;
      T01GQ9_A6912Tas_cosra3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6912Tas_cosra3 = new boolean[] {false} ;
      T01GQ9_A6913Tas_cost1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6913Tas_cost1 = new boolean[] {false} ;
      T01GQ9_A6914Tas_cost2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6914Tas_cost2 = new boolean[] {false} ;
      T01GQ9_A6915Tas_ultlin = new short[1] ;
      T01GQ9_n6915Tas_ultlin = new boolean[] {false} ;
      T01GQ9_A6916Tas_Procod = new String[] {""} ;
      T01GQ9_n6916Tas_Procod = new boolean[] {false} ;
      T01GQ9_A6917Tas_Prodsc = new String[] {""} ;
      T01GQ9_n6917Tas_Prodsc = new boolean[] {false} ;
      T01GQ9_A6918Tas_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n6918Tas_Porc = new boolean[] {false} ;
      T01GQ9_A6919Tas_fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GQ9_n6919Tas_fecha = new boolean[] {false} ;
      T01GQ9_A6920Tas_usuari = new String[] {""} ;
      T01GQ9_n6920Tas_usuari = new boolean[] {false} ;
      T01GQ9_A6921Tas_termin = new String[] {""} ;
      T01GQ9_n6921Tas_termin = new boolean[] {false} ;
      T01GQ9_A7006Tas_precio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ9_n7006Tas_precio = new boolean[] {false} ;
      T01GQ9_A396EmprCod = new String[] {""} ;
      T01GQ9_A252CliCod = new int[1] ;
      T01GQ9_n252CliCod = new boolean[] {false} ;
      T01GQ7_A407EmprNom = new String[] {""} ;
      T01GQ7_n407EmprNom = new boolean[] {false} ;
      T01GQ8_A279CliNom = new String[] {""} ;
      T01GQ10_A407EmprNom = new String[] {""} ;
      T01GQ10_n407EmprNom = new boolean[] {false} ;
      T01GQ11_A279CliNom = new String[] {""} ;
      T01GQ12_A396EmprCod = new String[] {""} ;
      T01GQ12_A6882Tas_num = new int[1] ;
      T01GQ6_A6882Tas_num = new int[1] ;
      T01GQ6_A6883Tas_Artcod = new String[] {""} ;
      T01GQ6_n6883Tas_Artcod = new boolean[] {false} ;
      T01GQ6_A6884Tas_grm2 = new short[1] ;
      T01GQ6_n6884Tas_grm2 = new boolean[] {false} ;
      T01GQ6_A6885Tas_anccr = new short[1] ;
      T01GQ6_n6885Tas_anccr = new boolean[] {false} ;
      T01GQ6_A6886Tas_pml = new short[1] ;
      T01GQ6_n6886Tas_pml = new boolean[] {false} ;
      T01GQ6_A6887Tas_kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6887Tas_kgs = new boolean[] {false} ;
      T01GQ6_A6888Tas_mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6888Tas_mts = new boolean[] {false} ;
      T01GQ6_A6889Tas_facab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6889Tas_facab = new boolean[] {false} ;
      T01GQ6_A6890Tas_Vol = new int[1] ;
      T01GQ6_n6890Tas_Vol = new boolean[] {false} ;
      T01GQ6_A6891Tas_ColNom = new String[] {""} ;
      T01GQ6_n6891Tas_ColNom = new boolean[] {false} ;
      T01GQ6_A6892Tas_ColNum = new int[1] ;
      T01GQ6_n6892Tas_ColNum = new boolean[] {false} ;
      T01GQ6_A6893Tas_Tc = new byte[1] ;
      T01GQ6_n6893Tas_Tc = new boolean[] {false} ;
      T01GQ6_A6894Tas_coscol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6894Tas_coscol = new boolean[] {false} ;
      T01GQ6_A6895Tas_rpcod1 = new String[] {""} ;
      T01GQ6_n6895Tas_rpcod1 = new boolean[] {false} ;
      T01GQ6_A6896Tas_cosrp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6896Tas_cosrp1 = new boolean[] {false} ;
      T01GQ6_A6897Tas_rpdsc1 = new String[] {""} ;
      T01GQ6_n6897Tas_rpdsc1 = new boolean[] {false} ;
      T01GQ6_A6898Tas_rpcod2 = new String[] {""} ;
      T01GQ6_n6898Tas_rpcod2 = new boolean[] {false} ;
      T01GQ6_A6899Tas_rpdsc2 = new String[] {""} ;
      T01GQ6_n6899Tas_rpdsc2 = new boolean[] {false} ;
      T01GQ6_A6900Tas_cosrp2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6900Tas_cosrp2 = new boolean[] {false} ;
      T01GQ6_A6901Tas_rpcod3 = new String[] {""} ;
      T01GQ6_n6901Tas_rpcod3 = new boolean[] {false} ;
      T01GQ6_A6902Tas_rpdsc3 = new String[] {""} ;
      T01GQ6_n6902Tas_rpdsc3 = new boolean[] {false} ;
      T01GQ6_A6903Tas_cosrp3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6903Tas_cosrp3 = new boolean[] {false} ;
      T01GQ6_A6904Tas_racod1 = new String[] {""} ;
      T01GQ6_n6904Tas_racod1 = new boolean[] {false} ;
      T01GQ6_A6905Tas_radsc1 = new String[] {""} ;
      T01GQ6_n6905Tas_radsc1 = new boolean[] {false} ;
      T01GQ6_A6906Tas_cosra1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6906Tas_cosra1 = new boolean[] {false} ;
      T01GQ6_A6907Tas_racod2 = new String[] {""} ;
      T01GQ6_n6907Tas_racod2 = new boolean[] {false} ;
      T01GQ6_A6908Tas_radsc2 = new String[] {""} ;
      T01GQ6_n6908Tas_radsc2 = new boolean[] {false} ;
      T01GQ6_A6909Tas_cosra2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6909Tas_cosra2 = new boolean[] {false} ;
      T01GQ6_A6910Tas_racod3 = new String[] {""} ;
      T01GQ6_n6910Tas_racod3 = new boolean[] {false} ;
      T01GQ6_A6911Tas_radsc3 = new String[] {""} ;
      T01GQ6_n6911Tas_radsc3 = new boolean[] {false} ;
      T01GQ6_A6912Tas_cosra3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6912Tas_cosra3 = new boolean[] {false} ;
      T01GQ6_A6913Tas_cost1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6913Tas_cost1 = new boolean[] {false} ;
      T01GQ6_A6914Tas_cost2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6914Tas_cost2 = new boolean[] {false} ;
      T01GQ6_A6915Tas_ultlin = new short[1] ;
      T01GQ6_n6915Tas_ultlin = new boolean[] {false} ;
      T01GQ6_A6916Tas_Procod = new String[] {""} ;
      T01GQ6_n6916Tas_Procod = new boolean[] {false} ;
      T01GQ6_A6917Tas_Prodsc = new String[] {""} ;
      T01GQ6_n6917Tas_Prodsc = new boolean[] {false} ;
      T01GQ6_A6918Tas_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n6918Tas_Porc = new boolean[] {false} ;
      T01GQ6_A6919Tas_fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GQ6_n6919Tas_fecha = new boolean[] {false} ;
      T01GQ6_A6920Tas_usuari = new String[] {""} ;
      T01GQ6_n6920Tas_usuari = new boolean[] {false} ;
      T01GQ6_A6921Tas_termin = new String[] {""} ;
      T01GQ6_n6921Tas_termin = new boolean[] {false} ;
      T01GQ6_A7006Tas_precio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ6_n7006Tas_precio = new boolean[] {false} ;
      T01GQ6_A396EmprCod = new String[] {""} ;
      T01GQ6_A252CliCod = new int[1] ;
      T01GQ6_n252CliCod = new boolean[] {false} ;
      T01GQ13_A396EmprCod = new String[] {""} ;
      T01GQ13_A6882Tas_num = new int[1] ;
      T01GQ14_A396EmprCod = new String[] {""} ;
      T01GQ14_A6882Tas_num = new int[1] ;
      T01GQ5_A6882Tas_num = new int[1] ;
      T01GQ5_A6883Tas_Artcod = new String[] {""} ;
      T01GQ5_n6883Tas_Artcod = new boolean[] {false} ;
      T01GQ5_A6884Tas_grm2 = new short[1] ;
      T01GQ5_n6884Tas_grm2 = new boolean[] {false} ;
      T01GQ5_A6885Tas_anccr = new short[1] ;
      T01GQ5_n6885Tas_anccr = new boolean[] {false} ;
      T01GQ5_A6886Tas_pml = new short[1] ;
      T01GQ5_n6886Tas_pml = new boolean[] {false} ;
      T01GQ5_A6887Tas_kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6887Tas_kgs = new boolean[] {false} ;
      T01GQ5_A6888Tas_mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6888Tas_mts = new boolean[] {false} ;
      T01GQ5_A6889Tas_facab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6889Tas_facab = new boolean[] {false} ;
      T01GQ5_A6890Tas_Vol = new int[1] ;
      T01GQ5_n6890Tas_Vol = new boolean[] {false} ;
      T01GQ5_A6891Tas_ColNom = new String[] {""} ;
      T01GQ5_n6891Tas_ColNom = new boolean[] {false} ;
      T01GQ5_A6892Tas_ColNum = new int[1] ;
      T01GQ5_n6892Tas_ColNum = new boolean[] {false} ;
      T01GQ5_A6893Tas_Tc = new byte[1] ;
      T01GQ5_n6893Tas_Tc = new boolean[] {false} ;
      T01GQ5_A6894Tas_coscol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6894Tas_coscol = new boolean[] {false} ;
      T01GQ5_A6895Tas_rpcod1 = new String[] {""} ;
      T01GQ5_n6895Tas_rpcod1 = new boolean[] {false} ;
      T01GQ5_A6896Tas_cosrp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6896Tas_cosrp1 = new boolean[] {false} ;
      T01GQ5_A6897Tas_rpdsc1 = new String[] {""} ;
      T01GQ5_n6897Tas_rpdsc1 = new boolean[] {false} ;
      T01GQ5_A6898Tas_rpcod2 = new String[] {""} ;
      T01GQ5_n6898Tas_rpcod2 = new boolean[] {false} ;
      T01GQ5_A6899Tas_rpdsc2 = new String[] {""} ;
      T01GQ5_n6899Tas_rpdsc2 = new boolean[] {false} ;
      T01GQ5_A6900Tas_cosrp2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6900Tas_cosrp2 = new boolean[] {false} ;
      T01GQ5_A6901Tas_rpcod3 = new String[] {""} ;
      T01GQ5_n6901Tas_rpcod3 = new boolean[] {false} ;
      T01GQ5_A6902Tas_rpdsc3 = new String[] {""} ;
      T01GQ5_n6902Tas_rpdsc3 = new boolean[] {false} ;
      T01GQ5_A6903Tas_cosrp3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6903Tas_cosrp3 = new boolean[] {false} ;
      T01GQ5_A6904Tas_racod1 = new String[] {""} ;
      T01GQ5_n6904Tas_racod1 = new boolean[] {false} ;
      T01GQ5_A6905Tas_radsc1 = new String[] {""} ;
      T01GQ5_n6905Tas_radsc1 = new boolean[] {false} ;
      T01GQ5_A6906Tas_cosra1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6906Tas_cosra1 = new boolean[] {false} ;
      T01GQ5_A6907Tas_racod2 = new String[] {""} ;
      T01GQ5_n6907Tas_racod2 = new boolean[] {false} ;
      T01GQ5_A6908Tas_radsc2 = new String[] {""} ;
      T01GQ5_n6908Tas_radsc2 = new boolean[] {false} ;
      T01GQ5_A6909Tas_cosra2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6909Tas_cosra2 = new boolean[] {false} ;
      T01GQ5_A6910Tas_racod3 = new String[] {""} ;
      T01GQ5_n6910Tas_racod3 = new boolean[] {false} ;
      T01GQ5_A6911Tas_radsc3 = new String[] {""} ;
      T01GQ5_n6911Tas_radsc3 = new boolean[] {false} ;
      T01GQ5_A6912Tas_cosra3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6912Tas_cosra3 = new boolean[] {false} ;
      T01GQ5_A6913Tas_cost1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6913Tas_cost1 = new boolean[] {false} ;
      T01GQ5_A6914Tas_cost2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6914Tas_cost2 = new boolean[] {false} ;
      T01GQ5_A6915Tas_ultlin = new short[1] ;
      T01GQ5_n6915Tas_ultlin = new boolean[] {false} ;
      T01GQ5_A6916Tas_Procod = new String[] {""} ;
      T01GQ5_n6916Tas_Procod = new boolean[] {false} ;
      T01GQ5_A6917Tas_Prodsc = new String[] {""} ;
      T01GQ5_n6917Tas_Prodsc = new boolean[] {false} ;
      T01GQ5_A6918Tas_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n6918Tas_Porc = new boolean[] {false} ;
      T01GQ5_A6919Tas_fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GQ5_n6919Tas_fecha = new boolean[] {false} ;
      T01GQ5_A6920Tas_usuari = new String[] {""} ;
      T01GQ5_n6920Tas_usuari = new boolean[] {false} ;
      T01GQ5_A6921Tas_termin = new String[] {""} ;
      T01GQ5_n6921Tas_termin = new boolean[] {false} ;
      T01GQ5_A7006Tas_precio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ5_n7006Tas_precio = new boolean[] {false} ;
      T01GQ5_A396EmprCod = new String[] {""} ;
      T01GQ5_A252CliCod = new int[1] ;
      T01GQ5_n252CliCod = new boolean[] {false} ;
      T01GQ18_A407EmprNom = new String[] {""} ;
      T01GQ18_n407EmprNom = new boolean[] {false} ;
      T01GQ19_A279CliNom = new String[] {""} ;
      T01GQ20_A396EmprCod = new String[] {""} ;
      T01GQ20_A6882Tas_num = new int[1] ;
      Z460FasDsc = "" ;
      T01GQ21_A6882Tas_num = new int[1] ;
      T01GQ21_A6922Tas_lin = new short[1] ;
      T01GQ21_A460FasDsc = new String[] {""} ;
      T01GQ21_A6923Tas_vel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ21_n6923Tas_vel = new boolean[] {false} ;
      T01GQ21_A6924Tas_maqc = new String[] {""} ;
      T01GQ21_n6924Tas_maqc = new boolean[] {false} ;
      T01GQ21_A6925Tas_maqd = new String[] {""} ;
      T01GQ21_n6925Tas_maqd = new boolean[] {false} ;
      T01GQ21_A6926Tas_costm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ21_n6926Tas_costm = new boolean[] {false} ;
      T01GQ21_A6927Tas_costmt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ21_n6927Tas_costmt = new boolean[] {false} ;
      T01GQ21_A6928Tas_costt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ21_n6928Tas_costt1 = new boolean[] {false} ;
      T01GQ21_A396EmprCod = new String[] {""} ;
      T01GQ21_A457FasCod = new String[] {""} ;
      T01GQ21_n457FasCod = new boolean[] {false} ;
      T01GQ4_A460FasDsc = new String[] {""} ;
      T01GQ22_A460FasDsc = new String[] {""} ;
      T01GQ23_A396EmprCod = new String[] {""} ;
      T01GQ23_A6882Tas_num = new int[1] ;
      T01GQ23_A6922Tas_lin = new short[1] ;
      T01GQ3_A6882Tas_num = new int[1] ;
      T01GQ3_A6922Tas_lin = new short[1] ;
      T01GQ3_A6923Tas_vel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ3_n6923Tas_vel = new boolean[] {false} ;
      T01GQ3_A6924Tas_maqc = new String[] {""} ;
      T01GQ3_n6924Tas_maqc = new boolean[] {false} ;
      T01GQ3_A6925Tas_maqd = new String[] {""} ;
      T01GQ3_n6925Tas_maqd = new boolean[] {false} ;
      T01GQ3_A6926Tas_costm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ3_n6926Tas_costm = new boolean[] {false} ;
      T01GQ3_A6927Tas_costmt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ3_n6927Tas_costmt = new boolean[] {false} ;
      T01GQ3_A6928Tas_costt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ3_n6928Tas_costt1 = new boolean[] {false} ;
      T01GQ3_A396EmprCod = new String[] {""} ;
      T01GQ3_A457FasCod = new String[] {""} ;
      T01GQ3_n457FasCod = new boolean[] {false} ;
      T01GQ2_A6882Tas_num = new int[1] ;
      T01GQ2_A6922Tas_lin = new short[1] ;
      T01GQ2_A6923Tas_vel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ2_n6923Tas_vel = new boolean[] {false} ;
      T01GQ2_A6924Tas_maqc = new String[] {""} ;
      T01GQ2_n6924Tas_maqc = new boolean[] {false} ;
      T01GQ2_A6925Tas_maqd = new String[] {""} ;
      T01GQ2_n6925Tas_maqd = new boolean[] {false} ;
      T01GQ2_A6926Tas_costm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ2_n6926Tas_costm = new boolean[] {false} ;
      T01GQ2_A6927Tas_costmt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ2_n6927Tas_costmt = new boolean[] {false} ;
      T01GQ2_A6928Tas_costt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GQ2_n6928Tas_costt1 = new boolean[] {false} ;
      T01GQ2_A396EmprCod = new String[] {""} ;
      T01GQ2_A457FasCod = new String[] {""} ;
      T01GQ2_n457FasCod = new boolean[] {false} ;
      T01GQ27_A460FasDsc = new String[] {""} ;
      T01GQ28_A396EmprCod = new String[] {""} ;
      T01GQ28_A6882Tas_num = new int[1] ;
      T01GQ28_A6922Tas_lin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ6883Tas_Artcod = "" ;
      ZZ6887Tas_kgs = DecimalUtil.ZERO ;
      ZZ6888Tas_mts = DecimalUtil.ZERO ;
      ZZ6889Tas_facab = DecimalUtil.ZERO ;
      ZZ6891Tas_ColNom = "" ;
      ZZ6894Tas_coscol = DecimalUtil.ZERO ;
      ZZ6895Tas_rpcod1 = "" ;
      ZZ6896Tas_cosrp1 = DecimalUtil.ZERO ;
      ZZ6897Tas_rpdsc1 = "" ;
      ZZ6898Tas_rpcod2 = "" ;
      ZZ6899Tas_rpdsc2 = "" ;
      ZZ6900Tas_cosrp2 = DecimalUtil.ZERO ;
      ZZ6901Tas_rpcod3 = "" ;
      ZZ6902Tas_rpdsc3 = "" ;
      ZZ6903Tas_cosrp3 = DecimalUtil.ZERO ;
      ZZ6904Tas_racod1 = "" ;
      ZZ6905Tas_radsc1 = "" ;
      ZZ6906Tas_cosra1 = DecimalUtil.ZERO ;
      ZZ6907Tas_racod2 = "" ;
      ZZ6908Tas_radsc2 = "" ;
      ZZ6909Tas_cosra2 = DecimalUtil.ZERO ;
      ZZ6910Tas_racod3 = "" ;
      ZZ6911Tas_radsc3 = "" ;
      ZZ6912Tas_cosra3 = DecimalUtil.ZERO ;
      ZZ6913Tas_cost1 = DecimalUtil.ZERO ;
      ZZ6914Tas_cost2 = DecimalUtil.ZERO ;
      ZZ6916Tas_Procod = "" ;
      ZZ6917Tas_Prodsc = "" ;
      ZZ6918Tas_Porc = DecimalUtil.ZERO ;
      ZZ6919Tas_fecha = GXutil.resetTime( GXutil.nullDate() );
      ZZ6920Tas_usuari = "" ;
      ZZ6921Tas_termin = "" ;
      ZZ7006Tas_precio = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcostas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcostas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcostas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcostas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcostas__default(),
         new Object[] {
             new Object[] {
            T01GQ2_A6882Tas_num, T01GQ2_A6922Tas_lin, T01GQ2_A6923Tas_vel, T01GQ2_n6923Tas_vel, T01GQ2_A6924Tas_maqc, T01GQ2_n6924Tas_maqc, T01GQ2_A6925Tas_maqd, T01GQ2_n6925Tas_maqd, T01GQ2_A6926Tas_costm, T01GQ2_n6926Tas_costm,
            T01GQ2_A6927Tas_costmt, T01GQ2_n6927Tas_costmt, T01GQ2_A6928Tas_costt1, T01GQ2_n6928Tas_costt1, T01GQ2_A396EmprCod, T01GQ2_A457FasCod, T01GQ2_n457FasCod
            }
            , new Object[] {
            T01GQ3_A6882Tas_num, T01GQ3_A6922Tas_lin, T01GQ3_A6923Tas_vel, T01GQ3_n6923Tas_vel, T01GQ3_A6924Tas_maqc, T01GQ3_n6924Tas_maqc, T01GQ3_A6925Tas_maqd, T01GQ3_n6925Tas_maqd, T01GQ3_A6926Tas_costm, T01GQ3_n6926Tas_costm,
            T01GQ3_A6927Tas_costmt, T01GQ3_n6927Tas_costmt, T01GQ3_A6928Tas_costt1, T01GQ3_n6928Tas_costt1, T01GQ3_A396EmprCod, T01GQ3_A457FasCod, T01GQ3_n457FasCod
            }
            , new Object[] {
            T01GQ4_A460FasDsc
            }
            , new Object[] {
            T01GQ5_A6882Tas_num, T01GQ5_A6883Tas_Artcod, T01GQ5_n6883Tas_Artcod, T01GQ5_A6884Tas_grm2, T01GQ5_n6884Tas_grm2, T01GQ5_A6885Tas_anccr, T01GQ5_n6885Tas_anccr, T01GQ5_A6886Tas_pml, T01GQ5_n6886Tas_pml, T01GQ5_A6887Tas_kgs,
            T01GQ5_n6887Tas_kgs, T01GQ5_A6888Tas_mts, T01GQ5_n6888Tas_mts, T01GQ5_A6889Tas_facab, T01GQ5_n6889Tas_facab, T01GQ5_A6890Tas_Vol, T01GQ5_n6890Tas_Vol, T01GQ5_A6891Tas_ColNom, T01GQ5_n6891Tas_ColNom, T01GQ5_A6892Tas_ColNum,
            T01GQ5_n6892Tas_ColNum, T01GQ5_A6893Tas_Tc, T01GQ5_n6893Tas_Tc, T01GQ5_A6894Tas_coscol, T01GQ5_n6894Tas_coscol, T01GQ5_A6895Tas_rpcod1, T01GQ5_n6895Tas_rpcod1, T01GQ5_A6896Tas_cosrp1, T01GQ5_n6896Tas_cosrp1, T01GQ5_A6897Tas_rpdsc1,
            T01GQ5_n6897Tas_rpdsc1, T01GQ5_A6898Tas_rpcod2, T01GQ5_n6898Tas_rpcod2, T01GQ5_A6899Tas_rpdsc2, T01GQ5_n6899Tas_rpdsc2, T01GQ5_A6900Tas_cosrp2, T01GQ5_n6900Tas_cosrp2, T01GQ5_A6901Tas_rpcod3, T01GQ5_n6901Tas_rpcod3, T01GQ5_A6902Tas_rpdsc3,
            T01GQ5_n6902Tas_rpdsc3, T01GQ5_A6903Tas_cosrp3, T01GQ5_n6903Tas_cosrp3, T01GQ5_A6904Tas_racod1, T01GQ5_n6904Tas_racod1, T01GQ5_A6905Tas_radsc1, T01GQ5_n6905Tas_radsc1, T01GQ5_A6906Tas_cosra1, T01GQ5_n6906Tas_cosra1, T01GQ5_A6907Tas_racod2,
            T01GQ5_n6907Tas_racod2, T01GQ5_A6908Tas_radsc2, T01GQ5_n6908Tas_radsc2, T01GQ5_A6909Tas_cosra2, T01GQ5_n6909Tas_cosra2, T01GQ5_A6910Tas_racod3, T01GQ5_n6910Tas_racod3, T01GQ5_A6911Tas_radsc3, T01GQ5_n6911Tas_radsc3, T01GQ5_A6912Tas_cosra3,
            T01GQ5_n6912Tas_cosra3, T01GQ5_A6913Tas_cost1, T01GQ5_n6913Tas_cost1, T01GQ5_A6914Tas_cost2, T01GQ5_n6914Tas_cost2, T01GQ5_A6915Tas_ultlin, T01GQ5_n6915Tas_ultlin, T01GQ5_A6916Tas_Procod, T01GQ5_n6916Tas_Procod, T01GQ5_A6917Tas_Prodsc,
            T01GQ5_n6917Tas_Prodsc, T01GQ5_A6918Tas_Porc, T01GQ5_n6918Tas_Porc, T01GQ5_A6919Tas_fecha, T01GQ5_n6919Tas_fecha, T01GQ5_A6920Tas_usuari, T01GQ5_n6920Tas_usuari, T01GQ5_A6921Tas_termin, T01GQ5_n6921Tas_termin, T01GQ5_A7006Tas_precio,
            T01GQ5_n7006Tas_precio, T01GQ5_A396EmprCod, T01GQ5_A252CliCod, T01GQ5_n252CliCod
            }
            , new Object[] {
            T01GQ6_A6882Tas_num, T01GQ6_A6883Tas_Artcod, T01GQ6_n6883Tas_Artcod, T01GQ6_A6884Tas_grm2, T01GQ6_n6884Tas_grm2, T01GQ6_A6885Tas_anccr, T01GQ6_n6885Tas_anccr, T01GQ6_A6886Tas_pml, T01GQ6_n6886Tas_pml, T01GQ6_A6887Tas_kgs,
            T01GQ6_n6887Tas_kgs, T01GQ6_A6888Tas_mts, T01GQ6_n6888Tas_mts, T01GQ6_A6889Tas_facab, T01GQ6_n6889Tas_facab, T01GQ6_A6890Tas_Vol, T01GQ6_n6890Tas_Vol, T01GQ6_A6891Tas_ColNom, T01GQ6_n6891Tas_ColNom, T01GQ6_A6892Tas_ColNum,
            T01GQ6_n6892Tas_ColNum, T01GQ6_A6893Tas_Tc, T01GQ6_n6893Tas_Tc, T01GQ6_A6894Tas_coscol, T01GQ6_n6894Tas_coscol, T01GQ6_A6895Tas_rpcod1, T01GQ6_n6895Tas_rpcod1, T01GQ6_A6896Tas_cosrp1, T01GQ6_n6896Tas_cosrp1, T01GQ6_A6897Tas_rpdsc1,
            T01GQ6_n6897Tas_rpdsc1, T01GQ6_A6898Tas_rpcod2, T01GQ6_n6898Tas_rpcod2, T01GQ6_A6899Tas_rpdsc2, T01GQ6_n6899Tas_rpdsc2, T01GQ6_A6900Tas_cosrp2, T01GQ6_n6900Tas_cosrp2, T01GQ6_A6901Tas_rpcod3, T01GQ6_n6901Tas_rpcod3, T01GQ6_A6902Tas_rpdsc3,
            T01GQ6_n6902Tas_rpdsc3, T01GQ6_A6903Tas_cosrp3, T01GQ6_n6903Tas_cosrp3, T01GQ6_A6904Tas_racod1, T01GQ6_n6904Tas_racod1, T01GQ6_A6905Tas_radsc1, T01GQ6_n6905Tas_radsc1, T01GQ6_A6906Tas_cosra1, T01GQ6_n6906Tas_cosra1, T01GQ6_A6907Tas_racod2,
            T01GQ6_n6907Tas_racod2, T01GQ6_A6908Tas_radsc2, T01GQ6_n6908Tas_radsc2, T01GQ6_A6909Tas_cosra2, T01GQ6_n6909Tas_cosra2, T01GQ6_A6910Tas_racod3, T01GQ6_n6910Tas_racod3, T01GQ6_A6911Tas_radsc3, T01GQ6_n6911Tas_radsc3, T01GQ6_A6912Tas_cosra3,
            T01GQ6_n6912Tas_cosra3, T01GQ6_A6913Tas_cost1, T01GQ6_n6913Tas_cost1, T01GQ6_A6914Tas_cost2, T01GQ6_n6914Tas_cost2, T01GQ6_A6915Tas_ultlin, T01GQ6_n6915Tas_ultlin, T01GQ6_A6916Tas_Procod, T01GQ6_n6916Tas_Procod, T01GQ6_A6917Tas_Prodsc,
            T01GQ6_n6917Tas_Prodsc, T01GQ6_A6918Tas_Porc, T01GQ6_n6918Tas_Porc, T01GQ6_A6919Tas_fecha, T01GQ6_n6919Tas_fecha, T01GQ6_A6920Tas_usuari, T01GQ6_n6920Tas_usuari, T01GQ6_A6921Tas_termin, T01GQ6_n6921Tas_termin, T01GQ6_A7006Tas_precio,
            T01GQ6_n7006Tas_precio, T01GQ6_A396EmprCod, T01GQ6_A252CliCod, T01GQ6_n252CliCod
            }
            , new Object[] {
            T01GQ7_A407EmprNom, T01GQ7_n407EmprNom
            }
            , new Object[] {
            T01GQ8_A279CliNom
            }
            , new Object[] {
            T01GQ9_A6882Tas_num, T01GQ9_A407EmprNom, T01GQ9_n407EmprNom, T01GQ9_A279CliNom, T01GQ9_A6883Tas_Artcod, T01GQ9_n6883Tas_Artcod, T01GQ9_A6884Tas_grm2, T01GQ9_n6884Tas_grm2, T01GQ9_A6885Tas_anccr, T01GQ9_n6885Tas_anccr,
            T01GQ9_A6886Tas_pml, T01GQ9_n6886Tas_pml, T01GQ9_A6887Tas_kgs, T01GQ9_n6887Tas_kgs, T01GQ9_A6888Tas_mts, T01GQ9_n6888Tas_mts, T01GQ9_A6889Tas_facab, T01GQ9_n6889Tas_facab, T01GQ9_A6890Tas_Vol, T01GQ9_n6890Tas_Vol,
            T01GQ9_A6891Tas_ColNom, T01GQ9_n6891Tas_ColNom, T01GQ9_A6892Tas_ColNum, T01GQ9_n6892Tas_ColNum, T01GQ9_A6893Tas_Tc, T01GQ9_n6893Tas_Tc, T01GQ9_A6894Tas_coscol, T01GQ9_n6894Tas_coscol, T01GQ9_A6895Tas_rpcod1, T01GQ9_n6895Tas_rpcod1,
            T01GQ9_A6896Tas_cosrp1, T01GQ9_n6896Tas_cosrp1, T01GQ9_A6897Tas_rpdsc1, T01GQ9_n6897Tas_rpdsc1, T01GQ9_A6898Tas_rpcod2, T01GQ9_n6898Tas_rpcod2, T01GQ9_A6899Tas_rpdsc2, T01GQ9_n6899Tas_rpdsc2, T01GQ9_A6900Tas_cosrp2, T01GQ9_n6900Tas_cosrp2,
            T01GQ9_A6901Tas_rpcod3, T01GQ9_n6901Tas_rpcod3, T01GQ9_A6902Tas_rpdsc3, T01GQ9_n6902Tas_rpdsc3, T01GQ9_A6903Tas_cosrp3, T01GQ9_n6903Tas_cosrp3, T01GQ9_A6904Tas_racod1, T01GQ9_n6904Tas_racod1, T01GQ9_A6905Tas_radsc1, T01GQ9_n6905Tas_radsc1,
            T01GQ9_A6906Tas_cosra1, T01GQ9_n6906Tas_cosra1, T01GQ9_A6907Tas_racod2, T01GQ9_n6907Tas_racod2, T01GQ9_A6908Tas_radsc2, T01GQ9_n6908Tas_radsc2, T01GQ9_A6909Tas_cosra2, T01GQ9_n6909Tas_cosra2, T01GQ9_A6910Tas_racod3, T01GQ9_n6910Tas_racod3,
            T01GQ9_A6911Tas_radsc3, T01GQ9_n6911Tas_radsc3, T01GQ9_A6912Tas_cosra3, T01GQ9_n6912Tas_cosra3, T01GQ9_A6913Tas_cost1, T01GQ9_n6913Tas_cost1, T01GQ9_A6914Tas_cost2, T01GQ9_n6914Tas_cost2, T01GQ9_A6915Tas_ultlin, T01GQ9_n6915Tas_ultlin,
            T01GQ9_A6916Tas_Procod, T01GQ9_n6916Tas_Procod, T01GQ9_A6917Tas_Prodsc, T01GQ9_n6917Tas_Prodsc, T01GQ9_A6918Tas_Porc, T01GQ9_n6918Tas_Porc, T01GQ9_A6919Tas_fecha, T01GQ9_n6919Tas_fecha, T01GQ9_A6920Tas_usuari, T01GQ9_n6920Tas_usuari,
            T01GQ9_A6921Tas_termin, T01GQ9_n6921Tas_termin, T01GQ9_A7006Tas_precio, T01GQ9_n7006Tas_precio, T01GQ9_A396EmprCod, T01GQ9_A252CliCod, T01GQ9_n252CliCod
            }
            , new Object[] {
            T01GQ10_A407EmprNom, T01GQ10_n407EmprNom
            }
            , new Object[] {
            T01GQ11_A279CliNom
            }
            , new Object[] {
            T01GQ12_A396EmprCod, T01GQ12_A6882Tas_num
            }
            , new Object[] {
            T01GQ13_A396EmprCod, T01GQ13_A6882Tas_num
            }
            , new Object[] {
            T01GQ14_A396EmprCod, T01GQ14_A6882Tas_num
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GQ18_A407EmprNom, T01GQ18_n407EmprNom
            }
            , new Object[] {
            T01GQ19_A279CliNom
            }
            , new Object[] {
            T01GQ20_A396EmprCod, T01GQ20_A6882Tas_num
            }
            , new Object[] {
            T01GQ21_A6882Tas_num, T01GQ21_A6922Tas_lin, T01GQ21_A460FasDsc, T01GQ21_A6923Tas_vel, T01GQ21_n6923Tas_vel, T01GQ21_A6924Tas_maqc, T01GQ21_n6924Tas_maqc, T01GQ21_A6925Tas_maqd, T01GQ21_n6925Tas_maqd, T01GQ21_A6926Tas_costm,
            T01GQ21_n6926Tas_costm, T01GQ21_A6927Tas_costmt, T01GQ21_n6927Tas_costmt, T01GQ21_A6928Tas_costt1, T01GQ21_n6928Tas_costt1, T01GQ21_A396EmprCod, T01GQ21_A457FasCod, T01GQ21_n457FasCod
            }
            , new Object[] {
            T01GQ22_A460FasDsc
            }
            , new Object[] {
            T01GQ23_A396EmprCod, T01GQ23_A6882Tas_num, T01GQ23_A6922Tas_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GQ27_A460FasDsc
            }
            , new Object[] {
            T01GQ28_A396EmprCod, T01GQ28_A6882Tas_num, T01GQ28_A6922Tas_lin
            }
         }
      );
   }

   private byte Z6893Tas_Tc ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6893Tas_Tc ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ6893Tas_Tc ;
   private short Z6884Tas_grm2 ;
   private short Z6885Tas_anccr ;
   private short Z6886Tas_pml ;
   private short Z6915Tas_ultlin ;
   private short Z6922Tas_lin ;
   private short nRcdDeleted_1622 ;
   private short nRcdExists_1622 ;
   private short nIsMod_1622 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6884Tas_grm2 ;
   private short A6885Tas_anccr ;
   private short A6886Tas_pml ;
   private short A6915Tas_ultlin ;
   private short nBlankRcdCount1622 ;
   private short RcdFound1622 ;
   private short nBlankRcdUsr1622 ;
   private short A6922Tas_lin ;
   private short RcdFound1620 ;
   private short nIsDirty_1620 ;
   private short nIsDirty_1622 ;
   private short ZZ6884Tas_grm2 ;
   private short ZZ6885Tas_anccr ;
   private short ZZ6886Tas_pml ;
   private short ZZ6915Tas_ultlin ;
   private int Z6882Tas_num ;
   private int Z6890Tas_Vol ;
   private int Z6892Tas_ColNum ;
   private int Z252CliCod ;
   private int nRC_GXsfl_245 ;
   private int nGXsfl_245_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A6882Tas_num ;
   private int edtTas_num_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTas_Artcod_Enabled ;
   private int edtTas_grm2_Enabled ;
   private int edtTas_anccr_Enabled ;
   private int edtTas_pml_Enabled ;
   private int edtTas_kgs_Enabled ;
   private int edtTas_mts_Enabled ;
   private int edtTas_facab_Enabled ;
   private int A6890Tas_Vol ;
   private int edtTas_Vol_Enabled ;
   private int edtTas_ColNom_Enabled ;
   private int A6892Tas_ColNum ;
   private int edtTas_ColNum_Enabled ;
   private int edtTas_Tc_Enabled ;
   private int edtTas_coscol_Enabled ;
   private int edtTas_rpcod1_Enabled ;
   private int edtTas_cosrp1_Enabled ;
   private int edtTas_rpdsc1_Enabled ;
   private int edtTas_rpcod2_Enabled ;
   private int edtTas_rpdsc2_Enabled ;
   private int edtTas_cosrp2_Enabled ;
   private int edtTas_rpcod3_Enabled ;
   private int edtTas_rpdsc3_Enabled ;
   private int edtTas_cosrp3_Enabled ;
   private int edtTas_racod1_Enabled ;
   private int edtTas_radsc1_Enabled ;
   private int edtTas_cosra1_Enabled ;
   private int edtTas_racod2_Enabled ;
   private int edtTas_radsc2_Enabled ;
   private int edtTas_cosra2_Enabled ;
   private int edtTas_racod3_Enabled ;
   private int edtTas_radsc3_Enabled ;
   private int edtTas_cosra3_Enabled ;
   private int edtTas_cost1_Enabled ;
   private int edtTas_cost2_Enabled ;
   private int edtTas_ultlin_Enabled ;
   private int edtTas_Procod_Enabled ;
   private int edtTas_Prodsc_Enabled ;
   private int edtTas_Porc_Enabled ;
   private int edtTas_fecha_Enabled ;
   private int edtTas_usuari_Enabled ;
   private int edtTas_termin_Enabled ;
   private int edtTas_precio_Enabled ;
   private int edtavnRcdDeleted_1622_Enabled ;
   private int edtTas_lin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtTas_vel_Enabled ;
   private int edtTas_maqc_Enabled ;
   private int edtTas_maqd_Enabled ;
   private int edtTas_costm_Enabled ;
   private int edtTas_costmt_Enabled ;
   private int edtTas_costt1_Enabled ;
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
   private int defedtTas_lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTas_precio_Backcolor ;
   private int edtTas_termin_Backcolor ;
   private int edtTas_usuari_Backcolor ;
   private int edtTas_fecha_Backcolor ;
   private int edtTas_Porc_Backcolor ;
   private int edtTas_Prodsc_Backcolor ;
   private int edtTas_Procod_Backcolor ;
   private int edtTas_ultlin_Backcolor ;
   private int edtTas_cost2_Backcolor ;
   private int edtTas_cost1_Backcolor ;
   private int edtTas_cosra3_Backcolor ;
   private int edtTas_radsc3_Backcolor ;
   private int edtTas_racod3_Backcolor ;
   private int edtTas_cosra2_Backcolor ;
   private int edtTas_radsc2_Backcolor ;
   private int edtTas_racod2_Backcolor ;
   private int edtTas_cosra1_Backcolor ;
   private int edtTas_radsc1_Backcolor ;
   private int edtTas_racod1_Backcolor ;
   private int edtTas_cosrp3_Backcolor ;
   private int edtTas_rpdsc3_Backcolor ;
   private int edtTas_rpcod3_Backcolor ;
   private int edtTas_cosrp2_Backcolor ;
   private int edtTas_rpdsc2_Backcolor ;
   private int edtTas_rpcod2_Backcolor ;
   private int edtTas_rpdsc1_Backcolor ;
   private int edtTas_cosrp1_Backcolor ;
   private int edtTas_rpcod1_Backcolor ;
   private int edtTas_coscol_Backcolor ;
   private int edtTas_Tc_Backcolor ;
   private int edtTas_ColNum_Backcolor ;
   private int edtTas_ColNom_Backcolor ;
   private int edtTas_Vol_Backcolor ;
   private int edtTas_facab_Backcolor ;
   private int edtTas_mts_Backcolor ;
   private int edtTas_kgs_Backcolor ;
   private int edtTas_pml_Backcolor ;
   private int edtTas_anccr_Backcolor ;
   private int edtTas_grm2_Backcolor ;
   private int edtTas_Artcod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtTas_num_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ6882Tas_num ;
   private int ZZ252CliCod ;
   private int ZZ6890Tas_Vol ;
   private int ZZ6892Tas_ColNum ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6887Tas_kgs ;
   private java.math.BigDecimal Z6888Tas_mts ;
   private java.math.BigDecimal Z6889Tas_facab ;
   private java.math.BigDecimal Z6894Tas_coscol ;
   private java.math.BigDecimal Z6896Tas_cosrp1 ;
   private java.math.BigDecimal Z6900Tas_cosrp2 ;
   private java.math.BigDecimal Z6903Tas_cosrp3 ;
   private java.math.BigDecimal Z6906Tas_cosra1 ;
   private java.math.BigDecimal Z6909Tas_cosra2 ;
   private java.math.BigDecimal Z6912Tas_cosra3 ;
   private java.math.BigDecimal Z6913Tas_cost1 ;
   private java.math.BigDecimal Z6914Tas_cost2 ;
   private java.math.BigDecimal Z6918Tas_Porc ;
   private java.math.BigDecimal Z7006Tas_precio ;
   private java.math.BigDecimal Z6923Tas_vel ;
   private java.math.BigDecimal Z6926Tas_costm ;
   private java.math.BigDecimal Z6927Tas_costmt ;
   private java.math.BigDecimal Z6928Tas_costt1 ;
   private java.math.BigDecimal A6887Tas_kgs ;
   private java.math.BigDecimal A6888Tas_mts ;
   private java.math.BigDecimal A6889Tas_facab ;
   private java.math.BigDecimal A6894Tas_coscol ;
   private java.math.BigDecimal A6896Tas_cosrp1 ;
   private java.math.BigDecimal A6900Tas_cosrp2 ;
   private java.math.BigDecimal A6903Tas_cosrp3 ;
   private java.math.BigDecimal A6906Tas_cosra1 ;
   private java.math.BigDecimal A6909Tas_cosra2 ;
   private java.math.BigDecimal A6912Tas_cosra3 ;
   private java.math.BigDecimal A6913Tas_cost1 ;
   private java.math.BigDecimal A6914Tas_cost2 ;
   private java.math.BigDecimal A6918Tas_Porc ;
   private java.math.BigDecimal A7006Tas_precio ;
   private java.math.BigDecimal A6923Tas_vel ;
   private java.math.BigDecimal A6926Tas_costm ;
   private java.math.BigDecimal A6927Tas_costmt ;
   private java.math.BigDecimal A6928Tas_costt1 ;
   private java.math.BigDecimal ZZ6887Tas_kgs ;
   private java.math.BigDecimal ZZ6888Tas_mts ;
   private java.math.BigDecimal ZZ6889Tas_facab ;
   private java.math.BigDecimal ZZ6894Tas_coscol ;
   private java.math.BigDecimal ZZ6896Tas_cosrp1 ;
   private java.math.BigDecimal ZZ6900Tas_cosrp2 ;
   private java.math.BigDecimal ZZ6903Tas_cosrp3 ;
   private java.math.BigDecimal ZZ6906Tas_cosra1 ;
   private java.math.BigDecimal ZZ6909Tas_cosra2 ;
   private java.math.BigDecimal ZZ6912Tas_cosra3 ;
   private java.math.BigDecimal ZZ6913Tas_cost1 ;
   private java.math.BigDecimal ZZ6914Tas_cost2 ;
   private java.math.BigDecimal ZZ6918Tas_Porc ;
   private java.math.BigDecimal ZZ7006Tas_precio ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z6883Tas_Artcod ;
   private String Z6891Tas_ColNom ;
   private String Z6895Tas_rpcod1 ;
   private String Z6897Tas_rpdsc1 ;
   private String Z6898Tas_rpcod2 ;
   private String Z6899Tas_rpdsc2 ;
   private String Z6901Tas_rpcod3 ;
   private String Z6902Tas_rpdsc3 ;
   private String Z6904Tas_racod1 ;
   private String Z6905Tas_radsc1 ;
   private String Z6907Tas_racod2 ;
   private String Z6908Tas_radsc2 ;
   private String Z6910Tas_racod3 ;
   private String Z6911Tas_radsc3 ;
   private String Z6916Tas_Procod ;
   private String Z6917Tas_Prodsc ;
   private String Z6920Tas_usuari ;
   private String Z6921Tas_termin ;
   private String Z6924Tas_maqc ;
   private String Z6925Tas_maqd ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_245_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTas_num_Internalname ;
   private String edtTas_num_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTas_Artcod_Internalname ;
   private String A6883Tas_Artcod ;
   private String edtTas_Artcod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTas_grm2_Internalname ;
   private String edtTas_grm2_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTas_anccr_Internalname ;
   private String edtTas_anccr_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTas_pml_Internalname ;
   private String edtTas_pml_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTas_kgs_Internalname ;
   private String edtTas_kgs_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtTas_mts_Internalname ;
   private String edtTas_mts_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTas_facab_Internalname ;
   private String edtTas_facab_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTas_Vol_Internalname ;
   private String edtTas_Vol_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtTas_ColNom_Internalname ;
   private String A6891Tas_ColNom ;
   private String edtTas_ColNom_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtTas_ColNum_Internalname ;
   private String edtTas_ColNum_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtTas_Tc_Internalname ;
   private String edtTas_Tc_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtTas_coscol_Internalname ;
   private String edtTas_coscol_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtTas_rpcod1_Internalname ;
   private String A6895Tas_rpcod1 ;
   private String edtTas_rpcod1_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtTas_cosrp1_Internalname ;
   private String edtTas_cosrp1_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtTas_rpdsc1_Internalname ;
   private String A6897Tas_rpdsc1 ;
   private String edtTas_rpdsc1_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtTas_rpcod2_Internalname ;
   private String A6898Tas_rpcod2 ;
   private String edtTas_rpcod2_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtTas_rpdsc2_Internalname ;
   private String A6899Tas_rpdsc2 ;
   private String edtTas_rpdsc2_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtTas_cosrp2_Internalname ;
   private String edtTas_cosrp2_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtTas_rpcod3_Internalname ;
   private String A6901Tas_rpcod3 ;
   private String edtTas_rpcod3_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtTas_rpdsc3_Internalname ;
   private String A6902Tas_rpdsc3 ;
   private String edtTas_rpdsc3_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtTas_cosrp3_Internalname ;
   private String edtTas_cosrp3_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtTas_racod1_Internalname ;
   private String A6904Tas_racod1 ;
   private String edtTas_racod1_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtTas_radsc1_Internalname ;
   private String A6905Tas_radsc1 ;
   private String edtTas_radsc1_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtTas_cosra1_Internalname ;
   private String edtTas_cosra1_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtTas_racod2_Internalname ;
   private String A6907Tas_racod2 ;
   private String edtTas_racod2_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtTas_radsc2_Internalname ;
   private String A6908Tas_radsc2 ;
   private String edtTas_radsc2_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtTas_cosra2_Internalname ;
   private String edtTas_cosra2_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtTas_racod3_Internalname ;
   private String A6910Tas_racod3 ;
   private String edtTas_racod3_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtTas_radsc3_Internalname ;
   private String A6911Tas_radsc3 ;
   private String edtTas_radsc3_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtTas_cosra3_Internalname ;
   private String edtTas_cosra3_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtTas_cost1_Internalname ;
   private String edtTas_cost1_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtTas_cost2_Internalname ;
   private String edtTas_cost2_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtTas_ultlin_Internalname ;
   private String edtTas_ultlin_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtTas_Procod_Internalname ;
   private String A6916Tas_Procod ;
   private String edtTas_Procod_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtTas_Prodsc_Internalname ;
   private String A6917Tas_Prodsc ;
   private String edtTas_Prodsc_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtTas_Porc_Internalname ;
   private String edtTas_Porc_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtTas_fecha_Internalname ;
   private String edtTas_fecha_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtTas_usuari_Internalname ;
   private String A6920Tas_usuari ;
   private String edtTas_usuari_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtTas_termin_Internalname ;
   private String A6921Tas_termin ;
   private String edtTas_termin_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtTas_precio_Internalname ;
   private String edtTas_precio_Jsonclick ;
   private String sMode1622 ;
   private String edtavnRcdDeleted_1622_Internalname ;
   private String edtTas_lin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtTas_vel_Internalname ;
   private String edtTas_maqc_Internalname ;
   private String edtTas_maqd_Internalname ;
   private String edtTas_costm_Internalname ;
   private String edtTas_costmt_Internalname ;
   private String edtTas_costt1_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1620 ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String A6924Tas_maqc ;
   private String A6925Tas_maqd ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z460FasDsc ;
   private String sGXsfl_245_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1622_Jsonclick ;
   private String edtTas_lin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtTas_vel_Jsonclick ;
   private String edtTas_maqc_Jsonclick ;
   private String edtTas_maqd_Jsonclick ;
   private String edtTas_costm_Jsonclick ;
   private String edtTas_costmt_Jsonclick ;
   private String edtTas_costt1_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ6883Tas_Artcod ;
   private String ZZ6891Tas_ColNom ;
   private String ZZ6895Tas_rpcod1 ;
   private String ZZ6897Tas_rpdsc1 ;
   private String ZZ6898Tas_rpcod2 ;
   private String ZZ6899Tas_rpdsc2 ;
   private String ZZ6901Tas_rpcod3 ;
   private String ZZ6902Tas_rpdsc3 ;
   private String ZZ6904Tas_racod1 ;
   private String ZZ6905Tas_radsc1 ;
   private String ZZ6907Tas_racod2 ;
   private String ZZ6908Tas_radsc2 ;
   private String ZZ6910Tas_racod3 ;
   private String ZZ6911Tas_radsc3 ;
   private String ZZ6916Tas_Procod ;
   private String ZZ6917Tas_Prodsc ;
   private String ZZ6920Tas_usuari ;
   private String ZZ6921Tas_termin ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private java.util.Date Z6919Tas_fecha ;
   private java.util.Date A6919Tas_fecha ;
   private java.util.Date ZZ6919Tas_fecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n457FasCod ;
   private boolean wbErr ;
   private boolean bGXsfl_245_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n6883Tas_Artcod ;
   private boolean n6884Tas_grm2 ;
   private boolean n6885Tas_anccr ;
   private boolean n6886Tas_pml ;
   private boolean n6887Tas_kgs ;
   private boolean n6888Tas_mts ;
   private boolean n6889Tas_facab ;
   private boolean n6890Tas_Vol ;
   private boolean n6891Tas_ColNom ;
   private boolean n6892Tas_ColNum ;
   private boolean n6893Tas_Tc ;
   private boolean n6894Tas_coscol ;
   private boolean n6895Tas_rpcod1 ;
   private boolean n6896Tas_cosrp1 ;
   private boolean n6897Tas_rpdsc1 ;
   private boolean n6898Tas_rpcod2 ;
   private boolean n6899Tas_rpdsc2 ;
   private boolean n6900Tas_cosrp2 ;
   private boolean n6901Tas_rpcod3 ;
   private boolean n6902Tas_rpdsc3 ;
   private boolean n6903Tas_cosrp3 ;
   private boolean n6904Tas_racod1 ;
   private boolean n6905Tas_radsc1 ;
   private boolean n6906Tas_cosra1 ;
   private boolean n6907Tas_racod2 ;
   private boolean n6908Tas_radsc2 ;
   private boolean n6909Tas_cosra2 ;
   private boolean n6910Tas_racod3 ;
   private boolean n6911Tas_radsc3 ;
   private boolean n6912Tas_cosra3 ;
   private boolean n6913Tas_cost1 ;
   private boolean n6914Tas_cost2 ;
   private boolean n6915Tas_ultlin ;
   private boolean n6916Tas_Procod ;
   private boolean n6917Tas_Prodsc ;
   private boolean n6918Tas_Porc ;
   private boolean n6919Tas_fecha ;
   private boolean n6920Tas_usuari ;
   private boolean n6921Tas_termin ;
   private boolean n7006Tas_precio ;
   private boolean Gx_longc ;
   private boolean n6923Tas_vel ;
   private boolean n6924Tas_maqc ;
   private boolean n6925Tas_maqd ;
   private boolean n6926Tas_costm ;
   private boolean n6927Tas_costmt ;
   private boolean n6928Tas_costt1 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T01GQ9_A6882Tas_num ;
   private String[] T01GQ9_A407EmprNom ;
   private boolean[] T01GQ9_n407EmprNom ;
   private String[] T01GQ9_A279CliNom ;
   private String[] T01GQ9_A6883Tas_Artcod ;
   private boolean[] T01GQ9_n6883Tas_Artcod ;
   private short[] T01GQ9_A6884Tas_grm2 ;
   private boolean[] T01GQ9_n6884Tas_grm2 ;
   private short[] T01GQ9_A6885Tas_anccr ;
   private boolean[] T01GQ9_n6885Tas_anccr ;
   private short[] T01GQ9_A6886Tas_pml ;
   private boolean[] T01GQ9_n6886Tas_pml ;
   private java.math.BigDecimal[] T01GQ9_A6887Tas_kgs ;
   private boolean[] T01GQ9_n6887Tas_kgs ;
   private java.math.BigDecimal[] T01GQ9_A6888Tas_mts ;
   private boolean[] T01GQ9_n6888Tas_mts ;
   private java.math.BigDecimal[] T01GQ9_A6889Tas_facab ;
   private boolean[] T01GQ9_n6889Tas_facab ;
   private int[] T01GQ9_A6890Tas_Vol ;
   private boolean[] T01GQ9_n6890Tas_Vol ;
   private String[] T01GQ9_A6891Tas_ColNom ;
   private boolean[] T01GQ9_n6891Tas_ColNom ;
   private int[] T01GQ9_A6892Tas_ColNum ;
   private boolean[] T01GQ9_n6892Tas_ColNum ;
   private byte[] T01GQ9_A6893Tas_Tc ;
   private boolean[] T01GQ9_n6893Tas_Tc ;
   private java.math.BigDecimal[] T01GQ9_A6894Tas_coscol ;
   private boolean[] T01GQ9_n6894Tas_coscol ;
   private String[] T01GQ9_A6895Tas_rpcod1 ;
   private boolean[] T01GQ9_n6895Tas_rpcod1 ;
   private java.math.BigDecimal[] T01GQ9_A6896Tas_cosrp1 ;
   private boolean[] T01GQ9_n6896Tas_cosrp1 ;
   private String[] T01GQ9_A6897Tas_rpdsc1 ;
   private boolean[] T01GQ9_n6897Tas_rpdsc1 ;
   private String[] T01GQ9_A6898Tas_rpcod2 ;
   private boolean[] T01GQ9_n6898Tas_rpcod2 ;
   private String[] T01GQ9_A6899Tas_rpdsc2 ;
   private boolean[] T01GQ9_n6899Tas_rpdsc2 ;
   private java.math.BigDecimal[] T01GQ9_A6900Tas_cosrp2 ;
   private boolean[] T01GQ9_n6900Tas_cosrp2 ;
   private String[] T01GQ9_A6901Tas_rpcod3 ;
   private boolean[] T01GQ9_n6901Tas_rpcod3 ;
   private String[] T01GQ9_A6902Tas_rpdsc3 ;
   private boolean[] T01GQ9_n6902Tas_rpdsc3 ;
   private java.math.BigDecimal[] T01GQ9_A6903Tas_cosrp3 ;
   private boolean[] T01GQ9_n6903Tas_cosrp3 ;
   private String[] T01GQ9_A6904Tas_racod1 ;
   private boolean[] T01GQ9_n6904Tas_racod1 ;
   private String[] T01GQ9_A6905Tas_radsc1 ;
   private boolean[] T01GQ9_n6905Tas_radsc1 ;
   private java.math.BigDecimal[] T01GQ9_A6906Tas_cosra1 ;
   private boolean[] T01GQ9_n6906Tas_cosra1 ;
   private String[] T01GQ9_A6907Tas_racod2 ;
   private boolean[] T01GQ9_n6907Tas_racod2 ;
   private String[] T01GQ9_A6908Tas_radsc2 ;
   private boolean[] T01GQ9_n6908Tas_radsc2 ;
   private java.math.BigDecimal[] T01GQ9_A6909Tas_cosra2 ;
   private boolean[] T01GQ9_n6909Tas_cosra2 ;
   private String[] T01GQ9_A6910Tas_racod3 ;
   private boolean[] T01GQ9_n6910Tas_racod3 ;
   private String[] T01GQ9_A6911Tas_radsc3 ;
   private boolean[] T01GQ9_n6911Tas_radsc3 ;
   private java.math.BigDecimal[] T01GQ9_A6912Tas_cosra3 ;
   private boolean[] T01GQ9_n6912Tas_cosra3 ;
   private java.math.BigDecimal[] T01GQ9_A6913Tas_cost1 ;
   private boolean[] T01GQ9_n6913Tas_cost1 ;
   private java.math.BigDecimal[] T01GQ9_A6914Tas_cost2 ;
   private boolean[] T01GQ9_n6914Tas_cost2 ;
   private short[] T01GQ9_A6915Tas_ultlin ;
   private boolean[] T01GQ9_n6915Tas_ultlin ;
   private String[] T01GQ9_A6916Tas_Procod ;
   private boolean[] T01GQ9_n6916Tas_Procod ;
   private String[] T01GQ9_A6917Tas_Prodsc ;
   private boolean[] T01GQ9_n6917Tas_Prodsc ;
   private java.math.BigDecimal[] T01GQ9_A6918Tas_Porc ;
   private boolean[] T01GQ9_n6918Tas_Porc ;
   private java.util.Date[] T01GQ9_A6919Tas_fecha ;
   private boolean[] T01GQ9_n6919Tas_fecha ;
   private String[] T01GQ9_A6920Tas_usuari ;
   private boolean[] T01GQ9_n6920Tas_usuari ;
   private String[] T01GQ9_A6921Tas_termin ;
   private boolean[] T01GQ9_n6921Tas_termin ;
   private java.math.BigDecimal[] T01GQ9_A7006Tas_precio ;
   private boolean[] T01GQ9_n7006Tas_precio ;
   private String[] T01GQ9_A396EmprCod ;
   private int[] T01GQ9_A252CliCod ;
   private boolean[] T01GQ9_n252CliCod ;
   private String[] T01GQ7_A407EmprNom ;
   private boolean[] T01GQ7_n407EmprNom ;
   private String[] T01GQ8_A279CliNom ;
   private String[] T01GQ10_A407EmprNom ;
   private boolean[] T01GQ10_n407EmprNom ;
   private String[] T01GQ11_A279CliNom ;
   private String[] T01GQ12_A396EmprCod ;
   private int[] T01GQ12_A6882Tas_num ;
   private int[] T01GQ6_A6882Tas_num ;
   private String[] T01GQ6_A6883Tas_Artcod ;
   private boolean[] T01GQ6_n6883Tas_Artcod ;
   private short[] T01GQ6_A6884Tas_grm2 ;
   private boolean[] T01GQ6_n6884Tas_grm2 ;
   private short[] T01GQ6_A6885Tas_anccr ;
   private boolean[] T01GQ6_n6885Tas_anccr ;
   private short[] T01GQ6_A6886Tas_pml ;
   private boolean[] T01GQ6_n6886Tas_pml ;
   private java.math.BigDecimal[] T01GQ6_A6887Tas_kgs ;
   private boolean[] T01GQ6_n6887Tas_kgs ;
   private java.math.BigDecimal[] T01GQ6_A6888Tas_mts ;
   private boolean[] T01GQ6_n6888Tas_mts ;
   private java.math.BigDecimal[] T01GQ6_A6889Tas_facab ;
   private boolean[] T01GQ6_n6889Tas_facab ;
   private int[] T01GQ6_A6890Tas_Vol ;
   private boolean[] T01GQ6_n6890Tas_Vol ;
   private String[] T01GQ6_A6891Tas_ColNom ;
   private boolean[] T01GQ6_n6891Tas_ColNom ;
   private int[] T01GQ6_A6892Tas_ColNum ;
   private boolean[] T01GQ6_n6892Tas_ColNum ;
   private byte[] T01GQ6_A6893Tas_Tc ;
   private boolean[] T01GQ6_n6893Tas_Tc ;
   private java.math.BigDecimal[] T01GQ6_A6894Tas_coscol ;
   private boolean[] T01GQ6_n6894Tas_coscol ;
   private String[] T01GQ6_A6895Tas_rpcod1 ;
   private boolean[] T01GQ6_n6895Tas_rpcod1 ;
   private java.math.BigDecimal[] T01GQ6_A6896Tas_cosrp1 ;
   private boolean[] T01GQ6_n6896Tas_cosrp1 ;
   private String[] T01GQ6_A6897Tas_rpdsc1 ;
   private boolean[] T01GQ6_n6897Tas_rpdsc1 ;
   private String[] T01GQ6_A6898Tas_rpcod2 ;
   private boolean[] T01GQ6_n6898Tas_rpcod2 ;
   private String[] T01GQ6_A6899Tas_rpdsc2 ;
   private boolean[] T01GQ6_n6899Tas_rpdsc2 ;
   private java.math.BigDecimal[] T01GQ6_A6900Tas_cosrp2 ;
   private boolean[] T01GQ6_n6900Tas_cosrp2 ;
   private String[] T01GQ6_A6901Tas_rpcod3 ;
   private boolean[] T01GQ6_n6901Tas_rpcod3 ;
   private String[] T01GQ6_A6902Tas_rpdsc3 ;
   private boolean[] T01GQ6_n6902Tas_rpdsc3 ;
   private java.math.BigDecimal[] T01GQ6_A6903Tas_cosrp3 ;
   private boolean[] T01GQ6_n6903Tas_cosrp3 ;
   private String[] T01GQ6_A6904Tas_racod1 ;
   private boolean[] T01GQ6_n6904Tas_racod1 ;
   private String[] T01GQ6_A6905Tas_radsc1 ;
   private boolean[] T01GQ6_n6905Tas_radsc1 ;
   private java.math.BigDecimal[] T01GQ6_A6906Tas_cosra1 ;
   private boolean[] T01GQ6_n6906Tas_cosra1 ;
   private String[] T01GQ6_A6907Tas_racod2 ;
   private boolean[] T01GQ6_n6907Tas_racod2 ;
   private String[] T01GQ6_A6908Tas_radsc2 ;
   private boolean[] T01GQ6_n6908Tas_radsc2 ;
   private java.math.BigDecimal[] T01GQ6_A6909Tas_cosra2 ;
   private boolean[] T01GQ6_n6909Tas_cosra2 ;
   private String[] T01GQ6_A6910Tas_racod3 ;
   private boolean[] T01GQ6_n6910Tas_racod3 ;
   private String[] T01GQ6_A6911Tas_radsc3 ;
   private boolean[] T01GQ6_n6911Tas_radsc3 ;
   private java.math.BigDecimal[] T01GQ6_A6912Tas_cosra3 ;
   private boolean[] T01GQ6_n6912Tas_cosra3 ;
   private java.math.BigDecimal[] T01GQ6_A6913Tas_cost1 ;
   private boolean[] T01GQ6_n6913Tas_cost1 ;
   private java.math.BigDecimal[] T01GQ6_A6914Tas_cost2 ;
   private boolean[] T01GQ6_n6914Tas_cost2 ;
   private short[] T01GQ6_A6915Tas_ultlin ;
   private boolean[] T01GQ6_n6915Tas_ultlin ;
   private String[] T01GQ6_A6916Tas_Procod ;
   private boolean[] T01GQ6_n6916Tas_Procod ;
   private String[] T01GQ6_A6917Tas_Prodsc ;
   private boolean[] T01GQ6_n6917Tas_Prodsc ;
   private java.math.BigDecimal[] T01GQ6_A6918Tas_Porc ;
   private boolean[] T01GQ6_n6918Tas_Porc ;
   private java.util.Date[] T01GQ6_A6919Tas_fecha ;
   private boolean[] T01GQ6_n6919Tas_fecha ;
   private String[] T01GQ6_A6920Tas_usuari ;
   private boolean[] T01GQ6_n6920Tas_usuari ;
   private String[] T01GQ6_A6921Tas_termin ;
   private boolean[] T01GQ6_n6921Tas_termin ;
   private java.math.BigDecimal[] T01GQ6_A7006Tas_precio ;
   private boolean[] T01GQ6_n7006Tas_precio ;
   private String[] T01GQ6_A396EmprCod ;
   private int[] T01GQ6_A252CliCod ;
   private boolean[] T01GQ6_n252CliCod ;
   private String[] T01GQ13_A396EmprCod ;
   private int[] T01GQ13_A6882Tas_num ;
   private String[] T01GQ14_A396EmprCod ;
   private int[] T01GQ14_A6882Tas_num ;
   private int[] T01GQ5_A6882Tas_num ;
   private String[] T01GQ5_A6883Tas_Artcod ;
   private boolean[] T01GQ5_n6883Tas_Artcod ;
   private short[] T01GQ5_A6884Tas_grm2 ;
   private boolean[] T01GQ5_n6884Tas_grm2 ;
   private short[] T01GQ5_A6885Tas_anccr ;
   private boolean[] T01GQ5_n6885Tas_anccr ;
   private short[] T01GQ5_A6886Tas_pml ;
   private boolean[] T01GQ5_n6886Tas_pml ;
   private java.math.BigDecimal[] T01GQ5_A6887Tas_kgs ;
   private boolean[] T01GQ5_n6887Tas_kgs ;
   private java.math.BigDecimal[] T01GQ5_A6888Tas_mts ;
   private boolean[] T01GQ5_n6888Tas_mts ;
   private java.math.BigDecimal[] T01GQ5_A6889Tas_facab ;
   private boolean[] T01GQ5_n6889Tas_facab ;
   private int[] T01GQ5_A6890Tas_Vol ;
   private boolean[] T01GQ5_n6890Tas_Vol ;
   private String[] T01GQ5_A6891Tas_ColNom ;
   private boolean[] T01GQ5_n6891Tas_ColNom ;
   private int[] T01GQ5_A6892Tas_ColNum ;
   private boolean[] T01GQ5_n6892Tas_ColNum ;
   private byte[] T01GQ5_A6893Tas_Tc ;
   private boolean[] T01GQ5_n6893Tas_Tc ;
   private java.math.BigDecimal[] T01GQ5_A6894Tas_coscol ;
   private boolean[] T01GQ5_n6894Tas_coscol ;
   private String[] T01GQ5_A6895Tas_rpcod1 ;
   private boolean[] T01GQ5_n6895Tas_rpcod1 ;
   private java.math.BigDecimal[] T01GQ5_A6896Tas_cosrp1 ;
   private boolean[] T01GQ5_n6896Tas_cosrp1 ;
   private String[] T01GQ5_A6897Tas_rpdsc1 ;
   private boolean[] T01GQ5_n6897Tas_rpdsc1 ;
   private String[] T01GQ5_A6898Tas_rpcod2 ;
   private boolean[] T01GQ5_n6898Tas_rpcod2 ;
   private String[] T01GQ5_A6899Tas_rpdsc2 ;
   private boolean[] T01GQ5_n6899Tas_rpdsc2 ;
   private java.math.BigDecimal[] T01GQ5_A6900Tas_cosrp2 ;
   private boolean[] T01GQ5_n6900Tas_cosrp2 ;
   private String[] T01GQ5_A6901Tas_rpcod3 ;
   private boolean[] T01GQ5_n6901Tas_rpcod3 ;
   private String[] T01GQ5_A6902Tas_rpdsc3 ;
   private boolean[] T01GQ5_n6902Tas_rpdsc3 ;
   private java.math.BigDecimal[] T01GQ5_A6903Tas_cosrp3 ;
   private boolean[] T01GQ5_n6903Tas_cosrp3 ;
   private String[] T01GQ5_A6904Tas_racod1 ;
   private boolean[] T01GQ5_n6904Tas_racod1 ;
   private String[] T01GQ5_A6905Tas_radsc1 ;
   private boolean[] T01GQ5_n6905Tas_radsc1 ;
   private java.math.BigDecimal[] T01GQ5_A6906Tas_cosra1 ;
   private boolean[] T01GQ5_n6906Tas_cosra1 ;
   private String[] T01GQ5_A6907Tas_racod2 ;
   private boolean[] T01GQ5_n6907Tas_racod2 ;
   private String[] T01GQ5_A6908Tas_radsc2 ;
   private boolean[] T01GQ5_n6908Tas_radsc2 ;
   private java.math.BigDecimal[] T01GQ5_A6909Tas_cosra2 ;
   private boolean[] T01GQ5_n6909Tas_cosra2 ;
   private String[] T01GQ5_A6910Tas_racod3 ;
   private boolean[] T01GQ5_n6910Tas_racod3 ;
   private String[] T01GQ5_A6911Tas_radsc3 ;
   private boolean[] T01GQ5_n6911Tas_radsc3 ;
   private java.math.BigDecimal[] T01GQ5_A6912Tas_cosra3 ;
   private boolean[] T01GQ5_n6912Tas_cosra3 ;
   private java.math.BigDecimal[] T01GQ5_A6913Tas_cost1 ;
   private boolean[] T01GQ5_n6913Tas_cost1 ;
   private java.math.BigDecimal[] T01GQ5_A6914Tas_cost2 ;
   private boolean[] T01GQ5_n6914Tas_cost2 ;
   private short[] T01GQ5_A6915Tas_ultlin ;
   private boolean[] T01GQ5_n6915Tas_ultlin ;
   private String[] T01GQ5_A6916Tas_Procod ;
   private boolean[] T01GQ5_n6916Tas_Procod ;
   private String[] T01GQ5_A6917Tas_Prodsc ;
   private boolean[] T01GQ5_n6917Tas_Prodsc ;
   private java.math.BigDecimal[] T01GQ5_A6918Tas_Porc ;
   private boolean[] T01GQ5_n6918Tas_Porc ;
   private java.util.Date[] T01GQ5_A6919Tas_fecha ;
   private boolean[] T01GQ5_n6919Tas_fecha ;
   private String[] T01GQ5_A6920Tas_usuari ;
   private boolean[] T01GQ5_n6920Tas_usuari ;
   private String[] T01GQ5_A6921Tas_termin ;
   private boolean[] T01GQ5_n6921Tas_termin ;
   private java.math.BigDecimal[] T01GQ5_A7006Tas_precio ;
   private boolean[] T01GQ5_n7006Tas_precio ;
   private String[] T01GQ5_A396EmprCod ;
   private int[] T01GQ5_A252CliCod ;
   private boolean[] T01GQ5_n252CliCod ;
   private String[] T01GQ18_A407EmprNom ;
   private boolean[] T01GQ18_n407EmprNom ;
   private String[] T01GQ19_A279CliNom ;
   private String[] T01GQ20_A396EmprCod ;
   private int[] T01GQ20_A6882Tas_num ;
   private int[] T01GQ21_A6882Tas_num ;
   private short[] T01GQ21_A6922Tas_lin ;
   private String[] T01GQ21_A460FasDsc ;
   private java.math.BigDecimal[] T01GQ21_A6923Tas_vel ;
   private boolean[] T01GQ21_n6923Tas_vel ;
   private String[] T01GQ21_A6924Tas_maqc ;
   private boolean[] T01GQ21_n6924Tas_maqc ;
   private String[] T01GQ21_A6925Tas_maqd ;
   private boolean[] T01GQ21_n6925Tas_maqd ;
   private java.math.BigDecimal[] T01GQ21_A6926Tas_costm ;
   private boolean[] T01GQ21_n6926Tas_costm ;
   private java.math.BigDecimal[] T01GQ21_A6927Tas_costmt ;
   private boolean[] T01GQ21_n6927Tas_costmt ;
   private java.math.BigDecimal[] T01GQ21_A6928Tas_costt1 ;
   private boolean[] T01GQ21_n6928Tas_costt1 ;
   private String[] T01GQ21_A396EmprCod ;
   private String[] T01GQ21_A457FasCod ;
   private boolean[] T01GQ21_n457FasCod ;
   private String[] T01GQ4_A460FasDsc ;
   private String[] T01GQ22_A460FasDsc ;
   private String[] T01GQ23_A396EmprCod ;
   private int[] T01GQ23_A6882Tas_num ;
   private short[] T01GQ23_A6922Tas_lin ;
   private int[] T01GQ3_A6882Tas_num ;
   private short[] T01GQ3_A6922Tas_lin ;
   private java.math.BigDecimal[] T01GQ3_A6923Tas_vel ;
   private boolean[] T01GQ3_n6923Tas_vel ;
   private String[] T01GQ3_A6924Tas_maqc ;
   private boolean[] T01GQ3_n6924Tas_maqc ;
   private String[] T01GQ3_A6925Tas_maqd ;
   private boolean[] T01GQ3_n6925Tas_maqd ;
   private java.math.BigDecimal[] T01GQ3_A6926Tas_costm ;
   private boolean[] T01GQ3_n6926Tas_costm ;
   private java.math.BigDecimal[] T01GQ3_A6927Tas_costmt ;
   private boolean[] T01GQ3_n6927Tas_costmt ;
   private java.math.BigDecimal[] T01GQ3_A6928Tas_costt1 ;
   private boolean[] T01GQ3_n6928Tas_costt1 ;
   private String[] T01GQ3_A396EmprCod ;
   private String[] T01GQ3_A457FasCod ;
   private boolean[] T01GQ3_n457FasCod ;
   private int[] T01GQ2_A6882Tas_num ;
   private short[] T01GQ2_A6922Tas_lin ;
   private java.math.BigDecimal[] T01GQ2_A6923Tas_vel ;
   private boolean[] T01GQ2_n6923Tas_vel ;
   private String[] T01GQ2_A6924Tas_maqc ;
   private boolean[] T01GQ2_n6924Tas_maqc ;
   private String[] T01GQ2_A6925Tas_maqd ;
   private boolean[] T01GQ2_n6925Tas_maqd ;
   private java.math.BigDecimal[] T01GQ2_A6926Tas_costm ;
   private boolean[] T01GQ2_n6926Tas_costm ;
   private java.math.BigDecimal[] T01GQ2_A6927Tas_costmt ;
   private boolean[] T01GQ2_n6927Tas_costmt ;
   private java.math.BigDecimal[] T01GQ2_A6928Tas_costt1 ;
   private boolean[] T01GQ2_n6928Tas_costt1 ;
   private String[] T01GQ2_A396EmprCod ;
   private String[] T01GQ2_A457FasCod ;
   private boolean[] T01GQ2_n457FasCod ;
   private String[] T01GQ27_A460FasDsc ;
   private String[] T01GQ28_A396EmprCod ;
   private int[] T01GQ28_A6882Tas_num ;
   private short[] T01GQ28_A6922Tas_lin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcostas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GQ2", "SELECT Tas_num, Tas_lin, Tas_vel, Tas_maqc, Tas_maqd, Tas_costm, Tas_costmt, Tas_costt1, EmprCod, FasCod FROM TXPCOSTA1 WHERE EmprCod = ? AND Tas_num = ? AND Tas_lin = ?  FOR UPDATE OF Tas_vel, Tas_maqc, Tas_maqd, Tas_costm, Tas_costmt, Tas_costt1, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ3", "SELECT Tas_num, Tas_lin, Tas_vel, Tas_maqc, Tas_maqd, Tas_costm, Tas_costmt, Tas_costt1, EmprCod, FasCod FROM TXPCOSTA1 WHERE EmprCod = ? AND Tas_num = ? AND Tas_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ4", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ5", "SELECT Tas_num, Tas_Artcod, Tas_grm2, Tas_anccr, Tas_pml, Tas_kgs, Tas_mts, Tas_facab, Tas_Vol, Tas_ColNom, Tas_ColNum, Tas_Tc, Tas_coscol, Tas_rpcod1, Tas_cosrp1, Tas_rpdsc1, Tas_rpcod2, Tas_rpdsc2, Tas_cosrp2, Tas_rpcod3, Tas_rpdsc3, Tas_cosrp3, Tas_racod1, Tas_radsc1, Tas_cosra1, Tas_racod2, Tas_radsc2, Tas_cosra2, Tas_racod3, Tas_radsc3, Tas_cosra3, Tas_cost1, Tas_cost2, Tas_ultlin, Tas_Procod, Tas_Prodsc, Tas_Porc, Tas_fecha, Tas_usuari, Tas_termin, Tas_precio, EmprCod, CliCod FROM TXPCOSTAS WHERE EmprCod = ? AND Tas_num = ?  FOR UPDATE OF Tas_Artcod, Tas_grm2, Tas_anccr, Tas_pml, Tas_kgs, Tas_mts, Tas_facab, Tas_Vol, Tas_ColNom, Tas_ColNum, Tas_Tc, Tas_coscol, Tas_rpcod1, Tas_cosrp1, Tas_rpdsc1, Tas_rpcod2, Tas_rpdsc2, Tas_cosrp2, Tas_rpcod3, Tas_rpdsc3, Tas_cosrp3, Tas_racod1, Tas_radsc1, Tas_cosra1, Tas_racod2, Tas_radsc2, Tas_cosra2, Tas_racod3, Tas_radsc3, Tas_cosra3, Tas_cost1, Tas_cost2, Tas_ultlin, Tas_Procod, Tas_Prodsc, Tas_Porc, Tas_fecha, Tas_usuari, Tas_termin, Tas_precio, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ6", "SELECT Tas_num, Tas_Artcod, Tas_grm2, Tas_anccr, Tas_pml, Tas_kgs, Tas_mts, Tas_facab, Tas_Vol, Tas_ColNom, Tas_ColNum, Tas_Tc, Tas_coscol, Tas_rpcod1, Tas_cosrp1, Tas_rpdsc1, Tas_rpcod2, Tas_rpdsc2, Tas_cosrp2, Tas_rpcod3, Tas_rpdsc3, Tas_cosrp3, Tas_racod1, Tas_radsc1, Tas_cosra1, Tas_racod2, Tas_radsc2, Tas_cosra2, Tas_racod3, Tas_radsc3, Tas_cosra3, Tas_cost1, Tas_cost2, Tas_ultlin, Tas_Procod, Tas_Prodsc, Tas_Porc, Tas_fecha, Tas_usuari, Tas_termin, Tas_precio, EmprCod, CliCod FROM TXPCOSTAS WHERE EmprCod = ? AND Tas_num = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ9", "SELECT /*+ FIRST_ROWS(100) */ TM1.Tas_num, T2.EmprNom, T3.CliNom, TM1.Tas_Artcod, TM1.Tas_grm2, TM1.Tas_anccr, TM1.Tas_pml, TM1.Tas_kgs, TM1.Tas_mts, TM1.Tas_facab, TM1.Tas_Vol, TM1.Tas_ColNom, TM1.Tas_ColNum, TM1.Tas_Tc, TM1.Tas_coscol, TM1.Tas_rpcod1, TM1.Tas_cosrp1, TM1.Tas_rpdsc1, TM1.Tas_rpcod2, TM1.Tas_rpdsc2, TM1.Tas_cosrp2, TM1.Tas_rpcod3, TM1.Tas_rpdsc3, TM1.Tas_cosrp3, TM1.Tas_racod1, TM1.Tas_radsc1, TM1.Tas_cosra1, TM1.Tas_racod2, TM1.Tas_radsc2, TM1.Tas_cosra2, TM1.Tas_racod3, TM1.Tas_radsc3, TM1.Tas_cosra3, TM1.Tas_cost1, TM1.Tas_cost2, TM1.Tas_ultlin, TM1.Tas_Procod, TM1.Tas_Prodsc, TM1.Tas_Porc, TM1.Tas_fecha, TM1.Tas_usuari, TM1.Tas_termin, TM1.Tas_precio, TM1.EmprCod, TM1.CliCod FROM ((TXPCOSTAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.Tas_num = ? ORDER BY TM1.EmprCod, TM1.Tas_num ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Tas_num FROM TXPCOSTAS WHERE EmprCod = ? AND Tas_num = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Tas_num FROM TXPCOSTAS WHERE ( EmprCod > ? or EmprCod = ? and Tas_num > ?) ORDER BY EmprCod, Tas_num) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GQ14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Tas_num FROM TXPCOSTAS WHERE ( EmprCod < ? or EmprCod = ? and Tas_num < ?) ORDER BY EmprCod DESC, Tas_num DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GQ15", "INSERT INTO TXPCOSTAS(Tas_num, Tas_Artcod, Tas_grm2, Tas_anccr, Tas_pml, Tas_kgs, Tas_mts, Tas_facab, Tas_Vol, Tas_ColNom, Tas_ColNum, Tas_Tc, Tas_coscol, Tas_rpcod1, Tas_cosrp1, Tas_rpdsc1, Tas_rpcod2, Tas_rpdsc2, Tas_cosrp2, Tas_rpcod3, Tas_rpdsc3, Tas_cosrp3, Tas_racod1, Tas_radsc1, Tas_cosra1, Tas_racod2, Tas_radsc2, Tas_cosra2, Tas_racod3, Tas_radsc3, Tas_cosra3, Tas_cost1, Tas_cost2, Tas_ultlin, Tas_Procod, Tas_Prodsc, Tas_Porc, Tas_fecha, Tas_usuari, Tas_termin, Tas_precio, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCOSTAS")
         ,new UpdateCursor("T01GQ16", "UPDATE TXPCOSTAS SET Tas_Artcod=?, Tas_grm2=?, Tas_anccr=?, Tas_pml=?, Tas_kgs=?, Tas_mts=?, Tas_facab=?, Tas_Vol=?, Tas_ColNom=?, Tas_ColNum=?, Tas_Tc=?, Tas_coscol=?, Tas_rpcod1=?, Tas_cosrp1=?, Tas_rpdsc1=?, Tas_rpcod2=?, Tas_rpdsc2=?, Tas_cosrp2=?, Tas_rpcod3=?, Tas_rpdsc3=?, Tas_cosrp3=?, Tas_racod1=?, Tas_radsc1=?, Tas_cosra1=?, Tas_racod2=?, Tas_radsc2=?, Tas_cosra2=?, Tas_racod3=?, Tas_radsc3=?, Tas_cosra3=?, Tas_cost1=?, Tas_cost2=?, Tas_ultlin=?, Tas_Procod=?, Tas_Prodsc=?, Tas_Porc=?, Tas_fecha=?, Tas_usuari=?, Tas_termin=?, Tas_precio=?, CliCod=?  WHERE EmprCod = ? AND Tas_num = ?", GX_NOMASK, "TXPCOSTAS")
         ,new UpdateCursor("T01GQ17", "DELETE FROM TXPCOSTAS  WHERE EmprCod = ? AND Tas_num = ?", GX_NOMASK, "TXPCOSTAS")
         ,new ForEachCursor("T01GQ18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ19", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Tas_num FROM TXPCOSTAS ORDER BY EmprCod, Tas_num ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ21", "SELECT T1.Tas_num, T1.Tas_lin, T2.FasDsc, T1.Tas_vel, T1.Tas_maqc, T1.Tas_maqd, T1.Tas_costm, T1.Tas_costmt, T1.Tas_costt1, T1.EmprCod, T1.FasCod FROM (TXPCOSTA1 T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.Tas_num = ? and T1.Tas_lin = ? ORDER BY T1.EmprCod, T1.Tas_num, T1.Tas_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ22", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ23", "SELECT EmprCod, Tas_num, Tas_lin FROM TXPCOSTA1 WHERE EmprCod = ? AND Tas_num = ? AND Tas_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01GQ24", "INSERT INTO TXPCOSTA1(Tas_num, Tas_lin, Tas_vel, Tas_maqc, Tas_maqd, Tas_costm, Tas_costmt, Tas_costt1, EmprCod, FasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCOSTA1")
         ,new UpdateCursor("T01GQ25", "UPDATE TXPCOSTA1 SET Tas_vel=?, Tas_maqc=?, Tas_maqd=?, Tas_costm=?, Tas_costmt=?, Tas_costt1=?, FasCod=?  WHERE EmprCod = ? AND Tas_num = ? AND Tas_lin = ?", GX_NOMASK, "TXPCOSTA1")
         ,new UpdateCursor("T01GQ26", "DELETE FROM TXPCOSTA1  WHERE EmprCod = ? AND Tas_num = ? AND Tas_lin = ?", GX_NOMASK, "TXPCOSTA1")
         ,new ForEachCursor("T01GQ27", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GQ28", "SELECT EmprCod, Tas_num, Tas_lin FROM TXPCOSTA1 WHERE EmprCod = ? and Tas_num = ? ORDER BY EmprCod, Tas_num, Tas_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,5);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(25,5);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(28,5);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 6);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(31,5);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(32,3);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(33,3);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 8);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 40);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDateTime(38);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 8);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 10);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(41,5);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 3);
               ((int[]) buf[82])[0] = rslt.getInt(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,5);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(25,5);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(28,5);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 6);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(31,5);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(32,3);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(33,3);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 8);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 40);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDateTime(38);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 8);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 10);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(41,5);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 3);
               ((int[]) buf[82])[0] = rslt.getInt(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,5);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(24,5);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(27,5);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 6);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 20);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(30,5);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(33,5);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(34,3);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(35,3);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(37, 8);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(38, 40);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[76])[0] = rslt.getGXDateTime(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(41, 8);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(42, 10);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(43,5);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(44, 3);
               ((int[]) buf[85])[0] = rslt.getInt(45);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((String[]) buf[16])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 13);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 6);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 20);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 6);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 20);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 6);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 20);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 6);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 20);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 6);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 20);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[54], 5);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 6);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 20);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[60], 5);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[62], 3);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[64], 3);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[68], 8);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[70], 40);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(38, (java.util.Date)parms[74], false);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[76], 8);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[78], 10);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[80], 5);
               }
               stmt.setString(42, (String)parms[81], 3);
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[83]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 13);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
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
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 20);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 6);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 20);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 5);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 6);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 20);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 6);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 20);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 6);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 20);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[53], 5);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 6);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 20);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[59], 5);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[61], 3);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[63], 3);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 8);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 40);
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
                  stmt.setNull( 37 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(37, (java.util.Date)parms[73], false);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 8);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 10);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[79], 5);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(41, ((Number) parms[81]).intValue());
               }
               stmt.setString(42, (String)parms[82], 3);
               stmt.setInt(43, ((Number) parms[83]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[13], 3);
               }
               stmt.setString(9, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 8);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 8);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setShort(10, ((Number) parms[16]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

