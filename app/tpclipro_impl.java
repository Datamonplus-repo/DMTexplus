package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpclipro_impl extends GXDataArea
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
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A583IntCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO CLIENTE-ART-PROCESO PARM", ""), (short)(0)) ;
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
      edtIntDsc_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Title", edtIntDsc_Title, !bGXsfl_60_Refreshing);
      edtProPreKgm_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreKgm_Internalname, "Title", edtProPreKgm_Title, !bGXsfl_60_Refreshing);
      edtProPreMtr_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreMtr_Internalname, "Title", edtProPreMtr_Title, !bGXsfl_60_Refreshing);
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

   public tpclipro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpclipro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpclipro_impl.class ));
   }

   public tpclipro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpCLIPRO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProCod_Internalname, GXutil.rtrim( A1504CliProCod), GXutil.rtrim( localUtil.format( A1504CliProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripción Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProDsc_Internalname, GXutil.rtrim( A1505CliProDsc), GXutil.rtrim( localUtil.format( A1505CliProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCliProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Busqueda Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProBus_Internalname, GXutil.rtrim( A1506CliProBus), GXutil.rtrim( localUtil.format( A1506CliProBus, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProBus_Jsonclick, 0, "", "", "", "", "", 1, edtCliProBus_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpCLIPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpCLIPRO.htm");
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
         nBlankRcdCount213 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_213 = (short)(1) ;
            scanStart18P213( ) ;
            while ( RcdFound213 != 0 )
            {
               init_level_properties213( ) ;
               getByPrimaryKey18P213( ) ;
               addRow18P213( ) ;
               scanNext18P213( ) ;
            }
            scanEnd18P213( ) ;
            nBlankRcdCount213 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal18P213( ) ;
         standaloneModal18P213( ) ;
         sMode213 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow18P213( ) ;
            edtavnRcdDeleted_213_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_213_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_213_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_213_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtIntCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtIntDsc_Title = httpContext.cgiGet( "INTDSC_"+sGXsfl_60_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Title", edtIntDsc_Title, !bGXsfl_60_Refreshing);
            edtIntDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtProPreMtr_Title = httpContext.cgiGet( "PROPREMTR_"+sGXsfl_60_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtProPreMtr_Internalname, "Title", edtProPreMtr_Title, !bGXsfl_60_Refreshing);
            edtProPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROPREMTR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPreMtr_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtProPreKgm_Title = httpContext.cgiGet( "PROPREKGM_"+sGXsfl_60_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtProPreKgm_Internalname, "Title", edtProPreKgm_Title, !bGXsfl_60_Refreshing);
            edtProPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROPREKGM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPreKgm_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_213 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal18P213( ) ;
            }
            sendRow18P213( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount213 = (short)(5) ;
         nRcdExists_213 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart18P213( ) ;
            while ( RcdFound213 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60213( ) ;
               init_level_properties213( ) ;
               standaloneNotModal18P213( ) ;
               getByPrimaryKey18P213( ) ;
               standaloneModal18P213( ) ;
               addRow18P213( ) ;
               scanNext18P213( ) ;
            }
            scanEnd18P213( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode213 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60213( ) ;
      initAll18P213( ) ;
      init_level_properties213( ) ;
      nRcdExists_213 = (short)(0) ;
      nIsMod_213 = (short)(0) ;
      nRcdDeleted_213 = (short)(0) ;
      nBlankRcdCount213 = (short)(nBlankRcdUsr213+nBlankRcdCount213) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount213 > 0 )
      {
         standaloneNotModal18P213( ) ;
         standaloneModal18P213( ) ;
         addRow18P213( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtIntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount213 = (short)(nBlankRcdCount213-1) ;
      }
      Gx_mode = sMode213 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpCLIPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpCLIPRO.htm");
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
      e1118P2 ();
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
                        e1118P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PROCESOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Procesos' */
                        e1218P2 ();
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
            initAll18P212( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_213_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_213_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes18P212( ) ;
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

   public void confirm_18P0( )
   {
      beforeValidate18P212( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18P212( ) ;
         }
         else
         {
            checkExtendedTable18P212( ) ;
            if ( AnyError == 0 )
            {
               zm18P212( 8) ;
               zm18P212( 9) ;
               zm18P212( 10) ;
               zm18P212( 11) ;
            }
            closeExtendedTableCursors18P212( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode212 = Gx_mode ;
         confirm_18P213( ) ;
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
         confirmValues18P0( ) ;
      }
   }

   public void confirm_18P213( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow18P213( ) ;
         if ( ( nRcdExists_213 != 0 ) || ( nIsMod_213 != 0 ) )
         {
            getKey18P213( ) ;
            if ( ( nRcdExists_213 == 0 ) && ( nRcdDeleted_213 == 0 ) )
            {
               if ( RcdFound213 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate18P213( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable18P213( ) ;
                     if ( AnyError == 0 )
                     {
                        zm18P213( 13) ;
                     }
                     closeExtendedTableCursors18P213( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "INTCOD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtIntCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound213 != 0 )
               {
                  if ( nRcdDeleted_213 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey18P213( ) ;
                     load18P213( ) ;
                     beforeValidate18P213( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls18P213( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_213 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate18P213( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable18P213( ) ;
                           if ( AnyError == 0 )
                           {
                              zm18P213( 13) ;
                           }
                           closeExtendedTableCursors18P213( ) ;
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
                  if ( nRcdDeleted_213 == 0 )
                  {
                     GXCCtl = "INTCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtIntCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_213_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc)) ;
         httpContext.changePostValue( edtProPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1464ProPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1465ProPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z583IntCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1464ProPreMtr_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1464ProPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1465ProPreKgm_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1465ProPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_213_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_213_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_213_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_213 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_213_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_213_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDSC_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtIntDsc_Title)) ;
            httpContext.changePostValue( "INTDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPREMTR_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProPreMtr_Title)) ;
            httpContext.changePostValue( "PROPREMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPREKGM_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProPreKgm_Title)) ;
            httpContext.changePostValue( "PROPREKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption18P0( )
   {
   }

   public void e1118P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char1 = AV21LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char1 = AV22lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22lit1", AV22lit1);
      GXt_char1 = AV23lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23lit2", AV23lit2);
      GXt_char1 = AV24lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24lit3", AV24lit3);
      GXt_char1 = AV25lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25lit4", AV25lit4);
      GXt_char1 = AV26lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT289_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26lit5", AV26lit5);
      GXt_char1 = AV27lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT291_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27lit6", AV27lit6);
      GXt_char1 = AV28lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28lit7", AV28lit7);
      GXt_char1 = AV29Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit8", AV29Lit8);
      GXt_char1 = AV30Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT331_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit9", AV30Lit9);
      GXt_char1 = AV32Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1152_", ""), (byte)(99), GXv_char2) ;
      tpclipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit10", AV32Lit10);
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A407EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpclipro_impl.this.A396EmprCod = GXv_char2[0] ;
      tpclipro_impl.this.A407EmprNom = GXv_char3[0] ;
      tpclipro_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      edtIntDsc_Title = AV25lit4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Title", edtIntDsc_Title, !bGXsfl_60_Refreshing);
      edtProPreKgm_Title = AV28lit7+" "+AV26lit5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreKgm_Internalname, "Title", edtProPreKgm_Title, !bGXsfl_60_Refreshing);
      edtProPreMtr_Title = AV29Lit8+" "+AV27lit6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreMtr_Internalname, "Title", edtProPreMtr_Title, !bGXsfl_60_Refreshing);
   }

   public void e1218P2( )
   {
      /* 'Procesos' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm18P212( int GX_JID )
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
      /* Using cursor T018P7 */
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

   public void load18P212( )
   {
      /* Using cursor T018P11 */
      pr_default.execute(9, new Object[] {A1504CliProCod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A279CliNom = T018P11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1505CliProDsc = T018P11_A1505CliProDsc[0] ;
         n1505CliProDsc = T018P11_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T018P11_A1506CliProBus[0] ;
         n1506CliProBus = T018P11_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         zm18P212( -7) ;
      }
      pr_default.close(9);
      onLoadActions18P212( ) ;
   }

   public void onLoadActions18P212( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable18P212( )
   {
      nIsDirty_212 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T018P8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T018P8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T018P10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A1505CliProDsc = T018P10_A1505CliProDsc[0] ;
         n1505CliProDsc = T018P10_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T018P10_A1506CliProBus[0] ;
         n1506CliProBus = T018P10_n1506CliProBus[0] ;
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
      /* Using cursor T018P9 */
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

   public void closeExtendedTableCursors18P212( )
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
      /* Using cursor T018P12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T018P12_A279CliNom[0] ;
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
      /* Using cursor T018P13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A1505CliProDsc = T018P13_A1505CliProDsc[0] ;
         n1505CliProDsc = T018P13_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T018P13_A1506CliProBus[0] ;
         n1506CliProBus = T018P13_n1506CliProBus[0] ;
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
      /* Using cursor T018P14 */
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

   public void getKey18P212( )
   {
      /* Using cursor T018P15 */
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
      /* Using cursor T018P6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T018P6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18P212( 7) ;
         RcdFound212 = (short)(1) ;
         A1504CliProCod = T018P6_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A252CliCod = T018P6_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T018P6_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         sMode212 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18P212( ) ;
         if ( AnyError == 1 )
         {
            RcdFound212 = (short)(0) ;
            initializeNonKey18P212( ) ;
         }
         Gx_mode = sMode212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound212 = (short)(0) ;
         initializeNonKey18P212( ) ;
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
      getKey18P212( ) ;
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
      /* Using cursor T018P16 */
      pr_default.execute(14, new Object[] {A1504CliProCod, A1504CliProCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T018P16_A1504CliProCod[0], A1504CliProCod) < 0 ) || ( GXutil.strcmp(T018P16_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T018P16_A252CliCod[0] < A252CliCod ) || ( T018P16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018P16_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T018P16_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T018P16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T018P16_A1504CliProCod[0], A1504CliProCod) > 0 ) || ( GXutil.strcmp(T018P16_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T018P16_A252CliCod[0] > A252CliCod ) || ( T018P16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018P16_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T018P16_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T018P16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1504CliProCod = T018P16_A1504CliProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A252CliCod = T018P16_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T018P16_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound212 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound212 = (short)(0) ;
      /* Using cursor T018P17 */
      pr_default.execute(15, new Object[] {A1504CliProCod, A1504CliProCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T018P17_A1504CliProCod[0], A1504CliProCod) > 0 ) || ( GXutil.strcmp(T018P17_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T018P17_A252CliCod[0] > A252CliCod ) || ( T018P17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018P17_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T018P17_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T018P17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T018P17_A1504CliProCod[0], A1504CliProCod) < 0 ) || ( GXutil.strcmp(T018P17_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T018P17_A252CliCod[0] < A252CliCod ) || ( T018P17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018P17_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T018P17_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T018P17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1504CliProCod = T018P17_A1504CliProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A252CliCod = T018P17_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T018P17_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound212 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18P212( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert18P212( ) ;
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
               update18P212( ) ;
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
               insert18P212( ) ;
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
                  insert18P212( ) ;
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
      getKey18P212( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpclipro");
   }

   public void insert_check( )
   {
      confirm_18P0( ) ;
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
      scanStart18P212( ) ;
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd18P212( ) ;
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
      scanStart18P212( ) ;
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound212 != 0 )
         {
            scanNext18P212( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd18P212( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18P212( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018P5 */
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

   public void insert18P212( )
   {
      beforeValidate18P212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18P212( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18P212( 0) ;
         checkOptimisticConcurrency18P212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18P212( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18P212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018P18 */
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
                        processLevel18P212( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption18P0( ) ;
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
            load18P212( ) ;
         }
         endLevel18P212( ) ;
      }
      closeExtendedTableCursors18P212( ) ;
   }

   public void update18P212( )
   {
      beforeValidate18P212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18P212( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18P212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18P212( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18P212( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCPREPR */
                  deferredUpdate18P212( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel18P212( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption18P0( ) ;
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
         endLevel18P212( ) ;
      }
      closeExtendedTableCursors18P212( ) ;
   }

   public void deferredUpdate18P212( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18P212( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18P212( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18P212( ) ;
         afterConfirm18P212( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18P212( ) ;
            if ( AnyError == 0 )
            {
               scanStart18P213( ) ;
               while ( RcdFound213 != 0 )
               {
                  getByPrimaryKey18P213( ) ;
                  delete18P213( ) ;
                  scanNext18P213( ) ;
               }
               scanEnd18P213( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018P19 */
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
                           initAll18P212( ) ;
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
                        resetCaption18P0( ) ;
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
      endLevel18P212( ) ;
      Gx_mode = sMode212 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18P212( )
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
         /* Using cursor T018P20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T018P20_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(18);
         /* Using cursor T018P21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A1505CliProDsc = T018P21_A1505CliProDsc[0] ;
            n1505CliProDsc = T018P21_n1505CliProDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
            A1506CliProBus = T018P21_A1506CliProBus[0] ;
            n1506CliProBus = T018P21_n1506CliProBus[0] ;
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
         /* Using cursor T018P22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPRc", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T018P23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREGBL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T018P24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void processNestedLevel18P213( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow18P213( ) ;
         if ( ( nRcdExists_213 != 0 ) || ( nIsMod_213 != 0 ) )
         {
            standaloneNotModal18P213( ) ;
            getKey18P213( ) ;
            if ( ( nRcdExists_213 == 0 ) && ( nRcdDeleted_213 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert18P213( ) ;
            }
            else
            {
               if ( RcdFound213 != 0 )
               {
                  if ( ( nRcdDeleted_213 != 0 ) && ( nRcdExists_213 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete18P213( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_213 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update18P213( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_213 == 0 )
                  {
                     GXCCtl = "INTCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtIntCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_213_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc)) ;
         httpContext.changePostValue( edtProPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1464ProPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1465ProPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z583IntCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1464ProPreMtr_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1464ProPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1465ProPreKgm_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1465ProPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_213_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_213_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_213_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_213 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_213_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_213_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDSC_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtIntDsc_Title)) ;
            httpContext.changePostValue( "INTDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPREMTR_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProPreMtr_Title)) ;
            httpContext.changePostValue( "PROPREMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPREKGM_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProPreKgm_Title)) ;
            httpContext.changePostValue( "PROPREKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll18P213( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_213 = (short)(0) ;
      nIsMod_213 = (short)(0) ;
      nRcdDeleted_213 = (short)(0) ;
   }

   public void processLevel18P212( )
   {
      /* Save parent mode. */
      sMode212 = Gx_mode ;
      processNestedLevel18P213( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode212 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel18P212( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete18P212( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpclipro");
         if ( AnyError == 0 )
         {
            confirmValues18P0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpclipro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18P212( )
   {
      /* Scan By routine */
      /* Using cursor T018P25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      RcdFound212 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A252CliCod = T018P25_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1504CliProCod = T018P25_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A65ArtCod = T018P25_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18P212( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound212 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A252CliCod = T018P25_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1504CliProCod = T018P25_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A65ArtCod = T018P25_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEnd18P212( )
   {
      pr_default.close(23);
   }

   public void afterConfirm18P212( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18P212( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18P212( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18P212( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18P212( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18P212( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18P212( )
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

   public void zm18P213( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1464ProPreMtr = T018P3_A1464ProPreMtr[0] ;
            Z1465ProPreKgm = T018P3_A1465ProPreKgm[0] ;
         }
         else
         {
            Z1464ProPreMtr = A1464ProPreMtr ;
            Z1465ProPreKgm = A1465ProPreKgm ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z1464ProPreMtr = A1464ProPreMtr ;
         Z1465ProPreKgm = A1465ProPreKgm ;
         Z396EmprCod = A396EmprCod ;
         Z583IntCod = A583IntCod ;
         Z584IntDsc = A584IntDsc ;
      }
   }

   public void standaloneNotModal18P213( )
   {
   }

   public void standaloneModal18P213( )
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
         edtIntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtIntCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load18P213( )
   {
      /* Using cursor T018P26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound213 = (short)(1) ;
         A584IntDsc = T018P26_A584IntDsc[0] ;
         n584IntDsc = T018P26_n584IntDsc[0] ;
         A1464ProPreMtr = T018P26_A1464ProPreMtr[0] ;
         n1464ProPreMtr = T018P26_n1464ProPreMtr[0] ;
         A1465ProPreKgm = T018P26_A1465ProPreKgm[0] ;
         n1465ProPreKgm = T018P26_n1465ProPreKgm[0] ;
         zm18P213( -12) ;
      }
      pr_default.close(24);
      onLoadActions18P213( ) ;
   }

   public void onLoadActions18P213( )
   {
   }

   public void checkExtendedTable18P213( )
   {
      nIsDirty_213 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal18P213( ) ;
      /* Using cursor T018P4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "INTCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T018P4_A584IntDsc[0] ;
      n584IntDsc = T018P4_n584IntDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors18P213( )
   {
      pr_default.close(2);
   }

   public void enableDisable18P213( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          byte A583IntCod )
   {
      /* Using cursor T018P27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "INTCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T018P27_A584IntDsc[0] ;
      n584IntDsc = T018P27_n584IntDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A584IntDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKey18P213( )
   {
      /* Using cursor T018P28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound213 = (short)(1) ;
      }
      else
      {
         RcdFound213 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey18P213( )
   {
      /* Using cursor T018P3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T018P3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18P213( 12) ;
         RcdFound213 = (short)(1) ;
         initializeNonKey18P213( ) ;
         A1464ProPreMtr = T018P3_A1464ProPreMtr[0] ;
         n1464ProPreMtr = T018P3_n1464ProPreMtr[0] ;
         A1465ProPreKgm = T018P3_A1465ProPreKgm[0] ;
         n1465ProPreKgm = T018P3_n1465ProPreKgm[0] ;
         A583IntCod = T018P3_A583IntCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z583IntCod = A583IntCod ;
         sMode213 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18P213( ) ;
         load18P213( ) ;
         Gx_mode = sMode213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound213 = (short)(0) ;
         initializeNonKey18P213( ) ;
         sMode213 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18P213( ) ;
         Gx_mode = sMode213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes18P213( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency18P213( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018P2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPREPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1464ProPreMtr, T018P2_A1464ProPreMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z1465ProPreKgm, T018P2_A1465ProPreKgm[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1464ProPreMtr, T018P2_A1464ProPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tpclipro:[seudo value changed for attri]"+"ProPreMtr");
               GXutil.writeLogRaw("Old: ",Z1464ProPreMtr);
               GXutil.writeLogRaw("Current: ",T018P2_A1464ProPreMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z1465ProPreKgm, T018P2_A1465ProPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("tpclipro:[seudo value changed for attri]"+"ProPreKgm");
               GXutil.writeLogRaw("Old: ",Z1465ProPreKgm);
               GXutil.writeLogRaw("Current: ",T018P2_A1465ProPreKgm[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPREPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18P213( )
   {
      beforeValidate18P213( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18P213( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18P213( 0) ;
         checkOptimisticConcurrency18P213( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18P213( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18P213( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018P29 */
                  pr_default.execute(27, new Object[] {Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Boolean.valueOf(n1464ProPreMtr), A1464ProPreMtr, Boolean.valueOf(n1465ProPreKgm), A1465ProPreKgm, A396EmprCod, Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPREPR");
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
            load18P213( ) ;
         }
         endLevel18P213( ) ;
      }
      closeExtendedTableCursors18P213( ) ;
   }

   public void update18P213( )
   {
      beforeValidate18P213( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18P213( ) ;
      }
      if ( ( nIsMod_213 != 0 ) || ( nIsDirty_213 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency18P213( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm18P213( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate18P213( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018P30 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n1464ProPreMtr), A1464ProPreMtr, Boolean.valueOf(n1465ProPreKgm), A1465ProPreKgm, A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPREPR");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPREPR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate18P213( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey18P213( ) ;
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
            endLevel18P213( ) ;
         }
      }
      closeExtendedTableCursors18P213( ) ;
   }

   public void deferredUpdate18P213( )
   {
   }

   public void delete18P213( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18P213( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18P213( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18P213( ) ;
         afterConfirm18P213( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18P213( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018P31 */
               pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPREPR");
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
      sMode213 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18P213( ) ;
      Gx_mode = sMode213 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18P213( )
   {
      standaloneModal18P213( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T018P32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
         A584IntDsc = T018P32_A584IntDsc[0] ;
         n584IntDsc = T018P32_n584IntDsc[0] ;
         pr_default.close(30);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T018P33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
      }
   }

   public void endLevel18P213( )
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

   public void scanStart18P213( )
   {
      /* Scan By routine */
      /* Using cursor T018P34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      RcdFound213 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound213 = (short)(1) ;
         A583IntCod = T018P34_A583IntCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18P213( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound213 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound213 = (short)(1) ;
         A583IntCod = T018P34_A583IntCod[0] ;
      }
   }

   public void scanEnd18P213( )
   {
      pr_default.close(32);
   }

   public void afterConfirm18P213( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18P213( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18P213( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18P213( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18P213( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18P213( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18P213( )
   {
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtProPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPreMtr_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtProPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPreKgm_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes18P213( )
   {
   }

   public void send_integrity_lvl_hashes18P212( )
   {
   }

   public void subsflControlProps_60213( )
   {
      edtavnRcdDeleted_213_Internalname = "vNRCDDELETED_213_"+sGXsfl_60_idx ;
      edtIntCod_Internalname = "INTCOD_"+sGXsfl_60_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_60_idx ;
      edtProPreMtr_Internalname = "PROPREMTR_"+sGXsfl_60_idx ;
      edtProPreKgm_Internalname = "PROPREKGM_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60213( )
   {
      edtavnRcdDeleted_213_Internalname = "vNRCDDELETED_213_"+sGXsfl_60_fel_idx ;
      edtIntCod_Internalname = "INTCOD_"+sGXsfl_60_fel_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_60_fel_idx ;
      edtProPreMtr_Internalname = "PROPREMTR_"+sGXsfl_60_fel_idx ;
      edtProPreKgm_Internalname = "PROPREKGM_"+sGXsfl_60_fel_idx ;
   }

   public void addRow18P213( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60213( ) ;
      sendRow18P213( ) ;
   }

   public void sendRow18P213( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_213_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_213_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_213_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_213), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_213), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_213_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_213_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_213_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntCod_Internalname,GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtIntCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDsc_Internalname,GXutil.rtrim( A584IntDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtIntDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_213_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1464ProPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProPreMtr_Enabled!=0) ? localUtil.format( A1464ProPreMtr, "ZZZZZZ9.999") : localUtil.format( A1464ProPreMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_213_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1465ProPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProPreKgm_Enabled!=0) ? localUtil.format( A1465ProPreKgm, "ZZZZZZ9.999") : localUtil.format( A1465ProPreKgm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes18P213( ) ;
      GXCCtl = "Z583IntCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1464ProPreMtr_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1464ProPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1465ProPreKgm_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1465ProPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_213_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_213_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_213_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "MODO_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_213_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_213_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTDSC_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtIntDsc_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "INTDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPREMTR_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProPreMtr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPREMTR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPREKGM_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProPreKgm_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPREKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow18P213( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60213( ) ;
      edtavnRcdDeleted_213_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_213_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntDsc_Title = httpContext.cgiGet( "INTDSC_"+sGXsfl_60_idx+"Title") ;
      edtIntDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProPreMtr_Title = httpContext.cgiGet( "PROPREMTR_"+sGXsfl_60_idx+"Title") ;
      edtProPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROPREMTR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProPreKgm_Title = httpContext.cgiGet( "PROPREKGM_"+sGXsfl_60_idx+"Title") ;
      edtProPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROPREKGM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_213_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_213_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_213");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_213_Internalname ;
         wbErr = true ;
         nRcdDeleted_213 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_213 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_213_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "INTCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         wbErr = true ;
         A583IntCod = (byte)(0) ;
      }
      else
      {
         A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
      n584IntDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PROPREMTR_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProPreMtr_Internalname ;
         wbErr = true ;
         A1464ProPreMtr = DecimalUtil.ZERO ;
         n1464ProPreMtr = false ;
      }
      else
      {
         A1464ProPreMtr = localUtil.ctond( httpContext.cgiGet( edtProPreMtr_Internalname)) ;
         n1464ProPreMtr = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PROPREKGM_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProPreKgm_Internalname ;
         wbErr = true ;
         A1465ProPreKgm = DecimalUtil.ZERO ;
         n1465ProPreKgm = false ;
      }
      else
      {
         A1465ProPreKgm = localUtil.ctond( httpContext.cgiGet( edtProPreKgm_Internalname)) ;
         n1465ProPreKgm = false ;
      }
      GXCCtl = "Z583IntCod_" + sGXsfl_60_idx ;
      Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1464ProPreMtr_" + sGXsfl_60_idx ;
      Z1464ProPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1465ProPreKgm_" + sGXsfl_60_idx ;
      Z1465ProPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_213_" + sGXsfl_60_idx ;
      nRcdDeleted_213 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_213_" + sGXsfl_60_idx ;
      nRcdExists_213 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_213_" + sGXsfl_60_idx ;
      nIsMod_213 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "MODO_" + sGXsfl_60_idx ;
      AV20Modo = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtIntCod_Enabled = edtIntCod_Enabled ;
   }

   public void confirmValues18P0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60213( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60213( ) ;
         httpContext.changePostValue( "Z583IntCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z583IntCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z583IntCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z1464ProPreMtr_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z1464ProPreMtr_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1464ProPreMtr_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z1465ProPreKgm_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z1465ProPreKgm_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1465ProPreKgm_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpclipro", new String[] {}, new String[] {}) +"\">") ;
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
      return formatLink("app.tpclipro", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TpCLIPRO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO CLIENTE-ART-PROCESO PARM", "") ;
   }

   public void initializeNonKey18P212( )
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

   public void initAll18P212( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1504CliProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKey18P212( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey18P213( )
   {
      AV20Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      A584IntDsc = "" ;
      n584IntDsc = false ;
      A1464ProPreMtr = DecimalUtil.ZERO ;
      n1464ProPreMtr = false ;
      A1465ProPreKgm = DecimalUtil.ZERO ;
      n1465ProPreKgm = false ;
      Z1464ProPreMtr = DecimalUtil.ZERO ;
      Z1465ProPreKgm = DecimalUtil.ZERO ;
   }

   public void initAll18P213( )
   {
      A583IntCod = (byte)(0) ;
      initializeNonKey18P213( ) ;
   }

   public void standaloneModalInsert18P213( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156045", true, true);
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
      httpContext.AddJavascriptSource("tpclipro.js", "?2026824156045", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties213( )
   {
      edtIntCod_Enabled = defedtIntCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_213, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_213_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A584IntDsc));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtIntDsc_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1464ProPreMtr, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtProPreMtr_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1465ProPreKgm, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtProPreKgm_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavnRcdDeleted_213_Internalname = "vNRCDDELETED_213" ;
      edtIntCod_Internalname = "INTCOD" ;
      edtIntDsc_Internalname = "INTDSC" ;
      edtProPreMtr_Internalname = "PROPREMTR" ;
      edtProPreKgm_Internalname = "PROPREKGM" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIO CLIENTE-ART-PROCESO PARM", "") );
      edtProPreKgm_Jsonclick = "" ;
      edtProPreMtr_Jsonclick = "" ;
      edtIntDsc_Jsonclick = "" ;
      edtIntCod_Jsonclick = "" ;
      edtavnRcdDeleted_213_Jsonclick = "" ;
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
      edtProPreKgm_Enabled = 1 ;
      edtProPreMtr_Enabled = 1 ;
      edtIntDsc_Enabled = 0 ;
      edtIntCod_Enabled = 1 ;
      edtavnRcdDeleted_213_Enabled = 1 ;
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
      edtProPreMtr_Title = httpContext.getMessage( "Precio Metro", "") ;
      edtProPreKgm_Title = httpContext.getMessage( "Precio Kilo", "") ;
      edtIntDsc_Title = httpContext.getMessage( "Descripción Intensidad", "") ;
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
      subsflControlProps_60213( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal18P213( ) ;
         standaloneModal18P213( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow18P213( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60213( ) ;
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
      /* Using cursor T018P35 */
      pr_default.execute(33, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018P35_A407EmprNom[0] ;
      n407EmprNom = T018P35_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(33);
      /* Using cursor T018P20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T018P20_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(18);
      /* Using cursor T018P21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1505CliProDsc = T018P21_A1505CliProDsc[0] ;
         n1505CliProDsc = T018P21_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T018P21_A1506CliProBus[0] ;
         n1506CliProBus = T018P21_n1506CliProBus[0] ;
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
      /* Using cursor T018P36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(34);
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
      /* Using cursor T018P20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T018P20_A279CliNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Cliprocod( )
   {
      n1505CliProDsc = false ;
      n1506CliProBus = false ;
      /* Using cursor T018P21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1505CliProDsc = T018P21_A1505CliProDsc[0] ;
         n1505CliProDsc = T018P21_n1505CliProDsc[0] ;
         A1506CliProBus = T018P21_A1506CliProBus[0] ;
         n1506CliProBus = T018P21_n1506CliProBus[0] ;
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
      /* Using cursor T018P36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(34);
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

   public void valid_Intcod( )
   {
      n584IntDsc = false ;
      /* Using cursor T018P32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
      }
      A584IntDsc = T018P32_A584IntDsc[0] ;
      n584IntDsc = T018P32_n584IntDsc[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
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
      setEventMetadata("'PROCESOS'","{handler:'e1218P2',iparms:[{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'PROCESOS'",",oparms:[{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_CLIPROCOD","{handler:'valid_Cliprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''}]");
      setEventMetadata("VALID_CLIPROCOD",",oparms:[{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'edtProPreMtr_Title',ctrl:'PROPREMTR',prop:'Title'},{av:'edtProPreKgm_Title',ctrl:'PROPREKGM',prop:'Title'},{av:'edtIntDsc_Title',ctrl:'INTDSC',prop:'Title'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z1504CliProCod'},{av:'Z65ArtCod'},{av:'Z407EmprNom'},{av:'ZV17UsurCod'},{av:'Z279CliNom'},{av:'Z1505CliProDsc'},{av:'Z1506CliProBus'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A584IntDsc',fld:'INTDSC',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A584IntDsc',fld:'INTDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Proprekgm',iparms:[]");
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
      pr_default.close(34);
      pr_default.close(18);
      pr_default.close(33);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z1504CliProCod = "" ;
      Z65ArtCod = "" ;
      Z1464ProPreMtr = DecimalUtil.ZERO ;
      Z1465ProPreKgm = DecimalUtil.ZERO ;
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
      sMode213 = "" ;
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
      A584IntDsc = "" ;
      A1464ProPreMtr = DecimalUtil.ZERO ;
      A1465ProPreKgm = DecimalUtil.ZERO ;
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
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z1505CliProDsc = "" ;
      Z1506CliProBus = "" ;
      T018P7_A407EmprNom = new String[] {""} ;
      T018P7_n407EmprNom = new boolean[] {false} ;
      T018P11_A758ProCod = new String[] {""} ;
      T018P11_A407EmprNom = new String[] {""} ;
      T018P11_n407EmprNom = new boolean[] {false} ;
      T018P11_A1504CliProCod = new String[] {""} ;
      T018P11_A279CliNom = new String[] {""} ;
      T018P11_A396EmprCod = new String[] {""} ;
      T018P11_A252CliCod = new int[1] ;
      T018P11_A65ArtCod = new String[] {""} ;
      T018P11_A1505CliProDsc = new String[] {""} ;
      T018P11_n1505CliProDsc = new boolean[] {false} ;
      T018P11_A1506CliProBus = new String[] {""} ;
      T018P11_n1506CliProBus = new boolean[] {false} ;
      T018P8_A279CliNom = new String[] {""} ;
      T018P10_A1505CliProDsc = new String[] {""} ;
      T018P10_n1505CliProDsc = new boolean[] {false} ;
      T018P10_A1506CliProBus = new String[] {""} ;
      T018P10_n1506CliProBus = new boolean[] {false} ;
      T018P9_A396EmprCod = new String[] {""} ;
      T018P12_A279CliNom = new String[] {""} ;
      T018P13_A1505CliProDsc = new String[] {""} ;
      T018P13_n1505CliProDsc = new boolean[] {false} ;
      T018P13_A1506CliProBus = new String[] {""} ;
      T018P13_n1506CliProBus = new boolean[] {false} ;
      T018P14_A396EmprCod = new String[] {""} ;
      T018P15_A396EmprCod = new String[] {""} ;
      T018P15_A252CliCod = new int[1] ;
      T018P15_A1504CliProCod = new String[] {""} ;
      T018P15_A65ArtCod = new String[] {""} ;
      T018P6_A1504CliProCod = new String[] {""} ;
      T018P6_A396EmprCod = new String[] {""} ;
      T018P6_A252CliCod = new int[1] ;
      T018P6_A65ArtCod = new String[] {""} ;
      T018P16_A1504CliProCod = new String[] {""} ;
      T018P16_A396EmprCod = new String[] {""} ;
      T018P16_A252CliCod = new int[1] ;
      T018P16_A65ArtCod = new String[] {""} ;
      T018P17_A1504CliProCod = new String[] {""} ;
      T018P17_A396EmprCod = new String[] {""} ;
      T018P17_A252CliCod = new int[1] ;
      T018P17_A65ArtCod = new String[] {""} ;
      T018P5_A1504CliProCod = new String[] {""} ;
      T018P5_A396EmprCod = new String[] {""} ;
      T018P5_A252CliCod = new int[1] ;
      T018P5_A65ArtCod = new String[] {""} ;
      T018P20_A279CliNom = new String[] {""} ;
      T018P21_A1505CliProDsc = new String[] {""} ;
      T018P21_n1505CliProDsc = new boolean[] {false} ;
      T018P21_A1506CliProBus = new String[] {""} ;
      T018P21_n1506CliProBus = new boolean[] {false} ;
      T018P22_A396EmprCod = new String[] {""} ;
      T018P22_A252CliCod = new int[1] ;
      T018P22_A1504CliProCod = new String[] {""} ;
      T018P22_A65ArtCod = new String[] {""} ;
      T018P22_A7425Clarprnl = new short[1] ;
      T018P23_A396EmprCod = new String[] {""} ;
      T018P23_A252CliCod = new int[1] ;
      T018P23_A1504CliProCod = new String[] {""} ;
      T018P23_A65ArtCod = new String[] {""} ;
      T018P23_A5362IntCodF = new byte[1] ;
      T018P24_A396EmprCod = new String[] {""} ;
      T018P24_A252CliCod = new int[1] ;
      T018P24_A1504CliProCod = new String[] {""} ;
      T018P24_A65ArtCod = new String[] {""} ;
      T018P24_A583IntCod = new byte[1] ;
      T018P24_A1728MinPreLin = new byte[1] ;
      T018P25_A396EmprCod = new String[] {""} ;
      T018P25_A252CliCod = new int[1] ;
      T018P25_A1504CliProCod = new String[] {""} ;
      T018P25_A65ArtCod = new String[] {""} ;
      Z584IntDsc = "" ;
      T018P26_A252CliCod = new int[1] ;
      T018P26_A1504CliProCod = new String[] {""} ;
      T018P26_A65ArtCod = new String[] {""} ;
      T018P26_A584IntDsc = new String[] {""} ;
      T018P26_n584IntDsc = new boolean[] {false} ;
      T018P26_A1464ProPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018P26_n1464ProPreMtr = new boolean[] {false} ;
      T018P26_A1465ProPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018P26_n1465ProPreKgm = new boolean[] {false} ;
      T018P26_A396EmprCod = new String[] {""} ;
      T018P26_A583IntCod = new byte[1] ;
      T018P4_A584IntDsc = new String[] {""} ;
      T018P4_n584IntDsc = new boolean[] {false} ;
      T018P27_A584IntDsc = new String[] {""} ;
      T018P27_n584IntDsc = new boolean[] {false} ;
      T018P28_A396EmprCod = new String[] {""} ;
      T018P28_A252CliCod = new int[1] ;
      T018P28_A1504CliProCod = new String[] {""} ;
      T018P28_A65ArtCod = new String[] {""} ;
      T018P28_A583IntCod = new byte[1] ;
      T018P3_A252CliCod = new int[1] ;
      T018P3_A1504CliProCod = new String[] {""} ;
      T018P3_A65ArtCod = new String[] {""} ;
      T018P3_A1464ProPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018P3_n1464ProPreMtr = new boolean[] {false} ;
      T018P3_A1465ProPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018P3_n1465ProPreKgm = new boolean[] {false} ;
      T018P3_A396EmprCod = new String[] {""} ;
      T018P3_A583IntCod = new byte[1] ;
      T018P2_A252CliCod = new int[1] ;
      T018P2_A1504CliProCod = new String[] {""} ;
      T018P2_A65ArtCod = new String[] {""} ;
      T018P2_A1464ProPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018P2_n1464ProPreMtr = new boolean[] {false} ;
      T018P2_A1465ProPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018P2_n1465ProPreKgm = new boolean[] {false} ;
      T018P2_A396EmprCod = new String[] {""} ;
      T018P2_A583IntCod = new byte[1] ;
      T018P32_A584IntDsc = new String[] {""} ;
      T018P32_n584IntDsc = new boolean[] {false} ;
      T018P33_A396EmprCod = new String[] {""} ;
      T018P33_A252CliCod = new int[1] ;
      T018P33_A1504CliProCod = new String[] {""} ;
      T018P33_A65ArtCod = new String[] {""} ;
      T018P33_A583IntCod = new byte[1] ;
      T018P33_A1728MinPreLin = new byte[1] ;
      T018P34_A396EmprCod = new String[] {""} ;
      T018P34_A252CliCod = new int[1] ;
      T018P34_A1504CliProCod = new String[] {""} ;
      T018P34_A65ArtCod = new String[] {""} ;
      T018P34_A583IntCod = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV20Modo = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T018P35_A407EmprNom = new String[] {""} ;
      T018P35_n407EmprNom = new boolean[] {false} ;
      T018P36_A396EmprCod = new String[] {""} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ1504CliProCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ407EmprNom = "" ;
      ZZV17UsurCod = "" ;
      ZZ279CliNom = "" ;
      ZZ1505CliProDsc = "" ;
      ZZ1506CliProBus = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpclipro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpclipro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpclipro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpclipro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpclipro__default(),
         new Object[] {
             new Object[] {
            T018P2_A252CliCod, T018P2_A1504CliProCod, T018P2_A65ArtCod, T018P2_A1464ProPreMtr, T018P2_n1464ProPreMtr, T018P2_A1465ProPreKgm, T018P2_n1465ProPreKgm, T018P2_A396EmprCod, T018P2_A583IntCod
            }
            , new Object[] {
            T018P3_A252CliCod, T018P3_A1504CliProCod, T018P3_A65ArtCod, T018P3_A1464ProPreMtr, T018P3_n1464ProPreMtr, T018P3_A1465ProPreKgm, T018P3_n1465ProPreKgm, T018P3_A396EmprCod, T018P3_A583IntCod
            }
            , new Object[] {
            T018P4_A584IntDsc, T018P4_n584IntDsc
            }
            , new Object[] {
            T018P5_A1504CliProCod, T018P5_A396EmprCod, T018P5_A252CliCod, T018P5_A65ArtCod
            }
            , new Object[] {
            T018P6_A1504CliProCod, T018P6_A396EmprCod, T018P6_A252CliCod, T018P6_A65ArtCod
            }
            , new Object[] {
            T018P7_A407EmprNom, T018P7_n407EmprNom
            }
            , new Object[] {
            T018P8_A279CliNom
            }
            , new Object[] {
            T018P9_A396EmprCod
            }
            , new Object[] {
            T018P10_A1505CliProDsc, T018P10_n1505CliProDsc, T018P10_A1506CliProBus, T018P10_n1506CliProBus
            }
            , new Object[] {
            T018P11_A758ProCod, T018P11_A407EmprNom, T018P11_n407EmprNom, T018P11_A1504CliProCod, T018P11_A279CliNom, T018P11_A396EmprCod, T018P11_A252CliCod, T018P11_A65ArtCod, T018P11_A1505CliProDsc, T018P11_n1505CliProDsc,
            T018P11_A1506CliProBus, T018P11_n1506CliProBus
            }
            , new Object[] {
            T018P12_A279CliNom
            }
            , new Object[] {
            T018P13_A1505CliProDsc, T018P13_n1505CliProDsc, T018P13_A1506CliProBus, T018P13_n1506CliProBus
            }
            , new Object[] {
            T018P14_A396EmprCod
            }
            , new Object[] {
            T018P15_A396EmprCod, T018P15_A252CliCod, T018P15_A1504CliProCod, T018P15_A65ArtCod
            }
            , new Object[] {
            T018P16_A1504CliProCod, T018P16_A396EmprCod, T018P16_A252CliCod, T018P16_A65ArtCod
            }
            , new Object[] {
            T018P17_A1504CliProCod, T018P17_A396EmprCod, T018P17_A252CliCod, T018P17_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018P20_A279CliNom
            }
            , new Object[] {
            T018P21_A1505CliProDsc, T018P21_n1505CliProDsc, T018P21_A1506CliProBus, T018P21_n1506CliProBus
            }
            , new Object[] {
            T018P22_A396EmprCod, T018P22_A252CliCod, T018P22_A1504CliProCod, T018P22_A65ArtCod, T018P22_A7425Clarprnl
            }
            , new Object[] {
            T018P23_A396EmprCod, T018P23_A252CliCod, T018P23_A1504CliProCod, T018P23_A65ArtCod, T018P23_A5362IntCodF
            }
            , new Object[] {
            T018P24_A396EmprCod, T018P24_A252CliCod, T018P24_A1504CliProCod, T018P24_A65ArtCod, T018P24_A583IntCod, T018P24_A1728MinPreLin
            }
            , new Object[] {
            T018P25_A396EmprCod, T018P25_A252CliCod, T018P25_A1504CliProCod, T018P25_A65ArtCod
            }
            , new Object[] {
            T018P26_A252CliCod, T018P26_A1504CliProCod, T018P26_A65ArtCod, T018P26_A584IntDsc, T018P26_n584IntDsc, T018P26_A1464ProPreMtr, T018P26_n1464ProPreMtr, T018P26_A1465ProPreKgm, T018P26_n1465ProPreKgm, T018P26_A396EmprCod,
            T018P26_A583IntCod
            }
            , new Object[] {
            T018P27_A584IntDsc, T018P27_n584IntDsc
            }
            , new Object[] {
            T018P28_A396EmprCod, T018P28_A252CliCod, T018P28_A1504CliProCod, T018P28_A65ArtCod, T018P28_A583IntCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018P32_A584IntDsc, T018P32_n584IntDsc
            }
            , new Object[] {
            T018P33_A396EmprCod, T018P33_A252CliCod, T018P33_A1504CliProCod, T018P33_A65ArtCod, T018P33_A583IntCod, T018P33_A1728MinPreLin
            }
            , new Object[] {
            T018P34_A396EmprCod, T018P34_A252CliCod, T018P34_A1504CliProCod, T018P34_A65ArtCod, T018P34_A583IntCod
            }
            , new Object[] {
            T018P35_A407EmprNom, T018P35_n407EmprNom
            }
            , new Object[] {
            T018P36_A396EmprCod
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

   private byte Z583IntCod ;
   private byte GxWebError ;
   private byte A583IntCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_213 ;
   private short nRcdExists_213 ;
   private short nIsMod_213 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount213 ;
   private short RcdFound213 ;
   private short nBlankRcdUsr213 ;
   private short RcdFound212 ;
   private short nIsDirty_212 ;
   private short nIsDirty_213 ;
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
   private int edtavnRcdDeleted_213_Enabled ;
   private int edtIntCod_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtProPreMtr_Enabled ;
   private int edtProPreKgm_Enabled ;
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
   private int defedtIntCod_Enabled ;
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
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z1464ProPreMtr ;
   private java.math.BigDecimal Z1465ProPreKgm ;
   private java.math.BigDecimal A1464ProPreMtr ;
   private java.math.BigDecimal A1465ProPreKgm ;
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
   private String edtIntDsc_Title ;
   private String edtIntDsc_Internalname ;
   private String edtProPreKgm_Title ;
   private String edtProPreKgm_Internalname ;
   private String edtProPreMtr_Title ;
   private String edtProPreMtr_Internalname ;
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
   private String sMode213 ;
   private String edtavnRcdDeleted_213_Internalname ;
   private String edtIntCod_Internalname ;
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
   private String A584IntDsc ;
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
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z1505CliProDsc ;
   private String Z1506CliProBus ;
   private String Z584IntDsc ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_213_Jsonclick ;
   private String edtIntCod_Jsonclick ;
   private String edtIntDsc_Jsonclick ;
   private String edtProPreMtr_Jsonclick ;
   private String edtProPreKgm_Jsonclick ;
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
   private boolean n584IntDsc ;
   private boolean n1464ProPreMtr ;
   private boolean n1465ProPreKgm ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T018P7_A407EmprNom ;
   private boolean[] T018P7_n407EmprNom ;
   private String[] T018P11_A758ProCod ;
   private String[] T018P11_A407EmprNom ;
   private boolean[] T018P11_n407EmprNom ;
   private String[] T018P11_A1504CliProCod ;
   private String[] T018P11_A279CliNom ;
   private String[] T018P11_A396EmprCod ;
   private int[] T018P11_A252CliCod ;
   private String[] T018P11_A65ArtCod ;
   private String[] T018P11_A1505CliProDsc ;
   private boolean[] T018P11_n1505CliProDsc ;
   private String[] T018P11_A1506CliProBus ;
   private boolean[] T018P11_n1506CliProBus ;
   private String[] T018P8_A279CliNom ;
   private String[] T018P10_A1505CliProDsc ;
   private boolean[] T018P10_n1505CliProDsc ;
   private String[] T018P10_A1506CliProBus ;
   private boolean[] T018P10_n1506CliProBus ;
   private String[] T018P9_A396EmprCod ;
   private String[] T018P12_A279CliNom ;
   private String[] T018P13_A1505CliProDsc ;
   private boolean[] T018P13_n1505CliProDsc ;
   private String[] T018P13_A1506CliProBus ;
   private boolean[] T018P13_n1506CliProBus ;
   private String[] T018P14_A396EmprCod ;
   private String[] T018P15_A396EmprCod ;
   private int[] T018P15_A252CliCod ;
   private String[] T018P15_A1504CliProCod ;
   private String[] T018P15_A65ArtCod ;
   private String[] T018P6_A1504CliProCod ;
   private String[] T018P6_A396EmprCod ;
   private int[] T018P6_A252CliCod ;
   private String[] T018P6_A65ArtCod ;
   private String[] T018P16_A1504CliProCod ;
   private String[] T018P16_A396EmprCod ;
   private int[] T018P16_A252CliCod ;
   private String[] T018P16_A65ArtCod ;
   private String[] T018P17_A1504CliProCod ;
   private String[] T018P17_A396EmprCod ;
   private int[] T018P17_A252CliCod ;
   private String[] T018P17_A65ArtCod ;
   private String[] T018P5_A1504CliProCod ;
   private String[] T018P5_A396EmprCod ;
   private int[] T018P5_A252CliCod ;
   private String[] T018P5_A65ArtCod ;
   private String[] T018P20_A279CliNom ;
   private String[] T018P21_A1505CliProDsc ;
   private boolean[] T018P21_n1505CliProDsc ;
   private String[] T018P21_A1506CliProBus ;
   private boolean[] T018P21_n1506CliProBus ;
   private String[] T018P22_A396EmprCod ;
   private int[] T018P22_A252CliCod ;
   private String[] T018P22_A1504CliProCod ;
   private String[] T018P22_A65ArtCod ;
   private short[] T018P22_A7425Clarprnl ;
   private String[] T018P23_A396EmprCod ;
   private int[] T018P23_A252CliCod ;
   private String[] T018P23_A1504CliProCod ;
   private String[] T018P23_A65ArtCod ;
   private byte[] T018P23_A5362IntCodF ;
   private String[] T018P24_A396EmprCod ;
   private int[] T018P24_A252CliCod ;
   private String[] T018P24_A1504CliProCod ;
   private String[] T018P24_A65ArtCod ;
   private byte[] T018P24_A583IntCod ;
   private byte[] T018P24_A1728MinPreLin ;
   private String[] T018P25_A396EmprCod ;
   private int[] T018P25_A252CliCod ;
   private String[] T018P25_A1504CliProCod ;
   private String[] T018P25_A65ArtCod ;
   private int[] T018P26_A252CliCod ;
   private String[] T018P26_A1504CliProCod ;
   private String[] T018P26_A65ArtCod ;
   private String[] T018P26_A584IntDsc ;
   private boolean[] T018P26_n584IntDsc ;
   private java.math.BigDecimal[] T018P26_A1464ProPreMtr ;
   private boolean[] T018P26_n1464ProPreMtr ;
   private java.math.BigDecimal[] T018P26_A1465ProPreKgm ;
   private boolean[] T018P26_n1465ProPreKgm ;
   private String[] T018P26_A396EmprCod ;
   private byte[] T018P26_A583IntCod ;
   private String[] T018P4_A584IntDsc ;
   private boolean[] T018P4_n584IntDsc ;
   private String[] T018P27_A584IntDsc ;
   private boolean[] T018P27_n584IntDsc ;
   private String[] T018P28_A396EmprCod ;
   private int[] T018P28_A252CliCod ;
   private String[] T018P28_A1504CliProCod ;
   private String[] T018P28_A65ArtCod ;
   private byte[] T018P28_A583IntCod ;
   private int[] T018P3_A252CliCod ;
   private String[] T018P3_A1504CliProCod ;
   private String[] T018P3_A65ArtCod ;
   private java.math.BigDecimal[] T018P3_A1464ProPreMtr ;
   private boolean[] T018P3_n1464ProPreMtr ;
   private java.math.BigDecimal[] T018P3_A1465ProPreKgm ;
   private boolean[] T018P3_n1465ProPreKgm ;
   private String[] T018P3_A396EmprCod ;
   private byte[] T018P3_A583IntCod ;
   private int[] T018P2_A252CliCod ;
   private String[] T018P2_A1504CliProCod ;
   private String[] T018P2_A65ArtCod ;
   private java.math.BigDecimal[] T018P2_A1464ProPreMtr ;
   private boolean[] T018P2_n1464ProPreMtr ;
   private java.math.BigDecimal[] T018P2_A1465ProPreKgm ;
   private boolean[] T018P2_n1465ProPreKgm ;
   private String[] T018P2_A396EmprCod ;
   private byte[] T018P2_A583IntCod ;
   private String[] T018P32_A584IntDsc ;
   private boolean[] T018P32_n584IntDsc ;
   private String[] T018P33_A396EmprCod ;
   private int[] T018P33_A252CliCod ;
   private String[] T018P33_A1504CliProCod ;
   private String[] T018P33_A65ArtCod ;
   private byte[] T018P33_A583IntCod ;
   private byte[] T018P33_A1728MinPreLin ;
   private String[] T018P34_A396EmprCod ;
   private int[] T018P34_A252CliCod ;
   private String[] T018P34_A1504CliProCod ;
   private String[] T018P34_A65ArtCod ;
   private byte[] T018P34_A583IntCod ;
   private String[] T018P35_A407EmprNom ;
   private boolean[] T018P35_n407EmprNom ;
   private String[] T018P36_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpclipro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpclipro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpclipro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpclipro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpclipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018P2", "SELECT CliCod, CliProCod, ArtCod, ProPreMtr, ProPreKgm, EmprCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ?  FOR UPDATE OF ProPreMtr, ProPreKgm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P3", "SELECT CliCod, CliProCod, ArtCod, ProPreMtr, ProPreKgm, EmprCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P4", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P5", "SELECT CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?  FOR UPDATE OF CliProCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P6", "SELECT CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P9", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P10", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P11", "SELECT /*+ FIRST_ROWS(100) */ T4.ProCod, T2.EmprNom, TM1.CliProCod, T3.CliNom, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, COALESCE( T4.ProDsc, '                            ') AS CliProDsc, COALESCE( T4.ProCod, 'XXXXXXXX') AS CliProBus FROM (((TXPCPREPR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPPROCES T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProCod = TM1.CliProCod) WHERE TM1.CliProCod = ? and TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.CliProCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P12", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P13", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P14", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE ( CliProCod > ? or CliProCod = ? and CliCod > ? or CliCod = ? and CliProCod = ? and ArtCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018P17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE ( CliProCod < ? or CliProCod = ? and CliCod < ? or CliCod = ? and CliProCod = ? and ArtCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, CliProCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018P18", "INSERT INTO TXPCPREPR(CliProCod, EmprCod, CliCod, ArtCod, Clpratpk, Clpratpm, ProPreAct, ProFecAnt, ProPreAnt, ProFecAct, ProDscMtr, ProDscKgm, ProFecCri, ProPreEst, ClarprUl) VALUES(?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0)", GX_NOMASK, "TXPCPREPR")
         ,new UpdateCursor("T018P19", "DELETE FROM TXPCPREPR  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?", GX_NOMASK, "TXPCPREPR")
         ,new ForEachCursor("T018P20", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P21", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P22", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, Clarprnl FROM TXPCLARPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018P23", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCodF FROM TXPPREGBL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018P24", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod, MinPreLin FROM TXPRECPIL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018P25", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P26", "SELECT T1.CliCod, T1.CliProCod, T1.ArtCod, T2.IntDsc, T1.ProPreMtr, T1.ProPreKgm, T1.EmprCod, T1.IntCod FROM (TXPLPREPR T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliProCod = ? and T1.ArtCod = ? and T1.IntCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliProCod, T1.ArtCod, T1.IntCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P27", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P28", "SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018P29", "INSERT INTO TXPLPREPR(CliCod, CliProCod, ArtCod, ProPreMtr, ProPreKgm, EmprCod, IntCod, MinPreULin, ProPreDcM, ProPreDcK, ProPreFAc, ProPreFAn, ProPreMAn, ProPreKAn) VALUES(?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0)", GX_NOMASK, "TXPLPREPR")
         ,new UpdateCursor("T018P30", "UPDATE TXPLPREPR SET ProPreMtr=?, ProPreKgm=?  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ?", GX_NOMASK, "TXPLPREPR")
         ,new UpdateCursor("T018P31", "DELETE FROM TXPLPREPR  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ?", GX_NOMASK, "TXPLPREPR")
         ,new ForEachCursor("T018P32", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P33", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod, MinPreLin FROM TXPRECPIL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018P34", "SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P35", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018P36", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 24 :
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
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 27 :
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
            case 28 :
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
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

