package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tjornad_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A652OpeCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Histórico de Jornadas /Operari", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtJorFecha_Internalname ;
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
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
      A3717JorUltLin = (short)(GXutil.lval( httpContext.GetPar( "JorUltLin"))) ;
      n3717JorUltLin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public tjornad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tjornad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tjornad_impl.class ));
   }

   public tjornad_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TJornad.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Fecha Laboral", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtJorFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJorFecha_Internalname, localUtil.format(A3710JorFecha, "99/99/99"), localUtil.format( A3710JorFecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJorFecha_Jsonclick, 0, "", "", "", "", "", 1, edtJorFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtJorFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtJorFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TJornad.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Hora Inicio  de Jornada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJorHHIni_Internalname, GXutil.ltrim( localUtil.ntoc( A3711JorHHIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJorHHIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3711JorHHIni), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3711JorHHIni), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJorHHIni_Jsonclick, 0, "", "", "", "", "", 1, edtJorHHIni_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Minutos Inicio de Jornada", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJorMMIni_Internalname, GXutil.ltrim( localUtil.ntoc( A3712JorMMIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJorMMIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3712JorMMIni), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3712JorMMIni), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJorMMIni_Jsonclick, 0, "", "", "", "", "", 1, edtJorMMIni_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Hora Fin de Jornada", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJorHHFin_Internalname, GXutil.ltrim( localUtil.ntoc( A3713JorHHFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJorHHFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3713JorHHFin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3713JorHHFin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJorHHFin_Jsonclick, 0, "", "", "", "", "", 1, edtJorHHFin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Minutos Fin de Jornada", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJorMMFin_Internalname, GXutil.ltrim( localUtil.ntoc( A3714JorMMFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJorMMFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3714JorMMFin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3714JorMMFin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJorMMFin_Jsonclick, 0, "", "", "", "", "", 1, edtJorMMFin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Horas Netas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtJorHorNet_Internalname, GXutil.ltrim( localUtil.ntoc( A3715JorHorNet, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJorHorNet_Enabled!=0) ? localUtil.format( A3715JorHorNet, "Z9.99") : localUtil.format( A3715JorHorNet, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJorHorNet_Jsonclick, 0, "", "", "", "", "", 1, edtJorHorNet_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Total de Paros de la Jornada", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtJorParTot_Internalname, GXutil.ltrim( localUtil.ntoc( A3716JorParTot, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJorParTot_Enabled!=0) ? localUtil.format( A3716JorParTot, "Z9.99") : localUtil.format( A3716JorParTot, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJorParTot_Jsonclick, 0, "", "", "", "", "", 1, edtJorParTot_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ultima línea de Paro", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtJorUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3717JorUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJorUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3717JorUltLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3717JorUltLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJorUltLin_Jsonclick, 0, "", "", "", "", "", 1, edtJorUltLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJornad.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol80( ) ;
      nGXsfl_80_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1616 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1616 = (short)(1) ;
            scanStart1GM1616( ) ;
            while ( RcdFound1616 != 0 )
            {
               init_level_properties1616( ) ;
               getByPrimaryKey1GM1616( ) ;
               addRow1GM1616( ) ;
               scanNext1GM1616( ) ;
            }
            scanEnd1GM1616( ) ;
            nBlankRcdCount1616 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3717JorUltLin = A3717JorUltLin ;
         n3717JorUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         B3716JorParTot = A3716JorParTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
         standaloneNotModal1GM1616( ) ;
         standaloneModal1GM1616( ) ;
         sMode1616 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow1GM1616( ) ;
            edtavnRcdDeleted_1616_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1616_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1616_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1616_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParHHIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARHHINI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParHHIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParHHIni_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParMMIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARMMINI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParMMIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMMIni_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParHHFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARHHFIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParHHFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParHHFin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParMMFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARMMFIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParMMFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMMFin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParHorNet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARHORNET_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParHorNet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParHorNet_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAROBS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParObs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1616 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1GM1616( ) ;
            }
            sendRow1GM1616( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1616 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3717JorUltLin = B3717JorUltLin ;
         n3717JorUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         A3716JorParTot = B3716JorParTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1616 = (short)(5) ;
         nRcdExists_1616 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1GM1616( ) ;
            while ( RcdFound1616 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801616( ) ;
               init_level_properties1616( ) ;
               standaloneNotModal1GM1616( ) ;
               getByPrimaryKey1GM1616( ) ;
               standaloneModal1GM1616( ) ;
               addRow1GM1616( ) ;
               scanNext1GM1616( ) ;
            }
            scanEnd1GM1616( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1616 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801616( ) ;
      initAll1GM1616( ) ;
      init_level_properties1616( ) ;
      B3717JorUltLin = A3717JorUltLin ;
      n3717JorUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
      B3716JorParTot = A3716JorParTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      nRcdExists_1616 = (short)(0) ;
      nIsMod_1616 = (short)(0) ;
      nRcdDeleted_1616 = (short)(0) ;
      nBlankRcdCount1616 = (short)(nBlankRcdUsr1616+nBlankRcdCount1616) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1616 > 0 )
      {
         standaloneNotModal1GM1616( ) ;
         standaloneModal1GM1616( ) ;
         addRow1GM1616( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtParLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1616 = (short)(nBlankRcdCount1616-1) ;
      }
      Gx_mode = sMode1616 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3717JorUltLin = B3717JorUltLin ;
      n3717JorUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
      A3716JorParTot = B3716JorParTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJornad.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TJornad.htm");
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
      e111GM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z3710JorFecha = localUtil.ctod( httpContext.cgiGet( "Z3710JorFecha"), 0) ;
            Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3711JorHHIni = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3711JorHHIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3712JorMMIni = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3712JorMMIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3713JorHHFin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3713JorHHFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3714JorMMFin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3714JorMMFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3717JorUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z3717JorUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3717JorUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O3717JorUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3716JorParTot = localUtil.ctond( httpContext.cgiGet( "O3716JorParTot")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( localUtil.vcdate( httpContext.cgiGet( edtJorFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "JORFECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJorFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3710JorFecha = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
            }
            else
            {
               A3710JorFecha = localUtil.ctod( httpContext.cgiGet( edtJorFecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A652OpeCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            }
            else
            {
               A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            }
            A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
            n653OpeNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtJorHHIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtJorHHIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "JORHHINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJorHHIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3711JorHHIni = (byte)(0) ;
               n3711JorHHIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3711JorHHIni), 2, 0));
            }
            else
            {
               A3711JorHHIni = (byte)(localUtil.ctol( httpContext.cgiGet( edtJorHHIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3711JorHHIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3711JorHHIni), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtJorMMIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtJorMMIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "JORMMINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJorMMIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3712JorMMIni = (byte)(0) ;
               n3712JorMMIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3712JorMMIni), 2, 0));
            }
            else
            {
               A3712JorMMIni = (byte)(localUtil.ctol( httpContext.cgiGet( edtJorMMIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3712JorMMIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3712JorMMIni), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtJorHHFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtJorHHFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "JORHHFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJorHHFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3713JorHHFin = (byte)(0) ;
               n3713JorHHFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3713JorHHFin), 2, 0));
            }
            else
            {
               A3713JorHHFin = (byte)(localUtil.ctol( httpContext.cgiGet( edtJorHHFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3713JorHHFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3713JorHHFin), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtJorMMFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtJorMMFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "JORMMFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJorMMFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3714JorMMFin = (byte)(0) ;
               n3714JorMMFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3714JorMMFin), 2, 0));
            }
            else
            {
               A3714JorMMFin = (byte)(localUtil.ctol( httpContext.cgiGet( edtJorMMFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3714JorMMFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3714JorMMFin), 2, 0));
            }
            A3715JorHorNet = localUtil.ctond( httpContext.cgiGet( edtJorHorNet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3715JorHorNet", GXutil.ltrimstr( A3715JorHorNet, 5, 2));
            A3716JorParTot = localUtil.ctond( httpContext.cgiGet( edtJorParTot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
            A3717JorUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtJorUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3717JorUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
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
               A3710JorFecha = localUtil.parseDateParm( httpContext.GetPar( "JorFecha")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
               A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
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
                        e111GM2 ();
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
            initAll1GM1615( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1616_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1616_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes1GM1615( ) ;
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

   public void confirm_1GM0( )
   {
      beforeValidate1GM1615( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GM1615( ) ;
         }
         else
         {
            checkExtendedTable1GM1615( ) ;
            if ( AnyError == 0 )
            {
               zm1GM1615( 20) ;
               zm1GM1615( 21) ;
            }
            closeExtendedTableCursors1GM1615( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1615 = Gx_mode ;
         confirm_1GM1616( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1615 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1615 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1GM0( ) ;
      }
   }

   public void confirm_1GM1616( )
   {
      s3717JorUltLin = O3717JorUltLin ;
      n3717JorUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
      s3716JorParTot = O3716JorParTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1GM1616( ) ;
         if ( ( nRcdExists_1616 != 0 ) || ( nIsMod_1616 != 0 ) )
         {
            getKey1GM1616( ) ;
            if ( ( nRcdExists_1616 == 0 ) && ( nRcdDeleted_1616 == 0 ) )
            {
               if ( RcdFound1616 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1GM1616( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1GM1616( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1GM1616( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3717JorUltLin = A3717JorUltLin ;
                     n3717JorUltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
                     O3716JorParTot = A3716JorParTot ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
                  }
               }
               else
               {
                  GXCCtl = "PARLIN_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1616 != 0 )
               {
                  if ( nRcdDeleted_1616 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1GM1616( ) ;
                     load1GM1616( ) ;
                     beforeValidate1GM1616( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1GM1616( ) ;
                        O3717JorUltLin = A3717JorUltLin ;
                        n3717JorUltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
                        O3716JorParTot = A3716JorParTot ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1616 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1GM1616( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1GM1616( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1GM1616( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3717JorUltLin = A3717JorUltLin ;
                           n3717JorUltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
                           O3716JorParTot = A3716JorParTot ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1616 == 0 )
                  {
                     GXCCtl = "PARLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1616_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3718ParLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParHHIni_Internalname, GXutil.ltrim( localUtil.ntoc( A3719ParHHIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParMMIni_Internalname, GXutil.ltrim( localUtil.ntoc( A3720ParMMIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParHHFin_Internalname, GXutil.ltrim( localUtil.ntoc( A3721ParHHFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParMMFin_Internalname, GXutil.ltrim( localUtil.ntoc( A3722ParMMFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParHorNet_Internalname, GXutil.ltrim( localUtil.ntoc( A3723ParHorNet, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParObs_Internalname, GXutil.rtrim( A3724ParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3718ParLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3718ParLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3719ParHHIni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3719ParHHIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3720ParMMIni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3720ParMMIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3721ParHHFin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3721ParHHFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3722ParMMFin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3722ParMMFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3724ParObs_"+sGXsfl_80_idx, GXutil.rtrim( Z3724ParObs)) ;
         httpContext.changePostValue( "T3723ParHorNet_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O3723ParHorNet, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1616_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1616_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1616_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1616 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1616_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1616_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARHHINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHHIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARMMINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMMIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARHHFIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHHFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARMMFIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMMFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARHORNET_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHorNet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAROBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3717JorUltLin = s3717JorUltLin ;
      n3717JorUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
      O3716JorParTot = s3716JorParTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1GM0( )
   {
   }

   public void e111GM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      tjornad_impl.this.A396EmprCod = GXv_char1[0] ;
      tjornad_impl.this.AV11EmprNom = GXv_char2[0] ;
      tjornad_impl.this.AV8UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char4 = AV7Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tjornad_impl.this.GXt_char4 = GXv_char3[0] ;
      AV7Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      AV10Lit1 = httpContext.getMessage( "Histórico de Jornadas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char4 = AV13Lit2 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char3) ;
      tjornad_impl.this.GXt_char4 = GXv_char3[0] ;
      AV13Lit2 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit2", AV13Lit2);
      GXt_char4 = AV9LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tjornad_impl.this.GXt_char4 = GXv_char3[0] ;
      AV9LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
   }

   public void zm1GM1615( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3711JorHHIni = T01GM5_A3711JorHHIni[0] ;
            Z3712JorMMIni = T01GM5_A3712JorMMIni[0] ;
            Z3713JorHHFin = T01GM5_A3713JorHHFin[0] ;
            Z3714JorMMFin = T01GM5_A3714JorMMFin[0] ;
            Z3717JorUltLin = T01GM5_A3717JorUltLin[0] ;
         }
         else
         {
            Z3711JorHHIni = A3711JorHHIni ;
            Z3712JorMMIni = A3712JorMMIni ;
            Z3713JorHHFin = A3713JorHHFin ;
            Z3714JorMMFin = A3714JorMMFin ;
            Z3717JorUltLin = A3717JorUltLin ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z3710JorFecha = A3710JorFecha ;
         Z3711JorHHIni = A3711JorHHIni ;
         Z3712JorMMIni = A3712JorMMIni ;
         Z3713JorHHFin = A3713JorHHFin ;
         Z3714JorMMFin = A3714JorMMFin ;
         Z3717JorUltLin = A3717JorUltLin ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z407EmprNom = A407EmprNom ;
         Z653OpeNom = A653OpeNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtJorUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorUltLin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtJorUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorUltLin_Enabled), 5, 0), true);
      /* Using cursor T01GM6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01GM6_A407EmprNom[0] ;
      n407EmprNom = T01GM6_n407EmprNom[0] ;
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

   public void load1GM1615( )
   {
      /* Using cursor T01GM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1615 = (short)(1) ;
         A653OpeNom = T01GM8_A653OpeNom[0] ;
         n653OpeNom = T01GM8_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A407EmprNom = T01GM8_A407EmprNom[0] ;
         n407EmprNom = T01GM8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3711JorHHIni = T01GM8_A3711JorHHIni[0] ;
         n3711JorHHIni = T01GM8_n3711JorHHIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3711JorHHIni), 2, 0));
         A3712JorMMIni = T01GM8_A3712JorMMIni[0] ;
         n3712JorMMIni = T01GM8_n3712JorMMIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3712JorMMIni), 2, 0));
         A3713JorHHFin = T01GM8_A3713JorHHFin[0] ;
         n3713JorHHFin = T01GM8_n3713JorHHFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3713JorHHFin), 2, 0));
         A3714JorMMFin = T01GM8_A3714JorMMFin[0] ;
         n3714JorMMFin = T01GM8_n3714JorMMFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3714JorMMFin), 2, 0));
         A3717JorUltLin = T01GM8_A3717JorUltLin[0] ;
         n3717JorUltLin = T01GM8_n3717JorUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         zm1GM1615( -19) ;
      }
      pr_default.close(6);
      onLoadActions1GM1615( ) ;
   }

   public void onLoadActions1GM1615( )
   {
      getJorParTot( A396EmprCod, A3710JorFecha, A652OpeCod) ;
      O3716JorParTot = A3716JorParTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      A3716JorParTot = A3716JorParTot ;
      GXt_decimal5 = A3715JorHorNet ;
      GXv_int6[0] = A3711JorHHIni ;
      GXv_int7[0] = A3712JorMMIni ;
      GXv_int8[0] = A3713JorHHFin ;
      GXv_int9[0] = A3714JorMMFin ;
      GXv_decimal10[0] = GXt_decimal5 ;
      new app.core.phornet(remoteHandle, context).execute( GXv_int6, GXv_int7, GXv_int8, GXv_int9, GXv_decimal10) ;
      tjornad_impl.this.A3711JorHHIni = GXv_int6[0] ;
      tjornad_impl.this.A3712JorMMIni = GXv_int7[0] ;
      tjornad_impl.this.A3713JorHHFin = GXv_int8[0] ;
      tjornad_impl.this.A3714JorMMFin = GXv_int9[0] ;
      tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3711JorHHIni), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3712JorMMIni), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3713JorHHFin), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3714JorMMFin), 2, 0));
      A3715JorHorNet = GXt_decimal5 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3715JorHorNet", GXutil.ltrimstr( A3715JorHorNet, 5, 2));
   }

   public void checkExtendedTable1GM1615( )
   {
      nIsDirty_1615 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3710JorFecha)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe digitar fecha", ""), 1, "JORFECHA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJorFecha_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01GM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01GM7_A653OpeNom[0] ;
      n653OpeNom = T01GM7_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(5);
      getJorParTot( A396EmprCod, A3710JorFecha, A652OpeCod) ;
      A3716JorParTot = A3716JorParTot ;
      if ( ! ( ( ( A3711JorHHIni >= 0 ) && ( A3711JorHHIni <= 23 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hora Inicio  de Jornada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "JORHHINI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJorHHIni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1615 = (short)(1) ;
      GXt_decimal5 = A3715JorHorNet ;
      GXv_int9[0] = A3711JorHHIni ;
      GXv_int8[0] = A3712JorMMIni ;
      GXv_int7[0] = A3713JorHHFin ;
      GXv_int6[0] = A3714JorMMFin ;
      GXv_decimal10[0] = GXt_decimal5 ;
      new app.core.phornet(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_int7, GXv_int6, GXv_decimal10) ;
      tjornad_impl.this.A3711JorHHIni = GXv_int9[0] ;
      tjornad_impl.this.A3712JorMMIni = GXv_int8[0] ;
      tjornad_impl.this.A3713JorHHFin = GXv_int7[0] ;
      tjornad_impl.this.A3714JorMMFin = GXv_int6[0] ;
      tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3711JorHHIni), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3712JorMMIni), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3713JorHHFin), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3714JorMMFin), 2, 0));
      A3715JorHorNet = GXt_decimal5 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3715JorHorNet", GXutil.ltrimstr( A3715JorHorNet, 5, 2));
      if ( A3715JorHorNet.doubleValue() > 8 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atención: Jornada supera las 8 horas", ""), 0, "");
      }
      if ( ! ( ( ( A3712JorMMIni >= 0 ) && ( A3712JorMMIni <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Minutos Inicio de Jornada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "JORMMINI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJorMMIni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A3713JorHHFin >= 0 ) && ( A3713JorHHFin <= 23 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hora Fin de Jornada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "JORHHFIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJorHHFin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A3714JorMMFin >= 0 ) && ( A3714JorMMFin <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Minutos Fin de Jornada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "JORMMFIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJorMMFin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1GM1615( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_21( String A396EmprCod ,
                          int A652OpeCod )
   {
      /* Using cursor T01GM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01GM9_A653OpeNom[0] ;
      n653OpeNom = T01GM9_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1GM1615( )
   {
      /* Using cursor T01GM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1615 = (short)(1) ;
      }
      else
      {
         RcdFound1615 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01GM5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1GM1615( 19) ;
         RcdFound1615 = (short)(1) ;
         A3710JorFecha = T01GM5_A3710JorFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
         A3711JorHHIni = T01GM5_A3711JorHHIni[0] ;
         n3711JorHHIni = T01GM5_n3711JorHHIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3711JorHHIni), 2, 0));
         A3712JorMMIni = T01GM5_A3712JorMMIni[0] ;
         n3712JorMMIni = T01GM5_n3712JorMMIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3712JorMMIni), 2, 0));
         A3713JorHHFin = T01GM5_A3713JorHHFin[0] ;
         n3713JorHHFin = T01GM5_n3713JorHHFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3713JorHHFin), 2, 0));
         A3714JorMMFin = T01GM5_A3714JorMMFin[0] ;
         n3714JorMMFin = T01GM5_n3714JorMMFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3714JorMMFin), 2, 0));
         A3717JorUltLin = T01GM5_A3717JorUltLin[0] ;
         n3717JorUltLin = T01GM5_n3717JorUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         A652OpeCod = T01GM5_A652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         O3717JorUltLin = A3717JorUltLin ;
         n3717JorUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z3710JorFecha = A3710JorFecha ;
         Z652OpeCod = A652OpeCod ;
         sMode1615 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GM1615( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1615 = (short)(0) ;
            initializeNonKey1GM1615( ) ;
         }
         Gx_mode = sMode1615 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1615 = (short)(0) ;
         initializeNonKey1GM1615( ) ;
         sMode1615 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1615 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1GM1615( ) ;
      if ( RcdFound1615 == 0 )
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
      RcdFound1615 = (short)(0) ;
      /* Using cursor T01GM11 */
      pr_default.execute(9, new Object[] {A3710JorFecha, A3710JorFecha, Integer.valueOf(A652OpeCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T01GM11_A3710JorFecha[0]).before( GXutil.resetTime( A3710JorFecha )) || GXutil.dateCompare(GXutil.resetTime(T01GM11_A3710JorFecha[0]), GXutil.resetTime(A3710JorFecha)) && ( T01GM11_A652OpeCod[0] < A652OpeCod ) ) && ( GXutil.strcmp(T01GM11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T01GM11_A3710JorFecha[0]).after( GXutil.resetTime( A3710JorFecha )) || GXutil.dateCompare(GXutil.resetTime(T01GM11_A3710JorFecha[0]), GXutil.resetTime(A3710JorFecha)) && ( T01GM11_A652OpeCod[0] > A652OpeCod ) ) && ( GXutil.strcmp(T01GM11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3710JorFecha = T01GM11_A3710JorFecha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
            A652OpeCod = T01GM11_A652OpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            RcdFound1615 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1615 = (short)(0) ;
      /* Using cursor T01GM12 */
      pr_default.execute(10, new Object[] {A3710JorFecha, A3710JorFecha, Integer.valueOf(A652OpeCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.resetTime(T01GM12_A3710JorFecha[0]).after( GXutil.resetTime( A3710JorFecha )) || GXutil.dateCompare(GXutil.resetTime(T01GM12_A3710JorFecha[0]), GXutil.resetTime(A3710JorFecha)) && ( T01GM12_A652OpeCod[0] > A652OpeCod ) ) && ( GXutil.strcmp(T01GM12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.resetTime(T01GM12_A3710JorFecha[0]).before( GXutil.resetTime( A3710JorFecha )) || GXutil.dateCompare(GXutil.resetTime(T01GM12_A3710JorFecha[0]), GXutil.resetTime(A3710JorFecha)) && ( T01GM12_A652OpeCod[0] < A652OpeCod ) ) && ( GXutil.strcmp(T01GM12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3710JorFecha = T01GM12_A3710JorFecha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
            A652OpeCod = T01GM12_A652OpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            RcdFound1615 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GM1615( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3717JorUltLin = O3717JorUltLin ;
         n3717JorUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         A3716JorParTot = O3716JorParTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
         GX_FocusControl = edtJorFecha_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GM1615( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1615 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A3710JorFecha), GXutil.resetTime(Z3710JorFecha)) ) || ( A652OpeCod != Z652OpeCod ) )
            {
               A3710JorFecha = Z3710JorFecha ;
               httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
               A652OpeCod = Z652OpeCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3717JorUltLin = O3717JorUltLin ;
               n3717JorUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
               A3716JorParTot = O3716JorParTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtJorFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3717JorUltLin = O3717JorUltLin ;
               n3717JorUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
               A3716JorParTot = O3716JorParTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
               update1GM1615( ) ;
               GX_FocusControl = edtJorFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A3710JorFecha), GXutil.resetTime(Z3710JorFecha)) ) || ( A652OpeCod != Z652OpeCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3717JorUltLin = O3717JorUltLin ;
               n3717JorUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
               A3716JorParTot = O3716JorParTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
               GX_FocusControl = edtJorFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GM1615( ) ;
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
                  A3717JorUltLin = O3717JorUltLin ;
                  n3717JorUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
                  A3716JorParTot = O3716JorParTot ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
                  GX_FocusControl = edtJorFecha_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1GM1615( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A3710JorFecha), GXutil.resetTime(Z3710JorFecha)) ) || ( A652OpeCod != Z652OpeCod ) )
      {
         A3710JorFecha = Z3710JorFecha ;
         httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
         A652OpeCod = Z652OpeCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3717JorUltLin = O3717JorUltLin ;
         n3717JorUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         A3716JorParTot = O3716JorParTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtJorFecha_Internalname ;
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
      getKey1GM1615( ) ;
      if ( RcdFound1615 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A3710JorFecha), GXutil.resetTime(Z3710JorFecha)) ) || ( A652OpeCod != Z652OpeCod ) )
         {
            A3710JorFecha = Z3710JorFecha ;
            httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
            A652OpeCod = Z652OpeCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A3710JorFecha), GXutil.resetTime(Z3710JorFecha)) ) || ( A652OpeCod != Z652OpeCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tjornad");
      GX_FocusControl = edtJorHHIni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GM0( ) ;
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
      if ( RcdFound1615 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtJorHHIni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GM1615( ) ;
      if ( RcdFound1615 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJorHHIni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GM1615( ) ;
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
      if ( RcdFound1615 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJorHHIni_Internalname ;
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
      if ( RcdFound1615 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJorHHIni_Internalname ;
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
      scanStart1GM1615( ) ;
      if ( RcdFound1615 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1615 != 0 )
         {
            scanNext1GM1615( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJorHHIni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GM1615( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GM1615( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJornad"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z3711JorHHIni != T01GM4_A3711JorHHIni[0] ) || ( Z3712JorMMIni != T01GM4_A3712JorMMIni[0] ) || ( Z3713JorHHFin != T01GM4_A3713JorHHFin[0] ) || ( Z3714JorMMFin != T01GM4_A3714JorMMFin[0] ) || ( Z3717JorUltLin != T01GM4_A3717JorUltLin[0] ) )
         {
            if ( Z3711JorHHIni != T01GM4_A3711JorHHIni[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"JorHHIni");
               GXutil.writeLogRaw("Old: ",Z3711JorHHIni);
               GXutil.writeLogRaw("Current: ",T01GM4_A3711JorHHIni[0]);
            }
            if ( Z3712JorMMIni != T01GM4_A3712JorMMIni[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"JorMMIni");
               GXutil.writeLogRaw("Old: ",Z3712JorMMIni);
               GXutil.writeLogRaw("Current: ",T01GM4_A3712JorMMIni[0]);
            }
            if ( Z3713JorHHFin != T01GM4_A3713JorHHFin[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"JorHHFin");
               GXutil.writeLogRaw("Old: ",Z3713JorHHFin);
               GXutil.writeLogRaw("Current: ",T01GM4_A3713JorHHFin[0]);
            }
            if ( Z3714JorMMFin != T01GM4_A3714JorMMFin[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"JorMMFin");
               GXutil.writeLogRaw("Old: ",Z3714JorMMFin);
               GXutil.writeLogRaw("Current: ",T01GM4_A3714JorMMFin[0]);
            }
            if ( Z3717JorUltLin != T01GM4_A3717JorUltLin[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"JorUltLin");
               GXutil.writeLogRaw("Old: ",Z3717JorUltLin);
               GXutil.writeLogRaw("Current: ",T01GM4_A3717JorUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJornad"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GM1615( )
   {
      beforeValidate1GM1615( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GM1615( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GM1615( 0) ;
         checkOptimisticConcurrency1GM1615( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GM1615( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GM1615( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GM13 */
                  pr_default.execute(11, new Object[] {A3710JorFecha, Boolean.valueOf(n3711JorHHIni), Byte.valueOf(A3711JorHHIni), Boolean.valueOf(n3712JorMMIni), Byte.valueOf(A3712JorMMIni), Boolean.valueOf(n3713JorHHFin), Byte.valueOf(A3713JorHHFin), Boolean.valueOf(n3714JorMMFin), Byte.valueOf(A3714JorMMFin), Boolean.valueOf(n3717JorUltLin), Short.valueOf(A3717JorUltLin), A396EmprCod, Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJornad");
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
                        processLevel1GM1615( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1GM0( ) ;
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
            load1GM1615( ) ;
         }
         endLevel1GM1615( ) ;
      }
      closeExtendedTableCursors1GM1615( ) ;
   }

   public void update1GM1615( )
   {
      beforeValidate1GM1615( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GM1615( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GM1615( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GM1615( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GM1615( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GM14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n3711JorHHIni), Byte.valueOf(A3711JorHHIni), Boolean.valueOf(n3712JorMMIni), Byte.valueOf(A3712JorMMIni), Boolean.valueOf(n3713JorHHFin), Byte.valueOf(A3713JorHHFin), Boolean.valueOf(n3714JorMMFin), Byte.valueOf(A3714JorMMFin), Boolean.valueOf(n3717JorUltLin), Short.valueOf(A3717JorUltLin), A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJornad");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJornad"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GM1615( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1GM1615( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1GM0( ) ;
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
         endLevel1GM1615( ) ;
      }
      closeExtendedTableCursors1GM1615( ) ;
   }

   public void deferredUpdate1GM1615( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GM1615( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GM1615( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GM1615( ) ;
         afterConfirm1GM1615( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GM1615( ) ;
            if ( AnyError == 0 )
            {
               A3717JorUltLin = O3717JorUltLin ;
               n3717JorUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
               A3716JorParTot = O3716JorParTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
               scanStart1GM1616( ) ;
               while ( RcdFound1616 != 0 )
               {
                  getByPrimaryKey1GM1616( ) ;
                  delete1GM1616( ) ;
                  scanNext1GM1616( ) ;
                  O3717JorUltLin = A3717JorUltLin ;
                  n3717JorUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
                  O3716JorParTot = A3716JorParTot ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
               }
               scanEnd1GM1616( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GM15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJornad");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1615 == 0 )
                        {
                           initAll1GM1615( ) ;
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
                        resetCaption1GM0( ) ;
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
      sMode1615 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GM1615( ) ;
      Gx_mode = sMode1615 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GM1615( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01GM16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
         A653OpeNom = T01GM16_A653OpeNom[0] ;
         n653OpeNom = T01GM16_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(14);
         getJorParTot( A396EmprCod, A3710JorFecha, A652OpeCod) ;
         A3716JorParTot = A3716JorParTot ;
         GXt_decimal5 = A3715JorHorNet ;
         GXv_int9[0] = A3711JorHHIni ;
         GXv_int8[0] = A3712JorMMIni ;
         GXv_int7[0] = A3713JorHHFin ;
         GXv_int6[0] = A3714JorMMFin ;
         GXv_decimal10[0] = GXt_decimal5 ;
         new app.core.phornet(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_int7, GXv_int6, GXv_decimal10) ;
         tjornad_impl.this.A3711JorHHIni = GXv_int9[0] ;
         tjornad_impl.this.A3712JorMMIni = GXv_int8[0] ;
         tjornad_impl.this.A3713JorHHFin = GXv_int7[0] ;
         tjornad_impl.this.A3714JorMMFin = GXv_int6[0] ;
         tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3711JorHHIni), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3712JorMMIni), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3713JorHHFin), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3714JorMMFin), 2, 0));
         A3715JorHorNet = GXt_decimal5 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3715JorHorNet", GXutil.ltrimstr( A3715JorHorNet, 5, 2));
      }
   }

   public void processNestedLevel1GM1616( )
   {
      s3717JorUltLin = O3717JorUltLin ;
      n3717JorUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
      s3716JorParTot = O3716JorParTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1GM1616( ) ;
         if ( ( nRcdExists_1616 != 0 ) || ( nIsMod_1616 != 0 ) )
         {
            standaloneNotModal1GM1616( ) ;
            getKey1GM1616( ) ;
            if ( ( nRcdExists_1616 == 0 ) && ( nRcdDeleted_1616 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1GM1616( ) ;
            }
            else
            {
               if ( RcdFound1616 != 0 )
               {
                  if ( ( nRcdDeleted_1616 != 0 ) && ( nRcdExists_1616 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1GM1616( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1616 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1GM1616( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1616 == 0 )
                  {
                     GXCCtl = "PARLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3717JorUltLin = A3717JorUltLin ;
            n3717JorUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
            O3716JorParTot = A3716JorParTot ;
            httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1616_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3718ParLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParHHIni_Internalname, GXutil.ltrim( localUtil.ntoc( A3719ParHHIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParMMIni_Internalname, GXutil.ltrim( localUtil.ntoc( A3720ParMMIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParHHFin_Internalname, GXutil.ltrim( localUtil.ntoc( A3721ParHHFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParMMFin_Internalname, GXutil.ltrim( localUtil.ntoc( A3722ParMMFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParHorNet_Internalname, GXutil.ltrim( localUtil.ntoc( A3723ParHorNet, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParObs_Internalname, GXutil.rtrim( A3724ParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3718ParLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3718ParLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3719ParHHIni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3719ParHHIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3720ParMMIni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3720ParMMIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3721ParHHFin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3721ParHHFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3722ParMMFin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z3722ParMMFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3724ParObs_"+sGXsfl_80_idx, GXutil.rtrim( Z3724ParObs)) ;
         httpContext.changePostValue( "T3723ParHorNet_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O3723ParHorNet, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1616_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1616_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1616_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1616 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1616_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1616_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARHHINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHHIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARMMINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMMIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARHHFIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHHFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARMMFIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMMFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARHORNET_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHorNet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PAROBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1GM1616( ) ;
      if ( AnyError != 0 )
      {
         O3717JorUltLin = s3717JorUltLin ;
         n3717JorUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         O3716JorParTot = s3716JorParTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      }
      nRcdExists_1616 = (short)(0) ;
      nIsMod_1616 = (short)(0) ;
      nRcdDeleted_1616 = (short)(0) ;
   }

   public void processLevel1GM1615( )
   {
      /* Save parent mode. */
      sMode1615 = Gx_mode ;
      processNestedLevel1GM1616( ) ;
      if ( AnyError != 0 )
      {
         O3717JorUltLin = s3717JorUltLin ;
         n3717JorUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
         O3716JorParTot = s3716JorParTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1615 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01GM17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n3717JorUltLin), Short.valueOf(A3717JorUltLin), A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJornad");
   }

   public void endLevel1GM1615( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1GM1615( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tjornad");
         if ( AnyError == 0 )
         {
            confirmValues1GM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tjornad");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GM1615( )
   {
      /* Scan By routine */
      /* Using cursor T01GM18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1615 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1615 = (short)(1) ;
         A3710JorFecha = T01GM18_A3710JorFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
         A652OpeCod = T01GM18_A652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GM1615( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1615 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1615 = (short)(1) ;
         A3710JorFecha = T01GM18_A3710JorFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
         A652OpeCod = T01GM18_A652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      }
   }

   public void scanEnd1GM1615( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1GM1615( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GM1615( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GM1615( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GM1615( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GM1615( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GM1615( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GM1615( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtJorFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorFecha_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtJorHHIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorHHIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorHHIni_Enabled), 5, 0), true);
      edtJorMMIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorMMIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorMMIni_Enabled), 5, 0), true);
      edtJorHHFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorHHFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorHHFin_Enabled), 5, 0), true);
      edtJorMMFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorMMFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorMMFin_Enabled), 5, 0), true);
      edtJorHorNet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorHorNet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorHorNet_Enabled), 5, 0), true);
      edtJorParTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorParTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorParTot_Enabled), 5, 0), true);
      edtJorUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorUltLin_Enabled), 5, 0), true);
   }

   public void zm1GM1616( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3719ParHHIni = T01GM3_A3719ParHHIni[0] ;
            Z3720ParMMIni = T01GM3_A3720ParMMIni[0] ;
            Z3721ParHHFin = T01GM3_A3721ParHHFin[0] ;
            Z3722ParMMFin = T01GM3_A3722ParMMFin[0] ;
            Z3724ParObs = T01GM3_A3724ParObs[0] ;
         }
         else
         {
            Z3719ParHHIni = A3719ParHHIni ;
            Z3720ParMMIni = A3720ParMMIni ;
            Z3721ParHHFin = A3721ParHHFin ;
            Z3722ParMMFin = A3722ParMMFin ;
            Z3724ParObs = A3724ParObs ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z396EmprCod = A396EmprCod ;
         Z3710JorFecha = A3710JorFecha ;
         Z652OpeCod = A652OpeCod ;
         Z3718ParLin = A3718ParLin ;
         Z3719ParHHIni = A3719ParHHIni ;
         Z3720ParMMIni = A3720ParMMIni ;
         Z3721ParHHFin = A3721ParHHFin ;
         Z3722ParMMFin = A3722ParMMFin ;
         Z3724ParObs = A3724ParObs ;
      }
   }

   public void standaloneNotModal1GM1616( )
   {
      edtJorUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorUltLin_Enabled), 5, 0), true);
      edtJorUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJorUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJorUltLin_Enabled), 5, 0), true);
   }

   public void standaloneModal1GM1616( )
   {
      if ( isIns( )  )
      {
         A3717JorUltLin = (short)(O3717JorUltLin+1) ;
         n3717JorUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3718ParLin = A3717JorUltLin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtParLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtParLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load1GM1616( )
   {
      /* Using cursor T01GM19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod), Short.valueOf(A3718ParLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1616 = (short)(1) ;
         A3719ParHHIni = T01GM19_A3719ParHHIni[0] ;
         n3719ParHHIni = T01GM19_n3719ParHHIni[0] ;
         A3720ParMMIni = T01GM19_A3720ParMMIni[0] ;
         n3720ParMMIni = T01GM19_n3720ParMMIni[0] ;
         A3721ParHHFin = T01GM19_A3721ParHHFin[0] ;
         n3721ParHHFin = T01GM19_n3721ParHHFin[0] ;
         A3722ParMMFin = T01GM19_A3722ParMMFin[0] ;
         n3722ParMMFin = T01GM19_n3722ParMMFin[0] ;
         A3724ParObs = T01GM19_A3724ParObs[0] ;
         n3724ParObs = T01GM19_n3724ParObs[0] ;
         zm1GM1616( -22) ;
      }
      pr_default.close(17);
      onLoadActions1GM1616( ) ;
   }

   public void onLoadActions1GM1616( )
   {
      GXt_decimal5 = A3723ParHorNet ;
      GXv_int9[0] = A3719ParHHIni ;
      GXv_int8[0] = A3720ParMMIni ;
      GXv_int7[0] = A3721ParHHFin ;
      GXv_int6[0] = A3722ParMMFin ;
      GXv_decimal10[0] = GXt_decimal5 ;
      new app.core.phornet(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_int7, GXv_int6, GXv_decimal10) ;
      tjornad_impl.this.A3719ParHHIni = GXv_int9[0] ;
      tjornad_impl.this.A3720ParMMIni = GXv_int8[0] ;
      tjornad_impl.this.A3721ParHHFin = GXv_int7[0] ;
      tjornad_impl.this.A3722ParMMFin = GXv_int6[0] ;
      tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
      A3723ParHorNet = GXt_decimal5 ;
      O3723ParHorNet = A3723ParHorNet ;
   }

   public void checkExtendedTable1GM1616( )
   {
      nIsDirty_1616 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1GM1616( ) ;
      if ( ! ( ( ( A3719ParHHIni >= 0 ) && ( A3719ParHHIni <= 23 ) ) ) )
      {
         GXCCtl = "PARHHINI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hora Inicio Paro", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParHHIni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1616 = (short)(1) ;
      GXt_decimal5 = A3723ParHorNet ;
      GXv_int9[0] = A3719ParHHIni ;
      GXv_int8[0] = A3720ParMMIni ;
      GXv_int7[0] = A3721ParHHFin ;
      GXv_int6[0] = A3722ParMMFin ;
      GXv_decimal10[0] = GXt_decimal5 ;
      new app.core.phornet(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_int7, GXv_int6, GXv_decimal10) ;
      tjornad_impl.this.A3719ParHHIni = GXv_int9[0] ;
      tjornad_impl.this.A3720ParMMIni = GXv_int8[0] ;
      tjornad_impl.this.A3721ParHHFin = GXv_int7[0] ;
      tjornad_impl.this.A3722ParMMFin = GXv_int6[0] ;
      tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
      A3723ParHorNet = GXt_decimal5 ;
      if ( isIns( )  )
      {
         nIsDirty_1616 = (short)(1) ;
         A3716JorParTot = O3716JorParTot.add(A3723ParHorNet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1616 = (short)(1) ;
            A3716JorParTot = O3716JorParTot.add(A3723ParHorNet).subtract(O3723ParHorNet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1616 = (short)(1) ;
               A3716JorParTot = O3716JorParTot.subtract(O3723ParHorNet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
            }
         }
      }
      if ( ! ( ( ( A3720ParMMIni >= 0 ) && ( A3720ParMMIni <= 59 ) ) ) )
      {
         GXCCtl = "PARMMINI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Minutos Inicio Paro", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMMIni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A3721ParHHFin >= 0 ) && ( A3721ParHHFin <= 23 ) ) ) )
      {
         GXCCtl = "PARHHFIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hora Fin Paro", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParHHFin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A3722ParMMFin >= 0 ) && ( A3722ParMMFin <= 59 ) ) ) )
      {
         GXCCtl = "PARMMFIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Minutos Fin Paro", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMMFin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1GM1616( )
   {
   }

   public void enableDisable1GM1616( )
   {
   }

   public void getKey1GM1616( )
   {
      /* Using cursor T01GM20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod), Short.valueOf(A3718ParLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1616 = (short)(1) ;
      }
      else
      {
         RcdFound1616 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1GM1616( )
   {
      /* Using cursor T01GM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod), Short.valueOf(A3718ParLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01GM3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1GM1616( 22) ;
         RcdFound1616 = (short)(1) ;
         initializeNonKey1GM1616( ) ;
         A3718ParLin = T01GM3_A3718ParLin[0] ;
         A3719ParHHIni = T01GM3_A3719ParHHIni[0] ;
         n3719ParHHIni = T01GM3_n3719ParHHIni[0] ;
         A3720ParMMIni = T01GM3_A3720ParMMIni[0] ;
         n3720ParMMIni = T01GM3_n3720ParMMIni[0] ;
         A3721ParHHFin = T01GM3_A3721ParHHFin[0] ;
         n3721ParHHFin = T01GM3_n3721ParHHFin[0] ;
         A3722ParMMFin = T01GM3_A3722ParMMFin[0] ;
         n3722ParMMFin = T01GM3_n3722ParMMFin[0] ;
         A3724ParObs = T01GM3_A3724ParObs[0] ;
         n3724ParObs = T01GM3_n3724ParObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3710JorFecha = A3710JorFecha ;
         Z652OpeCod = A652OpeCod ;
         Z3718ParLin = A3718ParLin ;
         sMode1616 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GM1616( ) ;
         load1GM1616( ) ;
         Gx_mode = sMode1616 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1616 = (short)(0) ;
         initializeNonKey1GM1616( ) ;
         sMode1616 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GM1616( ) ;
         Gx_mode = sMode1616 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1GM1616( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1GM1616( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod), Short.valueOf(A3718ParLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPParope"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z3719ParHHIni != T01GM2_A3719ParHHIni[0] ) || ( Z3720ParMMIni != T01GM2_A3720ParMMIni[0] ) || ( Z3721ParHHFin != T01GM2_A3721ParHHFin[0] ) || ( Z3722ParMMFin != T01GM2_A3722ParMMFin[0] ) || ( GXutil.strcmp(Z3724ParObs, T01GM2_A3724ParObs[0]) != 0 ) )
         {
            if ( Z3719ParHHIni != T01GM2_A3719ParHHIni[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"ParHHIni");
               GXutil.writeLogRaw("Old: ",Z3719ParHHIni);
               GXutil.writeLogRaw("Current: ",T01GM2_A3719ParHHIni[0]);
            }
            if ( Z3720ParMMIni != T01GM2_A3720ParMMIni[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"ParMMIni");
               GXutil.writeLogRaw("Old: ",Z3720ParMMIni);
               GXutil.writeLogRaw("Current: ",T01GM2_A3720ParMMIni[0]);
            }
            if ( Z3721ParHHFin != T01GM2_A3721ParHHFin[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"ParHHFin");
               GXutil.writeLogRaw("Old: ",Z3721ParHHFin);
               GXutil.writeLogRaw("Current: ",T01GM2_A3721ParHHFin[0]);
            }
            if ( Z3722ParMMFin != T01GM2_A3722ParMMFin[0] )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"ParMMFin");
               GXutil.writeLogRaw("Old: ",Z3722ParMMFin);
               GXutil.writeLogRaw("Current: ",T01GM2_A3722ParMMFin[0]);
            }
            if ( GXutil.strcmp(Z3724ParObs, T01GM2_A3724ParObs[0]) != 0 )
            {
               GXutil.writeLogln("tjornad:[seudo value changed for attri]"+"ParObs");
               GXutil.writeLogRaw("Old: ",Z3724ParObs);
               GXutil.writeLogRaw("Current: ",T01GM2_A3724ParObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPParope"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GM1616( )
   {
      beforeValidate1GM1616( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GM1616( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GM1616( 0) ;
         checkOptimisticConcurrency1GM1616( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GM1616( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GM1616( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GM21 */
                  pr_default.execute(19, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod), Short.valueOf(A3718ParLin), Boolean.valueOf(n3719ParHHIni), Byte.valueOf(A3719ParHHIni), Boolean.valueOf(n3720ParMMIni), Byte.valueOf(A3720ParMMIni), Boolean.valueOf(n3721ParHHFin), Byte.valueOf(A3721ParHHFin), Boolean.valueOf(n3722ParMMFin), Byte.valueOf(A3722ParMMFin), Boolean.valueOf(n3724ParObs), A3724ParObs});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPParope");
                  if ( (pr_default.getStatus(19) == 1) )
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
            load1GM1616( ) ;
         }
         endLevel1GM1616( ) ;
      }
      closeExtendedTableCursors1GM1616( ) ;
   }

   public void update1GM1616( )
   {
      beforeValidate1GM1616( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GM1616( ) ;
      }
      if ( ( nIsMod_1616 != 0 ) || ( nIsDirty_1616 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1GM1616( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1GM1616( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1GM1616( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01GM22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n3719ParHHIni), Byte.valueOf(A3719ParHHIni), Boolean.valueOf(n3720ParMMIni), Byte.valueOf(A3720ParMMIni), Boolean.valueOf(n3721ParHHFin), Byte.valueOf(A3721ParHHFin), Boolean.valueOf(n3722ParMMFin), Byte.valueOf(A3722ParMMFin), Boolean.valueOf(n3724ParObs), A3724ParObs, A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod), Short.valueOf(A3718ParLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPParope");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPParope"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1GM1616( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1GM1616( ) ;
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
            endLevel1GM1616( ) ;
         }
      }
      closeExtendedTableCursors1GM1616( ) ;
   }

   public void deferredUpdate1GM1616( )
   {
   }

   public void delete1GM1616( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GM1616( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GM1616( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GM1616( ) ;
         afterConfirm1GM1616( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GM1616( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GM23 */
               pr_default.execute(21, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod), Short.valueOf(A3718ParLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPParope");
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
      sMode1616 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GM1616( ) ;
      Gx_mode = sMode1616 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GM1616( )
   {
      standaloneModal1GM1616( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_decimal5 = A3723ParHorNet ;
         GXv_int9[0] = A3719ParHHIni ;
         GXv_int8[0] = A3720ParMMIni ;
         GXv_int7[0] = A3721ParHHFin ;
         GXv_int6[0] = A3722ParMMFin ;
         GXv_decimal10[0] = GXt_decimal5 ;
         new app.core.phornet(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_int7, GXv_int6, GXv_decimal10) ;
         tjornad_impl.this.A3719ParHHIni = GXv_int9[0] ;
         tjornad_impl.this.A3720ParMMIni = GXv_int8[0] ;
         tjornad_impl.this.A3721ParHHFin = GXv_int7[0] ;
         tjornad_impl.this.A3722ParMMFin = GXv_int6[0] ;
         tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
         A3723ParHorNet = GXt_decimal5 ;
         if ( isIns( )  )
         {
            A3716JorParTot = O3716JorParTot.add(A3723ParHorNet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A3716JorParTot = O3716JorParTot.add(A3723ParHorNet).subtract(O3723ParHorNet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3716JorParTot = O3716JorParTot.subtract(O3723ParHorNet) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
               }
            }
         }
      }
   }

   public void endLevel1GM1616( )
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

   public void scanStart1GM1616( )
   {
      /* Scan By routine */
      /* Using cursor T01GM24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
      RcdFound1616 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1616 = (short)(1) ;
         A3718ParLin = T01GM24_A3718ParLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GM1616( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1616 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1616 = (short)(1) ;
         A3718ParLin = T01GM24_A3718ParLin[0] ;
      }
   }

   public void scanEnd1GM1616( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1GM1616( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GM1616( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GM1616( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GM1616( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GM1616( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GM1616( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GM1616( )
   {
      edtParLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParHHIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParHHIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParHHIni_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParMMIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParMMIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMMIni_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParHHFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParHHFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParHHFin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParMMFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParMMFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMMFin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParHorNet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParHorNet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParHorNet_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParObs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes1GM1616( )
   {
   }

   public void send_integrity_lvl_hashes1GM1615( )
   {
   }

   public void subsflControlProps_801616( )
   {
      edtavnRcdDeleted_1616_Internalname = "vNRCDDELETED_1616_"+sGXsfl_80_idx ;
      edtParLin_Internalname = "PARLIN_"+sGXsfl_80_idx ;
      edtParHHIni_Internalname = "PARHHINI_"+sGXsfl_80_idx ;
      edtParMMIni_Internalname = "PARMMINI_"+sGXsfl_80_idx ;
      edtParHHFin_Internalname = "PARHHFIN_"+sGXsfl_80_idx ;
      edtParMMFin_Internalname = "PARMMFIN_"+sGXsfl_80_idx ;
      edtParHorNet_Internalname = "PARHORNET_"+sGXsfl_80_idx ;
      edtParObs_Internalname = "PAROBS_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801616( )
   {
      edtavnRcdDeleted_1616_Internalname = "vNRCDDELETED_1616_"+sGXsfl_80_fel_idx ;
      edtParLin_Internalname = "PARLIN_"+sGXsfl_80_fel_idx ;
      edtParHHIni_Internalname = "PARHHINI_"+sGXsfl_80_fel_idx ;
      edtParMMIni_Internalname = "PARMMINI_"+sGXsfl_80_fel_idx ;
      edtParHHFin_Internalname = "PARHHFIN_"+sGXsfl_80_fel_idx ;
      edtParMMFin_Internalname = "PARMMFIN_"+sGXsfl_80_fel_idx ;
      edtParHorNet_Internalname = "PARHORNET_"+sGXsfl_80_fel_idx ;
      edtParObs_Internalname = "PAROBS_"+sGXsfl_80_fel_idx ;
   }

   public void addRow1GM1616( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801616( ) ;
      sendRow1GM1616( ) ;
   }

   public void sendRow1GM1616( )
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
         if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1616_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1616_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1616_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1616), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1616), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1616_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1616_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1616_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3718ParLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3718ParLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1616_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParHHIni_Internalname,GXutil.ltrim( localUtil.ntoc( A3719ParHHIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParHHIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3719ParHHIni), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3719ParHHIni), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParHHIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParHHIni_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1616_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParMMIni_Internalname,GXutil.ltrim( localUtil.ntoc( A3720ParMMIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParMMIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3720ParMMIni), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3720ParMMIni), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParMMIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParMMIni_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1616_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParHHFin_Internalname,GXutil.ltrim( localUtil.ntoc( A3721ParHHFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParHHFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3721ParHHFin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3721ParHHFin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParHHFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParHHFin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1616_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParMMFin_Internalname,GXutil.ltrim( localUtil.ntoc( A3722ParMMFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParMMFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3722ParMMFin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3722ParMMFin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParMMFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParMMFin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParHorNet_Internalname,GXutil.ltrim( localUtil.ntoc( A3723ParHorNet, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParHorNet_Enabled!=0) ? localUtil.format( A3723ParHorNet, "Z9.99") : localUtil.format( A3723ParHorNet, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParHorNet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParHorNet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1616_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParObs_Internalname,GXutil.rtrim( A3724ParObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1GM1616( ) ;
      GXCCtl = "Z3718ParLin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3718ParLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3719ParHHIni_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3719ParHHIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3720ParMMIni_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3720ParMMIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3721ParHHFin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3721ParHHFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3722ParMMFin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3722ParMMFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3724ParObs_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3724ParObs));
      GXCCtl = "O3723ParHorNet_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3723ParHorNet, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1616_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1616_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1616_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1616, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1616_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1616_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARHHINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHHIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARMMINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMMIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARHHFIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHHFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARMMFIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMMFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARHORNET_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParHorNet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAROBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1GM1616( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801616( ) ;
      edtavnRcdDeleted_1616_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1616_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParHHIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARHHINI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParMMIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARMMINI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParHHFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARHHFIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParMMFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARMMFIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParHorNet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARHORNET_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PAROBS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1616_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1616_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1616");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1616_Internalname ;
         wbErr = true ;
         nRcdDeleted_1616 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1616 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1616_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PARLIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParLin_Internalname ;
         wbErr = true ;
         A3718ParLin = (short)(0) ;
      }
      else
      {
         A3718ParLin = (short)(localUtil.ctol( httpContext.cgiGet( edtParLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParHHIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParHHIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PARHHINI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParHHIni_Internalname ;
         wbErr = true ;
         A3719ParHHIni = (byte)(0) ;
         n3719ParHHIni = false ;
      }
      else
      {
         A3719ParHHIni = (byte)(localUtil.ctol( httpContext.cgiGet( edtParHHIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3719ParHHIni = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParMMIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParMMIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PARMMINI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMMIni_Internalname ;
         wbErr = true ;
         A3720ParMMIni = (byte)(0) ;
         n3720ParMMIni = false ;
      }
      else
      {
         A3720ParMMIni = (byte)(localUtil.ctol( httpContext.cgiGet( edtParMMIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3720ParMMIni = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParHHFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParHHFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PARHHFIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParHHFin_Internalname ;
         wbErr = true ;
         A3721ParHHFin = (byte)(0) ;
         n3721ParHHFin = false ;
      }
      else
      {
         A3721ParHHFin = (byte)(localUtil.ctol( httpContext.cgiGet( edtParHHFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3721ParHHFin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParMMFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParMMFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PARMMFIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMMFin_Internalname ;
         wbErr = true ;
         A3722ParMMFin = (byte)(0) ;
         n3722ParMMFin = false ;
      }
      else
      {
         A3722ParMMFin = (byte)(localUtil.ctol( httpContext.cgiGet( edtParMMFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3722ParMMFin = false ;
      }
      A3723ParHorNet = localUtil.ctond( httpContext.cgiGet( edtParHorNet_Internalname)) ;
      A3724ParObs = httpContext.cgiGet( edtParObs_Internalname) ;
      n3724ParObs = false ;
      GXCCtl = "Z3718ParLin_" + sGXsfl_80_idx ;
      Z3718ParLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3719ParHHIni_" + sGXsfl_80_idx ;
      Z3719ParHHIni = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3720ParMMIni_" + sGXsfl_80_idx ;
      Z3720ParMMIni = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3721ParHHFin_" + sGXsfl_80_idx ;
      Z3721ParHHFin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3722ParMMFin_" + sGXsfl_80_idx ;
      Z3722ParMMFin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3724ParObs_" + sGXsfl_80_idx ;
      Z3724ParObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O3723ParHorNet_" + sGXsfl_80_idx ;
      O3723ParHorNet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1616_" + sGXsfl_80_idx ;
      nRcdDeleted_1616 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1616_" + sGXsfl_80_idx ;
      nRcdExists_1616 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1616_" + sGXsfl_80_idx ;
      nIsMod_1616 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtParLin_Enabled = edtParLin_Enabled ;
   }

   public void confirmValues1GM0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801616( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801616( ) ;
         httpContext.changePostValue( "Z3718ParLin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3718ParLin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3718ParLin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3719ParHHIni_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3719ParHHIni_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3719ParHHIni_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3720ParMMIni_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3720ParMMIni_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3720ParMMIni_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3721ParHHFin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3721ParHHFin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3721ParHHFin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3722ParMMFin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3722ParMMFin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3722ParMMFin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3724ParObs_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3724ParObs_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3724ParObs_"+sGXsfl_80_idx) ;
      }
      httpContext.changePostValue( "O3723ParHorNet", httpContext.cgiGet( "T3723ParHorNet")) ;
      httpContext.deletePostValue( "T3723ParHorNet") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tjornad", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3710JorFecha", localUtil.dtoc( Z3710JorFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3711JorHHIni", GXutil.ltrim( localUtil.ntoc( Z3711JorHHIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3712JorMMIni", GXutil.ltrim( localUtil.ntoc( Z3712JorMMIni, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3713JorHHFin", GXutil.ltrim( localUtil.ntoc( Z3713JorHHFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3714JorMMFin", GXutil.ltrim( localUtil.ntoc( Z3714JorMMFin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3717JorUltLin", GXutil.ltrim( localUtil.ntoc( Z3717JorUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3717JorUltLin", GXutil.ltrim( localUtil.ntoc( O3717JorUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3716JorParTot", GXutil.ltrim( localUtil.ntoc( O3716JorParTot, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tjornad", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TJornad" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Histórico de Jornadas /Operari", "") ;
   }

   public void initializeNonKey1GM1615( )
   {
      A3715JorHorNet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3715JorHorNet", GXutil.ltrimstr( A3715JorHorNet, 5, 2));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A3711JorHHIni = (byte)(0) ;
      n3711JorHHIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3711JorHHIni), 2, 0));
      A3712JorMMIni = (byte)(0) ;
      n3712JorMMIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3712JorMMIni), 2, 0));
      A3713JorHHFin = (byte)(0) ;
      n3713JorHHFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3713JorHHFin), 2, 0));
      A3714JorMMFin = (byte)(0) ;
      n3714JorMMFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3714JorMMFin), 2, 0));
      A3716JorParTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      A3717JorUltLin = (short)(0) ;
      n3717JorUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
      O3717JorUltLin = A3717JorUltLin ;
      n3717JorUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
      O3716JorParTot = A3716JorParTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
      Z3711JorHHIni = (byte)(0) ;
      Z3712JorMMIni = (byte)(0) ;
      Z3713JorHHFin = (byte)(0) ;
      Z3714JorMMFin = (byte)(0) ;
      Z3717JorUltLin = (short)(0) ;
   }

   public void initAll1GM1615( )
   {
      A3710JorFecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3710JorFecha", localUtil.format(A3710JorFecha, "99/99/99"));
      A652OpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      initializeNonKey1GM1615( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1GM1616( )
   {
      A3723ParHorNet = DecimalUtil.ZERO ;
      A3719ParHHIni = (byte)(0) ;
      n3719ParHHIni = false ;
      A3720ParMMIni = (byte)(0) ;
      n3720ParMMIni = false ;
      A3721ParHHFin = (byte)(0) ;
      n3721ParHHFin = false ;
      A3722ParMMFin = (byte)(0) ;
      n3722ParMMFin = false ;
      A3724ParObs = "" ;
      n3724ParObs = false ;
      O3723ParHorNet = A3723ParHorNet ;
      Z3719ParHHIni = (byte)(0) ;
      Z3720ParMMIni = (byte)(0) ;
      Z3721ParHHFin = (byte)(0) ;
      Z3722ParMMFin = (byte)(0) ;
      Z3724ParObs = "" ;
   }

   public void initAll1GM1616( )
   {
      A3718ParLin = (short)(0) ;
      initializeNonKey1GM1616( ) ;
   }

   public void standaloneModalInsert1GM1616( )
   {
      A3717JorUltLin = i3717JorUltLin ;
      n3717JorUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3717JorUltLin), 3, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241575712", true, true);
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
      httpContext.AddJavascriptSource("tjornad.js", "?20268241575712", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1616( )
   {
      edtParLin_Enabled = defedtParLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void startgridcontrol80( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1616, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1616_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3718ParLin, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3719ParHHIni, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParHHIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3720ParMMIni, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParMMIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3721ParHHFin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParHHFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3722ParMMFin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParMMFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3723ParHorNet, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParHorNet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3724ParObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtJorFecha_Internalname = "JORFECHA" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtOpeCod_Internalname = "OPECOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtJorHHIni_Internalname = "JORHHINI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtJorMMIni_Internalname = "JORMMINI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtJorHHFin_Internalname = "JORHHFIN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtJorMMFin_Internalname = "JORMMFIN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtJorHorNet_Internalname = "JORHORNET" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtJorParTot_Internalname = "JORPARTOT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtJorUltLin_Internalname = "JORULTLIN" ;
      edtavnRcdDeleted_1616_Internalname = "vNRCDDELETED_1616" ;
      edtParLin_Internalname = "PARLIN" ;
      edtParHHIni_Internalname = "PARHHINI" ;
      edtParMMIni_Internalname = "PARMMINI" ;
      edtParHHFin_Internalname = "PARHHFIN" ;
      edtParMMFin_Internalname = "PARMMFIN" ;
      edtParHorNet_Internalname = "PARHORNET" ;
      edtParObs_Internalname = "PAROBS" ;
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
      Form.setCaption( httpContext.getMessage( "Histórico de Jornadas /Operari", "") );
      edtParObs_Jsonclick = "" ;
      edtParHorNet_Jsonclick = "" ;
      edtParMMFin_Jsonclick = "" ;
      edtParHHFin_Jsonclick = "" ;
      edtParMMIni_Jsonclick = "" ;
      edtParHHIni_Jsonclick = "" ;
      edtParLin_Jsonclick = "" ;
      edtavnRcdDeleted_1616_Jsonclick = "" ;
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
      edtParObs_Enabled = 1 ;
      edtParHorNet_Enabled = 0 ;
      edtParMMFin_Enabled = 1 ;
      edtParHHFin_Enabled = 1 ;
      edtParMMIni_Enabled = 1 ;
      edtParHHIni_Enabled = 1 ;
      edtParLin_Enabled = 1 ;
      edtavnRcdDeleted_1616_Enabled = 1 ;
      edtJorUltLin_Jsonclick = "" ;
      edtJorUltLin_Backcolor = (int)(0xFFFFFF) ;
      edtJorUltLin_Enabled = 0 ;
      edtJorParTot_Jsonclick = "" ;
      edtJorParTot_Backcolor = (int)(0xFFFFFF) ;
      edtJorParTot_Enabled = 0 ;
      edtJorHorNet_Jsonclick = "" ;
      edtJorHorNet_Backcolor = (int)(0xFFFFFF) ;
      edtJorHorNet_Enabled = 0 ;
      edtJorMMFin_Jsonclick = "" ;
      edtJorMMFin_Backcolor = (int)(0xFFFFFF) ;
      edtJorMMFin_Enabled = 1 ;
      edtJorHHFin_Jsonclick = "" ;
      edtJorHHFin_Backcolor = (int)(0xFFFFFF) ;
      edtJorHHFin_Enabled = 1 ;
      edtJorMMIni_Jsonclick = "" ;
      edtJorMMIni_Backcolor = (int)(0xFFFFFF) ;
      edtJorMMIni_Enabled = 1 ;
      edtJorHHIni_Jsonclick = "" ;
      edtJorHHIni_Backcolor = (int)(0xFFFFFF) ;
      edtJorHHIni_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtJorFecha_Jsonclick = "" ;
      edtJorFecha_Backcolor = (int)(0xFFFFFF) ;
      edtJorFecha_Enabled = 1 ;
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
      subsflControlProps_801616( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1GM1616( ) ;
         standaloneModal1GM1616( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1GM1616( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801616( ) ;
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
      /* Using cursor T01GM25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01GM25_A407EmprNom[0] ;
      n407EmprNom = T01GM25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T01GM16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01GM16_A653OpeNom[0] ;
      n653OpeNom = T01GM16_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(14);
      GX_FocusControl = edtJorHHIni_Internalname ;
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

   public void getJorParTot( String A396EmprCod ,
                             java.util.Date A3710JorFecha ,
                             int A652OpeCod )
   {
      /* Navigation */
      A3716JorParTot = DecimalUtil.ZERO ;
      /* Using cursor T01GM26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A3710JorFecha, Integer.valueOf(A652OpeCod)});
      while ( (pr_default.getStatus(24) != 101) && ( GXutil.strcmp(T01GM26_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T01GM26_A3710JorFecha[0]), GXutil.resetTime(A3710JorFecha)) && ( T01GM26_A652OpeCod[0] == A652OpeCod ) )
      {
         GXt_decimal5 = A3723ParHorNet ;
         GXv_int9[0] = T01GM26_A3719ParHHIni[0] ;
         GXv_int8[0] = T01GM26_A3720ParMMIni[0] ;
         GXv_int7[0] = T01GM26_A3721ParHHFin[0] ;
         GXv_int6[0] = T01GM26_A3722ParMMFin[0] ;
         GXv_decimal10[0] = GXt_decimal5 ;
         new app.core.phornet(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_int7, GXv_int6, GXv_decimal10) ;
         tjornad_impl.this.A3719ParHHIni = GXv_int9[0] ;
         tjornad_impl.this.A3720ParMMIni = GXv_int8[0] ;
         tjornad_impl.this.A3721ParHHFin = GXv_int7[0] ;
         tjornad_impl.this.A3722ParMMFin = GXv_int6[0] ;
         tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
         A3723ParHorNet = GXt_decimal5 ;
         A3716JorParTot = A3716JorParTot.add(A3723ParHorNet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrimstr( A3716JorParTot, 5, 2));
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   public void valid_Opecod( )
   {
      n3717JorUltLin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01GM16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T01GM16_A653OpeNom[0] ;
      n653OpeNom = T01GM16_n653OpeNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3711JorHHIni", GXutil.ltrim( localUtil.ntoc( A3711JorHHIni, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3712JorMMIni", GXutil.ltrim( localUtil.ntoc( A3712JorMMIni, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3713JorHHFin", GXutil.ltrim( localUtil.ntoc( A3713JorHHFin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3714JorMMFin", GXutil.ltrim( localUtil.ntoc( A3714JorMMFin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3717JorUltLin", GXutil.ltrim( localUtil.ntoc( A3717JorUltLin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3716JorParTot", GXutil.ltrim( localUtil.ntoc( A3716JorParTot, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3715JorHorNet", GXutil.ltrim( localUtil.ntoc( A3715JorHorNet, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3710JorFecha", localUtil.format(Z3710JorFecha, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3711JorHHIni", GXutil.ltrim( localUtil.ntoc( Z3711JorHHIni, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3712JorMMIni", GXutil.ltrim( localUtil.ntoc( Z3712JorMMIni, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3713JorHHFin", GXutil.ltrim( localUtil.ntoc( Z3713JorHHFin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3714JorMMFin", GXutil.ltrim( localUtil.ntoc( Z3714JorMMFin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3717JorUltLin", GXutil.ltrim( localUtil.ntoc( Z3717JorUltLin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3716JorParTot", GXutil.ltrim( localUtil.ntoc( Z3716JorParTot, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3715JorHorNet", GXutil.ltrim( localUtil.ntoc( Z3715JorHorNet, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3717JorUltLin", GXutil.ltrim( localUtil.ntoc( O3717JorUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3716JorParTot", GXutil.ltrim( localUtil.ntoc( O3716JorParTot, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Jormmfin( )
   {
      n3714JorMMFin = false ;
      n3711JorHHIni = false ;
      n3712JorMMIni = false ;
      n3713JorHHFin = false ;
      if ( ! ( ( ( A3714JorMMFin >= 0 ) && ( A3714JorMMFin <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Minutos Fin de Jornada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "JORMMFIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJorMMFin_Internalname ;
      }
      GXt_decimal5 = A3715JorHorNet ;
      GXv_int9[0] = A3711JorHHIni ;
      GXv_int8[0] = A3712JorMMIni ;
      GXv_int7[0] = A3713JorHHFin ;
      GXv_int6[0] = A3714JorMMFin ;
      GXv_decimal10[0] = GXt_decimal5 ;
      new app.core.phornet(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_int7, GXv_int6, GXv_decimal10) ;
      tjornad_impl.this.A3711JorHHIni = GXv_int9[0] ;
      tjornad_impl.this.A3712JorMMIni = GXv_int8[0] ;
      tjornad_impl.this.A3713JorHHFin = GXv_int7[0] ;
      tjornad_impl.this.A3714JorMMFin = GXv_int6[0] ;
      tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
      A3715JorHorNet = GXt_decimal5 ;
      if ( A3715JorHorNet.doubleValue() > 8 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atención: Jornada supera las 8 horas", ""), 0, "");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3715JorHorNet", GXutil.ltrim( localUtil.ntoc( A3715JorHorNet, (byte)(5), (byte)(2), ".", "")));
   }

   public void valid_Parmmfin( )
   {
      n3722ParMMFin = false ;
      n3719ParHHIni = false ;
      n3720ParMMIni = false ;
      n3721ParHHFin = false ;
      if ( ! ( ( ( A3722ParMMFin >= 0 ) && ( A3722ParMMFin <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Minutos Fin Paro", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PARMMFIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMMFin_Internalname ;
      }
      GXt_decimal5 = A3723ParHorNet ;
      GXv_int9[0] = A3719ParHHIni ;
      GXv_int8[0] = A3720ParMMIni ;
      GXv_int7[0] = A3721ParHHFin ;
      GXv_int6[0] = A3722ParMMFin ;
      GXv_decimal10[0] = GXt_decimal5 ;
      new app.core.phornet(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_int7, GXv_int6, GXv_decimal10) ;
      tjornad_impl.this.A3719ParHHIni = GXv_int9[0] ;
      tjornad_impl.this.A3720ParMMIni = GXv_int8[0] ;
      tjornad_impl.this.A3721ParHHFin = GXv_int7[0] ;
      tjornad_impl.this.A3722ParMMFin = GXv_int6[0] ;
      tjornad_impl.this.GXt_decimal5 = GXv_decimal10[0] ;
      A3723ParHorNet = GXt_decimal5 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3723ParHorNet", GXutil.ltrim( localUtil.ntoc( A3723ParHorNet, (byte)(5), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_JORFECHA","{handler:'valid_Jorfecha',iparms:[]");
      setEventMetadata("VALID_JORFECHA",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3717JorUltLin',fld:'JORULTLIN',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3710JorFecha',fld:'JORFECHA',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3711JorHHIni',fld:'JORHHINI',pic:'Z9'},{av:'A3712JorMMIni',fld:'JORMMINI',pic:'Z9'},{av:'A3713JorHHFin',fld:'JORHHFIN',pic:'Z9'},{av:'A3714JorMMFin',fld:'JORMMFIN',pic:'Z9'},{av:'A3717JorUltLin',fld:'JORULTLIN',pic:'ZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A3716JorParTot',fld:'JORPARTOT',pic:'Z9.99'},{av:'A3715JorHorNet',fld:'JORHORNET',pic:'Z9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3710JorFecha'},{av:'Z652OpeCod'},{av:'Z407EmprNom'},{av:'Z3711JorHHIni'},{av:'Z3712JorMMIni'},{av:'Z3713JorHHFin'},{av:'Z3714JorMMFin'},{av:'Z3717JorUltLin'},{av:'Z653OpeNom'},{av:'Z3716JorParTot'},{av:'Z3715JorHorNet'},{av:'O3717JorUltLin'},{av:'O3716JorParTot'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_JORHHINI","{handler:'valid_Jorhhini',iparms:[]");
      setEventMetadata("VALID_JORHHINI",",oparms:[]}");
      setEventMetadata("VALID_JORMMINI","{handler:'valid_Jormmini',iparms:[]");
      setEventMetadata("VALID_JORMMINI",",oparms:[]}");
      setEventMetadata("VALID_JORHHFIN","{handler:'valid_Jorhhfin',iparms:[]");
      setEventMetadata("VALID_JORHHFIN",",oparms:[]}");
      setEventMetadata("VALID_JORMMFIN","{handler:'valid_Jormmfin',iparms:[{av:'A3714JorMMFin',fld:'JORMMFIN',pic:'Z9'},{av:'A3711JorHHIni',fld:'JORHHINI',pic:'Z9'},{av:'A3712JorMMIni',fld:'JORMMINI',pic:'Z9'},{av:'A3713JorHHFin',fld:'JORHHFIN',pic:'Z9'},{av:'A3715JorHorNet',fld:'JORHORNET',pic:'Z9.99'}]");
      setEventMetadata("VALID_JORMMFIN",",oparms:[{av:'A3715JorHorNet',fld:'JORHORNET',pic:'Z9.99'}]}");
      setEventMetadata("VALID_JORHORNET","{handler:'valid_Jorhornet',iparms:[]");
      setEventMetadata("VALID_JORHORNET",",oparms:[]}");
      setEventMetadata("VALID_JORULTLIN","{handler:'valid_Jorultlin',iparms:[]");
      setEventMetadata("VALID_JORULTLIN",",oparms:[]}");
      setEventMetadata("VALID_PARLIN","{handler:'valid_Parlin',iparms:[]");
      setEventMetadata("VALID_PARLIN",",oparms:[]}");
      setEventMetadata("VALID_PARHHINI","{handler:'valid_Parhhini',iparms:[]");
      setEventMetadata("VALID_PARHHINI",",oparms:[]}");
      setEventMetadata("VALID_PARMMINI","{handler:'valid_Parmmini',iparms:[]");
      setEventMetadata("VALID_PARMMINI",",oparms:[]}");
      setEventMetadata("VALID_PARHHFIN","{handler:'valid_Parhhfin',iparms:[]");
      setEventMetadata("VALID_PARHHFIN",",oparms:[]}");
      setEventMetadata("VALID_PARMMFIN","{handler:'valid_Parmmfin',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O3723ParHorNet'},{av:'O3716JorParTot'},{av:'A3722ParMMFin',fld:'PARMMFIN',pic:'Z9'},{av:'A3719ParHHIni',fld:'PARHHINI',pic:'Z9'},{av:'A3720ParMMIni',fld:'PARMMINI',pic:'Z9'},{av:'A3721ParHHFin',fld:'PARHHFIN',pic:'Z9'},{av:'A3723ParHorNet',fld:'PARHORNET',pic:'Z9.99'}]");
      setEventMetadata("VALID_PARMMFIN",",oparms:[{av:'A3723ParHorNet',fld:'PARHORNET',pic:'Z9.99'}]}");
      setEventMetadata("VALID_PARHORNET","{handler:'valid_Parhornet',iparms:[]");
      setEventMetadata("VALID_PARHORNET",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Parobs',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z3710JorFecha = GXutil.nullDate() ;
      O3716JorParTot = DecimalUtil.ZERO ;
      Z3724ParObs = "" ;
      O3723ParHorNet = DecimalUtil.ZERO ;
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
      A3710JorFecha = GXutil.nullDate() ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3715JorHorNet = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A3716JorParTot = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B3716JorParTot = DecimalUtil.ZERO ;
      sMode1616 = "" ;
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
      sMode1615 = "" ;
      s3716JorParTot = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A3723ParHorNet = DecimalUtil.ZERO ;
      A3724ParObs = "" ;
      T3723ParHorNet = DecimalUtil.ZERO ;
      AV12Station = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV8UsurCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV13Lit2 = "" ;
      AV9LitFe = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T01GM6_A407EmprNom = new String[] {""} ;
      T01GM6_n407EmprNom = new boolean[] {false} ;
      T01GM8_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM8_A653OpeNom = new String[] {""} ;
      T01GM8_n653OpeNom = new boolean[] {false} ;
      T01GM8_A407EmprNom = new String[] {""} ;
      T01GM8_n407EmprNom = new boolean[] {false} ;
      T01GM8_A3711JorHHIni = new byte[1] ;
      T01GM8_n3711JorHHIni = new boolean[] {false} ;
      T01GM8_A3712JorMMIni = new byte[1] ;
      T01GM8_n3712JorMMIni = new boolean[] {false} ;
      T01GM8_A3713JorHHFin = new byte[1] ;
      T01GM8_n3713JorHHFin = new boolean[] {false} ;
      T01GM8_A3714JorMMFin = new byte[1] ;
      T01GM8_n3714JorMMFin = new boolean[] {false} ;
      T01GM8_A3717JorUltLin = new short[1] ;
      T01GM8_n3717JorUltLin = new boolean[] {false} ;
      T01GM8_A396EmprCod = new String[] {""} ;
      T01GM8_A652OpeCod = new int[1] ;
      T01GM7_A653OpeNom = new String[] {""} ;
      T01GM7_n653OpeNom = new boolean[] {false} ;
      T01GM9_A653OpeNom = new String[] {""} ;
      T01GM9_n653OpeNom = new boolean[] {false} ;
      T01GM10_A396EmprCod = new String[] {""} ;
      T01GM10_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM10_A652OpeCod = new int[1] ;
      T01GM5_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM5_A3711JorHHIni = new byte[1] ;
      T01GM5_n3711JorHHIni = new boolean[] {false} ;
      T01GM5_A3712JorMMIni = new byte[1] ;
      T01GM5_n3712JorMMIni = new boolean[] {false} ;
      T01GM5_A3713JorHHFin = new byte[1] ;
      T01GM5_n3713JorHHFin = new boolean[] {false} ;
      T01GM5_A3714JorMMFin = new byte[1] ;
      T01GM5_n3714JorMMFin = new boolean[] {false} ;
      T01GM5_A3717JorUltLin = new short[1] ;
      T01GM5_n3717JorUltLin = new boolean[] {false} ;
      T01GM5_A396EmprCod = new String[] {""} ;
      T01GM5_A652OpeCod = new int[1] ;
      T01GM11_A396EmprCod = new String[] {""} ;
      T01GM11_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM11_A652OpeCod = new int[1] ;
      T01GM12_A396EmprCod = new String[] {""} ;
      T01GM12_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM12_A652OpeCod = new int[1] ;
      T01GM4_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM4_A3711JorHHIni = new byte[1] ;
      T01GM4_n3711JorHHIni = new boolean[] {false} ;
      T01GM4_A3712JorMMIni = new byte[1] ;
      T01GM4_n3712JorMMIni = new boolean[] {false} ;
      T01GM4_A3713JorHHFin = new byte[1] ;
      T01GM4_n3713JorHHFin = new boolean[] {false} ;
      T01GM4_A3714JorMMFin = new byte[1] ;
      T01GM4_n3714JorMMFin = new boolean[] {false} ;
      T01GM4_A3717JorUltLin = new short[1] ;
      T01GM4_n3717JorUltLin = new boolean[] {false} ;
      T01GM4_A396EmprCod = new String[] {""} ;
      T01GM4_A652OpeCod = new int[1] ;
      T01GM16_A653OpeNom = new String[] {""} ;
      T01GM16_n653OpeNom = new boolean[] {false} ;
      T01GM18_A396EmprCod = new String[] {""} ;
      T01GM18_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM18_A652OpeCod = new int[1] ;
      T01GM19_A396EmprCod = new String[] {""} ;
      T01GM19_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM19_A652OpeCod = new int[1] ;
      T01GM19_A3718ParLin = new short[1] ;
      T01GM19_A3719ParHHIni = new byte[1] ;
      T01GM19_n3719ParHHIni = new boolean[] {false} ;
      T01GM19_A3720ParMMIni = new byte[1] ;
      T01GM19_n3720ParMMIni = new boolean[] {false} ;
      T01GM19_A3721ParHHFin = new byte[1] ;
      T01GM19_n3721ParHHFin = new boolean[] {false} ;
      T01GM19_A3722ParMMFin = new byte[1] ;
      T01GM19_n3722ParMMFin = new boolean[] {false} ;
      T01GM19_A3724ParObs = new String[] {""} ;
      T01GM19_n3724ParObs = new boolean[] {false} ;
      T01GM20_A396EmprCod = new String[] {""} ;
      T01GM20_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM20_A652OpeCod = new int[1] ;
      T01GM20_A3718ParLin = new short[1] ;
      T01GM3_A396EmprCod = new String[] {""} ;
      T01GM3_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM3_A652OpeCod = new int[1] ;
      T01GM3_A3718ParLin = new short[1] ;
      T01GM3_A3719ParHHIni = new byte[1] ;
      T01GM3_n3719ParHHIni = new boolean[] {false} ;
      T01GM3_A3720ParMMIni = new byte[1] ;
      T01GM3_n3720ParMMIni = new boolean[] {false} ;
      T01GM3_A3721ParHHFin = new byte[1] ;
      T01GM3_n3721ParHHFin = new boolean[] {false} ;
      T01GM3_A3722ParMMFin = new byte[1] ;
      T01GM3_n3722ParMMFin = new boolean[] {false} ;
      T01GM3_A3724ParObs = new String[] {""} ;
      T01GM3_n3724ParObs = new boolean[] {false} ;
      T01GM2_A396EmprCod = new String[] {""} ;
      T01GM2_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM2_A652OpeCod = new int[1] ;
      T01GM2_A3718ParLin = new short[1] ;
      T01GM2_A3719ParHHIni = new byte[1] ;
      T01GM2_n3719ParHHIni = new boolean[] {false} ;
      T01GM2_A3720ParMMIni = new byte[1] ;
      T01GM2_n3720ParMMIni = new boolean[] {false} ;
      T01GM2_A3721ParHHFin = new byte[1] ;
      T01GM2_n3721ParHHFin = new boolean[] {false} ;
      T01GM2_A3722ParMMFin = new byte[1] ;
      T01GM2_n3722ParMMFin = new boolean[] {false} ;
      T01GM2_A3724ParObs = new String[] {""} ;
      T01GM2_n3724ParObs = new boolean[] {false} ;
      T01GM24_A396EmprCod = new String[] {""} ;
      T01GM24_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM24_A652OpeCod = new int[1] ;
      T01GM24_A3718ParLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01GM25_A407EmprNom = new String[] {""} ;
      T01GM25_n407EmprNom = new boolean[] {false} ;
      T01GM26_A396EmprCod = new String[] {""} ;
      T01GM26_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01GM26_A652OpeCod = new int[1] ;
      T01GM26_A3718ParLin = new short[1] ;
      T01GM26_A3722ParMMFin = new byte[1] ;
      T01GM26_n3722ParMMFin = new boolean[] {false} ;
      T01GM26_A3721ParHHFin = new byte[1] ;
      T01GM26_n3721ParHHFin = new boolean[] {false} ;
      T01GM26_A3720ParMMIni = new byte[1] ;
      T01GM26_n3720ParMMIni = new boolean[] {false} ;
      T01GM26_A3719ParHHIni = new byte[1] ;
      T01GM26_n3719ParHHIni = new boolean[] {false} ;
      Z3716JorParTot = DecimalUtil.ZERO ;
      Z3715JorHorNet = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ3710JorFecha = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ653OpeNom = "" ;
      ZZ3716JorParTot = DecimalUtil.ZERO ;
      ZZ3715JorHorNet = DecimalUtil.ZERO ;
      ZO3716JorParTot = DecimalUtil.ZERO ;
      GXt_decimal5 = DecimalUtil.ZERO ;
      GXv_int9 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      Z3723ParHorNet = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tjornad__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tjornad__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tjornad__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tjornad__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tjornad__default(),
         new Object[] {
             new Object[] {
            T01GM2_A396EmprCod, T01GM2_A3710JorFecha, T01GM2_A652OpeCod, T01GM2_A3718ParLin, T01GM2_A3719ParHHIni, T01GM2_n3719ParHHIni, T01GM2_A3720ParMMIni, T01GM2_n3720ParMMIni, T01GM2_A3721ParHHFin, T01GM2_n3721ParHHFin,
            T01GM2_A3722ParMMFin, T01GM2_n3722ParMMFin, T01GM2_A3724ParObs, T01GM2_n3724ParObs
            }
            , new Object[] {
            T01GM3_A396EmprCod, T01GM3_A3710JorFecha, T01GM3_A652OpeCod, T01GM3_A3718ParLin, T01GM3_A3719ParHHIni, T01GM3_n3719ParHHIni, T01GM3_A3720ParMMIni, T01GM3_n3720ParMMIni, T01GM3_A3721ParHHFin, T01GM3_n3721ParHHFin,
            T01GM3_A3722ParMMFin, T01GM3_n3722ParMMFin, T01GM3_A3724ParObs, T01GM3_n3724ParObs
            }
            , new Object[] {
            T01GM4_A3710JorFecha, T01GM4_A3711JorHHIni, T01GM4_n3711JorHHIni, T01GM4_A3712JorMMIni, T01GM4_n3712JorMMIni, T01GM4_A3713JorHHFin, T01GM4_n3713JorHHFin, T01GM4_A3714JorMMFin, T01GM4_n3714JorMMFin, T01GM4_A3717JorUltLin,
            T01GM4_n3717JorUltLin, T01GM4_A396EmprCod, T01GM4_A652OpeCod
            }
            , new Object[] {
            T01GM5_A3710JorFecha, T01GM5_A3711JorHHIni, T01GM5_n3711JorHHIni, T01GM5_A3712JorMMIni, T01GM5_n3712JorMMIni, T01GM5_A3713JorHHFin, T01GM5_n3713JorHHFin, T01GM5_A3714JorMMFin, T01GM5_n3714JorMMFin, T01GM5_A3717JorUltLin,
            T01GM5_n3717JorUltLin, T01GM5_A396EmprCod, T01GM5_A652OpeCod
            }
            , new Object[] {
            T01GM6_A407EmprNom, T01GM6_n407EmprNom
            }
            , new Object[] {
            T01GM7_A653OpeNom, T01GM7_n653OpeNom
            }
            , new Object[] {
            T01GM8_A3710JorFecha, T01GM8_A653OpeNom, T01GM8_n653OpeNom, T01GM8_A407EmprNom, T01GM8_n407EmprNom, T01GM8_A3711JorHHIni, T01GM8_n3711JorHHIni, T01GM8_A3712JorMMIni, T01GM8_n3712JorMMIni, T01GM8_A3713JorHHFin,
            T01GM8_n3713JorHHFin, T01GM8_A3714JorMMFin, T01GM8_n3714JorMMFin, T01GM8_A3717JorUltLin, T01GM8_n3717JorUltLin, T01GM8_A396EmprCod, T01GM8_A652OpeCod
            }
            , new Object[] {
            T01GM9_A653OpeNom, T01GM9_n653OpeNom
            }
            , new Object[] {
            T01GM10_A396EmprCod, T01GM10_A3710JorFecha, T01GM10_A652OpeCod
            }
            , new Object[] {
            T01GM11_A396EmprCod, T01GM11_A3710JorFecha, T01GM11_A652OpeCod
            }
            , new Object[] {
            T01GM12_A396EmprCod, T01GM12_A3710JorFecha, T01GM12_A652OpeCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GM16_A653OpeNom, T01GM16_n653OpeNom
            }
            , new Object[] {
            }
            , new Object[] {
            T01GM18_A396EmprCod, T01GM18_A3710JorFecha, T01GM18_A652OpeCod
            }
            , new Object[] {
            T01GM19_A396EmprCod, T01GM19_A3710JorFecha, T01GM19_A652OpeCod, T01GM19_A3718ParLin, T01GM19_A3719ParHHIni, T01GM19_n3719ParHHIni, T01GM19_A3720ParMMIni, T01GM19_n3720ParMMIni, T01GM19_A3721ParHHFin, T01GM19_n3721ParHHFin,
            T01GM19_A3722ParMMFin, T01GM19_n3722ParMMFin, T01GM19_A3724ParObs, T01GM19_n3724ParObs
            }
            , new Object[] {
            T01GM20_A396EmprCod, T01GM20_A3710JorFecha, T01GM20_A652OpeCod, T01GM20_A3718ParLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GM24_A396EmprCod, T01GM24_A3710JorFecha, T01GM24_A652OpeCod, T01GM24_A3718ParLin
            }
            , new Object[] {
            T01GM25_A407EmprNom, T01GM25_n407EmprNom
            }
            , new Object[] {
            T01GM26_A396EmprCod, T01GM26_A3710JorFecha, T01GM26_A652OpeCod, T01GM26_A3718ParLin, T01GM26_A3722ParMMFin, T01GM26_n3722ParMMFin, T01GM26_A3721ParHHFin, T01GM26_n3721ParHHFin, T01GM26_A3720ParMMIni, T01GM26_n3720ParMMIni,
            T01GM26_A3719ParHHIni, T01GM26_n3719ParHHIni
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z3711JorHHIni ;
   private byte Z3712JorMMIni ;
   private byte Z3713JorHHFin ;
   private byte Z3714JorMMFin ;
   private byte Z3719ParHHIni ;
   private byte Z3720ParMMIni ;
   private byte Z3721ParHHFin ;
   private byte Z3722ParMMFin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A3711JorHHIni ;
   private byte A3712JorMMIni ;
   private byte A3713JorHHFin ;
   private byte A3714JorMMFin ;
   private byte A3719ParHHIni ;
   private byte A3720ParMMIni ;
   private byte A3721ParHHFin ;
   private byte A3722ParMMFin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ3711JorHHIni ;
   private byte ZZ3712JorMMIni ;
   private byte ZZ3713JorHHFin ;
   private byte ZZ3714JorMMFin ;
   private byte GXv_int9[] ;
   private byte GXv_int8[] ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private short Z3717JorUltLin ;
   private short O3717JorUltLin ;
   private short Z3718ParLin ;
   private short nRcdDeleted_1616 ;
   private short nRcdExists_1616 ;
   private short nIsMod_1616 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3717JorUltLin ;
   private short nBlankRcdCount1616 ;
   private short RcdFound1616 ;
   private short B3717JorUltLin ;
   private short nBlankRcdUsr1616 ;
   private short s3717JorUltLin ;
   private short A3718ParLin ;
   private short RcdFound1615 ;
   private short nIsDirty_1615 ;
   private short nIsDirty_1616 ;
   private short i3717JorUltLin ;
   private short ZZ3717JorUltLin ;
   private short ZO3717JorUltLin ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int A652OpeCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtJorFecha_Enabled ;
   private int edtOpeCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtJorHHIni_Enabled ;
   private int edtJorMMIni_Enabled ;
   private int edtJorHHFin_Enabled ;
   private int edtJorMMFin_Enabled ;
   private int edtJorHorNet_Enabled ;
   private int edtJorParTot_Enabled ;
   private int edtJorUltLin_Enabled ;
   private int edtavnRcdDeleted_1616_Enabled ;
   private int edtParLin_Enabled ;
   private int edtParHHIni_Enabled ;
   private int edtParMMIni_Enabled ;
   private int edtParHHFin_Enabled ;
   private int edtParMMFin_Enabled ;
   private int edtParHorNet_Enabled ;
   private int edtParObs_Enabled ;
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
   private int defedtParLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtJorUltLin_Backcolor ;
   private int edtJorParTot_Backcolor ;
   private int edtJorHorNet_Backcolor ;
   private int edtJorMMFin_Backcolor ;
   private int edtJorHHFin_Backcolor ;
   private int edtJorMMIni_Backcolor ;
   private int edtJorHHIni_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtJorFecha_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ652OpeCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O3716JorParTot ;
   private java.math.BigDecimal O3723ParHorNet ;
   private java.math.BigDecimal A3715JorHorNet ;
   private java.math.BigDecimal A3716JorParTot ;
   private java.math.BigDecimal B3716JorParTot ;
   private java.math.BigDecimal s3716JorParTot ;
   private java.math.BigDecimal A3723ParHorNet ;
   private java.math.BigDecimal T3723ParHorNet ;
   private java.math.BigDecimal Z3716JorParTot ;
   private java.math.BigDecimal Z3715JorHorNet ;
   private java.math.BigDecimal ZZ3716JorParTot ;
   private java.math.BigDecimal ZZ3715JorHorNet ;
   private java.math.BigDecimal ZO3716JorParTot ;
   private java.math.BigDecimal GXt_decimal5 ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal Z3723ParHorNet ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z3724ParObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtJorFecha_Internalname ;
   private String sGXsfl_80_idx="0001" ;
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
   private String edtJorFecha_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtOpeCod_Internalname ;
   private String edtOpeCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtOpeNom_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtJorHHIni_Internalname ;
   private String edtJorHHIni_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtJorMMIni_Internalname ;
   private String edtJorMMIni_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtJorHHFin_Internalname ;
   private String edtJorHHFin_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtJorMMFin_Internalname ;
   private String edtJorMMFin_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtJorHorNet_Internalname ;
   private String edtJorHorNet_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtJorParTot_Internalname ;
   private String edtJorParTot_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtJorUltLin_Internalname ;
   private String edtJorUltLin_Jsonclick ;
   private String sMode1616 ;
   private String edtavnRcdDeleted_1616_Internalname ;
   private String edtParLin_Internalname ;
   private String edtParHHIni_Internalname ;
   private String edtParMMIni_Internalname ;
   private String edtParHHFin_Internalname ;
   private String edtParMMFin_Internalname ;
   private String edtParHorNet_Internalname ;
   private String edtParObs_Internalname ;
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
   private String sMode1615 ;
   private String GXCCtl ;
   private String A3724ParObs ;
   private String AV12Station ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV8UsurCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV13Lit2 ;
   private String AV9LitFe ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1616_Jsonclick ;
   private String edtParLin_Jsonclick ;
   private String edtParHHIni_Jsonclick ;
   private String edtParMMIni_Jsonclick ;
   private String edtParHHFin_Jsonclick ;
   private String edtParMMFin_Jsonclick ;
   private String edtParHorNet_Jsonclick ;
   private String edtParObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ653OpeNom ;
   private java.util.Date Z3710JorFecha ;
   private java.util.Date A3710JorFecha ;
   private java.util.Date ZZ3710JorFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n3717JorUltLin ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n653OpeNom ;
   private boolean n407EmprNom ;
   private boolean n3711JorHHIni ;
   private boolean n3712JorMMIni ;
   private boolean n3713JorHHFin ;
   private boolean n3714JorMMFin ;
   private boolean returnInSub ;
   private boolean n3719ParHHIni ;
   private boolean n3720ParMMIni ;
   private boolean n3721ParHHFin ;
   private boolean n3722ParMMFin ;
   private boolean n3724ParObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01GM6_A407EmprNom ;
   private boolean[] T01GM6_n407EmprNom ;
   private java.util.Date[] T01GM8_A3710JorFecha ;
   private String[] T01GM8_A653OpeNom ;
   private boolean[] T01GM8_n653OpeNom ;
   private String[] T01GM8_A407EmprNom ;
   private boolean[] T01GM8_n407EmprNom ;
   private byte[] T01GM8_A3711JorHHIni ;
   private boolean[] T01GM8_n3711JorHHIni ;
   private byte[] T01GM8_A3712JorMMIni ;
   private boolean[] T01GM8_n3712JorMMIni ;
   private byte[] T01GM8_A3713JorHHFin ;
   private boolean[] T01GM8_n3713JorHHFin ;
   private byte[] T01GM8_A3714JorMMFin ;
   private boolean[] T01GM8_n3714JorMMFin ;
   private short[] T01GM8_A3717JorUltLin ;
   private boolean[] T01GM8_n3717JorUltLin ;
   private String[] T01GM8_A396EmprCod ;
   private int[] T01GM8_A652OpeCod ;
   private String[] T01GM7_A653OpeNom ;
   private boolean[] T01GM7_n653OpeNom ;
   private String[] T01GM9_A653OpeNom ;
   private boolean[] T01GM9_n653OpeNom ;
   private String[] T01GM10_A396EmprCod ;
   private java.util.Date[] T01GM10_A3710JorFecha ;
   private int[] T01GM10_A652OpeCod ;
   private java.util.Date[] T01GM5_A3710JorFecha ;
   private byte[] T01GM5_A3711JorHHIni ;
   private boolean[] T01GM5_n3711JorHHIni ;
   private byte[] T01GM5_A3712JorMMIni ;
   private boolean[] T01GM5_n3712JorMMIni ;
   private byte[] T01GM5_A3713JorHHFin ;
   private boolean[] T01GM5_n3713JorHHFin ;
   private byte[] T01GM5_A3714JorMMFin ;
   private boolean[] T01GM5_n3714JorMMFin ;
   private short[] T01GM5_A3717JorUltLin ;
   private boolean[] T01GM5_n3717JorUltLin ;
   private String[] T01GM5_A396EmprCod ;
   private int[] T01GM5_A652OpeCod ;
   private String[] T01GM11_A396EmprCod ;
   private java.util.Date[] T01GM11_A3710JorFecha ;
   private int[] T01GM11_A652OpeCod ;
   private String[] T01GM12_A396EmprCod ;
   private java.util.Date[] T01GM12_A3710JorFecha ;
   private int[] T01GM12_A652OpeCod ;
   private java.util.Date[] T01GM4_A3710JorFecha ;
   private byte[] T01GM4_A3711JorHHIni ;
   private boolean[] T01GM4_n3711JorHHIni ;
   private byte[] T01GM4_A3712JorMMIni ;
   private boolean[] T01GM4_n3712JorMMIni ;
   private byte[] T01GM4_A3713JorHHFin ;
   private boolean[] T01GM4_n3713JorHHFin ;
   private byte[] T01GM4_A3714JorMMFin ;
   private boolean[] T01GM4_n3714JorMMFin ;
   private short[] T01GM4_A3717JorUltLin ;
   private boolean[] T01GM4_n3717JorUltLin ;
   private String[] T01GM4_A396EmprCod ;
   private int[] T01GM4_A652OpeCod ;
   private String[] T01GM16_A653OpeNom ;
   private boolean[] T01GM16_n653OpeNom ;
   private String[] T01GM18_A396EmprCod ;
   private java.util.Date[] T01GM18_A3710JorFecha ;
   private int[] T01GM18_A652OpeCod ;
   private String[] T01GM19_A396EmprCod ;
   private java.util.Date[] T01GM19_A3710JorFecha ;
   private int[] T01GM19_A652OpeCod ;
   private short[] T01GM19_A3718ParLin ;
   private byte[] T01GM19_A3719ParHHIni ;
   private boolean[] T01GM19_n3719ParHHIni ;
   private byte[] T01GM19_A3720ParMMIni ;
   private boolean[] T01GM19_n3720ParMMIni ;
   private byte[] T01GM19_A3721ParHHFin ;
   private boolean[] T01GM19_n3721ParHHFin ;
   private byte[] T01GM19_A3722ParMMFin ;
   private boolean[] T01GM19_n3722ParMMFin ;
   private String[] T01GM19_A3724ParObs ;
   private boolean[] T01GM19_n3724ParObs ;
   private String[] T01GM20_A396EmprCod ;
   private java.util.Date[] T01GM20_A3710JorFecha ;
   private int[] T01GM20_A652OpeCod ;
   private short[] T01GM20_A3718ParLin ;
   private String[] T01GM3_A396EmprCod ;
   private java.util.Date[] T01GM3_A3710JorFecha ;
   private int[] T01GM3_A652OpeCod ;
   private short[] T01GM3_A3718ParLin ;
   private byte[] T01GM3_A3719ParHHIni ;
   private boolean[] T01GM3_n3719ParHHIni ;
   private byte[] T01GM3_A3720ParMMIni ;
   private boolean[] T01GM3_n3720ParMMIni ;
   private byte[] T01GM3_A3721ParHHFin ;
   private boolean[] T01GM3_n3721ParHHFin ;
   private byte[] T01GM3_A3722ParMMFin ;
   private boolean[] T01GM3_n3722ParMMFin ;
   private String[] T01GM3_A3724ParObs ;
   private boolean[] T01GM3_n3724ParObs ;
   private String[] T01GM2_A396EmprCod ;
   private java.util.Date[] T01GM2_A3710JorFecha ;
   private int[] T01GM2_A652OpeCod ;
   private short[] T01GM2_A3718ParLin ;
   private byte[] T01GM2_A3719ParHHIni ;
   private boolean[] T01GM2_n3719ParHHIni ;
   private byte[] T01GM2_A3720ParMMIni ;
   private boolean[] T01GM2_n3720ParMMIni ;
   private byte[] T01GM2_A3721ParHHFin ;
   private boolean[] T01GM2_n3721ParHHFin ;
   private byte[] T01GM2_A3722ParMMFin ;
   private boolean[] T01GM2_n3722ParMMFin ;
   private String[] T01GM2_A3724ParObs ;
   private boolean[] T01GM2_n3724ParObs ;
   private String[] T01GM24_A396EmprCod ;
   private java.util.Date[] T01GM24_A3710JorFecha ;
   private int[] T01GM24_A652OpeCod ;
   private short[] T01GM24_A3718ParLin ;
   private String[] T01GM25_A407EmprNom ;
   private boolean[] T01GM25_n407EmprNom ;
   private String[] T01GM26_A396EmprCod ;
   private java.util.Date[] T01GM26_A3710JorFecha ;
   private int[] T01GM26_A652OpeCod ;
   private short[] T01GM26_A3718ParLin ;
   private byte[] T01GM26_A3722ParMMFin ;
   private boolean[] T01GM26_n3722ParMMFin ;
   private byte[] T01GM26_A3721ParHHFin ;
   private boolean[] T01GM26_n3721ParHHFin ;
   private byte[] T01GM26_A3720ParMMIni ;
   private boolean[] T01GM26_n3720ParMMIni ;
   private byte[] T01GM26_A3719ParHHIni ;
   private boolean[] T01GM26_n3719ParHHIni ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tjornad__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjornad__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjornad__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjornad__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjornad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GM2", "SELECT EmprCod, JorFecha, OpeCod, ParLin, ParHHIni, ParMMIni, ParHHFin, ParMMFin, ParObs FROM TXPParope WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ? AND ParLin = ?  FOR UPDATE OF ParHHIni, ParMMIni, ParHHFin, ParMMFin, ParObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM3", "SELECT EmprCod, JorFecha, OpeCod, ParLin, ParHHIni, ParMMIni, ParHHFin, ParMMFin, ParObs FROM TXPParope WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ? AND ParLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM4", "SELECT JorFecha, JorHHIni, JorMMIni, JorHHFin, JorMMFin, JorUltLin, EmprCod, OpeCod FROM TXPJornad WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ?  FOR UPDATE OF JorHHIni, JorMMIni, JorHHFin, JorMMFin, JorUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM5", "SELECT JorFecha, JorHHIni, JorMMIni, JorHHFin, JorMMFin, JorUltLin, EmprCod, OpeCod FROM TXPJornad WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM7", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM8", "SELECT /*+ FIRST_ROWS(100) */ TM1.JorFecha, T3.OpeNom, T2.EmprNom, TM1.JorHHIni, TM1.JorMMIni, TM1.JorHHFin, TM1.JorMMFin, TM1.JorUltLin, TM1.EmprCod, TM1.OpeCod FROM ((TXPJornad TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.JorFecha = ? and TM1.OpeCod = ? ORDER BY TM1.EmprCod, TM1.JorFecha, TM1.OpeCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM9", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, JorFecha, OpeCod FROM TXPJornad WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, JorFecha, OpeCod FROM TXPJornad WHERE ( JorFecha > ? or JorFecha = ? and OpeCod > ?) and EmprCod = ? ORDER BY EmprCod, JorFecha, OpeCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GM12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, JorFecha, OpeCod FROM TXPJornad WHERE ( JorFecha < ? or JorFecha = ? and OpeCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, JorFecha DESC, OpeCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GM13", "INSERT INTO TXPJornad(JorFecha, JorHHIni, JorMMIni, JorHHFin, JorMMFin, JorUltLin, EmprCod, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPJornad")
         ,new UpdateCursor("T01GM14", "UPDATE TXPJornad SET JorHHIni=?, JorMMIni=?, JorHHFin=?, JorMMFin=?, JorUltLin=?  WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ?", GX_NOMASK, "TXPJornad")
         ,new UpdateCursor("T01GM15", "DELETE FROM TXPJornad  WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ?", GX_NOMASK, "TXPJornad")
         ,new ForEachCursor("T01GM16", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01GM17", "UPDATE TXPJornad SET JorUltLin=?  WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ?", GX_NOMASK, "TXPJornad")
         ,new ForEachCursor("T01GM18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, JorFecha, OpeCod FROM TXPJornad WHERE EmprCod = ? ORDER BY EmprCod, JorFecha, OpeCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM19", "SELECT EmprCod, JorFecha, OpeCod, ParLin, ParHHIni, ParMMIni, ParHHFin, ParMMFin, ParObs FROM TXPParope WHERE EmprCod = ? and JorFecha = ? and OpeCod = ? and ParLin = ? ORDER BY EmprCod, JorFecha, OpeCod, ParLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM20", "SELECT EmprCod, JorFecha, OpeCod, ParLin FROM TXPParope WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ? AND ParLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01GM21", "INSERT INTO TXPParope(EmprCod, JorFecha, OpeCod, ParLin, ParHHIni, ParMMIni, ParHHFin, ParMMFin, ParObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPParope")
         ,new UpdateCursor("T01GM22", "UPDATE TXPParope SET ParHHIni=?, ParMMIni=?, ParHHFin=?, ParMMFin=?, ParObs=?  WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ? AND ParLin = ?", GX_NOMASK, "TXPParope")
         ,new UpdateCursor("T01GM23", "DELETE FROM TXPParope  WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ? AND ParLin = ?", GX_NOMASK, "TXPParope")
         ,new ForEachCursor("T01GM24", "SELECT EmprCod, JorFecha, OpeCod, ParLin FROM TXPParope WHERE EmprCod = ? and JorFecha = ? and OpeCod = ? ORDER BY EmprCod, JorFecha, OpeCod, ParLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GM26", "SELECT EmprCod, JorFecha, OpeCod, ParLin, ParMMFin, ParHHFin, ParMMIni, ParHHIni FROM TXPParope WHERE EmprCod = ? AND JorFecha = ? AND OpeCod = ? ORDER BY EmprCod, JorFecha, OpeCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 50);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 50);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 50);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               stmt.setString(7, (String)parms[11], 3);
               stmt.setInt(8, ((Number) parms[12]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setDate(7, (java.util.Date)parms[11]);
               stmt.setInt(8, ((Number) parms[12]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 50);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 50);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setDate(7, (java.util.Date)parms[11]);
               stmt.setInt(8, ((Number) parms[12]).intValue());
               stmt.setShort(9, ((Number) parms[13]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

