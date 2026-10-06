package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trcnc01_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A252CliCod) ;
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
            A10715RcNcFec = localUtil.parseDateParm( httpContext.GetPar( "RcNcFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            A10717RcNcLin = (int)(GXutil.lval( httpContext.GetPar( "RcNcLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MODIFICO VALORES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRcNcN1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public trcnc01_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trcnc01_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trcnc01_impl.class ));
   }

   public trcnc01_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRCNC01.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha Mov", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtRcNcFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcFec_Internalname, localUtil.format(A10715RcNcFec, "99/99/99"), localUtil.format( A10715RcNcFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcFec_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC01.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRcNcFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRcNcFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRCNC01.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcLin_Internalname, GXutil.ltrim( localUtil.ntoc( A10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRcNcLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10717RcNcLin), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10717RcNcLin), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcLin_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcLin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "N Fact Credito", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcN1_Internalname, GXutil.ltrim( localUtil.ntoc( A10725RcNcN1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRcNcN1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10725RcNcN1), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10725RcNcN1), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcN1_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcN1_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Doc Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcDc_Internalname, GXutil.rtrim( A10727RcNcDc), GXutil.rtrim( localUtil.format( A10727RcNcDc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcDc_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcDc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Reclamacion Proveedor", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcFo_Internalname, GXutil.rtrim( A10729RcNcFo), GXutil.rtrim( localUtil.format( A10729RcNcFo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcFo_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcFo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Valor Imputar", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcVI_Internalname, GXutil.ltrim( localUtil.ntoc( A10730RcNcVI, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRcNcVI_Enabled!=0) ? localUtil.format( A10730RcNcVI, "ZZZZZZZZZ9.99") : localUtil.format( A10730RcNcVI, "ZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcVI_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcVI_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Comentarios", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtRcNcCm_Internalname, A10734RcNcCm, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", (short)(0), 1, edtRcNcCm_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Valor S/Iva NC", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcV1_Internalname, GXutil.ltrim( localUtil.ntoc( A10731RcNcV1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRcNcV1_Enabled!=0) ? localUtil.format( A10731RcNcV1, "ZZZZZZZZZ9.99") : localUtil.format( A10731RcNcV1, "ZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcV1_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcV1_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRCNC01.htm");
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
         Z10715RcNcFec = localUtil.ctod( httpContext.cgiGet( "Z10715RcNcFec"), 0) ;
         Z10717RcNcLin = (int)(localUtil.ctol( httpContext.cgiGet( "Z10717RcNcLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10725RcNcN1 = (int)(localUtil.ctol( httpContext.cgiGet( "Z10725RcNcN1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10727RcNcDc = httpContext.cgiGet( "Z10727RcNcDc") ;
         Z10729RcNcFo = httpContext.cgiGet( "Z10729RcNcFo") ;
         Z10730RcNcVI = localUtil.ctond( httpContext.cgiGet( "Z10730RcNcVI")) ;
         Z10734RcNcCm = httpContext.cgiGet( "Z10734RcNcCm") ;
         Z10731RcNcV1 = localUtil.ctond( httpContext.cgiGet( "Z10731RcNcV1")) ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10715RcNcFec = localUtil.ctod( httpContext.cgiGet( edtRcNcFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
         A10717RcNcLin = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcN1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcN1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RCNCN1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRcNcN1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10725RcNcN1 = 0 ;
            n10725RcNcN1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10725RcNcN1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10725RcNcN1), 8, 0));
         }
         else
         {
            A10725RcNcN1 = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcN1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10725RcNcN1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10725RcNcN1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10725RcNcN1), 8, 0));
         }
         A10727RcNcDc = httpContext.cgiGet( edtRcNcDc_Internalname) ;
         n10727RcNcDc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10727RcNcDc", A10727RcNcDc);
         A10729RcNcFo = httpContext.cgiGet( edtRcNcFo_Internalname) ;
         n10729RcNcFo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10729RcNcFo", A10729RcNcFo);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRcNcVI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRcNcVI_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RCNCVI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRcNcVI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10730RcNcVI = DecimalUtil.ZERO ;
            n10730RcNcVI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10730RcNcVI", GXutil.ltrimstr( A10730RcNcVI, 13, 2));
         }
         else
         {
            A10730RcNcVI = localUtil.ctond( httpContext.cgiGet( edtRcNcVI_Internalname)) ;
            n10730RcNcVI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10730RcNcVI", GXutil.ltrimstr( A10730RcNcVI, 13, 2));
         }
         A10734RcNcCm = httpContext.cgiGet( edtRcNcCm_Internalname) ;
         n10734RcNcCm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10734RcNcCm", A10734RcNcCm);
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
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRcNcV1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRcNcV1_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RCNCV1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRcNcV1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10731RcNcV1 = DecimalUtil.ZERO ;
            n10731RcNcV1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10731RcNcV1", GXutil.ltrimstr( A10731RcNcV1, 13, 2));
         }
         else
         {
            A10731RcNcV1 = localUtil.ctond( httpContext.cgiGet( edtRcNcV1_Internalname)) ;
            n10731RcNcV1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10731RcNcV1", GXutil.ltrimstr( A10731RcNcV1, 13, 2));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            A10715RcNcFec = localUtil.parseDateParm( httpContext.GetPar( "RcNcFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            A10717RcNcLin = (int)(GXutil.lval( httpContext.GetPar( "RcNcLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
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
            initAll18Y1428( ) ;
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
      disableAttributes18Y1428( ) ;
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

   public void confirm_18Y0( )
   {
      beforeValidate18Y1428( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18Y1428( ) ;
         }
         else
         {
            checkExtendedTable18Y1428( ) ;
            if ( AnyError == 0 )
            {
               zm18Y1428( 2) ;
               zm18Y1428( 3) ;
               zm18Y1428( 4) ;
            }
            closeExtendedTableCursors18Y1428( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues18Y0( ) ;
      }
   }

   public void resetCaption18Y0( )
   {
   }

   public void zm18Y1428( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10725RcNcN1 = T018Y3_A10725RcNcN1[0] ;
            Z10727RcNcDc = T018Y3_A10727RcNcDc[0] ;
            Z10729RcNcFo = T018Y3_A10729RcNcFo[0] ;
            Z10730RcNcVI = T018Y3_A10730RcNcVI[0] ;
            Z10734RcNcCm = T018Y3_A10734RcNcCm[0] ;
            Z10731RcNcV1 = T018Y3_A10731RcNcV1[0] ;
            Z252CliCod = T018Y3_A252CliCod[0] ;
         }
         else
         {
            Z10725RcNcN1 = A10725RcNcN1 ;
            Z10727RcNcDc = A10727RcNcDc ;
            Z10729RcNcFo = A10729RcNcFo ;
            Z10730RcNcVI = A10730RcNcVI ;
            Z10734RcNcCm = A10734RcNcCm ;
            Z10731RcNcV1 = A10731RcNcV1 ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10717RcNcLin = A10717RcNcLin ;
         Z10725RcNcN1 = A10725RcNcN1 ;
         Z10727RcNcDc = A10727RcNcDc ;
         Z10729RcNcFo = A10729RcNcFo ;
         Z10730RcNcVI = A10730RcNcVI ;
         Z10734RcNcCm = A10734RcNcCm ;
         Z10731RcNcV1 = A10731RcNcV1 ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z10715RcNcFec = A10715RcNcFec ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T018Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018Y4_A407EmprNom[0] ;
      n407EmprNom = T018Y4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T018Y6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A10715RcNcFec});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "NOTAS CREDITO - RECLAMACIONES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RCNCFEC");
         AnyError = (short)(1) ;
      }
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

   public void load18Y1428( )
   {
      /* Using cursor T018Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1428 = (short)(1) ;
         A407EmprNom = T018Y7_A407EmprNom[0] ;
         n407EmprNom = T018Y7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10725RcNcN1 = T018Y7_A10725RcNcN1[0] ;
         n10725RcNcN1 = T018Y7_n10725RcNcN1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10725RcNcN1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10725RcNcN1), 8, 0));
         A10727RcNcDc = T018Y7_A10727RcNcDc[0] ;
         n10727RcNcDc = T018Y7_n10727RcNcDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10727RcNcDc", A10727RcNcDc);
         A10729RcNcFo = T018Y7_A10729RcNcFo[0] ;
         n10729RcNcFo = T018Y7_n10729RcNcFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10729RcNcFo", A10729RcNcFo);
         A10730RcNcVI = T018Y7_A10730RcNcVI[0] ;
         n10730RcNcVI = T018Y7_n10730RcNcVI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10730RcNcVI", GXutil.ltrimstr( A10730RcNcVI, 13, 2));
         A10734RcNcCm = T018Y7_A10734RcNcCm[0] ;
         n10734RcNcCm = T018Y7_n10734RcNcCm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10734RcNcCm", A10734RcNcCm);
         A279CliNom = T018Y7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A10731RcNcV1 = T018Y7_A10731RcNcV1[0] ;
         n10731RcNcV1 = T018Y7_n10731RcNcV1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10731RcNcV1", GXutil.ltrimstr( A10731RcNcV1, 13, 2));
         A252CliCod = T018Y7_A252CliCod[0] ;
         n252CliCod = T018Y7_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm18Y1428( -1) ;
      }
      pr_default.close(5);
      onLoadActions18Y1428( ) ;
   }

   public void onLoadActions18Y1428( )
   {
   }

   public void checkExtendedTable18Y1428( )
   {
      nIsDirty_1428 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T018Y5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T018Y5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors18Y1428( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T018Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T018Y8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey18Y1428( )
   {
      /* Using cursor T018Y9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1428 = (short)(1) ;
      }
      else
      {
         RcdFound1428 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T018Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T018Y3_A10717RcNcLin[0] == A10717RcNcLin ) && ( GXutil.strcmp(T018Y3_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018Y3_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) )
      {
         zm18Y1428( 1) ;
         RcdFound1428 = (short)(1) ;
         A10725RcNcN1 = T018Y3_A10725RcNcN1[0] ;
         n10725RcNcN1 = T018Y3_n10725RcNcN1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10725RcNcN1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10725RcNcN1), 8, 0));
         A10727RcNcDc = T018Y3_A10727RcNcDc[0] ;
         n10727RcNcDc = T018Y3_n10727RcNcDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10727RcNcDc", A10727RcNcDc);
         A10729RcNcFo = T018Y3_A10729RcNcFo[0] ;
         n10729RcNcFo = T018Y3_n10729RcNcFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10729RcNcFo", A10729RcNcFo);
         A10730RcNcVI = T018Y3_A10730RcNcVI[0] ;
         n10730RcNcVI = T018Y3_n10730RcNcVI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10730RcNcVI", GXutil.ltrimstr( A10730RcNcVI, 13, 2));
         A10734RcNcCm = T018Y3_A10734RcNcCm[0] ;
         n10734RcNcCm = T018Y3_n10734RcNcCm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10734RcNcCm", A10734RcNcCm);
         A10731RcNcV1 = T018Y3_A10731RcNcV1[0] ;
         n10731RcNcV1 = T018Y3_n10731RcNcV1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10731RcNcV1", GXutil.ltrimstr( A10731RcNcV1, 13, 2));
         A252CliCod = T018Y3_A252CliCod[0] ;
         n252CliCod = T018Y3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z10715RcNcFec = A10715RcNcFec ;
         Z10717RcNcLin = A10717RcNcLin ;
         sMode1428 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18Y1428( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1428 = (short)(0) ;
            initializeNonKey18Y1428( ) ;
         }
         Gx_mode = sMode1428 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1428 = (short)(0) ;
         initializeNonKey18Y1428( ) ;
         sMode1428 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1428 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey18Y1428( ) ;
      if ( RcdFound1428 == 0 )
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
      RcdFound1428 = (short)(0) ;
      /* Using cursor T018Y10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T018Y10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018Y10_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T018Y10_A10717RcNcLin[0] == A10717RcNcLin ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T018Y10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018Y10_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T018Y10_A10717RcNcLin[0] == A10717RcNcLin ) )
         {
            RcdFound1428 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1428 = (short)(0) ;
      /* Using cursor T018Y11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T018Y11_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018Y11_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T018Y11_A10717RcNcLin[0] == A10717RcNcLin ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T018Y11_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018Y11_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T018Y11_A10717RcNcLin[0] == A10717RcNcLin ) )
         {
            RcdFound1428 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18Y1428( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRcNcN1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert18Y1428( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1428 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRcNcN1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update18Y1428( ) ;
               GX_FocusControl = edtRcNcN1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtRcNcN1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert18Y1428( ) ;
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
                  GX_FocusControl = edtRcNcN1_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert18Y1428( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRcNcN1_Internalname ;
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
      getKey18Y1428( ) ;
      if ( RcdFound1428 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trcnc01");
      GX_FocusControl = edtRcNcN1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_18Y0( ) ;
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
      if ( RcdFound1428 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRcNcN1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart18Y1428( ) ;
      if ( RcdFound1428 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRcNcN1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18Y1428( ) ;
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
      if ( RcdFound1428 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRcNcN1_Internalname ;
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
      if ( RcdFound1428 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRcNcN1_Internalname ;
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
      scanStart18Y1428( ) ;
      if ( RcdFound1428 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1428 != 0 )
         {
            scanNext18Y1428( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRcNcN1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18Y1428( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18Y1428( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z10725RcNcN1 != T018Y2_A10725RcNcN1[0] ) || ( GXutil.strcmp(Z10727RcNcDc, T018Y2_A10727RcNcDc[0]) != 0 ) || ( GXutil.strcmp(Z10729RcNcFo, T018Y2_A10729RcNcFo[0]) != 0 ) || ( DecimalUtil.compareTo(Z10730RcNcVI, T018Y2_A10730RcNcVI[0]) != 0 ) || ( GXutil.strcmp(Z10734RcNcCm, T018Y2_A10734RcNcCm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10731RcNcV1, T018Y2_A10731RcNcV1[0]) != 0 ) || ( Z252CliCod != T018Y2_A252CliCod[0] ) )
         {
            if ( Z10725RcNcN1 != T018Y2_A10725RcNcN1[0] )
            {
               GXutil.writeLogln("trcnc01:[seudo value changed for attri]"+"RcNcN1");
               GXutil.writeLogRaw("Old: ",Z10725RcNcN1);
               GXutil.writeLogRaw("Current: ",T018Y2_A10725RcNcN1[0]);
            }
            if ( GXutil.strcmp(Z10727RcNcDc, T018Y2_A10727RcNcDc[0]) != 0 )
            {
               GXutil.writeLogln("trcnc01:[seudo value changed for attri]"+"RcNcDc");
               GXutil.writeLogRaw("Old: ",Z10727RcNcDc);
               GXutil.writeLogRaw("Current: ",T018Y2_A10727RcNcDc[0]);
            }
            if ( GXutil.strcmp(Z10729RcNcFo, T018Y2_A10729RcNcFo[0]) != 0 )
            {
               GXutil.writeLogln("trcnc01:[seudo value changed for attri]"+"RcNcFo");
               GXutil.writeLogRaw("Old: ",Z10729RcNcFo);
               GXutil.writeLogRaw("Current: ",T018Y2_A10729RcNcFo[0]);
            }
            if ( DecimalUtil.compareTo(Z10730RcNcVI, T018Y2_A10730RcNcVI[0]) != 0 )
            {
               GXutil.writeLogln("trcnc01:[seudo value changed for attri]"+"RcNcVI");
               GXutil.writeLogRaw("Old: ",Z10730RcNcVI);
               GXutil.writeLogRaw("Current: ",T018Y2_A10730RcNcVI[0]);
            }
            if ( GXutil.strcmp(Z10734RcNcCm, T018Y2_A10734RcNcCm[0]) != 0 )
            {
               GXutil.writeLogln("trcnc01:[seudo value changed for attri]"+"RcNcCm");
               GXutil.writeLogRaw("Old: ",Z10734RcNcCm);
               GXutil.writeLogRaw("Current: ",T018Y2_A10734RcNcCm[0]);
            }
            if ( DecimalUtil.compareTo(Z10731RcNcV1, T018Y2_A10731RcNcV1[0]) != 0 )
            {
               GXutil.writeLogln("trcnc01:[seudo value changed for attri]"+"RcNcV1");
               GXutil.writeLogRaw("Old: ",Z10731RcNcV1);
               GXutil.writeLogRaw("Current: ",T018Y2_A10731RcNcV1[0]);
            }
            if ( Z252CliCod != T018Y2_A252CliCod[0] )
            {
               GXutil.writeLogln("trcnc01:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T018Y2_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRCNC01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18Y1428( )
   {
      beforeValidate18Y1428( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18Y1428( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18Y1428( 0) ;
         checkOptimisticConcurrency18Y1428( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18Y1428( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18Y1428( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018Y12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A10717RcNcLin), Boolean.valueOf(n10725RcNcN1), Integer.valueOf(A10725RcNcN1), Boolean.valueOf(n10727RcNcDc), A10727RcNcDc, Boolean.valueOf(n10729RcNcFo), A10729RcNcFo, Boolean.valueOf(n10730RcNcVI), A10730RcNcVI, Boolean.valueOf(n10734RcNcCm), A10734RcNcCm, Boolean.valueOf(n10731RcNcV1), A10731RcNcV1, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A10715RcNcFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC01");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption18Y0( ) ;
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
            load18Y1428( ) ;
         }
         endLevel18Y1428( ) ;
      }
      closeExtendedTableCursors18Y1428( ) ;
   }

   public void update18Y1428( )
   {
      beforeValidate18Y1428( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18Y1428( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18Y1428( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18Y1428( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18Y1428( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018Y13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n10725RcNcN1), Integer.valueOf(A10725RcNcN1), Boolean.valueOf(n10727RcNcDc), A10727RcNcDc, Boolean.valueOf(n10729RcNcFo), A10729RcNcFo, Boolean.valueOf(n10730RcNcVI), A10730RcNcVI, Boolean.valueOf(n10734RcNcCm), A10734RcNcCm, Boolean.valueOf(n10731RcNcV1), A10731RcNcV1, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC01");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC01"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate18Y1428( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption18Y0( ) ;
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
         endLevel18Y1428( ) ;
      }
      closeExtendedTableCursors18Y1428( ) ;
   }

   public void deferredUpdate18Y1428( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18Y1428( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18Y1428( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18Y1428( ) ;
         afterConfirm18Y1428( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18Y1428( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018Y14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC01");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1428 == 0 )
                     {
                        initAll18Y1428( ) ;
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
                     resetCaption18Y0( ) ;
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
      sMode1428 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18Y1428( ) ;
      Gx_mode = sMode1428 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18Y1428( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T018Y15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T018Y15_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T018Y16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel18Y1428( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete18Y1428( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trcnc01");
         if ( AnyError == 0 )
         {
            confirmValues18Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trcnc01");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18Y1428( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A10715RcNcFec = A10715RcNcFec ;
      this.A10717RcNcLin = A10717RcNcLin ;
      /* Scan By routine */
      /* Using cursor T018Y17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      RcdFound1428 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1428 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18Y1428( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1428 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1428 = (short)(1) ;
      }
   }

   public void scanEnd18Y1428( )
   {
      pr_default.close(15);
   }

   public void afterConfirm18Y1428( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18Y1428( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18Y1428( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18Y1428( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18Y1428( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18Y1428( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18Y1428( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtRcNcFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFec_Enabled), 5, 0), true);
      edtRcNcLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcLin_Enabled), 5, 0), true);
      edtRcNcN1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcN1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcN1_Enabled), 5, 0), true);
      edtRcNcDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcDc_Enabled), 5, 0), true);
      edtRcNcFo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFo_Enabled), 5, 0), true);
      edtRcNcVI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcVI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcVI_Enabled), 5, 0), true);
      edtRcNcCm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcCm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcCm_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtRcNcV1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcV1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV1_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes18Y1428( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues18Y0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trcnc01", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(A10715RcNcFec)),GXutil.URLEncode(GXutil.ltrimstr(A10717RcNcLin,6,0))}, new String[] {"EmprCod","RcNcFec","RcNcLin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10715RcNcFec", localUtil.dtoc( Z10715RcNcFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10717RcNcLin", GXutil.ltrim( localUtil.ntoc( Z10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10725RcNcN1", GXutil.ltrim( localUtil.ntoc( Z10725RcNcN1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10727RcNcDc", GXutil.rtrim( Z10727RcNcDc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10729RcNcFo", GXutil.rtrim( Z10729RcNcFo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10730RcNcVI", GXutil.ltrim( localUtil.ntoc( Z10730RcNcVI, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10734RcNcCm", Z10734RcNcCm);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10731RcNcV1", GXutil.ltrim( localUtil.ntoc( Z10731RcNcV1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.trcnc01", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(A10715RcNcFec)),GXutil.URLEncode(GXutil.ltrimstr(A10717RcNcLin,6,0))}, new String[] {"EmprCod","RcNcFec","RcNcLin"})  ;
   }

   public String getPgmname( )
   {
      return "TRCNC01" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MODIFICO VALORES", "") ;
   }

   public void initializeNonKey18Y1428( )
   {
      A10725RcNcN1 = 0 ;
      n10725RcNcN1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10725RcNcN1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10725RcNcN1), 8, 0));
      A10727RcNcDc = "" ;
      n10727RcNcDc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10727RcNcDc", A10727RcNcDc);
      A10729RcNcFo = "" ;
      n10729RcNcFo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10729RcNcFo", A10729RcNcFo);
      A10730RcNcVI = DecimalUtil.ZERO ;
      n10730RcNcVI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10730RcNcVI", GXutil.ltrimstr( A10730RcNcVI, 13, 2));
      A10734RcNcCm = "" ;
      n10734RcNcCm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10734RcNcCm", A10734RcNcCm);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A10731RcNcV1 = DecimalUtil.ZERO ;
      n10731RcNcV1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10731RcNcV1", GXutil.ltrimstr( A10731RcNcV1, 13, 2));
      Z10725RcNcN1 = 0 ;
      Z10727RcNcDc = "" ;
      Z10729RcNcFo = "" ;
      Z10730RcNcVI = DecimalUtil.ZERO ;
      Z10734RcNcCm = "" ;
      Z10731RcNcV1 = DecimalUtil.ZERO ;
      Z252CliCod = 0 ;
   }

   public void initAll18Y1428( )
   {
      initializeNonKey18Y1428( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241555438", true, true);
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
      httpContext.AddJavascriptSource("trcnc01.js", "?20268241555438", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtRcNcFec_Internalname = "RCNCFEC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtRcNcLin_Internalname = "RCNCLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtRcNcN1_Internalname = "RCNCN1" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRcNcDc_Internalname = "RCNCDC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtRcNcFo_Internalname = "RCNCFO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtRcNcVI_Internalname = "RCNCVI" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtRcNcCm_Internalname = "RCNCCM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtRcNcV1_Internalname = "RCNCV1" ;
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
      Form.setCaption( httpContext.getMessage( "MODIFICO VALORES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRcNcV1_Jsonclick = "" ;
      edtRcNcV1_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcV1_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtRcNcCm_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcCm_Enabled = 1 ;
      edtRcNcVI_Jsonclick = "" ;
      edtRcNcVI_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcVI_Enabled = 1 ;
      edtRcNcFo_Jsonclick = "" ;
      edtRcNcFo_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcFo_Enabled = 1 ;
      edtRcNcDc_Jsonclick = "" ;
      edtRcNcDc_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcDc_Enabled = 1 ;
      edtRcNcN1_Jsonclick = "" ;
      edtRcNcN1_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcN1_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRcNcLin_Jsonclick = "" ;
      edtRcNcLin_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcLin_Enabled = 0 ;
      edtRcNcFec_Jsonclick = "" ;
      edtRcNcFec_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcFec_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T018Y18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018Y18_A407EmprNom[0] ;
      n407EmprNom = T018Y18_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(16);
      /* Using cursor T018Y19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A10715RcNcFec});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "NOTAS CREDITO - RECLAMACIONES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RCNCFEC");
         AnyError = (short)(1) ;
      }
      pr_default.close(17);
      GX_FocusControl = edtRcNcN1_Internalname ;
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

   public void valid_Rcnclin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10725RcNcN1", GXutil.ltrim( localUtil.ntoc( A10725RcNcN1, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10727RcNcDc", GXutil.rtrim( A10727RcNcDc));
      httpContext.ajax_rsp_assign_attri("", false, "A10729RcNcFo", GXutil.rtrim( A10729RcNcFo));
      httpContext.ajax_rsp_assign_attri("", false, "A10730RcNcVI", GXutil.ltrim( localUtil.ntoc( A10730RcNcVI, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10734RcNcCm", A10734RcNcCm);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10731RcNcV1", GXutil.ltrim( localUtil.ntoc( A10731RcNcV1, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10715RcNcFec", localUtil.format(Z10715RcNcFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10717RcNcLin", GXutil.ltrim( localUtil.ntoc( Z10717RcNcLin, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10725RcNcN1", GXutil.ltrim( localUtil.ntoc( Z10725RcNcN1, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10727RcNcDc", GXutil.rtrim( Z10727RcNcDc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10729RcNcFo", GXutil.rtrim( Z10729RcNcFo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10730RcNcVI", GXutil.ltrim( localUtil.ntoc( Z10730RcNcVI, (byte)(13), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10734RcNcCm", Z10734RcNcCm);
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10731RcNcV1", GXutil.ltrim( localUtil.ntoc( Z10731RcNcV1, (byte)(13), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T018Y15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T018Y15_A279CliNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10715RcNcFec',fld:'RCNCFEC',pic:''},{av:'A10717RcNcLin',fld:'RCNCLIN',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_RCNCFEC","{handler:'valid_Rcncfec',iparms:[]");
      setEventMetadata("VALID_RCNCFEC",",oparms:[]}");
      setEventMetadata("VALID_RCNCLIN","{handler:'valid_Rcnclin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10715RcNcFec',fld:'RCNCFEC',pic:''},{av:'A10717RcNcLin',fld:'RCNCLIN',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RCNCLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10725RcNcN1',fld:'RCNCN1',pic:'ZZZZZZZ9'},{av:'A10727RcNcDc',fld:'RCNCDC',pic:''},{av:'A10729RcNcFo',fld:'RCNCFO',pic:''},{av:'A10730RcNcVI',fld:'RCNCVI',pic:'ZZZZZZZZZ9.99'},{av:'A10734RcNcCm',fld:'RCNCCM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A10731RcNcV1',fld:'RCNCV1',pic:'ZZZZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10715RcNcFec'},{av:'Z10717RcNcLin'},{av:'Z407EmprNom'},{av:'Z10725RcNcN1'},{av:'Z10727RcNcDc'},{av:'Z10729RcNcFo'},{av:'Z10730RcNcVI'},{av:'Z10734RcNcCm'},{av:'Z252CliCod'},{av:'Z10731RcNcV1'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
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
      pr_default.close(13);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA10715RcNcFec = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z10715RcNcFec = GXutil.nullDate() ;
      Z10727RcNcDc = "" ;
      Z10729RcNcFo = "" ;
      Z10730RcNcVI = DecimalUtil.ZERO ;
      Z10734RcNcCm = "" ;
      Z10731RcNcV1 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10715RcNcFec = GXutil.nullDate() ;
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
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10727RcNcDc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10729RcNcFo = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10730RcNcVI = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A10734RcNcCm = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      A10731RcNcV1 = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T018Y4_A407EmprNom = new String[] {""} ;
      T018Y4_n407EmprNom = new boolean[] {false} ;
      T018Y6_A396EmprCod = new String[] {""} ;
      T018Y7_A10717RcNcLin = new int[1] ;
      T018Y7_A407EmprNom = new String[] {""} ;
      T018Y7_n407EmprNom = new boolean[] {false} ;
      T018Y7_A10725RcNcN1 = new int[1] ;
      T018Y7_n10725RcNcN1 = new boolean[] {false} ;
      T018Y7_A10727RcNcDc = new String[] {""} ;
      T018Y7_n10727RcNcDc = new boolean[] {false} ;
      T018Y7_A10729RcNcFo = new String[] {""} ;
      T018Y7_n10729RcNcFo = new boolean[] {false} ;
      T018Y7_A10730RcNcVI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Y7_n10730RcNcVI = new boolean[] {false} ;
      T018Y7_A10734RcNcCm = new String[] {""} ;
      T018Y7_n10734RcNcCm = new boolean[] {false} ;
      T018Y7_A279CliNom = new String[] {""} ;
      T018Y7_A10731RcNcV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Y7_n10731RcNcV1 = new boolean[] {false} ;
      T018Y7_A396EmprCod = new String[] {""} ;
      T018Y7_A252CliCod = new int[1] ;
      T018Y7_n252CliCod = new boolean[] {false} ;
      T018Y7_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018Y5_A279CliNom = new String[] {""} ;
      T018Y8_A279CliNom = new String[] {""} ;
      T018Y9_A396EmprCod = new String[] {""} ;
      T018Y9_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018Y9_A10717RcNcLin = new int[1] ;
      T018Y3_A10717RcNcLin = new int[1] ;
      T018Y3_A10725RcNcN1 = new int[1] ;
      T018Y3_n10725RcNcN1 = new boolean[] {false} ;
      T018Y3_A10727RcNcDc = new String[] {""} ;
      T018Y3_n10727RcNcDc = new boolean[] {false} ;
      T018Y3_A10729RcNcFo = new String[] {""} ;
      T018Y3_n10729RcNcFo = new boolean[] {false} ;
      T018Y3_A10730RcNcVI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Y3_n10730RcNcVI = new boolean[] {false} ;
      T018Y3_A10734RcNcCm = new String[] {""} ;
      T018Y3_n10734RcNcCm = new boolean[] {false} ;
      T018Y3_A10731RcNcV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Y3_n10731RcNcV1 = new boolean[] {false} ;
      T018Y3_A396EmprCod = new String[] {""} ;
      T018Y3_A252CliCod = new int[1] ;
      T018Y3_n252CliCod = new boolean[] {false} ;
      T018Y3_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      sMode1428 = "" ;
      T018Y10_A396EmprCod = new String[] {""} ;
      T018Y10_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018Y10_A10717RcNcLin = new int[1] ;
      T018Y11_A396EmprCod = new String[] {""} ;
      T018Y11_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018Y11_A10717RcNcLin = new int[1] ;
      T018Y2_A10717RcNcLin = new int[1] ;
      T018Y2_A10725RcNcN1 = new int[1] ;
      T018Y2_n10725RcNcN1 = new boolean[] {false} ;
      T018Y2_A10727RcNcDc = new String[] {""} ;
      T018Y2_n10727RcNcDc = new boolean[] {false} ;
      T018Y2_A10729RcNcFo = new String[] {""} ;
      T018Y2_n10729RcNcFo = new boolean[] {false} ;
      T018Y2_A10730RcNcVI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Y2_n10730RcNcVI = new boolean[] {false} ;
      T018Y2_A10734RcNcCm = new String[] {""} ;
      T018Y2_n10734RcNcCm = new boolean[] {false} ;
      T018Y2_A10731RcNcV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Y2_n10731RcNcV1 = new boolean[] {false} ;
      T018Y2_A396EmprCod = new String[] {""} ;
      T018Y2_A252CliCod = new int[1] ;
      T018Y2_n252CliCod = new boolean[] {false} ;
      T018Y2_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018Y15_A279CliNom = new String[] {""} ;
      T018Y16_A396EmprCod = new String[] {""} ;
      T018Y16_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018Y16_A10717RcNcLin = new int[1] ;
      T018Y16_A10813RcNcGrn = new long[1] ;
      T018Y17_A396EmprCod = new String[] {""} ;
      T018Y17_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018Y17_A10717RcNcLin = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T018Y18_A407EmprNom = new String[] {""} ;
      T018Y18_n407EmprNom = new boolean[] {false} ;
      T018Y19_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ10715RcNcFec = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ10727RcNcDc = "" ;
      ZZ10729RcNcFo = "" ;
      ZZ10730RcNcVI = DecimalUtil.ZERO ;
      ZZ10734RcNcCm = "" ;
      ZZ10731RcNcV1 = DecimalUtil.ZERO ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trcnc01__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trcnc01__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trcnc01__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trcnc01__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trcnc01__default(),
         new Object[] {
             new Object[] {
            T018Y2_A10717RcNcLin, T018Y2_A10725RcNcN1, T018Y2_n10725RcNcN1, T018Y2_A10727RcNcDc, T018Y2_n10727RcNcDc, T018Y2_A10729RcNcFo, T018Y2_n10729RcNcFo, T018Y2_A10730RcNcVI, T018Y2_n10730RcNcVI, T018Y2_A10734RcNcCm,
            T018Y2_n10734RcNcCm, T018Y2_A10731RcNcV1, T018Y2_n10731RcNcV1, T018Y2_A396EmprCod, T018Y2_A252CliCod, T018Y2_n252CliCod, T018Y2_A10715RcNcFec
            }
            , new Object[] {
            T018Y3_A10717RcNcLin, T018Y3_A10725RcNcN1, T018Y3_n10725RcNcN1, T018Y3_A10727RcNcDc, T018Y3_n10727RcNcDc, T018Y3_A10729RcNcFo, T018Y3_n10729RcNcFo, T018Y3_A10730RcNcVI, T018Y3_n10730RcNcVI, T018Y3_A10734RcNcCm,
            T018Y3_n10734RcNcCm, T018Y3_A10731RcNcV1, T018Y3_n10731RcNcV1, T018Y3_A396EmprCod, T018Y3_A252CliCod, T018Y3_n252CliCod, T018Y3_A10715RcNcFec
            }
            , new Object[] {
            T018Y4_A407EmprNom, T018Y4_n407EmprNom
            }
            , new Object[] {
            T018Y5_A279CliNom
            }
            , new Object[] {
            T018Y6_A396EmprCod
            }
            , new Object[] {
            T018Y7_A10717RcNcLin, T018Y7_A407EmprNom, T018Y7_n407EmprNom, T018Y7_A10725RcNcN1, T018Y7_n10725RcNcN1, T018Y7_A10727RcNcDc, T018Y7_n10727RcNcDc, T018Y7_A10729RcNcFo, T018Y7_n10729RcNcFo, T018Y7_A10730RcNcVI,
            T018Y7_n10730RcNcVI, T018Y7_A10734RcNcCm, T018Y7_n10734RcNcCm, T018Y7_A279CliNom, T018Y7_A10731RcNcV1, T018Y7_n10731RcNcV1, T018Y7_A396EmprCod, T018Y7_A252CliCod, T018Y7_n252CliCod, T018Y7_A10715RcNcFec
            }
            , new Object[] {
            T018Y8_A279CliNom
            }
            , new Object[] {
            T018Y9_A396EmprCod, T018Y9_A10715RcNcFec, T018Y9_A10717RcNcLin
            }
            , new Object[] {
            T018Y10_A396EmprCod, T018Y10_A10715RcNcFec, T018Y10_A10717RcNcLin
            }
            , new Object[] {
            T018Y11_A396EmprCod, T018Y11_A10715RcNcFec, T018Y11_A10717RcNcLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018Y15_A279CliNom
            }
            , new Object[] {
            T018Y16_A396EmprCod, T018Y16_A10715RcNcFec, T018Y16_A10717RcNcLin, T018Y16_A10813RcNcGrn
            }
            , new Object[] {
            T018Y17_A396EmprCod, T018Y17_A10715RcNcFec, T018Y17_A10717RcNcLin
            }
            , new Object[] {
            T018Y18_A407EmprNom, T018Y18_n407EmprNom
            }
            , new Object[] {
            T018Y19_A396EmprCod
            }
         }
      );
      Z10717RcNcLin = 0 ;
      A10717RcNcLin = 0 ;
      Z10715RcNcFec = GXutil.nullDate() ;
      A10715RcNcFec = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1428 ;
   private short nIsDirty_1428 ;
   private int wcpOA10717RcNcLin ;
   private int Z10717RcNcLin ;
   private int Z10725RcNcN1 ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int A10717RcNcLin ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtRcNcFec_Enabled ;
   private int edtRcNcLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A10725RcNcN1 ;
   private int edtRcNcN1_Enabled ;
   private int edtRcNcDc_Enabled ;
   private int edtRcNcFo_Enabled ;
   private int edtRcNcVI_Enabled ;
   private int edtRcNcCm_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtRcNcV1_Enabled ;
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
   private int edtRcNcV1_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtRcNcCm_Backcolor ;
   private int edtRcNcVI_Backcolor ;
   private int edtRcNcFo_Backcolor ;
   private int edtRcNcDc_Backcolor ;
   private int edtRcNcN1_Backcolor ;
   private int edtRcNcLin_Backcolor ;
   private int edtRcNcFec_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10717RcNcLin ;
   private int ZZ10725RcNcN1 ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z10730RcNcVI ;
   private java.math.BigDecimal Z10731RcNcV1 ;
   private java.math.BigDecimal A10730RcNcVI ;
   private java.math.BigDecimal A10731RcNcV1 ;
   private java.math.BigDecimal ZZ10730RcNcVI ;
   private java.math.BigDecimal ZZ10731RcNcV1 ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z10727RcNcDc ;
   private String Z10729RcNcFo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRcNcN1_Internalname ;
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
   private String edtRcNcFec_Internalname ;
   private String edtRcNcFec_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtRcNcLin_Internalname ;
   private String edtRcNcLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtRcNcN1_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtRcNcDc_Internalname ;
   private String A10727RcNcDc ;
   private String edtRcNcDc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtRcNcFo_Internalname ;
   private String A10729RcNcFo ;
   private String edtRcNcFo_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtRcNcVI_Internalname ;
   private String edtRcNcVI_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtRcNcCm_Internalname ;
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
   private String edtRcNcV1_Internalname ;
   private String edtRcNcV1_Jsonclick ;
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
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode1428 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ10727RcNcDc ;
   private String ZZ10729RcNcFo ;
   private String ZZ279CliNom ;
   private java.util.Date wcpOA10715RcNcFec ;
   private java.util.Date Z10715RcNcFec ;
   private java.util.Date A10715RcNcFec ;
   private java.util.Date ZZ10715RcNcFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10725RcNcN1 ;
   private boolean n10727RcNcDc ;
   private boolean n10729RcNcFo ;
   private boolean n10730RcNcVI ;
   private boolean n10734RcNcCm ;
   private boolean n10731RcNcV1 ;
   private boolean Gx_longc ;
   private String Z10734RcNcCm ;
   private String A10734RcNcCm ;
   private String ZZ10734RcNcCm ;
   private IDataStoreProvider pr_default ;
   private String[] T018Y4_A407EmprNom ;
   private boolean[] T018Y4_n407EmprNom ;
   private String[] T018Y6_A396EmprCod ;
   private int[] T018Y7_A10717RcNcLin ;
   private String[] T018Y7_A407EmprNom ;
   private boolean[] T018Y7_n407EmprNom ;
   private int[] T018Y7_A10725RcNcN1 ;
   private boolean[] T018Y7_n10725RcNcN1 ;
   private String[] T018Y7_A10727RcNcDc ;
   private boolean[] T018Y7_n10727RcNcDc ;
   private String[] T018Y7_A10729RcNcFo ;
   private boolean[] T018Y7_n10729RcNcFo ;
   private java.math.BigDecimal[] T018Y7_A10730RcNcVI ;
   private boolean[] T018Y7_n10730RcNcVI ;
   private String[] T018Y7_A10734RcNcCm ;
   private boolean[] T018Y7_n10734RcNcCm ;
   private String[] T018Y7_A279CliNom ;
   private java.math.BigDecimal[] T018Y7_A10731RcNcV1 ;
   private boolean[] T018Y7_n10731RcNcV1 ;
   private String[] T018Y7_A396EmprCod ;
   private int[] T018Y7_A252CliCod ;
   private boolean[] T018Y7_n252CliCod ;
   private java.util.Date[] T018Y7_A10715RcNcFec ;
   private String[] T018Y5_A279CliNom ;
   private String[] T018Y8_A279CliNom ;
   private String[] T018Y9_A396EmprCod ;
   private java.util.Date[] T018Y9_A10715RcNcFec ;
   private int[] T018Y9_A10717RcNcLin ;
   private int[] T018Y3_A10717RcNcLin ;
   private int[] T018Y3_A10725RcNcN1 ;
   private boolean[] T018Y3_n10725RcNcN1 ;
   private String[] T018Y3_A10727RcNcDc ;
   private boolean[] T018Y3_n10727RcNcDc ;
   private String[] T018Y3_A10729RcNcFo ;
   private boolean[] T018Y3_n10729RcNcFo ;
   private java.math.BigDecimal[] T018Y3_A10730RcNcVI ;
   private boolean[] T018Y3_n10730RcNcVI ;
   private String[] T018Y3_A10734RcNcCm ;
   private boolean[] T018Y3_n10734RcNcCm ;
   private java.math.BigDecimal[] T018Y3_A10731RcNcV1 ;
   private boolean[] T018Y3_n10731RcNcV1 ;
   private String[] T018Y3_A396EmprCod ;
   private int[] T018Y3_A252CliCod ;
   private boolean[] T018Y3_n252CliCod ;
   private java.util.Date[] T018Y3_A10715RcNcFec ;
   private String[] T018Y10_A396EmprCod ;
   private java.util.Date[] T018Y10_A10715RcNcFec ;
   private int[] T018Y10_A10717RcNcLin ;
   private String[] T018Y11_A396EmprCod ;
   private java.util.Date[] T018Y11_A10715RcNcFec ;
   private int[] T018Y11_A10717RcNcLin ;
   private int[] T018Y2_A10717RcNcLin ;
   private int[] T018Y2_A10725RcNcN1 ;
   private boolean[] T018Y2_n10725RcNcN1 ;
   private String[] T018Y2_A10727RcNcDc ;
   private boolean[] T018Y2_n10727RcNcDc ;
   private String[] T018Y2_A10729RcNcFo ;
   private boolean[] T018Y2_n10729RcNcFo ;
   private java.math.BigDecimal[] T018Y2_A10730RcNcVI ;
   private boolean[] T018Y2_n10730RcNcVI ;
   private String[] T018Y2_A10734RcNcCm ;
   private boolean[] T018Y2_n10734RcNcCm ;
   private java.math.BigDecimal[] T018Y2_A10731RcNcV1 ;
   private boolean[] T018Y2_n10731RcNcV1 ;
   private String[] T018Y2_A396EmprCod ;
   private int[] T018Y2_A252CliCod ;
   private boolean[] T018Y2_n252CliCod ;
   private java.util.Date[] T018Y2_A10715RcNcFec ;
   private String[] T018Y15_A279CliNom ;
   private String[] T018Y16_A396EmprCod ;
   private java.util.Date[] T018Y16_A10715RcNcFec ;
   private int[] T018Y16_A10717RcNcLin ;
   private long[] T018Y16_A10813RcNcGrn ;
   private String[] T018Y17_A396EmprCod ;
   private java.util.Date[] T018Y17_A10715RcNcFec ;
   private int[] T018Y17_A10717RcNcLin ;
   private String[] T018Y18_A407EmprNom ;
   private boolean[] T018Y18_n407EmprNom ;
   private String[] T018Y19_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trcnc01__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc01__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc01__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc01__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018Y2", "SELECT RcNcLin, RcNcN1, RcNcDc, RcNcFo, RcNcVI, RcNcCm, RcNcV1, EmprCod, CliCod, RcNcFec FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?  FOR UPDATE OF RcNcN1, RcNcDc, RcNcFo, RcNcVI, RcNcCm, RcNcV1, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y3", "SELECT RcNcLin, RcNcN1, RcNcDc, RcNcFo, RcNcVI, RcNcCm, RcNcV1, EmprCod, CliCod, RcNcFec FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y6", "SELECT EmprCod FROM TXPRCNC00 WHERE EmprCod = ? AND RcNcFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y7", "SELECT /*+ FIRST_ROWS(1) */ TM1.RcNcLin, T2.EmprNom, TM1.RcNcN1, TM1.RcNcDc, TM1.RcNcFo, TM1.RcNcVI, TM1.RcNcCm, T3.CliNom, TM1.RcNcV1, TM1.EmprCod, TM1.CliCod, TM1.RcNcFec FROM ((TXPRCNC01 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.RcNcFec = ? and TM1.RcNcLin = ? ORDER BY TM1.EmprCod, TM1.RcNcFec, TM1.RcNcLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec, RcNcLin FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec, RcNcLin FROM TXPRCNC01 WHERE EmprCod = ? and RcNcFec = ? and RcNcLin = ? ORDER BY EmprCod, RcNcFec, RcNcLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec, RcNcLin FROM TXPRCNC01 WHERE EmprCod = ? and RcNcFec = ? and RcNcLin = ? ORDER BY EmprCod DESC, RcNcFec DESC, RcNcLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018Y12", "INSERT INTO TXPRCNC01(RcNcLin, RcNcN1, RcNcDc, RcNcFo, RcNcVI, RcNcCm, RcNcV1, EmprCod, CliCod, RcNcFec, RcNcHd, RcNcR, RcNcP, RcNcHdO, RcNcRO, RcNcPO, TipDefCod, RcNcRef, RcNcN2, RcNcGR, RcNcV2, RcNcOb, RcNcE, RcNcKgH) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, 0)", GX_NOMASK, "TXPRCNC01")
         ,new UpdateCursor("T018Y13", "UPDATE TXPRCNC01 SET RcNcN1=?, RcNcDc=?, RcNcFo=?, RcNcVI=?, RcNcCm=?, RcNcV1=?, CliCod=?  WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?", GX_NOMASK, "TXPRCNC01")
         ,new UpdateCursor("T018Y14", "DELETE FROM TXPRCNC01  WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?", GX_NOMASK, "TXPRCNC01")
         ,new ForEachCursor("T018Y15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y16", "SELECT * FROM (SELECT EmprCod, RcNcFec, RcNcLin, RcNcGrn FROM TXPRCNC02 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, RcNcFec, RcNcLin FROM TXPRCNC01 WHERE EmprCod = ? and RcNcFec = ? and RcNcLin = ? ORDER BY EmprCod, RcNcFec, RcNcLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Y18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Y19", "SELECT EmprCod FROM TXPRCNC00 WHERE EmprCod = ? AND RcNcFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 3);
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 30);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 200);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               stmt.setString(8, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[15]).intValue());
               }
               stmt.setDate(10, (java.util.Date)parms[16]);
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
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 200);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setDate(9, (java.util.Date)parms[15]);
               stmt.setInt(10, ((Number) parms[16]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

