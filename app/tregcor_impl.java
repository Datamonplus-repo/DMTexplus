package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tregcor_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6930Lb_rclin = (int)(GXutil.lval( httpContext.GetPar( "Lb_rclin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_X9983( Gx_mode, A396EmprCod, A252CliCod, A6930Lb_rclin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6933Lb_rcnens = (int)(GXutil.lval( httpContext.GetPar( "Lb_rcnens"))) ;
         n6933Lb_rcnens = false ;
         A6934Lb_rcncar = httpContext.GetPar( "Lb_rcncar") ;
         n6934Lb_rcncar = false ;
         A6935Lb_rccorc = httpContext.GetPar( "Lb_rccorc") ;
         n6935Lb_rccorc = false ;
         A6936Lb_rcncorc = (int)(GXutil.lval( httpContext.GetPar( "Lb_rcncorc"))) ;
         n6936Lb_rcncorc = false ;
         A6937Lb_rccor = httpContext.GetPar( "Lb_rccor") ;
         n6937Lb_rccor = false ;
         A6938Lb_rcncor = (int)(GXutil.lval( httpContext.GetPar( "Lb_rcncor"))) ;
         n6938Lb_rcncor = false ;
         A6939Lb_rctc = (byte)(GXutil.lval( httpContext.GetPar( "Lb_rctc"))) ;
         n6939Lb_rctc = false ;
         A6940Lb_rcp1 = httpContext.GetPar( "Lb_rcp1") ;
         n6940Lb_rcp1 = false ;
         A6941Lb_rcp2 = httpContext.GetPar( "Lb_rcp2") ;
         n6941Lb_rcp2 = false ;
         A6942Lb_rcp3 = httpContext.GetPar( "Lb_rcp3") ;
         n6942Lb_rcp3 = false ;
         A6943Lb_rcp4 = httpContext.GetPar( "Lb_rcp4") ;
         n6943Lb_rcp4 = false ;
         A6944Lb_rcp5 = httpContext.GetPar( "Lb_rcp5") ;
         n6944Lb_rcp5 = false ;
         A6945Lb_rcp6 = httpContext.GetPar( "Lb_rcp6") ;
         n6945Lb_rcp6 = false ;
         A6946Lb_rcpo1 = (short)(GXutil.lval( httpContext.GetPar( "Lb_rcpo1"))) ;
         n6946Lb_rcpo1 = false ;
         A6947Lb_rcpo2 = (short)(GXutil.lval( httpContext.GetPar( "Lb_rcpo2"))) ;
         n6947Lb_rcpo2 = false ;
         A6948Lb_rcpo3 = (short)(GXutil.lval( httpContext.GetPar( "Lb_rcpo3"))) ;
         n6948Lb_rcpo3 = false ;
         A6949Lb_rcpo4 = (short)(GXutil.lval( httpContext.GetPar( "Lb_rcpo4"))) ;
         n6949Lb_rcpo4 = false ;
         A6950Lb_rcpo5 = (short)(GXutil.lval( httpContext.GetPar( "Lb_rcpo5"))) ;
         n6950Lb_rcpo5 = false ;
         A6951Lb_rcpo6 = (short)(GXutil.lval( httpContext.GetPar( "Lb_rcpo6"))) ;
         n6951Lb_rcpo6 = false ;
         AV32Ex_ensayo = httpContext.GetPar( "Ex_ensayo") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Ex_ensayo", AV32Ex_ensayo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_X9983( A396EmprCod, A6933Lb_rcnens, A6934Lb_rcncar, A6935Lb_rccorc, A6936Lb_rcncorc, A6937Lb_rccor, A6938Lb_rcncor, A6939Lb_rctc, A6940Lb_rcp1, A6941Lb_rcp2, A6942Lb_rcp3, A6943Lb_rcp4, A6944Lb_rcp5, A6945Lb_rcp6, A6946Lb_rcpo1, A6947Lb_rcpo2, A6948Lb_rcpo3, A6949Lb_rcpo4, A6950Lb_rcpo5, A6951Lb_rcpo6, AV32Ex_ensayo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action45") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_45_X9983( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_51") == 0 )
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
         gxload_51( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA REGISTROS COLORES", ""), (short)(0)) ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public tregcor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tregcor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tregcor_impl.class ));
   }

   public tregcor_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TREGCOR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultimo Numero Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Linurc_Internalname, GXutil.ltrim( localUtil.ntoc( A6932Lb_Linurc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Linurc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6932Lb_Linurc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6932Lb_Linurc), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Linurc_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Linurc_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Lb rcLastn", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_rcLastn_Internalname, GXutil.ltrim( localUtil.ntoc( A6929Lb_rcLastn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_rcLastn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6929Lb_rcLastn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6929Lb_rcLastn), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_rcLastn_Jsonclick, 0, "", "", "", "", "", 1, edtLb_rcLastn_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREGCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount983 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_983 = (short)(1) ;
            scanStartX9983( ) ;
            while ( RcdFound983 != 0 )
            {
               init_level_properties983( ) ;
               getByPrimaryKeyX9983( ) ;
               addRowX9983( ) ;
               scanNextX9983( ) ;
            }
            scanEndX9983( ) ;
            nBlankRcdCount983 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalX9983( ) ;
         standaloneModalX9983( ) ;
         sMode983 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRowX9983( ) ;
            edtavnRcdDeleted_983_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_983_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_983_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_983_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rclin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rclin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcnens_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCNENS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcnens_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcnens_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcncar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCNCAR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rccorc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCCORC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcncorc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCNCORC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rccor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCCOR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcncor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCNCOR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rctc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCTC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcp1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP1_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcp2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP2_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcp3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcp4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP4_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcp5_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP5_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcp6_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP6_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcpo1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO1_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcpo2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO2_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcpo3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcpo4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO4_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcpo5_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO5_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcpo6_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO6_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcobs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCOBS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcobs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcobs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcFecEt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCFECET_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcFecEt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcFecEt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcFecEn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCFECEN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcFecEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcFecEn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcFecRe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCFECRE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcFecRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcFecRe_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcOpEnv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCOPENV_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcOpEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcOpEnv_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcOpApr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCOPAPR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcOpApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcOpApr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcOpNap_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCOPNAP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcOpNap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcOpNap_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcFeNap_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCFENAP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcFeNap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcFeNap_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLb_rcProDe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPRODE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcProDe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcProDe_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_983 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalX9983( ) ;
            }
            sendRowX9983( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode983 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount983 = (short)(5) ;
         nRcdExists_983 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartX9983( ) ;
            while ( RcdFound983 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_50983( ) ;
               init_level_properties983( ) ;
               standaloneNotModalX9983( ) ;
               getByPrimaryKeyX9983( ) ;
               standaloneModalX9983( ) ;
               addRowX9983( ) ;
               scanNextX9983( ) ;
            }
            scanEndX9983( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode983 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_50983( ) ;
      initAllX9983( ) ;
      init_level_properties983( ) ;
      nRcdExists_983 = (short)(0) ;
      nIsMod_983 = (short)(0) ;
      nRcdDeleted_983 = (short)(0) ;
      nBlankRcdCount983 = (short)(nBlankRcdUsr983+nBlankRcdCount983) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount983 > 0 )
      {
         standaloneNotModalX9983( ) ;
         standaloneModalX9983( ) ;
         addRowX9983( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLb_rclin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount983 = (short)(nBlankRcdCount983-1) ;
      }
      Gx_mode = sMode983 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TREGCOR.htm");
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
      e11X92 ();
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
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            Z6932Lb_Linurc = (int)(localUtil.ctol( httpContext.cgiGet( "Z6932Lb_Linurc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV32Ex_ensayo = httpContext.cgiGet( "vEX_ENSAYO") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Linurc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Linurc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_LINURC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_Linurc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6932Lb_Linurc = 0 ;
               n6932Lb_Linurc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6932Lb_Linurc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6932Lb_Linurc), 8, 0));
            }
            else
            {
               A6932Lb_Linurc = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_Linurc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6932Lb_Linurc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6932Lb_Linurc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6932Lb_Linurc), 8, 0));
            }
            A6929Lb_rcLastn = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_rcLastn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6929Lb_rcLastn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
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
                        e11X92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ALTERAR OBSERVAçõES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Alterar Observações' */
                        e12X92 ();
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
            initAllX921( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_983_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_983_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributesX921( ) ;
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

   public void confirm_X90( )
   {
      beforeValidateX921( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsX921( ) ;
         }
         else
         {
            checkExtendedTableX921( ) ;
            if ( AnyError == 0 )
            {
               zmX921( 50) ;
               zmX921( 51) ;
            }
            closeExtendedTableCursorsX921( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_X9983( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode21 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesX90( ) ;
      }
   }

   public void confirm_X9983( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowX9983( ) ;
         if ( ( nRcdExists_983 != 0 ) || ( nIsMod_983 != 0 ) )
         {
            getKeyX9983( ) ;
            if ( ( nRcdExists_983 == 0 ) && ( nRcdDeleted_983 == 0 ) )
            {
               if ( RcdFound983 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateX9983( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableX9983( ) ;
                     if ( AnyError == 0 )
                     {
                        zmX9983( 54) ;
                     }
                     closeExtendedTableCursorsX9983( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LB_RCLIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_rclin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound983 != 0 )
               {
                  if ( nRcdDeleted_983 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyX9983( ) ;
                     loadX9983( ) ;
                     beforeValidateX9983( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsX9983( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_983 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateX9983( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableX9983( ) ;
                           if ( AnyError == 0 )
                           {
                              zmX9983( 54) ;
                           }
                           closeExtendedTableCursorsX9983( ) ;
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
                  if ( nRcdDeleted_983 == 0 )
                  {
                     GXCCtl = "LB_RCLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_rclin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_983_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rclin_Internalname, GXutil.ltrim( localUtil.ntoc( A6930Lb_rclin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcnens_Internalname, GXutil.ltrim( localUtil.ntoc( A6933Lb_rcnens, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcncar_Internalname, GXutil.rtrim( A6934Lb_rcncar)) ;
         httpContext.changePostValue( edtLb_rccorc_Internalname, GXutil.rtrim( A6935Lb_rccorc)) ;
         httpContext.changePostValue( edtLb_rcncorc_Internalname, GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rccor_Internalname, GXutil.rtrim( A6937Lb_rccor)) ;
         httpContext.changePostValue( edtLb_rcncor_Internalname, GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rctc_Internalname, GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcp1_Internalname, GXutil.rtrim( A6940Lb_rcp1)) ;
         httpContext.changePostValue( edtLb_rcp2_Internalname, GXutil.rtrim( A6941Lb_rcp2)) ;
         httpContext.changePostValue( edtLb_rcp3_Internalname, GXutil.rtrim( A6942Lb_rcp3)) ;
         httpContext.changePostValue( edtLb_rcp4_Internalname, GXutil.rtrim( A6943Lb_rcp4)) ;
         httpContext.changePostValue( edtLb_rcp5_Internalname, GXutil.rtrim( A6944Lb_rcp5)) ;
         httpContext.changePostValue( edtLb_rcp6_Internalname, GXutil.rtrim( A6945Lb_rcp6)) ;
         httpContext.changePostValue( edtLb_rcpo1_Internalname, GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo2_Internalname, GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo3_Internalname, GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo4_Internalname, GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo5_Internalname, GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo6_Internalname, GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcobs_Internalname, A6931Lb_rcobs) ;
         httpContext.changePostValue( edtLb_rcFecEt_Internalname, localUtil.format(A7009Lb_rcFecEt, "99/99/99")) ;
         httpContext.changePostValue( edtLb_rcFecEn_Internalname, localUtil.format(A7010Lb_rcFecEn, "99/99/99")) ;
         httpContext.changePostValue( edtLb_rcFecRe_Internalname, localUtil.format(A7011Lb_rcFecRe, "99/99/99")) ;
         httpContext.changePostValue( edtLb_rcOpEnv_Internalname, GXutil.rtrim( A7012Lb_rcOpEnv)) ;
         httpContext.changePostValue( edtLb_rcOpApr_Internalname, GXutil.rtrim( A7013Lb_rcOpApr)) ;
         httpContext.changePostValue( edtLb_rcOpNap_Internalname, GXutil.rtrim( A7014Lb_rcOpNap)) ;
         httpContext.changePostValue( edtLb_rcFeNap_Internalname, localUtil.format(A7015Lb_rcFeNap, "99/99/99")) ;
         httpContext.changePostValue( edtLb_rcProDe_Internalname, GXutil.rtrim( A8022Lb_rcProDe)) ;
         httpContext.changePostValue( "ZT_"+"Z6930Lb_rclin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6930Lb_rclin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6933Lb_rcnens_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6933Lb_rcnens, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6934Lb_rcncar_"+sGXsfl_50_idx, GXutil.rtrim( Z6934Lb_rcncar)) ;
         httpContext.changePostValue( "ZT_"+"Z6935Lb_rccorc_"+sGXsfl_50_idx, GXutil.rtrim( Z6935Lb_rccorc)) ;
         httpContext.changePostValue( "ZT_"+"Z6936Lb_rcncorc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6937Lb_rccor_"+sGXsfl_50_idx, GXutil.rtrim( Z6937Lb_rccor)) ;
         httpContext.changePostValue( "ZT_"+"Z6938Lb_rcncor_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6939Lb_rctc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6940Lb_rcp1_"+sGXsfl_50_idx, GXutil.rtrim( Z6940Lb_rcp1)) ;
         httpContext.changePostValue( "ZT_"+"Z6941Lb_rcp2_"+sGXsfl_50_idx, GXutil.rtrim( Z6941Lb_rcp2)) ;
         httpContext.changePostValue( "ZT_"+"Z6942Lb_rcp3_"+sGXsfl_50_idx, GXutil.rtrim( Z6942Lb_rcp3)) ;
         httpContext.changePostValue( "ZT_"+"Z6943Lb_rcp4_"+sGXsfl_50_idx, GXutil.rtrim( Z6943Lb_rcp4)) ;
         httpContext.changePostValue( "ZT_"+"Z6944Lb_rcp5_"+sGXsfl_50_idx, GXutil.rtrim( Z6944Lb_rcp5)) ;
         httpContext.changePostValue( "ZT_"+"Z6945Lb_rcp6_"+sGXsfl_50_idx, GXutil.rtrim( Z6945Lb_rcp6)) ;
         httpContext.changePostValue( "ZT_"+"Z6946Lb_rcpo1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6947Lb_rcpo2_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6948Lb_rcpo3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6949Lb_rcpo4_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6950Lb_rcpo5_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6951Lb_rcpo6_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7009Lb_rcFecEt_"+sGXsfl_50_idx, localUtil.dtoc( Z7009Lb_rcFecEt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z7010Lb_rcFecEn_"+sGXsfl_50_idx, localUtil.dtoc( Z7010Lb_rcFecEn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z7011Lb_rcFecRe_"+sGXsfl_50_idx, localUtil.dtoc( Z7011Lb_rcFecRe, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z7012Lb_rcOpEnv_"+sGXsfl_50_idx, GXutil.rtrim( Z7012Lb_rcOpEnv)) ;
         httpContext.changePostValue( "ZT_"+"Z7013Lb_rcOpApr_"+sGXsfl_50_idx, GXutil.rtrim( Z7013Lb_rcOpApr)) ;
         httpContext.changePostValue( "ZT_"+"Z7014Lb_rcOpNap_"+sGXsfl_50_idx, GXutil.rtrim( Z7014Lb_rcOpNap)) ;
         httpContext.changePostValue( "ZT_"+"Z7015Lb_rcFeNap_"+sGXsfl_50_idx, localUtil.dtoc( Z7015Lb_rcFeNap, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8022Lb_rcProDe_"+sGXsfl_50_idx, GXutil.rtrim( Z8022Lb_rcProDe)) ;
         httpContext.changePostValue( "nRcdDeleted_983_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_983_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_983_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6934Lb_rcncar_"+sGXsfl_50_idx, GXutil.rtrim( A6934Lb_rcncar)) ;
         httpContext.changePostValue( "N6935Lb_rccorc_"+sGXsfl_50_idx, GXutil.rtrim( A6935Lb_rccorc)) ;
         httpContext.changePostValue( "N6936Lb_rcncorc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6937Lb_rccor_"+sGXsfl_50_idx, GXutil.rtrim( A6937Lb_rccor)) ;
         httpContext.changePostValue( "N6938Lb_rcncor_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6939Lb_rctc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6940Lb_rcp1_"+sGXsfl_50_idx, GXutil.rtrim( A6940Lb_rcp1)) ;
         httpContext.changePostValue( "N6941Lb_rcp2_"+sGXsfl_50_idx, GXutil.rtrim( A6941Lb_rcp2)) ;
         httpContext.changePostValue( "N6942Lb_rcp3_"+sGXsfl_50_idx, GXutil.rtrim( A6942Lb_rcp3)) ;
         httpContext.changePostValue( "N6943Lb_rcp4_"+sGXsfl_50_idx, GXutil.rtrim( A6943Lb_rcp4)) ;
         httpContext.changePostValue( "N6944Lb_rcp5_"+sGXsfl_50_idx, GXutil.rtrim( A6944Lb_rcp5)) ;
         httpContext.changePostValue( "N6945Lb_rcp6_"+sGXsfl_50_idx, GXutil.rtrim( A6945Lb_rcp6)) ;
         httpContext.changePostValue( "N6946Lb_rcpo1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6947Lb_rcpo2_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6948Lb_rcpo3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6949Lb_rcpo4_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6950Lb_rcpo5_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6951Lb_rcpo6_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_983 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_983_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_983_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rclin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCNENS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcnens_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCNCAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCCORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rccorc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCNCORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncorc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCCOR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rccor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCNCOR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCTC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rctc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP4_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP5_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp5_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP6_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp6_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO4_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO5_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo5_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO6_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo6_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcobs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCFECET_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecEt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCFECEN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecEn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCFECRE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecRe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCOPENV_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpEnv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCOPAPR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpApr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCOPNAP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpNap_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCFENAP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFeNap_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPRODE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcProDe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00X95 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A6929Lb_rcLastn = T00X95_A6929Lb_rcLastn[0] ;
         n6929Lb_rcLastn = T00X95_n6929Lb_rcLastn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      else
      {
         A6929Lb_rcLastn = 0 ;
         n6929Lb_rcLastn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaptionX90( )
   {
   }

   public void e11X92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tregcor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tregcor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tregcor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tregcor_impl.this.A396EmprCod = GXv_char2[0] ;
      tregcor_impl.this.AV11EmprNom = GXv_char3[0] ;
      tregcor_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e12X92( )
   {
      /* 'Alterar Observações' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.tregcob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A6930Lb_rclin,8,0))}, new String[] {"EmprCod","CliCod","Lb_rclin"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zmX921( int GX_JID )
   {
      if ( ( GX_JID == 49 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T00X97_A279CliNom[0] ;
            Z6932Lb_Linurc = T00X97_A6932Lb_Linurc[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z6932Lb_Linurc = A6932Lb_Linurc ;
         }
      }
      if ( GX_JID == -49 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z6932Lb_Linurc = A6932Lb_Linurc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z6929Lb_rcLastn = A6929Lb_rcLastn ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TREGCOR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T00X98 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00X98_A407EmprNom[0] ;
      n407EmprNom = T00X98_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( true /* Level */ && ( isIns( )  || isDlt( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no PERMITIDA", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
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
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         }
      }
   }

   public void loadX921( )
   {
      /* Using cursor T00X910 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A407EmprNom = T00X910_A407EmprNom[0] ;
         n407EmprNom = T00X910_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T00X910_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A6932Lb_Linurc = T00X910_A6932Lb_Linurc[0] ;
         n6932Lb_Linurc = T00X910_n6932Lb_Linurc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6932Lb_Linurc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6932Lb_Linurc), 8, 0));
         A6929Lb_rcLastn = T00X910_A6929Lb_rcLastn[0] ;
         n6929Lb_rcLastn = T00X910_n6929Lb_rcLastn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
         zmX921( -49) ;
      }
      pr_default.close(6);
      onLoadActionsX921( ) ;
   }

   public void onLoadActionsX921( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void checkExtendedTableX921( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
      /* Using cursor T00X95 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A6929Lb_rcLastn = T00X95_A6929Lb_rcLastn[0] ;
         n6929Lb_rcLastn = T00X95_n6929Lb_rcLastn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      else
      {
         nIsDirty_21 = (short)(1) ;
         A6929Lb_rcLastn = 0 ;
         n6929Lb_rcLastn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsX921( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_51( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00X912 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A6929Lb_rcLastn = T00X912_A6929Lb_rcLastn[0] ;
         n6929Lb_rcLastn = T00X912_n6929Lb_rcLastn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      else
      {
         A6929Lb_rcLastn = 0 ;
         n6929Lb_rcLastn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6929Lb_rcLastn, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKeyX921( )
   {
      /* Using cursor T00X913 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00X97 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00X97_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmX921( 49) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T00X97_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T00X97_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A6932Lb_Linurc = T00X97_A6932Lb_Linurc[0] ;
         n6932Lb_Linurc = T00X97_n6932Lb_Linurc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6932Lb_Linurc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6932Lb_Linurc), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadX921( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKeyX921( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKeyX921( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyX921( ) ;
      if ( RcdFound21 == 0 )
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
      RcdFound21 = (short)(0) ;
      /* Using cursor T00X914 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00X914_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T00X914_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00X914_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T00X914_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T00X914_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T00X915 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T00X915_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T00X915_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T00X915_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T00X915_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T00X915_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyX921( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertX921( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound21 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
               updateX921( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertX921( ) ;
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
                  insertX921( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
      getKeyX921( ) ;
      if ( RcdFound21 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tregcor");
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_X90( ) ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartX921( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndX921( ) ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
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
      scanStartX921( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNextX921( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndX921( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyX921( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00X96 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z279CliNom, T00X96_A279CliNom[0]) != 0 ) || ( Z6932Lb_Linurc != T00X96_A6932Lb_Linurc[0] ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T00X96_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T00X96_A279CliNom[0]);
            }
            if ( Z6932Lb_Linurc != T00X96_A6932Lb_Linurc[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_Linurc");
               GXutil.writeLogRaw("Old: ",Z6932Lb_Linurc);
               GXutil.writeLogRaw("Current: ",T00X96_A6932Lb_Linurc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertX921( )
   {
      beforeValidateX921( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableX921( ) ;
      }
      if ( AnyError == 0 )
      {
         zmX921( 0) ;
         checkOptimisticConcurrencyX921( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmX921( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertX921( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00X916 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A252CliCod), A279CliNom, Boolean.valueOf(n6932Lb_Linurc), Integer.valueOf(A6932Lb_Linurc), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
                        processLevelX921( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionX90( ) ;
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
            loadX921( ) ;
         }
         endLevelX921( ) ;
      }
      closeExtendedTableCursorsX921( ) ;
   }

   public void updateX921( )
   {
      beforeValidateX921( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableX921( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyX921( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmX921( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateX921( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00X917 */
                  pr_default.execute(12, new Object[] {A279CliNom, Boolean.valueOf(n6932Lb_Linurc), Integer.valueOf(A6932Lb_Linurc), A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateX921( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelX921( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionX90( ) ;
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
         endLevelX921( ) ;
      }
      closeExtendedTableCursorsX921( ) ;
   }

   public void deferredUpdateX921( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateX921( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyX921( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsX921( ) ;
         afterConfirmX921( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteX921( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00X918 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound21 == 0 )
                     {
                        initAllX921( ) ;
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
                     resetCaptionX90( ) ;
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelX921( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsX921( )
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
         /* Using cursor T00X920 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            A6929Lb_rcLastn = T00X920_A6929Lb_rcLastn[0] ;
            n6929Lb_rcLastn = T00X920_n6929Lb_rcLastn[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
         }
         else
         {
            A6929Lb_rcLastn = 0 ;
            n6929Lb_rcLastn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevelX9983( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowX9983( ) ;
         if ( ( nRcdExists_983 != 0 ) || ( nIsMod_983 != 0 ) )
         {
            standaloneNotModalX9983( ) ;
            getKeyX9983( ) ;
            if ( ( nRcdExists_983 == 0 ) && ( nRcdDeleted_983 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertX9983( ) ;
            }
            else
            {
               if ( RcdFound983 != 0 )
               {
                  if ( ( nRcdDeleted_983 != 0 ) && ( nRcdExists_983 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteX9983( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_983 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateX9983( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_983 == 0 )
                  {
                     GXCCtl = "LB_RCLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_rclin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_983_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rclin_Internalname, GXutil.ltrim( localUtil.ntoc( A6930Lb_rclin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcnens_Internalname, GXutil.ltrim( localUtil.ntoc( A6933Lb_rcnens, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcncar_Internalname, GXutil.rtrim( A6934Lb_rcncar)) ;
         httpContext.changePostValue( edtLb_rccorc_Internalname, GXutil.rtrim( A6935Lb_rccorc)) ;
         httpContext.changePostValue( edtLb_rcncorc_Internalname, GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rccor_Internalname, GXutil.rtrim( A6937Lb_rccor)) ;
         httpContext.changePostValue( edtLb_rcncor_Internalname, GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rctc_Internalname, GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcp1_Internalname, GXutil.rtrim( A6940Lb_rcp1)) ;
         httpContext.changePostValue( edtLb_rcp2_Internalname, GXutil.rtrim( A6941Lb_rcp2)) ;
         httpContext.changePostValue( edtLb_rcp3_Internalname, GXutil.rtrim( A6942Lb_rcp3)) ;
         httpContext.changePostValue( edtLb_rcp4_Internalname, GXutil.rtrim( A6943Lb_rcp4)) ;
         httpContext.changePostValue( edtLb_rcp5_Internalname, GXutil.rtrim( A6944Lb_rcp5)) ;
         httpContext.changePostValue( edtLb_rcp6_Internalname, GXutil.rtrim( A6945Lb_rcp6)) ;
         httpContext.changePostValue( edtLb_rcpo1_Internalname, GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo2_Internalname, GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo3_Internalname, GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo4_Internalname, GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo5_Internalname, GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcpo6_Internalname, GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_rcobs_Internalname, A6931Lb_rcobs) ;
         httpContext.changePostValue( edtLb_rcFecEt_Internalname, localUtil.format(A7009Lb_rcFecEt, "99/99/99")) ;
         httpContext.changePostValue( edtLb_rcFecEn_Internalname, localUtil.format(A7010Lb_rcFecEn, "99/99/99")) ;
         httpContext.changePostValue( edtLb_rcFecRe_Internalname, localUtil.format(A7011Lb_rcFecRe, "99/99/99")) ;
         httpContext.changePostValue( edtLb_rcOpEnv_Internalname, GXutil.rtrim( A7012Lb_rcOpEnv)) ;
         httpContext.changePostValue( edtLb_rcOpApr_Internalname, GXutil.rtrim( A7013Lb_rcOpApr)) ;
         httpContext.changePostValue( edtLb_rcOpNap_Internalname, GXutil.rtrim( A7014Lb_rcOpNap)) ;
         httpContext.changePostValue( edtLb_rcFeNap_Internalname, localUtil.format(A7015Lb_rcFeNap, "99/99/99")) ;
         httpContext.changePostValue( edtLb_rcProDe_Internalname, GXutil.rtrim( A8022Lb_rcProDe)) ;
         httpContext.changePostValue( "ZT_"+"Z6930Lb_rclin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6930Lb_rclin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6933Lb_rcnens_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6933Lb_rcnens, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6934Lb_rcncar_"+sGXsfl_50_idx, GXutil.rtrim( Z6934Lb_rcncar)) ;
         httpContext.changePostValue( "ZT_"+"Z6935Lb_rccorc_"+sGXsfl_50_idx, GXutil.rtrim( Z6935Lb_rccorc)) ;
         httpContext.changePostValue( "ZT_"+"Z6936Lb_rcncorc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6937Lb_rccor_"+sGXsfl_50_idx, GXutil.rtrim( Z6937Lb_rccor)) ;
         httpContext.changePostValue( "ZT_"+"Z6938Lb_rcncor_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6939Lb_rctc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6940Lb_rcp1_"+sGXsfl_50_idx, GXutil.rtrim( Z6940Lb_rcp1)) ;
         httpContext.changePostValue( "ZT_"+"Z6941Lb_rcp2_"+sGXsfl_50_idx, GXutil.rtrim( Z6941Lb_rcp2)) ;
         httpContext.changePostValue( "ZT_"+"Z6942Lb_rcp3_"+sGXsfl_50_idx, GXutil.rtrim( Z6942Lb_rcp3)) ;
         httpContext.changePostValue( "ZT_"+"Z6943Lb_rcp4_"+sGXsfl_50_idx, GXutil.rtrim( Z6943Lb_rcp4)) ;
         httpContext.changePostValue( "ZT_"+"Z6944Lb_rcp5_"+sGXsfl_50_idx, GXutil.rtrim( Z6944Lb_rcp5)) ;
         httpContext.changePostValue( "ZT_"+"Z6945Lb_rcp6_"+sGXsfl_50_idx, GXutil.rtrim( Z6945Lb_rcp6)) ;
         httpContext.changePostValue( "ZT_"+"Z6946Lb_rcpo1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6947Lb_rcpo2_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6948Lb_rcpo3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6949Lb_rcpo4_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6950Lb_rcpo5_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6951Lb_rcpo6_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7009Lb_rcFecEt_"+sGXsfl_50_idx, localUtil.dtoc( Z7009Lb_rcFecEt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z7010Lb_rcFecEn_"+sGXsfl_50_idx, localUtil.dtoc( Z7010Lb_rcFecEn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z7011Lb_rcFecRe_"+sGXsfl_50_idx, localUtil.dtoc( Z7011Lb_rcFecRe, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z7012Lb_rcOpEnv_"+sGXsfl_50_idx, GXutil.rtrim( Z7012Lb_rcOpEnv)) ;
         httpContext.changePostValue( "ZT_"+"Z7013Lb_rcOpApr_"+sGXsfl_50_idx, GXutil.rtrim( Z7013Lb_rcOpApr)) ;
         httpContext.changePostValue( "ZT_"+"Z7014Lb_rcOpNap_"+sGXsfl_50_idx, GXutil.rtrim( Z7014Lb_rcOpNap)) ;
         httpContext.changePostValue( "ZT_"+"Z7015Lb_rcFeNap_"+sGXsfl_50_idx, localUtil.dtoc( Z7015Lb_rcFeNap, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8022Lb_rcProDe_"+sGXsfl_50_idx, GXutil.rtrim( Z8022Lb_rcProDe)) ;
         httpContext.changePostValue( "nRcdDeleted_983_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_983_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_983_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6934Lb_rcncar_"+sGXsfl_50_idx, GXutil.rtrim( A6934Lb_rcncar)) ;
         httpContext.changePostValue( "N6935Lb_rccorc_"+sGXsfl_50_idx, GXutil.rtrim( A6935Lb_rccorc)) ;
         httpContext.changePostValue( "N6936Lb_rcncorc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6937Lb_rccor_"+sGXsfl_50_idx, GXutil.rtrim( A6937Lb_rccor)) ;
         httpContext.changePostValue( "N6938Lb_rcncor_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6939Lb_rctc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6940Lb_rcp1_"+sGXsfl_50_idx, GXutil.rtrim( A6940Lb_rcp1)) ;
         httpContext.changePostValue( "N6941Lb_rcp2_"+sGXsfl_50_idx, GXutil.rtrim( A6941Lb_rcp2)) ;
         httpContext.changePostValue( "N6942Lb_rcp3_"+sGXsfl_50_idx, GXutil.rtrim( A6942Lb_rcp3)) ;
         httpContext.changePostValue( "N6943Lb_rcp4_"+sGXsfl_50_idx, GXutil.rtrim( A6943Lb_rcp4)) ;
         httpContext.changePostValue( "N6944Lb_rcp5_"+sGXsfl_50_idx, GXutil.rtrim( A6944Lb_rcp5)) ;
         httpContext.changePostValue( "N6945Lb_rcp6_"+sGXsfl_50_idx, GXutil.rtrim( A6945Lb_rcp6)) ;
         httpContext.changePostValue( "N6946Lb_rcpo1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6947Lb_rcpo2_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6948Lb_rcpo3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6949Lb_rcpo4_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6950Lb_rcpo5_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6951Lb_rcpo6_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_983 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_983_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_983_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rclin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCNENS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcnens_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCNCAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCCORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rccorc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCNCORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncorc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCCOR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rccor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCNCOR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCTC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rctc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP4_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP5_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp5_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCP6_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp6_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO4_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO5_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo5_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPO6_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo6_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcobs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCFECET_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecEt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCFECEN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecEn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCFECRE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecRe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCOPENV_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpEnv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCOPAPR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpApr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCOPNAP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpNap_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCFENAP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFeNap_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RCPRODE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcProDe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00X920 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A6929Lb_rcLastn = T00X920_A6929Lb_rcLastn[0] ;
         n6929Lb_rcLastn = T00X920_n6929Lb_rcLastn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      else
      {
         A6929Lb_rcLastn = 0 ;
         n6929Lb_rcLastn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      /* End of After( level) rules */
      initAllX9983( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_983 = (short)(0) ;
      nIsMod_983 = (short)(0) ;
      nRcdDeleted_983 = (short)(0) ;
   }

   public void processLevelX921( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevelX9983( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelX921( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteX921( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tregcor");
         if ( AnyError == 0 )
         {
            confirmValuesX90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tregcor");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartX921( )
   {
      /* Scan By routine */
      /* Using cursor T00X921 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T00X921_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextX921( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T00X921_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEndX921( )
   {
      pr_default.close(15);
   }

   public void afterConfirmX921( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertX921( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateX921( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteX921( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteX921( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateX921( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesX921( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtLb_Linurc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Linurc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Linurc_Enabled), 5, 0), true);
      edtLb_rcLastn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcLastn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcLastn_Enabled), 5, 0), true);
   }

   public void zmX9983( int GX_JID )
   {
      if ( ( GX_JID == 52 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6933Lb_rcnens = T00X93_A6933Lb_rcnens[0] ;
            Z6934Lb_rcncar = T00X93_A6934Lb_rcncar[0] ;
            Z6935Lb_rccorc = T00X93_A6935Lb_rccorc[0] ;
            Z6936Lb_rcncorc = T00X93_A6936Lb_rcncorc[0] ;
            Z6937Lb_rccor = T00X93_A6937Lb_rccor[0] ;
            Z6938Lb_rcncor = T00X93_A6938Lb_rcncor[0] ;
            Z6939Lb_rctc = T00X93_A6939Lb_rctc[0] ;
            Z6940Lb_rcp1 = T00X93_A6940Lb_rcp1[0] ;
            Z6941Lb_rcp2 = T00X93_A6941Lb_rcp2[0] ;
            Z6942Lb_rcp3 = T00X93_A6942Lb_rcp3[0] ;
            Z6943Lb_rcp4 = T00X93_A6943Lb_rcp4[0] ;
            Z6944Lb_rcp5 = T00X93_A6944Lb_rcp5[0] ;
            Z6945Lb_rcp6 = T00X93_A6945Lb_rcp6[0] ;
            Z6946Lb_rcpo1 = T00X93_A6946Lb_rcpo1[0] ;
            Z6947Lb_rcpo2 = T00X93_A6947Lb_rcpo2[0] ;
            Z6948Lb_rcpo3 = T00X93_A6948Lb_rcpo3[0] ;
            Z6949Lb_rcpo4 = T00X93_A6949Lb_rcpo4[0] ;
            Z6950Lb_rcpo5 = T00X93_A6950Lb_rcpo5[0] ;
            Z6951Lb_rcpo6 = T00X93_A6951Lb_rcpo6[0] ;
            Z7009Lb_rcFecEt = T00X93_A7009Lb_rcFecEt[0] ;
            Z7010Lb_rcFecEn = T00X93_A7010Lb_rcFecEn[0] ;
            Z7011Lb_rcFecRe = T00X93_A7011Lb_rcFecRe[0] ;
            Z7012Lb_rcOpEnv = T00X93_A7012Lb_rcOpEnv[0] ;
            Z7013Lb_rcOpApr = T00X93_A7013Lb_rcOpApr[0] ;
            Z7014Lb_rcOpNap = T00X93_A7014Lb_rcOpNap[0] ;
            Z7015Lb_rcFeNap = T00X93_A7015Lb_rcFeNap[0] ;
            Z8022Lb_rcProDe = T00X93_A8022Lb_rcProDe[0] ;
         }
         else
         {
            Z6933Lb_rcnens = A6933Lb_rcnens ;
            Z6934Lb_rcncar = A6934Lb_rcncar ;
            Z6935Lb_rccorc = A6935Lb_rccorc ;
            Z6936Lb_rcncorc = A6936Lb_rcncorc ;
            Z6937Lb_rccor = A6937Lb_rccor ;
            Z6938Lb_rcncor = A6938Lb_rcncor ;
            Z6939Lb_rctc = A6939Lb_rctc ;
            Z6940Lb_rcp1 = A6940Lb_rcp1 ;
            Z6941Lb_rcp2 = A6941Lb_rcp2 ;
            Z6942Lb_rcp3 = A6942Lb_rcp3 ;
            Z6943Lb_rcp4 = A6943Lb_rcp4 ;
            Z6944Lb_rcp5 = A6944Lb_rcp5 ;
            Z6945Lb_rcp6 = A6945Lb_rcp6 ;
            Z6946Lb_rcpo1 = A6946Lb_rcpo1 ;
            Z6947Lb_rcpo2 = A6947Lb_rcpo2 ;
            Z6948Lb_rcpo3 = A6948Lb_rcpo3 ;
            Z6949Lb_rcpo4 = A6949Lb_rcpo4 ;
            Z6950Lb_rcpo5 = A6950Lb_rcpo5 ;
            Z6951Lb_rcpo6 = A6951Lb_rcpo6 ;
            Z7009Lb_rcFecEt = A7009Lb_rcFecEt ;
            Z7010Lb_rcFecEn = A7010Lb_rcFecEn ;
            Z7011Lb_rcFecRe = A7011Lb_rcFecRe ;
            Z7012Lb_rcOpEnv = A7012Lb_rcOpEnv ;
            Z7013Lb_rcOpApr = A7013Lb_rcOpApr ;
            Z7014Lb_rcOpNap = A7014Lb_rcOpNap ;
            Z7015Lb_rcFeNap = A7015Lb_rcFeNap ;
            Z8022Lb_rcProDe = A8022Lb_rcProDe ;
         }
      }
      if ( GX_JID == -52 )
      {
         Z252CliCod = A252CliCod ;
         Z6930Lb_rclin = A6930Lb_rclin ;
         Z6933Lb_rcnens = A6933Lb_rcnens ;
         Z6934Lb_rcncar = A6934Lb_rcncar ;
         Z6935Lb_rccorc = A6935Lb_rccorc ;
         Z6936Lb_rcncorc = A6936Lb_rcncorc ;
         Z6937Lb_rccor = A6937Lb_rccor ;
         Z6938Lb_rcncor = A6938Lb_rcncor ;
         Z6939Lb_rctc = A6939Lb_rctc ;
         Z6940Lb_rcp1 = A6940Lb_rcp1 ;
         Z6941Lb_rcp2 = A6941Lb_rcp2 ;
         Z6942Lb_rcp3 = A6942Lb_rcp3 ;
         Z6943Lb_rcp4 = A6943Lb_rcp4 ;
         Z6944Lb_rcp5 = A6944Lb_rcp5 ;
         Z6945Lb_rcp6 = A6945Lb_rcp6 ;
         Z6946Lb_rcpo1 = A6946Lb_rcpo1 ;
         Z6947Lb_rcpo2 = A6947Lb_rcpo2 ;
         Z6948Lb_rcpo3 = A6948Lb_rcpo3 ;
         Z6949Lb_rcpo4 = A6949Lb_rcpo4 ;
         Z6950Lb_rcpo5 = A6950Lb_rcpo5 ;
         Z6951Lb_rcpo6 = A6951Lb_rcpo6 ;
         Z6931Lb_rcobs = A6931Lb_rcobs ;
         Z7009Lb_rcFecEt = A7009Lb_rcFecEt ;
         Z7010Lb_rcFecEn = A7010Lb_rcFecEn ;
         Z7011Lb_rcFecRe = A7011Lb_rcFecRe ;
         Z7012Lb_rcOpEnv = A7012Lb_rcOpEnv ;
         Z7013Lb_rcOpApr = A7013Lb_rcOpApr ;
         Z7014Lb_rcOpNap = A7014Lb_rcOpNap ;
         Z7015Lb_rcFeNap = A7015Lb_rcFeNap ;
         Z8022Lb_rcProDe = A8022Lb_rcProDe ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalX9983( )
   {
      edtLb_rcobs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcobs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcobs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void standaloneModalX9983( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_rclin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rclin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rclin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rclin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void loadX9983( )
   {
      /* Using cursor T00X922 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound983 = (short)(1) ;
         A6931Lb_rcobs = T00X922_A6931Lb_rcobs[0] ;
         n6931Lb_rcobs = T00X922_n6931Lb_rcobs[0] ;
         A6933Lb_rcnens = T00X922_A6933Lb_rcnens[0] ;
         n6933Lb_rcnens = T00X922_n6933Lb_rcnens[0] ;
         A6934Lb_rcncar = T00X922_A6934Lb_rcncar[0] ;
         n6934Lb_rcncar = T00X922_n6934Lb_rcncar[0] ;
         A6935Lb_rccorc = T00X922_A6935Lb_rccorc[0] ;
         n6935Lb_rccorc = T00X922_n6935Lb_rccorc[0] ;
         A6936Lb_rcncorc = T00X922_A6936Lb_rcncorc[0] ;
         n6936Lb_rcncorc = T00X922_n6936Lb_rcncorc[0] ;
         A6937Lb_rccor = T00X922_A6937Lb_rccor[0] ;
         n6937Lb_rccor = T00X922_n6937Lb_rccor[0] ;
         A6938Lb_rcncor = T00X922_A6938Lb_rcncor[0] ;
         n6938Lb_rcncor = T00X922_n6938Lb_rcncor[0] ;
         A6939Lb_rctc = T00X922_A6939Lb_rctc[0] ;
         n6939Lb_rctc = T00X922_n6939Lb_rctc[0] ;
         A6940Lb_rcp1 = T00X922_A6940Lb_rcp1[0] ;
         n6940Lb_rcp1 = T00X922_n6940Lb_rcp1[0] ;
         A6941Lb_rcp2 = T00X922_A6941Lb_rcp2[0] ;
         n6941Lb_rcp2 = T00X922_n6941Lb_rcp2[0] ;
         A6942Lb_rcp3 = T00X922_A6942Lb_rcp3[0] ;
         n6942Lb_rcp3 = T00X922_n6942Lb_rcp3[0] ;
         A6943Lb_rcp4 = T00X922_A6943Lb_rcp4[0] ;
         n6943Lb_rcp4 = T00X922_n6943Lb_rcp4[0] ;
         A6944Lb_rcp5 = T00X922_A6944Lb_rcp5[0] ;
         n6944Lb_rcp5 = T00X922_n6944Lb_rcp5[0] ;
         A6945Lb_rcp6 = T00X922_A6945Lb_rcp6[0] ;
         n6945Lb_rcp6 = T00X922_n6945Lb_rcp6[0] ;
         A6946Lb_rcpo1 = T00X922_A6946Lb_rcpo1[0] ;
         n6946Lb_rcpo1 = T00X922_n6946Lb_rcpo1[0] ;
         A6947Lb_rcpo2 = T00X922_A6947Lb_rcpo2[0] ;
         n6947Lb_rcpo2 = T00X922_n6947Lb_rcpo2[0] ;
         A6948Lb_rcpo3 = T00X922_A6948Lb_rcpo3[0] ;
         n6948Lb_rcpo3 = T00X922_n6948Lb_rcpo3[0] ;
         A6949Lb_rcpo4 = T00X922_A6949Lb_rcpo4[0] ;
         n6949Lb_rcpo4 = T00X922_n6949Lb_rcpo4[0] ;
         A6950Lb_rcpo5 = T00X922_A6950Lb_rcpo5[0] ;
         n6950Lb_rcpo5 = T00X922_n6950Lb_rcpo5[0] ;
         A6951Lb_rcpo6 = T00X922_A6951Lb_rcpo6[0] ;
         n6951Lb_rcpo6 = T00X922_n6951Lb_rcpo6[0] ;
         A7009Lb_rcFecEt = T00X922_A7009Lb_rcFecEt[0] ;
         n7009Lb_rcFecEt = T00X922_n7009Lb_rcFecEt[0] ;
         A7010Lb_rcFecEn = T00X922_A7010Lb_rcFecEn[0] ;
         n7010Lb_rcFecEn = T00X922_n7010Lb_rcFecEn[0] ;
         A7011Lb_rcFecRe = T00X922_A7011Lb_rcFecRe[0] ;
         n7011Lb_rcFecRe = T00X922_n7011Lb_rcFecRe[0] ;
         A7012Lb_rcOpEnv = T00X922_A7012Lb_rcOpEnv[0] ;
         n7012Lb_rcOpEnv = T00X922_n7012Lb_rcOpEnv[0] ;
         A7013Lb_rcOpApr = T00X922_A7013Lb_rcOpApr[0] ;
         n7013Lb_rcOpApr = T00X922_n7013Lb_rcOpApr[0] ;
         A7014Lb_rcOpNap = T00X922_A7014Lb_rcOpNap[0] ;
         n7014Lb_rcOpNap = T00X922_n7014Lb_rcOpNap[0] ;
         A7015Lb_rcFeNap = T00X922_A7015Lb_rcFeNap[0] ;
         n7015Lb_rcFeNap = T00X922_n7015Lb_rcFeNap[0] ;
         A8022Lb_rcProDe = T00X922_A8022Lb_rcProDe[0] ;
         n8022Lb_rcProDe = T00X922_n8022Lb_rcProDe[0] ;
         zmX9983( -52) ;
      }
      pr_default.close(16);
      onLoadActionsX9983( ) ;
   }

   public void onLoadActionsX9983( )
   {
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcncar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rccorc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rccorc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncorc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcncorc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rccor_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rccor_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncor_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcncor_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rctc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rctc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp1_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp1_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp3_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp3_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp4_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp4_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp5_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp5_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp6_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp6_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo1_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo1_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo3_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo3_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo4_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo4_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo5_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo5_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo6_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo6_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void checkExtendedTableX9983( )
   {
      nIsDirty_983 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalX9983( ) ;
      if ( (0==A6930Lb_rclin) && true /* Level */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_int6[0] = A6930Lb_rclin ;
         new app.pregcor1(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
         tregcor_impl.this.A396EmprCod = GXv_char4[0] ;
         tregcor_impl.this.A252CliCod = GXv_int5[0] ;
         tregcor_impl.this.A6930Lb_rclin = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcncar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rccorc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rccorc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncorc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcncorc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rccor_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rccor_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncor_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcncor_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rctc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rctc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp1_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp1_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp3_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp3_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp4_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp4_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp5_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp5_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp6_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcp6_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo1_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo1_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo3_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo3_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo4_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo4_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo5_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo5_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo6_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLb_rcpo6_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( ( A6933Lb_rcnens > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A6933Lb_rcnens ;
         GXv_char3[0] = A6934Lb_rcncar ;
         GXv_char2[0] = A6935Lb_rccorc ;
         GXv_int5[0] = A6936Lb_rcncorc ;
         GXv_char7[0] = A6937Lb_rccor ;
         GXv_int8[0] = A6938Lb_rcncor ;
         GXv_int9[0] = A6939Lb_rctc ;
         GXv_char10[0] = A6940Lb_rcp1 ;
         GXv_char11[0] = A6941Lb_rcp2 ;
         GXv_char12[0] = A6942Lb_rcp3 ;
         GXv_char13[0] = A6943Lb_rcp4 ;
         GXv_char14[0] = A6944Lb_rcp5 ;
         GXv_char15[0] = A6945Lb_rcp6 ;
         GXv_int16[0] = A6946Lb_rcpo1 ;
         GXv_int17[0] = A6947Lb_rcpo2 ;
         GXv_int18[0] = A6948Lb_rcpo3 ;
         GXv_int19[0] = A6949Lb_rcpo4 ;
         GXv_int20[0] = A6950Lb_rcpo5 ;
         GXv_int21[0] = A6951Lb_rcpo6 ;
         GXv_char22[0] = AV32Ex_ensayo ;
         new app.pregcor2(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_char7, GXv_int8, GXv_int9, GXv_char10, GXv_char11, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_int21, GXv_char22) ;
         tregcor_impl.this.A396EmprCod = GXv_char4[0] ;
         tregcor_impl.this.A6933Lb_rcnens = GXv_int6[0] ;
         tregcor_impl.this.A6934Lb_rcncar = GXv_char3[0] ;
         tregcor_impl.this.A6935Lb_rccorc = GXv_char2[0] ;
         tregcor_impl.this.A6936Lb_rcncorc = GXv_int5[0] ;
         tregcor_impl.this.A6937Lb_rccor = GXv_char7[0] ;
         tregcor_impl.this.A6938Lb_rcncor = GXv_int8[0] ;
         tregcor_impl.this.A6939Lb_rctc = GXv_int9[0] ;
         tregcor_impl.this.A6940Lb_rcp1 = GXv_char10[0] ;
         tregcor_impl.this.A6941Lb_rcp2 = GXv_char11[0] ;
         tregcor_impl.this.A6942Lb_rcp3 = GXv_char12[0] ;
         tregcor_impl.this.A6943Lb_rcp4 = GXv_char13[0] ;
         tregcor_impl.this.A6944Lb_rcp5 = GXv_char14[0] ;
         tregcor_impl.this.A6945Lb_rcp6 = GXv_char15[0] ;
         tregcor_impl.this.A6946Lb_rcpo1 = GXv_int16[0] ;
         tregcor_impl.this.A6947Lb_rcpo2 = GXv_int17[0] ;
         tregcor_impl.this.A6948Lb_rcpo3 = GXv_int18[0] ;
         tregcor_impl.this.A6949Lb_rcpo4 = GXv_int19[0] ;
         tregcor_impl.this.A6950Lb_rcpo5 = GXv_int20[0] ;
         tregcor_impl.this.A6951Lb_rcpo6 = GXv_int21[0] ;
         tregcor_impl.this.AV32Ex_ensayo = GXv_char22[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Ex_ensayo", AV32Ex_ensayo);
      }
      if ( ( A6933Lb_rcnens > 0 ) && true /* After */ && ( GXutil.strcmp(AV32Ex_ensayo, httpContext.getMessage( "N", "")) == 0 ) )
      {
         GXCCtl = "LB_RCNENS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Este Numero de Ensaio NAO EXISTE ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcnens_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A6933Lb_rcnens > 0 ) && true /* After */ && ( GXutil.strcmp(AV32Ex_ensayo, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  )
      {
         GXCCtl = "LB_RCNENS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Este Numero de Ensaio JA EXISTE ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcnens_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A6938Lb_rcncor < A6929Lb_rcLastn ) && ( A6938Lb_rcncor > 0 ) && true /* After */ && ( A6933Lb_rcnens == 0 ) )
      {
         GXCCtl = "LB_RCNCOR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. O numero de cor tanto faz ou menor ao ultimo introduzido", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcncor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A6938Lb_rcncor == 0 ) && true /* After */ && ( A6933Lb_rcnens == 0 ) )
      {
         GXCCtl = "LB_RCNCOR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. O numero de cor não pode ser zero", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcncor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsX9983( )
   {
   }

   public void enableDisableX9983( )
   {
   }

   public void getKeyX9983( )
   {
      /* Using cursor T00X923 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound983 = (short)(1) ;
      }
      else
      {
         RcdFound983 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKeyX9983( )
   {
      /* Using cursor T00X93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00X93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmX9983( 52) ;
         RcdFound983 = (short)(1) ;
         initializeNonKeyX9983( ) ;
         A6931Lb_rcobs = T00X93_A6931Lb_rcobs[0] ;
         n6931Lb_rcobs = T00X93_n6931Lb_rcobs[0] ;
         A6930Lb_rclin = T00X93_A6930Lb_rclin[0] ;
         A6933Lb_rcnens = T00X93_A6933Lb_rcnens[0] ;
         n6933Lb_rcnens = T00X93_n6933Lb_rcnens[0] ;
         A6934Lb_rcncar = T00X93_A6934Lb_rcncar[0] ;
         n6934Lb_rcncar = T00X93_n6934Lb_rcncar[0] ;
         A6935Lb_rccorc = T00X93_A6935Lb_rccorc[0] ;
         n6935Lb_rccorc = T00X93_n6935Lb_rccorc[0] ;
         A6936Lb_rcncorc = T00X93_A6936Lb_rcncorc[0] ;
         n6936Lb_rcncorc = T00X93_n6936Lb_rcncorc[0] ;
         A6937Lb_rccor = T00X93_A6937Lb_rccor[0] ;
         n6937Lb_rccor = T00X93_n6937Lb_rccor[0] ;
         A6938Lb_rcncor = T00X93_A6938Lb_rcncor[0] ;
         n6938Lb_rcncor = T00X93_n6938Lb_rcncor[0] ;
         A6939Lb_rctc = T00X93_A6939Lb_rctc[0] ;
         n6939Lb_rctc = T00X93_n6939Lb_rctc[0] ;
         A6940Lb_rcp1 = T00X93_A6940Lb_rcp1[0] ;
         n6940Lb_rcp1 = T00X93_n6940Lb_rcp1[0] ;
         A6941Lb_rcp2 = T00X93_A6941Lb_rcp2[0] ;
         n6941Lb_rcp2 = T00X93_n6941Lb_rcp2[0] ;
         A6942Lb_rcp3 = T00X93_A6942Lb_rcp3[0] ;
         n6942Lb_rcp3 = T00X93_n6942Lb_rcp3[0] ;
         A6943Lb_rcp4 = T00X93_A6943Lb_rcp4[0] ;
         n6943Lb_rcp4 = T00X93_n6943Lb_rcp4[0] ;
         A6944Lb_rcp5 = T00X93_A6944Lb_rcp5[0] ;
         n6944Lb_rcp5 = T00X93_n6944Lb_rcp5[0] ;
         A6945Lb_rcp6 = T00X93_A6945Lb_rcp6[0] ;
         n6945Lb_rcp6 = T00X93_n6945Lb_rcp6[0] ;
         A6946Lb_rcpo1 = T00X93_A6946Lb_rcpo1[0] ;
         n6946Lb_rcpo1 = T00X93_n6946Lb_rcpo1[0] ;
         A6947Lb_rcpo2 = T00X93_A6947Lb_rcpo2[0] ;
         n6947Lb_rcpo2 = T00X93_n6947Lb_rcpo2[0] ;
         A6948Lb_rcpo3 = T00X93_A6948Lb_rcpo3[0] ;
         n6948Lb_rcpo3 = T00X93_n6948Lb_rcpo3[0] ;
         A6949Lb_rcpo4 = T00X93_A6949Lb_rcpo4[0] ;
         n6949Lb_rcpo4 = T00X93_n6949Lb_rcpo4[0] ;
         A6950Lb_rcpo5 = T00X93_A6950Lb_rcpo5[0] ;
         n6950Lb_rcpo5 = T00X93_n6950Lb_rcpo5[0] ;
         A6951Lb_rcpo6 = T00X93_A6951Lb_rcpo6[0] ;
         n6951Lb_rcpo6 = T00X93_n6951Lb_rcpo6[0] ;
         A7009Lb_rcFecEt = T00X93_A7009Lb_rcFecEt[0] ;
         n7009Lb_rcFecEt = T00X93_n7009Lb_rcFecEt[0] ;
         A7010Lb_rcFecEn = T00X93_A7010Lb_rcFecEn[0] ;
         n7010Lb_rcFecEn = T00X93_n7010Lb_rcFecEn[0] ;
         A7011Lb_rcFecRe = T00X93_A7011Lb_rcFecRe[0] ;
         n7011Lb_rcFecRe = T00X93_n7011Lb_rcFecRe[0] ;
         A7012Lb_rcOpEnv = T00X93_A7012Lb_rcOpEnv[0] ;
         n7012Lb_rcOpEnv = T00X93_n7012Lb_rcOpEnv[0] ;
         A7013Lb_rcOpApr = T00X93_A7013Lb_rcOpApr[0] ;
         n7013Lb_rcOpApr = T00X93_n7013Lb_rcOpApr[0] ;
         A7014Lb_rcOpNap = T00X93_A7014Lb_rcOpNap[0] ;
         n7014Lb_rcOpNap = T00X93_n7014Lb_rcOpNap[0] ;
         A7015Lb_rcFeNap = T00X93_A7015Lb_rcFeNap[0] ;
         n7015Lb_rcFeNap = T00X93_n7015Lb_rcFeNap[0] ;
         A8022Lb_rcProDe = T00X93_A8022Lb_rcProDe[0] ;
         n8022Lb_rcProDe = T00X93_n8022Lb_rcProDe[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z6930Lb_rclin = A6930Lb_rclin ;
         sMode983 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalX9983( ) ;
         loadX9983( ) ;
         Gx_mode = sMode983 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound983 = (short)(0) ;
         initializeNonKeyX9983( ) ;
         sMode983 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalX9983( ) ;
         Gx_mode = sMode983 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesX9983( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyX9983( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00X92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREGCOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z6933Lb_rcnens != T00X92_A6933Lb_rcnens[0] ) || ( GXutil.strcmp(Z6934Lb_rcncar, T00X92_A6934Lb_rcncar[0]) != 0 ) || ( GXutil.strcmp(Z6935Lb_rccorc, T00X92_A6935Lb_rccorc[0]) != 0 ) || ( Z6936Lb_rcncorc != T00X92_A6936Lb_rcncorc[0] ) || ( GXutil.strcmp(Z6937Lb_rccor, T00X92_A6937Lb_rccor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6938Lb_rcncor != T00X92_A6938Lb_rcncor[0] ) || ( Z6939Lb_rctc != T00X92_A6939Lb_rctc[0] ) || ( GXutil.strcmp(Z6940Lb_rcp1, T00X92_A6940Lb_rcp1[0]) != 0 ) || ( GXutil.strcmp(Z6941Lb_rcp2, T00X92_A6941Lb_rcp2[0]) != 0 ) || ( GXutil.strcmp(Z6942Lb_rcp3, T00X92_A6942Lb_rcp3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6943Lb_rcp4, T00X92_A6943Lb_rcp4[0]) != 0 ) || ( GXutil.strcmp(Z6944Lb_rcp5, T00X92_A6944Lb_rcp5[0]) != 0 ) || ( GXutil.strcmp(Z6945Lb_rcp6, T00X92_A6945Lb_rcp6[0]) != 0 ) || ( Z6946Lb_rcpo1 != T00X92_A6946Lb_rcpo1[0] ) || ( Z6947Lb_rcpo2 != T00X92_A6947Lb_rcpo2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6948Lb_rcpo3 != T00X92_A6948Lb_rcpo3[0] ) || ( Z6949Lb_rcpo4 != T00X92_A6949Lb_rcpo4[0] ) || ( Z6950Lb_rcpo5 != T00X92_A6950Lb_rcpo5[0] ) || ( Z6951Lb_rcpo6 != T00X92_A6951Lb_rcpo6[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z7009Lb_rcFecEt), GXutil.resetTime(T00X92_A7009Lb_rcFecEt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z7010Lb_rcFecEn), GXutil.resetTime(T00X92_A7010Lb_rcFecEn[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z7011Lb_rcFecRe), GXutil.resetTime(T00X92_A7011Lb_rcFecRe[0])) ) || ( GXutil.strcmp(Z7012Lb_rcOpEnv, T00X92_A7012Lb_rcOpEnv[0]) != 0 ) || ( GXutil.strcmp(Z7013Lb_rcOpApr, T00X92_A7013Lb_rcOpApr[0]) != 0 ) || ( GXutil.strcmp(Z7014Lb_rcOpNap, T00X92_A7014Lb_rcOpNap[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z7015Lb_rcFeNap), GXutil.resetTime(T00X92_A7015Lb_rcFeNap[0])) ) || ( GXutil.strcmp(Z8022Lb_rcProDe, T00X92_A8022Lb_rcProDe[0]) != 0 ) )
         {
            if ( Z6933Lb_rcnens != T00X92_A6933Lb_rcnens[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcnens");
               GXutil.writeLogRaw("Old: ",Z6933Lb_rcnens);
               GXutil.writeLogRaw("Current: ",T00X92_A6933Lb_rcnens[0]);
            }
            if ( GXutil.strcmp(Z6934Lb_rcncar, T00X92_A6934Lb_rcncar[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcncar");
               GXutil.writeLogRaw("Old: ",Z6934Lb_rcncar);
               GXutil.writeLogRaw("Current: ",T00X92_A6934Lb_rcncar[0]);
            }
            if ( GXutil.strcmp(Z6935Lb_rccorc, T00X92_A6935Lb_rccorc[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rccorc");
               GXutil.writeLogRaw("Old: ",Z6935Lb_rccorc);
               GXutil.writeLogRaw("Current: ",T00X92_A6935Lb_rccorc[0]);
            }
            if ( Z6936Lb_rcncorc != T00X92_A6936Lb_rcncorc[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcncorc");
               GXutil.writeLogRaw("Old: ",Z6936Lb_rcncorc);
               GXutil.writeLogRaw("Current: ",T00X92_A6936Lb_rcncorc[0]);
            }
            if ( GXutil.strcmp(Z6937Lb_rccor, T00X92_A6937Lb_rccor[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rccor");
               GXutil.writeLogRaw("Old: ",Z6937Lb_rccor);
               GXutil.writeLogRaw("Current: ",T00X92_A6937Lb_rccor[0]);
            }
            if ( Z6938Lb_rcncor != T00X92_A6938Lb_rcncor[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcncor");
               GXutil.writeLogRaw("Old: ",Z6938Lb_rcncor);
               GXutil.writeLogRaw("Current: ",T00X92_A6938Lb_rcncor[0]);
            }
            if ( Z6939Lb_rctc != T00X92_A6939Lb_rctc[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rctc");
               GXutil.writeLogRaw("Old: ",Z6939Lb_rctc);
               GXutil.writeLogRaw("Current: ",T00X92_A6939Lb_rctc[0]);
            }
            if ( GXutil.strcmp(Z6940Lb_rcp1, T00X92_A6940Lb_rcp1[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcp1");
               GXutil.writeLogRaw("Old: ",Z6940Lb_rcp1);
               GXutil.writeLogRaw("Current: ",T00X92_A6940Lb_rcp1[0]);
            }
            if ( GXutil.strcmp(Z6941Lb_rcp2, T00X92_A6941Lb_rcp2[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcp2");
               GXutil.writeLogRaw("Old: ",Z6941Lb_rcp2);
               GXutil.writeLogRaw("Current: ",T00X92_A6941Lb_rcp2[0]);
            }
            if ( GXutil.strcmp(Z6942Lb_rcp3, T00X92_A6942Lb_rcp3[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcp3");
               GXutil.writeLogRaw("Old: ",Z6942Lb_rcp3);
               GXutil.writeLogRaw("Current: ",T00X92_A6942Lb_rcp3[0]);
            }
            if ( GXutil.strcmp(Z6943Lb_rcp4, T00X92_A6943Lb_rcp4[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcp4");
               GXutil.writeLogRaw("Old: ",Z6943Lb_rcp4);
               GXutil.writeLogRaw("Current: ",T00X92_A6943Lb_rcp4[0]);
            }
            if ( GXutil.strcmp(Z6944Lb_rcp5, T00X92_A6944Lb_rcp5[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcp5");
               GXutil.writeLogRaw("Old: ",Z6944Lb_rcp5);
               GXutil.writeLogRaw("Current: ",T00X92_A6944Lb_rcp5[0]);
            }
            if ( GXutil.strcmp(Z6945Lb_rcp6, T00X92_A6945Lb_rcp6[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcp6");
               GXutil.writeLogRaw("Old: ",Z6945Lb_rcp6);
               GXutil.writeLogRaw("Current: ",T00X92_A6945Lb_rcp6[0]);
            }
            if ( Z6946Lb_rcpo1 != T00X92_A6946Lb_rcpo1[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcpo1");
               GXutil.writeLogRaw("Old: ",Z6946Lb_rcpo1);
               GXutil.writeLogRaw("Current: ",T00X92_A6946Lb_rcpo1[0]);
            }
            if ( Z6947Lb_rcpo2 != T00X92_A6947Lb_rcpo2[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcpo2");
               GXutil.writeLogRaw("Old: ",Z6947Lb_rcpo2);
               GXutil.writeLogRaw("Current: ",T00X92_A6947Lb_rcpo2[0]);
            }
            if ( Z6948Lb_rcpo3 != T00X92_A6948Lb_rcpo3[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcpo3");
               GXutil.writeLogRaw("Old: ",Z6948Lb_rcpo3);
               GXutil.writeLogRaw("Current: ",T00X92_A6948Lb_rcpo3[0]);
            }
            if ( Z6949Lb_rcpo4 != T00X92_A6949Lb_rcpo4[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcpo4");
               GXutil.writeLogRaw("Old: ",Z6949Lb_rcpo4);
               GXutil.writeLogRaw("Current: ",T00X92_A6949Lb_rcpo4[0]);
            }
            if ( Z6950Lb_rcpo5 != T00X92_A6950Lb_rcpo5[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcpo5");
               GXutil.writeLogRaw("Old: ",Z6950Lb_rcpo5);
               GXutil.writeLogRaw("Current: ",T00X92_A6950Lb_rcpo5[0]);
            }
            if ( Z6951Lb_rcpo6 != T00X92_A6951Lb_rcpo6[0] )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcpo6");
               GXutil.writeLogRaw("Old: ",Z6951Lb_rcpo6);
               GXutil.writeLogRaw("Current: ",T00X92_A6951Lb_rcpo6[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7009Lb_rcFecEt), GXutil.resetTime(T00X92_A7009Lb_rcFecEt[0])) ) )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcFecEt");
               GXutil.writeLogRaw("Old: ",Z7009Lb_rcFecEt);
               GXutil.writeLogRaw("Current: ",T00X92_A7009Lb_rcFecEt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7010Lb_rcFecEn), GXutil.resetTime(T00X92_A7010Lb_rcFecEn[0])) ) )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcFecEn");
               GXutil.writeLogRaw("Old: ",Z7010Lb_rcFecEn);
               GXutil.writeLogRaw("Current: ",T00X92_A7010Lb_rcFecEn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7011Lb_rcFecRe), GXutil.resetTime(T00X92_A7011Lb_rcFecRe[0])) ) )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcFecRe");
               GXutil.writeLogRaw("Old: ",Z7011Lb_rcFecRe);
               GXutil.writeLogRaw("Current: ",T00X92_A7011Lb_rcFecRe[0]);
            }
            if ( GXutil.strcmp(Z7012Lb_rcOpEnv, T00X92_A7012Lb_rcOpEnv[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcOpEnv");
               GXutil.writeLogRaw("Old: ",Z7012Lb_rcOpEnv);
               GXutil.writeLogRaw("Current: ",T00X92_A7012Lb_rcOpEnv[0]);
            }
            if ( GXutil.strcmp(Z7013Lb_rcOpApr, T00X92_A7013Lb_rcOpApr[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcOpApr");
               GXutil.writeLogRaw("Old: ",Z7013Lb_rcOpApr);
               GXutil.writeLogRaw("Current: ",T00X92_A7013Lb_rcOpApr[0]);
            }
            if ( GXutil.strcmp(Z7014Lb_rcOpNap, T00X92_A7014Lb_rcOpNap[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcOpNap");
               GXutil.writeLogRaw("Old: ",Z7014Lb_rcOpNap);
               GXutil.writeLogRaw("Current: ",T00X92_A7014Lb_rcOpNap[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7015Lb_rcFeNap), GXutil.resetTime(T00X92_A7015Lb_rcFeNap[0])) ) )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcFeNap");
               GXutil.writeLogRaw("Old: ",Z7015Lb_rcFeNap);
               GXutil.writeLogRaw("Current: ",T00X92_A7015Lb_rcFeNap[0]);
            }
            if ( GXutil.strcmp(Z8022Lb_rcProDe, T00X92_A8022Lb_rcProDe[0]) != 0 )
            {
               GXutil.writeLogln("tregcor:[seudo value changed for attri]"+"Lb_rcProDe");
               GXutil.writeLogRaw("Old: ",Z8022Lb_rcProDe);
               GXutil.writeLogRaw("Current: ",T00X92_A8022Lb_rcProDe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPREGCOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertX9983( )
   {
      beforeValidateX9983( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableX9983( ) ;
      }
      if ( AnyError == 0 )
      {
         zmX9983( 0) ;
         checkOptimisticConcurrencyX9983( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmX9983( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertX9983( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00X924 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin), Boolean.valueOf(n6933Lb_rcnens), Integer.valueOf(A6933Lb_rcnens), Boolean.valueOf(n6934Lb_rcncar), A6934Lb_rcncar, Boolean.valueOf(n6935Lb_rccorc), A6935Lb_rccorc, Boolean.valueOf(n6936Lb_rcncorc), Integer.valueOf(A6936Lb_rcncorc), Boolean.valueOf(n6937Lb_rccor), A6937Lb_rccor, Boolean.valueOf(n6938Lb_rcncor), Integer.valueOf(A6938Lb_rcncor), Boolean.valueOf(n6939Lb_rctc), Byte.valueOf(A6939Lb_rctc), Boolean.valueOf(n6940Lb_rcp1), A6940Lb_rcp1, Boolean.valueOf(n6941Lb_rcp2), A6941Lb_rcp2, Boolean.valueOf(n6942Lb_rcp3), A6942Lb_rcp3, Boolean.valueOf(n6943Lb_rcp4), A6943Lb_rcp4, Boolean.valueOf(n6944Lb_rcp5), A6944Lb_rcp5, Boolean.valueOf(n6945Lb_rcp6), A6945Lb_rcp6, Boolean.valueOf(n6946Lb_rcpo1), Short.valueOf(A6946Lb_rcpo1), Boolean.valueOf(n6947Lb_rcpo2), Short.valueOf(A6947Lb_rcpo2), Boolean.valueOf(n6948Lb_rcpo3), Short.valueOf(A6948Lb_rcpo3), Boolean.valueOf(n6949Lb_rcpo4), Short.valueOf(A6949Lb_rcpo4), Boolean.valueOf(n6950Lb_rcpo5), Short.valueOf(A6950Lb_rcpo5), Boolean.valueOf(n6951Lb_rcpo6), Short.valueOf(A6951Lb_rcpo6), Boolean.valueOf(n6931Lb_rcobs), A6931Lb_rcobs, Boolean.valueOf(n7009Lb_rcFecEt), A7009Lb_rcFecEt, Boolean.valueOf(n7010Lb_rcFecEn), A7010Lb_rcFecEn, Boolean.valueOf(n7011Lb_rcFecRe), A7011Lb_rcFecRe, Boolean.valueOf(n7012Lb_rcOpEnv), A7012Lb_rcOpEnv, Boolean.valueOf(n7013Lb_rcOpApr), A7013Lb_rcOpApr, Boolean.valueOf(n7014Lb_rcOpNap), A7014Lb_rcOpNap, Boolean.valueOf(n7015Lb_rcFeNap), A7015Lb_rcFeNap, Boolean.valueOf(n8022Lb_rcProDe), A8022Lb_rcProDe, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
                  if ( (pr_default.getStatus(18) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        httpContext.wjLoc = formatLink("app.tregcob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A6930Lb_rclin,8,0))}, new String[] {"EmprCod","CliCod","Lb_rclin"})  ;
                     }
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
            loadX9983( ) ;
         }
         endLevelX9983( ) ;
      }
      closeExtendedTableCursorsX9983( ) ;
   }

   public void updateX9983( )
   {
      beforeValidateX9983( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableX9983( ) ;
      }
      if ( ( nIsMod_983 != 0 ) || ( nIsDirty_983 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyX9983( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmX9983( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateX9983( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00X925 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n6933Lb_rcnens), Integer.valueOf(A6933Lb_rcnens), Boolean.valueOf(n6934Lb_rcncar), A6934Lb_rcncar, Boolean.valueOf(n6935Lb_rccorc), A6935Lb_rccorc, Boolean.valueOf(n6936Lb_rcncorc), Integer.valueOf(A6936Lb_rcncorc), Boolean.valueOf(n6937Lb_rccor), A6937Lb_rccor, Boolean.valueOf(n6938Lb_rcncor), Integer.valueOf(A6938Lb_rcncor), Boolean.valueOf(n6939Lb_rctc), Byte.valueOf(A6939Lb_rctc), Boolean.valueOf(n6940Lb_rcp1), A6940Lb_rcp1, Boolean.valueOf(n6941Lb_rcp2), A6941Lb_rcp2, Boolean.valueOf(n6942Lb_rcp3), A6942Lb_rcp3, Boolean.valueOf(n6943Lb_rcp4), A6943Lb_rcp4, Boolean.valueOf(n6944Lb_rcp5), A6944Lb_rcp5, Boolean.valueOf(n6945Lb_rcp6), A6945Lb_rcp6, Boolean.valueOf(n6946Lb_rcpo1), Short.valueOf(A6946Lb_rcpo1), Boolean.valueOf(n6947Lb_rcpo2), Short.valueOf(A6947Lb_rcpo2), Boolean.valueOf(n6948Lb_rcpo3), Short.valueOf(A6948Lb_rcpo3), Boolean.valueOf(n6949Lb_rcpo4), Short.valueOf(A6949Lb_rcpo4), Boolean.valueOf(n6950Lb_rcpo5), Short.valueOf(A6950Lb_rcpo5), Boolean.valueOf(n6951Lb_rcpo6), Short.valueOf(A6951Lb_rcpo6), Boolean.valueOf(n6931Lb_rcobs), A6931Lb_rcobs, Boolean.valueOf(n7009Lb_rcFecEt), A7009Lb_rcFecEt, Boolean.valueOf(n7010Lb_rcFecEn), A7010Lb_rcFecEn, Boolean.valueOf(n7011Lb_rcFecRe), A7011Lb_rcFecRe, Boolean.valueOf(n7012Lb_rcOpEnv), A7012Lb_rcOpEnv, Boolean.valueOf(n7013Lb_rcOpApr), A7013Lb_rcOpApr, Boolean.valueOf(n7014Lb_rcOpNap), A7014Lb_rcOpNap, Boolean.valueOf(n7015Lb_rcFeNap), A7015Lb_rcFeNap, Boolean.valueOf(n8022Lb_rcProDe), A8022Lb_rcProDe, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREGCOR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateX9983( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyX9983( ) ;
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
            endLevelX9983( ) ;
         }
      }
      closeExtendedTableCursorsX9983( ) ;
   }

   public void deferredUpdateX9983( )
   {
   }

   public void deleteX9983( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateX9983( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyX9983( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsX9983( ) ;
         afterConfirmX9983( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteX9983( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00X926 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
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
      sMode983 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelX9983( ) ;
      Gx_mode = sMode983 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsX9983( )
   {
      standaloneModalX9983( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (0==A6930Lb_rclin) && true /* Level */ && isIns( )  )
         {
            GXv_char22[0] = A396EmprCod ;
            GXv_int8[0] = A252CliCod ;
            GXv_int6[0] = A6930Lb_rclin ;
            new app.pregcor1(remoteHandle, context).execute( GXv_char22, GXv_int8, GXv_int6) ;
            tregcor_impl.this.A396EmprCod = GXv_char22[0] ;
            tregcor_impl.this.A252CliCod = GXv_int8[0] ;
            tregcor_impl.this.A6930Lb_rclin = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         if ( ( A6933Lb_rcnens > 0 ) && true /* After */ && ( GXutil.strcmp(AV32Ex_ensayo, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  )
         {
            GXCCtl = "LB_RCNENS_" + sGXsfl_50_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Este Numero de Ensaio JA EXISTE ¡¡¡", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_rcnens_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcncar_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcncar_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rccorc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rccorc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcncorc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcncorc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rccor_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rccor_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcncor_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcncor_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rctc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rctc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcp1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcp1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcp2_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcp2_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcp3_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcp3_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcp4_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcp4_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcp5_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcp5_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcp6_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcp6_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcpo1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcpo1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcpo2_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcpo2_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcpo3_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcpo3_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcpo4_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcpo4_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcpo5_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcpo5_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( A6933Lb_rcnens > 0 )
         {
            edtLb_rcpo6_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         else
         {
            edtLb_rcpo6_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
         }
         if ( true /* Level */ && ( A6933Lb_rcnens > 0 ) && isDlt( )  )
         {
            GXCCtl = "LB_RCNENS_" + sGXsfl_50_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção não se pode eliminar uma linha de ensaio criada em Gesinlab", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_rcnens_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void endLevelX9983( )
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

   public void scanStartX9983( )
   {
      /* Scan By routine */
      /* Using cursor T00X927 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      RcdFound983 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound983 = (short)(1) ;
         A6930Lb_rclin = T00X927_A6930Lb_rclin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextX9983( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound983 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound983 = (short)(1) ;
         A6930Lb_rclin = T00X927_A6930Lb_rclin[0] ;
      }
   }

   public void scanEndX9983( )
   {
      pr_default.close(21);
   }

   public void afterConfirmX9983( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertX9983( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateX9983( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteX9983( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteX9983( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateX9983( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesX9983( )
   {
      edtLb_rclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rclin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcnens_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcnens_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcnens_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcncar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rccorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcncorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rccor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcncor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rctc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcobs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcobs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcobs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcFecEt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcFecEt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcFecEt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcFecEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcFecEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcFecEn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcFecRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcFecRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcFecRe_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcOpEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcOpEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcOpEnv_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcOpApr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcOpApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcOpApr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcOpNap_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcOpNap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcOpNap_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcFeNap_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcFeNap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcFeNap_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcProDe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcProDe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcProDe_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashesX9983( )
   {
   }

   public void send_integrity_lvl_hashesX921( )
   {
   }

   public void subsflControlProps_50983( )
   {
      edtavnRcdDeleted_983_Internalname = "vNRCDDELETED_983_"+sGXsfl_50_idx ;
      edtLb_rclin_Internalname = "LB_RCLIN_"+sGXsfl_50_idx ;
      edtLb_rcnens_Internalname = "LB_RCNENS_"+sGXsfl_50_idx ;
      edtLb_rcncar_Internalname = "LB_RCNCAR_"+sGXsfl_50_idx ;
      edtLb_rccorc_Internalname = "LB_RCCORC_"+sGXsfl_50_idx ;
      edtLb_rcncorc_Internalname = "LB_RCNCORC_"+sGXsfl_50_idx ;
      edtLb_rccor_Internalname = "LB_RCCOR_"+sGXsfl_50_idx ;
      edtLb_rcncor_Internalname = "LB_RCNCOR_"+sGXsfl_50_idx ;
      edtLb_rctc_Internalname = "LB_RCTC_"+sGXsfl_50_idx ;
      edtLb_rcp1_Internalname = "LB_RCP1_"+sGXsfl_50_idx ;
      edtLb_rcp2_Internalname = "LB_RCP2_"+sGXsfl_50_idx ;
      edtLb_rcp3_Internalname = "LB_RCP3_"+sGXsfl_50_idx ;
      edtLb_rcp4_Internalname = "LB_RCP4_"+sGXsfl_50_idx ;
      edtLb_rcp5_Internalname = "LB_RCP5_"+sGXsfl_50_idx ;
      edtLb_rcp6_Internalname = "LB_RCP6_"+sGXsfl_50_idx ;
      edtLb_rcpo1_Internalname = "LB_RCPO1_"+sGXsfl_50_idx ;
      edtLb_rcpo2_Internalname = "LB_RCPO2_"+sGXsfl_50_idx ;
      edtLb_rcpo3_Internalname = "LB_RCPO3_"+sGXsfl_50_idx ;
      edtLb_rcpo4_Internalname = "LB_RCPO4_"+sGXsfl_50_idx ;
      edtLb_rcpo5_Internalname = "LB_RCPO5_"+sGXsfl_50_idx ;
      edtLb_rcpo6_Internalname = "LB_RCPO6_"+sGXsfl_50_idx ;
      edtLb_rcobs_Internalname = "LB_RCOBS_"+sGXsfl_50_idx ;
      edtLb_rcFecEt_Internalname = "LB_RCFECET_"+sGXsfl_50_idx ;
      edtLb_rcFecEn_Internalname = "LB_RCFECEN_"+sGXsfl_50_idx ;
      edtLb_rcFecRe_Internalname = "LB_RCFECRE_"+sGXsfl_50_idx ;
      edtLb_rcOpEnv_Internalname = "LB_RCOPENV_"+sGXsfl_50_idx ;
      edtLb_rcOpApr_Internalname = "LB_RCOPAPR_"+sGXsfl_50_idx ;
      edtLb_rcOpNap_Internalname = "LB_RCOPNAP_"+sGXsfl_50_idx ;
      edtLb_rcFeNap_Internalname = "LB_RCFENAP_"+sGXsfl_50_idx ;
      edtLb_rcProDe_Internalname = "LB_RCPRODE_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_50983( )
   {
      edtavnRcdDeleted_983_Internalname = "vNRCDDELETED_983_"+sGXsfl_50_fel_idx ;
      edtLb_rclin_Internalname = "LB_RCLIN_"+sGXsfl_50_fel_idx ;
      edtLb_rcnens_Internalname = "LB_RCNENS_"+sGXsfl_50_fel_idx ;
      edtLb_rcncar_Internalname = "LB_RCNCAR_"+sGXsfl_50_fel_idx ;
      edtLb_rccorc_Internalname = "LB_RCCORC_"+sGXsfl_50_fel_idx ;
      edtLb_rcncorc_Internalname = "LB_RCNCORC_"+sGXsfl_50_fel_idx ;
      edtLb_rccor_Internalname = "LB_RCCOR_"+sGXsfl_50_fel_idx ;
      edtLb_rcncor_Internalname = "LB_RCNCOR_"+sGXsfl_50_fel_idx ;
      edtLb_rctc_Internalname = "LB_RCTC_"+sGXsfl_50_fel_idx ;
      edtLb_rcp1_Internalname = "LB_RCP1_"+sGXsfl_50_fel_idx ;
      edtLb_rcp2_Internalname = "LB_RCP2_"+sGXsfl_50_fel_idx ;
      edtLb_rcp3_Internalname = "LB_RCP3_"+sGXsfl_50_fel_idx ;
      edtLb_rcp4_Internalname = "LB_RCP4_"+sGXsfl_50_fel_idx ;
      edtLb_rcp5_Internalname = "LB_RCP5_"+sGXsfl_50_fel_idx ;
      edtLb_rcp6_Internalname = "LB_RCP6_"+sGXsfl_50_fel_idx ;
      edtLb_rcpo1_Internalname = "LB_RCPO1_"+sGXsfl_50_fel_idx ;
      edtLb_rcpo2_Internalname = "LB_RCPO2_"+sGXsfl_50_fel_idx ;
      edtLb_rcpo3_Internalname = "LB_RCPO3_"+sGXsfl_50_fel_idx ;
      edtLb_rcpo4_Internalname = "LB_RCPO4_"+sGXsfl_50_fel_idx ;
      edtLb_rcpo5_Internalname = "LB_RCPO5_"+sGXsfl_50_fel_idx ;
      edtLb_rcpo6_Internalname = "LB_RCPO6_"+sGXsfl_50_fel_idx ;
      edtLb_rcobs_Internalname = "LB_RCOBS_"+sGXsfl_50_fel_idx ;
      edtLb_rcFecEt_Internalname = "LB_RCFECET_"+sGXsfl_50_fel_idx ;
      edtLb_rcFecEn_Internalname = "LB_RCFECEN_"+sGXsfl_50_fel_idx ;
      edtLb_rcFecRe_Internalname = "LB_RCFECRE_"+sGXsfl_50_fel_idx ;
      edtLb_rcOpEnv_Internalname = "LB_RCOPENV_"+sGXsfl_50_fel_idx ;
      edtLb_rcOpApr_Internalname = "LB_RCOPAPR_"+sGXsfl_50_fel_idx ;
      edtLb_rcOpNap_Internalname = "LB_RCOPNAP_"+sGXsfl_50_fel_idx ;
      edtLb_rcFeNap_Internalname = "LB_RCFENAP_"+sGXsfl_50_fel_idx ;
      edtLb_rcProDe_Internalname = "LB_RCPRODE_"+sGXsfl_50_fel_idx ;
   }

   public void addRowX9983( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50983( ) ;
      sendRowX9983( ) ;
   }

   public void sendRowX9983( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_983_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_983_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_983), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_983), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_983_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_983_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rclin_Internalname,GXutil.ltrim( localUtil.ntoc( A6930Lb_rclin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6930Lb_rclin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rclin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rclin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcnens_Internalname,GXutil.ltrim( localUtil.ntoc( A6933Lb_rcnens, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_rcnens_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6933Lb_rcnens), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6933Lb_rcnens), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcnens_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcnens_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcncar_Internalname,GXutil.rtrim( A6934Lb_rcncar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcncar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcncar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rccorc_Internalname,GXutil.rtrim( A6935Lb_rccorc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rccorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rccorc_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcncorc_Internalname,GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6936Lb_rcncorc), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcncorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcncorc_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rccor_Internalname,GXutil.rtrim( A6937Lb_rccor),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rccor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rccor_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcncor_Internalname,GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6938Lb_rcncor), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcncor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcncor_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rctc_Internalname,GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6939Lb_rctc), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rctc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rctc_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcp1_Internalname,GXutil.rtrim( A6940Lb_rcp1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcp1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcp1_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcp2_Internalname,GXutil.rtrim( A6941Lb_rcp2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcp2_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcp3_Internalname,GXutil.rtrim( A6942Lb_rcp3),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcp3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcp3_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcp4_Internalname,GXutil.rtrim( A6943Lb_rcp4),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcp4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcp4_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcp5_Internalname,GXutil.rtrim( A6944Lb_rcp5),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcp5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcp5_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcp6_Internalname,GXutil.rtrim( A6945Lb_rcp6),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcp6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcp6_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcpo1_Internalname,GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6946Lb_rcpo1), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcpo1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcpo1_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcpo2_Internalname,GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6947Lb_rcpo2), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcpo2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcpo2_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcpo3_Internalname,GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6948Lb_rcpo3), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcpo3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcpo3_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcpo4_Internalname,GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6949Lb_rcpo4), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcpo4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcpo4_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcpo5_Internalname,GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6950Lb_rcpo5), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcpo5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcpo5_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcpo6_Internalname,GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6951Lb_rcpo6), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcpo6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcpo6_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcobs_Internalname,A6931Lb_rcobs,A6931Lb_rcobs,"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcobs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcobs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(32768),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcFecEt_Internalname,localUtil.format(A7009Lb_rcFecEt, "99/99/99"),localUtil.format( A7009Lb_rcFecEt, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcFecEt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcFecEt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcFecEn_Internalname,localUtil.format(A7010Lb_rcFecEn, "99/99/99"),localUtil.format( A7010Lb_rcFecEn, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcFecEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcFecEn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcFecRe_Internalname,localUtil.format(A7011Lb_rcFecRe, "99/99/99"),localUtil.format( A7011Lb_rcFecRe, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcFecRe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcFecRe_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcOpEnv_Internalname,GXutil.rtrim( A7012Lb_rcOpEnv),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcOpEnv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcOpEnv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcOpApr_Internalname,GXutil.rtrim( A7013Lb_rcOpApr),GXutil.rtrim( localUtil.format( A7013Lb_rcOpApr, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcOpApr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcOpApr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcOpNap_Internalname,GXutil.rtrim( A7014Lb_rcOpNap),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcOpNap_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcOpNap_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcFeNap_Internalname,localUtil.format(A7015Lb_rcFeNap, "99/99/99"),localUtil.format( A7015Lb_rcFeNap, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcFeNap_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcFeNap_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_983_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_rcProDe_Internalname,GXutil.rtrim( A8022Lb_rcProDe),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_rcProDe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_rcProDe_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesX9983( ) ;
      GXCCtl = "Z6930Lb_rclin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6930Lb_rclin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6933Lb_rcnens_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6933Lb_rcnens, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6934Lb_rcncar_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6934Lb_rcncar));
      GXCCtl = "Z6935Lb_rccorc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6935Lb_rccorc));
      GXCCtl = "Z6936Lb_rcncorc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6937Lb_rccor_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6937Lb_rccor));
      GXCCtl = "Z6938Lb_rcncor_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6939Lb_rctc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6940Lb_rcp1_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6940Lb_rcp1));
      GXCCtl = "Z6941Lb_rcp2_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6941Lb_rcp2));
      GXCCtl = "Z6942Lb_rcp3_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6942Lb_rcp3));
      GXCCtl = "Z6943Lb_rcp4_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6943Lb_rcp4));
      GXCCtl = "Z6944Lb_rcp5_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6944Lb_rcp5));
      GXCCtl = "Z6945Lb_rcp6_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6945Lb_rcp6));
      GXCCtl = "Z6946Lb_rcpo1_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6947Lb_rcpo2_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6948Lb_rcpo3_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6949Lb_rcpo4_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6950Lb_rcpo5_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6951Lb_rcpo6_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7009Lb_rcFecEt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z7009Lb_rcFecEt, 0, "/"));
      GXCCtl = "Z7010Lb_rcFecEn_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z7010Lb_rcFecEn, 0, "/"));
      GXCCtl = "Z7011Lb_rcFecRe_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z7011Lb_rcFecRe, 0, "/"));
      GXCCtl = "Z7012Lb_rcOpEnv_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7012Lb_rcOpEnv));
      GXCCtl = "Z7013Lb_rcOpApr_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7013Lb_rcOpApr));
      GXCCtl = "Z7014Lb_rcOpNap_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7014Lb_rcOpNap));
      GXCCtl = "Z7015Lb_rcFeNap_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z7015Lb_rcFeNap, 0, "/"));
      GXCCtl = "Z8022Lb_rcProDe_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8022Lb_rcProDe));
      GXCCtl = "nRcdDeleted_983_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_983_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_983_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_983, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6934Lb_rcncar_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6934Lb_rcncar));
      GXCCtl = "N6935Lb_rccorc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6935Lb_rccorc));
      GXCCtl = "N6936Lb_rcncorc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6937Lb_rccor_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6937Lb_rccor));
      GXCCtl = "N6938Lb_rcncor_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6939Lb_rctc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6940Lb_rcp1_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6940Lb_rcp1));
      GXCCtl = "N6941Lb_rcp2_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6941Lb_rcp2));
      GXCCtl = "N6942Lb_rcp3_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6942Lb_rcp3));
      GXCCtl = "N6943Lb_rcp4_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6943Lb_rcp4));
      GXCCtl = "N6944Lb_rcp5_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6944Lb_rcp5));
      GXCCtl = "N6945Lb_rcp6_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A6945Lb_rcp6));
      GXCCtl = "N6946Lb_rcpo1_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6947Lb_rcpo2_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6948Lb_rcpo3_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6949Lb_rcpo4_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6950Lb_rcpo5_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6951Lb_rcpo6_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_983_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_983_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rclin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCNENS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcnens_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCNCAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCCORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rccorc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCNCORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncorc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCCOR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rccor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCNCOR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCTC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rctc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCP1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCP2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCP3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCP4_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp4_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCP5_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp5_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCP6_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp6_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCPO1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCPO2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCPO3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCPO4_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo4_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCPO5_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo5_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCPO6_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo6_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcobs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCFECET_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecEt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCFECEN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecEn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCFECRE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecRe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCOPENV_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpEnv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCOPAPR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpApr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCOPNAP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpNap_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCFENAP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFeNap_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RCPRODE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcProDe_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowX9983( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50983( ) ;
      edtavnRcdDeleted_983_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_983_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rclin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcnens_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCNENS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcncar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCNCAR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rccorc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCCORC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcncorc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCNCORC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rccor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCCOR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcncor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCNCOR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rctc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCTC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcp1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP1_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcp2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP2_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcp3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcp4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP4_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcp5_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP5_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcp6_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCP6_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcpo1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO1_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcpo2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO2_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcpo3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcpo4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO4_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcpo5_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO5_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcpo6_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPO6_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcobs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCOBS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcFecEt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCFECET_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcFecEn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCFECEN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcFecRe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCFECRE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcOpEnv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCOPENV_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcOpApr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCOPAPR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcOpNap_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCOPNAP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcFeNap_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCFENAP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_rcProDe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_RCPRODE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_983_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_983_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_983");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_983_Internalname ;
         wbErr = true ;
         nRcdDeleted_983 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_983 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_983_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "LB_RCLIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rclin_Internalname ;
         wbErr = true ;
         A6930Lb_rclin = 0 ;
      }
      else
      {
         A6930Lb_rclin = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_rclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcnens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcnens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "LB_RCNENS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcnens_Internalname ;
         wbErr = true ;
         A6933Lb_rcnens = 0 ;
         n6933Lb_rcnens = false ;
      }
      else
      {
         A6933Lb_rcnens = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_rcnens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6933Lb_rcnens = false ;
      }
      A6934Lb_rcncar = httpContext.cgiGet( edtLb_rcncar_Internalname) ;
      n6934Lb_rcncar = false ;
      A6935Lb_rccorc = httpContext.cgiGet( edtLb_rccorc_Internalname) ;
      n6935Lb_rccorc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcncorc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcncorc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "LB_RCNCORC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcncorc_Internalname ;
         wbErr = true ;
         A6936Lb_rcncorc = 0 ;
         n6936Lb_rcncorc = false ;
      }
      else
      {
         A6936Lb_rcncorc = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_rcncorc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6936Lb_rcncorc = false ;
      }
      A6937Lb_rccor = httpContext.cgiGet( edtLb_rccor_Internalname) ;
      n6937Lb_rccor = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcncor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcncor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "LB_RCNCOR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcncor_Internalname ;
         wbErr = true ;
         A6938Lb_rcncor = 0 ;
         n6938Lb_rcncor = false ;
      }
      else
      {
         A6938Lb_rcncor = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_rcncor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6938Lb_rcncor = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rctc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rctc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "LB_RCTC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rctc_Internalname ;
         wbErr = true ;
         A6939Lb_rctc = (byte)(0) ;
         n6939Lb_rctc = false ;
      }
      else
      {
         A6939Lb_rctc = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_rctc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6939Lb_rctc = false ;
      }
      A6940Lb_rcp1 = httpContext.cgiGet( edtLb_rcp1_Internalname) ;
      n6940Lb_rcp1 = false ;
      A6941Lb_rcp2 = httpContext.cgiGet( edtLb_rcp2_Internalname) ;
      n6941Lb_rcp2 = false ;
      A6942Lb_rcp3 = httpContext.cgiGet( edtLb_rcp3_Internalname) ;
      n6942Lb_rcp3 = false ;
      A6943Lb_rcp4 = httpContext.cgiGet( edtLb_rcp4_Internalname) ;
      n6943Lb_rcp4 = false ;
      A6944Lb_rcp5 = httpContext.cgiGet( edtLb_rcp5_Internalname) ;
      n6944Lb_rcp5 = false ;
      A6945Lb_rcp6 = httpContext.cgiGet( edtLb_rcp6_Internalname) ;
      n6945Lb_rcp6 = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "LB_RCPO1_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcpo1_Internalname ;
         wbErr = true ;
         A6946Lb_rcpo1 = (short)(0) ;
         n6946Lb_rcpo1 = false ;
      }
      else
      {
         A6946Lb_rcpo1 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_rcpo1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6946Lb_rcpo1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "LB_RCPO2_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcpo2_Internalname ;
         wbErr = true ;
         A6947Lb_rcpo2 = (short)(0) ;
         n6947Lb_rcpo2 = false ;
      }
      else
      {
         A6947Lb_rcpo2 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_rcpo2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6947Lb_rcpo2 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "LB_RCPO3_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcpo3_Internalname ;
         wbErr = true ;
         A6948Lb_rcpo3 = (short)(0) ;
         n6948Lb_rcpo3 = false ;
      }
      else
      {
         A6948Lb_rcpo3 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_rcpo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6948Lb_rcpo3 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "LB_RCPO4_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcpo4_Internalname ;
         wbErr = true ;
         A6949Lb_rcpo4 = (short)(0) ;
         n6949Lb_rcpo4 = false ;
      }
      else
      {
         A6949Lb_rcpo4 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_rcpo4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6949Lb_rcpo4 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "LB_RCPO5_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcpo5_Internalname ;
         wbErr = true ;
         A6950Lb_rcpo5 = (short)(0) ;
         n6950Lb_rcpo5 = false ;
      }
      else
      {
         A6950Lb_rcpo5 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_rcpo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6950Lb_rcpo5 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_rcpo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "LB_RCPO6_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcpo6_Internalname ;
         wbErr = true ;
         A6951Lb_rcpo6 = (short)(0) ;
         n6951Lb_rcpo6 = false ;
      }
      else
      {
         A6951Lb_rcpo6 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_rcpo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6951Lb_rcpo6 = false ;
      }
      A6931Lb_rcobs = httpContext.cgiGet( edtLb_rcobs_Internalname) ;
      n6931Lb_rcobs = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtLb_rcFecEt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "LB_RCFECET_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcFecEt_Internalname ;
         wbErr = true ;
         A7009Lb_rcFecEt = GXutil.nullDate() ;
         n7009Lb_rcFecEt = false ;
      }
      else
      {
         A7009Lb_rcFecEt = localUtil.ctod( httpContext.cgiGet( edtLb_rcFecEt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n7009Lb_rcFecEt = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtLb_rcFecEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "LB_RCFECEN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcFecEn_Internalname ;
         wbErr = true ;
         A7010Lb_rcFecEn = GXutil.nullDate() ;
         n7010Lb_rcFecEn = false ;
      }
      else
      {
         A7010Lb_rcFecEn = localUtil.ctod( httpContext.cgiGet( edtLb_rcFecEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n7010Lb_rcFecEn = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtLb_rcFecRe_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "LB_RCFECRE_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcFecRe_Internalname ;
         wbErr = true ;
         A7011Lb_rcFecRe = GXutil.nullDate() ;
         n7011Lb_rcFecRe = false ;
      }
      else
      {
         A7011Lb_rcFecRe = localUtil.ctod( httpContext.cgiGet( edtLb_rcFecRe_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n7011Lb_rcFecRe = false ;
      }
      A7012Lb_rcOpEnv = httpContext.cgiGet( edtLb_rcOpEnv_Internalname) ;
      n7012Lb_rcOpEnv = false ;
      A7013Lb_rcOpApr = GXutil.upper( httpContext.cgiGet( edtLb_rcOpApr_Internalname)) ;
      n7013Lb_rcOpApr = false ;
      A7014Lb_rcOpNap = httpContext.cgiGet( edtLb_rcOpNap_Internalname) ;
      n7014Lb_rcOpNap = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtLb_rcFeNap_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "LB_RCFENAP_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcFeNap_Internalname ;
         wbErr = true ;
         A7015Lb_rcFeNap = GXutil.nullDate() ;
         n7015Lb_rcFeNap = false ;
      }
      else
      {
         A7015Lb_rcFeNap = localUtil.ctod( httpContext.cgiGet( edtLb_rcFeNap_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n7015Lb_rcFeNap = false ;
      }
      A8022Lb_rcProDe = httpContext.cgiGet( edtLb_rcProDe_Internalname) ;
      n8022Lb_rcProDe = false ;
      GXCCtl = "Z6930Lb_rclin_" + sGXsfl_50_idx ;
      Z6930Lb_rclin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6933Lb_rcnens_" + sGXsfl_50_idx ;
      Z6933Lb_rcnens = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6934Lb_rcncar_" + sGXsfl_50_idx ;
      Z6934Lb_rcncar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6935Lb_rccorc_" + sGXsfl_50_idx ;
      Z6935Lb_rccorc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6936Lb_rcncorc_" + sGXsfl_50_idx ;
      Z6936Lb_rcncorc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6937Lb_rccor_" + sGXsfl_50_idx ;
      Z6937Lb_rccor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6938Lb_rcncor_" + sGXsfl_50_idx ;
      Z6938Lb_rcncor = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6939Lb_rctc_" + sGXsfl_50_idx ;
      Z6939Lb_rctc = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6940Lb_rcp1_" + sGXsfl_50_idx ;
      Z6940Lb_rcp1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6941Lb_rcp2_" + sGXsfl_50_idx ;
      Z6941Lb_rcp2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6942Lb_rcp3_" + sGXsfl_50_idx ;
      Z6942Lb_rcp3 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6943Lb_rcp4_" + sGXsfl_50_idx ;
      Z6943Lb_rcp4 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6944Lb_rcp5_" + sGXsfl_50_idx ;
      Z6944Lb_rcp5 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6945Lb_rcp6_" + sGXsfl_50_idx ;
      Z6945Lb_rcp6 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6946Lb_rcpo1_" + sGXsfl_50_idx ;
      Z6946Lb_rcpo1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6947Lb_rcpo2_" + sGXsfl_50_idx ;
      Z6947Lb_rcpo2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6948Lb_rcpo3_" + sGXsfl_50_idx ;
      Z6948Lb_rcpo3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6949Lb_rcpo4_" + sGXsfl_50_idx ;
      Z6949Lb_rcpo4 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6950Lb_rcpo5_" + sGXsfl_50_idx ;
      Z6950Lb_rcpo5 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6951Lb_rcpo6_" + sGXsfl_50_idx ;
      Z6951Lb_rcpo6 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7009Lb_rcFecEt_" + sGXsfl_50_idx ;
      Z7009Lb_rcFecEt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z7010Lb_rcFecEn_" + sGXsfl_50_idx ;
      Z7010Lb_rcFecEn = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z7011Lb_rcFecRe_" + sGXsfl_50_idx ;
      Z7011Lb_rcFecRe = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z7012Lb_rcOpEnv_" + sGXsfl_50_idx ;
      Z7012Lb_rcOpEnv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7013Lb_rcOpApr_" + sGXsfl_50_idx ;
      Z7013Lb_rcOpApr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7014Lb_rcOpNap_" + sGXsfl_50_idx ;
      Z7014Lb_rcOpNap = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7015Lb_rcFeNap_" + sGXsfl_50_idx ;
      Z7015Lb_rcFeNap = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8022Lb_rcProDe_" + sGXsfl_50_idx ;
      Z8022Lb_rcProDe = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_983_" + sGXsfl_50_idx ;
      nRcdDeleted_983 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_983_" + sGXsfl_50_idx ;
      nRcdExists_983 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_983_" + sGXsfl_50_idx ;
      nIsMod_983 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6934Lb_rcncar_" + sGXsfl_50_idx ;
      N6934Lb_rcncar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6935Lb_rccorc_" + sGXsfl_50_idx ;
      N6935Lb_rccorc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6936Lb_rcncorc_" + sGXsfl_50_idx ;
      N6936Lb_rcncorc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6937Lb_rccor_" + sGXsfl_50_idx ;
      N6937Lb_rccor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6938Lb_rcncor_" + sGXsfl_50_idx ;
      N6938Lb_rcncor = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6939Lb_rctc_" + sGXsfl_50_idx ;
      N6939Lb_rctc = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6940Lb_rcp1_" + sGXsfl_50_idx ;
      N6940Lb_rcp1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6941Lb_rcp2_" + sGXsfl_50_idx ;
      N6941Lb_rcp2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6942Lb_rcp3_" + sGXsfl_50_idx ;
      N6942Lb_rcp3 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6943Lb_rcp4_" + sGXsfl_50_idx ;
      N6943Lb_rcp4 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6944Lb_rcp5_" + sGXsfl_50_idx ;
      N6944Lb_rcp5 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6945Lb_rcp6_" + sGXsfl_50_idx ;
      N6945Lb_rcp6 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6946Lb_rcpo1_" + sGXsfl_50_idx ;
      N6946Lb_rcpo1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6947Lb_rcpo2_" + sGXsfl_50_idx ;
      N6947Lb_rcpo2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6948Lb_rcpo3_" + sGXsfl_50_idx ;
      N6948Lb_rcpo3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6949Lb_rcpo4_" + sGXsfl_50_idx ;
      N6949Lb_rcpo4 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6950Lb_rcpo5_" + sGXsfl_50_idx ;
      N6950Lb_rcpo5 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6951Lb_rcpo6_" + sGXsfl_50_idx ;
      N6951Lb_rcpo6 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLb_rcobs_Enabled = edtLb_rcobs_Enabled ;
      defedtLb_rcpo6_Enabled = edtLb_rcpo6_Enabled ;
      defedtLb_rcpo5_Enabled = edtLb_rcpo5_Enabled ;
      defedtLb_rcpo4_Enabled = edtLb_rcpo4_Enabled ;
      defedtLb_rcpo3_Enabled = edtLb_rcpo3_Enabled ;
      defedtLb_rcpo2_Enabled = edtLb_rcpo2_Enabled ;
      defedtLb_rcpo1_Enabled = edtLb_rcpo1_Enabled ;
      defedtLb_rcp6_Enabled = edtLb_rcp6_Enabled ;
      defedtLb_rcp5_Enabled = edtLb_rcp5_Enabled ;
      defedtLb_rcp4_Enabled = edtLb_rcp4_Enabled ;
      defedtLb_rcp3_Enabled = edtLb_rcp3_Enabled ;
      defedtLb_rcp2_Enabled = edtLb_rcp2_Enabled ;
      defedtLb_rcp1_Enabled = edtLb_rcp1_Enabled ;
      defedtLb_rctc_Enabled = edtLb_rctc_Enabled ;
      defedtLb_rcncor_Enabled = edtLb_rcncor_Enabled ;
      defedtLb_rccor_Enabled = edtLb_rccor_Enabled ;
      defedtLb_rcncorc_Enabled = edtLb_rcncorc_Enabled ;
      defedtLb_rccorc_Enabled = edtLb_rccorc_Enabled ;
      defedtLb_rcncar_Enabled = edtLb_rcncar_Enabled ;
      defedtLb_rclin_Enabled = edtLb_rclin_Enabled ;
   }

   public void confirmValuesX90( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50983( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50983( ) ;
         httpContext.changePostValue( "Z6930Lb_rclin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6930Lb_rclin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6930Lb_rclin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6933Lb_rcnens_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6933Lb_rcnens_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6933Lb_rcnens_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6934Lb_rcncar_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6934Lb_rcncar_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6934Lb_rcncar_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6935Lb_rccorc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6935Lb_rccorc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6935Lb_rccorc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6936Lb_rcncorc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6936Lb_rcncorc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6936Lb_rcncorc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6937Lb_rccor_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6937Lb_rccor_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6937Lb_rccor_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6938Lb_rcncor_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6938Lb_rcncor_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6938Lb_rcncor_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6939Lb_rctc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6939Lb_rctc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6939Lb_rctc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6940Lb_rcp1_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6940Lb_rcp1_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6940Lb_rcp1_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6941Lb_rcp2_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6941Lb_rcp2_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6941Lb_rcp2_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6942Lb_rcp3_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6942Lb_rcp3_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6942Lb_rcp3_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6943Lb_rcp4_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6943Lb_rcp4_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6943Lb_rcp4_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6944Lb_rcp5_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6944Lb_rcp5_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6944Lb_rcp5_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6945Lb_rcp6_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6945Lb_rcp6_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6945Lb_rcp6_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6946Lb_rcpo1_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6946Lb_rcpo1_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6946Lb_rcpo1_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6947Lb_rcpo2_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6947Lb_rcpo2_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6947Lb_rcpo2_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6948Lb_rcpo3_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6948Lb_rcpo3_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6948Lb_rcpo3_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6949Lb_rcpo4_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6949Lb_rcpo4_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6949Lb_rcpo4_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6950Lb_rcpo5_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6950Lb_rcpo5_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6950Lb_rcpo5_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6951Lb_rcpo6_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6951Lb_rcpo6_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6951Lb_rcpo6_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7009Lb_rcFecEt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7009Lb_rcFecEt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7009Lb_rcFecEt_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7010Lb_rcFecEn_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7010Lb_rcFecEn_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7010Lb_rcFecEn_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7011Lb_rcFecRe_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7011Lb_rcFecRe_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7011Lb_rcFecRe_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7012Lb_rcOpEnv_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7012Lb_rcOpEnv_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7012Lb_rcOpEnv_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7013Lb_rcOpApr_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7013Lb_rcOpApr_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7013Lb_rcOpApr_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7014Lb_rcOpNap_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7014Lb_rcOpNap_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7014Lb_rcOpNap_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7015Lb_rcFeNap_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7015Lb_rcFeNap_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7015Lb_rcFeNap_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8022Lb_rcProDe_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8022Lb_rcProDe_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8022Lb_rcProDe_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tregcor", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6932Lb_Linurc", GXutil.ltrim( localUtil.ntoc( Z6932Lb_Linurc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vEX_ENSAYO", GXutil.rtrim( AV32Ex_ensayo));
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
      return formatLink("app.tregcor", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TREGCOR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA REGISTROS COLORES", "") ;
   }

   public void initializeNonKeyX921( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A6932Lb_Linurc = 0 ;
      n6932Lb_Linurc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6932Lb_Linurc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6932Lb_Linurc), 8, 0));
      A6929Lb_rcLastn = 0 ;
      n6929Lb_rcLastn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      Z279CliNom = "" ;
      Z6932Lb_Linurc = 0 ;
   }

   public void initAllX921( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKeyX921( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyX9983( )
   {
      AV32Ex_ensayo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Ex_ensayo", AV32Ex_ensayo);
      A6933Lb_rcnens = 0 ;
      n6933Lb_rcnens = false ;
      A6934Lb_rcncar = "" ;
      n6934Lb_rcncar = false ;
      A6935Lb_rccorc = "" ;
      n6935Lb_rccorc = false ;
      A6936Lb_rcncorc = 0 ;
      n6936Lb_rcncorc = false ;
      A6937Lb_rccor = "" ;
      n6937Lb_rccor = false ;
      A6938Lb_rcncor = 0 ;
      n6938Lb_rcncor = false ;
      A6939Lb_rctc = (byte)(0) ;
      n6939Lb_rctc = false ;
      A6940Lb_rcp1 = "" ;
      n6940Lb_rcp1 = false ;
      A6941Lb_rcp2 = "" ;
      n6941Lb_rcp2 = false ;
      A6942Lb_rcp3 = "" ;
      n6942Lb_rcp3 = false ;
      A6943Lb_rcp4 = "" ;
      n6943Lb_rcp4 = false ;
      A6944Lb_rcp5 = "" ;
      n6944Lb_rcp5 = false ;
      A6945Lb_rcp6 = "" ;
      n6945Lb_rcp6 = false ;
      A6946Lb_rcpo1 = (short)(0) ;
      n6946Lb_rcpo1 = false ;
      A6947Lb_rcpo2 = (short)(0) ;
      n6947Lb_rcpo2 = false ;
      A6948Lb_rcpo3 = (short)(0) ;
      n6948Lb_rcpo3 = false ;
      A6949Lb_rcpo4 = (short)(0) ;
      n6949Lb_rcpo4 = false ;
      A6950Lb_rcpo5 = (short)(0) ;
      n6950Lb_rcpo5 = false ;
      A6951Lb_rcpo6 = (short)(0) ;
      n6951Lb_rcpo6 = false ;
      A6931Lb_rcobs = "" ;
      n6931Lb_rcobs = false ;
      A7009Lb_rcFecEt = GXutil.nullDate() ;
      n7009Lb_rcFecEt = false ;
      A7010Lb_rcFecEn = GXutil.nullDate() ;
      n7010Lb_rcFecEn = false ;
      A7011Lb_rcFecRe = GXutil.nullDate() ;
      n7011Lb_rcFecRe = false ;
      A7012Lb_rcOpEnv = "" ;
      n7012Lb_rcOpEnv = false ;
      A7013Lb_rcOpApr = "" ;
      n7013Lb_rcOpApr = false ;
      A7014Lb_rcOpNap = "" ;
      n7014Lb_rcOpNap = false ;
      A7015Lb_rcFeNap = GXutil.nullDate() ;
      n7015Lb_rcFeNap = false ;
      A8022Lb_rcProDe = "" ;
      n8022Lb_rcProDe = false ;
      Z6933Lb_rcnens = 0 ;
      Z6934Lb_rcncar = "" ;
      Z6935Lb_rccorc = "" ;
      Z6936Lb_rcncorc = 0 ;
      Z6937Lb_rccor = "" ;
      Z6938Lb_rcncor = 0 ;
      Z6939Lb_rctc = (byte)(0) ;
      Z6940Lb_rcp1 = "" ;
      Z6941Lb_rcp2 = "" ;
      Z6942Lb_rcp3 = "" ;
      Z6943Lb_rcp4 = "" ;
      Z6944Lb_rcp5 = "" ;
      Z6945Lb_rcp6 = "" ;
      Z6946Lb_rcpo1 = (short)(0) ;
      Z6947Lb_rcpo2 = (short)(0) ;
      Z6948Lb_rcpo3 = (short)(0) ;
      Z6949Lb_rcpo4 = (short)(0) ;
      Z6950Lb_rcpo5 = (short)(0) ;
      Z6951Lb_rcpo6 = (short)(0) ;
      Z7009Lb_rcFecEt = GXutil.nullDate() ;
      Z7010Lb_rcFecEn = GXutil.nullDate() ;
      Z7011Lb_rcFecRe = GXutil.nullDate() ;
      Z7012Lb_rcOpEnv = "" ;
      Z7013Lb_rcOpApr = "" ;
      Z7014Lb_rcOpNap = "" ;
      Z7015Lb_rcFeNap = GXutil.nullDate() ;
      Z8022Lb_rcProDe = "" ;
   }

   public void initAllX9983( )
   {
      A6930Lb_rclin = 0 ;
      initializeNonKeyX9983( ) ;
   }

   public void standaloneModalInsertX9983( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532084", true, true);
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
      httpContext.AddJavascriptSource("tregcor.js", "?20268241532084", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties983( )
   {
      edtLb_rcobs_Enabled = defedtLb_rcobs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcobs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcobs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo6_Enabled = defedtLb_rcpo6_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo5_Enabled = defedtLb_rcpo5_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo4_Enabled = defedtLb_rcpo4_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo3_Enabled = defedtLb_rcpo3_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo2_Enabled = defedtLb_rcpo2_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcpo1_Enabled = defedtLb_rcpo1_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp6_Enabled = defedtLb_rcp6_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp5_Enabled = defedtLb_rcp5_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp4_Enabled = defedtLb_rcp4_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp3_Enabled = defedtLb_rcp3_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp2_Enabled = defedtLb_rcp2_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcp1_Enabled = defedtLb_rcp1_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rctc_Enabled = defedtLb_rctc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcncor_Enabled = defedtLb_rcncor_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rccor_Enabled = defedtLb_rccor_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcncorc_Enabled = defedtLb_rcncorc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rccorc_Enabled = defedtLb_rccorc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rcncar_Enabled = defedtLb_rcncar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_rclin_Enabled = defedtLb_rclin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rclin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_983, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_983_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6930Lb_rclin, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rclin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6933Lb_rcnens, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcnens_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6934Lb_rcncar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6935Lb_rccorc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rccorc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncorc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6937Lb_rccor));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rccor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcncor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rctc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6940Lb_rcp1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6941Lb_rcp2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6942Lb_rcp3));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6943Lb_rcp4));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp4_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6944Lb_rcp5));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp5_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6945Lb_rcp6));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcp6_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo4_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo5_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcpo6_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A6931Lb_rcobs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcobs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A7009Lb_rcFecEt, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecEt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A7010Lb_rcFecEn, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecEn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A7011Lb_rcFecRe, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFecRe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7012Lb_rcOpEnv));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpEnv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7013Lb_rcOpApr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpApr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7014Lb_rcOpNap));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcOpNap_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A7015Lb_rcFeNap, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcFeNap_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8022Lb_rcProDe));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_rcProDe_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtLb_Linurc_Internalname = "LB_LINURC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtLb_rcLastn_Internalname = "LB_RCLASTN" ;
      edtavnRcdDeleted_983_Internalname = "vNRCDDELETED_983" ;
      edtLb_rclin_Internalname = "LB_RCLIN" ;
      edtLb_rcnens_Internalname = "LB_RCNENS" ;
      edtLb_rcncar_Internalname = "LB_RCNCAR" ;
      edtLb_rccorc_Internalname = "LB_RCCORC" ;
      edtLb_rcncorc_Internalname = "LB_RCNCORC" ;
      edtLb_rccor_Internalname = "LB_RCCOR" ;
      edtLb_rcncor_Internalname = "LB_RCNCOR" ;
      edtLb_rctc_Internalname = "LB_RCTC" ;
      edtLb_rcp1_Internalname = "LB_RCP1" ;
      edtLb_rcp2_Internalname = "LB_RCP2" ;
      edtLb_rcp3_Internalname = "LB_RCP3" ;
      edtLb_rcp4_Internalname = "LB_RCP4" ;
      edtLb_rcp5_Internalname = "LB_RCP5" ;
      edtLb_rcp6_Internalname = "LB_RCP6" ;
      edtLb_rcpo1_Internalname = "LB_RCPO1" ;
      edtLb_rcpo2_Internalname = "LB_RCPO2" ;
      edtLb_rcpo3_Internalname = "LB_RCPO3" ;
      edtLb_rcpo4_Internalname = "LB_RCPO4" ;
      edtLb_rcpo5_Internalname = "LB_RCPO5" ;
      edtLb_rcpo6_Internalname = "LB_RCPO6" ;
      edtLb_rcobs_Internalname = "LB_RCOBS" ;
      edtLb_rcFecEt_Internalname = "LB_RCFECET" ;
      edtLb_rcFecEn_Internalname = "LB_RCFECEN" ;
      edtLb_rcFecRe_Internalname = "LB_RCFECRE" ;
      edtLb_rcOpEnv_Internalname = "LB_RCOPENV" ;
      edtLb_rcOpApr_Internalname = "LB_RCOPAPR" ;
      edtLb_rcOpNap_Internalname = "LB_RCOPNAP" ;
      edtLb_rcFeNap_Internalname = "LB_RCFENAP" ;
      edtLb_rcProDe_Internalname = "LB_RCPRODE" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA REGISTROS COLORES", "") );
      edtLb_rcProDe_Jsonclick = "" ;
      edtLb_rcFeNap_Jsonclick = "" ;
      edtLb_rcOpNap_Jsonclick = "" ;
      edtLb_rcOpApr_Jsonclick = "" ;
      edtLb_rcOpEnv_Jsonclick = "" ;
      edtLb_rcFecRe_Jsonclick = "" ;
      edtLb_rcFecEn_Jsonclick = "" ;
      edtLb_rcFecEt_Jsonclick = "" ;
      edtLb_rcobs_Jsonclick = "" ;
      edtLb_rcpo6_Jsonclick = "" ;
      edtLb_rcpo5_Jsonclick = "" ;
      edtLb_rcpo4_Jsonclick = "" ;
      edtLb_rcpo3_Jsonclick = "" ;
      edtLb_rcpo2_Jsonclick = "" ;
      edtLb_rcpo1_Jsonclick = "" ;
      edtLb_rcp6_Jsonclick = "" ;
      edtLb_rcp5_Jsonclick = "" ;
      edtLb_rcp4_Jsonclick = "" ;
      edtLb_rcp3_Jsonclick = "" ;
      edtLb_rcp2_Jsonclick = "" ;
      edtLb_rcp1_Jsonclick = "" ;
      edtLb_rctc_Jsonclick = "" ;
      edtLb_rcncor_Jsonclick = "" ;
      edtLb_rccor_Jsonclick = "" ;
      edtLb_rcncorc_Jsonclick = "" ;
      edtLb_rccorc_Jsonclick = "" ;
      edtLb_rcncar_Jsonclick = "" ;
      edtLb_rcnens_Jsonclick = "" ;
      edtLb_rclin_Jsonclick = "" ;
      edtavnRcdDeleted_983_Jsonclick = "" ;
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
      edtLb_rcProDe_Enabled = 1 ;
      edtLb_rcFeNap_Enabled = 1 ;
      edtLb_rcOpNap_Enabled = 1 ;
      edtLb_rcOpApr_Enabled = 1 ;
      edtLb_rcOpEnv_Enabled = 1 ;
      edtLb_rcFecRe_Enabled = 1 ;
      edtLb_rcFecEn_Enabled = 1 ;
      edtLb_rcFecEt_Enabled = 1 ;
      edtLb_rcobs_Enabled = 0 ;
      edtLb_rcpo6_Enabled = 1 ;
      edtLb_rcpo5_Enabled = 1 ;
      edtLb_rcpo4_Enabled = 1 ;
      edtLb_rcpo3_Enabled = 1 ;
      edtLb_rcpo2_Enabled = 1 ;
      edtLb_rcpo1_Enabled = 1 ;
      edtLb_rcp6_Enabled = 1 ;
      edtLb_rcp5_Enabled = 1 ;
      edtLb_rcp4_Enabled = 1 ;
      edtLb_rcp3_Enabled = 1 ;
      edtLb_rcp2_Enabled = 1 ;
      edtLb_rcp1_Enabled = 1 ;
      edtLb_rctc_Enabled = 1 ;
      edtLb_rcncor_Enabled = 1 ;
      edtLb_rccor_Enabled = 1 ;
      edtLb_rcncorc_Enabled = 1 ;
      edtLb_rccorc_Enabled = 1 ;
      edtLb_rcncar_Enabled = 1 ;
      edtLb_rcnens_Enabled = 1 ;
      edtLb_rclin_Enabled = 1 ;
      edtavnRcdDeleted_983_Enabled = 1 ;
      edtLb_rcLastn_Jsonclick = "" ;
      edtLb_rcLastn_Backcolor = (int)(0xFFFFFF) ;
      edtLb_rcLastn_Enabled = 0 ;
      edtLb_Linurc_Jsonclick = "" ;
      edtLb_Linurc_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Linurc_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void xc_23_X9983( String Gx_mode ,
                            String A396EmprCod ,
                            int A252CliCod ,
                            int A6930Lb_rclin )
   {
      if ( (0==A6930Lb_rclin) && true /* Level */ && isIns( )  )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int6[0] = A6930Lb_rclin ;
         new app.pregcor1(remoteHandle, context).execute( GXv_char22, GXv_int8, GXv_int6) ;
         A396EmprCod = GXv_char22[0] ;
         A252CliCod = GXv_int8[0] ;
         A6930Lb_rclin = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6930Lb_rclin, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_24_X9983( String A396EmprCod ,
                            int A6933Lb_rcnens ,
                            String A6934Lb_rcncar ,
                            String A6935Lb_rccorc ,
                            int A6936Lb_rcncorc ,
                            String A6937Lb_rccor ,
                            int A6938Lb_rcncor ,
                            byte A6939Lb_rctc ,
                            String A6940Lb_rcp1 ,
                            String A6941Lb_rcp2 ,
                            String A6942Lb_rcp3 ,
                            String A6943Lb_rcp4 ,
                            String A6944Lb_rcp5 ,
                            String A6945Lb_rcp6 ,
                            short A6946Lb_rcpo1 ,
                            short A6947Lb_rcpo2 ,
                            short A6948Lb_rcpo3 ,
                            short A6949Lb_rcpo4 ,
                            short A6950Lb_rcpo5 ,
                            short A6951Lb_rcpo6 ,
                            String AV32Ex_ensayo )
   {
      if ( ( A6933Lb_rcnens > 0 ) && true /* After */ )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int8[0] = A6933Lb_rcnens ;
         GXv_char15[0] = A6934Lb_rcncar ;
         GXv_char14[0] = A6935Lb_rccorc ;
         GXv_int6[0] = A6936Lb_rcncorc ;
         GXv_char13[0] = A6937Lb_rccor ;
         GXv_int5[0] = A6938Lb_rcncor ;
         GXv_int9[0] = A6939Lb_rctc ;
         GXv_char12[0] = A6940Lb_rcp1 ;
         GXv_char11[0] = A6941Lb_rcp2 ;
         GXv_char10[0] = A6942Lb_rcp3 ;
         GXv_char7[0] = A6943Lb_rcp4 ;
         GXv_char4[0] = A6944Lb_rcp5 ;
         GXv_char3[0] = A6945Lb_rcp6 ;
         GXv_int21[0] = A6946Lb_rcpo1 ;
         GXv_int20[0] = A6947Lb_rcpo2 ;
         GXv_int19[0] = A6948Lb_rcpo3 ;
         GXv_int18[0] = A6949Lb_rcpo4 ;
         GXv_int17[0] = A6950Lb_rcpo5 ;
         GXv_int16[0] = A6951Lb_rcpo6 ;
         GXv_char2[0] = AV32Ex_ensayo ;
         new app.pregcor2(remoteHandle, context).execute( GXv_char22, GXv_int8, GXv_char15, GXv_char14, GXv_int6, GXv_char13, GXv_int5, GXv_int9, GXv_char12, GXv_char11, GXv_char10, GXv_char7, GXv_char4, GXv_char3, GXv_int21, GXv_int20, GXv_int19, GXv_int18, GXv_int17, GXv_int16, GXv_char2) ;
         A396EmprCod = GXv_char22[0] ;
         A6933Lb_rcnens = GXv_int8[0] ;
         A6934Lb_rcncar = GXv_char15[0] ;
         A6935Lb_rccorc = GXv_char14[0] ;
         A6936Lb_rcncorc = GXv_int6[0] ;
         A6937Lb_rccor = GXv_char13[0] ;
         A6938Lb_rcncor = GXv_int5[0] ;
         A6939Lb_rctc = GXv_int9[0] ;
         A6940Lb_rcp1 = GXv_char12[0] ;
         A6941Lb_rcp2 = GXv_char11[0] ;
         A6942Lb_rcp3 = GXv_char10[0] ;
         A6943Lb_rcp4 = GXv_char7[0] ;
         A6944Lb_rcp5 = GXv_char4[0] ;
         A6945Lb_rcp6 = GXv_char3[0] ;
         A6946Lb_rcpo1 = GXv_int21[0] ;
         A6947Lb_rcpo2 = GXv_int20[0] ;
         A6948Lb_rcpo3 = GXv_int19[0] ;
         A6949Lb_rcpo4 = GXv_int18[0] ;
         A6950Lb_rcpo5 = GXv_int17[0] ;
         A6951Lb_rcpo6 = GXv_int16[0] ;
         AV32Ex_ensayo = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Ex_ensayo", AV32Ex_ensayo);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6933Lb_rcnens, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6934Lb_rcncar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6935Lb_rccorc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6937Lb_rccor))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6940Lb_rcp1))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6941Lb_rcp2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6942Lb_rcp3))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6943Lb_rcp4))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6944Lb_rcp5))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6945Lb_rcp6))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV32Ex_ensayo))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_45_X9983( )
   {
      if ( true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.tregcob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A6930Lb_rclin,8,0))}, new String[] {"EmprCod","CliCod","Lb_rclin"})  ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
      subsflControlProps_50983( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalX9983( ) ;
         standaloneModalX9983( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowX9983( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50983( ) ;
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
      /* Using cursor T00X928 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00X928_A407EmprNom[0] ;
      n407EmprNom = T00X928_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T00X920 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A6929Lb_rcLastn = T00X920_A6929Lb_rcLastn[0] ;
         n6929Lb_rcLastn = T00X920_n6929Lb_rcLastn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      else
      {
         A6929Lb_rcLastn = 0 ;
         n6929Lb_rcLastn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6929Lb_rcLastn), 6, 0));
      }
      pr_default.close(14);
      GX_FocusControl = edtCliNom_Internalname ;
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
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00X920 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A6929Lb_rcLastn = T00X920_A6929Lb_rcLastn[0] ;
         n6929Lb_rcLastn = T00X920_n6929Lb_rcLastn[0] ;
      }
      else
      {
         A6929Lb_rcLastn = 0 ;
         n6929Lb_rcLastn = false ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6932Lb_Linurc", GXutil.ltrim( localUtil.ntoc( A6932Lb_Linurc, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", GXutil.rtrim( AV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6929Lb_rcLastn", GXutil.ltrim( localUtil.ntoc( A6929Lb_rcLastn, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6932Lb_Linurc", GXutil.ltrim( localUtil.ntoc( Z6932Lb_Linurc, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV8UsurCod", GXutil.rtrim( ZV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6929Lb_rcLastn", GXutil.ltrim( localUtil.ntoc( Z6929Lb_rcLastn, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Lb_rclin( )
   {
      if ( (0==A6930Lb_rclin) && true /* Level */ && isIns( )  )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int6[0] = A6930Lb_rclin ;
         new app.pregcor1(remoteHandle, context).execute( GXv_char22, GXv_int8, GXv_int6) ;
         tregcor_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tregcor_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         tregcor_impl.this.A6930Lb_rclin = GXv_int6[0] ;
         A6930Lb_rclin = this.A6930Lb_rclin ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6930Lb_rclin", GXutil.ltrim( localUtil.ntoc( A6930Lb_rclin, (byte)(8), (byte)(0), ".", "")));
   }

   public void valid_Lb_rcnens( )
   {
      n6951Lb_rcpo6 = false ;
      n6950Lb_rcpo5 = false ;
      n6949Lb_rcpo4 = false ;
      n6948Lb_rcpo3 = false ;
      n6947Lb_rcpo2 = false ;
      n6946Lb_rcpo1 = false ;
      n6945Lb_rcp6 = false ;
      n6944Lb_rcp5 = false ;
      n6943Lb_rcp4 = false ;
      n6942Lb_rcp3 = false ;
      n6941Lb_rcp2 = false ;
      n6940Lb_rcp1 = false ;
      n6939Lb_rctc = false ;
      n6938Lb_rcncor = false ;
      n6937Lb_rccor = false ;
      n6936Lb_rcncorc = false ;
      n6935Lb_rccorc = false ;
      n6934Lb_rcncar = false ;
      n6933Lb_rcnens = false ;
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncar_Enabled = 0 ;
      }
      else
      {
         edtLb_rcncar_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rccorc_Enabled = 0 ;
      }
      else
      {
         edtLb_rccorc_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncorc_Enabled = 0 ;
      }
      else
      {
         edtLb_rcncorc_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rccor_Enabled = 0 ;
      }
      else
      {
         edtLb_rccor_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcncor_Enabled = 0 ;
      }
      else
      {
         edtLb_rcncor_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rctc_Enabled = 0 ;
      }
      else
      {
         edtLb_rctc_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp1_Enabled = 0 ;
      }
      else
      {
         edtLb_rcp1_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp2_Enabled = 0 ;
      }
      else
      {
         edtLb_rcp2_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp3_Enabled = 0 ;
      }
      else
      {
         edtLb_rcp3_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp4_Enabled = 0 ;
      }
      else
      {
         edtLb_rcp4_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp5_Enabled = 0 ;
      }
      else
      {
         edtLb_rcp5_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcp6_Enabled = 0 ;
      }
      else
      {
         edtLb_rcp6_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo1_Enabled = 0 ;
      }
      else
      {
         edtLb_rcpo1_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo2_Enabled = 0 ;
      }
      else
      {
         edtLb_rcpo2_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo3_Enabled = 0 ;
      }
      else
      {
         edtLb_rcpo3_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo4_Enabled = 0 ;
      }
      else
      {
         edtLb_rcpo4_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo5_Enabled = 0 ;
      }
      else
      {
         edtLb_rcpo5_Enabled = 1 ;
      }
      if ( A6933Lb_rcnens > 0 )
      {
         edtLb_rcpo6_Enabled = 0 ;
      }
      else
      {
         edtLb_rcpo6_Enabled = 1 ;
      }
      if ( ( A6933Lb_rcnens > 0 ) && true /* After */ )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int8[0] = A6933Lb_rcnens ;
         GXv_char15[0] = A6934Lb_rcncar ;
         GXv_char14[0] = A6935Lb_rccorc ;
         GXv_int6[0] = A6936Lb_rcncorc ;
         GXv_char13[0] = A6937Lb_rccor ;
         GXv_int5[0] = A6938Lb_rcncor ;
         GXv_int9[0] = A6939Lb_rctc ;
         GXv_char12[0] = A6940Lb_rcp1 ;
         GXv_char11[0] = A6941Lb_rcp2 ;
         GXv_char10[0] = A6942Lb_rcp3 ;
         GXv_char7[0] = A6943Lb_rcp4 ;
         GXv_char4[0] = A6944Lb_rcp5 ;
         GXv_char3[0] = A6945Lb_rcp6 ;
         GXv_int21[0] = A6946Lb_rcpo1 ;
         GXv_int20[0] = A6947Lb_rcpo2 ;
         GXv_int19[0] = A6948Lb_rcpo3 ;
         GXv_int18[0] = A6949Lb_rcpo4 ;
         GXv_int17[0] = A6950Lb_rcpo5 ;
         GXv_int16[0] = A6951Lb_rcpo6 ;
         GXv_char2[0] = AV32Ex_ensayo ;
         new app.pregcor2(remoteHandle, context).execute( GXv_char22, GXv_int8, GXv_char15, GXv_char14, GXv_int6, GXv_char13, GXv_int5, GXv_int9, GXv_char12, GXv_char11, GXv_char10, GXv_char7, GXv_char4, GXv_char3, GXv_int21, GXv_int20, GXv_int19, GXv_int18, GXv_int17, GXv_int16, GXv_char2) ;
         tregcor_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tregcor_impl.this.A6933Lb_rcnens = GXv_int8[0] ;
         A6933Lb_rcnens = this.A6933Lb_rcnens ;
         tregcor_impl.this.A6934Lb_rcncar = GXv_char15[0] ;
         A6934Lb_rcncar = this.A6934Lb_rcncar ;
         tregcor_impl.this.A6935Lb_rccorc = GXv_char14[0] ;
         A6935Lb_rccorc = this.A6935Lb_rccorc ;
         tregcor_impl.this.A6936Lb_rcncorc = GXv_int6[0] ;
         A6936Lb_rcncorc = this.A6936Lb_rcncorc ;
         tregcor_impl.this.A6937Lb_rccor = GXv_char13[0] ;
         A6937Lb_rccor = this.A6937Lb_rccor ;
         tregcor_impl.this.A6938Lb_rcncor = GXv_int5[0] ;
         A6938Lb_rcncor = this.A6938Lb_rcncor ;
         tregcor_impl.this.A6939Lb_rctc = GXv_int9[0] ;
         A6939Lb_rctc = this.A6939Lb_rctc ;
         tregcor_impl.this.A6940Lb_rcp1 = GXv_char12[0] ;
         A6940Lb_rcp1 = this.A6940Lb_rcp1 ;
         tregcor_impl.this.A6941Lb_rcp2 = GXv_char11[0] ;
         A6941Lb_rcp2 = this.A6941Lb_rcp2 ;
         tregcor_impl.this.A6942Lb_rcp3 = GXv_char10[0] ;
         A6942Lb_rcp3 = this.A6942Lb_rcp3 ;
         tregcor_impl.this.A6943Lb_rcp4 = GXv_char7[0] ;
         A6943Lb_rcp4 = this.A6943Lb_rcp4 ;
         tregcor_impl.this.A6944Lb_rcp5 = GXv_char4[0] ;
         A6944Lb_rcp5 = this.A6944Lb_rcp5 ;
         tregcor_impl.this.A6945Lb_rcp6 = GXv_char3[0] ;
         A6945Lb_rcp6 = this.A6945Lb_rcp6 ;
         tregcor_impl.this.A6946Lb_rcpo1 = GXv_int21[0] ;
         A6946Lb_rcpo1 = this.A6946Lb_rcpo1 ;
         tregcor_impl.this.A6947Lb_rcpo2 = GXv_int20[0] ;
         A6947Lb_rcpo2 = this.A6947Lb_rcpo2 ;
         tregcor_impl.this.A6948Lb_rcpo3 = GXv_int19[0] ;
         A6948Lb_rcpo3 = this.A6948Lb_rcpo3 ;
         tregcor_impl.this.A6949Lb_rcpo4 = GXv_int18[0] ;
         A6949Lb_rcpo4 = this.A6949Lb_rcpo4 ;
         tregcor_impl.this.A6950Lb_rcpo5 = GXv_int17[0] ;
         A6950Lb_rcpo5 = this.A6950Lb_rcpo5 ;
         tregcor_impl.this.A6951Lb_rcpo6 = GXv_int16[0] ;
         A6951Lb_rcpo6 = this.A6951Lb_rcpo6 ;
         tregcor_impl.this.AV32Ex_ensayo = GXv_char2[0] ;
         AV32Ex_ensayo = this.AV32Ex_ensayo ;
      }
      if ( ( A6933Lb_rcnens > 0 ) && true /* After */ && ( GXutil.strcmp(AV32Ex_ensayo, httpContext.getMessage( "N", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Este Numero de Ensaio NAO EXISTE ¡¡¡", ""), 1, "LB_RCNENS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcnens_Internalname ;
      }
      if ( ( A6933Lb_rcnens > 0 ) && true /* After */ && ( GXutil.strcmp(AV32Ex_ensayo, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Este Numero de Ensaio JA EXISTE ¡¡¡", ""), 1, "LB_RCNENS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcnens_Internalname ;
      }
      if ( true /* Level */ && ( A6933Lb_rcnens > 0 ) && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção não se pode eliminar uma linha de ensaio criada em Gesinlab", ""), 1, "LB_RCNENS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_rcnens_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rccorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rccor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rccor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcncor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcncor_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rctc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rctc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcp6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo4_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo5_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtLb_rcpo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_rcpo6_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6933Lb_rcnens", GXutil.ltrim( localUtil.ntoc( A6933Lb_rcnens, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6934Lb_rcncar", GXutil.rtrim( A6934Lb_rcncar));
      httpContext.ajax_rsp_assign_attri("", false, "A6935Lb_rccorc", GXutil.rtrim( A6935Lb_rccorc));
      httpContext.ajax_rsp_assign_attri("", false, "A6936Lb_rcncorc", GXutil.ltrim( localUtil.ntoc( A6936Lb_rcncorc, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6937Lb_rccor", GXutil.rtrim( A6937Lb_rccor));
      httpContext.ajax_rsp_assign_attri("", false, "A6938Lb_rcncor", GXutil.ltrim( localUtil.ntoc( A6938Lb_rcncor, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6939Lb_rctc", GXutil.ltrim( localUtil.ntoc( A6939Lb_rctc, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6940Lb_rcp1", GXutil.rtrim( A6940Lb_rcp1));
      httpContext.ajax_rsp_assign_attri("", false, "A6941Lb_rcp2", GXutil.rtrim( A6941Lb_rcp2));
      httpContext.ajax_rsp_assign_attri("", false, "A6942Lb_rcp3", GXutil.rtrim( A6942Lb_rcp3));
      httpContext.ajax_rsp_assign_attri("", false, "A6943Lb_rcp4", GXutil.rtrim( A6943Lb_rcp4));
      httpContext.ajax_rsp_assign_attri("", false, "A6944Lb_rcp5", GXutil.rtrim( A6944Lb_rcp5));
      httpContext.ajax_rsp_assign_attri("", false, "A6945Lb_rcp6", GXutil.rtrim( A6945Lb_rcp6));
      httpContext.ajax_rsp_assign_attri("", false, "A6946Lb_rcpo1", GXutil.ltrim( localUtil.ntoc( A6946Lb_rcpo1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6947Lb_rcpo2", GXutil.ltrim( localUtil.ntoc( A6947Lb_rcpo2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6948Lb_rcpo3", GXutil.ltrim( localUtil.ntoc( A6948Lb_rcpo3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6949Lb_rcpo4", GXutil.ltrim( localUtil.ntoc( A6949Lb_rcpo4, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6950Lb_rcpo5", GXutil.ltrim( localUtil.ntoc( A6950Lb_rcpo5, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6951Lb_rcpo6", GXutil.ltrim( localUtil.ntoc( A6951Lb_rcpo6, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Ex_ensayo", GXutil.rtrim( AV32Ex_ensayo));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'ALTERAR OBSERVAçõES'","{handler:'e12X92',iparms:[{av:'A6930Lb_rclin',fld:'LB_RCLIN',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'ALTERAR OBSERVAçõES'",",oparms:[{av:'A6930Lb_rclin',fld:'LB_RCLIN',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6932Lb_Linurc',fld:'LB_LINURC',pic:'ZZZZZZZ9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'A6929Lb_rcLastn',fld:'LB_RCLASTN',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z6932Lb_Linurc'},{av:'ZV8UsurCod'},{av:'Z6929Lb_rcLastn'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_LB_RCLIN","{handler:'valid_Lb_rclin',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6930Lb_rclin',fld:'LB_RCLIN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_LB_RCLIN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6930Lb_rclin',fld:'LB_RCLIN',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALID_LB_RCNENS","{handler:'valid_Lb_rcnens',iparms:[{av:'A6951Lb_rcpo6',fld:'LB_RCPO6',pic:'ZZ9'},{av:'A6950Lb_rcpo5',fld:'LB_RCPO5',pic:'ZZ9'},{av:'A6949Lb_rcpo4',fld:'LB_RCPO4',pic:'ZZ9'},{av:'A6948Lb_rcpo3',fld:'LB_RCPO3',pic:'ZZ9'},{av:'A6947Lb_rcpo2',fld:'LB_RCPO2',pic:'ZZ9'},{av:'A6946Lb_rcpo1',fld:'LB_RCPO1',pic:'ZZ9'},{av:'A6945Lb_rcp6',fld:'LB_RCP6',pic:''},{av:'A6944Lb_rcp5',fld:'LB_RCP5',pic:''},{av:'A6943Lb_rcp4',fld:'LB_RCP4',pic:''},{av:'A6942Lb_rcp3',fld:'LB_RCP3',pic:''},{av:'A6941Lb_rcp2',fld:'LB_RCP2',pic:''},{av:'A6940Lb_rcp1',fld:'LB_RCP1',pic:''},{av:'A6939Lb_rctc',fld:'LB_RCTC',pic:'Z9'},{av:'A6938Lb_rcncor',fld:'LB_RCNCOR',pic:'ZZZZZ9'},{av:'A6937Lb_rccor',fld:'LB_RCCOR',pic:''},{av:'A6936Lb_rcncorc',fld:'LB_RCNCORC',pic:'ZZZZZ9'},{av:'A6935Lb_rccorc',fld:'LB_RCCORC',pic:''},{av:'A6934Lb_rcncar',fld:'LB_RCNCAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A6933Lb_rcnens',fld:'LB_RCNENS',pic:'ZZZZZZZ9'},{av:'AV32Ex_ensayo',fld:'vEX_ENSAYO',pic:''}]");
      setEventMetadata("VALID_LB_RCNENS",",oparms:[{av:'edtLb_rcncar_Enabled',ctrl:'LB_RCNCAR',prop:'Enabled'},{av:'edtLb_rccorc_Enabled',ctrl:'LB_RCCORC',prop:'Enabled'},{av:'edtLb_rcncorc_Enabled',ctrl:'LB_RCNCORC',prop:'Enabled'},{av:'edtLb_rccor_Enabled',ctrl:'LB_RCCOR',prop:'Enabled'},{av:'edtLb_rcncor_Enabled',ctrl:'LB_RCNCOR',prop:'Enabled'},{av:'edtLb_rctc_Enabled',ctrl:'LB_RCTC',prop:'Enabled'},{av:'edtLb_rcp1_Enabled',ctrl:'LB_RCP1',prop:'Enabled'},{av:'edtLb_rcp2_Enabled',ctrl:'LB_RCP2',prop:'Enabled'},{av:'edtLb_rcp3_Enabled',ctrl:'LB_RCP3',prop:'Enabled'},{av:'edtLb_rcp4_Enabled',ctrl:'LB_RCP4',prop:'Enabled'},{av:'edtLb_rcp5_Enabled',ctrl:'LB_RCP5',prop:'Enabled'},{av:'edtLb_rcp6_Enabled',ctrl:'LB_RCP6',prop:'Enabled'},{av:'edtLb_rcpo1_Enabled',ctrl:'LB_RCPO1',prop:'Enabled'},{av:'edtLb_rcpo2_Enabled',ctrl:'LB_RCPO2',prop:'Enabled'},{av:'edtLb_rcpo3_Enabled',ctrl:'LB_RCPO3',prop:'Enabled'},{av:'edtLb_rcpo4_Enabled',ctrl:'LB_RCPO4',prop:'Enabled'},{av:'edtLb_rcpo5_Enabled',ctrl:'LB_RCPO5',prop:'Enabled'},{av:'edtLb_rcpo6_Enabled',ctrl:'LB_RCPO6',prop:'Enabled'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6933Lb_rcnens',fld:'LB_RCNENS',pic:'ZZZZZZZ9'},{av:'A6934Lb_rcncar',fld:'LB_RCNCAR',pic:''},{av:'A6935Lb_rccorc',fld:'LB_RCCORC',pic:''},{av:'A6936Lb_rcncorc',fld:'LB_RCNCORC',pic:'ZZZZZ9'},{av:'A6937Lb_rccor',fld:'LB_RCCOR',pic:''},{av:'A6938Lb_rcncor',fld:'LB_RCNCOR',pic:'ZZZZZ9'},{av:'A6939Lb_rctc',fld:'LB_RCTC',pic:'Z9'},{av:'A6940Lb_rcp1',fld:'LB_RCP1',pic:''},{av:'A6941Lb_rcp2',fld:'LB_RCP2',pic:''},{av:'A6942Lb_rcp3',fld:'LB_RCP3',pic:''},{av:'A6943Lb_rcp4',fld:'LB_RCP4',pic:''},{av:'A6944Lb_rcp5',fld:'LB_RCP5',pic:''},{av:'A6945Lb_rcp6',fld:'LB_RCP6',pic:''},{av:'A6946Lb_rcpo1',fld:'LB_RCPO1',pic:'ZZ9'},{av:'A6947Lb_rcpo2',fld:'LB_RCPO2',pic:'ZZ9'},{av:'A6948Lb_rcpo3',fld:'LB_RCPO3',pic:'ZZ9'},{av:'A6949Lb_rcpo4',fld:'LB_RCPO4',pic:'ZZ9'},{av:'A6950Lb_rcpo5',fld:'LB_RCPO5',pic:'ZZ9'},{av:'A6951Lb_rcpo6',fld:'LB_RCPO6',pic:'ZZ9'},{av:'AV32Ex_ensayo',fld:'vEX_ENSAYO',pic:''}]}");
      setEventMetadata("VALID_LB_RCNCOR","{handler:'valid_Lb_rcncor',iparms:[]");
      setEventMetadata("VALID_LB_RCNCOR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_rcprode',iparms:[]");
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
      pr_default.close(22);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z6934Lb_rcncar = "" ;
      Z6935Lb_rccorc = "" ;
      Z6937Lb_rccor = "" ;
      Z6940Lb_rcp1 = "" ;
      Z6941Lb_rcp2 = "" ;
      Z6942Lb_rcp3 = "" ;
      Z6943Lb_rcp4 = "" ;
      Z6944Lb_rcp5 = "" ;
      Z6945Lb_rcp6 = "" ;
      Z7009Lb_rcFecEt = GXutil.nullDate() ;
      Z7010Lb_rcFecEn = GXutil.nullDate() ;
      Z7011Lb_rcFecRe = GXutil.nullDate() ;
      Z7012Lb_rcOpEnv = "" ;
      Z7013Lb_rcOpApr = "" ;
      Z7014Lb_rcOpNap = "" ;
      Z7015Lb_rcFeNap = GXutil.nullDate() ;
      Z8022Lb_rcProDe = "" ;
      N6934Lb_rcncar = "" ;
      N6935Lb_rccorc = "" ;
      N6937Lb_rccor = "" ;
      N6940Lb_rcp1 = "" ;
      N6941Lb_rcp2 = "" ;
      N6942Lb_rcp3 = "" ;
      N6943Lb_rcp4 = "" ;
      N6944Lb_rcp5 = "" ;
      N6945Lb_rcp6 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A6934Lb_rcncar = "" ;
      A6935Lb_rccorc = "" ;
      A6937Lb_rccor = "" ;
      A6940Lb_rcp1 = "" ;
      A6941Lb_rcp2 = "" ;
      A6942Lb_rcp3 = "" ;
      A6943Lb_rcp4 = "" ;
      A6944Lb_rcp5 = "" ;
      A6945Lb_rcp6 = "" ;
      AV32Ex_ensayo = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode983 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV8UsurCod = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode21 = "" ;
      GXCCtl = "" ;
      A6931Lb_rcobs = "" ;
      A7009Lb_rcFecEt = GXutil.nullDate() ;
      A7010Lb_rcFecEn = GXutil.nullDate() ;
      A7011Lb_rcFecRe = GXutil.nullDate() ;
      A7012Lb_rcOpEnv = "" ;
      A7013Lb_rcOpApr = "" ;
      A7014Lb_rcOpNap = "" ;
      A7015Lb_rcFeNap = GXutil.nullDate() ;
      A8022Lb_rcProDe = "" ;
      T00X95_A6929Lb_rcLastn = new int[1] ;
      T00X95_n6929Lb_rcLastn = new boolean[] {false} ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      Z407EmprNom = "" ;
      T00X98_A407EmprNom = new String[] {""} ;
      T00X98_n407EmprNom = new boolean[] {false} ;
      T00X910_A252CliCod = new int[1] ;
      T00X910_A407EmprNom = new String[] {""} ;
      T00X910_n407EmprNom = new boolean[] {false} ;
      T00X910_A279CliNom = new String[] {""} ;
      T00X910_A6932Lb_Linurc = new int[1] ;
      T00X910_n6932Lb_Linurc = new boolean[] {false} ;
      T00X910_A396EmprCod = new String[] {""} ;
      T00X910_A6929Lb_rcLastn = new int[1] ;
      T00X910_n6929Lb_rcLastn = new boolean[] {false} ;
      T00X912_A6929Lb_rcLastn = new int[1] ;
      T00X912_n6929Lb_rcLastn = new boolean[] {false} ;
      T00X913_A396EmprCod = new String[] {""} ;
      T00X913_A252CliCod = new int[1] ;
      T00X97_A252CliCod = new int[1] ;
      T00X97_A279CliNom = new String[] {""} ;
      T00X97_A6932Lb_Linurc = new int[1] ;
      T00X97_n6932Lb_Linurc = new boolean[] {false} ;
      T00X97_A396EmprCod = new String[] {""} ;
      T00X914_A396EmprCod = new String[] {""} ;
      T00X914_A252CliCod = new int[1] ;
      T00X915_A396EmprCod = new String[] {""} ;
      T00X915_A252CliCod = new int[1] ;
      T00X96_A252CliCod = new int[1] ;
      T00X96_A279CliNom = new String[] {""} ;
      T00X96_A6932Lb_Linurc = new int[1] ;
      T00X96_n6932Lb_Linurc = new boolean[] {false} ;
      T00X96_A396EmprCod = new String[] {""} ;
      T00X920_A6929Lb_rcLastn = new int[1] ;
      T00X920_n6929Lb_rcLastn = new boolean[] {false} ;
      T00X921_A396EmprCod = new String[] {""} ;
      T00X921_A252CliCod = new int[1] ;
      Z6931Lb_rcobs = "" ;
      T00X922_A6931Lb_rcobs = new String[] {""} ;
      T00X922_n6931Lb_rcobs = new boolean[] {false} ;
      T00X922_A252CliCod = new int[1] ;
      T00X922_A6930Lb_rclin = new int[1] ;
      T00X922_A6933Lb_rcnens = new int[1] ;
      T00X922_n6933Lb_rcnens = new boolean[] {false} ;
      T00X922_A6934Lb_rcncar = new String[] {""} ;
      T00X922_n6934Lb_rcncar = new boolean[] {false} ;
      T00X922_A6935Lb_rccorc = new String[] {""} ;
      T00X922_n6935Lb_rccorc = new boolean[] {false} ;
      T00X922_A6936Lb_rcncorc = new int[1] ;
      T00X922_n6936Lb_rcncorc = new boolean[] {false} ;
      T00X922_A6937Lb_rccor = new String[] {""} ;
      T00X922_n6937Lb_rccor = new boolean[] {false} ;
      T00X922_A6938Lb_rcncor = new int[1] ;
      T00X922_n6938Lb_rcncor = new boolean[] {false} ;
      T00X922_A6939Lb_rctc = new byte[1] ;
      T00X922_n6939Lb_rctc = new boolean[] {false} ;
      T00X922_A6940Lb_rcp1 = new String[] {""} ;
      T00X922_n6940Lb_rcp1 = new boolean[] {false} ;
      T00X922_A6941Lb_rcp2 = new String[] {""} ;
      T00X922_n6941Lb_rcp2 = new boolean[] {false} ;
      T00X922_A6942Lb_rcp3 = new String[] {""} ;
      T00X922_n6942Lb_rcp3 = new boolean[] {false} ;
      T00X922_A6943Lb_rcp4 = new String[] {""} ;
      T00X922_n6943Lb_rcp4 = new boolean[] {false} ;
      T00X922_A6944Lb_rcp5 = new String[] {""} ;
      T00X922_n6944Lb_rcp5 = new boolean[] {false} ;
      T00X922_A6945Lb_rcp6 = new String[] {""} ;
      T00X922_n6945Lb_rcp6 = new boolean[] {false} ;
      T00X922_A6946Lb_rcpo1 = new short[1] ;
      T00X922_n6946Lb_rcpo1 = new boolean[] {false} ;
      T00X922_A6947Lb_rcpo2 = new short[1] ;
      T00X922_n6947Lb_rcpo2 = new boolean[] {false} ;
      T00X922_A6948Lb_rcpo3 = new short[1] ;
      T00X922_n6948Lb_rcpo3 = new boolean[] {false} ;
      T00X922_A6949Lb_rcpo4 = new short[1] ;
      T00X922_n6949Lb_rcpo4 = new boolean[] {false} ;
      T00X922_A6950Lb_rcpo5 = new short[1] ;
      T00X922_n6950Lb_rcpo5 = new boolean[] {false} ;
      T00X922_A6951Lb_rcpo6 = new short[1] ;
      T00X922_n6951Lb_rcpo6 = new boolean[] {false} ;
      T00X922_A7009Lb_rcFecEt = new java.util.Date[] {GXutil.nullDate()} ;
      T00X922_n7009Lb_rcFecEt = new boolean[] {false} ;
      T00X922_A7010Lb_rcFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00X922_n7010Lb_rcFecEn = new boolean[] {false} ;
      T00X922_A7011Lb_rcFecRe = new java.util.Date[] {GXutil.nullDate()} ;
      T00X922_n7011Lb_rcFecRe = new boolean[] {false} ;
      T00X922_A7012Lb_rcOpEnv = new String[] {""} ;
      T00X922_n7012Lb_rcOpEnv = new boolean[] {false} ;
      T00X922_A7013Lb_rcOpApr = new String[] {""} ;
      T00X922_n7013Lb_rcOpApr = new boolean[] {false} ;
      T00X922_A7014Lb_rcOpNap = new String[] {""} ;
      T00X922_n7014Lb_rcOpNap = new boolean[] {false} ;
      T00X922_A7015Lb_rcFeNap = new java.util.Date[] {GXutil.nullDate()} ;
      T00X922_n7015Lb_rcFeNap = new boolean[] {false} ;
      T00X922_A8022Lb_rcProDe = new String[] {""} ;
      T00X922_n8022Lb_rcProDe = new boolean[] {false} ;
      T00X922_A396EmprCod = new String[] {""} ;
      T00X923_A396EmprCod = new String[] {""} ;
      T00X923_A252CliCod = new int[1] ;
      T00X923_A6930Lb_rclin = new int[1] ;
      T00X93_A6931Lb_rcobs = new String[] {""} ;
      T00X93_n6931Lb_rcobs = new boolean[] {false} ;
      T00X93_A252CliCod = new int[1] ;
      T00X93_A6930Lb_rclin = new int[1] ;
      T00X93_A6933Lb_rcnens = new int[1] ;
      T00X93_n6933Lb_rcnens = new boolean[] {false} ;
      T00X93_A6934Lb_rcncar = new String[] {""} ;
      T00X93_n6934Lb_rcncar = new boolean[] {false} ;
      T00X93_A6935Lb_rccorc = new String[] {""} ;
      T00X93_n6935Lb_rccorc = new boolean[] {false} ;
      T00X93_A6936Lb_rcncorc = new int[1] ;
      T00X93_n6936Lb_rcncorc = new boolean[] {false} ;
      T00X93_A6937Lb_rccor = new String[] {""} ;
      T00X93_n6937Lb_rccor = new boolean[] {false} ;
      T00X93_A6938Lb_rcncor = new int[1] ;
      T00X93_n6938Lb_rcncor = new boolean[] {false} ;
      T00X93_A6939Lb_rctc = new byte[1] ;
      T00X93_n6939Lb_rctc = new boolean[] {false} ;
      T00X93_A6940Lb_rcp1 = new String[] {""} ;
      T00X93_n6940Lb_rcp1 = new boolean[] {false} ;
      T00X93_A6941Lb_rcp2 = new String[] {""} ;
      T00X93_n6941Lb_rcp2 = new boolean[] {false} ;
      T00X93_A6942Lb_rcp3 = new String[] {""} ;
      T00X93_n6942Lb_rcp3 = new boolean[] {false} ;
      T00X93_A6943Lb_rcp4 = new String[] {""} ;
      T00X93_n6943Lb_rcp4 = new boolean[] {false} ;
      T00X93_A6944Lb_rcp5 = new String[] {""} ;
      T00X93_n6944Lb_rcp5 = new boolean[] {false} ;
      T00X93_A6945Lb_rcp6 = new String[] {""} ;
      T00X93_n6945Lb_rcp6 = new boolean[] {false} ;
      T00X93_A6946Lb_rcpo1 = new short[1] ;
      T00X93_n6946Lb_rcpo1 = new boolean[] {false} ;
      T00X93_A6947Lb_rcpo2 = new short[1] ;
      T00X93_n6947Lb_rcpo2 = new boolean[] {false} ;
      T00X93_A6948Lb_rcpo3 = new short[1] ;
      T00X93_n6948Lb_rcpo3 = new boolean[] {false} ;
      T00X93_A6949Lb_rcpo4 = new short[1] ;
      T00X93_n6949Lb_rcpo4 = new boolean[] {false} ;
      T00X93_A6950Lb_rcpo5 = new short[1] ;
      T00X93_n6950Lb_rcpo5 = new boolean[] {false} ;
      T00X93_A6951Lb_rcpo6 = new short[1] ;
      T00X93_n6951Lb_rcpo6 = new boolean[] {false} ;
      T00X93_A7009Lb_rcFecEt = new java.util.Date[] {GXutil.nullDate()} ;
      T00X93_n7009Lb_rcFecEt = new boolean[] {false} ;
      T00X93_A7010Lb_rcFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00X93_n7010Lb_rcFecEn = new boolean[] {false} ;
      T00X93_A7011Lb_rcFecRe = new java.util.Date[] {GXutil.nullDate()} ;
      T00X93_n7011Lb_rcFecRe = new boolean[] {false} ;
      T00X93_A7012Lb_rcOpEnv = new String[] {""} ;
      T00X93_n7012Lb_rcOpEnv = new boolean[] {false} ;
      T00X93_A7013Lb_rcOpApr = new String[] {""} ;
      T00X93_n7013Lb_rcOpApr = new boolean[] {false} ;
      T00X93_A7014Lb_rcOpNap = new String[] {""} ;
      T00X93_n7014Lb_rcOpNap = new boolean[] {false} ;
      T00X93_A7015Lb_rcFeNap = new java.util.Date[] {GXutil.nullDate()} ;
      T00X93_n7015Lb_rcFeNap = new boolean[] {false} ;
      T00X93_A8022Lb_rcProDe = new String[] {""} ;
      T00X93_n8022Lb_rcProDe = new boolean[] {false} ;
      T00X93_A396EmprCod = new String[] {""} ;
      T00X92_A6931Lb_rcobs = new String[] {""} ;
      T00X92_n6931Lb_rcobs = new boolean[] {false} ;
      T00X92_A252CliCod = new int[1] ;
      T00X92_A6930Lb_rclin = new int[1] ;
      T00X92_A6933Lb_rcnens = new int[1] ;
      T00X92_n6933Lb_rcnens = new boolean[] {false} ;
      T00X92_A6934Lb_rcncar = new String[] {""} ;
      T00X92_n6934Lb_rcncar = new boolean[] {false} ;
      T00X92_A6935Lb_rccorc = new String[] {""} ;
      T00X92_n6935Lb_rccorc = new boolean[] {false} ;
      T00X92_A6936Lb_rcncorc = new int[1] ;
      T00X92_n6936Lb_rcncorc = new boolean[] {false} ;
      T00X92_A6937Lb_rccor = new String[] {""} ;
      T00X92_n6937Lb_rccor = new boolean[] {false} ;
      T00X92_A6938Lb_rcncor = new int[1] ;
      T00X92_n6938Lb_rcncor = new boolean[] {false} ;
      T00X92_A6939Lb_rctc = new byte[1] ;
      T00X92_n6939Lb_rctc = new boolean[] {false} ;
      T00X92_A6940Lb_rcp1 = new String[] {""} ;
      T00X92_n6940Lb_rcp1 = new boolean[] {false} ;
      T00X92_A6941Lb_rcp2 = new String[] {""} ;
      T00X92_n6941Lb_rcp2 = new boolean[] {false} ;
      T00X92_A6942Lb_rcp3 = new String[] {""} ;
      T00X92_n6942Lb_rcp3 = new boolean[] {false} ;
      T00X92_A6943Lb_rcp4 = new String[] {""} ;
      T00X92_n6943Lb_rcp4 = new boolean[] {false} ;
      T00X92_A6944Lb_rcp5 = new String[] {""} ;
      T00X92_n6944Lb_rcp5 = new boolean[] {false} ;
      T00X92_A6945Lb_rcp6 = new String[] {""} ;
      T00X92_n6945Lb_rcp6 = new boolean[] {false} ;
      T00X92_A6946Lb_rcpo1 = new short[1] ;
      T00X92_n6946Lb_rcpo1 = new boolean[] {false} ;
      T00X92_A6947Lb_rcpo2 = new short[1] ;
      T00X92_n6947Lb_rcpo2 = new boolean[] {false} ;
      T00X92_A6948Lb_rcpo3 = new short[1] ;
      T00X92_n6948Lb_rcpo3 = new boolean[] {false} ;
      T00X92_A6949Lb_rcpo4 = new short[1] ;
      T00X92_n6949Lb_rcpo4 = new boolean[] {false} ;
      T00X92_A6950Lb_rcpo5 = new short[1] ;
      T00X92_n6950Lb_rcpo5 = new boolean[] {false} ;
      T00X92_A6951Lb_rcpo6 = new short[1] ;
      T00X92_n6951Lb_rcpo6 = new boolean[] {false} ;
      T00X92_A7009Lb_rcFecEt = new java.util.Date[] {GXutil.nullDate()} ;
      T00X92_n7009Lb_rcFecEt = new boolean[] {false} ;
      T00X92_A7010Lb_rcFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00X92_n7010Lb_rcFecEn = new boolean[] {false} ;
      T00X92_A7011Lb_rcFecRe = new java.util.Date[] {GXutil.nullDate()} ;
      T00X92_n7011Lb_rcFecRe = new boolean[] {false} ;
      T00X92_A7012Lb_rcOpEnv = new String[] {""} ;
      T00X92_n7012Lb_rcOpEnv = new boolean[] {false} ;
      T00X92_A7013Lb_rcOpApr = new String[] {""} ;
      T00X92_n7013Lb_rcOpApr = new boolean[] {false} ;
      T00X92_A7014Lb_rcOpNap = new String[] {""} ;
      T00X92_n7014Lb_rcOpNap = new boolean[] {false} ;
      T00X92_A7015Lb_rcFeNap = new java.util.Date[] {GXutil.nullDate()} ;
      T00X92_n7015Lb_rcFeNap = new boolean[] {false} ;
      T00X92_A8022Lb_rcProDe = new String[] {""} ;
      T00X92_n8022Lb_rcProDe = new boolean[] {false} ;
      T00X92_A396EmprCod = new String[] {""} ;
      T00X927_A396EmprCod = new String[] {""} ;
      T00X927_A252CliCod = new int[1] ;
      T00X927_A6930Lb_rclin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00X928_A407EmprNom = new String[] {""} ;
      T00X928_n407EmprNom = new boolean[] {false} ;
      ZV8UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZV8UsurCod = "" ;
      GXv_char22 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char15 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char13 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int21 = new short[1] ;
      GXv_int20 = new short[1] ;
      GXv_int19 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int16 = new short[1] ;
      GXv_char2 = new String[1] ;
      ZV32Ex_ensayo = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tregcor__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tregcor__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tregcor__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tregcor__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tregcor__default(),
         new Object[] {
             new Object[] {
            T00X92_A6931Lb_rcobs, T00X92_n6931Lb_rcobs, T00X92_A252CliCod, T00X92_A6930Lb_rclin, T00X92_A6933Lb_rcnens, T00X92_n6933Lb_rcnens, T00X92_A6934Lb_rcncar, T00X92_n6934Lb_rcncar, T00X92_A6935Lb_rccorc, T00X92_n6935Lb_rccorc,
            T00X92_A6936Lb_rcncorc, T00X92_n6936Lb_rcncorc, T00X92_A6937Lb_rccor, T00X92_n6937Lb_rccor, T00X92_A6938Lb_rcncor, T00X92_n6938Lb_rcncor, T00X92_A6939Lb_rctc, T00X92_n6939Lb_rctc, T00X92_A6940Lb_rcp1, T00X92_n6940Lb_rcp1,
            T00X92_A6941Lb_rcp2, T00X92_n6941Lb_rcp2, T00X92_A6942Lb_rcp3, T00X92_n6942Lb_rcp3, T00X92_A6943Lb_rcp4, T00X92_n6943Lb_rcp4, T00X92_A6944Lb_rcp5, T00X92_n6944Lb_rcp5, T00X92_A6945Lb_rcp6, T00X92_n6945Lb_rcp6,
            T00X92_A6946Lb_rcpo1, T00X92_n6946Lb_rcpo1, T00X92_A6947Lb_rcpo2, T00X92_n6947Lb_rcpo2, T00X92_A6948Lb_rcpo3, T00X92_n6948Lb_rcpo3, T00X92_A6949Lb_rcpo4, T00X92_n6949Lb_rcpo4, T00X92_A6950Lb_rcpo5, T00X92_n6950Lb_rcpo5,
            T00X92_A6951Lb_rcpo6, T00X92_n6951Lb_rcpo6, T00X92_A7009Lb_rcFecEt, T00X92_n7009Lb_rcFecEt, T00X92_A7010Lb_rcFecEn, T00X92_n7010Lb_rcFecEn, T00X92_A7011Lb_rcFecRe, T00X92_n7011Lb_rcFecRe, T00X92_A7012Lb_rcOpEnv, T00X92_n7012Lb_rcOpEnv,
            T00X92_A7013Lb_rcOpApr, T00X92_n7013Lb_rcOpApr, T00X92_A7014Lb_rcOpNap, T00X92_n7014Lb_rcOpNap, T00X92_A7015Lb_rcFeNap, T00X92_n7015Lb_rcFeNap, T00X92_A8022Lb_rcProDe, T00X92_n8022Lb_rcProDe, T00X92_A396EmprCod
            }
            , new Object[] {
            T00X93_A6931Lb_rcobs, T00X93_n6931Lb_rcobs, T00X93_A252CliCod, T00X93_A6930Lb_rclin, T00X93_A6933Lb_rcnens, T00X93_n6933Lb_rcnens, T00X93_A6934Lb_rcncar, T00X93_n6934Lb_rcncar, T00X93_A6935Lb_rccorc, T00X93_n6935Lb_rccorc,
            T00X93_A6936Lb_rcncorc, T00X93_n6936Lb_rcncorc, T00X93_A6937Lb_rccor, T00X93_n6937Lb_rccor, T00X93_A6938Lb_rcncor, T00X93_n6938Lb_rcncor, T00X93_A6939Lb_rctc, T00X93_n6939Lb_rctc, T00X93_A6940Lb_rcp1, T00X93_n6940Lb_rcp1,
            T00X93_A6941Lb_rcp2, T00X93_n6941Lb_rcp2, T00X93_A6942Lb_rcp3, T00X93_n6942Lb_rcp3, T00X93_A6943Lb_rcp4, T00X93_n6943Lb_rcp4, T00X93_A6944Lb_rcp5, T00X93_n6944Lb_rcp5, T00X93_A6945Lb_rcp6, T00X93_n6945Lb_rcp6,
            T00X93_A6946Lb_rcpo1, T00X93_n6946Lb_rcpo1, T00X93_A6947Lb_rcpo2, T00X93_n6947Lb_rcpo2, T00X93_A6948Lb_rcpo3, T00X93_n6948Lb_rcpo3, T00X93_A6949Lb_rcpo4, T00X93_n6949Lb_rcpo4, T00X93_A6950Lb_rcpo5, T00X93_n6950Lb_rcpo5,
            T00X93_A6951Lb_rcpo6, T00X93_n6951Lb_rcpo6, T00X93_A7009Lb_rcFecEt, T00X93_n7009Lb_rcFecEt, T00X93_A7010Lb_rcFecEn, T00X93_n7010Lb_rcFecEn, T00X93_A7011Lb_rcFecRe, T00X93_n7011Lb_rcFecRe, T00X93_A7012Lb_rcOpEnv, T00X93_n7012Lb_rcOpEnv,
            T00X93_A7013Lb_rcOpApr, T00X93_n7013Lb_rcOpApr, T00X93_A7014Lb_rcOpNap, T00X93_n7014Lb_rcOpNap, T00X93_A7015Lb_rcFeNap, T00X93_n7015Lb_rcFeNap, T00X93_A8022Lb_rcProDe, T00X93_n8022Lb_rcProDe, T00X93_A396EmprCod
            }
            , new Object[] {
            T00X95_A6929Lb_rcLastn, T00X95_n6929Lb_rcLastn
            }
            , new Object[] {
            T00X96_A252CliCod, T00X96_A279CliNom, T00X96_A6932Lb_Linurc, T00X96_n6932Lb_Linurc, T00X96_A396EmprCod
            }
            , new Object[] {
            T00X97_A252CliCod, T00X97_A279CliNom, T00X97_A6932Lb_Linurc, T00X97_n6932Lb_Linurc, T00X97_A396EmprCod
            }
            , new Object[] {
            T00X98_A407EmprNom, T00X98_n407EmprNom
            }
            , new Object[] {
            T00X910_A252CliCod, T00X910_A407EmprNom, T00X910_n407EmprNom, T00X910_A279CliNom, T00X910_A6932Lb_Linurc, T00X910_n6932Lb_Linurc, T00X910_A396EmprCod, T00X910_A6929Lb_rcLastn, T00X910_n6929Lb_rcLastn
            }
            , new Object[] {
            T00X912_A6929Lb_rcLastn, T00X912_n6929Lb_rcLastn
            }
            , new Object[] {
            T00X913_A396EmprCod, T00X913_A252CliCod
            }
            , new Object[] {
            T00X914_A396EmprCod, T00X914_A252CliCod
            }
            , new Object[] {
            T00X915_A396EmprCod, T00X915_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00X920_A6929Lb_rcLastn, T00X920_n6929Lb_rcLastn
            }
            , new Object[] {
            T00X921_A396EmprCod, T00X921_A252CliCod
            }
            , new Object[] {
            T00X922_A6931Lb_rcobs, T00X922_n6931Lb_rcobs, T00X922_A252CliCod, T00X922_A6930Lb_rclin, T00X922_A6933Lb_rcnens, T00X922_n6933Lb_rcnens, T00X922_A6934Lb_rcncar, T00X922_n6934Lb_rcncar, T00X922_A6935Lb_rccorc, T00X922_n6935Lb_rccorc,
            T00X922_A6936Lb_rcncorc, T00X922_n6936Lb_rcncorc, T00X922_A6937Lb_rccor, T00X922_n6937Lb_rccor, T00X922_A6938Lb_rcncor, T00X922_n6938Lb_rcncor, T00X922_A6939Lb_rctc, T00X922_n6939Lb_rctc, T00X922_A6940Lb_rcp1, T00X922_n6940Lb_rcp1,
            T00X922_A6941Lb_rcp2, T00X922_n6941Lb_rcp2, T00X922_A6942Lb_rcp3, T00X922_n6942Lb_rcp3, T00X922_A6943Lb_rcp4, T00X922_n6943Lb_rcp4, T00X922_A6944Lb_rcp5, T00X922_n6944Lb_rcp5, T00X922_A6945Lb_rcp6, T00X922_n6945Lb_rcp6,
            T00X922_A6946Lb_rcpo1, T00X922_n6946Lb_rcpo1, T00X922_A6947Lb_rcpo2, T00X922_n6947Lb_rcpo2, T00X922_A6948Lb_rcpo3, T00X922_n6948Lb_rcpo3, T00X922_A6949Lb_rcpo4, T00X922_n6949Lb_rcpo4, T00X922_A6950Lb_rcpo5, T00X922_n6950Lb_rcpo5,
            T00X922_A6951Lb_rcpo6, T00X922_n6951Lb_rcpo6, T00X922_A7009Lb_rcFecEt, T00X922_n7009Lb_rcFecEt, T00X922_A7010Lb_rcFecEn, T00X922_n7010Lb_rcFecEn, T00X922_A7011Lb_rcFecRe, T00X922_n7011Lb_rcFecRe, T00X922_A7012Lb_rcOpEnv, T00X922_n7012Lb_rcOpEnv,
            T00X922_A7013Lb_rcOpApr, T00X922_n7013Lb_rcOpApr, T00X922_A7014Lb_rcOpNap, T00X922_n7014Lb_rcOpNap, T00X922_A7015Lb_rcFeNap, T00X922_n7015Lb_rcFeNap, T00X922_A8022Lb_rcProDe, T00X922_n8022Lb_rcProDe, T00X922_A396EmprCod
            }
            , new Object[] {
            T00X923_A396EmprCod, T00X923_A252CliCod, T00X923_A6930Lb_rclin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00X927_A396EmprCod, T00X927_A252CliCod, T00X927_A6930Lb_rclin
            }
            , new Object[] {
            T00X928_A407EmprNom, T00X928_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TREGCOR" ;
   }

   private byte Z6939Lb_rctc ;
   private byte N6939Lb_rctc ;
   private byte GxWebError ;
   private byte A6939Lb_rctc ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int9[] ;
   private short Z6946Lb_rcpo1 ;
   private short Z6947Lb_rcpo2 ;
   private short Z6948Lb_rcpo3 ;
   private short Z6949Lb_rcpo4 ;
   private short Z6950Lb_rcpo5 ;
   private short Z6951Lb_rcpo6 ;
   private short nRcdDeleted_983 ;
   private short nRcdExists_983 ;
   private short nIsMod_983 ;
   private short N6946Lb_rcpo1 ;
   private short N6947Lb_rcpo2 ;
   private short N6948Lb_rcpo3 ;
   private short N6949Lb_rcpo4 ;
   private short N6950Lb_rcpo5 ;
   private short N6951Lb_rcpo6 ;
   private short A6946Lb_rcpo1 ;
   private short A6947Lb_rcpo2 ;
   private short A6948Lb_rcpo3 ;
   private short A6949Lb_rcpo4 ;
   private short A6950Lb_rcpo5 ;
   private short A6951Lb_rcpo6 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount983 ;
   private short RcdFound983 ;
   private short nBlankRcdUsr983 ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_983 ;
   private short GXv_int21[] ;
   private short GXv_int20[] ;
   private short GXv_int19[] ;
   private short GXv_int18[] ;
   private short GXv_int17[] ;
   private short GXv_int16[] ;
   private int Z252CliCod ;
   private int Z6932Lb_Linurc ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z6930Lb_rclin ;
   private int Z6933Lb_rcnens ;
   private int Z6936Lb_rcncorc ;
   private int Z6938Lb_rcncor ;
   private int N6936Lb_rcncorc ;
   private int N6938Lb_rcncor ;
   private int A252CliCod ;
   private int A6930Lb_rclin ;
   private int A6933Lb_rcnens ;
   private int A6936Lb_rcncorc ;
   private int A6938Lb_rcncor ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int A6932Lb_Linurc ;
   private int edtLb_Linurc_Enabled ;
   private int A6929Lb_rcLastn ;
   private int edtLb_rcLastn_Enabled ;
   private int edtavnRcdDeleted_983_Enabled ;
   private int edtLb_rclin_Enabled ;
   private int edtLb_rcnens_Enabled ;
   private int edtLb_rcncar_Enabled ;
   private int edtLb_rccorc_Enabled ;
   private int edtLb_rcncorc_Enabled ;
   private int edtLb_rccor_Enabled ;
   private int edtLb_rcncor_Enabled ;
   private int edtLb_rctc_Enabled ;
   private int edtLb_rcp1_Enabled ;
   private int edtLb_rcp2_Enabled ;
   private int edtLb_rcp3_Enabled ;
   private int edtLb_rcp4_Enabled ;
   private int edtLb_rcp5_Enabled ;
   private int edtLb_rcp6_Enabled ;
   private int edtLb_rcpo1_Enabled ;
   private int edtLb_rcpo2_Enabled ;
   private int edtLb_rcpo3_Enabled ;
   private int edtLb_rcpo4_Enabled ;
   private int edtLb_rcpo5_Enabled ;
   private int edtLb_rcpo6_Enabled ;
   private int edtLb_rcobs_Enabled ;
   private int edtLb_rcFecEt_Enabled ;
   private int edtLb_rcFecEn_Enabled ;
   private int edtLb_rcFecRe_Enabled ;
   private int edtLb_rcOpEnv_Enabled ;
   private int edtLb_rcOpApr_Enabled ;
   private int edtLb_rcOpNap_Enabled ;
   private int edtLb_rcFeNap_Enabled ;
   private int edtLb_rcProDe_Enabled ;
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
   private int Z6929Lb_rcLastn ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtLb_rcobs_Enabled ;
   private int defedtLb_rcpo6_Enabled ;
   private int defedtLb_rcpo5_Enabled ;
   private int defedtLb_rcpo4_Enabled ;
   private int defedtLb_rcpo3_Enabled ;
   private int defedtLb_rcpo2_Enabled ;
   private int defedtLb_rcpo1_Enabled ;
   private int defedtLb_rcp6_Enabled ;
   private int defedtLb_rcp5_Enabled ;
   private int defedtLb_rcp4_Enabled ;
   private int defedtLb_rcp3_Enabled ;
   private int defedtLb_rcp2_Enabled ;
   private int defedtLb_rcp1_Enabled ;
   private int defedtLb_rctc_Enabled ;
   private int defedtLb_rcncor_Enabled ;
   private int defedtLb_rccor_Enabled ;
   private int defedtLb_rcncorc_Enabled ;
   private int defedtLb_rccorc_Enabled ;
   private int defedtLb_rcncar_Enabled ;
   private int defedtLb_rclin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtLb_rcLastn_Backcolor ;
   private int edtLb_Linurc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ6932Lb_Linurc ;
   private int ZZ6929Lb_rcLastn ;
   private int GXv_int8[] ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z6934Lb_rcncar ;
   private String Z6935Lb_rccorc ;
   private String Z6937Lb_rccor ;
   private String Z6940Lb_rcp1 ;
   private String Z6941Lb_rcp2 ;
   private String Z6942Lb_rcp3 ;
   private String Z6943Lb_rcp4 ;
   private String Z6944Lb_rcp5 ;
   private String Z6945Lb_rcp6 ;
   private String Z7012Lb_rcOpEnv ;
   private String Z7013Lb_rcOpApr ;
   private String Z7014Lb_rcOpNap ;
   private String Z8022Lb_rcProDe ;
   private String N6934Lb_rcncar ;
   private String N6935Lb_rccorc ;
   private String N6937Lb_rccor ;
   private String N6940Lb_rcp1 ;
   private String N6941Lb_rcp2 ;
   private String N6942Lb_rcp3 ;
   private String N6943Lb_rcp4 ;
   private String N6944Lb_rcp5 ;
   private String N6945Lb_rcp6 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A6934Lb_rcncar ;
   private String A6935Lb_rccorc ;
   private String A6937Lb_rccor ;
   private String A6940Lb_rcp1 ;
   private String A6941Lb_rcp2 ;
   private String A6942Lb_rcp3 ;
   private String A6943Lb_rcp4 ;
   private String A6944Lb_rcp5 ;
   private String A6945Lb_rcp6 ;
   private String AV32Ex_ensayo ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtLb_Linurc_Internalname ;
   private String edtLb_Linurc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtLb_rcLastn_Internalname ;
   private String edtLb_rcLastn_Jsonclick ;
   private String sMode983 ;
   private String edtavnRcdDeleted_983_Internalname ;
   private String edtLb_rclin_Internalname ;
   private String edtLb_rcnens_Internalname ;
   private String edtLb_rcncar_Internalname ;
   private String edtLb_rccorc_Internalname ;
   private String edtLb_rcncorc_Internalname ;
   private String edtLb_rccor_Internalname ;
   private String edtLb_rcncor_Internalname ;
   private String edtLb_rctc_Internalname ;
   private String edtLb_rcp1_Internalname ;
   private String edtLb_rcp2_Internalname ;
   private String edtLb_rcp3_Internalname ;
   private String edtLb_rcp4_Internalname ;
   private String edtLb_rcp5_Internalname ;
   private String edtLb_rcp6_Internalname ;
   private String edtLb_rcpo1_Internalname ;
   private String edtLb_rcpo2_Internalname ;
   private String edtLb_rcpo3_Internalname ;
   private String edtLb_rcpo4_Internalname ;
   private String edtLb_rcpo5_Internalname ;
   private String edtLb_rcpo6_Internalname ;
   private String edtLb_rcobs_Internalname ;
   private String edtLb_rcFecEt_Internalname ;
   private String edtLb_rcFecEn_Internalname ;
   private String edtLb_rcFecRe_Internalname ;
   private String edtLb_rcOpEnv_Internalname ;
   private String edtLb_rcOpApr_Internalname ;
   private String edtLb_rcOpNap_Internalname ;
   private String edtLb_rcFeNap_Internalname ;
   private String edtLb_rcProDe_Internalname ;
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
   private String AV8UsurCod ;
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode21 ;
   private String GXCCtl ;
   private String A7012Lb_rcOpEnv ;
   private String A7013Lb_rcOpApr ;
   private String A7014Lb_rcOpNap ;
   private String A8022Lb_rcProDe ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String Z407EmprNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_983_Jsonclick ;
   private String edtLb_rclin_Jsonclick ;
   private String edtLb_rcnens_Jsonclick ;
   private String edtLb_rcncar_Jsonclick ;
   private String edtLb_rccorc_Jsonclick ;
   private String edtLb_rcncorc_Jsonclick ;
   private String edtLb_rccor_Jsonclick ;
   private String edtLb_rcncor_Jsonclick ;
   private String edtLb_rctc_Jsonclick ;
   private String edtLb_rcp1_Jsonclick ;
   private String edtLb_rcp2_Jsonclick ;
   private String edtLb_rcp3_Jsonclick ;
   private String edtLb_rcp4_Jsonclick ;
   private String edtLb_rcp5_Jsonclick ;
   private String edtLb_rcp6_Jsonclick ;
   private String edtLb_rcpo1_Jsonclick ;
   private String edtLb_rcpo2_Jsonclick ;
   private String edtLb_rcpo3_Jsonclick ;
   private String edtLb_rcpo4_Jsonclick ;
   private String edtLb_rcpo5_Jsonclick ;
   private String edtLb_rcpo6_Jsonclick ;
   private String edtLb_rcobs_Jsonclick ;
   private String edtLb_rcFecEt_Jsonclick ;
   private String edtLb_rcFecEn_Jsonclick ;
   private String edtLb_rcFecRe_Jsonclick ;
   private String edtLb_rcOpEnv_Jsonclick ;
   private String edtLb_rcOpApr_Jsonclick ;
   private String edtLb_rcOpNap_Jsonclick ;
   private String edtLb_rcFeNap_Jsonclick ;
   private String edtLb_rcProDe_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV8UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZV8UsurCod ;
   private String GXv_char22[] ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV32Ex_ensayo ;
   private java.util.Date Z7009Lb_rcFecEt ;
   private java.util.Date Z7010Lb_rcFecEn ;
   private java.util.Date Z7011Lb_rcFecRe ;
   private java.util.Date Z7015Lb_rcFeNap ;
   private java.util.Date A7009Lb_rcFecEt ;
   private java.util.Date A7010Lb_rcFecEn ;
   private java.util.Date A7011Lb_rcFecRe ;
   private java.util.Date A7015Lb_rcFeNap ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6933Lb_rcnens ;
   private boolean n6934Lb_rcncar ;
   private boolean n6935Lb_rccorc ;
   private boolean n6936Lb_rcncorc ;
   private boolean n6937Lb_rccor ;
   private boolean n6938Lb_rcncor ;
   private boolean n6939Lb_rctc ;
   private boolean n6940Lb_rcp1 ;
   private boolean n6941Lb_rcp2 ;
   private boolean n6942Lb_rcp3 ;
   private boolean n6943Lb_rcp4 ;
   private boolean n6944Lb_rcp5 ;
   private boolean n6945Lb_rcp6 ;
   private boolean n6946Lb_rcpo1 ;
   private boolean n6947Lb_rcpo2 ;
   private boolean n6948Lb_rcpo3 ;
   private boolean n6949Lb_rcpo4 ;
   private boolean n6950Lb_rcpo5 ;
   private boolean n6951Lb_rcpo6 ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n6932Lb_Linurc ;
   private boolean n6929Lb_rcLastn ;
   private boolean returnInSub ;
   private boolean n6931Lb_rcobs ;
   private boolean n7009Lb_rcFecEt ;
   private boolean n7010Lb_rcFecEn ;
   private boolean n7011Lb_rcFecRe ;
   private boolean n7012Lb_rcOpEnv ;
   private boolean n7013Lb_rcOpApr ;
   private boolean n7014Lb_rcOpNap ;
   private boolean n7015Lb_rcFeNap ;
   private boolean n8022Lb_rcProDe ;
   private boolean Gx_longc ;
   private String A6931Lb_rcobs ;
   private String Z6931Lb_rcobs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T00X95_A6929Lb_rcLastn ;
   private boolean[] T00X95_n6929Lb_rcLastn ;
   private String[] T00X98_A407EmprNom ;
   private boolean[] T00X98_n407EmprNom ;
   private int[] T00X910_A252CliCod ;
   private String[] T00X910_A407EmprNom ;
   private boolean[] T00X910_n407EmprNom ;
   private String[] T00X910_A279CliNom ;
   private int[] T00X910_A6932Lb_Linurc ;
   private boolean[] T00X910_n6932Lb_Linurc ;
   private String[] T00X910_A396EmprCod ;
   private int[] T00X910_A6929Lb_rcLastn ;
   private boolean[] T00X910_n6929Lb_rcLastn ;
   private int[] T00X912_A6929Lb_rcLastn ;
   private boolean[] T00X912_n6929Lb_rcLastn ;
   private String[] T00X913_A396EmprCod ;
   private int[] T00X913_A252CliCod ;
   private int[] T00X97_A252CliCod ;
   private String[] T00X97_A279CliNom ;
   private int[] T00X97_A6932Lb_Linurc ;
   private boolean[] T00X97_n6932Lb_Linurc ;
   private String[] T00X97_A396EmprCod ;
   private String[] T00X914_A396EmprCod ;
   private int[] T00X914_A252CliCod ;
   private String[] T00X915_A396EmprCod ;
   private int[] T00X915_A252CliCod ;
   private int[] T00X96_A252CliCod ;
   private String[] T00X96_A279CliNom ;
   private int[] T00X96_A6932Lb_Linurc ;
   private boolean[] T00X96_n6932Lb_Linurc ;
   private String[] T00X96_A396EmprCod ;
   private int[] T00X920_A6929Lb_rcLastn ;
   private boolean[] T00X920_n6929Lb_rcLastn ;
   private String[] T00X921_A396EmprCod ;
   private int[] T00X921_A252CliCod ;
   private String[] T00X922_A6931Lb_rcobs ;
   private boolean[] T00X922_n6931Lb_rcobs ;
   private int[] T00X922_A252CliCod ;
   private int[] T00X922_A6930Lb_rclin ;
   private int[] T00X922_A6933Lb_rcnens ;
   private boolean[] T00X922_n6933Lb_rcnens ;
   private String[] T00X922_A6934Lb_rcncar ;
   private boolean[] T00X922_n6934Lb_rcncar ;
   private String[] T00X922_A6935Lb_rccorc ;
   private boolean[] T00X922_n6935Lb_rccorc ;
   private int[] T00X922_A6936Lb_rcncorc ;
   private boolean[] T00X922_n6936Lb_rcncorc ;
   private String[] T00X922_A6937Lb_rccor ;
   private boolean[] T00X922_n6937Lb_rccor ;
   private int[] T00X922_A6938Lb_rcncor ;
   private boolean[] T00X922_n6938Lb_rcncor ;
   private byte[] T00X922_A6939Lb_rctc ;
   private boolean[] T00X922_n6939Lb_rctc ;
   private String[] T00X922_A6940Lb_rcp1 ;
   private boolean[] T00X922_n6940Lb_rcp1 ;
   private String[] T00X922_A6941Lb_rcp2 ;
   private boolean[] T00X922_n6941Lb_rcp2 ;
   private String[] T00X922_A6942Lb_rcp3 ;
   private boolean[] T00X922_n6942Lb_rcp3 ;
   private String[] T00X922_A6943Lb_rcp4 ;
   private boolean[] T00X922_n6943Lb_rcp4 ;
   private String[] T00X922_A6944Lb_rcp5 ;
   private boolean[] T00X922_n6944Lb_rcp5 ;
   private String[] T00X922_A6945Lb_rcp6 ;
   private boolean[] T00X922_n6945Lb_rcp6 ;
   private short[] T00X922_A6946Lb_rcpo1 ;
   private boolean[] T00X922_n6946Lb_rcpo1 ;
   private short[] T00X922_A6947Lb_rcpo2 ;
   private boolean[] T00X922_n6947Lb_rcpo2 ;
   private short[] T00X922_A6948Lb_rcpo3 ;
   private boolean[] T00X922_n6948Lb_rcpo3 ;
   private short[] T00X922_A6949Lb_rcpo4 ;
   private boolean[] T00X922_n6949Lb_rcpo4 ;
   private short[] T00X922_A6950Lb_rcpo5 ;
   private boolean[] T00X922_n6950Lb_rcpo5 ;
   private short[] T00X922_A6951Lb_rcpo6 ;
   private boolean[] T00X922_n6951Lb_rcpo6 ;
   private java.util.Date[] T00X922_A7009Lb_rcFecEt ;
   private boolean[] T00X922_n7009Lb_rcFecEt ;
   private java.util.Date[] T00X922_A7010Lb_rcFecEn ;
   private boolean[] T00X922_n7010Lb_rcFecEn ;
   private java.util.Date[] T00X922_A7011Lb_rcFecRe ;
   private boolean[] T00X922_n7011Lb_rcFecRe ;
   private String[] T00X922_A7012Lb_rcOpEnv ;
   private boolean[] T00X922_n7012Lb_rcOpEnv ;
   private String[] T00X922_A7013Lb_rcOpApr ;
   private boolean[] T00X922_n7013Lb_rcOpApr ;
   private String[] T00X922_A7014Lb_rcOpNap ;
   private boolean[] T00X922_n7014Lb_rcOpNap ;
   private java.util.Date[] T00X922_A7015Lb_rcFeNap ;
   private boolean[] T00X922_n7015Lb_rcFeNap ;
   private String[] T00X922_A8022Lb_rcProDe ;
   private boolean[] T00X922_n8022Lb_rcProDe ;
   private String[] T00X922_A396EmprCod ;
   private String[] T00X923_A396EmprCod ;
   private int[] T00X923_A252CliCod ;
   private int[] T00X923_A6930Lb_rclin ;
   private String[] T00X93_A6931Lb_rcobs ;
   private boolean[] T00X93_n6931Lb_rcobs ;
   private int[] T00X93_A252CliCod ;
   private int[] T00X93_A6930Lb_rclin ;
   private int[] T00X93_A6933Lb_rcnens ;
   private boolean[] T00X93_n6933Lb_rcnens ;
   private String[] T00X93_A6934Lb_rcncar ;
   private boolean[] T00X93_n6934Lb_rcncar ;
   private String[] T00X93_A6935Lb_rccorc ;
   private boolean[] T00X93_n6935Lb_rccorc ;
   private int[] T00X93_A6936Lb_rcncorc ;
   private boolean[] T00X93_n6936Lb_rcncorc ;
   private String[] T00X93_A6937Lb_rccor ;
   private boolean[] T00X93_n6937Lb_rccor ;
   private int[] T00X93_A6938Lb_rcncor ;
   private boolean[] T00X93_n6938Lb_rcncor ;
   private byte[] T00X93_A6939Lb_rctc ;
   private boolean[] T00X93_n6939Lb_rctc ;
   private String[] T00X93_A6940Lb_rcp1 ;
   private boolean[] T00X93_n6940Lb_rcp1 ;
   private String[] T00X93_A6941Lb_rcp2 ;
   private boolean[] T00X93_n6941Lb_rcp2 ;
   private String[] T00X93_A6942Lb_rcp3 ;
   private boolean[] T00X93_n6942Lb_rcp3 ;
   private String[] T00X93_A6943Lb_rcp4 ;
   private boolean[] T00X93_n6943Lb_rcp4 ;
   private String[] T00X93_A6944Lb_rcp5 ;
   private boolean[] T00X93_n6944Lb_rcp5 ;
   private String[] T00X93_A6945Lb_rcp6 ;
   private boolean[] T00X93_n6945Lb_rcp6 ;
   private short[] T00X93_A6946Lb_rcpo1 ;
   private boolean[] T00X93_n6946Lb_rcpo1 ;
   private short[] T00X93_A6947Lb_rcpo2 ;
   private boolean[] T00X93_n6947Lb_rcpo2 ;
   private short[] T00X93_A6948Lb_rcpo3 ;
   private boolean[] T00X93_n6948Lb_rcpo3 ;
   private short[] T00X93_A6949Lb_rcpo4 ;
   private boolean[] T00X93_n6949Lb_rcpo4 ;
   private short[] T00X93_A6950Lb_rcpo5 ;
   private boolean[] T00X93_n6950Lb_rcpo5 ;
   private short[] T00X93_A6951Lb_rcpo6 ;
   private boolean[] T00X93_n6951Lb_rcpo6 ;
   private java.util.Date[] T00X93_A7009Lb_rcFecEt ;
   private boolean[] T00X93_n7009Lb_rcFecEt ;
   private java.util.Date[] T00X93_A7010Lb_rcFecEn ;
   private boolean[] T00X93_n7010Lb_rcFecEn ;
   private java.util.Date[] T00X93_A7011Lb_rcFecRe ;
   private boolean[] T00X93_n7011Lb_rcFecRe ;
   private String[] T00X93_A7012Lb_rcOpEnv ;
   private boolean[] T00X93_n7012Lb_rcOpEnv ;
   private String[] T00X93_A7013Lb_rcOpApr ;
   private boolean[] T00X93_n7013Lb_rcOpApr ;
   private String[] T00X93_A7014Lb_rcOpNap ;
   private boolean[] T00X93_n7014Lb_rcOpNap ;
   private java.util.Date[] T00X93_A7015Lb_rcFeNap ;
   private boolean[] T00X93_n7015Lb_rcFeNap ;
   private String[] T00X93_A8022Lb_rcProDe ;
   private boolean[] T00X93_n8022Lb_rcProDe ;
   private String[] T00X93_A396EmprCod ;
   private String[] T00X92_A6931Lb_rcobs ;
   private boolean[] T00X92_n6931Lb_rcobs ;
   private int[] T00X92_A252CliCod ;
   private int[] T00X92_A6930Lb_rclin ;
   private int[] T00X92_A6933Lb_rcnens ;
   private boolean[] T00X92_n6933Lb_rcnens ;
   private String[] T00X92_A6934Lb_rcncar ;
   private boolean[] T00X92_n6934Lb_rcncar ;
   private String[] T00X92_A6935Lb_rccorc ;
   private boolean[] T00X92_n6935Lb_rccorc ;
   private int[] T00X92_A6936Lb_rcncorc ;
   private boolean[] T00X92_n6936Lb_rcncorc ;
   private String[] T00X92_A6937Lb_rccor ;
   private boolean[] T00X92_n6937Lb_rccor ;
   private int[] T00X92_A6938Lb_rcncor ;
   private boolean[] T00X92_n6938Lb_rcncor ;
   private byte[] T00X92_A6939Lb_rctc ;
   private boolean[] T00X92_n6939Lb_rctc ;
   private String[] T00X92_A6940Lb_rcp1 ;
   private boolean[] T00X92_n6940Lb_rcp1 ;
   private String[] T00X92_A6941Lb_rcp2 ;
   private boolean[] T00X92_n6941Lb_rcp2 ;
   private String[] T00X92_A6942Lb_rcp3 ;
   private boolean[] T00X92_n6942Lb_rcp3 ;
   private String[] T00X92_A6943Lb_rcp4 ;
   private boolean[] T00X92_n6943Lb_rcp4 ;
   private String[] T00X92_A6944Lb_rcp5 ;
   private boolean[] T00X92_n6944Lb_rcp5 ;
   private String[] T00X92_A6945Lb_rcp6 ;
   private boolean[] T00X92_n6945Lb_rcp6 ;
   private short[] T00X92_A6946Lb_rcpo1 ;
   private boolean[] T00X92_n6946Lb_rcpo1 ;
   private short[] T00X92_A6947Lb_rcpo2 ;
   private boolean[] T00X92_n6947Lb_rcpo2 ;
   private short[] T00X92_A6948Lb_rcpo3 ;
   private boolean[] T00X92_n6948Lb_rcpo3 ;
   private short[] T00X92_A6949Lb_rcpo4 ;
   private boolean[] T00X92_n6949Lb_rcpo4 ;
   private short[] T00X92_A6950Lb_rcpo5 ;
   private boolean[] T00X92_n6950Lb_rcpo5 ;
   private short[] T00X92_A6951Lb_rcpo6 ;
   private boolean[] T00X92_n6951Lb_rcpo6 ;
   private java.util.Date[] T00X92_A7009Lb_rcFecEt ;
   private boolean[] T00X92_n7009Lb_rcFecEt ;
   private java.util.Date[] T00X92_A7010Lb_rcFecEn ;
   private boolean[] T00X92_n7010Lb_rcFecEn ;
   private java.util.Date[] T00X92_A7011Lb_rcFecRe ;
   private boolean[] T00X92_n7011Lb_rcFecRe ;
   private String[] T00X92_A7012Lb_rcOpEnv ;
   private boolean[] T00X92_n7012Lb_rcOpEnv ;
   private String[] T00X92_A7013Lb_rcOpApr ;
   private boolean[] T00X92_n7013Lb_rcOpApr ;
   private String[] T00X92_A7014Lb_rcOpNap ;
   private boolean[] T00X92_n7014Lb_rcOpNap ;
   private java.util.Date[] T00X92_A7015Lb_rcFeNap ;
   private boolean[] T00X92_n7015Lb_rcFeNap ;
   private String[] T00X92_A8022Lb_rcProDe ;
   private boolean[] T00X92_n8022Lb_rcProDe ;
   private String[] T00X92_A396EmprCod ;
   private String[] T00X927_A396EmprCod ;
   private int[] T00X927_A252CliCod ;
   private int[] T00X927_A6930Lb_rclin ;
   private String[] T00X928_A407EmprNom ;
   private boolean[] T00X928_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tregcor__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tregcor__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tregcor__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tregcor__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tregcor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00X92", "SELECT Lb_rcobs, CliCod, Lb_rclin, Lb_rcnens, Lb_rcncar, Lb_rccorc, Lb_rcncorc, Lb_rccor, Lb_rcncor, Lb_rctc, Lb_rcp1, Lb_rcp2, Lb_rcp3, Lb_rcp4, Lb_rcp5, Lb_rcp6, Lb_rcpo1, Lb_rcpo2, Lb_rcpo3, Lb_rcpo4, Lb_rcpo5, Lb_rcpo6, Lb_rcFecEt, Lb_rcFecEn, Lb_rcFecRe, Lb_rcOpEnv, Lb_rcOpApr, Lb_rcOpNap, Lb_rcFeNap, Lb_rcProDe, EmprCod FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ? AND Lb_rclin = ?  FOR UPDATE OF Lb_rcnens, Lb_rcncar, Lb_rccorc, Lb_rcncorc, Lb_rccor, Lb_rcncor, Lb_rctc, Lb_rcp1, Lb_rcp2, Lb_rcp3, Lb_rcp4, Lb_rcp5, Lb_rcp6, Lb_rcpo1, Lb_rcpo2, Lb_rcpo3, Lb_rcpo4, Lb_rcpo5, Lb_rcpo6, Lb_rcobs, Lb_rcFecEt, Lb_rcFecEn, Lb_rcFecRe, Lb_rcOpEnv, Lb_rcOpApr, Lb_rcOpNap, Lb_rcFeNap, Lb_rcProDe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X93", "SELECT Lb_rcobs, CliCod, Lb_rclin, Lb_rcnens, Lb_rcncar, Lb_rccorc, Lb_rcncorc, Lb_rccor, Lb_rcncor, Lb_rctc, Lb_rcp1, Lb_rcp2, Lb_rcp3, Lb_rcp4, Lb_rcp5, Lb_rcp6, Lb_rcpo1, Lb_rcpo2, Lb_rcpo3, Lb_rcpo4, Lb_rcpo5, Lb_rcpo6, Lb_rcFecEt, Lb_rcFecEn, Lb_rcFecRe, Lb_rcOpEnv, Lb_rcOpApr, Lb_rcOpNap, Lb_rcFeNap, Lb_rcProDe, EmprCod FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ? AND Lb_rclin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X95", "SELECT COALESCE( T1.Lb_rcLastn, 0) AS Lb_rcLastn FROM (SELECT MAX(Lb_rcncor) AS Lb_rcLastn, EmprCod, CliCod FROM TXPREGCOR WHERE Lb_rcncor > 0 GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X96", "SELECT CliCod, CliNom, Lb_Linurc, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, Lb_Linurc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X97", "SELECT CliCod, CliNom, Lb_Linurc, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X98", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X910", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, T2.EmprNom, TM1.CliNom, TM1.Lb_Linurc, TM1.EmprCod, COALESCE( T3.Lb_rcLastn, 0) AS Lb_rcLastn FROM ((TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(Lb_rcncor) AS Lb_rcLastn, EmprCod, CliCod FROM TXPREGCOR WHERE Lb_rcncor > 0 GROUP BY EmprCod, CliCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X912", "SELECT COALESCE( T1.Lb_rcLastn, 0) AS Lb_rcLastn FROM (SELECT MAX(Lb_rcncor) AS Lb_rcLastn, EmprCod, CliCod FROM TXPREGCOR WHERE Lb_rcncor > 0 GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X913", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X914", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00X915", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00X916", "INSERT INTO TXPCLIENT(CliCod, CliNom, Lb_Linurc, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T00X917", "UPDATE TXPCLIENT SET CliNom=?, Lb_Linurc=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T00X918", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T00X920", "SELECT COALESCE( T1.Lb_rcLastn, 0) AS Lb_rcLastn FROM (SELECT MAX(Lb_rcncor) AS Lb_rcLastn, EmprCod, CliCod FROM TXPREGCOR WHERE Lb_rcncor > 0 GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X921", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X922", "SELECT Lb_rcobs, CliCod, Lb_rclin, Lb_rcnens, Lb_rcncar, Lb_rccorc, Lb_rcncorc, Lb_rccor, Lb_rcncor, Lb_rctc, Lb_rcp1, Lb_rcp2, Lb_rcp3, Lb_rcp4, Lb_rcp5, Lb_rcp6, Lb_rcpo1, Lb_rcpo2, Lb_rcpo3, Lb_rcpo4, Lb_rcpo5, Lb_rcpo6, Lb_rcFecEt, Lb_rcFecEn, Lb_rcFecRe, Lb_rcOpEnv, Lb_rcOpApr, Lb_rcOpNap, Lb_rcFeNap, Lb_rcProDe, EmprCod FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? and Lb_rclin = ? ORDER BY EmprCod, CliCod, Lb_rclin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X923", "SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ? AND Lb_rclin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00X924", "INSERT INTO TXPREGCOR(CliCod, Lb_rclin, Lb_rcnens, Lb_rcncar, Lb_rccorc, Lb_rcncorc, Lb_rccor, Lb_rcncor, Lb_rctc, Lb_rcp1, Lb_rcp2, Lb_rcp3, Lb_rcp4, Lb_rcp5, Lb_rcp6, Lb_rcpo1, Lb_rcpo2, Lb_rcpo3, Lb_rcpo4, Lb_rcpo5, Lb_rcpo6, Lb_rcobs, Lb_rcFecEt, Lb_rcFecEn, Lb_rcFecRe, Lb_rcOpEnv, Lb_rcOpApr, Lb_rcOpNap, Lb_rcFeNap, Lb_rcProDe, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPREGCOR")
         ,new UpdateCursor("T00X925", "UPDATE TXPREGCOR SET Lb_rcnens=?, Lb_rcncar=?, Lb_rccorc=?, Lb_rcncorc=?, Lb_rccor=?, Lb_rcncor=?, Lb_rctc=?, Lb_rcp1=?, Lb_rcp2=?, Lb_rcp3=?, Lb_rcp4=?, Lb_rcp5=?, Lb_rcp6=?, Lb_rcpo1=?, Lb_rcpo2=?, Lb_rcpo3=?, Lb_rcpo4=?, Lb_rcpo5=?, Lb_rcpo6=?, Lb_rcobs=?, Lb_rcFecEt=?, Lb_rcFecEn=?, Lb_rcFecRe=?, Lb_rcOpEnv=?, Lb_rcOpApr=?, Lb_rcOpNap=?, Lb_rcFeNap=?, Lb_rcProDe=?  WHERE EmprCod = ? AND CliCod = ? AND Lb_rclin = ?", GX_NOMASK, "TXPREGCOR")
         ,new UpdateCursor("T00X926", "DELETE FROM TXPREGCOR  WHERE EmprCod = ? AND CliCod = ? AND Lb_rclin = ?", GX_NOMASK, "TXPREGCOR")
         ,new ForEachCursor("T00X927", "SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, Lb_rclin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X928", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 100);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 100);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDate(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 100);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 100);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDate(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 100);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 100);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDate(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 30);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 13);
               }
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
                  stmt.setByte(9, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 4);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 4);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 4);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 4);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 4);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[27], 4);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(22, (String)parms[41]);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DATE );
               }
               else
               {
                  stmt.setDate(23, (java.util.Date)parms[43]);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DATE );
               }
               else
               {
                  stmt.setDate(24, (java.util.Date)parms[45]);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DATE );
               }
               else
               {
                  stmt.setDate(25, (java.util.Date)parms[47]);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[49], 100);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[51], 1);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[53], 100);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DATE );
               }
               else
               {
                  stmt.setDate(29, (java.util.Date)parms[55]);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[57], 1);
               }
               stmt.setString(31, (String)parms[58], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setString(3, (String)parms[5], 13);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
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
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 4);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 4);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 4);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 4);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 4);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(20, (String)parms[39]);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DATE );
               }
               else
               {
                  stmt.setDate(21, (java.util.Date)parms[41]);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DATE );
               }
               else
               {
                  stmt.setDate(22, (java.util.Date)parms[43]);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DATE );
               }
               else
               {
                  stmt.setDate(23, (java.util.Date)parms[45]);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 100);
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
                  stmt.setString(26, (String)parms[51], 100);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DATE );
               }
               else
               {
                  stmt.setDate(27, (java.util.Date)parms[53]);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 1);
               }
               stmt.setString(29, (String)parms[56], 3);
               stmt.setInt(30, ((Number) parms[57]).intValue());
               stmt.setInt(31, ((Number) parms[58]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

