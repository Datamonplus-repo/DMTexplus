package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tubiin_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9743Emp_CUb = httpContext.GetPar( "Emp_CUb") ;
         A5860Emp_Anp = (short)(GXutil.lval( httpContext.GetPar( "Emp_Anp"))) ;
         AV32Msg_ib = httpContext.GetPar( "Msg_ib") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_ib", AV32Msg_ib);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_1511341( A396EmprCod, A9743Emp_CUb, A5860Emp_Anp, AV32Msg_ib) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A9743Emp_CUb = httpContext.GetPar( "Emp_CUb") ;
         A5860Emp_Anp = (short)(GXutil.lval( httpContext.GetPar( "Emp_Anp"))) ;
         A9745Emp_PzE = (int)(GXutil.lval( httpContext.GetPar( "Emp_PzE"))) ;
         n9745Emp_PzE = false ;
         A9746Emp_UnE = CommonUtil.decimalVal( httpContext.GetPar( "Emp_UnE"), ".") ;
         n9746Emp_UnE = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1511341( Gx_mode, A396EmprCod, A44AlbRecCod, A9743Emp_CUb, A5860Emp_Anp, A9745Emp_PzE, A9746Emp_UnE) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9743Emp_CUb = httpContext.GetPar( "Emp_CUb") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A9743Emp_CUb) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA INFORMACION UBICACION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
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
      nRC_GXsfl_95 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_95"))) ;
      nGXsfl_95_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_95_idx"))) ;
      sGXsfl_95_idx = httpContext.GetPar( "sGXsfl_95_idx") ;
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

   public tubiin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tubiin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tubiin_impl.class ));
   }

   public tubiin_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
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
      /* Execute user event: Exit */
      e111512 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TUBIIN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Unidad Medida", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, (byte)(0), "HLP_TUBIIN.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Total Pzs", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp_SPzE_Internalname, GXutil.ltrim( localUtil.ntoc( A9747Emp_SPzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmp_SPzE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9747Emp_SPzE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9747Emp_SPzE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp_SPzE_Jsonclick, 0, "", "", "", "", "", 1, edtEmp_SPzE_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Total Unidades", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp_SUnE_Internalname, GXutil.ltrim( localUtil.ntoc( A9748Emp_SUnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmp_SUnE_Enabled!=0) ? localUtil.format( A9748Emp_SUnE, "ZZZZZ9.99") : localUtil.format( A9748Emp_SUnE, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp_SUnE_Jsonclick, 0, "", "", "", "", "", 1, edtEmp_SUnE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Tot Pzs Uti", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp_SPzU_Internalname, GXutil.ltrim( localUtil.ntoc( A9752Emp_SPzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmp_SPzU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9752Emp_SPzU), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9752Emp_SPzU), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp_SPzU_Jsonclick, 0, "", "", "", "", "", 1, edtEmp_SPzU_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Tot Un Uti", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp_SUnU_Internalname, GXutil.ltrim( localUtil.ntoc( A9753Emp_SUnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmp_SUnU_Enabled!=0) ? localUtil.format( A9753Emp_SUnU, "ZZZZZ9.99") : localUtil.format( A9753Emp_SUnU, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp_SUnU_Jsonclick, 0, "", "", "", "", "", 1, edtEmp_SUnU_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Item1", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp_Item1_Internalname, GXutil.rtrim( A9749Emp_Item1), GXutil.rtrim( localUtil.format( A9749Emp_Item1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp_Item1_Jsonclick, 0, "", "", "", "", "", 1, edtEmp_Item1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol95( ) ;
      nGXsfl_95_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1341 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1341 = (short)(1) ;
            scanStart1511341( ) ;
            while ( RcdFound1341 != 0 )
            {
               init_level_properties1341( ) ;
               getByPrimaryKey1511341( ) ;
               addRow1511341( ) ;
               scanNext1511341( ) ;
            }
            scanEnd1511341( ) ;
            nBlankRcdCount1341 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9752Emp_SPzU = A9752Emp_SPzU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         B9753Emp_SUnU = A9753Emp_SUnU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
         B9748Emp_SUnE = A9748Emp_SUnE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         B9747Emp_SPzE = A9747Emp_SPzE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         standaloneNotModal1511341( ) ;
         standaloneModal1511341( ) ;
         sMode1341 = Gx_mode ;
         while ( nGXsfl_95_idx < nRC_GXsfl_95 )
         {
            bGXsfl_95_Refreshing = true ;
            readRow1511341( ) ;
            edtavnRcdDeleted_1341_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1341_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1341_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1341_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtEmp_CUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_CUB_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmp_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_CUb_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtEmp_Anp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_ANP_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmp_Anp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_Anp_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtEmp_DUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_DUB_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmp_DUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_DUb_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtEmp_PzE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_PZE_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmp_PzE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_PzE_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtEmp_UnE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_UNE_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmp_UnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_UnE_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtEmp_UnU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_UNU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmp_UnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_UnU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtEmp_PzU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_PZU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmp_PzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_PzU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            if ( ( nRcdExists_1341 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1511341( ) ;
            }
            sendRow1511341( ) ;
            bGXsfl_95_Refreshing = false ;
         }
         Gx_mode = sMode1341 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9752Emp_SPzU = B9752Emp_SPzU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         A9753Emp_SUnU = B9753Emp_SUnU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
         A9748Emp_SUnE = B9748Emp_SUnE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         A9747Emp_SPzE = B9747Emp_SPzE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1341 = (short)(5) ;
         nRcdExists_1341 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1511341( ) ;
            while ( RcdFound1341 != 0 )
            {
               sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_951341( ) ;
               init_level_properties1341( ) ;
               standaloneNotModal1511341( ) ;
               getByPrimaryKey1511341( ) ;
               standaloneModal1511341( ) ;
               addRow1511341( ) ;
               scanNext1511341( ) ;
            }
            scanEnd1511341( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1341 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_951341( ) ;
      initAll1511341( ) ;
      init_level_properties1341( ) ;
      B9752Emp_SPzU = A9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      B9753Emp_SUnU = A9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      B9748Emp_SUnE = A9748Emp_SUnE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      B9747Emp_SPzE = A9747Emp_SPzE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      nRcdExists_1341 = (short)(0) ;
      nIsMod_1341 = (short)(0) ;
      nRcdDeleted_1341 = (short)(0) ;
      nBlankRcdCount1341 = (short)(nBlankRcdUsr1341+nBlankRcdCount1341) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1341 > 0 )
      {
         standaloneNotModal1511341( ) ;
         standaloneModal1511341( ) ;
         addRow1511341( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEmp_CUb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1341 = (short)(nBlankRcdCount1341-1) ;
      }
      Gx_mode = sMode1341 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A9752Emp_SPzU = B9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      A9753Emp_SUnU = B9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      A9748Emp_SUnE = B9748Emp_SUnE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      A9747Emp_SPzE = B9747Emp_SPzE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TUBIIN.htm");
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
      e121512 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9749Emp_Item1 = httpContext.cgiGet( "Z9749Emp_Item1") ;
            O9752Emp_SPzU = (int)(localUtil.ctol( httpContext.cgiGet( "O9752Emp_SPzU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O9753Emp_SUnU = localUtil.ctond( httpContext.cgiGet( "O9753Emp_SUnU")) ;
            O9748Emp_SUnE = localUtil.ctond( httpContext.cgiGet( "O9748Emp_SUnE")) ;
            O9747Emp_SPzE = (int)(localUtil.ctol( httpContext.cgiGet( "O9747Emp_SPzE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_95 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV32Msg_ib = httpContext.cgiGet( "vMSG_IB") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRUniEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A58AlbRUniEnt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            }
            else
            {
               A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRPieEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A52AlbRPieEnt = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            }
            else
            {
               A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIUTI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRUniUti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A60AlbRUniUti = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            else
            {
               A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEUTI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRPieUti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A54AlbRPieUti = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
            else
            {
               A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            A9747Emp_SPzE = (int)(localUtil.ctol( httpContext.cgiGet( edtEmp_SPzE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
            A9748Emp_SUnE = localUtil.ctond( httpContext.cgiGet( edtEmp_SUnE_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
            A9752Emp_SPzU = (int)(localUtil.ctol( httpContext.cgiGet( edtEmp_SPzU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
            A9753Emp_SUnU = localUtil.ctond( httpContext.cgiGet( edtEmp_SUnU_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
            A9749Emp_Item1 = httpContext.cgiGet( edtEmp_Item1_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9749Emp_Item1", A9749Emp_Item1);
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
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
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
                        e121512 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111512 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'VER SITUACION UBICACION'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Ver Situacion UBICACION' */
                        e131512 ();
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
            initAll1517( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1341_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1341_Enabled), 5, 0), !bGXsfl_95_Refreshing);
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
      disableAttributes1517( ) ;
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

   public void confirm_1510( )
   {
      beforeValidate1517( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1517( ) ;
         }
         else
         {
            checkExtendedTable1517( ) ;
            if ( AnyError == 0 )
            {
               zm1517( 18) ;
               zm1517( 19) ;
            }
            closeExtendedTableCursors1517( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_1511341( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1510( ) ;
      }
   }

   public void confirm_1511341( )
   {
      s9752Emp_SPzU = O9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      s9753Emp_SUnU = O9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      s9748Emp_SUnE = O9748Emp_SUnE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      s9747Emp_SPzE = O9747Emp_SPzE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1511341( ) ;
         if ( ( nRcdExists_1341 != 0 ) || ( nIsMod_1341 != 0 ) )
         {
            getKey1511341( ) ;
            if ( ( nRcdExists_1341 == 0 ) && ( nRcdDeleted_1341 == 0 ) )
            {
               if ( RcdFound1341 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1511341( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1511341( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1511341( 21) ;
                     }
                     closeExtendedTableCursors1511341( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9752Emp_SPzU = A9752Emp_SPzU ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
                     O9753Emp_SUnU = A9753Emp_SUnU ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
                     O9748Emp_SUnE = A9748Emp_SUnE ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
                     O9747Emp_SPzE = A9747Emp_SPzE ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "EMP_CUB_" + sGXsfl_95_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmp_CUb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1341 != 0 )
               {
                  if ( nRcdDeleted_1341 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1511341( ) ;
                     load1511341( ) ;
                     beforeValidate1511341( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1511341( ) ;
                        O9752Emp_SPzU = A9752Emp_SPzU ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
                        O9753Emp_SUnU = A9753Emp_SUnU ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
                        O9748Emp_SUnE = A9748Emp_SUnE ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
                        O9747Emp_SPzE = A9747Emp_SPzE ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1341 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1511341( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1511341( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1511341( 21) ;
                           }
                           closeExtendedTableCursors1511341( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9752Emp_SPzU = A9752Emp_SPzU ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
                           O9753Emp_SUnU = A9753Emp_SUnU ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
                           O9748Emp_SUnE = A9748Emp_SUnE ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
                           O9747Emp_SPzE = A9747Emp_SPzE ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1341 == 0 )
                  {
                     GXCCtl = "EMP_CUB_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmp_CUb_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1341_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_CUb_Internalname, GXutil.rtrim( A9743Emp_CUb)) ;
         httpContext.changePostValue( edtEmp_Anp_Internalname, GXutil.ltrim( localUtil.ntoc( A5860Emp_Anp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_DUb_Internalname, GXutil.rtrim( A9744Emp_DUb)) ;
         httpContext.changePostValue( edtEmp_PzE_Internalname, GXutil.ltrim( localUtil.ntoc( A9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_UnE_Internalname, GXutil.ltrim( localUtil.ntoc( A9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_UnU_Internalname, GXutil.ltrim( localUtil.ntoc( A9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_PzU_Internalname, GXutil.ltrim( localUtil.ntoc( A9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9743Emp_CUb_"+sGXsfl_95_idx, GXutil.rtrim( Z9743Emp_CUb)) ;
         httpContext.changePostValue( "ZT_"+"Z5860Emp_Anp_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z5860Emp_Anp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9745Emp_PzE_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9746Emp_UnE_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9750Emp_UnU_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9751Emp_PzU_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9751Emp_PzU_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9750Emp_UnU_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9746Emp_UnE_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9745Emp_PzE_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1341_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1341_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1341_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1341 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1341_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1341_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_CUB_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_CUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_ANP_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_Anp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_DUB_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_DUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_PZE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_PzE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_UNE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_UnE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_UNU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_UnU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_PZU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_PzU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9752Emp_SPzU = s9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      O9753Emp_SUnU = s9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      O9748Emp_SUnE = s9748Emp_SUnE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      O9747Emp_SPzE = s9747Emp_SPzE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1510( )
   {
   }

   public void e121512( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tubiin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tubiin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tubiin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1266_", ""), (byte)(99), GXv_char2) ;
      tubiin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
      tubiin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
      tubiin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tubiin_impl.this.A396EmprCod = GXv_char2[0] ;
      tubiin_impl.this.AV11EmprNom = GXv_char3[0] ;
      tubiin_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111512 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e111512( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A44AlbRecCod ;
      GXv_int6[0] = (byte)(1) ;
      GXv_char3[0] = AV8UsurCod ;
      GXv_char2[0] = AV12Station ;
      GXv_char7[0] = AV34Msg_err ;
      new app.pubiin(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_char7) ;
      tubiin_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiin_impl.this.A44AlbRecCod = GXv_int5[0] ;
      tubiin_impl.this.AV8UsurCod = GXv_char3[0] ;
      tubiin_impl.this.AV12Station = GXv_char2[0] ;
      tubiin_impl.this.AV34Msg_err = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err", AV34Msg_err);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_ERR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Msg_err, ""))));
      /*  Sending Event outputs  */
   }

   public void e131512( )
   {
      /* 'Ver Situacion UBICACION' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A9743Emp_CUb, " ") != 0 )
      {
      }
      /*  Sending Event outputs  */
   }

   public void zm1517( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z56AlbRUni = T01516_A56AlbRUni[0] ;
            Z58AlbRUniEnt = T01516_A58AlbRUniEnt[0] ;
            Z52AlbRPieEnt = T01516_A52AlbRPieEnt[0] ;
            Z60AlbRUniUti = T01516_A60AlbRUniUti[0] ;
            Z54AlbRPieUti = T01516_A54AlbRPieUti[0] ;
            Z9749Emp_Item1 = T01516_A9749Emp_Item1[0] ;
         }
         else
         {
            Z56AlbRUni = A56AlbRUni ;
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z9749Emp_Item1 = A9749Emp_Item1 ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z56AlbRUni = A56AlbRUni ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z9749Emp_Item1 = A9749Emp_Item1 ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z9747Emp_SPzE = A9747Emp_SPzE ;
         Z9748Emp_SUnE = A9748Emp_SUnE ;
         Z9752Emp_SPzU = A9752Emp_SPzU ;
         Z9753Emp_SUnU = A9753Emp_SUnU ;
      }
   }

   public void standaloneNotModal( )
   {
      AV35Pgmname = "TUBIIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      /* Using cursor T01517 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01517_A407EmprNom[0] ;
      n407EmprNom = T01517_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01519 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A9747Emp_SPzE = T01519_A9747Emp_SPzE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         A9748Emp_SUnE = T01519_A9748Emp_SUnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         A9752Emp_SPzU = T01519_A9752Emp_SPzU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         A9753Emp_SUnU = T01519_A9753Emp_SUnU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      }
      else
      {
         A9747Emp_SPzE = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         A9748Emp_SUnE = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         A9752Emp_SPzU = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         A9753Emp_SUnU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      }
      O9747Emp_SPzE = A9747Emp_SPzE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      O9748Emp_SUnE = A9748Emp_SUnE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      O9752Emp_SPzU = A9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      O9753Emp_SUnU = A9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      pr_default.close(6);
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

   public void load1517( )
   {
      /* Using cursor T015111 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A407EmprNom = T015111_A407EmprNom[0] ;
         n407EmprNom = T015111_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A56AlbRUni = T015111_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A58AlbRUniEnt = T015111_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T015111_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A60AlbRUniUti = T015111_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A54AlbRPieUti = T015111_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A9749Emp_Item1 = T015111_A9749Emp_Item1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9749Emp_Item1", A9749Emp_Item1);
         A9747Emp_SPzE = T015111_A9747Emp_SPzE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         A9748Emp_SUnE = T015111_A9748Emp_SUnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         A9752Emp_SPzU = T015111_A9752Emp_SPzU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         A9753Emp_SUnU = T015111_A9753Emp_SUnU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
         zm1517( -17) ;
      }
      pr_default.close(7);
      onLoadActions1517( ) ;
   }

   public void onLoadActions1517( )
   {
      O9752Emp_SPzU = A9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      O9753Emp_SUnU = A9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      O9748Emp_SUnE = A9748Emp_SUnE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      O9747Emp_SPzE = A9747Emp_SPzE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void checkExtendedTable1517( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void closeExtendedTableCursors1517( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1517( )
   {
      /* Using cursor T015112 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01516 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T01516_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01516_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1517( 17) ;
         RcdFound7 = (short)(1) ;
         A56AlbRUni = T01516_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A58AlbRUniEnt = T01516_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01516_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A60AlbRUniUti = T01516_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A54AlbRPieUti = T01516_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A9749Emp_Item1 = T01516_A9749Emp_Item1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9749Emp_Item1", A9749Emp_Item1);
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1517( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey1517( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey1517( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1517( ) ;
      if ( RcdFound7 == 0 )
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
      RcdFound7 = (short)(0) ;
      /* Using cursor T015113 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T015113_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015113_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T015113_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015113_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T015114 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T015114_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015114_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T015114_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015114_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1517( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9752Emp_SPzU = O9752Emp_SPzU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         A9753Emp_SUnU = O9753Emp_SUnU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
         A9748Emp_SUnE = O9748Emp_SUnE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         A9747Emp_SPzE = O9747Emp_SPzE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1517( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9752Emp_SPzU = O9752Emp_SPzU ;
               httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
               A9753Emp_SUnU = O9753Emp_SUnU ;
               httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
               A9748Emp_SUnE = O9748Emp_SUnE ;
               httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
               A9747Emp_SPzE = O9747Emp_SPzE ;
               httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = cmbAlbRUni.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A9752Emp_SPzU = O9752Emp_SPzU ;
               httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
               A9753Emp_SUnU = O9753Emp_SUnU ;
               httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
               A9748Emp_SUnE = O9748Emp_SUnE ;
               httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
               A9747Emp_SPzE = O9747Emp_SPzE ;
               httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
               update1517( ) ;
               GX_FocusControl = cmbAlbRUni.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A9752Emp_SPzU = O9752Emp_SPzU ;
               httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
               A9753Emp_SUnU = O9753Emp_SUnU ;
               httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
               A9748Emp_SUnE = O9748Emp_SUnE ;
               httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
               A9747Emp_SPzE = O9747Emp_SPzE ;
               httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
               GX_FocusControl = cmbAlbRUni.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1517( ) ;
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
                  A9752Emp_SPzU = O9752Emp_SPzU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
                  A9753Emp_SUnU = O9753Emp_SUnU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
                  A9748Emp_SUnE = O9748Emp_SUnE ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
                  A9747Emp_SPzE = O9747Emp_SPzE ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
                  GX_FocusControl = cmbAlbRUni.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1517( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9752Emp_SPzU = O9752Emp_SPzU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         A9753Emp_SUnU = O9753Emp_SUnU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
         A9748Emp_SUnE = O9748Emp_SUnE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         A9747Emp_SPzE = O9747Emp_SPzE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
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
      getKey1517( ) ;
      if ( RcdFound7 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
         {
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tubiin");
      GX_FocusControl = cmbAlbRUni.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1510( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = cmbAlbRUni.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1517( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbAlbRUni.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1517( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbAlbRUni.getInternalname() ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbAlbRUni.getInternalname() ;
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
      scanStart1517( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound7 != 0 )
         {
            scanNext1517( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbAlbRUni.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1517( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1517( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01515 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z56AlbRUni, T01515_A56AlbRUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01515_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01515_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01515_A60AlbRUniUti[0]) != 0 ) || ( Z54AlbRPieUti != T01515_A54AlbRPieUti[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9749Emp_Item1, T01515_A9749Emp_Item1[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z56AlbRUni, T01515_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01515_A56AlbRUni[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01515_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01515_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01515_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01515_A52AlbRPieEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01515_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01515_A60AlbRUniUti[0]);
            }
            if ( Z54AlbRPieUti != T01515_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T01515_A54AlbRPieUti[0]);
            }
            if ( GXutil.strcmp(Z9749Emp_Item1, T01515_A9749Emp_Item1[0]) != 0 )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"Emp_Item1");
               GXutil.writeLogRaw("Old: ",Z9749Emp_Item1);
               GXutil.writeLogRaw("Current: ",T01515_A9749Emp_Item1[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1517( )
   {
      beforeValidate1517( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1517( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1517( 0) ;
         checkOptimisticConcurrency1517( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1517( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015115 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A56AlbRUni, A58AlbRUniEnt, Integer.valueOf(A52AlbRPieEnt), A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), A9749Emp_Item1, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
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
                        processLevel1517( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1510( ) ;
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
            load1517( ) ;
         }
         endLevel1517( ) ;
      }
      closeExtendedTableCursors1517( ) ;
   }

   public void update1517( )
   {
      beforeValidate1517( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1517( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1517( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1517( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015116 */
                  pr_default.execute(12, new Object[] {A56AlbRUni, A58AlbRUniEnt, Integer.valueOf(A52AlbRPieEnt), A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), A9749Emp_Item1, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1517( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char7[0] = A396EmprCod ;
                     GXv_int5[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char7, GXv_int5) ;
                     tubiin_impl.this.A396EmprCod = GXv_char7[0] ;
                     tubiin_impl.this.A44AlbRecCod = GXv_int5[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1517( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1510( ) ;
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
         endLevel1517( ) ;
      }
      closeExtendedTableCursors1517( ) ;
   }

   public void deferredUpdate1517( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1517( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1517( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1517( ) ;
         afterConfirm1517( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1517( ) ;
            if ( AnyError == 0 )
            {
               A9752Emp_SPzU = O9752Emp_SPzU ;
               httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
               A9753Emp_SUnU = O9753Emp_SUnU ;
               httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
               A9748Emp_SUnE = O9748Emp_SUnE ;
               httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
               A9747Emp_SPzE = O9747Emp_SPzE ;
               httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
               scanStart1511341( ) ;
               while ( RcdFound1341 != 0 )
               {
                  getByPrimaryKey1511341( ) ;
                  delete1511341( ) ;
                  scanNext1511341( ) ;
                  O9752Emp_SPzU = A9752Emp_SPzU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
                  O9753Emp_SUnU = A9753Emp_SUnU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
                  O9748Emp_SUnE = A9748Emp_SUnE ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
                  O9747Emp_SPzE = A9747Emp_SPzE ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
               }
               scanEnd1511341( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015117 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound7 == 0 )
                        {
                           initAll1517( ) ;
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
                        resetCaption1510( ) ;
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1517( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1517( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T015118 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T015119 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T015120 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T015121 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T015122 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T015123 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T015124 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T015125 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T015126 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T015127 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T015128 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T015129 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T015130 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T015131 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevel1511341( )
   {
      s9752Emp_SPzU = O9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      s9753Emp_SUnU = O9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      s9748Emp_SUnE = O9748Emp_SUnE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      s9747Emp_SPzE = O9747Emp_SPzE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1511341( ) ;
         if ( ( nRcdExists_1341 != 0 ) || ( nIsMod_1341 != 0 ) )
         {
            standaloneNotModal1511341( ) ;
            getKey1511341( ) ;
            if ( ( nRcdExists_1341 == 0 ) && ( nRcdDeleted_1341 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1511341( ) ;
            }
            else
            {
               if ( RcdFound1341 != 0 )
               {
                  if ( ( nRcdDeleted_1341 != 0 ) && ( nRcdExists_1341 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1511341( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1341 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1511341( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1341 == 0 )
                  {
                     GXCCtl = "EMP_CUB_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmp_CUb_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9752Emp_SPzU = A9752Emp_SPzU ;
            httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
            O9753Emp_SUnU = A9753Emp_SUnU ;
            httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
            O9748Emp_SUnE = A9748Emp_SUnE ;
            httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
            O9747Emp_SPzE = A9747Emp_SPzE ;
            httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1341_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_CUb_Internalname, GXutil.rtrim( A9743Emp_CUb)) ;
         httpContext.changePostValue( edtEmp_Anp_Internalname, GXutil.ltrim( localUtil.ntoc( A5860Emp_Anp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_DUb_Internalname, GXutil.rtrim( A9744Emp_DUb)) ;
         httpContext.changePostValue( edtEmp_PzE_Internalname, GXutil.ltrim( localUtil.ntoc( A9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_UnE_Internalname, GXutil.ltrim( localUtil.ntoc( A9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_UnU_Internalname, GXutil.ltrim( localUtil.ntoc( A9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmp_PzU_Internalname, GXutil.ltrim( localUtil.ntoc( A9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9743Emp_CUb_"+sGXsfl_95_idx, GXutil.rtrim( Z9743Emp_CUb)) ;
         httpContext.changePostValue( "ZT_"+"Z5860Emp_Anp_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z5860Emp_Anp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9745Emp_PzE_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9746Emp_UnE_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9750Emp_UnU_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9751Emp_PzU_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9751Emp_PzU_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9750Emp_UnU_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9746Emp_UnE_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9745Emp_PzE_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1341_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1341_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1341_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1341 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1341_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1341_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_CUB_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_CUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_ANP_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_Anp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_DUB_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_DUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_PZE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_PzE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_UNE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_UnE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_UNU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_UnU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMP_PZU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_PzU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1511341( ) ;
      if ( AnyError != 0 )
      {
         O9752Emp_SPzU = s9752Emp_SPzU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         O9753Emp_SUnU = s9753Emp_SUnU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
         O9748Emp_SUnE = s9748Emp_SUnE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         O9747Emp_SPzE = s9747Emp_SPzE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      }
      nRcdExists_1341 = (short)(0) ;
      nIsMod_1341 = (short)(0) ;
      nRcdDeleted_1341 = (short)(0) ;
   }

   public void processLevel1517( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevel1511341( ) ;
      if ( AnyError != 0 )
      {
         O9752Emp_SPzU = s9752Emp_SPzU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         O9753Emp_SUnU = s9753Emp_SUnU ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
         O9748Emp_SUnE = s9748Emp_SUnE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         O9747Emp_SPzE = s9747Emp_SPzE ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1517( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1517( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tubiin");
         if ( AnyError == 0 )
         {
            confirmValues1510( ) ;
         }
         /* After transaction rules */
         if ( ( ( A9747Emp_SPzE - A9752Emp_SPzU ) != ( A52AlbRPieEnt - A54AlbRPieUti ) ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.No coincide el Total Piezas UBICADAS con el Total Entrado", ""), 1, "ALBRPIEENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            return  ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tubiin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1517( )
   {
      /* Scan By routine */
      /* Using cursor T015132 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1517( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
   }

   public void scanEnd1517( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1517( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1517( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1517( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1517( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1517( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1517( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1517( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtEmp_SPzE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_SPzE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_SPzE_Enabled), 5, 0), true);
      edtEmp_SUnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_SUnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_SUnE_Enabled), 5, 0), true);
      edtEmp_SPzU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_SPzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_SPzU_Enabled), 5, 0), true);
      edtEmp_SUnU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_SUnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_SUnU_Enabled), 5, 0), true);
      edtEmp_Item1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_Item1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_Item1_Enabled), 5, 0), true);
   }

   public void zm1511341( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9745Emp_PzE = T01513_A9745Emp_PzE[0] ;
            Z9746Emp_UnE = T01513_A9746Emp_UnE[0] ;
            Z9750Emp_UnU = T01513_A9750Emp_UnU[0] ;
            Z9751Emp_PzU = T01513_A9751Emp_PzU[0] ;
         }
         else
         {
            Z9745Emp_PzE = A9745Emp_PzE ;
            Z9746Emp_UnE = A9746Emp_UnE ;
            Z9750Emp_UnU = A9750Emp_UnU ;
            Z9751Emp_PzU = A9751Emp_PzU ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z5860Emp_Anp = A5860Emp_Anp ;
         Z9745Emp_PzE = A9745Emp_PzE ;
         Z9746Emp_UnE = A9746Emp_UnE ;
         Z9750Emp_UnU = A9750Emp_UnU ;
         Z9751Emp_PzU = A9751Emp_PzU ;
         Z396EmprCod = A396EmprCod ;
         Z9743Emp_CUb = A9743Emp_CUb ;
         Z9744Emp_DUb = A9744Emp_DUb ;
      }
   }

   public void standaloneNotModal1511341( )
   {
      edtEmp_PzU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_PzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_PzU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_UnU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_UnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_UnU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void standaloneModal1511341( )
   {
      if ( isIns( )  )
      {
         A9753Emp_SUnU = O9753Emp_SUnU.add(A9750Emp_UnU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9753Emp_SUnU = O9753Emp_SUnU.add(A9750Emp_UnU).subtract(O9750Emp_UnU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9753Emp_SUnU = O9753Emp_SUnU.subtract(O9750Emp_UnU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A9752Emp_SPzU = (int)(O9752Emp_SPzU+A9751Emp_PzU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9752Emp_SPzU = (int)(O9752Emp_SPzU+A9751Emp_PzU-O9751Emp_PzU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9752Emp_SPzU = (int)(O9752Emp_SPzU-O9751Emp_PzU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEmp_CUb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmp_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_CUb_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtEmp_CUb_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmp_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_CUb_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEmp_Anp_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmp_Anp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_Anp_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtEmp_Anp_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmp_Anp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_Anp_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
   }

   public void load1511341( )
   {
      /* Using cursor T015133 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1341 = (short)(1) ;
         A9744Emp_DUb = T015133_A9744Emp_DUb[0] ;
         n9744Emp_DUb = T015133_n9744Emp_DUb[0] ;
         A9745Emp_PzE = T015133_A9745Emp_PzE[0] ;
         n9745Emp_PzE = T015133_n9745Emp_PzE[0] ;
         A9746Emp_UnE = T015133_A9746Emp_UnE[0] ;
         n9746Emp_UnE = T015133_n9746Emp_UnE[0] ;
         A9750Emp_UnU = T015133_A9750Emp_UnU[0] ;
         n9750Emp_UnU = T015133_n9750Emp_UnU[0] ;
         A9751Emp_PzU = T015133_A9751Emp_PzU[0] ;
         n9751Emp_PzU = T015133_n9751Emp_PzU[0] ;
         zm1511341( -20) ;
      }
      pr_default.close(29);
      onLoadActions1511341( ) ;
   }

   public void onLoadActions1511341( )
   {
      if ( isIns( )  )
      {
         A9747Emp_SPzE = (int)(O9747Emp_SPzE+A9745Emp_PzE) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9747Emp_SPzE = (int)(O9747Emp_SPzE+A9745Emp_PzE-O9745Emp_PzE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9747Emp_SPzE = (int)(O9747Emp_SPzE-O9745Emp_PzE) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A9748Emp_SUnE = O9748Emp_SUnE.add(A9746Emp_UnE) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9748Emp_SUnE = O9748Emp_SUnE.add(A9746Emp_UnE).subtract(O9746Emp_UnE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9748Emp_SUnE = O9748Emp_SUnE.subtract(O9746Emp_UnE) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable1511341( )
   {
      nIsDirty_1341 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1511341( ) ;
      /* Using cursor T01514 */
      pr_default.execute(2, new Object[] {A396EmprCod, A9743Emp_CUb});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "EMP_CUB_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UBIALB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmp_CUb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9744Emp_DUb = T01514_A9744Emp_DUb[0] ;
      n9744Emp_DUb = T01514_n9744Emp_DUb[0] ;
      pr_default.close(2);
      if ( ( GXutil.strcmp(A9743Emp_CUb, " ") != 0 ) && true /* After */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = A9743Emp_CUb ;
         GXv_int8[0] = A5860Emp_Anp ;
         GXv_char3[0] = AV32Msg_ib ;
         new app.pinfubi(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_int8, GXv_char3) ;
         tubiin_impl.this.A396EmprCod = GXv_char7[0] ;
         tubiin_impl.this.A9743Emp_CUb = GXv_char4[0] ;
         tubiin_impl.this.A5860Emp_Anp = GXv_int8[0] ;
         tubiin_impl.this.AV32Msg_ib = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_ib", AV32Msg_ib);
      }
      if ( isIns( )  )
      {
         nIsDirty_1341 = (short)(1) ;
         A9747Emp_SPzE = (int)(O9747Emp_SPzE+A9745Emp_PzE) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1341 = (short)(1) ;
            A9747Emp_SPzE = (int)(O9747Emp_SPzE+A9745Emp_PzE-O9745Emp_PzE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1341 = (short)(1) ;
               A9747Emp_SPzE = (int)(O9747Emp_SPzE-O9745Emp_PzE) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1341 = (short)(1) ;
         A9748Emp_SUnE = O9748Emp_SUnE.add(A9746Emp_UnE) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1341 = (short)(1) ;
            A9748Emp_SUnE = O9748Emp_SUnE.add(A9746Emp_UnE).subtract(O9746Emp_UnE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1341 = (short)(1) ;
               A9748Emp_SUnE = O9748Emp_SUnE.subtract(O9746Emp_UnE) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors1511341( )
   {
      pr_default.close(2);
   }

   public void enableDisable1511341( )
   {
   }

   public void gxload_21( String A396EmprCod ,
                          String A9743Emp_CUb )
   {
      /* Using cursor T015134 */
      pr_default.execute(30, new Object[] {A396EmprCod, A9743Emp_CUb});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "EMP_CUB_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UBIALB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmp_CUb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9744Emp_DUb = T015134_A9744Emp_DUb[0] ;
      n9744Emp_DUb = T015134_n9744Emp_DUb[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9744Emp_DUb))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void getKey1511341( )
   {
      /* Using cursor T015135 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1341 = (short)(1) ;
      }
      else
      {
         RcdFound1341 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey1511341( )
   {
      /* Using cursor T01513 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
      if ( (pr_default.getStatus(1) != 101) && ( T01513_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01513_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1511341( 20) ;
         RcdFound1341 = (short)(1) ;
         initializeNonKey1511341( ) ;
         A5860Emp_Anp = T01513_A5860Emp_Anp[0] ;
         A9745Emp_PzE = T01513_A9745Emp_PzE[0] ;
         n9745Emp_PzE = T01513_n9745Emp_PzE[0] ;
         A9746Emp_UnE = T01513_A9746Emp_UnE[0] ;
         n9746Emp_UnE = T01513_n9746Emp_UnE[0] ;
         A9750Emp_UnU = T01513_A9750Emp_UnU[0] ;
         n9750Emp_UnU = T01513_n9750Emp_UnU[0] ;
         A9751Emp_PzU = T01513_A9751Emp_PzU[0] ;
         n9751Emp_PzU = T01513_n9751Emp_PzU[0] ;
         A9743Emp_CUb = T01513_A9743Emp_CUb[0] ;
         O9751Emp_PzU = A9751Emp_PzU ;
         n9751Emp_PzU = false ;
         O9750Emp_UnU = A9750Emp_UnU ;
         n9750Emp_UnU = false ;
         O9746Emp_UnE = A9746Emp_UnE ;
         n9746Emp_UnE = false ;
         O9745Emp_PzE = A9745Emp_PzE ;
         n9745Emp_PzE = false ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z9743Emp_CUb = A9743Emp_CUb ;
         Z5860Emp_Anp = A5860Emp_Anp ;
         sMode1341 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1511341( ) ;
         load1511341( ) ;
         Gx_mode = sMode1341 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1341 = (short)(0) ;
         initializeNonKey1511341( ) ;
         sMode1341 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1511341( ) ;
         Gx_mode = sMode1341 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1511341( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1511341( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01512 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z9745Emp_PzE != T01512_A9745Emp_PzE[0] ) || ( DecimalUtil.compareTo(Z9746Emp_UnE, T01512_A9746Emp_UnE[0]) != 0 ) || ( DecimalUtil.compareTo(Z9750Emp_UnU, T01512_A9750Emp_UnU[0]) != 0 ) || ( Z9751Emp_PzU != T01512_A9751Emp_PzU[0] ) )
         {
            if ( Z9745Emp_PzE != T01512_A9745Emp_PzE[0] )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"Emp_PzE");
               GXutil.writeLogRaw("Old: ",Z9745Emp_PzE);
               GXutil.writeLogRaw("Current: ",T01512_A9745Emp_PzE[0]);
            }
            if ( DecimalUtil.compareTo(Z9746Emp_UnE, T01512_A9746Emp_UnE[0]) != 0 )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"Emp_UnE");
               GXutil.writeLogRaw("Old: ",Z9746Emp_UnE);
               GXutil.writeLogRaw("Current: ",T01512_A9746Emp_UnE[0]);
            }
            if ( DecimalUtil.compareTo(Z9750Emp_UnU, T01512_A9750Emp_UnU[0]) != 0 )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"Emp_UnU");
               GXutil.writeLogRaw("Old: ",Z9750Emp_UnU);
               GXutil.writeLogRaw("Current: ",T01512_A9750Emp_UnU[0]);
            }
            if ( Z9751Emp_PzU != T01512_A9751Emp_PzU[0] )
            {
               GXutil.writeLogln("tubiin:[seudo value changed for attri]"+"Emp_PzU");
               GXutil.writeLogRaw("Old: ",Z9751Emp_PzU);
               GXutil.writeLogRaw("Current: ",T01512_A9751Emp_PzU[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUBIIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1511341( )
   {
      beforeValidate1511341( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1511341( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1511341( 0) ;
         checkOptimisticConcurrency1511341( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1511341( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1511341( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015136 */
                  pr_default.execute(32, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Short.valueOf(A5860Emp_Anp), Boolean.valueOf(n9745Emp_PzE), Integer.valueOf(A9745Emp_PzE), Boolean.valueOf(n9746Emp_UnE), A9746Emp_UnE, Boolean.valueOf(n9750Emp_UnU), A9750Emp_UnU, Boolean.valueOf(n9751Emp_PzU), Integer.valueOf(A9751Emp_PzU), A396EmprCod, A9743Emp_CUb});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIIN");
                  if ( (pr_default.getStatus(32) == 1) )
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
            load1511341( ) ;
         }
         endLevel1511341( ) ;
      }
      closeExtendedTableCursors1511341( ) ;
   }

   public void update1511341( )
   {
      beforeValidate1511341( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1511341( ) ;
      }
      if ( ( nIsMod_1341 != 0 ) || ( nIsDirty_1341 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1511341( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1511341( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1511341( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015137 */
                     pr_default.execute(33, new Object[] {Boolean.valueOf(n9745Emp_PzE), Integer.valueOf(A9745Emp_PzE), Boolean.valueOf(n9746Emp_UnE), A9746Emp_UnE, Boolean.valueOf(n9750Emp_UnU), A9750Emp_UnU, Boolean.valueOf(n9751Emp_PzU), Integer.valueOf(A9751Emp_PzU), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIIN");
                     if ( (pr_default.getStatus(33) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1511341( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char7[0] = A396EmprCod ;
                        GXv_int5[0] = A44AlbRecCod ;
                        new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char7, GXv_int5) ;
                        tubiin_impl.this.A396EmprCod = GXv_char7[0] ;
                        tubiin_impl.this.A44AlbRecCod = GXv_int5[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1511341( ) ;
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
            endLevel1511341( ) ;
         }
      }
      closeExtendedTableCursors1511341( ) ;
   }

   public void deferredUpdate1511341( )
   {
   }

   public void delete1511341( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1511341( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1511341( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1511341( ) ;
         afterConfirm1511341( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1511341( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015138 */
               pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIIN");
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
      sMode1341 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1511341( ) ;
      Gx_mode = sMode1341 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1511341( )
   {
      standaloneModal1511341( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T015139 */
         pr_default.execute(35, new Object[] {A396EmprCod, A9743Emp_CUb});
         A9744Emp_DUb = T015139_A9744Emp_DUb[0] ;
         n9744Emp_DUb = T015139_n9744Emp_DUb[0] ;
         pr_default.close(35);
         if ( isIns( )  )
         {
            A9747Emp_SPzE = (int)(O9747Emp_SPzE+A9745Emp_PzE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9747Emp_SPzE = (int)(O9747Emp_SPzE+A9745Emp_PzE-O9745Emp_PzE) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9747Emp_SPzE = (int)(O9747Emp_SPzE-O9745Emp_PzE) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A9748Emp_SUnE = O9748Emp_SUnE.add(A9746Emp_UnE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9748Emp_SUnE = O9748Emp_SUnE.add(A9746Emp_UnE).subtract(O9746Emp_UnE) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9748Emp_SUnE = O9748Emp_SUnE.subtract(O9746Emp_UnE) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
               }
            }
         }
         if ( isDlt( )  )
         {
            GXv_char7[0] = A396EmprCod ;
            GXv_int5[0] = A44AlbRecCod ;
            GXv_char4[0] = A9743Emp_CUb ;
            GXv_int8[0] = A5860Emp_Anp ;
            GXv_int9[0] = A9745Emp_PzE ;
            GXv_decimal10[0] = A9746Emp_UnE ;
            GXv_int11[0] = 0 ;
            GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
            new app.pubiins(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_char4, GXv_int8, GXv_int9, GXv_decimal10, GXv_int11, GXv_decimal12) ;
            tubiin_impl.this.A396EmprCod = GXv_char7[0] ;
            tubiin_impl.this.A44AlbRecCod = GXv_int5[0] ;
            tubiin_impl.this.A9743Emp_CUb = GXv_char4[0] ;
            tubiin_impl.this.A5860Emp_Anp = GXv_int8[0] ;
            tubiin_impl.this.A9745Emp_PzE = GXv_int9[0] ;
            tubiin_impl.this.A9746Emp_UnE = GXv_decimal10[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
      }
   }

   public void endLevel1511341( )
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

   public void scanStart1511341( )
   {
      /* Scan By routine */
      /* Using cursor T015140 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound1341 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1341 = (short)(1) ;
         A9743Emp_CUb = T015140_A9743Emp_CUb[0] ;
         A5860Emp_Anp = T015140_A5860Emp_Anp[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1511341( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound1341 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1341 = (short)(1) ;
         A9743Emp_CUb = T015140_A9743Emp_CUb[0] ;
         A5860Emp_Anp = T015140_A5860Emp_Anp[0] ;
      }
   }

   public void scanEnd1511341( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1511341( )
   {
      /* After Confirm Rules */
      if ( ( A5860Emp_Anp == 0 ) && true /* After */ )
      {
         GXCCtl = "EMP_ANP_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede entrar Pulgadas con valor 0", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmp_Anp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( A9745Emp_PzE == 0 ) && true /* After */ )
      {
         GXCCtl = "EMP_PZE_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No ha entrado Piezas", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmp_PzE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( A9746Emp_UnE.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "EMP_UNE_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. No ha entrado Unidades", ""), 0, GXCCtl);
      }
   }

   public void beforeInsert1511341( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1511341( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1511341( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1511341( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1511341( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1511341( )
   {
      edtEmp_CUb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_CUb_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_Anp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_Anp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_Anp_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_DUb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_DUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_DUb_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_PzE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_PzE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_PzE_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_UnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_UnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_UnE_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_UnU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_UnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_UnU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_PzU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_PzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_PzU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void send_integrity_lvl_hashes1511341( )
   {
   }

   public void send_integrity_lvl_hashes1517( )
   {
   }

   public void subsflControlProps_951341( )
   {
      edtavnRcdDeleted_1341_Internalname = "vNRCDDELETED_1341_"+sGXsfl_95_idx ;
      edtEmp_CUb_Internalname = "EMP_CUB_"+sGXsfl_95_idx ;
      edtEmp_Anp_Internalname = "EMP_ANP_"+sGXsfl_95_idx ;
      edtEmp_DUb_Internalname = "EMP_DUB_"+sGXsfl_95_idx ;
      edtEmp_PzE_Internalname = "EMP_PZE_"+sGXsfl_95_idx ;
      edtEmp_UnE_Internalname = "EMP_UNE_"+sGXsfl_95_idx ;
      edtEmp_UnU_Internalname = "EMP_UNU_"+sGXsfl_95_idx ;
      edtEmp_PzU_Internalname = "EMP_PZU_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_951341( )
   {
      edtavnRcdDeleted_1341_Internalname = "vNRCDDELETED_1341_"+sGXsfl_95_fel_idx ;
      edtEmp_CUb_Internalname = "EMP_CUB_"+sGXsfl_95_fel_idx ;
      edtEmp_Anp_Internalname = "EMP_ANP_"+sGXsfl_95_fel_idx ;
      edtEmp_DUb_Internalname = "EMP_DUB_"+sGXsfl_95_fel_idx ;
      edtEmp_PzE_Internalname = "EMP_PZE_"+sGXsfl_95_fel_idx ;
      edtEmp_UnE_Internalname = "EMP_UNE_"+sGXsfl_95_fel_idx ;
      edtEmp_UnU_Internalname = "EMP_UNU_"+sGXsfl_95_fel_idx ;
      edtEmp_PzU_Internalname = "EMP_PZU_"+sGXsfl_95_fel_idx ;
   }

   public void addRow1511341( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951341( ) ;
      sendRow1511341( ) ;
   }

   public void sendRow1511341( )
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
         if ( ((int)((nGXsfl_95_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1341_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1341_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1341_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1341), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1341), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1341_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1341_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1341_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmp_CUb_Internalname,GXutil.rtrim( A9743Emp_CUb),GXutil.rtrim( localUtil.format( A9743Emp_CUb, "!!!/!!!!!!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmp_CUb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmp_CUb_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1341_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmp_Anp_Internalname,GXutil.ltrim( localUtil.ntoc( A5860Emp_Anp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5860Emp_Anp), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmp_Anp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmp_Anp_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmp_DUb_Internalname,GXutil.rtrim( A9744Emp_DUb),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmp_DUb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmp_DUb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1341_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmp_PzE_Internalname,GXutil.ltrim( localUtil.ntoc( A9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEmp_PzE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9745Emp_PzE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9745Emp_PzE), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmp_PzE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmp_PzE_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1341_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmp_UnE_Internalname,GXutil.ltrim( localUtil.ntoc( A9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEmp_UnE_Enabled!=0) ? localUtil.format( A9746Emp_UnE, "ZZZZZ9.99") : localUtil.format( A9746Emp_UnE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmp_UnE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmp_UnE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmp_UnU_Internalname,GXutil.ltrim( localUtil.ntoc( A9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEmp_UnU_Enabled!=0) ? localUtil.format( A9750Emp_UnU, "ZZZZZ9.99") : localUtil.format( A9750Emp_UnU, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmp_UnU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmp_UnU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmp_PzU_Internalname,GXutil.ltrim( localUtil.ntoc( A9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEmp_PzU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9751Emp_PzU), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9751Emp_PzU), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmp_PzU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmp_PzU_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1511341( ) ;
      GXCCtl = "Z9743Emp_CUb_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9743Emp_CUb));
      GXCCtl = "Z5860Emp_Anp_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5860Emp_Anp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9745Emp_PzE_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9746Emp_UnE_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9750Emp_UnU_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9751Emp_PzU_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9751Emp_PzU_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9751Emp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9750Emp_UnU_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9750Emp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9746Emp_UnE_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9746Emp_UnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9745Emp_PzE_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9745Emp_PzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1341_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1341_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1341_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1341, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vUSURCOD_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8UsurCod));
      GXCCtl = "vSTATION_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12Station));
      GXCCtl = "vMSG_ERR_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34Msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1341_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1341_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMP_CUB_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_CUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMP_ANP_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_Anp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMP_DUB_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_DUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMP_PZE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_PzE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMP_UNE_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_UnE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMP_UNU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_UnU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMP_PZU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_PzU_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1511341( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951341( ) ;
      edtavnRcdDeleted_1341_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1341_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmp_CUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_CUB_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmp_Anp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_ANP_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmp_DUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_DUB_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmp_PzE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_PZE_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmp_UnE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_UNE_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmp_UnU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_UNU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmp_PzU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMP_PZU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1341_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1341_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1341");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1341_Internalname ;
         wbErr = true ;
         nRcdDeleted_1341 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1341 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1341_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9743Emp_CUb = httpContext.cgiGet( edtEmp_CUb_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEmp_Anp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEmp_Anp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "EMP_ANP_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmp_Anp_Internalname ;
         wbErr = true ;
         A5860Emp_Anp = (short)(0) ;
      }
      else
      {
         A5860Emp_Anp = (short)(localUtil.ctol( httpContext.cgiGet( edtEmp_Anp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9744Emp_DUb = httpContext.cgiGet( edtEmp_DUb_Internalname) ;
      n9744Emp_DUb = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEmp_PzE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEmp_PzE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "EMP_PZE_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmp_PzE_Internalname ;
         wbErr = true ;
         A9745Emp_PzE = 0 ;
         n9745Emp_PzE = false ;
      }
      else
      {
         A9745Emp_PzE = (int)(localUtil.ctol( httpContext.cgiGet( edtEmp_PzE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9745Emp_PzE = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEmp_UnE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEmp_UnE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "EMP_UNE_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmp_UnE_Internalname ;
         wbErr = true ;
         A9746Emp_UnE = DecimalUtil.ZERO ;
         n9746Emp_UnE = false ;
      }
      else
      {
         A9746Emp_UnE = localUtil.ctond( httpContext.cgiGet( edtEmp_UnE_Internalname)) ;
         n9746Emp_UnE = false ;
      }
      A9750Emp_UnU = localUtil.ctond( httpContext.cgiGet( edtEmp_UnU_Internalname)) ;
      n9750Emp_UnU = false ;
      A9751Emp_PzU = (int)(localUtil.ctol( httpContext.cgiGet( edtEmp_PzU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n9751Emp_PzU = false ;
      GXCCtl = "Z9743Emp_CUb_" + sGXsfl_95_idx ;
      Z9743Emp_CUb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5860Emp_Anp_" + sGXsfl_95_idx ;
      Z5860Emp_Anp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9745Emp_PzE_" + sGXsfl_95_idx ;
      Z9745Emp_PzE = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9746Emp_UnE_" + sGXsfl_95_idx ;
      Z9746Emp_UnE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9750Emp_UnU_" + sGXsfl_95_idx ;
      Z9750Emp_UnU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9751Emp_PzU_" + sGXsfl_95_idx ;
      Z9751Emp_PzU = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O9751Emp_PzU_" + sGXsfl_95_idx ;
      O9751Emp_PzU = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O9750Emp_UnU_" + sGXsfl_95_idx ;
      O9750Emp_UnU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9746Emp_UnE_" + sGXsfl_95_idx ;
      O9746Emp_UnE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9745Emp_PzE_" + sGXsfl_95_idx ;
      O9745Emp_PzE = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1341_" + sGXsfl_95_idx ;
      nRcdDeleted_1341 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1341_" + sGXsfl_95_idx ;
      nRcdExists_1341 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1341_" + sGXsfl_95_idx ;
      nIsMod_1341 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEmp_PzU_Enabled = edtEmp_PzU_Enabled ;
      defedtEmp_UnU_Enabled = edtEmp_UnU_Enabled ;
      defedtEmp_Anp_Enabled = edtEmp_Anp_Enabled ;
      defedtEmp_CUb_Enabled = edtEmp_CUb_Enabled ;
   }

   public void confirmValues1510( )
   {
      nGXsfl_95_idx = 0 ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951341( ) ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951341( ) ;
         httpContext.changePostValue( "Z9743Emp_CUb_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z9743Emp_CUb_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9743Emp_CUb_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z5860Emp_Anp_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z5860Emp_Anp_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5860Emp_Anp_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z9745Emp_PzE_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z9745Emp_PzE_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9745Emp_PzE_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z9746Emp_UnE_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z9746Emp_UnE_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9746Emp_UnE_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z9750Emp_UnU_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z9750Emp_UnU_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9750Emp_UnU_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z9751Emp_PzU_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z9751Emp_PzU_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9751Emp_PzU_"+sGXsfl_95_idx) ;
      }
      httpContext.changePostValue( "O9751Emp_PzU", httpContext.cgiGet( "T9751Emp_PzU")) ;
      httpContext.deletePostValue( "T9751Emp_PzU") ;
      httpContext.changePostValue( "O9750Emp_UnU", httpContext.cgiGet( "T9750Emp_UnU")) ;
      httpContext.deletePostValue( "T9750Emp_UnU") ;
      httpContext.changePostValue( "O9746Emp_UnE", httpContext.cgiGet( "T9746Emp_UnE")) ;
      httpContext.deletePostValue( "T9746Emp_UnE") ;
      httpContext.changePostValue( "O9745Emp_PzE", httpContext.cgiGet( "T9745Emp_PzE")) ;
      httpContext.deletePostValue( "T9745Emp_PzE") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tubiin", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","AlbRecCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9749Emp_Item1", GXutil.rtrim( Z9749Emp_Item1));
      app.GxWebStd.gx_hidden_field( httpContext, "O9752Emp_SPzU", GXutil.ltrim( localUtil.ntoc( O9752Emp_SPzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9753Emp_SUnU", GXutil.ltrim( localUtil.ntoc( O9753Emp_SUnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9748Emp_SUnE", GXutil.ltrim( localUtil.ntoc( O9748Emp_SUnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9747Emp_SPzE", GXutil.ltrim( localUtil.ntoc( O9747Emp_SPzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nGXsfl_95_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV34Msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_ERR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Msg_err, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_IB", GXutil.rtrim( AV32Msg_ib));
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
      return formatLink("app.tubiin", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "TUBIIN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA INFORMACION UBICACION", "") ;
   }

   public void initializeNonKey1517( )
   {
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A9749Emp_Item1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9749Emp_Item1", A9749Emp_Item1);
      O9752Emp_SPzU = A9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
      O9753Emp_SUnU = A9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      O9748Emp_SUnE = A9748Emp_SUnE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
      O9747Emp_SPzE = A9747Emp_SPzE ;
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
      Z56AlbRUni = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z54AlbRPieUti = 0 ;
      Z9749Emp_Item1 = "" ;
   }

   public void initAll1517( )
   {
      initializeNonKey1517( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1511341( )
   {
      AV32Msg_ib = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_ib", AV32Msg_ib);
      A9744Emp_DUb = "" ;
      n9744Emp_DUb = false ;
      A9745Emp_PzE = 0 ;
      n9745Emp_PzE = false ;
      A9746Emp_UnE = DecimalUtil.ZERO ;
      n9746Emp_UnE = false ;
      A9750Emp_UnU = DecimalUtil.ZERO ;
      n9750Emp_UnU = false ;
      A9751Emp_PzU = 0 ;
      n9751Emp_PzU = false ;
      O9751Emp_PzU = A9751Emp_PzU ;
      n9751Emp_PzU = false ;
      O9750Emp_UnU = A9750Emp_UnU ;
      n9750Emp_UnU = false ;
      O9746Emp_UnE = A9746Emp_UnE ;
      n9746Emp_UnE = false ;
      O9745Emp_PzE = A9745Emp_PzE ;
      n9745Emp_PzE = false ;
      Z9745Emp_PzE = 0 ;
      Z9746Emp_UnE = DecimalUtil.ZERO ;
      Z9750Emp_UnU = DecimalUtil.ZERO ;
      Z9751Emp_PzU = 0 ;
   }

   public void initAll1511341( )
   {
      A9743Emp_CUb = "" ;
      A5860Emp_Anp = (short)(0) ;
      initializeNonKey1511341( ) ;
   }

   public void standaloneModalInsert1511341( )
   {
      A9753Emp_SUnU = i9753Emp_SUnU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      A9752Emp_SPzU = i9752Emp_SPzU ;
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154307", true, true);
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
      httpContext.AddJavascriptSource("tubiin.js", "?2026824154307", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1341( )
   {
      edtEmp_PzU_Enabled = defedtEmp_PzU_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_PzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_PzU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_UnU_Enabled = defedtEmp_UnU_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_UnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_UnU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_Anp_Enabled = defedtEmp_Anp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_Anp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_Anp_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtEmp_CUb_Enabled = defedtEmp_CUb_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp_CUb_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void startgridcontrol95( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1341, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1341_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9743Emp_CUb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_CUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5860Emp_Anp, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_Anp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9744Emp_DUb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_DUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9745Emp_PzE, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_PzE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9746Emp_UnE, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_UnE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9750Emp_UnU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_UnU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9751Emp_PzU, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmp_PzU_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtEmp_SPzE_Internalname = "EMP_SPZE" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEmp_SUnE_Internalname = "EMP_SUNE" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEmp_SPzU_Internalname = "EMP_SPZU" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEmp_SUnU_Internalname = "EMP_SUNU" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtEmp_Item1_Internalname = "EMP_ITEM1" ;
      edtavnRcdDeleted_1341_Internalname = "vNRCDDELETED_1341" ;
      edtEmp_CUb_Internalname = "EMP_CUB" ;
      edtEmp_Anp_Internalname = "EMP_ANP" ;
      edtEmp_DUb_Internalname = "EMP_DUB" ;
      edtEmp_PzE_Internalname = "EMP_PZE" ;
      edtEmp_UnE_Internalname = "EMP_UNE" ;
      edtEmp_UnU_Internalname = "EMP_UNU" ;
      edtEmp_PzU_Internalname = "EMP_PZU" ;
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
      Form.setCaption( httpContext.getMessage( "ENTRADA INFORMACION UBICACION", "") );
      edtEmp_PzU_Jsonclick = "" ;
      edtEmp_UnU_Jsonclick = "" ;
      edtEmp_UnE_Jsonclick = "" ;
      edtEmp_PzE_Jsonclick = "" ;
      edtEmp_DUb_Jsonclick = "" ;
      edtEmp_Anp_Jsonclick = "" ;
      edtEmp_CUb_Jsonclick = "" ;
      edtavnRcdDeleted_1341_Jsonclick = "" ;
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
      edtEmp_PzU_Enabled = 0 ;
      edtEmp_UnU_Enabled = 0 ;
      edtEmp_UnE_Enabled = 1 ;
      edtEmp_PzE_Enabled = 1 ;
      edtEmp_DUb_Enabled = 0 ;
      edtEmp_Anp_Enabled = 1 ;
      edtEmp_CUb_Enabled = 1 ;
      edtavnRcdDeleted_1341_Enabled = 1 ;
      edtEmp_Item1_Jsonclick = "" ;
      edtEmp_Item1_Backcolor = (int)(0xFFFFFF) ;
      edtEmp_Item1_Enabled = 1 ;
      edtEmp_SUnU_Jsonclick = "" ;
      edtEmp_SUnU_Backcolor = (int)(0xFFFFFF) ;
      edtEmp_SUnU_Enabled = 0 ;
      edtEmp_SPzU_Jsonclick = "" ;
      edtEmp_SPzU_Backcolor = (int)(0xFFFFFF) ;
      edtEmp_SPzU_Enabled = 0 ;
      edtEmp_SUnE_Jsonclick = "" ;
      edtEmp_SUnE_Backcolor = (int)(0xFFFFFF) ;
      edtEmp_SUnE_Enabled = 0 ;
      edtEmp_SPzE_Jsonclick = "" ;
      edtEmp_SPzE_Backcolor = (int)(0xFFFFFF) ;
      edtEmp_SPzE_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieUti_Enabled = 1 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniUti_Enabled = 1 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieEnt_Enabled = 1 ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniEnt_Enabled = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 1 );
      cmbAlbRUni.setIBackground( (int)(0xFFFFFF) );
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 0 ;
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

   public void xc_14_1511341( String A396EmprCod ,
                              String A9743Emp_CUb ,
                              short A5860Emp_Anp ,
                              String AV32Msg_ib )
   {
      if ( ( GXutil.strcmp(A9743Emp_CUb, " ") != 0 ) && true /* After */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = A9743Emp_CUb ;
         GXv_int8[0] = A5860Emp_Anp ;
         GXv_char3[0] = AV32Msg_ib ;
         new app.pinfubi(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_int8, GXv_char3) ;
         A396EmprCod = GXv_char7[0] ;
         A9743Emp_CUb = GXv_char4[0] ;
         A5860Emp_Anp = GXv_int8[0] ;
         AV32Msg_ib = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_ib", AV32Msg_ib);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9743Emp_CUb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5860Emp_Anp, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV32Msg_ib))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_15_1511341( String Gx_mode ,
                              String A396EmprCod ,
                              int A44AlbRecCod ,
                              String A9743Emp_CUb ,
                              short A5860Emp_Anp ,
                              int A9745Emp_PzE ,
                              java.math.BigDecimal A9746Emp_UnE )
   {
      if ( isDlt( )  )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int11[0] = A44AlbRecCod ;
         GXv_char4[0] = A9743Emp_CUb ;
         GXv_int8[0] = A5860Emp_Anp ;
         GXv_int9[0] = A9745Emp_PzE ;
         GXv_decimal12[0] = A9746Emp_UnE ;
         GXv_int5[0] = 0 ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         new app.pubiins(remoteHandle, context).execute( GXv_char7, GXv_int11, GXv_char4, GXv_int8, GXv_int9, GXv_decimal12, GXv_int5, GXv_decimal10) ;
         A396EmprCod = GXv_char7[0] ;
         A44AlbRecCod = GXv_int11[0] ;
         A9743Emp_CUb = GXv_char4[0] ;
         A5860Emp_Anp = GXv_int8[0] ;
         A9745Emp_PzE = GXv_int9[0] ;
         A9746Emp_UnE = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9743Emp_CUb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5860Emp_Anp, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9745Emp_PzE, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9746Emp_UnE, (byte)(9), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_951341( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1511341( ) ;
         standaloneModal1511341( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1511341( ) ;
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951341( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T015141 */
      pr_default.execute(37, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015141_A407EmprNom[0] ;
      n407EmprNom = T015141_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(37);
      /* Using cursor T015143 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         A9747Emp_SPzE = T015143_A9747Emp_SPzE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         A9748Emp_SUnE = T015143_A9748Emp_SUnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         A9752Emp_SPzU = T015143_A9752Emp_SPzU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         A9753Emp_SUnU = T015143_A9753Emp_SUnU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      }
      else
      {
         A9747Emp_SPzE = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9747Emp_SPzE), 6, 0));
         A9748Emp_SUnE = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrimstr( A9748Emp_SUnE, 9, 2));
         A9752Emp_SPzU = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9752Emp_SPzU), 6, 0));
         A9753Emp_SUnU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrimstr( A9753Emp_SUnU, 9, 2));
      }
      pr_default.close(38);
      GX_FocusControl = cmbAlbRUni.getInternalname() ;
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

   public void valid_Albreccod( )
   {
      n9751Emp_PzU = false ;
      n9750Emp_UnU = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      n44AlbRecCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9747Emp_SPzE", GXutil.ltrim( localUtil.ntoc( A9747Emp_SPzE, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9748Emp_SUnE", GXutil.ltrim( localUtil.ntoc( A9748Emp_SUnE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9752Emp_SPzU", GXutil.ltrim( localUtil.ntoc( A9752Emp_SPzU, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9753Emp_SUnU", GXutil.ltrim( localUtil.ntoc( A9753Emp_SUnU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9749Emp_Item1", GXutil.rtrim( A9749Emp_Item1));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9747Emp_SPzE", GXutil.ltrim( localUtil.ntoc( Z9747Emp_SPzE, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9748Emp_SUnE", GXutil.ltrim( localUtil.ntoc( Z9748Emp_SUnE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9752Emp_SPzU", GXutil.ltrim( localUtil.ntoc( Z9752Emp_SPzU, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9753Emp_SUnU", GXutil.ltrim( localUtil.ntoc( Z9753Emp_SUnU, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9749Emp_Item1", GXutil.rtrim( Z9749Emp_Item1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9752Emp_SPzU", GXutil.ltrim( localUtil.ntoc( O9752Emp_SPzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9753Emp_SUnU", GXutil.ltrim( localUtil.ntoc( O9753Emp_SUnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9748Emp_SUnE", GXutil.ltrim( localUtil.ntoc( O9748Emp_SUnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9747Emp_SPzE", GXutil.ltrim( localUtil.ntoc( O9747Emp_SPzE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Emp_cub( )
   {
      n9744Emp_DUb = false ;
      /* Using cursor T015139 */
      pr_default.execute(35, new Object[] {A396EmprCod, A9743Emp_CUb});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UBIALB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMP_CUB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmp_CUb_Internalname ;
      }
      A9744Emp_DUb = T015139_A9744Emp_DUb[0] ;
      n9744Emp_DUb = T015139_n9744Emp_DUb[0] ;
      pr_default.close(35);
      if ( ( GXutil.strcmp(A9743Emp_CUb, " ") != 0 ) && true /* After */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = A9743Emp_CUb ;
         GXv_int8[0] = A5860Emp_Anp ;
         GXv_char3[0] = AV32Msg_ib ;
         new app.pinfubi(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_int8, GXv_char3) ;
         tubiin_impl.this.A396EmprCod = GXv_char7[0] ;
         A396EmprCod = this.A396EmprCod ;
         tubiin_impl.this.A9743Emp_CUb = GXv_char4[0] ;
         A9743Emp_CUb = this.A9743Emp_CUb ;
         tubiin_impl.this.A5860Emp_Anp = GXv_int8[0] ;
         A5860Emp_Anp = this.A5860Emp_Anp ;
         tubiin_impl.this.AV32Msg_ib = GXv_char3[0] ;
         AV32Msg_ib = this.AV32Msg_ib ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9744Emp_DUb", GXutil.rtrim( A9744Emp_DUb));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A9743Emp_CUb", GXutil.rtrim( A9743Emp_CUb));
      httpContext.ajax_rsp_assign_attri("", false, "A5860Emp_Anp", GXutil.ltrim( localUtil.ntoc( A5860Emp_Anp, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_ib", GXutil.rtrim( AV32Msg_ib));
   }

   public void valid_Emp_une( )
   {
      n9746Emp_UnE = false ;
      n44AlbRecCod = false ;
      n9745Emp_PzE = false ;
      if ( isDlt( )  )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int11[0] = A44AlbRecCod ;
         GXv_char4[0] = A9743Emp_CUb ;
         GXv_int8[0] = A5860Emp_Anp ;
         GXv_int9[0] = A9745Emp_PzE ;
         GXv_decimal12[0] = A9746Emp_UnE ;
         GXv_int5[0] = 0 ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         new app.pubiins(remoteHandle, context).execute( GXv_char7, GXv_int11, GXv_char4, GXv_int8, GXv_int9, GXv_decimal12, GXv_int5, GXv_decimal10) ;
         tubiin_impl.this.A396EmprCod = GXv_char7[0] ;
         A396EmprCod = this.A396EmprCod ;
         tubiin_impl.this.A44AlbRecCod = GXv_int11[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         tubiin_impl.this.A9743Emp_CUb = GXv_char4[0] ;
         A9743Emp_CUb = this.A9743Emp_CUb ;
         tubiin_impl.this.A5860Emp_Anp = GXv_int8[0] ;
         A5860Emp_Anp = this.A5860Emp_Anp ;
         tubiin_impl.this.A9745Emp_PzE = GXv_int9[0] ;
         A9745Emp_PzE = this.A9745Emp_PzE ;
         tubiin_impl.this.A9746Emp_UnE = GXv_decimal12[0] ;
         A9746Emp_UnE = this.A9746Emp_UnE ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9743Emp_CUb", GXutil.rtrim( A9743Emp_CUb));
      httpContext.ajax_rsp_assign_attri("", false, "A5860Emp_Anp", GXutil.ltrim( localUtil.ntoc( A5860Emp_Anp, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9745Emp_PzE", GXutil.ltrim( localUtil.ntoc( A9745Emp_PzE, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9746Emp_UnE", GXutil.ltrim( localUtil.ntoc( A9746Emp_UnE, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV34Msg_err',fld:'vMSG_ERR',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("EXIT","{handler:'e111512',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV34Msg_err',fld:'vMSG_ERR',pic:'',hsh:true}]");
      setEventMetadata("EXIT",",oparms:[{av:'AV34Msg_err',fld:'vMSG_ERR',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'VER SITUACION UBICACION'","{handler:'e131512',iparms:[{av:'A9743Emp_CUb',fld:'EMP_CUB',pic:'!!!/!!!!!!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5860Emp_Anp',fld:'EMP_ANP',pic:'ZZ9'}]");
      setEventMetadata("'VER SITUACION UBICACION'",",oparms:[{av:'A5860Emp_Anp',fld:'EMP_ANP',pic:'ZZ9'},{av:'A9743Emp_CUb',fld:'EMP_CUB',pic:'!!!/!!!!!!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'AV34Msg_err',fld:'vMSG_ERR',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'A9751Emp_PzU',fld:'EMP_PZU',pic:'ZZZZZ9'},{av:'A9750Emp_UnU',fld:'EMP_UNU',pic:'ZZZZZ9.99'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A9747Emp_SPzE',fld:'EMP_SPZE',pic:'ZZZZZ9'},{av:'A9748Emp_SUnE',fld:'EMP_SUNE',pic:'ZZZZZ9.99'},{av:'A9752Emp_SPzU',fld:'EMP_SPZU',pic:'ZZZZZ9'},{av:'A9753Emp_SUnU',fld:'EMP_SUNU',pic:'ZZZZZ9.99'},{av:'A9749Emp_Item1',fld:'EMP_ITEM1',pic:''},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z44AlbRecCod'},{av:'Z407EmprNom'},{av:'Z56AlbRUni'},{av:'Z58AlbRUniEnt'},{av:'Z52AlbRPieEnt'},{av:'Z60AlbRUniUti'},{av:'Z54AlbRPieUti'},{av:'Z9747Emp_SPzE'},{av:'Z9748Emp_SUnE'},{av:'Z9752Emp_SPzU'},{av:'Z9753Emp_SUnU'},{av:'Z9749Emp_Item1'},{av:'Z57AlbRUniDis'},{av:'Z51AlbRPieDis'},{av:'O9752Emp_SPzU'},{av:'O9753Emp_SUnU'},{av:'O9748Emp_SUnE'},{av:'O9747Emp_SPzE'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_EMP_SPZE","{handler:'valid_Emp_spze',iparms:[]");
      setEventMetadata("VALID_EMP_SPZE",",oparms:[]}");
      setEventMetadata("VALID_EMP_SPZU","{handler:'valid_Emp_spzu',iparms:[]");
      setEventMetadata("VALID_EMP_SPZU",",oparms:[]}");
      setEventMetadata("VALID_EMP_CUB","{handler:'valid_Emp_cub',iparms:[{av:'A5860Emp_Anp',fld:'EMP_ANP',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9743Emp_CUb',fld:'EMP_CUB',pic:'!!!/!!!!!!'},{av:'A9744Emp_DUb',fld:'EMP_DUB',pic:''},{av:'AV32Msg_ib',fld:'vMSG_IB',pic:''}]");
      setEventMetadata("VALID_EMP_CUB",",oparms:[{av:'A9744Emp_DUb',fld:'EMP_DUB',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9743Emp_CUb',fld:'EMP_CUB',pic:'!!!/!!!!!!'},{av:'A5860Emp_Anp',fld:'EMP_ANP',pic:'ZZ9'},{av:'AV32Msg_ib',fld:'vMSG_IB',pic:''}]}");
      setEventMetadata("VALID_EMP_ANP","{handler:'valid_Emp_anp',iparms:[]");
      setEventMetadata("VALID_EMP_ANP",",oparms:[]}");
      setEventMetadata("VALID_EMP_PZE","{handler:'valid_Emp_pze',iparms:[]");
      setEventMetadata("VALID_EMP_PZE",",oparms:[]}");
      setEventMetadata("VALID_EMP_UNE","{handler:'valid_Emp_une',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O9746Emp_UnE'},{av:'O9748Emp_SUnE'},{av:'A9746Emp_UnE',fld:'EMP_UNE',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A9743Emp_CUb',fld:'EMP_CUB',pic:'!!!/!!!!!!'},{av:'A5860Emp_Anp',fld:'EMP_ANP',pic:'ZZ9'},{av:'A9745Emp_PzE',fld:'EMP_PZE',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_EMP_UNE",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A9743Emp_CUb',fld:'EMP_CUB',pic:'!!!/!!!!!!'},{av:'A5860Emp_Anp',fld:'EMP_ANP',pic:'ZZ9'},{av:'A9745Emp_PzE',fld:'EMP_PZE',pic:'ZZZZZ9'},{av:'A9746Emp_UnE',fld:'EMP_UNE',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_EMP_UNU","{handler:'valid_Emp_unu',iparms:[]");
      setEventMetadata("VALID_EMP_UNU",",oparms:[]}");
      setEventMetadata("VALID_EMP_PZU","{handler:'valid_Emp_pzu',iparms:[]");
      setEventMetadata("VALID_EMP_PZU",",oparms:[]}");
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
      pr_default.close(35);
      pr_default.close(37);
      pr_default.close(38);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z56AlbRUni = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z9749Emp_Item1 = "" ;
      O9753Emp_SUnU = DecimalUtil.ZERO ;
      O9748Emp_SUnE = DecimalUtil.ZERO ;
      Z9743Emp_CUb = "" ;
      Z9746Emp_UnE = DecimalUtil.ZERO ;
      Z9750Emp_UnU = DecimalUtil.ZERO ;
      O9750Emp_UnU = DecimalUtil.ZERO ;
      O9746Emp_UnE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9743Emp_CUb = "" ;
      AV32Msg_ib = "" ;
      Gx_mode = "" ;
      A9746Emp_UnE = DecimalUtil.ZERO ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
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
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A9748Emp_SUnE = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A9753Emp_SUnU = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A9749Emp_Item1 = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9753Emp_SUnU = DecimalUtil.ZERO ;
      B9748Emp_SUnE = DecimalUtil.ZERO ;
      sMode1341 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV35Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode7 = "" ;
      s9753Emp_SUnU = DecimalUtil.ZERO ;
      s9748Emp_SUnE = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9744Emp_DUb = "" ;
      A9750Emp_UnU = DecimalUtil.ZERO ;
      T9750Emp_UnU = DecimalUtil.ZERO ;
      T9746Emp_UnE = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV34Msg_err = "" ;
      Z407EmprNom = "" ;
      Z9748Emp_SUnE = DecimalUtil.ZERO ;
      Z9753Emp_SUnU = DecimalUtil.ZERO ;
      T01517_A407EmprNom = new String[] {""} ;
      T01517_n407EmprNom = new boolean[] {false} ;
      T01519_A9747Emp_SPzE = new int[1] ;
      T01519_A9748Emp_SUnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01519_A9752Emp_SPzU = new int[1] ;
      T01519_A9753Emp_SUnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015111_A44AlbRecCod = new int[1] ;
      T015111_n44AlbRecCod = new boolean[] {false} ;
      T015111_A407EmprNom = new String[] {""} ;
      T015111_n407EmprNom = new boolean[] {false} ;
      T015111_A56AlbRUni = new String[] {""} ;
      T015111_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015111_A52AlbRPieEnt = new int[1] ;
      T015111_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015111_A54AlbRPieUti = new int[1] ;
      T015111_A9749Emp_Item1 = new String[] {""} ;
      T015111_A396EmprCod = new String[] {""} ;
      T015111_A9747Emp_SPzE = new int[1] ;
      T015111_A9748Emp_SUnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015111_A9752Emp_SPzU = new int[1] ;
      T015111_A9753Emp_SUnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015112_A396EmprCod = new String[] {""} ;
      T015112_A44AlbRecCod = new int[1] ;
      T015112_n44AlbRecCod = new boolean[] {false} ;
      T01516_A44AlbRecCod = new int[1] ;
      T01516_n44AlbRecCod = new boolean[] {false} ;
      T01516_A56AlbRUni = new String[] {""} ;
      T01516_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01516_A52AlbRPieEnt = new int[1] ;
      T01516_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01516_A54AlbRPieUti = new int[1] ;
      T01516_A9749Emp_Item1 = new String[] {""} ;
      T01516_A396EmprCod = new String[] {""} ;
      T015113_A396EmprCod = new String[] {""} ;
      T015113_A44AlbRecCod = new int[1] ;
      T015113_n44AlbRecCod = new boolean[] {false} ;
      T015114_A396EmprCod = new String[] {""} ;
      T015114_A44AlbRecCod = new int[1] ;
      T015114_n44AlbRecCod = new boolean[] {false} ;
      T01515_A44AlbRecCod = new int[1] ;
      T01515_n44AlbRecCod = new boolean[] {false} ;
      T01515_A56AlbRUni = new String[] {""} ;
      T01515_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01515_A52AlbRPieEnt = new int[1] ;
      T01515_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01515_A54AlbRPieUti = new int[1] ;
      T01515_A9749Emp_Item1 = new String[] {""} ;
      T01515_A396EmprCod = new String[] {""} ;
      T015118_A396EmprCod = new String[] {""} ;
      T015118_A13026PedDGId = new int[1] ;
      T015118_A44AlbRecCod = new int[1] ;
      T015118_n44AlbRecCod = new boolean[] {false} ;
      T015119_A396EmprCod = new String[] {""} ;
      T015119_A11669DevCruId = new int[1] ;
      T015119_A44AlbRecCod = new int[1] ;
      T015119_n44AlbRecCod = new boolean[] {false} ;
      T015120_A396EmprCod = new String[] {""} ;
      T015120_A44AlbRecCod = new int[1] ;
      T015120_n44AlbRecCod = new boolean[] {false} ;
      T015120_A7130MatC_Pz = new String[] {""} ;
      T015121_A396EmprCod = new String[] {""} ;
      T015121_A44AlbRecCod = new int[1] ;
      T015121_n44AlbRecCod = new boolean[] {false} ;
      T015121_A7132MatC_Talla = new String[] {""} ;
      T015122_A396EmprCod = new String[] {""} ;
      T015122_A44AlbRecCod = new int[1] ;
      T015122_n44AlbRecCod = new boolean[] {false} ;
      T015122_A7115MatC_Lin = new short[1] ;
      T015123_A396EmprCod = new String[] {""} ;
      T015123_A30AlbProCod = new long[1] ;
      T015123_A129BarCod = new int[1] ;
      T015123_A132BarCodReo = new byte[1] ;
      T015123_A130BarCodPar = new String[] {""} ;
      T015123_A6622AlbHdRLn = new short[1] ;
      T015124_A396EmprCod = new String[] {""} ;
      T015124_A6235DevEmpCod = new int[1] ;
      T015124_A6243DevNumLin = new byte[1] ;
      T015125_A396EmprCod = new String[] {""} ;
      T015125_A44AlbRecCod = new int[1] ;
      T015125_n44AlbRecCod = new boolean[] {false} ;
      T015125_A4596AlbRDefCod = new short[1] ;
      T015126_A396EmprCod = new String[] {""} ;
      T015126_A44AlbRecCod = new int[1] ;
      T015126_n44AlbRecCod = new boolean[] {false} ;
      T015126_A2159AlbRecPie = new String[] {""} ;
      T015127_A396EmprCod = new String[] {""} ;
      T015127_A44AlbRecCod = new int[1] ;
      T015127_n44AlbRecCod = new boolean[] {false} ;
      T015127_A2165HisEmpLin = new short[1] ;
      T015128_A396EmprCod = new String[] {""} ;
      T015128_A44AlbRecCod = new int[1] ;
      T015128_n44AlbRecCod = new boolean[] {false} ;
      T015128_A1299AlbRLin = new byte[1] ;
      T015129_A396EmprCod = new String[] {""} ;
      T015129_A361DisCod = new int[1] ;
      T015129_A44AlbRecCod = new int[1] ;
      T015129_n44AlbRecCod = new boolean[] {false} ;
      T015130_A396EmprCod = new String[] {""} ;
      T015130_A323DevGenCod = new int[1] ;
      T015131_A396EmprCod = new String[] {""} ;
      T015131_A129BarCod = new int[1] ;
      T015131_A132BarCodReo = new byte[1] ;
      T015131_A130BarCodPar = new String[] {""} ;
      T015131_A200BarPieCod = new String[] {""} ;
      T015132_A396EmprCod = new String[] {""} ;
      T015132_A44AlbRecCod = new int[1] ;
      T015132_n44AlbRecCod = new boolean[] {false} ;
      Z9744Emp_DUb = "" ;
      T015133_A44AlbRecCod = new int[1] ;
      T015133_n44AlbRecCod = new boolean[] {false} ;
      T015133_A5860Emp_Anp = new short[1] ;
      T015133_A9744Emp_DUb = new String[] {""} ;
      T015133_n9744Emp_DUb = new boolean[] {false} ;
      T015133_A9745Emp_PzE = new int[1] ;
      T015133_n9745Emp_PzE = new boolean[] {false} ;
      T015133_A9746Emp_UnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015133_n9746Emp_UnE = new boolean[] {false} ;
      T015133_A9750Emp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015133_n9750Emp_UnU = new boolean[] {false} ;
      T015133_A9751Emp_PzU = new int[1] ;
      T015133_n9751Emp_PzU = new boolean[] {false} ;
      T015133_A396EmprCod = new String[] {""} ;
      T015133_A9743Emp_CUb = new String[] {""} ;
      T01514_A9744Emp_DUb = new String[] {""} ;
      T01514_n9744Emp_DUb = new boolean[] {false} ;
      T015134_A9744Emp_DUb = new String[] {""} ;
      T015134_n9744Emp_DUb = new boolean[] {false} ;
      T015135_A396EmprCod = new String[] {""} ;
      T015135_A44AlbRecCod = new int[1] ;
      T015135_n44AlbRecCod = new boolean[] {false} ;
      T015135_A9743Emp_CUb = new String[] {""} ;
      T015135_A5860Emp_Anp = new short[1] ;
      T01513_A44AlbRecCod = new int[1] ;
      T01513_n44AlbRecCod = new boolean[] {false} ;
      T01513_A5860Emp_Anp = new short[1] ;
      T01513_A9745Emp_PzE = new int[1] ;
      T01513_n9745Emp_PzE = new boolean[] {false} ;
      T01513_A9746Emp_UnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01513_n9746Emp_UnE = new boolean[] {false} ;
      T01513_A9750Emp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01513_n9750Emp_UnU = new boolean[] {false} ;
      T01513_A9751Emp_PzU = new int[1] ;
      T01513_n9751Emp_PzU = new boolean[] {false} ;
      T01513_A396EmprCod = new String[] {""} ;
      T01513_A9743Emp_CUb = new String[] {""} ;
      T01512_A44AlbRecCod = new int[1] ;
      T01512_n44AlbRecCod = new boolean[] {false} ;
      T01512_A5860Emp_Anp = new short[1] ;
      T01512_A9745Emp_PzE = new int[1] ;
      T01512_n9745Emp_PzE = new boolean[] {false} ;
      T01512_A9746Emp_UnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01512_n9746Emp_UnE = new boolean[] {false} ;
      T01512_A9750Emp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01512_n9750Emp_UnU = new boolean[] {false} ;
      T01512_A9751Emp_PzU = new int[1] ;
      T01512_n9751Emp_PzU = new boolean[] {false} ;
      T01512_A396EmprCod = new String[] {""} ;
      T01512_A9743Emp_CUb = new String[] {""} ;
      T015139_A9744Emp_DUb = new String[] {""} ;
      T015139_n9744Emp_DUb = new boolean[] {false} ;
      T015140_A396EmprCod = new String[] {""} ;
      T015140_A44AlbRecCod = new int[1] ;
      T015140_n44AlbRecCod = new boolean[] {false} ;
      T015140_A9743Emp_CUb = new String[] {""} ;
      T015140_A5860Emp_Anp = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i9753Emp_SUnU = DecimalUtil.ZERO ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T015141_A407EmprNom = new String[] {""} ;
      T015141_n407EmprNom = new boolean[] {false} ;
      T015143_A9747Emp_SPzE = new int[1] ;
      T015143_A9748Emp_SUnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015143_A9752Emp_SPzU = new int[1] ;
      T015143_A9753Emp_SUnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ56AlbRUni = "" ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ9748Emp_SUnE = DecimalUtil.ZERO ;
      ZZ9753Emp_SUnU = DecimalUtil.ZERO ;
      ZZ9749Emp_Item1 = "" ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      ZO9753Emp_SUnU = DecimalUtil.ZERO ;
      ZO9748Emp_SUnE = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      ZV32Msg_ib = "" ;
      GXv_char7 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tubiin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tubiin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tubiin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tubiin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tubiin__default(),
         new Object[] {
             new Object[] {
            T01512_A44AlbRecCod, T01512_A5860Emp_Anp, T01512_A9745Emp_PzE, T01512_n9745Emp_PzE, T01512_A9746Emp_UnE, T01512_n9746Emp_UnE, T01512_A9750Emp_UnU, T01512_n9750Emp_UnU, T01512_A9751Emp_PzU, T01512_n9751Emp_PzU,
            T01512_A396EmprCod, T01512_A9743Emp_CUb
            }
            , new Object[] {
            T01513_A44AlbRecCod, T01513_A5860Emp_Anp, T01513_A9745Emp_PzE, T01513_n9745Emp_PzE, T01513_A9746Emp_UnE, T01513_n9746Emp_UnE, T01513_A9750Emp_UnU, T01513_n9750Emp_UnU, T01513_A9751Emp_PzU, T01513_n9751Emp_PzU,
            T01513_A396EmprCod, T01513_A9743Emp_CUb
            }
            , new Object[] {
            T01514_A9744Emp_DUb, T01514_n9744Emp_DUb
            }
            , new Object[] {
            T01515_A44AlbRecCod, T01515_A56AlbRUni, T01515_A58AlbRUniEnt, T01515_A52AlbRPieEnt, T01515_A60AlbRUniUti, T01515_A54AlbRPieUti, T01515_A9749Emp_Item1, T01515_A396EmprCod
            }
            , new Object[] {
            T01516_A44AlbRecCod, T01516_A56AlbRUni, T01516_A58AlbRUniEnt, T01516_A52AlbRPieEnt, T01516_A60AlbRUniUti, T01516_A54AlbRPieUti, T01516_A9749Emp_Item1, T01516_A396EmprCod
            }
            , new Object[] {
            T01517_A407EmprNom, T01517_n407EmprNom
            }
            , new Object[] {
            T01519_A9747Emp_SPzE, T01519_A9748Emp_SUnE, T01519_A9752Emp_SPzU, T01519_A9753Emp_SUnU
            }
            , new Object[] {
            T015111_A44AlbRecCod, T015111_A407EmprNom, T015111_n407EmprNom, T015111_A56AlbRUni, T015111_A58AlbRUniEnt, T015111_A52AlbRPieEnt, T015111_A60AlbRUniUti, T015111_A54AlbRPieUti, T015111_A9749Emp_Item1, T015111_A396EmprCod,
            T015111_A9747Emp_SPzE, T015111_A9748Emp_SUnE, T015111_A9752Emp_SPzU, T015111_A9753Emp_SUnU
            }
            , new Object[] {
            T015112_A396EmprCod, T015112_A44AlbRecCod
            }
            , new Object[] {
            T015113_A396EmprCod, T015113_A44AlbRecCod
            }
            , new Object[] {
            T015114_A396EmprCod, T015114_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015118_A396EmprCod, T015118_A13026PedDGId, T015118_A44AlbRecCod
            }
            , new Object[] {
            T015119_A396EmprCod, T015119_A11669DevCruId, T015119_A44AlbRecCod
            }
            , new Object[] {
            T015120_A396EmprCod, T015120_A44AlbRecCod, T015120_A7130MatC_Pz
            }
            , new Object[] {
            T015121_A396EmprCod, T015121_A44AlbRecCod, T015121_A7132MatC_Talla
            }
            , new Object[] {
            T015122_A396EmprCod, T015122_A44AlbRecCod, T015122_A7115MatC_Lin
            }
            , new Object[] {
            T015123_A396EmprCod, T015123_A30AlbProCod, T015123_A129BarCod, T015123_A132BarCodReo, T015123_A130BarCodPar, T015123_A6622AlbHdRLn
            }
            , new Object[] {
            T015124_A396EmprCod, T015124_A6235DevEmpCod, T015124_A6243DevNumLin
            }
            , new Object[] {
            T015125_A396EmprCod, T015125_A44AlbRecCod, T015125_A4596AlbRDefCod
            }
            , new Object[] {
            T015126_A396EmprCod, T015126_A44AlbRecCod, T015126_A2159AlbRecPie
            }
            , new Object[] {
            T015127_A396EmprCod, T015127_A44AlbRecCod, T015127_A2165HisEmpLin
            }
            , new Object[] {
            T015128_A396EmprCod, T015128_A44AlbRecCod, T015128_A1299AlbRLin
            }
            , new Object[] {
            T015129_A396EmprCod, T015129_A361DisCod, T015129_A44AlbRecCod
            }
            , new Object[] {
            T015130_A396EmprCod, T015130_A323DevGenCod
            }
            , new Object[] {
            T015131_A396EmprCod, T015131_A129BarCod, T015131_A132BarCodReo, T015131_A130BarCodPar, T015131_A200BarPieCod
            }
            , new Object[] {
            T015132_A396EmprCod, T015132_A44AlbRecCod
            }
            , new Object[] {
            T015133_A44AlbRecCod, T015133_A5860Emp_Anp, T015133_A9744Emp_DUb, T015133_n9744Emp_DUb, T015133_A9745Emp_PzE, T015133_n9745Emp_PzE, T015133_A9746Emp_UnE, T015133_n9746Emp_UnE, T015133_A9750Emp_UnU, T015133_n9750Emp_UnU,
            T015133_A9751Emp_PzU, T015133_n9751Emp_PzU, T015133_A396EmprCod, T015133_A9743Emp_CUb
            }
            , new Object[] {
            T015134_A9744Emp_DUb, T015134_n9744Emp_DUb
            }
            , new Object[] {
            T015135_A396EmprCod, T015135_A44AlbRecCod, T015135_A9743Emp_CUb, T015135_A5860Emp_Anp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015139_A9744Emp_DUb, T015139_n9744Emp_DUb
            }
            , new Object[] {
            T015140_A396EmprCod, T015140_A44AlbRecCod, T015140_A9743Emp_CUb, T015140_A5860Emp_Anp
            }
            , new Object[] {
            T015141_A407EmprNom, T015141_n407EmprNom
            }
            , new Object[] {
            T015143_A9747Emp_SPzE, T015143_A9748Emp_SUnE, T015143_A9752Emp_SPzU, T015143_A9753Emp_SUnU
            }
         }
      );
      Z44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TUBIIN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z5860Emp_Anp ;
   private short nRcdDeleted_1341 ;
   private short nRcdExists_1341 ;
   private short nIsMod_1341 ;
   private short A5860Emp_Anp ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1341 ;
   private short RcdFound1341 ;
   private short nBlankRcdUsr1341 ;
   private short RcdFound7 ;
   private short nIsDirty_7 ;
   private short nIsDirty_1341 ;
   private short GXv_int8[] ;
   private int wcpOA44AlbRecCod ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int O9752Emp_SPzU ;
   private int O9747Emp_SPzE ;
   private int nRC_GXsfl_95 ;
   private int nGXsfl_95_idx=1 ;
   private int Z9745Emp_PzE ;
   private int Z9751Emp_PzU ;
   private int O9751Emp_PzU ;
   private int O9745Emp_PzE ;
   private int A44AlbRecCod ;
   private int A9745Emp_PzE ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A9747Emp_SPzE ;
   private int edtEmp_SPzE_Enabled ;
   private int edtEmp_SUnE_Enabled ;
   private int A9752Emp_SPzU ;
   private int edtEmp_SPzU_Enabled ;
   private int edtEmp_SUnU_Enabled ;
   private int edtEmp_Item1_Enabled ;
   private int B9752Emp_SPzU ;
   private int B9747Emp_SPzE ;
   private int edtavnRcdDeleted_1341_Enabled ;
   private int edtEmp_CUb_Enabled ;
   private int edtEmp_Anp_Enabled ;
   private int edtEmp_DUb_Enabled ;
   private int edtEmp_PzE_Enabled ;
   private int edtEmp_UnE_Enabled ;
   private int edtEmp_UnU_Enabled ;
   private int edtEmp_PzU_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s9752Emp_SPzU ;
   private int s9747Emp_SPzE ;
   private int A9751Emp_PzU ;
   private int T9751Emp_PzU ;
   private int T9745Emp_PzE ;
   private int GX_JID ;
   private int Z9747Emp_SPzE ;
   private int Z9752Emp_SPzU ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtEmp_PzU_Enabled ;
   private int defedtEmp_UnU_Enabled ;
   private int defedtEmp_Anp_Enabled ;
   private int defedtEmp_CUb_Enabled ;
   private int i9752Emp_SPzU ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmp_Item1_Backcolor ;
   private int edtEmp_SUnU_Backcolor ;
   private int edtEmp_SPzU_Backcolor ;
   private int edtEmp_SUnE_Backcolor ;
   private int edtEmp_SPzE_Backcolor ;
   private int edtAlbRUniDis_Backcolor ;
   private int edtAlbRPieDis_Backcolor ;
   private int edtAlbRPieUti_Backcolor ;
   private int edtAlbRUniUti_Backcolor ;
   private int edtAlbRPieEnt_Backcolor ;
   private int edtAlbRUniEnt_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z51AlbRPieDis ;
   private int ZZ44AlbRecCod ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ54AlbRPieUti ;
   private int ZZ9747Emp_SPzE ;
   private int ZZ9752Emp_SPzU ;
   private int ZZ51AlbRPieDis ;
   private int ZO9752Emp_SPzU ;
   private int ZO9747Emp_SPzE ;
   private int GXv_int11[] ;
   private int GXv_int9[] ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal O9753Emp_SUnU ;
   private java.math.BigDecimal O9748Emp_SUnE ;
   private java.math.BigDecimal Z9746Emp_UnE ;
   private java.math.BigDecimal Z9750Emp_UnU ;
   private java.math.BigDecimal O9750Emp_UnU ;
   private java.math.BigDecimal O9746Emp_UnE ;
   private java.math.BigDecimal A9746Emp_UnE ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A9748Emp_SUnE ;
   private java.math.BigDecimal A9753Emp_SUnU ;
   private java.math.BigDecimal B9753Emp_SUnU ;
   private java.math.BigDecimal B9748Emp_SUnE ;
   private java.math.BigDecimal s9753Emp_SUnU ;
   private java.math.BigDecimal s9748Emp_SUnE ;
   private java.math.BigDecimal A9750Emp_UnU ;
   private java.math.BigDecimal T9750Emp_UnU ;
   private java.math.BigDecimal T9746Emp_UnE ;
   private java.math.BigDecimal Z9748Emp_SUnE ;
   private java.math.BigDecimal Z9753Emp_SUnU ;
   private java.math.BigDecimal i9753Emp_SUnU ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ9748Emp_SUnE ;
   private java.math.BigDecimal ZZ9753Emp_SUnU ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private java.math.BigDecimal ZO9753Emp_SUnU ;
   private java.math.BigDecimal ZO9748Emp_SUnE ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z56AlbRUni ;
   private String Z9749Emp_Item1 ;
   private String Z9743Emp_CUb ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9743Emp_CUb ;
   private String AV32Msg_ib ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String sGXsfl_95_idx="0001" ;
   private String A56AlbRUni ;
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
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtEmp_SPzE_Internalname ;
   private String edtEmp_SPzE_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEmp_SUnE_Internalname ;
   private String edtEmp_SUnE_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEmp_SPzU_Internalname ;
   private String edtEmp_SPzU_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEmp_SUnU_Internalname ;
   private String edtEmp_SUnU_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtEmp_Item1_Internalname ;
   private String A9749Emp_Item1 ;
   private String edtEmp_Item1_Jsonclick ;
   private String sMode1341 ;
   private String edtavnRcdDeleted_1341_Internalname ;
   private String edtEmp_CUb_Internalname ;
   private String edtEmp_Anp_Internalname ;
   private String edtEmp_DUb_Internalname ;
   private String edtEmp_PzE_Internalname ;
   private String edtEmp_UnE_Internalname ;
   private String edtEmp_UnU_Internalname ;
   private String edtEmp_PzU_Internalname ;
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
   private String AV35Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode7 ;
   private String GXCCtl ;
   private String A9744Emp_DUb ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char2[] ;
   private String AV34Msg_err ;
   private String Z407EmprNom ;
   private String Z9744Emp_DUb ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1341_Jsonclick ;
   private String edtEmp_CUb_Jsonclick ;
   private String edtEmp_Anp_Jsonclick ;
   private String edtEmp_DUb_Jsonclick ;
   private String edtEmp_PzE_Jsonclick ;
   private String edtEmp_UnE_Jsonclick ;
   private String edtEmp_UnU_Jsonclick ;
   private String edtEmp_PzU_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ56AlbRUni ;
   private String ZZ9749Emp_Item1 ;
   private String GXv_char3[] ;
   private String ZV32Msg_ib ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n9745Emp_PzE ;
   private boolean n9746Emp_UnE ;
   private boolean wbErr ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n9744Emp_DUb ;
   private boolean n9750Emp_UnU ;
   private boolean n9751Emp_PzU ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] T01517_A407EmprNom ;
   private boolean[] T01517_n407EmprNom ;
   private int[] T01519_A9747Emp_SPzE ;
   private java.math.BigDecimal[] T01519_A9748Emp_SUnE ;
   private int[] T01519_A9752Emp_SPzU ;
   private java.math.BigDecimal[] T01519_A9753Emp_SUnU ;
   private int[] T015111_A44AlbRecCod ;
   private boolean[] T015111_n44AlbRecCod ;
   private String[] T015111_A407EmprNom ;
   private boolean[] T015111_n407EmprNom ;
   private String[] T015111_A56AlbRUni ;
   private java.math.BigDecimal[] T015111_A58AlbRUniEnt ;
   private int[] T015111_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T015111_A60AlbRUniUti ;
   private int[] T015111_A54AlbRPieUti ;
   private String[] T015111_A9749Emp_Item1 ;
   private String[] T015111_A396EmprCod ;
   private int[] T015111_A9747Emp_SPzE ;
   private java.math.BigDecimal[] T015111_A9748Emp_SUnE ;
   private int[] T015111_A9752Emp_SPzU ;
   private java.math.BigDecimal[] T015111_A9753Emp_SUnU ;
   private String[] T015112_A396EmprCod ;
   private int[] T015112_A44AlbRecCod ;
   private boolean[] T015112_n44AlbRecCod ;
   private int[] T01516_A44AlbRecCod ;
   private boolean[] T01516_n44AlbRecCod ;
   private String[] T01516_A56AlbRUni ;
   private java.math.BigDecimal[] T01516_A58AlbRUniEnt ;
   private int[] T01516_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01516_A60AlbRUniUti ;
   private int[] T01516_A54AlbRPieUti ;
   private String[] T01516_A9749Emp_Item1 ;
   private String[] T01516_A396EmprCod ;
   private String[] T015113_A396EmprCod ;
   private int[] T015113_A44AlbRecCod ;
   private boolean[] T015113_n44AlbRecCod ;
   private String[] T015114_A396EmprCod ;
   private int[] T015114_A44AlbRecCod ;
   private boolean[] T015114_n44AlbRecCod ;
   private int[] T01515_A44AlbRecCod ;
   private boolean[] T01515_n44AlbRecCod ;
   private String[] T01515_A56AlbRUni ;
   private java.math.BigDecimal[] T01515_A58AlbRUniEnt ;
   private int[] T01515_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01515_A60AlbRUniUti ;
   private int[] T01515_A54AlbRPieUti ;
   private String[] T01515_A9749Emp_Item1 ;
   private String[] T01515_A396EmprCod ;
   private String[] T015118_A396EmprCod ;
   private int[] T015118_A13026PedDGId ;
   private int[] T015118_A44AlbRecCod ;
   private boolean[] T015118_n44AlbRecCod ;
   private String[] T015119_A396EmprCod ;
   private int[] T015119_A11669DevCruId ;
   private int[] T015119_A44AlbRecCod ;
   private boolean[] T015119_n44AlbRecCod ;
   private String[] T015120_A396EmprCod ;
   private int[] T015120_A44AlbRecCod ;
   private boolean[] T015120_n44AlbRecCod ;
   private String[] T015120_A7130MatC_Pz ;
   private String[] T015121_A396EmprCod ;
   private int[] T015121_A44AlbRecCod ;
   private boolean[] T015121_n44AlbRecCod ;
   private String[] T015121_A7132MatC_Talla ;
   private String[] T015122_A396EmprCod ;
   private int[] T015122_A44AlbRecCod ;
   private boolean[] T015122_n44AlbRecCod ;
   private short[] T015122_A7115MatC_Lin ;
   private String[] T015123_A396EmprCod ;
   private long[] T015123_A30AlbProCod ;
   private int[] T015123_A129BarCod ;
   private byte[] T015123_A132BarCodReo ;
   private String[] T015123_A130BarCodPar ;
   private short[] T015123_A6622AlbHdRLn ;
   private String[] T015124_A396EmprCod ;
   private int[] T015124_A6235DevEmpCod ;
   private byte[] T015124_A6243DevNumLin ;
   private String[] T015125_A396EmprCod ;
   private int[] T015125_A44AlbRecCod ;
   private boolean[] T015125_n44AlbRecCod ;
   private short[] T015125_A4596AlbRDefCod ;
   private String[] T015126_A396EmprCod ;
   private int[] T015126_A44AlbRecCod ;
   private boolean[] T015126_n44AlbRecCod ;
   private String[] T015126_A2159AlbRecPie ;
   private String[] T015127_A396EmprCod ;
   private int[] T015127_A44AlbRecCod ;
   private boolean[] T015127_n44AlbRecCod ;
   private short[] T015127_A2165HisEmpLin ;
   private String[] T015128_A396EmprCod ;
   private int[] T015128_A44AlbRecCod ;
   private boolean[] T015128_n44AlbRecCod ;
   private byte[] T015128_A1299AlbRLin ;
   private String[] T015129_A396EmprCod ;
   private int[] T015129_A361DisCod ;
   private int[] T015129_A44AlbRecCod ;
   private boolean[] T015129_n44AlbRecCod ;
   private String[] T015130_A396EmprCod ;
   private int[] T015130_A323DevGenCod ;
   private String[] T015131_A396EmprCod ;
   private int[] T015131_A129BarCod ;
   private byte[] T015131_A132BarCodReo ;
   private String[] T015131_A130BarCodPar ;
   private String[] T015131_A200BarPieCod ;
   private String[] T015132_A396EmprCod ;
   private int[] T015132_A44AlbRecCod ;
   private boolean[] T015132_n44AlbRecCod ;
   private int[] T015133_A44AlbRecCod ;
   private boolean[] T015133_n44AlbRecCod ;
   private short[] T015133_A5860Emp_Anp ;
   private String[] T015133_A9744Emp_DUb ;
   private boolean[] T015133_n9744Emp_DUb ;
   private int[] T015133_A9745Emp_PzE ;
   private boolean[] T015133_n9745Emp_PzE ;
   private java.math.BigDecimal[] T015133_A9746Emp_UnE ;
   private boolean[] T015133_n9746Emp_UnE ;
   private java.math.BigDecimal[] T015133_A9750Emp_UnU ;
   private boolean[] T015133_n9750Emp_UnU ;
   private int[] T015133_A9751Emp_PzU ;
   private boolean[] T015133_n9751Emp_PzU ;
   private String[] T015133_A396EmprCod ;
   private String[] T015133_A9743Emp_CUb ;
   private String[] T01514_A9744Emp_DUb ;
   private boolean[] T01514_n9744Emp_DUb ;
   private String[] T015134_A9744Emp_DUb ;
   private boolean[] T015134_n9744Emp_DUb ;
   private String[] T015135_A396EmprCod ;
   private int[] T015135_A44AlbRecCod ;
   private boolean[] T015135_n44AlbRecCod ;
   private String[] T015135_A9743Emp_CUb ;
   private short[] T015135_A5860Emp_Anp ;
   private int[] T01513_A44AlbRecCod ;
   private boolean[] T01513_n44AlbRecCod ;
   private short[] T01513_A5860Emp_Anp ;
   private int[] T01513_A9745Emp_PzE ;
   private boolean[] T01513_n9745Emp_PzE ;
   private java.math.BigDecimal[] T01513_A9746Emp_UnE ;
   private boolean[] T01513_n9746Emp_UnE ;
   private java.math.BigDecimal[] T01513_A9750Emp_UnU ;
   private boolean[] T01513_n9750Emp_UnU ;
   private int[] T01513_A9751Emp_PzU ;
   private boolean[] T01513_n9751Emp_PzU ;
   private String[] T01513_A396EmprCod ;
   private String[] T01513_A9743Emp_CUb ;
   private int[] T01512_A44AlbRecCod ;
   private boolean[] T01512_n44AlbRecCod ;
   private short[] T01512_A5860Emp_Anp ;
   private int[] T01512_A9745Emp_PzE ;
   private boolean[] T01512_n9745Emp_PzE ;
   private java.math.BigDecimal[] T01512_A9746Emp_UnE ;
   private boolean[] T01512_n9746Emp_UnE ;
   private java.math.BigDecimal[] T01512_A9750Emp_UnU ;
   private boolean[] T01512_n9750Emp_UnU ;
   private int[] T01512_A9751Emp_PzU ;
   private boolean[] T01512_n9751Emp_PzU ;
   private String[] T01512_A396EmprCod ;
   private String[] T01512_A9743Emp_CUb ;
   private String[] T015139_A9744Emp_DUb ;
   private boolean[] T015139_n9744Emp_DUb ;
   private String[] T015140_A396EmprCod ;
   private int[] T015140_A44AlbRecCod ;
   private boolean[] T015140_n44AlbRecCod ;
   private String[] T015140_A9743Emp_CUb ;
   private short[] T015140_A5860Emp_Anp ;
   private String[] T015141_A407EmprNom ;
   private boolean[] T015141_n407EmprNom ;
   private int[] T015143_A9747Emp_SPzE ;
   private java.math.BigDecimal[] T015143_A9748Emp_SUnE ;
   private int[] T015143_A9752Emp_SPzU ;
   private java.math.BigDecimal[] T015143_A9753Emp_SUnU ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tubiin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubiin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubiin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubiin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubiin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01512", "SELECT AlbRecCod, Emp_Anp, Emp_PzE, Emp_UnE, Emp_UnU, Emp_PzU, EmprCod, Emp_CUb FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ? AND Emp_CUb = ? AND Emp_Anp = ?  FOR UPDATE OF Emp_PzE, Emp_UnE, Emp_UnU, Emp_PzU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01513", "SELECT AlbRecCod, Emp_Anp, Emp_PzE, Emp_UnE, Emp_UnU, Emp_PzU, EmprCod, Emp_CUb FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ? AND Emp_CUb = ? AND Emp_Anp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01514", "SELECT Emp_DUb FROM TXPUBIALB WHERE EmprCod = ? AND Emp_CUb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01515", "SELECT AlbRecCod, AlbRUni, AlbRUniEnt, AlbRPieEnt, AlbRUniUti, AlbRPieUti, Emp_Item1, EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUni, AlbRUniEnt, AlbRPieEnt, AlbRUniUti, AlbRPieUti, Emp_Item1 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01516", "SELECT AlbRecCod, AlbRUni, AlbRUniEnt, AlbRPieEnt, AlbRUniUti, AlbRPieUti, Emp_Item1, EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01517", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01519", "SELECT COALESCE( T1.Emp_SPzE, 0) AS Emp_SPzE, COALESCE( T1.Emp_SUnE, 0) AS Emp_SUnE, COALESCE( T1.Emp_SPzU, 0) AS Emp_SPzU, COALESCE( T1.Emp_SUnU, 0) AS Emp_SUnU FROM (SELECT SUM(Emp_PzE) AS Emp_SPzE, EmprCod, AlbRecCod, SUM(Emp_UnE) AS Emp_SUnE, SUM(Emp_PzU) AS Emp_SPzU, SUM(Emp_UnU) AS Emp_SUnU FROM TXPUBIIN GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015111", "SELECT /*+ FIRST_ROWS(1) */ TM1.AlbRecCod, T2.EmprNom, TM1.AlbRUni, TM1.AlbRUniEnt, TM1.AlbRPieEnt, TM1.AlbRUniUti, TM1.AlbRPieUti, TM1.Emp_Item1, TM1.EmprCod, COALESCE( T3.Emp_SPzE, 0) AS Emp_SPzE, COALESCE( T3.Emp_SUnE, 0) AS Emp_SUnE, COALESCE( T3.Emp_SPzU, 0) AS Emp_SPzU, COALESCE( T3.Emp_SUnU, 0) AS Emp_SUnU FROM ((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(Emp_PzE) AS Emp_SPzE, EmprCod, AlbRecCod, SUM(Emp_UnE) AS Emp_SUnE, SUM(Emp_PzU) AS Emp_SPzU, SUM(Emp_UnU) AS Emp_SUnU FROM TXPUBIIN GROUP BY EmprCod, AlbRecCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015112", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015113", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015114", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015115", "INSERT INTO TXPALBREC(AlbRecCod, AlbRUni, AlbRUniEnt, AlbRPieEnt, AlbRUniUti, AlbRPieUti, Emp_Item1, EmprCod, CliCod, AlbRef, TrnCod, AlbREnt, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbREst, TipEntCod, AlbNumEti, AlbRDes, ProceCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbRefDsc, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRLote, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T015116", "UPDATE TXPALBREC SET AlbRUni=?, AlbRUniEnt=?, AlbRPieEnt=?, AlbRUniUti=?, AlbRPieUti=?, Emp_Item1=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T015117", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T015118", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015119", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015120", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015121", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015122", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015123", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015124", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015125", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015126", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015127", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015128", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015129", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015130", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015131", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015132", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015133", "SELECT T1.AlbRecCod, T1.Emp_Anp, T2.Emp_DUb, T1.Emp_PzE, T1.Emp_UnE, T1.Emp_UnU, T1.Emp_PzU, T1.EmprCod, T1.Emp_CUb FROM (TXPUBIIN T1 INNER JOIN TXPUBIALB T2 ON T2.EmprCod = T1.EmprCod AND T2.Emp_CUb = T1.Emp_CUb) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.Emp_CUb = ? and T1.Emp_Anp = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.Emp_CUb, T1.Emp_Anp ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015134", "SELECT Emp_DUb FROM TXPUBIALB WHERE EmprCod = ? AND Emp_CUb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015135", "SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ? AND Emp_CUb = ? AND Emp_Anp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015136", "INSERT INTO TXPUBIIN(AlbRecCod, Emp_Anp, Emp_PzE, Emp_UnE, Emp_UnU, Emp_PzU, EmprCod, Emp_CUb) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPUBIIN")
         ,new UpdateCursor("T015137", "UPDATE TXPUBIIN SET Emp_PzE=?, Emp_UnE=?, Emp_UnU=?, Emp_PzU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND Emp_CUb = ? AND Emp_Anp = ?", GX_NOMASK, "TXPUBIIN")
         ,new UpdateCursor("T015138", "DELETE FROM TXPUBIIN  WHERE EmprCod = ? AND AlbRecCod = ? AND Emp_CUb = ? AND Emp_Anp = ?", GX_NOMASK, "TXPUBIIN")
         ,new ForEachCursor("T015139", "SELECT Emp_DUb FROM TXPUBIALB WHERE EmprCod = ? AND Emp_CUb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015140", "SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, Emp_CUb, Emp_Anp ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015141", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015143", "SELECT COALESCE( T1.Emp_SPzE, 0) AS Emp_SPzE, COALESCE( T1.Emp_SUnE, 0) AS Emp_SUnE, COALESCE( T1.Emp_SPzU, 0) AS Emp_SPzU, COALESCE( T1.Emp_SUnU, 0) AS Emp_SUnU FROM (SELECT SUM(Emp_PzE) AS Emp_SPzE, EmprCod, AlbRecCod, SUM(Emp_UnE) AS Emp_SUnE, SUM(Emp_PzU) AS Emp_SPzU, SUM(Emp_UnU) AS Emp_SUnU FROM TXPUBIIN GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 10);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 10);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
            case 21 :
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
            case 22 :
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
            case 23 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 10);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
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
               stmt.setString(2, (String)parms[1], 10);
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
               stmt.setString(3, (String)parms[3], 10);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               stmt.setString(7, (String)parms[11], 3);
               stmt.setString(8, (String)parms[12], 10);
               return;
            case 33 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
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
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               stmt.setString(7, (String)parms[11], 10);
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 10);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 36 :
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
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 38 :
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
      }
   }

}

