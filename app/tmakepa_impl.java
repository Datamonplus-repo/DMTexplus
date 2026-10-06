package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmakepa_impl extends GXDataArea
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
         A2107PasCod = httpContext.GetPar( "PasCod") ;
         n2107PasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2107PasCod", A2107PasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A2107PasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HACER PASTA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPas_Num_Internalname ;
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
      nRC_GXsfl_90 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_90"))) ;
      nGXsfl_90_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_90_idx"))) ;
      sGXsfl_90_idx = httpContext.GetPar( "sGXsfl_90_idx") ;
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

   public tmakepa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmakepa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmakepa_impl.class ));
   }

   public tmakepa_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMAKEPA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Informe", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_Num_Internalname, GXutil.ltrim( localUtil.ntoc( A9578Pas_Num, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPas_Num_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9578Pas_Num), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9578Pas_Num), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_Num_Jsonclick, 0, "", "", "", "", "", 1, edtPas_Num_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Dia", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPas_Dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_Dia_Internalname, localUtil.format(A9579Pas_Dia, "99/99/99"), localUtil.format( A9579Pas_Dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_Dia_Jsonclick, 0, "", "", "", "", "", 1, edtPas_Dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAKEPA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPas_Dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPas_Dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMAKEPA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Hora", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPas_Hora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_Hora_Internalname, localUtil.ttoc( A9580Pas_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9580Pas_Hora, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_Hora_Jsonclick, 0, "", "", "", "", "", 1, edtPas_Hora_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAKEPA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPas_Hora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPas_Hora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMAKEPA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_Usu_Internalname, GXutil.rtrim( A9581Pas_Usu), GXutil.rtrim( localUtil.format( A9581Pas_Usu, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_Usu_Jsonclick, 0, "", "", "", "", "", 1, edtPas_Usu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Terminal", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_Term_Internalname, GXutil.rtrim( A9582Pas_Term), GXutil.rtrim( localUtil.format( A9582Pas_Term, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_Term_Jsonclick, 0, "", "", "", "", "", 1, edtPas_Term_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo de Pasta", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPasCod_Internalname, GXutil.rtrim( A2107PasCod), GXutil.rtrim( localUtil.format( A2107PasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPasCod_Jsonclick, 0, "", "", "", "", "", 1, edtPasCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPasDsc_Internalname, GXutil.rtrim( A2108PasDsc), GXutil.rtrim( localUtil.format( A2108PasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtPasDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Dia Pesaje", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPas_DiaP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_DiaP_Internalname, localUtil.format(A9585Pas_DiaP, "99/99/99"), localUtil.format( A9585Pas_DiaP, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_DiaP_Jsonclick, 0, "", "", "", "", "", 1, edtPas_DiaP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAKEPA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPas_DiaP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPas_DiaP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMAKEPA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Usuario Pesaje", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_UsuP_Internalname, GXutil.rtrim( A9586Pas_UsuP), GXutil.rtrim( localUtil.format( A9586Pas_UsuP, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_UsuP_Jsonclick, 0, "", "", "", "", "", 1, edtPas_UsuP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Hora Pesaje", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPas_HorP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_HorP_Internalname, localUtil.ttoc( A9587Pas_HorP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9587Pas_HorP, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_HorP_Jsonclick, 0, "", "", "", "", "", 1, edtPas_HorP_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAKEPA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPas_HorP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPas_HorP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMAKEPA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A9588Pas_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPas_Est_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9588Pas_Est), "9") : localUtil.format( DecimalUtil.doubleToDec(A9588Pas_Est), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_Est_Jsonclick, 0, "", "", "", "", "", 1, edtPas_Est_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Kilos Preparar", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPas_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A9589Pas_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPas_Kgs_Enabled!=0) ? localUtil.format( A9589Pas_Kgs, "ZZZZZ9.99") : localUtil.format( A9589Pas_Kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPas_Kgs_Jsonclick, 0, "", "", "", "", "", 1, edtPas_Kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAKEPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol90( ) ;
      nGXsfl_90_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1250 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1250 = (short)(1) ;
            scanStart1461250( ) ;
            while ( RcdFound1250 != 0 )
            {
               init_level_properties1250( ) ;
               getByPrimaryKey1461250( ) ;
               addRow1461250( ) ;
               scanNext1461250( ) ;
            }
            scanEnd1461250( ) ;
            nBlankRcdCount1250 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1461250( ) ;
         standaloneModal1461250( ) ;
         sMode1250 = Gx_mode ;
         while ( nGXsfl_90_idx < nRC_GXsfl_90 )
         {
            bGXsfl_90_Refreshing = true ;
            readRow1461250( ) ;
            edtavnRcdDeleted_1250_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1250_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1250_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1250_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPas_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAS_CANT_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPas_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Cant_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPas_CantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAS_CANTP_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPas_CantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_CantP_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPas_Unid_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAS_UNID_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPas_Unid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Unid_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPas_Order_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAS_ORDER_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPas_Order_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Order_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            if ( ( nRcdExists_1250 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1461250( ) ;
            }
            sendRow1461250( ) ;
            bGXsfl_90_Refreshing = false ;
         }
         Gx_mode = sMode1250 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1250 = (short)(5) ;
         nRcdExists_1250 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1461250( ) ;
            while ( RcdFound1250 != 0 )
            {
               sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_901250( ) ;
               init_level_properties1250( ) ;
               standaloneNotModal1461250( ) ;
               getByPrimaryKey1461250( ) ;
               standaloneModal1461250( ) ;
               addRow1461250( ) ;
               scanNext1461250( ) ;
            }
            scanEnd1461250( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1250 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_901250( ) ;
      initAll1461250( ) ;
      init_level_properties1250( ) ;
      nRcdExists_1250 = (short)(0) ;
      nIsMod_1250 = (short)(0) ;
      nRcdDeleted_1250 = (short)(0) ;
      nBlankRcdCount1250 = (short)(nBlankRcdUsr1250+nBlankRcdCount1250) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1250 > 0 )
      {
         standaloneNotModal1461250( ) ;
         standaloneModal1461250( ) ;
         addRow1461250( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1250 = (short)(nBlankRcdCount1250-1) ;
      }
      Gx_mode = sMode1250 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAKEPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMAKEPA.htm");
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
      e111462 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9578Pas_Num = (int)(localUtil.ctol( httpContext.cgiGet( "Z9578Pas_Num"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9579Pas_Dia = localUtil.ctod( httpContext.cgiGet( "Z9579Pas_Dia"), 0) ;
            Z9580Pas_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z9580Pas_Hora"), 0)) ;
            Z9581Pas_Usu = httpContext.cgiGet( "Z9581Pas_Usu") ;
            Z9582Pas_Term = httpContext.cgiGet( "Z9582Pas_Term") ;
            Z9585Pas_DiaP = localUtil.ctod( httpContext.cgiGet( "Z9585Pas_DiaP"), 0) ;
            Z9586Pas_UsuP = httpContext.cgiGet( "Z9586Pas_UsuP") ;
            Z9587Pas_HorP = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z9587Pas_HorP"), 0)) ;
            Z9588Pas_Est = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9588Pas_Est"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9589Pas_Kgs = localUtil.ctond( httpContext.cgiGet( "Z9589Pas_Kgs")) ;
            Z2107PasCod = httpContext.cgiGet( "Z2107PasCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_90 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_90"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPas_Num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPas_Num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PAS_NUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPas_Num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9578Pas_Num = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
            }
            else
            {
               A9578Pas_Num = (int)(localUtil.ctol( httpContext.cgiGet( edtPas_Num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPas_Dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PAS_DIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPas_Dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9579Pas_Dia = GXutil.nullDate() ;
               n9579Pas_Dia = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9579Pas_Dia", localUtil.format(A9579Pas_Dia, "99/99/99"));
            }
            else
            {
               A9579Pas_Dia = localUtil.ctod( httpContext.cgiGet( edtPas_Dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9579Pas_Dia = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9579Pas_Dia", localUtil.format(A9579Pas_Dia, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPas_Hora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "PAS_HORA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPas_Hora_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9580Pas_Hora = GXutil.resetTime( GXutil.nullDate() );
               n9580Pas_Hora = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9580Pas_Hora", localUtil.ttoc( A9580Pas_Hora, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A9580Pas_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtPas_Hora_Internalname))) ;
               n9580Pas_Hora = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9580Pas_Hora", localUtil.ttoc( A9580Pas_Hora, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A9581Pas_Usu = GXutil.upper( httpContext.cgiGet( edtPas_Usu_Internalname)) ;
            n9581Pas_Usu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9581Pas_Usu", A9581Pas_Usu);
            A9582Pas_Term = httpContext.cgiGet( edtPas_Term_Internalname) ;
            n9582Pas_Term = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9582Pas_Term", A9582Pas_Term);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A2107PasCod = httpContext.cgiGet( edtPasCod_Internalname) ;
            n2107PasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2107PasCod", A2107PasCod);
            A2108PasDsc = httpContext.cgiGet( edtPasDsc_Internalname) ;
            n2108PasDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", A2108PasDsc);
            if ( localUtil.vcdate( httpContext.cgiGet( edtPas_DiaP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PAS_DIAP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPas_DiaP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9585Pas_DiaP = GXutil.nullDate() ;
               n9585Pas_DiaP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9585Pas_DiaP", localUtil.format(A9585Pas_DiaP, "99/99/99"));
            }
            else
            {
               A9585Pas_DiaP = localUtil.ctod( httpContext.cgiGet( edtPas_DiaP_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9585Pas_DiaP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9585Pas_DiaP", localUtil.format(A9585Pas_DiaP, "99/99/99"));
            }
            A9586Pas_UsuP = GXutil.upper( httpContext.cgiGet( edtPas_UsuP_Internalname)) ;
            n9586Pas_UsuP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9586Pas_UsuP", A9586Pas_UsuP);
            if ( localUtil.vcdate( httpContext.cgiGet( edtPas_HorP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "PAS_HORP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPas_HorP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9587Pas_HorP = GXutil.resetTime( GXutil.nullDate() );
               n9587Pas_HorP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9587Pas_HorP", localUtil.ttoc( A9587Pas_HorP, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A9587Pas_HorP = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtPas_HorP_Internalname))) ;
               n9587Pas_HorP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9587Pas_HorP", localUtil.ttoc( A9587Pas_HorP, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPas_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPas_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PAS_EST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPas_Est_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9588Pas_Est = (byte)(0) ;
               n9588Pas_Est = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9588Pas_Est", GXutil.str( A9588Pas_Est, 1, 0));
            }
            else
            {
               A9588Pas_Est = (byte)(localUtil.ctol( httpContext.cgiGet( edtPas_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9588Pas_Est = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9588Pas_Est", GXutil.str( A9588Pas_Est, 1, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPas_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPas_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PAS_KGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPas_Kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9589Pas_Kgs = DecimalUtil.ZERO ;
               n9589Pas_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9589Pas_Kgs", GXutil.ltrimstr( A9589Pas_Kgs, 9, 2));
            }
            else
            {
               A9589Pas_Kgs = localUtil.ctond( httpContext.cgiGet( edtPas_Kgs_Internalname)) ;
               n9589Pas_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9589Pas_Kgs", GXutil.ltrimstr( A9589Pas_Kgs, 9, 2));
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
               A9578Pas_Num = (int)(GXutil.lval( httpContext.GetPar( "Pas_Num"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
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
                        e111462 ();
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
            initAll1461249( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1250_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1250_Enabled), 5, 0), !bGXsfl_90_Refreshing);
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
      disableAttributes1461249( ) ;
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

   public void confirm_1460( )
   {
      beforeValidate1461249( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1461249( ) ;
         }
         else
         {
            checkExtendedTable1461249( ) ;
            if ( AnyError == 0 )
            {
               zm1461249( 2) ;
               zm1461249( 3) ;
            }
            closeExtendedTableCursors1461249( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1249 = Gx_mode ;
         confirm_1461250( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1249 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1249 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1460( ) ;
      }
   }

   public void confirm_1461250( )
   {
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1461250( ) ;
         if ( ( nRcdExists_1250 != 0 ) || ( nIsMod_1250 != 0 ) )
         {
            getKey1461250( ) ;
            if ( ( nRcdExists_1250 == 0 ) && ( nRcdDeleted_1250 == 0 ) )
            {
               if ( RcdFound1250 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1461250( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1461250( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1461250( 5) ;
                     }
                     closeExtendedTableCursors1461250( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PRDNUM_" + sGXsfl_90_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1250 != 0 )
               {
                  if ( nRcdDeleted_1250 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1461250( ) ;
                     load1461250( ) ;
                     beforeValidate1461250( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1461250( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1250 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1461250( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1461250( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1461250( 5) ;
                           }
                           closeExtendedTableCursors1461250( ) ;
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
                  if ( nRcdDeleted_1250 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1250_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPas_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A9583Pas_Cant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPas_CantP_Internalname, GXutil.ltrim( localUtil.ntoc( A9584Pas_CantP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPas_Unid_Internalname, GXutil.rtrim( A9590Pas_Unid)) ;
         httpContext.changePostValue( edtPas_Order_Internalname, GXutil.ltrim( localUtil.ntoc( A13177Pas_Order, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_90_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z9583Pas_Cant_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z9583Pas_Cant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9584Pas_CantP_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z9584Pas_CantP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9590Pas_Unid_"+sGXsfl_90_idx, GXutil.rtrim( Z9590Pas_Unid)) ;
         httpContext.changePostValue( "ZT_"+"Z13177Pas_Order_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z13177Pas_Order, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1250_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1250_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1250_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1250 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1250_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1250_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAS_CANT_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAS_CANTP_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_CantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAS_UNID_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Unid_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAS_ORDER_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Order_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1460( )
   {
   }

   public void e111462( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmakepa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tmakepa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmakepa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmakepa_impl.this.A396EmprCod = GXv_char2[0] ;
      tmakepa_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmakepa_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1461249( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9579Pas_Dia = T01466_A9579Pas_Dia[0] ;
            Z9580Pas_Hora = T01466_A9580Pas_Hora[0] ;
            Z9581Pas_Usu = T01466_A9581Pas_Usu[0] ;
            Z9582Pas_Term = T01466_A9582Pas_Term[0] ;
            Z9585Pas_DiaP = T01466_A9585Pas_DiaP[0] ;
            Z9586Pas_UsuP = T01466_A9586Pas_UsuP[0] ;
            Z9587Pas_HorP = T01466_A9587Pas_HorP[0] ;
            Z9588Pas_Est = T01466_A9588Pas_Est[0] ;
            Z9589Pas_Kgs = T01466_A9589Pas_Kgs[0] ;
            Z2107PasCod = T01466_A2107PasCod[0] ;
         }
         else
         {
            Z9579Pas_Dia = A9579Pas_Dia ;
            Z9580Pas_Hora = A9580Pas_Hora ;
            Z9581Pas_Usu = A9581Pas_Usu ;
            Z9582Pas_Term = A9582Pas_Term ;
            Z9585Pas_DiaP = A9585Pas_DiaP ;
            Z9586Pas_UsuP = A9586Pas_UsuP ;
            Z9587Pas_HorP = A9587Pas_HorP ;
            Z9588Pas_Est = A9588Pas_Est ;
            Z9589Pas_Kgs = A9589Pas_Kgs ;
            Z2107PasCod = A2107PasCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z9578Pas_Num = A9578Pas_Num ;
         Z9579Pas_Dia = A9579Pas_Dia ;
         Z9580Pas_Hora = A9580Pas_Hora ;
         Z9581Pas_Usu = A9581Pas_Usu ;
         Z9582Pas_Term = A9582Pas_Term ;
         Z9585Pas_DiaP = A9585Pas_DiaP ;
         Z9586Pas_UsuP = A9586Pas_UsuP ;
         Z9587Pas_HorP = A9587Pas_HorP ;
         Z9588Pas_Est = A9588Pas_Est ;
         Z9589Pas_Kgs = A9589Pas_Kgs ;
         Z396EmprCod = A396EmprCod ;
         Z2107PasCod = A2107PasCod ;
         Z407EmprNom = A407EmprNom ;
         Z2108PasDsc = A2108PasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TMAKEPA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01467 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01467_A407EmprNom[0] ;
      n407EmprNom = T01467_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
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

   public void load1461249( )
   {
      /* Using cursor T01469 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1249 = (short)(1) ;
         A9579Pas_Dia = T01469_A9579Pas_Dia[0] ;
         n9579Pas_Dia = T01469_n9579Pas_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9579Pas_Dia", localUtil.format(A9579Pas_Dia, "99/99/99"));
         A9580Pas_Hora = T01469_A9580Pas_Hora[0] ;
         n9580Pas_Hora = T01469_n9580Pas_Hora[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9580Pas_Hora", localUtil.ttoc( A9580Pas_Hora, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9581Pas_Usu = T01469_A9581Pas_Usu[0] ;
         n9581Pas_Usu = T01469_n9581Pas_Usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9581Pas_Usu", A9581Pas_Usu);
         A9582Pas_Term = T01469_A9582Pas_Term[0] ;
         n9582Pas_Term = T01469_n9582Pas_Term[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9582Pas_Term", A9582Pas_Term);
         A407EmprNom = T01469_A407EmprNom[0] ;
         n407EmprNom = T01469_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2108PasDsc = T01469_A2108PasDsc[0] ;
         n2108PasDsc = T01469_n2108PasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", A2108PasDsc);
         A9585Pas_DiaP = T01469_A9585Pas_DiaP[0] ;
         n9585Pas_DiaP = T01469_n9585Pas_DiaP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9585Pas_DiaP", localUtil.format(A9585Pas_DiaP, "99/99/99"));
         A9586Pas_UsuP = T01469_A9586Pas_UsuP[0] ;
         n9586Pas_UsuP = T01469_n9586Pas_UsuP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9586Pas_UsuP", A9586Pas_UsuP);
         A9587Pas_HorP = T01469_A9587Pas_HorP[0] ;
         n9587Pas_HorP = T01469_n9587Pas_HorP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9587Pas_HorP", localUtil.ttoc( A9587Pas_HorP, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9588Pas_Est = T01469_A9588Pas_Est[0] ;
         n9588Pas_Est = T01469_n9588Pas_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9588Pas_Est", GXutil.str( A9588Pas_Est, 1, 0));
         A9589Pas_Kgs = T01469_A9589Pas_Kgs[0] ;
         n9589Pas_Kgs = T01469_n9589Pas_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9589Pas_Kgs", GXutil.ltrimstr( A9589Pas_Kgs, 9, 2));
         A2107PasCod = T01469_A2107PasCod[0] ;
         n2107PasCod = T01469_n2107PasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2107PasCod", A2107PasCod);
         zm1461249( -1) ;
      }
      pr_default.close(7);
      onLoadActions1461249( ) ;
   }

   public void onLoadActions1461249( )
   {
   }

   public void checkExtendedTable1461249( )
   {
      nIsDirty_1249 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01468 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2108PasDsc = T01468_A2108PasDsc[0] ;
      n2108PasDsc = T01468_n2108PasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", A2108PasDsc);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1461249( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A2107PasCod )
   {
      /* Using cursor T014610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2108PasDsc = T014610_A2108PasDsc[0] ;
      n2108PasDsc = T014610_n2108PasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", A2108PasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2108PasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1461249( )
   {
      /* Using cursor T014611 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1249 = (short)(1) ;
      }
      else
      {
         RcdFound1249 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01466 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01466_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1461249( 1) ;
         RcdFound1249 = (short)(1) ;
         A9578Pas_Num = T01466_A9578Pas_Num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
         A9579Pas_Dia = T01466_A9579Pas_Dia[0] ;
         n9579Pas_Dia = T01466_n9579Pas_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9579Pas_Dia", localUtil.format(A9579Pas_Dia, "99/99/99"));
         A9580Pas_Hora = T01466_A9580Pas_Hora[0] ;
         n9580Pas_Hora = T01466_n9580Pas_Hora[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9580Pas_Hora", localUtil.ttoc( A9580Pas_Hora, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9581Pas_Usu = T01466_A9581Pas_Usu[0] ;
         n9581Pas_Usu = T01466_n9581Pas_Usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9581Pas_Usu", A9581Pas_Usu);
         A9582Pas_Term = T01466_A9582Pas_Term[0] ;
         n9582Pas_Term = T01466_n9582Pas_Term[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9582Pas_Term", A9582Pas_Term);
         A9585Pas_DiaP = T01466_A9585Pas_DiaP[0] ;
         n9585Pas_DiaP = T01466_n9585Pas_DiaP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9585Pas_DiaP", localUtil.format(A9585Pas_DiaP, "99/99/99"));
         A9586Pas_UsuP = T01466_A9586Pas_UsuP[0] ;
         n9586Pas_UsuP = T01466_n9586Pas_UsuP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9586Pas_UsuP", A9586Pas_UsuP);
         A9587Pas_HorP = T01466_A9587Pas_HorP[0] ;
         n9587Pas_HorP = T01466_n9587Pas_HorP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9587Pas_HorP", localUtil.ttoc( A9587Pas_HorP, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9588Pas_Est = T01466_A9588Pas_Est[0] ;
         n9588Pas_Est = T01466_n9588Pas_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9588Pas_Est", GXutil.str( A9588Pas_Est, 1, 0));
         A9589Pas_Kgs = T01466_A9589Pas_Kgs[0] ;
         n9589Pas_Kgs = T01466_n9589Pas_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9589Pas_Kgs", GXutil.ltrimstr( A9589Pas_Kgs, 9, 2));
         A2107PasCod = T01466_A2107PasCod[0] ;
         n2107PasCod = T01466_n2107PasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2107PasCod", A2107PasCod);
         Z396EmprCod = A396EmprCod ;
         Z9578Pas_Num = A9578Pas_Num ;
         sMode1249 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1461249( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1249 = (short)(0) ;
            initializeNonKey1461249( ) ;
         }
         Gx_mode = sMode1249 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1249 = (short)(0) ;
         initializeNonKey1461249( ) ;
         sMode1249 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1249 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1461249( ) ;
      if ( RcdFound1249 == 0 )
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
      RcdFound1249 = (short)(0) ;
      /* Using cursor T014612 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A9578Pas_Num), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T014612_A9578Pas_Num[0] < A9578Pas_Num ) ) && ( GXutil.strcmp(T014612_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T014612_A9578Pas_Num[0] > A9578Pas_Num ) ) && ( GXutil.strcmp(T014612_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9578Pas_Num = T014612_A9578Pas_Num[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
            RcdFound1249 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1249 = (short)(0) ;
      /* Using cursor T014613 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A9578Pas_Num), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T014613_A9578Pas_Num[0] > A9578Pas_Num ) ) && ( GXutil.strcmp(T014613_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T014613_A9578Pas_Num[0] < A9578Pas_Num ) ) && ( GXutil.strcmp(T014613_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9578Pas_Num = T014613_A9578Pas_Num[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
            RcdFound1249 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1461249( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPas_Num_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1461249( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1249 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9578Pas_Num != Z9578Pas_Num ) )
            {
               A9578Pas_Num = Z9578Pas_Num ;
               httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPas_Num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1461249( ) ;
               GX_FocusControl = edtPas_Num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9578Pas_Num != Z9578Pas_Num ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPas_Num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1461249( ) ;
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
                  GX_FocusControl = edtPas_Num_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1461249( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9578Pas_Num != Z9578Pas_Num ) )
      {
         A9578Pas_Num = Z9578Pas_Num ;
         httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPas_Num_Internalname ;
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
      getKey1461249( ) ;
      if ( RcdFound1249 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9578Pas_Num != Z9578Pas_Num ) )
         {
            A9578Pas_Num = Z9578Pas_Num ;
            httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9578Pas_Num != Z9578Pas_Num ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmakepa");
      GX_FocusControl = edtPas_Dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1460( ) ;
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
      if ( RcdFound1249 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPas_Dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1461249( ) ;
      if ( RcdFound1249 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPas_Dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1461249( ) ;
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
      if ( RcdFound1249 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPas_Dia_Internalname ;
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
      if ( RcdFound1249 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPas_Dia_Internalname ;
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
      scanStart1461249( ) ;
      if ( RcdFound1249 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1249 != 0 )
         {
            scanNext1461249( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPas_Dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1461249( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1461249( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01465 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAKEPA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z9579Pas_Dia), GXutil.resetTime(T01465_A9579Pas_Dia[0])) ) || !( GXutil.dateCompare(Z9580Pas_Hora, T01465_A9580Pas_Hora[0]) ) || ( GXutil.strcmp(Z9581Pas_Usu, T01465_A9581Pas_Usu[0]) != 0 ) || ( GXutil.strcmp(Z9582Pas_Term, T01465_A9582Pas_Term[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9585Pas_DiaP), GXutil.resetTime(T01465_A9585Pas_DiaP[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9586Pas_UsuP, T01465_A9586Pas_UsuP[0]) != 0 ) || !( GXutil.dateCompare(Z9587Pas_HorP, T01465_A9587Pas_HorP[0]) ) || ( Z9588Pas_Est != T01465_A9588Pas_Est[0] ) || ( DecimalUtil.compareTo(Z9589Pas_Kgs, T01465_A9589Pas_Kgs[0]) != 0 ) || ( GXutil.strcmp(Z2107PasCod, T01465_A2107PasCod[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9579Pas_Dia), GXutil.resetTime(T01465_A9579Pas_Dia[0])) ) )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Dia");
               GXutil.writeLogRaw("Old: ",Z9579Pas_Dia);
               GXutil.writeLogRaw("Current: ",T01465_A9579Pas_Dia[0]);
            }
            if ( !( GXutil.dateCompare(Z9580Pas_Hora, T01465_A9580Pas_Hora[0]) ) )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Hora");
               GXutil.writeLogRaw("Old: ",Z9580Pas_Hora);
               GXutil.writeLogRaw("Current: ",T01465_A9580Pas_Hora[0]);
            }
            if ( GXutil.strcmp(Z9581Pas_Usu, T01465_A9581Pas_Usu[0]) != 0 )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Usu");
               GXutil.writeLogRaw("Old: ",Z9581Pas_Usu);
               GXutil.writeLogRaw("Current: ",T01465_A9581Pas_Usu[0]);
            }
            if ( GXutil.strcmp(Z9582Pas_Term, T01465_A9582Pas_Term[0]) != 0 )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Term");
               GXutil.writeLogRaw("Old: ",Z9582Pas_Term);
               GXutil.writeLogRaw("Current: ",T01465_A9582Pas_Term[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9585Pas_DiaP), GXutil.resetTime(T01465_A9585Pas_DiaP[0])) ) )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_DiaP");
               GXutil.writeLogRaw("Old: ",Z9585Pas_DiaP);
               GXutil.writeLogRaw("Current: ",T01465_A9585Pas_DiaP[0]);
            }
            if ( GXutil.strcmp(Z9586Pas_UsuP, T01465_A9586Pas_UsuP[0]) != 0 )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_UsuP");
               GXutil.writeLogRaw("Old: ",Z9586Pas_UsuP);
               GXutil.writeLogRaw("Current: ",T01465_A9586Pas_UsuP[0]);
            }
            if ( !( GXutil.dateCompare(Z9587Pas_HorP, T01465_A9587Pas_HorP[0]) ) )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_HorP");
               GXutil.writeLogRaw("Old: ",Z9587Pas_HorP);
               GXutil.writeLogRaw("Current: ",T01465_A9587Pas_HorP[0]);
            }
            if ( Z9588Pas_Est != T01465_A9588Pas_Est[0] )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Est");
               GXutil.writeLogRaw("Old: ",Z9588Pas_Est);
               GXutil.writeLogRaw("Current: ",T01465_A9588Pas_Est[0]);
            }
            if ( DecimalUtil.compareTo(Z9589Pas_Kgs, T01465_A9589Pas_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Kgs");
               GXutil.writeLogRaw("Old: ",Z9589Pas_Kgs);
               GXutil.writeLogRaw("Current: ",T01465_A9589Pas_Kgs[0]);
            }
            if ( GXutil.strcmp(Z2107PasCod, T01465_A2107PasCod[0]) != 0 )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"PasCod");
               GXutil.writeLogRaw("Old: ",Z2107PasCod);
               GXutil.writeLogRaw("Current: ",T01465_A2107PasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAKEPA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1461249( )
   {
      beforeValidate1461249( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1461249( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1461249( 0) ;
         checkOptimisticConcurrency1461249( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1461249( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1461249( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014614 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A9578Pas_Num), Boolean.valueOf(n9579Pas_Dia), A9579Pas_Dia, Boolean.valueOf(n9580Pas_Hora), A9580Pas_Hora, Boolean.valueOf(n9581Pas_Usu), A9581Pas_Usu, Boolean.valueOf(n9582Pas_Term), A9582Pas_Term, Boolean.valueOf(n9585Pas_DiaP), A9585Pas_DiaP, Boolean.valueOf(n9586Pas_UsuP), A9586Pas_UsuP, Boolean.valueOf(n9587Pas_HorP), A9587Pas_HorP, Boolean.valueOf(n9588Pas_Est), Byte.valueOf(A9588Pas_Est), Boolean.valueOf(n9589Pas_Kgs), A9589Pas_Kgs, A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAKEPA");
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
                        processLevel1461249( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1460( ) ;
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
            load1461249( ) ;
         }
         endLevel1461249( ) ;
      }
      closeExtendedTableCursors1461249( ) ;
   }

   public void update1461249( )
   {
      beforeValidate1461249( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1461249( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1461249( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1461249( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1461249( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014615 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n9579Pas_Dia), A9579Pas_Dia, Boolean.valueOf(n9580Pas_Hora), A9580Pas_Hora, Boolean.valueOf(n9581Pas_Usu), A9581Pas_Usu, Boolean.valueOf(n9582Pas_Term), A9582Pas_Term, Boolean.valueOf(n9585Pas_DiaP), A9585Pas_DiaP, Boolean.valueOf(n9586Pas_UsuP), A9586Pas_UsuP, Boolean.valueOf(n9587Pas_HorP), A9587Pas_HorP, Boolean.valueOf(n9588Pas_Est), Byte.valueOf(A9588Pas_Est), Boolean.valueOf(n9589Pas_Kgs), A9589Pas_Kgs, Boolean.valueOf(n2107PasCod), A2107PasCod, A396EmprCod, Integer.valueOf(A9578Pas_Num)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAKEPA");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAKEPA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1461249( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1461249( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1460( ) ;
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
         endLevel1461249( ) ;
      }
      closeExtendedTableCursors1461249( ) ;
   }

   public void deferredUpdate1461249( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1461249( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1461249( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1461249( ) ;
         afterConfirm1461249( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1461249( ) ;
            if ( AnyError == 0 )
            {
               scanStart1461250( ) ;
               while ( RcdFound1250 != 0 )
               {
                  getByPrimaryKey1461250( ) ;
                  delete1461250( ) ;
                  scanNext1461250( ) ;
               }
               scanEnd1461250( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014616 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAKEPA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1249 == 0 )
                        {
                           initAll1461249( ) ;
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
                        resetCaption1460( ) ;
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
      sMode1249 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1461249( ) ;
      Gx_mode = sMode1249 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1461249( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T014617 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
         A2108PasDsc = T014617_A2108PasDsc[0] ;
         n2108PasDsc = T014617_n2108PasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", A2108PasDsc);
         pr_default.close(15);
      }
   }

   public void processNestedLevel1461250( )
   {
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1461250( ) ;
         if ( ( nRcdExists_1250 != 0 ) || ( nIsMod_1250 != 0 ) )
         {
            standaloneNotModal1461250( ) ;
            getKey1461250( ) ;
            if ( ( nRcdExists_1250 == 0 ) && ( nRcdDeleted_1250 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1461250( ) ;
            }
            else
            {
               if ( RcdFound1250 != 0 )
               {
                  if ( ( nRcdDeleted_1250 != 0 ) && ( nRcdExists_1250 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1461250( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1250 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1461250( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1250 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1250_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPas_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A9583Pas_Cant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPas_CantP_Internalname, GXutil.ltrim( localUtil.ntoc( A9584Pas_CantP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPas_Unid_Internalname, GXutil.rtrim( A9590Pas_Unid)) ;
         httpContext.changePostValue( edtPas_Order_Internalname, GXutil.ltrim( localUtil.ntoc( A13177Pas_Order, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_90_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z9583Pas_Cant_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z9583Pas_Cant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9584Pas_CantP_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z9584Pas_CantP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9590Pas_Unid_"+sGXsfl_90_idx, GXutil.rtrim( Z9590Pas_Unid)) ;
         httpContext.changePostValue( "ZT_"+"Z13177Pas_Order_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z13177Pas_Order, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1250_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1250_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1250_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1250 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1250_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1250_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAS_CANT_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAS_CANTP_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_CantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAS_UNID_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Unid_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAS_ORDER_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Order_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1461250( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1250 = (short)(0) ;
      nIsMod_1250 = (short)(0) ;
      nRcdDeleted_1250 = (short)(0) ;
   }

   public void processLevel1461249( )
   {
      /* Save parent mode. */
      sMode1249 = Gx_mode ;
      processNestedLevel1461250( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1249 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1461249( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1461249( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmakepa");
         if ( AnyError == 0 )
         {
            confirmValues1460( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmakepa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1461249( )
   {
      /* Scan By routine */
      /* Using cursor T014618 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1249 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1249 = (short)(1) ;
         A9578Pas_Num = T014618_A9578Pas_Num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1461249( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1249 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1249 = (short)(1) ;
         A9578Pas_Num = T014618_A9578Pas_Num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
      }
   }

   public void scanEnd1461249( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1461249( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1461249( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1461249( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1461249( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1461249( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1461249( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1461249( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPas_Num_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Num_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Num_Enabled), 5, 0), true);
      edtPas_Dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Dia_Enabled), 5, 0), true);
      edtPas_Hora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Hora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Hora_Enabled), 5, 0), true);
      edtPas_Usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Usu_Enabled), 5, 0), true);
      edtPas_Term_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Term_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasCod_Enabled), 5, 0), true);
      edtPasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasDsc_Enabled), 5, 0), true);
      edtPas_DiaP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_DiaP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_DiaP_Enabled), 5, 0), true);
      edtPas_UsuP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_UsuP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_UsuP_Enabled), 5, 0), true);
      edtPas_HorP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_HorP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_HorP_Enabled), 5, 0), true);
      edtPas_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Est_Enabled), 5, 0), true);
      edtPas_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Kgs_Enabled), 5, 0), true);
   }

   public void zm1461250( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9583Pas_Cant = T01463_A9583Pas_Cant[0] ;
            Z9584Pas_CantP = T01463_A9584Pas_CantP[0] ;
            Z9590Pas_Unid = T01463_A9590Pas_Unid[0] ;
            Z13177Pas_Order = T01463_A13177Pas_Order[0] ;
         }
         else
         {
            Z9583Pas_Cant = A9583Pas_Cant ;
            Z9584Pas_CantP = A9584Pas_CantP ;
            Z9590Pas_Unid = A9590Pas_Unid ;
            Z13177Pas_Order = A13177Pas_Order ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z9578Pas_Num = A9578Pas_Num ;
         Z9583Pas_Cant = A9583Pas_Cant ;
         Z9584Pas_CantP = A9584Pas_CantP ;
         Z9590Pas_Unid = A9590Pas_Unid ;
         Z13177Pas_Order = A13177Pas_Order ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
      }
   }

   public void standaloneNotModal1461250( )
   {
   }

   public void standaloneModal1461250( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
   }

   public void load1461250( )
   {
      /* Using cursor T014619 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num), A719PrdNum});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1250 = (short)(1) ;
         A9583Pas_Cant = T014619_A9583Pas_Cant[0] ;
         n9583Pas_Cant = T014619_n9583Pas_Cant[0] ;
         A9584Pas_CantP = T014619_A9584Pas_CantP[0] ;
         n9584Pas_CantP = T014619_n9584Pas_CantP[0] ;
         A9590Pas_Unid = T014619_A9590Pas_Unid[0] ;
         n9590Pas_Unid = T014619_n9590Pas_Unid[0] ;
         A13177Pas_Order = T014619_A13177Pas_Order[0] ;
         n13177Pas_Order = T014619_n13177Pas_Order[0] ;
         zm1461250( -4) ;
      }
      pr_default.close(17);
      onLoadActions1461250( ) ;
   }

   public void onLoadActions1461250( )
   {
   }

   public void checkExtendedTable1461250( )
   {
      nIsDirty_1250 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1461250( ) ;
      /* Using cursor T01464 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1461250( )
   {
      pr_default.close(2);
   }

   public void enableDisable1461250( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T014620 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1461250( )
   {
      /* Using cursor T014621 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num), A719PrdNum});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1250 = (short)(1) ;
      }
      else
      {
         RcdFound1250 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1461250( )
   {
      /* Using cursor T01463 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01463_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1461250( 4) ;
         RcdFound1250 = (short)(1) ;
         initializeNonKey1461250( ) ;
         A9583Pas_Cant = T01463_A9583Pas_Cant[0] ;
         n9583Pas_Cant = T01463_n9583Pas_Cant[0] ;
         A9584Pas_CantP = T01463_A9584Pas_CantP[0] ;
         n9584Pas_CantP = T01463_n9584Pas_CantP[0] ;
         A9590Pas_Unid = T01463_A9590Pas_Unid[0] ;
         n9590Pas_Unid = T01463_n9590Pas_Unid[0] ;
         A13177Pas_Order = T01463_A13177Pas_Order[0] ;
         n13177Pas_Order = T01463_n13177Pas_Order[0] ;
         A719PrdNum = T01463_A719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9578Pas_Num = A9578Pas_Num ;
         Z719PrdNum = A719PrdNum ;
         sMode1250 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1461250( ) ;
         load1461250( ) ;
         Gx_mode = sMode1250 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1250 = (short)(0) ;
         initializeNonKey1461250( ) ;
         sMode1250 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1461250( ) ;
         Gx_mode = sMode1250 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1461250( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1461250( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01462 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAKEP1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9583Pas_Cant, T01462_A9583Pas_Cant[0]) != 0 ) || ( DecimalUtil.compareTo(Z9584Pas_CantP, T01462_A9584Pas_CantP[0]) != 0 ) || ( GXutil.strcmp(Z9590Pas_Unid, T01462_A9590Pas_Unid[0]) != 0 ) || ( Z13177Pas_Order != T01462_A13177Pas_Order[0] ) )
         {
            if ( DecimalUtil.compareTo(Z9583Pas_Cant, T01462_A9583Pas_Cant[0]) != 0 )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Cant");
               GXutil.writeLogRaw("Old: ",Z9583Pas_Cant);
               GXutil.writeLogRaw("Current: ",T01462_A9583Pas_Cant[0]);
            }
            if ( DecimalUtil.compareTo(Z9584Pas_CantP, T01462_A9584Pas_CantP[0]) != 0 )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_CantP");
               GXutil.writeLogRaw("Old: ",Z9584Pas_CantP);
               GXutil.writeLogRaw("Current: ",T01462_A9584Pas_CantP[0]);
            }
            if ( GXutil.strcmp(Z9590Pas_Unid, T01462_A9590Pas_Unid[0]) != 0 )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Unid");
               GXutil.writeLogRaw("Old: ",Z9590Pas_Unid);
               GXutil.writeLogRaw("Current: ",T01462_A9590Pas_Unid[0]);
            }
            if ( Z13177Pas_Order != T01462_A13177Pas_Order[0] )
            {
               GXutil.writeLogln("tmakepa:[seudo value changed for attri]"+"Pas_Order");
               GXutil.writeLogRaw("Old: ",Z13177Pas_Order);
               GXutil.writeLogRaw("Current: ",T01462_A13177Pas_Order[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAKEP1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1461250( )
   {
      beforeValidate1461250( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1461250( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1461250( 0) ;
         checkOptimisticConcurrency1461250( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1461250( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1461250( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014622 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A9578Pas_Num), Boolean.valueOf(n9583Pas_Cant), A9583Pas_Cant, Boolean.valueOf(n9584Pas_CantP), A9584Pas_CantP, Boolean.valueOf(n9590Pas_Unid), A9590Pas_Unid, Boolean.valueOf(n13177Pas_Order), Short.valueOf(A13177Pas_Order), A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAKEP1");
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
            load1461250( ) ;
         }
         endLevel1461250( ) ;
      }
      closeExtendedTableCursors1461250( ) ;
   }

   public void update1461250( )
   {
      beforeValidate1461250( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1461250( ) ;
      }
      if ( ( nIsMod_1250 != 0 ) || ( nIsDirty_1250 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1461250( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1461250( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1461250( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T014623 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n9583Pas_Cant), A9583Pas_Cant, Boolean.valueOf(n9584Pas_CantP), A9584Pas_CantP, Boolean.valueOf(n9590Pas_Unid), A9590Pas_Unid, Boolean.valueOf(n13177Pas_Order), Short.valueOf(A13177Pas_Order), A396EmprCod, Integer.valueOf(A9578Pas_Num), A719PrdNum});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAKEP1");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAKEP1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1461250( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1461250( ) ;
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
            endLevel1461250( ) ;
         }
      }
      closeExtendedTableCursors1461250( ) ;
   }

   public void deferredUpdate1461250( )
   {
   }

   public void delete1461250( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1461250( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1461250( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1461250( ) ;
         afterConfirm1461250( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1461250( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T014624 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAKEP1");
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
      sMode1250 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1461250( ) ;
      Gx_mode = sMode1250 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1461250( )
   {
      standaloneModal1461250( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1461250( )
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

   public void scanStart1461250( )
   {
      /* Scan By routine */
      /* Using cursor T014625 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A9578Pas_Num)});
      RcdFound1250 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1250 = (short)(1) ;
         A719PrdNum = T014625_A719PrdNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1461250( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1250 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1250 = (short)(1) ;
         A719PrdNum = T014625_A719PrdNum[0] ;
      }
   }

   public void scanEnd1461250( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1461250( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1461250( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1461250( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1461250( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1461250( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1461250( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1461250( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPas_Cant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Cant_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPas_CantP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_CantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_CantP_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPas_Unid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Unid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Unid_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPas_Order_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPas_Order_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPas_Order_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void send_integrity_lvl_hashes1461250( )
   {
   }

   public void send_integrity_lvl_hashes1461249( )
   {
   }

   public void subsflControlProps_901250( )
   {
      edtavnRcdDeleted_1250_Internalname = "vNRCDDELETED_1250_"+sGXsfl_90_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_90_idx ;
      edtPas_Cant_Internalname = "PAS_CANT_"+sGXsfl_90_idx ;
      edtPas_CantP_Internalname = "PAS_CANTP_"+sGXsfl_90_idx ;
      edtPas_Unid_Internalname = "PAS_UNID_"+sGXsfl_90_idx ;
      edtPas_Order_Internalname = "PAS_ORDER_"+sGXsfl_90_idx ;
   }

   public void subsflControlProps_fel_901250( )
   {
      edtavnRcdDeleted_1250_Internalname = "vNRCDDELETED_1250_"+sGXsfl_90_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_90_fel_idx ;
      edtPas_Cant_Internalname = "PAS_CANT_"+sGXsfl_90_fel_idx ;
      edtPas_CantP_Internalname = "PAS_CANTP_"+sGXsfl_90_fel_idx ;
      edtPas_Unid_Internalname = "PAS_UNID_"+sGXsfl_90_fel_idx ;
      edtPas_Order_Internalname = "PAS_ORDER_"+sGXsfl_90_fel_idx ;
   }

   public void addRow1461250( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901250( ) ;
      sendRow1461250( ) ;
   }

   public void sendRow1461250( )
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
         if ( ((int)((nGXsfl_90_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1250_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1250_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1250_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1250), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1250), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1250_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1250_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1250_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1250_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPas_Cant_Internalname,GXutil.ltrim( localUtil.ntoc( A9583Pas_Cant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPas_Cant_Enabled!=0) ? localUtil.format( A9583Pas_Cant, "ZZZZZ9.99") : localUtil.format( A9583Pas_Cant, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPas_Cant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPas_Cant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1250_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPas_CantP_Internalname,GXutil.ltrim( localUtil.ntoc( A9584Pas_CantP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPas_CantP_Enabled!=0) ? localUtil.format( A9584Pas_CantP, "ZZZZZZ9.99") : localUtil.format( A9584Pas_CantP, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPas_CantP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPas_CantP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1250_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPas_Unid_Internalname,GXutil.rtrim( A9590Pas_Unid),GXutil.rtrim( localUtil.format( A9590Pas_Unid, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPas_Unid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPas_Unid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1250_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPas_Order_Internalname,GXutil.ltrim( localUtil.ntoc( A13177Pas_Order, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPas_Order_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13177Pas_Order), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13177Pas_Order), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPas_Order_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPas_Order_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1461250( ) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z9583Pas_Cant_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9583Pas_Cant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9584Pas_CantP_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9584Pas_CantP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9590Pas_Unid_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9590Pas_Unid));
      GXCCtl = "Z13177Pas_Order_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13177Pas_Order, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1250_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1250_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1250_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1250, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1250_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1250_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAS_CANT_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAS_CANTP_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_CantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAS_UNID_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Unid_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAS_ORDER_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Order_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1461250( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901250( ) ;
      edtavnRcdDeleted_1250_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1250_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPas_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAS_CANT_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPas_CantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAS_CANTP_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPas_Unid_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAS_UNID_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPas_Order_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAS_ORDER_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1250_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1250_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1250");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1250_Internalname ;
         wbErr = true ;
         nRcdDeleted_1250 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1250 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1250_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPas_Cant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPas_Cant_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PAS_CANT_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPas_Cant_Internalname ;
         wbErr = true ;
         A9583Pas_Cant = DecimalUtil.ZERO ;
         n9583Pas_Cant = false ;
      }
      else
      {
         A9583Pas_Cant = localUtil.ctond( httpContext.cgiGet( edtPas_Cant_Internalname)) ;
         n9583Pas_Cant = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPas_CantP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPas_CantP_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "PAS_CANTP_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPas_CantP_Internalname ;
         wbErr = true ;
         A9584Pas_CantP = DecimalUtil.ZERO ;
         n9584Pas_CantP = false ;
      }
      else
      {
         A9584Pas_CantP = localUtil.ctond( httpContext.cgiGet( edtPas_CantP_Internalname)) ;
         n9584Pas_CantP = false ;
      }
      A9590Pas_Unid = GXutil.upper( httpContext.cgiGet( edtPas_Unid_Internalname)) ;
      n9590Pas_Unid = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPas_Order_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPas_Order_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PAS_ORDER_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPas_Order_Internalname ;
         wbErr = true ;
         A13177Pas_Order = (short)(0) ;
         n13177Pas_Order = false ;
      }
      else
      {
         A13177Pas_Order = (short)(localUtil.ctol( httpContext.cgiGet( edtPas_Order_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13177Pas_Order = false ;
      }
      GXCCtl = "Z719PrdNum_" + sGXsfl_90_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9583Pas_Cant_" + sGXsfl_90_idx ;
      Z9583Pas_Cant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9584Pas_CantP_" + sGXsfl_90_idx ;
      Z9584Pas_CantP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9590Pas_Unid_" + sGXsfl_90_idx ;
      Z9590Pas_Unid = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13177Pas_Order_" + sGXsfl_90_idx ;
      Z13177Pas_Order = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1250_" + sGXsfl_90_idx ;
      nRcdDeleted_1250 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1250_" + sGXsfl_90_idx ;
      nRcdExists_1250 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1250_" + sGXsfl_90_idx ;
      nIsMod_1250 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdNum_Enabled = edtPrdNum_Enabled ;
   }

   public void confirmValues1460( )
   {
      nGXsfl_90_idx = 0 ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901250( ) ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901250( ) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z9583Pas_Cant_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z9583Pas_Cant_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9583Pas_Cant_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z9584Pas_CantP_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z9584Pas_CantP_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9584Pas_CantP_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z9590Pas_Unid_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z9590Pas_Unid_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9590Pas_Unid_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z13177Pas_Order_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z13177Pas_Order_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13177Pas_Order_"+sGXsfl_90_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmakepa", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9578Pas_Num", GXutil.ltrim( localUtil.ntoc( Z9578Pas_Num, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9579Pas_Dia", localUtil.dtoc( Z9579Pas_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9580Pas_Hora", localUtil.ttoc( Z9580Pas_Hora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9581Pas_Usu", GXutil.rtrim( Z9581Pas_Usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9582Pas_Term", GXutil.rtrim( Z9582Pas_Term));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9585Pas_DiaP", localUtil.dtoc( Z9585Pas_DiaP, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9586Pas_UsuP", GXutil.rtrim( Z9586Pas_UsuP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9587Pas_HorP", localUtil.ttoc( Z9587Pas_HorP, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9588Pas_Est", GXutil.ltrim( localUtil.ntoc( Z9588Pas_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9589Pas_Kgs", GXutil.ltrim( localUtil.ntoc( Z9589Pas_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2107PasCod", GXutil.rtrim( Z2107PasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_90", GXutil.ltrim( localUtil.ntoc( nGXsfl_90_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmakepa", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMAKEPA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HACER PASTA", "") ;
   }

   public void initializeNonKey1461249( )
   {
      A9579Pas_Dia = GXutil.nullDate() ;
      n9579Pas_Dia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9579Pas_Dia", localUtil.format(A9579Pas_Dia, "99/99/99"));
      A9580Pas_Hora = GXutil.resetTime( GXutil.nullDate() );
      n9580Pas_Hora = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9580Pas_Hora", localUtil.ttoc( A9580Pas_Hora, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9581Pas_Usu = "" ;
      n9581Pas_Usu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9581Pas_Usu", A9581Pas_Usu);
      A9582Pas_Term = "" ;
      n9582Pas_Term = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9582Pas_Term", A9582Pas_Term);
      A2107PasCod = "" ;
      n2107PasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2107PasCod", A2107PasCod);
      A2108PasDsc = "" ;
      n2108PasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", A2108PasDsc);
      A9585Pas_DiaP = GXutil.nullDate() ;
      n9585Pas_DiaP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9585Pas_DiaP", localUtil.format(A9585Pas_DiaP, "99/99/99"));
      A9586Pas_UsuP = "" ;
      n9586Pas_UsuP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9586Pas_UsuP", A9586Pas_UsuP);
      A9587Pas_HorP = GXutil.resetTime( GXutil.nullDate() );
      n9587Pas_HorP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9587Pas_HorP", localUtil.ttoc( A9587Pas_HorP, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9588Pas_Est = (byte)(0) ;
      n9588Pas_Est = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9588Pas_Est", GXutil.str( A9588Pas_Est, 1, 0));
      A9589Pas_Kgs = DecimalUtil.ZERO ;
      n9589Pas_Kgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9589Pas_Kgs", GXutil.ltrimstr( A9589Pas_Kgs, 9, 2));
      Z9579Pas_Dia = GXutil.nullDate() ;
      Z9580Pas_Hora = GXutil.resetTime( GXutil.nullDate() );
      Z9581Pas_Usu = "" ;
      Z9582Pas_Term = "" ;
      Z9585Pas_DiaP = GXutil.nullDate() ;
      Z9586Pas_UsuP = "" ;
      Z9587Pas_HorP = GXutil.resetTime( GXutil.nullDate() );
      Z9588Pas_Est = (byte)(0) ;
      Z9589Pas_Kgs = DecimalUtil.ZERO ;
      Z2107PasCod = "" ;
   }

   public void initAll1461249( )
   {
      A9578Pas_Num = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9578Pas_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9578Pas_Num), 8, 0));
      initializeNonKey1461249( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1461250( )
   {
      A9583Pas_Cant = DecimalUtil.ZERO ;
      n9583Pas_Cant = false ;
      A9584Pas_CantP = DecimalUtil.ZERO ;
      n9584Pas_CantP = false ;
      A9590Pas_Unid = "" ;
      n9590Pas_Unid = false ;
      A13177Pas_Order = (short)(0) ;
      n13177Pas_Order = false ;
      Z9583Pas_Cant = DecimalUtil.ZERO ;
      Z9584Pas_CantP = DecimalUtil.ZERO ;
      Z9590Pas_Unid = "" ;
      Z13177Pas_Order = (short)(0) ;
   }

   public void initAll1461250( )
   {
      A719PrdNum = "" ;
      initializeNonKey1461250( ) ;
   }

   public void standaloneModalInsert1461250( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154255", true, true);
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
      httpContext.AddJavascriptSource("tmakepa.js", "?2026824154255", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1250( )
   {
      edtPrdNum_Enabled = defedtPrdNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void startgridcontrol90( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1250, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1250_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9583Pas_Cant, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9584Pas_CantP, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_CantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9590Pas_Unid));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Unid_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13177Pas_Order, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPas_Order_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPas_Num_Internalname = "PAS_NUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPas_Dia_Internalname = "PAS_DIA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPas_Hora_Internalname = "PAS_HORA" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPas_Usu_Internalname = "PAS_USU" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPas_Term_Internalname = "PAS_TERM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPasCod_Internalname = "PASCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPasDsc_Internalname = "PASDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPas_DiaP_Internalname = "PAS_DIAP" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPas_UsuP_Internalname = "PAS_USUP" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPas_HorP_Internalname = "PAS_HORP" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPas_Est_Internalname = "PAS_EST" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtPas_Kgs_Internalname = "PAS_KGS" ;
      edtavnRcdDeleted_1250_Internalname = "vNRCDDELETED_1250" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPas_Cant_Internalname = "PAS_CANT" ;
      edtPas_CantP_Internalname = "PAS_CANTP" ;
      edtPas_Unid_Internalname = "PAS_UNID" ;
      edtPas_Order_Internalname = "PAS_ORDER" ;
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
      Form.setCaption( httpContext.getMessage( "HACER PASTA", "") );
      edtPas_Order_Jsonclick = "" ;
      edtPas_Unid_Jsonclick = "" ;
      edtPas_CantP_Jsonclick = "" ;
      edtPas_Cant_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtavnRcdDeleted_1250_Jsonclick = "" ;
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
      edtPas_Order_Enabled = 1 ;
      edtPas_Unid_Enabled = 1 ;
      edtPas_CantP_Enabled = 1 ;
      edtPas_Cant_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtavnRcdDeleted_1250_Enabled = 1 ;
      edtPas_Kgs_Jsonclick = "" ;
      edtPas_Kgs_Backcolor = (int)(0xFFFFFF) ;
      edtPas_Kgs_Enabled = 1 ;
      edtPas_Est_Jsonclick = "" ;
      edtPas_Est_Backcolor = (int)(0xFFFFFF) ;
      edtPas_Est_Enabled = 1 ;
      edtPas_HorP_Jsonclick = "" ;
      edtPas_HorP_Backcolor = (int)(0xFFFFFF) ;
      edtPas_HorP_Enabled = 1 ;
      edtPas_UsuP_Jsonclick = "" ;
      edtPas_UsuP_Backcolor = (int)(0xFFFFFF) ;
      edtPas_UsuP_Enabled = 1 ;
      edtPas_DiaP_Jsonclick = "" ;
      edtPas_DiaP_Backcolor = (int)(0xFFFFFF) ;
      edtPas_DiaP_Enabled = 1 ;
      edtPasDsc_Jsonclick = "" ;
      edtPasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtPasDsc_Enabled = 0 ;
      edtPasCod_Jsonclick = "" ;
      edtPasCod_Backcolor = (int)(0xFFFFFF) ;
      edtPasCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtPas_Term_Jsonclick = "" ;
      edtPas_Term_Backcolor = (int)(0xFFFFFF) ;
      edtPas_Term_Enabled = 1 ;
      edtPas_Usu_Jsonclick = "" ;
      edtPas_Usu_Backcolor = (int)(0xFFFFFF) ;
      edtPas_Usu_Enabled = 1 ;
      edtPas_Hora_Jsonclick = "" ;
      edtPas_Hora_Backcolor = (int)(0xFFFFFF) ;
      edtPas_Hora_Enabled = 1 ;
      edtPas_Dia_Jsonclick = "" ;
      edtPas_Dia_Backcolor = (int)(0xFFFFFF) ;
      edtPas_Dia_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPas_Num_Jsonclick = "" ;
      edtPas_Num_Backcolor = (int)(0xFFFFFF) ;
      edtPas_Num_Enabled = 1 ;
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
      subsflControlProps_901250( ) ;
      while ( nGXsfl_90_idx <= nRC_GXsfl_90 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1461250( ) ;
         standaloneModal1461250( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1461250( ) ;
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901250( ) ;
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
      /* Using cursor T014626 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T014626_A407EmprNom[0] ;
      n407EmprNom = T014626_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      GX_FocusControl = edtPas_Dia_Internalname ;
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

   public void valid_Pas_num( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9579Pas_Dia", localUtil.format(A9579Pas_Dia, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9580Pas_Hora", localUtil.ttoc( A9580Pas_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A9581Pas_Usu", GXutil.rtrim( A9581Pas_Usu));
      httpContext.ajax_rsp_assign_attri("", false, "A9582Pas_Term", GXutil.rtrim( A9582Pas_Term));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2107PasCod", GXutil.rtrim( A2107PasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A9585Pas_DiaP", localUtil.format(A9585Pas_DiaP, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9586Pas_UsuP", GXutil.rtrim( A9586Pas_UsuP));
      httpContext.ajax_rsp_assign_attri("", false, "A9587Pas_HorP", localUtil.ttoc( A9587Pas_HorP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A9588Pas_Est", GXutil.ltrim( localUtil.ntoc( A9588Pas_Est, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9589Pas_Kgs", GXutil.ltrim( localUtil.ntoc( A9589Pas_Kgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", GXutil.rtrim( A2108PasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9578Pas_Num", GXutil.ltrim( localUtil.ntoc( Z9578Pas_Num, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9579Pas_Dia", localUtil.format(Z9579Pas_Dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9580Pas_Hora", localUtil.ttoc( Z9580Pas_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9581Pas_Usu", GXutil.rtrim( Z9581Pas_Usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9582Pas_Term", GXutil.rtrim( Z9582Pas_Term));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2107PasCod", GXutil.rtrim( Z2107PasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9585Pas_DiaP", localUtil.format(Z9585Pas_DiaP, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9586Pas_UsuP", GXutil.rtrim( Z9586Pas_UsuP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9587Pas_HorP", localUtil.ttoc( Z9587Pas_HorP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9588Pas_Est", GXutil.ltrim( localUtil.ntoc( Z9588Pas_Est, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9589Pas_Kgs", GXutil.ltrim( localUtil.ntoc( Z9589Pas_Kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2108PasDsc", GXutil.rtrim( Z2108PasDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pascod( )
   {
      n2107PasCod = false ;
      n2108PasDsc = false ;
      /* Using cursor T014617 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
      }
      A2108PasDsc = T014617_A2108PasDsc[0] ;
      n2108PasDsc = T014617_n2108PasDsc[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", GXutil.rtrim( A2108PasDsc));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T014627 */
      pr_default.execute(25, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      pr_default.close(25);
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
      setEventMetadata("VALID_PAS_NUM","{handler:'valid_Pas_num',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9578Pas_Num',fld:'PAS_NUM',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PAS_NUM",",oparms:[{av:'A9579Pas_Dia',fld:'PAS_DIA',pic:''},{av:'A9580Pas_Hora',fld:'PAS_HORA',pic:'99:99'},{av:'A9581Pas_Usu',fld:'PAS_USU',pic:'@!'},{av:'A9582Pas_Term',fld:'PAS_TERM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2107PasCod',fld:'PASCOD',pic:''},{av:'A9585Pas_DiaP',fld:'PAS_DIAP',pic:''},{av:'A9586Pas_UsuP',fld:'PAS_USUP',pic:'@!'},{av:'A9587Pas_HorP',fld:'PAS_HORP',pic:'99:99'},{av:'A9588Pas_Est',fld:'PAS_EST',pic:'9'},{av:'A9589Pas_Kgs',fld:'PAS_KGS',pic:'ZZZZZ9.99'},{av:'A2108PasDsc',fld:'PASDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9578Pas_Num'},{av:'Z9579Pas_Dia'},{av:'Z9580Pas_Hora'},{av:'Z9581Pas_Usu'},{av:'Z9582Pas_Term'},{av:'Z407EmprNom'},{av:'Z2107PasCod'},{av:'Z9585Pas_DiaP'},{av:'Z9586Pas_UsuP'},{av:'Z9587Pas_HorP'},{av:'Z9588Pas_Est'},{av:'Z9589Pas_Kgs'},{av:'Z2108PasDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PASCOD","{handler:'valid_Pascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2107PasCod',fld:'PASCOD',pic:''},{av:'A2108PasDsc',fld:'PASDSC',pic:''}]");
      setEventMetadata("VALID_PASCOD",",oparms:[{av:'A2108PasDsc',fld:'PASDSC',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pas_order',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z9579Pas_Dia = GXutil.nullDate() ;
      Z9580Pas_Hora = GXutil.resetTime( GXutil.nullDate() );
      Z9581Pas_Usu = "" ;
      Z9582Pas_Term = "" ;
      Z9585Pas_DiaP = GXutil.nullDate() ;
      Z9586Pas_UsuP = "" ;
      Z9587Pas_HorP = GXutil.resetTime( GXutil.nullDate() );
      Z9589Pas_Kgs = DecimalUtil.ZERO ;
      Z2107PasCod = "" ;
      Z719PrdNum = "" ;
      Z9583Pas_Cant = DecimalUtil.ZERO ;
      Z9584Pas_CantP = DecimalUtil.ZERO ;
      Z9590Pas_Unid = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2107PasCod = "" ;
      A719PrdNum = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A9579Pas_Dia = GXutil.nullDate() ;
      lblTextblock4_Jsonclick = "" ;
      A9580Pas_Hora = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock5_Jsonclick = "" ;
      A9581Pas_Usu = "" ;
      lblTextblock6_Jsonclick = "" ;
      A9582Pas_Term = "" ;
      lblTextblock7_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A2108PasDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A9585Pas_DiaP = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A9586Pas_UsuP = "" ;
      lblTextblock12_Jsonclick = "" ;
      A9587Pas_HorP = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A9589Pas_Kgs = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1250 = "" ;
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
      sMode1249 = "" ;
      GXCCtl = "" ;
      A9583Pas_Cant = DecimalUtil.ZERO ;
      A9584Pas_CantP = DecimalUtil.ZERO ;
      A9590Pas_Unid = "" ;
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
      Z2108PasDsc = "" ;
      T01467_A407EmprNom = new String[] {""} ;
      T01467_n407EmprNom = new boolean[] {false} ;
      T01469_A9578Pas_Num = new int[1] ;
      T01469_A9579Pas_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01469_n9579Pas_Dia = new boolean[] {false} ;
      T01469_A9580Pas_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T01469_n9580Pas_Hora = new boolean[] {false} ;
      T01469_A9581Pas_Usu = new String[] {""} ;
      T01469_n9581Pas_Usu = new boolean[] {false} ;
      T01469_A9582Pas_Term = new String[] {""} ;
      T01469_n9582Pas_Term = new boolean[] {false} ;
      T01469_A407EmprNom = new String[] {""} ;
      T01469_n407EmprNom = new boolean[] {false} ;
      T01469_A2108PasDsc = new String[] {""} ;
      T01469_n2108PasDsc = new boolean[] {false} ;
      T01469_A9585Pas_DiaP = new java.util.Date[] {GXutil.nullDate()} ;
      T01469_n9585Pas_DiaP = new boolean[] {false} ;
      T01469_A9586Pas_UsuP = new String[] {""} ;
      T01469_n9586Pas_UsuP = new boolean[] {false} ;
      T01469_A9587Pas_HorP = new java.util.Date[] {GXutil.nullDate()} ;
      T01469_n9587Pas_HorP = new boolean[] {false} ;
      T01469_A9588Pas_Est = new byte[1] ;
      T01469_n9588Pas_Est = new boolean[] {false} ;
      T01469_A9589Pas_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01469_n9589Pas_Kgs = new boolean[] {false} ;
      T01469_A396EmprCod = new String[] {""} ;
      T01469_A2107PasCod = new String[] {""} ;
      T01469_n2107PasCod = new boolean[] {false} ;
      T01468_A2108PasDsc = new String[] {""} ;
      T01468_n2108PasDsc = new boolean[] {false} ;
      T014610_A2108PasDsc = new String[] {""} ;
      T014610_n2108PasDsc = new boolean[] {false} ;
      T014611_A396EmprCod = new String[] {""} ;
      T014611_A9578Pas_Num = new int[1] ;
      T01466_A9578Pas_Num = new int[1] ;
      T01466_A9579Pas_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01466_n9579Pas_Dia = new boolean[] {false} ;
      T01466_A9580Pas_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T01466_n9580Pas_Hora = new boolean[] {false} ;
      T01466_A9581Pas_Usu = new String[] {""} ;
      T01466_n9581Pas_Usu = new boolean[] {false} ;
      T01466_A9582Pas_Term = new String[] {""} ;
      T01466_n9582Pas_Term = new boolean[] {false} ;
      T01466_A9585Pas_DiaP = new java.util.Date[] {GXutil.nullDate()} ;
      T01466_n9585Pas_DiaP = new boolean[] {false} ;
      T01466_A9586Pas_UsuP = new String[] {""} ;
      T01466_n9586Pas_UsuP = new boolean[] {false} ;
      T01466_A9587Pas_HorP = new java.util.Date[] {GXutil.nullDate()} ;
      T01466_n9587Pas_HorP = new boolean[] {false} ;
      T01466_A9588Pas_Est = new byte[1] ;
      T01466_n9588Pas_Est = new boolean[] {false} ;
      T01466_A9589Pas_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01466_n9589Pas_Kgs = new boolean[] {false} ;
      T01466_A396EmprCod = new String[] {""} ;
      T01466_A2107PasCod = new String[] {""} ;
      T01466_n2107PasCod = new boolean[] {false} ;
      T014612_A396EmprCod = new String[] {""} ;
      T014612_A9578Pas_Num = new int[1] ;
      T014613_A396EmprCod = new String[] {""} ;
      T014613_A9578Pas_Num = new int[1] ;
      T01465_A9578Pas_Num = new int[1] ;
      T01465_A9579Pas_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01465_n9579Pas_Dia = new boolean[] {false} ;
      T01465_A9580Pas_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T01465_n9580Pas_Hora = new boolean[] {false} ;
      T01465_A9581Pas_Usu = new String[] {""} ;
      T01465_n9581Pas_Usu = new boolean[] {false} ;
      T01465_A9582Pas_Term = new String[] {""} ;
      T01465_n9582Pas_Term = new boolean[] {false} ;
      T01465_A9585Pas_DiaP = new java.util.Date[] {GXutil.nullDate()} ;
      T01465_n9585Pas_DiaP = new boolean[] {false} ;
      T01465_A9586Pas_UsuP = new String[] {""} ;
      T01465_n9586Pas_UsuP = new boolean[] {false} ;
      T01465_A9587Pas_HorP = new java.util.Date[] {GXutil.nullDate()} ;
      T01465_n9587Pas_HorP = new boolean[] {false} ;
      T01465_A9588Pas_Est = new byte[1] ;
      T01465_n9588Pas_Est = new boolean[] {false} ;
      T01465_A9589Pas_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01465_n9589Pas_Kgs = new boolean[] {false} ;
      T01465_A396EmprCod = new String[] {""} ;
      T01465_A2107PasCod = new String[] {""} ;
      T01465_n2107PasCod = new boolean[] {false} ;
      T014617_A2108PasDsc = new String[] {""} ;
      T014617_n2108PasDsc = new boolean[] {false} ;
      T014618_A396EmprCod = new String[] {""} ;
      T014618_A9578Pas_Num = new int[1] ;
      T014619_A9578Pas_Num = new int[1] ;
      T014619_A9583Pas_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014619_n9583Pas_Cant = new boolean[] {false} ;
      T014619_A9584Pas_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014619_n9584Pas_CantP = new boolean[] {false} ;
      T014619_A9590Pas_Unid = new String[] {""} ;
      T014619_n9590Pas_Unid = new boolean[] {false} ;
      T014619_A13177Pas_Order = new short[1] ;
      T014619_n13177Pas_Order = new boolean[] {false} ;
      T014619_A396EmprCod = new String[] {""} ;
      T014619_A719PrdNum = new String[] {""} ;
      T01464_A396EmprCod = new String[] {""} ;
      T014620_A396EmprCod = new String[] {""} ;
      T014621_A396EmprCod = new String[] {""} ;
      T014621_A9578Pas_Num = new int[1] ;
      T014621_A719PrdNum = new String[] {""} ;
      T01463_A9578Pas_Num = new int[1] ;
      T01463_A9583Pas_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01463_n9583Pas_Cant = new boolean[] {false} ;
      T01463_A9584Pas_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01463_n9584Pas_CantP = new boolean[] {false} ;
      T01463_A9590Pas_Unid = new String[] {""} ;
      T01463_n9590Pas_Unid = new boolean[] {false} ;
      T01463_A13177Pas_Order = new short[1] ;
      T01463_n13177Pas_Order = new boolean[] {false} ;
      T01463_A396EmprCod = new String[] {""} ;
      T01463_A719PrdNum = new String[] {""} ;
      T01462_A9578Pas_Num = new int[1] ;
      T01462_A9583Pas_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01462_n9583Pas_Cant = new boolean[] {false} ;
      T01462_A9584Pas_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01462_n9584Pas_CantP = new boolean[] {false} ;
      T01462_A9590Pas_Unid = new String[] {""} ;
      T01462_n9590Pas_Unid = new boolean[] {false} ;
      T01462_A13177Pas_Order = new short[1] ;
      T01462_n13177Pas_Order = new boolean[] {false} ;
      T01462_A396EmprCod = new String[] {""} ;
      T01462_A719PrdNum = new String[] {""} ;
      T014625_A396EmprCod = new String[] {""} ;
      T014625_A9578Pas_Num = new int[1] ;
      T014625_A719PrdNum = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T014626_A407EmprNom = new String[] {""} ;
      T014626_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9579Pas_Dia = GXutil.nullDate() ;
      ZZ9580Pas_Hora = GXutil.resetTime( GXutil.nullDate() );
      ZZ9581Pas_Usu = "" ;
      ZZ9582Pas_Term = "" ;
      ZZ407EmprNom = "" ;
      ZZ2107PasCod = "" ;
      ZZ9585Pas_DiaP = GXutil.nullDate() ;
      ZZ9586Pas_UsuP = "" ;
      ZZ9587Pas_HorP = GXutil.resetTime( GXutil.nullDate() );
      ZZ9589Pas_Kgs = DecimalUtil.ZERO ;
      ZZ2108PasDsc = "" ;
      T014627_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmakepa__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmakepa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmakepa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmakepa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmakepa__default(),
         new Object[] {
             new Object[] {
            T01462_A9578Pas_Num, T01462_A9583Pas_Cant, T01462_n9583Pas_Cant, T01462_A9584Pas_CantP, T01462_n9584Pas_CantP, T01462_A9590Pas_Unid, T01462_n9590Pas_Unid, T01462_A13177Pas_Order, T01462_n13177Pas_Order, T01462_A396EmprCod,
            T01462_A719PrdNum
            }
            , new Object[] {
            T01463_A9578Pas_Num, T01463_A9583Pas_Cant, T01463_n9583Pas_Cant, T01463_A9584Pas_CantP, T01463_n9584Pas_CantP, T01463_A9590Pas_Unid, T01463_n9590Pas_Unid, T01463_A13177Pas_Order, T01463_n13177Pas_Order, T01463_A396EmprCod,
            T01463_A719PrdNum
            }
            , new Object[] {
            T01464_A396EmprCod
            }
            , new Object[] {
            T01465_A9578Pas_Num, T01465_A9579Pas_Dia, T01465_n9579Pas_Dia, T01465_A9580Pas_Hora, T01465_n9580Pas_Hora, T01465_A9581Pas_Usu, T01465_n9581Pas_Usu, T01465_A9582Pas_Term, T01465_n9582Pas_Term, T01465_A9585Pas_DiaP,
            T01465_n9585Pas_DiaP, T01465_A9586Pas_UsuP, T01465_n9586Pas_UsuP, T01465_A9587Pas_HorP, T01465_n9587Pas_HorP, T01465_A9588Pas_Est, T01465_n9588Pas_Est, T01465_A9589Pas_Kgs, T01465_n9589Pas_Kgs, T01465_A396EmprCod,
            T01465_A2107PasCod, T01465_n2107PasCod
            }
            , new Object[] {
            T01466_A9578Pas_Num, T01466_A9579Pas_Dia, T01466_n9579Pas_Dia, T01466_A9580Pas_Hora, T01466_n9580Pas_Hora, T01466_A9581Pas_Usu, T01466_n9581Pas_Usu, T01466_A9582Pas_Term, T01466_n9582Pas_Term, T01466_A9585Pas_DiaP,
            T01466_n9585Pas_DiaP, T01466_A9586Pas_UsuP, T01466_n9586Pas_UsuP, T01466_A9587Pas_HorP, T01466_n9587Pas_HorP, T01466_A9588Pas_Est, T01466_n9588Pas_Est, T01466_A9589Pas_Kgs, T01466_n9589Pas_Kgs, T01466_A396EmprCod,
            T01466_A2107PasCod, T01466_n2107PasCod
            }
            , new Object[] {
            T01467_A407EmprNom, T01467_n407EmprNom
            }
            , new Object[] {
            T01468_A2108PasDsc, T01468_n2108PasDsc
            }
            , new Object[] {
            T01469_A9578Pas_Num, T01469_A9579Pas_Dia, T01469_n9579Pas_Dia, T01469_A9580Pas_Hora, T01469_n9580Pas_Hora, T01469_A9581Pas_Usu, T01469_n9581Pas_Usu, T01469_A9582Pas_Term, T01469_n9582Pas_Term, T01469_A407EmprNom,
            T01469_n407EmprNom, T01469_A2108PasDsc, T01469_n2108PasDsc, T01469_A9585Pas_DiaP, T01469_n9585Pas_DiaP, T01469_A9586Pas_UsuP, T01469_n9586Pas_UsuP, T01469_A9587Pas_HorP, T01469_n9587Pas_HorP, T01469_A9588Pas_Est,
            T01469_n9588Pas_Est, T01469_A9589Pas_Kgs, T01469_n9589Pas_Kgs, T01469_A396EmprCod, T01469_A2107PasCod, T01469_n2107PasCod
            }
            , new Object[] {
            T014610_A2108PasDsc, T014610_n2108PasDsc
            }
            , new Object[] {
            T014611_A396EmprCod, T014611_A9578Pas_Num
            }
            , new Object[] {
            T014612_A396EmprCod, T014612_A9578Pas_Num
            }
            , new Object[] {
            T014613_A396EmprCod, T014613_A9578Pas_Num
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T014617_A2108PasDsc, T014617_n2108PasDsc
            }
            , new Object[] {
            T014618_A396EmprCod, T014618_A9578Pas_Num
            }
            , new Object[] {
            T014619_A9578Pas_Num, T014619_A9583Pas_Cant, T014619_n9583Pas_Cant, T014619_A9584Pas_CantP, T014619_n9584Pas_CantP, T014619_A9590Pas_Unid, T014619_n9590Pas_Unid, T014619_A13177Pas_Order, T014619_n13177Pas_Order, T014619_A396EmprCod,
            T014619_A719PrdNum
            }
            , new Object[] {
            T014620_A396EmprCod
            }
            , new Object[] {
            T014621_A396EmprCod, T014621_A9578Pas_Num, T014621_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T014625_A396EmprCod, T014625_A9578Pas_Num, T014625_A719PrdNum
            }
            , new Object[] {
            T014626_A407EmprNom, T014626_n407EmprNom
            }
            , new Object[] {
            T014627_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TMAKEPA" ;
   }

   private byte Z9588Pas_Est ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A9588Pas_Est ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ9588Pas_Est ;
   private short Z13177Pas_Order ;
   private short nRcdDeleted_1250 ;
   private short nRcdExists_1250 ;
   private short nIsMod_1250 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1250 ;
   private short RcdFound1250 ;
   private short nBlankRcdUsr1250 ;
   private short A13177Pas_Order ;
   private short RcdFound1249 ;
   private short nIsDirty_1249 ;
   private short nIsDirty_1250 ;
   private int Z9578Pas_Num ;
   private int nRC_GXsfl_90 ;
   private int nGXsfl_90_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A9578Pas_Num ;
   private int edtPas_Num_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPas_Dia_Enabled ;
   private int edtPas_Hora_Enabled ;
   private int edtPas_Usu_Enabled ;
   private int edtPas_Term_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPasCod_Enabled ;
   private int edtPasDsc_Enabled ;
   private int edtPas_DiaP_Enabled ;
   private int edtPas_UsuP_Enabled ;
   private int edtPas_HorP_Enabled ;
   private int edtPas_Est_Enabled ;
   private int edtPas_Kgs_Enabled ;
   private int edtavnRcdDeleted_1250_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPas_Cant_Enabled ;
   private int edtPas_CantP_Enabled ;
   private int edtPas_Unid_Enabled ;
   private int edtPas_Order_Enabled ;
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
   private int defedtPrdNum_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPas_Kgs_Backcolor ;
   private int edtPas_Est_Backcolor ;
   private int edtPas_HorP_Backcolor ;
   private int edtPas_UsuP_Backcolor ;
   private int edtPas_DiaP_Backcolor ;
   private int edtPasDsc_Backcolor ;
   private int edtPasCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPas_Term_Backcolor ;
   private int edtPas_Usu_Backcolor ;
   private int edtPas_Hora_Backcolor ;
   private int edtPas_Dia_Backcolor ;
   private int edtPas_Num_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ9578Pas_Num ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9589Pas_Kgs ;
   private java.math.BigDecimal Z9583Pas_Cant ;
   private java.math.BigDecimal Z9584Pas_CantP ;
   private java.math.BigDecimal A9589Pas_Kgs ;
   private java.math.BigDecimal A9583Pas_Cant ;
   private java.math.BigDecimal A9584Pas_CantP ;
   private java.math.BigDecimal ZZ9589Pas_Kgs ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9581Pas_Usu ;
   private String Z9582Pas_Term ;
   private String Z9586Pas_UsuP ;
   private String Z2107PasCod ;
   private String Z719PrdNum ;
   private String Z9590Pas_Unid ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2107PasCod ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPas_Num_Internalname ;
   private String sGXsfl_90_idx="0001" ;
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
   private String edtPas_Num_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPas_Dia_Internalname ;
   private String edtPas_Dia_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPas_Hora_Internalname ;
   private String edtPas_Hora_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPas_Usu_Internalname ;
   private String A9581Pas_Usu ;
   private String edtPas_Usu_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPas_Term_Internalname ;
   private String A9582Pas_Term ;
   private String edtPas_Term_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPasCod_Internalname ;
   private String edtPasCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPasDsc_Internalname ;
   private String A2108PasDsc ;
   private String edtPasDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPas_DiaP_Internalname ;
   private String edtPas_DiaP_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPas_UsuP_Internalname ;
   private String A9586Pas_UsuP ;
   private String edtPas_UsuP_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPas_HorP_Internalname ;
   private String edtPas_HorP_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPas_Est_Internalname ;
   private String edtPas_Est_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtPas_Kgs_Internalname ;
   private String edtPas_Kgs_Jsonclick ;
   private String sMode1250 ;
   private String edtavnRcdDeleted_1250_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPas_Cant_Internalname ;
   private String edtPas_CantP_Internalname ;
   private String edtPas_Unid_Internalname ;
   private String edtPas_Order_Internalname ;
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
   private String sMode1249 ;
   private String GXCCtl ;
   private String A9590Pas_Unid ;
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
   private String Z2108PasDsc ;
   private String sGXsfl_90_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1250_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPas_Cant_Jsonclick ;
   private String edtPas_CantP_Jsonclick ;
   private String edtPas_Unid_Jsonclick ;
   private String edtPas_Order_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ9581Pas_Usu ;
   private String ZZ9582Pas_Term ;
   private String ZZ407EmprNom ;
   private String ZZ2107PasCod ;
   private String ZZ9586Pas_UsuP ;
   private String ZZ2108PasDsc ;
   private java.util.Date Z9580Pas_Hora ;
   private java.util.Date Z9587Pas_HorP ;
   private java.util.Date A9580Pas_Hora ;
   private java.util.Date A9587Pas_HorP ;
   private java.util.Date ZZ9580Pas_Hora ;
   private java.util.Date ZZ9587Pas_HorP ;
   private java.util.Date Z9579Pas_Dia ;
   private java.util.Date Z9585Pas_DiaP ;
   private java.util.Date A9579Pas_Dia ;
   private java.util.Date A9585Pas_DiaP ;
   private java.util.Date ZZ9579Pas_Dia ;
   private java.util.Date ZZ9585Pas_DiaP ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n2107PasCod ;
   private boolean wbErr ;
   private boolean bGXsfl_90_Refreshing=false ;
   private boolean n9579Pas_Dia ;
   private boolean n9580Pas_Hora ;
   private boolean n9581Pas_Usu ;
   private boolean n9582Pas_Term ;
   private boolean n407EmprNom ;
   private boolean n2108PasDsc ;
   private boolean n9585Pas_DiaP ;
   private boolean n9586Pas_UsuP ;
   private boolean n9587Pas_HorP ;
   private boolean n9588Pas_Est ;
   private boolean n9589Pas_Kgs ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n9583Pas_Cant ;
   private boolean n9584Pas_CantP ;
   private boolean n9590Pas_Unid ;
   private boolean n13177Pas_Order ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01467_A407EmprNom ;
   private boolean[] T01467_n407EmprNom ;
   private int[] T01469_A9578Pas_Num ;
   private java.util.Date[] T01469_A9579Pas_Dia ;
   private boolean[] T01469_n9579Pas_Dia ;
   private java.util.Date[] T01469_A9580Pas_Hora ;
   private boolean[] T01469_n9580Pas_Hora ;
   private String[] T01469_A9581Pas_Usu ;
   private boolean[] T01469_n9581Pas_Usu ;
   private String[] T01469_A9582Pas_Term ;
   private boolean[] T01469_n9582Pas_Term ;
   private String[] T01469_A407EmprNom ;
   private boolean[] T01469_n407EmprNom ;
   private String[] T01469_A2108PasDsc ;
   private boolean[] T01469_n2108PasDsc ;
   private java.util.Date[] T01469_A9585Pas_DiaP ;
   private boolean[] T01469_n9585Pas_DiaP ;
   private String[] T01469_A9586Pas_UsuP ;
   private boolean[] T01469_n9586Pas_UsuP ;
   private java.util.Date[] T01469_A9587Pas_HorP ;
   private boolean[] T01469_n9587Pas_HorP ;
   private byte[] T01469_A9588Pas_Est ;
   private boolean[] T01469_n9588Pas_Est ;
   private java.math.BigDecimal[] T01469_A9589Pas_Kgs ;
   private boolean[] T01469_n9589Pas_Kgs ;
   private String[] T01469_A396EmprCod ;
   private String[] T01469_A2107PasCod ;
   private boolean[] T01469_n2107PasCod ;
   private String[] T01468_A2108PasDsc ;
   private boolean[] T01468_n2108PasDsc ;
   private String[] T014610_A2108PasDsc ;
   private boolean[] T014610_n2108PasDsc ;
   private String[] T014611_A396EmprCod ;
   private int[] T014611_A9578Pas_Num ;
   private int[] T01466_A9578Pas_Num ;
   private java.util.Date[] T01466_A9579Pas_Dia ;
   private boolean[] T01466_n9579Pas_Dia ;
   private java.util.Date[] T01466_A9580Pas_Hora ;
   private boolean[] T01466_n9580Pas_Hora ;
   private String[] T01466_A9581Pas_Usu ;
   private boolean[] T01466_n9581Pas_Usu ;
   private String[] T01466_A9582Pas_Term ;
   private boolean[] T01466_n9582Pas_Term ;
   private java.util.Date[] T01466_A9585Pas_DiaP ;
   private boolean[] T01466_n9585Pas_DiaP ;
   private String[] T01466_A9586Pas_UsuP ;
   private boolean[] T01466_n9586Pas_UsuP ;
   private java.util.Date[] T01466_A9587Pas_HorP ;
   private boolean[] T01466_n9587Pas_HorP ;
   private byte[] T01466_A9588Pas_Est ;
   private boolean[] T01466_n9588Pas_Est ;
   private java.math.BigDecimal[] T01466_A9589Pas_Kgs ;
   private boolean[] T01466_n9589Pas_Kgs ;
   private String[] T01466_A396EmprCod ;
   private String[] T01466_A2107PasCod ;
   private boolean[] T01466_n2107PasCod ;
   private String[] T014612_A396EmprCod ;
   private int[] T014612_A9578Pas_Num ;
   private String[] T014613_A396EmprCod ;
   private int[] T014613_A9578Pas_Num ;
   private int[] T01465_A9578Pas_Num ;
   private java.util.Date[] T01465_A9579Pas_Dia ;
   private boolean[] T01465_n9579Pas_Dia ;
   private java.util.Date[] T01465_A9580Pas_Hora ;
   private boolean[] T01465_n9580Pas_Hora ;
   private String[] T01465_A9581Pas_Usu ;
   private boolean[] T01465_n9581Pas_Usu ;
   private String[] T01465_A9582Pas_Term ;
   private boolean[] T01465_n9582Pas_Term ;
   private java.util.Date[] T01465_A9585Pas_DiaP ;
   private boolean[] T01465_n9585Pas_DiaP ;
   private String[] T01465_A9586Pas_UsuP ;
   private boolean[] T01465_n9586Pas_UsuP ;
   private java.util.Date[] T01465_A9587Pas_HorP ;
   private boolean[] T01465_n9587Pas_HorP ;
   private byte[] T01465_A9588Pas_Est ;
   private boolean[] T01465_n9588Pas_Est ;
   private java.math.BigDecimal[] T01465_A9589Pas_Kgs ;
   private boolean[] T01465_n9589Pas_Kgs ;
   private String[] T01465_A396EmprCod ;
   private String[] T01465_A2107PasCod ;
   private boolean[] T01465_n2107PasCod ;
   private String[] T014617_A2108PasDsc ;
   private boolean[] T014617_n2108PasDsc ;
   private String[] T014618_A396EmprCod ;
   private int[] T014618_A9578Pas_Num ;
   private int[] T014619_A9578Pas_Num ;
   private java.math.BigDecimal[] T014619_A9583Pas_Cant ;
   private boolean[] T014619_n9583Pas_Cant ;
   private java.math.BigDecimal[] T014619_A9584Pas_CantP ;
   private boolean[] T014619_n9584Pas_CantP ;
   private String[] T014619_A9590Pas_Unid ;
   private boolean[] T014619_n9590Pas_Unid ;
   private short[] T014619_A13177Pas_Order ;
   private boolean[] T014619_n13177Pas_Order ;
   private String[] T014619_A396EmprCod ;
   private String[] T014619_A719PrdNum ;
   private String[] T01464_A396EmprCod ;
   private String[] T014620_A396EmprCod ;
   private String[] T014621_A396EmprCod ;
   private int[] T014621_A9578Pas_Num ;
   private String[] T014621_A719PrdNum ;
   private int[] T01463_A9578Pas_Num ;
   private java.math.BigDecimal[] T01463_A9583Pas_Cant ;
   private boolean[] T01463_n9583Pas_Cant ;
   private java.math.BigDecimal[] T01463_A9584Pas_CantP ;
   private boolean[] T01463_n9584Pas_CantP ;
   private String[] T01463_A9590Pas_Unid ;
   private boolean[] T01463_n9590Pas_Unid ;
   private short[] T01463_A13177Pas_Order ;
   private boolean[] T01463_n13177Pas_Order ;
   private String[] T01463_A396EmprCod ;
   private String[] T01463_A719PrdNum ;
   private int[] T01462_A9578Pas_Num ;
   private java.math.BigDecimal[] T01462_A9583Pas_Cant ;
   private boolean[] T01462_n9583Pas_Cant ;
   private java.math.BigDecimal[] T01462_A9584Pas_CantP ;
   private boolean[] T01462_n9584Pas_CantP ;
   private String[] T01462_A9590Pas_Unid ;
   private boolean[] T01462_n9590Pas_Unid ;
   private short[] T01462_A13177Pas_Order ;
   private boolean[] T01462_n13177Pas_Order ;
   private String[] T01462_A396EmprCod ;
   private String[] T01462_A719PrdNum ;
   private String[] T014625_A396EmprCod ;
   private int[] T014625_A9578Pas_Num ;
   private String[] T014625_A719PrdNum ;
   private String[] T014626_A407EmprNom ;
   private boolean[] T014626_n407EmprNom ;
   private String[] T014627_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmakepa__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmakepa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmakepa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmakepa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmakepa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01462", "SELECT Pas_Num, Pas_Cant, Pas_CantP, Pas_Unid, Pas_Order, EmprCod, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND Pas_Num = ? AND PrdNum = ?  FOR UPDATE OF Pas_Cant, Pas_CantP, Pas_Unid, Pas_Order NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01463", "SELECT Pas_Num, Pas_Cant, Pas_CantP, Pas_Unid, Pas_Order, EmprCod, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND Pas_Num = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01464", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01465", "SELECT Pas_Num, Pas_Dia, Pas_Hora, Pas_Usu, Pas_Term, Pas_DiaP, Pas_UsuP, Pas_HorP, Pas_Est, Pas_Kgs, EmprCod, PasCod FROM TXPMAKEPA WHERE EmprCod = ? AND Pas_Num = ?  FOR UPDATE OF Pas_Dia, Pas_Hora, Pas_Usu, Pas_Term, Pas_DiaP, Pas_UsuP, Pas_HorP, Pas_Est, Pas_Kgs, PasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01466", "SELECT Pas_Num, Pas_Dia, Pas_Hora, Pas_Usu, Pas_Term, Pas_DiaP, Pas_UsuP, Pas_HorP, Pas_Est, Pas_Kgs, EmprCod, PasCod FROM TXPMAKEPA WHERE EmprCod = ? AND Pas_Num = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01467", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01468", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01469", "SELECT /*+ FIRST_ROWS(100) */ TM1.Pas_Num, TM1.Pas_Dia, TM1.Pas_Hora, TM1.Pas_Usu, TM1.Pas_Term, T2.EmprNom, T3.PasDsc, TM1.Pas_DiaP, TM1.Pas_UsuP, TM1.Pas_HorP, TM1.Pas_Est, TM1.Pas_Kgs, TM1.EmprCod, TM1.PasCod FROM ((TXPMAKEPA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCPASTA T3 ON T3.EmprCod = TM1.EmprCod AND T3.PasCod = TM1.PasCod) WHERE TM1.EmprCod = ? and TM1.Pas_Num = ? ORDER BY TM1.EmprCod, TM1.Pas_Num ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014610", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014611", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pas_Num FROM TXPMAKEPA WHERE EmprCod = ? AND Pas_Num = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014612", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pas_Num FROM TXPMAKEPA WHERE ( Pas_Num > ?) and EmprCod = ? ORDER BY EmprCod, Pas_Num) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014613", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pas_Num FROM TXPMAKEPA WHERE ( Pas_Num < ?) and EmprCod = ? ORDER BY EmprCod DESC, Pas_Num DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T014614", "INSERT INTO TXPMAKEPA(Pas_Num, Pas_Dia, Pas_Hora, Pas_Usu, Pas_Term, Pas_DiaP, Pas_UsuP, Pas_HorP, Pas_Est, Pas_Kgs, EmprCod, PasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAKEPA")
         ,new UpdateCursor("T014615", "UPDATE TXPMAKEPA SET Pas_Dia=?, Pas_Hora=?, Pas_Usu=?, Pas_Term=?, Pas_DiaP=?, Pas_UsuP=?, Pas_HorP=?, Pas_Est=?, Pas_Kgs=?, PasCod=?  WHERE EmprCod = ? AND Pas_Num = ?", GX_NOMASK, "TXPMAKEPA")
         ,new UpdateCursor("T014616", "DELETE FROM TXPMAKEPA  WHERE EmprCod = ? AND Pas_Num = ?", GX_NOMASK, "TXPMAKEPA")
         ,new ForEachCursor("T014617", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014618", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Pas_Num FROM TXPMAKEPA WHERE EmprCod = ? ORDER BY EmprCod, Pas_Num ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014619", "SELECT Pas_Num, Pas_Cant, Pas_CantP, Pas_Unid, Pas_Order, EmprCod, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? and Pas_Num = ? and PrdNum = ? ORDER BY EmprCod, Pas_Num, PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014620", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014621", "SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND Pas_Num = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T014622", "INSERT INTO TXPMAKEP1(Pas_Num, Pas_Cant, Pas_CantP, Pas_Unid, Pas_Order, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAKEP1")
         ,new UpdateCursor("T014623", "UPDATE TXPMAKEP1 SET Pas_Cant=?, Pas_CantP=?, Pas_Unid=?, Pas_Order=?  WHERE EmprCod = ? AND Pas_Num = ? AND PrdNum = ?", GX_NOMASK, "TXPMAKEP1")
         ,new UpdateCursor("T014624", "DELETE FROM TXPMAKEP1  WHERE EmprCod = ? AND Pas_Num = ? AND PrdNum = ?", GX_NOMASK, "TXPMAKEP1")
         ,new ForEachCursor("T014625", "SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? and Pas_Num = ? ORDER BY EmprCod, Pas_Num, PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014626", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014627", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((String[]) buf[20])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((String[]) buf[20])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((String[]) buf[24])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], true);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[14], true);
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 2);
               }
               stmt.setString(11, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 6);
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], true);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], true);
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
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 6);
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setInt(12, ((Number) parms[21]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 3);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               stmt.setString(6, (String)parms[9], 3);
               stmt.setString(7, (String)parms[10], 6);
               return;
            case 21 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

