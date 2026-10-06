package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thisreo_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
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
         gxload_6( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A602MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A571HisTipArt = (short)(GXutil.lval( httpContext.GetPar( "HisTipArt"))) ;
         n571HisTipArt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A571HisTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A571HisTipArt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A571HisTipArt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A572HisTipCol = (byte)(GXutil.lval( httpContext.GetPar( "HisTipCol"))) ;
         n572HisTipCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A572HisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A572HisTipCol), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A572HisTipCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5085CodCausa = (short)(GXutil.lval( httpContext.GetPar( "CodCausa"))) ;
         n5085CodCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A5085CodCausa) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5196TipCorCod = (short)(GXutil.lval( httpContext.GetPar( "TipCorCod"))) ;
         n5196TipCorCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5196TipCorCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5196TipCorCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A5196TipCorCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7000Rps_Cod = (short)(GXutil.lval( httpContext.GetPar( "Rps_Cod"))) ;
         n7000Rps_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A7000Rps_Cod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A833TipDefCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO REOPERADOS", ""), (short)(0)) ;
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

   public thisreo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thisreo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thisreo_impl.class ));
   }

   public thisreo_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkHisAdeSN = UIFactory.getCheckbox(this);
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
      A6668HisAdeSN = ((GXutil.strcmp(GXutil.rtrim( A6668HisAdeSN), "S")==0) ? "S" : "N") ;
      n6668HisAdeSN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6668HisAdeSN", A6668HisAdeSN);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISREO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHisBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtHisCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisCodPar_Internalname, GXutil.rtrim( A544HisCodPar), GXutil.rtrim( localUtil.format( A544HisCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtHisCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Defecto", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDefCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDefCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipDefCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Tipo Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A571HisTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A571HisTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A571HisTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtHisTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisBarSer_Internalname, GXutil.rtrim( A542HisBarSer), GXutil.rtrim( localUtil.format( A542HisBarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtHisBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisColNom_Internalname, GXutil.rtrim( A546HisColNom), GXutil.rtrim( localUtil.format( A546HisColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisColNom_Jsonclick, 0, "", "", "", "", "", 1, edtHisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A547HisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A547HisColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A547HisColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisColNum_Jsonclick, 0, "", "", "", "", "", 1, edtHisColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A572HisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A572HisTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A572HisTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtHisTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero de Piezas", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A553HisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A553HisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A553HisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisNumPie_Jsonclick, 0, "", "", "", "", "", 1, edtHisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Kilogramos", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A540HisBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisBarKgm_Enabled!=0) ? localUtil.format( A540HisBarKgm, "ZZZZZ9.99") : localUtil.format( A540HisBarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisBarKgm_Jsonclick, 0, "", "", "", "", "", 1, edtHisBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisBarMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A541HisBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisBarMtr_Enabled!=0) ? localUtil.format( A541HisBarMtr, "ZZZZZ9.99") : localUtil.format( A541HisBarMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisBarMtr_Jsonclick, 0, "", "", "", "", "", 1, edtHisBarMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisReoFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisReoFec_Internalname, localUtil.format(A569HisReoFec, "99/99/99"), localUtil.format( A569HisReoFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisReoFec_Jsonclick, 0, "", "", "", "", "", 1, edtHisReoFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisReoFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisReoFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Kilos Originales", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisKgmOri_Internalname, GXutil.ltrim( localUtil.ntoc( A549HisKgmOri, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisKgmOri_Enabled!=0) ? localUtil.format( A549HisKgmOri, "ZZZZZ9.99") : localUtil.format( A549HisKgmOri, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisKgmOri_Jsonclick, 0, "", "", "", "", "", 1, edtHisKgmOri_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Metros Originales", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisMtrOri_Internalname, GXutil.ltrim( localUtil.ntoc( A552HisMtrOri, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisMtrOri_Enabled!=0) ? localUtil.format( A552HisMtrOri, "ZZZZZ9.99") : localUtil.format( A552HisMtrOri, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisMtrOri_Jsonclick, 0, "", "", "", "", "", 1, edtHisMtrOri_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Orden Reoperado", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisOrdReo_Internalname, GXutil.ltrim( localUtil.ntoc( A554HisOrdReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisOrdReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A554HisOrdReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A554HisOrdReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisOrdReo_Jsonclick, 0, "", "", "", "", "", 1, edtHisOrdReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Estado Reoperado", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisEstReo_Internalname, GXutil.ltrim( localUtil.ntoc( A548HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisEstReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A548HisEstReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A548HisEstReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisEstReo_Jsonclick, 0, "", "", "", "", "", 1, edtHisEstReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Codigo TN", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisReoTn_Internalname, GXutil.ltrim( localUtil.ntoc( A2297HisReoTn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisReoTn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisReoTn_Jsonclick, 0, "", "", "", "", "", 1, edtHisReoTn_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Num Pza", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisReoPza_Internalname, GXutil.rtrim( A2298HisReoPza), GXutil.rtrim( localUtil.format( A2298HisReoPza, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisReoPza_Jsonclick, 0, "", "", "", "", "", 1, edtHisReoPza_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Desc Serie", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisReoDsc_Internalname, GXutil.rtrim( A2299HisReoDsc), GXutil.rtrim( localUtil.format( A2299HisReoDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisReoDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHisReoDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Codigo causa del Defecto", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodCausa_Internalname, GXutil.ltrim( localUtil.ntoc( A5085CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCodCausa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5085CodCausa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5085CodCausa), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodCausa_Jsonclick, 0, "", "", "", "", "", 1, edtCodCausa_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Descripcion de la causa", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDscCausa_Internalname, GXutil.rtrim( A5086DscCausa), GXutil.rtrim( localUtil.format( A5086DscCausa, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDscCausa_Jsonclick, 0, "", "", "", "", "", 1, edtDscCausa_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDefDsc_Internalname, GXutil.rtrim( A834TipDefDsc), GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDefDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipDefDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Codigo Tipo Correccion", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipCorCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5196TipCorCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipCorCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5196TipCorCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5196TipCorCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipCorCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipCorCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Descripcion Correccion", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipCorDsc_Internalname, GXutil.rtrim( A5197TipCorDsc), GXutil.rtrim( localUtil.format( A5197TipCorDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipCorDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipCorDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Correccion a efectuar, Accion", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtHisAcCo_Internalname, A5662HisAcCo, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", (short)(0), 1, edtHisAcCo_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3276", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Acciones Correctivas", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtHisAcCot_Internalname, A5693HisAcCot, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", (short)(0), 1, edtHisAcCot_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Acciones de correccion,Analisi", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtHisAdEAcCo_Internalname, A5694HisAdEAcCo, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", (short)(0), 1, edtHisAdEAcCo_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Acciones correctivas,Analisis", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtHisAdEAcCt_Internalname, A5695HisAdEAcCt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", (short)(0), 1, edtHisAdEAcCt_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Si o No", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkHisAdeSN.getInternalname(), A6668HisAdeSN, "", "", 1, chkHisAdeSN.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(191, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,191);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtHisAdeObs_Internalname, A6669HisAdeObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", (short)(0), 1, edtHisAdeObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Codigo Responsabilidad", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRps_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A7000Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRps_Cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7000Rps_Cod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7000Rps_Cod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRps_Cod_Jsonclick, 0, "", "", "", "", "", 1, edtRps_Cod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRps_Dsc_Internalname, GXutil.rtrim( A7001Rps_Dsc), GXutil.rtrim( localUtil.format( A7001Rps_Dsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRps_Dsc_Jsonclick, 0, "", "", "", "", "", 1, edtRps_Dsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisUsu_Internalname, GXutil.rtrim( A8414HisUsu), GXutil.rtrim( localUtil.format( A8414HisUsu, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisUsu_Jsonclick, 0, "", "", "", "", "", 1, edtHisUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "HisHorReo", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisHorReo_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisHorReo_Internalname, localUtil.ttoc( A8567HisHorReo, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8567HisHorReo, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisHorReo_Jsonclick, 0, "", "", "", "", "", 1, edtHisHorReo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisHorReo_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisHorReo_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Color Cliente", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisNomCli_Internalname, GXutil.rtrim( A8889HisNomCli), GXutil.rtrim( localUtil.format( A8889HisNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisNomCli_Jsonclick, 0, "", "", "", "", "", 1, edtHisNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A8890HisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8890HisNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8890HisNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisNumCli_Jsonclick, 0, "", "", "", "", "", 1, edtHisNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisOpecod_Internalname, GXutil.ltrim( localUtil.ntoc( A12949HisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisOpecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12949HisOpecod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12949HisOpecod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisOpecod_Jsonclick, 0, "", "", "", "", "", 1, edtHisOpecod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Turno", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisOpeTur_Internalname, GXutil.ltrim( localUtil.ntoc( A12950HisOpeTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisOpeTur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12950HisOpeTur), "9") : localUtil.format( DecimalUtil.doubleToDec(A12950HisOpeTur), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisOpeTur_Jsonclick, 0, "", "", "", "", "", 1, edtHisOpeTur_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Metros Cargo", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisMtsCarg_Internalname, GXutil.ltrim( localUtil.ntoc( A13015HisMtsCarg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisMtsCarg_Enabled!=0) ? localUtil.format( A13015HisMtsCarg, "ZZZZZ9.99") : localUtil.format( A13015HisMtsCarg, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisMtsCarg_Jsonclick, 0, "", "", "", "", "", 1, edtHisMtsCarg_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Importe Cargo", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisMtsImp_Internalname, GXutil.ltrim( localUtil.ntoc( A13016HisMtsImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisMtsImp_Enabled!=0) ? localUtil.format( A13016HisMtsImp, "ZZZZZZZZZZ9.99") : localUtil.format( A13016HisMtsImp, "ZZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisMtsImp_Jsonclick, 0, "", "", "", "", "", 1, edtHisMtsImp_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Precio Cargo", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisPreCarg_Internalname, GXutil.ltrim( localUtil.ntoc( A13017HisPreCarg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisPreCarg_Enabled!=0) ? localUtil.format( A13017HisPreCarg, "ZZZZZZ9.99999") : localUtil.format( A13017HisPreCarg, "ZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisPreCarg_Jsonclick, 0, "", "", "", "", "", 1, edtHisPreCarg_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 255,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 257,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 258,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISREO.htm");
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
         Z539HisBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z539HisBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z545HisCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z545HisCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z544HisCodPar = httpContext.cgiGet( "Z544HisCodPar") ;
         Z833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z833TipDefCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z542HisBarSer = httpContext.cgiGet( "Z542HisBarSer") ;
         Z546HisColNom = httpContext.cgiGet( "Z546HisColNom") ;
         Z547HisColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z547HisColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z553HisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z553HisNumPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z540HisBarKgm = localUtil.ctond( httpContext.cgiGet( "Z540HisBarKgm")) ;
         Z541HisBarMtr = localUtil.ctond( httpContext.cgiGet( "Z541HisBarMtr")) ;
         Z569HisReoFec = localUtil.ctod( httpContext.cgiGet( "Z569HisReoFec"), 0) ;
         Z549HisKgmOri = localUtil.ctond( httpContext.cgiGet( "Z549HisKgmOri")) ;
         Z552HisMtrOri = localUtil.ctond( httpContext.cgiGet( "Z552HisMtrOri")) ;
         Z554HisOrdReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z554HisOrdReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z548HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z548HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2297HisReoTn = (int)(localUtil.ctol( httpContext.cgiGet( "Z2297HisReoTn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2298HisReoPza = httpContext.cgiGet( "Z2298HisReoPza") ;
         Z2299HisReoDsc = httpContext.cgiGet( "Z2299HisReoDsc") ;
         Z5662HisAcCo = httpContext.cgiGet( "Z5662HisAcCo") ;
         Z5693HisAcCot = httpContext.cgiGet( "Z5693HisAcCot") ;
         Z5694HisAdEAcCo = httpContext.cgiGet( "Z5694HisAdEAcCo") ;
         Z5695HisAdEAcCt = httpContext.cgiGet( "Z5695HisAdEAcCt") ;
         Z6668HisAdeSN = httpContext.cgiGet( "Z6668HisAdeSN") ;
         Z6669HisAdeObs = httpContext.cgiGet( "Z6669HisAdeObs") ;
         Z8414HisUsu = httpContext.cgiGet( "Z8414HisUsu") ;
         Z8567HisHorReo = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z8567HisHorReo"), 0)) ;
         Z8889HisNomCli = httpContext.cgiGet( "Z8889HisNomCli") ;
         Z8890HisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z8890HisNumCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12949HisOpecod = (int)(localUtil.ctol( httpContext.cgiGet( "Z12949HisOpecod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12950HisOpeTur = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12950HisOpeTur"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13015HisMtsCarg = localUtil.ctond( httpContext.cgiGet( "Z13015HisMtsCarg")) ;
         Z13016HisMtsImp = localUtil.ctond( httpContext.cgiGet( "Z13016HisMtsImp")) ;
         Z13698HisreoLote = httpContext.cgiGet( "Z13698HisreoLote") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z571HisTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z571HisTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z572HisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z572HisTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5085CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( "Z5085CodCausa"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5196TipCorCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z5196TipCorCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7000Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( "Z7000Rps_Cod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13698HisreoLote = httpContext.cgiGet( "Z13698HisreoLote") ;
         n13698HisreoLote = false ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A13697HisReoHDR = httpContext.cgiGet( "HISREOHDR") ;
         A13699CostCausa = localUtil.ctond( httpContext.cgiGet( "COSTCAUSA")) ;
         n13699CostCausa = false ;
         A13700HisreoValo = localUtil.ctond( httpContext.cgiGet( "HISREOVALO")) ;
         A13698HisreoLote = httpContext.cgiGet( "HISREOLOTE") ;
         A13843HisTipArtD = httpContext.cgiGet( "HISTIPARTD") ;
         n13843HisTipArtD = false ;
         A13844HisTipColD = httpContext.cgiGet( "HISTIPCOLD") ;
         n13844HisTipColD = false ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A539HisBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
         }
         else
         {
            A539HisBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHisBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A545HisCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
         }
         else
         {
            A545HisCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
         }
         A544HisCodPar = httpContext.cgiGet( edtHisCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDEFCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipDefCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A833TipDefCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         }
         else
         {
            A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISTIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisTipArt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A571HisTipArt = (short)(0) ;
            n571HisTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A571HisTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A571HisTipArt), 4, 0));
         }
         else
         {
            A571HisTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtHisTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n571HisTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A571HisTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A571HisTipArt), 4, 0));
         }
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
         A542HisBarSer = httpContext.cgiGet( edtHisBarSer_Internalname) ;
         n542HisBarSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A542HisBarSer", A542HisBarSer);
         A546HisColNom = httpContext.cgiGet( edtHisColNom_Internalname) ;
         n546HisColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A546HisColNom", A546HisColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A547HisColNum = 0 ;
            n547HisColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A547HisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A547HisColNum), 6, 0));
         }
         else
         {
            A547HisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtHisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n547HisColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A547HisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A547HisColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisTipCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A572HisTipCol = (byte)(0) ;
            n572HisTipCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A572HisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A572HisTipCol), 2, 0));
         }
         else
         {
            A572HisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n572HisTipCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A572HisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A572HisTipCol), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISNUMPIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisNumPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A553HisNumPie = (short)(0) ;
            n553HisNumPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A553HisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A553HisNumPie), 4, 0));
         }
         else
         {
            A553HisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtHisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n553HisNumPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A553HisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A553HisNumPie), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisBarKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisBarKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISBARKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisBarKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A540HisBarKgm = DecimalUtil.ZERO ;
            n540HisBarKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A540HisBarKgm", GXutil.ltrimstr( A540HisBarKgm, 9, 2));
         }
         else
         {
            A540HisBarKgm = localUtil.ctond( httpContext.cgiGet( edtHisBarKgm_Internalname)) ;
            n540HisBarKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A540HisBarKgm", GXutil.ltrimstr( A540HisBarKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisBarMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisBarMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISBARMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisBarMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A541HisBarMtr = DecimalUtil.ZERO ;
            n541HisBarMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A541HisBarMtr", GXutil.ltrimstr( A541HisBarMtr, 9, 2));
         }
         else
         {
            A541HisBarMtr = localUtil.ctond( httpContext.cgiGet( edtHisBarMtr_Internalname)) ;
            n541HisBarMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A541HisBarMtr", GXutil.ltrimstr( A541HisBarMtr, 9, 2));
         }
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisReoFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HISREOFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisReoFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A569HisReoFec = GXutil.nullDate() ;
            n569HisReoFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A569HisReoFec", localUtil.format(A569HisReoFec, "99/99/99"));
         }
         else
         {
            A569HisReoFec = localUtil.ctod( httpContext.cgiGet( edtHisReoFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n569HisReoFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A569HisReoFec", localUtil.format(A569HisReoFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisKgmOri_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisKgmOri_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISKGMORI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisKgmOri_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A549HisKgmOri = DecimalUtil.ZERO ;
            n549HisKgmOri = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A549HisKgmOri", GXutil.ltrimstr( A549HisKgmOri, 9, 2));
         }
         else
         {
            A549HisKgmOri = localUtil.ctond( httpContext.cgiGet( edtHisKgmOri_Internalname)) ;
            n549HisKgmOri = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A549HisKgmOri", GXutil.ltrimstr( A549HisKgmOri, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisMtrOri_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisMtrOri_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISMTRORI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisMtrOri_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A552HisMtrOri = DecimalUtil.ZERO ;
            n552HisMtrOri = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A552HisMtrOri", GXutil.ltrimstr( A552HisMtrOri, 9, 2));
         }
         else
         {
            A552HisMtrOri = localUtil.ctond( httpContext.cgiGet( edtHisMtrOri_Internalname)) ;
            n552HisMtrOri = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A552HisMtrOri", GXutil.ltrimstr( A552HisMtrOri, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisOrdReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisOrdReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISORDREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisOrdReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A554HisOrdReo = (byte)(0) ;
            n554HisOrdReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A554HisOrdReo", GXutil.str( A554HisOrdReo, 1, 0));
         }
         else
         {
            A554HisOrdReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisOrdReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n554HisOrdReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A554HisOrdReo", GXutil.str( A554HisOrdReo, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisEstReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisEstReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISESTREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisEstReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A548HisEstReo = (byte)(0) ;
            n548HisEstReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A548HisEstReo", GXutil.str( A548HisEstReo, 1, 0));
         }
         else
         {
            A548HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisEstReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n548HisEstReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A548HisEstReo", GXutil.str( A548HisEstReo, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisReoTn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisReoTn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISREOTN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisReoTn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2297HisReoTn = 0 ;
            n2297HisReoTn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2297HisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2297HisReoTn), 6, 0));
         }
         else
         {
            A2297HisReoTn = (int)(localUtil.ctol( httpContext.cgiGet( edtHisReoTn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2297HisReoTn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2297HisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2297HisReoTn), 6, 0));
         }
         A2298HisReoPza = httpContext.cgiGet( edtHisReoPza_Internalname) ;
         n2298HisReoPza = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2298HisReoPza", A2298HisReoPza);
         A2299HisReoDsc = httpContext.cgiGet( edtHisReoDsc_Internalname) ;
         n2299HisReoDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2299HisReoDsc", A2299HisReoDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCodCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCodCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CODCAUSA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCodCausa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5085CodCausa = (short)(0) ;
            n5085CodCausa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
         }
         else
         {
            A5085CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( edtCodCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5085CodCausa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
         }
         A5086DscCausa = httpContext.cgiGet( edtDscCausa_Internalname) ;
         n5086DscCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
         A834TipDefDsc = httpContext.cgiGet( edtTipDefDsc_Internalname) ;
         n834TipDefDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipCorCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipCorCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCORCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipCorCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5196TipCorCod = (short)(0) ;
            n5196TipCorCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5196TipCorCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5196TipCorCod), 4, 0));
         }
         else
         {
            A5196TipCorCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipCorCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5196TipCorCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5196TipCorCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5196TipCorCod), 4, 0));
         }
         A5197TipCorDsc = httpContext.cgiGet( edtTipCorDsc_Internalname) ;
         n5197TipCorDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5197TipCorDsc", A5197TipCorDsc);
         A5662HisAcCo = httpContext.cgiGet( edtHisAcCo_Internalname) ;
         n5662HisAcCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5662HisAcCo", A5662HisAcCo);
         A5693HisAcCot = httpContext.cgiGet( edtHisAcCot_Internalname) ;
         n5693HisAcCot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5693HisAcCot", A5693HisAcCot);
         A5694HisAdEAcCo = httpContext.cgiGet( edtHisAdEAcCo_Internalname) ;
         n5694HisAdEAcCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5694HisAdEAcCo", A5694HisAdEAcCo);
         A5695HisAdEAcCt = httpContext.cgiGet( edtHisAdEAcCt_Internalname) ;
         n5695HisAdEAcCt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5695HisAdEAcCt", A5695HisAdEAcCt);
         A6668HisAdeSN = ((GXutil.strcmp(httpContext.cgiGet( chkHisAdeSN.getInternalname()), "S")==0) ? "S" : "N") ;
         n6668HisAdeSN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6668HisAdeSN", A6668HisAdeSN);
         A6669HisAdeObs = httpContext.cgiGet( edtHisAdeObs_Internalname) ;
         n6669HisAdeObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6669HisAdeObs", A6669HisAdeObs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRps_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRps_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPS_COD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRps_Cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7000Rps_Cod = (short)(0) ;
            n7000Rps_Cod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
         }
         else
         {
            A7000Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRps_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7000Rps_Cod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
         }
         A7001Rps_Dsc = httpContext.cgiGet( edtRps_Dsc_Internalname) ;
         n7001Rps_Dsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
         A8414HisUsu = GXutil.upper( httpContext.cgiGet( edtHisUsu_Internalname)) ;
         n8414HisUsu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8414HisUsu", A8414HisUsu);
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisHorReo_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "HISHORREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisHorReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
            n8567HisHorReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8567HisHorReo", localUtil.ttoc( A8567HisHorReo, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8567HisHorReo = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtHisHorReo_Internalname))) ;
            n8567HisHorReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8567HisHorReo", localUtil.ttoc( A8567HisHorReo, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A8889HisNomCli = httpContext.cgiGet( edtHisNomCli_Internalname) ;
         n8889HisNomCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8889HisNomCli", A8889HisNomCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISNUMCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisNumCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8890HisNumCli = 0 ;
            n8890HisNumCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8890HisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8890HisNumCli), 6, 0));
         }
         else
         {
            A8890HisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8890HisNumCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8890HisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8890HisNumCli), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISOPECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisOpecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12949HisOpecod = 0 ;
            n12949HisOpecod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12949HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12949HisOpecod), 6, 0));
         }
         else
         {
            A12949HisOpecod = (int)(localUtil.ctol( httpContext.cgiGet( edtHisOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12949HisOpecod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12949HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12949HisOpecod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisOpeTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisOpeTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISOPETUR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisOpeTur_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12950HisOpeTur = (byte)(0) ;
            n12950HisOpeTur = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12950HisOpeTur", GXutil.str( A12950HisOpeTur, 1, 0));
         }
         else
         {
            A12950HisOpeTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisOpeTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12950HisOpeTur = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12950HisOpeTur", GXutil.str( A12950HisOpeTur, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisMtsCarg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisMtsCarg_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISMTSCARG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisMtsCarg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13015HisMtsCarg = DecimalUtil.ZERO ;
            n13015HisMtsCarg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13015HisMtsCarg", GXutil.ltrimstr( A13015HisMtsCarg, 9, 2));
         }
         else
         {
            A13015HisMtsCarg = localUtil.ctond( httpContext.cgiGet( edtHisMtsCarg_Internalname)) ;
            n13015HisMtsCarg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13015HisMtsCarg", GXutil.ltrimstr( A13015HisMtsCarg, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisMtsImp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisMtsImp_Internalname)), DecimalUtil.stringToDec("99999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISMTSIMP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisMtsImp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13016HisMtsImp = DecimalUtil.ZERO ;
            n13016HisMtsImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13016HisMtsImp", GXutil.ltrimstr( A13016HisMtsImp, 14, 2));
         }
         else
         {
            A13016HisMtsImp = localUtil.ctond( httpContext.cgiGet( edtHisMtsImp_Internalname)) ;
            n13016HisMtsImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13016HisMtsImp", GXutil.ltrimstr( A13016HisMtsImp, 14, 2));
         }
         A13017HisPreCarg = localUtil.ctond( httpContext.cgiGet( edtHisPreCarg_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"THISREO");
         forbiddenHiddens.add("HisreoLote", GXutil.rtrim( localUtil.format( A13698HisreoLote, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A539HisBarCod != Z539HisBarCod ) || ( A545HisCodReo != Z545HisCodReo ) || ( GXutil.strcmp(A544HisCodPar, Z544HisCodPar) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("thisreo:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            A539HisBarCod = (int)(GXutil.lval( httpContext.GetPar( "HisBarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
            A545HisCodReo = (byte)(GXutil.lval( httpContext.GetPar( "HisCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
            A544HisCodPar = httpContext.GetPar( "HisCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
            A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
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
            initAll1A60( ) ;
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
      disableAttributes1A60( ) ;
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

   public void confirm_1A0( )
   {
      beforeValidate1A60( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1A60( ) ;
         }
         else
         {
            checkExtendedTable1A60( ) ;
            if ( AnyError == 0 )
            {
               zm1A60( 6) ;
               zm1A60( 7) ;
               zm1A60( 8) ;
               zm1A60( 9) ;
               zm1A60( 10) ;
               zm1A60( 11) ;
               zm1A60( 12) ;
               zm1A60( 13) ;
            }
            closeExtendedTableCursors1A60( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1A0( ) ;
      }
   }

   public void resetCaption1A0( )
   {
   }

   public void zm1A60( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z542HisBarSer = T001A3_A542HisBarSer[0] ;
            Z546HisColNom = T001A3_A546HisColNom[0] ;
            Z547HisColNum = T001A3_A547HisColNum[0] ;
            Z553HisNumPie = T001A3_A553HisNumPie[0] ;
            Z540HisBarKgm = T001A3_A540HisBarKgm[0] ;
            Z541HisBarMtr = T001A3_A541HisBarMtr[0] ;
            Z569HisReoFec = T001A3_A569HisReoFec[0] ;
            Z549HisKgmOri = T001A3_A549HisKgmOri[0] ;
            Z552HisMtrOri = T001A3_A552HisMtrOri[0] ;
            Z554HisOrdReo = T001A3_A554HisOrdReo[0] ;
            Z548HisEstReo = T001A3_A548HisEstReo[0] ;
            Z2297HisReoTn = T001A3_A2297HisReoTn[0] ;
            Z2298HisReoPza = T001A3_A2298HisReoPza[0] ;
            Z2299HisReoDsc = T001A3_A2299HisReoDsc[0] ;
            Z5662HisAcCo = T001A3_A5662HisAcCo[0] ;
            Z5693HisAcCot = T001A3_A5693HisAcCot[0] ;
            Z5694HisAdEAcCo = T001A3_A5694HisAdEAcCo[0] ;
            Z5695HisAdEAcCt = T001A3_A5695HisAdEAcCt[0] ;
            Z6668HisAdeSN = T001A3_A6668HisAdeSN[0] ;
            Z6669HisAdeObs = T001A3_A6669HisAdeObs[0] ;
            Z8414HisUsu = T001A3_A8414HisUsu[0] ;
            Z8567HisHorReo = T001A3_A8567HisHorReo[0] ;
            Z8889HisNomCli = T001A3_A8889HisNomCli[0] ;
            Z8890HisNumCli = T001A3_A8890HisNumCli[0] ;
            Z12949HisOpecod = T001A3_A12949HisOpecod[0] ;
            Z12950HisOpeTur = T001A3_A12950HisOpeTur[0] ;
            Z13015HisMtsCarg = T001A3_A13015HisMtsCarg[0] ;
            Z13016HisMtsImp = T001A3_A13016HisMtsImp[0] ;
            Z13698HisreoLote = T001A3_A13698HisreoLote[0] ;
            Z252CliCod = T001A3_A252CliCod[0] ;
            Z602MaqCod = T001A3_A602MaqCod[0] ;
            Z571HisTipArt = T001A3_A571HisTipArt[0] ;
            Z572HisTipCol = T001A3_A572HisTipCol[0] ;
            Z5085CodCausa = T001A3_A5085CodCausa[0] ;
            Z5196TipCorCod = T001A3_A5196TipCorCod[0] ;
            Z7000Rps_Cod = T001A3_A7000Rps_Cod[0] ;
         }
         else
         {
            Z542HisBarSer = A542HisBarSer ;
            Z546HisColNom = A546HisColNom ;
            Z547HisColNum = A547HisColNum ;
            Z553HisNumPie = A553HisNumPie ;
            Z540HisBarKgm = A540HisBarKgm ;
            Z541HisBarMtr = A541HisBarMtr ;
            Z569HisReoFec = A569HisReoFec ;
            Z549HisKgmOri = A549HisKgmOri ;
            Z552HisMtrOri = A552HisMtrOri ;
            Z554HisOrdReo = A554HisOrdReo ;
            Z548HisEstReo = A548HisEstReo ;
            Z2297HisReoTn = A2297HisReoTn ;
            Z2298HisReoPza = A2298HisReoPza ;
            Z2299HisReoDsc = A2299HisReoDsc ;
            Z5662HisAcCo = A5662HisAcCo ;
            Z5693HisAcCot = A5693HisAcCot ;
            Z5694HisAdEAcCo = A5694HisAdEAcCo ;
            Z5695HisAdEAcCt = A5695HisAdEAcCt ;
            Z6668HisAdeSN = A6668HisAdeSN ;
            Z6669HisAdeObs = A6669HisAdeObs ;
            Z8414HisUsu = A8414HisUsu ;
            Z8567HisHorReo = A8567HisHorReo ;
            Z8889HisNomCli = A8889HisNomCli ;
            Z8890HisNumCli = A8890HisNumCli ;
            Z12949HisOpecod = A12949HisOpecod ;
            Z12950HisOpeTur = A12950HisOpeTur ;
            Z13015HisMtsCarg = A13015HisMtsCarg ;
            Z13016HisMtsImp = A13016HisMtsImp ;
            Z13698HisreoLote = A13698HisreoLote ;
            Z252CliCod = A252CliCod ;
            Z602MaqCod = A602MaqCod ;
            Z571HisTipArt = A571HisTipArt ;
            Z572HisTipCol = A572HisTipCol ;
            Z5085CodCausa = A5085CodCausa ;
            Z5196TipCorCod = A5196TipCorCod ;
            Z7000Rps_Cod = A7000Rps_Cod ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z539HisBarCod = A539HisBarCod ;
         Z545HisCodReo = A545HisCodReo ;
         Z544HisCodPar = A544HisCodPar ;
         Z542HisBarSer = A542HisBarSer ;
         Z546HisColNom = A546HisColNom ;
         Z547HisColNum = A547HisColNum ;
         Z553HisNumPie = A553HisNumPie ;
         Z540HisBarKgm = A540HisBarKgm ;
         Z541HisBarMtr = A541HisBarMtr ;
         Z569HisReoFec = A569HisReoFec ;
         Z549HisKgmOri = A549HisKgmOri ;
         Z552HisMtrOri = A552HisMtrOri ;
         Z554HisOrdReo = A554HisOrdReo ;
         Z548HisEstReo = A548HisEstReo ;
         Z2297HisReoTn = A2297HisReoTn ;
         Z2298HisReoPza = A2298HisReoPza ;
         Z2299HisReoDsc = A2299HisReoDsc ;
         Z5662HisAcCo = A5662HisAcCo ;
         Z5693HisAcCot = A5693HisAcCot ;
         Z5694HisAdEAcCo = A5694HisAdEAcCo ;
         Z5695HisAdEAcCt = A5695HisAdEAcCt ;
         Z6668HisAdeSN = A6668HisAdeSN ;
         Z6669HisAdeObs = A6669HisAdeObs ;
         Z8414HisUsu = A8414HisUsu ;
         Z8567HisHorReo = A8567HisHorReo ;
         Z8889HisNomCli = A8889HisNomCli ;
         Z8890HisNumCli = A8890HisNumCli ;
         Z12949HisOpecod = A12949HisOpecod ;
         Z12950HisOpeTur = A12950HisOpeTur ;
         Z13015HisMtsCarg = A13015HisMtsCarg ;
         Z13016HisMtsImp = A13016HisMtsImp ;
         Z13698HisreoLote = A13698HisreoLote ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z602MaqCod = A602MaqCod ;
         Z571HisTipArt = A571HisTipArt ;
         Z572HisTipCol = A572HisTipCol ;
         Z833TipDefCod = A833TipDefCod ;
         Z5085CodCausa = A5085CodCausa ;
         Z5196TipCorCod = A5196TipCorCod ;
         Z7000Rps_Cod = A7000Rps_Cod ;
         Z834TipDefDsc = A834TipDefDsc ;
         Z13843HisTipArtD = A13843HisTipArtD ;
         Z279CliNom = A279CliNom ;
         Z13844HisTipColD = A13844HisTipColD ;
         Z606MaqDsc = A606MaqDsc ;
         Z5086DscCausa = A5086DscCausa ;
         Z13699CostCausa = A13699CostCausa ;
         Z5197TipCorDsc = A5197TipCorDsc ;
         Z7001Rps_Dsc = A7001Rps_Dsc ;
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

   public void load1A60( )
   {
      /* Using cursor T001A12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A13843HisTipArtD = T001A12_A13843HisTipArtD[0] ;
         n13843HisTipArtD = T001A12_n13843HisTipArtD[0] ;
         A279CliNom = T001A12_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A542HisBarSer = T001A12_A542HisBarSer[0] ;
         n542HisBarSer = T001A12_n542HisBarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A542HisBarSer", A542HisBarSer);
         A546HisColNom = T001A12_A546HisColNom[0] ;
         n546HisColNom = T001A12_n546HisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A546HisColNom", A546HisColNom);
         A547HisColNum = T001A12_A547HisColNum[0] ;
         n547HisColNum = T001A12_n547HisColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A547HisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A547HisColNum), 6, 0));
         A13844HisTipColD = T001A12_A13844HisTipColD[0] ;
         n13844HisTipColD = T001A12_n13844HisTipColD[0] ;
         A553HisNumPie = T001A12_A553HisNumPie[0] ;
         n553HisNumPie = T001A12_n553HisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A553HisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A553HisNumPie), 4, 0));
         A540HisBarKgm = T001A12_A540HisBarKgm[0] ;
         n540HisBarKgm = T001A12_n540HisBarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A540HisBarKgm", GXutil.ltrimstr( A540HisBarKgm, 9, 2));
         A541HisBarMtr = T001A12_A541HisBarMtr[0] ;
         n541HisBarMtr = T001A12_n541HisBarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A541HisBarMtr", GXutil.ltrimstr( A541HisBarMtr, 9, 2));
         A569HisReoFec = T001A12_A569HisReoFec[0] ;
         n569HisReoFec = T001A12_n569HisReoFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A569HisReoFec", localUtil.format(A569HisReoFec, "99/99/99"));
         A549HisKgmOri = T001A12_A549HisKgmOri[0] ;
         n549HisKgmOri = T001A12_n549HisKgmOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A549HisKgmOri", GXutil.ltrimstr( A549HisKgmOri, 9, 2));
         A552HisMtrOri = T001A12_A552HisMtrOri[0] ;
         n552HisMtrOri = T001A12_n552HisMtrOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A552HisMtrOri", GXutil.ltrimstr( A552HisMtrOri, 9, 2));
         A554HisOrdReo = T001A12_A554HisOrdReo[0] ;
         n554HisOrdReo = T001A12_n554HisOrdReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A554HisOrdReo", GXutil.str( A554HisOrdReo, 1, 0));
         A548HisEstReo = T001A12_A548HisEstReo[0] ;
         n548HisEstReo = T001A12_n548HisEstReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A548HisEstReo", GXutil.str( A548HisEstReo, 1, 0));
         A2297HisReoTn = T001A12_A2297HisReoTn[0] ;
         n2297HisReoTn = T001A12_n2297HisReoTn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2297HisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2297HisReoTn), 6, 0));
         A2298HisReoPza = T001A12_A2298HisReoPza[0] ;
         n2298HisReoPza = T001A12_n2298HisReoPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2298HisReoPza", A2298HisReoPza);
         A2299HisReoDsc = T001A12_A2299HisReoDsc[0] ;
         n2299HisReoDsc = T001A12_n2299HisReoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2299HisReoDsc", A2299HisReoDsc);
         A5086DscCausa = T001A12_A5086DscCausa[0] ;
         n5086DscCausa = T001A12_n5086DscCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
         A834TipDefDsc = T001A12_A834TipDefDsc[0] ;
         n834TipDefDsc = T001A12_n834TipDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
         A606MaqDsc = T001A12_A606MaqDsc[0] ;
         n606MaqDsc = T001A12_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A5197TipCorDsc = T001A12_A5197TipCorDsc[0] ;
         n5197TipCorDsc = T001A12_n5197TipCorDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5197TipCorDsc", A5197TipCorDsc);
         A5662HisAcCo = T001A12_A5662HisAcCo[0] ;
         n5662HisAcCo = T001A12_n5662HisAcCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5662HisAcCo", A5662HisAcCo);
         A5693HisAcCot = T001A12_A5693HisAcCot[0] ;
         n5693HisAcCot = T001A12_n5693HisAcCot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5693HisAcCot", A5693HisAcCot);
         A5694HisAdEAcCo = T001A12_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = T001A12_n5694HisAdEAcCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5694HisAdEAcCo", A5694HisAdEAcCo);
         A5695HisAdEAcCt = T001A12_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = T001A12_n5695HisAdEAcCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5695HisAdEAcCt", A5695HisAdEAcCt);
         A6668HisAdeSN = T001A12_A6668HisAdeSN[0] ;
         n6668HisAdeSN = T001A12_n6668HisAdeSN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6668HisAdeSN", A6668HisAdeSN);
         A6669HisAdeObs = T001A12_A6669HisAdeObs[0] ;
         n6669HisAdeObs = T001A12_n6669HisAdeObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6669HisAdeObs", A6669HisAdeObs);
         A7001Rps_Dsc = T001A12_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = T001A12_n7001Rps_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
         A8414HisUsu = T001A12_A8414HisUsu[0] ;
         n8414HisUsu = T001A12_n8414HisUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8414HisUsu", A8414HisUsu);
         A8567HisHorReo = T001A12_A8567HisHorReo[0] ;
         n8567HisHorReo = T001A12_n8567HisHorReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8567HisHorReo", localUtil.ttoc( A8567HisHorReo, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8889HisNomCli = T001A12_A8889HisNomCli[0] ;
         n8889HisNomCli = T001A12_n8889HisNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8889HisNomCli", A8889HisNomCli);
         A8890HisNumCli = T001A12_A8890HisNumCli[0] ;
         n8890HisNumCli = T001A12_n8890HisNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8890HisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8890HisNumCli), 6, 0));
         A12949HisOpecod = T001A12_A12949HisOpecod[0] ;
         n12949HisOpecod = T001A12_n12949HisOpecod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12949HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12949HisOpecod), 6, 0));
         A12950HisOpeTur = T001A12_A12950HisOpeTur[0] ;
         n12950HisOpeTur = T001A12_n12950HisOpeTur[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12950HisOpeTur", GXutil.str( A12950HisOpeTur, 1, 0));
         A13015HisMtsCarg = T001A12_A13015HisMtsCarg[0] ;
         n13015HisMtsCarg = T001A12_n13015HisMtsCarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13015HisMtsCarg", GXutil.ltrimstr( A13015HisMtsCarg, 9, 2));
         A13016HisMtsImp = T001A12_A13016HisMtsImp[0] ;
         n13016HisMtsImp = T001A12_n13016HisMtsImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13016HisMtsImp", GXutil.ltrimstr( A13016HisMtsImp, 14, 2));
         A13698HisreoLote = T001A12_A13698HisreoLote[0] ;
         n13698HisreoLote = T001A12_n13698HisreoLote[0] ;
         A13699CostCausa = T001A12_A13699CostCausa[0] ;
         n13699CostCausa = T001A12_n13699CostCausa[0] ;
         A252CliCod = T001A12_A252CliCod[0] ;
         n252CliCod = T001A12_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A602MaqCod = T001A12_A602MaqCod[0] ;
         n602MaqCod = T001A12_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A571HisTipArt = T001A12_A571HisTipArt[0] ;
         n571HisTipArt = T001A12_n571HisTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A571HisTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A571HisTipArt), 4, 0));
         A572HisTipCol = T001A12_A572HisTipCol[0] ;
         n572HisTipCol = T001A12_n572HisTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A572HisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A572HisTipCol), 2, 0));
         A5085CodCausa = T001A12_A5085CodCausa[0] ;
         n5085CodCausa = T001A12_n5085CodCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
         A5196TipCorCod = T001A12_A5196TipCorCod[0] ;
         n5196TipCorCod = T001A12_n5196TipCorCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5196TipCorCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5196TipCorCod), 4, 0));
         A7000Rps_Cod = T001A12_A7000Rps_Cod[0] ;
         n7000Rps_Cod = T001A12_n7000Rps_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
         zm1A60( -5) ;
      }
      pr_default.close(10);
      onLoadActions1A60( ) ;
   }

   public void onLoadActions1A60( )
   {
      A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13700HisreoValo", GXutil.ltrimstr( A13700HisreoValo, 11, 3));
      A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13697HisReoHDR", A13697HisReoHDR);
      if ( A13015HisMtsCarg.doubleValue() > 0 )
      {
         A13017HisPreCarg = GXutil.roundDecimal( A13016HisMtsImp.divide(A13015HisMtsCarg, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
      }
      else
      {
         if ( true )
         {
            A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
         }
         else
         {
            A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
         }
      }
   }

   public void checkExtendedTable1A60( )
   {
      nIsDirty_60 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T001A4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T001A4_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(2);
      /* Using cursor T001A5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T001A5_A606MaqDsc[0] ;
      n606MaqDsc = T001A5_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(3);
      /* Using cursor T001A6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Articulo_HISREO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13843HisTipArtD = T001A6_A13843HisTipArtD[0] ;
      n13843HisTipArtD = T001A6_n13843HisTipArtD[0] ;
      pr_default.close(4);
      /* Using cursor T001A7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante_HISREO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISTIPCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13844HisTipColD = T001A7_A13844HisTipColD[0] ;
      n13844HisTipColD = T001A7_n13844HisTipColD[0] ;
      pr_default.close(5);
      /* Using cursor T001A9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5085CodCausa) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCAU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCAUSA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5086DscCausa = T001A9_A5086DscCausa[0] ;
      n5086DscCausa = T001A9_n5086DscCausa[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
      A13699CostCausa = T001A9_A13699CostCausa[0] ;
      n13699CostCausa = T001A9_n13699CostCausa[0] ;
      pr_default.close(7);
      nIsDirty_60 = (short)(1) ;
      A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13700HisreoValo", GXutil.ltrimstr( A13700HisreoValo, 11, 3));
      /* Using cursor T001A10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n5196TipCorCod), Short.valueOf(A5196TipCorCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5196TipCorCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CORTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCORCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5197TipCorDsc = T001A10_A5197TipCorDsc[0] ;
      n5197TipCorDsc = T001A10_n5197TipCorDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5197TipCorDsc", A5197TipCorDsc);
      pr_default.close(8);
      /* Using cursor T001A11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A7000Rps_Cod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODRPS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RPS_COD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A7001Rps_Dsc = T001A11_A7001Rps_Dsc[0] ;
      n7001Rps_Dsc = T001A11_n7001Rps_Dsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
      pr_default.close(9);
      nIsDirty_60 = (short)(1) ;
      A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13697HisReoHDR", A13697HisReoHDR);
      /* Using cursor T001A8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T001A8_A834TipDefDsc[0] ;
      n834TipDefDsc = T001A8_n834TipDefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      pr_default.close(6);
      if ( ! ( ( GXutil.strcmp(A6668HisAdeSN, "S") == 0 ) || ( GXutil.strcmp(A6668HisAdeSN, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Si o No", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "HISADESN");
         AnyError = (short)(1) ;
         GX_FocusControl = chkHisAdeSN.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A13015HisMtsCarg.doubleValue() > 0 )
      {
         nIsDirty_60 = (short)(1) ;
         A13017HisPreCarg = GXutil.roundDecimal( A13016HisMtsImp.divide(A13015HisMtsCarg, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
      }
      else
      {
         if ( true )
         {
            nIsDirty_60 = (short)(1) ;
            A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
         }
         else
         {
            nIsDirty_60 = (short)(1) ;
            A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
         }
      }
   }

   public void closeExtendedTableCursors1A60( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T001A13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T001A13_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_7( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T001A14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T001A14_A606MaqDsc[0] ;
      n606MaqDsc = T001A14_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_8( String A396EmprCod ,
                         short A571HisTipArt )
   {
      /* Using cursor T001A15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Articulo_HISREO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13843HisTipArtD = T001A15_A13843HisTipArtD[0] ;
      n13843HisTipArtD = T001A15_n13843HisTipArtD[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13843HisTipArtD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_9( String A396EmprCod ,
                         byte A572HisTipCol )
   {
      /* Using cursor T001A16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante_HISREO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISTIPCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13844HisTipColD = T001A16_A13844HisTipColD[0] ;
      n13844HisTipColD = T001A16_n13844HisTipColD[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13844HisTipColD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_11( String A396EmprCod ,
                          short A5085CodCausa )
   {
      /* Using cursor T001A17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5085CodCausa) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCAU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCAUSA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5086DscCausa = T001A17_A5086DscCausa[0] ;
      n5086DscCausa = T001A17_n5086DscCausa[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
      A13699CostCausa = T001A17_A13699CostCausa[0] ;
      n13699CostCausa = T001A17_n13699CostCausa[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5086DscCausa))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_12( String A396EmprCod ,
                          short A5196TipCorCod )
   {
      /* Using cursor T001A18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n5196TipCorCod), Short.valueOf(A5196TipCorCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5196TipCorCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CORTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCORCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5197TipCorDsc = T001A18_A5197TipCorDsc[0] ;
      n5197TipCorDsc = T001A18_n5197TipCorDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5197TipCorDsc", A5197TipCorDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5197TipCorDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_13( String A396EmprCod ,
                          short A7000Rps_Cod )
   {
      /* Using cursor T001A19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A7000Rps_Cod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODRPS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RPS_COD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A7001Rps_Dsc = T001A19_A7001Rps_Dsc[0] ;
      n7001Rps_Dsc = T001A19_n7001Rps_Dsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7001Rps_Dsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_10( String A396EmprCod ,
                          short A833TipDefCod )
   {
      /* Using cursor T001A20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T001A20_A834TipDefDsc[0] ;
      n834TipDefDsc = T001A20_n834TipDefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A834TipDefDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1A60( )
   {
      /* Using cursor T001A21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound60 = (short)(1) ;
      }
      else
      {
         RcdFound60 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1A60( 5) ;
         RcdFound60 = (short)(1) ;
         A539HisBarCod = T001A3_A539HisBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
         A545HisCodReo = T001A3_A545HisCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
         A544HisCodPar = T001A3_A544HisCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
         A542HisBarSer = T001A3_A542HisBarSer[0] ;
         n542HisBarSer = T001A3_n542HisBarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A542HisBarSer", A542HisBarSer);
         A546HisColNom = T001A3_A546HisColNom[0] ;
         n546HisColNom = T001A3_n546HisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A546HisColNom", A546HisColNom);
         A547HisColNum = T001A3_A547HisColNum[0] ;
         n547HisColNum = T001A3_n547HisColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A547HisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A547HisColNum), 6, 0));
         A553HisNumPie = T001A3_A553HisNumPie[0] ;
         n553HisNumPie = T001A3_n553HisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A553HisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A553HisNumPie), 4, 0));
         A540HisBarKgm = T001A3_A540HisBarKgm[0] ;
         n540HisBarKgm = T001A3_n540HisBarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A540HisBarKgm", GXutil.ltrimstr( A540HisBarKgm, 9, 2));
         A541HisBarMtr = T001A3_A541HisBarMtr[0] ;
         n541HisBarMtr = T001A3_n541HisBarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A541HisBarMtr", GXutil.ltrimstr( A541HisBarMtr, 9, 2));
         A569HisReoFec = T001A3_A569HisReoFec[0] ;
         n569HisReoFec = T001A3_n569HisReoFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A569HisReoFec", localUtil.format(A569HisReoFec, "99/99/99"));
         A549HisKgmOri = T001A3_A549HisKgmOri[0] ;
         n549HisKgmOri = T001A3_n549HisKgmOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A549HisKgmOri", GXutil.ltrimstr( A549HisKgmOri, 9, 2));
         A552HisMtrOri = T001A3_A552HisMtrOri[0] ;
         n552HisMtrOri = T001A3_n552HisMtrOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A552HisMtrOri", GXutil.ltrimstr( A552HisMtrOri, 9, 2));
         A554HisOrdReo = T001A3_A554HisOrdReo[0] ;
         n554HisOrdReo = T001A3_n554HisOrdReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A554HisOrdReo", GXutil.str( A554HisOrdReo, 1, 0));
         A548HisEstReo = T001A3_A548HisEstReo[0] ;
         n548HisEstReo = T001A3_n548HisEstReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A548HisEstReo", GXutil.str( A548HisEstReo, 1, 0));
         A2297HisReoTn = T001A3_A2297HisReoTn[0] ;
         n2297HisReoTn = T001A3_n2297HisReoTn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2297HisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2297HisReoTn), 6, 0));
         A2298HisReoPza = T001A3_A2298HisReoPza[0] ;
         n2298HisReoPza = T001A3_n2298HisReoPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2298HisReoPza", A2298HisReoPza);
         A2299HisReoDsc = T001A3_A2299HisReoDsc[0] ;
         n2299HisReoDsc = T001A3_n2299HisReoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2299HisReoDsc", A2299HisReoDsc);
         A5662HisAcCo = T001A3_A5662HisAcCo[0] ;
         n5662HisAcCo = T001A3_n5662HisAcCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5662HisAcCo", A5662HisAcCo);
         A5693HisAcCot = T001A3_A5693HisAcCot[0] ;
         n5693HisAcCot = T001A3_n5693HisAcCot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5693HisAcCot", A5693HisAcCot);
         A5694HisAdEAcCo = T001A3_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = T001A3_n5694HisAdEAcCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5694HisAdEAcCo", A5694HisAdEAcCo);
         A5695HisAdEAcCt = T001A3_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = T001A3_n5695HisAdEAcCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5695HisAdEAcCt", A5695HisAdEAcCt);
         A6668HisAdeSN = T001A3_A6668HisAdeSN[0] ;
         n6668HisAdeSN = T001A3_n6668HisAdeSN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6668HisAdeSN", A6668HisAdeSN);
         A6669HisAdeObs = T001A3_A6669HisAdeObs[0] ;
         n6669HisAdeObs = T001A3_n6669HisAdeObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6669HisAdeObs", A6669HisAdeObs);
         A8414HisUsu = T001A3_A8414HisUsu[0] ;
         n8414HisUsu = T001A3_n8414HisUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8414HisUsu", A8414HisUsu);
         A8567HisHorReo = T001A3_A8567HisHorReo[0] ;
         n8567HisHorReo = T001A3_n8567HisHorReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8567HisHorReo", localUtil.ttoc( A8567HisHorReo, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8889HisNomCli = T001A3_A8889HisNomCli[0] ;
         n8889HisNomCli = T001A3_n8889HisNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8889HisNomCli", A8889HisNomCli);
         A8890HisNumCli = T001A3_A8890HisNumCli[0] ;
         n8890HisNumCli = T001A3_n8890HisNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8890HisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8890HisNumCli), 6, 0));
         A12949HisOpecod = T001A3_A12949HisOpecod[0] ;
         n12949HisOpecod = T001A3_n12949HisOpecod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12949HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12949HisOpecod), 6, 0));
         A12950HisOpeTur = T001A3_A12950HisOpeTur[0] ;
         n12950HisOpeTur = T001A3_n12950HisOpeTur[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12950HisOpeTur", GXutil.str( A12950HisOpeTur, 1, 0));
         A13015HisMtsCarg = T001A3_A13015HisMtsCarg[0] ;
         n13015HisMtsCarg = T001A3_n13015HisMtsCarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13015HisMtsCarg", GXutil.ltrimstr( A13015HisMtsCarg, 9, 2));
         A13016HisMtsImp = T001A3_A13016HisMtsImp[0] ;
         n13016HisMtsImp = T001A3_n13016HisMtsImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13016HisMtsImp", GXutil.ltrimstr( A13016HisMtsImp, 14, 2));
         A13698HisreoLote = T001A3_A13698HisreoLote[0] ;
         n13698HisreoLote = T001A3_n13698HisreoLote[0] ;
         A396EmprCod = T001A3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T001A3_A252CliCod[0] ;
         n252CliCod = T001A3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A602MaqCod = T001A3_A602MaqCod[0] ;
         n602MaqCod = T001A3_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A571HisTipArt = T001A3_A571HisTipArt[0] ;
         n571HisTipArt = T001A3_n571HisTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A571HisTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A571HisTipArt), 4, 0));
         A572HisTipCol = T001A3_A572HisTipCol[0] ;
         n572HisTipCol = T001A3_n572HisTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A572HisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A572HisTipCol), 2, 0));
         A833TipDefCod = T001A3_A833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         A5085CodCausa = T001A3_A5085CodCausa[0] ;
         n5085CodCausa = T001A3_n5085CodCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
         A5196TipCorCod = T001A3_A5196TipCorCod[0] ;
         n5196TipCorCod = T001A3_n5196TipCorCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5196TipCorCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5196TipCorCod), 4, 0));
         A7000Rps_Cod = T001A3_A7000Rps_Cod[0] ;
         n7000Rps_Cod = T001A3_n7000Rps_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z539HisBarCod = A539HisBarCod ;
         Z545HisCodReo = A545HisCodReo ;
         Z544HisCodPar = A544HisCodPar ;
         Z833TipDefCod = A833TipDefCod ;
         sMode60 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1A60( ) ;
         if ( AnyError == 1 )
         {
            RcdFound60 = (short)(0) ;
            initializeNonKey1A60( ) ;
         }
         Gx_mode = sMode60 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound60 = (short)(0) ;
         initializeNonKey1A60( ) ;
         sMode60 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode60 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1A60( ) ;
      if ( RcdFound60 == 0 )
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
      RcdFound60 = (short)(0) ;
      /* Using cursor T001A22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A539HisBarCod), Integer.valueOf(A539HisBarCod), A396EmprCod, Byte.valueOf(A545HisCodReo), Byte.valueOf(A545HisCodReo), Integer.valueOf(A539HisBarCod), A396EmprCod, A544HisCodPar, A544HisCodPar, Byte.valueOf(A545HisCodReo), Integer.valueOf(A539HisBarCod), A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A22_A539HisBarCod[0] < A539HisBarCod ) || ( T001A22_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A22_A545HisCodReo[0] < A545HisCodReo ) || ( T001A22_A545HisCodReo[0] == A545HisCodReo ) && ( T001A22_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001A22_A544HisCodPar[0], A544HisCodPar) < 0 ) || ( GXutil.strcmp(T001A22_A544HisCodPar[0], A544HisCodPar) == 0 ) && ( T001A22_A545HisCodReo[0] == A545HisCodReo ) && ( T001A22_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A22_A833TipDefCod[0] < A833TipDefCod ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A22_A539HisBarCod[0] > A539HisBarCod ) || ( T001A22_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A22_A545HisCodReo[0] > A545HisCodReo ) || ( T001A22_A545HisCodReo[0] == A545HisCodReo ) && ( T001A22_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001A22_A544HisCodPar[0], A544HisCodPar) > 0 ) || ( GXutil.strcmp(T001A22_A544HisCodPar[0], A544HisCodPar) == 0 ) && ( T001A22_A545HisCodReo[0] == A545HisCodReo ) && ( T001A22_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A22_A833TipDefCod[0] > A833TipDefCod ) ) )
         {
            A396EmprCod = T001A22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A539HisBarCod = T001A22_A539HisBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
            A545HisCodReo = T001A22_A545HisCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
            A544HisCodPar = T001A22_A544HisCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
            A833TipDefCod = T001A22_A833TipDefCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            RcdFound60 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void move_previous( )
   {
      RcdFound60 = (short)(0) ;
      /* Using cursor T001A23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A539HisBarCod), Integer.valueOf(A539HisBarCod), A396EmprCod, Byte.valueOf(A545HisCodReo), Byte.valueOf(A545HisCodReo), Integer.valueOf(A539HisBarCod), A396EmprCod, A544HisCodPar, A544HisCodPar, Byte.valueOf(A545HisCodReo), Integer.valueOf(A539HisBarCod), A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A23_A539HisBarCod[0] > A539HisBarCod ) || ( T001A23_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A23_A545HisCodReo[0] > A545HisCodReo ) || ( T001A23_A545HisCodReo[0] == A545HisCodReo ) && ( T001A23_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001A23_A544HisCodPar[0], A544HisCodPar) > 0 ) || ( GXutil.strcmp(T001A23_A544HisCodPar[0], A544HisCodPar) == 0 ) && ( T001A23_A545HisCodReo[0] == A545HisCodReo ) && ( T001A23_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A23_A833TipDefCod[0] > A833TipDefCod ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A23_A539HisBarCod[0] < A539HisBarCod ) || ( T001A23_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A23_A545HisCodReo[0] < A545HisCodReo ) || ( T001A23_A545HisCodReo[0] == A545HisCodReo ) && ( T001A23_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001A23_A544HisCodPar[0], A544HisCodPar) < 0 ) || ( GXutil.strcmp(T001A23_A544HisCodPar[0], A544HisCodPar) == 0 ) && ( T001A23_A545HisCodReo[0] == A545HisCodReo ) && ( T001A23_A539HisBarCod[0] == A539HisBarCod ) && ( GXutil.strcmp(T001A23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001A23_A833TipDefCod[0] < A833TipDefCod ) ) )
         {
            A396EmprCod = T001A23_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A539HisBarCod = T001A23_A539HisBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
            A545HisCodReo = T001A23_A545HisCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
            A544HisCodPar = T001A23_A544HisCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
            A833TipDefCod = T001A23_A833TipDefCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            RcdFound60 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1A60( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1A60( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound60 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A539HisBarCod != Z539HisBarCod ) || ( A545HisCodReo != Z545HisCodReo ) || ( GXutil.strcmp(A544HisCodPar, Z544HisCodPar) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A539HisBarCod = Z539HisBarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
               A545HisCodReo = Z545HisCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
               A544HisCodPar = Z544HisCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
               A833TipDefCod = Z833TipDefCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
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
               update1A60( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A539HisBarCod != Z539HisBarCod ) || ( A545HisCodReo != Z545HisCodReo ) || ( GXutil.strcmp(A544HisCodPar, Z544HisCodPar) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1A60( ) ;
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
                  insert1A60( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A539HisBarCod != Z539HisBarCod ) || ( A545HisCodReo != Z545HisCodReo ) || ( GXutil.strcmp(A544HisCodPar, Z544HisCodPar) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A539HisBarCod = Z539HisBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
         A545HisCodReo = Z545HisCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
         A544HisCodPar = Z544HisCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
         A833TipDefCod = Z833TipDefCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
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
      getKey1A60( ) ;
      if ( RcdFound60 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A539HisBarCod != Z539HisBarCod ) || ( A545HisCodReo != Z545HisCodReo ) || ( GXutil.strcmp(A544HisCodPar, Z544HisCodPar) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A539HisBarCod = Z539HisBarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
            A545HisCodReo = Z545HisCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
            A544HisCodPar = Z544HisCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
            A833TipDefCod = Z833TipDefCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A539HisBarCod != Z539HisBarCod ) || ( A545HisCodReo != Z545HisCodReo ) || ( GXutil.strcmp(A544HisCodPar, Z544HisCodPar) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thisreo");
      GX_FocusControl = edtHisTipArt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1A0( ) ;
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
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHisTipArt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1A60( ) ;
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisTipArt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A60( ) ;
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
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisTipArt_Internalname ;
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
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisTipArt_Internalname ;
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
      scanStart1A60( ) ;
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound60 != 0 )
         {
            scanNext1A60( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisTipArt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A60( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1A60( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001A2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z542HisBarSer, T001A2_A542HisBarSer[0]) != 0 ) || ( GXutil.strcmp(Z546HisColNom, T001A2_A546HisColNom[0]) != 0 ) || ( Z547HisColNum != T001A2_A547HisColNum[0] ) || ( Z553HisNumPie != T001A2_A553HisNumPie[0] ) || ( DecimalUtil.compareTo(Z540HisBarKgm, T001A2_A540HisBarKgm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z541HisBarMtr, T001A2_A541HisBarMtr[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z569HisReoFec), GXutil.resetTime(T001A2_A569HisReoFec[0])) ) || ( DecimalUtil.compareTo(Z549HisKgmOri, T001A2_A549HisKgmOri[0]) != 0 ) || ( DecimalUtil.compareTo(Z552HisMtrOri, T001A2_A552HisMtrOri[0]) != 0 ) || ( Z554HisOrdReo != T001A2_A554HisOrdReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z548HisEstReo != T001A2_A548HisEstReo[0] ) || ( Z2297HisReoTn != T001A2_A2297HisReoTn[0] ) || ( GXutil.strcmp(Z2298HisReoPza, T001A2_A2298HisReoPza[0]) != 0 ) || ( GXutil.strcmp(Z2299HisReoDsc, T001A2_A2299HisReoDsc[0]) != 0 ) || ( GXutil.strcmp(Z5662HisAcCo, T001A2_A5662HisAcCo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5693HisAcCot, T001A2_A5693HisAcCot[0]) != 0 ) || ( GXutil.strcmp(Z5694HisAdEAcCo, T001A2_A5694HisAdEAcCo[0]) != 0 ) || ( GXutil.strcmp(Z5695HisAdEAcCt, T001A2_A5695HisAdEAcCt[0]) != 0 ) || ( GXutil.strcmp(Z6668HisAdeSN, T001A2_A6668HisAdeSN[0]) != 0 ) || ( GXutil.strcmp(Z6669HisAdeObs, T001A2_A6669HisAdeObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8414HisUsu, T001A2_A8414HisUsu[0]) != 0 ) || !( GXutil.dateCompare(Z8567HisHorReo, T001A2_A8567HisHorReo[0]) ) || ( GXutil.strcmp(Z8889HisNomCli, T001A2_A8889HisNomCli[0]) != 0 ) || ( Z8890HisNumCli != T001A2_A8890HisNumCli[0] ) || ( Z12949HisOpecod != T001A2_A12949HisOpecod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12950HisOpeTur != T001A2_A12950HisOpeTur[0] ) || ( DecimalUtil.compareTo(Z13015HisMtsCarg, T001A2_A13015HisMtsCarg[0]) != 0 ) || ( DecimalUtil.compareTo(Z13016HisMtsImp, T001A2_A13016HisMtsImp[0]) != 0 ) || ( GXutil.strcmp(Z13698HisreoLote, T001A2_A13698HisreoLote[0]) != 0 ) || ( Z252CliCod != T001A2_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z602MaqCod, T001A2_A602MaqCod[0]) != 0 ) || ( Z571HisTipArt != T001A2_A571HisTipArt[0] ) || ( Z572HisTipCol != T001A2_A572HisTipCol[0] ) || ( Z5085CodCausa != T001A2_A5085CodCausa[0] ) || ( Z5196TipCorCod != T001A2_A5196TipCorCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7000Rps_Cod != T001A2_A7000Rps_Cod[0] ) )
         {
            if ( GXutil.strcmp(Z542HisBarSer, T001A2_A542HisBarSer[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisBarSer");
               GXutil.writeLogRaw("Old: ",Z542HisBarSer);
               GXutil.writeLogRaw("Current: ",T001A2_A542HisBarSer[0]);
            }
            if ( GXutil.strcmp(Z546HisColNom, T001A2_A546HisColNom[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisColNom");
               GXutil.writeLogRaw("Old: ",Z546HisColNom);
               GXutil.writeLogRaw("Current: ",T001A2_A546HisColNom[0]);
            }
            if ( Z547HisColNum != T001A2_A547HisColNum[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisColNum");
               GXutil.writeLogRaw("Old: ",Z547HisColNum);
               GXutil.writeLogRaw("Current: ",T001A2_A547HisColNum[0]);
            }
            if ( Z553HisNumPie != T001A2_A553HisNumPie[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisNumPie");
               GXutil.writeLogRaw("Old: ",Z553HisNumPie);
               GXutil.writeLogRaw("Current: ",T001A2_A553HisNumPie[0]);
            }
            if ( DecimalUtil.compareTo(Z540HisBarKgm, T001A2_A540HisBarKgm[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisBarKgm");
               GXutil.writeLogRaw("Old: ",Z540HisBarKgm);
               GXutil.writeLogRaw("Current: ",T001A2_A540HisBarKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z541HisBarMtr, T001A2_A541HisBarMtr[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisBarMtr");
               GXutil.writeLogRaw("Old: ",Z541HisBarMtr);
               GXutil.writeLogRaw("Current: ",T001A2_A541HisBarMtr[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z569HisReoFec), GXutil.resetTime(T001A2_A569HisReoFec[0])) ) )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisReoFec");
               GXutil.writeLogRaw("Old: ",Z569HisReoFec);
               GXutil.writeLogRaw("Current: ",T001A2_A569HisReoFec[0]);
            }
            if ( DecimalUtil.compareTo(Z549HisKgmOri, T001A2_A549HisKgmOri[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisKgmOri");
               GXutil.writeLogRaw("Old: ",Z549HisKgmOri);
               GXutil.writeLogRaw("Current: ",T001A2_A549HisKgmOri[0]);
            }
            if ( DecimalUtil.compareTo(Z552HisMtrOri, T001A2_A552HisMtrOri[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisMtrOri");
               GXutil.writeLogRaw("Old: ",Z552HisMtrOri);
               GXutil.writeLogRaw("Current: ",T001A2_A552HisMtrOri[0]);
            }
            if ( Z554HisOrdReo != T001A2_A554HisOrdReo[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisOrdReo");
               GXutil.writeLogRaw("Old: ",Z554HisOrdReo);
               GXutil.writeLogRaw("Current: ",T001A2_A554HisOrdReo[0]);
            }
            if ( Z548HisEstReo != T001A2_A548HisEstReo[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisEstReo");
               GXutil.writeLogRaw("Old: ",Z548HisEstReo);
               GXutil.writeLogRaw("Current: ",T001A2_A548HisEstReo[0]);
            }
            if ( Z2297HisReoTn != T001A2_A2297HisReoTn[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisReoTn");
               GXutil.writeLogRaw("Old: ",Z2297HisReoTn);
               GXutil.writeLogRaw("Current: ",T001A2_A2297HisReoTn[0]);
            }
            if ( GXutil.strcmp(Z2298HisReoPza, T001A2_A2298HisReoPza[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisReoPza");
               GXutil.writeLogRaw("Old: ",Z2298HisReoPza);
               GXutil.writeLogRaw("Current: ",T001A2_A2298HisReoPza[0]);
            }
            if ( GXutil.strcmp(Z2299HisReoDsc, T001A2_A2299HisReoDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisReoDsc");
               GXutil.writeLogRaw("Old: ",Z2299HisReoDsc);
               GXutil.writeLogRaw("Current: ",T001A2_A2299HisReoDsc[0]);
            }
            if ( GXutil.strcmp(Z5662HisAcCo, T001A2_A5662HisAcCo[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisAcCo");
               GXutil.writeLogRaw("Old: ",Z5662HisAcCo);
               GXutil.writeLogRaw("Current: ",T001A2_A5662HisAcCo[0]);
            }
            if ( GXutil.strcmp(Z5693HisAcCot, T001A2_A5693HisAcCot[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisAcCot");
               GXutil.writeLogRaw("Old: ",Z5693HisAcCot);
               GXutil.writeLogRaw("Current: ",T001A2_A5693HisAcCot[0]);
            }
            if ( GXutil.strcmp(Z5694HisAdEAcCo, T001A2_A5694HisAdEAcCo[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisAdEAcCo");
               GXutil.writeLogRaw("Old: ",Z5694HisAdEAcCo);
               GXutil.writeLogRaw("Current: ",T001A2_A5694HisAdEAcCo[0]);
            }
            if ( GXutil.strcmp(Z5695HisAdEAcCt, T001A2_A5695HisAdEAcCt[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisAdEAcCt");
               GXutil.writeLogRaw("Old: ",Z5695HisAdEAcCt);
               GXutil.writeLogRaw("Current: ",T001A2_A5695HisAdEAcCt[0]);
            }
            if ( GXutil.strcmp(Z6668HisAdeSN, T001A2_A6668HisAdeSN[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisAdeSN");
               GXutil.writeLogRaw("Old: ",Z6668HisAdeSN);
               GXutil.writeLogRaw("Current: ",T001A2_A6668HisAdeSN[0]);
            }
            if ( GXutil.strcmp(Z6669HisAdeObs, T001A2_A6669HisAdeObs[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisAdeObs");
               GXutil.writeLogRaw("Old: ",Z6669HisAdeObs);
               GXutil.writeLogRaw("Current: ",T001A2_A6669HisAdeObs[0]);
            }
            if ( GXutil.strcmp(Z8414HisUsu, T001A2_A8414HisUsu[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisUsu");
               GXutil.writeLogRaw("Old: ",Z8414HisUsu);
               GXutil.writeLogRaw("Current: ",T001A2_A8414HisUsu[0]);
            }
            if ( !( GXutil.dateCompare(Z8567HisHorReo, T001A2_A8567HisHorReo[0]) ) )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisHorReo");
               GXutil.writeLogRaw("Old: ",Z8567HisHorReo);
               GXutil.writeLogRaw("Current: ",T001A2_A8567HisHorReo[0]);
            }
            if ( GXutil.strcmp(Z8889HisNomCli, T001A2_A8889HisNomCli[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisNomCli");
               GXutil.writeLogRaw("Old: ",Z8889HisNomCli);
               GXutil.writeLogRaw("Current: ",T001A2_A8889HisNomCli[0]);
            }
            if ( Z8890HisNumCli != T001A2_A8890HisNumCli[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisNumCli");
               GXutil.writeLogRaw("Old: ",Z8890HisNumCli);
               GXutil.writeLogRaw("Current: ",T001A2_A8890HisNumCli[0]);
            }
            if ( Z12949HisOpecod != T001A2_A12949HisOpecod[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisOpecod");
               GXutil.writeLogRaw("Old: ",Z12949HisOpecod);
               GXutil.writeLogRaw("Current: ",T001A2_A12949HisOpecod[0]);
            }
            if ( Z12950HisOpeTur != T001A2_A12950HisOpeTur[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisOpeTur");
               GXutil.writeLogRaw("Old: ",Z12950HisOpeTur);
               GXutil.writeLogRaw("Current: ",T001A2_A12950HisOpeTur[0]);
            }
            if ( DecimalUtil.compareTo(Z13015HisMtsCarg, T001A2_A13015HisMtsCarg[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisMtsCarg");
               GXutil.writeLogRaw("Old: ",Z13015HisMtsCarg);
               GXutil.writeLogRaw("Current: ",T001A2_A13015HisMtsCarg[0]);
            }
            if ( DecimalUtil.compareTo(Z13016HisMtsImp, T001A2_A13016HisMtsImp[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisMtsImp");
               GXutil.writeLogRaw("Old: ",Z13016HisMtsImp);
               GXutil.writeLogRaw("Current: ",T001A2_A13016HisMtsImp[0]);
            }
            if ( GXutil.strcmp(Z13698HisreoLote, T001A2_A13698HisreoLote[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisreoLote");
               GXutil.writeLogRaw("Old: ",Z13698HisreoLote);
               GXutil.writeLogRaw("Current: ",T001A2_A13698HisreoLote[0]);
            }
            if ( Z252CliCod != T001A2_A252CliCod[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T001A2_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z602MaqCod, T001A2_A602MaqCod[0]) != 0 )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"MaqCod");
               GXutil.writeLogRaw("Old: ",Z602MaqCod);
               GXutil.writeLogRaw("Current: ",T001A2_A602MaqCod[0]);
            }
            if ( Z571HisTipArt != T001A2_A571HisTipArt[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisTipArt");
               GXutil.writeLogRaw("Old: ",Z571HisTipArt);
               GXutil.writeLogRaw("Current: ",T001A2_A571HisTipArt[0]);
            }
            if ( Z572HisTipCol != T001A2_A572HisTipCol[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"HisTipCol");
               GXutil.writeLogRaw("Old: ",Z572HisTipCol);
               GXutil.writeLogRaw("Current: ",T001A2_A572HisTipCol[0]);
            }
            if ( Z5085CodCausa != T001A2_A5085CodCausa[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"CodCausa");
               GXutil.writeLogRaw("Old: ",Z5085CodCausa);
               GXutil.writeLogRaw("Current: ",T001A2_A5085CodCausa[0]);
            }
            if ( Z5196TipCorCod != T001A2_A5196TipCorCod[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"TipCorCod");
               GXutil.writeLogRaw("Old: ",Z5196TipCorCod);
               GXutil.writeLogRaw("Current: ",T001A2_A5196TipCorCod[0]);
            }
            if ( Z7000Rps_Cod != T001A2_A7000Rps_Cod[0] )
            {
               GXutil.writeLogln("thisreo:[seudo value changed for attri]"+"Rps_Cod");
               GXutil.writeLogRaw("Old: ",Z7000Rps_Cod);
               GXutil.writeLogRaw("Current: ",T001A2_A7000Rps_Cod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A60( )
   {
      beforeValidate1A60( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A60( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A60( 0) ;
         checkOptimisticConcurrency1A60( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A60( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A60( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001A24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2298HisReoPza), A2298HisReoPza, Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc, Boolean.valueOf(n5662HisAcCo), A5662HisAcCo, Boolean.valueOf(n5693HisAcCot), A5693HisAcCot, Boolean.valueOf(n5694HisAdEAcCo), A5694HisAdEAcCo, Boolean.valueOf(n5695HisAdEAcCt), A5695HisAdEAcCt, Boolean.valueOf(n6668HisAdeSN), A6668HisAdeSN, Boolean.valueOf(n6669HisAdeObs), A6669HisAdeObs, Boolean.valueOf(n8414HisUsu), A8414HisUsu, Boolean.valueOf(n8567HisHorReo), A8567HisHorReo, Boolean.valueOf(n8889HisNomCli), A8889HisNomCli, Boolean.valueOf(n8890HisNumCli), Integer.valueOf(A8890HisNumCli), Boolean.valueOf(n12949HisOpecod), Integer.valueOf(A12949HisOpecod), Boolean.valueOf(n12950HisOpeTur), Byte.valueOf(A12950HisOpeTur), Boolean.valueOf(n13015HisMtsCarg), A13015HisMtsCarg, Boolean.valueOf(n13016HisMtsImp), A13016HisMtsImp, Boolean.valueOf(n13698HisreoLote), A13698HisreoLote, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Short.valueOf(A833TipDefCod), Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n5196TipCorCod), Short.valueOf(A5196TipCorCod), Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
                  if ( (pr_default.getStatus(22) == 1) )
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
                        resetCaption1A0( ) ;
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
            load1A60( ) ;
         }
         endLevel1A60( ) ;
      }
      closeExtendedTableCursors1A60( ) ;
   }

   public void update1A60( )
   {
      beforeValidate1A60( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A60( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A60( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A60( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1A60( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001A25 */
                  pr_default.execute(23, new Object[] {Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2298HisReoPza), A2298HisReoPza, Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc, Boolean.valueOf(n5662HisAcCo), A5662HisAcCo, Boolean.valueOf(n5693HisAcCot), A5693HisAcCot, Boolean.valueOf(n5694HisAdEAcCo), A5694HisAdEAcCo, Boolean.valueOf(n5695HisAdEAcCt), A5695HisAdEAcCt, Boolean.valueOf(n6668HisAdeSN), A6668HisAdeSN, Boolean.valueOf(n6669HisAdeObs), A6669HisAdeObs, Boolean.valueOf(n8414HisUsu), A8414HisUsu, Boolean.valueOf(n8567HisHorReo), A8567HisHorReo, Boolean.valueOf(n8889HisNomCli), A8889HisNomCli, Boolean.valueOf(n8890HisNumCli), Integer.valueOf(A8890HisNumCli), Boolean.valueOf(n12949HisOpecod), Integer.valueOf(A12949HisOpecod), Boolean.valueOf(n12950HisOpeTur), Byte.valueOf(A12950HisOpeTur), Boolean.valueOf(n13015HisMtsCarg), A13015HisMtsCarg, Boolean.valueOf(n13016HisMtsImp), A13016HisMtsImp, Boolean.valueOf(n13698HisreoLote), A13698HisreoLote, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n5196TipCorCod), Short.valueOf(A5196TipCorCod), Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod), A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1A60( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1A0( ) ;
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
         endLevel1A60( ) ;
      }
      closeExtendedTableCursors1A60( ) ;
   }

   public void deferredUpdate1A60( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1A60( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A60( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A60( ) ;
         afterConfirm1A60( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A60( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001A26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound60 == 0 )
                     {
                        initAll1A60( ) ;
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
                     resetCaption1A0( ) ;
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
      sMode60 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1A60( ) ;
      Gx_mode = sMode60 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1A60( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13697HisReoHDR", A13697HisReoHDR);
         /* Using cursor T001A27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
         A834TipDefDsc = T001A27_A834TipDefDsc[0] ;
         n834TipDefDsc = T001A27_n834TipDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
         pr_default.close(25);
         /* Using cursor T001A28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt)});
         A13843HisTipArtD = T001A28_A13843HisTipArtD[0] ;
         n13843HisTipArtD = T001A28_n13843HisTipArtD[0] ;
         pr_default.close(26);
         /* Using cursor T001A29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T001A29_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(27);
         /* Using cursor T001A30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol)});
         A13844HisTipColD = T001A30_A13844HisTipColD[0] ;
         n13844HisTipColD = T001A30_n13844HisTipColD[0] ;
         pr_default.close(28);
         /* Using cursor T001A31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         A606MaqDsc = T001A31_A606MaqDsc[0] ;
         n606MaqDsc = T001A31_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         pr_default.close(29);
         /* Using cursor T001A32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
         A5086DscCausa = T001A32_A5086DscCausa[0] ;
         n5086DscCausa = T001A32_n5086DscCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
         A13699CostCausa = T001A32_A13699CostCausa[0] ;
         n13699CostCausa = T001A32_n13699CostCausa[0] ;
         pr_default.close(30);
         A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13700HisreoValo", GXutil.ltrimstr( A13700HisreoValo, 11, 3));
         /* Using cursor T001A33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n5196TipCorCod), Short.valueOf(A5196TipCorCod)});
         A5197TipCorDsc = T001A33_A5197TipCorDsc[0] ;
         n5197TipCorDsc = T001A33_n5197TipCorDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5197TipCorDsc", A5197TipCorDsc);
         pr_default.close(31);
         /* Using cursor T001A34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
         A7001Rps_Dsc = T001A34_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = T001A34_n7001Rps_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
         pr_default.close(32);
         if ( A13015HisMtsCarg.doubleValue() > 0 )
         {
            A13017HisPreCarg = GXutil.roundDecimal( A13016HisMtsImp.divide(A13015HisMtsCarg, 18, java.math.RoundingMode.DOWN), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
         }
         else
         {
            if ( true )
            {
               A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
            }
            else
            {
               A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
            }
         }
      }
   }

   public void endLevel1A60( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1A60( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thisreo");
         if ( AnyError == 0 )
         {
            confirmValues1A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thisreo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1A60( )
   {
      /* Using cursor T001A35 */
      pr_default.execute(33);
      RcdFound60 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A396EmprCod = T001A35_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A539HisBarCod = T001A35_A539HisBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
         A545HisCodReo = T001A35_A545HisCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
         A544HisCodPar = T001A35_A544HisCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
         A833TipDefCod = T001A35_A833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1A60( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound60 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A396EmprCod = T001A35_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A539HisBarCod = T001A35_A539HisBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
         A545HisCodReo = T001A35_A545HisCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
         A544HisCodPar = T001A35_A544HisCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
         A833TipDefCod = T001A35_A833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      }
   }

   public void scanEnd1A60( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1A60( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A60( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A60( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A60( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A60( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A60( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A60( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtHisBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarCod_Enabled), 5, 0), true);
      edtHisCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisCodReo_Enabled), 5, 0), true);
      edtHisCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisCodPar_Enabled), 5, 0), true);
      edtTipDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), true);
      edtHisTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisTipArt_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtHisBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarSer_Enabled), 5, 0), true);
      edtHisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisColNom_Enabled), 5, 0), true);
      edtHisColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisColNum_Enabled), 5, 0), true);
      edtHisTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisTipCol_Enabled), 5, 0), true);
      edtHisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisNumPie_Enabled), 5, 0), true);
      edtHisBarKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarKgm_Enabled), 5, 0), true);
      edtHisBarMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarMtr_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtHisReoFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisReoFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoFec_Enabled), 5, 0), true);
      edtHisKgmOri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisKgmOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisKgmOri_Enabled), 5, 0), true);
      edtHisMtrOri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisMtrOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisMtrOri_Enabled), 5, 0), true);
      edtHisOrdReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisOrdReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisOrdReo_Enabled), 5, 0), true);
      edtHisEstReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisEstReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisEstReo_Enabled), 5, 0), true);
      edtHisReoTn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisReoTn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoTn_Enabled), 5, 0), true);
      edtHisReoPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisReoPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoPza_Enabled), 5, 0), true);
      edtHisReoDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisReoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoDsc_Enabled), 5, 0), true);
      edtCodCausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCausa_Enabled), 5, 0), true);
      edtDscCausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDscCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscCausa_Enabled), 5, 0), true);
      edtTipDefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtTipCorCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipCorCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipCorCod_Enabled), 5, 0), true);
      edtTipCorDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipCorDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipCorDsc_Enabled), 5, 0), true);
      edtHisAcCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAcCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAcCo_Enabled), 5, 0), true);
      edtHisAcCot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAcCot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAcCot_Enabled), 5, 0), true);
      edtHisAdEAcCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAdEAcCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAdEAcCo_Enabled), 5, 0), true);
      edtHisAdEAcCt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAdEAcCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAdEAcCt_Enabled), 5, 0), true);
      chkHisAdeSN.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkHisAdeSN.getInternalname(), "Enabled", GXutil.ltrimstr( chkHisAdeSN.getEnabled(), 5, 0), true);
      edtHisAdeObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAdeObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAdeObs_Enabled), 5, 0), true);
      edtRps_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRps_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Cod_Enabled), 5, 0), true);
      edtRps_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRps_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Dsc_Enabled), 5, 0), true);
      edtHisUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisUsu_Enabled), 5, 0), true);
      edtHisHorReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisHorReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisHorReo_Enabled), 5, 0), true);
      edtHisNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisNomCli_Enabled), 5, 0), true);
      edtHisNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisNumCli_Enabled), 5, 0), true);
      edtHisOpecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisOpecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisOpecod_Enabled), 5, 0), true);
      edtHisOpeTur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisOpeTur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisOpeTur_Enabled), 5, 0), true);
      edtHisMtsCarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisMtsCarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisMtsCarg_Enabled), 5, 0), true);
      edtHisMtsImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisMtsImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisMtsImp_Enabled), 5, 0), true);
      edtHisPreCarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisPreCarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisPreCarg_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1A60( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1A0( )
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thisreo", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"THISREO");
      forbiddenHiddens.add("HisreoLote", GXutil.rtrim( localUtil.format( A13698HisreoLote, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("thisreo:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z539HisBarCod", GXutil.ltrim( localUtil.ntoc( Z539HisBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z545HisCodReo", GXutil.ltrim( localUtil.ntoc( Z545HisCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z544HisCodPar", GXutil.rtrim( Z544HisCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z833TipDefCod", GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z542HisBarSer", GXutil.rtrim( Z542HisBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z546HisColNom", GXutil.rtrim( Z546HisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z547HisColNum", GXutil.ltrim( localUtil.ntoc( Z547HisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z553HisNumPie", GXutil.ltrim( localUtil.ntoc( Z553HisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z540HisBarKgm", GXutil.ltrim( localUtil.ntoc( Z540HisBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z541HisBarMtr", GXutil.ltrim( localUtil.ntoc( Z541HisBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z569HisReoFec", localUtil.dtoc( Z569HisReoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z549HisKgmOri", GXutil.ltrim( localUtil.ntoc( Z549HisKgmOri, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z552HisMtrOri", GXutil.ltrim( localUtil.ntoc( Z552HisMtrOri, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z554HisOrdReo", GXutil.ltrim( localUtil.ntoc( Z554HisOrdReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z548HisEstReo", GXutil.ltrim( localUtil.ntoc( Z548HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2297HisReoTn", GXutil.ltrim( localUtil.ntoc( Z2297HisReoTn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2298HisReoPza", GXutil.rtrim( Z2298HisReoPza));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2299HisReoDsc", GXutil.rtrim( Z2299HisReoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5662HisAcCo", Z5662HisAcCo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5693HisAcCot", Z5693HisAcCot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5694HisAdEAcCo", Z5694HisAdEAcCo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5695HisAdEAcCt", Z5695HisAdEAcCt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z6668HisAdeSN", GXutil.rtrim( Z6668HisAdeSN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6669HisAdeObs", Z6669HisAdeObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8414HisUsu", GXutil.rtrim( Z8414HisUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8567HisHorReo", localUtil.ttoc( Z8567HisHorReo, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8889HisNomCli", GXutil.rtrim( Z8889HisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8890HisNumCli", GXutil.ltrim( localUtil.ntoc( Z8890HisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12949HisOpecod", GXutil.ltrim( localUtil.ntoc( Z12949HisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12950HisOpeTur", GXutil.ltrim( localUtil.ntoc( Z12950HisOpeTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13015HisMtsCarg", GXutil.ltrim( localUtil.ntoc( Z13015HisMtsCarg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13016HisMtsImp", GXutil.ltrim( localUtil.ntoc( Z13016HisMtsImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13698HisreoLote", GXutil.rtrim( Z13698HisreoLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z571HisTipArt", GXutil.ltrim( localUtil.ntoc( Z571HisTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z572HisTipCol", GXutil.ltrim( localUtil.ntoc( Z572HisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5085CodCausa", GXutil.ltrim( localUtil.ntoc( Z5085CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5196TipCorCod", GXutil.ltrim( localUtil.ntoc( Z5196TipCorCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7000Rps_Cod", GXutil.ltrim( localUtil.ntoc( Z7000Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "HISREOHDR", GXutil.rtrim( A13697HisReoHDR));
      app.GxWebStd.gx_hidden_field( httpContext, "COSTCAUSA", GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISREOVALO", GXutil.ltrim( localUtil.ntoc( A13700HisreoValo, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISREOLOTE", GXutil.rtrim( A13698HisreoLote));
      app.GxWebStd.gx_hidden_field( httpContext, "HISTIPARTD", GXutil.rtrim( A13843HisTipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "HISTIPCOLD", GXutil.rtrim( A13844HisTipColD));
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
      return formatLink("app.thisreo", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THISREO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO REOPERADOS", "") ;
   }

   public void initializeNonKey1A60( )
   {
      A13017HisPreCarg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
      A13700HisreoValo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13700HisreoValo", GXutil.ltrimstr( A13700HisreoValo, 11, 3));
      A13697HisReoHDR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13697HisReoHDR", A13697HisReoHDR);
      A571HisTipArt = (short)(0) ;
      n571HisTipArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A571HisTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A571HisTipArt), 4, 0));
      A13843HisTipArtD = "" ;
      n13843HisTipArtD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13843HisTipArtD", A13843HisTipArtD);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A542HisBarSer = "" ;
      n542HisBarSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A542HisBarSer", A542HisBarSer);
      A546HisColNom = "" ;
      n546HisColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A546HisColNom", A546HisColNom);
      A547HisColNum = 0 ;
      n547HisColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A547HisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A547HisColNum), 6, 0));
      A572HisTipCol = (byte)(0) ;
      n572HisTipCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A572HisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A572HisTipCol), 2, 0));
      A13844HisTipColD = "" ;
      n13844HisTipColD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13844HisTipColD", A13844HisTipColD);
      A553HisNumPie = (short)(0) ;
      n553HisNumPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A553HisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A553HisNumPie), 4, 0));
      A540HisBarKgm = DecimalUtil.ZERO ;
      n540HisBarKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A540HisBarKgm", GXutil.ltrimstr( A540HisBarKgm, 9, 2));
      A541HisBarMtr = DecimalUtil.ZERO ;
      n541HisBarMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A541HisBarMtr", GXutil.ltrimstr( A541HisBarMtr, 9, 2));
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A569HisReoFec = GXutil.nullDate() ;
      n569HisReoFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A569HisReoFec", localUtil.format(A569HisReoFec, "99/99/99"));
      A549HisKgmOri = DecimalUtil.ZERO ;
      n549HisKgmOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A549HisKgmOri", GXutil.ltrimstr( A549HisKgmOri, 9, 2));
      A552HisMtrOri = DecimalUtil.ZERO ;
      n552HisMtrOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A552HisMtrOri", GXutil.ltrimstr( A552HisMtrOri, 9, 2));
      A554HisOrdReo = (byte)(0) ;
      n554HisOrdReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A554HisOrdReo", GXutil.str( A554HisOrdReo, 1, 0));
      A548HisEstReo = (byte)(0) ;
      n548HisEstReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A548HisEstReo", GXutil.str( A548HisEstReo, 1, 0));
      A2297HisReoTn = 0 ;
      n2297HisReoTn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2297HisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2297HisReoTn), 6, 0));
      A2298HisReoPza = "" ;
      n2298HisReoPza = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2298HisReoPza", A2298HisReoPza);
      A2299HisReoDsc = "" ;
      n2299HisReoDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2299HisReoDsc", A2299HisReoDsc);
      A5085CodCausa = (short)(0) ;
      n5085CodCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
      A5086DscCausa = "" ;
      n5086DscCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
      A834TipDefDsc = "" ;
      n834TipDefDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A5196TipCorCod = (short)(0) ;
      n5196TipCorCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5196TipCorCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5196TipCorCod), 4, 0));
      A5197TipCorDsc = "" ;
      n5197TipCorDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5197TipCorDsc", A5197TipCorDsc);
      A5662HisAcCo = "" ;
      n5662HisAcCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5662HisAcCo", A5662HisAcCo);
      A5693HisAcCot = "" ;
      n5693HisAcCot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5693HisAcCot", A5693HisAcCot);
      A5694HisAdEAcCo = "" ;
      n5694HisAdEAcCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5694HisAdEAcCo", A5694HisAdEAcCo);
      A5695HisAdEAcCt = "" ;
      n5695HisAdEAcCt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5695HisAdEAcCt", A5695HisAdEAcCt);
      A6668HisAdeSN = "" ;
      n6668HisAdeSN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6668HisAdeSN", A6668HisAdeSN);
      A6669HisAdeObs = "" ;
      n6669HisAdeObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6669HisAdeObs", A6669HisAdeObs);
      A7000Rps_Cod = (short)(0) ;
      n7000Rps_Cod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
      A7001Rps_Dsc = "" ;
      n7001Rps_Dsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
      A8414HisUsu = "" ;
      n8414HisUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8414HisUsu", A8414HisUsu);
      A8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
      n8567HisHorReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8567HisHorReo", localUtil.ttoc( A8567HisHorReo, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8889HisNomCli = "" ;
      n8889HisNomCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8889HisNomCli", A8889HisNomCli);
      A8890HisNumCli = 0 ;
      n8890HisNumCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8890HisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8890HisNumCli), 6, 0));
      A12949HisOpecod = 0 ;
      n12949HisOpecod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12949HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12949HisOpecod), 6, 0));
      A12950HisOpeTur = (byte)(0) ;
      n12950HisOpeTur = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12950HisOpeTur", GXutil.str( A12950HisOpeTur, 1, 0));
      A13015HisMtsCarg = DecimalUtil.ZERO ;
      n13015HisMtsCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13015HisMtsCarg", GXutil.ltrimstr( A13015HisMtsCarg, 9, 2));
      A13016HisMtsImp = DecimalUtil.ZERO ;
      n13016HisMtsImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13016HisMtsImp", GXutil.ltrimstr( A13016HisMtsImp, 14, 2));
      A13698HisreoLote = "" ;
      n13698HisreoLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13698HisreoLote", A13698HisreoLote);
      A13699CostCausa = DecimalUtil.ZERO ;
      n13699CostCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13699CostCausa", GXutil.ltrimstr( A13699CostCausa, 11, 3));
      Z542HisBarSer = "" ;
      Z546HisColNom = "" ;
      Z547HisColNum = 0 ;
      Z553HisNumPie = (short)(0) ;
      Z540HisBarKgm = DecimalUtil.ZERO ;
      Z541HisBarMtr = DecimalUtil.ZERO ;
      Z569HisReoFec = GXutil.nullDate() ;
      Z549HisKgmOri = DecimalUtil.ZERO ;
      Z552HisMtrOri = DecimalUtil.ZERO ;
      Z554HisOrdReo = (byte)(0) ;
      Z548HisEstReo = (byte)(0) ;
      Z2297HisReoTn = 0 ;
      Z2298HisReoPza = "" ;
      Z2299HisReoDsc = "" ;
      Z5662HisAcCo = "" ;
      Z5693HisAcCot = "" ;
      Z5694HisAdEAcCo = "" ;
      Z5695HisAdEAcCt = "" ;
      Z6668HisAdeSN = "" ;
      Z6669HisAdeObs = "" ;
      Z8414HisUsu = "" ;
      Z8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
      Z8889HisNomCli = "" ;
      Z8890HisNumCli = 0 ;
      Z12949HisOpecod = 0 ;
      Z12950HisOpeTur = (byte)(0) ;
      Z13015HisMtsCarg = DecimalUtil.ZERO ;
      Z13016HisMtsImp = DecimalUtil.ZERO ;
      Z13698HisreoLote = "" ;
      Z252CliCod = 0 ;
      Z602MaqCod = "" ;
      Z571HisTipArt = (short)(0) ;
      Z572HisTipCol = (byte)(0) ;
      Z5085CodCausa = (short)(0) ;
      Z5196TipCorCod = (short)(0) ;
      Z7000Rps_Cod = (short)(0) ;
   }

   public void initAll1A60( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A539HisBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
      A545HisCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
      A544HisCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
      A833TipDefCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      initializeNonKey1A60( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016231856", true, true);
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
      httpContext.AddJavascriptSource("thisreo.js", "?202661016231856", false, true);
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
      edtHisBarCod_Internalname = "HISBARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtHisCodReo_Internalname = "HISCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHisCodPar_Internalname = "HISCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTipDefCod_Internalname = "TIPDEFCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtHisTipArt_Internalname = "HISTIPART" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtHisBarSer_Internalname = "HISBARSER" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtHisColNom_Internalname = "HISCOLNOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtHisColNum_Internalname = "HISCOLNUM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtHisTipCol_Internalname = "HISTIPCOL" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtHisNumPie_Internalname = "HISNUMPIE" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtHisBarKgm_Internalname = "HISBARKGM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtHisBarMtr_Internalname = "HISBARMTR" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtHisReoFec_Internalname = "HISREOFEC" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtHisKgmOri_Internalname = "HISKGMORI" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtHisMtrOri_Internalname = "HISMTRORI" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtHisOrdReo_Internalname = "HISORDREO" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtHisEstReo_Internalname = "HISESTREO" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtHisReoTn_Internalname = "HISREOTN" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtHisReoPza_Internalname = "HISREOPZA" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtHisReoDsc_Internalname = "HISREODSC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtCodCausa_Internalname = "CODCAUSA" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtDscCausa_Internalname = "DSCCAUSA" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtTipDefDsc_Internalname = "TIPDEFDSC" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtTipCorCod_Internalname = "TIPCORCOD" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtTipCorDsc_Internalname = "TIPCORDSC" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtHisAcCo_Internalname = "HISACCO" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtHisAcCot_Internalname = "HISACCOT" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtHisAdEAcCo_Internalname = "HISADEACCO" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtHisAdEAcCt_Internalname = "HISADEACCT" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      chkHisAdeSN.setInternalname( "HISADESN" );
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtHisAdeObs_Internalname = "HISADEOBS" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtRps_Cod_Internalname = "RPS_COD" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtRps_Dsc_Internalname = "RPS_DSC" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtHisUsu_Internalname = "HISUSU" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtHisHorReo_Internalname = "HISHORREO" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtHisNomCli_Internalname = "HISNOMCLI" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtHisNumCli_Internalname = "HISNUMCLI" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtHisOpecod_Internalname = "HISOPECOD" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtHisOpeTur_Internalname = "HISOPETUR" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtHisMtsCarg_Internalname = "HISMTSCARG" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtHisMtsImp_Internalname = "HISMTSIMP" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtHisPreCarg_Internalname = "HISPRECARG" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO REOPERADOS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHisPreCarg_Jsonclick = "" ;
      edtHisPreCarg_Backcolor = (int)(0xFFFFFF) ;
      edtHisPreCarg_Enabled = 0 ;
      edtHisMtsImp_Jsonclick = "" ;
      edtHisMtsImp_Backcolor = (int)(0xFFFFFF) ;
      edtHisMtsImp_Enabled = 1 ;
      edtHisMtsCarg_Jsonclick = "" ;
      edtHisMtsCarg_Backcolor = (int)(0xFFFFFF) ;
      edtHisMtsCarg_Enabled = 1 ;
      edtHisOpeTur_Jsonclick = "" ;
      edtHisOpeTur_Backcolor = (int)(0xFFFFFF) ;
      edtHisOpeTur_Enabled = 1 ;
      edtHisOpecod_Jsonclick = "" ;
      edtHisOpecod_Backcolor = (int)(0xFFFFFF) ;
      edtHisOpecod_Enabled = 1 ;
      edtHisNumCli_Jsonclick = "" ;
      edtHisNumCli_Backcolor = (int)(0xFFFFFF) ;
      edtHisNumCli_Enabled = 1 ;
      edtHisNomCli_Jsonclick = "" ;
      edtHisNomCli_Backcolor = (int)(0xFFFFFF) ;
      edtHisNomCli_Enabled = 1 ;
      edtHisHorReo_Jsonclick = "" ;
      edtHisHorReo_Backcolor = (int)(0xFFFFFF) ;
      edtHisHorReo_Enabled = 1 ;
      edtHisUsu_Jsonclick = "" ;
      edtHisUsu_Backcolor = (int)(0xFFFFFF) ;
      edtHisUsu_Enabled = 1 ;
      edtRps_Dsc_Jsonclick = "" ;
      edtRps_Dsc_Backcolor = (int)(0xFFFFFF) ;
      edtRps_Dsc_Enabled = 0 ;
      edtRps_Cod_Jsonclick = "" ;
      edtRps_Cod_Backcolor = (int)(0xFFFFFF) ;
      edtRps_Cod_Enabled = 1 ;
      edtHisAdeObs_Backcolor = (int)(0xFFFFFF) ;
      edtHisAdeObs_Enabled = 1 ;
      chkHisAdeSN.setIBackground( (int)(0xFFFFFF) );
      chkHisAdeSN.setEnabled( 1 );
      edtHisAdEAcCt_Backcolor = (int)(0xFFFFFF) ;
      edtHisAdEAcCt_Enabled = 1 ;
      edtHisAdEAcCo_Backcolor = (int)(0xFFFFFF) ;
      edtHisAdEAcCo_Enabled = 1 ;
      edtHisAcCot_Backcolor = (int)(0xFFFFFF) ;
      edtHisAcCot_Enabled = 1 ;
      edtHisAcCo_Backcolor = (int)(0xFFFFFF) ;
      edtHisAcCo_Enabled = 1 ;
      edtTipCorDsc_Jsonclick = "" ;
      edtTipCorDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipCorDsc_Enabled = 0 ;
      edtTipCorCod_Jsonclick = "" ;
      edtTipCorCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipCorCod_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDsc_Enabled = 0 ;
      edtTipDefDsc_Jsonclick = "" ;
      edtTipDefDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipDefDsc_Enabled = 0 ;
      edtDscCausa_Jsonclick = "" ;
      edtDscCausa_Backcolor = (int)(0xFFFFFF) ;
      edtDscCausa_Enabled = 0 ;
      edtCodCausa_Jsonclick = "" ;
      edtCodCausa_Backcolor = (int)(0xFFFFFF) ;
      edtCodCausa_Enabled = 1 ;
      edtHisReoDsc_Jsonclick = "" ;
      edtHisReoDsc_Backcolor = (int)(0xFFFFFF) ;
      edtHisReoDsc_Enabled = 1 ;
      edtHisReoPza_Jsonclick = "" ;
      edtHisReoPza_Backcolor = (int)(0xFFFFFF) ;
      edtHisReoPza_Enabled = 1 ;
      edtHisReoTn_Jsonclick = "" ;
      edtHisReoTn_Backcolor = (int)(0xFFFFFF) ;
      edtHisReoTn_Enabled = 1 ;
      edtHisEstReo_Jsonclick = "" ;
      edtHisEstReo_Backcolor = (int)(0xFFFFFF) ;
      edtHisEstReo_Enabled = 1 ;
      edtHisOrdReo_Jsonclick = "" ;
      edtHisOrdReo_Backcolor = (int)(0xFFFFFF) ;
      edtHisOrdReo_Enabled = 1 ;
      edtHisMtrOri_Jsonclick = "" ;
      edtHisMtrOri_Backcolor = (int)(0xFFFFFF) ;
      edtHisMtrOri_Enabled = 1 ;
      edtHisKgmOri_Jsonclick = "" ;
      edtHisKgmOri_Backcolor = (int)(0xFFFFFF) ;
      edtHisKgmOri_Enabled = 1 ;
      edtHisReoFec_Jsonclick = "" ;
      edtHisReoFec_Backcolor = (int)(0xFFFFFF) ;
      edtHisReoFec_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
      edtHisBarMtr_Jsonclick = "" ;
      edtHisBarMtr_Backcolor = (int)(0xFFFFFF) ;
      edtHisBarMtr_Enabled = 1 ;
      edtHisBarKgm_Jsonclick = "" ;
      edtHisBarKgm_Backcolor = (int)(0xFFFFFF) ;
      edtHisBarKgm_Enabled = 1 ;
      edtHisNumPie_Jsonclick = "" ;
      edtHisNumPie_Backcolor = (int)(0xFFFFFF) ;
      edtHisNumPie_Enabled = 1 ;
      edtHisTipCol_Jsonclick = "" ;
      edtHisTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtHisTipCol_Enabled = 1 ;
      edtHisColNum_Jsonclick = "" ;
      edtHisColNum_Backcolor = (int)(0xFFFFFF) ;
      edtHisColNum_Enabled = 1 ;
      edtHisColNom_Jsonclick = "" ;
      edtHisColNom_Backcolor = (int)(0xFFFFFF) ;
      edtHisColNom_Enabled = 1 ;
      edtHisBarSer_Jsonclick = "" ;
      edtHisBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtHisBarSer_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtHisTipArt_Jsonclick = "" ;
      edtHisTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtHisTipArt_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTipDefCod_Jsonclick = "" ;
      edtTipDefCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipDefCod_Enabled = 1 ;
      edtHisCodPar_Jsonclick = "" ;
      edtHisCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtHisCodPar_Enabled = 1 ;
      edtHisCodReo_Jsonclick = "" ;
      edtHisCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtHisCodReo_Enabled = 1 ;
      edtHisBarCod_Jsonclick = "" ;
      edtHisBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtHisBarCod_Enabled = 1 ;
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
      chkHisAdeSN.setName( "HISADESN" );
      chkHisAdeSN.setWebtags( "" );
      chkHisAdeSN.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkHisAdeSN.getInternalname(), "TitleCaption", chkHisAdeSN.getCaption(), true);
      chkHisAdeSN.setCheckedValue( "N" );
      A6668HisAdeSN = ((GXutil.strcmp(GXutil.rtrim( A6668HisAdeSN), "S")==0) ? "S" : "N") ;
      n6668HisAdeSN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6668HisAdeSN", A6668HisAdeSN);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T001A27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T001A27_A834TipDefDsc[0] ;
      n834TipDefDsc = T001A27_n834TipDefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      pr_default.close(25);
      GX_FocusControl = edtHisTipArt_Internalname ;
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

   public void valid_Tipdefcod( )
   {
      n13698HisreoLote = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T001A27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A834TipDefDsc = T001A27_A834TipDefDsc[0] ;
      n834TipDefDsc = T001A27_n834TipDefDsc[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      A6668HisAdeSN = ((GXutil.strcmp(GXutil.rtrim( A6668HisAdeSN), "S")==0) ? "S" : "N") ;
      n6668HisAdeSN = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A571HisTipArt", GXutil.ltrim( localUtil.ntoc( A571HisTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A542HisBarSer", GXutil.rtrim( A542HisBarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A546HisColNom", GXutil.rtrim( A546HisColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A547HisColNum", GXutil.ltrim( localUtil.ntoc( A547HisColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A572HisTipCol", GXutil.ltrim( localUtil.ntoc( A572HisTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A553HisNumPie", GXutil.ltrim( localUtil.ntoc( A553HisNumPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A540HisBarKgm", GXutil.ltrim( localUtil.ntoc( A540HisBarKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A541HisBarMtr", GXutil.ltrim( localUtil.ntoc( A541HisBarMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A569HisReoFec", localUtil.format(A569HisReoFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A549HisKgmOri", GXutil.ltrim( localUtil.ntoc( A549HisKgmOri, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A552HisMtrOri", GXutil.ltrim( localUtil.ntoc( A552HisMtrOri, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A554HisOrdReo", GXutil.ltrim( localUtil.ntoc( A554HisOrdReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A548HisEstReo", GXutil.ltrim( localUtil.ntoc( A548HisEstReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2297HisReoTn", GXutil.ltrim( localUtil.ntoc( A2297HisReoTn, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2298HisReoPza", GXutil.rtrim( A2298HisReoPza));
      httpContext.ajax_rsp_assign_attri("", false, "A2299HisReoDsc", GXutil.rtrim( A2299HisReoDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrim( localUtil.ntoc( A5085CodCausa, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5196TipCorCod", GXutil.ltrim( localUtil.ntoc( A5196TipCorCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5662HisAcCo", A5662HisAcCo);
      httpContext.ajax_rsp_assign_attri("", false, "A5693HisAcCot", A5693HisAcCot);
      httpContext.ajax_rsp_assign_attri("", false, "A5694HisAdEAcCo", A5694HisAdEAcCo);
      httpContext.ajax_rsp_assign_attri("", false, "A5695HisAdEAcCt", A5695HisAdEAcCt);
      httpContext.ajax_rsp_assign_attri("", false, "A6668HisAdeSN", GXutil.rtrim( A6668HisAdeSN));
      httpContext.ajax_rsp_assign_attri("", false, "A6669HisAdeObs", A6669HisAdeObs);
      httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrim( localUtil.ntoc( A7000Rps_Cod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8414HisUsu", GXutil.rtrim( A8414HisUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A8567HisHorReo", localUtil.ttoc( A8567HisHorReo, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A8889HisNomCli", GXutil.rtrim( A8889HisNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A8890HisNumCli", GXutil.ltrim( localUtil.ntoc( A8890HisNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12949HisOpecod", GXutil.ltrim( localUtil.ntoc( A12949HisOpecod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12950HisOpeTur", GXutil.ltrim( localUtil.ntoc( A12950HisOpeTur, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13015HisMtsCarg", GXutil.ltrim( localUtil.ntoc( A13015HisMtsCarg, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13016HisMtsImp", GXutil.ltrim( localUtil.ntoc( A13016HisMtsImp, (byte)(14), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13698HisreoLote", GXutil.rtrim( A13698HisreoLote));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13843HisTipArtD", GXutil.rtrim( A13843HisTipArtD));
      httpContext.ajax_rsp_assign_attri("", false, "A13844HisTipColD", GXutil.rtrim( A13844HisTipColD));
      httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", GXutil.rtrim( A5086DscCausa));
      httpContext.ajax_rsp_assign_attri("", false, "A13699CostCausa", GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13700HisreoValo", GXutil.ltrim( localUtil.ntoc( A13700HisreoValo, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5197TipCorDsc", GXutil.rtrim( A5197TipCorDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", GXutil.rtrim( A7001Rps_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13697HisReoHDR", GXutil.rtrim( A13697HisReoHDR));
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", GXutil.rtrim( A834TipDefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrim( localUtil.ntoc( A13017HisPreCarg, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z539HisBarCod", GXutil.ltrim( localUtil.ntoc( Z539HisBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z545HisCodReo", GXutil.ltrim( localUtil.ntoc( Z545HisCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z544HisCodPar", GXutil.rtrim( Z544HisCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z833TipDefCod", GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z571HisTipArt", GXutil.ltrim( localUtil.ntoc( Z571HisTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z542HisBarSer", GXutil.rtrim( Z542HisBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z546HisColNom", GXutil.rtrim( Z546HisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z547HisColNum", GXutil.ltrim( localUtil.ntoc( Z547HisColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z572HisTipCol", GXutil.ltrim( localUtil.ntoc( Z572HisTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z553HisNumPie", GXutil.ltrim( localUtil.ntoc( Z553HisNumPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z540HisBarKgm", GXutil.ltrim( localUtil.ntoc( Z540HisBarKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z541HisBarMtr", GXutil.ltrim( localUtil.ntoc( Z541HisBarMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z569HisReoFec", localUtil.format(Z569HisReoFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z549HisKgmOri", GXutil.ltrim( localUtil.ntoc( Z549HisKgmOri, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z552HisMtrOri", GXutil.ltrim( localUtil.ntoc( Z552HisMtrOri, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z554HisOrdReo", GXutil.ltrim( localUtil.ntoc( Z554HisOrdReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z548HisEstReo", GXutil.ltrim( localUtil.ntoc( Z548HisEstReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2297HisReoTn", GXutil.ltrim( localUtil.ntoc( Z2297HisReoTn, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2298HisReoPza", GXutil.rtrim( Z2298HisReoPza));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2299HisReoDsc", GXutil.rtrim( Z2299HisReoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5085CodCausa", GXutil.ltrim( localUtil.ntoc( Z5085CodCausa, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5196TipCorCod", GXutil.ltrim( localUtil.ntoc( Z5196TipCorCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5662HisAcCo", Z5662HisAcCo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5693HisAcCot", Z5693HisAcCot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5694HisAdEAcCo", Z5694HisAdEAcCo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5695HisAdEAcCt", Z5695HisAdEAcCt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z6668HisAdeSN", GXutil.rtrim( Z6668HisAdeSN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6669HisAdeObs", Z6669HisAdeObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z7000Rps_Cod", GXutil.ltrim( localUtil.ntoc( Z7000Rps_Cod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8414HisUsu", GXutil.rtrim( Z8414HisUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8567HisHorReo", localUtil.ttoc( Z8567HisHorReo, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8889HisNomCli", GXutil.rtrim( Z8889HisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8890HisNumCli", GXutil.ltrim( localUtil.ntoc( Z8890HisNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12949HisOpecod", GXutil.ltrim( localUtil.ntoc( Z12949HisOpecod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12950HisOpeTur", GXutil.ltrim( localUtil.ntoc( Z12950HisOpeTur, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13015HisMtsCarg", GXutil.ltrim( localUtil.ntoc( Z13015HisMtsCarg, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13016HisMtsImp", GXutil.ltrim( localUtil.ntoc( Z13016HisMtsImp, (byte)(14), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13698HisreoLote", GXutil.rtrim( Z13698HisreoLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13843HisTipArtD", GXutil.rtrim( Z13843HisTipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13844HisTipColD", GXutil.rtrim( Z13844HisTipColD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5086DscCausa", GXutil.rtrim( Z5086DscCausa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13699CostCausa", GXutil.ltrim( localUtil.ntoc( Z13699CostCausa, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13700HisreoValo", GXutil.ltrim( localUtil.ntoc( Z13700HisreoValo, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5197TipCorDsc", GXutil.rtrim( Z5197TipCorDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7001Rps_Dsc", GXutil.rtrim( Z7001Rps_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13697HisReoHDR", GXutil.rtrim( Z13697HisReoHDR));
      app.GxWebStd.gx_hidden_field( httpContext, "Z834TipDefDsc", GXutil.rtrim( Z834TipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13017HisPreCarg", GXutil.ltrim( localUtil.ntoc( Z13017HisPreCarg, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Histipart( )
   {
      n571HisTipArt = false ;
      n13843HisTipArtD = false ;
      /* Using cursor T001A28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Articulo_HISREO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A13843HisTipArtD = T001A28_A13843HisTipArtD[0] ;
      n13843HisTipArtD = T001A28_n13843HisTipArtD[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13843HisTipArtD", GXutil.rtrim( A13843HisTipArtD));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T001A29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T001A29_A279CliNom[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Histipcol( )
   {
      n572HisTipCol = false ;
      n13844HisTipColD = false ;
      /* Using cursor T001A30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante_HISREO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISTIPCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A13844HisTipColD = T001A30_A13844HisTipColD[0] ;
      n13844HisTipColD = T001A30_n13844HisTipColD[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13844HisTipColD", GXutil.rtrim( A13844HisTipColD));
   }

   public void valid_Maqcod( )
   {
      n602MaqCod = false ;
      n606MaqDsc = false ;
      /* Using cursor T001A31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A606MaqDsc = T001A31_A606MaqDsc[0] ;
      n606MaqDsc = T001A31_n606MaqDsc[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
   }

   public void valid_Codcausa( )
   {
      n5085CodCausa = false ;
      n13699CostCausa = false ;
      n540HisBarKgm = false ;
      n5086DscCausa = false ;
      /* Using cursor T001A32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5085CodCausa) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCAU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCAUSA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A5086DscCausa = T001A32_A5086DscCausa[0] ;
      n5086DscCausa = T001A32_n5086DscCausa[0] ;
      A13699CostCausa = T001A32_A13699CostCausa[0] ;
      n13699CostCausa = T001A32_n13699CostCausa[0] ;
      pr_default.close(30);
      A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", GXutil.rtrim( A5086DscCausa));
      httpContext.ajax_rsp_assign_attri("", false, "A13699CostCausa", GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13700HisreoValo", GXutil.ltrim( localUtil.ntoc( A13700HisreoValo, (byte)(11), (byte)(3), ".", "")));
   }

   public void valid_Tipcorcod( )
   {
      n5196TipCorCod = false ;
      n5197TipCorDsc = false ;
      /* Using cursor T001A33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n5196TipCorCod), Short.valueOf(A5196TipCorCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5196TipCorCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CORTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCORCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A5197TipCorDsc = T001A33_A5197TipCorDsc[0] ;
      n5197TipCorDsc = T001A33_n5197TipCorDsc[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5197TipCorDsc", GXutil.rtrim( A5197TipCorDsc));
   }

   public void valid_Rps_cod( )
   {
      n7000Rps_Cod = false ;
      n7001Rps_Dsc = false ;
      /* Using cursor T001A34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A7000Rps_Cod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODRPS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RPS_COD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A7001Rps_Dsc = T001A34_A7001Rps_Dsc[0] ;
      n7001Rps_Dsc = T001A34_n7001Rps_Dsc[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", GXutil.rtrim( A7001Rps_Dsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISBARCOD","{handler:'valid_Hisbarcod',iparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISBARCOD",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISCODREO","{handler:'valid_Hiscodreo',iparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISCODREO",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISCODPAR","{handler:'valid_Hiscodpar',iparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISCODPAR",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_TIPDEFCOD","{handler:'valid_Tipdefcod',iparms:[{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_TIPDEFCOD",",oparms:[{av:'A571HisTipArt',fld:'HISTIPART',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A547HisColNum',fld:'HISCOLNUM',pic:'ZZZZZ9'},{av:'A572HisTipCol',fld:'HISTIPCOL',pic:'Z9'},{av:'A553HisNumPie',fld:'HISNUMPIE',pic:'ZZZ9'},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'A541HisBarMtr',fld:'HISBARMTR',pic:'ZZZZZ9.99'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A549HisKgmOri',fld:'HISKGMORI',pic:'ZZZZZ9.99'},{av:'A552HisMtrOri',fld:'HISMTRORI',pic:'ZZZZZ9.99'},{av:'A554HisOrdReo',fld:'HISORDREO',pic:'9'},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'A2297HisReoTn',fld:'HISREOTN',pic:'ZZZZZ9'},{av:'A2298HisReoPza',fld:'HISREOPZA',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A5085CodCausa',fld:'CODCAUSA',pic:'ZZZ9'},{av:'A5196TipCorCod',fld:'TIPCORCOD',pic:'ZZZ9'},{av:'A5662HisAcCo',fld:'HISACCO',pic:''},{av:'A5693HisAcCot',fld:'HISACCOT',pic:''},{av:'A5694HisAdEAcCo',fld:'HISADEACCO',pic:''},{av:'A5695HisAdEAcCt',fld:'HISADEACCT',pic:''},{av:'A6669HisAdeObs',fld:'HISADEOBS',pic:''},{av:'A7000Rps_Cod',fld:'RPS_COD',pic:'ZZZ9'},{av:'A8414HisUsu',fld:'HISUSU',pic:'@!'},{av:'A8567HisHorReo',fld:'HISHORREO',pic:'99:99:99'},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A8890HisNumCli',fld:'HISNUMCLI',pic:'ZZZZZ9'},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A13015HisMtsCarg',fld:'HISMTSCARG',pic:'ZZZZZ9.99'},{av:'A13016HisMtsImp',fld:'HISMTSIMP',pic:'ZZZZZZZZZZ9.99'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A13843HisTipArtD',fld:'HISTIPARTD',pic:''},{av:'A13844HisTipColD',fld:'HISTIPCOLD',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'},{av:'A13700HisreoValo',fld:'HISREOVALO',pic:'ZZZZZZ9.999'},{av:'A5197TipCorDsc',fld:'TIPCORDSC',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'A13697HisReoHDR',fld:'HISREOHDR',pic:''},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A13017HisPreCarg',fld:'HISPRECARG',pic:'ZZZZZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z539HisBarCod'},{av:'Z545HisCodReo'},{av:'Z544HisCodPar'},{av:'Z833TipDefCod'},{av:'Z571HisTipArt'},{av:'Z252CliCod'},{av:'Z542HisBarSer'},{av:'Z546HisColNom'},{av:'Z547HisColNum'},{av:'Z572HisTipCol'},{av:'Z553HisNumPie'},{av:'Z540HisBarKgm'},{av:'Z541HisBarMtr'},{av:'Z602MaqCod'},{av:'Z569HisReoFec'},{av:'Z549HisKgmOri'},{av:'Z552HisMtrOri'},{av:'Z554HisOrdReo'},{av:'Z548HisEstReo'},{av:'Z2297HisReoTn'},{av:'Z2298HisReoPza'},{av:'Z2299HisReoDsc'},{av:'Z5085CodCausa'},{av:'Z5196TipCorCod'},{av:'Z5662HisAcCo'},{av:'Z5693HisAcCot'},{av:'Z5694HisAdEAcCo'},{av:'Z5695HisAdEAcCt'},{av:'Z6668HisAdeSN'},{av:'Z6669HisAdeObs'},{av:'Z7000Rps_Cod'},{av:'Z8414HisUsu'},{av:'Z8567HisHorReo'},{av:'Z8889HisNomCli'},{av:'Z8890HisNumCli'},{av:'Z12949HisOpecod'},{av:'Z12950HisOpeTur'},{av:'Z13015HisMtsCarg'},{av:'Z13016HisMtsImp'},{av:'Z13698HisreoLote'},{av:'Z279CliNom'},{av:'Z606MaqDsc'},{av:'Z13843HisTipArtD'},{av:'Z13844HisTipColD'},{av:'Z5086DscCausa'},{av:'Z13699CostCausa'},{av:'Z13700HisreoValo'},{av:'Z5197TipCorDsc'},{av:'Z7001Rps_Dsc'},{av:'Z13697HisReoHDR'},{av:'Z834TipDefDsc'},{av:'Z13017HisPreCarg'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISTIPART","{handler:'valid_Histipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A571HisTipArt',fld:'HISTIPART',pic:'ZZZ9'},{av:'A13843HisTipArtD',fld:'HISTIPARTD',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISTIPART",",oparms:[{av:'A13843HisTipArtD',fld:'HISTIPARTD',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISTIPCOL","{handler:'valid_Histipcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A572HisTipCol',fld:'HISTIPCOL',pic:'Z9'},{av:'A13844HisTipColD',fld:'HISTIPCOLD',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISTIPCOL",",oparms:[{av:'A13844HisTipColD',fld:'HISTIPCOLD',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISBARKGM","{handler:'valid_Hisbarkgm',iparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISBARKGM",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_CODCAUSA","{handler:'valid_Codcausa',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5085CodCausa',fld:'CODCAUSA',pic:'ZZZ9'},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A13700HisreoValo',fld:'HISREOVALO',pic:'ZZZZZZ9.999'},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_CODCAUSA",",oparms:[{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'},{av:'A13700HisreoValo',fld:'HISREOVALO',pic:'ZZZZZZ9.999'},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_TIPCORCOD","{handler:'valid_Tipcorcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5196TipCorCod',fld:'TIPCORCOD',pic:'ZZZ9'},{av:'A5197TipCorDsc',fld:'TIPCORDSC',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_TIPCORCOD",",oparms:[{av:'A5197TipCorDsc',fld:'TIPCORDSC',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISADESN","{handler:'valid_Hisadesn',iparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISADESN",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_RPS_COD","{handler:'valid_Rps_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7000Rps_Cod',fld:'RPS_COD',pic:'ZZZ9'},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_RPS_COD",",oparms:[{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISMTSCARG","{handler:'valid_Hismtscarg',iparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISMTSCARG",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
      setEventMetadata("VALID_HISMTSIMP","{handler:'valid_Hismtsimp',iparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]");
      setEventMetadata("VALID_HISMTSIMP",",oparms:[{av:'A6668HisAdeSN',fld:'HISADESN',pic:'@!'}]}");
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
      pr_default.close(27);
      pr_default.close(29);
      pr_default.close(26);
      pr_default.close(28);
      pr_default.close(25);
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(32);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z544HisCodPar = "" ;
      Z542HisBarSer = "" ;
      Z546HisColNom = "" ;
      Z540HisBarKgm = DecimalUtil.ZERO ;
      Z541HisBarMtr = DecimalUtil.ZERO ;
      Z569HisReoFec = GXutil.nullDate() ;
      Z549HisKgmOri = DecimalUtil.ZERO ;
      Z552HisMtrOri = DecimalUtil.ZERO ;
      Z2298HisReoPza = "" ;
      Z2299HisReoDsc = "" ;
      Z5662HisAcCo = "" ;
      Z5693HisAcCot = "" ;
      Z5694HisAdEAcCo = "" ;
      Z5695HisAdEAcCt = "" ;
      Z6668HisAdeSN = "" ;
      Z6669HisAdeObs = "" ;
      Z8414HisUsu = "" ;
      Z8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
      Z8889HisNomCli = "" ;
      Z13015HisMtsCarg = DecimalUtil.ZERO ;
      Z13016HisMtsImp = DecimalUtil.ZERO ;
      Z13698HisreoLote = "" ;
      Z602MaqCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A6668HisAdeSN = "" ;
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
      A544HisCodPar = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A542HisBarSer = "" ;
      lblTextblock10_Jsonclick = "" ;
      A546HisColNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      lblTextblock18_Jsonclick = "" ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A2298HisReoPza = "" ;
      lblTextblock24_Jsonclick = "" ;
      A2299HisReoDsc = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A5086DscCausa = "" ;
      lblTextblock27_Jsonclick = "" ;
      A834TipDefDsc = "" ;
      lblTextblock28_Jsonclick = "" ;
      A606MaqDsc = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      A5197TipCorDsc = "" ;
      lblTextblock31_Jsonclick = "" ;
      A5662HisAcCo = "" ;
      lblTextblock32_Jsonclick = "" ;
      A5693HisAcCot = "" ;
      lblTextblock33_Jsonclick = "" ;
      A5694HisAdEAcCo = "" ;
      lblTextblock34_Jsonclick = "" ;
      A5695HisAdEAcCt = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      A6669HisAdeObs = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      A7001Rps_Dsc = "" ;
      lblTextblock39_Jsonclick = "" ;
      A8414HisUsu = "" ;
      lblTextblock40_Jsonclick = "" ;
      A8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock41_Jsonclick = "" ;
      A8889HisNomCli = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      A13015HisMtsCarg = DecimalUtil.ZERO ;
      lblTextblock46_Jsonclick = "" ;
      A13016HisMtsImp = DecimalUtil.ZERO ;
      lblTextblock47_Jsonclick = "" ;
      A13017HisPreCarg = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A13698HisreoLote = "" ;
      Gx_mode = "" ;
      A13697HisReoHDR = "" ;
      A13699CostCausa = DecimalUtil.ZERO ;
      A13700HisreoValo = DecimalUtil.ZERO ;
      A13843HisTipArtD = "" ;
      A13844HisTipColD = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z834TipDefDsc = "" ;
      Z13843HisTipArtD = "" ;
      Z279CliNom = "" ;
      Z13844HisTipColD = "" ;
      Z606MaqDsc = "" ;
      Z5086DscCausa = "" ;
      Z13699CostCausa = DecimalUtil.ZERO ;
      Z5197TipCorDsc = "" ;
      Z7001Rps_Dsc = "" ;
      T001A12_A539HisBarCod = new int[1] ;
      T001A12_A545HisCodReo = new byte[1] ;
      T001A12_A544HisCodPar = new String[] {""} ;
      T001A12_A13843HisTipArtD = new String[] {""} ;
      T001A12_n13843HisTipArtD = new boolean[] {false} ;
      T001A12_A279CliNom = new String[] {""} ;
      T001A12_A542HisBarSer = new String[] {""} ;
      T001A12_n542HisBarSer = new boolean[] {false} ;
      T001A12_A546HisColNom = new String[] {""} ;
      T001A12_n546HisColNom = new boolean[] {false} ;
      T001A12_A547HisColNum = new int[1] ;
      T001A12_n547HisColNum = new boolean[] {false} ;
      T001A12_A13844HisTipColD = new String[] {""} ;
      T001A12_n13844HisTipColD = new boolean[] {false} ;
      T001A12_A553HisNumPie = new short[1] ;
      T001A12_n553HisNumPie = new boolean[] {false} ;
      T001A12_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A12_n540HisBarKgm = new boolean[] {false} ;
      T001A12_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A12_n541HisBarMtr = new boolean[] {false} ;
      T001A12_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001A12_n569HisReoFec = new boolean[] {false} ;
      T001A12_A549HisKgmOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A12_n549HisKgmOri = new boolean[] {false} ;
      T001A12_A552HisMtrOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A12_n552HisMtrOri = new boolean[] {false} ;
      T001A12_A554HisOrdReo = new byte[1] ;
      T001A12_n554HisOrdReo = new boolean[] {false} ;
      T001A12_A548HisEstReo = new byte[1] ;
      T001A12_n548HisEstReo = new boolean[] {false} ;
      T001A12_A2297HisReoTn = new int[1] ;
      T001A12_n2297HisReoTn = new boolean[] {false} ;
      T001A12_A2298HisReoPza = new String[] {""} ;
      T001A12_n2298HisReoPza = new boolean[] {false} ;
      T001A12_A2299HisReoDsc = new String[] {""} ;
      T001A12_n2299HisReoDsc = new boolean[] {false} ;
      T001A12_A5086DscCausa = new String[] {""} ;
      T001A12_n5086DscCausa = new boolean[] {false} ;
      T001A12_A834TipDefDsc = new String[] {""} ;
      T001A12_n834TipDefDsc = new boolean[] {false} ;
      T001A12_A606MaqDsc = new String[] {""} ;
      T001A12_n606MaqDsc = new boolean[] {false} ;
      T001A12_A5197TipCorDsc = new String[] {""} ;
      T001A12_n5197TipCorDsc = new boolean[] {false} ;
      T001A12_A5662HisAcCo = new String[] {""} ;
      T001A12_n5662HisAcCo = new boolean[] {false} ;
      T001A12_A5693HisAcCot = new String[] {""} ;
      T001A12_n5693HisAcCot = new boolean[] {false} ;
      T001A12_A5694HisAdEAcCo = new String[] {""} ;
      T001A12_n5694HisAdEAcCo = new boolean[] {false} ;
      T001A12_A5695HisAdEAcCt = new String[] {""} ;
      T001A12_n5695HisAdEAcCt = new boolean[] {false} ;
      T001A12_A6668HisAdeSN = new String[] {""} ;
      T001A12_n6668HisAdeSN = new boolean[] {false} ;
      T001A12_A6669HisAdeObs = new String[] {""} ;
      T001A12_n6669HisAdeObs = new boolean[] {false} ;
      T001A12_A7001Rps_Dsc = new String[] {""} ;
      T001A12_n7001Rps_Dsc = new boolean[] {false} ;
      T001A12_A8414HisUsu = new String[] {""} ;
      T001A12_n8414HisUsu = new boolean[] {false} ;
      T001A12_A8567HisHorReo = new java.util.Date[] {GXutil.nullDate()} ;
      T001A12_n8567HisHorReo = new boolean[] {false} ;
      T001A12_A8889HisNomCli = new String[] {""} ;
      T001A12_n8889HisNomCli = new boolean[] {false} ;
      T001A12_A8890HisNumCli = new int[1] ;
      T001A12_n8890HisNumCli = new boolean[] {false} ;
      T001A12_A12949HisOpecod = new int[1] ;
      T001A12_n12949HisOpecod = new boolean[] {false} ;
      T001A12_A12950HisOpeTur = new byte[1] ;
      T001A12_n12950HisOpeTur = new boolean[] {false} ;
      T001A12_A13015HisMtsCarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A12_n13015HisMtsCarg = new boolean[] {false} ;
      T001A12_A13016HisMtsImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A12_n13016HisMtsImp = new boolean[] {false} ;
      T001A12_A13698HisreoLote = new String[] {""} ;
      T001A12_n13698HisreoLote = new boolean[] {false} ;
      T001A12_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A12_n13699CostCausa = new boolean[] {false} ;
      T001A12_A396EmprCod = new String[] {""} ;
      T001A12_A252CliCod = new int[1] ;
      T001A12_n252CliCod = new boolean[] {false} ;
      T001A12_A602MaqCod = new String[] {""} ;
      T001A12_n602MaqCod = new boolean[] {false} ;
      T001A12_A571HisTipArt = new short[1] ;
      T001A12_n571HisTipArt = new boolean[] {false} ;
      T001A12_A572HisTipCol = new byte[1] ;
      T001A12_n572HisTipCol = new boolean[] {false} ;
      T001A12_A833TipDefCod = new short[1] ;
      T001A12_A5085CodCausa = new short[1] ;
      T001A12_n5085CodCausa = new boolean[] {false} ;
      T001A12_A5196TipCorCod = new short[1] ;
      T001A12_n5196TipCorCod = new boolean[] {false} ;
      T001A12_A7000Rps_Cod = new short[1] ;
      T001A12_n7000Rps_Cod = new boolean[] {false} ;
      T001A4_A279CliNom = new String[] {""} ;
      T001A5_A606MaqDsc = new String[] {""} ;
      T001A5_n606MaqDsc = new boolean[] {false} ;
      T001A6_A13843HisTipArtD = new String[] {""} ;
      T001A6_n13843HisTipArtD = new boolean[] {false} ;
      T001A7_A13844HisTipColD = new String[] {""} ;
      T001A7_n13844HisTipColD = new boolean[] {false} ;
      T001A9_A5086DscCausa = new String[] {""} ;
      T001A9_n5086DscCausa = new boolean[] {false} ;
      T001A9_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A9_n13699CostCausa = new boolean[] {false} ;
      T001A10_A5197TipCorDsc = new String[] {""} ;
      T001A10_n5197TipCorDsc = new boolean[] {false} ;
      T001A11_A7001Rps_Dsc = new String[] {""} ;
      T001A11_n7001Rps_Dsc = new boolean[] {false} ;
      T001A8_A834TipDefDsc = new String[] {""} ;
      T001A8_n834TipDefDsc = new boolean[] {false} ;
      T001A13_A279CliNom = new String[] {""} ;
      T001A14_A606MaqDsc = new String[] {""} ;
      T001A14_n606MaqDsc = new boolean[] {false} ;
      T001A15_A13843HisTipArtD = new String[] {""} ;
      T001A15_n13843HisTipArtD = new boolean[] {false} ;
      T001A16_A13844HisTipColD = new String[] {""} ;
      T001A16_n13844HisTipColD = new boolean[] {false} ;
      T001A17_A5086DscCausa = new String[] {""} ;
      T001A17_n5086DscCausa = new boolean[] {false} ;
      T001A17_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A17_n13699CostCausa = new boolean[] {false} ;
      T001A18_A5197TipCorDsc = new String[] {""} ;
      T001A18_n5197TipCorDsc = new boolean[] {false} ;
      T001A19_A7001Rps_Dsc = new String[] {""} ;
      T001A19_n7001Rps_Dsc = new boolean[] {false} ;
      T001A20_A834TipDefDsc = new String[] {""} ;
      T001A20_n834TipDefDsc = new boolean[] {false} ;
      T001A21_A396EmprCod = new String[] {""} ;
      T001A21_A539HisBarCod = new int[1] ;
      T001A21_A545HisCodReo = new byte[1] ;
      T001A21_A544HisCodPar = new String[] {""} ;
      T001A21_A833TipDefCod = new short[1] ;
      T001A3_A539HisBarCod = new int[1] ;
      T001A3_A545HisCodReo = new byte[1] ;
      T001A3_A544HisCodPar = new String[] {""} ;
      T001A3_A542HisBarSer = new String[] {""} ;
      T001A3_n542HisBarSer = new boolean[] {false} ;
      T001A3_A546HisColNom = new String[] {""} ;
      T001A3_n546HisColNom = new boolean[] {false} ;
      T001A3_A547HisColNum = new int[1] ;
      T001A3_n547HisColNum = new boolean[] {false} ;
      T001A3_A553HisNumPie = new short[1] ;
      T001A3_n553HisNumPie = new boolean[] {false} ;
      T001A3_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A3_n540HisBarKgm = new boolean[] {false} ;
      T001A3_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A3_n541HisBarMtr = new boolean[] {false} ;
      T001A3_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001A3_n569HisReoFec = new boolean[] {false} ;
      T001A3_A549HisKgmOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A3_n549HisKgmOri = new boolean[] {false} ;
      T001A3_A552HisMtrOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A3_n552HisMtrOri = new boolean[] {false} ;
      T001A3_A554HisOrdReo = new byte[1] ;
      T001A3_n554HisOrdReo = new boolean[] {false} ;
      T001A3_A548HisEstReo = new byte[1] ;
      T001A3_n548HisEstReo = new boolean[] {false} ;
      T001A3_A2297HisReoTn = new int[1] ;
      T001A3_n2297HisReoTn = new boolean[] {false} ;
      T001A3_A2298HisReoPza = new String[] {""} ;
      T001A3_n2298HisReoPza = new boolean[] {false} ;
      T001A3_A2299HisReoDsc = new String[] {""} ;
      T001A3_n2299HisReoDsc = new boolean[] {false} ;
      T001A3_A5662HisAcCo = new String[] {""} ;
      T001A3_n5662HisAcCo = new boolean[] {false} ;
      T001A3_A5693HisAcCot = new String[] {""} ;
      T001A3_n5693HisAcCot = new boolean[] {false} ;
      T001A3_A5694HisAdEAcCo = new String[] {""} ;
      T001A3_n5694HisAdEAcCo = new boolean[] {false} ;
      T001A3_A5695HisAdEAcCt = new String[] {""} ;
      T001A3_n5695HisAdEAcCt = new boolean[] {false} ;
      T001A3_A6668HisAdeSN = new String[] {""} ;
      T001A3_n6668HisAdeSN = new boolean[] {false} ;
      T001A3_A6669HisAdeObs = new String[] {""} ;
      T001A3_n6669HisAdeObs = new boolean[] {false} ;
      T001A3_A8414HisUsu = new String[] {""} ;
      T001A3_n8414HisUsu = new boolean[] {false} ;
      T001A3_A8567HisHorReo = new java.util.Date[] {GXutil.nullDate()} ;
      T001A3_n8567HisHorReo = new boolean[] {false} ;
      T001A3_A8889HisNomCli = new String[] {""} ;
      T001A3_n8889HisNomCli = new boolean[] {false} ;
      T001A3_A8890HisNumCli = new int[1] ;
      T001A3_n8890HisNumCli = new boolean[] {false} ;
      T001A3_A12949HisOpecod = new int[1] ;
      T001A3_n12949HisOpecod = new boolean[] {false} ;
      T001A3_A12950HisOpeTur = new byte[1] ;
      T001A3_n12950HisOpeTur = new boolean[] {false} ;
      T001A3_A13015HisMtsCarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A3_n13015HisMtsCarg = new boolean[] {false} ;
      T001A3_A13016HisMtsImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A3_n13016HisMtsImp = new boolean[] {false} ;
      T001A3_A13698HisreoLote = new String[] {""} ;
      T001A3_n13698HisreoLote = new boolean[] {false} ;
      T001A3_A396EmprCod = new String[] {""} ;
      T001A3_A252CliCod = new int[1] ;
      T001A3_n252CliCod = new boolean[] {false} ;
      T001A3_A602MaqCod = new String[] {""} ;
      T001A3_n602MaqCod = new boolean[] {false} ;
      T001A3_A571HisTipArt = new short[1] ;
      T001A3_n571HisTipArt = new boolean[] {false} ;
      T001A3_A572HisTipCol = new byte[1] ;
      T001A3_n572HisTipCol = new boolean[] {false} ;
      T001A3_A833TipDefCod = new short[1] ;
      T001A3_A5085CodCausa = new short[1] ;
      T001A3_n5085CodCausa = new boolean[] {false} ;
      T001A3_A5196TipCorCod = new short[1] ;
      T001A3_n5196TipCorCod = new boolean[] {false} ;
      T001A3_A7000Rps_Cod = new short[1] ;
      T001A3_n7000Rps_Cod = new boolean[] {false} ;
      sMode60 = "" ;
      T001A22_A396EmprCod = new String[] {""} ;
      T001A22_A539HisBarCod = new int[1] ;
      T001A22_A545HisCodReo = new byte[1] ;
      T001A22_A544HisCodPar = new String[] {""} ;
      T001A22_A833TipDefCod = new short[1] ;
      T001A23_A396EmprCod = new String[] {""} ;
      T001A23_A539HisBarCod = new int[1] ;
      T001A23_A545HisCodReo = new byte[1] ;
      T001A23_A544HisCodPar = new String[] {""} ;
      T001A23_A833TipDefCod = new short[1] ;
      T001A2_A539HisBarCod = new int[1] ;
      T001A2_A545HisCodReo = new byte[1] ;
      T001A2_A544HisCodPar = new String[] {""} ;
      T001A2_A542HisBarSer = new String[] {""} ;
      T001A2_n542HisBarSer = new boolean[] {false} ;
      T001A2_A546HisColNom = new String[] {""} ;
      T001A2_n546HisColNom = new boolean[] {false} ;
      T001A2_A547HisColNum = new int[1] ;
      T001A2_n547HisColNum = new boolean[] {false} ;
      T001A2_A553HisNumPie = new short[1] ;
      T001A2_n553HisNumPie = new boolean[] {false} ;
      T001A2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A2_n540HisBarKgm = new boolean[] {false} ;
      T001A2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A2_n541HisBarMtr = new boolean[] {false} ;
      T001A2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001A2_n569HisReoFec = new boolean[] {false} ;
      T001A2_A549HisKgmOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A2_n549HisKgmOri = new boolean[] {false} ;
      T001A2_A552HisMtrOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A2_n552HisMtrOri = new boolean[] {false} ;
      T001A2_A554HisOrdReo = new byte[1] ;
      T001A2_n554HisOrdReo = new boolean[] {false} ;
      T001A2_A548HisEstReo = new byte[1] ;
      T001A2_n548HisEstReo = new boolean[] {false} ;
      T001A2_A2297HisReoTn = new int[1] ;
      T001A2_n2297HisReoTn = new boolean[] {false} ;
      T001A2_A2298HisReoPza = new String[] {""} ;
      T001A2_n2298HisReoPza = new boolean[] {false} ;
      T001A2_A2299HisReoDsc = new String[] {""} ;
      T001A2_n2299HisReoDsc = new boolean[] {false} ;
      T001A2_A5662HisAcCo = new String[] {""} ;
      T001A2_n5662HisAcCo = new boolean[] {false} ;
      T001A2_A5693HisAcCot = new String[] {""} ;
      T001A2_n5693HisAcCot = new boolean[] {false} ;
      T001A2_A5694HisAdEAcCo = new String[] {""} ;
      T001A2_n5694HisAdEAcCo = new boolean[] {false} ;
      T001A2_A5695HisAdEAcCt = new String[] {""} ;
      T001A2_n5695HisAdEAcCt = new boolean[] {false} ;
      T001A2_A6668HisAdeSN = new String[] {""} ;
      T001A2_n6668HisAdeSN = new boolean[] {false} ;
      T001A2_A6669HisAdeObs = new String[] {""} ;
      T001A2_n6669HisAdeObs = new boolean[] {false} ;
      T001A2_A8414HisUsu = new String[] {""} ;
      T001A2_n8414HisUsu = new boolean[] {false} ;
      T001A2_A8567HisHorReo = new java.util.Date[] {GXutil.nullDate()} ;
      T001A2_n8567HisHorReo = new boolean[] {false} ;
      T001A2_A8889HisNomCli = new String[] {""} ;
      T001A2_n8889HisNomCli = new boolean[] {false} ;
      T001A2_A8890HisNumCli = new int[1] ;
      T001A2_n8890HisNumCli = new boolean[] {false} ;
      T001A2_A12949HisOpecod = new int[1] ;
      T001A2_n12949HisOpecod = new boolean[] {false} ;
      T001A2_A12950HisOpeTur = new byte[1] ;
      T001A2_n12950HisOpeTur = new boolean[] {false} ;
      T001A2_A13015HisMtsCarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A2_n13015HisMtsCarg = new boolean[] {false} ;
      T001A2_A13016HisMtsImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A2_n13016HisMtsImp = new boolean[] {false} ;
      T001A2_A13698HisreoLote = new String[] {""} ;
      T001A2_n13698HisreoLote = new boolean[] {false} ;
      T001A2_A396EmprCod = new String[] {""} ;
      T001A2_A252CliCod = new int[1] ;
      T001A2_n252CliCod = new boolean[] {false} ;
      T001A2_A602MaqCod = new String[] {""} ;
      T001A2_n602MaqCod = new boolean[] {false} ;
      T001A2_A571HisTipArt = new short[1] ;
      T001A2_n571HisTipArt = new boolean[] {false} ;
      T001A2_A572HisTipCol = new byte[1] ;
      T001A2_n572HisTipCol = new boolean[] {false} ;
      T001A2_A833TipDefCod = new short[1] ;
      T001A2_A5085CodCausa = new short[1] ;
      T001A2_n5085CodCausa = new boolean[] {false} ;
      T001A2_A5196TipCorCod = new short[1] ;
      T001A2_n5196TipCorCod = new boolean[] {false} ;
      T001A2_A7000Rps_Cod = new short[1] ;
      T001A2_n7000Rps_Cod = new boolean[] {false} ;
      T001A27_A834TipDefDsc = new String[] {""} ;
      T001A27_n834TipDefDsc = new boolean[] {false} ;
      T001A28_A13843HisTipArtD = new String[] {""} ;
      T001A28_n13843HisTipArtD = new boolean[] {false} ;
      T001A29_A279CliNom = new String[] {""} ;
      T001A30_A13844HisTipColD = new String[] {""} ;
      T001A30_n13844HisTipColD = new boolean[] {false} ;
      T001A31_A606MaqDsc = new String[] {""} ;
      T001A31_n606MaqDsc = new boolean[] {false} ;
      T001A32_A5086DscCausa = new String[] {""} ;
      T001A32_n5086DscCausa = new boolean[] {false} ;
      T001A32_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001A32_n13699CostCausa = new boolean[] {false} ;
      T001A33_A5197TipCorDsc = new String[] {""} ;
      T001A33_n5197TipCorDsc = new boolean[] {false} ;
      T001A34_A7001Rps_Dsc = new String[] {""} ;
      T001A34_n7001Rps_Dsc = new boolean[] {false} ;
      T001A35_A396EmprCod = new String[] {""} ;
      T001A35_A539HisBarCod = new int[1] ;
      T001A35_A545HisCodReo = new byte[1] ;
      T001A35_A544HisCodPar = new String[] {""} ;
      T001A35_A833TipDefCod = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z13700HisreoValo = DecimalUtil.ZERO ;
      Z13697HisReoHDR = "" ;
      Z13017HisPreCarg = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ544HisCodPar = "" ;
      ZZ542HisBarSer = "" ;
      ZZ546HisColNom = "" ;
      ZZ540HisBarKgm = DecimalUtil.ZERO ;
      ZZ541HisBarMtr = DecimalUtil.ZERO ;
      ZZ602MaqCod = "" ;
      ZZ569HisReoFec = GXutil.nullDate() ;
      ZZ549HisKgmOri = DecimalUtil.ZERO ;
      ZZ552HisMtrOri = DecimalUtil.ZERO ;
      ZZ2298HisReoPza = "" ;
      ZZ2299HisReoDsc = "" ;
      ZZ5662HisAcCo = "" ;
      ZZ5693HisAcCot = "" ;
      ZZ5694HisAdEAcCo = "" ;
      ZZ5695HisAdEAcCt = "" ;
      ZZ6668HisAdeSN = "" ;
      ZZ6669HisAdeObs = "" ;
      ZZ8414HisUsu = "" ;
      ZZ8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
      ZZ8889HisNomCli = "" ;
      ZZ13015HisMtsCarg = DecimalUtil.ZERO ;
      ZZ13016HisMtsImp = DecimalUtil.ZERO ;
      ZZ13698HisreoLote = "" ;
      ZZ279CliNom = "" ;
      ZZ606MaqDsc = "" ;
      ZZ13843HisTipArtD = "" ;
      ZZ13844HisTipColD = "" ;
      ZZ5086DscCausa = "" ;
      ZZ13699CostCausa = DecimalUtil.ZERO ;
      ZZ13700HisreoValo = DecimalUtil.ZERO ;
      ZZ5197TipCorDsc = "" ;
      ZZ7001Rps_Dsc = "" ;
      ZZ13697HisReoHDR = "" ;
      ZZ834TipDefDsc = "" ;
      ZZ13017HisPreCarg = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thisreo__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thisreo__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thisreo__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thisreo__default(),
         new Object[] {
             new Object[] {
            T001A2_A539HisBarCod, T001A2_A545HisCodReo, T001A2_A544HisCodPar, T001A2_A542HisBarSer, T001A2_n542HisBarSer, T001A2_A546HisColNom, T001A2_n546HisColNom, T001A2_A547HisColNum, T001A2_n547HisColNum, T001A2_A553HisNumPie,
            T001A2_n553HisNumPie, T001A2_A540HisBarKgm, T001A2_n540HisBarKgm, T001A2_A541HisBarMtr, T001A2_n541HisBarMtr, T001A2_A569HisReoFec, T001A2_n569HisReoFec, T001A2_A549HisKgmOri, T001A2_n549HisKgmOri, T001A2_A552HisMtrOri,
            T001A2_n552HisMtrOri, T001A2_A554HisOrdReo, T001A2_n554HisOrdReo, T001A2_A548HisEstReo, T001A2_n548HisEstReo, T001A2_A2297HisReoTn, T001A2_n2297HisReoTn, T001A2_A2298HisReoPza, T001A2_n2298HisReoPza, T001A2_A2299HisReoDsc,
            T001A2_n2299HisReoDsc, T001A2_A5662HisAcCo, T001A2_n5662HisAcCo, T001A2_A5693HisAcCot, T001A2_n5693HisAcCot, T001A2_A5694HisAdEAcCo, T001A2_n5694HisAdEAcCo, T001A2_A5695HisAdEAcCt, T001A2_n5695HisAdEAcCt, T001A2_A6668HisAdeSN,
            T001A2_n6668HisAdeSN, T001A2_A6669HisAdeObs, T001A2_n6669HisAdeObs, T001A2_A8414HisUsu, T001A2_n8414HisUsu, T001A2_A8567HisHorReo, T001A2_n8567HisHorReo, T001A2_A8889HisNomCli, T001A2_n8889HisNomCli, T001A2_A8890HisNumCli,
            T001A2_n8890HisNumCli, T001A2_A12949HisOpecod, T001A2_n12949HisOpecod, T001A2_A12950HisOpeTur, T001A2_n12950HisOpeTur, T001A2_A13015HisMtsCarg, T001A2_n13015HisMtsCarg, T001A2_A13016HisMtsImp, T001A2_n13016HisMtsImp, T001A2_A13698HisreoLote,
            T001A2_n13698HisreoLote, T001A2_A396EmprCod, T001A2_A252CliCod, T001A2_n252CliCod, T001A2_A602MaqCod, T001A2_n602MaqCod, T001A2_A571HisTipArt, T001A2_n571HisTipArt, T001A2_A572HisTipCol, T001A2_n572HisTipCol,
            T001A2_A833TipDefCod, T001A2_A5085CodCausa, T001A2_n5085CodCausa, T001A2_A5196TipCorCod, T001A2_n5196TipCorCod, T001A2_A7000Rps_Cod, T001A2_n7000Rps_Cod
            }
            , new Object[] {
            T001A3_A539HisBarCod, T001A3_A545HisCodReo, T001A3_A544HisCodPar, T001A3_A542HisBarSer, T001A3_n542HisBarSer, T001A3_A546HisColNom, T001A3_n546HisColNom, T001A3_A547HisColNum, T001A3_n547HisColNum, T001A3_A553HisNumPie,
            T001A3_n553HisNumPie, T001A3_A540HisBarKgm, T001A3_n540HisBarKgm, T001A3_A541HisBarMtr, T001A3_n541HisBarMtr, T001A3_A569HisReoFec, T001A3_n569HisReoFec, T001A3_A549HisKgmOri, T001A3_n549HisKgmOri, T001A3_A552HisMtrOri,
            T001A3_n552HisMtrOri, T001A3_A554HisOrdReo, T001A3_n554HisOrdReo, T001A3_A548HisEstReo, T001A3_n548HisEstReo, T001A3_A2297HisReoTn, T001A3_n2297HisReoTn, T001A3_A2298HisReoPza, T001A3_n2298HisReoPza, T001A3_A2299HisReoDsc,
            T001A3_n2299HisReoDsc, T001A3_A5662HisAcCo, T001A3_n5662HisAcCo, T001A3_A5693HisAcCot, T001A3_n5693HisAcCot, T001A3_A5694HisAdEAcCo, T001A3_n5694HisAdEAcCo, T001A3_A5695HisAdEAcCt, T001A3_n5695HisAdEAcCt, T001A3_A6668HisAdeSN,
            T001A3_n6668HisAdeSN, T001A3_A6669HisAdeObs, T001A3_n6669HisAdeObs, T001A3_A8414HisUsu, T001A3_n8414HisUsu, T001A3_A8567HisHorReo, T001A3_n8567HisHorReo, T001A3_A8889HisNomCli, T001A3_n8889HisNomCli, T001A3_A8890HisNumCli,
            T001A3_n8890HisNumCli, T001A3_A12949HisOpecod, T001A3_n12949HisOpecod, T001A3_A12950HisOpeTur, T001A3_n12950HisOpeTur, T001A3_A13015HisMtsCarg, T001A3_n13015HisMtsCarg, T001A3_A13016HisMtsImp, T001A3_n13016HisMtsImp, T001A3_A13698HisreoLote,
            T001A3_n13698HisreoLote, T001A3_A396EmprCod, T001A3_A252CliCod, T001A3_n252CliCod, T001A3_A602MaqCod, T001A3_n602MaqCod, T001A3_A571HisTipArt, T001A3_n571HisTipArt, T001A3_A572HisTipCol, T001A3_n572HisTipCol,
            T001A3_A833TipDefCod, T001A3_A5085CodCausa, T001A3_n5085CodCausa, T001A3_A5196TipCorCod, T001A3_n5196TipCorCod, T001A3_A7000Rps_Cod, T001A3_n7000Rps_Cod
            }
            , new Object[] {
            T001A4_A279CliNom
            }
            , new Object[] {
            T001A5_A606MaqDsc, T001A5_n606MaqDsc
            }
            , new Object[] {
            T001A6_A13843HisTipArtD, T001A6_n13843HisTipArtD
            }
            , new Object[] {
            T001A7_A13844HisTipColD, T001A7_n13844HisTipColD
            }
            , new Object[] {
            T001A8_A834TipDefDsc, T001A8_n834TipDefDsc
            }
            , new Object[] {
            T001A9_A5086DscCausa, T001A9_n5086DscCausa, T001A9_A13699CostCausa, T001A9_n13699CostCausa
            }
            , new Object[] {
            T001A10_A5197TipCorDsc, T001A10_n5197TipCorDsc
            }
            , new Object[] {
            T001A11_A7001Rps_Dsc, T001A11_n7001Rps_Dsc
            }
            , new Object[] {
            T001A12_A539HisBarCod, T001A12_A545HisCodReo, T001A12_A544HisCodPar, T001A12_A13843HisTipArtD, T001A12_n13843HisTipArtD, T001A12_A279CliNom, T001A12_A542HisBarSer, T001A12_n542HisBarSer, T001A12_A546HisColNom, T001A12_n546HisColNom,
            T001A12_A547HisColNum, T001A12_n547HisColNum, T001A12_A13844HisTipColD, T001A12_n13844HisTipColD, T001A12_A553HisNumPie, T001A12_n553HisNumPie, T001A12_A540HisBarKgm, T001A12_n540HisBarKgm, T001A12_A541HisBarMtr, T001A12_n541HisBarMtr,
            T001A12_A569HisReoFec, T001A12_n569HisReoFec, T001A12_A549HisKgmOri, T001A12_n549HisKgmOri, T001A12_A552HisMtrOri, T001A12_n552HisMtrOri, T001A12_A554HisOrdReo, T001A12_n554HisOrdReo, T001A12_A548HisEstReo, T001A12_n548HisEstReo,
            T001A12_A2297HisReoTn, T001A12_n2297HisReoTn, T001A12_A2298HisReoPza, T001A12_n2298HisReoPza, T001A12_A2299HisReoDsc, T001A12_n2299HisReoDsc, T001A12_A5086DscCausa, T001A12_n5086DscCausa, T001A12_A834TipDefDsc, T001A12_n834TipDefDsc,
            T001A12_A606MaqDsc, T001A12_n606MaqDsc, T001A12_A5197TipCorDsc, T001A12_n5197TipCorDsc, T001A12_A5662HisAcCo, T001A12_n5662HisAcCo, T001A12_A5693HisAcCot, T001A12_n5693HisAcCot, T001A12_A5694HisAdEAcCo, T001A12_n5694HisAdEAcCo,
            T001A12_A5695HisAdEAcCt, T001A12_n5695HisAdEAcCt, T001A12_A6668HisAdeSN, T001A12_n6668HisAdeSN, T001A12_A6669HisAdeObs, T001A12_n6669HisAdeObs, T001A12_A7001Rps_Dsc, T001A12_n7001Rps_Dsc, T001A12_A8414HisUsu, T001A12_n8414HisUsu,
            T001A12_A8567HisHorReo, T001A12_n8567HisHorReo, T001A12_A8889HisNomCli, T001A12_n8889HisNomCli, T001A12_A8890HisNumCli, T001A12_n8890HisNumCli, T001A12_A12949HisOpecod, T001A12_n12949HisOpecod, T001A12_A12950HisOpeTur, T001A12_n12950HisOpeTur,
            T001A12_A13015HisMtsCarg, T001A12_n13015HisMtsCarg, T001A12_A13016HisMtsImp, T001A12_n13016HisMtsImp, T001A12_A13698HisreoLote, T001A12_n13698HisreoLote, T001A12_A13699CostCausa, T001A12_n13699CostCausa, T001A12_A396EmprCod, T001A12_A252CliCod,
            T001A12_n252CliCod, T001A12_A602MaqCod, T001A12_n602MaqCod, T001A12_A571HisTipArt, T001A12_n571HisTipArt, T001A12_A572HisTipCol, T001A12_n572HisTipCol, T001A12_A833TipDefCod, T001A12_A5085CodCausa, T001A12_n5085CodCausa,
            T001A12_A5196TipCorCod, T001A12_n5196TipCorCod, T001A12_A7000Rps_Cod, T001A12_n7000Rps_Cod
            }
            , new Object[] {
            T001A13_A279CliNom
            }
            , new Object[] {
            T001A14_A606MaqDsc, T001A14_n606MaqDsc
            }
            , new Object[] {
            T001A15_A13843HisTipArtD, T001A15_n13843HisTipArtD
            }
            , new Object[] {
            T001A16_A13844HisTipColD, T001A16_n13844HisTipColD
            }
            , new Object[] {
            T001A17_A5086DscCausa, T001A17_n5086DscCausa, T001A17_A13699CostCausa, T001A17_n13699CostCausa
            }
            , new Object[] {
            T001A18_A5197TipCorDsc, T001A18_n5197TipCorDsc
            }
            , new Object[] {
            T001A19_A7001Rps_Dsc, T001A19_n7001Rps_Dsc
            }
            , new Object[] {
            T001A20_A834TipDefDsc, T001A20_n834TipDefDsc
            }
            , new Object[] {
            T001A21_A396EmprCod, T001A21_A539HisBarCod, T001A21_A545HisCodReo, T001A21_A544HisCodPar, T001A21_A833TipDefCod
            }
            , new Object[] {
            T001A22_A396EmprCod, T001A22_A539HisBarCod, T001A22_A545HisCodReo, T001A22_A544HisCodPar, T001A22_A833TipDefCod
            }
            , new Object[] {
            T001A23_A396EmprCod, T001A23_A539HisBarCod, T001A23_A545HisCodReo, T001A23_A544HisCodPar, T001A23_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001A27_A834TipDefDsc, T001A27_n834TipDefDsc
            }
            , new Object[] {
            T001A28_A13843HisTipArtD, T001A28_n13843HisTipArtD
            }
            , new Object[] {
            T001A29_A279CliNom
            }
            , new Object[] {
            T001A30_A13844HisTipColD, T001A30_n13844HisTipColD
            }
            , new Object[] {
            T001A31_A606MaqDsc, T001A31_n606MaqDsc
            }
            , new Object[] {
            T001A32_A5086DscCausa, T001A32_n5086DscCausa, T001A32_A13699CostCausa, T001A32_n13699CostCausa
            }
            , new Object[] {
            T001A33_A5197TipCorDsc, T001A33_n5197TipCorDsc
            }
            , new Object[] {
            T001A34_A7001Rps_Dsc, T001A34_n7001Rps_Dsc
            }
            , new Object[] {
            T001A35_A396EmprCod, T001A35_A539HisBarCod, T001A35_A545HisCodReo, T001A35_A544HisCodPar, T001A35_A833TipDefCod
            }
         }
      );
   }

   private byte Z545HisCodReo ;
   private byte Z554HisOrdReo ;
   private byte Z548HisEstReo ;
   private byte Z12950HisOpeTur ;
   private byte Z572HisTipCol ;
   private byte GxWebError ;
   private byte A572HisTipCol ;
   private byte nKeyPressed ;
   private byte A545HisCodReo ;
   private byte A554HisOrdReo ;
   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ545HisCodReo ;
   private byte ZZ572HisTipCol ;
   private byte ZZ554HisOrdReo ;
   private byte ZZ548HisEstReo ;
   private byte ZZ12950HisOpeTur ;
   private short Z833TipDefCod ;
   private short Z553HisNumPie ;
   private short Z571HisTipArt ;
   private short Z5085CodCausa ;
   private short Z5196TipCorCod ;
   private short Z7000Rps_Cod ;
   private short A571HisTipArt ;
   private short A5085CodCausa ;
   private short A5196TipCorCod ;
   private short A7000Rps_Cod ;
   private short A833TipDefCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A553HisNumPie ;
   private short RcdFound60 ;
   private short nIsDirty_60 ;
   private short ZZ833TipDefCod ;
   private short ZZ571HisTipArt ;
   private short ZZ553HisNumPie ;
   private short ZZ5085CodCausa ;
   private short ZZ5196TipCorCod ;
   private short ZZ7000Rps_Cod ;
   private int Z539HisBarCod ;
   private int Z547HisColNum ;
   private int Z2297HisReoTn ;
   private int Z8890HisNumCli ;
   private int Z12949HisOpecod ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A539HisBarCod ;
   private int edtHisBarCod_Enabled ;
   private int edtHisCodReo_Enabled ;
   private int edtHisCodPar_Enabled ;
   private int edtTipDefCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtHisTipArt_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtHisBarSer_Enabled ;
   private int edtHisColNom_Enabled ;
   private int A547HisColNum ;
   private int edtHisColNum_Enabled ;
   private int edtHisTipCol_Enabled ;
   private int edtHisNumPie_Enabled ;
   private int edtHisBarKgm_Enabled ;
   private int edtHisBarMtr_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtHisReoFec_Enabled ;
   private int edtHisKgmOri_Enabled ;
   private int edtHisMtrOri_Enabled ;
   private int edtHisOrdReo_Enabled ;
   private int edtHisEstReo_Enabled ;
   private int A2297HisReoTn ;
   private int edtHisReoTn_Enabled ;
   private int edtHisReoPza_Enabled ;
   private int edtHisReoDsc_Enabled ;
   private int edtCodCausa_Enabled ;
   private int edtDscCausa_Enabled ;
   private int edtTipDefDsc_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtTipCorCod_Enabled ;
   private int edtTipCorDsc_Enabled ;
   private int edtHisAcCo_Enabled ;
   private int edtHisAcCot_Enabled ;
   private int edtHisAdEAcCo_Enabled ;
   private int edtHisAdEAcCt_Enabled ;
   private int edtHisAdeObs_Enabled ;
   private int edtRps_Cod_Enabled ;
   private int edtRps_Dsc_Enabled ;
   private int edtHisUsu_Enabled ;
   private int edtHisHorReo_Enabled ;
   private int edtHisNomCli_Enabled ;
   private int A8890HisNumCli ;
   private int edtHisNumCli_Enabled ;
   private int A12949HisOpecod ;
   private int edtHisOpecod_Enabled ;
   private int edtHisOpeTur_Enabled ;
   private int edtHisMtsCarg_Enabled ;
   private int edtHisMtsImp_Enabled ;
   private int edtHisPreCarg_Enabled ;
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
   private int edtHisPreCarg_Backcolor ;
   private int edtHisMtsImp_Backcolor ;
   private int edtHisMtsCarg_Backcolor ;
   private int edtHisOpeTur_Backcolor ;
   private int edtHisOpecod_Backcolor ;
   private int edtHisNumCli_Backcolor ;
   private int edtHisNomCli_Backcolor ;
   private int edtHisHorReo_Backcolor ;
   private int edtHisUsu_Backcolor ;
   private int edtRps_Dsc_Backcolor ;
   private int edtRps_Cod_Backcolor ;
   private int edtHisAdeObs_Backcolor ;
   private int edtHisAdEAcCt_Backcolor ;
   private int edtHisAdEAcCo_Backcolor ;
   private int edtHisAcCot_Backcolor ;
   private int edtHisAcCo_Backcolor ;
   private int edtTipCorDsc_Backcolor ;
   private int edtTipCorCod_Backcolor ;
   private int edtMaqDsc_Backcolor ;
   private int edtTipDefDsc_Backcolor ;
   private int edtDscCausa_Backcolor ;
   private int edtCodCausa_Backcolor ;
   private int edtHisReoDsc_Backcolor ;
   private int edtHisReoPza_Backcolor ;
   private int edtHisReoTn_Backcolor ;
   private int edtHisEstReo_Backcolor ;
   private int edtHisOrdReo_Backcolor ;
   private int edtHisMtrOri_Backcolor ;
   private int edtHisKgmOri_Backcolor ;
   private int edtHisReoFec_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtHisBarMtr_Backcolor ;
   private int edtHisBarKgm_Backcolor ;
   private int edtHisNumPie_Backcolor ;
   private int edtHisTipCol_Backcolor ;
   private int edtHisColNum_Backcolor ;
   private int edtHisColNom_Backcolor ;
   private int edtHisBarSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtHisTipArt_Backcolor ;
   private int edtTipDefCod_Backcolor ;
   private int edtHisCodPar_Backcolor ;
   private int edtHisCodReo_Backcolor ;
   private int edtHisBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ539HisBarCod ;
   private int ZZ252CliCod ;
   private int ZZ547HisColNum ;
   private int ZZ2297HisReoTn ;
   private int ZZ8890HisNumCli ;
   private int ZZ12949HisOpecod ;
   private java.math.BigDecimal Z540HisBarKgm ;
   private java.math.BigDecimal Z541HisBarMtr ;
   private java.math.BigDecimal Z549HisKgmOri ;
   private java.math.BigDecimal Z552HisMtrOri ;
   private java.math.BigDecimal Z13015HisMtsCarg ;
   private java.math.BigDecimal Z13016HisMtsImp ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A552HisMtrOri ;
   private java.math.BigDecimal A13015HisMtsCarg ;
   private java.math.BigDecimal A13016HisMtsImp ;
   private java.math.BigDecimal A13017HisPreCarg ;
   private java.math.BigDecimal A13699CostCausa ;
   private java.math.BigDecimal A13700HisreoValo ;
   private java.math.BigDecimal Z13699CostCausa ;
   private java.math.BigDecimal Z13700HisreoValo ;
   private java.math.BigDecimal Z13017HisPreCarg ;
   private java.math.BigDecimal ZZ540HisBarKgm ;
   private java.math.BigDecimal ZZ541HisBarMtr ;
   private java.math.BigDecimal ZZ549HisKgmOri ;
   private java.math.BigDecimal ZZ552HisMtrOri ;
   private java.math.BigDecimal ZZ13015HisMtsCarg ;
   private java.math.BigDecimal ZZ13016HisMtsImp ;
   private java.math.BigDecimal ZZ13699CostCausa ;
   private java.math.BigDecimal ZZ13700HisreoValo ;
   private java.math.BigDecimal ZZ13017HisPreCarg ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z544HisCodPar ;
   private String Z542HisBarSer ;
   private String Z546HisColNom ;
   private String Z2298HisReoPza ;
   private String Z2299HisReoDsc ;
   private String Z6668HisAdeSN ;
   private String Z8414HisUsu ;
   private String Z8889HisNomCli ;
   private String Z13698HisreoLote ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A6668HisAdeSN ;
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
   private String edtHisBarCod_Internalname ;
   private String edtHisBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtHisCodReo_Internalname ;
   private String edtHisCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHisCodPar_Internalname ;
   private String A544HisCodPar ;
   private String edtHisCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTipDefCod_Internalname ;
   private String edtTipDefCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtHisTipArt_Internalname ;
   private String edtHisTipArt_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtHisBarSer_Internalname ;
   private String A542HisBarSer ;
   private String edtHisBarSer_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtHisColNom_Internalname ;
   private String A546HisColNom ;
   private String edtHisColNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtHisColNum_Internalname ;
   private String edtHisColNum_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtHisTipCol_Internalname ;
   private String edtHisTipCol_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtHisNumPie_Internalname ;
   private String edtHisNumPie_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtHisBarKgm_Internalname ;
   private String edtHisBarKgm_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtHisBarMtr_Internalname ;
   private String edtHisBarMtr_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtHisReoFec_Internalname ;
   private String edtHisReoFec_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtHisKgmOri_Internalname ;
   private String edtHisKgmOri_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtHisMtrOri_Internalname ;
   private String edtHisMtrOri_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtHisOrdReo_Internalname ;
   private String edtHisOrdReo_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtHisEstReo_Internalname ;
   private String edtHisEstReo_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtHisReoTn_Internalname ;
   private String edtHisReoTn_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtHisReoPza_Internalname ;
   private String A2298HisReoPza ;
   private String edtHisReoPza_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtHisReoDsc_Internalname ;
   private String A2299HisReoDsc ;
   private String edtHisReoDsc_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtCodCausa_Internalname ;
   private String edtCodCausa_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtDscCausa_Internalname ;
   private String A5086DscCausa ;
   private String edtDscCausa_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtTipDefDsc_Internalname ;
   private String A834TipDefDsc ;
   private String edtTipDefDsc_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtTipCorCod_Internalname ;
   private String edtTipCorCod_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtTipCorDsc_Internalname ;
   private String A5197TipCorDsc ;
   private String edtTipCorDsc_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtHisAcCo_Internalname ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtHisAcCot_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtHisAdEAcCo_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtHisAdEAcCt_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtHisAdeObs_Internalname ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtRps_Cod_Internalname ;
   private String edtRps_Cod_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtRps_Dsc_Internalname ;
   private String A7001Rps_Dsc ;
   private String edtRps_Dsc_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtHisUsu_Internalname ;
   private String A8414HisUsu ;
   private String edtHisUsu_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtHisHorReo_Internalname ;
   private String edtHisHorReo_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtHisNomCli_Internalname ;
   private String A8889HisNomCli ;
   private String edtHisNomCli_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtHisNumCli_Internalname ;
   private String edtHisNumCli_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtHisOpecod_Internalname ;
   private String edtHisOpecod_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtHisOpeTur_Internalname ;
   private String edtHisOpeTur_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtHisMtsCarg_Internalname ;
   private String edtHisMtsCarg_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtHisMtsImp_Internalname ;
   private String edtHisMtsImp_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtHisPreCarg_Internalname ;
   private String edtHisPreCarg_Jsonclick ;
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
   private String A13698HisreoLote ;
   private String Gx_mode ;
   private String A13697HisReoHDR ;
   private String A13843HisTipArtD ;
   private String A13844HisTipColD ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z834TipDefDsc ;
   private String Z13843HisTipArtD ;
   private String Z279CliNom ;
   private String Z13844HisTipColD ;
   private String Z606MaqDsc ;
   private String Z5086DscCausa ;
   private String Z5197TipCorDsc ;
   private String Z7001Rps_Dsc ;
   private String sMode60 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13697HisReoHDR ;
   private String ZZ396EmprCod ;
   private String ZZ544HisCodPar ;
   private String ZZ542HisBarSer ;
   private String ZZ546HisColNom ;
   private String ZZ602MaqCod ;
   private String ZZ2298HisReoPza ;
   private String ZZ2299HisReoDsc ;
   private String ZZ6668HisAdeSN ;
   private String ZZ8414HisUsu ;
   private String ZZ8889HisNomCli ;
   private String ZZ13698HisreoLote ;
   private String ZZ279CliNom ;
   private String ZZ606MaqDsc ;
   private String ZZ13843HisTipArtD ;
   private String ZZ13844HisTipColD ;
   private String ZZ5086DscCausa ;
   private String ZZ5197TipCorDsc ;
   private String ZZ7001Rps_Dsc ;
   private String ZZ13697HisReoHDR ;
   private String ZZ834TipDefDsc ;
   private java.util.Date Z8567HisHorReo ;
   private java.util.Date A8567HisHorReo ;
   private java.util.Date ZZ8567HisHorReo ;
   private java.util.Date Z569HisReoFec ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date ZZ569HisReoFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n602MaqCod ;
   private boolean n571HisTipArt ;
   private boolean n572HisTipCol ;
   private boolean n5085CodCausa ;
   private boolean n5196TipCorCod ;
   private boolean n7000Rps_Cod ;
   private boolean wbErr ;
   private boolean n6668HisAdeSN ;
   private boolean n13698HisreoLote ;
   private boolean n13699CostCausa ;
   private boolean n13843HisTipArtD ;
   private boolean n13844HisTipColD ;
   private boolean n542HisBarSer ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n553HisNumPie ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n569HisReoFec ;
   private boolean n549HisKgmOri ;
   private boolean n552HisMtrOri ;
   private boolean n554HisOrdReo ;
   private boolean n548HisEstReo ;
   private boolean n2297HisReoTn ;
   private boolean n2298HisReoPza ;
   private boolean n2299HisReoDsc ;
   private boolean n5086DscCausa ;
   private boolean n834TipDefDsc ;
   private boolean n606MaqDsc ;
   private boolean n5197TipCorDsc ;
   private boolean n5662HisAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5695HisAdEAcCt ;
   private boolean n6669HisAdeObs ;
   private boolean n7001Rps_Dsc ;
   private boolean n8414HisUsu ;
   private boolean n8567HisHorReo ;
   private boolean n8889HisNomCli ;
   private boolean n8890HisNumCli ;
   private boolean n12949HisOpecod ;
   private boolean n12950HisOpeTur ;
   private boolean n13015HisMtsCarg ;
   private boolean n13016HisMtsImp ;
   private boolean Gx_longc ;
   private String Z5662HisAcCo ;
   private String Z5693HisAcCot ;
   private String Z5694HisAdEAcCo ;
   private String Z5695HisAdEAcCt ;
   private String Z6669HisAdeObs ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String A6669HisAdeObs ;
   private String ZZ5662HisAcCo ;
   private String ZZ5693HisAcCot ;
   private String ZZ5694HisAdEAcCo ;
   private String ZZ5695HisAdEAcCt ;
   private String ZZ6669HisAdeObs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkHisAdeSN ;
   private IDataStoreProvider pr_default ;
   private int[] T001A12_A539HisBarCod ;
   private byte[] T001A12_A545HisCodReo ;
   private String[] T001A12_A544HisCodPar ;
   private String[] T001A12_A13843HisTipArtD ;
   private boolean[] T001A12_n13843HisTipArtD ;
   private String[] T001A12_A279CliNom ;
   private String[] T001A12_A542HisBarSer ;
   private boolean[] T001A12_n542HisBarSer ;
   private String[] T001A12_A546HisColNom ;
   private boolean[] T001A12_n546HisColNom ;
   private int[] T001A12_A547HisColNum ;
   private boolean[] T001A12_n547HisColNum ;
   private String[] T001A12_A13844HisTipColD ;
   private boolean[] T001A12_n13844HisTipColD ;
   private short[] T001A12_A553HisNumPie ;
   private boolean[] T001A12_n553HisNumPie ;
   private java.math.BigDecimal[] T001A12_A540HisBarKgm ;
   private boolean[] T001A12_n540HisBarKgm ;
   private java.math.BigDecimal[] T001A12_A541HisBarMtr ;
   private boolean[] T001A12_n541HisBarMtr ;
   private java.util.Date[] T001A12_A569HisReoFec ;
   private boolean[] T001A12_n569HisReoFec ;
   private java.math.BigDecimal[] T001A12_A549HisKgmOri ;
   private boolean[] T001A12_n549HisKgmOri ;
   private java.math.BigDecimal[] T001A12_A552HisMtrOri ;
   private boolean[] T001A12_n552HisMtrOri ;
   private byte[] T001A12_A554HisOrdReo ;
   private boolean[] T001A12_n554HisOrdReo ;
   private byte[] T001A12_A548HisEstReo ;
   private boolean[] T001A12_n548HisEstReo ;
   private int[] T001A12_A2297HisReoTn ;
   private boolean[] T001A12_n2297HisReoTn ;
   private String[] T001A12_A2298HisReoPza ;
   private boolean[] T001A12_n2298HisReoPza ;
   private String[] T001A12_A2299HisReoDsc ;
   private boolean[] T001A12_n2299HisReoDsc ;
   private String[] T001A12_A5086DscCausa ;
   private boolean[] T001A12_n5086DscCausa ;
   private String[] T001A12_A834TipDefDsc ;
   private boolean[] T001A12_n834TipDefDsc ;
   private String[] T001A12_A606MaqDsc ;
   private boolean[] T001A12_n606MaqDsc ;
   private String[] T001A12_A5197TipCorDsc ;
   private boolean[] T001A12_n5197TipCorDsc ;
   private String[] T001A12_A5662HisAcCo ;
   private boolean[] T001A12_n5662HisAcCo ;
   private String[] T001A12_A5693HisAcCot ;
   private boolean[] T001A12_n5693HisAcCot ;
   private String[] T001A12_A5694HisAdEAcCo ;
   private boolean[] T001A12_n5694HisAdEAcCo ;
   private String[] T001A12_A5695HisAdEAcCt ;
   private boolean[] T001A12_n5695HisAdEAcCt ;
   private String[] T001A12_A6668HisAdeSN ;
   private boolean[] T001A12_n6668HisAdeSN ;
   private String[] T001A12_A6669HisAdeObs ;
   private boolean[] T001A12_n6669HisAdeObs ;
   private String[] T001A12_A7001Rps_Dsc ;
   private boolean[] T001A12_n7001Rps_Dsc ;
   private String[] T001A12_A8414HisUsu ;
   private boolean[] T001A12_n8414HisUsu ;
   private java.util.Date[] T001A12_A8567HisHorReo ;
   private boolean[] T001A12_n8567HisHorReo ;
   private String[] T001A12_A8889HisNomCli ;
   private boolean[] T001A12_n8889HisNomCli ;
   private int[] T001A12_A8890HisNumCli ;
   private boolean[] T001A12_n8890HisNumCli ;
   private int[] T001A12_A12949HisOpecod ;
   private boolean[] T001A12_n12949HisOpecod ;
   private byte[] T001A12_A12950HisOpeTur ;
   private boolean[] T001A12_n12950HisOpeTur ;
   private java.math.BigDecimal[] T001A12_A13015HisMtsCarg ;
   private boolean[] T001A12_n13015HisMtsCarg ;
   private java.math.BigDecimal[] T001A12_A13016HisMtsImp ;
   private boolean[] T001A12_n13016HisMtsImp ;
   private String[] T001A12_A13698HisreoLote ;
   private boolean[] T001A12_n13698HisreoLote ;
   private java.math.BigDecimal[] T001A12_A13699CostCausa ;
   private boolean[] T001A12_n13699CostCausa ;
   private String[] T001A12_A396EmprCod ;
   private int[] T001A12_A252CliCod ;
   private boolean[] T001A12_n252CliCod ;
   private String[] T001A12_A602MaqCod ;
   private boolean[] T001A12_n602MaqCod ;
   private short[] T001A12_A571HisTipArt ;
   private boolean[] T001A12_n571HisTipArt ;
   private byte[] T001A12_A572HisTipCol ;
   private boolean[] T001A12_n572HisTipCol ;
   private short[] T001A12_A833TipDefCod ;
   private short[] T001A12_A5085CodCausa ;
   private boolean[] T001A12_n5085CodCausa ;
   private short[] T001A12_A5196TipCorCod ;
   private boolean[] T001A12_n5196TipCorCod ;
   private short[] T001A12_A7000Rps_Cod ;
   private boolean[] T001A12_n7000Rps_Cod ;
   private String[] T001A4_A279CliNom ;
   private String[] T001A5_A606MaqDsc ;
   private boolean[] T001A5_n606MaqDsc ;
   private String[] T001A6_A13843HisTipArtD ;
   private boolean[] T001A6_n13843HisTipArtD ;
   private String[] T001A7_A13844HisTipColD ;
   private boolean[] T001A7_n13844HisTipColD ;
   private String[] T001A9_A5086DscCausa ;
   private boolean[] T001A9_n5086DscCausa ;
   private java.math.BigDecimal[] T001A9_A13699CostCausa ;
   private boolean[] T001A9_n13699CostCausa ;
   private String[] T001A10_A5197TipCorDsc ;
   private boolean[] T001A10_n5197TipCorDsc ;
   private String[] T001A11_A7001Rps_Dsc ;
   private boolean[] T001A11_n7001Rps_Dsc ;
   private String[] T001A8_A834TipDefDsc ;
   private boolean[] T001A8_n834TipDefDsc ;
   private String[] T001A13_A279CliNom ;
   private String[] T001A14_A606MaqDsc ;
   private boolean[] T001A14_n606MaqDsc ;
   private String[] T001A15_A13843HisTipArtD ;
   private boolean[] T001A15_n13843HisTipArtD ;
   private String[] T001A16_A13844HisTipColD ;
   private boolean[] T001A16_n13844HisTipColD ;
   private String[] T001A17_A5086DscCausa ;
   private boolean[] T001A17_n5086DscCausa ;
   private java.math.BigDecimal[] T001A17_A13699CostCausa ;
   private boolean[] T001A17_n13699CostCausa ;
   private String[] T001A18_A5197TipCorDsc ;
   private boolean[] T001A18_n5197TipCorDsc ;
   private String[] T001A19_A7001Rps_Dsc ;
   private boolean[] T001A19_n7001Rps_Dsc ;
   private String[] T001A20_A834TipDefDsc ;
   private boolean[] T001A20_n834TipDefDsc ;
   private String[] T001A21_A396EmprCod ;
   private int[] T001A21_A539HisBarCod ;
   private byte[] T001A21_A545HisCodReo ;
   private String[] T001A21_A544HisCodPar ;
   private short[] T001A21_A833TipDefCod ;
   private int[] T001A3_A539HisBarCod ;
   private byte[] T001A3_A545HisCodReo ;
   private String[] T001A3_A544HisCodPar ;
   private String[] T001A3_A542HisBarSer ;
   private boolean[] T001A3_n542HisBarSer ;
   private String[] T001A3_A546HisColNom ;
   private boolean[] T001A3_n546HisColNom ;
   private int[] T001A3_A547HisColNum ;
   private boolean[] T001A3_n547HisColNum ;
   private short[] T001A3_A553HisNumPie ;
   private boolean[] T001A3_n553HisNumPie ;
   private java.math.BigDecimal[] T001A3_A540HisBarKgm ;
   private boolean[] T001A3_n540HisBarKgm ;
   private java.math.BigDecimal[] T001A3_A541HisBarMtr ;
   private boolean[] T001A3_n541HisBarMtr ;
   private java.util.Date[] T001A3_A569HisReoFec ;
   private boolean[] T001A3_n569HisReoFec ;
   private java.math.BigDecimal[] T001A3_A549HisKgmOri ;
   private boolean[] T001A3_n549HisKgmOri ;
   private java.math.BigDecimal[] T001A3_A552HisMtrOri ;
   private boolean[] T001A3_n552HisMtrOri ;
   private byte[] T001A3_A554HisOrdReo ;
   private boolean[] T001A3_n554HisOrdReo ;
   private byte[] T001A3_A548HisEstReo ;
   private boolean[] T001A3_n548HisEstReo ;
   private int[] T001A3_A2297HisReoTn ;
   private boolean[] T001A3_n2297HisReoTn ;
   private String[] T001A3_A2298HisReoPza ;
   private boolean[] T001A3_n2298HisReoPza ;
   private String[] T001A3_A2299HisReoDsc ;
   private boolean[] T001A3_n2299HisReoDsc ;
   private String[] T001A3_A5662HisAcCo ;
   private boolean[] T001A3_n5662HisAcCo ;
   private String[] T001A3_A5693HisAcCot ;
   private boolean[] T001A3_n5693HisAcCot ;
   private String[] T001A3_A5694HisAdEAcCo ;
   private boolean[] T001A3_n5694HisAdEAcCo ;
   private String[] T001A3_A5695HisAdEAcCt ;
   private boolean[] T001A3_n5695HisAdEAcCt ;
   private String[] T001A3_A6668HisAdeSN ;
   private boolean[] T001A3_n6668HisAdeSN ;
   private String[] T001A3_A6669HisAdeObs ;
   private boolean[] T001A3_n6669HisAdeObs ;
   private String[] T001A3_A8414HisUsu ;
   private boolean[] T001A3_n8414HisUsu ;
   private java.util.Date[] T001A3_A8567HisHorReo ;
   private boolean[] T001A3_n8567HisHorReo ;
   private String[] T001A3_A8889HisNomCli ;
   private boolean[] T001A3_n8889HisNomCli ;
   private int[] T001A3_A8890HisNumCli ;
   private boolean[] T001A3_n8890HisNumCli ;
   private int[] T001A3_A12949HisOpecod ;
   private boolean[] T001A3_n12949HisOpecod ;
   private byte[] T001A3_A12950HisOpeTur ;
   private boolean[] T001A3_n12950HisOpeTur ;
   private java.math.BigDecimal[] T001A3_A13015HisMtsCarg ;
   private boolean[] T001A3_n13015HisMtsCarg ;
   private java.math.BigDecimal[] T001A3_A13016HisMtsImp ;
   private boolean[] T001A3_n13016HisMtsImp ;
   private String[] T001A3_A13698HisreoLote ;
   private boolean[] T001A3_n13698HisreoLote ;
   private String[] T001A3_A396EmprCod ;
   private int[] T001A3_A252CliCod ;
   private boolean[] T001A3_n252CliCod ;
   private String[] T001A3_A602MaqCod ;
   private boolean[] T001A3_n602MaqCod ;
   private short[] T001A3_A571HisTipArt ;
   private boolean[] T001A3_n571HisTipArt ;
   private byte[] T001A3_A572HisTipCol ;
   private boolean[] T001A3_n572HisTipCol ;
   private short[] T001A3_A833TipDefCod ;
   private short[] T001A3_A5085CodCausa ;
   private boolean[] T001A3_n5085CodCausa ;
   private short[] T001A3_A5196TipCorCod ;
   private boolean[] T001A3_n5196TipCorCod ;
   private short[] T001A3_A7000Rps_Cod ;
   private boolean[] T001A3_n7000Rps_Cod ;
   private String[] T001A22_A396EmprCod ;
   private int[] T001A22_A539HisBarCod ;
   private byte[] T001A22_A545HisCodReo ;
   private String[] T001A22_A544HisCodPar ;
   private short[] T001A22_A833TipDefCod ;
   private String[] T001A23_A396EmprCod ;
   private int[] T001A23_A539HisBarCod ;
   private byte[] T001A23_A545HisCodReo ;
   private String[] T001A23_A544HisCodPar ;
   private short[] T001A23_A833TipDefCod ;
   private int[] T001A2_A539HisBarCod ;
   private byte[] T001A2_A545HisCodReo ;
   private String[] T001A2_A544HisCodPar ;
   private String[] T001A2_A542HisBarSer ;
   private boolean[] T001A2_n542HisBarSer ;
   private String[] T001A2_A546HisColNom ;
   private boolean[] T001A2_n546HisColNom ;
   private int[] T001A2_A547HisColNum ;
   private boolean[] T001A2_n547HisColNum ;
   private short[] T001A2_A553HisNumPie ;
   private boolean[] T001A2_n553HisNumPie ;
   private java.math.BigDecimal[] T001A2_A540HisBarKgm ;
   private boolean[] T001A2_n540HisBarKgm ;
   private java.math.BigDecimal[] T001A2_A541HisBarMtr ;
   private boolean[] T001A2_n541HisBarMtr ;
   private java.util.Date[] T001A2_A569HisReoFec ;
   private boolean[] T001A2_n569HisReoFec ;
   private java.math.BigDecimal[] T001A2_A549HisKgmOri ;
   private boolean[] T001A2_n549HisKgmOri ;
   private java.math.BigDecimal[] T001A2_A552HisMtrOri ;
   private boolean[] T001A2_n552HisMtrOri ;
   private byte[] T001A2_A554HisOrdReo ;
   private boolean[] T001A2_n554HisOrdReo ;
   private byte[] T001A2_A548HisEstReo ;
   private boolean[] T001A2_n548HisEstReo ;
   private int[] T001A2_A2297HisReoTn ;
   private boolean[] T001A2_n2297HisReoTn ;
   private String[] T001A2_A2298HisReoPza ;
   private boolean[] T001A2_n2298HisReoPza ;
   private String[] T001A2_A2299HisReoDsc ;
   private boolean[] T001A2_n2299HisReoDsc ;
   private String[] T001A2_A5662HisAcCo ;
   private boolean[] T001A2_n5662HisAcCo ;
   private String[] T001A2_A5693HisAcCot ;
   private boolean[] T001A2_n5693HisAcCot ;
   private String[] T001A2_A5694HisAdEAcCo ;
   private boolean[] T001A2_n5694HisAdEAcCo ;
   private String[] T001A2_A5695HisAdEAcCt ;
   private boolean[] T001A2_n5695HisAdEAcCt ;
   private String[] T001A2_A6668HisAdeSN ;
   private boolean[] T001A2_n6668HisAdeSN ;
   private String[] T001A2_A6669HisAdeObs ;
   private boolean[] T001A2_n6669HisAdeObs ;
   private String[] T001A2_A8414HisUsu ;
   private boolean[] T001A2_n8414HisUsu ;
   private java.util.Date[] T001A2_A8567HisHorReo ;
   private boolean[] T001A2_n8567HisHorReo ;
   private String[] T001A2_A8889HisNomCli ;
   private boolean[] T001A2_n8889HisNomCli ;
   private int[] T001A2_A8890HisNumCli ;
   private boolean[] T001A2_n8890HisNumCli ;
   private int[] T001A2_A12949HisOpecod ;
   private boolean[] T001A2_n12949HisOpecod ;
   private byte[] T001A2_A12950HisOpeTur ;
   private boolean[] T001A2_n12950HisOpeTur ;
   private java.math.BigDecimal[] T001A2_A13015HisMtsCarg ;
   private boolean[] T001A2_n13015HisMtsCarg ;
   private java.math.BigDecimal[] T001A2_A13016HisMtsImp ;
   private boolean[] T001A2_n13016HisMtsImp ;
   private String[] T001A2_A13698HisreoLote ;
   private boolean[] T001A2_n13698HisreoLote ;
   private String[] T001A2_A396EmprCod ;
   private int[] T001A2_A252CliCod ;
   private boolean[] T001A2_n252CliCod ;
   private String[] T001A2_A602MaqCod ;
   private boolean[] T001A2_n602MaqCod ;
   private short[] T001A2_A571HisTipArt ;
   private boolean[] T001A2_n571HisTipArt ;
   private byte[] T001A2_A572HisTipCol ;
   private boolean[] T001A2_n572HisTipCol ;
   private short[] T001A2_A833TipDefCod ;
   private short[] T001A2_A5085CodCausa ;
   private boolean[] T001A2_n5085CodCausa ;
   private short[] T001A2_A5196TipCorCod ;
   private boolean[] T001A2_n5196TipCorCod ;
   private short[] T001A2_A7000Rps_Cod ;
   private boolean[] T001A2_n7000Rps_Cod ;
   private String[] T001A27_A834TipDefDsc ;
   private boolean[] T001A27_n834TipDefDsc ;
   private String[] T001A28_A13843HisTipArtD ;
   private boolean[] T001A28_n13843HisTipArtD ;
   private String[] T001A29_A279CliNom ;
   private String[] T001A30_A13844HisTipColD ;
   private boolean[] T001A30_n13844HisTipColD ;
   private String[] T001A31_A606MaqDsc ;
   private boolean[] T001A31_n606MaqDsc ;
   private String[] T001A32_A5086DscCausa ;
   private boolean[] T001A32_n5086DscCausa ;
   private java.math.BigDecimal[] T001A32_A13699CostCausa ;
   private boolean[] T001A32_n13699CostCausa ;
   private String[] T001A33_A5197TipCorDsc ;
   private boolean[] T001A33_n5197TipCorDsc ;
   private String[] T001A34_A7001Rps_Dsc ;
   private boolean[] T001A34_n7001Rps_Dsc ;
   private String[] T001A35_A396EmprCod ;
   private int[] T001A35_A539HisBarCod ;
   private byte[] T001A35_A545HisCodReo ;
   private String[] T001A35_A544HisCodPar ;
   private short[] T001A35_A833TipDefCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thisreo__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisreo__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisreo__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisreo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001A2", "SELECT HisBarCod, HisCodReo, HisCodPar, HisBarSer, HisColNom, HisColNum, HisNumPie, HisBarKgm, HisBarMtr, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoPza, HisReoDsc, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote, EmprCod, CliCod, MaqCod, HisTipArt, HisTipCol, TipDefCod, CodCausa, TipCorCod, Rps_Cod FROM TXPHISREO WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ?  FOR UPDATE OF HisBarSer, HisColNom, HisColNum, HisNumPie, HisBarKgm, HisBarMtr, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoPza, HisReoDsc, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote, CliCod, MaqCod, HisTipArt, HisTipCol, CodCausa, TipCorCod, Rps_Cod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A3", "SELECT HisBarCod, HisCodReo, HisCodPar, HisBarSer, HisColNom, HisColNum, HisNumPie, HisBarKgm, HisBarMtr, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoPza, HisReoDsc, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote, EmprCod, CliCod, MaqCod, HisTipArt, HisTipCol, TipDefCod, CodCausa, TipCorCod, Rps_Cod FROM TXPHISREO WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A4", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A5", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A6", "SELECT TipArtDsc AS HisTipArtD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A7", "SELECT TipColDsc AS HisTipColD FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A8", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A9", "SELECT DscCausa, CostCausa FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A10", "SELECT TipCorDsc FROM TXPCORTIP WHERE EmprCod = ? AND TipCorCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A11", "SELECT Rps_Dsc FROM TXPCODRPS WHERE EmprCod = ? AND Rps_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A12", "SELECT /*+ FIRST_ROWS(100) */ TM1.HisBarCod, TM1.HisCodReo, TM1.HisCodPar, T3.TipArtDsc AS HisTipArtD, T4.CliNom, TM1.HisBarSer, TM1.HisColNom, TM1.HisColNum, T5.TipColDsc AS HisTipColD, TM1.HisNumPie, TM1.HisBarKgm, TM1.HisBarMtr, TM1.HisReoFec, TM1.HisKgmOri, TM1.HisMtrOri, TM1.HisOrdReo, TM1.HisEstReo, TM1.HisReoTn, TM1.HisReoPza, TM1.HisReoDsc, T7.DscCausa, T2.TipDefDsc, T6.MaqDsc, T8.TipCorDsc, TM1.HisAcCo, TM1.HisAcCot, TM1.HisAdEAcCo, TM1.HisAdEAcCt, TM1.HisAdeSN, TM1.HisAdeObs, T9.Rps_Dsc, TM1.HisUsu, TM1.HisHorReo, TM1.HisNomCli, TM1.HisNumCli, TM1.HisOpecod, TM1.HisOpeTur, TM1.HisMtsCarg, TM1.HisMtsImp, TM1.HisreoLote, T7.CostCausa, TM1.EmprCod, TM1.CliCod, TM1.MaqCod, TM1.HisTipArt AS HisTipArt, TM1.HisTipCol AS HisTipCol, TM1.TipDefCod, TM1.CodCausa, TM1.TipCorCod, TM1.Rps_Cod FROM ((((((((TXPHISREO TM1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = TM1.EmprCod AND T2.TipDefCod = TM1.TipDefCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipArtCod = TM1.HisTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod) LEFT JOIN TXPTIPCOL T5 ON T5.EmprCod = TM1.EmprCod AND T5.TipColCod = TM1.HisTipCol) LEFT JOIN TXPMAQUIN T6 ON T6.EmprCod = TM1.EmprCod AND T6.MaqCod = TM1.MaqCod) LEFT JOIN TXPTIPCAU T7 ON T7.EmprCod = TM1.EmprCod AND T7.CodCausa = TM1.CodCausa) LEFT JOIN TXPCORTIP T8 ON T8.EmprCod = TM1.EmprCod AND T8.TipCorCod = TM1.TipCorCod) LEFT JOIN TXPCODRPS T9 ON T9.EmprCod = TM1.EmprCod AND T9.Rps_Cod = TM1.Rps_Cod) WHERE TM1.EmprCod = ? and TM1.HisBarCod = ? and TM1.HisCodReo = ? and TM1.HisCodPar = ? and TM1.TipDefCod = ? ORDER BY TM1.EmprCod, TM1.HisBarCod, TM1.HisCodReo, TM1.HisCodPar, TM1.TipDefCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A13", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A14", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A15", "SELECT TipArtDsc AS HisTipArtD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A16", "SELECT TipColDsc AS HisTipColD FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A17", "SELECT DscCausa, CostCausa FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A18", "SELECT TipCorDsc FROM TXPCORTIP WHERE EmprCod = ? AND TipCorCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A19", "SELECT Rps_Dsc FROM TXPCODRPS WHERE EmprCod = ? AND Rps_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A20", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A21", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE ( EmprCod > ? or EmprCod = ? and HisBarCod > ? or HisBarCod = ? and EmprCod = ? and HisCodReo > ? or HisCodReo = ? and HisBarCod = ? and EmprCod = ? and HisCodPar > ? or HisCodPar = ? and HisCodReo = ? and HisBarCod = ? and EmprCod = ? and TipDefCod > ?) ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001A23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE ( EmprCod < ? or EmprCod = ? and HisBarCod < ? or HisBarCod = ? and EmprCod = ? and HisCodReo < ? or HisCodReo = ? and HisBarCod = ? and EmprCod = ? and HisCodPar < ? or HisCodPar = ? and HisCodReo = ? and HisBarCod = ? and EmprCod = ? and TipDefCod < ?) ORDER BY EmprCod DESC, HisBarCod DESC, HisCodReo DESC, HisCodPar DESC, TipDefCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001A24", "INSERT INTO TXPHISREO(HisBarCod, HisCodReo, HisCodPar, HisBarSer, HisColNom, HisColNum, HisNumPie, HisBarKgm, HisBarMtr, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoPza, HisReoDsc, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote, EmprCod, CliCod, MaqCod, HisTipArt, HisTipCol, TipDefCod, CodCausa, TipCorCod, Rps_Cod, Hisoperar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPHISREO")
         ,new UpdateCursor("T001A25", "UPDATE TXPHISREO SET HisBarSer=?, HisColNom=?, HisColNum=?, HisNumPie=?, HisBarKgm=?, HisBarMtr=?, HisReoFec=?, HisKgmOri=?, HisMtrOri=?, HisOrdReo=?, HisEstReo=?, HisReoTn=?, HisReoPza=?, HisReoDsc=?, HisAcCo=?, HisAcCot=?, HisAdEAcCo=?, HisAdEAcCt=?, HisAdeSN=?, HisAdeObs=?, HisUsu=?, HisHorReo=?, HisNomCli=?, HisNumCli=?, HisOpecod=?, HisOpeTur=?, HisMtsCarg=?, HisMtsImp=?, HisreoLote=?, CliCod=?, MaqCod=?, HisTipArt=?, HisTipCol=?, CodCausa=?, TipCorCod=?, Rps_Cod=?  WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ?", GX_NOMASK, "TXPHISREO")
         ,new UpdateCursor("T001A26", "DELETE FROM TXPHISREO  WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ?", GX_NOMASK, "TXPHISREO")
         ,new ForEachCursor("T001A27", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A28", "SELECT TipArtDsc AS HisTipArtD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A29", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A30", "SELECT TipColDsc AS HisTipColD FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A31", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A32", "SELECT DscCausa, CostCausa FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A33", "SELECT TipCorDsc FROM TXPCORTIP WHERE EmprCod = ? AND TipCorCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A34", "SELECT Rps_Dsc FROM TXPCODRPS WHERE EmprCod = ? AND Rps_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001A35", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 9);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = GXutil.resetDate(rslt.getGXDateTime(25));
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 13);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 3);
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((byte[]) buf[68])[0] = rslt.getByte(37);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(38);
               ((short[]) buf[71])[0] = rslt.getShort(39);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(40);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(41);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 9);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = GXutil.resetDate(rslt.getGXDateTime(25));
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 13);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 3);
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((byte[]) buf[68])[0] = rslt.getByte(37);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(38);
               ((short[]) buf[71])[0] = rslt.getShort(39);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(40);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(41);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 9);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 60);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 16);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 60);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 40);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 8);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[60])[0] = GXutil.resetDate(rslt.getGXDateTime(33));
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 13);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((int[]) buf[66])[0] = rslt.getInt(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((byte[]) buf[68])[0] = rslt.getByte(37);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 20);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(41,3);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(42, 3);
               ((int[]) buf[79])[0] = rslt.getInt(43);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(44, 6);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(45);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((byte[]) buf[85])[0] = rslt.getByte(46);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(47);
               ((short[]) buf[88])[0] = rslt.getShort(48);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((short[]) buf[90])[0] = rslt.getShort(49);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((short[]) buf[92])[0] = rslt.getShort(50);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
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
            case 12 :
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
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 9);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 26);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 3276);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 2000);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 2000);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 2000);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[42], 2000);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 8);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[46], true);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[48], 13);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[50]).intValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[52]).intValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[54]).byteValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[60], 20);
               }
               stmt.setString(33, (String)parms[61], 3);
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[63]).intValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[65], 6);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[69]).byteValue());
               }
               stmt.setShort(38, ((Number) parms[70]).shortValue());
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(39, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[74]).shortValue());
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[76]).shortValue());
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 9);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 26);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 3276);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 2000);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 2000);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 2000);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 2000);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 8);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], true);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 13);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[47]).intValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[51]).byteValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 20);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[59]).intValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 6);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(33, ((Number) parms[65]).byteValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[71]).shortValue());
               }
               stmt.setString(37, (String)parms[72], 3);
               stmt.setInt(38, ((Number) parms[73]).intValue());
               stmt.setByte(39, ((Number) parms[74]).byteValue());
               stmt.setString(40, (String)parms[75], 1);
               stmt.setShort(41, ((Number) parms[76]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 29 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 31 :
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
            case 32 :
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
      }
   }

}

