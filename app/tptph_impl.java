package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tptph_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         n652OpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A652OpeCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LLamada con parametro", ""), (short)(0)) ;
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

   public tptph_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tptph_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tptph_impl.class ));
   }

   public tptph_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpTPH.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Test", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A10364Ph_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10364Ph_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10364Ph_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_numero_Jsonclick, 0, "", "", "", "", "", 1, edtPh_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPh_fec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_fec_Internalname, localUtil.format(A10365Ph_fec, "99/99/99"), localUtil.format( A10365Ph_fec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_fec_Jsonclick, 0, "", "", "", "", "", 1, edtPh_fec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPh_fec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPh_fec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TpTPH.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Disp Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_Disp_Internalname, GXutil.rtrim( A10366Ph_Disp), GXutil.rtrim( localUtil.format( A10366Ph_Disp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_Disp_Jsonclick, 0, "", "", "", "", "", 1, edtPh_Disp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_Ref_Internalname, GXutil.rtrim( A10367Ph_Ref), GXutil.rtrim( localUtil.format( A10367Ph_Ref, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_Ref_Jsonclick, 0, "", "", "", "", "", 1, edtPh_Ref_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_Art_Internalname, GXutil.rtrim( A10368Ph_Art), GXutil.rtrim( localUtil.format( A10368Ph_Art, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_Art_Jsonclick, 0, "", "", "", "", "", 1, edtPh_Art_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_Mat_Internalname, GXutil.rtrim( A10369Ph_Mat), GXutil.rtrim( localUtil.format( A10369Ph_Mat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_Mat_Jsonclick, 0, "", "", "", "", "", 1, edtPh_Mat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_ColN_Internalname, GXutil.rtrim( A10370Ph_ColN), GXutil.rtrim( localUtil.format( A10370Ph_ColN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_ColN_Jsonclick, 0, "", "", "", "", "", 1, edtPh_ColN_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_ColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A10371Ph_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_ColNn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10371Ph_ColNn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10371Ph_ColNn), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_ColNn_Jsonclick, 0, "", "", "", "", "", 1, edtPh_ColNn_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_Tc_Internalname, GXutil.ltrim( localUtil.ntoc( A10372Ph_Tc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_Tc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10372Ph_Tc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10372Ph_Tc), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_Tc_Jsonclick, 0, "", "", "", "", "", 1, edtPh_Tc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_Maq_Internalname, GXutil.rtrim( A10373Ph_Maq), GXutil.rtrim( localUtil.format( A10373Ph_Maq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_Maq_Jsonclick, 0, "", "", "", "", "", 1, edtPh_Maq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_Cli_Internalname, GXutil.ltrim( localUtil.ntoc( A10374Ph_Cli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_Cli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10374Ph_Cli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10374Ph_Cli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_Cli_Jsonclick, 0, "", "", "", "", "", 1, edtPh_Cli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_Cln_Internalname, GXutil.rtrim( A10375Ph_Cln), GXutil.rtrim( localUtil.format( A10375Ph_Cln, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_Cln_Jsonclick, 0, "", "", "", "", "", 1, edtPh_Cln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Norma", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_norma_Internalname, GXutil.rtrim( A10376Ph_norma), GXutil.rtrim( localUtil.format( A10376Ph_norma, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_norma_Jsonclick, 0, "", "", "", "", "", 1, edtPh_norma_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "PH", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_ph_Internalname, GXutil.ltrim( localUtil.ntoc( A10377Ph_ph, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_ph_Enabled!=0) ? localUtil.format( A10377Ph_ph, "ZZ9.99") : localUtil.format( A10377Ph_ph, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_ph_Jsonclick, 0, "", "", "", "", "", 1, edtPh_ph_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPh_obs_Internalname, A10378Ph_obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", (short)(0), 1, edtPh_obs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "800", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Ph 2", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_ph2_Internalname, GXutil.ltrim( localUtil.ntoc( A10844Ph_ph2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_ph2_Enabled!=0) ? localUtil.format( A10844Ph_ph2, "ZZ9.99") : localUtil.format( A10844Ph_ph2, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_ph2_Jsonclick, 0, "", "", "", "", "", 1, edtPh_ph2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Ph 3", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_ph3_Internalname, GXutil.ltrim( localUtil.ntoc( A10845Ph_ph3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_ph3_Enabled!=0) ? localUtil.format( A10845Ph_ph3, "ZZ9.99") : localUtil.format( A10845Ph_ph3, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_ph3_Jsonclick, 0, "", "", "", "", "", 1, edtPh_ph3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Media Ph2+Ph3/2", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_mda_Internalname, GXutil.ltrim( localUtil.ntoc( A11763Ph_mda, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_mda_Enabled!=0) ? localUtil.format( A11763Ph_mda, "ZZ9.99") : localUtil.format( A11763Ph_mda, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_mda_Jsonclick, 0, "", "", "", "", "", 1, edtPh_mda_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Rq Minimno", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPhRqMn_Internalname, GXutil.rtrim( A11800PhRqMn), GXutil.rtrim( localUtil.format( A11800PhRqMn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPhRqMn_Jsonclick, 0, "", "", "", "", "", 1, edtPhRqMn_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Temp Minima", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPhTpMn_Internalname, GXutil.rtrim( A11801PhTpMn), GXutil.rtrim( localUtil.format( A11801PhTpMn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPhTpMn_Jsonclick, 0, "", "", "", "", "", 1, edtPhTpMn_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Evaulacion Ph 0 Fallo 1 Ok", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPhSt_Internalname, GXutil.ltrim( localUtil.ntoc( A11802PhSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPhSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11802PhSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11802PhSt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPhSt_Jsonclick, 0, "", "", "", "", "", 1, edtPhSt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Metodo", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPhMetodo_Internalname, GXutil.rtrim( A11918PhMetodo), GXutil.rtrim( localUtil.format( A11918PhMetodo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPhMetodo_Jsonclick, 0, "", "", "", "", "", 1, edtPhMetodo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Ph 4", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPh_ph4_Internalname, GXutil.ltrim( localUtil.ntoc( A11934Ph_ph4, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPh_ph4_Enabled!=0) ? localUtil.format( A11934Ph_ph4, "ZZ9.99") : localUtil.format( A11934Ph_ph4, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPh_ph4_Jsonclick, 0, "", "", "", "", "", 1, edtPh_ph4_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTPH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTPH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpTPH.htm");
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
         Z10364Ph_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z10364Ph_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10365Ph_fec = localUtil.ctod( httpContext.cgiGet( "Z10365Ph_fec"), 0) ;
         Z10366Ph_Disp = httpContext.cgiGet( "Z10366Ph_Disp") ;
         Z10367Ph_Ref = httpContext.cgiGet( "Z10367Ph_Ref") ;
         Z10368Ph_Art = httpContext.cgiGet( "Z10368Ph_Art") ;
         Z10369Ph_Mat = httpContext.cgiGet( "Z10369Ph_Mat") ;
         Z10370Ph_ColN = httpContext.cgiGet( "Z10370Ph_ColN") ;
         Z10371Ph_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( "Z10371Ph_ColNn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10372Ph_Tc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10372Ph_Tc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10373Ph_Maq = httpContext.cgiGet( "Z10373Ph_Maq") ;
         Z10374Ph_Cli = (int)(localUtil.ctol( httpContext.cgiGet( "Z10374Ph_Cli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10375Ph_Cln = httpContext.cgiGet( "Z10375Ph_Cln") ;
         Z10376Ph_norma = httpContext.cgiGet( "Z10376Ph_norma") ;
         Z10377Ph_ph = localUtil.ctond( httpContext.cgiGet( "Z10377Ph_ph")) ;
         Z10378Ph_obs = httpContext.cgiGet( "Z10378Ph_obs") ;
         Z10844Ph_ph2 = localUtil.ctond( httpContext.cgiGet( "Z10844Ph_ph2")) ;
         Z10845Ph_ph3 = localUtil.ctond( httpContext.cgiGet( "Z10845Ph_ph3")) ;
         Z11800PhRqMn = httpContext.cgiGet( "Z11800PhRqMn") ;
         Z11801PhTpMn = httpContext.cgiGet( "Z11801PhTpMn") ;
         Z11802PhSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11802PhSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11918PhMetodo = httpContext.cgiGet( "Z11918PhMetodo") ;
         Z11934Ph_ph4 = localUtil.ctond( httpContext.cgiGet( "Z11934Ph_ph4")) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
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
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPh_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPh_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PH_NUMERO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_numero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10364Ph_numero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
         }
         else
         {
            A10364Ph_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtPh_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPh_fec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PH_FEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_fec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10365Ph_fec = GXutil.nullDate() ;
            n10365Ph_fec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10365Ph_fec", localUtil.format(A10365Ph_fec, "99/99/99"));
         }
         else
         {
            A10365Ph_fec = localUtil.ctod( httpContext.cgiGet( edtPh_fec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n10365Ph_fec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10365Ph_fec", localUtil.format(A10365Ph_fec, "99/99/99"));
         }
         A10366Ph_Disp = httpContext.cgiGet( edtPh_Disp_Internalname) ;
         n10366Ph_Disp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10366Ph_Disp", A10366Ph_Disp);
         A10367Ph_Ref = httpContext.cgiGet( edtPh_Ref_Internalname) ;
         n10367Ph_Ref = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10367Ph_Ref", A10367Ph_Ref);
         A10368Ph_Art = httpContext.cgiGet( edtPh_Art_Internalname) ;
         n10368Ph_Art = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10368Ph_Art", A10368Ph_Art);
         A10369Ph_Mat = httpContext.cgiGet( edtPh_Mat_Internalname) ;
         n10369Ph_Mat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10369Ph_Mat", A10369Ph_Mat);
         A10370Ph_ColN = httpContext.cgiGet( edtPh_ColN_Internalname) ;
         n10370Ph_ColN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10370Ph_ColN", A10370Ph_ColN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPh_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPh_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PH_COLNN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_ColNn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10371Ph_ColNn = 0 ;
            n10371Ph_ColNn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10371Ph_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10371Ph_ColNn), 6, 0));
         }
         else
         {
            A10371Ph_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( edtPh_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10371Ph_ColNn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10371Ph_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10371Ph_ColNn), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPh_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPh_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PH_TC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_Tc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10372Ph_Tc = (byte)(0) ;
            n10372Ph_Tc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10372Ph_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10372Ph_Tc), 2, 0));
         }
         else
         {
            A10372Ph_Tc = (byte)(localUtil.ctol( httpContext.cgiGet( edtPh_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10372Ph_Tc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10372Ph_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10372Ph_Tc), 2, 0));
         }
         A10373Ph_Maq = httpContext.cgiGet( edtPh_Maq_Internalname) ;
         n10373Ph_Maq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10373Ph_Maq", A10373Ph_Maq);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPh_Cli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPh_Cli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PH_CLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_Cli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10374Ph_Cli = 0 ;
            n10374Ph_Cli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10374Ph_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10374Ph_Cli), 6, 0));
         }
         else
         {
            A10374Ph_Cli = (int)(localUtil.ctol( httpContext.cgiGet( edtPh_Cli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10374Ph_Cli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10374Ph_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10374Ph_Cli), 6, 0));
         }
         A10375Ph_Cln = httpContext.cgiGet( edtPh_Cln_Internalname) ;
         n10375Ph_Cln = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10375Ph_Cln", A10375Ph_Cln);
         A10376Ph_norma = httpContext.cgiGet( edtPh_norma_Internalname) ;
         n10376Ph_norma = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10376Ph_norma", A10376Ph_norma);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPh_ph_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPh_ph_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PH_PH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_ph_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10377Ph_ph = DecimalUtil.ZERO ;
            n10377Ph_ph = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10377Ph_ph", GXutil.ltrimstr( A10377Ph_ph, 6, 2));
         }
         else
         {
            A10377Ph_ph = localUtil.ctond( httpContext.cgiGet( edtPh_ph_Internalname)) ;
            n10377Ph_ph = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10377Ph_ph", GXutil.ltrimstr( A10377Ph_ph, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOpeCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A652OpeCod = 0 ;
            n652OpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         }
         else
         {
            A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n652OpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         }
         A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
         n653OpeNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A10378Ph_obs = httpContext.cgiGet( edtPh_obs_Internalname) ;
         n10378Ph_obs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10378Ph_obs", A10378Ph_obs);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPh_ph2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPh_ph2_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PH_PH2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_ph2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10844Ph_ph2 = DecimalUtil.ZERO ;
            n10844Ph_ph2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10844Ph_ph2", GXutil.ltrimstr( A10844Ph_ph2, 6, 2));
         }
         else
         {
            A10844Ph_ph2 = localUtil.ctond( httpContext.cgiGet( edtPh_ph2_Internalname)) ;
            n10844Ph_ph2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10844Ph_ph2", GXutil.ltrimstr( A10844Ph_ph2, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPh_ph3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPh_ph3_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PH_PH3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_ph3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10845Ph_ph3 = DecimalUtil.ZERO ;
            n10845Ph_ph3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10845Ph_ph3", GXutil.ltrimstr( A10845Ph_ph3, 6, 2));
         }
         else
         {
            A10845Ph_ph3 = localUtil.ctond( httpContext.cgiGet( edtPh_ph3_Internalname)) ;
            n10845Ph_ph3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10845Ph_ph3", GXutil.ltrimstr( A10845Ph_ph3, 6, 2));
         }
         A11763Ph_mda = localUtil.ctond( httpContext.cgiGet( edtPh_mda_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11763Ph_mda", GXutil.ltrimstr( A11763Ph_mda, 6, 2));
         A11800PhRqMn = httpContext.cgiGet( edtPhRqMn_Internalname) ;
         n11800PhRqMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11800PhRqMn", A11800PhRqMn);
         A11801PhTpMn = httpContext.cgiGet( edtPhTpMn_Internalname) ;
         n11801PhTpMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11801PhTpMn", A11801PhTpMn);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPhSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPhSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PHST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPhSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11802PhSt = (byte)(0) ;
            n11802PhSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11802PhSt", GXutil.str( A11802PhSt, 1, 0));
         }
         else
         {
            A11802PhSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtPhSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11802PhSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11802PhSt", GXutil.str( A11802PhSt, 1, 0));
         }
         A11918PhMetodo = httpContext.cgiGet( edtPhMetodo_Internalname) ;
         n11918PhMetodo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11918PhMetodo", A11918PhMetodo);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPh_ph4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPh_ph4_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PH_PH4");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPh_ph4_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11934Ph_ph4 = DecimalUtil.ZERO ;
            n11934Ph_ph4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11934Ph_ph4", GXutil.ltrimstr( A11934Ph_ph4, 6, 2));
         }
         else
         {
            A11934Ph_ph4 = localUtil.ctond( httpContext.cgiGet( edtPh_ph4_Internalname)) ;
            n11934Ph_ph4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11934Ph_ph4", GXutil.ltrimstr( A11934Ph_ph4, 6, 2));
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
            A10364Ph_numero = (int)(GXutil.lval( httpContext.GetPar( "Ph_numero"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
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
            initAll1IE1403( ) ;
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
      disableAttributes1IE1403( ) ;
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

   public void confirm_1IE0( )
   {
      beforeValidate1IE1403( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IE1403( ) ;
         }
         else
         {
            checkExtendedTable1IE1403( ) ;
            if ( AnyError == 0 )
            {
               zm1IE1403( 3) ;
               zm1IE1403( 4) ;
               zm1IE1403( 5) ;
            }
            closeExtendedTableCursors1IE1403( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1IE0( ) ;
      }
   }

   public void resetCaption1IE0( )
   {
   }

   public void zm1IE1403( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10365Ph_fec = T01IE3_A10365Ph_fec[0] ;
            Z10366Ph_Disp = T01IE3_A10366Ph_Disp[0] ;
            Z10367Ph_Ref = T01IE3_A10367Ph_Ref[0] ;
            Z10368Ph_Art = T01IE3_A10368Ph_Art[0] ;
            Z10369Ph_Mat = T01IE3_A10369Ph_Mat[0] ;
            Z10370Ph_ColN = T01IE3_A10370Ph_ColN[0] ;
            Z10371Ph_ColNn = T01IE3_A10371Ph_ColNn[0] ;
            Z10372Ph_Tc = T01IE3_A10372Ph_Tc[0] ;
            Z10373Ph_Maq = T01IE3_A10373Ph_Maq[0] ;
            Z10374Ph_Cli = T01IE3_A10374Ph_Cli[0] ;
            Z10375Ph_Cln = T01IE3_A10375Ph_Cln[0] ;
            Z10376Ph_norma = T01IE3_A10376Ph_norma[0] ;
            Z10377Ph_ph = T01IE3_A10377Ph_ph[0] ;
            Z10378Ph_obs = T01IE3_A10378Ph_obs[0] ;
            Z10844Ph_ph2 = T01IE3_A10844Ph_ph2[0] ;
            Z10845Ph_ph3 = T01IE3_A10845Ph_ph3[0] ;
            Z11800PhRqMn = T01IE3_A11800PhRqMn[0] ;
            Z11801PhTpMn = T01IE3_A11801PhTpMn[0] ;
            Z11802PhSt = T01IE3_A11802PhSt[0] ;
            Z11918PhMetodo = T01IE3_A11918PhMetodo[0] ;
            Z11934Ph_ph4 = T01IE3_A11934Ph_ph4[0] ;
            Z129BarCod = T01IE3_A129BarCod[0] ;
            Z132BarCodReo = T01IE3_A132BarCodReo[0] ;
            Z130BarCodPar = T01IE3_A130BarCodPar[0] ;
            Z652OpeCod = T01IE3_A652OpeCod[0] ;
         }
         else
         {
            Z10365Ph_fec = A10365Ph_fec ;
            Z10366Ph_Disp = A10366Ph_Disp ;
            Z10367Ph_Ref = A10367Ph_Ref ;
            Z10368Ph_Art = A10368Ph_Art ;
            Z10369Ph_Mat = A10369Ph_Mat ;
            Z10370Ph_ColN = A10370Ph_ColN ;
            Z10371Ph_ColNn = A10371Ph_ColNn ;
            Z10372Ph_Tc = A10372Ph_Tc ;
            Z10373Ph_Maq = A10373Ph_Maq ;
            Z10374Ph_Cli = A10374Ph_Cli ;
            Z10375Ph_Cln = A10375Ph_Cln ;
            Z10376Ph_norma = A10376Ph_norma ;
            Z10377Ph_ph = A10377Ph_ph ;
            Z10378Ph_obs = A10378Ph_obs ;
            Z10844Ph_ph2 = A10844Ph_ph2 ;
            Z10845Ph_ph3 = A10845Ph_ph3 ;
            Z11800PhRqMn = A11800PhRqMn ;
            Z11801PhTpMn = A11801PhTpMn ;
            Z11802PhSt = A11802PhSt ;
            Z11918PhMetodo = A11918PhMetodo ;
            Z11934Ph_ph4 = A11934Ph_ph4 ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z10364Ph_numero = A10364Ph_numero ;
         Z10365Ph_fec = A10365Ph_fec ;
         Z10366Ph_Disp = A10366Ph_Disp ;
         Z10367Ph_Ref = A10367Ph_Ref ;
         Z10368Ph_Art = A10368Ph_Art ;
         Z10369Ph_Mat = A10369Ph_Mat ;
         Z10370Ph_ColN = A10370Ph_ColN ;
         Z10371Ph_ColNn = A10371Ph_ColNn ;
         Z10372Ph_Tc = A10372Ph_Tc ;
         Z10373Ph_Maq = A10373Ph_Maq ;
         Z10374Ph_Cli = A10374Ph_Cli ;
         Z10375Ph_Cln = A10375Ph_Cln ;
         Z10376Ph_norma = A10376Ph_norma ;
         Z10377Ph_ph = A10377Ph_ph ;
         Z10378Ph_obs = A10378Ph_obs ;
         Z10844Ph_ph2 = A10844Ph_ph2 ;
         Z10845Ph_ph3 = A10845Ph_ph3 ;
         Z11800PhRqMn = A11800PhRqMn ;
         Z11801PhTpMn = A11801PhTpMn ;
         Z11802PhSt = A11802PhSt ;
         Z11918PhMetodo = A11918PhMetodo ;
         Z11934Ph_ph4 = A11934Ph_ph4 ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z652OpeCod = A652OpeCod ;
         Z407EmprNom = A407EmprNom ;
         Z653OpeNom = A653OpeNom ;
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

   public void load1IE1403( )
   {
      /* Using cursor T01IE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A10364Ph_numero)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1403 = (short)(1) ;
         A407EmprNom = T01IE7_A407EmprNom[0] ;
         n407EmprNom = T01IE7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10365Ph_fec = T01IE7_A10365Ph_fec[0] ;
         n10365Ph_fec = T01IE7_n10365Ph_fec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10365Ph_fec", localUtil.format(A10365Ph_fec, "99/99/99"));
         A10366Ph_Disp = T01IE7_A10366Ph_Disp[0] ;
         n10366Ph_Disp = T01IE7_n10366Ph_Disp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10366Ph_Disp", A10366Ph_Disp);
         A10367Ph_Ref = T01IE7_A10367Ph_Ref[0] ;
         n10367Ph_Ref = T01IE7_n10367Ph_Ref[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10367Ph_Ref", A10367Ph_Ref);
         A10368Ph_Art = T01IE7_A10368Ph_Art[0] ;
         n10368Ph_Art = T01IE7_n10368Ph_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10368Ph_Art", A10368Ph_Art);
         A10369Ph_Mat = T01IE7_A10369Ph_Mat[0] ;
         n10369Ph_Mat = T01IE7_n10369Ph_Mat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10369Ph_Mat", A10369Ph_Mat);
         A10370Ph_ColN = T01IE7_A10370Ph_ColN[0] ;
         n10370Ph_ColN = T01IE7_n10370Ph_ColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10370Ph_ColN", A10370Ph_ColN);
         A10371Ph_ColNn = T01IE7_A10371Ph_ColNn[0] ;
         n10371Ph_ColNn = T01IE7_n10371Ph_ColNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10371Ph_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10371Ph_ColNn), 6, 0));
         A10372Ph_Tc = T01IE7_A10372Ph_Tc[0] ;
         n10372Ph_Tc = T01IE7_n10372Ph_Tc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10372Ph_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10372Ph_Tc), 2, 0));
         A10373Ph_Maq = T01IE7_A10373Ph_Maq[0] ;
         n10373Ph_Maq = T01IE7_n10373Ph_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10373Ph_Maq", A10373Ph_Maq);
         A10374Ph_Cli = T01IE7_A10374Ph_Cli[0] ;
         n10374Ph_Cli = T01IE7_n10374Ph_Cli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10374Ph_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10374Ph_Cli), 6, 0));
         A10375Ph_Cln = T01IE7_A10375Ph_Cln[0] ;
         n10375Ph_Cln = T01IE7_n10375Ph_Cln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10375Ph_Cln", A10375Ph_Cln);
         A10376Ph_norma = T01IE7_A10376Ph_norma[0] ;
         n10376Ph_norma = T01IE7_n10376Ph_norma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10376Ph_norma", A10376Ph_norma);
         A10377Ph_ph = T01IE7_A10377Ph_ph[0] ;
         n10377Ph_ph = T01IE7_n10377Ph_ph[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10377Ph_ph", GXutil.ltrimstr( A10377Ph_ph, 6, 2));
         A653OpeNom = T01IE7_A653OpeNom[0] ;
         n653OpeNom = T01IE7_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A10378Ph_obs = T01IE7_A10378Ph_obs[0] ;
         n10378Ph_obs = T01IE7_n10378Ph_obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10378Ph_obs", A10378Ph_obs);
         A10844Ph_ph2 = T01IE7_A10844Ph_ph2[0] ;
         n10844Ph_ph2 = T01IE7_n10844Ph_ph2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10844Ph_ph2", GXutil.ltrimstr( A10844Ph_ph2, 6, 2));
         A10845Ph_ph3 = T01IE7_A10845Ph_ph3[0] ;
         n10845Ph_ph3 = T01IE7_n10845Ph_ph3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10845Ph_ph3", GXutil.ltrimstr( A10845Ph_ph3, 6, 2));
         A11800PhRqMn = T01IE7_A11800PhRqMn[0] ;
         n11800PhRqMn = T01IE7_n11800PhRqMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11800PhRqMn", A11800PhRqMn);
         A11801PhTpMn = T01IE7_A11801PhTpMn[0] ;
         n11801PhTpMn = T01IE7_n11801PhTpMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11801PhTpMn", A11801PhTpMn);
         A11802PhSt = T01IE7_A11802PhSt[0] ;
         n11802PhSt = T01IE7_n11802PhSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11802PhSt", GXutil.str( A11802PhSt, 1, 0));
         A11918PhMetodo = T01IE7_A11918PhMetodo[0] ;
         n11918PhMetodo = T01IE7_n11918PhMetodo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11918PhMetodo", A11918PhMetodo);
         A11934Ph_ph4 = T01IE7_A11934Ph_ph4[0] ;
         n11934Ph_ph4 = T01IE7_n11934Ph_ph4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11934Ph_ph4", GXutil.ltrimstr( A11934Ph_ph4, 6, 2));
         A129BarCod = T01IE7_A129BarCod[0] ;
         n129BarCod = T01IE7_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01IE7_A132BarCodReo[0] ;
         n132BarCodReo = T01IE7_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01IE7_A130BarCodPar[0] ;
         n130BarCodPar = T01IE7_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01IE7_A652OpeCod[0] ;
         n652OpeCod = T01IE7_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zm1IE1403( -2) ;
      }
      pr_default.close(5);
      onLoadActions1IE1403( ) ;
   }

   public void onLoadActions1IE1403( )
   {
      A11763Ph_mda = (A10844Ph_ph2.add(A10845Ph_ph3)).divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11763Ph_mda", GXutil.ltrimstr( A11763Ph_mda, 6, 2));
   }

   public void checkExtendedTable1IE1403( )
   {
      nIsDirty_1403 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IE4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01IE4_A407EmprNom[0] ;
      n407EmprNom = T01IE4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01IE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01IE6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01IE6_A653OpeNom[0] ;
      n653OpeNom = T01IE6_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(4);
      nIsDirty_1403 = (short)(1) ;
      A11763Ph_mda = (A10844Ph_ph2.add(A10845Ph_ph3)).divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11763Ph_mda", GXutil.ltrimstr( A11763Ph_mda, 6, 2));
   }

   public void closeExtendedTableCursors1IE1403( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T01IE8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01IE8_A407EmprNom[0] ;
      n407EmprNom = T01IE8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_4( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01IE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void gxload_5( String A396EmprCod ,
                         int A652OpeCod )
   {
      /* Using cursor T01IE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01IE10_A653OpeNom[0] ;
      n653OpeNom = T01IE10_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1IE1403( )
   {
      /* Using cursor T01IE11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A10364Ph_numero)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1403 = (short)(1) ;
      }
      else
      {
         RcdFound1403 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10364Ph_numero)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1IE1403( 2) ;
         RcdFound1403 = (short)(1) ;
         A10364Ph_numero = T01IE3_A10364Ph_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
         A10365Ph_fec = T01IE3_A10365Ph_fec[0] ;
         n10365Ph_fec = T01IE3_n10365Ph_fec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10365Ph_fec", localUtil.format(A10365Ph_fec, "99/99/99"));
         A10366Ph_Disp = T01IE3_A10366Ph_Disp[0] ;
         n10366Ph_Disp = T01IE3_n10366Ph_Disp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10366Ph_Disp", A10366Ph_Disp);
         A10367Ph_Ref = T01IE3_A10367Ph_Ref[0] ;
         n10367Ph_Ref = T01IE3_n10367Ph_Ref[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10367Ph_Ref", A10367Ph_Ref);
         A10368Ph_Art = T01IE3_A10368Ph_Art[0] ;
         n10368Ph_Art = T01IE3_n10368Ph_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10368Ph_Art", A10368Ph_Art);
         A10369Ph_Mat = T01IE3_A10369Ph_Mat[0] ;
         n10369Ph_Mat = T01IE3_n10369Ph_Mat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10369Ph_Mat", A10369Ph_Mat);
         A10370Ph_ColN = T01IE3_A10370Ph_ColN[0] ;
         n10370Ph_ColN = T01IE3_n10370Ph_ColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10370Ph_ColN", A10370Ph_ColN);
         A10371Ph_ColNn = T01IE3_A10371Ph_ColNn[0] ;
         n10371Ph_ColNn = T01IE3_n10371Ph_ColNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10371Ph_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10371Ph_ColNn), 6, 0));
         A10372Ph_Tc = T01IE3_A10372Ph_Tc[0] ;
         n10372Ph_Tc = T01IE3_n10372Ph_Tc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10372Ph_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10372Ph_Tc), 2, 0));
         A10373Ph_Maq = T01IE3_A10373Ph_Maq[0] ;
         n10373Ph_Maq = T01IE3_n10373Ph_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10373Ph_Maq", A10373Ph_Maq);
         A10374Ph_Cli = T01IE3_A10374Ph_Cli[0] ;
         n10374Ph_Cli = T01IE3_n10374Ph_Cli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10374Ph_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10374Ph_Cli), 6, 0));
         A10375Ph_Cln = T01IE3_A10375Ph_Cln[0] ;
         n10375Ph_Cln = T01IE3_n10375Ph_Cln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10375Ph_Cln", A10375Ph_Cln);
         A10376Ph_norma = T01IE3_A10376Ph_norma[0] ;
         n10376Ph_norma = T01IE3_n10376Ph_norma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10376Ph_norma", A10376Ph_norma);
         A10377Ph_ph = T01IE3_A10377Ph_ph[0] ;
         n10377Ph_ph = T01IE3_n10377Ph_ph[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10377Ph_ph", GXutil.ltrimstr( A10377Ph_ph, 6, 2));
         A10378Ph_obs = T01IE3_A10378Ph_obs[0] ;
         n10378Ph_obs = T01IE3_n10378Ph_obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10378Ph_obs", A10378Ph_obs);
         A10844Ph_ph2 = T01IE3_A10844Ph_ph2[0] ;
         n10844Ph_ph2 = T01IE3_n10844Ph_ph2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10844Ph_ph2", GXutil.ltrimstr( A10844Ph_ph2, 6, 2));
         A10845Ph_ph3 = T01IE3_A10845Ph_ph3[0] ;
         n10845Ph_ph3 = T01IE3_n10845Ph_ph3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10845Ph_ph3", GXutil.ltrimstr( A10845Ph_ph3, 6, 2));
         A11800PhRqMn = T01IE3_A11800PhRqMn[0] ;
         n11800PhRqMn = T01IE3_n11800PhRqMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11800PhRqMn", A11800PhRqMn);
         A11801PhTpMn = T01IE3_A11801PhTpMn[0] ;
         n11801PhTpMn = T01IE3_n11801PhTpMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11801PhTpMn", A11801PhTpMn);
         A11802PhSt = T01IE3_A11802PhSt[0] ;
         n11802PhSt = T01IE3_n11802PhSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11802PhSt", GXutil.str( A11802PhSt, 1, 0));
         A11918PhMetodo = T01IE3_A11918PhMetodo[0] ;
         n11918PhMetodo = T01IE3_n11918PhMetodo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11918PhMetodo", A11918PhMetodo);
         A11934Ph_ph4 = T01IE3_A11934Ph_ph4[0] ;
         n11934Ph_ph4 = T01IE3_n11934Ph_ph4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11934Ph_ph4", GXutil.ltrimstr( A11934Ph_ph4, 6, 2));
         A396EmprCod = T01IE3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01IE3_A129BarCod[0] ;
         n129BarCod = T01IE3_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01IE3_A132BarCodReo[0] ;
         n132BarCodReo = T01IE3_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01IE3_A130BarCodPar[0] ;
         n130BarCodPar = T01IE3_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01IE3_A652OpeCod[0] ;
         n652OpeCod = T01IE3_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z10364Ph_numero = A10364Ph_numero ;
         sMode1403 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IE1403( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1403 = (short)(0) ;
            initializeNonKey1IE1403( ) ;
         }
         Gx_mode = sMode1403 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1403 = (short)(0) ;
         initializeNonKey1IE1403( ) ;
         sMode1403 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1403 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1IE1403( ) ;
      if ( RcdFound1403 == 0 )
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
      RcdFound1403 = (short)(0) ;
      /* Using cursor T01IE12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A10364Ph_numero)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01IE12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IE12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IE12_A10364Ph_numero[0] < A10364Ph_numero ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01IE12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IE12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IE12_A10364Ph_numero[0] > A10364Ph_numero ) ) )
         {
            A396EmprCod = T01IE12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10364Ph_numero = T01IE12_A10364Ph_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
            RcdFound1403 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1403 = (short)(0) ;
      /* Using cursor T01IE13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A10364Ph_numero)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01IE13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IE13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IE13_A10364Ph_numero[0] > A10364Ph_numero ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01IE13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IE13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IE13_A10364Ph_numero[0] < A10364Ph_numero ) ) )
         {
            A396EmprCod = T01IE13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10364Ph_numero = T01IE13_A10364Ph_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
            RcdFound1403 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IE1403( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IE1403( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1403 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10364Ph_numero != Z10364Ph_numero ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A10364Ph_numero = Z10364Ph_numero ;
               httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
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
               update1IE1403( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10364Ph_numero != Z10364Ph_numero ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IE1403( ) ;
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
                  insert1IE1403( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10364Ph_numero != Z10364Ph_numero ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10364Ph_numero = Z10364Ph_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
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
      getKey1IE1403( ) ;
      if ( RcdFound1403 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10364Ph_numero != Z10364Ph_numero ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10364Ph_numero = Z10364Ph_numero ;
            httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10364Ph_numero != Z10364Ph_numero ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tptph");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IE0( ) ;
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
      if ( RcdFound1403 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IE1403( ) ;
      if ( RcdFound1403 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IE1403( ) ;
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
      if ( RcdFound1403 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      if ( RcdFound1403 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      scanStart1IE1403( ) ;
      if ( RcdFound1403 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1403 != 0 )
         {
            scanNext1IE1403( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IE1403( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IE1403( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10364Ph_numero)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTPH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z10365Ph_fec), GXutil.resetTime(T01IE2_A10365Ph_fec[0])) ) || ( GXutil.strcmp(Z10366Ph_Disp, T01IE2_A10366Ph_Disp[0]) != 0 ) || ( GXutil.strcmp(Z10367Ph_Ref, T01IE2_A10367Ph_Ref[0]) != 0 ) || ( GXutil.strcmp(Z10368Ph_Art, T01IE2_A10368Ph_Art[0]) != 0 ) || ( GXutil.strcmp(Z10369Ph_Mat, T01IE2_A10369Ph_Mat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10370Ph_ColN, T01IE2_A10370Ph_ColN[0]) != 0 ) || ( Z10371Ph_ColNn != T01IE2_A10371Ph_ColNn[0] ) || ( Z10372Ph_Tc != T01IE2_A10372Ph_Tc[0] ) || ( GXutil.strcmp(Z10373Ph_Maq, T01IE2_A10373Ph_Maq[0]) != 0 ) || ( Z10374Ph_Cli != T01IE2_A10374Ph_Cli[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10375Ph_Cln, T01IE2_A10375Ph_Cln[0]) != 0 ) || ( GXutil.strcmp(Z10376Ph_norma, T01IE2_A10376Ph_norma[0]) != 0 ) || ( DecimalUtil.compareTo(Z10377Ph_ph, T01IE2_A10377Ph_ph[0]) != 0 ) || ( GXutil.strcmp(Z10378Ph_obs, T01IE2_A10378Ph_obs[0]) != 0 ) || ( DecimalUtil.compareTo(Z10844Ph_ph2, T01IE2_A10844Ph_ph2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10845Ph_ph3, T01IE2_A10845Ph_ph3[0]) != 0 ) || ( GXutil.strcmp(Z11800PhRqMn, T01IE2_A11800PhRqMn[0]) != 0 ) || ( GXutil.strcmp(Z11801PhTpMn, T01IE2_A11801PhTpMn[0]) != 0 ) || ( Z11802PhSt != T01IE2_A11802PhSt[0] ) || ( GXutil.strcmp(Z11918PhMetodo, T01IE2_A11918PhMetodo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11934Ph_ph4, T01IE2_A11934Ph_ph4[0]) != 0 ) || ( Z129BarCod != T01IE2_A129BarCod[0] ) || ( Z132BarCodReo != T01IE2_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01IE2_A130BarCodPar[0]) != 0 ) || ( Z652OpeCod != T01IE2_A652OpeCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10365Ph_fec), GXutil.resetTime(T01IE2_A10365Ph_fec[0])) ) )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_fec");
               GXutil.writeLogRaw("Old: ",Z10365Ph_fec);
               GXutil.writeLogRaw("Current: ",T01IE2_A10365Ph_fec[0]);
            }
            if ( GXutil.strcmp(Z10366Ph_Disp, T01IE2_A10366Ph_Disp[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_Disp");
               GXutil.writeLogRaw("Old: ",Z10366Ph_Disp);
               GXutil.writeLogRaw("Current: ",T01IE2_A10366Ph_Disp[0]);
            }
            if ( GXutil.strcmp(Z10367Ph_Ref, T01IE2_A10367Ph_Ref[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_Ref");
               GXutil.writeLogRaw("Old: ",Z10367Ph_Ref);
               GXutil.writeLogRaw("Current: ",T01IE2_A10367Ph_Ref[0]);
            }
            if ( GXutil.strcmp(Z10368Ph_Art, T01IE2_A10368Ph_Art[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_Art");
               GXutil.writeLogRaw("Old: ",Z10368Ph_Art);
               GXutil.writeLogRaw("Current: ",T01IE2_A10368Ph_Art[0]);
            }
            if ( GXutil.strcmp(Z10369Ph_Mat, T01IE2_A10369Ph_Mat[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_Mat");
               GXutil.writeLogRaw("Old: ",Z10369Ph_Mat);
               GXutil.writeLogRaw("Current: ",T01IE2_A10369Ph_Mat[0]);
            }
            if ( GXutil.strcmp(Z10370Ph_ColN, T01IE2_A10370Ph_ColN[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_ColN");
               GXutil.writeLogRaw("Old: ",Z10370Ph_ColN);
               GXutil.writeLogRaw("Current: ",T01IE2_A10370Ph_ColN[0]);
            }
            if ( Z10371Ph_ColNn != T01IE2_A10371Ph_ColNn[0] )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_ColNn");
               GXutil.writeLogRaw("Old: ",Z10371Ph_ColNn);
               GXutil.writeLogRaw("Current: ",T01IE2_A10371Ph_ColNn[0]);
            }
            if ( Z10372Ph_Tc != T01IE2_A10372Ph_Tc[0] )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_Tc");
               GXutil.writeLogRaw("Old: ",Z10372Ph_Tc);
               GXutil.writeLogRaw("Current: ",T01IE2_A10372Ph_Tc[0]);
            }
            if ( GXutil.strcmp(Z10373Ph_Maq, T01IE2_A10373Ph_Maq[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_Maq");
               GXutil.writeLogRaw("Old: ",Z10373Ph_Maq);
               GXutil.writeLogRaw("Current: ",T01IE2_A10373Ph_Maq[0]);
            }
            if ( Z10374Ph_Cli != T01IE2_A10374Ph_Cli[0] )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_Cli");
               GXutil.writeLogRaw("Old: ",Z10374Ph_Cli);
               GXutil.writeLogRaw("Current: ",T01IE2_A10374Ph_Cli[0]);
            }
            if ( GXutil.strcmp(Z10375Ph_Cln, T01IE2_A10375Ph_Cln[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_Cln");
               GXutil.writeLogRaw("Old: ",Z10375Ph_Cln);
               GXutil.writeLogRaw("Current: ",T01IE2_A10375Ph_Cln[0]);
            }
            if ( GXutil.strcmp(Z10376Ph_norma, T01IE2_A10376Ph_norma[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_norma");
               GXutil.writeLogRaw("Old: ",Z10376Ph_norma);
               GXutil.writeLogRaw("Current: ",T01IE2_A10376Ph_norma[0]);
            }
            if ( DecimalUtil.compareTo(Z10377Ph_ph, T01IE2_A10377Ph_ph[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_ph");
               GXutil.writeLogRaw("Old: ",Z10377Ph_ph);
               GXutil.writeLogRaw("Current: ",T01IE2_A10377Ph_ph[0]);
            }
            if ( GXutil.strcmp(Z10378Ph_obs, T01IE2_A10378Ph_obs[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_obs");
               GXutil.writeLogRaw("Old: ",Z10378Ph_obs);
               GXutil.writeLogRaw("Current: ",T01IE2_A10378Ph_obs[0]);
            }
            if ( DecimalUtil.compareTo(Z10844Ph_ph2, T01IE2_A10844Ph_ph2[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_ph2");
               GXutil.writeLogRaw("Old: ",Z10844Ph_ph2);
               GXutil.writeLogRaw("Current: ",T01IE2_A10844Ph_ph2[0]);
            }
            if ( DecimalUtil.compareTo(Z10845Ph_ph3, T01IE2_A10845Ph_ph3[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_ph3");
               GXutil.writeLogRaw("Old: ",Z10845Ph_ph3);
               GXutil.writeLogRaw("Current: ",T01IE2_A10845Ph_ph3[0]);
            }
            if ( GXutil.strcmp(Z11800PhRqMn, T01IE2_A11800PhRqMn[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"PhRqMn");
               GXutil.writeLogRaw("Old: ",Z11800PhRqMn);
               GXutil.writeLogRaw("Current: ",T01IE2_A11800PhRqMn[0]);
            }
            if ( GXutil.strcmp(Z11801PhTpMn, T01IE2_A11801PhTpMn[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"PhTpMn");
               GXutil.writeLogRaw("Old: ",Z11801PhTpMn);
               GXutil.writeLogRaw("Current: ",T01IE2_A11801PhTpMn[0]);
            }
            if ( Z11802PhSt != T01IE2_A11802PhSt[0] )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"PhSt");
               GXutil.writeLogRaw("Old: ",Z11802PhSt);
               GXutil.writeLogRaw("Current: ",T01IE2_A11802PhSt[0]);
            }
            if ( GXutil.strcmp(Z11918PhMetodo, T01IE2_A11918PhMetodo[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"PhMetodo");
               GXutil.writeLogRaw("Old: ",Z11918PhMetodo);
               GXutil.writeLogRaw("Current: ",T01IE2_A11918PhMetodo[0]);
            }
            if ( DecimalUtil.compareTo(Z11934Ph_ph4, T01IE2_A11934Ph_ph4[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"Ph_ph4");
               GXutil.writeLogRaw("Old: ",Z11934Ph_ph4);
               GXutil.writeLogRaw("Current: ",T01IE2_A11934Ph_ph4[0]);
            }
            if ( Z129BarCod != T01IE2_A129BarCod[0] )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01IE2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01IE2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01IE2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01IE2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01IE2_A130BarCodPar[0]);
            }
            if ( Z652OpeCod != T01IE2_A652OpeCod[0] )
            {
               GXutil.writeLogln("tptph:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T01IE2_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTPH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IE1403( )
   {
      beforeValidate1IE1403( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IE1403( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IE1403( 0) ;
         checkOptimisticConcurrency1IE1403( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IE1403( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IE1403( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IE14 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A10364Ph_numero), Boolean.valueOf(n10365Ph_fec), A10365Ph_fec, Boolean.valueOf(n10366Ph_Disp), A10366Ph_Disp, Boolean.valueOf(n10367Ph_Ref), A10367Ph_Ref, Boolean.valueOf(n10368Ph_Art), A10368Ph_Art, Boolean.valueOf(n10369Ph_Mat), A10369Ph_Mat, Boolean.valueOf(n10370Ph_ColN), A10370Ph_ColN, Boolean.valueOf(n10371Ph_ColNn), Integer.valueOf(A10371Ph_ColNn), Boolean.valueOf(n10372Ph_Tc), Byte.valueOf(A10372Ph_Tc), Boolean.valueOf(n10373Ph_Maq), A10373Ph_Maq, Boolean.valueOf(n10374Ph_Cli), Integer.valueOf(A10374Ph_Cli), Boolean.valueOf(n10375Ph_Cln), A10375Ph_Cln, Boolean.valueOf(n10376Ph_norma), A10376Ph_norma, Boolean.valueOf(n10377Ph_ph), A10377Ph_ph, Boolean.valueOf(n10378Ph_obs), A10378Ph_obs, Boolean.valueOf(n10844Ph_ph2), A10844Ph_ph2, Boolean.valueOf(n10845Ph_ph3), A10845Ph_ph3, Boolean.valueOf(n11800PhRqMn), A11800PhRqMn, Boolean.valueOf(n11801PhTpMn), A11801PhTpMn, Boolean.valueOf(n11802PhSt), Byte.valueOf(A11802PhSt), Boolean.valueOf(n11918PhMetodo), A11918PhMetodo, Boolean.valueOf(n11934Ph_ph4), A11934Ph_ph4, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTPH");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        resetCaption1IE0( ) ;
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
            load1IE1403( ) ;
         }
         endLevel1IE1403( ) ;
      }
      closeExtendedTableCursors1IE1403( ) ;
   }

   public void update1IE1403( )
   {
      beforeValidate1IE1403( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IE1403( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IE1403( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IE1403( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IE1403( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IE15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n10365Ph_fec), A10365Ph_fec, Boolean.valueOf(n10366Ph_Disp), A10366Ph_Disp, Boolean.valueOf(n10367Ph_Ref), A10367Ph_Ref, Boolean.valueOf(n10368Ph_Art), A10368Ph_Art, Boolean.valueOf(n10369Ph_Mat), A10369Ph_Mat, Boolean.valueOf(n10370Ph_ColN), A10370Ph_ColN, Boolean.valueOf(n10371Ph_ColNn), Integer.valueOf(A10371Ph_ColNn), Boolean.valueOf(n10372Ph_Tc), Byte.valueOf(A10372Ph_Tc), Boolean.valueOf(n10373Ph_Maq), A10373Ph_Maq, Boolean.valueOf(n10374Ph_Cli), Integer.valueOf(A10374Ph_Cli), Boolean.valueOf(n10375Ph_Cln), A10375Ph_Cln, Boolean.valueOf(n10376Ph_norma), A10376Ph_norma, Boolean.valueOf(n10377Ph_ph), A10377Ph_ph, Boolean.valueOf(n10378Ph_obs), A10378Ph_obs, Boolean.valueOf(n10844Ph_ph2), A10844Ph_ph2, Boolean.valueOf(n10845Ph_ph3), A10845Ph_ph3, Boolean.valueOf(n11800PhRqMn), A11800PhRqMn, Boolean.valueOf(n11801PhTpMn), A11801PhTpMn, Boolean.valueOf(n11802PhSt), Byte.valueOf(A11802PhSt), Boolean.valueOf(n11918PhMetodo), A11918PhMetodo, Boolean.valueOf(n11934Ph_ph4), A11934Ph_ph4, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A10364Ph_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTPH");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTPH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IE1403( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1IE0( ) ;
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
         endLevel1IE1403( ) ;
      }
      closeExtendedTableCursors1IE1403( ) ;
   }

   public void deferredUpdate1IE1403( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IE1403( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IE1403( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IE1403( ) ;
         afterConfirm1IE1403( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IE1403( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IE16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A10364Ph_numero)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTPH");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1403 == 0 )
                     {
                        initAll1IE1403( ) ;
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
                     resetCaption1IE0( ) ;
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
      sMode1403 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IE1403( ) ;
      Gx_mode = sMode1403 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IE1403( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01IE17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T01IE17_A407EmprNom[0] ;
         n407EmprNom = T01IE17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
         /* Using cursor T01IE18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T01IE18_A653OpeNom[0] ;
         n653OpeNom = T01IE18_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(16);
         A11763Ph_mda = (A10844Ph_ph2.add(A10845Ph_ph3)).divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11763Ph_mda", GXutil.ltrimstr( A11763Ph_mda, 6, 2));
      }
   }

   public void endLevel1IE1403( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IE1403( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tptph");
         if ( AnyError == 0 )
         {
            confirmValues1IE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tptph");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IE1403( )
   {
      /* Using cursor T01IE19 */
      pr_default.execute(17);
      RcdFound1403 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1403 = (short)(1) ;
         A396EmprCod = T01IE19_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10364Ph_numero = T01IE19_A10364Ph_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IE1403( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1403 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1403 = (short)(1) ;
         A396EmprCod = T01IE19_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10364Ph_numero = T01IE19_A10364Ph_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
      }
   }

   public void scanEnd1IE1403( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1IE1403( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IE1403( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IE1403( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IE1403( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IE1403( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IE1403( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IE1403( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtPh_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_numero_Enabled), 5, 0), true);
      edtPh_fec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_fec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_fec_Enabled), 5, 0), true);
      edtPh_Disp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_Disp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_Disp_Enabled), 5, 0), true);
      edtPh_Ref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_Ref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_Ref_Enabled), 5, 0), true);
      edtPh_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_Art_Enabled), 5, 0), true);
      edtPh_Mat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_Mat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_Mat_Enabled), 5, 0), true);
      edtPh_ColN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_ColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_ColN_Enabled), 5, 0), true);
      edtPh_ColNn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_ColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_ColNn_Enabled), 5, 0), true);
      edtPh_Tc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_Tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_Tc_Enabled), 5, 0), true);
      edtPh_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_Maq_Enabled), 5, 0), true);
      edtPh_Cli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_Cli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_Cli_Enabled), 5, 0), true);
      edtPh_Cln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_Cln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_Cln_Enabled), 5, 0), true);
      edtPh_norma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_norma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_norma_Enabled), 5, 0), true);
      edtPh_ph_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_ph_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_ph_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtPh_obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_obs_Enabled), 5, 0), true);
      edtPh_ph2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_ph2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_ph2_Enabled), 5, 0), true);
      edtPh_ph3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_ph3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_ph3_Enabled), 5, 0), true);
      edtPh_mda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_mda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_mda_Enabled), 5, 0), true);
      edtPhRqMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPhRqMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPhRqMn_Enabled), 5, 0), true);
      edtPhTpMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPhTpMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPhTpMn_Enabled), 5, 0), true);
      edtPhSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPhSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPhSt_Enabled), 5, 0), true);
      edtPhMetodo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPhMetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPhMetodo_Enabled), 5, 0), true);
      edtPh_ph4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPh_ph4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPh_ph4_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1IE1403( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1IE0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tptph", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10364Ph_numero", GXutil.ltrim( localUtil.ntoc( Z10364Ph_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10365Ph_fec", localUtil.dtoc( Z10365Ph_fec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10366Ph_Disp", GXutil.rtrim( Z10366Ph_Disp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10367Ph_Ref", GXutil.rtrim( Z10367Ph_Ref));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10368Ph_Art", GXutil.rtrim( Z10368Ph_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10369Ph_Mat", GXutil.rtrim( Z10369Ph_Mat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10370Ph_ColN", GXutil.rtrim( Z10370Ph_ColN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10371Ph_ColNn", GXutil.ltrim( localUtil.ntoc( Z10371Ph_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10372Ph_Tc", GXutil.ltrim( localUtil.ntoc( Z10372Ph_Tc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10373Ph_Maq", GXutil.rtrim( Z10373Ph_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10374Ph_Cli", GXutil.ltrim( localUtil.ntoc( Z10374Ph_Cli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10375Ph_Cln", GXutil.rtrim( Z10375Ph_Cln));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10376Ph_norma", GXutil.rtrim( Z10376Ph_norma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10377Ph_ph", GXutil.ltrim( localUtil.ntoc( Z10377Ph_ph, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10378Ph_obs", Z10378Ph_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10844Ph_ph2", GXutil.ltrim( localUtil.ntoc( Z10844Ph_ph2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10845Ph_ph3", GXutil.ltrim( localUtil.ntoc( Z10845Ph_ph3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11800PhRqMn", GXutil.rtrim( Z11800PhRqMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11801PhTpMn", GXutil.rtrim( Z11801PhTpMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11802PhSt", GXutil.ltrim( localUtil.ntoc( Z11802PhSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11918PhMetodo", GXutil.rtrim( Z11918PhMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11934Ph_ph4", GXutil.ltrim( localUtil.ntoc( Z11934Ph_ph4, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tptph", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TpTPH" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LLamada con parametro", "") ;
   }

   public void initializeNonKey1IE1403( )
   {
      A11763Ph_mda = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11763Ph_mda", GXutil.ltrimstr( A11763Ph_mda, 6, 2));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A10365Ph_fec = GXutil.nullDate() ;
      n10365Ph_fec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10365Ph_fec", localUtil.format(A10365Ph_fec, "99/99/99"));
      A10366Ph_Disp = "" ;
      n10366Ph_Disp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10366Ph_Disp", A10366Ph_Disp);
      A10367Ph_Ref = "" ;
      n10367Ph_Ref = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10367Ph_Ref", A10367Ph_Ref);
      A10368Ph_Art = "" ;
      n10368Ph_Art = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10368Ph_Art", A10368Ph_Art);
      A10369Ph_Mat = "" ;
      n10369Ph_Mat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10369Ph_Mat", A10369Ph_Mat);
      A10370Ph_ColN = "" ;
      n10370Ph_ColN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10370Ph_ColN", A10370Ph_ColN);
      A10371Ph_ColNn = 0 ;
      n10371Ph_ColNn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10371Ph_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10371Ph_ColNn), 6, 0));
      A10372Ph_Tc = (byte)(0) ;
      n10372Ph_Tc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10372Ph_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10372Ph_Tc), 2, 0));
      A10373Ph_Maq = "" ;
      n10373Ph_Maq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10373Ph_Maq", A10373Ph_Maq);
      A10374Ph_Cli = 0 ;
      n10374Ph_Cli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10374Ph_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10374Ph_Cli), 6, 0));
      A10375Ph_Cln = "" ;
      n10375Ph_Cln = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10375Ph_Cln", A10375Ph_Cln);
      A10376Ph_norma = "" ;
      n10376Ph_norma = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10376Ph_norma", A10376Ph_norma);
      A10377Ph_ph = DecimalUtil.ZERO ;
      n10377Ph_ph = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10377Ph_ph", GXutil.ltrimstr( A10377Ph_ph, 6, 2));
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A10378Ph_obs = "" ;
      n10378Ph_obs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10378Ph_obs", A10378Ph_obs);
      A10844Ph_ph2 = DecimalUtil.ZERO ;
      n10844Ph_ph2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10844Ph_ph2", GXutil.ltrimstr( A10844Ph_ph2, 6, 2));
      A10845Ph_ph3 = DecimalUtil.ZERO ;
      n10845Ph_ph3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10845Ph_ph3", GXutil.ltrimstr( A10845Ph_ph3, 6, 2));
      A11800PhRqMn = "" ;
      n11800PhRqMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11800PhRqMn", A11800PhRqMn);
      A11801PhTpMn = "" ;
      n11801PhTpMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11801PhTpMn", A11801PhTpMn);
      A11802PhSt = (byte)(0) ;
      n11802PhSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11802PhSt", GXutil.str( A11802PhSt, 1, 0));
      A11918PhMetodo = "" ;
      n11918PhMetodo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11918PhMetodo", A11918PhMetodo);
      A11934Ph_ph4 = DecimalUtil.ZERO ;
      n11934Ph_ph4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11934Ph_ph4", GXutil.ltrimstr( A11934Ph_ph4, 6, 2));
      Z10365Ph_fec = GXutil.nullDate() ;
      Z10366Ph_Disp = "" ;
      Z10367Ph_Ref = "" ;
      Z10368Ph_Art = "" ;
      Z10369Ph_Mat = "" ;
      Z10370Ph_ColN = "" ;
      Z10371Ph_ColNn = 0 ;
      Z10372Ph_Tc = (byte)(0) ;
      Z10373Ph_Maq = "" ;
      Z10374Ph_Cli = 0 ;
      Z10375Ph_Cln = "" ;
      Z10376Ph_norma = "" ;
      Z10377Ph_ph = DecimalUtil.ZERO ;
      Z10378Ph_obs = "" ;
      Z10844Ph_ph2 = DecimalUtil.ZERO ;
      Z10845Ph_ph3 = DecimalUtil.ZERO ;
      Z11800PhRqMn = "" ;
      Z11801PhTpMn = "" ;
      Z11802PhSt = (byte)(0) ;
      Z11918PhMetodo = "" ;
      Z11934Ph_ph4 = DecimalUtil.ZERO ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAll1IE1403( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A10364Ph_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10364Ph_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10364Ph_numero), 8, 0));
      initializeNonKey1IE1403( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241581757", true, true);
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
      httpContext.AddJavascriptSource("tptph.js", "?20268241581758", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPh_numero_Internalname = "PH_NUMERO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPh_fec_Internalname = "PH_FEC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPh_Disp_Internalname = "PH_DISP" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPh_Ref_Internalname = "PH_REF" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPh_Art_Internalname = "PH_ART" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPh_Mat_Internalname = "PH_MAT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPh_ColN_Internalname = "PH_COLN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPh_ColNn_Internalname = "PH_COLNN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtPh_Tc_Internalname = "PH_TC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtPh_Maq_Internalname = "PH_MAQ" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtPh_Cli_Internalname = "PH_CLI" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtPh_Cln_Internalname = "PH_CLN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtPh_norma_Internalname = "PH_NORMA" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtPh_ph_Internalname = "PH_PH" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtPh_obs_Internalname = "PH_OBS" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtPh_ph2_Internalname = "PH_PH2" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtPh_ph3_Internalname = "PH_PH3" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtPh_mda_Internalname = "PH_MDA" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtPhRqMn_Internalname = "PHRQMN" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtPhTpMn_Internalname = "PHTPMN" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtPhSt_Internalname = "PHST" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtPhMetodo_Internalname = "PHMETODO" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtPh_ph4_Internalname = "PH_PH4" ;
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
      Form.setCaption( httpContext.getMessage( "LLamada con parametro", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPh_ph4_Jsonclick = "" ;
      edtPh_ph4_Backcolor = (int)(0xFFFFFF) ;
      edtPh_ph4_Enabled = 1 ;
      edtPhMetodo_Jsonclick = "" ;
      edtPhMetodo_Backcolor = (int)(0xFFFFFF) ;
      edtPhMetodo_Enabled = 1 ;
      edtPhSt_Jsonclick = "" ;
      edtPhSt_Backcolor = (int)(0xFFFFFF) ;
      edtPhSt_Enabled = 1 ;
      edtPhTpMn_Jsonclick = "" ;
      edtPhTpMn_Backcolor = (int)(0xFFFFFF) ;
      edtPhTpMn_Enabled = 1 ;
      edtPhRqMn_Jsonclick = "" ;
      edtPhRqMn_Backcolor = (int)(0xFFFFFF) ;
      edtPhRqMn_Enabled = 1 ;
      edtPh_mda_Jsonclick = "" ;
      edtPh_mda_Backcolor = (int)(0xFFFFFF) ;
      edtPh_mda_Enabled = 0 ;
      edtPh_ph3_Jsonclick = "" ;
      edtPh_ph3_Backcolor = (int)(0xFFFFFF) ;
      edtPh_ph3_Enabled = 1 ;
      edtPh_ph2_Jsonclick = "" ;
      edtPh_ph2_Backcolor = (int)(0xFFFFFF) ;
      edtPh_ph2_Enabled = 1 ;
      edtPh_obs_Backcolor = (int)(0xFFFFFF) ;
      edtPh_obs_Enabled = 1 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtPh_ph_Jsonclick = "" ;
      edtPh_ph_Backcolor = (int)(0xFFFFFF) ;
      edtPh_ph_Enabled = 1 ;
      edtPh_norma_Jsonclick = "" ;
      edtPh_norma_Backcolor = (int)(0xFFFFFF) ;
      edtPh_norma_Enabled = 1 ;
      edtPh_Cln_Jsonclick = "" ;
      edtPh_Cln_Backcolor = (int)(0xFFFFFF) ;
      edtPh_Cln_Enabled = 1 ;
      edtPh_Cli_Jsonclick = "" ;
      edtPh_Cli_Backcolor = (int)(0xFFFFFF) ;
      edtPh_Cli_Enabled = 1 ;
      edtPh_Maq_Jsonclick = "" ;
      edtPh_Maq_Backcolor = (int)(0xFFFFFF) ;
      edtPh_Maq_Enabled = 1 ;
      edtPh_Tc_Jsonclick = "" ;
      edtPh_Tc_Backcolor = (int)(0xFFFFFF) ;
      edtPh_Tc_Enabled = 1 ;
      edtPh_ColNn_Jsonclick = "" ;
      edtPh_ColNn_Backcolor = (int)(0xFFFFFF) ;
      edtPh_ColNn_Enabled = 1 ;
      edtPh_ColN_Jsonclick = "" ;
      edtPh_ColN_Backcolor = (int)(0xFFFFFF) ;
      edtPh_ColN_Enabled = 1 ;
      edtPh_Mat_Jsonclick = "" ;
      edtPh_Mat_Backcolor = (int)(0xFFFFFF) ;
      edtPh_Mat_Enabled = 1 ;
      edtPh_Art_Jsonclick = "" ;
      edtPh_Art_Backcolor = (int)(0xFFFFFF) ;
      edtPh_Art_Enabled = 1 ;
      edtPh_Ref_Jsonclick = "" ;
      edtPh_Ref_Backcolor = (int)(0xFFFFFF) ;
      edtPh_Ref_Enabled = 1 ;
      edtPh_Disp_Jsonclick = "" ;
      edtPh_Disp_Backcolor = (int)(0xFFFFFF) ;
      edtPh_Disp_Enabled = 1 ;
      edtPh_fec_Jsonclick = "" ;
      edtPh_fec_Backcolor = (int)(0xFFFFFF) ;
      edtPh_fec_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPh_numero_Jsonclick = "" ;
      edtPh_numero_Backcolor = (int)(0xFFFFFF) ;
      edtPh_numero_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01IE17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01IE17_A407EmprNom[0] ;
      n407EmprNom = T01IE17_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      GX_FocusControl = edtBarCod_Internalname ;
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
      /* Using cursor T01IE17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01IE17_A407EmprNom[0] ;
      n407EmprNom = T01IE17_n407EmprNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Ph_numero( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A10365Ph_fec", localUtil.format(A10365Ph_fec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10366Ph_Disp", GXutil.rtrim( A10366Ph_Disp));
      httpContext.ajax_rsp_assign_attri("", false, "A10367Ph_Ref", GXutil.rtrim( A10367Ph_Ref));
      httpContext.ajax_rsp_assign_attri("", false, "A10368Ph_Art", GXutil.rtrim( A10368Ph_Art));
      httpContext.ajax_rsp_assign_attri("", false, "A10369Ph_Mat", GXutil.rtrim( A10369Ph_Mat));
      httpContext.ajax_rsp_assign_attri("", false, "A10370Ph_ColN", GXutil.rtrim( A10370Ph_ColN));
      httpContext.ajax_rsp_assign_attri("", false, "A10371Ph_ColNn", GXutil.ltrim( localUtil.ntoc( A10371Ph_ColNn, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10372Ph_Tc", GXutil.ltrim( localUtil.ntoc( A10372Ph_Tc, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10373Ph_Maq", GXutil.rtrim( A10373Ph_Maq));
      httpContext.ajax_rsp_assign_attri("", false, "A10374Ph_Cli", GXutil.ltrim( localUtil.ntoc( A10374Ph_Cli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10375Ph_Cln", GXutil.rtrim( A10375Ph_Cln));
      httpContext.ajax_rsp_assign_attri("", false, "A10376Ph_norma", GXutil.rtrim( A10376Ph_norma));
      httpContext.ajax_rsp_assign_attri("", false, "A10377Ph_ph", GXutil.ltrim( localUtil.ntoc( A10377Ph_ph, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10378Ph_obs", A10378Ph_obs);
      httpContext.ajax_rsp_assign_attri("", false, "A10844Ph_ph2", GXutil.ltrim( localUtil.ntoc( A10844Ph_ph2, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10845Ph_ph3", GXutil.ltrim( localUtil.ntoc( A10845Ph_ph3, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11800PhRqMn", GXutil.rtrim( A11800PhRqMn));
      httpContext.ajax_rsp_assign_attri("", false, "A11801PhTpMn", GXutil.rtrim( A11801PhTpMn));
      httpContext.ajax_rsp_assign_attri("", false, "A11802PhSt", GXutil.ltrim( localUtil.ntoc( A11802PhSt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11918PhMetodo", GXutil.rtrim( A11918PhMetodo));
      httpContext.ajax_rsp_assign_attri("", false, "A11934Ph_ph4", GXutil.ltrim( localUtil.ntoc( A11934Ph_ph4, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11763Ph_mda", GXutil.ltrim( localUtil.ntoc( A11763Ph_mda, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10364Ph_numero", GXutil.ltrim( localUtil.ntoc( Z10364Ph_numero, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10365Ph_fec", localUtil.format(Z10365Ph_fec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10366Ph_Disp", GXutil.rtrim( Z10366Ph_Disp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10367Ph_Ref", GXutil.rtrim( Z10367Ph_Ref));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10368Ph_Art", GXutil.rtrim( Z10368Ph_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10369Ph_Mat", GXutil.rtrim( Z10369Ph_Mat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10370Ph_ColN", GXutil.rtrim( Z10370Ph_ColN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10371Ph_ColNn", GXutil.ltrim( localUtil.ntoc( Z10371Ph_ColNn, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10372Ph_Tc", GXutil.ltrim( localUtil.ntoc( Z10372Ph_Tc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10373Ph_Maq", GXutil.rtrim( Z10373Ph_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10374Ph_Cli", GXutil.ltrim( localUtil.ntoc( Z10374Ph_Cli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10375Ph_Cln", GXutil.rtrim( Z10375Ph_Cln));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10376Ph_norma", GXutil.rtrim( Z10376Ph_norma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10377Ph_ph", GXutil.ltrim( localUtil.ntoc( Z10377Ph_ph, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10378Ph_obs", Z10378Ph_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10844Ph_ph2", GXutil.ltrim( localUtil.ntoc( Z10844Ph_ph2, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10845Ph_ph3", GXutil.ltrim( localUtil.ntoc( Z10845Ph_ph3, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11800PhRqMn", GXutil.rtrim( Z11800PhRqMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11801PhTpMn", GXutil.rtrim( Z11801PhTpMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11802PhSt", GXutil.ltrim( localUtil.ntoc( Z11802PhSt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11918PhMetodo", GXutil.rtrim( Z11918PhMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11934Ph_ph4", GXutil.ltrim( localUtil.ntoc( Z11934Ph_ph4, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11763Ph_mda", GXutil.ltrim( localUtil.ntoc( Z11763Ph_mda, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T01IE20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T01IE18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A653OpeNom = T01IE18_A653OpeNom[0] ;
      n653OpeNom = T01IE18_n653OpeNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
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
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PH_NUMERO","{handler:'valid_Ph_numero',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10364Ph_numero',fld:'PH_NUMERO',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PH_NUMERO",",oparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A10365Ph_fec',fld:'PH_FEC',pic:''},{av:'A10366Ph_Disp',fld:'PH_DISP',pic:''},{av:'A10367Ph_Ref',fld:'PH_REF',pic:''},{av:'A10368Ph_Art',fld:'PH_ART',pic:''},{av:'A10369Ph_Mat',fld:'PH_MAT',pic:''},{av:'A10370Ph_ColN',fld:'PH_COLN',pic:''},{av:'A10371Ph_ColNn',fld:'PH_COLNN',pic:'ZZZZZ9'},{av:'A10372Ph_Tc',fld:'PH_TC',pic:'Z9'},{av:'A10373Ph_Maq',fld:'PH_MAQ',pic:''},{av:'A10374Ph_Cli',fld:'PH_CLI',pic:'ZZZZZ9'},{av:'A10375Ph_Cln',fld:'PH_CLN',pic:''},{av:'A10376Ph_norma',fld:'PH_NORMA',pic:''},{av:'A10377Ph_ph',fld:'PH_PH',pic:'ZZ9.99'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A10378Ph_obs',fld:'PH_OBS',pic:''},{av:'A10844Ph_ph2',fld:'PH_PH2',pic:'ZZ9.99'},{av:'A10845Ph_ph3',fld:'PH_PH3',pic:'ZZ9.99'},{av:'A11800PhRqMn',fld:'PHRQMN',pic:''},{av:'A11801PhTpMn',fld:'PHTPMN',pic:''},{av:'A11802PhSt',fld:'PHST',pic:'9'},{av:'A11918PhMetodo',fld:'PHMETODO',pic:''},{av:'A11934Ph_ph4',fld:'PH_PH4',pic:'ZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A11763Ph_mda',fld:'PH_MDA',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10364Ph_numero'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z10365Ph_fec'},{av:'Z10366Ph_Disp'},{av:'Z10367Ph_Ref'},{av:'Z10368Ph_Art'},{av:'Z10369Ph_Mat'},{av:'Z10370Ph_ColN'},{av:'Z10371Ph_ColNn'},{av:'Z10372Ph_Tc'},{av:'Z10373Ph_Maq'},{av:'Z10374Ph_Cli'},{av:'Z10375Ph_Cln'},{av:'Z10376Ph_norma'},{av:'Z10377Ph_ph'},{av:'Z652OpeCod'},{av:'Z10378Ph_obs'},{av:'Z10844Ph_ph2'},{av:'Z10845Ph_ph3'},{av:'Z11800PhRqMn'},{av:'Z11801PhTpMn'},{av:'Z11802PhSt'},{av:'Z11918PhMetodo'},{av:'Z11934Ph_ph4'},{av:'Z407EmprNom'},{av:'Z653OpeNom'},{av:'Z11763Ph_mda'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_PH_PH2","{handler:'valid_Ph_ph2',iparms:[]");
      setEventMetadata("VALID_PH_PH2",",oparms:[]}");
      setEventMetadata("VALID_PH_PH3","{handler:'valid_Ph_ph3',iparms:[]");
      setEventMetadata("VALID_PH_PH3",",oparms:[]}");
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
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10365Ph_fec = GXutil.nullDate() ;
      Z10366Ph_Disp = "" ;
      Z10367Ph_Ref = "" ;
      Z10368Ph_Art = "" ;
      Z10369Ph_Mat = "" ;
      Z10370Ph_ColN = "" ;
      Z10373Ph_Maq = "" ;
      Z10375Ph_Cln = "" ;
      Z10376Ph_norma = "" ;
      Z10377Ph_ph = DecimalUtil.ZERO ;
      Z10378Ph_obs = "" ;
      Z10844Ph_ph2 = DecimalUtil.ZERO ;
      Z10845Ph_ph3 = DecimalUtil.ZERO ;
      Z11800PhRqMn = "" ;
      Z11801PhTpMn = "" ;
      Z11918PhMetodo = "" ;
      Z11934Ph_ph4 = DecimalUtil.ZERO ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10365Ph_fec = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A10366Ph_Disp = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10367Ph_Ref = "" ;
      lblTextblock10_Jsonclick = "" ;
      A10368Ph_Art = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10369Ph_Mat = "" ;
      lblTextblock12_Jsonclick = "" ;
      A10370Ph_ColN = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A10373Ph_Maq = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A10375Ph_Cln = "" ;
      lblTextblock18_Jsonclick = "" ;
      A10376Ph_norma = "" ;
      lblTextblock19_Jsonclick = "" ;
      A10377Ph_ph = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock22_Jsonclick = "" ;
      A10378Ph_obs = "" ;
      lblTextblock23_Jsonclick = "" ;
      A10844Ph_ph2 = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A10845Ph_ph3 = DecimalUtil.ZERO ;
      lblTextblock25_Jsonclick = "" ;
      A11763Ph_mda = DecimalUtil.ZERO ;
      lblTextblock26_Jsonclick = "" ;
      A11800PhRqMn = "" ;
      lblTextblock27_Jsonclick = "" ;
      A11801PhTpMn = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A11918PhMetodo = "" ;
      lblTextblock30_Jsonclick = "" ;
      A11934Ph_ph4 = DecimalUtil.ZERO ;
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
      Z653OpeNom = "" ;
      T01IE7_A10364Ph_numero = new int[1] ;
      T01IE7_A407EmprNom = new String[] {""} ;
      T01IE7_n407EmprNom = new boolean[] {false} ;
      T01IE7_A10365Ph_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IE7_n10365Ph_fec = new boolean[] {false} ;
      T01IE7_A10366Ph_Disp = new String[] {""} ;
      T01IE7_n10366Ph_Disp = new boolean[] {false} ;
      T01IE7_A10367Ph_Ref = new String[] {""} ;
      T01IE7_n10367Ph_Ref = new boolean[] {false} ;
      T01IE7_A10368Ph_Art = new String[] {""} ;
      T01IE7_n10368Ph_Art = new boolean[] {false} ;
      T01IE7_A10369Ph_Mat = new String[] {""} ;
      T01IE7_n10369Ph_Mat = new boolean[] {false} ;
      T01IE7_A10370Ph_ColN = new String[] {""} ;
      T01IE7_n10370Ph_ColN = new boolean[] {false} ;
      T01IE7_A10371Ph_ColNn = new int[1] ;
      T01IE7_n10371Ph_ColNn = new boolean[] {false} ;
      T01IE7_A10372Ph_Tc = new byte[1] ;
      T01IE7_n10372Ph_Tc = new boolean[] {false} ;
      T01IE7_A10373Ph_Maq = new String[] {""} ;
      T01IE7_n10373Ph_Maq = new boolean[] {false} ;
      T01IE7_A10374Ph_Cli = new int[1] ;
      T01IE7_n10374Ph_Cli = new boolean[] {false} ;
      T01IE7_A10375Ph_Cln = new String[] {""} ;
      T01IE7_n10375Ph_Cln = new boolean[] {false} ;
      T01IE7_A10376Ph_norma = new String[] {""} ;
      T01IE7_n10376Ph_norma = new boolean[] {false} ;
      T01IE7_A10377Ph_ph = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE7_n10377Ph_ph = new boolean[] {false} ;
      T01IE7_A653OpeNom = new String[] {""} ;
      T01IE7_n653OpeNom = new boolean[] {false} ;
      T01IE7_A10378Ph_obs = new String[] {""} ;
      T01IE7_n10378Ph_obs = new boolean[] {false} ;
      T01IE7_A10844Ph_ph2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE7_n10844Ph_ph2 = new boolean[] {false} ;
      T01IE7_A10845Ph_ph3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE7_n10845Ph_ph3 = new boolean[] {false} ;
      T01IE7_A11800PhRqMn = new String[] {""} ;
      T01IE7_n11800PhRqMn = new boolean[] {false} ;
      T01IE7_A11801PhTpMn = new String[] {""} ;
      T01IE7_n11801PhTpMn = new boolean[] {false} ;
      T01IE7_A11802PhSt = new byte[1] ;
      T01IE7_n11802PhSt = new boolean[] {false} ;
      T01IE7_A11918PhMetodo = new String[] {""} ;
      T01IE7_n11918PhMetodo = new boolean[] {false} ;
      T01IE7_A11934Ph_ph4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE7_n11934Ph_ph4 = new boolean[] {false} ;
      T01IE7_A396EmprCod = new String[] {""} ;
      T01IE7_A129BarCod = new int[1] ;
      T01IE7_n129BarCod = new boolean[] {false} ;
      T01IE7_A132BarCodReo = new byte[1] ;
      T01IE7_n132BarCodReo = new boolean[] {false} ;
      T01IE7_A130BarCodPar = new String[] {""} ;
      T01IE7_n130BarCodPar = new boolean[] {false} ;
      T01IE7_A652OpeCod = new int[1] ;
      T01IE7_n652OpeCod = new boolean[] {false} ;
      T01IE4_A407EmprNom = new String[] {""} ;
      T01IE4_n407EmprNom = new boolean[] {false} ;
      T01IE5_A396EmprCod = new String[] {""} ;
      T01IE6_A653OpeNom = new String[] {""} ;
      T01IE6_n653OpeNom = new boolean[] {false} ;
      T01IE8_A407EmprNom = new String[] {""} ;
      T01IE8_n407EmprNom = new boolean[] {false} ;
      T01IE9_A396EmprCod = new String[] {""} ;
      T01IE10_A653OpeNom = new String[] {""} ;
      T01IE10_n653OpeNom = new boolean[] {false} ;
      T01IE11_A396EmprCod = new String[] {""} ;
      T01IE11_A10364Ph_numero = new int[1] ;
      T01IE3_A10364Ph_numero = new int[1] ;
      T01IE3_A10365Ph_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IE3_n10365Ph_fec = new boolean[] {false} ;
      T01IE3_A10366Ph_Disp = new String[] {""} ;
      T01IE3_n10366Ph_Disp = new boolean[] {false} ;
      T01IE3_A10367Ph_Ref = new String[] {""} ;
      T01IE3_n10367Ph_Ref = new boolean[] {false} ;
      T01IE3_A10368Ph_Art = new String[] {""} ;
      T01IE3_n10368Ph_Art = new boolean[] {false} ;
      T01IE3_A10369Ph_Mat = new String[] {""} ;
      T01IE3_n10369Ph_Mat = new boolean[] {false} ;
      T01IE3_A10370Ph_ColN = new String[] {""} ;
      T01IE3_n10370Ph_ColN = new boolean[] {false} ;
      T01IE3_A10371Ph_ColNn = new int[1] ;
      T01IE3_n10371Ph_ColNn = new boolean[] {false} ;
      T01IE3_A10372Ph_Tc = new byte[1] ;
      T01IE3_n10372Ph_Tc = new boolean[] {false} ;
      T01IE3_A10373Ph_Maq = new String[] {""} ;
      T01IE3_n10373Ph_Maq = new boolean[] {false} ;
      T01IE3_A10374Ph_Cli = new int[1] ;
      T01IE3_n10374Ph_Cli = new boolean[] {false} ;
      T01IE3_A10375Ph_Cln = new String[] {""} ;
      T01IE3_n10375Ph_Cln = new boolean[] {false} ;
      T01IE3_A10376Ph_norma = new String[] {""} ;
      T01IE3_n10376Ph_norma = new boolean[] {false} ;
      T01IE3_A10377Ph_ph = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE3_n10377Ph_ph = new boolean[] {false} ;
      T01IE3_A10378Ph_obs = new String[] {""} ;
      T01IE3_n10378Ph_obs = new boolean[] {false} ;
      T01IE3_A10844Ph_ph2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE3_n10844Ph_ph2 = new boolean[] {false} ;
      T01IE3_A10845Ph_ph3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE3_n10845Ph_ph3 = new boolean[] {false} ;
      T01IE3_A11800PhRqMn = new String[] {""} ;
      T01IE3_n11800PhRqMn = new boolean[] {false} ;
      T01IE3_A11801PhTpMn = new String[] {""} ;
      T01IE3_n11801PhTpMn = new boolean[] {false} ;
      T01IE3_A11802PhSt = new byte[1] ;
      T01IE3_n11802PhSt = new boolean[] {false} ;
      T01IE3_A11918PhMetodo = new String[] {""} ;
      T01IE3_n11918PhMetodo = new boolean[] {false} ;
      T01IE3_A11934Ph_ph4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE3_n11934Ph_ph4 = new boolean[] {false} ;
      T01IE3_A396EmprCod = new String[] {""} ;
      T01IE3_A129BarCod = new int[1] ;
      T01IE3_n129BarCod = new boolean[] {false} ;
      T01IE3_A132BarCodReo = new byte[1] ;
      T01IE3_n132BarCodReo = new boolean[] {false} ;
      T01IE3_A130BarCodPar = new String[] {""} ;
      T01IE3_n130BarCodPar = new boolean[] {false} ;
      T01IE3_A652OpeCod = new int[1] ;
      T01IE3_n652OpeCod = new boolean[] {false} ;
      sMode1403 = "" ;
      T01IE12_A396EmprCod = new String[] {""} ;
      T01IE12_A10364Ph_numero = new int[1] ;
      T01IE13_A396EmprCod = new String[] {""} ;
      T01IE13_A10364Ph_numero = new int[1] ;
      T01IE2_A10364Ph_numero = new int[1] ;
      T01IE2_A10365Ph_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IE2_n10365Ph_fec = new boolean[] {false} ;
      T01IE2_A10366Ph_Disp = new String[] {""} ;
      T01IE2_n10366Ph_Disp = new boolean[] {false} ;
      T01IE2_A10367Ph_Ref = new String[] {""} ;
      T01IE2_n10367Ph_Ref = new boolean[] {false} ;
      T01IE2_A10368Ph_Art = new String[] {""} ;
      T01IE2_n10368Ph_Art = new boolean[] {false} ;
      T01IE2_A10369Ph_Mat = new String[] {""} ;
      T01IE2_n10369Ph_Mat = new boolean[] {false} ;
      T01IE2_A10370Ph_ColN = new String[] {""} ;
      T01IE2_n10370Ph_ColN = new boolean[] {false} ;
      T01IE2_A10371Ph_ColNn = new int[1] ;
      T01IE2_n10371Ph_ColNn = new boolean[] {false} ;
      T01IE2_A10372Ph_Tc = new byte[1] ;
      T01IE2_n10372Ph_Tc = new boolean[] {false} ;
      T01IE2_A10373Ph_Maq = new String[] {""} ;
      T01IE2_n10373Ph_Maq = new boolean[] {false} ;
      T01IE2_A10374Ph_Cli = new int[1] ;
      T01IE2_n10374Ph_Cli = new boolean[] {false} ;
      T01IE2_A10375Ph_Cln = new String[] {""} ;
      T01IE2_n10375Ph_Cln = new boolean[] {false} ;
      T01IE2_A10376Ph_norma = new String[] {""} ;
      T01IE2_n10376Ph_norma = new boolean[] {false} ;
      T01IE2_A10377Ph_ph = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE2_n10377Ph_ph = new boolean[] {false} ;
      T01IE2_A10378Ph_obs = new String[] {""} ;
      T01IE2_n10378Ph_obs = new boolean[] {false} ;
      T01IE2_A10844Ph_ph2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE2_n10844Ph_ph2 = new boolean[] {false} ;
      T01IE2_A10845Ph_ph3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE2_n10845Ph_ph3 = new boolean[] {false} ;
      T01IE2_A11800PhRqMn = new String[] {""} ;
      T01IE2_n11800PhRqMn = new boolean[] {false} ;
      T01IE2_A11801PhTpMn = new String[] {""} ;
      T01IE2_n11801PhTpMn = new boolean[] {false} ;
      T01IE2_A11802PhSt = new byte[1] ;
      T01IE2_n11802PhSt = new boolean[] {false} ;
      T01IE2_A11918PhMetodo = new String[] {""} ;
      T01IE2_n11918PhMetodo = new boolean[] {false} ;
      T01IE2_A11934Ph_ph4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IE2_n11934Ph_ph4 = new boolean[] {false} ;
      T01IE2_A396EmprCod = new String[] {""} ;
      T01IE2_A129BarCod = new int[1] ;
      T01IE2_n129BarCod = new boolean[] {false} ;
      T01IE2_A132BarCodReo = new byte[1] ;
      T01IE2_n132BarCodReo = new boolean[] {false} ;
      T01IE2_A130BarCodPar = new String[] {""} ;
      T01IE2_n130BarCodPar = new boolean[] {false} ;
      T01IE2_A652OpeCod = new int[1] ;
      T01IE2_n652OpeCod = new boolean[] {false} ;
      T01IE17_A407EmprNom = new String[] {""} ;
      T01IE17_n407EmprNom = new boolean[] {false} ;
      T01IE18_A653OpeNom = new String[] {""} ;
      T01IE18_n653OpeNom = new boolean[] {false} ;
      T01IE19_A396EmprCod = new String[] {""} ;
      T01IE19_A10364Ph_numero = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z11763Ph_mda = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ10365Ph_fec = GXutil.nullDate() ;
      ZZ10366Ph_Disp = "" ;
      ZZ10367Ph_Ref = "" ;
      ZZ10368Ph_Art = "" ;
      ZZ10369Ph_Mat = "" ;
      ZZ10370Ph_ColN = "" ;
      ZZ10373Ph_Maq = "" ;
      ZZ10375Ph_Cln = "" ;
      ZZ10376Ph_norma = "" ;
      ZZ10377Ph_ph = DecimalUtil.ZERO ;
      ZZ10378Ph_obs = "" ;
      ZZ10844Ph_ph2 = DecimalUtil.ZERO ;
      ZZ10845Ph_ph3 = DecimalUtil.ZERO ;
      ZZ11800PhRqMn = "" ;
      ZZ11801PhTpMn = "" ;
      ZZ11918PhMetodo = "" ;
      ZZ11934Ph_ph4 = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ653OpeNom = "" ;
      ZZ11763Ph_mda = DecimalUtil.ZERO ;
      T01IE20_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tptph__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tptph__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tptph__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tptph__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tptph__default(),
         new Object[] {
             new Object[] {
            T01IE2_A10364Ph_numero, T01IE2_A10365Ph_fec, T01IE2_n10365Ph_fec, T01IE2_A10366Ph_Disp, T01IE2_n10366Ph_Disp, T01IE2_A10367Ph_Ref, T01IE2_n10367Ph_Ref, T01IE2_A10368Ph_Art, T01IE2_n10368Ph_Art, T01IE2_A10369Ph_Mat,
            T01IE2_n10369Ph_Mat, T01IE2_A10370Ph_ColN, T01IE2_n10370Ph_ColN, T01IE2_A10371Ph_ColNn, T01IE2_n10371Ph_ColNn, T01IE2_A10372Ph_Tc, T01IE2_n10372Ph_Tc, T01IE2_A10373Ph_Maq, T01IE2_n10373Ph_Maq, T01IE2_A10374Ph_Cli,
            T01IE2_n10374Ph_Cli, T01IE2_A10375Ph_Cln, T01IE2_n10375Ph_Cln, T01IE2_A10376Ph_norma, T01IE2_n10376Ph_norma, T01IE2_A10377Ph_ph, T01IE2_n10377Ph_ph, T01IE2_A10378Ph_obs, T01IE2_n10378Ph_obs, T01IE2_A10844Ph_ph2,
            T01IE2_n10844Ph_ph2, T01IE2_A10845Ph_ph3, T01IE2_n10845Ph_ph3, T01IE2_A11800PhRqMn, T01IE2_n11800PhRqMn, T01IE2_A11801PhTpMn, T01IE2_n11801PhTpMn, T01IE2_A11802PhSt, T01IE2_n11802PhSt, T01IE2_A11918PhMetodo,
            T01IE2_n11918PhMetodo, T01IE2_A11934Ph_ph4, T01IE2_n11934Ph_ph4, T01IE2_A396EmprCod, T01IE2_A129BarCod, T01IE2_n129BarCod, T01IE2_A132BarCodReo, T01IE2_n132BarCodReo, T01IE2_A130BarCodPar, T01IE2_n130BarCodPar,
            T01IE2_A652OpeCod, T01IE2_n652OpeCod
            }
            , new Object[] {
            T01IE3_A10364Ph_numero, T01IE3_A10365Ph_fec, T01IE3_n10365Ph_fec, T01IE3_A10366Ph_Disp, T01IE3_n10366Ph_Disp, T01IE3_A10367Ph_Ref, T01IE3_n10367Ph_Ref, T01IE3_A10368Ph_Art, T01IE3_n10368Ph_Art, T01IE3_A10369Ph_Mat,
            T01IE3_n10369Ph_Mat, T01IE3_A10370Ph_ColN, T01IE3_n10370Ph_ColN, T01IE3_A10371Ph_ColNn, T01IE3_n10371Ph_ColNn, T01IE3_A10372Ph_Tc, T01IE3_n10372Ph_Tc, T01IE3_A10373Ph_Maq, T01IE3_n10373Ph_Maq, T01IE3_A10374Ph_Cli,
            T01IE3_n10374Ph_Cli, T01IE3_A10375Ph_Cln, T01IE3_n10375Ph_Cln, T01IE3_A10376Ph_norma, T01IE3_n10376Ph_norma, T01IE3_A10377Ph_ph, T01IE3_n10377Ph_ph, T01IE3_A10378Ph_obs, T01IE3_n10378Ph_obs, T01IE3_A10844Ph_ph2,
            T01IE3_n10844Ph_ph2, T01IE3_A10845Ph_ph3, T01IE3_n10845Ph_ph3, T01IE3_A11800PhRqMn, T01IE3_n11800PhRqMn, T01IE3_A11801PhTpMn, T01IE3_n11801PhTpMn, T01IE3_A11802PhSt, T01IE3_n11802PhSt, T01IE3_A11918PhMetodo,
            T01IE3_n11918PhMetodo, T01IE3_A11934Ph_ph4, T01IE3_n11934Ph_ph4, T01IE3_A396EmprCod, T01IE3_A129BarCod, T01IE3_n129BarCod, T01IE3_A132BarCodReo, T01IE3_n132BarCodReo, T01IE3_A130BarCodPar, T01IE3_n130BarCodPar,
            T01IE3_A652OpeCod, T01IE3_n652OpeCod
            }
            , new Object[] {
            T01IE4_A407EmprNom, T01IE4_n407EmprNom
            }
            , new Object[] {
            T01IE5_A396EmprCod
            }
            , new Object[] {
            T01IE6_A653OpeNom, T01IE6_n653OpeNom
            }
            , new Object[] {
            T01IE7_A10364Ph_numero, T01IE7_A407EmprNom, T01IE7_n407EmprNom, T01IE7_A10365Ph_fec, T01IE7_n10365Ph_fec, T01IE7_A10366Ph_Disp, T01IE7_n10366Ph_Disp, T01IE7_A10367Ph_Ref, T01IE7_n10367Ph_Ref, T01IE7_A10368Ph_Art,
            T01IE7_n10368Ph_Art, T01IE7_A10369Ph_Mat, T01IE7_n10369Ph_Mat, T01IE7_A10370Ph_ColN, T01IE7_n10370Ph_ColN, T01IE7_A10371Ph_ColNn, T01IE7_n10371Ph_ColNn, T01IE7_A10372Ph_Tc, T01IE7_n10372Ph_Tc, T01IE7_A10373Ph_Maq,
            T01IE7_n10373Ph_Maq, T01IE7_A10374Ph_Cli, T01IE7_n10374Ph_Cli, T01IE7_A10375Ph_Cln, T01IE7_n10375Ph_Cln, T01IE7_A10376Ph_norma, T01IE7_n10376Ph_norma, T01IE7_A10377Ph_ph, T01IE7_n10377Ph_ph, T01IE7_A653OpeNom,
            T01IE7_n653OpeNom, T01IE7_A10378Ph_obs, T01IE7_n10378Ph_obs, T01IE7_A10844Ph_ph2, T01IE7_n10844Ph_ph2, T01IE7_A10845Ph_ph3, T01IE7_n10845Ph_ph3, T01IE7_A11800PhRqMn, T01IE7_n11800PhRqMn, T01IE7_A11801PhTpMn,
            T01IE7_n11801PhTpMn, T01IE7_A11802PhSt, T01IE7_n11802PhSt, T01IE7_A11918PhMetodo, T01IE7_n11918PhMetodo, T01IE7_A11934Ph_ph4, T01IE7_n11934Ph_ph4, T01IE7_A396EmprCod, T01IE7_A129BarCod, T01IE7_n129BarCod,
            T01IE7_A132BarCodReo, T01IE7_n132BarCodReo, T01IE7_A130BarCodPar, T01IE7_n130BarCodPar, T01IE7_A652OpeCod, T01IE7_n652OpeCod
            }
            , new Object[] {
            T01IE8_A407EmprNom, T01IE8_n407EmprNom
            }
            , new Object[] {
            T01IE9_A396EmprCod
            }
            , new Object[] {
            T01IE10_A653OpeNom, T01IE10_n653OpeNom
            }
            , new Object[] {
            T01IE11_A396EmprCod, T01IE11_A10364Ph_numero
            }
            , new Object[] {
            T01IE12_A396EmprCod, T01IE12_A10364Ph_numero
            }
            , new Object[] {
            T01IE13_A396EmprCod, T01IE13_A10364Ph_numero
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IE17_A407EmprNom, T01IE17_n407EmprNom
            }
            , new Object[] {
            T01IE18_A653OpeNom, T01IE18_n653OpeNom
            }
            , new Object[] {
            T01IE19_A396EmprCod, T01IE19_A10364Ph_numero
            }
            , new Object[] {
            T01IE20_A396EmprCod
            }
         }
      );
   }

   private byte Z10372Ph_Tc ;
   private byte Z11802PhSt ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A10372Ph_Tc ;
   private byte A11802PhSt ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ10372Ph_Tc ;
   private byte ZZ11802PhSt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1403 ;
   private short nIsDirty_1403 ;
   private int Z10364Ph_numero ;
   private int Z10371Ph_ColNn ;
   private int Z10374Ph_Cli ;
   private int Z129BarCod ;
   private int Z652OpeCod ;
   private int A129BarCod ;
   private int A652OpeCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int A10364Ph_numero ;
   private int edtPh_numero_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPh_fec_Enabled ;
   private int edtPh_Disp_Enabled ;
   private int edtPh_Ref_Enabled ;
   private int edtPh_Art_Enabled ;
   private int edtPh_Mat_Enabled ;
   private int edtPh_ColN_Enabled ;
   private int A10371Ph_ColNn ;
   private int edtPh_ColNn_Enabled ;
   private int edtPh_Tc_Enabled ;
   private int edtPh_Maq_Enabled ;
   private int A10374Ph_Cli ;
   private int edtPh_Cli_Enabled ;
   private int edtPh_Cln_Enabled ;
   private int edtPh_norma_Enabled ;
   private int edtPh_ph_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtPh_obs_Enabled ;
   private int edtPh_ph2_Enabled ;
   private int edtPh_ph3_Enabled ;
   private int edtPh_mda_Enabled ;
   private int edtPhRqMn_Enabled ;
   private int edtPhTpMn_Enabled ;
   private int edtPhSt_Enabled ;
   private int edtPhMetodo_Enabled ;
   private int edtPh_ph4_Enabled ;
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
   private int edtPh_ph4_Backcolor ;
   private int edtPhMetodo_Backcolor ;
   private int edtPhSt_Backcolor ;
   private int edtPhTpMn_Backcolor ;
   private int edtPhRqMn_Backcolor ;
   private int edtPh_mda_Backcolor ;
   private int edtPh_ph3_Backcolor ;
   private int edtPh_ph2_Backcolor ;
   private int edtPh_obs_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtPh_ph_Backcolor ;
   private int edtPh_norma_Backcolor ;
   private int edtPh_Cln_Backcolor ;
   private int edtPh_Cli_Backcolor ;
   private int edtPh_Maq_Backcolor ;
   private int edtPh_Tc_Backcolor ;
   private int edtPh_ColNn_Backcolor ;
   private int edtPh_ColN_Backcolor ;
   private int edtPh_Mat_Backcolor ;
   private int edtPh_Art_Backcolor ;
   private int edtPh_Ref_Backcolor ;
   private int edtPh_Disp_Backcolor ;
   private int edtPh_fec_Backcolor ;
   private int edtPh_numero_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10364Ph_numero ;
   private int ZZ129BarCod ;
   private int ZZ10371Ph_ColNn ;
   private int ZZ10374Ph_Cli ;
   private int ZZ652OpeCod ;
   private java.math.BigDecimal Z10377Ph_ph ;
   private java.math.BigDecimal Z10844Ph_ph2 ;
   private java.math.BigDecimal Z10845Ph_ph3 ;
   private java.math.BigDecimal Z11934Ph_ph4 ;
   private java.math.BigDecimal A10377Ph_ph ;
   private java.math.BigDecimal A10844Ph_ph2 ;
   private java.math.BigDecimal A10845Ph_ph3 ;
   private java.math.BigDecimal A11763Ph_mda ;
   private java.math.BigDecimal A11934Ph_ph4 ;
   private java.math.BigDecimal Z11763Ph_mda ;
   private java.math.BigDecimal ZZ10377Ph_ph ;
   private java.math.BigDecimal ZZ10844Ph_ph2 ;
   private java.math.BigDecimal ZZ10845Ph_ph3 ;
   private java.math.BigDecimal ZZ11934Ph_ph4 ;
   private java.math.BigDecimal ZZ11763Ph_mda ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10366Ph_Disp ;
   private String Z10367Ph_Ref ;
   private String Z10368Ph_Art ;
   private String Z10369Ph_Mat ;
   private String Z10370Ph_ColN ;
   private String Z10373Ph_Maq ;
   private String Z10375Ph_Cln ;
   private String Z10376Ph_norma ;
   private String Z11800PhRqMn ;
   private String Z11801PhTpMn ;
   private String Z11918PhMetodo ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtPh_numero_Internalname ;
   private String edtPh_numero_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPh_fec_Internalname ;
   private String edtPh_fec_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPh_Disp_Internalname ;
   private String A10366Ph_Disp ;
   private String edtPh_Disp_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPh_Ref_Internalname ;
   private String A10367Ph_Ref ;
   private String edtPh_Ref_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPh_Art_Internalname ;
   private String A10368Ph_Art ;
   private String edtPh_Art_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPh_Mat_Internalname ;
   private String A10369Ph_Mat ;
   private String edtPh_Mat_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPh_ColN_Internalname ;
   private String A10370Ph_ColN ;
   private String edtPh_ColN_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPh_ColNn_Internalname ;
   private String edtPh_ColNn_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtPh_Tc_Internalname ;
   private String edtPh_Tc_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtPh_Maq_Internalname ;
   private String A10373Ph_Maq ;
   private String edtPh_Maq_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtPh_Cli_Internalname ;
   private String edtPh_Cli_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtPh_Cln_Internalname ;
   private String A10375Ph_Cln ;
   private String edtPh_Cln_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtPh_norma_Internalname ;
   private String A10376Ph_norma ;
   private String edtPh_norma_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtPh_ph_Internalname ;
   private String edtPh_ph_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtOpeCod_Internalname ;
   private String edtOpeCod_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtOpeNom_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtPh_obs_Internalname ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtPh_ph2_Internalname ;
   private String edtPh_ph2_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtPh_ph3_Internalname ;
   private String edtPh_ph3_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtPh_mda_Internalname ;
   private String edtPh_mda_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtPhRqMn_Internalname ;
   private String A11800PhRqMn ;
   private String edtPhRqMn_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtPhTpMn_Internalname ;
   private String A11801PhTpMn ;
   private String edtPhTpMn_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtPhSt_Internalname ;
   private String edtPhSt_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtPhMetodo_Internalname ;
   private String A11918PhMetodo ;
   private String edtPhMetodo_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtPh_ph4_Internalname ;
   private String edtPh_ph4_Jsonclick ;
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
   private String Z653OpeNom ;
   private String sMode1403 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ10366Ph_Disp ;
   private String ZZ10367Ph_Ref ;
   private String ZZ10368Ph_Art ;
   private String ZZ10369Ph_Mat ;
   private String ZZ10370Ph_ColN ;
   private String ZZ10373Ph_Maq ;
   private String ZZ10375Ph_Cln ;
   private String ZZ10376Ph_norma ;
   private String ZZ11800PhRqMn ;
   private String ZZ11801PhTpMn ;
   private String ZZ11918PhMetodo ;
   private String ZZ407EmprNom ;
   private String ZZ653OpeNom ;
   private java.util.Date Z10365Ph_fec ;
   private java.util.Date A10365Ph_fec ;
   private java.util.Date ZZ10365Ph_fec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10365Ph_fec ;
   private boolean n10366Ph_Disp ;
   private boolean n10367Ph_Ref ;
   private boolean n10368Ph_Art ;
   private boolean n10369Ph_Mat ;
   private boolean n10370Ph_ColN ;
   private boolean n10371Ph_ColNn ;
   private boolean n10372Ph_Tc ;
   private boolean n10373Ph_Maq ;
   private boolean n10374Ph_Cli ;
   private boolean n10375Ph_Cln ;
   private boolean n10376Ph_norma ;
   private boolean n10377Ph_ph ;
   private boolean n653OpeNom ;
   private boolean n10378Ph_obs ;
   private boolean n10844Ph_ph2 ;
   private boolean n10845Ph_ph3 ;
   private boolean n11800PhRqMn ;
   private boolean n11801PhTpMn ;
   private boolean n11802PhSt ;
   private boolean n11918PhMetodo ;
   private boolean n11934Ph_ph4 ;
   private boolean Gx_longc ;
   private String Z10378Ph_obs ;
   private String A10378Ph_obs ;
   private String ZZ10378Ph_obs ;
   private IDataStoreProvider pr_default ;
   private int[] T01IE7_A10364Ph_numero ;
   private String[] T01IE7_A407EmprNom ;
   private boolean[] T01IE7_n407EmprNom ;
   private java.util.Date[] T01IE7_A10365Ph_fec ;
   private boolean[] T01IE7_n10365Ph_fec ;
   private String[] T01IE7_A10366Ph_Disp ;
   private boolean[] T01IE7_n10366Ph_Disp ;
   private String[] T01IE7_A10367Ph_Ref ;
   private boolean[] T01IE7_n10367Ph_Ref ;
   private String[] T01IE7_A10368Ph_Art ;
   private boolean[] T01IE7_n10368Ph_Art ;
   private String[] T01IE7_A10369Ph_Mat ;
   private boolean[] T01IE7_n10369Ph_Mat ;
   private String[] T01IE7_A10370Ph_ColN ;
   private boolean[] T01IE7_n10370Ph_ColN ;
   private int[] T01IE7_A10371Ph_ColNn ;
   private boolean[] T01IE7_n10371Ph_ColNn ;
   private byte[] T01IE7_A10372Ph_Tc ;
   private boolean[] T01IE7_n10372Ph_Tc ;
   private String[] T01IE7_A10373Ph_Maq ;
   private boolean[] T01IE7_n10373Ph_Maq ;
   private int[] T01IE7_A10374Ph_Cli ;
   private boolean[] T01IE7_n10374Ph_Cli ;
   private String[] T01IE7_A10375Ph_Cln ;
   private boolean[] T01IE7_n10375Ph_Cln ;
   private String[] T01IE7_A10376Ph_norma ;
   private boolean[] T01IE7_n10376Ph_norma ;
   private java.math.BigDecimal[] T01IE7_A10377Ph_ph ;
   private boolean[] T01IE7_n10377Ph_ph ;
   private String[] T01IE7_A653OpeNom ;
   private boolean[] T01IE7_n653OpeNom ;
   private String[] T01IE7_A10378Ph_obs ;
   private boolean[] T01IE7_n10378Ph_obs ;
   private java.math.BigDecimal[] T01IE7_A10844Ph_ph2 ;
   private boolean[] T01IE7_n10844Ph_ph2 ;
   private java.math.BigDecimal[] T01IE7_A10845Ph_ph3 ;
   private boolean[] T01IE7_n10845Ph_ph3 ;
   private String[] T01IE7_A11800PhRqMn ;
   private boolean[] T01IE7_n11800PhRqMn ;
   private String[] T01IE7_A11801PhTpMn ;
   private boolean[] T01IE7_n11801PhTpMn ;
   private byte[] T01IE7_A11802PhSt ;
   private boolean[] T01IE7_n11802PhSt ;
   private String[] T01IE7_A11918PhMetodo ;
   private boolean[] T01IE7_n11918PhMetodo ;
   private java.math.BigDecimal[] T01IE7_A11934Ph_ph4 ;
   private boolean[] T01IE7_n11934Ph_ph4 ;
   private String[] T01IE7_A396EmprCod ;
   private int[] T01IE7_A129BarCod ;
   private boolean[] T01IE7_n129BarCod ;
   private byte[] T01IE7_A132BarCodReo ;
   private boolean[] T01IE7_n132BarCodReo ;
   private String[] T01IE7_A130BarCodPar ;
   private boolean[] T01IE7_n130BarCodPar ;
   private int[] T01IE7_A652OpeCod ;
   private boolean[] T01IE7_n652OpeCod ;
   private String[] T01IE4_A407EmprNom ;
   private boolean[] T01IE4_n407EmprNom ;
   private String[] T01IE5_A396EmprCod ;
   private String[] T01IE6_A653OpeNom ;
   private boolean[] T01IE6_n653OpeNom ;
   private String[] T01IE8_A407EmprNom ;
   private boolean[] T01IE8_n407EmprNom ;
   private String[] T01IE9_A396EmprCod ;
   private String[] T01IE10_A653OpeNom ;
   private boolean[] T01IE10_n653OpeNom ;
   private String[] T01IE11_A396EmprCod ;
   private int[] T01IE11_A10364Ph_numero ;
   private int[] T01IE3_A10364Ph_numero ;
   private java.util.Date[] T01IE3_A10365Ph_fec ;
   private boolean[] T01IE3_n10365Ph_fec ;
   private String[] T01IE3_A10366Ph_Disp ;
   private boolean[] T01IE3_n10366Ph_Disp ;
   private String[] T01IE3_A10367Ph_Ref ;
   private boolean[] T01IE3_n10367Ph_Ref ;
   private String[] T01IE3_A10368Ph_Art ;
   private boolean[] T01IE3_n10368Ph_Art ;
   private String[] T01IE3_A10369Ph_Mat ;
   private boolean[] T01IE3_n10369Ph_Mat ;
   private String[] T01IE3_A10370Ph_ColN ;
   private boolean[] T01IE3_n10370Ph_ColN ;
   private int[] T01IE3_A10371Ph_ColNn ;
   private boolean[] T01IE3_n10371Ph_ColNn ;
   private byte[] T01IE3_A10372Ph_Tc ;
   private boolean[] T01IE3_n10372Ph_Tc ;
   private String[] T01IE3_A10373Ph_Maq ;
   private boolean[] T01IE3_n10373Ph_Maq ;
   private int[] T01IE3_A10374Ph_Cli ;
   private boolean[] T01IE3_n10374Ph_Cli ;
   private String[] T01IE3_A10375Ph_Cln ;
   private boolean[] T01IE3_n10375Ph_Cln ;
   private String[] T01IE3_A10376Ph_norma ;
   private boolean[] T01IE3_n10376Ph_norma ;
   private java.math.BigDecimal[] T01IE3_A10377Ph_ph ;
   private boolean[] T01IE3_n10377Ph_ph ;
   private String[] T01IE3_A10378Ph_obs ;
   private boolean[] T01IE3_n10378Ph_obs ;
   private java.math.BigDecimal[] T01IE3_A10844Ph_ph2 ;
   private boolean[] T01IE3_n10844Ph_ph2 ;
   private java.math.BigDecimal[] T01IE3_A10845Ph_ph3 ;
   private boolean[] T01IE3_n10845Ph_ph3 ;
   private String[] T01IE3_A11800PhRqMn ;
   private boolean[] T01IE3_n11800PhRqMn ;
   private String[] T01IE3_A11801PhTpMn ;
   private boolean[] T01IE3_n11801PhTpMn ;
   private byte[] T01IE3_A11802PhSt ;
   private boolean[] T01IE3_n11802PhSt ;
   private String[] T01IE3_A11918PhMetodo ;
   private boolean[] T01IE3_n11918PhMetodo ;
   private java.math.BigDecimal[] T01IE3_A11934Ph_ph4 ;
   private boolean[] T01IE3_n11934Ph_ph4 ;
   private String[] T01IE3_A396EmprCod ;
   private int[] T01IE3_A129BarCod ;
   private boolean[] T01IE3_n129BarCod ;
   private byte[] T01IE3_A132BarCodReo ;
   private boolean[] T01IE3_n132BarCodReo ;
   private String[] T01IE3_A130BarCodPar ;
   private boolean[] T01IE3_n130BarCodPar ;
   private int[] T01IE3_A652OpeCod ;
   private boolean[] T01IE3_n652OpeCod ;
   private String[] T01IE12_A396EmprCod ;
   private int[] T01IE12_A10364Ph_numero ;
   private String[] T01IE13_A396EmprCod ;
   private int[] T01IE13_A10364Ph_numero ;
   private int[] T01IE2_A10364Ph_numero ;
   private java.util.Date[] T01IE2_A10365Ph_fec ;
   private boolean[] T01IE2_n10365Ph_fec ;
   private String[] T01IE2_A10366Ph_Disp ;
   private boolean[] T01IE2_n10366Ph_Disp ;
   private String[] T01IE2_A10367Ph_Ref ;
   private boolean[] T01IE2_n10367Ph_Ref ;
   private String[] T01IE2_A10368Ph_Art ;
   private boolean[] T01IE2_n10368Ph_Art ;
   private String[] T01IE2_A10369Ph_Mat ;
   private boolean[] T01IE2_n10369Ph_Mat ;
   private String[] T01IE2_A10370Ph_ColN ;
   private boolean[] T01IE2_n10370Ph_ColN ;
   private int[] T01IE2_A10371Ph_ColNn ;
   private boolean[] T01IE2_n10371Ph_ColNn ;
   private byte[] T01IE2_A10372Ph_Tc ;
   private boolean[] T01IE2_n10372Ph_Tc ;
   private String[] T01IE2_A10373Ph_Maq ;
   private boolean[] T01IE2_n10373Ph_Maq ;
   private int[] T01IE2_A10374Ph_Cli ;
   private boolean[] T01IE2_n10374Ph_Cli ;
   private String[] T01IE2_A10375Ph_Cln ;
   private boolean[] T01IE2_n10375Ph_Cln ;
   private String[] T01IE2_A10376Ph_norma ;
   private boolean[] T01IE2_n10376Ph_norma ;
   private java.math.BigDecimal[] T01IE2_A10377Ph_ph ;
   private boolean[] T01IE2_n10377Ph_ph ;
   private String[] T01IE2_A10378Ph_obs ;
   private boolean[] T01IE2_n10378Ph_obs ;
   private java.math.BigDecimal[] T01IE2_A10844Ph_ph2 ;
   private boolean[] T01IE2_n10844Ph_ph2 ;
   private java.math.BigDecimal[] T01IE2_A10845Ph_ph3 ;
   private boolean[] T01IE2_n10845Ph_ph3 ;
   private String[] T01IE2_A11800PhRqMn ;
   private boolean[] T01IE2_n11800PhRqMn ;
   private String[] T01IE2_A11801PhTpMn ;
   private boolean[] T01IE2_n11801PhTpMn ;
   private byte[] T01IE2_A11802PhSt ;
   private boolean[] T01IE2_n11802PhSt ;
   private String[] T01IE2_A11918PhMetodo ;
   private boolean[] T01IE2_n11918PhMetodo ;
   private java.math.BigDecimal[] T01IE2_A11934Ph_ph4 ;
   private boolean[] T01IE2_n11934Ph_ph4 ;
   private String[] T01IE2_A396EmprCod ;
   private int[] T01IE2_A129BarCod ;
   private boolean[] T01IE2_n129BarCod ;
   private byte[] T01IE2_A132BarCodReo ;
   private boolean[] T01IE2_n132BarCodReo ;
   private String[] T01IE2_A130BarCodPar ;
   private boolean[] T01IE2_n130BarCodPar ;
   private int[] T01IE2_A652OpeCod ;
   private boolean[] T01IE2_n652OpeCod ;
   private String[] T01IE17_A407EmprNom ;
   private boolean[] T01IE17_n407EmprNom ;
   private String[] T01IE18_A653OpeNom ;
   private boolean[] T01IE18_n653OpeNom ;
   private String[] T01IE19_A396EmprCod ;
   private int[] T01IE19_A10364Ph_numero ;
   private String[] T01IE20_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tptph__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptph__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptph__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptph__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptph__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IE2", "SELECT Ph_numero, Ph_fec, Ph_Disp, Ph_Ref, Ph_Art, Ph_Mat, Ph_ColN, Ph_ColNn, Ph_Tc, Ph_Maq, Ph_Cli, Ph_Cln, Ph_norma, Ph_ph, Ph_obs, Ph_ph2, Ph_ph3, PhRqMn, PhTpMn, PhSt, PhMetodo, Ph_ph4, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPTPH WHERE EmprCod = ? AND Ph_numero = ?  FOR UPDATE OF Ph_fec, Ph_Disp, Ph_Ref, Ph_Art, Ph_Mat, Ph_ColN, Ph_ColNn, Ph_Tc, Ph_Maq, Ph_Cli, Ph_Cln, Ph_norma, Ph_ph, Ph_obs, Ph_ph2, Ph_ph3, PhRqMn, PhTpMn, PhSt, PhMetodo, Ph_ph4, BarCod, BarCodReo, BarCodPar, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE3", "SELECT Ph_numero, Ph_fec, Ph_Disp, Ph_Ref, Ph_Art, Ph_Mat, Ph_ColN, Ph_ColNn, Ph_Tc, Ph_Maq, Ph_Cli, Ph_Cln, Ph_norma, Ph_ph, Ph_obs, Ph_ph2, Ph_ph3, PhRqMn, PhTpMn, PhSt, PhMetodo, Ph_ph4, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPTPH WHERE EmprCod = ? AND Ph_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE5", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE6", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE7", "SELECT /*+ FIRST_ROWS(100) */ TM1.Ph_numero, T2.EmprNom, TM1.Ph_fec, TM1.Ph_Disp, TM1.Ph_Ref, TM1.Ph_Art, TM1.Ph_Mat, TM1.Ph_ColN, TM1.Ph_ColNn, TM1.Ph_Tc, TM1.Ph_Maq, TM1.Ph_Cli, TM1.Ph_Cln, TM1.Ph_norma, TM1.Ph_ph, T3.OpeNom, TM1.Ph_obs, TM1.Ph_ph2, TM1.Ph_ph3, TM1.PhRqMn, TM1.PhTpMn, TM1.PhSt, TM1.PhMetodo, TM1.Ph_ph4, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.OpeCod FROM ((TXPTPH TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.Ph_numero = ? ORDER BY TM1.EmprCod, TM1.Ph_numero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE9", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE10", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND Ph_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ph_numero FROM TXPTPH WHERE ( EmprCod > ? or EmprCod = ? and Ph_numero > ?) ORDER BY EmprCod, Ph_numero) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IE13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ph_numero FROM TXPTPH WHERE ( EmprCod < ? or EmprCod = ? and Ph_numero < ?) ORDER BY EmprCod DESC, Ph_numero DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IE14", "INSERT INTO TXPTPH(Ph_numero, Ph_fec, Ph_Disp, Ph_Ref, Ph_Art, Ph_Mat, Ph_ColN, Ph_ColNn, Ph_Tc, Ph_Maq, Ph_Cli, Ph_Cln, Ph_norma, Ph_ph, Ph_obs, Ph_ph2, Ph_ph3, PhRqMn, PhTpMn, PhSt, PhMetodo, Ph_ph4, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTPH")
         ,new UpdateCursor("T01IE15", "UPDATE TXPTPH SET Ph_fec=?, Ph_Disp=?, Ph_Ref=?, Ph_Art=?, Ph_Mat=?, Ph_ColN=?, Ph_ColNn=?, Ph_Tc=?, Ph_Maq=?, Ph_Cli=?, Ph_Cln=?, Ph_norma=?, Ph_ph=?, Ph_obs=?, Ph_ph2=?, Ph_ph3=?, PhRqMn=?, PhTpMn=?, PhSt=?, PhMetodo=?, Ph_ph4=?, BarCod=?, BarCodReo=?, BarCodPar=?, OpeCod=?  WHERE EmprCod = ? AND Ph_numero = ?", GX_NOMASK, "TXPTPH")
         ,new UpdateCursor("T01IE16", "DELETE FROM TXPTPH  WHERE EmprCod = ? AND Ph_numero = ?", GX_NOMASK, "TXPTPH")
         ,new ForEachCursor("T01IE17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE18", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Ph_numero FROM TXPTPH ORDER BY EmprCod, Ph_numero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IE20", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((int[]) buf[44])[0] = rslt.getInt(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(27);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((int[]) buf[44])[0] = rslt.getInt(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(27);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 3);
               ((int[]) buf[48])[0] = rslt.getInt(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((byte[]) buf[50])[0] = rslt.getByte(27);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 8 :
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
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 15);
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
                  stmt.setString(6, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 6);
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 30);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 20);
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
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 800);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 10);
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
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[38]).byteValue());
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
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[42], 2);
               }
               stmt.setString(23, (String)parms[43], 3);
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[45]).intValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[51]).intValue());
               }
               return;
            case 13 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 15);
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
                  stmt.setString(5, (String)parms[9], 16);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 6);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 30);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 20);
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
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 800);
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
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 10);
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
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[37]).byteValue());
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
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 2);
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
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[49]).intValue());
               }
               stmt.setString(26, (String)parms[50], 3);
               stmt.setInt(27, ((Number) parms[51]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
      }
   }

}

