package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevemp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6235DevEmpCod = (int)(GXutil.lval( httpContext.GetPar( "DevEmpCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
         A6237DevEmpFec = localUtil.parseDateParm( httpContext.GetPar( "DevEmpFec")) ;
         n6237DevEmpFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_UG908( A396EmprCod, A6235DevEmpCod, A6237DevEmpFec) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         AV36AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36AlbRUni", AV36AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_UG909( A396EmprCod, A44AlbRecCod, AV36AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
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
         gxload_32( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6240DevEmpCTrn = (short)(GXutil.lval( httpContext.GetPar( "DevEmpCTrn"))) ;
         n6240DevEmpCTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6240DevEmpCTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6240DevEmpCTrn), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_33( A396EmprCod, A6240DevEmpCTrn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_35( A396EmprCod, A44AlbRecCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DEVOLUCION EMPESAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDevEmpCod_Internalname ;
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
      A6236DevUltLin = (short)(GXutil.lval( httpContext.GetPar( "DevUltLin"))) ;
      n6236DevUltLin = false ;
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

   public tdevemp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevemp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevemp_impl.class ));
   }

   public tdevemp_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbREst = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDEVEMP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Devolucion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevEmpCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6235DevEmpCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevEmpCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6235DevEmpCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6235DevEmpCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevEmpCod_Jsonclick, 0, "", "", "", "", "", 1, edtDevEmpCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultimo Linea Devolucion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6236DevUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6236DevUltLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6236DevUltLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevUltLin_Jsonclick, 0, "", "", "", "", "", 1, edtDevUltLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fecha devolucion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevEmpFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevEmpFec_Internalname, localUtil.format(A6237DevEmpFec, "99/99/99"), localUtil.format( A6237DevEmpFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevEmpFec_Jsonclick, 0, "", "", "", "", "", 1, edtDevEmpFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVEMP.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevEmpFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevEmpFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVEMP.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Matricula", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevEmpMtr_Internalname, GXutil.rtrim( A6238DevEmpMtr), GXutil.rtrim( localUtil.format( A6238DevEmpMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevEmpMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDevEmpMtr_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Hora Salida", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevEmphhsa_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevEmphhsa_Internalname, localUtil.ttoc( A6239DevEmphhsa, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6239DevEmphhsa, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevEmphhsa_Jsonclick, 0, "", "", "", "", "", 1, edtDevEmphhsa_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVEMP.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevEmphhsa_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevEmphhsa_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVEMP.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevEmpCTrn_Internalname, GXutil.ltrim( localUtil.ntoc( A6240DevEmpCTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevEmpCTrn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6240DevEmpCTrn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6240DevEmpCTrn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtDevEmpCTrn_Jsonclick, 0, "", "", "", "", "", 1, edtDevEmpCTrn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Transportista", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevEmpNTrn_Internalname, GXutil.rtrim( A6241DevEmpNTrn), GXutil.rtrim( localUtil.format( A6241DevEmpNTrn, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevEmpNTrn_Jsonclick, 0, "", "", "", "", "", 1, edtDevEmpNTrn_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVEMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevEmpObs_Internalname, A6242DevEmpObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtDevEmpObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDEVEMP.htm");
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
         nBlankRcdCount909 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_909 = (short)(1) ;
            scanStartUG909( ) ;
            while ( RcdFound909 != 0 )
            {
               init_level_properties909( ) ;
               getByPrimaryKeyUG909( ) ;
               addRowUG909( ) ;
               scanNextUG909( ) ;
            }
            scanEndUG909( ) ;
            nBlankRcdCount909 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6236DevUltLin = A6236DevUltLin ;
         n6236DevUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
         standaloneNotModalUG909( ) ;
         standaloneModalUG909( ) ;
         sMode909 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRowUG909( ) ;
            edtavnRcdDeleted_909_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_909_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_909_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_909_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDevNumLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVNUMLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevNumLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREF_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREFDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
            edtDevEmpUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVEMPUNI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevEmpUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpUni_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDevEmpPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVEMPPIE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevEmpPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpPie_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDevEmpEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVEMPEST_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevEmpEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpEst_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_909 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalUG909( ) ;
            }
            sendRowUG909( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode909 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6236DevUltLin = B6236DevUltLin ;
         n6236DevUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount909 = (short)(5) ;
         nRcdExists_909 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartUG909( ) ;
            while ( RcdFound909 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_80909( ) ;
               init_level_properties909( ) ;
               standaloneNotModalUG909( ) ;
               getByPrimaryKeyUG909( ) ;
               standaloneModalUG909( ) ;
               addRowUG909( ) ;
               scanNextUG909( ) ;
            }
            scanEndUG909( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode909 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_80909( ) ;
      initAllUG909( ) ;
      init_level_properties909( ) ;
      B6236DevUltLin = A6236DevUltLin ;
      n6236DevUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      nRcdExists_909 = (short)(0) ;
      nIsMod_909 = (short)(0) ;
      nRcdDeleted_909 = (short)(0) ;
      nBlankRcdCount909 = (short)(nBlankRcdUsr909+nBlankRcdCount909) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount909 > 0 )
      {
         standaloneNotModalUG909( ) ;
         standaloneModalUG909( ) ;
         addRowUG909( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDevNumLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount909 = (short)(nBlankRcdCount909-1) ;
      }
      Gx_mode = sMode909 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6236DevUltLin = B6236DevUltLin ;
      n6236DevUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVEMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDEVEMP.htm");
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
      e11UG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z6235DevEmpCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6235DevEmpCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6236DevUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z6236DevUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6237DevEmpFec = localUtil.ctod( httpContext.cgiGet( "Z6237DevEmpFec"), 0) ;
            Z6238DevEmpMtr = httpContext.cgiGet( "Z6238DevEmpMtr") ;
            Z6239DevEmphhsa = localUtil.ctot( httpContext.cgiGet( "Z6239DevEmphhsa"), 0) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6240DevEmpCTrn = (short)(localUtil.ctol( httpContext.cgiGet( "Z6240DevEmpCTrn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6236DevUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O6236DevUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Modo = httpContext.cgiGet( "MODO") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV37Modo = httpContext.cgiGet( "vMODO") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "vALBRUNIDIS")) ;
            AV40Piezas = (int)(localUtil.ctol( httpContext.cgiGet( "vPIEZAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV43PieAnt = (int)(localUtil.ctol( httpContext.cgiGet( "vPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38Kilos = localUtil.ctond( httpContext.cgiGet( "vKILOS")) ;
            AV39Metros = localUtil.ctond( httpContext.cgiGet( "vMETROS")) ;
            AV41KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV42MetAnt = localUtil.ctond( httpContext.cgiGet( "vMETANT")) ;
            AV36AlbRUni = httpContext.cgiGet( "vALBRUNI") ;
            AV34AlbRPDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35AlbRUDis = localUtil.ctond( httpContext.cgiGet( "vALBRUDIS")) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevEmpCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevEmpCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVEMPCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevEmpCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6235DevEmpCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
            }
            else
            {
               A6235DevEmpCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDevEmpCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A6236DevUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDevUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6236DevUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtDevEmpFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVEMPFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevEmpFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6237DevEmpFec = GXutil.nullDate() ;
               n6237DevEmpFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
            }
            else
            {
               A6237DevEmpFec = localUtil.ctod( httpContext.cgiGet( edtDevEmpFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n6237DevEmpFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
            }
            A6238DevEmpMtr = httpContext.cgiGet( edtDevEmpMtr_Internalname) ;
            n6238DevEmpMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6238DevEmpMtr", A6238DevEmpMtr);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtDevEmphhsa_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DEVEMPHHSA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevEmphhsa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6239DevEmphhsa = GXutil.resetTime( GXutil.nullDate() );
               n6239DevEmphhsa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6239DevEmphhsa", localUtil.ttoc( A6239DevEmphhsa, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A6239DevEmphhsa = localUtil.ctot( httpContext.cgiGet( edtDevEmphhsa_Internalname)) ;
               n6239DevEmphhsa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6239DevEmphhsa", localUtil.ttoc( A6239DevEmphhsa, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevEmpCTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevEmpCTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVEMPCTRN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevEmpCTrn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6240DevEmpCTrn = (short)(0) ;
               n6240DevEmpCTrn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6240DevEmpCTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6240DevEmpCTrn), 4, 0));
            }
            else
            {
               A6240DevEmpCTrn = (short)(localUtil.ctol( httpContext.cgiGet( edtDevEmpCTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6240DevEmpCTrn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6240DevEmpCTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6240DevEmpCTrn), 4, 0));
            }
            A6241DevEmpNTrn = httpContext.cgiGet( edtDevEmpNTrn_Internalname) ;
            n6241DevEmpNTrn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6241DevEmpNTrn", A6241DevEmpNTrn);
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
            A6242DevEmpObs = httpContext.cgiGet( edtDevEmpObs_Internalname) ;
            n6242DevEmpObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6242DevEmpObs", A6242DevEmpObs);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDEVEMP");
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV37Modo, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A6235DevEmpCod != Z6235DevEmpCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdevemp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A6235DevEmpCod = (int)(GXutil.lval( httpContext.GetPar( "DevEmpCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
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
                        e11UG2 ();
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
            initAllUG908( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_909_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_909_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributesUG908( ) ;
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

   public void confirm_UG0( )
   {
      beforeValidateUG908( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsUG908( ) ;
         }
         else
         {
            checkExtendedTableUG908( ) ;
            if ( AnyError == 0 )
            {
               zmUG908( 31) ;
               zmUG908( 32) ;
               zmUG908( 33) ;
            }
            closeExtendedTableCursorsUG908( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode908 = Gx_mode ;
         confirm_UG909( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode908 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode908 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesUG0( ) ;
      }
   }

   public void confirm_UG909( )
   {
      s6236DevUltLin = O6236DevUltLin ;
      n6236DevUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRowUG909( ) ;
         if ( ( nRcdExists_909 != 0 ) || ( nIsMod_909 != 0 ) )
         {
            getKeyUG909( ) ;
            if ( ( nRcdExists_909 == 0 ) && ( nRcdDeleted_909 == 0 ) )
            {
               if ( RcdFound909 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateUG909( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableUG909( ) ;
                     if ( AnyError == 0 )
                     {
                        zmUG909( 35) ;
                     }
                     closeExtendedTableCursorsUG909( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6236DevUltLin = A6236DevUltLin ;
                     n6236DevUltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "DEVNUMLIN_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevNumLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound909 != 0 )
               {
                  if ( nRcdDeleted_909 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyUG909( ) ;
                     loadUG909( ) ;
                     beforeValidateUG909( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsUG909( ) ;
                        O6236DevUltLin = A6236DevUltLin ;
                        n6236DevUltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_909 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateUG909( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableUG909( ) ;
                           if ( AnyError == 0 )
                           {
                              zmUG909( 35) ;
                           }
                           closeExtendedTableCursorsUG909( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6236DevUltLin = A6236DevUltLin ;
                           n6236DevUltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_909 == 0 )
                  {
                     GXCCtl = "DEVNUMLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevNumLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_909_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6243DevNumLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc)) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtDevEmpUni_Internalname, GXutil.ltrim( localUtil.ntoc( A6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevEmpPie_Internalname, GXutil.ltrim( localUtil.ntoc( A6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevEmpEst_Internalname, GXutil.ltrim( localUtil.ntoc( A6246DevEmpEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6243DevNumLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z6243DevNumLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6244DevEmpUni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6245DevEmpPie_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6246DevEmpEst_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z6246DevEmpEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_80_idx, GXutil.rtrim( Z45AlbRef)) ;
         httpContext.changePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_80_idx, GXutil.rtrim( Z3613AlbRefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6244DevEmpUni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6245DevEmpPie_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T60AlbRUniUti_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T54AlbRPieUti_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_909_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_909_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_909_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_909 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_909_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_909_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVNUMLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevNumLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREF_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREFDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVEMPUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVEMPPIE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVEMPEST_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6236DevUltLin = s6236DevUltLin ;
      n6236DevUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionUG0( )
   {
   }

   public void e11UG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1090_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN570_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN838_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1495_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1109_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1004_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1411_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit10", AV21Lit10);
      GXt_char1 = AV22Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT356_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit11", AV22Lit11);
      GXt_char1 = AV23Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit12", AV23Lit12);
      GXt_char1 = AV26Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN020", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit15", AV26Lit15);
      GXt_char1 = AV27Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN021", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit16", AV27Lit16);
      GXt_char1 = AV28Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tdevemp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit17", AV28Lit17);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevemp_impl.this.A396EmprCod = GXv_char2[0] ;
      tdevemp_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdevemp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zmUG908( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6236DevUltLin = T00UG7_A6236DevUltLin[0] ;
            Z6237DevEmpFec = T00UG7_A6237DevEmpFec[0] ;
            Z6238DevEmpMtr = T00UG7_A6238DevEmpMtr[0] ;
            Z6239DevEmphhsa = T00UG7_A6239DevEmphhsa[0] ;
            Z252CliCod = T00UG7_A252CliCod[0] ;
            Z6240DevEmpCTrn = T00UG7_A6240DevEmpCTrn[0] ;
         }
         else
         {
            Z6236DevUltLin = A6236DevUltLin ;
            Z6237DevEmpFec = A6237DevEmpFec ;
            Z6238DevEmpMtr = A6238DevEmpMtr ;
            Z6239DevEmphhsa = A6239DevEmphhsa ;
            Z252CliCod = A252CliCod ;
            Z6240DevEmpCTrn = A6240DevEmpCTrn ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z6235DevEmpCod = A6235DevEmpCod ;
         Z6236DevUltLin = A6236DevUltLin ;
         Z6237DevEmpFec = A6237DevEmpFec ;
         Z6238DevEmpMtr = A6238DevEmpMtr ;
         Z6239DevEmphhsa = A6239DevEmphhsa ;
         Z6242DevEmpObs = A6242DevEmpObs ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z6240DevEmpCTrn = A6240DevEmpCTrn ;
         Z407EmprNom = A407EmprNom ;
         Z6241DevEmpNTrn = A6241DevEmpNTrn ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDevUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevUltLin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDevUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevUltLin_Enabled), 5, 0), true);
      /* Using cursor T00UG8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00UG8_A407EmprNom[0] ;
      n407EmprNom = T00UG8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         AV37Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
      }
      else
      {
         if ( isDlt( )  )
         {
            AV37Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
         }
         else
         {
            if ( isUpd( )  )
            {
               AV37Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
            }
         }
      }
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6237DevEmpFec)) && ( Gx_BScreen == 0 ) )
      {
         A6237DevEmpFec = GXutil.today( ) ;
         n6237DevEmpFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A6239DevEmphhsa) && ( Gx_BScreen == 0 ) )
      {
         A6239DevEmphhsa = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n6239DevEmphhsa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6239DevEmphhsa", localUtil.ttoc( A6239DevEmphhsa, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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

   public void loadUG908( )
   {
      /* Using cursor T00UG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound908 = (short)(1) ;
         A6242DevEmpObs = T00UG11_A6242DevEmpObs[0] ;
         n6242DevEmpObs = T00UG11_n6242DevEmpObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6242DevEmpObs", A6242DevEmpObs);
         A407EmprNom = T00UG11_A407EmprNom[0] ;
         n407EmprNom = T00UG11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A6236DevUltLin = T00UG11_A6236DevUltLin[0] ;
         n6236DevUltLin = T00UG11_n6236DevUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
         A6237DevEmpFec = T00UG11_A6237DevEmpFec[0] ;
         n6237DevEmpFec = T00UG11_n6237DevEmpFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
         A6238DevEmpMtr = T00UG11_A6238DevEmpMtr[0] ;
         n6238DevEmpMtr = T00UG11_n6238DevEmpMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6238DevEmpMtr", A6238DevEmpMtr);
         A6239DevEmphhsa = T00UG11_A6239DevEmphhsa[0] ;
         n6239DevEmphhsa = T00UG11_n6239DevEmphhsa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6239DevEmphhsa", localUtil.ttoc( A6239DevEmphhsa, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6241DevEmpNTrn = T00UG11_A6241DevEmpNTrn[0] ;
         n6241DevEmpNTrn = T00UG11_n6241DevEmpNTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6241DevEmpNTrn", A6241DevEmpNTrn);
         A279CliNom = T00UG11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A252CliCod = T00UG11_A252CliCod[0] ;
         n252CliCod = T00UG11_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6240DevEmpCTrn = T00UG11_A6240DevEmpCTrn[0] ;
         n6240DevEmpCTrn = T00UG11_n6240DevEmpCTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6240DevEmpCTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6240DevEmpCTrn), 4, 0));
         zmUG908( -30) ;
      }
      pr_default.close(9);
      onLoadActionsUG908( ) ;
   }

   public void onLoadActionsUG908( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void checkExtendedTableUG908( )
   {
      nIsDirty_908 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
      /* Using cursor T00UG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00UG9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T00UG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n6240DevEmpCTrn), Short.valueOf(A6240DevEmpCTrn)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevEmp", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVEMPCTRN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpCTrn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6241DevEmpNTrn = T00UG10_A6241DevEmpNTrn[0] ;
      n6241DevEmpNTrn = T00UG10_n6241DevEmpNTrn[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6241DevEmpNTrn", A6241DevEmpNTrn);
      pr_default.close(8);
   }

   public void closeExtendedTableCursorsUG908( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_32( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00UG12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00UG12_A279CliNom[0] ;
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

   public void gxload_33( String A396EmprCod ,
                          short A6240DevEmpCTrn )
   {
      /* Using cursor T00UG13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n6240DevEmpCTrn), Short.valueOf(A6240DevEmpCTrn)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevEmp", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVEMPCTRN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpCTrn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6241DevEmpNTrn = T00UG13_A6241DevEmpNTrn[0] ;
      n6241DevEmpNTrn = T00UG13_n6241DevEmpNTrn[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6241DevEmpNTrn", A6241DevEmpNTrn);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6241DevEmpNTrn))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKeyUG908( )
   {
      /* Using cursor T00UG14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound908 = (short)(1) ;
      }
      else
      {
         RcdFound908 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00UG7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T00UG7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmUG908( 30) ;
         RcdFound908 = (short)(1) ;
         A6242DevEmpObs = T00UG7_A6242DevEmpObs[0] ;
         n6242DevEmpObs = T00UG7_n6242DevEmpObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6242DevEmpObs", A6242DevEmpObs);
         A6235DevEmpCod = T00UG7_A6235DevEmpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
         A6236DevUltLin = T00UG7_A6236DevUltLin[0] ;
         n6236DevUltLin = T00UG7_n6236DevUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
         A6237DevEmpFec = T00UG7_A6237DevEmpFec[0] ;
         n6237DevEmpFec = T00UG7_n6237DevEmpFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
         A6238DevEmpMtr = T00UG7_A6238DevEmpMtr[0] ;
         n6238DevEmpMtr = T00UG7_n6238DevEmpMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6238DevEmpMtr", A6238DevEmpMtr);
         A6239DevEmphhsa = T00UG7_A6239DevEmphhsa[0] ;
         n6239DevEmphhsa = T00UG7_n6239DevEmphhsa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6239DevEmphhsa", localUtil.ttoc( A6239DevEmphhsa, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A252CliCod = T00UG7_A252CliCod[0] ;
         n252CliCod = T00UG7_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6240DevEmpCTrn = T00UG7_A6240DevEmpCTrn[0] ;
         n6240DevEmpCTrn = T00UG7_n6240DevEmpCTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6240DevEmpCTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6240DevEmpCTrn), 4, 0));
         O6236DevUltLin = A6236DevUltLin ;
         n6236DevUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z6235DevEmpCod = A6235DevEmpCod ;
         sMode908 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadUG908( ) ;
         if ( AnyError == 1 )
         {
            RcdFound908 = (short)(0) ;
            initializeNonKeyUG908( ) ;
         }
         Gx_mode = sMode908 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound908 = (short)(0) ;
         initializeNonKeyUG908( ) ;
         sMode908 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode908 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKeyUG908( ) ;
      if ( RcdFound908 == 0 )
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
      RcdFound908 = (short)(0) ;
      /* Using cursor T00UG15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A6235DevEmpCod), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T00UG15_A6235DevEmpCod[0] < A6235DevEmpCod ) ) && ( GXutil.strcmp(T00UG15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T00UG15_A6235DevEmpCod[0] > A6235DevEmpCod ) ) && ( GXutil.strcmp(T00UG15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A6235DevEmpCod = T00UG15_A6235DevEmpCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
            RcdFound908 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound908 = (short)(0) ;
      /* Using cursor T00UG16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A6235DevEmpCod), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T00UG16_A6235DevEmpCod[0] > A6235DevEmpCod ) ) && ( GXutil.strcmp(T00UG16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T00UG16_A6235DevEmpCod[0] < A6235DevEmpCod ) ) && ( GXutil.strcmp(T00UG16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A6235DevEmpCod = T00UG16_A6235DevEmpCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
            RcdFound908 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyUG908( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6236DevUltLin = O6236DevUltLin ;
         n6236DevUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
         GX_FocusControl = edtDevEmpCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertUG908( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound908 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6235DevEmpCod != Z6235DevEmpCod ) )
            {
               A6235DevEmpCod = Z6235DevEmpCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6236DevUltLin = O6236DevUltLin ;
               n6236DevUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDevEmpCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A6236DevUltLin = O6236DevUltLin ;
               n6236DevUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
               updateUG908( ) ;
               GX_FocusControl = edtDevEmpCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6235DevEmpCod != Z6235DevEmpCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A6236DevUltLin = O6236DevUltLin ;
               n6236DevUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
               GX_FocusControl = edtDevEmpCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertUG908( ) ;
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
                  A6236DevUltLin = O6236DevUltLin ;
                  n6236DevUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
                  GX_FocusControl = edtDevEmpCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertUG908( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6235DevEmpCod != Z6235DevEmpCod ) )
      {
         A6235DevEmpCod = Z6235DevEmpCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6236DevUltLin = O6236DevUltLin ;
         n6236DevUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDevEmpCod_Internalname ;
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
      getKeyUG908( ) ;
      if ( RcdFound908 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6235DevEmpCod != Z6235DevEmpCod ) )
         {
            A6235DevEmpCod = Z6235DevEmpCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6235DevEmpCod != Z6235DevEmpCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevemp");
      GX_FocusControl = edtDevEmpFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_UG0( ) ;
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
      if ( RcdFound908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDevEmpFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartUG908( ) ;
      if ( RcdFound908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevEmpFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndUG908( ) ;
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
      if ( RcdFound908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevEmpFec_Internalname ;
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
      if ( RcdFound908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevEmpFec_Internalname ;
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
      scanStartUG908( ) ;
      if ( RcdFound908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound908 != 0 )
         {
            scanNextUG908( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevEmpFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndUG908( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyUG908( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00UG6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVEMP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( Z6236DevUltLin != T00UG6_A6236DevUltLin[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z6237DevEmpFec), GXutil.resetTime(T00UG6_A6237DevEmpFec[0])) ) || ( GXutil.strcmp(Z6238DevEmpMtr, T00UG6_A6238DevEmpMtr[0]) != 0 ) || !( GXutil.dateCompare(Z6239DevEmphhsa, T00UG6_A6239DevEmphhsa[0]) ) || ( Z252CliCod != T00UG6_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6240DevEmpCTrn != T00UG6_A6240DevEmpCTrn[0] ) )
         {
            if ( Z6236DevUltLin != T00UG6_A6236DevUltLin[0] )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"DevUltLin");
               GXutil.writeLogRaw("Old: ",Z6236DevUltLin);
               GXutil.writeLogRaw("Current: ",T00UG6_A6236DevUltLin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6237DevEmpFec), GXutil.resetTime(T00UG6_A6237DevEmpFec[0])) ) )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"DevEmpFec");
               GXutil.writeLogRaw("Old: ",Z6237DevEmpFec);
               GXutil.writeLogRaw("Current: ",T00UG6_A6237DevEmpFec[0]);
            }
            if ( GXutil.strcmp(Z6238DevEmpMtr, T00UG6_A6238DevEmpMtr[0]) != 0 )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"DevEmpMtr");
               GXutil.writeLogRaw("Old: ",Z6238DevEmpMtr);
               GXutil.writeLogRaw("Current: ",T00UG6_A6238DevEmpMtr[0]);
            }
            if ( !( GXutil.dateCompare(Z6239DevEmphhsa, T00UG6_A6239DevEmphhsa[0]) ) )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"DevEmphhsa");
               GXutil.writeLogRaw("Old: ",Z6239DevEmphhsa);
               GXutil.writeLogRaw("Current: ",T00UG6_A6239DevEmphhsa[0]);
            }
            if ( Z252CliCod != T00UG6_A252CliCod[0] )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00UG6_A252CliCod[0]);
            }
            if ( Z6240DevEmpCTrn != T00UG6_A6240DevEmpCTrn[0] )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"DevEmpCTrn");
               GXutil.writeLogRaw("Old: ",Z6240DevEmpCTrn);
               GXutil.writeLogRaw("Current: ",T00UG6_A6240DevEmpCTrn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVEMP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertUG908( )
   {
      beforeValidateUG908( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUG908( ) ;
      }
      if ( AnyError == 0 )
      {
         zmUG908( 0) ;
         checkOptimisticConcurrencyUG908( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUG908( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertUG908( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UG17 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A6235DevEmpCod), Boolean.valueOf(n6236DevUltLin), Short.valueOf(A6236DevUltLin), Boolean.valueOf(n6237DevEmpFec), A6237DevEmpFec, Boolean.valueOf(n6238DevEmpMtr), A6238DevEmpMtr, Boolean.valueOf(n6239DevEmphhsa), A6239DevEmphhsa, Boolean.valueOf(n6242DevEmpObs), A6242DevEmpObs, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n6240DevEmpCTrn), Short.valueOf(A6240DevEmpCTrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVEMP");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevelUG908( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionUG0( ) ;
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
            loadUG908( ) ;
         }
         endLevelUG908( ) ;
      }
      closeExtendedTableCursorsUG908( ) ;
   }

   public void updateUG908( )
   {
      beforeValidateUG908( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUG908( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUG908( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUG908( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateUG908( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UG18 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n6236DevUltLin), Short.valueOf(A6236DevUltLin), Boolean.valueOf(n6237DevEmpFec), A6237DevEmpFec, Boolean.valueOf(n6238DevEmpMtr), A6238DevEmpMtr, Boolean.valueOf(n6239DevEmphhsa), A6239DevEmphhsa, Boolean.valueOf(n6242DevEmpObs), A6242DevEmpObs, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n6240DevEmpCTrn), Short.valueOf(A6240DevEmpCTrn), A396EmprCod, Integer.valueOf(A6235DevEmpCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVEMP");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVEMP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateUG908( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelUG908( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionUG0( ) ;
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
         endLevelUG908( ) ;
      }
      closeExtendedTableCursorsUG908( ) ;
   }

   public void deferredUpdateUG908( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateUG908( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUG908( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsUG908( ) ;
         afterConfirmUG908( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteUG908( ) ;
            if ( AnyError == 0 )
            {
               A6236DevUltLin = O6236DevUltLin ;
               n6236DevUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
               scanStartUG909( ) ;
               while ( RcdFound909 != 0 )
               {
                  getByPrimaryKeyUG909( ) ;
                  deleteUG909( ) ;
                  scanNextUG909( ) ;
                  O6236DevUltLin = A6236DevUltLin ;
                  n6236DevUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
               }
               scanEndUG909( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UG19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVEMP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound908 == 0 )
                        {
                           initAllUG908( ) ;
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
                        resetCaptionUG0( ) ;
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
      sMode908 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelUG908( ) ;
      Gx_mode = sMode908 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsUG908( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         }
         /* Using cursor T00UG20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n6240DevEmpCTrn), Short.valueOf(A6240DevEmpCTrn)});
         A6241DevEmpNTrn = T00UG20_A6241DevEmpNTrn[0] ;
         n6241DevEmpNTrn = T00UG20_n6241DevEmpNTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6241DevEmpNTrn", A6241DevEmpNTrn);
         pr_default.close(18);
         /* Using cursor T00UG21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00UG21_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(19);
      }
   }

   public void processNestedLevelUG909( )
   {
      s6236DevUltLin = O6236DevUltLin ;
      n6236DevUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRowUG909( ) ;
         if ( ( nRcdExists_909 != 0 ) || ( nIsMod_909 != 0 ) )
         {
            standaloneNotModalUG909( ) ;
            getKeyUG909( ) ;
            if ( ( nRcdExists_909 == 0 ) && ( nRcdDeleted_909 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertUG909( ) ;
            }
            else
            {
               if ( RcdFound909 != 0 )
               {
                  if ( ( nRcdDeleted_909 != 0 ) && ( nRcdExists_909 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteUG909( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_909 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateUG909( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_909 == 0 )
                  {
                     GXCCtl = "DEVNUMLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevNumLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6236DevUltLin = A6236DevUltLin ;
            n6236DevUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_909_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6243DevNumLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc)) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtDevEmpUni_Internalname, GXutil.ltrim( localUtil.ntoc( A6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevEmpPie_Internalname, GXutil.ltrim( localUtil.ntoc( A6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevEmpEst_Internalname, GXutil.ltrim( localUtil.ntoc( A6246DevEmpEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6243DevNumLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z6243DevNumLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6244DevEmpUni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6245DevEmpPie_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6246DevEmpEst_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z6246DevEmpEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_80_idx, GXutil.rtrim( Z45AlbRef)) ;
         httpContext.changePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_80_idx, GXutil.rtrim( Z3613AlbRefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6244DevEmpUni_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6245DevEmpPie_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T60AlbRUniUti_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T54AlbRPieUti_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_909_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_909_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_909_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_909 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_909_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_909_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVNUMLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevNumLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREF_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREFDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVEMPUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVEMPPIE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVEMPEST_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllUG909( ) ;
      if ( AnyError != 0 )
      {
         O6236DevUltLin = s6236DevUltLin ;
         n6236DevUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      }
      nRcdExists_909 = (short)(0) ;
      nIsMod_909 = (short)(0) ;
      nRcdDeleted_909 = (short)(0) ;
   }

   public void processLevelUG908( )
   {
      /* Save parent mode. */
      sMode908 = Gx_mode ;
      processNestedLevelUG909( ) ;
      if ( AnyError != 0 )
      {
         O6236DevUltLin = s6236DevUltLin ;
         n6236DevUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode908 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00UG22 */
      pr_default.execute(20, new Object[] {Boolean.valueOf(n6236DevUltLin), Short.valueOf(A6236DevUltLin), A396EmprCod, Integer.valueOf(A6235DevEmpCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVEMP");
   }

   public void endLevelUG908( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeCompleteUG908( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdevemp");
         if ( AnyError == 0 )
         {
            confirmValuesUG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevemp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartUG908( )
   {
      /* Scan By routine */
      /* Using cursor T00UG23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      RcdFound908 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound908 = (short)(1) ;
         A6235DevEmpCod = T00UG23_A6235DevEmpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextUG908( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound908 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound908 = (short)(1) ;
         A6235DevEmpCod = T00UG23_A6235DevEmpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
      }
   }

   public void scanEndUG908( )
   {
      pr_default.close(21);
   }

   public void afterConfirmUG908( )
   {
      /* After Confirm Rules */
      if ( (0==A6235DevEmpCod) && true /* After */ && true /* Level */ )
      {
         GXv_int5[0] = A6235DevEmpCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int5) ;
         tdevemp_impl.this.A6235DevEmpCod = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
      }
   }

   public void beforeInsertUG908( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateUG908( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteUG908( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteUG908( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateUG908( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesUG908( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDevEmpCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDevUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevUltLin_Enabled), 5, 0), true);
      edtDevEmpFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpFec_Enabled), 5, 0), true);
      edtDevEmpMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpMtr_Enabled), 5, 0), true);
      edtDevEmphhsa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmphhsa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmphhsa_Enabled), 5, 0), true);
      edtDevEmpCTrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpCTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpCTrn_Enabled), 5, 0), true);
      edtDevEmpNTrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpNTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpNTrn_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDevEmpObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpObs_Enabled), 5, 0), true);
   }

   public void zmUG909( int GX_JID )
   {
      if ( ( GX_JID == 34 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6244DevEmpUni = T00UG3_A6244DevEmpUni[0] ;
            Z6245DevEmpPie = T00UG3_A6245DevEmpPie[0] ;
            Z6246DevEmpEst = T00UG3_A6246DevEmpEst[0] ;
            Z44AlbRecCod = T00UG3_A44AlbRecCod[0] ;
         }
         else
         {
            Z6244DevEmpUni = A6244DevEmpUni ;
            Z6245DevEmpPie = A6245DevEmpPie ;
            Z6246DevEmpEst = A6246DevEmpEst ;
            Z44AlbRecCod = A44AlbRecCod ;
         }
      }
      if ( ( GX_JID == 35 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T00UG5_A47AlbREst[0] ;
         Z45AlbRef = T00UG5_A45AlbRef[0] ;
         Z3613AlbRefDsc = T00UG5_A3613AlbRefDsc[0] ;
         Z52AlbRPieEnt = T00UG5_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T00UG5_A58AlbRUniEnt[0] ;
      }
      if ( GX_JID == -34 )
      {
         Z6235DevEmpCod = A6235DevEmpCod ;
         Z6243DevNumLin = A6243DevNumLin ;
         Z6244DevEmpUni = A6244DevEmpUni ;
         Z6245DevEmpPie = A6245DevEmpPie ;
         Z6246DevEmpEst = A6246DevEmpEst ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z47AlbREst = A47AlbREst ;
         Z45AlbRef = A45AlbRef ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
      }
   }

   public void standaloneNotModalUG909( )
   {
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDevUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevUltLin_Enabled), 5, 0), true);
      edtDevUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevUltLin_Enabled), 5, 0), true);
   }

   public void standaloneModalUG909( )
   {
      if ( isIns( )  )
      {
         A6236DevUltLin = (short)(O6236DevUltLin+1) ;
         n6236DevUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A6243DevNumLin = (byte)(A6236DevUltLin) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDevNumLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevNumLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtDevNumLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevNumLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void loadUG909( )
   {
      /* Using cursor T00UG24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod), Byte.valueOf(A6243DevNumLin)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound909 = (short)(1) ;
         A54AlbRPieUti = T00UG24_A54AlbRPieUti[0] ;
         A60AlbRUniUti = T00UG24_A60AlbRUniUti[0] ;
         A47AlbREst = T00UG24_A47AlbREst[0] ;
         A45AlbRef = T00UG24_A45AlbRef[0] ;
         A3613AlbRefDsc = T00UG24_A3613AlbRefDsc[0] ;
         A52AlbRPieEnt = T00UG24_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T00UG24_A58AlbRUniEnt[0] ;
         A6244DevEmpUni = T00UG24_A6244DevEmpUni[0] ;
         n6244DevEmpUni = T00UG24_n6244DevEmpUni[0] ;
         A6245DevEmpPie = T00UG24_A6245DevEmpPie[0] ;
         n6245DevEmpPie = T00UG24_n6245DevEmpPie[0] ;
         A6246DevEmpEst = T00UG24_A6246DevEmpEst[0] ;
         n6246DevEmpEst = T00UG24_n6246DevEmpEst[0] ;
         A44AlbRecCod = T00UG24_A44AlbRecCod[0] ;
         n44AlbRecCod = T00UG24_n44AlbRecCod[0] ;
         zmUG909( -34) ;
      }
      pr_default.close(22);
      onLoadActionsUG909( ) ;
   }

   public void onLoadActionsUG909( )
   {
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O6245DevEmpPie) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A6245DevEmpPie-O6245DevEmpPie) ;
         }
      }
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O6244DevEmpUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A6244DevEmpUni).subtract(O6244DevEmpUni) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
      }
      if ( true )
      {
         AV33AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV33AlbRUniDis = AV35AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV38Kilos = A6244DevEmpUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Kilos", GXutil.ltrimstr( AV38Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV39Metros = A6244DevEmpUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Metros", GXutil.ltrimstr( AV39Metros, 9, 2));
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV41KilAnt = O6244DevEmpUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41KilAnt", GXutil.ltrimstr( AV41KilAnt, 9, 2));
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV42MetAnt = O6244DevEmpUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42MetAnt", GXutil.ltrimstr( AV42MetAnt, 9, 2));
      }
      if ( true )
      {
         AV32AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV32AlbRPieDis = AV34AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
         }
      }
      AV40Piezas = A6245DevEmpPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Piezas), 6, 0));
      AV43PieAnt = O6245DevEmpPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43PieAnt), 6, 0));
   }

   public void checkExtendedTableUG909( )
   {
      nIsDirty_909 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalUG909( ) ;
      /* Using cursor T00UG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A54AlbRPieUti = T00UG5_A54AlbRPieUti[0] ;
      A60AlbRUniUti = T00UG5_A60AlbRUniUti[0] ;
      A47AlbREst = T00UG5_A47AlbREst[0] ;
      A45AlbRef = T00UG5_A45AlbRef[0] ;
      A3613AlbRefDsc = T00UG5_A3613AlbRefDsc[0] ;
      A52AlbRPieEnt = T00UG5_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T00UG5_A58AlbRUniEnt[0] ;
      nIsDirty_909 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      nIsDirty_909 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      pr_default.close(3);
      if ( isDlt( )  )
      {
         nIsDirty_909 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-O6245DevEmpPie) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_909 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A6245DevEmpPie-O6245DevEmpPie) ;
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_909 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(O6244DevEmpUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_909 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.add(A6244DevEmpUni).subtract(O6244DevEmpUni) ;
         }
      }
      nIsDirty_909 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_909 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_909 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            nIsDirty_909 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         nIsDirty_909 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            nIsDirty_909 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
         }
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A44AlbRecCod ;
         GXv_int6[0] = AV32AlbRPieDis ;
         GXv_decimal7[0] = AV33AlbRUniDis ;
         GXv_int8[0] = AV34AlbRPDis ;
         GXv_decimal9[0] = AV35AlbRUDis ;
         GXv_char3[0] = AV36AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_decimal7, GXv_int8, GXv_decimal9, GXv_char3) ;
         tdevemp_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevemp_impl.this.A44AlbRecCod = GXv_int5[0] ;
         tdevemp_impl.this.AV32AlbRPieDis = GXv_int6[0] ;
         tdevemp_impl.this.AV33AlbRUniDis = GXv_decimal7[0] ;
         tdevemp_impl.this.AV34AlbRPDis = GXv_int8[0] ;
         tdevemp_impl.this.AV35AlbRUDis = GXv_decimal9[0] ;
         tdevemp_impl.this.AV36AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV34AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35AlbRUDis", GXutil.ltrimstr( AV35AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV36AlbRUni", AV36AlbRUni);
      }
      if ( true )
      {
         AV33AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV33AlbRUniDis = AV35AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV38Kilos = A6244DevEmpUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Kilos", GXutil.ltrimstr( AV38Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV39Metros = A6244DevEmpUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Metros", GXutil.ltrimstr( AV39Metros, 9, 2));
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV41KilAnt = O6244DevEmpUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41KilAnt", GXutil.ltrimstr( AV41KilAnt, 9, 2));
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV42MetAnt = O6244DevEmpUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42MetAnt", GXutil.ltrimstr( AV42MetAnt, 9, 2));
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         GXCCtl = "DEVEMPUNI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true )
      {
         AV32AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV32AlbRPieDis = AV34AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
         }
      }
      AV40Piezas = A6245DevEmpPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Piezas), 6, 0));
      AV43PieAnt = O6245DevEmpPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43PieAnt), 6, 0));
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         GXCCtl = "DEVEMPPIE_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsUG909( )
   {
      pr_default.close(2);
   }

   public void enableDisableUG909( )
   {
   }

   public void gxload_35( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T00UG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A54AlbRPieUti = T00UG5_A54AlbRPieUti[0] ;
      A60AlbRUniUti = T00UG5_A60AlbRUniUti[0] ;
      A47AlbREst = T00UG5_A47AlbREst[0] ;
      A45AlbRef = T00UG5_A45AlbRef[0] ;
      A3613AlbRefDsc = T00UG5_A3613AlbRefDsc[0] ;
      A52AlbRPieEnt = T00UG5_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T00UG5_A58AlbRUniEnt[0] ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O54AlbRPieUti = A54AlbRPieUti ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKeyUG909( )
   {
      /* Using cursor T00UG25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod), Byte.valueOf(A6243DevNumLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound909 = (short)(1) ;
      }
      else
      {
         RcdFound909 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKeyUG909( )
   {
      /* Using cursor T00UG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod), Byte.valueOf(A6243DevNumLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00UG3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmUG909( 34) ;
         RcdFound909 = (short)(1) ;
         initializeNonKeyUG909( ) ;
         A6243DevNumLin = T00UG3_A6243DevNumLin[0] ;
         A6244DevEmpUni = T00UG3_A6244DevEmpUni[0] ;
         n6244DevEmpUni = T00UG3_n6244DevEmpUni[0] ;
         A6245DevEmpPie = T00UG3_A6245DevEmpPie[0] ;
         n6245DevEmpPie = T00UG3_n6245DevEmpPie[0] ;
         A6246DevEmpEst = T00UG3_A6246DevEmpEst[0] ;
         n6246DevEmpEst = T00UG3_n6246DevEmpEst[0] ;
         A44AlbRecCod = T00UG3_A44AlbRecCod[0] ;
         n44AlbRecCod = T00UG3_n44AlbRecCod[0] ;
         O6244DevEmpUni = A6244DevEmpUni ;
         n6244DevEmpUni = false ;
         O6245DevEmpPie = A6245DevEmpPie ;
         n6245DevEmpPie = false ;
         Z396EmprCod = A396EmprCod ;
         Z6235DevEmpCod = A6235DevEmpCod ;
         Z6243DevNumLin = A6243DevNumLin ;
         sMode909 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalUG909( ) ;
         loadUG909( ) ;
         Gx_mode = sMode909 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound909 = (short)(0) ;
         initializeNonKeyUG909( ) ;
         sMode909 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalUG909( ) ;
         Gx_mode = sMode909 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesUG909( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyUG909( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00UG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod), Byte.valueOf(A6243DevNumLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVEM1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6244DevEmpUni, T00UG2_A6244DevEmpUni[0]) != 0 ) || ( Z6245DevEmpPie != T00UG2_A6245DevEmpPie[0] ) || ( Z6246DevEmpEst != T00UG2_A6246DevEmpEst[0] ) || ( Z44AlbRecCod != T00UG2_A44AlbRecCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6244DevEmpUni, T00UG2_A6244DevEmpUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"DevEmpUni");
               GXutil.writeLogRaw("Old: ",Z6244DevEmpUni);
               GXutil.writeLogRaw("Current: ",T00UG2_A6244DevEmpUni[0]);
            }
            if ( Z6245DevEmpPie != T00UG2_A6245DevEmpPie[0] )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"DevEmpPie");
               GXutil.writeLogRaw("Old: ",Z6245DevEmpPie);
               GXutil.writeLogRaw("Current: ",T00UG2_A6245DevEmpPie[0]);
            }
            if ( Z6246DevEmpEst != T00UG2_A6246DevEmpEst[0] )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"DevEmpEst");
               GXutil.writeLogRaw("Old: ",Z6246DevEmpEst);
               GXutil.writeLogRaw("Current: ",T00UG2_A6246DevEmpEst[0]);
            }
            if ( Z44AlbRecCod != T00UG2_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T00UG2_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVEM1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T00UG26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(24) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( Z47AlbREst != T00UG26_A47AlbREst[0] ) || ( GXutil.strcmp(Z45AlbRef, T00UG26_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z3613AlbRefDsc, T00UG26_A3613AlbRefDsc[0]) != 0 ) || ( Z52AlbRPieEnt != T00UG26_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T00UG26_A58AlbRUniEnt[0]) != 0 ) )
         {
            if ( Z47AlbREst != T00UG26_A47AlbREst[0] )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T00UG26_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T00UG26_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T00UG26_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T00UG26_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T00UG26_A3613AlbRefDsc[0]);
            }
            if ( Z52AlbRPieEnt != T00UG26_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T00UG26_A52AlbRPieEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T00UG26_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdevemp:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T00UG26_A58AlbRUniEnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertUG909( )
   {
      beforeValidateUG909( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUG909( ) ;
      }
      if ( AnyError == 0 )
      {
         zmUG909( 0) ;
         checkOptimisticConcurrencyUG909( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUG909( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertUG909( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UG27 */
                  pr_default.execute(25, new Object[] {Integer.valueOf(A6235DevEmpCod), Byte.valueOf(A6243DevNumLin), Boolean.valueOf(n6244DevEmpUni), A6244DevEmpUni, Boolean.valueOf(n6245DevEmpPie), Short.valueOf(A6245DevEmpPie), Boolean.valueOf(n6246DevEmpEst), Byte.valueOf(A6246DevEmpEst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVEM1");
                  if ( (pr_default.getStatus(25) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN1UG909( ) ;
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
            loadUG909( ) ;
         }
         endLevelUG909( ) ;
      }
      closeExtendedTableCursorsUG909( ) ;
   }

   public void updateUG909( )
   {
      beforeValidateUG909( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUG909( ) ;
      }
      if ( ( nIsMod_909 != 0 ) || ( nIsDirty_909 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyUG909( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmUG909( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateUG909( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00UG28 */
                     pr_default.execute(26, new Object[] {Boolean.valueOf(n6244DevEmpUni), A6244DevEmpUni, Boolean.valueOf(n6245DevEmpPie), Short.valueOf(A6245DevEmpPie), Boolean.valueOf(n6246DevEmpEst), Byte.valueOf(A6246DevEmpEst), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A6235DevEmpCod), Byte.valueOf(A6243DevNumLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVEM1");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVEM1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateUG909( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN1UG909( ) ;
                           getByPrimaryKeyUG909( ) ;
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
            endLevelUG909( ) ;
         }
      }
      closeExtendedTableCursorsUG909( ) ;
   }

   public void deferredUpdateUG909( )
   {
   }

   public void deleteUG909( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateUG909( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUG909( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsUG909( ) ;
         afterConfirmUG909( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteUG909( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00UG29 */
               pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod), Byte.valueOf(A6243DevNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVEM1");
               if ( AnyError == 0 )
               {
                  updateTablesN1UG909( ) ;
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
      sMode909 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelUG909( ) ;
      Gx_mode = sMode909 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsUG909( )
   {
      standaloneModalUG909( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00UG30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T00UG30_A47AlbREst[0] ;
         Z45AlbRef = T00UG30_A45AlbRef[0] ;
         Z3613AlbRefDsc = T00UG30_A3613AlbRefDsc[0] ;
         Z52AlbRPieEnt = T00UG30_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T00UG30_A58AlbRUniEnt[0] ;
         A54AlbRPieUti = T00UG30_A54AlbRPieUti[0] ;
         A60AlbRUniUti = T00UG30_A60AlbRUniUti[0] ;
         A47AlbREst = T00UG30_A47AlbREst[0] ;
         A45AlbRef = T00UG30_A45AlbRef[0] ;
         A3613AlbRefDsc = T00UG30_A3613AlbRefDsc[0] ;
         A52AlbRPieEnt = T00UG30_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T00UG30_A58AlbRUniEnt[0] ;
         O60AlbRUniUti = A60AlbRUniUti ;
         O54AlbRPieUti = A54AlbRPieUti ;
         pr_default.close(28);
         if ( true )
         {
            AV33AlbRUniDis = A57AlbRUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
         }
         else
         {
            if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
            {
               AV33AlbRUniDis = AV35AlbRUDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
            }
         }
         if ( isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O6244DevEmpUni) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A6244DevEmpUni).subtract(O6244DevEmpUni) ;
            }
         }
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV38Kilos = A6244DevEmpUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Kilos", GXutil.ltrimstr( AV38Kilos, 9, 2));
         }
         if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV39Metros = A6244DevEmpUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Metros", GXutil.ltrimstr( AV39Metros, 9, 2));
         }
         if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV41KilAnt = O6244DevEmpUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41KilAnt", GXutil.ltrimstr( AV41KilAnt, 9, 2));
         }
         if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV42MetAnt = O6244DevEmpUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42MetAnt", GXutil.ltrimstr( AV42MetAnt, 9, 2));
         }
         if ( true )
         {
            AV32AlbRPieDis = A51AlbRPieDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
         }
         else
         {
            if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
            {
               AV32AlbRPieDis = AV34AlbRPDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
            }
         }
         if ( isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-O6245DevEmpPie) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A6245DevEmpPie-O6245DevEmpPie) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         else
         {
            if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
            {
               A47AlbREst = (byte)(0) ;
            }
         }
         AV40Piezas = A6245DevEmpPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Piezas), 6, 0));
         AV43PieAnt = O6245DevEmpPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43PieAnt), 6, 0));
      }
   }

   public void updateTablesN1UG909( )
   {
      /* Using cursor T00UG31 */
      pr_default.execute(29, new Object[] {Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevelUG909( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(24);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartUG909( )
   {
      /* Scan By routine */
      /* Using cursor T00UG32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A6235DevEmpCod)});
      RcdFound909 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound909 = (short)(1) ;
         A6243DevNumLin = T00UG32_A6243DevNumLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextUG909( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound909 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound909 = (short)(1) ;
         A6243DevNumLin = T00UG32_A6243DevNumLin[0] ;
      }
   }

   public void scanEndUG909( )
   {
      pr_default.close(30);
   }

   public void afterConfirmUG909( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertUG909( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateUG909( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteUG909( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteUG909( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateUG909( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesUG909( )
   {
      edtDevNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevNumLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
      edtDevEmpUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpUni_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDevEmpPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpPie_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDevEmpEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEmpEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEmpEst_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashesUG909( )
   {
   }

   public void send_integrity_lvl_hashesUG908( )
   {
   }

   public void subsflControlProps_80909( )
   {
      edtavnRcdDeleted_909_Internalname = "vNRCDDELETED_909_"+sGXsfl_80_idx ;
      edtDevNumLin_Internalname = "DEVNUMLIN_"+sGXsfl_80_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_80_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_80_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_80_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_80_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_80_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_80_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_80_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_80_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_80_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_80_idx );
      edtDevEmpUni_Internalname = "DEVEMPUNI_"+sGXsfl_80_idx ;
      edtDevEmpPie_Internalname = "DEVEMPPIE_"+sGXsfl_80_idx ;
      edtDevEmpEst_Internalname = "DEVEMPEST_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_80909( )
   {
      edtavnRcdDeleted_909_Internalname = "vNRCDDELETED_909_"+sGXsfl_80_fel_idx ;
      edtDevNumLin_Internalname = "DEVNUMLIN_"+sGXsfl_80_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_80_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_80_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_80_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_80_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_80_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_80_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_80_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_80_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_80_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_80_fel_idx );
      edtDevEmpUni_Internalname = "DEVEMPUNI_"+sGXsfl_80_fel_idx ;
      edtDevEmpPie_Internalname = "DEVEMPPIE_"+sGXsfl_80_fel_idx ;
      edtDevEmpEst_Internalname = "DEVEMPEST_"+sGXsfl_80_fel_idx ;
   }

   public void addRowUG909( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_80909( ) ;
      sendRowUG909( ) ;
   }

   public void sendRowUG909( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_909_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_909_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_909_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_909), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_909), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_909_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_909_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_909_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevNumLin_Internalname,GXutil.ltrim( localUtil.ntoc( A6243DevNumLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6243DevNumLin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevNumLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevNumLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_909_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRefDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieDis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniUti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieUti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieEnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "ALBREST_" + sGXsfl_80_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbAlbREst.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_80_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_909_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevEmpUni_Internalname,GXutil.ltrim( localUtil.ntoc( A6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevEmpUni_Enabled!=0) ? localUtil.format( A6244DevEmpUni, "ZZZZZ9.99") : localUtil.format( A6244DevEmpUni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevEmpUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevEmpUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_909_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevEmpPie_Internalname,GXutil.ltrim( localUtil.ntoc( A6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevEmpPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6245DevEmpPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6245DevEmpPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevEmpPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevEmpPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_909_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevEmpEst_Internalname,GXutil.ltrim( localUtil.ntoc( A6246DevEmpEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevEmpEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6246DevEmpEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A6246DevEmpEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevEmpEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevEmpEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesUG909( ) ;
      GXCCtl = "Z6243DevNumLin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6243DevNumLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6244DevEmpUni_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6245DevEmpPie_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6246DevEmpEst_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6246DevEmpEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z47AlbREst_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z45AlbRef_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z45AlbRef));
      GXCCtl = "Z3613AlbRefDsc_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3613AlbRefDsc));
      GXCCtl = "Z52AlbRPieEnt_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z58AlbRUniEnt_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6244DevEmpUni_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6244DevEmpUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6245DevEmpPie_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6245DevEmpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O60AlbRUniUti_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O54AlbRPieUti_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_909_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_909_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_909_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_909, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_909_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_909_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVNUMLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevNumLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREF_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREFDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVEMPUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVEMPPIE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVEMPEST_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowUG909( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_80909( ) ;
      edtavnRcdDeleted_909_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_909_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevNumLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVNUMLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREF_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREFDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtDevEmpUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVEMPUNI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevEmpPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVEMPPIE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevEmpEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVEMPEST_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_909_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_909_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_909");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_909_Internalname ;
         wbErr = true ;
         nRcdDeleted_909 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_909 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_909_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "DEVNUMLIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevNumLin_Internalname ;
         wbErr = true ;
         A6243DevNumLin = (byte)(0) ;
      }
      else
      {
         A6243DevNumLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         wbErr = true ;
         A44AlbRecCod = 0 ;
         n44AlbRecCod = false ;
      }
      else
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n44AlbRecCod = false ;
      }
      A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
      A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
      A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
      A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
      A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
      cmbAlbREst.setName( cmbAlbREst.getInternalname() );
      cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
      A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevEmpUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevEmpUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DEVEMPUNI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpUni_Internalname ;
         wbErr = true ;
         A6244DevEmpUni = DecimalUtil.ZERO ;
         n6244DevEmpUni = false ;
      }
      else
      {
         A6244DevEmpUni = localUtil.ctond( httpContext.cgiGet( edtDevEmpUni_Internalname)) ;
         n6244DevEmpUni = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevEmpPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevEmpPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DEVEMPPIE_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpPie_Internalname ;
         wbErr = true ;
         A6245DevEmpPie = (short)(0) ;
         n6245DevEmpPie = false ;
      }
      else
      {
         A6245DevEmpPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDevEmpPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6245DevEmpPie = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevEmpEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevEmpEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "DEVEMPEST_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpEst_Internalname ;
         wbErr = true ;
         A6246DevEmpEst = (byte)(0) ;
         n6246DevEmpEst = false ;
      }
      else
      {
         A6246DevEmpEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevEmpEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6246DevEmpEst = false ;
      }
      GXCCtl = "Z6243DevNumLin_" + sGXsfl_80_idx ;
      Z6243DevNumLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6244DevEmpUni_" + sGXsfl_80_idx ;
      Z6244DevEmpUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6245DevEmpPie_" + sGXsfl_80_idx ;
      Z6245DevEmpPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6246DevEmpEst_" + sGXsfl_80_idx ;
      Z6246DevEmpEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_80_idx ;
      Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z47AlbREst_" + sGXsfl_80_idx ;
      Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z45AlbRef_" + sGXsfl_80_idx ;
      Z45AlbRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3613AlbRefDsc_" + sGXsfl_80_idx ;
      Z3613AlbRefDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z52AlbRPieEnt_" + sGXsfl_80_idx ;
      Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z58AlbRUniEnt_" + sGXsfl_80_idx ;
      Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O6244DevEmpUni_" + sGXsfl_80_idx ;
      O6244DevEmpUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O6245DevEmpPie_" + sGXsfl_80_idx ;
      O6245DevEmpPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O60AlbRUniUti_" + sGXsfl_80_idx ;
      O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O54AlbRPieUti_" + sGXsfl_80_idx ;
      O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_909_" + sGXsfl_80_idx ;
      nRcdDeleted_909 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_909_" + sGXsfl_80_idx ;
      nRcdExists_909 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_909_" + sGXsfl_80_idx ;
      nIsMod_909 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRPieUti_Enabled = edtAlbRPieUti_Enabled ;
      defedtAlbRUniUti_Enabled = edtAlbRUniUti_Enabled ;
      defedtDevNumLin_Enabled = edtDevNumLin_Enabled ;
   }

   public void confirmValuesUG0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_80909( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_80909( ) ;
         httpContext.changePostValue( "Z6243DevNumLin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z6243DevNumLin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6243DevNumLin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z6244DevEmpUni_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z6244DevEmpUni_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6244DevEmpUni_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z6245DevEmpPie_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z6245DevEmpPie_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6245DevEmpPie_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z6246DevEmpEst_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z6246DevEmpEst_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6246DevEmpEst_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z44AlbRecCod_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z44AlbRecCod_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z47AlbREst_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z47AlbREst_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z45AlbRef_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z45AlbRef_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z3613AlbRefDsc_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z52AlbRPieEnt_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z58AlbRUniEnt_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_80_idx) ;
      }
      httpContext.changePostValue( "O6244DevEmpUni", httpContext.cgiGet( "T6244DevEmpUni")) ;
      httpContext.deletePostValue( "T6244DevEmpUni") ;
      httpContext.changePostValue( "O6245DevEmpPie", httpContext.cgiGet( "T6245DevEmpPie")) ;
      httpContext.deletePostValue( "T6245DevEmpPie") ;
      httpContext.changePostValue( "O60AlbRUniUti", httpContext.cgiGet( "T60AlbRUniUti")) ;
      httpContext.deletePostValue( "T60AlbRUniUti") ;
      httpContext.changePostValue( "O54AlbRPieUti", httpContext.cgiGet( "T54AlbRPieUti")) ;
      httpContext.deletePostValue( "T54AlbRPieUti") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdevemp", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDEVEMP");
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV37Modo, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdevemp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6235DevEmpCod", GXutil.ltrim( localUtil.ntoc( Z6235DevEmpCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6236DevUltLin", GXutil.ltrim( localUtil.ntoc( Z6236DevUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6237DevEmpFec", localUtil.dtoc( Z6237DevEmpFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6238DevEmpMtr", GXutil.rtrim( Z6238DevEmpMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6239DevEmphhsa", localUtil.ttoc( Z6239DevEmphhsa, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6240DevEmpCTrn", GXutil.ltrim( localUtil.ntoc( Z6240DevEmpCTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6236DevUltLin", GXutil.ltrim( localUtil.ntoc( O6236DevUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV37Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV37Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV32AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV33AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEZAS", GXutil.ltrim( localUtil.ntoc( AV40Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEANT", GXutil.ltrim( localUtil.ntoc( AV43PieAnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV38Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV39Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV41KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETANT", GXutil.ltrim( localUtil.ntoc( AV42MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNI", GXutil.rtrim( AV36AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPDIS", GXutil.ltrim( localUtil.ntoc( AV34AlbRPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUDIS", GXutil.ltrim( localUtil.ntoc( AV35AlbRUDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdevemp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDEVEMP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DEVOLUCION EMPESAS", "") ;
   }

   public void initializeNonKeyUG908( )
   {
      AV37Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
      A6236DevUltLin = (short)(0) ;
      n6236DevUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      A6238DevEmpMtr = "" ;
      n6238DevEmpMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6238DevEmpMtr", A6238DevEmpMtr);
      A6240DevEmpCTrn = (short)(0) ;
      n6240DevEmpCTrn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6240DevEmpCTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6240DevEmpCTrn), 4, 0));
      A6241DevEmpNTrn = "" ;
      n6241DevEmpNTrn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6241DevEmpNTrn", A6241DevEmpNTrn);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A6242DevEmpObs = "" ;
      n6242DevEmpObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6242DevEmpObs", A6242DevEmpObs);
      A6237DevEmpFec = GXutil.today( ) ;
      n6237DevEmpFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
      A6239DevEmphhsa = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n6239DevEmphhsa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6239DevEmphhsa", localUtil.ttoc( A6239DevEmphhsa, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      O6236DevUltLin = A6236DevUltLin ;
      n6236DevUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
      Z6236DevUltLin = (short)(0) ;
      Z6237DevEmpFec = GXutil.nullDate() ;
      Z6238DevEmpMtr = "" ;
      Z6239DevEmphhsa = GXutil.resetTime( GXutil.nullDate() );
      Z252CliCod = 0 ;
      Z6240DevEmpCTrn = (short)(0) ;
   }

   public void initAllUG908( )
   {
      A6235DevEmpCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
      initializeNonKeyUG908( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV37Modo = iV37Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
      A6237DevEmpFec = i6237DevEmpFec ;
      n6237DevEmpFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
      A6239DevEmphhsa = i6239DevEmphhsa ;
      n6239DevEmphhsa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6239DevEmphhsa", localUtil.ttoc( A6239DevEmphhsa, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void initializeNonKeyUG909( )
   {
      AV32AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
      AV33AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
      AV36AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbRUni", AV36AlbRUni);
      AV34AlbRPDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34AlbRPDis), 6, 0));
      AV35AlbRUDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35AlbRUDis", GXutil.ltrimstr( AV35AlbRUDis, 9, 2));
      A54AlbRPieUti = 0 ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A47AlbREst = (byte)(0) ;
      AV40Piezas = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Piezas), 6, 0));
      AV43PieAnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43PieAnt), 6, 0));
      A51AlbRPieDis = 0 ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A52AlbRPieEnt = 0 ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A6244DevEmpUni = DecimalUtil.ZERO ;
      n6244DevEmpUni = false ;
      A6245DevEmpPie = (short)(0) ;
      n6245DevEmpPie = false ;
      A6246DevEmpEst = (byte)(0) ;
      n6246DevEmpEst = false ;
      AV38Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Kilos", GXutil.ltrimstr( AV38Kilos, 9, 2));
      AV39Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Metros", GXutil.ltrimstr( AV39Metros, 9, 2));
      AV41KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41KilAnt", GXutil.ltrimstr( AV41KilAnt, 9, 2));
      AV42MetAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42MetAnt", GXutil.ltrimstr( AV42MetAnt, 9, 2));
      O6244DevEmpUni = A6244DevEmpUni ;
      n6244DevEmpUni = false ;
      O6245DevEmpPie = A6245DevEmpPie ;
      n6245DevEmpPie = false ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O54AlbRPieUti = A54AlbRPieUti ;
      Z6244DevEmpUni = DecimalUtil.ZERO ;
      Z6245DevEmpPie = (short)(0) ;
      Z6246DevEmpEst = (byte)(0) ;
      Z44AlbRecCod = 0 ;
      Z47AlbREst = (byte)(0) ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
   }

   public void initAllUG909( )
   {
      A6243DevNumLin = (byte)(0) ;
      initializeNonKeyUG909( ) ;
   }

   public void standaloneModalInsertUG909( )
   {
      A6236DevUltLin = i6236DevUltLin ;
      n6236DevUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6236DevUltLin), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824153139", true, true);
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
      httpContext.AddJavascriptSource("tdevemp.js", "?2026824153139", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties909( )
   {
      edtAlbRPieUti_Enabled = defedtAlbRPieUti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAlbRUniUti_Enabled = defedtAlbRUniUti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDevNumLin_Enabled = defedtDevNumLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevNumLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_909, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_909_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6243DevNumLin, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevNumLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6244DevEmpUni, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6245DevEmpPie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6246DevEmpEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevEmpEst_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDevEmpCod_Internalname = "DEVEMPCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDevUltLin_Internalname = "DEVULTLIN" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDevEmpFec_Internalname = "DEVEMPFEC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDevEmpMtr_Internalname = "DEVEMPMTR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDevEmphhsa_Internalname = "DEVEMPHHSA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDevEmpCTrn_Internalname = "DEVEMPCTRN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDevEmpNTrn_Internalname = "DEVEMPNTRN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDevEmpObs_Internalname = "DEVEMPOBS" ;
      edtavnRcdDeleted_909_Internalname = "vNRCDDELETED_909" ;
      edtDevNumLin_Internalname = "DEVNUMLIN" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      edtDevEmpUni_Internalname = "DEVEMPUNI" ;
      edtDevEmpPie_Internalname = "DEVEMPPIE" ;
      edtDevEmpEst_Internalname = "DEVEMPEST" ;
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
      Form.setCaption( httpContext.getMessage( "DEVOLUCION EMPESAS", "") );
      edtDevEmpEst_Jsonclick = "" ;
      edtDevEmpPie_Jsonclick = "" ;
      edtDevEmpUni_Jsonclick = "" ;
      cmbAlbREst.setJsonclick( "" );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtDevNumLin_Jsonclick = "" ;
      edtavnRcdDeleted_909_Jsonclick = "" ;
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
      edtDevEmpEst_Enabled = 1 ;
      edtDevEmpPie_Enabled = 1 ;
      edtDevEmpUni_Enabled = 1 ;
      cmbAlbREst.setEnabled( 0 );
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRef_Enabled = 0 ;
      edtAlbRecCod_Enabled = 1 ;
      edtDevNumLin_Enabled = 1 ;
      edtavnRcdDeleted_909_Enabled = 1 ;
      edtDevEmpObs_Backcolor = (int)(0xFFFFFF) ;
      edtDevEmpObs_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtDevEmpNTrn_Jsonclick = "" ;
      edtDevEmpNTrn_Backcolor = (int)(0xFFFFFF) ;
      edtDevEmpNTrn_Enabled = 0 ;
      edtDevEmpCTrn_Jsonclick = "" ;
      edtDevEmpCTrn_Backcolor = (int)(0xFFFFFF) ;
      edtDevEmpCTrn_Enabled = 1 ;
      edtDevEmphhsa_Jsonclick = "" ;
      edtDevEmphhsa_Backcolor = (int)(0xFFFFFF) ;
      edtDevEmphhsa_Enabled = 1 ;
      edtDevEmpMtr_Jsonclick = "" ;
      edtDevEmpMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDevEmpMtr_Enabled = 1 ;
      edtDevEmpFec_Jsonclick = "" ;
      edtDevEmpFec_Backcolor = (int)(0xFFFFFF) ;
      edtDevEmpFec_Enabled = 1 ;
      edtDevUltLin_Jsonclick = "" ;
      edtDevUltLin_Backcolor = (int)(0xFFFFFF) ;
      edtDevUltLin_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDevEmpCod_Jsonclick = "" ;
      edtDevEmpCod_Backcolor = (int)(0xFFFFFF) ;
      edtDevEmpCod_Enabled = 1 ;
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

   public void xc_7_UG908( String A396EmprCod ,
                           int A6235DevEmpCod ,
                           java.util.Date A6237DevEmpFec )
   {
      if ( (0==A6235DevEmpCod) && true /* After */ && true /* Level */ )
      {
         GXv_int8[0] = A6235DevEmpCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         A6235DevEmpCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6235DevEmpCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6235DevEmpCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6235DevEmpCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_27_UG909( String A396EmprCod ,
                            int A44AlbRecCod ,
                            String AV36AlbRUni )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_int6[0] = AV32AlbRPieDis ;
         GXv_decimal9[0] = AV33AlbRUniDis ;
         GXv_int5[0] = AV34AlbRPDis ;
         GXv_decimal7[0] = AV35AlbRUDis ;
         GXv_char3[0] = AV36AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_decimal9, GXv_int5, GXv_decimal7, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int8[0] ;
         AV32AlbRPieDis = GXv_int6[0] ;
         AV33AlbRUniDis = GXv_decimal9[0] ;
         AV34AlbRPDis = GXv_int5[0] ;
         AV35AlbRUDis = GXv_decimal7[0] ;
         AV36AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrimstr( AV33AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV34AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35AlbRUDis", GXutil.ltrimstr( AV35AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV36AlbRUni", AV36AlbRUni);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32AlbRPieDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33AlbRUniDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV34AlbRPDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35AlbRUDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV36AlbRUni))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_80909( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalUG909( ) ;
         standaloneModalUG909( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowUG909( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_80909( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALBREST_" + sGXsfl_80_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00UG33 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00UG33_A407EmprNom[0] ;
      n407EmprNom = T00UG33_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(31);
      GX_FocusControl = edtDevEmpFec_Internalname ;
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

   public void valid_Devempcod( )
   {
      n6236DevUltLin = false ;
      n6237DevEmpFec = false ;
      n6239DevEmphhsa = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6236DevUltLin", GXutil.ltrim( localUtil.ntoc( A6236DevUltLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6237DevEmpFec", localUtil.format(A6237DevEmpFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6238DevEmpMtr", GXutil.rtrim( A6238DevEmpMtr));
      httpContext.ajax_rsp_assign_attri("", false, "A6239DevEmphhsa", localUtil.ttoc( A6239DevEmphhsa, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6240DevEmpCTrn", GXutil.ltrim( localUtil.ntoc( A6240DevEmpCTrn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6242DevEmpObs", A6242DevEmpObs);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", GXutil.rtrim( AV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6241DevEmpNTrn", GXutil.rtrim( A6241DevEmpNTrn));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6235DevEmpCod", GXutil.ltrim( localUtil.ntoc( Z6235DevEmpCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6236DevUltLin", GXutil.ltrim( localUtil.ntoc( Z6236DevUltLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6237DevEmpFec", localUtil.format(Z6237DevEmpFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6238DevEmpMtr", GXutil.rtrim( Z6238DevEmpMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6239DevEmphhsa", localUtil.ttoc( Z6239DevEmphhsa, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6240DevEmpCTrn", GXutil.ltrim( localUtil.ntoc( Z6240DevEmpCTrn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6242DevEmpObs", Z6242DevEmpObs);
      app.GxWebStd.gx_hidden_field( httpContext, "ZV8UsurCod", GXutil.rtrim( ZV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6241DevEmpNTrn", GXutil.rtrim( Z6241DevEmpNTrn));
      httpContext.ajax_rsp_assign_attri("", false, "O6236DevUltLin", GXutil.ltrim( localUtil.ntoc( O6236DevUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Devempctrn( )
   {
      n6240DevEmpCTrn = false ;
      n6241DevEmpNTrn = false ;
      /* Using cursor T00UG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n6240DevEmpCTrn), Short.valueOf(A6240DevEmpCTrn)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevEmp", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVEMPCTRN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpCTrn_Internalname ;
      }
      A6241DevEmpNTrn = T00UG20_A6241DevEmpNTrn[0] ;
      n6241DevEmpNTrn = T00UG20_n6241DevEmpNTrn[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6241DevEmpNTrn", GXutil.rtrim( A6241DevEmpNTrn));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T00UG21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T00UG21_A279CliNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      /* Using cursor T00UG30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T00UG30_A47AlbREst[0] ;
      Z45AlbRef = T00UG30_A45AlbRef[0] ;
      Z3613AlbRefDsc = T00UG30_A3613AlbRefDsc[0] ;
      Z52AlbRPieEnt = T00UG30_A52AlbRPieEnt[0] ;
      Z58AlbRUniEnt = T00UG30_A58AlbRUniEnt[0] ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A54AlbRPieUti = T00UG30_A54AlbRPieUti[0] ;
      A60AlbRUniUti = T00UG30_A60AlbRUniUti[0] ;
      A47AlbREst = T00UG30_A47AlbREst[0] ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A45AlbRef = T00UG30_A45AlbRef[0] ;
      A3613AlbRefDsc = T00UG30_A3613AlbRefDsc[0] ;
      A52AlbRPieEnt = T00UG30_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T00UG30_A58AlbRUniEnt[0] ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O54AlbRPieUti = A54AlbRPieUti ;
      pr_default.close(28);
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_int6[0] = AV32AlbRPieDis ;
         GXv_decimal9[0] = AV33AlbRUniDis ;
         GXv_int5[0] = AV34AlbRPDis ;
         GXv_decimal7[0] = AV35AlbRUDis ;
         GXv_char3[0] = AV36AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_decimal9, GXv_int5, GXv_decimal7, GXv_char3) ;
         tdevemp_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevemp_impl.this.A44AlbRecCod = GXv_int8[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         tdevemp_impl.this.AV32AlbRPieDis = GXv_int6[0] ;
         AV32AlbRPieDis = this.AV32AlbRPieDis ;
         tdevemp_impl.this.AV33AlbRUniDis = GXv_decimal9[0] ;
         AV33AlbRUniDis = this.AV33AlbRUniDis ;
         tdevemp_impl.this.AV34AlbRPDis = GXv_int5[0] ;
         AV34AlbRPDis = this.AV34AlbRPDis ;
         tdevemp_impl.this.AV35AlbRUDis = GXv_decimal7[0] ;
         AV35AlbRUDis = this.AV35AlbRUDis ;
         tdevemp_impl.this.AV36AlbRUni = GXv_char3[0] ;
         AV36AlbRUni = this.AV36AlbRUni ;
      }
      dynload_actions( ) ;
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV32AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV33AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34AlbRPDis", GXutil.ltrim( localUtil.ntoc( AV34AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV35AlbRUDis", GXutil.ltrim( localUtil.ntoc( AV35AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbRUni", GXutil.rtrim( AV36AlbRUni));
   }

   public void valid_Devempuni( )
   {
      n6244DevEmpUni = false ;
      if ( true )
      {
         AV33AlbRUniDis = A57AlbRUniDis ;
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV33AlbRUniDis = AV35AlbRUDis ;
         }
      }
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O6244DevEmpUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A6244DevEmpUni).subtract(O6244DevEmpUni) ;
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV38Kilos = A6244DevEmpUni ;
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV39Metros = A6244DevEmpUni ;
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV41KilAnt = O6244DevEmpUni ;
      }
      if ( ( GXutil.strcmp(AV36AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV42MetAnt = O6244DevEmpUni ;
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, "DEVEMPUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpUni_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV33AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV33AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV38Kilos", GXutil.ltrim( localUtil.ntoc( AV38Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV39Metros", GXutil.ltrim( localUtil.ntoc( AV39Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV41KilAnt", GXutil.ltrim( localUtil.ntoc( AV41KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV42MetAnt", GXutil.ltrim( localUtil.ntoc( AV42MetAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Devemppie( )
   {
      n6245DevEmpPie = false ;
      if ( true )
      {
         AV32AlbRPieDis = A51AlbRPieDis ;
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV32AlbRPieDis = AV34AlbRPDis ;
         }
      }
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O6245DevEmpPie) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A6245DevEmpPie-O6245DevEmpPie) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      AV40Piezas = A6245DevEmpPie ;
      AV43PieAnt = O6245DevEmpPie ;
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 1, "DEVEMPPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevEmpPie_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV32AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV32AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV40Piezas", GXutil.ltrim( localUtil.ntoc( AV40Piezas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV43PieAnt", GXutil.ltrim( localUtil.ntoc( AV43PieAnt, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV37Modo',fld:'vMODO',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DEVEMPCOD","{handler:'valid_Devempcod',iparms:[{av:'A6236DevUltLin',fld:'DEVULTLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6235DevEmpCod',fld:'DEVEMPCOD',pic:'ZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV37Modo',fld:'vMODO',pic:'@!'},{av:'A6237DevEmpFec',fld:'DEVEMPFEC',pic:''},{av:'A6239DevEmphhsa',fld:'DEVEMPHHSA',pic:'99/99/99 99:99:99'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_DEVEMPCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A6236DevUltLin',fld:'DEVULTLIN',pic:'ZZZ9'},{av:'A6237DevEmpFec',fld:'DEVEMPFEC',pic:''},{av:'A6238DevEmpMtr',fld:'DEVEMPMTR',pic:''},{av:'A6239DevEmphhsa',fld:'DEVEMPHHSA',pic:'99/99/99 99:99:99'},{av:'A6240DevEmpCTrn',fld:'DEVEMPCTRN',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6242DevEmpObs',fld:'DEVEMPOBS',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6241DevEmpNTrn',fld:'DEVEMPNTRN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z6235DevEmpCod'},{av:'Z407EmprNom'},{av:'Z6236DevUltLin'},{av:'Z6237DevEmpFec'},{av:'Z6238DevEmpMtr'},{av:'Z6239DevEmphhsa'},{av:'Z6240DevEmpCTrn'},{av:'Z252CliCod'},{av:'Z6242DevEmpObs'},{av:'ZV8UsurCod'},{av:'Z279CliNom'},{av:'Z6241DevEmpNTrn'},{av:'O6236DevUltLin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DEVULTLIN","{handler:'valid_Devultlin',iparms:[]");
      setEventMetadata("VALID_DEVULTLIN",",oparms:[]}");
      setEventMetadata("VALID_DEVEMPCTRN","{handler:'valid_Devempctrn',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6240DevEmpCTrn',fld:'DEVEMPCTRN',pic:'ZZZ9'},{av:'A6241DevEmpNTrn',fld:'DEVEMPNTRN',pic:''}]");
      setEventMetadata("VALID_DEVEMPCTRN",",oparms:[{av:'A6241DevEmpNTrn',fld:'DEVEMPNTRN',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_DEVNUMLIN","{handler:'valid_Devnumlin',iparms:[]");
      setEventMetadata("VALID_DEVNUMLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV36AlbRUni',fld:'vALBRUNI',pic:'@!'},{av:'AV32AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV33AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV34AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV35AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O54AlbRPieUti'},{av:'O60AlbRUniUti'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV32AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV33AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV34AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV35AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV36AlbRUni',fld:'vALBRUNI',pic:'@!'}]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[]");
      setEventMetadata("VALID_ALBREST",",oparms:[]}");
      setEventMetadata("VALID_DEVEMPUNI","{handler:'valid_Devempuni',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O6244DevEmpUni'},{av:'O60AlbRUniUti'},{av:'A6244DevEmpUni',fld:'DEVEMPUNI',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV33AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV38Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV39Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV41KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV42MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_DEVEMPUNI",",oparms:[{av:'AV33AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV38Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV39Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV41KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV42MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_DEVEMPPIE","{handler:'valid_Devemppie',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O6245DevEmpPie'},{av:'O54AlbRPieUti'},{av:'A6245DevEmpPie',fld:'DEVEMPPIE',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'AV32AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV40Piezas',fld:'vPIEZAS',pic:'ZZZZZ9'},{av:'AV43PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_DEVEMPPIE",",oparms:[{av:'AV32AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV40Piezas',fld:'vPIEZAS',pic:'ZZZZZ9'},{av:'AV43PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'valid_Devempest',iparms:[]");
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
      pr_default.close(28);
      pr_default.close(19);
      pr_default.close(31);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z6237DevEmpFec = GXutil.nullDate() ;
      Z6238DevEmpMtr = "" ;
      Z6239DevEmphhsa = GXutil.resetTime( GXutil.nullDate() );
      Z6244DevEmpUni = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      O6244DevEmpUni = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6237DevEmpFec = GXutil.nullDate() ;
      AV36AlbRUni = "" ;
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
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A6238DevEmpMtr = "" ;
      lblTextblock7_Jsonclick = "" ;
      A6239DevEmphhsa = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A6241DevEmpNTrn = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      A6242DevEmpObs = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode909 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Modo = "" ;
      AV8UsurCod = "" ;
      AV33AlbRUniDis = DecimalUtil.ZERO ;
      AV38Kilos = DecimalUtil.ZERO ;
      AV39Metros = DecimalUtil.ZERO ;
      AV41KilAnt = DecimalUtil.ZERO ;
      AV42MetAnt = DecimalUtil.ZERO ;
      AV35AlbRUDis = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode908 = "" ;
      GXCCtl = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A6244DevEmpUni = DecimalUtil.ZERO ;
      T6244DevEmpUni = DecimalUtil.ZERO ;
      T60AlbRUniUti = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      AV10Lit1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV13Lit9 = "" ;
      AV21Lit10 = "" ;
      AV22Lit11 = "" ;
      AV23Lit12 = "" ;
      AV26Lit15 = "" ;
      AV27Lit16 = "" ;
      AV28Lit17 = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      Z6242DevEmpObs = "" ;
      Z407EmprNom = "" ;
      Z6241DevEmpNTrn = "" ;
      Z279CliNom = "" ;
      T00UG8_A407EmprNom = new String[] {""} ;
      T00UG8_n407EmprNom = new boolean[] {false} ;
      T00UG11_A6242DevEmpObs = new String[] {""} ;
      T00UG11_n6242DevEmpObs = new boolean[] {false} ;
      T00UG11_A6235DevEmpCod = new int[1] ;
      T00UG11_A407EmprNom = new String[] {""} ;
      T00UG11_n407EmprNom = new boolean[] {false} ;
      T00UG11_A6236DevUltLin = new short[1] ;
      T00UG11_n6236DevUltLin = new boolean[] {false} ;
      T00UG11_A6237DevEmpFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UG11_n6237DevEmpFec = new boolean[] {false} ;
      T00UG11_A6238DevEmpMtr = new String[] {""} ;
      T00UG11_n6238DevEmpMtr = new boolean[] {false} ;
      T00UG11_A6239DevEmphhsa = new java.util.Date[] {GXutil.nullDate()} ;
      T00UG11_n6239DevEmphhsa = new boolean[] {false} ;
      T00UG11_A6241DevEmpNTrn = new String[] {""} ;
      T00UG11_n6241DevEmpNTrn = new boolean[] {false} ;
      T00UG11_A279CliNom = new String[] {""} ;
      T00UG11_A396EmprCod = new String[] {""} ;
      T00UG11_A252CliCod = new int[1] ;
      T00UG11_n252CliCod = new boolean[] {false} ;
      T00UG11_A6240DevEmpCTrn = new short[1] ;
      T00UG11_n6240DevEmpCTrn = new boolean[] {false} ;
      T00UG9_A279CliNom = new String[] {""} ;
      T00UG10_A6241DevEmpNTrn = new String[] {""} ;
      T00UG10_n6241DevEmpNTrn = new boolean[] {false} ;
      T00UG12_A279CliNom = new String[] {""} ;
      T00UG13_A6241DevEmpNTrn = new String[] {""} ;
      T00UG13_n6241DevEmpNTrn = new boolean[] {false} ;
      T00UG14_A396EmprCod = new String[] {""} ;
      T00UG14_A6235DevEmpCod = new int[1] ;
      T00UG7_A6242DevEmpObs = new String[] {""} ;
      T00UG7_n6242DevEmpObs = new boolean[] {false} ;
      T00UG7_A6235DevEmpCod = new int[1] ;
      T00UG7_A6236DevUltLin = new short[1] ;
      T00UG7_n6236DevUltLin = new boolean[] {false} ;
      T00UG7_A6237DevEmpFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UG7_n6237DevEmpFec = new boolean[] {false} ;
      T00UG7_A6238DevEmpMtr = new String[] {""} ;
      T00UG7_n6238DevEmpMtr = new boolean[] {false} ;
      T00UG7_A6239DevEmphhsa = new java.util.Date[] {GXutil.nullDate()} ;
      T00UG7_n6239DevEmphhsa = new boolean[] {false} ;
      T00UG7_A396EmprCod = new String[] {""} ;
      T00UG7_A252CliCod = new int[1] ;
      T00UG7_n252CliCod = new boolean[] {false} ;
      T00UG7_A6240DevEmpCTrn = new short[1] ;
      T00UG7_n6240DevEmpCTrn = new boolean[] {false} ;
      T00UG15_A396EmprCod = new String[] {""} ;
      T00UG15_A6235DevEmpCod = new int[1] ;
      T00UG16_A396EmprCod = new String[] {""} ;
      T00UG16_A6235DevEmpCod = new int[1] ;
      T00UG6_A6242DevEmpObs = new String[] {""} ;
      T00UG6_n6242DevEmpObs = new boolean[] {false} ;
      T00UG6_A6235DevEmpCod = new int[1] ;
      T00UG6_A6236DevUltLin = new short[1] ;
      T00UG6_n6236DevUltLin = new boolean[] {false} ;
      T00UG6_A6237DevEmpFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UG6_n6237DevEmpFec = new boolean[] {false} ;
      T00UG6_A6238DevEmpMtr = new String[] {""} ;
      T00UG6_n6238DevEmpMtr = new boolean[] {false} ;
      T00UG6_A6239DevEmphhsa = new java.util.Date[] {GXutil.nullDate()} ;
      T00UG6_n6239DevEmphhsa = new boolean[] {false} ;
      T00UG6_A396EmprCod = new String[] {""} ;
      T00UG6_A252CliCod = new int[1] ;
      T00UG6_n252CliCod = new boolean[] {false} ;
      T00UG6_A6240DevEmpCTrn = new short[1] ;
      T00UG6_n6240DevEmpCTrn = new boolean[] {false} ;
      T00UG20_A6241DevEmpNTrn = new String[] {""} ;
      T00UG20_n6241DevEmpNTrn = new boolean[] {false} ;
      T00UG21_A279CliNom = new String[] {""} ;
      T00UG23_A396EmprCod = new String[] {""} ;
      T00UG23_A6235DevEmpCod = new int[1] ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      T00UG24_A6235DevEmpCod = new int[1] ;
      T00UG24_A6243DevNumLin = new byte[1] ;
      T00UG24_A54AlbRPieUti = new int[1] ;
      T00UG24_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG24_A47AlbREst = new byte[1] ;
      T00UG24_A45AlbRef = new String[] {""} ;
      T00UG24_A3613AlbRefDsc = new String[] {""} ;
      T00UG24_A52AlbRPieEnt = new int[1] ;
      T00UG24_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG24_A6244DevEmpUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG24_n6244DevEmpUni = new boolean[] {false} ;
      T00UG24_A6245DevEmpPie = new short[1] ;
      T00UG24_n6245DevEmpPie = new boolean[] {false} ;
      T00UG24_A6246DevEmpEst = new byte[1] ;
      T00UG24_n6246DevEmpEst = new boolean[] {false} ;
      T00UG24_A396EmprCod = new String[] {""} ;
      T00UG24_A44AlbRecCod = new int[1] ;
      T00UG24_n44AlbRecCod = new boolean[] {false} ;
      T00UG5_A54AlbRPieUti = new int[1] ;
      T00UG5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG5_A47AlbREst = new byte[1] ;
      T00UG5_A45AlbRef = new String[] {""} ;
      T00UG5_A3613AlbRefDsc = new String[] {""} ;
      T00UG5_A52AlbRPieEnt = new int[1] ;
      T00UG5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG25_A396EmprCod = new String[] {""} ;
      T00UG25_A6235DevEmpCod = new int[1] ;
      T00UG25_A6243DevNumLin = new byte[1] ;
      T00UG3_A6235DevEmpCod = new int[1] ;
      T00UG3_A6243DevNumLin = new byte[1] ;
      T00UG3_A6244DevEmpUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG3_n6244DevEmpUni = new boolean[] {false} ;
      T00UG3_A6245DevEmpPie = new short[1] ;
      T00UG3_n6245DevEmpPie = new boolean[] {false} ;
      T00UG3_A6246DevEmpEst = new byte[1] ;
      T00UG3_n6246DevEmpEst = new boolean[] {false} ;
      T00UG3_A396EmprCod = new String[] {""} ;
      T00UG3_A44AlbRecCod = new int[1] ;
      T00UG3_n44AlbRecCod = new boolean[] {false} ;
      T00UG2_A6235DevEmpCod = new int[1] ;
      T00UG2_A6243DevNumLin = new byte[1] ;
      T00UG2_A6244DevEmpUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG2_n6244DevEmpUni = new boolean[] {false} ;
      T00UG2_A6245DevEmpPie = new short[1] ;
      T00UG2_n6245DevEmpPie = new boolean[] {false} ;
      T00UG2_A6246DevEmpEst = new byte[1] ;
      T00UG2_n6246DevEmpEst = new boolean[] {false} ;
      T00UG2_A396EmprCod = new String[] {""} ;
      T00UG2_A44AlbRecCod = new int[1] ;
      T00UG2_n44AlbRecCod = new boolean[] {false} ;
      T00UG26_A54AlbRPieUti = new int[1] ;
      T00UG26_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG26_A47AlbREst = new byte[1] ;
      T00UG26_A45AlbRef = new String[] {""} ;
      T00UG26_A3613AlbRefDsc = new String[] {""} ;
      T00UG26_A52AlbRPieEnt = new int[1] ;
      T00UG26_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG30_A54AlbRPieUti = new int[1] ;
      T00UG30_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG30_A47AlbREst = new byte[1] ;
      T00UG30_A45AlbRef = new String[] {""} ;
      T00UG30_A3613AlbRefDsc = new String[] {""} ;
      T00UG30_A52AlbRPieEnt = new int[1] ;
      T00UG30_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UG32_A396EmprCod = new String[] {""} ;
      T00UG32_A6235DevEmpCod = new int[1] ;
      T00UG32_A6243DevNumLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV37Modo = "" ;
      i6237DevEmpFec = GXutil.nullDate() ;
      i6239DevEmphhsa = GXutil.resetTime( GXutil.nullDate() );
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00UG33_A407EmprNom = new String[] {""} ;
      T00UG33_n407EmprNom = new boolean[] {false} ;
      ZV8UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ6237DevEmpFec = GXutil.nullDate() ;
      ZZ6238DevEmpMtr = "" ;
      ZZ6239DevEmphhsa = GXutil.resetTime( GXutil.nullDate() );
      ZZ6242DevEmpObs = "" ;
      ZZV8UsurCod = "" ;
      ZZ279CliNom = "" ;
      ZZ6241DevEmpNTrn = "" ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      ZV33AlbRUniDis = DecimalUtil.ZERO ;
      ZV35AlbRUDis = DecimalUtil.ZERO ;
      ZV36AlbRUni = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV38Kilos = DecimalUtil.ZERO ;
      ZV39Metros = DecimalUtil.ZERO ;
      ZV41KilAnt = DecimalUtil.ZERO ;
      ZV42MetAnt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevemp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevemp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevemp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevemp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevemp__default(),
         new Object[] {
             new Object[] {
            T00UG2_A6235DevEmpCod, T00UG2_A6243DevNumLin, T00UG2_A6244DevEmpUni, T00UG2_n6244DevEmpUni, T00UG2_A6245DevEmpPie, T00UG2_n6245DevEmpPie, T00UG2_A6246DevEmpEst, T00UG2_n6246DevEmpEst, T00UG2_A396EmprCod, T00UG2_A44AlbRecCod,
            T00UG2_n44AlbRecCod
            }
            , new Object[] {
            T00UG3_A6235DevEmpCod, T00UG3_A6243DevNumLin, T00UG3_A6244DevEmpUni, T00UG3_n6244DevEmpUni, T00UG3_A6245DevEmpPie, T00UG3_n6245DevEmpPie, T00UG3_A6246DevEmpEst, T00UG3_n6246DevEmpEst, T00UG3_A396EmprCod, T00UG3_A44AlbRecCod,
            T00UG3_n44AlbRecCod
            }
            , new Object[] {
            T00UG4_A54AlbRPieUti, T00UG4_A60AlbRUniUti, T00UG4_A47AlbREst, T00UG4_A45AlbRef, T00UG4_A3613AlbRefDsc, T00UG4_A52AlbRPieEnt, T00UG4_A58AlbRUniEnt
            }
            , new Object[] {
            T00UG5_A54AlbRPieUti, T00UG5_A60AlbRUniUti, T00UG5_A47AlbREst, T00UG5_A45AlbRef, T00UG5_A3613AlbRefDsc, T00UG5_A52AlbRPieEnt, T00UG5_A58AlbRUniEnt
            }
            , new Object[] {
            T00UG6_A6242DevEmpObs, T00UG6_n6242DevEmpObs, T00UG6_A6235DevEmpCod, T00UG6_A6236DevUltLin, T00UG6_n6236DevUltLin, T00UG6_A6237DevEmpFec, T00UG6_n6237DevEmpFec, T00UG6_A6238DevEmpMtr, T00UG6_n6238DevEmpMtr, T00UG6_A6239DevEmphhsa,
            T00UG6_n6239DevEmphhsa, T00UG6_A396EmprCod, T00UG6_A252CliCod, T00UG6_n252CliCod, T00UG6_A6240DevEmpCTrn, T00UG6_n6240DevEmpCTrn
            }
            , new Object[] {
            T00UG7_A6242DevEmpObs, T00UG7_n6242DevEmpObs, T00UG7_A6235DevEmpCod, T00UG7_A6236DevUltLin, T00UG7_n6236DevUltLin, T00UG7_A6237DevEmpFec, T00UG7_n6237DevEmpFec, T00UG7_A6238DevEmpMtr, T00UG7_n6238DevEmpMtr, T00UG7_A6239DevEmphhsa,
            T00UG7_n6239DevEmphhsa, T00UG7_A396EmprCod, T00UG7_A252CliCod, T00UG7_n252CliCod, T00UG7_A6240DevEmpCTrn, T00UG7_n6240DevEmpCTrn
            }
            , new Object[] {
            T00UG8_A407EmprNom, T00UG8_n407EmprNom
            }
            , new Object[] {
            T00UG9_A279CliNom
            }
            , new Object[] {
            T00UG10_A6241DevEmpNTrn, T00UG10_n6241DevEmpNTrn
            }
            , new Object[] {
            T00UG11_A6242DevEmpObs, T00UG11_n6242DevEmpObs, T00UG11_A6235DevEmpCod, T00UG11_A407EmprNom, T00UG11_n407EmprNom, T00UG11_A6236DevUltLin, T00UG11_n6236DevUltLin, T00UG11_A6237DevEmpFec, T00UG11_n6237DevEmpFec, T00UG11_A6238DevEmpMtr,
            T00UG11_n6238DevEmpMtr, T00UG11_A6239DevEmphhsa, T00UG11_n6239DevEmphhsa, T00UG11_A6241DevEmpNTrn, T00UG11_n6241DevEmpNTrn, T00UG11_A279CliNom, T00UG11_A396EmprCod, T00UG11_A252CliCod, T00UG11_n252CliCod, T00UG11_A6240DevEmpCTrn,
            T00UG11_n6240DevEmpCTrn
            }
            , new Object[] {
            T00UG12_A279CliNom
            }
            , new Object[] {
            T00UG13_A6241DevEmpNTrn, T00UG13_n6241DevEmpNTrn
            }
            , new Object[] {
            T00UG14_A396EmprCod, T00UG14_A6235DevEmpCod
            }
            , new Object[] {
            T00UG15_A396EmprCod, T00UG15_A6235DevEmpCod
            }
            , new Object[] {
            T00UG16_A396EmprCod, T00UG16_A6235DevEmpCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00UG20_A6241DevEmpNTrn, T00UG20_n6241DevEmpNTrn
            }
            , new Object[] {
            T00UG21_A279CliNom
            }
            , new Object[] {
            }
            , new Object[] {
            T00UG23_A396EmprCod, T00UG23_A6235DevEmpCod
            }
            , new Object[] {
            T00UG24_A6235DevEmpCod, T00UG24_A6243DevNumLin, T00UG24_A54AlbRPieUti, T00UG24_A60AlbRUniUti, T00UG24_A47AlbREst, T00UG24_A45AlbRef, T00UG24_A3613AlbRefDsc, T00UG24_A52AlbRPieEnt, T00UG24_A58AlbRUniEnt, T00UG24_A6244DevEmpUni,
            T00UG24_n6244DevEmpUni, T00UG24_A6245DevEmpPie, T00UG24_n6245DevEmpPie, T00UG24_A6246DevEmpEst, T00UG24_n6246DevEmpEst, T00UG24_A396EmprCod, T00UG24_A44AlbRecCod, T00UG24_n44AlbRecCod
            }
            , new Object[] {
            T00UG25_A396EmprCod, T00UG25_A6235DevEmpCod, T00UG25_A6243DevNumLin
            }
            , new Object[] {
            T00UG26_A54AlbRPieUti, T00UG26_A60AlbRUniUti, T00UG26_A47AlbREst, T00UG26_A45AlbRef, T00UG26_A3613AlbRefDsc, T00UG26_A52AlbRPieEnt, T00UG26_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00UG30_A54AlbRPieUti, T00UG30_A60AlbRUniUti, T00UG30_A47AlbREst, T00UG30_A45AlbRef, T00UG30_A3613AlbRefDsc, T00UG30_A52AlbRPieEnt, T00UG30_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            T00UG32_A396EmprCod, T00UG32_A6235DevEmpCod, T00UG32_A6243DevNumLin
            }
            , new Object[] {
            T00UG33_A407EmprNom, T00UG33_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z6239DevEmphhsa = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n6239DevEmphhsa = false ;
      A6239DevEmphhsa = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n6239DevEmphhsa = false ;
      i6239DevEmphhsa = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n6239DevEmphhsa = false ;
      Z6237DevEmpFec = GXutil.today( ) ;
      n6237DevEmpFec = false ;
      i6237DevEmpFec = GXutil.today( ) ;
      n6237DevEmpFec = false ;
      A6237DevEmpFec = GXutil.today( ) ;
      n6237DevEmpFec = false ;
   }

   private byte Z6243DevNumLin ;
   private byte Z6246DevEmpEst ;
   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A6243DevNumLin ;
   private byte A47AlbREst ;
   private byte A6246DevEmpEst ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z6236DevUltLin ;
   private short Z6240DevEmpCTrn ;
   private short O6236DevUltLin ;
   private short Z6245DevEmpPie ;
   private short O6245DevEmpPie ;
   private short nRcdDeleted_909 ;
   private short nRcdExists_909 ;
   private short nIsMod_909 ;
   private short A6240DevEmpCTrn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6236DevUltLin ;
   private short nBlankRcdCount909 ;
   private short RcdFound909 ;
   private short B6236DevUltLin ;
   private short nBlankRcdUsr909 ;
   private short s6236DevUltLin ;
   private short A6245DevEmpPie ;
   private short T6245DevEmpPie ;
   private short RcdFound908 ;
   private short nIsDirty_908 ;
   private short nIsDirty_909 ;
   private short i6236DevUltLin ;
   private short ZZ6236DevUltLin ;
   private short ZZ6240DevEmpCTrn ;
   private short ZO6236DevUltLin ;
   private int Z6235DevEmpCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int O54AlbRPieUti ;
   private int A6235DevEmpCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDevEmpCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDevUltLin_Enabled ;
   private int edtDevEmpFec_Enabled ;
   private int edtDevEmpMtr_Enabled ;
   private int edtDevEmphhsa_Enabled ;
   private int edtDevEmpCTrn_Enabled ;
   private int edtDevEmpNTrn_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDevEmpObs_Enabled ;
   private int edtavnRcdDeleted_909_Enabled ;
   private int edtDevNumLin_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRPieUti_Enabled ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtDevEmpUni_Enabled ;
   private int edtDevEmpPie_Enabled ;
   private int edtDevEmpEst_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV32AlbRPieDis ;
   private int AV40Piezas ;
   private int AV43PieAnt ;
   private int AV34AlbRPDis ;
   private int A51AlbRPieDis ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int T54AlbRPieUti ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAlbRPieUti_Enabled ;
   private int defedtAlbRUniUti_Enabled ;
   private int defedtDevNumLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtDevEmpObs_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtDevEmpNTrn_Backcolor ;
   private int edtDevEmpCTrn_Backcolor ;
   private int edtDevEmphhsa_Backcolor ;
   private int edtDevEmpMtr_Backcolor ;
   private int edtDevEmpFec_Backcolor ;
   private int edtDevUltLin_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDevEmpCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ6235DevEmpCod ;
   private int ZZ252CliCod ;
   private int GXv_int8[] ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int ZO54AlbRPieUti ;
   private int ZV32AlbRPieDis ;
   private int ZV34AlbRPDis ;
   private int Z51AlbRPieDis ;
   private int ZV40Piezas ;
   private int ZV43PieAnt ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6244DevEmpUni ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O6244DevEmpUni ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal AV33AlbRUniDis ;
   private java.math.BigDecimal AV38Kilos ;
   private java.math.BigDecimal AV39Metros ;
   private java.math.BigDecimal AV41KilAnt ;
   private java.math.BigDecimal AV42MetAnt ;
   private java.math.BigDecimal AV35AlbRUDis ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A6244DevEmpUni ;
   private java.math.BigDecimal T6244DevEmpUni ;
   private java.math.BigDecimal T60AlbRUniUti ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private java.math.BigDecimal ZV33AlbRUniDis ;
   private java.math.BigDecimal ZV35AlbRUDis ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZV38Kilos ;
   private java.math.BigDecimal ZV39Metros ;
   private java.math.BigDecimal ZV41KilAnt ;
   private java.math.BigDecimal ZV42MetAnt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z6238DevEmpMtr ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV36AlbRUni ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevEmpCod_Internalname ;
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
   private String edtDevEmpCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDevUltLin_Internalname ;
   private String edtDevUltLin_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDevEmpFec_Internalname ;
   private String edtDevEmpFec_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDevEmpMtr_Internalname ;
   private String A6238DevEmpMtr ;
   private String edtDevEmpMtr_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDevEmphhsa_Internalname ;
   private String edtDevEmphhsa_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDevEmpCTrn_Internalname ;
   private String edtDevEmpCTrn_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDevEmpNTrn_Internalname ;
   private String A6241DevEmpNTrn ;
   private String edtDevEmpNTrn_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDevEmpObs_Internalname ;
   private String sMode909 ;
   private String edtavnRcdDeleted_909_Internalname ;
   private String edtDevNumLin_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRef_Internalname ;
   private String edtAlbRefDsc_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtDevEmpUni_Internalname ;
   private String edtDevEmpPie_Internalname ;
   private String edtDevEmpEst_Internalname ;
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
   private String AV37Modo ;
   private String AV8UsurCod ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode908 ;
   private String GXCCtl ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String AV10Lit1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV13Lit9 ;
   private String AV21Lit10 ;
   private String AV22Lit11 ;
   private String AV23Lit12 ;
   private String AV26Lit15 ;
   private String AV27Lit16 ;
   private String AV28Lit17 ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String Z407EmprNom ;
   private String Z6241DevEmpNTrn ;
   private String Z279CliNom ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_909_Jsonclick ;
   private String edtDevNumLin_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtDevEmpUni_Jsonclick ;
   private String edtDevEmpPie_Jsonclick ;
   private String edtDevEmpEst_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV37Modo ;
   private String subGrid1_Header ;
   private String ZV8UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ6238DevEmpMtr ;
   private String ZZV8UsurCod ;
   private String ZZ279CliNom ;
   private String ZZ6241DevEmpNTrn ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV36AlbRUni ;
   private java.util.Date Z6239DevEmphhsa ;
   private java.util.Date A6239DevEmphhsa ;
   private java.util.Date i6239DevEmphhsa ;
   private java.util.Date ZZ6239DevEmphhsa ;
   private java.util.Date Z6237DevEmpFec ;
   private java.util.Date A6237DevEmpFec ;
   private java.util.Date i6237DevEmpFec ;
   private java.util.Date ZZ6237DevEmpFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6237DevEmpFec ;
   private boolean n44AlbRecCod ;
   private boolean n252CliCod ;
   private boolean n6240DevEmpCTrn ;
   private boolean wbErr ;
   private boolean n6236DevUltLin ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n6238DevEmpMtr ;
   private boolean n6239DevEmphhsa ;
   private boolean n6241DevEmpNTrn ;
   private boolean n6242DevEmpObs ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n6244DevEmpUni ;
   private boolean n6245DevEmpPie ;
   private boolean n6246DevEmpEst ;
   private String A6242DevEmpObs ;
   private String Z6242DevEmpObs ;
   private String ZZ6242DevEmpObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private String[] T00UG8_A407EmprNom ;
   private boolean[] T00UG8_n407EmprNom ;
   private String[] T00UG11_A6242DevEmpObs ;
   private boolean[] T00UG11_n6242DevEmpObs ;
   private int[] T00UG11_A6235DevEmpCod ;
   private String[] T00UG11_A407EmprNom ;
   private boolean[] T00UG11_n407EmprNom ;
   private short[] T00UG11_A6236DevUltLin ;
   private boolean[] T00UG11_n6236DevUltLin ;
   private java.util.Date[] T00UG11_A6237DevEmpFec ;
   private boolean[] T00UG11_n6237DevEmpFec ;
   private String[] T00UG11_A6238DevEmpMtr ;
   private boolean[] T00UG11_n6238DevEmpMtr ;
   private java.util.Date[] T00UG11_A6239DevEmphhsa ;
   private boolean[] T00UG11_n6239DevEmphhsa ;
   private String[] T00UG11_A6241DevEmpNTrn ;
   private boolean[] T00UG11_n6241DevEmpNTrn ;
   private String[] T00UG11_A279CliNom ;
   private String[] T00UG11_A396EmprCod ;
   private int[] T00UG11_A252CliCod ;
   private boolean[] T00UG11_n252CliCod ;
   private short[] T00UG11_A6240DevEmpCTrn ;
   private boolean[] T00UG11_n6240DevEmpCTrn ;
   private String[] T00UG9_A279CliNom ;
   private String[] T00UG10_A6241DevEmpNTrn ;
   private boolean[] T00UG10_n6241DevEmpNTrn ;
   private String[] T00UG12_A279CliNom ;
   private String[] T00UG13_A6241DevEmpNTrn ;
   private boolean[] T00UG13_n6241DevEmpNTrn ;
   private String[] T00UG14_A396EmprCod ;
   private int[] T00UG14_A6235DevEmpCod ;
   private String[] T00UG7_A6242DevEmpObs ;
   private boolean[] T00UG7_n6242DevEmpObs ;
   private int[] T00UG7_A6235DevEmpCod ;
   private short[] T00UG7_A6236DevUltLin ;
   private boolean[] T00UG7_n6236DevUltLin ;
   private java.util.Date[] T00UG7_A6237DevEmpFec ;
   private boolean[] T00UG7_n6237DevEmpFec ;
   private String[] T00UG7_A6238DevEmpMtr ;
   private boolean[] T00UG7_n6238DevEmpMtr ;
   private java.util.Date[] T00UG7_A6239DevEmphhsa ;
   private boolean[] T00UG7_n6239DevEmphhsa ;
   private String[] T00UG7_A396EmprCod ;
   private int[] T00UG7_A252CliCod ;
   private boolean[] T00UG7_n252CliCod ;
   private short[] T00UG7_A6240DevEmpCTrn ;
   private boolean[] T00UG7_n6240DevEmpCTrn ;
   private String[] T00UG15_A396EmprCod ;
   private int[] T00UG15_A6235DevEmpCod ;
   private String[] T00UG16_A396EmprCod ;
   private int[] T00UG16_A6235DevEmpCod ;
   private String[] T00UG6_A6242DevEmpObs ;
   private boolean[] T00UG6_n6242DevEmpObs ;
   private int[] T00UG6_A6235DevEmpCod ;
   private short[] T00UG6_A6236DevUltLin ;
   private boolean[] T00UG6_n6236DevUltLin ;
   private java.util.Date[] T00UG6_A6237DevEmpFec ;
   private boolean[] T00UG6_n6237DevEmpFec ;
   private String[] T00UG6_A6238DevEmpMtr ;
   private boolean[] T00UG6_n6238DevEmpMtr ;
   private java.util.Date[] T00UG6_A6239DevEmphhsa ;
   private boolean[] T00UG6_n6239DevEmphhsa ;
   private String[] T00UG6_A396EmprCod ;
   private int[] T00UG6_A252CliCod ;
   private boolean[] T00UG6_n252CliCod ;
   private short[] T00UG6_A6240DevEmpCTrn ;
   private boolean[] T00UG6_n6240DevEmpCTrn ;
   private String[] T00UG20_A6241DevEmpNTrn ;
   private boolean[] T00UG20_n6241DevEmpNTrn ;
   private String[] T00UG21_A279CliNom ;
   private String[] T00UG23_A396EmprCod ;
   private int[] T00UG23_A6235DevEmpCod ;
   private int[] T00UG24_A6235DevEmpCod ;
   private byte[] T00UG24_A6243DevNumLin ;
   private int[] T00UG24_A54AlbRPieUti ;
   private java.math.BigDecimal[] T00UG24_A60AlbRUniUti ;
   private byte[] T00UG24_A47AlbREst ;
   private String[] T00UG24_A45AlbRef ;
   private String[] T00UG24_A3613AlbRefDsc ;
   private int[] T00UG24_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T00UG24_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T00UG24_A6244DevEmpUni ;
   private boolean[] T00UG24_n6244DevEmpUni ;
   private short[] T00UG24_A6245DevEmpPie ;
   private boolean[] T00UG24_n6245DevEmpPie ;
   private byte[] T00UG24_A6246DevEmpEst ;
   private boolean[] T00UG24_n6246DevEmpEst ;
   private String[] T00UG24_A396EmprCod ;
   private int[] T00UG24_A44AlbRecCod ;
   private boolean[] T00UG24_n44AlbRecCod ;
   private int[] T00UG5_A54AlbRPieUti ;
   private java.math.BigDecimal[] T00UG5_A60AlbRUniUti ;
   private byte[] T00UG5_A47AlbREst ;
   private String[] T00UG5_A45AlbRef ;
   private String[] T00UG5_A3613AlbRefDsc ;
   private int[] T00UG5_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T00UG5_A58AlbRUniEnt ;
   private String[] T00UG25_A396EmprCod ;
   private int[] T00UG25_A6235DevEmpCod ;
   private byte[] T00UG25_A6243DevNumLin ;
   private int[] T00UG3_A6235DevEmpCod ;
   private byte[] T00UG3_A6243DevNumLin ;
   private java.math.BigDecimal[] T00UG3_A6244DevEmpUni ;
   private boolean[] T00UG3_n6244DevEmpUni ;
   private short[] T00UG3_A6245DevEmpPie ;
   private boolean[] T00UG3_n6245DevEmpPie ;
   private byte[] T00UG3_A6246DevEmpEst ;
   private boolean[] T00UG3_n6246DevEmpEst ;
   private String[] T00UG3_A396EmprCod ;
   private int[] T00UG3_A44AlbRecCod ;
   private boolean[] T00UG3_n44AlbRecCod ;
   private int[] T00UG2_A6235DevEmpCod ;
   private byte[] T00UG2_A6243DevNumLin ;
   private java.math.BigDecimal[] T00UG2_A6244DevEmpUni ;
   private boolean[] T00UG2_n6244DevEmpUni ;
   private short[] T00UG2_A6245DevEmpPie ;
   private boolean[] T00UG2_n6245DevEmpPie ;
   private byte[] T00UG2_A6246DevEmpEst ;
   private boolean[] T00UG2_n6246DevEmpEst ;
   private String[] T00UG2_A396EmprCod ;
   private int[] T00UG2_A44AlbRecCod ;
   private boolean[] T00UG2_n44AlbRecCod ;
   private int[] T00UG26_A54AlbRPieUti ;
   private java.math.BigDecimal[] T00UG26_A60AlbRUniUti ;
   private byte[] T00UG26_A47AlbREst ;
   private String[] T00UG26_A45AlbRef ;
   private String[] T00UG26_A3613AlbRefDsc ;
   private int[] T00UG26_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T00UG26_A58AlbRUniEnt ;
   private int[] T00UG30_A54AlbRPieUti ;
   private java.math.BigDecimal[] T00UG30_A60AlbRUniUti ;
   private byte[] T00UG30_A47AlbREst ;
   private String[] T00UG30_A45AlbRef ;
   private String[] T00UG30_A3613AlbRefDsc ;
   private int[] T00UG30_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T00UG30_A58AlbRUniEnt ;
   private String[] T00UG32_A396EmprCod ;
   private int[] T00UG32_A6235DevEmpCod ;
   private byte[] T00UG32_A6243DevNumLin ;
   private String[] T00UG33_A407EmprNom ;
   private boolean[] T00UG33_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] T00UG4_A54AlbRPieUti ;
   private java.math.BigDecimal[] T00UG4_A60AlbRUniUti ;
   private byte[] T00UG4_A47AlbREst ;
   private String[] T00UG4_A45AlbRef ;
   private String[] T00UG4_A3613AlbRefDsc ;
   private int[] T00UG4_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T00UG4_A58AlbRUniEnt ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdevemp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevemp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevemp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevemp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00UG2", "SELECT DevEmpCod, DevNumLin, DevEmpUni, DevEmpPie, DevEmpEst, EmprCod, AlbRecCod FROM TXPDEVEM1 WHERE EmprCod = ? AND DevEmpCod = ? AND DevNumLin = ?  FOR UPDATE OF DevEmpUni, DevEmpPie, DevEmpEst, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG3", "SELECT DevEmpCod, DevNumLin, DevEmpUni, DevEmpPie, DevEmpEst, EmprCod, AlbRecCod FROM TXPDEVEM1 WHERE EmprCod = ? AND DevEmpCod = ? AND DevNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG4", "SELECT AlbRPieUti, AlbRUniUti, AlbREst, AlbRef, AlbRefDsc, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbRUniUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG5", "SELECT AlbRPieUti, AlbRUniUti, AlbREst, AlbRef, AlbRefDsc, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG6", "SELECT DevEmpObs, DevEmpCod, DevUltLin, DevEmpFec, DevEmpMtr, DevEmphhsa, EmprCod, CliCod, DevEmpCTrn FROM TXPDEVEMP WHERE EmprCod = ? AND DevEmpCod = ?  FOR UPDATE OF DevUltLin, DevEmpFec, DevEmpMtr, DevEmphhsa, DevEmpObs, CliCod, DevEmpCTrn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG7", "SELECT DevEmpObs, DevEmpCod, DevUltLin, DevEmpFec, DevEmpMtr, DevEmphhsa, EmprCod, CliCod, DevEmpCTrn FROM TXPDEVEMP WHERE EmprCod = ? AND DevEmpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG10", "SELECT TrnNom AS DevEmpNTrn FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG11", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevEmpObs, TM1.DevEmpCod, T2.EmprNom, TM1.DevUltLin, TM1.DevEmpFec, TM1.DevEmpMtr, TM1.DevEmphhsa, T3.TrnNom AS DevEmpNTrn, T4.CliNom, TM1.EmprCod, TM1.CliCod, TM1.DevEmpCTrn AS DevEmpCTrn FROM (((TXPDEVEMP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = TM1.EmprCod AND T3.TrnCod = TM1.DevEmpCTrn) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.DevEmpCod = ? ORDER BY TM1.EmprCod, TM1.DevEmpCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG12", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG13", "SELECT TrnNom AS DevEmpNTrn FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND DevEmpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevEmpCod FROM TXPDEVEMP WHERE ( DevEmpCod > ?) and EmprCod = ? ORDER BY EmprCod, DevEmpCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00UG16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevEmpCod FROM TXPDEVEMP WHERE ( DevEmpCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevEmpCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00UG17", "INSERT INTO TXPDEVEMP(DevEmpCod, DevUltLin, DevEmpFec, DevEmpMtr, DevEmphhsa, DevEmpObs, EmprCod, CliCod, DevEmpCTrn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVEMP")
         ,new UpdateCursor("T00UG18", "UPDATE TXPDEVEMP SET DevUltLin=?, DevEmpFec=?, DevEmpMtr=?, DevEmphhsa=?, DevEmpObs=?, CliCod=?, DevEmpCTrn=?  WHERE EmprCod = ? AND DevEmpCod = ?", GX_NOMASK, "TXPDEVEMP")
         ,new UpdateCursor("T00UG19", "DELETE FROM TXPDEVEMP  WHERE EmprCod = ? AND DevEmpCod = ?", GX_NOMASK, "TXPDEVEMP")
         ,new ForEachCursor("T00UG20", "SELECT TrnNom AS DevEmpNTrn FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG21", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00UG22", "UPDATE TXPDEVEMP SET DevUltLin=?  WHERE EmprCod = ? AND DevEmpCod = ?", GX_NOMASK, "TXPDEVEMP")
         ,new ForEachCursor("T00UG23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? ORDER BY EmprCod, DevEmpCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG24", "SELECT T1.DevEmpCod, T1.DevNumLin, T2.AlbRPieUti, T2.AlbRUniUti, T2.AlbREst, T2.AlbRef, T2.AlbRefDsc, T2.AlbRPieEnt, T2.AlbRUniEnt, T1.DevEmpUni, T1.DevEmpPie, T1.DevEmpEst, T1.EmprCod, T1.AlbRecCod FROM (TXPDEVEM1 T1 LEFT JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevEmpCod = ? and T1.DevNumLin = ? ORDER BY T1.EmprCod, T1.DevEmpCod, T1.DevNumLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG25", "SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND DevEmpCod = ? AND DevNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG26", "SELECT AlbRPieUti, AlbRUniUti, AlbREst, AlbRef, AlbRefDsc, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbRUniUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00UG27", "INSERT INTO TXPDEVEM1(DevEmpCod, DevNumLin, DevEmpUni, DevEmpPie, DevEmpEst, EmprCod, AlbRecCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVEM1")
         ,new UpdateCursor("T00UG28", "UPDATE TXPDEVEM1 SET DevEmpUni=?, DevEmpPie=?, DevEmpEst=?, AlbRecCod=?  WHERE EmprCod = ? AND DevEmpCod = ? AND DevNumLin = ?", GX_NOMASK, "TXPDEVEM1")
         ,new UpdateCursor("T00UG29", "DELETE FROM TXPDEVEM1  WHERE EmprCod = ? AND DevEmpCod = ? AND DevNumLin = ?", GX_NOMASK, "TXPDEVEM1")
         ,new ForEachCursor("T00UG30", "SELECT AlbRPieUti, AlbRUniUti, AlbREst, AlbRef, AlbRefDsc, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00UG31", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbRUniUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T00UG32", "SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? and DevEmpCod = ? ORDER BY EmprCod, DevEmpCod, DevNumLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UG33", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((String[]) buf[16])[0] = rslt.getString(10, 3);
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 3);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               return;
            case 31 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setString(4, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(6, (String)parms[10]);
               }
               stmt.setString(7, (String)parms[11], 3);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
                  stmt.setString(3, (String)parms[5], 20);
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
                  stmt.setNull( 5 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(5, (String)parms[9]);
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
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
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
            case 19 :
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
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[7]).byteValue());
               }
               stmt.setString(6, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
               }
               return;
            case 26 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 28 :
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
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
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
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

