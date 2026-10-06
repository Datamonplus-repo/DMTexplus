package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevcom_impl extends GXDataArea
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
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
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
         gxload_5( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
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
         gxload_9( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A742PrdUniCom = (byte)(GXutil.lval( httpContext.GetPar( "PrdUniCom"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A742PrdUniCom) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DEVOLUCION DE COMPRAS", ""), (short)(0)) ;
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
      nRC_GXsfl_105 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_105"))) ;
      nGXsfl_105_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_105_idx"))) ;
      sGXsfl_105_idx = httpContext.GetPar( "sGXsfl_105_idx") ;
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

   public tdevcom_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevcom_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevcom_impl.class ));
   }

   public tdevcom_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDEVCOM.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Alb.Devolucion Compras", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4850DevComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevComCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4850DevComCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4850DevComCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevComCod_Jsonclick, 0, "", "", "", "", "", 1, edtDevComCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha Alb.Devolucion Compras", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevComFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevComFec_Internalname, localUtil.format(A4851DevComFec, "99/99/99"), localUtil.format( A4851DevComFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevComFec_Jsonclick, 0, "", "", "", "", "", 1, edtDevComFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCOM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevComFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevComFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVCOM.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "DevComPri", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevComPri_Internalname, GXutil.rtrim( A4852DevComPri), GXutil.rtrim( localUtil.format( A4852DevComPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevComPri_Jsonclick, 0, "", "", "", "", "", 1, edtDevComPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Albaran de Entrada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbarEnt_Internalname, GXutil.rtrim( A4853AlbarEnt), GXutil.rtrim( localUtil.format( A4853AlbarEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbarEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbarEnt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Pedido", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCod_Jsonclick, 0, "", "", "", "", "", 1, edtPedCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "ProveedorID", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Código de Procedencia", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "", "", "", "", "", 1, edtProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre Procedencia", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNom_Internalname, GXutil.rtrim( A971ProceNom), GXutil.rtrim( localUtil.format( A971ProceNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNom_Jsonclick, 0, "", "", "", "", "", 1, edtProceNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Nombre Transportista", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "N.Placa Trans. Devoluc.Compras", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevComTPla_Internalname, GXutil.rtrim( A4854DevComTPla), GXutil.rtrim( localUtil.format( A4854DevComTPla, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevComTPla_Jsonclick, 0, "", "", "", "", "", 1, edtDevComTPla_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Linea Trans.Devol.Compras", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevComTLin_Internalname, GXutil.rtrim( A4855DevComTLin), GXutil.rtrim( localUtil.format( A4855DevComTLin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevComTLin_Jsonclick, 0, "", "", "", "", "", 1, edtDevComTLin_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Estado Listado Alb.Dev.Compras", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevComLis_Internalname, GXutil.ltrim( localUtil.ntoc( A4856DevComLis, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevComLis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4856DevComLis), "0,1") : localUtil.format( DecimalUtil.doubleToDec(A4856DevComLis), "0,1"))), TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevComLis_Jsonclick, 0, "", "", "", "", "", 1, edtDevComLis_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Observacion Devolucion Compras", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevComObs_Internalname, A4857DevComObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", (short)(0), 1, edtDevComObs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCOM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol105( ) ;
      nGXsfl_105_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1630 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1630 = (short)(1) ;
            scanStart1GX1630( ) ;
            while ( RcdFound1630 != 0 )
            {
               init_level_properties1630( ) ;
               getByPrimaryKey1GX1630( ) ;
               addRow1GX1630( ) ;
               scanNext1GX1630( ) ;
            }
            scanEnd1GX1630( ) ;
            nBlankRcdCount1630 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1GX1630( ) ;
         standaloneModal1GX1630( ) ;
         sMode1630 = Gx_mode ;
         while ( nGXsfl_105_idx < nRC_GXsfl_105 )
         {
            bGXsfl_105_Refreshing = true ;
            readRow1GX1630( ) ;
            edtavnRcdDeleted_1630_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1630_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1630_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1630_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtDevComCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCOMCAN_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevComCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComCan_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtDevComFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCOMFAC_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevComFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComFac_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtPrdUniCom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUNICOM_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCom_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtPrdUcpDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUCPDSC_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdUcpDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcpDsc_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            if ( ( nRcdExists_1630 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1GX1630( ) ;
            }
            sendRow1GX1630( ) ;
            bGXsfl_105_Refreshing = false ;
         }
         Gx_mode = sMode1630 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1630 = (short)(5) ;
         nRcdExists_1630 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1GX1630( ) ;
            while ( RcdFound1630 != 0 )
            {
               sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1051630( ) ;
               init_level_properties1630( ) ;
               standaloneNotModal1GX1630( ) ;
               getByPrimaryKey1GX1630( ) ;
               standaloneModal1GX1630( ) ;
               addRow1GX1630( ) ;
               scanNext1GX1630( ) ;
            }
            scanEnd1GX1630( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1630 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1051630( ) ;
      initAll1GX1630( ) ;
      init_level_properties1630( ) ;
      nRcdExists_1630 = (short)(0) ;
      nIsMod_1630 = (short)(0) ;
      nRcdDeleted_1630 = (short)(0) ;
      nBlankRcdCount1630 = (short)(nBlankRcdUsr1630+nBlankRcdCount1630) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1630 > 0 )
      {
         standaloneNotModal1GX1630( ) ;
         standaloneModal1GX1630( ) ;
         addRow1GX1630( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1630 = (short)(nBlankRcdCount1630-1) ;
      }
      Gx_mode = sMode1630 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCOM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDEVCOM.htm");
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
         Z4850DevComCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4850DevComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4851DevComFec = localUtil.ctod( httpContext.cgiGet( "Z4851DevComFec"), 0) ;
         Z4852DevComPri = httpContext.cgiGet( "Z4852DevComPri") ;
         Z4853AlbarEnt = httpContext.cgiGet( "Z4853AlbarEnt") ;
         Z4854DevComTPla = httpContext.cgiGet( "Z4854DevComTPla") ;
         Z4855DevComTLin = httpContext.cgiGet( "Z4855DevComTLin") ;
         Z4856DevComLis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4856DevComLis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_105 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_105"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCOMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevComCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4850DevComCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
         }
         else
         {
            A4850DevComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDevComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDevComFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVCOMFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevComFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4851DevComFec = GXutil.nullDate() ;
            n4851DevComFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4851DevComFec", localUtil.format(A4851DevComFec, "99/99/99"));
         }
         else
         {
            A4851DevComFec = localUtil.ctod( httpContext.cgiGet( edtDevComFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4851DevComFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4851DevComFec", localUtil.format(A4851DevComFec, "99/99/99"));
         }
         A4852DevComPri = httpContext.cgiGet( edtDevComPri_Internalname) ;
         n4852DevComPri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4852DevComPri", A4852DevComPri);
         A4853AlbarEnt = httpContext.cgiGet( edtAlbarEnt_Internalname) ;
         n4853AlbarEnt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4853AlbarEnt", A4853AlbarEnt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A658PedCod = 0 ;
            n658PedCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         }
         else
         {
            A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n658PedCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         }
         A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
         n794PrvNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A970ProceCod = (short)(0) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         else
         {
            A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
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
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A4854DevComTPla = httpContext.cgiGet( edtDevComTPla_Internalname) ;
         n4854DevComTPla = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4854DevComTPla", A4854DevComTPla);
         A4855DevComTLin = httpContext.cgiGet( edtDevComTLin_Internalname) ;
         n4855DevComTLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4855DevComTLin", A4855DevComTLin);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevComLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevComLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCOMLIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevComLis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4856DevComLis = (byte)(0) ;
            n4856DevComLis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4856DevComLis", GXutil.str( A4856DevComLis, 1, 0));
         }
         else
         {
            A4856DevComLis = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevComLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4856DevComLis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4856DevComLis", GXutil.str( A4856DevComLis, 1, 0));
         }
         A4857DevComObs = httpContext.cgiGet( edtDevComObs_Internalname) ;
         n4857DevComObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4857DevComObs", A4857DevComObs);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
            A4850DevComCod = (int)(GXutil.lval( httpContext.GetPar( "DevComCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
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
            initAll1GX1629( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1630_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1630_Enabled), 5, 0), !bGXsfl_105_Refreshing);
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
      disableAttributes1GX1629( ) ;
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

   public void confirm_1GX0( )
   {
      beforeValidate1GX1629( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GX1629( ) ;
         }
         else
         {
            checkExtendedTable1GX1629( ) ;
            if ( AnyError == 0 )
            {
               zm1GX1629( 3) ;
               zm1GX1629( 4) ;
               zm1GX1629( 5) ;
               zm1GX1629( 6) ;
               zm1GX1629( 7) ;
            }
            closeExtendedTableCursors1GX1629( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1629 = Gx_mode ;
         confirm_1GX1630( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1629 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1629 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1GX0( ) ;
      }
   }

   public void confirm_1GX1630( )
   {
      nGXsfl_105_idx = 0 ;
      while ( nGXsfl_105_idx < nRC_GXsfl_105 )
      {
         readRow1GX1630( ) ;
         if ( ( nRcdExists_1630 != 0 ) || ( nIsMod_1630 != 0 ) )
         {
            getKey1GX1630( ) ;
            if ( ( nRcdExists_1630 == 0 ) && ( nRcdDeleted_1630 == 0 ) )
            {
               if ( RcdFound1630 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1GX1630( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1GX1630( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1GX1630( 9) ;
                        zm1GX1630( 10) ;
                     }
                     closeExtendedTableCursors1GX1630( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PRDNUM_" + sGXsfl_105_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1630 != 0 )
               {
                  if ( nRcdDeleted_1630 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1GX1630( ) ;
                     load1GX1630( ) ;
                     beforeValidate1GX1630( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1GX1630( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1630 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1GX1630( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1GX1630( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1GX1630( 9) ;
                              zm1GX1630( 10) ;
                           }
                           closeExtendedTableCursors1GX1630( ) ;
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
                  if ( nRcdDeleted_1630 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_105_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1630_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtDevComCan_Internalname, GXutil.ltrim( localUtil.ntoc( A4858DevComCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevComFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4859DevComFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdUniCom_Internalname, GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdUcpDsc_Internalname, GXutil.rtrim( A737PrdUcpDsc)) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_105_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z4858DevComCan_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z4858DevComCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4859DevComFac_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z4859DevComFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1630_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1630_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1630_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1630 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1630_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1630_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCOMCAN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevComCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCOMFAC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevComFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUNICOM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUCPDSC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUcpDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1GX0( )
   {
   }

   public void zm1GX1629( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4851DevComFec = T01GX7_A4851DevComFec[0] ;
            Z4852DevComPri = T01GX7_A4852DevComPri[0] ;
            Z4853AlbarEnt = T01GX7_A4853AlbarEnt[0] ;
            Z4854DevComTPla = T01GX7_A4854DevComTPla[0] ;
            Z4855DevComTLin = T01GX7_A4855DevComTLin[0] ;
            Z4856DevComLis = T01GX7_A4856DevComLis[0] ;
            Z658PedCod = T01GX7_A658PedCod[0] ;
            Z840TrnCod = T01GX7_A840TrnCod[0] ;
            Z970ProceCod = T01GX7_A970ProceCod[0] ;
         }
         else
         {
            Z4851DevComFec = A4851DevComFec ;
            Z4852DevComPri = A4852DevComPri ;
            Z4853AlbarEnt = A4853AlbarEnt ;
            Z4854DevComTPla = A4854DevComTPla ;
            Z4855DevComTLin = A4855DevComTLin ;
            Z4856DevComLis = A4856DevComLis ;
            Z658PedCod = A658PedCod ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z4850DevComCod = A4850DevComCod ;
         Z4851DevComFec = A4851DevComFec ;
         Z4852DevComPri = A4852DevComPri ;
         Z4853AlbarEnt = A4853AlbarEnt ;
         Z4854DevComTPla = A4854DevComTPla ;
         Z4855DevComTLin = A4855DevComTLin ;
         Z4856DevComLis = A4856DevComLis ;
         Z4857DevComObs = A4857DevComObs ;
         Z396EmprCod = A396EmprCod ;
         Z658PedCod = A658PedCod ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z407EmprNom = A407EmprNom ;
         Z795PrvNum = A795PrvNum ;
         Z794PrvNom = A794PrvNom ;
         Z971ProceNom = A971ProceNom ;
         Z841TrnNom = A841TrnNom ;
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

   public void load1GX1629( )
   {
      /* Using cursor T01GX13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1629 = (short)(1) ;
         A4857DevComObs = T01GX13_A4857DevComObs[0] ;
         n4857DevComObs = T01GX13_n4857DevComObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4857DevComObs", A4857DevComObs);
         A4851DevComFec = T01GX13_A4851DevComFec[0] ;
         n4851DevComFec = T01GX13_n4851DevComFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4851DevComFec", localUtil.format(A4851DevComFec, "99/99/99"));
         A4852DevComPri = T01GX13_A4852DevComPri[0] ;
         n4852DevComPri = T01GX13_n4852DevComPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4852DevComPri", A4852DevComPri);
         A4853AlbarEnt = T01GX13_A4853AlbarEnt[0] ;
         n4853AlbarEnt = T01GX13_n4853AlbarEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4853AlbarEnt", A4853AlbarEnt);
         A794PrvNom = T01GX13_A794PrvNom[0] ;
         n794PrvNom = T01GX13_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A971ProceNom = T01GX13_A971ProceNom[0] ;
         n971ProceNom = T01GX13_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A841TrnNom = T01GX13_A841TrnNom[0] ;
         n841TrnNom = T01GX13_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A4854DevComTPla = T01GX13_A4854DevComTPla[0] ;
         n4854DevComTPla = T01GX13_n4854DevComTPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4854DevComTPla", A4854DevComTPla);
         A4855DevComTLin = T01GX13_A4855DevComTLin[0] ;
         n4855DevComTLin = T01GX13_n4855DevComTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4855DevComTLin", A4855DevComTLin);
         A4856DevComLis = T01GX13_A4856DevComLis[0] ;
         n4856DevComLis = T01GX13_n4856DevComLis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4856DevComLis", GXutil.str( A4856DevComLis, 1, 0));
         A407EmprNom = T01GX13_A407EmprNom[0] ;
         n407EmprNom = T01GX13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A658PedCod = T01GX13_A658PedCod[0] ;
         n658PedCod = T01GX13_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A840TrnCod = T01GX13_A840TrnCod[0] ;
         n840TrnCod = T01GX13_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01GX13_A970ProceCod[0] ;
         n970ProceCod = T01GX13_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A795PrvNum = T01GX13_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         zm1GX1629( -2) ;
      }
      pr_default.close(11);
      onLoadActions1GX1629( ) ;
   }

   public void onLoadActions1GX1629( )
   {
   }

   public void checkExtendedTable1GX1629( )
   {
      nIsDirty_1629 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01GX8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GX8_A407EmprNom[0] ;
      n407EmprNom = T01GX8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T01GX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A795PrvNum = T01GX9_A795PrvNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      pr_default.close(7);
      /* Using cursor T01GX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01GX10_A841TrnNom[0] ;
      n841TrnNom = T01GX10_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(8);
      /* Using cursor T01GX11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A971ProceNom = T01GX11_A971ProceNom[0] ;
      n971ProceNom = T01GX11_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      pr_default.close(9);
      /* Using cursor T01GX12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T01GX12_A794PrvNom[0] ;
      n794PrvNom = T01GX12_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      pr_default.close(10);
      if ( ! ( ( GXutil.strcmp(A4852DevComPri, "0") == 0 ) || ( GXutil.strcmp(A4852DevComPri, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "DevComPri", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DEVCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevComPri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1GX1629( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T01GX14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GX14_A407EmprNom[0] ;
      n407EmprNom = T01GX14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_4( String A396EmprCod ,
                         int A658PedCod )
   {
      /* Using cursor T01GX15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A795PrvNum = T01GX15_A795PrvNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_5( String A396EmprCod ,
                         short A840TrnCod )
   {
      /* Using cursor T01GX16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01GX16_A841TrnNom[0] ;
      n841TrnNom = T01GX16_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_6( String A396EmprCod ,
                         short A970ProceCod )
   {
      /* Using cursor T01GX17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A971ProceNom = T01GX17_A971ProceNom[0] ;
      n971ProceNom = T01GX17_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_7( String A396EmprCod ,
                         int A795PrvNum )
   {
      /* Using cursor T01GX18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T01GX18_A794PrvNom[0] ;
      n794PrvNom = T01GX18_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1GX1629( )
   {
      /* Using cursor T01GX19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1629 = (short)(1) ;
      }
      else
      {
         RcdFound1629 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm1GX1629( 2) ;
         RcdFound1629 = (short)(1) ;
         A4857DevComObs = T01GX7_A4857DevComObs[0] ;
         n4857DevComObs = T01GX7_n4857DevComObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4857DevComObs", A4857DevComObs);
         A4850DevComCod = T01GX7_A4850DevComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
         A4851DevComFec = T01GX7_A4851DevComFec[0] ;
         n4851DevComFec = T01GX7_n4851DevComFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4851DevComFec", localUtil.format(A4851DevComFec, "99/99/99"));
         A4852DevComPri = T01GX7_A4852DevComPri[0] ;
         n4852DevComPri = T01GX7_n4852DevComPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4852DevComPri", A4852DevComPri);
         A4853AlbarEnt = T01GX7_A4853AlbarEnt[0] ;
         n4853AlbarEnt = T01GX7_n4853AlbarEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4853AlbarEnt", A4853AlbarEnt);
         A4854DevComTPla = T01GX7_A4854DevComTPla[0] ;
         n4854DevComTPla = T01GX7_n4854DevComTPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4854DevComTPla", A4854DevComTPla);
         A4855DevComTLin = T01GX7_A4855DevComTLin[0] ;
         n4855DevComTLin = T01GX7_n4855DevComTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4855DevComTLin", A4855DevComTLin);
         A4856DevComLis = T01GX7_A4856DevComLis[0] ;
         n4856DevComLis = T01GX7_n4856DevComLis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4856DevComLis", GXutil.str( A4856DevComLis, 1, 0));
         A396EmprCod = T01GX7_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = T01GX7_A658PedCod[0] ;
         n658PedCod = T01GX7_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A840TrnCod = T01GX7_A840TrnCod[0] ;
         n840TrnCod = T01GX7_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01GX7_A970ProceCod[0] ;
         n970ProceCod = T01GX7_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4850DevComCod = A4850DevComCod ;
         sMode1629 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GX1629( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1629 = (short)(0) ;
            initializeNonKey1GX1629( ) ;
         }
         Gx_mode = sMode1629 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1629 = (short)(0) ;
         initializeNonKey1GX1629( ) ;
         sMode1629 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1629 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1GX1629( ) ;
      if ( RcdFound1629 == 0 )
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
      RcdFound1629 = (short)(0) ;
      /* Using cursor T01GX20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4850DevComCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01GX20_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GX20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GX20_A4850DevComCod[0] < A4850DevComCod ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01GX20_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GX20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GX20_A4850DevComCod[0] > A4850DevComCod ) ) )
         {
            A396EmprCod = T01GX20_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4850DevComCod = T01GX20_A4850DevComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
            RcdFound1629 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound1629 = (short)(0) ;
      /* Using cursor T01GX21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4850DevComCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01GX21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GX21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GX21_A4850DevComCod[0] > A4850DevComCod ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01GX21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GX21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GX21_A4850DevComCod[0] < A4850DevComCod ) ) )
         {
            A396EmprCod = T01GX21_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4850DevComCod = T01GX21_A4850DevComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
            RcdFound1629 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GX1629( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GX1629( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1629 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4850DevComCod != Z4850DevComCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4850DevComCod = Z4850DevComCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
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
               update1GX1629( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4850DevComCod != Z4850DevComCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GX1629( ) ;
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
                  insert1GX1629( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4850DevComCod != Z4850DevComCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4850DevComCod = Z4850DevComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
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
      getKey1GX1629( ) ;
      if ( RcdFound1629 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4850DevComCod != Z4850DevComCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4850DevComCod = Z4850DevComCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4850DevComCod != Z4850DevComCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevcom");
      GX_FocusControl = edtDevComFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GX0( ) ;
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
      if ( RcdFound1629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDevComFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GX1629( ) ;
      if ( RcdFound1629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevComFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GX1629( ) ;
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
      if ( RcdFound1629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevComFec_Internalname ;
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
      if ( RcdFound1629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevComFec_Internalname ;
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
      scanStart1GX1629( ) ;
      if ( RcdFound1629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1629 != 0 )
         {
            scanNext1GX1629( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevComFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GX1629( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GX1629( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GX6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z4851DevComFec), GXutil.resetTime(T01GX6_A4851DevComFec[0])) ) || ( GXutil.strcmp(Z4852DevComPri, T01GX6_A4852DevComPri[0]) != 0 ) || ( GXutil.strcmp(Z4853AlbarEnt, T01GX6_A4853AlbarEnt[0]) != 0 ) || ( GXutil.strcmp(Z4854DevComTPla, T01GX6_A4854DevComTPla[0]) != 0 ) || ( GXutil.strcmp(Z4855DevComTLin, T01GX6_A4855DevComTLin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4856DevComLis != T01GX6_A4856DevComLis[0] ) || ( Z658PedCod != T01GX6_A658PedCod[0] ) || ( Z840TrnCod != T01GX6_A840TrnCod[0] ) || ( Z970ProceCod != T01GX6_A970ProceCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4851DevComFec), GXutil.resetTime(T01GX6_A4851DevComFec[0])) ) )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"DevComFec");
               GXutil.writeLogRaw("Old: ",Z4851DevComFec);
               GXutil.writeLogRaw("Current: ",T01GX6_A4851DevComFec[0]);
            }
            if ( GXutil.strcmp(Z4852DevComPri, T01GX6_A4852DevComPri[0]) != 0 )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"DevComPri");
               GXutil.writeLogRaw("Old: ",Z4852DevComPri);
               GXutil.writeLogRaw("Current: ",T01GX6_A4852DevComPri[0]);
            }
            if ( GXutil.strcmp(Z4853AlbarEnt, T01GX6_A4853AlbarEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"AlbarEnt");
               GXutil.writeLogRaw("Old: ",Z4853AlbarEnt);
               GXutil.writeLogRaw("Current: ",T01GX6_A4853AlbarEnt[0]);
            }
            if ( GXutil.strcmp(Z4854DevComTPla, T01GX6_A4854DevComTPla[0]) != 0 )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"DevComTPla");
               GXutil.writeLogRaw("Old: ",Z4854DevComTPla);
               GXutil.writeLogRaw("Current: ",T01GX6_A4854DevComTPla[0]);
            }
            if ( GXutil.strcmp(Z4855DevComTLin, T01GX6_A4855DevComTLin[0]) != 0 )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"DevComTLin");
               GXutil.writeLogRaw("Old: ",Z4855DevComTLin);
               GXutil.writeLogRaw("Current: ",T01GX6_A4855DevComTLin[0]);
            }
            if ( Z4856DevComLis != T01GX6_A4856DevComLis[0] )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"DevComLis");
               GXutil.writeLogRaw("Old: ",Z4856DevComLis);
               GXutil.writeLogRaw("Current: ",T01GX6_A4856DevComLis[0]);
            }
            if ( Z658PedCod != T01GX6_A658PedCod[0] )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"PedCod");
               GXutil.writeLogRaw("Old: ",Z658PedCod);
               GXutil.writeLogRaw("Current: ",T01GX6_A658PedCod[0]);
            }
            if ( Z840TrnCod != T01GX6_A840TrnCod[0] )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01GX6_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T01GX6_A970ProceCod[0] )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T01GX6_A970ProceCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GX1629( )
   {
      beforeValidate1GX1629( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GX1629( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GX1629( 0) ;
         checkOptimisticConcurrency1GX1629( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GX1629( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GX1629( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GX22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A4850DevComCod), Boolean.valueOf(n4851DevComFec), A4851DevComFec, Boolean.valueOf(n4852DevComPri), A4852DevComPri, Boolean.valueOf(n4853AlbarEnt), A4853AlbarEnt, Boolean.valueOf(n4854DevComTPla), A4854DevComTPla, Boolean.valueOf(n4855DevComTLin), A4855DevComTLin, Boolean.valueOf(n4856DevComLis), Byte.valueOf(A4856DevComLis), Boolean.valueOf(n4857DevComObs), A4857DevComObs, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCCO");
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
                        processLevel1GX1629( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1GX0( ) ;
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
            load1GX1629( ) ;
         }
         endLevel1GX1629( ) ;
      }
      closeExtendedTableCursors1GX1629( ) ;
   }

   public void update1GX1629( )
   {
      beforeValidate1GX1629( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GX1629( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GX1629( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GX1629( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GX1629( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GX23 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n4851DevComFec), A4851DevComFec, Boolean.valueOf(n4852DevComPri), A4852DevComPri, Boolean.valueOf(n4853AlbarEnt), A4853AlbarEnt, Boolean.valueOf(n4854DevComTPla), A4854DevComTPla, Boolean.valueOf(n4855DevComTLin), A4855DevComTLin, Boolean.valueOf(n4856DevComLis), Byte.valueOf(A4856DevComLis), Boolean.valueOf(n4857DevComObs), A4857DevComObs, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A396EmprCod, Integer.valueOf(A4850DevComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCCO");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GX1629( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1GX1629( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1GX0( ) ;
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
         endLevel1GX1629( ) ;
      }
      closeExtendedTableCursors1GX1629( ) ;
   }

   public void deferredUpdate1GX1629( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GX1629( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GX1629( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GX1629( ) ;
         afterConfirm1GX1629( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GX1629( ) ;
            if ( AnyError == 0 )
            {
               scanStart1GX1630( ) ;
               while ( RcdFound1630 != 0 )
               {
                  getByPrimaryKey1GX1630( ) ;
                  delete1GX1630( ) ;
                  scanNext1GX1630( ) ;
               }
               scanEnd1GX1630( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GX24 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCCO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1629 == 0 )
                        {
                           initAll1GX1629( ) ;
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
                        resetCaption1GX0( ) ;
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
      sMode1629 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GX1629( ) ;
      Gx_mode = sMode1629 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GX1629( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01GX25 */
         pr_default.execute(23, new Object[] {A396EmprCod});
         A407EmprNom = T01GX25_A407EmprNom[0] ;
         n407EmprNom = T01GX25_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(23);
         /* Using cursor T01GX26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A795PrvNum = T01GX26_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         pr_default.close(24);
         /* Using cursor T01GX27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01GX27_A794PrvNom[0] ;
         n794PrvNom = T01GX27_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(25);
         /* Using cursor T01GX28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T01GX28_A971ProceNom[0] ;
         n971ProceNom = T01GX28_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         pr_default.close(26);
         /* Using cursor T01GX29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01GX29_A841TrnNom[0] ;
         n841TrnNom = T01GX29_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(27);
      }
   }

   public void processNestedLevel1GX1630( )
   {
      nGXsfl_105_idx = 0 ;
      while ( nGXsfl_105_idx < nRC_GXsfl_105 )
      {
         readRow1GX1630( ) ;
         if ( ( nRcdExists_1630 != 0 ) || ( nIsMod_1630 != 0 ) )
         {
            standaloneNotModal1GX1630( ) ;
            getKey1GX1630( ) ;
            if ( ( nRcdExists_1630 == 0 ) && ( nRcdDeleted_1630 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1GX1630( ) ;
            }
            else
            {
               if ( RcdFound1630 != 0 )
               {
                  if ( ( nRcdDeleted_1630 != 0 ) && ( nRcdExists_1630 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1GX1630( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1630 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1GX1630( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1630 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_105_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1630_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtDevComCan_Internalname, GXutil.ltrim( localUtil.ntoc( A4858DevComCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevComFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4859DevComFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdUniCom_Internalname, GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdUcpDsc_Internalname, GXutil.rtrim( A737PrdUcpDsc)) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_105_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z4858DevComCan_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z4858DevComCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4859DevComFac_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z4859DevComFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1630_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1630_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1630_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1630 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1630_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1630_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCOMCAN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevComCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCOMFAC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevComFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUNICOM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUCPDSC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUcpDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1GX1630( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1630 = (short)(0) ;
      nIsMod_1630 = (short)(0) ;
      nRcdDeleted_1630 = (short)(0) ;
   }

   public void processLevel1GX1629( )
   {
      /* Save parent mode. */
      sMode1629 = Gx_mode ;
      processNestedLevel1GX1630( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1629 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1GX1629( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GX1629( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdevcom");
         if ( AnyError == 0 )
         {
            confirmValues1GX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevcom");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GX1629( )
   {
      /* Using cursor T01GX30 */
      pr_default.execute(28);
      RcdFound1629 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1629 = (short)(1) ;
         A396EmprCod = T01GX30_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4850DevComCod = T01GX30_A4850DevComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GX1629( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1629 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1629 = (short)(1) ;
         A396EmprCod = T01GX30_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4850DevComCod = T01GX30_A4850DevComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
      }
   }

   public void scanEnd1GX1629( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1GX1629( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GX1629( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GX1629( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GX1629( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GX1629( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GX1629( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GX1629( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDevComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComCod_Enabled), 5, 0), true);
      edtDevComFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComFec_Enabled), 5, 0), true);
      edtDevComPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComPri_Enabled), 5, 0), true);
      edtAlbarEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbarEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbarEnt_Enabled), 5, 0), true);
      edtPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtDevComTPla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComTPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComTPla_Enabled), 5, 0), true);
      edtDevComTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComTLin_Enabled), 5, 0), true);
      edtDevComLis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComLis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComLis_Enabled), 5, 0), true);
      edtDevComObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComObs_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1GX1630( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4858DevComCan = T01GX3_A4858DevComCan[0] ;
            Z4859DevComFac = T01GX3_A4859DevComFac[0] ;
         }
         else
         {
            Z4858DevComCan = A4858DevComCan ;
            Z4859DevComFac = A4859DevComFac ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z4850DevComCod = A4850DevComCod ;
         Z4858DevComCan = A4858DevComCan ;
         Z4859DevComFac = A4859DevComFac ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z742PrdUniCom = A742PrdUniCom ;
         Z737PrdUcpDsc = A737PrdUcpDsc ;
      }
   }

   public void standaloneNotModal1GX1630( )
   {
   }

   public void standaloneModal1GX1630( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      }
   }

   public void load1GX1630( )
   {
      /* Using cursor T01GX31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod), A719PrdNum});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1630 = (short)(1) ;
         A4858DevComCan = T01GX31_A4858DevComCan[0] ;
         n4858DevComCan = T01GX31_n4858DevComCan[0] ;
         A4859DevComFac = T01GX31_A4859DevComFac[0] ;
         n4859DevComFac = T01GX31_n4859DevComFac[0] ;
         A718PrdNom = T01GX31_A718PrdNom[0] ;
         A737PrdUcpDsc = T01GX31_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = T01GX31_n737PrdUcpDsc[0] ;
         A704PrdExiAlm = T01GX31_A704PrdExiAlm[0] ;
         A724PrdPreAct = T01GX31_A724PrdPreAct[0] ;
         A742PrdUniCom = T01GX31_A742PrdUniCom[0] ;
         zm1GX1630( -8) ;
      }
      pr_default.close(29);
      onLoadActions1GX1630( ) ;
   }

   public void onLoadActions1GX1630( )
   {
   }

   public void checkExtendedTable1GX1630( )
   {
      nIsDirty_1630 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1GX1630( ) ;
      /* Using cursor T01GX4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01GX4_A718PrdNom[0] ;
      A704PrdExiAlm = T01GX4_A704PrdExiAlm[0] ;
      A724PrdPreAct = T01GX4_A724PrdPreAct[0] ;
      A742PrdUniCom = T01GX4_A742PrdUniCom[0] ;
      pr_default.close(2);
      /* Using cursor T01GX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDUNICOM_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A737PrdUcpDsc = T01GX5_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T01GX5_n737PrdUcpDsc[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1GX1630( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1GX1630( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01GX32 */
      pr_default.execute(30, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01GX32_A718PrdNom[0] ;
      A704PrdExiAlm = T01GX32_A704PrdExiAlm[0] ;
      A724PrdPreAct = T01GX32_A724PrdPreAct[0] ;
      A742PrdUniCom = T01GX32_A742PrdUniCom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void gxload_10( String A396EmprCod ,
                          byte A742PrdUniCom )
   {
      /* Using cursor T01GX33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         GXCCtl = "PRDUNICOM_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A737PrdUcpDsc = T01GX33_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T01GX33_n737PrdUcpDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A737PrdUcpDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void getKey1GX1630( )
   {
      /* Using cursor T01GX34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod), A719PrdNum});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1630 = (short)(1) ;
      }
      else
      {
         RcdFound1630 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey1GX1630( )
   {
      /* Using cursor T01GX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GX1630( 8) ;
         RcdFound1630 = (short)(1) ;
         initializeNonKey1GX1630( ) ;
         A4858DevComCan = T01GX3_A4858DevComCan[0] ;
         n4858DevComCan = T01GX3_n4858DevComCan[0] ;
         A4859DevComFac = T01GX3_A4859DevComFac[0] ;
         n4859DevComFac = T01GX3_n4859DevComFac[0] ;
         A719PrdNum = T01GX3_A719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4850DevComCod = A4850DevComCod ;
         Z719PrdNum = A719PrdNum ;
         sMode1630 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GX1630( ) ;
         load1GX1630( ) ;
         Gx_mode = sMode1630 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1630 = (short)(0) ;
         initializeNonKey1GX1630( ) ;
         sMode1630 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GX1630( ) ;
         Gx_mode = sMode1630 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1GX1630( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1GX1630( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVLCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4858DevComCan, T01GX2_A4858DevComCan[0]) != 0 ) || ( Z4859DevComFac != T01GX2_A4859DevComFac[0] ) )
         {
            if ( DecimalUtil.compareTo(Z4858DevComCan, T01GX2_A4858DevComCan[0]) != 0 )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"DevComCan");
               GXutil.writeLogRaw("Old: ",Z4858DevComCan);
               GXutil.writeLogRaw("Current: ",T01GX2_A4858DevComCan[0]);
            }
            if ( Z4859DevComFac != T01GX2_A4859DevComFac[0] )
            {
               GXutil.writeLogln("tdevcom:[seudo value changed for attri]"+"DevComFac");
               GXutil.writeLogRaw("Old: ",Z4859DevComFac);
               GXutil.writeLogRaw("Current: ",T01GX2_A4859DevComFac[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVLCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GX1630( )
   {
      beforeValidate1GX1630( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GX1630( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GX1630( 0) ;
         checkOptimisticConcurrency1GX1630( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GX1630( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GX1630( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GX35 */
                  pr_default.execute(33, new Object[] {Integer.valueOf(A4850DevComCod), Boolean.valueOf(n4858DevComCan), A4858DevComCan, Boolean.valueOf(n4859DevComFac), Integer.valueOf(A4859DevComFac), A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVLCO");
                  if ( (pr_default.getStatus(33) == 1) )
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
            load1GX1630( ) ;
         }
         endLevel1GX1630( ) ;
      }
      closeExtendedTableCursors1GX1630( ) ;
   }

   public void update1GX1630( )
   {
      beforeValidate1GX1630( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GX1630( ) ;
      }
      if ( ( nIsMod_1630 != 0 ) || ( nIsDirty_1630 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1GX1630( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1GX1630( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1GX1630( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01GX36 */
                     pr_default.execute(34, new Object[] {Boolean.valueOf(n4858DevComCan), A4858DevComCan, Boolean.valueOf(n4859DevComFac), Integer.valueOf(A4859DevComFac), A396EmprCod, Integer.valueOf(A4850DevComCod), A719PrdNum});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVLCO");
                     if ( (pr_default.getStatus(34) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVLCO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1GX1630( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1GX1630( ) ;
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
            endLevel1GX1630( ) ;
         }
      }
      closeExtendedTableCursors1GX1630( ) ;
   }

   public void deferredUpdate1GX1630( )
   {
   }

   public void delete1GX1630( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GX1630( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GX1630( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GX1630( ) ;
         afterConfirm1GX1630( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GX1630( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GX37 */
               pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVLCO");
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
      sMode1630 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GX1630( ) ;
      Gx_mode = sMode1630 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GX1630( )
   {
      standaloneModal1GX1630( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01GX38 */
         pr_default.execute(36, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01GX38_A718PrdNom[0] ;
         A704PrdExiAlm = T01GX38_A704PrdExiAlm[0] ;
         A724PrdPreAct = T01GX38_A724PrdPreAct[0] ;
         A742PrdUniCom = T01GX38_A742PrdUniCom[0] ;
         pr_default.close(36);
         /* Using cursor T01GX39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
         A737PrdUcpDsc = T01GX39_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = T01GX39_n737PrdUcpDsc[0] ;
         pr_default.close(37);
      }
   }

   public void endLevel1GX1630( )
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

   public void scanStart1GX1630( )
   {
      /* Scan By routine */
      /* Using cursor T01GX40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A4850DevComCod)});
      RcdFound1630 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1630 = (short)(1) ;
         A719PrdNum = T01GX40_A719PrdNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GX1630( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound1630 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1630 = (short)(1) ;
         A719PrdNum = T01GX40_A719PrdNum[0] ;
      }
   }

   public void scanEnd1GX1630( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1GX1630( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GX1630( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GX1630( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GX1630( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GX1630( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GX1630( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GX1630( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtDevComCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComCan_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtDevComFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevComFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevComFac_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtPrdUniCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCom_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtPrdUcpDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUcpDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcpDsc_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_105_Refreshing);
   }

   public void send_integrity_lvl_hashes1GX1630( )
   {
   }

   public void send_integrity_lvl_hashes1GX1629( )
   {
   }

   public void subsflControlProps_1051630( )
   {
      edtavnRcdDeleted_1630_Internalname = "vNRCDDELETED_1630_"+sGXsfl_105_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_105_idx ;
      edtDevComCan_Internalname = "DEVCOMCAN_"+sGXsfl_105_idx ;
      edtDevComFac_Internalname = "DEVCOMFAC_"+sGXsfl_105_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_105_idx ;
      edtPrdUniCom_Internalname = "PRDUNICOM_"+sGXsfl_105_idx ;
      edtPrdUcpDsc_Internalname = "PRDUCPDSC_"+sGXsfl_105_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_105_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_105_idx ;
   }

   public void subsflControlProps_fel_1051630( )
   {
      edtavnRcdDeleted_1630_Internalname = "vNRCDDELETED_1630_"+sGXsfl_105_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_105_fel_idx ;
      edtDevComCan_Internalname = "DEVCOMCAN_"+sGXsfl_105_fel_idx ;
      edtDevComFac_Internalname = "DEVCOMFAC_"+sGXsfl_105_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_105_fel_idx ;
      edtPrdUniCom_Internalname = "PRDUNICOM_"+sGXsfl_105_fel_idx ;
      edtPrdUcpDsc_Internalname = "PRDUCPDSC_"+sGXsfl_105_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_105_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_105_fel_idx ;
   }

   public void addRow1GX1630( )
   {
      nGXsfl_105_idx = (int)(nGXsfl_105_idx+1) ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1051630( ) ;
      sendRow1GX1630( ) ;
   }

   public void sendRow1GX1630( )
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
         if ( ((int)((nGXsfl_105_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1630_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1630_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1630_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1630), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1630), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1630_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1630_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1630_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1630_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevComCan_Internalname,GXutil.ltrim( localUtil.ntoc( A4858DevComCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevComCan_Enabled!=0) ? localUtil.format( A4858DevComCan, "ZZZZZ9.99") : localUtil.format( A4858DevComCan, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevComCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevComCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1630_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevComFac_Internalname,GXutil.ltrim( localUtil.ntoc( A4859DevComFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevComFac_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4859DevComFac), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4859DevComFac), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevComFac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevComFac_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUniCom_Internalname,GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdUniCom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9") : localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdUniCom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdUniCom_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUcpDsc_Internalname,GXutil.rtrim( A737PrdUcpDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdUcpDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdUcpDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdExiAlm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdPreAct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1GX1630( ) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z4858DevComCan_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4858DevComCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4859DevComFac_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4859DevComFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1630_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1630_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1630_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1630, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1630_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1630_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCOMCAN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevComCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCOMFAC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevComFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUNICOM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUCPDSC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUcpDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1GX1630( )
   {
      nGXsfl_105_idx = (int)(nGXsfl_105_idx+1) ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1051630( ) ;
      edtavnRcdDeleted_1630_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1630_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevComCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCOMCAN_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevComFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCOMFAC_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdUniCom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUNICOM_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdUcpDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUCPDSC_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1630_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1630_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1630");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1630_Internalname ;
         wbErr = true ;
         nRcdDeleted_1630 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1630 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1630_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevComCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevComCan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DEVCOMCAN_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevComCan_Internalname ;
         wbErr = true ;
         A4858DevComCan = DecimalUtil.ZERO ;
         n4858DevComCan = false ;
      }
      else
      {
         A4858DevComCan = localUtil.ctond( httpContext.cgiGet( edtDevComCan_Internalname)) ;
         n4858DevComCan = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevComFac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevComFac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "DEVCOMFAC_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevComFac_Internalname ;
         wbErr = true ;
         A4859DevComFac = 0 ;
         n4859DevComFac = false ;
      }
      else
      {
         A4859DevComFac = (int)(localUtil.ctol( httpContext.cgiGet( edtDevComFac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4859DevComFac = false ;
      }
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A737PrdUcpDsc = httpContext.cgiGet( edtPrdUcpDsc_Internalname) ;
      n737PrdUcpDsc = false ;
      A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
      A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_105_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4858DevComCan_" + sGXsfl_105_idx ;
      Z4858DevComCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4859DevComFac_" + sGXsfl_105_idx ;
      Z4859DevComFac = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1630_" + sGXsfl_105_idx ;
      nRcdDeleted_1630 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1630_" + sGXsfl_105_idx ;
      nRcdExists_1630 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1630_" + sGXsfl_105_idx ;
      nIsMod_1630 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdNum_Enabled = edtPrdNum_Enabled ;
   }

   public void confirmValues1GX0( )
   {
      nGXsfl_105_idx = 0 ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1051630( ) ;
      while ( nGXsfl_105_idx < nRC_GXsfl_105 )
      {
         nGXsfl_105_idx = (int)(nGXsfl_105_idx+1) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1051630( ) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z4858DevComCan_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z4858DevComCan_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4858DevComCan_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z4859DevComFac_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z4859DevComFac_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4859DevComFac_"+sGXsfl_105_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdevcom", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4850DevComCod", GXutil.ltrim( localUtil.ntoc( Z4850DevComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4851DevComFec", localUtil.dtoc( Z4851DevComFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4852DevComPri", GXutil.rtrim( Z4852DevComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4853AlbarEnt", GXutil.rtrim( Z4853AlbarEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4854DevComTPla", GXutil.rtrim( Z4854DevComTPla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4855DevComTLin", GXutil.rtrim( Z4855DevComTLin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4856DevComLis", GXutil.ltrim( localUtil.ntoc( Z4856DevComLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_105", GXutil.ltrim( localUtil.ntoc( nGXsfl_105_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdevcom", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDEVCOM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DEVOLUCION DE COMPRAS", "") ;
   }

   public void initializeNonKey1GX1629( )
   {
      A4851DevComFec = GXutil.nullDate() ;
      n4851DevComFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4851DevComFec", localUtil.format(A4851DevComFec, "99/99/99"));
      A4852DevComPri = "" ;
      n4852DevComPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4852DevComPri", A4852DevComPri);
      A4853AlbarEnt = "" ;
      n4853AlbarEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4853AlbarEnt", A4853AlbarEnt);
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A4854DevComTPla = "" ;
      n4854DevComTPla = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4854DevComTPla", A4854DevComTPla);
      A4855DevComTLin = "" ;
      n4855DevComTLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4855DevComTLin", A4855DevComTLin);
      A4856DevComLis = (byte)(0) ;
      n4856DevComLis = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4856DevComLis", GXutil.str( A4856DevComLis, 1, 0));
      A4857DevComObs = "" ;
      n4857DevComObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4857DevComObs", A4857DevComObs);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      Z4851DevComFec = GXutil.nullDate() ;
      Z4852DevComPri = "" ;
      Z4853AlbarEnt = "" ;
      Z4854DevComTPla = "" ;
      Z4855DevComTLin = "" ;
      Z4856DevComLis = (byte)(0) ;
      Z658PedCod = 0 ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
   }

   public void initAll1GX1629( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4850DevComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4850DevComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4850DevComCod), 8, 0));
      initializeNonKey1GX1629( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1GX1630( )
   {
      A4858DevComCan = DecimalUtil.ZERO ;
      n4858DevComCan = false ;
      A4859DevComFac = 0 ;
      n4859DevComFac = false ;
      A718PrdNom = "" ;
      A742PrdUniCom = (byte)(0) ;
      A737PrdUcpDsc = "" ;
      n737PrdUcpDsc = false ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      Z4858DevComCan = DecimalUtil.ZERO ;
      Z4859DevComFac = 0 ;
   }

   public void initAll1GX1630( )
   {
      A719PrdNum = "" ;
      initializeNonKey1GX1630( ) ;
   }

   public void standaloneModalInsert1GX1630( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241575694", true, true);
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
      httpContext.AddJavascriptSource("tdevcom.js", "?20268241575694", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1630( )
   {
      edtPrdNum_Enabled = defedtPrdNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_105_Refreshing);
   }

   public void startgridcontrol105( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1630, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1630_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4858DevComCan, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevComCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4859DevComFac, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevComFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A737PrdUcpDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUcpDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDevComCod_Internalname = "DEVCOMCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDevComFec_Internalname = "DEVCOMFEC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDevComPri_Internalname = "DEVCOMPRI" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAlbarEnt_Internalname = "ALBARENT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPedCod_Internalname = "PEDCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtProceCod_Internalname = "PROCECOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtProceNom_Internalname = "PROCENOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDevComTPla_Internalname = "DEVCOMTPLA" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDevComTLin_Internalname = "DEVCOMTLIN" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDevComLis_Internalname = "DEVCOMLIS" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDevComObs_Internalname = "DEVCOMOBS" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1630_Internalname = "vNRCDDELETED_1630" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtDevComCan_Internalname = "DEVCOMCAN" ;
      edtDevComFac_Internalname = "DEVCOMFAC" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdUniCom_Internalname = "PRDUNICOM" ;
      edtPrdUcpDsc_Internalname = "PRDUCPDSC" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
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
      Form.setCaption( httpContext.getMessage( "DEVOLUCION DE COMPRAS", "") );
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdUcpDsc_Jsonclick = "" ;
      edtPrdUniCom_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtDevComFac_Jsonclick = "" ;
      edtDevComCan_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtavnRcdDeleted_1630_Jsonclick = "" ;
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
      edtPrdPreAct_Enabled = 0 ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdUcpDsc_Enabled = 0 ;
      edtPrdUniCom_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtDevComFac_Enabled = 1 ;
      edtDevComCan_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtavnRcdDeleted_1630_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtDevComObs_Backcolor = (int)(0xFFFFFF) ;
      edtDevComObs_Enabled = 1 ;
      edtDevComLis_Jsonclick = "" ;
      edtDevComLis_Backcolor = (int)(0xFFFFFF) ;
      edtDevComLis_Enabled = 1 ;
      edtDevComTLin_Jsonclick = "" ;
      edtDevComTLin_Backcolor = (int)(0xFFFFFF) ;
      edtDevComTLin_Enabled = 1 ;
      edtDevComTPla_Jsonclick = "" ;
      edtDevComTPla_Backcolor = (int)(0xFFFFFF) ;
      edtDevComTPla_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Backcolor = (int)(0xFFFFFF) ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
      edtProceNom_Jsonclick = "" ;
      edtProceNom_Backcolor = (int)(0xFFFFFF) ;
      edtProceNom_Enabled = 0 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Backcolor = (int)(0xFFFFFF) ;
      edtProceCod_Enabled = 1 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNum_Enabled = 0 ;
      edtPedCod_Jsonclick = "" ;
      edtPedCod_Backcolor = (int)(0xFFFFFF) ;
      edtPedCod_Enabled = 1 ;
      edtAlbarEnt_Jsonclick = "" ;
      edtAlbarEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbarEnt_Enabled = 1 ;
      edtDevComPri_Jsonclick = "" ;
      edtDevComPri_Backcolor = (int)(0xFFFFFF) ;
      edtDevComPri_Enabled = 1 ;
      edtDevComFec_Jsonclick = "" ;
      edtDevComFec_Backcolor = (int)(0xFFFFFF) ;
      edtDevComFec_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDevComCod_Jsonclick = "" ;
      edtDevComCod_Backcolor = (int)(0xFFFFFF) ;
      edtDevComCod_Enabled = 1 ;
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
      subsflControlProps_1051630( ) ;
      while ( nGXsfl_105_idx <= nRC_GXsfl_105 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1GX1630( ) ;
         standaloneModal1GX1630( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1GX1630( ) ;
         nGXsfl_105_idx = (int)(nGXsfl_105_idx+1) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1051630( ) ;
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
      /* Using cursor T01GX25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GX25_A407EmprNom[0] ;
      n407EmprNom = T01GX25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      GX_FocusControl = edtDevComFec_Internalname ;
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
      /* Using cursor T01GX25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01GX25_A407EmprNom[0] ;
      n407EmprNom = T01GX25_n407EmprNom[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Devcomcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4851DevComFec", localUtil.format(A4851DevComFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4852DevComPri", GXutil.rtrim( A4852DevComPri));
      httpContext.ajax_rsp_assign_attri("", false, "A4853AlbarEnt", GXutil.rtrim( A4853AlbarEnt));
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4854DevComTPla", GXutil.rtrim( A4854DevComTPla));
      httpContext.ajax_rsp_assign_attri("", false, "A4855DevComTLin", GXutil.rtrim( A4855DevComTLin));
      httpContext.ajax_rsp_assign_attri("", false, "A4856DevComLis", GXutil.ltrim( localUtil.ntoc( A4856DevComLis, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4857DevComObs", A4857DevComObs);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4850DevComCod", GXutil.ltrim( localUtil.ntoc( Z4850DevComCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4851DevComFec", localUtil.format(Z4851DevComFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4852DevComPri", GXutil.rtrim( Z4852DevComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4853AlbarEnt", GXutil.rtrim( Z4853AlbarEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4854DevComTPla", GXutil.rtrim( Z4854DevComTPla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4855DevComTLin", GXutil.rtrim( Z4855DevComTLin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4856DevComLis", GXutil.ltrim( localUtil.ntoc( Z4856DevComLis, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4857DevComObs", Z4857DevComObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z971ProceNom", GXutil.rtrim( Z971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      n794PrvNom = false ;
      /* Using cursor T01GX26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A795PrvNum = T01GX26_A795PrvNum[0] ;
      pr_default.close(24);
      /* Using cursor T01GX27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A794PrvNom = T01GX27_A794PrvNom[0] ;
      n794PrvNom = T01GX27_n794PrvNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
   }

   public void valid_Procecod( )
   {
      n970ProceCod = false ;
      n971ProceNom = false ;
      /* Using cursor T01GX28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A971ProceNom = T01GX28_A971ProceNom[0] ;
      n971ProceNom = T01GX28_n971ProceNom[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01GX29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A841TrnNom = T01GX29_A841TrnNom[0] ;
      n841TrnNom = T01GX29_n841TrnNom[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Prdnum( )
   {
      n737PrdUcpDsc = false ;
      /* Using cursor T01GX38 */
      pr_default.execute(36, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01GX38_A718PrdNom[0] ;
      A704PrdExiAlm = T01GX38_A704PrdExiAlm[0] ;
      A724PrdPreAct = T01GX38_A724PrdPreAct[0] ;
      A742PrdUniCom = T01GX38_A742PrdUniCom[0] ;
      pr_default.close(36);
      /* Using cursor T01GX39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A737PrdUcpDsc = T01GX39_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T01GX39_n737PrdUcpDsc[0] ;
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", GXutil.rtrim( A737PrdUcpDsc));
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
      setEventMetadata("VALID_DEVCOMCOD","{handler:'valid_Devcomcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4850DevComCod',fld:'DEVCOMCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DEVCOMCOD",",oparms:[{av:'A4851DevComFec',fld:'DEVCOMFEC',pic:''},{av:'A4852DevComPri',fld:'DEVCOMPRI',pic:'9'},{av:'A4853AlbarEnt',fld:'ALBARENT',pic:''},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A4854DevComTPla',fld:'DEVCOMTPLA',pic:''},{av:'A4855DevComTLin',fld:'DEVCOMTLIN',pic:''},{av:'A4856DevComLis',fld:'DEVCOMLIS',pic:'0,1'},{av:'A4857DevComObs',fld:'DEVCOMOBS',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4850DevComCod'},{av:'Z4851DevComFec'},{av:'Z4852DevComPri'},{av:'Z4853AlbarEnt'},{av:'Z658PedCod'},{av:'Z970ProceCod'},{av:'Z840TrnCod'},{av:'Z4854DevComTPla'},{av:'Z4855DevComTLin'},{av:'Z4856DevComLis'},{av:'Z4857DevComObs'},{av:'Z407EmprNom'},{av:'Z795PrvNum'},{av:'Z841TrnNom'},{av:'Z971ProceNom'},{av:'Z794PrvNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DEVCOMPRI","{handler:'valid_Devcompri',iparms:[]");
      setEventMetadata("VALID_DEVCOMPRI",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''}]");
      setEventMetadata("VALID_PROCECOD",",oparms:[{av:'A971ProceNom',fld:'PROCENOM',pic:''}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A737PrdUcpDsc',fld:'PRDUCPDSC',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A737PrdUcpDsc',fld:'PRDUCPDSC',pic:''}]}");
      setEventMetadata("VALID_PRDUNICOM","{handler:'valid_Prdunicom',iparms:[]");
      setEventMetadata("VALID_PRDUNICOM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prdpreact',iparms:[]");
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
      pr_default.close(36);
      pr_default.close(37);
      pr_default.close(23);
      pr_default.close(24);
      pr_default.close(27);
      pr_default.close(26);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4851DevComFec = GXutil.nullDate() ;
      Z4852DevComPri = "" ;
      Z4853AlbarEnt = "" ;
      Z4854DevComTPla = "" ;
      Z4855DevComTLin = "" ;
      Z719PrdNum = "" ;
      Z4858DevComCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A4851DevComFec = GXutil.nullDate() ;
      lblTextblock4_Jsonclick = "" ;
      A4852DevComPri = "" ;
      lblTextblock5_Jsonclick = "" ;
      A4853AlbarEnt = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A794PrvNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A971ProceNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A841TrnNom = "" ;
      lblTextblock13_Jsonclick = "" ;
      A4854DevComTPla = "" ;
      lblTextblock14_Jsonclick = "" ;
      A4855DevComTLin = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A4857DevComObs = "" ;
      lblTextblock17_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1630 = "" ;
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
      sMode1629 = "" ;
      GXCCtl = "" ;
      A4858DevComCan = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A737PrdUcpDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      Z4857DevComObs = "" ;
      Z407EmprNom = "" ;
      Z794PrvNom = "" ;
      Z971ProceNom = "" ;
      Z841TrnNom = "" ;
      T01GX13_A4857DevComObs = new String[] {""} ;
      T01GX13_n4857DevComObs = new boolean[] {false} ;
      T01GX13_A4850DevComCod = new int[1] ;
      T01GX13_A4851DevComFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01GX13_n4851DevComFec = new boolean[] {false} ;
      T01GX13_A4852DevComPri = new String[] {""} ;
      T01GX13_n4852DevComPri = new boolean[] {false} ;
      T01GX13_A4853AlbarEnt = new String[] {""} ;
      T01GX13_n4853AlbarEnt = new boolean[] {false} ;
      T01GX13_A794PrvNom = new String[] {""} ;
      T01GX13_n794PrvNom = new boolean[] {false} ;
      T01GX13_A971ProceNom = new String[] {""} ;
      T01GX13_n971ProceNom = new boolean[] {false} ;
      T01GX13_A841TrnNom = new String[] {""} ;
      T01GX13_n841TrnNom = new boolean[] {false} ;
      T01GX13_A4854DevComTPla = new String[] {""} ;
      T01GX13_n4854DevComTPla = new boolean[] {false} ;
      T01GX13_A4855DevComTLin = new String[] {""} ;
      T01GX13_n4855DevComTLin = new boolean[] {false} ;
      T01GX13_A4856DevComLis = new byte[1] ;
      T01GX13_n4856DevComLis = new boolean[] {false} ;
      T01GX13_A407EmprNom = new String[] {""} ;
      T01GX13_n407EmprNom = new boolean[] {false} ;
      T01GX13_A396EmprCod = new String[] {""} ;
      T01GX13_A658PedCod = new int[1] ;
      T01GX13_n658PedCod = new boolean[] {false} ;
      T01GX13_A840TrnCod = new short[1] ;
      T01GX13_n840TrnCod = new boolean[] {false} ;
      T01GX13_A970ProceCod = new short[1] ;
      T01GX13_n970ProceCod = new boolean[] {false} ;
      T01GX13_A795PrvNum = new int[1] ;
      T01GX8_A407EmprNom = new String[] {""} ;
      T01GX8_n407EmprNom = new boolean[] {false} ;
      T01GX9_A795PrvNum = new int[1] ;
      T01GX10_A841TrnNom = new String[] {""} ;
      T01GX10_n841TrnNom = new boolean[] {false} ;
      T01GX11_A971ProceNom = new String[] {""} ;
      T01GX11_n971ProceNom = new boolean[] {false} ;
      T01GX12_A794PrvNom = new String[] {""} ;
      T01GX12_n794PrvNom = new boolean[] {false} ;
      T01GX14_A407EmprNom = new String[] {""} ;
      T01GX14_n407EmprNom = new boolean[] {false} ;
      T01GX15_A795PrvNum = new int[1] ;
      T01GX16_A841TrnNom = new String[] {""} ;
      T01GX16_n841TrnNom = new boolean[] {false} ;
      T01GX17_A971ProceNom = new String[] {""} ;
      T01GX17_n971ProceNom = new boolean[] {false} ;
      T01GX18_A794PrvNom = new String[] {""} ;
      T01GX18_n794PrvNom = new boolean[] {false} ;
      T01GX19_A396EmprCod = new String[] {""} ;
      T01GX19_A4850DevComCod = new int[1] ;
      T01GX7_A4857DevComObs = new String[] {""} ;
      T01GX7_n4857DevComObs = new boolean[] {false} ;
      T01GX7_A4850DevComCod = new int[1] ;
      T01GX7_A4851DevComFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01GX7_n4851DevComFec = new boolean[] {false} ;
      T01GX7_A4852DevComPri = new String[] {""} ;
      T01GX7_n4852DevComPri = new boolean[] {false} ;
      T01GX7_A4853AlbarEnt = new String[] {""} ;
      T01GX7_n4853AlbarEnt = new boolean[] {false} ;
      T01GX7_A4854DevComTPla = new String[] {""} ;
      T01GX7_n4854DevComTPla = new boolean[] {false} ;
      T01GX7_A4855DevComTLin = new String[] {""} ;
      T01GX7_n4855DevComTLin = new boolean[] {false} ;
      T01GX7_A4856DevComLis = new byte[1] ;
      T01GX7_n4856DevComLis = new boolean[] {false} ;
      T01GX7_A396EmprCod = new String[] {""} ;
      T01GX7_A658PedCod = new int[1] ;
      T01GX7_n658PedCod = new boolean[] {false} ;
      T01GX7_A840TrnCod = new short[1] ;
      T01GX7_n840TrnCod = new boolean[] {false} ;
      T01GX7_A970ProceCod = new short[1] ;
      T01GX7_n970ProceCod = new boolean[] {false} ;
      T01GX20_A396EmprCod = new String[] {""} ;
      T01GX20_A4850DevComCod = new int[1] ;
      T01GX21_A396EmprCod = new String[] {""} ;
      T01GX21_A4850DevComCod = new int[1] ;
      T01GX6_A4857DevComObs = new String[] {""} ;
      T01GX6_n4857DevComObs = new boolean[] {false} ;
      T01GX6_A4850DevComCod = new int[1] ;
      T01GX6_A4851DevComFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01GX6_n4851DevComFec = new boolean[] {false} ;
      T01GX6_A4852DevComPri = new String[] {""} ;
      T01GX6_n4852DevComPri = new boolean[] {false} ;
      T01GX6_A4853AlbarEnt = new String[] {""} ;
      T01GX6_n4853AlbarEnt = new boolean[] {false} ;
      T01GX6_A4854DevComTPla = new String[] {""} ;
      T01GX6_n4854DevComTPla = new boolean[] {false} ;
      T01GX6_A4855DevComTLin = new String[] {""} ;
      T01GX6_n4855DevComTLin = new boolean[] {false} ;
      T01GX6_A4856DevComLis = new byte[1] ;
      T01GX6_n4856DevComLis = new boolean[] {false} ;
      T01GX6_A396EmprCod = new String[] {""} ;
      T01GX6_A658PedCod = new int[1] ;
      T01GX6_n658PedCod = new boolean[] {false} ;
      T01GX6_A840TrnCod = new short[1] ;
      T01GX6_n840TrnCod = new boolean[] {false} ;
      T01GX6_A970ProceCod = new short[1] ;
      T01GX6_n970ProceCod = new boolean[] {false} ;
      T01GX25_A407EmprNom = new String[] {""} ;
      T01GX25_n407EmprNom = new boolean[] {false} ;
      T01GX26_A795PrvNum = new int[1] ;
      T01GX27_A794PrvNom = new String[] {""} ;
      T01GX27_n794PrvNom = new boolean[] {false} ;
      T01GX28_A971ProceNom = new String[] {""} ;
      T01GX28_n971ProceNom = new boolean[] {false} ;
      T01GX29_A841TrnNom = new String[] {""} ;
      T01GX29_n841TrnNom = new boolean[] {false} ;
      T01GX30_A396EmprCod = new String[] {""} ;
      T01GX30_A4850DevComCod = new int[1] ;
      Z718PrdNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z737PrdUcpDsc = "" ;
      T01GX31_A4850DevComCod = new int[1] ;
      T01GX31_A4858DevComCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX31_n4858DevComCan = new boolean[] {false} ;
      T01GX31_A4859DevComFac = new int[1] ;
      T01GX31_n4859DevComFac = new boolean[] {false} ;
      T01GX31_A718PrdNom = new String[] {""} ;
      T01GX31_A737PrdUcpDsc = new String[] {""} ;
      T01GX31_n737PrdUcpDsc = new boolean[] {false} ;
      T01GX31_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX31_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX31_A396EmprCod = new String[] {""} ;
      T01GX31_A719PrdNum = new String[] {""} ;
      T01GX31_A742PrdUniCom = new byte[1] ;
      T01GX4_A718PrdNom = new String[] {""} ;
      T01GX4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX4_A742PrdUniCom = new byte[1] ;
      T01GX5_A737PrdUcpDsc = new String[] {""} ;
      T01GX5_n737PrdUcpDsc = new boolean[] {false} ;
      T01GX32_A718PrdNom = new String[] {""} ;
      T01GX32_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX32_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX32_A742PrdUniCom = new byte[1] ;
      T01GX33_A737PrdUcpDsc = new String[] {""} ;
      T01GX33_n737PrdUcpDsc = new boolean[] {false} ;
      T01GX34_A396EmprCod = new String[] {""} ;
      T01GX34_A4850DevComCod = new int[1] ;
      T01GX34_A719PrdNum = new String[] {""} ;
      T01GX3_A4850DevComCod = new int[1] ;
      T01GX3_A4858DevComCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX3_n4858DevComCan = new boolean[] {false} ;
      T01GX3_A4859DevComFac = new int[1] ;
      T01GX3_n4859DevComFac = new boolean[] {false} ;
      T01GX3_A396EmprCod = new String[] {""} ;
      T01GX3_A719PrdNum = new String[] {""} ;
      T01GX2_A4850DevComCod = new int[1] ;
      T01GX2_A4858DevComCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX2_n4858DevComCan = new boolean[] {false} ;
      T01GX2_A4859DevComFac = new int[1] ;
      T01GX2_n4859DevComFac = new boolean[] {false} ;
      T01GX2_A396EmprCod = new String[] {""} ;
      T01GX2_A719PrdNum = new String[] {""} ;
      T01GX38_A718PrdNom = new String[] {""} ;
      T01GX38_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX38_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GX38_A742PrdUniCom = new byte[1] ;
      T01GX39_A737PrdUcpDsc = new String[] {""} ;
      T01GX39_n737PrdUcpDsc = new boolean[] {false} ;
      T01GX40_A396EmprCod = new String[] {""} ;
      T01GX40_A4850DevComCod = new int[1] ;
      T01GX40_A719PrdNum = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ4851DevComFec = GXutil.nullDate() ;
      ZZ4852DevComPri = "" ;
      ZZ4853AlbarEnt = "" ;
      ZZ4854DevComTPla = "" ;
      ZZ4855DevComTLin = "" ;
      ZZ4857DevComObs = "" ;
      ZZ407EmprNom = "" ;
      ZZ841TrnNom = "" ;
      ZZ971ProceNom = "" ;
      ZZ794PrvNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevcom__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevcom__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevcom__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevcom__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevcom__default(),
         new Object[] {
             new Object[] {
            T01GX2_A4850DevComCod, T01GX2_A4858DevComCan, T01GX2_n4858DevComCan, T01GX2_A4859DevComFac, T01GX2_n4859DevComFac, T01GX2_A396EmprCod, T01GX2_A719PrdNum
            }
            , new Object[] {
            T01GX3_A4850DevComCod, T01GX3_A4858DevComCan, T01GX3_n4858DevComCan, T01GX3_A4859DevComFac, T01GX3_n4859DevComFac, T01GX3_A396EmprCod, T01GX3_A719PrdNum
            }
            , new Object[] {
            T01GX4_A718PrdNom, T01GX4_A704PrdExiAlm, T01GX4_A724PrdPreAct, T01GX4_A742PrdUniCom
            }
            , new Object[] {
            T01GX5_A737PrdUcpDsc, T01GX5_n737PrdUcpDsc
            }
            , new Object[] {
            T01GX6_A4857DevComObs, T01GX6_n4857DevComObs, T01GX6_A4850DevComCod, T01GX6_A4851DevComFec, T01GX6_n4851DevComFec, T01GX6_A4852DevComPri, T01GX6_n4852DevComPri, T01GX6_A4853AlbarEnt, T01GX6_n4853AlbarEnt, T01GX6_A4854DevComTPla,
            T01GX6_n4854DevComTPla, T01GX6_A4855DevComTLin, T01GX6_n4855DevComTLin, T01GX6_A4856DevComLis, T01GX6_n4856DevComLis, T01GX6_A396EmprCod, T01GX6_A658PedCod, T01GX6_n658PedCod, T01GX6_A840TrnCod, T01GX6_n840TrnCod,
            T01GX6_A970ProceCod, T01GX6_n970ProceCod
            }
            , new Object[] {
            T01GX7_A4857DevComObs, T01GX7_n4857DevComObs, T01GX7_A4850DevComCod, T01GX7_A4851DevComFec, T01GX7_n4851DevComFec, T01GX7_A4852DevComPri, T01GX7_n4852DevComPri, T01GX7_A4853AlbarEnt, T01GX7_n4853AlbarEnt, T01GX7_A4854DevComTPla,
            T01GX7_n4854DevComTPla, T01GX7_A4855DevComTLin, T01GX7_n4855DevComTLin, T01GX7_A4856DevComLis, T01GX7_n4856DevComLis, T01GX7_A396EmprCod, T01GX7_A658PedCod, T01GX7_n658PedCod, T01GX7_A840TrnCod, T01GX7_n840TrnCod,
            T01GX7_A970ProceCod, T01GX7_n970ProceCod
            }
            , new Object[] {
            T01GX8_A407EmprNom, T01GX8_n407EmprNom
            }
            , new Object[] {
            T01GX9_A795PrvNum
            }
            , new Object[] {
            T01GX10_A841TrnNom, T01GX10_n841TrnNom
            }
            , new Object[] {
            T01GX11_A971ProceNom, T01GX11_n971ProceNom
            }
            , new Object[] {
            T01GX12_A794PrvNom, T01GX12_n794PrvNom
            }
            , new Object[] {
            T01GX13_A4857DevComObs, T01GX13_n4857DevComObs, T01GX13_A4850DevComCod, T01GX13_A4851DevComFec, T01GX13_n4851DevComFec, T01GX13_A4852DevComPri, T01GX13_n4852DevComPri, T01GX13_A4853AlbarEnt, T01GX13_n4853AlbarEnt, T01GX13_A794PrvNom,
            T01GX13_n794PrvNom, T01GX13_A971ProceNom, T01GX13_n971ProceNom, T01GX13_A841TrnNom, T01GX13_n841TrnNom, T01GX13_A4854DevComTPla, T01GX13_n4854DevComTPla, T01GX13_A4855DevComTLin, T01GX13_n4855DevComTLin, T01GX13_A4856DevComLis,
            T01GX13_n4856DevComLis, T01GX13_A407EmprNom, T01GX13_n407EmprNom, T01GX13_A396EmprCod, T01GX13_A658PedCod, T01GX13_n658PedCod, T01GX13_A840TrnCod, T01GX13_n840TrnCod, T01GX13_A970ProceCod, T01GX13_n970ProceCod,
            T01GX13_A795PrvNum
            }
            , new Object[] {
            T01GX14_A407EmprNom, T01GX14_n407EmprNom
            }
            , new Object[] {
            T01GX15_A795PrvNum
            }
            , new Object[] {
            T01GX16_A841TrnNom, T01GX16_n841TrnNom
            }
            , new Object[] {
            T01GX17_A971ProceNom, T01GX17_n971ProceNom
            }
            , new Object[] {
            T01GX18_A794PrvNom, T01GX18_n794PrvNom
            }
            , new Object[] {
            T01GX19_A396EmprCod, T01GX19_A4850DevComCod
            }
            , new Object[] {
            T01GX20_A396EmprCod, T01GX20_A4850DevComCod
            }
            , new Object[] {
            T01GX21_A396EmprCod, T01GX21_A4850DevComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GX25_A407EmprNom, T01GX25_n407EmprNom
            }
            , new Object[] {
            T01GX26_A795PrvNum
            }
            , new Object[] {
            T01GX27_A794PrvNom, T01GX27_n794PrvNom
            }
            , new Object[] {
            T01GX28_A971ProceNom, T01GX28_n971ProceNom
            }
            , new Object[] {
            T01GX29_A841TrnNom, T01GX29_n841TrnNom
            }
            , new Object[] {
            T01GX30_A396EmprCod, T01GX30_A4850DevComCod
            }
            , new Object[] {
            T01GX31_A4850DevComCod, T01GX31_A4858DevComCan, T01GX31_n4858DevComCan, T01GX31_A4859DevComFac, T01GX31_n4859DevComFac, T01GX31_A718PrdNom, T01GX31_A737PrdUcpDsc, T01GX31_n737PrdUcpDsc, T01GX31_A704PrdExiAlm, T01GX31_A724PrdPreAct,
            T01GX31_A396EmprCod, T01GX31_A719PrdNum, T01GX31_A742PrdUniCom
            }
            , new Object[] {
            T01GX32_A718PrdNom, T01GX32_A704PrdExiAlm, T01GX32_A724PrdPreAct, T01GX32_A742PrdUniCom
            }
            , new Object[] {
            T01GX33_A737PrdUcpDsc, T01GX33_n737PrdUcpDsc
            }
            , new Object[] {
            T01GX34_A396EmprCod, T01GX34_A4850DevComCod, T01GX34_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GX38_A718PrdNom, T01GX38_A704PrdExiAlm, T01GX38_A724PrdPreAct, T01GX38_A742PrdUniCom
            }
            , new Object[] {
            T01GX39_A737PrdUcpDsc, T01GX39_n737PrdUcpDsc
            }
            , new Object[] {
            T01GX40_A396EmprCod, T01GX40_A4850DevComCod, T01GX40_A719PrdNum
            }
         }
      );
   }

   private byte Z4856DevComLis ;
   private byte GxWebError ;
   private byte A742PrdUniCom ;
   private byte nKeyPressed ;
   private byte A4856DevComLis ;
   private byte Gx_BScreen ;
   private byte Z742PrdUniCom ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ4856DevComLis ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short nRcdDeleted_1630 ;
   private short nRcdExists_1630 ;
   private short nIsMod_1630 ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1630 ;
   private short RcdFound1630 ;
   private short nBlankRcdUsr1630 ;
   private short RcdFound1629 ;
   private short nIsDirty_1629 ;
   private short nIsDirty_1630 ;
   private short ZZ970ProceCod ;
   private short ZZ840TrnCod ;
   private int Z4850DevComCod ;
   private int Z658PedCod ;
   private int nRC_GXsfl_105 ;
   private int nGXsfl_105_idx=1 ;
   private int Z4859DevComFac ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A4850DevComCod ;
   private int edtDevComCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDevComFec_Enabled ;
   private int edtDevComPri_Enabled ;
   private int edtAlbarEnt_Enabled ;
   private int edtPedCod_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtProceNom_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtDevComTPla_Enabled ;
   private int edtDevComTLin_Enabled ;
   private int edtDevComLis_Enabled ;
   private int edtDevComObs_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1630_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtDevComCan_Enabled ;
   private int edtDevComFac_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdUniCom_Enabled ;
   private int edtPrdUcpDsc_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A4859DevComFac ;
   private int GX_JID ;
   private int Z795PrvNum ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtPrdNum_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDevComObs_Backcolor ;
   private int edtDevComLis_Backcolor ;
   private int edtDevComTLin_Backcolor ;
   private int edtDevComTPla_Backcolor ;
   private int edtTrnNom_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtProceNom_Backcolor ;
   private int edtProceCod_Backcolor ;
   private int edtPrvNom_Backcolor ;
   private int edtPrvNum_Backcolor ;
   private int edtPedCod_Backcolor ;
   private int edtAlbarEnt_Backcolor ;
   private int edtDevComPri_Backcolor ;
   private int edtDevComFec_Backcolor ;
   private int edtDevComCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4850DevComCod ;
   private int ZZ658PedCod ;
   private int ZZ795PrvNum ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4858DevComCan ;
   private java.math.BigDecimal A4858DevComCan ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4852DevComPri ;
   private String Z4853AlbarEnt ;
   private String Z4854DevComTPla ;
   private String Z4855DevComTLin ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_105_idx="0001" ;
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
   private String edtDevComCod_Internalname ;
   private String edtDevComCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDevComFec_Internalname ;
   private String edtDevComFec_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDevComPri_Internalname ;
   private String A4852DevComPri ;
   private String edtDevComPri_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAlbarEnt_Internalname ;
   private String A4853AlbarEnt ;
   private String edtAlbarEnt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPedCod_Internalname ;
   private String edtPedCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtProceNom_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDevComTPla_Internalname ;
   private String A4854DevComTPla ;
   private String edtDevComTPla_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDevComTLin_Internalname ;
   private String A4855DevComTLin ;
   private String edtDevComTLin_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDevComLis_Internalname ;
   private String edtDevComLis_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDevComObs_Internalname ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1630 ;
   private String edtavnRcdDeleted_1630_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtDevComCan_Internalname ;
   private String edtDevComFac_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtPrdUniCom_Internalname ;
   private String edtPrdUcpDsc_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdPreAct_Internalname ;
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
   private String sMode1629 ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z971ProceNom ;
   private String Z841TrnNom ;
   private String Z718PrdNom ;
   private String Z737PrdUcpDsc ;
   private String sGXsfl_105_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1630_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtDevComCan_Jsonclick ;
   private String edtDevComFac_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdUniCom_Jsonclick ;
   private String edtPrdUcpDsc_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ4852DevComPri ;
   private String ZZ4853AlbarEnt ;
   private String ZZ4854DevComTPla ;
   private String ZZ4855DevComTLin ;
   private String ZZ407EmprNom ;
   private String ZZ841TrnNom ;
   private String ZZ971ProceNom ;
   private String ZZ794PrvNom ;
   private java.util.Date Z4851DevComFec ;
   private java.util.Date A4851DevComFec ;
   private java.util.Date ZZ4851DevComFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n658PedCod ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean wbErr ;
   private boolean bGXsfl_105_Refreshing=false ;
   private boolean n4851DevComFec ;
   private boolean n4852DevComPri ;
   private boolean n4853AlbarEnt ;
   private boolean n794PrvNom ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n4854DevComTPla ;
   private boolean n4855DevComTLin ;
   private boolean n4856DevComLis ;
   private boolean n4857DevComObs ;
   private boolean n407EmprNom ;
   private boolean Gx_longc ;
   private boolean n4858DevComCan ;
   private boolean n4859DevComFac ;
   private boolean n737PrdUcpDsc ;
   private String A4857DevComObs ;
   private String Z4857DevComObs ;
   private String ZZ4857DevComObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01GX13_A4857DevComObs ;
   private boolean[] T01GX13_n4857DevComObs ;
   private int[] T01GX13_A4850DevComCod ;
   private java.util.Date[] T01GX13_A4851DevComFec ;
   private boolean[] T01GX13_n4851DevComFec ;
   private String[] T01GX13_A4852DevComPri ;
   private boolean[] T01GX13_n4852DevComPri ;
   private String[] T01GX13_A4853AlbarEnt ;
   private boolean[] T01GX13_n4853AlbarEnt ;
   private String[] T01GX13_A794PrvNom ;
   private boolean[] T01GX13_n794PrvNom ;
   private String[] T01GX13_A971ProceNom ;
   private boolean[] T01GX13_n971ProceNom ;
   private String[] T01GX13_A841TrnNom ;
   private boolean[] T01GX13_n841TrnNom ;
   private String[] T01GX13_A4854DevComTPla ;
   private boolean[] T01GX13_n4854DevComTPla ;
   private String[] T01GX13_A4855DevComTLin ;
   private boolean[] T01GX13_n4855DevComTLin ;
   private byte[] T01GX13_A4856DevComLis ;
   private boolean[] T01GX13_n4856DevComLis ;
   private String[] T01GX13_A407EmprNom ;
   private boolean[] T01GX13_n407EmprNom ;
   private String[] T01GX13_A396EmprCod ;
   private int[] T01GX13_A658PedCod ;
   private boolean[] T01GX13_n658PedCod ;
   private short[] T01GX13_A840TrnCod ;
   private boolean[] T01GX13_n840TrnCod ;
   private short[] T01GX13_A970ProceCod ;
   private boolean[] T01GX13_n970ProceCod ;
   private int[] T01GX13_A795PrvNum ;
   private String[] T01GX8_A407EmprNom ;
   private boolean[] T01GX8_n407EmprNom ;
   private int[] T01GX9_A795PrvNum ;
   private String[] T01GX10_A841TrnNom ;
   private boolean[] T01GX10_n841TrnNom ;
   private String[] T01GX11_A971ProceNom ;
   private boolean[] T01GX11_n971ProceNom ;
   private String[] T01GX12_A794PrvNom ;
   private boolean[] T01GX12_n794PrvNom ;
   private String[] T01GX14_A407EmprNom ;
   private boolean[] T01GX14_n407EmprNom ;
   private int[] T01GX15_A795PrvNum ;
   private String[] T01GX16_A841TrnNom ;
   private boolean[] T01GX16_n841TrnNom ;
   private String[] T01GX17_A971ProceNom ;
   private boolean[] T01GX17_n971ProceNom ;
   private String[] T01GX18_A794PrvNom ;
   private boolean[] T01GX18_n794PrvNom ;
   private String[] T01GX19_A396EmprCod ;
   private int[] T01GX19_A4850DevComCod ;
   private String[] T01GX7_A4857DevComObs ;
   private boolean[] T01GX7_n4857DevComObs ;
   private int[] T01GX7_A4850DevComCod ;
   private java.util.Date[] T01GX7_A4851DevComFec ;
   private boolean[] T01GX7_n4851DevComFec ;
   private String[] T01GX7_A4852DevComPri ;
   private boolean[] T01GX7_n4852DevComPri ;
   private String[] T01GX7_A4853AlbarEnt ;
   private boolean[] T01GX7_n4853AlbarEnt ;
   private String[] T01GX7_A4854DevComTPla ;
   private boolean[] T01GX7_n4854DevComTPla ;
   private String[] T01GX7_A4855DevComTLin ;
   private boolean[] T01GX7_n4855DevComTLin ;
   private byte[] T01GX7_A4856DevComLis ;
   private boolean[] T01GX7_n4856DevComLis ;
   private String[] T01GX7_A396EmprCod ;
   private int[] T01GX7_A658PedCod ;
   private boolean[] T01GX7_n658PedCod ;
   private short[] T01GX7_A840TrnCod ;
   private boolean[] T01GX7_n840TrnCod ;
   private short[] T01GX7_A970ProceCod ;
   private boolean[] T01GX7_n970ProceCod ;
   private String[] T01GX20_A396EmprCod ;
   private int[] T01GX20_A4850DevComCod ;
   private String[] T01GX21_A396EmprCod ;
   private int[] T01GX21_A4850DevComCod ;
   private String[] T01GX6_A4857DevComObs ;
   private boolean[] T01GX6_n4857DevComObs ;
   private int[] T01GX6_A4850DevComCod ;
   private java.util.Date[] T01GX6_A4851DevComFec ;
   private boolean[] T01GX6_n4851DevComFec ;
   private String[] T01GX6_A4852DevComPri ;
   private boolean[] T01GX6_n4852DevComPri ;
   private String[] T01GX6_A4853AlbarEnt ;
   private boolean[] T01GX6_n4853AlbarEnt ;
   private String[] T01GX6_A4854DevComTPla ;
   private boolean[] T01GX6_n4854DevComTPla ;
   private String[] T01GX6_A4855DevComTLin ;
   private boolean[] T01GX6_n4855DevComTLin ;
   private byte[] T01GX6_A4856DevComLis ;
   private boolean[] T01GX6_n4856DevComLis ;
   private String[] T01GX6_A396EmprCod ;
   private int[] T01GX6_A658PedCod ;
   private boolean[] T01GX6_n658PedCod ;
   private short[] T01GX6_A840TrnCod ;
   private boolean[] T01GX6_n840TrnCod ;
   private short[] T01GX6_A970ProceCod ;
   private boolean[] T01GX6_n970ProceCod ;
   private String[] T01GX25_A407EmprNom ;
   private boolean[] T01GX25_n407EmprNom ;
   private int[] T01GX26_A795PrvNum ;
   private String[] T01GX27_A794PrvNom ;
   private boolean[] T01GX27_n794PrvNom ;
   private String[] T01GX28_A971ProceNom ;
   private boolean[] T01GX28_n971ProceNom ;
   private String[] T01GX29_A841TrnNom ;
   private boolean[] T01GX29_n841TrnNom ;
   private String[] T01GX30_A396EmprCod ;
   private int[] T01GX30_A4850DevComCod ;
   private int[] T01GX31_A4850DevComCod ;
   private java.math.BigDecimal[] T01GX31_A4858DevComCan ;
   private boolean[] T01GX31_n4858DevComCan ;
   private int[] T01GX31_A4859DevComFac ;
   private boolean[] T01GX31_n4859DevComFac ;
   private String[] T01GX31_A718PrdNom ;
   private String[] T01GX31_A737PrdUcpDsc ;
   private boolean[] T01GX31_n737PrdUcpDsc ;
   private java.math.BigDecimal[] T01GX31_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01GX31_A724PrdPreAct ;
   private String[] T01GX31_A396EmprCod ;
   private String[] T01GX31_A719PrdNum ;
   private byte[] T01GX31_A742PrdUniCom ;
   private String[] T01GX4_A718PrdNom ;
   private java.math.BigDecimal[] T01GX4_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01GX4_A724PrdPreAct ;
   private byte[] T01GX4_A742PrdUniCom ;
   private String[] T01GX5_A737PrdUcpDsc ;
   private boolean[] T01GX5_n737PrdUcpDsc ;
   private String[] T01GX32_A718PrdNom ;
   private java.math.BigDecimal[] T01GX32_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01GX32_A724PrdPreAct ;
   private byte[] T01GX32_A742PrdUniCom ;
   private String[] T01GX33_A737PrdUcpDsc ;
   private boolean[] T01GX33_n737PrdUcpDsc ;
   private String[] T01GX34_A396EmprCod ;
   private int[] T01GX34_A4850DevComCod ;
   private String[] T01GX34_A719PrdNum ;
   private int[] T01GX3_A4850DevComCod ;
   private java.math.BigDecimal[] T01GX3_A4858DevComCan ;
   private boolean[] T01GX3_n4858DevComCan ;
   private int[] T01GX3_A4859DevComFac ;
   private boolean[] T01GX3_n4859DevComFac ;
   private String[] T01GX3_A396EmprCod ;
   private String[] T01GX3_A719PrdNum ;
   private int[] T01GX2_A4850DevComCod ;
   private java.math.BigDecimal[] T01GX2_A4858DevComCan ;
   private boolean[] T01GX2_n4858DevComCan ;
   private int[] T01GX2_A4859DevComFac ;
   private boolean[] T01GX2_n4859DevComFac ;
   private String[] T01GX2_A396EmprCod ;
   private String[] T01GX2_A719PrdNum ;
   private String[] T01GX38_A718PrdNom ;
   private java.math.BigDecimal[] T01GX38_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01GX38_A724PrdPreAct ;
   private byte[] T01GX38_A742PrdUniCom ;
   private String[] T01GX39_A737PrdUcpDsc ;
   private boolean[] T01GX39_n737PrdUcpDsc ;
   private String[] T01GX40_A396EmprCod ;
   private int[] T01GX40_A4850DevComCod ;
   private String[] T01GX40_A719PrdNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdevcom__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevcom__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevcom__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevcom__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GX2", "SELECT DevComCod, DevComCan, DevComFac, EmprCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND DevComCod = ? AND PrdNum = ?  FOR UPDATE OF DevComCan, DevComFac NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX3", "SELECT DevComCod, DevComCan, DevComFac, EmprCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND DevComCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX4", "SELECT PrdNom, PrdExiAlm, PrdPreAct, PrdUniCom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX5", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX6", "SELECT DevComObs, DevComCod, DevComFec, DevComPri, AlbarEnt, DevComTPla, DevComTLin, DevComLis, EmprCod, PedCod, TrnCod, ProceCod FROM TXPDEVCCO WHERE EmprCod = ? AND DevComCod = ?  FOR UPDATE OF DevComFec, DevComPri, AlbarEnt, DevComTPla, DevComTLin, DevComLis, DevComObs, PedCod, TrnCod, ProceCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX7", "SELECT DevComObs, DevComCod, DevComFec, DevComPri, AlbarEnt, DevComTPla, DevComTLin, DevComLis, EmprCod, PedCod, TrnCod, ProceCod FROM TXPDEVCCO WHERE EmprCod = ? AND DevComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX9", "SELECT PrvNum FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX10", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX11", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX12", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX13", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevComObs, TM1.DevComCod, TM1.DevComFec, TM1.DevComPri, TM1.AlbarEnt, T4.PrvNom, T5.ProceNom, T6.TrnNom, TM1.DevComTPla, TM1.DevComTLin, TM1.DevComLis, T2.EmprNom, TM1.EmprCod, TM1.PedCod, TM1.TrnCod, TM1.ProceCod, T3.PrvNum FROM (((((TXPDEVCCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCPEDID T3 ON T3.EmprCod = TM1.EmprCod AND T3.PedCod = TM1.PedCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrvNum = T3.PrvNum) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProceCod = TM1.ProceCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.DevComCod = ? ORDER BY TM1.EmprCod, TM1.DevComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX15", "SELECT PrvNum FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX16", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX17", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX18", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX19", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevComCod FROM TXPDEVCCO WHERE EmprCod = ? AND DevComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevComCod FROM TXPDEVCCO WHERE ( EmprCod > ? or EmprCod = ? and DevComCod > ?) ORDER BY EmprCod, DevComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GX21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevComCod FROM TXPDEVCCO WHERE ( EmprCod < ? or EmprCod = ? and DevComCod < ?) ORDER BY EmprCod DESC, DevComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GX22", "INSERT INTO TXPDEVCCO(DevComCod, DevComFec, DevComPri, AlbarEnt, DevComTPla, DevComTLin, DevComLis, DevComObs, EmprCod, PedCod, TrnCod, ProceCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVCCO")
         ,new UpdateCursor("T01GX23", "UPDATE TXPDEVCCO SET DevComFec=?, DevComPri=?, AlbarEnt=?, DevComTPla=?, DevComTLin=?, DevComLis=?, DevComObs=?, PedCod=?, TrnCod=?, ProceCod=?  WHERE EmprCod = ? AND DevComCod = ?", GX_NOMASK, "TXPDEVCCO")
         ,new UpdateCursor("T01GX24", "DELETE FROM TXPDEVCCO  WHERE EmprCod = ? AND DevComCod = ?", GX_NOMASK, "TXPDEVCCO")
         ,new ForEachCursor("T01GX25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX26", "SELECT PrvNum FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX27", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX28", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX29", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX30", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevComCod FROM TXPDEVCCO ORDER BY EmprCod, DevComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX31", "SELECT T1.DevComCod, T1.DevComCan, T1.DevComFac, T2.PrdNom, T3.UniDsc AS PrdUcpDsc, T2.PrdExiAlm, T2.PrdPreAct, T1.EmprCod, T1.PrdNum, T2.PrdUniCom AS PrdUniCom FROM ((TXPDEVLCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T2.PrdUniCom) WHERE T1.EmprCod = ? and T1.DevComCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.DevComCod, T1.PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX32", "SELECT PrdNom, PrdExiAlm, PrdPreAct, PrdUniCom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX33", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX34", "SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND DevComCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01GX35", "INSERT INTO TXPDEVLCO(DevComCod, DevComCan, DevComFac, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVLCO")
         ,new UpdateCursor("T01GX36", "UPDATE TXPDEVLCO SET DevComCan=?, DevComFac=?  WHERE EmprCod = ? AND DevComCod = ? AND PrdNum = ?", GX_NOMASK, "TXPDEVLCO")
         ,new UpdateCursor("T01GX37", "DELETE FROM TXPDEVLCO  WHERE EmprCod = ? AND DevComCod = ? AND PrdNum = ?", GX_NOMASK, "TXPDEVLCO")
         ,new ForEachCursor("T01GX38", "SELECT PrdNom, PrdExiAlm, PrdPreAct, PrdUniCom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX39", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GX40", "SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? and DevComCod = ? ORDER BY EmprCod, DevComCod, PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(17);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
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
            case 14 :
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
            case 15 :
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
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
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
                  stmt.setString(3, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
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
                  stmt.setString(6, (String)parms[10], 26);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(8, (String)parms[14]);
               }
               stmt.setString(9, (String)parms[15], 3);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[21]).shortValue());
               }
               return;
            case 21 :
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
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
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
                  stmt.setString(5, (String)parms[9], 26);
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
                  stmt.setNull( 7 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(7, (String)parms[13]);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setInt(12, ((Number) parms[21]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
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
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
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
            case 27 :
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
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 33 :
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setString(5, (String)parms[6], 6);
               return;
            case 34 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 6);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

