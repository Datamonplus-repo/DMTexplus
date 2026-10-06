package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tplaeta_impl extends GXDataArea
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
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A602MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1142MaqFCod = httpContext.GetPar( "MaqFCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A1142MaqFCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Planificacion Etal", ""), (short)(0)) ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
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

   public tplaeta_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tplaeta_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tplaeta_impl.class ));
   }

   public tplaeta_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPLAETA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "MaqFCod", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqFCod_Internalname, GXutil.rtrim( A1142MaqFCod), GXutil.rtrim( localUtil.format( A1142MaqFCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqFCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqFCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "MaqFDsc", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqFDsc_Internalname, GXutil.rtrim( A1143MaqFDsc), GXutil.rtrim( localUtil.format( A1143MaqFDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqFDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqFDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "MaqFFind", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqFFind_Internalname, GXutil.rtrim( A1144MaqFFind), GXutil.rtrim( localUtil.format( A1144MaqFFind, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqFFind_Jsonclick, 0, "", "", "", "", "", 1, edtMaqFFind_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "MaqDscFind", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDscFind_Internalname, GXutil.rtrim( A1145MaqDscFind), GXutil.rtrim( localUtil.format( A1145MaqDscFind, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDscFind_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDscFind_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAETA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1572 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1572 = (short)(1) ;
            scanStart1FJ1572( ) ;
            while ( RcdFound1572 != 0 )
            {
               init_level_properties1572( ) ;
               getByPrimaryKey1FJ1572( ) ;
               addRow1FJ1572( ) ;
               scanNext1FJ1572( ) ;
            }
            scanEnd1FJ1572( ) ;
            nBlankRcdCount1572 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FJ1572( ) ;
         standaloneModal1FJ1572( ) ;
         sMode1572 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1FJ1572( ) ;
            edtavnRcdDeleted_1572_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1572_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1572_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1572_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPlaEtaOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAETAORD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPlaEtaOrdA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAETAORDA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrdA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrdA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSIT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPlaEtaFecT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAETAFECT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaFecT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaFecT_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPlaEtaObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAETAOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1572 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FJ1572( ) ;
            }
            sendRow1FJ1572( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1572 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1572 = (short)(5) ;
         nRcdExists_1572 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FJ1572( ) ;
            while ( RcdFound1572 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601572( ) ;
               init_level_properties1572( ) ;
               standaloneNotModal1FJ1572( ) ;
               getByPrimaryKey1FJ1572( ) ;
               standaloneModal1FJ1572( ) ;
               addRow1FJ1572( ) ;
               scanNext1FJ1572( ) ;
            }
            scanEnd1FJ1572( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1572 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601572( ) ;
      initAll1FJ1572( ) ;
      init_level_properties1572( ) ;
      nRcdExists_1572 = (short)(0) ;
      nIsMod_1572 = (short)(0) ;
      nRcdDeleted_1572 = (short)(0) ;
      nBlankRcdCount1572 = (short)(nBlankRcdUsr1572+nBlankRcdCount1572) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1572 > 0 )
      {
         standaloneNotModal1FJ1572( ) ;
         standaloneModal1FJ1572( ) ;
         addRow1FJ1572( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPlaEtaOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1572 = (short)(nBlankRcdCount1572-1) ;
      }
      Gx_mode = sMode1572 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAETA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPLAETA.htm");
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
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z1142MaqFCod = httpContext.cgiGet( "Z1142MaqFCod") ;
         Z1143MaqFDsc = httpContext.cgiGet( "Z1143MaqFDsc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A1142MaqFCod = httpContext.cgiGet( edtMaqFCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A1143MaqFDsc = httpContext.cgiGet( edtMaqFDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", A1143MaqFDsc);
         A1144MaqFFind = httpContext.cgiGet( edtMaqFFind_Internalname) ;
         n1144MaqFFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
         A1145MaqDscFind = httpContext.cgiGet( edtMaqDscFind_Internalname) ;
         n1145MaqDscFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A1142MaqFCod = httpContext.GetPar( "MaqFCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
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
            initAll1FJ152( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1572_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1572_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1FJ152( ) ;
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

   public void confirm_1FJ0( )
   {
      beforeValidate1FJ152( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FJ152( ) ;
         }
         else
         {
            checkExtendedTable1FJ152( ) ;
            if ( AnyError == 0 )
            {
               zm1FJ152( 2) ;
               zm1FJ152( 3) ;
               zm1FJ152( 4) ;
            }
            closeExtendedTableCursors1FJ152( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode152 = Gx_mode ;
         confirm_1FJ1572( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode152 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode152 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FJ0( ) ;
      }
   }

   public void confirm_1FJ1572( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1FJ1572( ) ;
         if ( ( nRcdExists_1572 != 0 ) || ( nIsMod_1572 != 0 ) )
         {
            getKey1FJ1572( ) ;
            if ( ( nRcdExists_1572 == 0 ) && ( nRcdDeleted_1572 == 0 ) )
            {
               if ( RcdFound1572 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FJ1572( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FJ1572( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1FJ1572( 6) ;
                        zm1FJ1572( 7) ;
                     }
                     closeExtendedTableCursors1FJ1572( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PLAETAORD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPlaEtaOrd_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1572 != 0 )
               {
                  if ( nRcdDeleted_1572 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FJ1572( ) ;
                     load1FJ1572( ) ;
                     beforeValidate1FJ1572( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FJ1572( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1572 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FJ1572( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FJ1572( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1FJ1572( 6) ;
                              zm1FJ1572( 7) ;
                           }
                           closeExtendedTableCursors1FJ1572( ) ;
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
                  if ( nRcdDeleted_1572 == 0 )
                  {
                     GXCCtl = "PLAETAORD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPlaEtaOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1572_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaEtaOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A3068PlaEtaOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaEtaOrdA_Internalname, GXutil.ltrim( localUtil.ntoc( A3069PlaEtaOrdA, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaEtaFecT_Internalname, localUtil.format(A3070PlaEtaFecT, "99/99/99")) ;
         httpContext.changePostValue( edtPlaEtaObs_Internalname, GXutil.rtrim( A3071PlaEtaObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3068PlaEtaOrd_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3068PlaEtaOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3069PlaEtaOrdA_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3069PlaEtaOrdA, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_60_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z3070PlaEtaFecT_"+sGXsfl_60_idx, localUtil.dtoc( Z3070PlaEtaFecT, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3071PlaEtaObs_"+sGXsfl_60_idx, GXutil.rtrim( Z3071PlaEtaObs)) ;
         httpContext.changePostValue( "nRcdDeleted_1572_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1572_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1572_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1572 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1572_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1572_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAETAORD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAETAORDA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaOrdA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSIT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAETAFECT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaFecT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAETAOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FJ0( )
   {
   }

   public void zm1FJ152( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1143MaqFDsc = T01FJ7_A1143MaqFDsc[0] ;
         }
         else
         {
            Z1143MaqFDsc = A1143MaqFDsc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z1142MaqFCod = A1142MaqFCod ;
         Z1143MaqFDsc = A1143MaqFDsc ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z606MaqDsc = A606MaqDsc ;
         Z1144MaqFFind = A1144MaqFFind ;
         Z1145MaqDscFind = A1145MaqDscFind ;
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

   public void load1FJ152( )
   {
      /* Using cursor T01FJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound152 = (short)(1) ;
         A407EmprNom = T01FJ11_A407EmprNom[0] ;
         n407EmprNom = T01FJ11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A606MaqDsc = T01FJ11_A606MaqDsc[0] ;
         n606MaqDsc = T01FJ11_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A1143MaqFDsc = T01FJ11_A1143MaqFDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", A1143MaqFDsc);
         A1144MaqFFind = T01FJ11_A1144MaqFFind[0] ;
         n1144MaqFFind = T01FJ11_n1144MaqFFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
         A1145MaqDscFind = T01FJ11_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T01FJ11_n1145MaqDscFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
         zm1FJ152( -1) ;
      }
      pr_default.close(9);
      onLoadActions1FJ152( ) ;
   }

   public void onLoadActions1FJ152( )
   {
   }

   public void checkExtendedTable1FJ152( )
   {
      nIsDirty_152 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01FJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FJ8_A407EmprNom[0] ;
      n407EmprNom = T01FJ8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T01FJ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01FJ9_A606MaqDsc[0] ;
      n606MaqDsc = T01FJ9_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(7);
      /* Using cursor T01FJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A1144MaqFFind = T01FJ10_A1144MaqFFind[0] ;
         n1144MaqFFind = T01FJ10_n1144MaqFFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
         A1145MaqDscFind = T01FJ10_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T01FJ10_n1145MaqDscFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
      }
      else
      {
         nIsDirty_152 = (short)(1) ;
         A1145MaqDscFind = "" ;
         n1145MaqDscFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
         nIsDirty_152 = (short)(1) ;
         A1144MaqFFind = "xxxxxxxx" ;
         n1144MaqFFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
      }
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1FJ152( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01FJ12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FJ12_A407EmprNom[0] ;
      n407EmprNom = T01FJ12_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_3( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T01FJ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01FJ13_A606MaqDsc[0] ;
      n606MaqDsc = T01FJ13_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_4( String A396EmprCod ,
                         String A1142MaqFCod )
   {
      /* Using cursor T01FJ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A1144MaqFFind = T01FJ14_A1144MaqFFind[0] ;
         n1144MaqFFind = T01FJ14_n1144MaqFFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
         A1145MaqDscFind = T01FJ14_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T01FJ14_n1145MaqDscFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
      }
      else
      {
         A1145MaqDscFind = "" ;
         n1145MaqDscFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
         A1144MaqFFind = "xxxxxxxx" ;
         n1144MaqFFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1144MaqFFind))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1145MaqDscFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey1FJ152( )
   {
      /* Using cursor T01FJ15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound152 = (short)(1) ;
      }
      else
      {
         RcdFound152 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm1FJ152( 1) ;
         RcdFound152 = (short)(1) ;
         A1142MaqFCod = T01FJ7_A1142MaqFCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
         A1143MaqFDsc = T01FJ7_A1143MaqFDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", A1143MaqFDsc);
         A396EmprCod = T01FJ7_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01FJ7_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z1142MaqFCod = A1142MaqFCod ;
         sMode152 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FJ152( ) ;
         if ( AnyError == 1 )
         {
            RcdFound152 = (short)(0) ;
            initializeNonKey1FJ152( ) ;
         }
         Gx_mode = sMode152 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound152 = (short)(0) ;
         initializeNonKey1FJ152( ) ;
         sMode152 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode152 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1FJ152( ) ;
      if ( RcdFound152 == 0 )
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
      RcdFound152 = (short)(0) ;
      /* Using cursor T01FJ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, A602MaqCod, A602MaqCod, A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01FJ16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01FJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FJ16_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01FJ16_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01FJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FJ16_A1142MaqFCod[0], A1142MaqFCod) < 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01FJ16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01FJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FJ16_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01FJ16_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01FJ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FJ16_A1142MaqFCod[0], A1142MaqFCod) > 0 ) ) )
         {
            A396EmprCod = T01FJ16_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01FJ16_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A1142MaqFCod = T01FJ16_A1142MaqFCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
            RcdFound152 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound152 = (short)(0) ;
      /* Using cursor T01FJ17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, A602MaqCod, A602MaqCod, A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01FJ17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01FJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FJ17_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01FJ17_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01FJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FJ17_A1142MaqFCod[0], A1142MaqFCod) > 0 ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01FJ17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01FJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FJ17_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01FJ17_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01FJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FJ17_A1142MaqFCod[0], A1142MaqFCod) < 0 ) ) )
         {
            A396EmprCod = T01FJ17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01FJ17_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A1142MaqFCod = T01FJ17_A1142MaqFCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
            RcdFound152 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FJ152( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FJ152( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound152 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( GXutil.strcmp(A1142MaqFCod, Z1142MaqFCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A602MaqCod = Z602MaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A1142MaqFCod = Z1142MaqFCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
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
               update1FJ152( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( GXutil.strcmp(A1142MaqFCod, Z1142MaqFCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FJ152( ) ;
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
                  insert1FJ152( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( GXutil.strcmp(A1142MaqFCod, Z1142MaqFCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = Z602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A1142MaqFCod = Z1142MaqFCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
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
      getKey1FJ152( ) ;
      if ( RcdFound152 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( GXutil.strcmp(A1142MaqFCod, Z1142MaqFCod) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = Z602MaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A1142MaqFCod = Z1142MaqFCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( GXutil.strcmp(A1142MaqFCod, Z1142MaqFCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tplaeta");
      GX_FocusControl = edtMaqFDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FJ0( ) ;
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
      if ( RcdFound152 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqFDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FJ152( ) ;
      if ( RcdFound152 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqFDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FJ152( ) ;
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
      if ( RcdFound152 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqFDsc_Internalname ;
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
      if ( RcdFound152 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqFDsc_Internalname ;
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
      scanStart1FJ152( ) ;
      if ( RcdFound152 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound152 != 0 )
         {
            scanNext1FJ152( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqFDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FJ152( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FJ152( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FJ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z1143MaqFDsc, T01FJ6_A1143MaqFDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1143MaqFDsc, T01FJ6_A1143MaqFDsc[0]) != 0 )
            {
               GXutil.writeLogln("tplaeta:[seudo value changed for attri]"+"MaqFDsc");
               GXutil.writeLogRaw("Old: ",Z1143MaqFDsc);
               GXutil.writeLogRaw("Current: ",T01FJ6_A1143MaqFDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FJ152( )
   {
      beforeValidate1FJ152( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FJ152( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FJ152( 0) ;
         checkOptimisticConcurrency1FJ152( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FJ152( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FJ152( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FJ18 */
                  pr_default.execute(16, new Object[] {A1142MaqFCod, A1143MaqFDsc, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
                  if ( (pr_default.getStatus(16) == 1) )
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
                        processLevel1FJ152( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FJ0( ) ;
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
            load1FJ152( ) ;
         }
         endLevel1FJ152( ) ;
      }
      closeExtendedTableCursors1FJ152( ) ;
   }

   public void update1FJ152( )
   {
      beforeValidate1FJ152( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FJ152( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FJ152( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FJ152( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FJ152( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FJ19 */
                  pr_default.execute(17, new Object[] {A1143MaqFDsc, A396EmprCod, A602MaqCod, A1142MaqFCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FJ152( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FJ152( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FJ0( ) ;
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
         endLevel1FJ152( ) ;
      }
      closeExtendedTableCursors1FJ152( ) ;
   }

   public void deferredUpdate1FJ152( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FJ152( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FJ152( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FJ152( ) ;
         afterConfirm1FJ152( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FJ152( ) ;
            if ( AnyError == 0 )
            {
               scanStart1FJ1572( ) ;
               while ( RcdFound1572 != 0 )
               {
                  getByPrimaryKey1FJ1572( ) ;
                  delete1FJ1572( ) ;
                  scanNext1FJ1572( ) ;
               }
               scanEnd1FJ1572( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FJ20 */
                  pr_default.execute(18, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound152 == 0 )
                        {
                           initAll1FJ152( ) ;
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
                        resetCaption1FJ0( ) ;
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
      sMode152 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FJ152( ) ;
      Gx_mode = sMode152 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FJ152( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FJ21 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         A407EmprNom = T01FJ21_A407EmprNom[0] ;
         n407EmprNom = T01FJ21_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(19);
         /* Using cursor T01FJ22 */
         pr_default.execute(20, new Object[] {A396EmprCod, A602MaqCod});
         A606MaqDsc = T01FJ22_A606MaqDsc[0] ;
         n606MaqDsc = T01FJ22_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         pr_default.close(20);
         /* Using cursor T01FJ23 */
         pr_default.execute(21, new Object[] {A396EmprCod, A1142MaqFCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            A1144MaqFFind = T01FJ23_A1144MaqFFind[0] ;
            n1144MaqFFind = T01FJ23_n1144MaqFFind[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
            A1145MaqDscFind = T01FJ23_A1145MaqDscFind[0] ;
            n1145MaqDscFind = T01FJ23_n1145MaqDscFind[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
         }
         else
         {
            A1145MaqDscFind = "" ;
            n1145MaqDscFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
            A1144MaqFFind = "xxxxxxxx" ;
            n1144MaqFFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1FJ1572( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1FJ1572( ) ;
         if ( ( nRcdExists_1572 != 0 ) || ( nIsMod_1572 != 0 ) )
         {
            standaloneNotModal1FJ1572( ) ;
            getKey1FJ1572( ) ;
            if ( ( nRcdExists_1572 == 0 ) && ( nRcdDeleted_1572 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FJ1572( ) ;
            }
            else
            {
               if ( RcdFound1572 != 0 )
               {
                  if ( ( nRcdDeleted_1572 != 0 ) && ( nRcdExists_1572 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FJ1572( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1572 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FJ1572( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1572 == 0 )
                  {
                     GXCCtl = "PLAETAORD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPlaEtaOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1572_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaEtaOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A3068PlaEtaOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaEtaOrdA_Internalname, GXutil.ltrim( localUtil.ntoc( A3069PlaEtaOrdA, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaEtaFecT_Internalname, localUtil.format(A3070PlaEtaFecT, "99/99/99")) ;
         httpContext.changePostValue( edtPlaEtaObs_Internalname, GXutil.rtrim( A3071PlaEtaObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3068PlaEtaOrd_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3068PlaEtaOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3069PlaEtaOrdA_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3069PlaEtaOrdA, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_60_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z3070PlaEtaFecT_"+sGXsfl_60_idx, localUtil.dtoc( Z3070PlaEtaFecT, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3071PlaEtaObs_"+sGXsfl_60_idx, GXutil.rtrim( Z3071PlaEtaObs)) ;
         httpContext.changePostValue( "nRcdDeleted_1572_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1572_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1572_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1572 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1572_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1572_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAETAORD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAETAORDA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaOrdA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSIT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAETAFECT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaFecT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAETAOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FJ1572( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1572 = (short)(0) ;
      nIsMod_1572 = (short)(0) ;
      nRcdDeleted_1572 = (short)(0) ;
   }

   public void processLevel1FJ152( )
   {
      /* Save parent mode. */
      sMode152 = Gx_mode ;
      processNestedLevel1FJ1572( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode152 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FJ152( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FJ152( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tplaeta");
         if ( AnyError == 0 )
         {
            confirmValues1FJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tplaeta");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FJ152( )
   {
      /* Using cursor T01FJ24 */
      pr_default.execute(22);
      RcdFound152 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound152 = (short)(1) ;
         A396EmprCod = T01FJ24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01FJ24_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A1142MaqFCod = T01FJ24_A1142MaqFCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FJ152( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound152 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound152 = (short)(1) ;
         A396EmprCod = T01FJ24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01FJ24_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A1142MaqFCod = T01FJ24_A1142MaqFCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
      }
   }

   public void scanEnd1FJ152( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1FJ152( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FJ152( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FJ152( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FJ152( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FJ152( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FJ152( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FJ152( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqFCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqFCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtMaqFDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqFDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFDsc_Enabled), 5, 0), true);
      edtMaqFFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqFFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFFind_Enabled), 5, 0), true);
      edtMaqDscFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDscFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDscFind_Enabled), 5, 0), true);
   }

   public void zm1FJ1572( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3070PlaEtaFecT = T01FJ3_A3070PlaEtaFecT[0] ;
            Z3071PlaEtaObs = T01FJ3_A3071PlaEtaObs[0] ;
         }
         else
         {
            Z3070PlaEtaFecT = A3070PlaEtaFecT ;
            Z3071PlaEtaObs = A3071PlaEtaObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z602MaqCod = A602MaqCod ;
         Z3068PlaEtaOrd = A3068PlaEtaOrd ;
         Z3069PlaEtaOrdA = A3069PlaEtaOrdA ;
         Z3070PlaEtaFecT = A3070PlaEtaFecT ;
         Z3071PlaEtaObs = A3071PlaEtaObs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1142MaqFCod = A1142MaqFCod ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z213BarSit = A213BarSit ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal1FJ1572( )
   {
   }

   public void standaloneModal1FJ1572( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPlaEtaOrd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtPlaEtaOrd_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPlaEtaOrdA_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrdA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrdA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtPlaEtaOrdA_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrdA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrdA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1FJ1572( )
   {
      /* Using cursor T01FJ25 */
      pr_default.execute(23, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod, Short.valueOf(A3068PlaEtaOrd), Byte.valueOf(A3069PlaEtaOrdA), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1572 = (short)(1) ;
         A279CliNom = T01FJ25_A279CliNom[0] ;
         A212BarSer = T01FJ25_A212BarSer[0] ;
         A135BarColNom = T01FJ25_A135BarColNom[0] ;
         A136BarColNum = T01FJ25_A136BarColNum[0] ;
         A213BarSit = T01FJ25_A213BarSit[0] ;
         A3070PlaEtaFecT = T01FJ25_A3070PlaEtaFecT[0] ;
         n3070PlaEtaFecT = T01FJ25_n3070PlaEtaFecT[0] ;
         A3071PlaEtaObs = T01FJ25_A3071PlaEtaObs[0] ;
         n3071PlaEtaObs = T01FJ25_n3071PlaEtaObs[0] ;
         A252CliCod = T01FJ25_A252CliCod[0] ;
         n252CliCod = T01FJ25_n252CliCod[0] ;
         zm1FJ1572( -5) ;
      }
      pr_default.close(23);
      onLoadActions1FJ1572( ) ;
   }

   public void onLoadActions1FJ1572( )
   {
   }

   public void checkExtendedTable1FJ1572( )
   {
      nIsDirty_1572 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1FJ1572( ) ;
      /* Using cursor T01FJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T01FJ4_A212BarSer[0] ;
      A135BarColNom = T01FJ4_A135BarColNom[0] ;
      A136BarColNum = T01FJ4_A136BarColNum[0] ;
      A213BarSit = T01FJ4_A213BarSit[0] ;
      A252CliCod = T01FJ4_A252CliCod[0] ;
      n252CliCod = T01FJ4_n252CliCod[0] ;
      pr_default.close(2);
      /* Using cursor T01FJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            GXCCtl = "CLICOD_" + sGXsfl_60_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T01FJ5_A279CliNom[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1FJ1572( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1FJ1572( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01FJ26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T01FJ26_A212BarSer[0] ;
      A135BarColNom = T01FJ26_A135BarColNom[0] ;
      A136BarColNum = T01FJ26_A136BarColNum[0] ;
      A213BarSit = T01FJ26_A213BarSit[0] ;
      A252CliCod = T01FJ26_A252CliCod[0] ;
      n252CliCod = T01FJ26_n252CliCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void gxload_7( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01FJ27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            GXCCtl = "CLICOD_" + sGXsfl_60_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T01FJ27_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKey1FJ1572( )
   {
      /* Using cursor T01FJ28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod, Short.valueOf(A3068PlaEtaOrd), Byte.valueOf(A3069PlaEtaOrdA), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1572 = (short)(1) ;
      }
      else
      {
         RcdFound1572 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey1FJ1572( )
   {
      /* Using cursor T01FJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod, Short.valueOf(A3068PlaEtaOrd), Byte.valueOf(A3069PlaEtaOrdA), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1FJ1572( 5) ;
         RcdFound1572 = (short)(1) ;
         initializeNonKey1FJ1572( ) ;
         A3068PlaEtaOrd = T01FJ3_A3068PlaEtaOrd[0] ;
         A3069PlaEtaOrdA = T01FJ3_A3069PlaEtaOrdA[0] ;
         A3070PlaEtaFecT = T01FJ3_A3070PlaEtaFecT[0] ;
         n3070PlaEtaFecT = T01FJ3_n3070PlaEtaFecT[0] ;
         A3071PlaEtaObs = T01FJ3_A3071PlaEtaObs[0] ;
         n3071PlaEtaObs = T01FJ3_n3071PlaEtaObs[0] ;
         A129BarCod = T01FJ3_A129BarCod[0] ;
         A132BarCodReo = T01FJ3_A132BarCodReo[0] ;
         A130BarCodPar = T01FJ3_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z1142MaqFCod = A1142MaqFCod ;
         Z3068PlaEtaOrd = A3068PlaEtaOrd ;
         Z3069PlaEtaOrdA = A3069PlaEtaOrdA ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode1572 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FJ1572( ) ;
         load1FJ1572( ) ;
         Gx_mode = sMode1572 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1572 = (short)(0) ;
         initializeNonKey1FJ1572( ) ;
         sMode1572 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FJ1572( ) ;
         Gx_mode = sMode1572 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FJ1572( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FJ1572( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod, Short.valueOf(A3068PlaEtaOrd), Byte.valueOf(A3069PlaEtaOrdA), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLAETA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z3070PlaEtaFecT), GXutil.resetTime(T01FJ2_A3070PlaEtaFecT[0])) ) || ( GXutil.strcmp(Z3071PlaEtaObs, T01FJ2_A3071PlaEtaObs[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3070PlaEtaFecT), GXutil.resetTime(T01FJ2_A3070PlaEtaFecT[0])) ) )
            {
               GXutil.writeLogln("tplaeta:[seudo value changed for attri]"+"PlaEtaFecT");
               GXutil.writeLogRaw("Old: ",Z3070PlaEtaFecT);
               GXutil.writeLogRaw("Current: ",T01FJ2_A3070PlaEtaFecT[0]);
            }
            if ( GXutil.strcmp(Z3071PlaEtaObs, T01FJ2_A3071PlaEtaObs[0]) != 0 )
            {
               GXutil.writeLogln("tplaeta:[seudo value changed for attri]"+"PlaEtaObs");
               GXutil.writeLogRaw("Old: ",Z3071PlaEtaObs);
               GXutil.writeLogRaw("Current: ",T01FJ2_A3071PlaEtaObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPLAETA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FJ1572( )
   {
      beforeValidate1FJ1572( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FJ1572( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FJ1572( 0) ;
         checkOptimisticConcurrency1FJ1572( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FJ1572( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FJ1572( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FJ29 */
                  pr_default.execute(27, new Object[] {A602MaqCod, Short.valueOf(A3068PlaEtaOrd), Byte.valueOf(A3069PlaEtaOrdA), Boolean.valueOf(n3070PlaEtaFecT), A3070PlaEtaFecT, Boolean.valueOf(n3071PlaEtaObs), A3071PlaEtaObs, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A1142MaqFCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLAETA");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load1FJ1572( ) ;
         }
         endLevel1FJ1572( ) ;
      }
      closeExtendedTableCursors1FJ1572( ) ;
   }

   public void update1FJ1572( )
   {
      beforeValidate1FJ1572( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FJ1572( ) ;
      }
      if ( ( nIsMod_1572 != 0 ) || ( nIsDirty_1572 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FJ1572( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FJ1572( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FJ1572( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FJ30 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n3070PlaEtaFecT), A3070PlaEtaFecT, Boolean.valueOf(n3071PlaEtaObs), A3071PlaEtaObs, A396EmprCod, A602MaqCod, A1142MaqFCod, Short.valueOf(A3068PlaEtaOrd), Byte.valueOf(A3069PlaEtaOrdA), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLAETA");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLAETA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FJ1572( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FJ1572( ) ;
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
            endLevel1FJ1572( ) ;
         }
      }
      closeExtendedTableCursors1FJ1572( ) ;
   }

   public void deferredUpdate1FJ1572( )
   {
   }

   public void delete1FJ1572( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FJ1572( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FJ1572( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FJ1572( ) ;
         afterConfirm1FJ1572( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FJ1572( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FJ31 */
               pr_default.execute(29, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod, Short.valueOf(A3068PlaEtaOrd), Byte.valueOf(A3069PlaEtaOrdA), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLAETA");
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
      sMode1572 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FJ1572( ) ;
      Gx_mode = sMode1572 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FJ1572( )
   {
      standaloneModal1FJ1572( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FJ32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A212BarSer = T01FJ32_A212BarSer[0] ;
         A135BarColNom = T01FJ32_A135BarColNom[0] ;
         A136BarColNum = T01FJ32_A136BarColNum[0] ;
         A213BarSit = T01FJ32_A213BarSit[0] ;
         A252CliCod = T01FJ32_A252CliCod[0] ;
         n252CliCod = T01FJ32_n252CliCod[0] ;
         pr_default.close(30);
         /* Using cursor T01FJ33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01FJ33_A279CliNom[0] ;
         pr_default.close(31);
      }
   }

   public void endLevel1FJ1572( )
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

   public void scanStart1FJ1572( )
   {
      /* Scan By routine */
      /* Using cursor T01FJ34 */
      pr_default.execute(32, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod});
      RcdFound1572 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1572 = (short)(1) ;
         A3068PlaEtaOrd = T01FJ34_A3068PlaEtaOrd[0] ;
         A3069PlaEtaOrdA = T01FJ34_A3069PlaEtaOrdA[0] ;
         A129BarCod = T01FJ34_A129BarCod[0] ;
         A132BarCodReo = T01FJ34_A132BarCodReo[0] ;
         A130BarCodPar = T01FJ34_A130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FJ1572( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound1572 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1572 = (short)(1) ;
         A3068PlaEtaOrd = T01FJ34_A3068PlaEtaOrd[0] ;
         A3069PlaEtaOrdA = T01FJ34_A3069PlaEtaOrdA[0] ;
         A129BarCod = T01FJ34_A129BarCod[0] ;
         A132BarCodReo = T01FJ34_A132BarCodReo[0] ;
         A130BarCodPar = T01FJ34_A130BarCodPar[0] ;
      }
   }

   public void scanEnd1FJ1572( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1FJ1572( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FJ1572( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FJ1572( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FJ1572( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FJ1572( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FJ1572( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FJ1572( )
   {
      edtPlaEtaOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPlaEtaOrdA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrdA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrdA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPlaEtaFecT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaFecT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaFecT_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPlaEtaObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1FJ1572( )
   {
   }

   public void send_integrity_lvl_hashes1FJ152( )
   {
   }

   public void subsflControlProps_601572( )
   {
      edtavnRcdDeleted_1572_Internalname = "vNRCDDELETED_1572_"+sGXsfl_60_idx ;
      edtPlaEtaOrd_Internalname = "PLAETAORD_"+sGXsfl_60_idx ;
      edtPlaEtaOrdA_Internalname = "PLAETAORDA_"+sGXsfl_60_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_60_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_60_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_60_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_60_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_60_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_60_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_60_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_60_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_60_idx ;
      edtPlaEtaFecT_Internalname = "PLAETAFECT_"+sGXsfl_60_idx ;
      edtPlaEtaObs_Internalname = "PLAETAOBS_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601572( )
   {
      edtavnRcdDeleted_1572_Internalname = "vNRCDDELETED_1572_"+sGXsfl_60_fel_idx ;
      edtPlaEtaOrd_Internalname = "PLAETAORD_"+sGXsfl_60_fel_idx ;
      edtPlaEtaOrdA_Internalname = "PLAETAORDA_"+sGXsfl_60_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_60_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_60_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_60_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_60_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_60_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_60_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_60_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_60_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_60_fel_idx ;
      edtPlaEtaFecT_Internalname = "PLAETAFECT_"+sGXsfl_60_fel_idx ;
      edtPlaEtaObs_Internalname = "PLAETAOBS_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1FJ1572( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601572( ) ;
      sendRow1FJ1572( ) ;
   }

   public void sendRow1FJ1572( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1572_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1572_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1572_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1572), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1572), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1572_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1572_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1572_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaEtaOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A3068PlaEtaOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3068PlaEtaOrd), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaEtaOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaEtaOrd_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1572_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaEtaOrdA_Internalname,GXutil.ltrim( localUtil.ntoc( A3069PlaEtaOrdA, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3069PlaEtaOrdA), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaEtaOrdA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaEtaOrdA_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1572_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1572_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1572_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1572_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaEtaFecT_Internalname,localUtil.format(A3070PlaEtaFecT, "99/99/99"),localUtil.format( A3070PlaEtaFecT, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaEtaFecT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaEtaFecT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1572_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaEtaObs_Internalname,GXutil.rtrim( A3071PlaEtaObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaEtaObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaEtaObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FJ1572( ) ;
      GXCCtl = "Z3068PlaEtaOrd_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3068PlaEtaOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3069PlaEtaOrdA_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3069PlaEtaOrdA, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z129BarCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "Z3070PlaEtaFecT_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z3070PlaEtaFecT, 0, "/"));
      GXCCtl = "Z3071PlaEtaObs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3071PlaEtaObs));
      GXCCtl = "nRcdDeleted_1572_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1572_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1572_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1572, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1572_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1572_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAETAORD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAETAORDA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaOrdA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAETAFECT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaFecT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAETAOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FJ1572( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601572( ) ;
      edtavnRcdDeleted_1572_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1572_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaEtaOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAETAORD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaEtaOrdA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAETAORDA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSIT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaEtaFecT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAETAFECT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaEtaObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAETAOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1572_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1572_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1572");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1572_Internalname ;
         wbErr = true ;
         nRcdDeleted_1572 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1572 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1572_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaEtaOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaEtaOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLAETAORD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaEtaOrd_Internalname ;
         wbErr = true ;
         A3068PlaEtaOrd = (short)(0) ;
      }
      else
      {
         A3068PlaEtaOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaEtaOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaEtaOrdA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaEtaOrdA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PLAETAORDA_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaEtaOrdA_Internalname ;
         wbErr = true ;
         A3069PlaEtaOrdA = (byte)(0) ;
      }
      else
      {
         A3069PlaEtaOrdA = (byte)(localUtil.ctol( httpContext.cgiGet( edtPlaEtaOrdA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         wbErr = true ;
         A129BarCod = 0 ;
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         wbErr = true ;
         A132BarCodReo = (byte)(0) ;
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
      A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n252CliCod = false ;
      A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
      A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
      A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
      A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtPlaEtaFecT_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "PLAETAFECT_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaEtaFecT_Internalname ;
         wbErr = true ;
         A3070PlaEtaFecT = GXutil.nullDate() ;
         n3070PlaEtaFecT = false ;
      }
      else
      {
         A3070PlaEtaFecT = localUtil.ctod( httpContext.cgiGet( edtPlaEtaFecT_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n3070PlaEtaFecT = false ;
      }
      A3071PlaEtaObs = httpContext.cgiGet( edtPlaEtaObs_Internalname) ;
      n3071PlaEtaObs = false ;
      GXCCtl = "Z3068PlaEtaOrd_" + sGXsfl_60_idx ;
      Z3068PlaEtaOrd = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3069PlaEtaOrdA_" + sGXsfl_60_idx ;
      Z3069PlaEtaOrdA = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_60_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_60_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_60_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3070PlaEtaFecT_" + sGXsfl_60_idx ;
      Z3070PlaEtaFecT = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z3071PlaEtaObs_" + sGXsfl_60_idx ;
      Z3071PlaEtaObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1572_" + sGXsfl_60_idx ;
      nRcdDeleted_1572 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1572_" + sGXsfl_60_idx ;
      nRcdExists_1572 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1572_" + sGXsfl_60_idx ;
      nIsMod_1572 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarCodPar_Enabled = edtBarCodPar_Enabled ;
      defedtBarCodReo_Enabled = edtBarCodReo_Enabled ;
      defedtBarCod_Enabled = edtBarCod_Enabled ;
      defedtPlaEtaOrdA_Enabled = edtPlaEtaOrdA_Enabled ;
      defedtPlaEtaOrd_Enabled = edtPlaEtaOrd_Enabled ;
   }

   public void confirmValues1FJ0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601572( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601572( ) ;
         httpContext.changePostValue( "Z3068PlaEtaOrd_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3068PlaEtaOrd_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3068PlaEtaOrd_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3069PlaEtaOrdA_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3069PlaEtaOrdA_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3069PlaEtaOrdA_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3070PlaEtaFecT_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3070PlaEtaFecT_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3070PlaEtaFecT_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3071PlaEtaObs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3071PlaEtaObs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3071PlaEtaObs_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tplaeta", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1142MaqFCod", GXutil.rtrim( Z1142MaqFCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1143MaqFDsc", GXutil.rtrim( Z1143MaqFDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tplaeta", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPLAETA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Planificacion Etal", "") ;
   }

   public void initializeNonKey1FJ152( )
   {
      A1144MaqFFind = "" ;
      n1144MaqFFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
      A1145MaqDscFind = "" ;
      n1145MaqDscFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A1143MaqFDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", A1143MaqFDsc);
      Z1143MaqFDsc = "" ;
   }

   public void initAll1FJ152( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A1142MaqFCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1142MaqFCod", A1142MaqFCod);
      initializeNonKey1FJ152( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FJ1572( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A136BarColNum = 0 ;
      A213BarSit = (byte)(0) ;
      A3070PlaEtaFecT = GXutil.nullDate() ;
      n3070PlaEtaFecT = false ;
      A3071PlaEtaObs = "" ;
      n3071PlaEtaObs = false ;
      Z3070PlaEtaFecT = GXutil.nullDate() ;
      Z3071PlaEtaObs = "" ;
   }

   public void initAll1FJ1572( )
   {
      A3068PlaEtaOrd = (short)(0) ;
      A3069PlaEtaOrdA = (byte)(0) ;
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      initializeNonKey1FJ1572( ) ;
   }

   public void standaloneModalInsert1FJ1572( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241574198", true, true);
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
      httpContext.AddJavascriptSource("tplaeta.js", "?20268241574198", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1572( )
   {
      edtBarCodPar_Enabled = defedtBarCodPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarCodReo_Enabled = defedtBarCodReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarCod_Enabled = defedtBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPlaEtaOrdA_Enabled = defedtPlaEtaOrdA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrdA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrdA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPlaEtaOrd_Enabled = defedtPlaEtaOrd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaEtaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaEtaOrd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1572, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1572_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3068PlaEtaOrd, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3069PlaEtaOrdA, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaOrdA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A3070PlaEtaFecT, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaFecT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3071PlaEtaObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaEtaObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMaqFCod_Internalname = "MAQFCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMaqFDsc_Internalname = "MAQFDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMaqFFind_Internalname = "MAQFFIND" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMaqDscFind_Internalname = "MAQDSCFIND" ;
      edtavnRcdDeleted_1572_Internalname = "vNRCDDELETED_1572" ;
      edtPlaEtaOrd_Internalname = "PLAETAORD" ;
      edtPlaEtaOrdA_Internalname = "PLAETAORDA" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtPlaEtaFecT_Internalname = "PLAETAFECT" ;
      edtPlaEtaObs_Internalname = "PLAETAOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Planificacion Etal", "") );
      edtPlaEtaObs_Jsonclick = "" ;
      edtPlaEtaFecT_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtPlaEtaOrdA_Jsonclick = "" ;
      edtPlaEtaOrd_Jsonclick = "" ;
      edtavnRcdDeleted_1572_Jsonclick = "" ;
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
      edtPlaEtaObs_Enabled = 1 ;
      edtPlaEtaFecT_Enabled = 1 ;
      edtBarSit_Enabled = 0 ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Enabled = 0 ;
      edtBarSer_Enabled = 0 ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtPlaEtaOrdA_Enabled = 1 ;
      edtPlaEtaOrd_Enabled = 1 ;
      edtavnRcdDeleted_1572_Enabled = 1 ;
      edtMaqDscFind_Jsonclick = "" ;
      edtMaqDscFind_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDscFind_Enabled = 0 ;
      edtMaqFFind_Jsonclick = "" ;
      edtMaqFFind_Backcolor = (int)(0xFFFFFF) ;
      edtMaqFFind_Enabled = 0 ;
      edtMaqFDsc_Jsonclick = "" ;
      edtMaqFDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqFDsc_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDsc_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqFCod_Jsonclick = "" ;
      edtMaqFCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqFCod_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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
      subsflControlProps_601572( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FJ1572( ) ;
         standaloneModal1FJ1572( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FJ1572( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601572( ) ;
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
      /* Using cursor T01FJ21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FJ21_A407EmprNom[0] ;
      n407EmprNom = T01FJ21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      /* Using cursor T01FJ22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01FJ22_A606MaqDsc[0] ;
      n606MaqDsc = T01FJ22_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(20);
      /* Using cursor T01FJ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A1144MaqFFind = T01FJ23_A1144MaqFFind[0] ;
         n1144MaqFFind = T01FJ23_n1144MaqFFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
         A1145MaqDscFind = T01FJ23_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T01FJ23_n1145MaqDscFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
      }
      else
      {
         A1145MaqDscFind = "" ;
         n1145MaqDscFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
         A1144MaqFFind = "xxxxxxxx" ;
         n1144MaqFFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
      }
      pr_default.close(21);
      GX_FocusControl = edtMaqFDsc_Internalname ;
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
      /* Using cursor T01FJ21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01FJ21_A407EmprNom[0] ;
      n407EmprNom = T01FJ21_n407EmprNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Maqcod( )
   {
      n606MaqDsc = false ;
      /* Using cursor T01FJ22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A606MaqDsc = T01FJ22_A606MaqDsc[0] ;
      n606MaqDsc = T01FJ22_n606MaqDsc[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
   }

   public void valid_Maqfcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01FJ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A1144MaqFFind = T01FJ23_A1144MaqFFind[0] ;
         n1144MaqFFind = T01FJ23_n1144MaqFFind[0] ;
         A1145MaqDscFind = T01FJ23_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T01FJ23_n1145MaqDscFind[0] ;
      }
      else
      {
         A1145MaqDscFind = "" ;
         n1145MaqDscFind = false ;
         A1144MaqFFind = "xxxxxxxx" ;
         n1144MaqFFind = false ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", GXutil.rtrim( A1143MaqFDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", GXutil.rtrim( A1144MaqFFind));
      httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", GXutil.rtrim( A1145MaqDscFind));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1142MaqFCod", GXutil.rtrim( Z1142MaqFCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1143MaqFDsc", GXutil.rtrim( Z1143MaqFDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1144MaqFFind", GXutil.rtrim( Z1144MaqFFind));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1145MaqDscFind", GXutil.rtrim( Z1145MaqDscFind));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      /* Using cursor T01FJ32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A212BarSer = T01FJ32_A212BarSer[0] ;
      A135BarColNom = T01FJ32_A135BarColNom[0] ;
      A136BarColNum = T01FJ32_A136BarColNum[0] ;
      A213BarSit = T01FJ32_A213BarSit[0] ;
      A252CliCod = T01FJ32_A252CliCod[0] ;
      n252CliCod = T01FJ32_n252CliCod[0] ;
      pr_default.close(30);
      /* Using cursor T01FJ33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A279CliNom = T01FJ33_A279CliNom[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]}");
      setEventMetadata("VALID_MAQFCOD","{handler:'valid_Maqfcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1142MaqFCod',fld:'MAQFCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQFCOD",",oparms:[{av:'A1143MaqFDsc',fld:'MAQFDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A1144MaqFFind',fld:'MAQFFIND',pic:''},{av:'A1145MaqDscFind',fld:'MAQDSCFIND',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z1142MaqFCod'},{av:'Z1143MaqFDsc'},{av:'Z407EmprNom'},{av:'Z606MaqDsc'},{av:'Z1144MaqFFind'},{av:'Z1145MaqDscFind'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PLAETAORD","{handler:'valid_Plaetaord',iparms:[]");
      setEventMetadata("VALID_PLAETAORD",",oparms:[]}");
      setEventMetadata("VALID_PLAETAORDA","{handler:'valid_Plaetaorda',iparms:[]");
      setEventMetadata("VALID_PLAETAORDA",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Plaetaobs',iparms:[]");
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
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z1142MaqFCod = "" ;
      Z1143MaqFDsc = "" ;
      Z130BarCodPar = "" ;
      Z3070PlaEtaFecT = GXutil.nullDate() ;
      Z3071PlaEtaObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A1142MaqFCod = "" ;
      A130BarCodPar = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A606MaqDsc = "" ;
      lblTextblock6_Jsonclick = "" ;
      A1143MaqFDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1144MaqFFind = "" ;
      lblTextblock8_Jsonclick = "" ;
      A1145MaqDscFind = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1572 = "" ;
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
      sMode152 = "" ;
      GXCCtl = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A3070PlaEtaFecT = GXutil.nullDate() ;
      A3071PlaEtaObs = "" ;
      Z407EmprNom = "" ;
      Z606MaqDsc = "" ;
      Z1144MaqFFind = "" ;
      Z1145MaqDscFind = "" ;
      T01FJ11_A457FasCod = new String[] {""} ;
      T01FJ11_A1142MaqFCod = new String[] {""} ;
      T01FJ11_A407EmprNom = new String[] {""} ;
      T01FJ11_n407EmprNom = new boolean[] {false} ;
      T01FJ11_A606MaqDsc = new String[] {""} ;
      T01FJ11_n606MaqDsc = new boolean[] {false} ;
      T01FJ11_A1143MaqFDsc = new String[] {""} ;
      T01FJ11_A396EmprCod = new String[] {""} ;
      T01FJ11_A602MaqCod = new String[] {""} ;
      T01FJ11_A1144MaqFFind = new String[] {""} ;
      T01FJ11_n1144MaqFFind = new boolean[] {false} ;
      T01FJ11_A1145MaqDscFind = new String[] {""} ;
      T01FJ11_n1145MaqDscFind = new boolean[] {false} ;
      T01FJ8_A407EmprNom = new String[] {""} ;
      T01FJ8_n407EmprNom = new boolean[] {false} ;
      T01FJ9_A606MaqDsc = new String[] {""} ;
      T01FJ9_n606MaqDsc = new boolean[] {false} ;
      T01FJ10_A1144MaqFFind = new String[] {""} ;
      T01FJ10_n1144MaqFFind = new boolean[] {false} ;
      T01FJ10_A1145MaqDscFind = new String[] {""} ;
      T01FJ10_n1145MaqDscFind = new boolean[] {false} ;
      T01FJ12_A407EmprNom = new String[] {""} ;
      T01FJ12_n407EmprNom = new boolean[] {false} ;
      T01FJ13_A606MaqDsc = new String[] {""} ;
      T01FJ13_n606MaqDsc = new boolean[] {false} ;
      T01FJ14_A1144MaqFFind = new String[] {""} ;
      T01FJ14_n1144MaqFFind = new boolean[] {false} ;
      T01FJ14_A1145MaqDscFind = new String[] {""} ;
      T01FJ14_n1145MaqDscFind = new boolean[] {false} ;
      T01FJ15_A396EmprCod = new String[] {""} ;
      T01FJ15_A602MaqCod = new String[] {""} ;
      T01FJ15_A1142MaqFCod = new String[] {""} ;
      T01FJ7_A1142MaqFCod = new String[] {""} ;
      T01FJ7_A1143MaqFDsc = new String[] {""} ;
      T01FJ7_A396EmprCod = new String[] {""} ;
      T01FJ7_A602MaqCod = new String[] {""} ;
      T01FJ16_A396EmprCod = new String[] {""} ;
      T01FJ16_A602MaqCod = new String[] {""} ;
      T01FJ16_A1142MaqFCod = new String[] {""} ;
      T01FJ17_A396EmprCod = new String[] {""} ;
      T01FJ17_A602MaqCod = new String[] {""} ;
      T01FJ17_A1142MaqFCod = new String[] {""} ;
      T01FJ6_A1142MaqFCod = new String[] {""} ;
      T01FJ6_A1143MaqFDsc = new String[] {""} ;
      T01FJ6_A396EmprCod = new String[] {""} ;
      T01FJ6_A602MaqCod = new String[] {""} ;
      T01FJ21_A407EmprNom = new String[] {""} ;
      T01FJ21_n407EmprNom = new boolean[] {false} ;
      T01FJ22_A606MaqDsc = new String[] {""} ;
      T01FJ22_n606MaqDsc = new boolean[] {false} ;
      T01FJ23_A1144MaqFFind = new String[] {""} ;
      T01FJ23_n1144MaqFFind = new boolean[] {false} ;
      T01FJ23_A1145MaqDscFind = new String[] {""} ;
      T01FJ23_n1145MaqDscFind = new boolean[] {false} ;
      T01FJ24_A396EmprCod = new String[] {""} ;
      T01FJ24_A602MaqCod = new String[] {""} ;
      T01FJ24_A1142MaqFCod = new String[] {""} ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z279CliNom = "" ;
      T01FJ25_A602MaqCod = new String[] {""} ;
      T01FJ25_A3068PlaEtaOrd = new short[1] ;
      T01FJ25_A3069PlaEtaOrdA = new byte[1] ;
      T01FJ25_A279CliNom = new String[] {""} ;
      T01FJ25_A212BarSer = new String[] {""} ;
      T01FJ25_A135BarColNom = new String[] {""} ;
      T01FJ25_A136BarColNum = new int[1] ;
      T01FJ25_A213BarSit = new byte[1] ;
      T01FJ25_A3070PlaEtaFecT = new java.util.Date[] {GXutil.nullDate()} ;
      T01FJ25_n3070PlaEtaFecT = new boolean[] {false} ;
      T01FJ25_A3071PlaEtaObs = new String[] {""} ;
      T01FJ25_n3071PlaEtaObs = new boolean[] {false} ;
      T01FJ25_A396EmprCod = new String[] {""} ;
      T01FJ25_A129BarCod = new int[1] ;
      T01FJ25_A132BarCodReo = new byte[1] ;
      T01FJ25_A130BarCodPar = new String[] {""} ;
      T01FJ25_A1142MaqFCod = new String[] {""} ;
      T01FJ25_A252CliCod = new int[1] ;
      T01FJ25_n252CliCod = new boolean[] {false} ;
      T01FJ4_A212BarSer = new String[] {""} ;
      T01FJ4_A135BarColNom = new String[] {""} ;
      T01FJ4_A136BarColNum = new int[1] ;
      T01FJ4_A213BarSit = new byte[1] ;
      T01FJ4_A252CliCod = new int[1] ;
      T01FJ4_n252CliCod = new boolean[] {false} ;
      T01FJ5_A279CliNom = new String[] {""} ;
      T01FJ26_A212BarSer = new String[] {""} ;
      T01FJ26_A135BarColNom = new String[] {""} ;
      T01FJ26_A136BarColNum = new int[1] ;
      T01FJ26_A213BarSit = new byte[1] ;
      T01FJ26_A252CliCod = new int[1] ;
      T01FJ26_n252CliCod = new boolean[] {false} ;
      T01FJ27_A279CliNom = new String[] {""} ;
      T01FJ28_A396EmprCod = new String[] {""} ;
      T01FJ28_A602MaqCod = new String[] {""} ;
      T01FJ28_A1142MaqFCod = new String[] {""} ;
      T01FJ28_A3068PlaEtaOrd = new short[1] ;
      T01FJ28_A3069PlaEtaOrdA = new byte[1] ;
      T01FJ28_A129BarCod = new int[1] ;
      T01FJ28_A132BarCodReo = new byte[1] ;
      T01FJ28_A130BarCodPar = new String[] {""} ;
      T01FJ3_A602MaqCod = new String[] {""} ;
      T01FJ3_A3068PlaEtaOrd = new short[1] ;
      T01FJ3_A3069PlaEtaOrdA = new byte[1] ;
      T01FJ3_A3070PlaEtaFecT = new java.util.Date[] {GXutil.nullDate()} ;
      T01FJ3_n3070PlaEtaFecT = new boolean[] {false} ;
      T01FJ3_A3071PlaEtaObs = new String[] {""} ;
      T01FJ3_n3071PlaEtaObs = new boolean[] {false} ;
      T01FJ3_A396EmprCod = new String[] {""} ;
      T01FJ3_A129BarCod = new int[1] ;
      T01FJ3_A132BarCodReo = new byte[1] ;
      T01FJ3_A130BarCodPar = new String[] {""} ;
      T01FJ3_A1142MaqFCod = new String[] {""} ;
      T01FJ2_A602MaqCod = new String[] {""} ;
      T01FJ2_A3068PlaEtaOrd = new short[1] ;
      T01FJ2_A3069PlaEtaOrdA = new byte[1] ;
      T01FJ2_A3070PlaEtaFecT = new java.util.Date[] {GXutil.nullDate()} ;
      T01FJ2_n3070PlaEtaFecT = new boolean[] {false} ;
      T01FJ2_A3071PlaEtaObs = new String[] {""} ;
      T01FJ2_n3071PlaEtaObs = new boolean[] {false} ;
      T01FJ2_A396EmprCod = new String[] {""} ;
      T01FJ2_A129BarCod = new int[1] ;
      T01FJ2_A132BarCodReo = new byte[1] ;
      T01FJ2_A130BarCodPar = new String[] {""} ;
      T01FJ2_A1142MaqFCod = new String[] {""} ;
      T01FJ32_A212BarSer = new String[] {""} ;
      T01FJ32_A135BarColNom = new String[] {""} ;
      T01FJ32_A136BarColNum = new int[1] ;
      T01FJ32_A213BarSit = new byte[1] ;
      T01FJ32_A252CliCod = new int[1] ;
      T01FJ32_n252CliCod = new boolean[] {false} ;
      T01FJ33_A279CliNom = new String[] {""} ;
      T01FJ34_A396EmprCod = new String[] {""} ;
      T01FJ34_A602MaqCod = new String[] {""} ;
      T01FJ34_A1142MaqFCod = new String[] {""} ;
      T01FJ34_A3068PlaEtaOrd = new short[1] ;
      T01FJ34_A3069PlaEtaOrdA = new byte[1] ;
      T01FJ34_A129BarCod = new int[1] ;
      T01FJ34_A132BarCodReo = new byte[1] ;
      T01FJ34_A130BarCodPar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ1142MaqFCod = "" ;
      ZZ1143MaqFDsc = "" ;
      ZZ407EmprNom = "" ;
      ZZ606MaqDsc = "" ;
      ZZ1144MaqFFind = "" ;
      ZZ1145MaqDscFind = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tplaeta__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tplaeta__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tplaeta__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tplaeta__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tplaeta__default(),
         new Object[] {
             new Object[] {
            T01FJ2_A602MaqCod, T01FJ2_A3068PlaEtaOrd, T01FJ2_A3069PlaEtaOrdA, T01FJ2_A3070PlaEtaFecT, T01FJ2_n3070PlaEtaFecT, T01FJ2_A3071PlaEtaObs, T01FJ2_n3071PlaEtaObs, T01FJ2_A396EmprCod, T01FJ2_A129BarCod, T01FJ2_A132BarCodReo,
            T01FJ2_A130BarCodPar, T01FJ2_A1142MaqFCod
            }
            , new Object[] {
            T01FJ3_A602MaqCod, T01FJ3_A3068PlaEtaOrd, T01FJ3_A3069PlaEtaOrdA, T01FJ3_A3070PlaEtaFecT, T01FJ3_n3070PlaEtaFecT, T01FJ3_A3071PlaEtaObs, T01FJ3_n3071PlaEtaObs, T01FJ3_A396EmprCod, T01FJ3_A129BarCod, T01FJ3_A132BarCodReo,
            T01FJ3_A130BarCodPar, T01FJ3_A1142MaqFCod
            }
            , new Object[] {
            T01FJ4_A212BarSer, T01FJ4_A135BarColNom, T01FJ4_A136BarColNum, T01FJ4_A213BarSit, T01FJ4_A252CliCod, T01FJ4_n252CliCod
            }
            , new Object[] {
            T01FJ5_A279CliNom
            }
            , new Object[] {
            T01FJ6_A1142MaqFCod, T01FJ6_A1143MaqFDsc, T01FJ6_A396EmprCod, T01FJ6_A602MaqCod
            }
            , new Object[] {
            T01FJ7_A1142MaqFCod, T01FJ7_A1143MaqFDsc, T01FJ7_A396EmprCod, T01FJ7_A602MaqCod
            }
            , new Object[] {
            T01FJ8_A407EmprNom, T01FJ8_n407EmprNom
            }
            , new Object[] {
            T01FJ9_A606MaqDsc, T01FJ9_n606MaqDsc
            }
            , new Object[] {
            T01FJ10_A1144MaqFFind, T01FJ10_n1144MaqFFind, T01FJ10_A1145MaqDscFind, T01FJ10_n1145MaqDscFind
            }
            , new Object[] {
            T01FJ11_A457FasCod, T01FJ11_A1142MaqFCod, T01FJ11_A407EmprNom, T01FJ11_n407EmprNom, T01FJ11_A606MaqDsc, T01FJ11_n606MaqDsc, T01FJ11_A1143MaqFDsc, T01FJ11_A396EmprCod, T01FJ11_A602MaqCod, T01FJ11_A1144MaqFFind,
            T01FJ11_n1144MaqFFind, T01FJ11_A1145MaqDscFind, T01FJ11_n1145MaqDscFind
            }
            , new Object[] {
            T01FJ12_A407EmprNom, T01FJ12_n407EmprNom
            }
            , new Object[] {
            T01FJ13_A606MaqDsc, T01FJ13_n606MaqDsc
            }
            , new Object[] {
            T01FJ14_A1144MaqFFind, T01FJ14_n1144MaqFFind, T01FJ14_A1145MaqDscFind, T01FJ14_n1145MaqDscFind
            }
            , new Object[] {
            T01FJ15_A396EmprCod, T01FJ15_A602MaqCod, T01FJ15_A1142MaqFCod
            }
            , new Object[] {
            T01FJ16_A396EmprCod, T01FJ16_A602MaqCod, T01FJ16_A1142MaqFCod
            }
            , new Object[] {
            T01FJ17_A396EmprCod, T01FJ17_A602MaqCod, T01FJ17_A1142MaqFCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FJ21_A407EmprNom, T01FJ21_n407EmprNom
            }
            , new Object[] {
            T01FJ22_A606MaqDsc, T01FJ22_n606MaqDsc
            }
            , new Object[] {
            T01FJ23_A1144MaqFFind, T01FJ23_n1144MaqFFind, T01FJ23_A1145MaqDscFind, T01FJ23_n1145MaqDscFind
            }
            , new Object[] {
            T01FJ24_A396EmprCod, T01FJ24_A602MaqCod, T01FJ24_A1142MaqFCod
            }
            , new Object[] {
            T01FJ25_A602MaqCod, T01FJ25_A3068PlaEtaOrd, T01FJ25_A3069PlaEtaOrdA, T01FJ25_A279CliNom, T01FJ25_A212BarSer, T01FJ25_A135BarColNom, T01FJ25_A136BarColNum, T01FJ25_A213BarSit, T01FJ25_A3070PlaEtaFecT, T01FJ25_n3070PlaEtaFecT,
            T01FJ25_A3071PlaEtaObs, T01FJ25_n3071PlaEtaObs, T01FJ25_A396EmprCod, T01FJ25_A129BarCod, T01FJ25_A132BarCodReo, T01FJ25_A130BarCodPar, T01FJ25_A1142MaqFCod, T01FJ25_A252CliCod, T01FJ25_n252CliCod
            }
            , new Object[] {
            T01FJ26_A212BarSer, T01FJ26_A135BarColNom, T01FJ26_A136BarColNum, T01FJ26_A213BarSit, T01FJ26_A252CliCod, T01FJ26_n252CliCod
            }
            , new Object[] {
            T01FJ27_A279CliNom
            }
            , new Object[] {
            T01FJ28_A396EmprCod, T01FJ28_A602MaqCod, T01FJ28_A1142MaqFCod, T01FJ28_A3068PlaEtaOrd, T01FJ28_A3069PlaEtaOrdA, T01FJ28_A129BarCod, T01FJ28_A132BarCodReo, T01FJ28_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FJ32_A212BarSer, T01FJ32_A135BarColNom, T01FJ32_A136BarColNum, T01FJ32_A213BarSit, T01FJ32_A252CliCod, T01FJ32_n252CliCod
            }
            , new Object[] {
            T01FJ33_A279CliNom
            }
            , new Object[] {
            T01FJ34_A396EmprCod, T01FJ34_A602MaqCod, T01FJ34_A1142MaqFCod, T01FJ34_A3068PlaEtaOrd, T01FJ34_A3069PlaEtaOrdA, T01FJ34_A129BarCod, T01FJ34_A132BarCodReo, T01FJ34_A130BarCodPar
            }
         }
      );
   }

   private byte Z3069PlaEtaOrdA ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A3069PlaEtaOrdA ;
   private byte A213BarSit ;
   private byte Gx_BScreen ;
   private byte Z213BarSit ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z3068PlaEtaOrd ;
   private short nRcdDeleted_1572 ;
   private short nRcdExists_1572 ;
   private short nIsMod_1572 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1572 ;
   private short RcdFound1572 ;
   private short nBlankRcdUsr1572 ;
   private short A3068PlaEtaOrd ;
   private short RcdFound152 ;
   private short nIsDirty_152 ;
   private short nIsDirty_1572 ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqFCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMaqFDsc_Enabled ;
   private int edtMaqFFind_Enabled ;
   private int edtMaqDscFind_Enabled ;
   private int edtavnRcdDeleted_1572_Enabled ;
   private int edtPlaEtaOrd_Enabled ;
   private int edtPlaEtaOrdA_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarColNum_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtPlaEtaFecT_Enabled ;
   private int edtPlaEtaObs_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A136BarColNum ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarCodPar_Enabled ;
   private int defedtBarCodReo_Enabled ;
   private int defedtBarCod_Enabled ;
   private int defedtPlaEtaOrdA_Enabled ;
   private int defedtPlaEtaOrd_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqDscFind_Backcolor ;
   private int edtMaqFFind_Backcolor ;
   private int edtMaqFDsc_Backcolor ;
   private int edtMaqDsc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtMaqFCod_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z1142MaqFCod ;
   private String Z1143MaqFDsc ;
   private String Z130BarCodPar ;
   private String Z3071PlaEtaObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1142MaqFCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMaqFCod_Internalname ;
   private String edtMaqFCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMaqFDsc_Internalname ;
   private String A1143MaqFDsc ;
   private String edtMaqFDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMaqFFind_Internalname ;
   private String A1144MaqFFind ;
   private String edtMaqFFind_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMaqDscFind_Internalname ;
   private String A1145MaqDscFind ;
   private String edtMaqDscFind_Jsonclick ;
   private String sMode1572 ;
   private String edtavnRcdDeleted_1572_Internalname ;
   private String edtPlaEtaOrd_Internalname ;
   private String edtPlaEtaOrdA_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliNom_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtPlaEtaFecT_Internalname ;
   private String edtPlaEtaObs_Internalname ;
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
   private String sMode152 ;
   private String GXCCtl ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A3071PlaEtaObs ;
   private String Z407EmprNom ;
   private String Z606MaqDsc ;
   private String Z1144MaqFFind ;
   private String Z1145MaqDscFind ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z279CliNom ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1572_Jsonclick ;
   private String edtPlaEtaOrd_Jsonclick ;
   private String edtPlaEtaOrdA_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtPlaEtaFecT_Jsonclick ;
   private String edtPlaEtaObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ1142MaqFCod ;
   private String ZZ1143MaqFDsc ;
   private String ZZ407EmprNom ;
   private String ZZ606MaqDsc ;
   private String ZZ1144MaqFFind ;
   private String ZZ1145MaqDscFind ;
   private java.util.Date Z3070PlaEtaFecT ;
   private java.util.Date A3070PlaEtaFecT ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n606MaqDsc ;
   private boolean n1144MaqFFind ;
   private boolean n1145MaqDscFind ;
   private boolean n3070PlaEtaFecT ;
   private boolean n3071PlaEtaObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FJ11_A457FasCod ;
   private String[] T01FJ11_A1142MaqFCod ;
   private String[] T01FJ11_A407EmprNom ;
   private boolean[] T01FJ11_n407EmprNom ;
   private String[] T01FJ11_A606MaqDsc ;
   private boolean[] T01FJ11_n606MaqDsc ;
   private String[] T01FJ11_A1143MaqFDsc ;
   private String[] T01FJ11_A396EmprCod ;
   private String[] T01FJ11_A602MaqCod ;
   private String[] T01FJ11_A1144MaqFFind ;
   private boolean[] T01FJ11_n1144MaqFFind ;
   private String[] T01FJ11_A1145MaqDscFind ;
   private boolean[] T01FJ11_n1145MaqDscFind ;
   private String[] T01FJ8_A407EmprNom ;
   private boolean[] T01FJ8_n407EmprNom ;
   private String[] T01FJ9_A606MaqDsc ;
   private boolean[] T01FJ9_n606MaqDsc ;
   private String[] T01FJ10_A1144MaqFFind ;
   private boolean[] T01FJ10_n1144MaqFFind ;
   private String[] T01FJ10_A1145MaqDscFind ;
   private boolean[] T01FJ10_n1145MaqDscFind ;
   private String[] T01FJ12_A407EmprNom ;
   private boolean[] T01FJ12_n407EmprNom ;
   private String[] T01FJ13_A606MaqDsc ;
   private boolean[] T01FJ13_n606MaqDsc ;
   private String[] T01FJ14_A1144MaqFFind ;
   private boolean[] T01FJ14_n1144MaqFFind ;
   private String[] T01FJ14_A1145MaqDscFind ;
   private boolean[] T01FJ14_n1145MaqDscFind ;
   private String[] T01FJ15_A396EmprCod ;
   private String[] T01FJ15_A602MaqCod ;
   private String[] T01FJ15_A1142MaqFCod ;
   private String[] T01FJ7_A1142MaqFCod ;
   private String[] T01FJ7_A1143MaqFDsc ;
   private String[] T01FJ7_A396EmprCod ;
   private String[] T01FJ7_A602MaqCod ;
   private String[] T01FJ16_A396EmprCod ;
   private String[] T01FJ16_A602MaqCod ;
   private String[] T01FJ16_A1142MaqFCod ;
   private String[] T01FJ17_A396EmprCod ;
   private String[] T01FJ17_A602MaqCod ;
   private String[] T01FJ17_A1142MaqFCod ;
   private String[] T01FJ6_A1142MaqFCod ;
   private String[] T01FJ6_A1143MaqFDsc ;
   private String[] T01FJ6_A396EmprCod ;
   private String[] T01FJ6_A602MaqCod ;
   private String[] T01FJ21_A407EmprNom ;
   private boolean[] T01FJ21_n407EmprNom ;
   private String[] T01FJ22_A606MaqDsc ;
   private boolean[] T01FJ22_n606MaqDsc ;
   private String[] T01FJ23_A1144MaqFFind ;
   private boolean[] T01FJ23_n1144MaqFFind ;
   private String[] T01FJ23_A1145MaqDscFind ;
   private boolean[] T01FJ23_n1145MaqDscFind ;
   private String[] T01FJ24_A396EmprCod ;
   private String[] T01FJ24_A602MaqCod ;
   private String[] T01FJ24_A1142MaqFCod ;
   private String[] T01FJ25_A602MaqCod ;
   private short[] T01FJ25_A3068PlaEtaOrd ;
   private byte[] T01FJ25_A3069PlaEtaOrdA ;
   private String[] T01FJ25_A279CliNom ;
   private String[] T01FJ25_A212BarSer ;
   private String[] T01FJ25_A135BarColNom ;
   private int[] T01FJ25_A136BarColNum ;
   private byte[] T01FJ25_A213BarSit ;
   private java.util.Date[] T01FJ25_A3070PlaEtaFecT ;
   private boolean[] T01FJ25_n3070PlaEtaFecT ;
   private String[] T01FJ25_A3071PlaEtaObs ;
   private boolean[] T01FJ25_n3071PlaEtaObs ;
   private String[] T01FJ25_A396EmprCod ;
   private int[] T01FJ25_A129BarCod ;
   private byte[] T01FJ25_A132BarCodReo ;
   private String[] T01FJ25_A130BarCodPar ;
   private String[] T01FJ25_A1142MaqFCod ;
   private int[] T01FJ25_A252CliCod ;
   private boolean[] T01FJ25_n252CliCod ;
   private String[] T01FJ4_A212BarSer ;
   private String[] T01FJ4_A135BarColNom ;
   private int[] T01FJ4_A136BarColNum ;
   private byte[] T01FJ4_A213BarSit ;
   private int[] T01FJ4_A252CliCod ;
   private boolean[] T01FJ4_n252CliCod ;
   private String[] T01FJ5_A279CliNom ;
   private String[] T01FJ26_A212BarSer ;
   private String[] T01FJ26_A135BarColNom ;
   private int[] T01FJ26_A136BarColNum ;
   private byte[] T01FJ26_A213BarSit ;
   private int[] T01FJ26_A252CliCod ;
   private boolean[] T01FJ26_n252CliCod ;
   private String[] T01FJ27_A279CliNom ;
   private String[] T01FJ28_A396EmprCod ;
   private String[] T01FJ28_A602MaqCod ;
   private String[] T01FJ28_A1142MaqFCod ;
   private short[] T01FJ28_A3068PlaEtaOrd ;
   private byte[] T01FJ28_A3069PlaEtaOrdA ;
   private int[] T01FJ28_A129BarCod ;
   private byte[] T01FJ28_A132BarCodReo ;
   private String[] T01FJ28_A130BarCodPar ;
   private String[] T01FJ3_A602MaqCod ;
   private short[] T01FJ3_A3068PlaEtaOrd ;
   private byte[] T01FJ3_A3069PlaEtaOrdA ;
   private java.util.Date[] T01FJ3_A3070PlaEtaFecT ;
   private boolean[] T01FJ3_n3070PlaEtaFecT ;
   private String[] T01FJ3_A3071PlaEtaObs ;
   private boolean[] T01FJ3_n3071PlaEtaObs ;
   private String[] T01FJ3_A396EmprCod ;
   private int[] T01FJ3_A129BarCod ;
   private byte[] T01FJ3_A132BarCodReo ;
   private String[] T01FJ3_A130BarCodPar ;
   private String[] T01FJ3_A1142MaqFCod ;
   private String[] T01FJ2_A602MaqCod ;
   private short[] T01FJ2_A3068PlaEtaOrd ;
   private byte[] T01FJ2_A3069PlaEtaOrdA ;
   private java.util.Date[] T01FJ2_A3070PlaEtaFecT ;
   private boolean[] T01FJ2_n3070PlaEtaFecT ;
   private String[] T01FJ2_A3071PlaEtaObs ;
   private boolean[] T01FJ2_n3071PlaEtaObs ;
   private String[] T01FJ2_A396EmprCod ;
   private int[] T01FJ2_A129BarCod ;
   private byte[] T01FJ2_A132BarCodReo ;
   private String[] T01FJ2_A130BarCodPar ;
   private String[] T01FJ2_A1142MaqFCod ;
   private String[] T01FJ32_A212BarSer ;
   private String[] T01FJ32_A135BarColNom ;
   private int[] T01FJ32_A136BarColNum ;
   private byte[] T01FJ32_A213BarSit ;
   private int[] T01FJ32_A252CliCod ;
   private boolean[] T01FJ32_n252CliCod ;
   private String[] T01FJ33_A279CliNom ;
   private String[] T01FJ34_A396EmprCod ;
   private String[] T01FJ34_A602MaqCod ;
   private String[] T01FJ34_A1142MaqFCod ;
   private short[] T01FJ34_A3068PlaEtaOrd ;
   private byte[] T01FJ34_A3069PlaEtaOrdA ;
   private int[] T01FJ34_A129BarCod ;
   private byte[] T01FJ34_A132BarCodReo ;
   private String[] T01FJ34_A130BarCodPar ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tplaeta__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplaeta__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplaeta__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplaeta__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplaeta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FJ2", "SELECT MaqCod, PlaEtaOrd, PlaEtaOrdA, PlaEtaFecT, PlaEtaObs, EmprCod, BarCod, BarCodReo, BarCodPar, MaqFCod FROM TXPPLAETA WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? AND PlaEtaOrd = ? AND PlaEtaOrdA = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF PlaEtaFecT, PlaEtaObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ3", "SELECT MaqCod, PlaEtaOrd, PlaEtaOrdA, PlaEtaFecT, PlaEtaObs, EmprCod, BarCod, BarCodReo, BarCodPar, MaqFCod FROM TXPPLAETA WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? AND PlaEtaOrd = ? AND PlaEtaOrdA = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ4", "SELECT BarSer, BarColNom, BarColNum, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ6", "SELECT MaqFCod, MaqFDsc, EmprCod, MaqCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ?  FOR UPDATE OF MaqFDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ7", "SELECT MaqFCod, MaqFDsc, EmprCod, MaqCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ9", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ10", "SELECT COALESCE( FasCod, 'xxxxxxxx') AS MaqFFind, COALESCE( FasDsc, '') AS MaqDscFind FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ11", "SELECT /*+ FIRST_ROWS(100) */ T4.FasCod, TM1.MaqFCod, T2.EmprNom, T3.MaqDsc, TM1.MaqFDsc, TM1.EmprCod, TM1.MaqCod, COALESCE( T4.FasCod, 'xxxxxxxx') AS MaqFFind, COALESCE( T4.FasDsc, '') AS MaqDscFind FROM (((TXPMAQFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MaqCod) LEFT JOIN TXPFASPRO T4 ON T4.EmprCod = TM1.EmprCod AND T4.FasCod = TM1.MaqFCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.MaqFCod = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.MaqFCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ13", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ14", "SELECT COALESCE( FasCod, 'xxxxxxxx') AS MaqFFind, COALESCE( FasDsc, '') AS MaqDscFind FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE ( EmprCod > ? or EmprCod = ? and MaqCod > ? or MaqCod = ? and EmprCod = ? and MaqFCod > ?) ORDER BY EmprCod, MaqCod, MaqFCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FJ17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE ( EmprCod < ? or EmprCod = ? and MaqCod < ? or MaqCod = ? and EmprCod = ? and MaqFCod < ?) ORDER BY EmprCod DESC, MaqCod DESC, MaqFCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FJ18", "INSERT INTO TXPMAQFAS(MaqFCod, MaqFDsc, EmprCod, MaqCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMAQFAS")
         ,new UpdateCursor("T01FJ19", "UPDATE TXPMAQFAS SET MaqFDsc=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ?", GX_NOMASK, "TXPMAQFAS")
         ,new UpdateCursor("T01FJ20", "DELETE FROM TXPMAQFAS  WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ?", GX_NOMASK, "TXPMAQFAS")
         ,new ForEachCursor("T01FJ21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ22", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ23", "SELECT COALESCE( FasCod, 'xxxxxxxx') AS MaqFFind, COALESCE( FasDsc, '') AS MaqDscFind FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS ORDER BY EmprCod, MaqCod, MaqFCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ25", "SELECT T1.MaqCod, T1.PlaEtaOrd, T1.PlaEtaOrdA, T3.CliNom, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarSit, T1.PlaEtaFecT, T1.PlaEtaObs, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqFCod, T2.CliCod FROM ((TXPPLAETA T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.MaqCod = ? and T1.MaqFCod = ? and T1.PlaEtaOrd = ? and T1.PlaEtaOrdA = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.MaqCod, T1.MaqFCod, T1.PlaEtaOrd, T1.PlaEtaOrdA, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ26", "SELECT BarSer, BarColNom, BarColNum, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ27", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ28", "SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? AND PlaEtaOrd = ? AND PlaEtaOrdA = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FJ29", "INSERT INTO TXPPLAETA(MaqCod, PlaEtaOrd, PlaEtaOrdA, PlaEtaFecT, PlaEtaObs, EmprCod, BarCod, BarCodReo, BarCodPar, MaqFCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPLAETA")
         ,new UpdateCursor("T01FJ30", "UPDATE TXPPLAETA SET PlaEtaFecT=?, PlaEtaObs=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? AND PlaEtaOrd = ? AND PlaEtaOrdA = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPPLAETA")
         ,new UpdateCursor("T01FJ31", "DELETE FROM TXPPLAETA  WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? AND PlaEtaOrd = ? AND PlaEtaOrdA = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPPLAETA")
         ,new ForEachCursor("T01FJ32", "SELECT BarSer, BarColNom, BarColNum, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ33", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FJ34", "SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? and MaqCod = ? and MaqFCod = ? ORDER BY EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 28);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 28);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((String[]) buf[16])[0] = rslt.getString(15, 8);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 28);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 28);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 60);
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 1);
               stmt.setString(10, (String)parms[11], 8);
               return;
            case 28 :
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
                  stmt.setString(2, (String)parms[3], 60);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 6);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setString(10, (String)parms[11], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 31 :
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
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

