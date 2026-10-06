package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpregbl_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
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
         gxload_9( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1504CliProCod = httpContext.GetPar( "CliProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A1504CliProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5362IntCodF = (byte)(GXutil.lval( httpContext.GetPar( "IntCodF"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A5362IntCodF) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PREÇO GLOBAL", ""), (short)(0)) ;
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

   public tpregbl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpregbl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpregbl_impl.class ));
   }

   public tpregbl_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPREGBL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProCod_Internalname, GXutil.rtrim( A1504CliProCod), GXutil.rtrim( localUtil.format( A1504CliProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripción Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProDsc_Internalname, GXutil.rtrim( A1505CliProDsc), GXutil.rtrim( localUtil.format( A1505CliProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCliProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Busqueda Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProBus_Internalname, GXutil.rtrim( A1506CliProBus), GXutil.rtrim( localUtil.format( A1506CliProBus, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProBus_Jsonclick, 0, "", "", "", "", "", 1, edtCliProBus_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREGBL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREGBL.htm");
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
         nBlankRcdCount1392 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1392 = (short)(1) ;
            scanStart17L1392( ) ;
            while ( RcdFound1392 != 0 )
            {
               init_level_properties1392( ) ;
               getByPrimaryKey17L1392( ) ;
               addRow17L1392( ) ;
               scanNext17L1392( ) ;
            }
            scanEnd17L1392( ) ;
            nBlankRcdCount1392 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal17L1392( ) ;
         standaloneModal17L1392( ) ;
         sMode1392 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow17L1392( ) ;
            edtavnRcdDeleted_1392_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1392_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1392_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1392_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtIntCodF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTCODF_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtIntDscF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTDSCF_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntDscF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDscF_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPgblMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PGBLMTR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPgblMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPgblMtr_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPgblKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PGBLKGM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPgblKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPgblKgm_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1392 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal17L1392( ) ;
            }
            sendRow17L1392( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1392 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1392 = (short)(5) ;
         nRcdExists_1392 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart17L1392( ) ;
            while ( RcdFound1392 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601392( ) ;
               init_level_properties1392( ) ;
               standaloneNotModal17L1392( ) ;
               getByPrimaryKey17L1392( ) ;
               standaloneModal17L1392( ) ;
               addRow17L1392( ) ;
               scanNext17L1392( ) ;
            }
            scanEnd17L1392( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1392 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601392( ) ;
      initAll17L1392( ) ;
      init_level_properties1392( ) ;
      nRcdExists_1392 = (short)(0) ;
      nIsMod_1392 = (short)(0) ;
      nRcdDeleted_1392 = (short)(0) ;
      nBlankRcdCount1392 = (short)(nBlankRcdUsr1392+nBlankRcdCount1392) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1392 > 0 )
      {
         standaloneNotModal17L1392( ) ;
         standaloneModal17L1392( ) ;
         addRow17L1392( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtIntCodF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1392 = (short)(nBlankRcdCount1392-1) ;
      }
      Gx_mode = sMode1392 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREGBL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPREGBL.htm");
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
      e1117L2 ();
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
            Z1504CliProCod = httpContext.cgiGet( "Z1504CliProCod") ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV20Modo = httpContext.cgiGet( "vMODO") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
            A1504CliProCod = httpContext.cgiGet( edtCliProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A1505CliProDsc = httpContext.cgiGet( edtCliProDsc_Internalname) ;
            n1505CliProDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
            A1506CliProBus = httpContext.cgiGet( edtCliProBus_Internalname) ;
            n1506CliProBus = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A1504CliProCod = httpContext.GetPar( "CliProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
                        e1117L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PROCESOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Procesos' */
                        e1217L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DUPLICAR PREçO INT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Duplicar Preço Int' */
                        e1317L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'INFORME'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Informe' */
                        e1417L2 ();
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
            initAll17L212( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1392_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1392_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes17L212( ) ;
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

   public void confirm_17L0( )
   {
      beforeValidate17L212( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17L212( ) ;
         }
         else
         {
            checkExtendedTable17L212( ) ;
            if ( AnyError == 0 )
            {
               zm17L212( 8) ;
               zm17L212( 9) ;
               zm17L212( 10) ;
               zm17L212( 11) ;
            }
            closeExtendedTableCursors17L212( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode212 = Gx_mode ;
         confirm_17L1392( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode212 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues17L0( ) ;
      }
   }

   public void confirm_17L1392( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow17L1392( ) ;
         if ( ( nRcdExists_1392 != 0 ) || ( nIsMod_1392 != 0 ) )
         {
            getKey17L1392( ) ;
            if ( ( nRcdExists_1392 == 0 ) && ( nRcdDeleted_1392 == 0 ) )
            {
               if ( RcdFound1392 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate17L1392( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable17L1392( ) ;
                     if ( AnyError == 0 )
                     {
                        zm17L1392( 13) ;
                     }
                     closeExtendedTableCursors17L1392( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "INTCODF_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtIntCodF_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1392 != 0 )
               {
                  if ( nRcdDeleted_1392 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey17L1392( ) ;
                     load17L1392( ) ;
                     beforeValidate17L1392( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls17L1392( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1392 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate17L1392( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable17L1392( ) ;
                           if ( AnyError == 0 )
                           {
                              zm17L1392( 13) ;
                           }
                           closeExtendedTableCursors17L1392( ) ;
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
                  if ( nRcdDeleted_1392 == 0 )
                  {
                     GXCCtl = "INTCODF_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtIntCodF_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1392_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntCodF_Internalname, GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntDscF_Internalname, GXutil.rtrim( A5363IntDscF)) ;
         httpContext.changePostValue( edtPgblMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A10266PgblMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPgblKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A10267PgblKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5362IntCodF_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10266PgblMtr_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10266PgblMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10267PgblKgm_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10267PgblKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1392_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1392_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1392_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1392 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1392_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1392_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTCODF_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCodF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDSCF_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDscF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PGBLMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPgblMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PGBLKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPgblKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption17L0( )
   {
   }

   public void e1117L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char1 = AV21LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char1 = AV22lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22lit1", AV22lit1);
      GXt_char1 = AV23lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23lit2", AV23lit2);
      GXt_char1 = AV24lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24lit3", AV24lit3);
      GXt_char1 = AV25lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25lit4", AV25lit4);
      GXt_char1 = AV26lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT289_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26lit5", AV26lit5);
      GXt_char1 = AV27lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT291_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27lit6", AV27lit6);
      GXt_char1 = AV28lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28lit7", AV28lit7);
      GXt_char1 = AV29Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit8", AV29Lit8);
      GXt_char1 = AV30Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT331_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit9", AV30Lit9);
      GXt_char1 = AV32Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1152_", ""), (byte)(99), GXv_char2) ;
      tpregbl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit10", AV32Lit10);
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A407EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpregbl_impl.this.A396EmprCod = GXv_char2[0] ;
      tpregbl_impl.this.A407EmprNom = GXv_char3[0] ;
      tpregbl_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV34Tintex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int6) ;
      tpregbl_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34Tintex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Tintex", GXutil.str( AV34Tintex, 1, 0));
   }

   public void e1217L2( )
   {
      /* 'Procesos' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void e1317L2( )
   {
      /* 'Duplicar Preço Int' Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Processo completado ¡¡¡", ""));
      /*  Sending Event outputs  */
   }

   public void e1417L2( )
   {
      /* 'Informe' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A252CliCod ;
      new app.pbmabaux(remoteHandle, context).execute( GXv_char4, GXv_int7, AV36Tab_art, AV37Tab_pr) ;
      tpregbl_impl.this.A396EmprCod = GXv_char4[0] ;
      tpregbl_impl.this.A252CliCod = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      /*  Sending Event outputs  */
   }

   public void zm17L212( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -7 )
      {
         Z1504CliProCod = A1504CliProCod ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z1505CliProDsc = A1505CliProDsc ;
         Z1506CliProBus = A1506CliProBus ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      /* Using cursor T017L7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
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

   public void load17L212( )
   {
      /* Using cursor T017L11 */
      pr_default.execute(9, new Object[] {A1504CliProCod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A279CliNom = T017L11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1505CliProDsc = T017L11_A1505CliProDsc[0] ;
         n1505CliProDsc = T017L11_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T017L11_A1506CliProBus[0] ;
         n1506CliProBus = T017L11_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         zm17L212( -7) ;
      }
      pr_default.close(9);
      onLoadActions17L212( ) ;
   }

   public void onLoadActions17L212( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable17L212( )
   {
      nIsDirty_212 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T017L8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T017L8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T017L10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A1505CliProDsc = T017L10_A1505CliProDsc[0] ;
         n1505CliProDsc = T017L10_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T017L10_A1506CliProBus[0] ;
         n1506CliProBus = T017L10_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
      }
      else
      {
         nIsDirty_212 = (short)(1) ;
         A1506CliProBus = "XXXXXXXX" ;
         n1506CliProBus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         nIsDirty_212 = (short)(1) ;
         A1505CliProDsc = "                            " ;
         n1505CliProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
      }
      pr_default.close(8);
      if ( true /* After */ && ( GXutil.strcmp(A1506CliProBus, "XXXXXXXX") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proceso", ""), 1, "CLIPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T017L9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors17L212( )
   {
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T017L12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T017L12_A279CliNom[0] ;
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

   public void gxload_11( String A396EmprCod ,
                          String A1504CliProCod )
   {
      /* Using cursor T017L13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A1505CliProDsc = T017L13_A1505CliProDsc[0] ;
         n1505CliProDsc = T017L13_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T017L13_A1506CliProBus[0] ;
         n1506CliProBus = T017L13_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
      }
      else
      {
         A1506CliProBus = "XXXXXXXX" ;
         n1506CliProBus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         A1505CliProDsc = "                            " ;
         n1505CliProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1505CliProDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1506CliProBus))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_10( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T017L14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey17L212( )
   {
      /* Using cursor T017L15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound212 = (short)(1) ;
      }
      else
      {
         RcdFound212 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017L6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T017L6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17L212( 7) ;
         RcdFound212 = (short)(1) ;
         A1504CliProCod = T017L6_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A252CliCod = T017L6_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T017L6_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         sMode212 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17L212( ) ;
         if ( AnyError == 1 )
         {
            RcdFound212 = (short)(0) ;
            initializeNonKey17L212( ) ;
         }
         Gx_mode = sMode212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound212 = (short)(0) ;
         initializeNonKey17L212( ) ;
         sMode212 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey17L212( ) ;
      if ( RcdFound212 == 0 )
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
      RcdFound212 = (short)(0) ;
      /* Using cursor T017L16 */
      pr_default.execute(14, new Object[] {A1504CliProCod, A1504CliProCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T017L16_A1504CliProCod[0], A1504CliProCod) < 0 ) || ( GXutil.strcmp(T017L16_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T017L16_A252CliCod[0] < A252CliCod ) || ( T017L16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017L16_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T017L16_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T017L16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T017L16_A1504CliProCod[0], A1504CliProCod) > 0 ) || ( GXutil.strcmp(T017L16_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T017L16_A252CliCod[0] > A252CliCod ) || ( T017L16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017L16_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T017L16_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T017L16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1504CliProCod = T017L16_A1504CliProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A252CliCod = T017L16_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T017L16_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound212 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound212 = (short)(0) ;
      /* Using cursor T017L17 */
      pr_default.execute(15, new Object[] {A1504CliProCod, A1504CliProCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T017L17_A1504CliProCod[0], A1504CliProCod) > 0 ) || ( GXutil.strcmp(T017L17_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T017L17_A252CliCod[0] > A252CliCod ) || ( T017L17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017L17_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T017L17_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T017L17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T017L17_A1504CliProCod[0], A1504CliProCod) < 0 ) || ( GXutil.strcmp(T017L17_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T017L17_A252CliCod[0] < A252CliCod ) || ( T017L17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017L17_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T017L17_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T017L17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1504CliProCod = T017L17_A1504CliProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A252CliCod = T017L17_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T017L17_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound212 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17L212( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17L212( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound212 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A1504CliProCod = Z1504CliProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
               update17L212( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17L212( ) ;
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
                  insert17L212( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1504CliProCod = Z1504CliProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
      getKey17L212( ) ;
      if ( RcdFound212 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1504CliProCod = Z1504CliProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A65ArtCod = Z65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpregbl");
   }

   public void insert_check( )
   {
      confirm_17L0( ) ;
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
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17L212( ) ;
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17L212( ) ;
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
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17L212( ) ;
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound212 != 0 )
         {
            scanNext17L212( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17L212( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17L212( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017L5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPREPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPREPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17L212( )
   {
      beforeValidate17L212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17L212( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17L212( 0) ;
         checkOptimisticConcurrency17L212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17L212( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17L212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017L18 */
                  pr_default.execute(16, new Object[] {A1504CliProCod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPREPR");
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
                        processLevel17L212( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption17L0( ) ;
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
            load17L212( ) ;
         }
         endLevel17L212( ) ;
      }
      closeExtendedTableCursors17L212( ) ;
   }

   public void update17L212( )
   {
      beforeValidate17L212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17L212( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17L212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17L212( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17L212( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCPREPR */
                  deferredUpdate17L212( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel17L212( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption17L0( ) ;
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
         endLevel17L212( ) ;
      }
      closeExtendedTableCursors17L212( ) ;
   }

   public void deferredUpdate17L212( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17L212( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17L212( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17L212( ) ;
         afterConfirm17L212( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17L212( ) ;
            if ( AnyError == 0 )
            {
               scanStart17L1392( ) ;
               while ( RcdFound1392 != 0 )
               {
                  getByPrimaryKey17L1392( ) ;
                  delete17L1392( ) ;
                  scanNext17L1392( ) ;
               }
               scanEnd17L1392( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017L19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPREPR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound212 == 0 )
                        {
                           initAll17L212( ) ;
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
                        resetCaption17L0( ) ;
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
      sMode212 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17L212( ) ;
      Gx_mode = sMode212 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17L212( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T017L20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T017L20_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(18);
         /* Using cursor T017L21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A1505CliProDsc = T017L21_A1505CliProDsc[0] ;
            n1505CliProDsc = T017L21_n1505CliProDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
            A1506CliProBus = T017L21_A1506CliProBus[0] ;
            n1506CliProBus = T017L21_n1506CliProBus[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         }
         else
         {
            A1506CliProBus = "XXXXXXXX" ;
            n1506CliProBus = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
            A1505CliProDsc = "                            " ;
            n1505CliProDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         }
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T017L22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPRc", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T017L23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel17L1392( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow17L1392( ) ;
         if ( ( nRcdExists_1392 != 0 ) || ( nIsMod_1392 != 0 ) )
         {
            standaloneNotModal17L1392( ) ;
            getKey17L1392( ) ;
            if ( ( nRcdExists_1392 == 0 ) && ( nRcdDeleted_1392 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert17L1392( ) ;
            }
            else
            {
               if ( RcdFound1392 != 0 )
               {
                  if ( ( nRcdDeleted_1392 != 0 ) && ( nRcdExists_1392 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete17L1392( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1392 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update17L1392( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1392 == 0 )
                  {
                     GXCCtl = "INTCODF_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtIntCodF_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1392_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntCodF_Internalname, GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntDscF_Internalname, GXutil.rtrim( A5363IntDscF)) ;
         httpContext.changePostValue( edtPgblMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A10266PgblMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPgblKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A10267PgblKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5362IntCodF_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10266PgblMtr_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10266PgblMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10267PgblKgm_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10267PgblKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1392_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1392_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1392_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1392 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1392_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1392_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTCODF_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCodF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDSCF_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDscF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PGBLMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPgblMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PGBLKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPgblKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll17L1392( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1392 = (short)(0) ;
      nIsMod_1392 = (short)(0) ;
      nRcdDeleted_1392 = (short)(0) ;
   }

   public void processLevel17L212( )
   {
      /* Save parent mode. */
      sMode212 = Gx_mode ;
      processNestedLevel17L1392( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode212 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel17L212( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17L212( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpregbl");
         if ( AnyError == 0 )
         {
            confirmValues17L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpregbl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17L212( )
   {
      /* Scan By routine */
      /* Using cursor T017L24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      RcdFound212 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A252CliCod = T017L24_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1504CliProCod = T017L24_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A65ArtCod = T017L24_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17L212( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound212 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A252CliCod = T017L24_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1504CliProCod = T017L24_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A65ArtCod = T017L24_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEnd17L212( )
   {
      pr_default.close(22);
   }

   public void afterConfirm17L212( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17L212( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17L212( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17L212( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17L212( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17L212( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17L212( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliProCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtCliProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliProDsc_Enabled), 5, 0), true);
      edtCliProBus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliProBus_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliProBus_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm17L1392( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10266PgblMtr = T017L3_A10266PgblMtr[0] ;
            Z10267PgblKgm = T017L3_A10267PgblKgm[0] ;
         }
         else
         {
            Z10266PgblMtr = A10266PgblMtr ;
            Z10267PgblKgm = A10267PgblKgm ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z10266PgblMtr = A10266PgblMtr ;
         Z10267PgblKgm = A10267PgblKgm ;
         Z396EmprCod = A396EmprCod ;
         Z5362IntCodF = A5362IntCodF ;
         Z5363IntDscF = A5363IntDscF ;
      }
   }

   public void standaloneNotModal17L1392( )
   {
   }

   public void standaloneModal17L1392( )
   {
      if ( true /* Level */ && isUpd( )  )
      {
         AV20Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      }
      else
      {
         if ( true /* Level */ && isIns( )  )
         {
            AV20Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtIntCodF_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtIntCodF_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load17L1392( )
   {
      /* Using cursor T017L25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1392 = (short)(1) ;
         A5363IntDscF = T017L25_A5363IntDscF[0] ;
         n5363IntDscF = T017L25_n5363IntDscF[0] ;
         A10266PgblMtr = T017L25_A10266PgblMtr[0] ;
         n10266PgblMtr = T017L25_n10266PgblMtr[0] ;
         A10267PgblKgm = T017L25_A10267PgblKgm[0] ;
         n10267PgblKgm = T017L25_n10267PgblKgm[0] ;
         zm17L1392( -12) ;
      }
      pr_default.close(23);
      onLoadActions17L1392( ) ;
   }

   public void onLoadActions17L1392( )
   {
   }

   public void checkExtendedTable17L1392( )
   {
      nIsDirty_1392 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal17L1392( ) ;
      /* Using cursor T017L4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "INTCODF_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCodF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A5363IntDscF = T017L4_A5363IntDscF[0] ;
      n5363IntDscF = T017L4_n5363IntDscF[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors17L1392( )
   {
      pr_default.close(2);
   }

   public void enableDisable17L1392( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          byte A5362IntCodF )
   {
      /* Using cursor T017L26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "INTCODF_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCodF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A5363IntDscF = T017L26_A5363IntDscF[0] ;
      n5363IntDscF = T017L26_n5363IntDscF[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5363IntDscF))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKey17L1392( )
   {
      /* Using cursor T017L27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1392 = (short)(1) ;
      }
      else
      {
         RcdFound1392 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey17L1392( )
   {
      /* Using cursor T017L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017L3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17L1392( 12) ;
         RcdFound1392 = (short)(1) ;
         initializeNonKey17L1392( ) ;
         A10266PgblMtr = T017L3_A10266PgblMtr[0] ;
         n10266PgblMtr = T017L3_n10266PgblMtr[0] ;
         A10267PgblKgm = T017L3_A10267PgblKgm[0] ;
         n10267PgblKgm = T017L3_n10267PgblKgm[0] ;
         A5362IntCodF = T017L3_A5362IntCodF[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z5362IntCodF = A5362IntCodF ;
         sMode1392 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17L1392( ) ;
         load17L1392( ) ;
         Gx_mode = sMode1392 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1392 = (short)(0) ;
         initializeNonKey17L1392( ) ;
         sMode1392 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17L1392( ) ;
         Gx_mode = sMode1392 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes17L1392( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency17L1392( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017L2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A5362IntCodF)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREGBL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10266PgblMtr, T017L2_A10266PgblMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z10267PgblKgm, T017L2_A10267PgblKgm[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10266PgblMtr, T017L2_A10266PgblMtr[0]) != 0 )
            {
               GXutil.writeLogln("tpregbl:[seudo value changed for attri]"+"PgblMtr");
               GXutil.writeLogRaw("Old: ",Z10266PgblMtr);
               GXutil.writeLogRaw("Current: ",T017L2_A10266PgblMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z10267PgblKgm, T017L2_A10267PgblKgm[0]) != 0 )
            {
               GXutil.writeLogln("tpregbl:[seudo value changed for attri]"+"PgblKgm");
               GXutil.writeLogRaw("Old: ",Z10267PgblKgm);
               GXutil.writeLogRaw("Current: ",T017L2_A10267PgblKgm[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPREGBL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17L1392( )
   {
      beforeValidate17L1392( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17L1392( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17L1392( 0) ;
         checkOptimisticConcurrency17L1392( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17L1392( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17L1392( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017L28 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Boolean.valueOf(n10266PgblMtr), A10266PgblMtr, Boolean.valueOf(n10267PgblKgm), A10267PgblKgm, A396EmprCod, Byte.valueOf(A5362IntCodF)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREGBL");
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
            load17L1392( ) ;
         }
         endLevel17L1392( ) ;
      }
      closeExtendedTableCursors17L1392( ) ;
   }

   public void update17L1392( )
   {
      beforeValidate17L1392( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17L1392( ) ;
      }
      if ( ( nIsMod_1392 != 0 ) || ( nIsDirty_1392 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency17L1392( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm17L1392( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate17L1392( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017L29 */
                     pr_default.execute(27, new Object[] {Boolean.valueOf(n10266PgblMtr), A10266PgblMtr, Boolean.valueOf(n10267PgblKgm), A10267PgblKgm, A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A5362IntCodF)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREGBL");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREGBL"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate17L1392( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey17L1392( ) ;
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
            endLevel17L1392( ) ;
         }
      }
      closeExtendedTableCursors17L1392( ) ;
   }

   public void deferredUpdate17L1392( )
   {
   }

   public void delete17L1392( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17L1392( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17L1392( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17L1392( ) ;
         afterConfirm17L1392( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17L1392( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017L30 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A5362IntCodF)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREGBL");
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
      sMode1392 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17L1392( ) ;
      Gx_mode = sMode1392 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17L1392( )
   {
      standaloneModal17L1392( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T017L31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Byte.valueOf(A5362IntCodF)});
         A5363IntDscF = T017L31_A5363IntDscF[0] ;
         n5363IntDscF = T017L31_n5363IntDscF[0] ;
         pr_default.close(29);
      }
   }

   public void endLevel17L1392( )
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

   public void scanStart17L1392( )
   {
      /* Scan By routine */
      /* Using cursor T017L32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      RcdFound1392 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1392 = (short)(1) ;
         A5362IntCodF = T017L32_A5362IntCodF[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17L1392( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1392 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1392 = (short)(1) ;
         A5362IntCodF = T017L32_A5362IntCodF[0] ;
      }
   }

   public void scanEnd17L1392( )
   {
      pr_default.close(30);
   }

   public void afterConfirm17L1392( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17L1392( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17L1392( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17L1392( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17L1392( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17L1392( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17L1392( )
   {
      edtIntCodF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtIntDscF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDscF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDscF_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPgblMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPgblMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPgblMtr_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPgblKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPgblKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPgblKgm_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes17L1392( )
   {
   }

   public void send_integrity_lvl_hashes17L212( )
   {
   }

   public void subsflControlProps_601392( )
   {
      edtavnRcdDeleted_1392_Internalname = "vNRCDDELETED_1392_"+sGXsfl_60_idx ;
      edtIntCodF_Internalname = "INTCODF_"+sGXsfl_60_idx ;
      edtIntDscF_Internalname = "INTDSCF_"+sGXsfl_60_idx ;
      edtPgblMtr_Internalname = "PGBLMTR_"+sGXsfl_60_idx ;
      edtPgblKgm_Internalname = "PGBLKGM_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601392( )
   {
      edtavnRcdDeleted_1392_Internalname = "vNRCDDELETED_1392_"+sGXsfl_60_fel_idx ;
      edtIntCodF_Internalname = "INTCODF_"+sGXsfl_60_fel_idx ;
      edtIntDscF_Internalname = "INTDSCF_"+sGXsfl_60_fel_idx ;
      edtPgblMtr_Internalname = "PGBLMTR_"+sGXsfl_60_fel_idx ;
      edtPgblKgm_Internalname = "PGBLKGM_"+sGXsfl_60_fel_idx ;
   }

   public void addRow17L1392( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601392( ) ;
      sendRow17L1392( ) ;
   }

   public void sendRow17L1392( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1392_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1392_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1392_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1392), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1392), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1392_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1392_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1392_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntCodF_Internalname,GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5362IntCodF), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntCodF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtIntCodF_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDscF_Internalname,GXutil.rtrim( A5363IntDscF),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntDscF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtIntDscF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1392_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPgblMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A10266PgblMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPgblMtr_Enabled!=0) ? localUtil.format( A10266PgblMtr, "ZZZZZZ9.999") : localUtil.format( A10266PgblMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPgblMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPgblMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1392_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPgblKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A10267PgblKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPgblKgm_Enabled!=0) ? localUtil.format( A10267PgblKgm, "ZZZZZZ9.999") : localUtil.format( A10267PgblKgm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPgblKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPgblKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes17L1392( ) ;
      GXCCtl = "Z5362IntCodF_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10266PgblMtr_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10266PgblMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10267PgblKgm_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10267PgblKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1392_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1392_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1392_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1392, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV31EmprCod));
      GXCCtl = "vTAB_ART_" + sGXsfl_60_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV36Tab_art);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV36Tab_art);
      }
      GXCCtl = "vTAB_PR_" + sGXsfl_60_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV37Tab_pr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV37Tab_pr);
      }
      GXCCtl = "MODO_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1392_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1392_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTCODF_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCodF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTDSCF_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDscF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PGBLMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPgblMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PGBLKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPgblKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow17L1392( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601392( ) ;
      edtavnRcdDeleted_1392_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1392_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntCodF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTCODF_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntDscF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTDSCF_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPgblMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PGBLMTR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPgblKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PGBLKGM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1392_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1392_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1392");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1392_Internalname ;
         wbErr = true ;
         nRcdDeleted_1392 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1392 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1392_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCodF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCodF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "INTCODF_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCodF_Internalname ;
         wbErr = true ;
         A5362IntCodF = (byte)(0) ;
      }
      else
      {
         A5362IntCodF = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCodF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5363IntDscF = httpContext.cgiGet( edtIntDscF_Internalname) ;
      n5363IntDscF = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPgblMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPgblMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PGBLMTR_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPgblMtr_Internalname ;
         wbErr = true ;
         A10266PgblMtr = DecimalUtil.ZERO ;
         n10266PgblMtr = false ;
      }
      else
      {
         A10266PgblMtr = localUtil.ctond( httpContext.cgiGet( edtPgblMtr_Internalname)) ;
         n10266PgblMtr = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPgblKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPgblKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PGBLKGM_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPgblKgm_Internalname ;
         wbErr = true ;
         A10267PgblKgm = DecimalUtil.ZERO ;
         n10267PgblKgm = false ;
      }
      else
      {
         A10267PgblKgm = localUtil.ctond( httpContext.cgiGet( edtPgblKgm_Internalname)) ;
         n10267PgblKgm = false ;
      }
      GXCCtl = "Z5362IntCodF_" + sGXsfl_60_idx ;
      Z5362IntCodF = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10266PgblMtr_" + sGXsfl_60_idx ;
      Z10266PgblMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10267PgblKgm_" + sGXsfl_60_idx ;
      Z10267PgblKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1392_" + sGXsfl_60_idx ;
      nRcdDeleted_1392 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1392_" + sGXsfl_60_idx ;
      nRcdExists_1392 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1392_" + sGXsfl_60_idx ;
      nIsMod_1392 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "MODO_" + sGXsfl_60_idx ;
      AV20Modo = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtIntCodF_Enabled = edtIntCodF_Enabled ;
   }

   public void confirmValues17L0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601392( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601392( ) ;
         httpContext.changePostValue( "Z5362IntCodF_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5362IntCodF_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5362IntCodF_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10266PgblMtr_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10266PgblMtr_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10266PgblMtr_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10267PgblKgm_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10267PgblKgm_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10267PgblKgm_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpregbl", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1504CliProCod", GXutil.rtrim( Z1504CliProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV31EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_ART", AV36Tab_art);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_ART", AV36Tab_art);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_PR", AV37Tab_pr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_PR", AV37Tab_pr);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV20Modo));
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
      return formatLink("app.tpregbl", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPREGBL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PREÇO GLOBAL", "") ;
   }

   public void initializeNonKey17L212( )
   {
      A1505CliProDsc = "" ;
      n1505CliProDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
      A1506CliProBus = "" ;
      n1506CliProBus = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
   }

   public void initAll17L212( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1504CliProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKey17L212( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey17L1392( )
   {
      AV20Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      A5363IntDscF = "" ;
      n5363IntDscF = false ;
      A10266PgblMtr = DecimalUtil.ZERO ;
      n10266PgblMtr = false ;
      A10267PgblKgm = DecimalUtil.ZERO ;
      n10267PgblKgm = false ;
      Z10266PgblMtr = DecimalUtil.ZERO ;
      Z10267PgblKgm = DecimalUtil.ZERO ;
   }

   public void initAll17L1392( )
   {
      A5362IntCodF = (byte)(0) ;
      initializeNonKey17L1392( ) ;
   }

   public void standaloneModalInsert17L1392( )
   {
      AV20Modo = iV20Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241553011", true, true);
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
      httpContext.AddJavascriptSource("tpregbl.js", "?20268241553011", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1392( )
   {
      edtIntCodF_Enabled = defedtIntCodF_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1392, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1392_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCodF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5363IntDscF));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDscF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10266PgblMtr, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPgblMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10267PgblKgm, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPgblKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliProCod_Internalname = "CLIPROCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtArtCod_Internalname = "ARTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliProDsc_Internalname = "CLIPRODSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliProBus_Internalname = "CLIPROBUS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1392_Internalname = "vNRCDDELETED_1392" ;
      edtIntCodF_Internalname = "INTCODF" ;
      edtIntDscF_Internalname = "INTDSCF" ;
      edtPgblMtr_Internalname = "PGBLMTR" ;
      edtPgblKgm_Internalname = "PGBLKGM" ;
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
      Form.setCaption( httpContext.getMessage( "PREÇO GLOBAL", "") );
      edtPgblKgm_Jsonclick = "" ;
      edtPgblMtr_Jsonclick = "" ;
      edtIntDscF_Jsonclick = "" ;
      edtIntCodF_Jsonclick = "" ;
      edtavnRcdDeleted_1392_Jsonclick = "" ;
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
      edtPgblKgm_Enabled = 1 ;
      edtPgblMtr_Enabled = 1 ;
      edtIntDscF_Enabled = 0 ;
      edtIntCodF_Enabled = 1 ;
      edtavnRcdDeleted_1392_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCliProBus_Jsonclick = "" ;
      edtCliProBus_Backcolor = (int)(0xFFFFFF) ;
      edtCliProBus_Enabled = 0 ;
      edtCliProDsc_Jsonclick = "" ;
      edtCliProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCliProDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
      edtCliProCod_Jsonclick = "" ;
      edtCliProCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliProCod_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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
      subsflControlProps_601392( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal17L1392( ) ;
         standaloneModal17L1392( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow17L1392( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601392( ) ;
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
      /* Using cursor T017L33 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017L33_A407EmprNom[0] ;
      n407EmprNom = T017L33_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(31);
      /* Using cursor T017L20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T017L20_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(18);
      /* Using cursor T017L21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1505CliProDsc = T017L21_A1505CliProDsc[0] ;
         n1505CliProDsc = T017L21_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T017L21_A1506CliProBus[0] ;
         n1506CliProBus = T017L21_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
      }
      else
      {
         A1506CliProBus = "XXXXXXXX" ;
         n1506CliProBus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         A1505CliProDsc = "                            " ;
         n1505CliProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
      }
      pr_default.close(19);
      /* Using cursor T017L34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(32);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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
      /* Using cursor T017L20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T017L20_A279CliNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Cliprocod( )
   {
      n1505CliProDsc = false ;
      n1506CliProBus = false ;
      /* Using cursor T017L21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1505CliProDsc = T017L21_A1505CliProDsc[0] ;
         n1505CliProDsc = T017L21_n1505CliProDsc[0] ;
         A1506CliProBus = T017L21_A1506CliProBus[0] ;
         n1506CliProBus = T017L21_n1506CliProBus[0] ;
      }
      else
      {
         A1506CliProBus = "XXXXXXXX" ;
         n1506CliProBus = false ;
         A1505CliProDsc = "                            " ;
         n1505CliProDsc = false ;
      }
      pr_default.close(19);
      if ( true /* After */ && ( GXutil.strcmp(A1506CliProBus, "XXXXXXXX") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proceso", ""), 1, "CLIPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliProCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", GXutil.rtrim( A1505CliProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", GXutil.rtrim( A1506CliProBus));
   }

   public void valid_Artcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T017L34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", GXutil.rtrim( A1505CliProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", GXutil.rtrim( A1506CliProBus));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1504CliProCod", GXutil.rtrim( Z1504CliProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1505CliProDsc", GXutil.rtrim( Z1505CliProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1506CliProBus", GXutil.rtrim( Z1506CliProBus));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Intcodf( )
   {
      n5363IntDscF = false ;
      /* Using cursor T017L31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCODF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCodF_Internalname ;
      }
      A5363IntDscF = T017L31_A5363IntDscF[0] ;
      n5363IntDscF = T017L31_n5363IntDscF[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", GXutil.rtrim( A5363IntDscF));
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
      setEventMetadata("'PROCESOS'","{handler:'e1217L2',iparms:[{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'PROCESOS'",",oparms:[{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DUPLICAR PREçO INT'","{handler:'e1317L2',iparms:[{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A5362IntCodF',fld:'INTCODF',pic:'Z9'}]");
      setEventMetadata("'DUPLICAR PREçO INT'",",oparms:[{av:'A5362IntCodF',fld:'INTCODF',pic:'Z9'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'INFORME'","{handler:'e1417L2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'AV36Tab_art',fld:'vTAB_ART',pic:''},{av:'AV37Tab_pr',fld:'vTAB_PR',pic:''}]");
      setEventMetadata("'INFORME'",",oparms:[{av:'AV37Tab_pr',fld:'vTAB_PR',pic:''},{av:'AV36Tab_art',fld:'vTAB_ART',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_CLIPROCOD","{handler:'valid_Cliprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''}]");
      setEventMetadata("VALID_CLIPROCOD",",oparms:[{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z1504CliProCod'},{av:'Z65ArtCod'},{av:'Z407EmprNom'},{av:'ZV17UsurCod'},{av:'Z279CliNom'},{av:'Z1505CliProDsc'},{av:'Z1506CliProBus'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_INTCODF","{handler:'valid_Intcodf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5362IntCodF',fld:'INTCODF',pic:'Z9'},{av:'A5363IntDscF',fld:'INTDSCF',pic:''}]");
      setEventMetadata("VALID_INTCODF",",oparms:[{av:'A5363IntDscF',fld:'INTDSCF',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Pgblkgm',iparms:[]");
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
      pr_default.close(29);
      pr_default.close(32);
      pr_default.close(18);
      pr_default.close(31);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z1504CliProCod = "" ;
      Z65ArtCod = "" ;
      Z10266PgblMtr = DecimalUtil.ZERO ;
      Z10267PgblKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1504CliProCod = "" ;
      A65ArtCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A1505CliProDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1506CliProBus = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1392 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV17UsurCod = "" ;
      AV20Modo = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode212 = "" ;
      GXCCtl = "" ;
      A5363IntDscF = "" ;
      A10266PgblMtr = DecimalUtil.ZERO ;
      A10267PgblKgm = DecimalUtil.ZERO ;
      AV19Lit0 = "" ;
      AV21LitFe = "" ;
      AV22lit1 = "" ;
      AV23lit2 = "" ;
      AV24lit3 = "" ;
      AV25lit4 = "" ;
      AV26lit5 = "" ;
      AV27lit6 = "" ;
      AV28lit7 = "" ;
      AV29Lit8 = "" ;
      AV30Lit9 = "" ;
      AV32Lit10 = "" ;
      GXt_char1 = "" ;
      AV18Station = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      AV36Tab_art = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV36Tab_art[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV37Tab_pr = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV37Tab_pr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z1505CliProDsc = "" ;
      Z1506CliProBus = "" ;
      T017L7_A407EmprNom = new String[] {""} ;
      T017L7_n407EmprNom = new boolean[] {false} ;
      T017L11_A758ProCod = new String[] {""} ;
      T017L11_A407EmprNom = new String[] {""} ;
      T017L11_n407EmprNom = new boolean[] {false} ;
      T017L11_A1504CliProCod = new String[] {""} ;
      T017L11_A279CliNom = new String[] {""} ;
      T017L11_A396EmprCod = new String[] {""} ;
      T017L11_A252CliCod = new int[1] ;
      T017L11_A65ArtCod = new String[] {""} ;
      T017L11_A1505CliProDsc = new String[] {""} ;
      T017L11_n1505CliProDsc = new boolean[] {false} ;
      T017L11_A1506CliProBus = new String[] {""} ;
      T017L11_n1506CliProBus = new boolean[] {false} ;
      T017L8_A279CliNom = new String[] {""} ;
      T017L10_A1505CliProDsc = new String[] {""} ;
      T017L10_n1505CliProDsc = new boolean[] {false} ;
      T017L10_A1506CliProBus = new String[] {""} ;
      T017L10_n1506CliProBus = new boolean[] {false} ;
      T017L9_A396EmprCod = new String[] {""} ;
      T017L12_A279CliNom = new String[] {""} ;
      T017L13_A1505CliProDsc = new String[] {""} ;
      T017L13_n1505CliProDsc = new boolean[] {false} ;
      T017L13_A1506CliProBus = new String[] {""} ;
      T017L13_n1506CliProBus = new boolean[] {false} ;
      T017L14_A396EmprCod = new String[] {""} ;
      T017L15_A396EmprCod = new String[] {""} ;
      T017L15_A252CliCod = new int[1] ;
      T017L15_A1504CliProCod = new String[] {""} ;
      T017L15_A65ArtCod = new String[] {""} ;
      T017L6_A1504CliProCod = new String[] {""} ;
      T017L6_A396EmprCod = new String[] {""} ;
      T017L6_A252CliCod = new int[1] ;
      T017L6_A65ArtCod = new String[] {""} ;
      T017L16_A1504CliProCod = new String[] {""} ;
      T017L16_A396EmprCod = new String[] {""} ;
      T017L16_A252CliCod = new int[1] ;
      T017L16_A65ArtCod = new String[] {""} ;
      T017L17_A1504CliProCod = new String[] {""} ;
      T017L17_A396EmprCod = new String[] {""} ;
      T017L17_A252CliCod = new int[1] ;
      T017L17_A65ArtCod = new String[] {""} ;
      T017L5_A1504CliProCod = new String[] {""} ;
      T017L5_A396EmprCod = new String[] {""} ;
      T017L5_A252CliCod = new int[1] ;
      T017L5_A65ArtCod = new String[] {""} ;
      T017L20_A279CliNom = new String[] {""} ;
      T017L21_A1505CliProDsc = new String[] {""} ;
      T017L21_n1505CliProDsc = new boolean[] {false} ;
      T017L21_A1506CliProBus = new String[] {""} ;
      T017L21_n1506CliProBus = new boolean[] {false} ;
      T017L22_A396EmprCod = new String[] {""} ;
      T017L22_A252CliCod = new int[1] ;
      T017L22_A1504CliProCod = new String[] {""} ;
      T017L22_A65ArtCod = new String[] {""} ;
      T017L22_A7425Clarprnl = new short[1] ;
      T017L23_A396EmprCod = new String[] {""} ;
      T017L23_A252CliCod = new int[1] ;
      T017L23_A1504CliProCod = new String[] {""} ;
      T017L23_A65ArtCod = new String[] {""} ;
      T017L23_A583IntCod = new byte[1] ;
      T017L24_A396EmprCod = new String[] {""} ;
      T017L24_A252CliCod = new int[1] ;
      T017L24_A1504CliProCod = new String[] {""} ;
      T017L24_A65ArtCod = new String[] {""} ;
      Z5363IntDscF = "" ;
      T017L25_A252CliCod = new int[1] ;
      T017L25_A1504CliProCod = new String[] {""} ;
      T017L25_A65ArtCod = new String[] {""} ;
      T017L25_A5363IntDscF = new String[] {""} ;
      T017L25_n5363IntDscF = new boolean[] {false} ;
      T017L25_A10266PgblMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017L25_n10266PgblMtr = new boolean[] {false} ;
      T017L25_A10267PgblKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017L25_n10267PgblKgm = new boolean[] {false} ;
      T017L25_A396EmprCod = new String[] {""} ;
      T017L25_A5362IntCodF = new byte[1] ;
      T017L4_A5363IntDscF = new String[] {""} ;
      T017L4_n5363IntDscF = new boolean[] {false} ;
      T017L26_A5363IntDscF = new String[] {""} ;
      T017L26_n5363IntDscF = new boolean[] {false} ;
      T017L27_A396EmprCod = new String[] {""} ;
      T017L27_A252CliCod = new int[1] ;
      T017L27_A1504CliProCod = new String[] {""} ;
      T017L27_A65ArtCod = new String[] {""} ;
      T017L27_A5362IntCodF = new byte[1] ;
      T017L3_A252CliCod = new int[1] ;
      T017L3_A1504CliProCod = new String[] {""} ;
      T017L3_A65ArtCod = new String[] {""} ;
      T017L3_A10266PgblMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017L3_n10266PgblMtr = new boolean[] {false} ;
      T017L3_A10267PgblKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017L3_n10267PgblKgm = new boolean[] {false} ;
      T017L3_A396EmprCod = new String[] {""} ;
      T017L3_A5362IntCodF = new byte[1] ;
      T017L2_A252CliCod = new int[1] ;
      T017L2_A1504CliProCod = new String[] {""} ;
      T017L2_A65ArtCod = new String[] {""} ;
      T017L2_A10266PgblMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017L2_n10266PgblMtr = new boolean[] {false} ;
      T017L2_A10267PgblKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017L2_n10267PgblKgm = new boolean[] {false} ;
      T017L2_A396EmprCod = new String[] {""} ;
      T017L2_A5362IntCodF = new byte[1] ;
      T017L31_A5363IntDscF = new String[] {""} ;
      T017L31_n5363IntDscF = new boolean[] {false} ;
      T017L32_A396EmprCod = new String[] {""} ;
      T017L32_A252CliCod = new int[1] ;
      T017L32_A1504CliProCod = new String[] {""} ;
      T017L32_A65ArtCod = new String[] {""} ;
      T017L32_A5362IntCodF = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      AV31EmprCod = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV20Modo = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017L33_A407EmprNom = new String[] {""} ;
      T017L33_n407EmprNom = new boolean[] {false} ;
      T017L34_A396EmprCod = new String[] {""} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ1504CliProCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ407EmprNom = "" ;
      ZZV17UsurCod = "" ;
      ZZ279CliNom = "" ;
      ZZ1505CliProDsc = "" ;
      ZZ1506CliProBus = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpregbl__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpregbl__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpregbl__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpregbl__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpregbl__default(),
         new Object[] {
             new Object[] {
            T017L2_A252CliCod, T017L2_A1504CliProCod, T017L2_A65ArtCod, T017L2_A10266PgblMtr, T017L2_n10266PgblMtr, T017L2_A10267PgblKgm, T017L2_n10267PgblKgm, T017L2_A396EmprCod, T017L2_A5362IntCodF
            }
            , new Object[] {
            T017L3_A252CliCod, T017L3_A1504CliProCod, T017L3_A65ArtCod, T017L3_A10266PgblMtr, T017L3_n10266PgblMtr, T017L3_A10267PgblKgm, T017L3_n10267PgblKgm, T017L3_A396EmprCod, T017L3_A5362IntCodF
            }
            , new Object[] {
            T017L4_A5363IntDscF, T017L4_n5363IntDscF
            }
            , new Object[] {
            T017L5_A1504CliProCod, T017L5_A396EmprCod, T017L5_A252CliCod, T017L5_A65ArtCod
            }
            , new Object[] {
            T017L6_A1504CliProCod, T017L6_A396EmprCod, T017L6_A252CliCod, T017L6_A65ArtCod
            }
            , new Object[] {
            T017L7_A407EmprNom, T017L7_n407EmprNom
            }
            , new Object[] {
            T017L8_A279CliNom
            }
            , new Object[] {
            T017L9_A396EmprCod
            }
            , new Object[] {
            T017L10_A1505CliProDsc, T017L10_n1505CliProDsc, T017L10_A1506CliProBus, T017L10_n1506CliProBus
            }
            , new Object[] {
            T017L11_A758ProCod, T017L11_A407EmprNom, T017L11_n407EmprNom, T017L11_A1504CliProCod, T017L11_A279CliNom, T017L11_A396EmprCod, T017L11_A252CliCod, T017L11_A65ArtCod, T017L11_A1505CliProDsc, T017L11_n1505CliProDsc,
            T017L11_A1506CliProBus, T017L11_n1506CliProBus
            }
            , new Object[] {
            T017L12_A279CliNom
            }
            , new Object[] {
            T017L13_A1505CliProDsc, T017L13_n1505CliProDsc, T017L13_A1506CliProBus, T017L13_n1506CliProBus
            }
            , new Object[] {
            T017L14_A396EmprCod
            }
            , new Object[] {
            T017L15_A396EmprCod, T017L15_A252CliCod, T017L15_A1504CliProCod, T017L15_A65ArtCod
            }
            , new Object[] {
            T017L16_A1504CliProCod, T017L16_A396EmprCod, T017L16_A252CliCod, T017L16_A65ArtCod
            }
            , new Object[] {
            T017L17_A1504CliProCod, T017L17_A396EmprCod, T017L17_A252CliCod, T017L17_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017L20_A279CliNom
            }
            , new Object[] {
            T017L21_A1505CliProDsc, T017L21_n1505CliProDsc, T017L21_A1506CliProBus, T017L21_n1506CliProBus
            }
            , new Object[] {
            T017L22_A396EmprCod, T017L22_A252CliCod, T017L22_A1504CliProCod, T017L22_A65ArtCod, T017L22_A7425Clarprnl
            }
            , new Object[] {
            T017L23_A396EmprCod, T017L23_A252CliCod, T017L23_A1504CliProCod, T017L23_A65ArtCod, T017L23_A583IntCod
            }
            , new Object[] {
            T017L24_A396EmprCod, T017L24_A252CliCod, T017L24_A1504CliProCod, T017L24_A65ArtCod
            }
            , new Object[] {
            T017L25_A252CliCod, T017L25_A1504CliProCod, T017L25_A65ArtCod, T017L25_A5363IntDscF, T017L25_n5363IntDscF, T017L25_A10266PgblMtr, T017L25_n10266PgblMtr, T017L25_A10267PgblKgm, T017L25_n10267PgblKgm, T017L25_A396EmprCod,
            T017L25_A5362IntCodF
            }
            , new Object[] {
            T017L26_A5363IntDscF, T017L26_n5363IntDscF
            }
            , new Object[] {
            T017L27_A396EmprCod, T017L27_A252CliCod, T017L27_A1504CliProCod, T017L27_A65ArtCod, T017L27_A5362IntCodF
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017L31_A5363IntDscF, T017L31_n5363IntDscF
            }
            , new Object[] {
            T017L32_A396EmprCod, T017L32_A252CliCod, T017L32_A1504CliProCod, T017L32_A65ArtCod, T017L32_A5362IntCodF
            }
            , new Object[] {
            T017L33_A407EmprNom, T017L33_n407EmprNom
            }
            , new Object[] {
            T017L34_A396EmprCod
            }
         }
      );
      A407EmprNom = "" ;
      n407EmprNom = false ;
      Z407EmprNom = "" ;
      n407EmprNom = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z5362IntCodF ;
   private byte GxWebError ;
   private byte A5362IntCodF ;
   private byte nKeyPressed ;
   private byte AV34Tintex ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1392 ;
   private short nRcdExists_1392 ;
   private short nIsMod_1392 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1392 ;
   private short RcdFound1392 ;
   private short nBlankRcdUsr1392 ;
   private short RcdFound212 ;
   private short nIsDirty_212 ;
   private short nIsDirty_1392 ;
   private int Z252CliCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliProCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtCliProDsc_Enabled ;
   private int edtCliProBus_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1392_Enabled ;
   private int edtIntCodF_Enabled ;
   private int edtIntDscF_Enabled ;
   private int edtPgblMtr_Enabled ;
   private int edtPgblKgm_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int7[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtIntCodF_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliProBus_Backcolor ;
   private int edtCliProDsc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliProCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int GX_I ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10266PgblMtr ;
   private java.math.BigDecimal Z10267PgblKgm ;
   private java.math.BigDecimal A10266PgblMtr ;
   private java.math.BigDecimal A10267PgblKgm ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z1504CliProCod ;
   private String Z65ArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1504CliProCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliProCod_Internalname ;
   private String edtCliProCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliProDsc_Internalname ;
   private String A1505CliProDsc ;
   private String edtCliProDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliProBus_Internalname ;
   private String A1506CliProBus ;
   private String edtCliProBus_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1392 ;
   private String edtavnRcdDeleted_1392_Internalname ;
   private String edtIntCodF_Internalname ;
   private String edtIntDscF_Internalname ;
   private String edtPgblMtr_Internalname ;
   private String edtPgblKgm_Internalname ;
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
   private String AV17UsurCod ;
   private String AV20Modo ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode212 ;
   private String GXCCtl ;
   private String A5363IntDscF ;
   private String AV19Lit0 ;
   private String AV21LitFe ;
   private String AV22lit1 ;
   private String AV23lit2 ;
   private String AV24lit3 ;
   private String AV25lit4 ;
   private String AV26lit5 ;
   private String AV27lit6 ;
   private String AV28lit7 ;
   private String AV29Lit8 ;
   private String AV30Lit9 ;
   private String AV32Lit10 ;
   private String GXt_char1 ;
   private String AV18Station ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV36Tab_art[] ;
   private String AV37Tab_pr[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z1505CliProDsc ;
   private String Z1506CliProBus ;
   private String Z5363IntDscF ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1392_Jsonclick ;
   private String edtIntCodF_Jsonclick ;
   private String edtIntDscF_Jsonclick ;
   private String edtPgblMtr_Jsonclick ;
   private String edtPgblKgm_Jsonclick ;
   private String AV31EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV20Modo ;
   private String subGrid1_Header ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ1504CliProCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZV17UsurCod ;
   private String ZZ279CliNom ;
   private String ZZ1505CliProDsc ;
   private String ZZ1506CliProBus ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n1505CliProDsc ;
   private boolean n1506CliProBus ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n5363IntDscF ;
   private boolean n10266PgblMtr ;
   private boolean n10267PgblKgm ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T017L7_A407EmprNom ;
   private boolean[] T017L7_n407EmprNom ;
   private String[] T017L11_A758ProCod ;
   private String[] T017L11_A407EmprNom ;
   private boolean[] T017L11_n407EmprNom ;
   private String[] T017L11_A1504CliProCod ;
   private String[] T017L11_A279CliNom ;
   private String[] T017L11_A396EmprCod ;
   private int[] T017L11_A252CliCod ;
   private String[] T017L11_A65ArtCod ;
   private String[] T017L11_A1505CliProDsc ;
   private boolean[] T017L11_n1505CliProDsc ;
   private String[] T017L11_A1506CliProBus ;
   private boolean[] T017L11_n1506CliProBus ;
   private String[] T017L8_A279CliNom ;
   private String[] T017L10_A1505CliProDsc ;
   private boolean[] T017L10_n1505CliProDsc ;
   private String[] T017L10_A1506CliProBus ;
   private boolean[] T017L10_n1506CliProBus ;
   private String[] T017L9_A396EmprCod ;
   private String[] T017L12_A279CliNom ;
   private String[] T017L13_A1505CliProDsc ;
   private boolean[] T017L13_n1505CliProDsc ;
   private String[] T017L13_A1506CliProBus ;
   private boolean[] T017L13_n1506CliProBus ;
   private String[] T017L14_A396EmprCod ;
   private String[] T017L15_A396EmprCod ;
   private int[] T017L15_A252CliCod ;
   private String[] T017L15_A1504CliProCod ;
   private String[] T017L15_A65ArtCod ;
   private String[] T017L6_A1504CliProCod ;
   private String[] T017L6_A396EmprCod ;
   private int[] T017L6_A252CliCod ;
   private String[] T017L6_A65ArtCod ;
   private String[] T017L16_A1504CliProCod ;
   private String[] T017L16_A396EmprCod ;
   private int[] T017L16_A252CliCod ;
   private String[] T017L16_A65ArtCod ;
   private String[] T017L17_A1504CliProCod ;
   private String[] T017L17_A396EmprCod ;
   private int[] T017L17_A252CliCod ;
   private String[] T017L17_A65ArtCod ;
   private String[] T017L5_A1504CliProCod ;
   private String[] T017L5_A396EmprCod ;
   private int[] T017L5_A252CliCod ;
   private String[] T017L5_A65ArtCod ;
   private String[] T017L20_A279CliNom ;
   private String[] T017L21_A1505CliProDsc ;
   private boolean[] T017L21_n1505CliProDsc ;
   private String[] T017L21_A1506CliProBus ;
   private boolean[] T017L21_n1506CliProBus ;
   private String[] T017L22_A396EmprCod ;
   private int[] T017L22_A252CliCod ;
   private String[] T017L22_A1504CliProCod ;
   private String[] T017L22_A65ArtCod ;
   private short[] T017L22_A7425Clarprnl ;
   private String[] T017L23_A396EmprCod ;
   private int[] T017L23_A252CliCod ;
   private String[] T017L23_A1504CliProCod ;
   private String[] T017L23_A65ArtCod ;
   private byte[] T017L23_A583IntCod ;
   private String[] T017L24_A396EmprCod ;
   private int[] T017L24_A252CliCod ;
   private String[] T017L24_A1504CliProCod ;
   private String[] T017L24_A65ArtCod ;
   private int[] T017L25_A252CliCod ;
   private String[] T017L25_A1504CliProCod ;
   private String[] T017L25_A65ArtCod ;
   private String[] T017L25_A5363IntDscF ;
   private boolean[] T017L25_n5363IntDscF ;
   private java.math.BigDecimal[] T017L25_A10266PgblMtr ;
   private boolean[] T017L25_n10266PgblMtr ;
   private java.math.BigDecimal[] T017L25_A10267PgblKgm ;
   private boolean[] T017L25_n10267PgblKgm ;
   private String[] T017L25_A396EmprCod ;
   private byte[] T017L25_A5362IntCodF ;
   private String[] T017L4_A5363IntDscF ;
   private boolean[] T017L4_n5363IntDscF ;
   private String[] T017L26_A5363IntDscF ;
   private boolean[] T017L26_n5363IntDscF ;
   private String[] T017L27_A396EmprCod ;
   private int[] T017L27_A252CliCod ;
   private String[] T017L27_A1504CliProCod ;
   private String[] T017L27_A65ArtCod ;
   private byte[] T017L27_A5362IntCodF ;
   private int[] T017L3_A252CliCod ;
   private String[] T017L3_A1504CliProCod ;
   private String[] T017L3_A65ArtCod ;
   private java.math.BigDecimal[] T017L3_A10266PgblMtr ;
   private boolean[] T017L3_n10266PgblMtr ;
   private java.math.BigDecimal[] T017L3_A10267PgblKgm ;
   private boolean[] T017L3_n10267PgblKgm ;
   private String[] T017L3_A396EmprCod ;
   private byte[] T017L3_A5362IntCodF ;
   private int[] T017L2_A252CliCod ;
   private String[] T017L2_A1504CliProCod ;
   private String[] T017L2_A65ArtCod ;
   private java.math.BigDecimal[] T017L2_A10266PgblMtr ;
   private boolean[] T017L2_n10266PgblMtr ;
   private java.math.BigDecimal[] T017L2_A10267PgblKgm ;
   private boolean[] T017L2_n10267PgblKgm ;
   private String[] T017L2_A396EmprCod ;
   private byte[] T017L2_A5362IntCodF ;
   private String[] T017L31_A5363IntDscF ;
   private boolean[] T017L31_n5363IntDscF ;
   private String[] T017L32_A396EmprCod ;
   private int[] T017L32_A252CliCod ;
   private String[] T017L32_A1504CliProCod ;
   private String[] T017L32_A65ArtCod ;
   private byte[] T017L32_A5362IntCodF ;
   private String[] T017L33_A407EmprNom ;
   private boolean[] T017L33_n407EmprNom ;
   private String[] T017L34_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpregbl__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpregbl__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpregbl__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpregbl__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpregbl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017L2", "SELECT CliCod, CliProCod, ArtCod, PgblMtr, PgblKgm, EmprCod, IntCodF FROM TXPPREGBL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCodF = ?  FOR UPDATE OF PgblMtr, PgblKgm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L3", "SELECT CliCod, CliProCod, ArtCod, PgblMtr, PgblKgm, EmprCod, IntCodF FROM TXPPREGBL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L4", "SELECT IntDscF FROM TXPINTFAC WHERE EmprCod = ? AND IntCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L5", "SELECT CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?  FOR UPDATE OF CliProCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L6", "SELECT CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L9", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L10", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L11", "SELECT /*+ FIRST_ROWS(100) */ T4.ProCod, T2.EmprNom, TM1.CliProCod, T3.CliNom, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, COALESCE( T4.ProDsc, '                            ') AS CliProDsc, COALESCE( T4.ProCod, 'XXXXXXXX') AS CliProBus FROM (((TXPCPREPR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPPROCES T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProCod = TM1.CliProCod) WHERE TM1.CliProCod = ? and TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.CliProCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L12", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L13", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L14", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE ( CliProCod > ? or CliProCod = ? and CliCod > ? or CliCod = ? and CliProCod = ? and ArtCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017L17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE ( CliProCod < ? or CliProCod = ? and CliCod < ? or CliCod = ? and CliProCod = ? and ArtCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, CliProCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017L18", "INSERT INTO TXPCPREPR(CliProCod, EmprCod, CliCod, ArtCod, Clpratpk, Clpratpm, ProPreAct, ProFecAnt, ProPreAnt, ProFecAct, ProDscMtr, ProDscKgm, ProFecCri, ProPreEst, ClarprUl) VALUES(?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0)", GX_NOMASK, "TXPCPREPR")
         ,new UpdateCursor("T017L19", "DELETE FROM TXPCPREPR  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?", GX_NOMASK, "TXPCPREPR")
         ,new ForEachCursor("T017L20", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L21", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L22", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, Clarprnl FROM TXPCLARPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017L23", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017L24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L25", "SELECT T1.CliCod, T1.CliProCod, T1.ArtCod, T2.IntDscF, T1.PgblMtr, T1.PgblKgm, T1.EmprCod, T1.IntCodF FROM (TXPPREGBL T1 INNER JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliProCod = ? and T1.ArtCod = ? and T1.IntCodF = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliProCod, T1.ArtCod, T1.IntCodF ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L26", "SELECT IntDscF FROM TXPINTFAC WHERE EmprCod = ? AND IntCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L27", "SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCodF FROM TXPPREGBL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017L28", "INSERT INTO TXPPREGBL(CliCod, CliProCod, ArtCod, PgblMtr, PgblKgm, EmprCod, IntCodF) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPREGBL")
         ,new UpdateCursor("T017L29", "UPDATE TXPPREGBL SET PgblMtr=?, PgblKgm=?  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCodF = ?", GX_NOMASK, "TXPPREGBL")
         ,new UpdateCursor("T017L30", "DELETE FROM TXPPREGBL  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCodF = ?", GX_NOMASK, "TXPPREGBL")
         ,new ForEachCursor("T017L31", "SELECT IntDscF FROM TXPINTFAC WHERE EmprCod = ? AND IntCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L32", "SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCodF FROM TXPPREGBL WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCodF ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L33", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017L34", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 16);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

