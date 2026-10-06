package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tptapar_impl extends GXDataArea
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
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         n652OpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A652OpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11792CodApId = (short)(GXutil.lval( httpContext.GetPar( "CodApId"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A11792CodApId) ;
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
            AV62BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
            AV61BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
            AV63BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63BarCodPar", AV63BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Llamada con parametro", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarCod_Internalname ;
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
      nRC_GXsfl_125 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_125"))) ;
      nGXsfl_125_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_125_idx"))) ;
      sGXsfl_125_idx = httpContext.GetPar( "sGXsfl_125_idx") ;
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

   public tptapar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tptapar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tptapar_impl.class ));
   }

   public tptapar_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkAp_NA = UIFactory.getCheckbox(this);
      radAP_St = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpTAPAR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"3chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"8chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"1chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"1chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Test", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A11791Ap_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAp_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11791Ap_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11791Ap_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"8chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_numero_Jsonclick, 0, "", "", "", "", "", 1, edtAp_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAp_fec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_fec_Internalname, localUtil.format(A11776Ap_fec, "99/99/99"), localUtil.format( A11776Ap_fec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"8chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_fec_Jsonclick, 0, "", "", "", "", "", 1, edtAp_fec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTAPAR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAp_fec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAp_fec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TpTAPAR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Disp Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_Disp_Internalname, GXutil.rtrim( A11777Ap_Disp), GXutil.rtrim( localUtil.format( A11777Ap_Disp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"20chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_Disp_Jsonclick, 0, "", "", "", "", "", 1, edtAp_Disp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_Ref_Internalname, GXutil.rtrim( A11778Ap_Ref), GXutil.rtrim( localUtil.format( A11778Ap_Ref, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"15chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_Ref_Jsonclick, 0, "", "", "", "", "", 1, edtAp_Ref_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_Art_Internalname, GXutil.rtrim( A11779Ap_Art), GXutil.rtrim( localUtil.format( A11779Ap_Art, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"16chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_Art_Jsonclick, 0, "", "", "", "", "", 1, edtAp_Art_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_Mat_Internalname, GXutil.rtrim( A11780Ap_Mat), GXutil.rtrim( localUtil.format( A11780Ap_Mat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"16chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_Mat_Jsonclick, 0, "", "", "", "", "", 1, edtAp_Mat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_ColN_Internalname, GXutil.rtrim( A11781Ap_ColN), GXutil.rtrim( localUtil.format( A11781Ap_ColN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"13chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_ColN_Jsonclick, 0, "", "", "", "", "", 1, edtAp_ColN_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_ColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A11782Ap_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAp_ColNn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11782Ap_ColNn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11782Ap_ColNn), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_ColNn_Jsonclick, 0, "", "", "", "", "", 1, edtAp_ColNn_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_Tc_Internalname, GXutil.ltrim( localUtil.ntoc( A11783Ap_Tc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAp_Tc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11783Ap_Tc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11783Ap_Tc), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"2chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_Tc_Jsonclick, 0, "", "", "", "", "", 1, edtAp_Tc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_Maq_Internalname, GXutil.rtrim( A11784Ap_Maq), GXutil.rtrim( localUtil.format( A11784Ap_Maq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_Maq_Jsonclick, 0, "", "", "", "", "", 1, edtAp_Maq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_Cli_Internalname, GXutil.ltrim( localUtil.ntoc( A11785Ap_Cli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAp_Cli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11785Ap_Cli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11785Ap_Cli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_Cli_Jsonclick, 0, "", "", "", "", "", 1, edtAp_Cli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_Cln_Internalname, GXutil.rtrim( A11786Ap_Cln), GXutil.rtrim( localUtil.format( A11786Ap_Cln, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_Cln_Jsonclick, 0, "", "", "", "", "", 1, edtAp_Cln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Norma", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAp_norma_Internalname, GXutil.rtrim( A11787Ap_norma), GXutil.rtrim( localUtil.format( A11787Ap_norma, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"20chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAp_norma_Jsonclick, 0, "", "", "", "", "", 1, edtAp_norma_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAp_obs_Internalname, A11788Ap_obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\""+" "+"gxheight=\"10row\""+" "+"gxwidth=\"80chr\""+" ", (short)(0), 1, edtAp_obs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "800", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TpTAPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol125( ) ;
      nGXsfl_125_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1660 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1660 = (short)(1) ;
            scanStart1ID1660( ) ;
            while ( RcdFound1660 != 0 )
            {
               init_level_properties1660( ) ;
               getByPrimaryKey1ID1660( ) ;
               addRow1ID1660( ) ;
               scanNext1ID1660( ) ;
            }
            scanEnd1ID1660( ) ;
            nBlankRcdCount1660 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1ID1660( ) ;
         standaloneModal1ID1660( ) ;
         sMode1660 = Gx_mode ;
         while ( nGXsfl_125_idx < nRC_GXsfl_125 )
         {
            bGXsfl_125_Refreshing = true ;
            readRow1ID1660( ) ;
            edtavnRcdDeleted_1660_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1660_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1660_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1660_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtCodApId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODAPID_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodApId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApId_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtCodApPm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODAPPM_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodApPm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApPm_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtCodApSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODAPST_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodApSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApSt_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtCodApUn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODAPUN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodApUn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApUn_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            chkAp_NA.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "AP_NA_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkAp_NA.getInternalname(), "Enabled", GXutil.ltrimstr( chkAp_NA.getEnabled(), 5, 0), !bGXsfl_125_Refreshing);
            radAP_St.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "AP_ST_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, radAP_St.getInternalname(), "Enabled", GXutil.ltrimstr( radAP_St.getEnabled(), 5, 0), !bGXsfl_125_Refreshing);
            if ( ( nRcdExists_1660 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1ID1660( ) ;
            }
            sendRow1ID1660( ) ;
            bGXsfl_125_Refreshing = false ;
         }
         Gx_mode = sMode1660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1660 = (short)(5) ;
         nRcdExists_1660 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1ID1660( ) ;
            while ( RcdFound1660 != 0 )
            {
               sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1251660( ) ;
               init_level_properties1660( ) ;
               standaloneNotModal1ID1660( ) ;
               getByPrimaryKey1ID1660( ) ;
               standaloneModal1ID1660( ) ;
               addRow1ID1660( ) ;
               scanNext1ID1660( ) ;
            }
            scanEnd1ID1660( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1660 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1251660( ) ;
      initAll1ID1660( ) ;
      init_level_properties1660( ) ;
      nRcdExists_1660 = (short)(0) ;
      nIsMod_1660 = (short)(0) ;
      nRcdDeleted_1660 = (short)(0) ;
      nBlankRcdCount1660 = (short)(nBlankRcdUsr1660+nBlankRcdCount1660) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1660 > 0 )
      {
         standaloneNotModal1ID1660( ) ;
         standaloneModal1ID1660( ) ;
         addRow1ID1660( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCodApId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1660 = (short)(nBlankRcdCount1660-1) ;
      }
      Gx_mode = sMode1660 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpTAPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpTAPAR.htm");
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
         Z11791Ap_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z11791Ap_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11776Ap_fec = localUtil.ctod( httpContext.cgiGet( "Z11776Ap_fec"), 0) ;
         Z11777Ap_Disp = httpContext.cgiGet( "Z11777Ap_Disp") ;
         Z11778Ap_Ref = httpContext.cgiGet( "Z11778Ap_Ref") ;
         Z11779Ap_Art = httpContext.cgiGet( "Z11779Ap_Art") ;
         Z11780Ap_Mat = httpContext.cgiGet( "Z11780Ap_Mat") ;
         Z11781Ap_ColN = httpContext.cgiGet( "Z11781Ap_ColN") ;
         Z11782Ap_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( "Z11782Ap_ColNn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11783Ap_Tc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11783Ap_Tc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11784Ap_Maq = httpContext.cgiGet( "Z11784Ap_Maq") ;
         Z11785Ap_Cli = (int)(localUtil.ctol( httpContext.cgiGet( "Z11785Ap_Cli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11786Ap_Cln = httpContext.cgiGet( "Z11786Ap_Cln") ;
         Z11787Ap_norma = httpContext.cgiGet( "Z11787Ap_norma") ;
         Z11788Ap_obs = httpContext.cgiGet( "Z11788Ap_obs") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_125 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_125"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A132BarCodReo = (byte)(0) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAp_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAp_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AP_NUMERO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAp_numero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11791Ap_numero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
         }
         else
         {
            A11791Ap_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtAp_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtAp_fec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "AP_FEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAp_fec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11776Ap_fec = GXutil.nullDate() ;
            n11776Ap_fec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11776Ap_fec", localUtil.format(A11776Ap_fec, "99/99/99"));
         }
         else
         {
            A11776Ap_fec = localUtil.ctod( httpContext.cgiGet( edtAp_fec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n11776Ap_fec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11776Ap_fec", localUtil.format(A11776Ap_fec, "99/99/99"));
         }
         A11777Ap_Disp = httpContext.cgiGet( edtAp_Disp_Internalname) ;
         n11777Ap_Disp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11777Ap_Disp", A11777Ap_Disp);
         A11778Ap_Ref = httpContext.cgiGet( edtAp_Ref_Internalname) ;
         n11778Ap_Ref = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11778Ap_Ref", A11778Ap_Ref);
         A11779Ap_Art = httpContext.cgiGet( edtAp_Art_Internalname) ;
         n11779Ap_Art = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11779Ap_Art", A11779Ap_Art);
         A11780Ap_Mat = httpContext.cgiGet( edtAp_Mat_Internalname) ;
         n11780Ap_Mat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11780Ap_Mat", A11780Ap_Mat);
         A11781Ap_ColN = httpContext.cgiGet( edtAp_ColN_Internalname) ;
         n11781Ap_ColN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11781Ap_ColN", A11781Ap_ColN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAp_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAp_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AP_COLNN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAp_ColNn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11782Ap_ColNn = 0 ;
            n11782Ap_ColNn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11782Ap_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11782Ap_ColNn), 6, 0));
         }
         else
         {
            A11782Ap_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( edtAp_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11782Ap_ColNn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11782Ap_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11782Ap_ColNn), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAp_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAp_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AP_TC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAp_Tc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11783Ap_Tc = (byte)(0) ;
            n11783Ap_Tc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11783Ap_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11783Ap_Tc), 2, 0));
         }
         else
         {
            A11783Ap_Tc = (byte)(localUtil.ctol( httpContext.cgiGet( edtAp_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11783Ap_Tc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11783Ap_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11783Ap_Tc), 2, 0));
         }
         A11784Ap_Maq = httpContext.cgiGet( edtAp_Maq_Internalname) ;
         n11784Ap_Maq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11784Ap_Maq", A11784Ap_Maq);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAp_Cli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAp_Cli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AP_CLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAp_Cli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11785Ap_Cli = 0 ;
            n11785Ap_Cli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11785Ap_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11785Ap_Cli), 6, 0));
         }
         else
         {
            A11785Ap_Cli = (int)(localUtil.ctol( httpContext.cgiGet( edtAp_Cli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11785Ap_Cli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11785Ap_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11785Ap_Cli), 6, 0));
         }
         A11786Ap_Cln = httpContext.cgiGet( edtAp_Cln_Internalname) ;
         n11786Ap_Cln = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11786Ap_Cln", A11786Ap_Cln);
         A11787Ap_norma = httpContext.cgiGet( edtAp_norma_Internalname) ;
         n11787Ap_norma = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11787Ap_norma", A11787Ap_norma);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOpeCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A652OpeCod = 0 ;
            n652OpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         }
         else
         {
            A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n652OpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         }
         A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
         n653OpeNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A11788Ap_obs = httpContext.cgiGet( edtAp_obs_Internalname) ;
         n11788Ap_obs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11788Ap_obs", A11788Ap_obs);
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
            A11791Ap_numero = (int)(GXutil.lval( httpContext.GetPar( "Ap_numero"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
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
            initAll1ID1659( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1660_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1660_Enabled), 5, 0), !bGXsfl_125_Refreshing);
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
      disableAttributes1ID1659( ) ;
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

   public void confirm_1ID0( )
   {
      beforeValidate1ID1659( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1ID1659( ) ;
         }
         else
         {
            checkExtendedTable1ID1659( ) ;
            if ( AnyError == 0 )
            {
               zm1ID1659( 2) ;
               zm1ID1659( 3) ;
               zm1ID1659( 4) ;
            }
            closeExtendedTableCursors1ID1659( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1659 = Gx_mode ;
         confirm_1ID1660( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1659 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1659 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1ID0( ) ;
      }
   }

   public void confirm_1ID1660( )
   {
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow1ID1660( ) ;
         if ( ( nRcdExists_1660 != 0 ) || ( nIsMod_1660 != 0 ) )
         {
            getKey1ID1660( ) ;
            if ( ( nRcdExists_1660 == 0 ) && ( nRcdDeleted_1660 == 0 ) )
            {
               if ( RcdFound1660 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1ID1660( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1ID1660( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1ID1660( 6) ;
                     }
                     closeExtendedTableCursors1ID1660( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CODAPID_" + sGXsfl_125_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCodApId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1660 != 0 )
               {
                  if ( nRcdDeleted_1660 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1ID1660( ) ;
                     load1ID1660( ) ;
                     beforeValidate1ID1660( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1ID1660( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1660 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1ID1660( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1ID1660( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1ID1660( 6) ;
                           }
                           closeExtendedTableCursors1ID1660( ) ;
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
                  if ( nRcdDeleted_1660 == 0 )
                  {
                     GXCCtl = "CODAPID_" + sGXsfl_125_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCodApId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1660_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodApId_Internalname, GXutil.ltrim( localUtil.ntoc( A11792CodApId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodApPm_Internalname, GXutil.rtrim( A11793CodApPm)) ;
         httpContext.changePostValue( edtCodApSt_Internalname, GXutil.rtrim( A11794CodApSt)) ;
         httpContext.changePostValue( edtCodApUn_Internalname, GXutil.rtrim( A11795CodApUn)) ;
         httpContext.changePostValue( chkAp_NA.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11789Ap_NA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( radAP_St.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11790AP_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11792CodApId_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z11792CodApId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11789Ap_NA_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z11789Ap_NA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11790AP_St_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z11790AP_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1660_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1660_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1660_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1660 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1660_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1660_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODAPID_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODAPPM_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApPm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODAPST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODAPUN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApUn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_NA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkAp_NA.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_ST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( radAP_St.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1ID0( )
   {
   }

   public void zm1ID1659( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11776Ap_fec = T01ID6_A11776Ap_fec[0] ;
            Z11777Ap_Disp = T01ID6_A11777Ap_Disp[0] ;
            Z11778Ap_Ref = T01ID6_A11778Ap_Ref[0] ;
            Z11779Ap_Art = T01ID6_A11779Ap_Art[0] ;
            Z11780Ap_Mat = T01ID6_A11780Ap_Mat[0] ;
            Z11781Ap_ColN = T01ID6_A11781Ap_ColN[0] ;
            Z11782Ap_ColNn = T01ID6_A11782Ap_ColNn[0] ;
            Z11783Ap_Tc = T01ID6_A11783Ap_Tc[0] ;
            Z11784Ap_Maq = T01ID6_A11784Ap_Maq[0] ;
            Z11785Ap_Cli = T01ID6_A11785Ap_Cli[0] ;
            Z11786Ap_Cln = T01ID6_A11786Ap_Cln[0] ;
            Z11787Ap_norma = T01ID6_A11787Ap_norma[0] ;
            Z11788Ap_obs = T01ID6_A11788Ap_obs[0] ;
            Z129BarCod = T01ID6_A129BarCod[0] ;
            Z132BarCodReo = T01ID6_A132BarCodReo[0] ;
            Z130BarCodPar = T01ID6_A130BarCodPar[0] ;
            Z652OpeCod = T01ID6_A652OpeCod[0] ;
         }
         else
         {
            Z11776Ap_fec = A11776Ap_fec ;
            Z11777Ap_Disp = A11777Ap_Disp ;
            Z11778Ap_Ref = A11778Ap_Ref ;
            Z11779Ap_Art = A11779Ap_Art ;
            Z11780Ap_Mat = A11780Ap_Mat ;
            Z11781Ap_ColN = A11781Ap_ColN ;
            Z11782Ap_ColNn = A11782Ap_ColNn ;
            Z11783Ap_Tc = A11783Ap_Tc ;
            Z11784Ap_Maq = A11784Ap_Maq ;
            Z11785Ap_Cli = A11785Ap_Cli ;
            Z11786Ap_Cln = A11786Ap_Cln ;
            Z11787Ap_norma = A11787Ap_norma ;
            Z11788Ap_obs = A11788Ap_obs ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11791Ap_numero = A11791Ap_numero ;
         Z11776Ap_fec = A11776Ap_fec ;
         Z11777Ap_Disp = A11777Ap_Disp ;
         Z11778Ap_Ref = A11778Ap_Ref ;
         Z11779Ap_Art = A11779Ap_Art ;
         Z11780Ap_Mat = A11780Ap_Mat ;
         Z11781Ap_ColN = A11781Ap_ColN ;
         Z11782Ap_ColNn = A11782Ap_ColNn ;
         Z11783Ap_Tc = A11783Ap_Tc ;
         Z11784Ap_Maq = A11784Ap_Maq ;
         Z11785Ap_Cli = A11785Ap_Cli ;
         Z11786Ap_Cln = A11786Ap_Cln ;
         Z11787Ap_norma = A11787Ap_norma ;
         Z11788Ap_obs = A11788Ap_obs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z652OpeCod = A652OpeCod ;
         Z407EmprNom = A407EmprNom ;
         Z653OpeNom = A653OpeNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01ID7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01ID7_A407EmprNom[0] ;
      n407EmprNom = T01ID7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void load1ID1659( )
   {
      /* Using cursor T01ID10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1659 = (short)(1) ;
         A407EmprNom = T01ID10_A407EmprNom[0] ;
         n407EmprNom = T01ID10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11776Ap_fec = T01ID10_A11776Ap_fec[0] ;
         n11776Ap_fec = T01ID10_n11776Ap_fec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11776Ap_fec", localUtil.format(A11776Ap_fec, "99/99/99"));
         A11777Ap_Disp = T01ID10_A11777Ap_Disp[0] ;
         n11777Ap_Disp = T01ID10_n11777Ap_Disp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11777Ap_Disp", A11777Ap_Disp);
         A11778Ap_Ref = T01ID10_A11778Ap_Ref[0] ;
         n11778Ap_Ref = T01ID10_n11778Ap_Ref[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11778Ap_Ref", A11778Ap_Ref);
         A11779Ap_Art = T01ID10_A11779Ap_Art[0] ;
         n11779Ap_Art = T01ID10_n11779Ap_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11779Ap_Art", A11779Ap_Art);
         A11780Ap_Mat = T01ID10_A11780Ap_Mat[0] ;
         n11780Ap_Mat = T01ID10_n11780Ap_Mat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11780Ap_Mat", A11780Ap_Mat);
         A11781Ap_ColN = T01ID10_A11781Ap_ColN[0] ;
         n11781Ap_ColN = T01ID10_n11781Ap_ColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11781Ap_ColN", A11781Ap_ColN);
         A11782Ap_ColNn = T01ID10_A11782Ap_ColNn[0] ;
         n11782Ap_ColNn = T01ID10_n11782Ap_ColNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11782Ap_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11782Ap_ColNn), 6, 0));
         A11783Ap_Tc = T01ID10_A11783Ap_Tc[0] ;
         n11783Ap_Tc = T01ID10_n11783Ap_Tc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11783Ap_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11783Ap_Tc), 2, 0));
         A11784Ap_Maq = T01ID10_A11784Ap_Maq[0] ;
         n11784Ap_Maq = T01ID10_n11784Ap_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11784Ap_Maq", A11784Ap_Maq);
         A11785Ap_Cli = T01ID10_A11785Ap_Cli[0] ;
         n11785Ap_Cli = T01ID10_n11785Ap_Cli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11785Ap_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11785Ap_Cli), 6, 0));
         A11786Ap_Cln = T01ID10_A11786Ap_Cln[0] ;
         n11786Ap_Cln = T01ID10_n11786Ap_Cln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11786Ap_Cln", A11786Ap_Cln);
         A11787Ap_norma = T01ID10_A11787Ap_norma[0] ;
         n11787Ap_norma = T01ID10_n11787Ap_norma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11787Ap_norma", A11787Ap_norma);
         A653OpeNom = T01ID10_A653OpeNom[0] ;
         n653OpeNom = T01ID10_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A11788Ap_obs = T01ID10_A11788Ap_obs[0] ;
         n11788Ap_obs = T01ID10_n11788Ap_obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11788Ap_obs", A11788Ap_obs);
         A129BarCod = T01ID10_A129BarCod[0] ;
         n129BarCod = T01ID10_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01ID10_A132BarCodReo[0] ;
         n132BarCodReo = T01ID10_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01ID10_A130BarCodPar[0] ;
         n130BarCodPar = T01ID10_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01ID10_A652OpeCod[0] ;
         n652OpeCod = T01ID10_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zm1ID1659( -1) ;
      }
      pr_default.close(8);
      onLoadActions1ID1659( ) ;
   }

   public void onLoadActions1ID1659( )
   {
   }

   public void checkExtendedTable1ID1659( )
   {
      nIsDirty_1659 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01ID8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      /* Using cursor T01ID9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01ID9_A653OpeNom[0] ;
      n653OpeNom = T01ID9_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1ID1659( )
   {
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01ID11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_4( String A396EmprCod ,
                         int A652OpeCod )
   {
      /* Using cursor T01ID12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01ID12_A653OpeNom[0] ;
      n653OpeNom = T01ID12_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1ID1659( )
   {
      /* Using cursor T01ID13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1659 = (short)(1) ;
      }
      else
      {
         RcdFound1659 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01ID6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01ID6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1ID1659( 1) ;
         RcdFound1659 = (short)(1) ;
         A11791Ap_numero = T01ID6_A11791Ap_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
         A11776Ap_fec = T01ID6_A11776Ap_fec[0] ;
         n11776Ap_fec = T01ID6_n11776Ap_fec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11776Ap_fec", localUtil.format(A11776Ap_fec, "99/99/99"));
         A11777Ap_Disp = T01ID6_A11777Ap_Disp[0] ;
         n11777Ap_Disp = T01ID6_n11777Ap_Disp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11777Ap_Disp", A11777Ap_Disp);
         A11778Ap_Ref = T01ID6_A11778Ap_Ref[0] ;
         n11778Ap_Ref = T01ID6_n11778Ap_Ref[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11778Ap_Ref", A11778Ap_Ref);
         A11779Ap_Art = T01ID6_A11779Ap_Art[0] ;
         n11779Ap_Art = T01ID6_n11779Ap_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11779Ap_Art", A11779Ap_Art);
         A11780Ap_Mat = T01ID6_A11780Ap_Mat[0] ;
         n11780Ap_Mat = T01ID6_n11780Ap_Mat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11780Ap_Mat", A11780Ap_Mat);
         A11781Ap_ColN = T01ID6_A11781Ap_ColN[0] ;
         n11781Ap_ColN = T01ID6_n11781Ap_ColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11781Ap_ColN", A11781Ap_ColN);
         A11782Ap_ColNn = T01ID6_A11782Ap_ColNn[0] ;
         n11782Ap_ColNn = T01ID6_n11782Ap_ColNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11782Ap_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11782Ap_ColNn), 6, 0));
         A11783Ap_Tc = T01ID6_A11783Ap_Tc[0] ;
         n11783Ap_Tc = T01ID6_n11783Ap_Tc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11783Ap_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11783Ap_Tc), 2, 0));
         A11784Ap_Maq = T01ID6_A11784Ap_Maq[0] ;
         n11784Ap_Maq = T01ID6_n11784Ap_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11784Ap_Maq", A11784Ap_Maq);
         A11785Ap_Cli = T01ID6_A11785Ap_Cli[0] ;
         n11785Ap_Cli = T01ID6_n11785Ap_Cli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11785Ap_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11785Ap_Cli), 6, 0));
         A11786Ap_Cln = T01ID6_A11786Ap_Cln[0] ;
         n11786Ap_Cln = T01ID6_n11786Ap_Cln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11786Ap_Cln", A11786Ap_Cln);
         A11787Ap_norma = T01ID6_A11787Ap_norma[0] ;
         n11787Ap_norma = T01ID6_n11787Ap_norma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11787Ap_norma", A11787Ap_norma);
         A11788Ap_obs = T01ID6_A11788Ap_obs[0] ;
         n11788Ap_obs = T01ID6_n11788Ap_obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11788Ap_obs", A11788Ap_obs);
         A129BarCod = T01ID6_A129BarCod[0] ;
         n129BarCod = T01ID6_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01ID6_A132BarCodReo[0] ;
         n132BarCodReo = T01ID6_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01ID6_A130BarCodPar[0] ;
         n130BarCodPar = T01ID6_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01ID6_A652OpeCod[0] ;
         n652OpeCod = T01ID6_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z11791Ap_numero = A11791Ap_numero ;
         sMode1659 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1ID1659( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1659 = (short)(0) ;
            initializeNonKey1ID1659( ) ;
         }
         Gx_mode = sMode1659 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1659 = (short)(0) ;
         initializeNonKey1ID1659( ) ;
         sMode1659 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1659 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1ID1659( ) ;
      if ( RcdFound1659 == 0 )
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
      RcdFound1659 = (short)(0) ;
      /* Using cursor T01ID14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A11791Ap_numero), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01ID14_A11791Ap_numero[0] < A11791Ap_numero ) ) && ( GXutil.strcmp(T01ID14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01ID14_A11791Ap_numero[0] > A11791Ap_numero ) ) && ( GXutil.strcmp(T01ID14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11791Ap_numero = T01ID14_A11791Ap_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
            RcdFound1659 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1659 = (short)(0) ;
      /* Using cursor T01ID15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A11791Ap_numero), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01ID15_A11791Ap_numero[0] > A11791Ap_numero ) ) && ( GXutil.strcmp(T01ID15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01ID15_A11791Ap_numero[0] < A11791Ap_numero ) ) && ( GXutil.strcmp(T01ID15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11791Ap_numero = T01ID15_A11791Ap_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
            RcdFound1659 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1ID1659( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1ID1659( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1659 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11791Ap_numero != Z11791Ap_numero ) )
            {
               A11791Ap_numero = Z11791Ap_numero ;
               httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1ID1659( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11791Ap_numero != Z11791Ap_numero ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1ID1659( ) ;
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
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1ID1659( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11791Ap_numero != Z11791Ap_numero ) )
      {
         A11791Ap_numero = Z11791Ap_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarCod_Internalname ;
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
      getKey1ID1659( ) ;
      if ( RcdFound1659 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11791Ap_numero != Z11791Ap_numero ) )
         {
            A11791Ap_numero = Z11791Ap_numero ;
            httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11791Ap_numero != Z11791Ap_numero ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tptapar");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1ID0( ) ;
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
      if ( RcdFound1659 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1ID1659( ) ;
      if ( RcdFound1659 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1ID1659( ) ;
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
      if ( RcdFound1659 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      if ( RcdFound1659 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      scanStart1ID1659( ) ;
      if ( RcdFound1659 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1659 != 0 )
         {
            scanNext1ID1659( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1ID1659( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1ID1659( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01ID5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAPAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z11776Ap_fec), GXutil.resetTime(T01ID5_A11776Ap_fec[0])) ) || ( GXutil.strcmp(Z11777Ap_Disp, T01ID5_A11777Ap_Disp[0]) != 0 ) || ( GXutil.strcmp(Z11778Ap_Ref, T01ID5_A11778Ap_Ref[0]) != 0 ) || ( GXutil.strcmp(Z11779Ap_Art, T01ID5_A11779Ap_Art[0]) != 0 ) || ( GXutil.strcmp(Z11780Ap_Mat, T01ID5_A11780Ap_Mat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11781Ap_ColN, T01ID5_A11781Ap_ColN[0]) != 0 ) || ( Z11782Ap_ColNn != T01ID5_A11782Ap_ColNn[0] ) || ( Z11783Ap_Tc != T01ID5_A11783Ap_Tc[0] ) || ( GXutil.strcmp(Z11784Ap_Maq, T01ID5_A11784Ap_Maq[0]) != 0 ) || ( Z11785Ap_Cli != T01ID5_A11785Ap_Cli[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11786Ap_Cln, T01ID5_A11786Ap_Cln[0]) != 0 ) || ( GXutil.strcmp(Z11787Ap_norma, T01ID5_A11787Ap_norma[0]) != 0 ) || ( GXutil.strcmp(Z11788Ap_obs, T01ID5_A11788Ap_obs[0]) != 0 ) || ( Z129BarCod != T01ID5_A129BarCod[0] ) || ( Z132BarCodReo != T01ID5_A132BarCodReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z130BarCodPar, T01ID5_A130BarCodPar[0]) != 0 ) || ( Z652OpeCod != T01ID5_A652OpeCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11776Ap_fec), GXutil.resetTime(T01ID5_A11776Ap_fec[0])) ) )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_fec");
               GXutil.writeLogRaw("Old: ",Z11776Ap_fec);
               GXutil.writeLogRaw("Current: ",T01ID5_A11776Ap_fec[0]);
            }
            if ( GXutil.strcmp(Z11777Ap_Disp, T01ID5_A11777Ap_Disp[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_Disp");
               GXutil.writeLogRaw("Old: ",Z11777Ap_Disp);
               GXutil.writeLogRaw("Current: ",T01ID5_A11777Ap_Disp[0]);
            }
            if ( GXutil.strcmp(Z11778Ap_Ref, T01ID5_A11778Ap_Ref[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_Ref");
               GXutil.writeLogRaw("Old: ",Z11778Ap_Ref);
               GXutil.writeLogRaw("Current: ",T01ID5_A11778Ap_Ref[0]);
            }
            if ( GXutil.strcmp(Z11779Ap_Art, T01ID5_A11779Ap_Art[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_Art");
               GXutil.writeLogRaw("Old: ",Z11779Ap_Art);
               GXutil.writeLogRaw("Current: ",T01ID5_A11779Ap_Art[0]);
            }
            if ( GXutil.strcmp(Z11780Ap_Mat, T01ID5_A11780Ap_Mat[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_Mat");
               GXutil.writeLogRaw("Old: ",Z11780Ap_Mat);
               GXutil.writeLogRaw("Current: ",T01ID5_A11780Ap_Mat[0]);
            }
            if ( GXutil.strcmp(Z11781Ap_ColN, T01ID5_A11781Ap_ColN[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_ColN");
               GXutil.writeLogRaw("Old: ",Z11781Ap_ColN);
               GXutil.writeLogRaw("Current: ",T01ID5_A11781Ap_ColN[0]);
            }
            if ( Z11782Ap_ColNn != T01ID5_A11782Ap_ColNn[0] )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_ColNn");
               GXutil.writeLogRaw("Old: ",Z11782Ap_ColNn);
               GXutil.writeLogRaw("Current: ",T01ID5_A11782Ap_ColNn[0]);
            }
            if ( Z11783Ap_Tc != T01ID5_A11783Ap_Tc[0] )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_Tc");
               GXutil.writeLogRaw("Old: ",Z11783Ap_Tc);
               GXutil.writeLogRaw("Current: ",T01ID5_A11783Ap_Tc[0]);
            }
            if ( GXutil.strcmp(Z11784Ap_Maq, T01ID5_A11784Ap_Maq[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_Maq");
               GXutil.writeLogRaw("Old: ",Z11784Ap_Maq);
               GXutil.writeLogRaw("Current: ",T01ID5_A11784Ap_Maq[0]);
            }
            if ( Z11785Ap_Cli != T01ID5_A11785Ap_Cli[0] )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_Cli");
               GXutil.writeLogRaw("Old: ",Z11785Ap_Cli);
               GXutil.writeLogRaw("Current: ",T01ID5_A11785Ap_Cli[0]);
            }
            if ( GXutil.strcmp(Z11786Ap_Cln, T01ID5_A11786Ap_Cln[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_Cln");
               GXutil.writeLogRaw("Old: ",Z11786Ap_Cln);
               GXutil.writeLogRaw("Current: ",T01ID5_A11786Ap_Cln[0]);
            }
            if ( GXutil.strcmp(Z11787Ap_norma, T01ID5_A11787Ap_norma[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_norma");
               GXutil.writeLogRaw("Old: ",Z11787Ap_norma);
               GXutil.writeLogRaw("Current: ",T01ID5_A11787Ap_norma[0]);
            }
            if ( GXutil.strcmp(Z11788Ap_obs, T01ID5_A11788Ap_obs[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_obs");
               GXutil.writeLogRaw("Old: ",Z11788Ap_obs);
               GXutil.writeLogRaw("Current: ",T01ID5_A11788Ap_obs[0]);
            }
            if ( Z129BarCod != T01ID5_A129BarCod[0] )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01ID5_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01ID5_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01ID5_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01ID5_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01ID5_A130BarCodPar[0]);
            }
            if ( Z652OpeCod != T01ID5_A652OpeCod[0] )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T01ID5_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTAPAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1ID1659( )
   {
      beforeValidate1ID1659( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ID1659( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1ID1659( 0) ;
         checkOptimisticConcurrency1ID1659( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ID1659( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1ID1659( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ID16 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A11791Ap_numero), Boolean.valueOf(n11776Ap_fec), A11776Ap_fec, Boolean.valueOf(n11777Ap_Disp), A11777Ap_Disp, Boolean.valueOf(n11778Ap_Ref), A11778Ap_Ref, Boolean.valueOf(n11779Ap_Art), A11779Ap_Art, Boolean.valueOf(n11780Ap_Mat), A11780Ap_Mat, Boolean.valueOf(n11781Ap_ColN), A11781Ap_ColN, Boolean.valueOf(n11782Ap_ColNn), Integer.valueOf(A11782Ap_ColNn), Boolean.valueOf(n11783Ap_Tc), Byte.valueOf(A11783Ap_Tc), Boolean.valueOf(n11784Ap_Maq), A11784Ap_Maq, Boolean.valueOf(n11785Ap_Cli), Integer.valueOf(A11785Ap_Cli), Boolean.valueOf(n11786Ap_Cln), A11786Ap_Cln, Boolean.valueOf(n11787Ap_norma), A11787Ap_norma, Boolean.valueOf(n11788Ap_obs), A11788Ap_obs, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAPAR");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1ID1659( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1ID0( ) ;
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
            load1ID1659( ) ;
         }
         endLevel1ID1659( ) ;
      }
      closeExtendedTableCursors1ID1659( ) ;
   }

   public void update1ID1659( )
   {
      beforeValidate1ID1659( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ID1659( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ID1659( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ID1659( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1ID1659( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ID17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n11776Ap_fec), A11776Ap_fec, Boolean.valueOf(n11777Ap_Disp), A11777Ap_Disp, Boolean.valueOf(n11778Ap_Ref), A11778Ap_Ref, Boolean.valueOf(n11779Ap_Art), A11779Ap_Art, Boolean.valueOf(n11780Ap_Mat), A11780Ap_Mat, Boolean.valueOf(n11781Ap_ColN), A11781Ap_ColN, Boolean.valueOf(n11782Ap_ColNn), Integer.valueOf(A11782Ap_ColNn), Boolean.valueOf(n11783Ap_Tc), Byte.valueOf(A11783Ap_Tc), Boolean.valueOf(n11784Ap_Maq), A11784Ap_Maq, Boolean.valueOf(n11785Ap_Cli), Integer.valueOf(A11785Ap_Cli), Boolean.valueOf(n11786Ap_Cln), A11786Ap_Cln, Boolean.valueOf(n11787Ap_norma), A11787Ap_norma, Boolean.valueOf(n11788Ap_obs), A11788Ap_obs, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A11791Ap_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAPAR");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAPAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1ID1659( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1ID1659( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1ID0( ) ;
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
         endLevel1ID1659( ) ;
      }
      closeExtendedTableCursors1ID1659( ) ;
   }

   public void deferredUpdate1ID1659( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1ID1659( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ID1659( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1ID1659( ) ;
         afterConfirm1ID1659( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1ID1659( ) ;
            if ( AnyError == 0 )
            {
               scanStart1ID1660( ) ;
               while ( RcdFound1660 != 0 )
               {
                  getByPrimaryKey1ID1660( ) ;
                  delete1ID1660( ) ;
                  scanNext1ID1660( ) ;
               }
               scanEnd1ID1660( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ID18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAPAR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1659 == 0 )
                        {
                           initAll1ID1659( ) ;
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
                        resetCaption1ID0( ) ;
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
      sMode1659 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1ID1659( ) ;
      Gx_mode = sMode1659 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1ID1659( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01ID19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T01ID19_A653OpeNom[0] ;
         n653OpeNom = T01ID19_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(17);
      }
   }

   public void processNestedLevel1ID1660( )
   {
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow1ID1660( ) ;
         if ( ( nRcdExists_1660 != 0 ) || ( nIsMod_1660 != 0 ) )
         {
            standaloneNotModal1ID1660( ) ;
            getKey1ID1660( ) ;
            if ( ( nRcdExists_1660 == 0 ) && ( nRcdDeleted_1660 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1ID1660( ) ;
            }
            else
            {
               if ( RcdFound1660 != 0 )
               {
                  if ( ( nRcdDeleted_1660 != 0 ) && ( nRcdExists_1660 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1ID1660( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1660 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1ID1660( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1660 == 0 )
                  {
                     GXCCtl = "CODAPID_" + sGXsfl_125_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCodApId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1660_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodApId_Internalname, GXutil.ltrim( localUtil.ntoc( A11792CodApId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodApPm_Internalname, GXutil.rtrim( A11793CodApPm)) ;
         httpContext.changePostValue( edtCodApSt_Internalname, GXutil.rtrim( A11794CodApSt)) ;
         httpContext.changePostValue( edtCodApUn_Internalname, GXutil.rtrim( A11795CodApUn)) ;
         httpContext.changePostValue( chkAp_NA.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11789Ap_NA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( radAP_St.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11790AP_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11792CodApId_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z11792CodApId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11789Ap_NA_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z11789Ap_NA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11790AP_St_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z11790AP_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1660_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1660_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1660_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1660 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1660_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1660_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODAPID_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODAPPM_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApPm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODAPST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODAPUN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApUn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_NA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkAp_NA.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_ST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( radAP_St.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1ID1660( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1660 = (short)(0) ;
      nIsMod_1660 = (short)(0) ;
      nRcdDeleted_1660 = (short)(0) ;
   }

   public void processLevel1ID1659( )
   {
      /* Save parent mode. */
      sMode1659 = Gx_mode ;
      processNestedLevel1ID1660( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1659 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1ID1659( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1ID1659( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tptapar");
         if ( AnyError == 0 )
         {
            confirmValues1ID0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tptapar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1ID1659( )
   {
      this.A396EmprCod = A396EmprCod ;
      /* Scan By routine */
      /* Using cursor T01ID20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      RcdFound1659 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1659 = (short)(1) ;
         A11791Ap_numero = T01ID20_A11791Ap_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1ID1659( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1659 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1659 = (short)(1) ;
         A11791Ap_numero = T01ID20_A11791Ap_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
      }
   }

   public void scanEnd1ID1659( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1ID1659( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1ID1659( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1ID1659( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1ID1659( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1ID1659( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1ID1659( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1ID1659( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAp_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_numero_Enabled), 5, 0), true);
      edtAp_fec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_fec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_fec_Enabled), 5, 0), true);
      edtAp_Disp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Disp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Disp_Enabled), 5, 0), true);
      edtAp_Ref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Ref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Ref_Enabled), 5, 0), true);
      edtAp_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Art_Enabled), 5, 0), true);
      edtAp_Mat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Mat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Mat_Enabled), 5, 0), true);
      edtAp_ColN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_ColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_ColN_Enabled), 5, 0), true);
      edtAp_ColNn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_ColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_ColNn_Enabled), 5, 0), true);
      edtAp_Tc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Tc_Enabled), 5, 0), true);
      edtAp_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Maq_Enabled), 5, 0), true);
      edtAp_Cli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Cli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Cli_Enabled), 5, 0), true);
      edtAp_Cln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Cln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Cln_Enabled), 5, 0), true);
      edtAp_norma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_norma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_norma_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtAp_obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_obs_Enabled), 5, 0), true);
   }

   public void zm1ID1660( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11789Ap_NA = T01ID3_A11789Ap_NA[0] ;
            Z11790AP_St = T01ID3_A11790AP_St[0] ;
         }
         else
         {
            Z11789Ap_NA = A11789Ap_NA ;
            Z11790AP_St = A11790AP_St ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z11791Ap_numero = A11791Ap_numero ;
         Z11789Ap_NA = A11789Ap_NA ;
         Z11790AP_St = A11790AP_St ;
         Z396EmprCod = A396EmprCod ;
         Z11792CodApId = A11792CodApId ;
         Z11793CodApPm = A11793CodApPm ;
         Z11794CodApSt = A11794CodApSt ;
         Z11795CodApUn = A11795CodApUn ;
      }
   }

   public void standaloneNotModal1ID1660( )
   {
   }

   public void standaloneModal1ID1660( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCodApId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodApId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApId_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
      else
      {
         edtCodApId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodApId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApId_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
   }

   public void load1ID1660( )
   {
      /* Using cursor T01ID21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero), Short.valueOf(A11792CodApId)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1660 = (short)(1) ;
         A11793CodApPm = T01ID21_A11793CodApPm[0] ;
         n11793CodApPm = T01ID21_n11793CodApPm[0] ;
         A11794CodApSt = T01ID21_A11794CodApSt[0] ;
         n11794CodApSt = T01ID21_n11794CodApSt[0] ;
         A11795CodApUn = T01ID21_A11795CodApUn[0] ;
         n11795CodApUn = T01ID21_n11795CodApUn[0] ;
         A11789Ap_NA = T01ID21_A11789Ap_NA[0] ;
         n11789Ap_NA = T01ID21_n11789Ap_NA[0] ;
         A11790AP_St = T01ID21_A11790AP_St[0] ;
         n11790AP_St = T01ID21_n11790AP_St[0] ;
         zm1ID1660( -5) ;
      }
      pr_default.close(19);
      onLoadActions1ID1660( ) ;
   }

   public void onLoadActions1ID1660( )
   {
   }

   public void checkExtendedTable1ID1660( )
   {
      nIsDirty_1660 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1ID1660( ) ;
      /* Using cursor T01ID4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A11792CodApId)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CODAPID_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Valores", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodApId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11793CodApPm = T01ID4_A11793CodApPm[0] ;
      n11793CodApPm = T01ID4_n11793CodApPm[0] ;
      A11794CodApSt = T01ID4_A11794CodApSt[0] ;
      n11794CodApSt = T01ID4_n11794CodApSt[0] ;
      A11795CodApUn = T01ID4_A11795CodApUn[0] ;
      n11795CodApUn = T01ID4_n11795CodApUn[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1ID1660( )
   {
      pr_default.close(2);
   }

   public void enableDisable1ID1660( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         short A11792CodApId )
   {
      /* Using cursor T01ID22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A11792CodApId)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "CODAPID_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Valores", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodApId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11793CodApPm = T01ID22_A11793CodApPm[0] ;
      n11793CodApPm = T01ID22_n11793CodApPm[0] ;
      A11794CodApSt = T01ID22_A11794CodApSt[0] ;
      n11794CodApSt = T01ID22_n11794CodApSt[0] ;
      A11795CodApUn = T01ID22_A11795CodApUn[0] ;
      n11795CodApUn = T01ID22_n11795CodApUn[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11793CodApPm))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11794CodApSt))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11795CodApUn))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1ID1660( )
   {
      /* Using cursor T01ID23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero), Short.valueOf(A11792CodApId)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1660 = (short)(1) ;
      }
      else
      {
         RcdFound1660 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1ID1660( )
   {
      /* Using cursor T01ID3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero), Short.valueOf(A11792CodApId)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01ID3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1ID1660( 5) ;
         RcdFound1660 = (short)(1) ;
         initializeNonKey1ID1660( ) ;
         A11789Ap_NA = T01ID3_A11789Ap_NA[0] ;
         n11789Ap_NA = T01ID3_n11789Ap_NA[0] ;
         A11790AP_St = T01ID3_A11790AP_St[0] ;
         n11790AP_St = T01ID3_n11790AP_St[0] ;
         A11792CodApId = T01ID3_A11792CodApId[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11791Ap_numero = A11791Ap_numero ;
         Z11792CodApId = A11792CodApId ;
         sMode1660 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1ID1660( ) ;
         load1ID1660( ) ;
         Gx_mode = sMode1660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1660 = (short)(0) ;
         initializeNonKey1ID1660( ) ;
         sMode1660 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1ID1660( ) ;
         Gx_mode = sMode1660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1ID1660( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1ID1660( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01ID2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero), Short.valueOf(A11792CodApId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAPARL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z11789Ap_NA != T01ID2_A11789Ap_NA[0] ) || ( Z11790AP_St != T01ID2_A11790AP_St[0] ) )
         {
            if ( Z11789Ap_NA != T01ID2_A11789Ap_NA[0] )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"Ap_NA");
               GXutil.writeLogRaw("Old: ",Z11789Ap_NA);
               GXutil.writeLogRaw("Current: ",T01ID2_A11789Ap_NA[0]);
            }
            if ( Z11790AP_St != T01ID2_A11790AP_St[0] )
            {
               GXutil.writeLogln("tptapar:[seudo value changed for attri]"+"AP_St");
               GXutil.writeLogRaw("Old: ",Z11790AP_St);
               GXutil.writeLogRaw("Current: ",T01ID2_A11790AP_St[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTAPARL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1ID1660( )
   {
      beforeValidate1ID1660( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ID1660( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1ID1660( 0) ;
         checkOptimisticConcurrency1ID1660( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ID1660( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1ID1660( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ID24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A11791Ap_numero), Boolean.valueOf(n11789Ap_NA), Byte.valueOf(A11789Ap_NA), Boolean.valueOf(n11790AP_St), Byte.valueOf(A11790AP_St), A396EmprCod, Short.valueOf(A11792CodApId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAPARL");
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
            load1ID1660( ) ;
         }
         endLevel1ID1660( ) ;
      }
      closeExtendedTableCursors1ID1660( ) ;
   }

   public void update1ID1660( )
   {
      beforeValidate1ID1660( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ID1660( ) ;
      }
      if ( ( nIsMod_1660 != 0 ) || ( nIsDirty_1660 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1ID1660( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1ID1660( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1ID1660( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01ID25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n11789Ap_NA), Byte.valueOf(A11789Ap_NA), Boolean.valueOf(n11790AP_St), Byte.valueOf(A11790AP_St), A396EmprCod, Integer.valueOf(A11791Ap_numero), Short.valueOf(A11792CodApId)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAPARL");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAPARL"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1ID1660( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1ID1660( ) ;
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
            endLevel1ID1660( ) ;
         }
      }
      closeExtendedTableCursors1ID1660( ) ;
   }

   public void deferredUpdate1ID1660( )
   {
   }

   public void delete1ID1660( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1ID1660( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ID1660( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1ID1660( ) ;
         afterConfirm1ID1660( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1ID1660( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01ID26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero), Short.valueOf(A11792CodApId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAPARL");
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
      sMode1660 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1ID1660( ) ;
      Gx_mode = sMode1660 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1ID1660( )
   {
      standaloneModal1ID1660( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01ID27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A11792CodApId)});
         A11793CodApPm = T01ID27_A11793CodApPm[0] ;
         n11793CodApPm = T01ID27_n11793CodApPm[0] ;
         A11794CodApSt = T01ID27_A11794CodApSt[0] ;
         n11794CodApSt = T01ID27_n11794CodApSt[0] ;
         A11795CodApUn = T01ID27_A11795CodApUn[0] ;
         n11795CodApUn = T01ID27_n11795CodApUn[0] ;
         pr_default.close(25);
      }
   }

   public void endLevel1ID1660( )
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

   public void scanStart1ID1660( )
   {
      /* Scan By routine */
      /* Using cursor T01ID28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A11791Ap_numero)});
      RcdFound1660 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1660 = (short)(1) ;
         A11792CodApId = T01ID28_A11792CodApId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1ID1660( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1660 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1660 = (short)(1) ;
         A11792CodApId = T01ID28_A11792CodApId[0] ;
      }
   }

   public void scanEnd1ID1660( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1ID1660( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1ID1660( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1ID1660( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1ID1660( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1ID1660( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1ID1660( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1ID1660( )
   {
      edtCodApId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodApId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApId_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtCodApPm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodApPm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApPm_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtCodApSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodApSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApSt_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtCodApUn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodApUn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApUn_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      chkAp_NA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkAp_NA.getInternalname(), "Enabled", GXutil.ltrimstr( chkAp_NA.getEnabled(), 5, 0), !bGXsfl_125_Refreshing);
      radAP_St.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radAP_St.getInternalname(), "Enabled", GXutil.ltrimstr( radAP_St.getEnabled(), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void send_integrity_lvl_hashes1ID1660( )
   {
   }

   public void send_integrity_lvl_hashes1ID1659( )
   {
   }

   public void subsflControlProps_1251660( )
   {
      edtavnRcdDeleted_1660_Internalname = "vNRCDDELETED_1660_"+sGXsfl_125_idx ;
      edtCodApId_Internalname = "CODAPID_"+sGXsfl_125_idx ;
      edtCodApPm_Internalname = "CODAPPM_"+sGXsfl_125_idx ;
      edtCodApSt_Internalname = "CODAPST_"+sGXsfl_125_idx ;
      edtCodApUn_Internalname = "CODAPUN_"+sGXsfl_125_idx ;
      chkAp_NA.setInternalname( "AP_NA_"+sGXsfl_125_idx );
      radAP_St.setInternalname( "AP_ST_"+sGXsfl_125_idx );
   }

   public void subsflControlProps_fel_1251660( )
   {
      edtavnRcdDeleted_1660_Internalname = "vNRCDDELETED_1660_"+sGXsfl_125_fel_idx ;
      edtCodApId_Internalname = "CODAPID_"+sGXsfl_125_fel_idx ;
      edtCodApPm_Internalname = "CODAPPM_"+sGXsfl_125_fel_idx ;
      edtCodApSt_Internalname = "CODAPST_"+sGXsfl_125_fel_idx ;
      edtCodApUn_Internalname = "CODAPUN_"+sGXsfl_125_fel_idx ;
      chkAp_NA.setInternalname( "AP_NA_"+sGXsfl_125_fel_idx );
      radAP_St.setInternalname( "AP_ST_"+sGXsfl_125_fel_idx );
   }

   public void addRow1ID1660( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1251660( ) ;
      sendRow1ID1660( ) ;
   }

   public void sendRow1ID1660( )
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
         if ( ((int)((nGXsfl_125_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1660_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1660_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1660_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1660), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1660), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1660_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1660_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1660_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodApId_Internalname,GXutil.ltrim( localUtil.ntoc( A11792CodApId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11792CodApId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodApId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCodApId_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodApPm_Internalname,GXutil.rtrim( A11793CodApPm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodApPm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCodApPm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodApSt_Internalname,GXutil.rtrim( A11794CodApSt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodApSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCodApSt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodApUn_Internalname,GXutil.rtrim( A11795CodApUn),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodApUn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCodApUn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1660_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "AP_NA_" + sGXsfl_125_idx ;
      chkAp_NA.setName( GXCCtl );
      chkAp_NA.setWebtags( "" );
      chkAp_NA.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkAp_NA.getInternalname(), "TitleCaption", chkAp_NA.getCaption(), !bGXsfl_125_Refreshing);
      chkAp_NA.setCheckedValue( "0" );
      A11789Ap_NA = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A11789Ap_NA, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n11789Ap_NA = false ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkAp_NA.getInternalname(),GXutil.str( A11789Ap_NA, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkAp_NA.getEnabled()),"1","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(131, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\""});
      /* Subfile cell */
      /* Radio button */
      ClassString = "Attribute" ;
      StyleString = "" ;
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1660_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      if ( ( radAP_St.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "AP_ST_" + sGXsfl_125_idx ;
         radAP_St.setName( GXCCtl );
         radAP_St.setWebtags( "" );
         radAP_St.addItem("1", httpContext.getMessage( "Passou", ""), (short)(0));
         radAP_St.addItem("0", httpContext.getMessage( "Falhou", ""), (short)(0));
      }
      Grid1Row.AddColumnProperties("radio", 2, isAjaxCallMode( ), new Object[] {radAP_St,radAP_St.getInternalname(),GXutil.str( A11790AP_St, 1, 0),"",Integer.valueOf(-1),Integer.valueOf(radAP_St.getEnabled()),Integer.valueOf(1),Integer.valueOf(1),StyleString,ClassString,"","",Integer.valueOf(0),radAP_St.getJsonclick(),"'"+""+"'"+",false,"+"'"+""+"'",TempTags+" onclick="+"\""+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1ID1660( ) ;
      GXCCtl = "Z11792CodApId_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11792CodApId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11789Ap_NA_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11789Ap_NA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11790AP_St_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11790AP_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1660_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1660_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1660_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1660, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV62BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV61BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV63BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1660_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1660_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODAPID_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODAPPM_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApPm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODAPST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODAPUN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApUn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_NA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkAp_NA.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_ST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( radAP_St.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1ID1660( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1251660( ) ;
      edtavnRcdDeleted_1660_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1660_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodApId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODAPID_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodApPm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODAPPM_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodApSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODAPST_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodApUn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODAPUN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkAp_NA.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "AP_NA_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      radAP_St.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "AP_ST_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1660_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1660_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1660");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1660_Internalname ;
         wbErr = true ;
         nRcdDeleted_1660 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1660 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1660_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCodApId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCodApId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CODAPID_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodApId_Internalname ;
         wbErr = true ;
         A11792CodApId = (short)(0) ;
      }
      else
      {
         A11792CodApId = (short)(localUtil.ctol( httpContext.cgiGet( edtCodApId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11793CodApPm = httpContext.cgiGet( edtCodApPm_Internalname) ;
      n11793CodApPm = false ;
      A11794CodApSt = httpContext.cgiGet( edtCodApSt_Internalname) ;
      n11794CodApSt = false ;
      A11795CodApUn = httpContext.cgiGet( edtCodApUn_Internalname) ;
      n11795CodApUn = false ;
      if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkAp_NA.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkAp_NA.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
      {
         GXCCtl = "AP_NA_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkAp_NA.getInternalname() ;
         wbErr = true ;
         A11789Ap_NA = (byte)(0) ;
         n11789Ap_NA = false ;
      }
      else
      {
         A11789Ap_NA = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkAp_NA.getInternalname()), "1")==0) ? 1 : 0)) ;
         n11789Ap_NA = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( radAP_St.getInternalname()), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( radAP_St.getInternalname()), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "AP_ST_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         wbErr = true ;
         A11790AP_St = (byte)(0) ;
         n11790AP_St = false ;
      }
      else
      {
         A11790AP_St = (byte)(localUtil.ctol( httpContext.cgiGet( radAP_St.getInternalname()), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11790AP_St = false ;
      }
      GXCCtl = "Z11792CodApId_" + sGXsfl_125_idx ;
      Z11792CodApId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11789Ap_NA_" + sGXsfl_125_idx ;
      Z11789Ap_NA = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11790AP_St_" + sGXsfl_125_idx ;
      Z11790AP_St = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1660_" + sGXsfl_125_idx ;
      nRcdDeleted_1660 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1660_" + sGXsfl_125_idx ;
      nRcdExists_1660 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1660_" + sGXsfl_125_idx ;
      nIsMod_1660 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCodApId_Enabled = edtCodApId_Enabled ;
   }

   public void confirmValues1ID0( )
   {
      nGXsfl_125_idx = 0 ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1251660( ) ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1251660( ) ;
         httpContext.changePostValue( "Z11792CodApId_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z11792CodApId_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11792CodApId_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z11789Ap_NA_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z11789Ap_NA_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11789Ap_NA_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z11790AP_St_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z11790AP_St_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11790AP_St_"+sGXsfl_125_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tptapar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV61BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV63BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11791Ap_numero", GXutil.ltrim( localUtil.ntoc( Z11791Ap_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11776Ap_fec", localUtil.dtoc( Z11776Ap_fec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11777Ap_Disp", GXutil.rtrim( Z11777Ap_Disp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11778Ap_Ref", GXutil.rtrim( Z11778Ap_Ref));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11779Ap_Art", GXutil.rtrim( Z11779Ap_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11780Ap_Mat", GXutil.rtrim( Z11780Ap_Mat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11781Ap_ColN", GXutil.rtrim( Z11781Ap_ColN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11782Ap_ColNn", GXutil.ltrim( localUtil.ntoc( Z11782Ap_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11783Ap_Tc", GXutil.ltrim( localUtil.ntoc( Z11783Ap_Tc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11784Ap_Maq", GXutil.rtrim( Z11784Ap_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11785Ap_Cli", GXutil.ltrim( localUtil.ntoc( Z11785Ap_Cli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11786Ap_Cln", GXutil.rtrim( Z11786Ap_Cln));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11787Ap_norma", GXutil.rtrim( Z11787Ap_norma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11788Ap_obs", Z11788Ap_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_125", GXutil.ltrim( localUtil.ntoc( nGXsfl_125_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV62BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV61BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV63BarCodPar));
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
      return formatLink("app.tptapar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV61BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV63BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TpTAPAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Llamada con parametro", "") ;
   }

   public void initializeNonKey1ID1659( )
   {
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A11776Ap_fec = GXutil.nullDate() ;
      n11776Ap_fec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11776Ap_fec", localUtil.format(A11776Ap_fec, "99/99/99"));
      A11777Ap_Disp = "" ;
      n11777Ap_Disp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11777Ap_Disp", A11777Ap_Disp);
      A11778Ap_Ref = "" ;
      n11778Ap_Ref = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11778Ap_Ref", A11778Ap_Ref);
      A11779Ap_Art = "" ;
      n11779Ap_Art = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11779Ap_Art", A11779Ap_Art);
      A11780Ap_Mat = "" ;
      n11780Ap_Mat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11780Ap_Mat", A11780Ap_Mat);
      A11781Ap_ColN = "" ;
      n11781Ap_ColN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11781Ap_ColN", A11781Ap_ColN);
      A11782Ap_ColNn = 0 ;
      n11782Ap_ColNn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11782Ap_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11782Ap_ColNn), 6, 0));
      A11783Ap_Tc = (byte)(0) ;
      n11783Ap_Tc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11783Ap_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11783Ap_Tc), 2, 0));
      A11784Ap_Maq = "" ;
      n11784Ap_Maq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11784Ap_Maq", A11784Ap_Maq);
      A11785Ap_Cli = 0 ;
      n11785Ap_Cli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11785Ap_Cli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11785Ap_Cli), 6, 0));
      A11786Ap_Cln = "" ;
      n11786Ap_Cln = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11786Ap_Cln", A11786Ap_Cln);
      A11787Ap_norma = "" ;
      n11787Ap_norma = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11787Ap_norma", A11787Ap_norma);
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A11788Ap_obs = "" ;
      n11788Ap_obs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11788Ap_obs", A11788Ap_obs);
      Z11776Ap_fec = GXutil.nullDate() ;
      Z11777Ap_Disp = "" ;
      Z11778Ap_Ref = "" ;
      Z11779Ap_Art = "" ;
      Z11780Ap_Mat = "" ;
      Z11781Ap_ColN = "" ;
      Z11782Ap_ColNn = 0 ;
      Z11783Ap_Tc = (byte)(0) ;
      Z11784Ap_Maq = "" ;
      Z11785Ap_Cli = 0 ;
      Z11786Ap_Cln = "" ;
      Z11787Ap_norma = "" ;
      Z11788Ap_obs = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAll1ID1659( )
   {
      A11791Ap_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11791Ap_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11791Ap_numero), 8, 0));
      initializeNonKey1ID1659( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1ID1660( )
   {
      A11793CodApPm = "" ;
      n11793CodApPm = false ;
      A11794CodApSt = "" ;
      n11794CodApSt = false ;
      A11795CodApUn = "" ;
      n11795CodApUn = false ;
      A11789Ap_NA = (byte)(0) ;
      n11789Ap_NA = false ;
      A11790AP_St = (byte)(0) ;
      n11790AP_St = false ;
      Z11789Ap_NA = (byte)(0) ;
      Z11790AP_St = (byte)(0) ;
   }

   public void initAll1ID1660( )
   {
      A11792CodApId = (short)(0) ;
      initializeNonKey1ID1660( ) ;
   }

   public void standaloneModalInsert1ID1660( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241582224", true, true);
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
      httpContext.AddJavascriptSource("tptapar.js", "?20268241582224", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1660( )
   {
      edtCodApId_Enabled = defedtCodApId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodApId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodApId_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void startgridcontrol125( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1660, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1660_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11792CodApId, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11793CodApPm));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApPm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11794CodApSt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11795CodApUn));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodApUn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11789Ap_NA, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkAp_NA.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11790AP_St, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( radAP_St.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAp_numero_Internalname = "AP_NUMERO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAp_fec_Internalname = "AP_FEC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAp_Disp_Internalname = "AP_DISP" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAp_Ref_Internalname = "AP_REF" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAp_Art_Internalname = "AP_ART" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAp_Mat_Internalname = "AP_MAT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAp_ColN_Internalname = "AP_COLN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtAp_ColNn_Internalname = "AP_COLNN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtAp_Tc_Internalname = "AP_TC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtAp_Maq_Internalname = "AP_MAQ" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtAp_Cli_Internalname = "AP_CLI" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtAp_Cln_Internalname = "AP_CLN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtAp_norma_Internalname = "AP_NORMA" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtAp_obs_Internalname = "AP_OBS" ;
      edtavnRcdDeleted_1660_Internalname = "vNRCDDELETED_1660" ;
      edtCodApId_Internalname = "CODAPID" ;
      edtCodApPm_Internalname = "CODAPPM" ;
      edtCodApSt_Internalname = "CODAPST" ;
      edtCodApUn_Internalname = "CODAPUN" ;
      chkAp_NA.setInternalname( "AP_NA" );
      radAP_St.setInternalname( "AP_ST" );
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
      Form.setCaption( httpContext.getMessage( "Llamada con parametro", "") );
      radAP_St.setJsonclick( "" );
      chkAp_NA.setCaption( "" );
      edtCodApUn_Jsonclick = "" ;
      edtCodApSt_Jsonclick = "" ;
      edtCodApPm_Jsonclick = "" ;
      edtCodApId_Jsonclick = "" ;
      edtavnRcdDeleted_1660_Jsonclick = "" ;
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
      radAP_St.setEnabled( 1 );
      chkAp_NA.setEnabled( 1 );
      edtCodApUn_Enabled = 0 ;
      edtCodApSt_Enabled = 0 ;
      edtCodApPm_Enabled = 0 ;
      edtCodApId_Enabled = 1 ;
      edtavnRcdDeleted_1660_Enabled = 1 ;
      edtAp_obs_Backcolor = (int)(0xFFFFFF) ;
      edtAp_obs_Enabled = 1 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtAp_norma_Jsonclick = "" ;
      edtAp_norma_Backcolor = (int)(0xFFFFFF) ;
      edtAp_norma_Enabled = 1 ;
      edtAp_Cln_Jsonclick = "" ;
      edtAp_Cln_Backcolor = (int)(0xFFFFFF) ;
      edtAp_Cln_Enabled = 1 ;
      edtAp_Cli_Jsonclick = "" ;
      edtAp_Cli_Backcolor = (int)(0xFFFFFF) ;
      edtAp_Cli_Enabled = 1 ;
      edtAp_Maq_Jsonclick = "" ;
      edtAp_Maq_Backcolor = (int)(0xFFFFFF) ;
      edtAp_Maq_Enabled = 1 ;
      edtAp_Tc_Jsonclick = "" ;
      edtAp_Tc_Backcolor = (int)(0xFFFFFF) ;
      edtAp_Tc_Enabled = 1 ;
      edtAp_ColNn_Jsonclick = "" ;
      edtAp_ColNn_Backcolor = (int)(0xFFFFFF) ;
      edtAp_ColNn_Enabled = 1 ;
      edtAp_ColN_Jsonclick = "" ;
      edtAp_ColN_Backcolor = (int)(0xFFFFFF) ;
      edtAp_ColN_Enabled = 1 ;
      edtAp_Mat_Jsonclick = "" ;
      edtAp_Mat_Backcolor = (int)(0xFFFFFF) ;
      edtAp_Mat_Enabled = 1 ;
      edtAp_Art_Jsonclick = "" ;
      edtAp_Art_Backcolor = (int)(0xFFFFFF) ;
      edtAp_Art_Enabled = 1 ;
      edtAp_Ref_Jsonclick = "" ;
      edtAp_Ref_Backcolor = (int)(0xFFFFFF) ;
      edtAp_Ref_Enabled = 1 ;
      edtAp_Disp_Jsonclick = "" ;
      edtAp_Disp_Backcolor = (int)(0xFFFFFF) ;
      edtAp_Disp_Enabled = 1 ;
      edtAp_fec_Jsonclick = "" ;
      edtAp_fec_Backcolor = (int)(0xFFFFFF) ;
      edtAp_fec_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAp_numero_Jsonclick = "" ;
      edtAp_numero_Backcolor = (int)(0xFFFFFF) ;
      edtAp_numero_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1251660( ) ;
      while ( nGXsfl_125_idx <= nRC_GXsfl_125 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1ID1660( ) ;
         standaloneModal1ID1660( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1ID1660( ) ;
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1251660( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "AP_NA_" + sGXsfl_125_idx ;
      chkAp_NA.setName( GXCCtl );
      chkAp_NA.setWebtags( "" );
      chkAp_NA.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkAp_NA.getInternalname(), "TitleCaption", chkAp_NA.getCaption(), !bGXsfl_125_Refreshing);
      chkAp_NA.setCheckedValue( "0" );
      A11789Ap_NA = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A11789Ap_NA, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n11789Ap_NA = false ;
      GXCCtl = "AP_ST_" + sGXsfl_125_idx ;
      radAP_St.setName( GXCCtl );
      radAP_St.setWebtags( "" );
      radAP_St.addItem("1", httpContext.getMessage( "Passou", ""), (short)(0));
      radAP_St.addItem("0", httpContext.getMessage( "Falhou", ""), (short)(0));
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01ID29 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01ID29_A407EmprNom[0] ;
      n407EmprNom = T01ID29_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(27);
      GX_FocusControl = edtBarCod_Internalname ;
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

   public void valid_Ap_numero( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A11776Ap_fec", localUtil.format(A11776Ap_fec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11777Ap_Disp", GXutil.rtrim( A11777Ap_Disp));
      httpContext.ajax_rsp_assign_attri("", false, "A11778Ap_Ref", GXutil.rtrim( A11778Ap_Ref));
      httpContext.ajax_rsp_assign_attri("", false, "A11779Ap_Art", GXutil.rtrim( A11779Ap_Art));
      httpContext.ajax_rsp_assign_attri("", false, "A11780Ap_Mat", GXutil.rtrim( A11780Ap_Mat));
      httpContext.ajax_rsp_assign_attri("", false, "A11781Ap_ColN", GXutil.rtrim( A11781Ap_ColN));
      httpContext.ajax_rsp_assign_attri("", false, "A11782Ap_ColNn", GXutil.ltrim( localUtil.ntoc( A11782Ap_ColNn, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11783Ap_Tc", GXutil.ltrim( localUtil.ntoc( A11783Ap_Tc, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11784Ap_Maq", GXutil.rtrim( A11784Ap_Maq));
      httpContext.ajax_rsp_assign_attri("", false, "A11785Ap_Cli", GXutil.ltrim( localUtil.ntoc( A11785Ap_Cli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11786Ap_Cln", GXutil.rtrim( A11786Ap_Cln));
      httpContext.ajax_rsp_assign_attri("", false, "A11787Ap_norma", GXutil.rtrim( A11787Ap_norma));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11788Ap_obs", A11788Ap_obs);
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11791Ap_numero", GXutil.ltrim( localUtil.ntoc( Z11791Ap_numero, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11776Ap_fec", localUtil.format(Z11776Ap_fec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11777Ap_Disp", GXutil.rtrim( Z11777Ap_Disp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11778Ap_Ref", GXutil.rtrim( Z11778Ap_Ref));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11779Ap_Art", GXutil.rtrim( Z11779Ap_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11780Ap_Mat", GXutil.rtrim( Z11780Ap_Mat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11781Ap_ColN", GXutil.rtrim( Z11781Ap_ColN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11782Ap_ColNn", GXutil.ltrim( localUtil.ntoc( Z11782Ap_ColNn, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11783Ap_Tc", GXutil.ltrim( localUtil.ntoc( Z11783Ap_Tc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11784Ap_Maq", GXutil.rtrim( Z11784Ap_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11785Ap_Cli", GXutil.ltrim( localUtil.ntoc( Z11785Ap_Cli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11786Ap_Cln", GXutil.rtrim( Z11786Ap_Cln));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11787Ap_norma", GXutil.rtrim( Z11787Ap_norma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11788Ap_obs", Z11788Ap_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T01ID30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T01ID19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T01ID19_A653OpeNom[0] ;
      n653OpeNom = T01ID19_n653OpeNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
   }

   public void valid_Codapid( )
   {
      n11793CodApPm = false ;
      n11794CodApSt = false ;
      n11795CodApUn = false ;
      /* Using cursor T01ID27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A11792CodApId)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Valores", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODAPID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodApId_Internalname ;
      }
      A11793CodApPm = T01ID27_A11793CodApPm[0] ;
      n11793CodApPm = T01ID27_n11793CodApPm[0] ;
      A11794CodApSt = T01ID27_A11794CodApSt[0] ;
      n11794CodApSt = T01ID27_n11794CodApSt[0] ;
      A11795CodApUn = T01ID27_A11795CodApUn[0] ;
      n11795CodApUn = T01ID27_n11795CodApUn[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11793CodApPm", GXutil.rtrim( A11793CodApPm));
      httpContext.ajax_rsp_assign_attri("", false, "A11794CodApSt", GXutil.rtrim( A11794CodApSt));
      httpContext.ajax_rsp_assign_attri("", false, "A11795CodApUn", GXutil.rtrim( A11795CodApUn));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_AP_NUMERO","{handler:'valid_Ap_numero',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11791Ap_numero',fld:'AP_NUMERO',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_AP_NUMERO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A11776Ap_fec',fld:'AP_FEC',pic:''},{av:'A11777Ap_Disp',fld:'AP_DISP',pic:''},{av:'A11778Ap_Ref',fld:'AP_REF',pic:''},{av:'A11779Ap_Art',fld:'AP_ART',pic:''},{av:'A11780Ap_Mat',fld:'AP_MAT',pic:''},{av:'A11781Ap_ColN',fld:'AP_COLN',pic:''},{av:'A11782Ap_ColNn',fld:'AP_COLNN',pic:'ZZZZZ9'},{av:'A11783Ap_Tc',fld:'AP_TC',pic:'Z9'},{av:'A11784Ap_Maq',fld:'AP_MAQ',pic:''},{av:'A11785Ap_Cli',fld:'AP_CLI',pic:'ZZZZZ9'},{av:'A11786Ap_Cln',fld:'AP_CLN',pic:''},{av:'A11787Ap_norma',fld:'AP_NORMA',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A11788Ap_obs',fld:'AP_OBS',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11791Ap_numero'},{av:'Z407EmprNom'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z11776Ap_fec'},{av:'Z11777Ap_Disp'},{av:'Z11778Ap_Ref'},{av:'Z11779Ap_Art'},{av:'Z11780Ap_Mat'},{av:'Z11781Ap_ColN'},{av:'Z11782Ap_ColNn'},{av:'Z11783Ap_Tc'},{av:'Z11784Ap_Maq'},{av:'Z11785Ap_Cli'},{av:'Z11786Ap_Cln'},{av:'Z11787Ap_norma'},{av:'Z652OpeCod'},{av:'Z11788Ap_obs'},{av:'Z653OpeNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_CODAPID","{handler:'valid_Codapid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11792CodApId',fld:'CODAPID',pic:'ZZZ9'},{av:'A11793CodApPm',fld:'CODAPPM',pic:''},{av:'A11794CodApSt',fld:'CODAPST',pic:''},{av:'A11795CodApUn',fld:'CODAPUN',pic:''}]");
      setEventMetadata("VALID_CODAPID",",oparms:[{av:'A11793CodApPm',fld:'CODAPPM',pic:''},{av:'A11794CodApSt',fld:'CODAPST',pic:''},{av:'A11795CodApUn',fld:'CODAPUN',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ap_st',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(28);
      pr_default.close(27);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOAV63BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z11776Ap_fec = GXutil.nullDate() ;
      Z11777Ap_Disp = "" ;
      Z11778Ap_Ref = "" ;
      Z11779Ap_Art = "" ;
      Z11780Ap_Mat = "" ;
      Z11781Ap_ColN = "" ;
      Z11784Ap_Maq = "" ;
      Z11786Ap_Cln = "" ;
      Z11787Ap_norma = "" ;
      Z11788Ap_obs = "" ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV63BarCodPar = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11776Ap_fec = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A11777Ap_Disp = "" ;
      lblTextblock9_Jsonclick = "" ;
      A11778Ap_Ref = "" ;
      lblTextblock10_Jsonclick = "" ;
      A11779Ap_Art = "" ;
      lblTextblock11_Jsonclick = "" ;
      A11780Ap_Mat = "" ;
      lblTextblock12_Jsonclick = "" ;
      A11781Ap_ColN = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A11784Ap_Maq = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A11786Ap_Cln = "" ;
      lblTextblock18_Jsonclick = "" ;
      A11787Ap_norma = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock21_Jsonclick = "" ;
      A11788Ap_obs = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1660 = "" ;
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
      sMode1659 = "" ;
      GXCCtl = "" ;
      A11793CodApPm = "" ;
      A11794CodApSt = "" ;
      A11795CodApUn = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T01ID7_A407EmprNom = new String[] {""} ;
      T01ID7_n407EmprNom = new boolean[] {false} ;
      T01ID10_A11791Ap_numero = new int[1] ;
      T01ID10_A407EmprNom = new String[] {""} ;
      T01ID10_n407EmprNom = new boolean[] {false} ;
      T01ID10_A11776Ap_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01ID10_n11776Ap_fec = new boolean[] {false} ;
      T01ID10_A11777Ap_Disp = new String[] {""} ;
      T01ID10_n11777Ap_Disp = new boolean[] {false} ;
      T01ID10_A11778Ap_Ref = new String[] {""} ;
      T01ID10_n11778Ap_Ref = new boolean[] {false} ;
      T01ID10_A11779Ap_Art = new String[] {""} ;
      T01ID10_n11779Ap_Art = new boolean[] {false} ;
      T01ID10_A11780Ap_Mat = new String[] {""} ;
      T01ID10_n11780Ap_Mat = new boolean[] {false} ;
      T01ID10_A11781Ap_ColN = new String[] {""} ;
      T01ID10_n11781Ap_ColN = new boolean[] {false} ;
      T01ID10_A11782Ap_ColNn = new int[1] ;
      T01ID10_n11782Ap_ColNn = new boolean[] {false} ;
      T01ID10_A11783Ap_Tc = new byte[1] ;
      T01ID10_n11783Ap_Tc = new boolean[] {false} ;
      T01ID10_A11784Ap_Maq = new String[] {""} ;
      T01ID10_n11784Ap_Maq = new boolean[] {false} ;
      T01ID10_A11785Ap_Cli = new int[1] ;
      T01ID10_n11785Ap_Cli = new boolean[] {false} ;
      T01ID10_A11786Ap_Cln = new String[] {""} ;
      T01ID10_n11786Ap_Cln = new boolean[] {false} ;
      T01ID10_A11787Ap_norma = new String[] {""} ;
      T01ID10_n11787Ap_norma = new boolean[] {false} ;
      T01ID10_A653OpeNom = new String[] {""} ;
      T01ID10_n653OpeNom = new boolean[] {false} ;
      T01ID10_A11788Ap_obs = new String[] {""} ;
      T01ID10_n11788Ap_obs = new boolean[] {false} ;
      T01ID10_A396EmprCod = new String[] {""} ;
      T01ID10_A129BarCod = new int[1] ;
      T01ID10_n129BarCod = new boolean[] {false} ;
      T01ID10_A132BarCodReo = new byte[1] ;
      T01ID10_n132BarCodReo = new boolean[] {false} ;
      T01ID10_A130BarCodPar = new String[] {""} ;
      T01ID10_n130BarCodPar = new boolean[] {false} ;
      T01ID10_A652OpeCod = new int[1] ;
      T01ID10_n652OpeCod = new boolean[] {false} ;
      T01ID8_A396EmprCod = new String[] {""} ;
      T01ID9_A653OpeNom = new String[] {""} ;
      T01ID9_n653OpeNom = new boolean[] {false} ;
      T01ID11_A396EmprCod = new String[] {""} ;
      T01ID12_A653OpeNom = new String[] {""} ;
      T01ID12_n653OpeNom = new boolean[] {false} ;
      T01ID13_A396EmprCod = new String[] {""} ;
      T01ID13_A11791Ap_numero = new int[1] ;
      T01ID6_A11791Ap_numero = new int[1] ;
      T01ID6_A11776Ap_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01ID6_n11776Ap_fec = new boolean[] {false} ;
      T01ID6_A11777Ap_Disp = new String[] {""} ;
      T01ID6_n11777Ap_Disp = new boolean[] {false} ;
      T01ID6_A11778Ap_Ref = new String[] {""} ;
      T01ID6_n11778Ap_Ref = new boolean[] {false} ;
      T01ID6_A11779Ap_Art = new String[] {""} ;
      T01ID6_n11779Ap_Art = new boolean[] {false} ;
      T01ID6_A11780Ap_Mat = new String[] {""} ;
      T01ID6_n11780Ap_Mat = new boolean[] {false} ;
      T01ID6_A11781Ap_ColN = new String[] {""} ;
      T01ID6_n11781Ap_ColN = new boolean[] {false} ;
      T01ID6_A11782Ap_ColNn = new int[1] ;
      T01ID6_n11782Ap_ColNn = new boolean[] {false} ;
      T01ID6_A11783Ap_Tc = new byte[1] ;
      T01ID6_n11783Ap_Tc = new boolean[] {false} ;
      T01ID6_A11784Ap_Maq = new String[] {""} ;
      T01ID6_n11784Ap_Maq = new boolean[] {false} ;
      T01ID6_A11785Ap_Cli = new int[1] ;
      T01ID6_n11785Ap_Cli = new boolean[] {false} ;
      T01ID6_A11786Ap_Cln = new String[] {""} ;
      T01ID6_n11786Ap_Cln = new boolean[] {false} ;
      T01ID6_A11787Ap_norma = new String[] {""} ;
      T01ID6_n11787Ap_norma = new boolean[] {false} ;
      T01ID6_A11788Ap_obs = new String[] {""} ;
      T01ID6_n11788Ap_obs = new boolean[] {false} ;
      T01ID6_A396EmprCod = new String[] {""} ;
      T01ID6_A129BarCod = new int[1] ;
      T01ID6_n129BarCod = new boolean[] {false} ;
      T01ID6_A132BarCodReo = new byte[1] ;
      T01ID6_n132BarCodReo = new boolean[] {false} ;
      T01ID6_A130BarCodPar = new String[] {""} ;
      T01ID6_n130BarCodPar = new boolean[] {false} ;
      T01ID6_A652OpeCod = new int[1] ;
      T01ID6_n652OpeCod = new boolean[] {false} ;
      T01ID14_A396EmprCod = new String[] {""} ;
      T01ID14_A11791Ap_numero = new int[1] ;
      T01ID15_A396EmprCod = new String[] {""} ;
      T01ID15_A11791Ap_numero = new int[1] ;
      T01ID5_A11791Ap_numero = new int[1] ;
      T01ID5_A11776Ap_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01ID5_n11776Ap_fec = new boolean[] {false} ;
      T01ID5_A11777Ap_Disp = new String[] {""} ;
      T01ID5_n11777Ap_Disp = new boolean[] {false} ;
      T01ID5_A11778Ap_Ref = new String[] {""} ;
      T01ID5_n11778Ap_Ref = new boolean[] {false} ;
      T01ID5_A11779Ap_Art = new String[] {""} ;
      T01ID5_n11779Ap_Art = new boolean[] {false} ;
      T01ID5_A11780Ap_Mat = new String[] {""} ;
      T01ID5_n11780Ap_Mat = new boolean[] {false} ;
      T01ID5_A11781Ap_ColN = new String[] {""} ;
      T01ID5_n11781Ap_ColN = new boolean[] {false} ;
      T01ID5_A11782Ap_ColNn = new int[1] ;
      T01ID5_n11782Ap_ColNn = new boolean[] {false} ;
      T01ID5_A11783Ap_Tc = new byte[1] ;
      T01ID5_n11783Ap_Tc = new boolean[] {false} ;
      T01ID5_A11784Ap_Maq = new String[] {""} ;
      T01ID5_n11784Ap_Maq = new boolean[] {false} ;
      T01ID5_A11785Ap_Cli = new int[1] ;
      T01ID5_n11785Ap_Cli = new boolean[] {false} ;
      T01ID5_A11786Ap_Cln = new String[] {""} ;
      T01ID5_n11786Ap_Cln = new boolean[] {false} ;
      T01ID5_A11787Ap_norma = new String[] {""} ;
      T01ID5_n11787Ap_norma = new boolean[] {false} ;
      T01ID5_A11788Ap_obs = new String[] {""} ;
      T01ID5_n11788Ap_obs = new boolean[] {false} ;
      T01ID5_A396EmprCod = new String[] {""} ;
      T01ID5_A129BarCod = new int[1] ;
      T01ID5_n129BarCod = new boolean[] {false} ;
      T01ID5_A132BarCodReo = new byte[1] ;
      T01ID5_n132BarCodReo = new boolean[] {false} ;
      T01ID5_A130BarCodPar = new String[] {""} ;
      T01ID5_n130BarCodPar = new boolean[] {false} ;
      T01ID5_A652OpeCod = new int[1] ;
      T01ID5_n652OpeCod = new boolean[] {false} ;
      T01ID19_A653OpeNom = new String[] {""} ;
      T01ID19_n653OpeNom = new boolean[] {false} ;
      T01ID20_A396EmprCod = new String[] {""} ;
      T01ID20_A11791Ap_numero = new int[1] ;
      Z11793CodApPm = "" ;
      Z11794CodApSt = "" ;
      Z11795CodApUn = "" ;
      T01ID21_A11791Ap_numero = new int[1] ;
      T01ID21_A11793CodApPm = new String[] {""} ;
      T01ID21_n11793CodApPm = new boolean[] {false} ;
      T01ID21_A11794CodApSt = new String[] {""} ;
      T01ID21_n11794CodApSt = new boolean[] {false} ;
      T01ID21_A11795CodApUn = new String[] {""} ;
      T01ID21_n11795CodApUn = new boolean[] {false} ;
      T01ID21_A11789Ap_NA = new byte[1] ;
      T01ID21_n11789Ap_NA = new boolean[] {false} ;
      T01ID21_A11790AP_St = new byte[1] ;
      T01ID21_n11790AP_St = new boolean[] {false} ;
      T01ID21_A396EmprCod = new String[] {""} ;
      T01ID21_A11792CodApId = new short[1] ;
      T01ID4_A11793CodApPm = new String[] {""} ;
      T01ID4_n11793CodApPm = new boolean[] {false} ;
      T01ID4_A11794CodApSt = new String[] {""} ;
      T01ID4_n11794CodApSt = new boolean[] {false} ;
      T01ID4_A11795CodApUn = new String[] {""} ;
      T01ID4_n11795CodApUn = new boolean[] {false} ;
      T01ID22_A11793CodApPm = new String[] {""} ;
      T01ID22_n11793CodApPm = new boolean[] {false} ;
      T01ID22_A11794CodApSt = new String[] {""} ;
      T01ID22_n11794CodApSt = new boolean[] {false} ;
      T01ID22_A11795CodApUn = new String[] {""} ;
      T01ID22_n11795CodApUn = new boolean[] {false} ;
      T01ID23_A396EmprCod = new String[] {""} ;
      T01ID23_A11791Ap_numero = new int[1] ;
      T01ID23_A11792CodApId = new short[1] ;
      T01ID3_A11791Ap_numero = new int[1] ;
      T01ID3_A11789Ap_NA = new byte[1] ;
      T01ID3_n11789Ap_NA = new boolean[] {false} ;
      T01ID3_A11790AP_St = new byte[1] ;
      T01ID3_n11790AP_St = new boolean[] {false} ;
      T01ID3_A396EmprCod = new String[] {""} ;
      T01ID3_A11792CodApId = new short[1] ;
      T01ID2_A11791Ap_numero = new int[1] ;
      T01ID2_A11789Ap_NA = new byte[1] ;
      T01ID2_n11789Ap_NA = new boolean[] {false} ;
      T01ID2_A11790AP_St = new byte[1] ;
      T01ID2_n11790AP_St = new boolean[] {false} ;
      T01ID2_A396EmprCod = new String[] {""} ;
      T01ID2_A11792CodApId = new short[1] ;
      T01ID27_A11793CodApPm = new String[] {""} ;
      T01ID27_n11793CodApPm = new boolean[] {false} ;
      T01ID27_A11794CodApSt = new String[] {""} ;
      T01ID27_n11794CodApSt = new boolean[] {false} ;
      T01ID27_A11795CodApUn = new String[] {""} ;
      T01ID27_n11795CodApUn = new boolean[] {false} ;
      T01ID28_A396EmprCod = new String[] {""} ;
      T01ID28_A11791Ap_numero = new int[1] ;
      T01ID28_A11792CodApId = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01ID29_A407EmprNom = new String[] {""} ;
      T01ID29_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ130BarCodPar = "" ;
      ZZ11776Ap_fec = GXutil.nullDate() ;
      ZZ11777Ap_Disp = "" ;
      ZZ11778Ap_Ref = "" ;
      ZZ11779Ap_Art = "" ;
      ZZ11780Ap_Mat = "" ;
      ZZ11781Ap_ColN = "" ;
      ZZ11784Ap_Maq = "" ;
      ZZ11786Ap_Cln = "" ;
      ZZ11787Ap_norma = "" ;
      ZZ11788Ap_obs = "" ;
      ZZ653OpeNom = "" ;
      T01ID30_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tptapar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tptapar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tptapar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tptapar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tptapar__default(),
         new Object[] {
             new Object[] {
            T01ID2_A11791Ap_numero, T01ID2_A11789Ap_NA, T01ID2_n11789Ap_NA, T01ID2_A11790AP_St, T01ID2_n11790AP_St, T01ID2_A396EmprCod, T01ID2_A11792CodApId
            }
            , new Object[] {
            T01ID3_A11791Ap_numero, T01ID3_A11789Ap_NA, T01ID3_n11789Ap_NA, T01ID3_A11790AP_St, T01ID3_n11790AP_St, T01ID3_A396EmprCod, T01ID3_A11792CodApId
            }
            , new Object[] {
            T01ID4_A11793CodApPm, T01ID4_n11793CodApPm, T01ID4_A11794CodApSt, T01ID4_n11794CodApSt, T01ID4_A11795CodApUn, T01ID4_n11795CodApUn
            }
            , new Object[] {
            T01ID5_A11791Ap_numero, T01ID5_A11776Ap_fec, T01ID5_n11776Ap_fec, T01ID5_A11777Ap_Disp, T01ID5_n11777Ap_Disp, T01ID5_A11778Ap_Ref, T01ID5_n11778Ap_Ref, T01ID5_A11779Ap_Art, T01ID5_n11779Ap_Art, T01ID5_A11780Ap_Mat,
            T01ID5_n11780Ap_Mat, T01ID5_A11781Ap_ColN, T01ID5_n11781Ap_ColN, T01ID5_A11782Ap_ColNn, T01ID5_n11782Ap_ColNn, T01ID5_A11783Ap_Tc, T01ID5_n11783Ap_Tc, T01ID5_A11784Ap_Maq, T01ID5_n11784Ap_Maq, T01ID5_A11785Ap_Cli,
            T01ID5_n11785Ap_Cli, T01ID5_A11786Ap_Cln, T01ID5_n11786Ap_Cln, T01ID5_A11787Ap_norma, T01ID5_n11787Ap_norma, T01ID5_A11788Ap_obs, T01ID5_n11788Ap_obs, T01ID5_A396EmprCod, T01ID5_A129BarCod, T01ID5_n129BarCod,
            T01ID5_A132BarCodReo, T01ID5_n132BarCodReo, T01ID5_A130BarCodPar, T01ID5_n130BarCodPar, T01ID5_A652OpeCod, T01ID5_n652OpeCod
            }
            , new Object[] {
            T01ID6_A11791Ap_numero, T01ID6_A11776Ap_fec, T01ID6_n11776Ap_fec, T01ID6_A11777Ap_Disp, T01ID6_n11777Ap_Disp, T01ID6_A11778Ap_Ref, T01ID6_n11778Ap_Ref, T01ID6_A11779Ap_Art, T01ID6_n11779Ap_Art, T01ID6_A11780Ap_Mat,
            T01ID6_n11780Ap_Mat, T01ID6_A11781Ap_ColN, T01ID6_n11781Ap_ColN, T01ID6_A11782Ap_ColNn, T01ID6_n11782Ap_ColNn, T01ID6_A11783Ap_Tc, T01ID6_n11783Ap_Tc, T01ID6_A11784Ap_Maq, T01ID6_n11784Ap_Maq, T01ID6_A11785Ap_Cli,
            T01ID6_n11785Ap_Cli, T01ID6_A11786Ap_Cln, T01ID6_n11786Ap_Cln, T01ID6_A11787Ap_norma, T01ID6_n11787Ap_norma, T01ID6_A11788Ap_obs, T01ID6_n11788Ap_obs, T01ID6_A396EmprCod, T01ID6_A129BarCod, T01ID6_n129BarCod,
            T01ID6_A132BarCodReo, T01ID6_n132BarCodReo, T01ID6_A130BarCodPar, T01ID6_n130BarCodPar, T01ID6_A652OpeCod, T01ID6_n652OpeCod
            }
            , new Object[] {
            T01ID7_A407EmprNom, T01ID7_n407EmprNom
            }
            , new Object[] {
            T01ID8_A396EmprCod
            }
            , new Object[] {
            T01ID9_A653OpeNom, T01ID9_n653OpeNom
            }
            , new Object[] {
            T01ID10_A11791Ap_numero, T01ID10_A407EmprNom, T01ID10_n407EmprNom, T01ID10_A11776Ap_fec, T01ID10_n11776Ap_fec, T01ID10_A11777Ap_Disp, T01ID10_n11777Ap_Disp, T01ID10_A11778Ap_Ref, T01ID10_n11778Ap_Ref, T01ID10_A11779Ap_Art,
            T01ID10_n11779Ap_Art, T01ID10_A11780Ap_Mat, T01ID10_n11780Ap_Mat, T01ID10_A11781Ap_ColN, T01ID10_n11781Ap_ColN, T01ID10_A11782Ap_ColNn, T01ID10_n11782Ap_ColNn, T01ID10_A11783Ap_Tc, T01ID10_n11783Ap_Tc, T01ID10_A11784Ap_Maq,
            T01ID10_n11784Ap_Maq, T01ID10_A11785Ap_Cli, T01ID10_n11785Ap_Cli, T01ID10_A11786Ap_Cln, T01ID10_n11786Ap_Cln, T01ID10_A11787Ap_norma, T01ID10_n11787Ap_norma, T01ID10_A653OpeNom, T01ID10_n653OpeNom, T01ID10_A11788Ap_obs,
            T01ID10_n11788Ap_obs, T01ID10_A396EmprCod, T01ID10_A129BarCod, T01ID10_n129BarCod, T01ID10_A132BarCodReo, T01ID10_n132BarCodReo, T01ID10_A130BarCodPar, T01ID10_n130BarCodPar, T01ID10_A652OpeCod, T01ID10_n652OpeCod
            }
            , new Object[] {
            T01ID11_A396EmprCod
            }
            , new Object[] {
            T01ID12_A653OpeNom, T01ID12_n653OpeNom
            }
            , new Object[] {
            T01ID13_A396EmprCod, T01ID13_A11791Ap_numero
            }
            , new Object[] {
            T01ID14_A396EmprCod, T01ID14_A11791Ap_numero
            }
            , new Object[] {
            T01ID15_A396EmprCod, T01ID15_A11791Ap_numero
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01ID19_A653OpeNom, T01ID19_n653OpeNom
            }
            , new Object[] {
            T01ID20_A396EmprCod, T01ID20_A11791Ap_numero
            }
            , new Object[] {
            T01ID21_A11791Ap_numero, T01ID21_A11793CodApPm, T01ID21_n11793CodApPm, T01ID21_A11794CodApSt, T01ID21_n11794CodApSt, T01ID21_A11795CodApUn, T01ID21_n11795CodApUn, T01ID21_A11789Ap_NA, T01ID21_n11789Ap_NA, T01ID21_A11790AP_St,
            T01ID21_n11790AP_St, T01ID21_A396EmprCod, T01ID21_A11792CodApId
            }
            , new Object[] {
            T01ID22_A11793CodApPm, T01ID22_n11793CodApPm, T01ID22_A11794CodApSt, T01ID22_n11794CodApSt, T01ID22_A11795CodApUn, T01ID22_n11795CodApUn
            }
            , new Object[] {
            T01ID23_A396EmprCod, T01ID23_A11791Ap_numero, T01ID23_A11792CodApId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01ID27_A11793CodApPm, T01ID27_n11793CodApPm, T01ID27_A11794CodApSt, T01ID27_n11794CodApSt, T01ID27_A11795CodApUn, T01ID27_n11795CodApUn
            }
            , new Object[] {
            T01ID28_A396EmprCod, T01ID28_A11791Ap_numero, T01ID28_A11792CodApId
            }
            , new Object[] {
            T01ID29_A407EmprNom, T01ID29_n407EmprNom
            }
            , new Object[] {
            T01ID30_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOAV61BarCodReo ;
   private byte Z11783Ap_Tc ;
   private byte Z132BarCodReo ;
   private byte Z11789Ap_NA ;
   private byte Z11790AP_St ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV61BarCodReo ;
   private byte nKeyPressed ;
   private byte A11783Ap_Tc ;
   private byte A11789Ap_NA ;
   private byte A11790AP_St ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ11783Ap_Tc ;
   private short Z11792CodApId ;
   private short nRcdDeleted_1660 ;
   private short nRcdExists_1660 ;
   private short nIsMod_1660 ;
   private short A11792CodApId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1660 ;
   private short RcdFound1660 ;
   private short nBlankRcdUsr1660 ;
   private short RcdFound1659 ;
   private short nIsDirty_1659 ;
   private short nIsDirty_1660 ;
   private int wcpOAV62BarCod ;
   private int Z11791Ap_numero ;
   private int Z11782Ap_ColNn ;
   private int Z11785Ap_Cli ;
   private int Z129BarCod ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_125 ;
   private int nGXsfl_125_idx=1 ;
   private int A129BarCod ;
   private int A652OpeCod ;
   private int AV62BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int A11791Ap_numero ;
   private int edtAp_numero_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAp_fec_Enabled ;
   private int edtAp_Disp_Enabled ;
   private int edtAp_Ref_Enabled ;
   private int edtAp_Art_Enabled ;
   private int edtAp_Mat_Enabled ;
   private int edtAp_ColN_Enabled ;
   private int A11782Ap_ColNn ;
   private int edtAp_ColNn_Enabled ;
   private int edtAp_Tc_Enabled ;
   private int edtAp_Maq_Enabled ;
   private int A11785Ap_Cli ;
   private int edtAp_Cli_Enabled ;
   private int edtAp_Cln_Enabled ;
   private int edtAp_norma_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtAp_obs_Enabled ;
   private int edtavnRcdDeleted_1660_Enabled ;
   private int edtCodApId_Enabled ;
   private int edtCodApPm_Enabled ;
   private int edtCodApSt_Enabled ;
   private int edtCodApUn_Enabled ;
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
   private int defedtCodApId_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAp_obs_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtAp_norma_Backcolor ;
   private int edtAp_Cln_Backcolor ;
   private int edtAp_Cli_Backcolor ;
   private int edtAp_Maq_Backcolor ;
   private int edtAp_Tc_Backcolor ;
   private int edtAp_ColNn_Backcolor ;
   private int edtAp_ColN_Backcolor ;
   private int edtAp_Mat_Backcolor ;
   private int edtAp_Art_Backcolor ;
   private int edtAp_Ref_Backcolor ;
   private int edtAp_Disp_Backcolor ;
   private int edtAp_fec_Backcolor ;
   private int edtAp_numero_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11791Ap_numero ;
   private int ZZ129BarCod ;
   private int ZZ11782Ap_ColNn ;
   private int ZZ11785Ap_Cli ;
   private int ZZ652OpeCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV63BarCodPar ;
   private String Z396EmprCod ;
   private String Z11777Ap_Disp ;
   private String Z11778Ap_Ref ;
   private String Z11779Ap_Art ;
   private String Z11780Ap_Mat ;
   private String Z11781Ap_ColN ;
   private String Z11784Ap_Maq ;
   private String Z11786Ap_Cln ;
   private String Z11787Ap_norma ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV63BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
   private String sGXsfl_125_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAp_numero_Internalname ;
   private String edtAp_numero_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAp_fec_Internalname ;
   private String edtAp_fec_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAp_Disp_Internalname ;
   private String A11777Ap_Disp ;
   private String edtAp_Disp_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAp_Ref_Internalname ;
   private String A11778Ap_Ref ;
   private String edtAp_Ref_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAp_Art_Internalname ;
   private String A11779Ap_Art ;
   private String edtAp_Art_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAp_Mat_Internalname ;
   private String A11780Ap_Mat ;
   private String edtAp_Mat_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAp_ColN_Internalname ;
   private String A11781Ap_ColN ;
   private String edtAp_ColN_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtAp_ColNn_Internalname ;
   private String edtAp_ColNn_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtAp_Tc_Internalname ;
   private String edtAp_Tc_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtAp_Maq_Internalname ;
   private String A11784Ap_Maq ;
   private String edtAp_Maq_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtAp_Cli_Internalname ;
   private String edtAp_Cli_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtAp_Cln_Internalname ;
   private String A11786Ap_Cln ;
   private String edtAp_Cln_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtAp_norma_Internalname ;
   private String A11787Ap_norma ;
   private String edtAp_norma_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtOpeCod_Internalname ;
   private String edtOpeCod_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtOpeNom_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtAp_obs_Internalname ;
   private String sMode1660 ;
   private String edtavnRcdDeleted_1660_Internalname ;
   private String edtCodApId_Internalname ;
   private String edtCodApPm_Internalname ;
   private String edtCodApSt_Internalname ;
   private String edtCodApUn_Internalname ;
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
   private String sMode1659 ;
   private String GXCCtl ;
   private String A11793CodApPm ;
   private String A11794CodApSt ;
   private String A11795CodApUn ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String Z11793CodApPm ;
   private String Z11794CodApSt ;
   private String Z11795CodApUn ;
   private String sGXsfl_125_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1660_Jsonclick ;
   private String edtCodApId_Jsonclick ;
   private String edtCodApPm_Jsonclick ;
   private String edtCodApSt_Jsonclick ;
   private String edtCodApUn_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ130BarCodPar ;
   private String ZZ11777Ap_Disp ;
   private String ZZ11778Ap_Ref ;
   private String ZZ11779Ap_Art ;
   private String ZZ11780Ap_Mat ;
   private String ZZ11781Ap_ColN ;
   private String ZZ11784Ap_Maq ;
   private String ZZ11786Ap_Cln ;
   private String ZZ11787Ap_norma ;
   private String ZZ653OpeNom ;
   private java.util.Date Z11776Ap_fec ;
   private java.util.Date A11776Ap_fec ;
   private java.util.Date ZZ11776Ap_fec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_125_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11776Ap_fec ;
   private boolean n11777Ap_Disp ;
   private boolean n11778Ap_Ref ;
   private boolean n11779Ap_Art ;
   private boolean n11780Ap_Mat ;
   private boolean n11781Ap_ColN ;
   private boolean n11782Ap_ColNn ;
   private boolean n11783Ap_Tc ;
   private boolean n11784Ap_Maq ;
   private boolean n11785Ap_Cli ;
   private boolean n11786Ap_Cln ;
   private boolean n11787Ap_norma ;
   private boolean n653OpeNom ;
   private boolean n11788Ap_obs ;
   private boolean Gx_longc ;
   private boolean n11793CodApPm ;
   private boolean n11794CodApSt ;
   private boolean n11795CodApUn ;
   private boolean n11789Ap_NA ;
   private boolean n11790AP_St ;
   private String Z11788Ap_obs ;
   private String A11788Ap_obs ;
   private String ZZ11788Ap_obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private ICheckbox chkAp_NA ;
   private HTMLChoice radAP_St ;
   private IDataStoreProvider pr_default ;
   private String[] T01ID7_A407EmprNom ;
   private boolean[] T01ID7_n407EmprNom ;
   private int[] T01ID10_A11791Ap_numero ;
   private String[] T01ID10_A407EmprNom ;
   private boolean[] T01ID10_n407EmprNom ;
   private java.util.Date[] T01ID10_A11776Ap_fec ;
   private boolean[] T01ID10_n11776Ap_fec ;
   private String[] T01ID10_A11777Ap_Disp ;
   private boolean[] T01ID10_n11777Ap_Disp ;
   private String[] T01ID10_A11778Ap_Ref ;
   private boolean[] T01ID10_n11778Ap_Ref ;
   private String[] T01ID10_A11779Ap_Art ;
   private boolean[] T01ID10_n11779Ap_Art ;
   private String[] T01ID10_A11780Ap_Mat ;
   private boolean[] T01ID10_n11780Ap_Mat ;
   private String[] T01ID10_A11781Ap_ColN ;
   private boolean[] T01ID10_n11781Ap_ColN ;
   private int[] T01ID10_A11782Ap_ColNn ;
   private boolean[] T01ID10_n11782Ap_ColNn ;
   private byte[] T01ID10_A11783Ap_Tc ;
   private boolean[] T01ID10_n11783Ap_Tc ;
   private String[] T01ID10_A11784Ap_Maq ;
   private boolean[] T01ID10_n11784Ap_Maq ;
   private int[] T01ID10_A11785Ap_Cli ;
   private boolean[] T01ID10_n11785Ap_Cli ;
   private String[] T01ID10_A11786Ap_Cln ;
   private boolean[] T01ID10_n11786Ap_Cln ;
   private String[] T01ID10_A11787Ap_norma ;
   private boolean[] T01ID10_n11787Ap_norma ;
   private String[] T01ID10_A653OpeNom ;
   private boolean[] T01ID10_n653OpeNom ;
   private String[] T01ID10_A11788Ap_obs ;
   private boolean[] T01ID10_n11788Ap_obs ;
   private String[] T01ID10_A396EmprCod ;
   private int[] T01ID10_A129BarCod ;
   private boolean[] T01ID10_n129BarCod ;
   private byte[] T01ID10_A132BarCodReo ;
   private boolean[] T01ID10_n132BarCodReo ;
   private String[] T01ID10_A130BarCodPar ;
   private boolean[] T01ID10_n130BarCodPar ;
   private int[] T01ID10_A652OpeCod ;
   private boolean[] T01ID10_n652OpeCod ;
   private String[] T01ID8_A396EmprCod ;
   private String[] T01ID9_A653OpeNom ;
   private boolean[] T01ID9_n653OpeNom ;
   private String[] T01ID11_A396EmprCod ;
   private String[] T01ID12_A653OpeNom ;
   private boolean[] T01ID12_n653OpeNom ;
   private String[] T01ID13_A396EmprCod ;
   private int[] T01ID13_A11791Ap_numero ;
   private int[] T01ID6_A11791Ap_numero ;
   private java.util.Date[] T01ID6_A11776Ap_fec ;
   private boolean[] T01ID6_n11776Ap_fec ;
   private String[] T01ID6_A11777Ap_Disp ;
   private boolean[] T01ID6_n11777Ap_Disp ;
   private String[] T01ID6_A11778Ap_Ref ;
   private boolean[] T01ID6_n11778Ap_Ref ;
   private String[] T01ID6_A11779Ap_Art ;
   private boolean[] T01ID6_n11779Ap_Art ;
   private String[] T01ID6_A11780Ap_Mat ;
   private boolean[] T01ID6_n11780Ap_Mat ;
   private String[] T01ID6_A11781Ap_ColN ;
   private boolean[] T01ID6_n11781Ap_ColN ;
   private int[] T01ID6_A11782Ap_ColNn ;
   private boolean[] T01ID6_n11782Ap_ColNn ;
   private byte[] T01ID6_A11783Ap_Tc ;
   private boolean[] T01ID6_n11783Ap_Tc ;
   private String[] T01ID6_A11784Ap_Maq ;
   private boolean[] T01ID6_n11784Ap_Maq ;
   private int[] T01ID6_A11785Ap_Cli ;
   private boolean[] T01ID6_n11785Ap_Cli ;
   private String[] T01ID6_A11786Ap_Cln ;
   private boolean[] T01ID6_n11786Ap_Cln ;
   private String[] T01ID6_A11787Ap_norma ;
   private boolean[] T01ID6_n11787Ap_norma ;
   private String[] T01ID6_A11788Ap_obs ;
   private boolean[] T01ID6_n11788Ap_obs ;
   private String[] T01ID6_A396EmprCod ;
   private int[] T01ID6_A129BarCod ;
   private boolean[] T01ID6_n129BarCod ;
   private byte[] T01ID6_A132BarCodReo ;
   private boolean[] T01ID6_n132BarCodReo ;
   private String[] T01ID6_A130BarCodPar ;
   private boolean[] T01ID6_n130BarCodPar ;
   private int[] T01ID6_A652OpeCod ;
   private boolean[] T01ID6_n652OpeCod ;
   private String[] T01ID14_A396EmprCod ;
   private int[] T01ID14_A11791Ap_numero ;
   private String[] T01ID15_A396EmprCod ;
   private int[] T01ID15_A11791Ap_numero ;
   private int[] T01ID5_A11791Ap_numero ;
   private java.util.Date[] T01ID5_A11776Ap_fec ;
   private boolean[] T01ID5_n11776Ap_fec ;
   private String[] T01ID5_A11777Ap_Disp ;
   private boolean[] T01ID5_n11777Ap_Disp ;
   private String[] T01ID5_A11778Ap_Ref ;
   private boolean[] T01ID5_n11778Ap_Ref ;
   private String[] T01ID5_A11779Ap_Art ;
   private boolean[] T01ID5_n11779Ap_Art ;
   private String[] T01ID5_A11780Ap_Mat ;
   private boolean[] T01ID5_n11780Ap_Mat ;
   private String[] T01ID5_A11781Ap_ColN ;
   private boolean[] T01ID5_n11781Ap_ColN ;
   private int[] T01ID5_A11782Ap_ColNn ;
   private boolean[] T01ID5_n11782Ap_ColNn ;
   private byte[] T01ID5_A11783Ap_Tc ;
   private boolean[] T01ID5_n11783Ap_Tc ;
   private String[] T01ID5_A11784Ap_Maq ;
   private boolean[] T01ID5_n11784Ap_Maq ;
   private int[] T01ID5_A11785Ap_Cli ;
   private boolean[] T01ID5_n11785Ap_Cli ;
   private String[] T01ID5_A11786Ap_Cln ;
   private boolean[] T01ID5_n11786Ap_Cln ;
   private String[] T01ID5_A11787Ap_norma ;
   private boolean[] T01ID5_n11787Ap_norma ;
   private String[] T01ID5_A11788Ap_obs ;
   private boolean[] T01ID5_n11788Ap_obs ;
   private String[] T01ID5_A396EmprCod ;
   private int[] T01ID5_A129BarCod ;
   private boolean[] T01ID5_n129BarCod ;
   private byte[] T01ID5_A132BarCodReo ;
   private boolean[] T01ID5_n132BarCodReo ;
   private String[] T01ID5_A130BarCodPar ;
   private boolean[] T01ID5_n130BarCodPar ;
   private int[] T01ID5_A652OpeCod ;
   private boolean[] T01ID5_n652OpeCod ;
   private String[] T01ID19_A653OpeNom ;
   private boolean[] T01ID19_n653OpeNom ;
   private String[] T01ID20_A396EmprCod ;
   private int[] T01ID20_A11791Ap_numero ;
   private int[] T01ID21_A11791Ap_numero ;
   private String[] T01ID21_A11793CodApPm ;
   private boolean[] T01ID21_n11793CodApPm ;
   private String[] T01ID21_A11794CodApSt ;
   private boolean[] T01ID21_n11794CodApSt ;
   private String[] T01ID21_A11795CodApUn ;
   private boolean[] T01ID21_n11795CodApUn ;
   private byte[] T01ID21_A11789Ap_NA ;
   private boolean[] T01ID21_n11789Ap_NA ;
   private byte[] T01ID21_A11790AP_St ;
   private boolean[] T01ID21_n11790AP_St ;
   private String[] T01ID21_A396EmprCod ;
   private short[] T01ID21_A11792CodApId ;
   private String[] T01ID4_A11793CodApPm ;
   private boolean[] T01ID4_n11793CodApPm ;
   private String[] T01ID4_A11794CodApSt ;
   private boolean[] T01ID4_n11794CodApSt ;
   private String[] T01ID4_A11795CodApUn ;
   private boolean[] T01ID4_n11795CodApUn ;
   private String[] T01ID22_A11793CodApPm ;
   private boolean[] T01ID22_n11793CodApPm ;
   private String[] T01ID22_A11794CodApSt ;
   private boolean[] T01ID22_n11794CodApSt ;
   private String[] T01ID22_A11795CodApUn ;
   private boolean[] T01ID22_n11795CodApUn ;
   private String[] T01ID23_A396EmprCod ;
   private int[] T01ID23_A11791Ap_numero ;
   private short[] T01ID23_A11792CodApId ;
   private int[] T01ID3_A11791Ap_numero ;
   private byte[] T01ID3_A11789Ap_NA ;
   private boolean[] T01ID3_n11789Ap_NA ;
   private byte[] T01ID3_A11790AP_St ;
   private boolean[] T01ID3_n11790AP_St ;
   private String[] T01ID3_A396EmprCod ;
   private short[] T01ID3_A11792CodApId ;
   private int[] T01ID2_A11791Ap_numero ;
   private byte[] T01ID2_A11789Ap_NA ;
   private boolean[] T01ID2_n11789Ap_NA ;
   private byte[] T01ID2_A11790AP_St ;
   private boolean[] T01ID2_n11790AP_St ;
   private String[] T01ID2_A396EmprCod ;
   private short[] T01ID2_A11792CodApId ;
   private String[] T01ID27_A11793CodApPm ;
   private boolean[] T01ID27_n11793CodApPm ;
   private String[] T01ID27_A11794CodApSt ;
   private boolean[] T01ID27_n11794CodApSt ;
   private String[] T01ID27_A11795CodApUn ;
   private boolean[] T01ID27_n11795CodApUn ;
   private String[] T01ID28_A396EmprCod ;
   private int[] T01ID28_A11791Ap_numero ;
   private short[] T01ID28_A11792CodApId ;
   private String[] T01ID29_A407EmprNom ;
   private boolean[] T01ID29_n407EmprNom ;
   private String[] T01ID30_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tptapar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptapar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptapar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptapar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptapar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01ID2", "SELECT Ap_numero, Ap_NA, AP_St, EmprCod, CodApId FROM TXPTAPARL WHERE EmprCod = ? AND Ap_numero = ? AND CodApId = ?  FOR UPDATE OF Ap_NA, AP_St NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID3", "SELECT Ap_numero, Ap_NA, AP_St, EmprCod, CodApId FROM TXPTAPARL WHERE EmprCod = ? AND Ap_numero = ? AND CodApId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID4", "SELECT CodApPm, CodApSt, CodApUn FROM TXPTValAp WHERE EmprCod = ? AND CodApId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID5", "SELECT Ap_numero, Ap_fec, Ap_Disp, Ap_Ref, Ap_Art, Ap_Mat, Ap_ColN, Ap_ColNn, Ap_Tc, Ap_Maq, Ap_Cli, Ap_Cln, Ap_norma, Ap_obs, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPTAPAR WHERE EmprCod = ? AND Ap_numero = ?  FOR UPDATE OF Ap_fec, Ap_Disp, Ap_Ref, Ap_Art, Ap_Mat, Ap_ColN, Ap_ColNn, Ap_Tc, Ap_Maq, Ap_Cli, Ap_Cln, Ap_norma, Ap_obs, BarCod, BarCodReo, BarCodPar, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID6", "SELECT Ap_numero, Ap_fec, Ap_Disp, Ap_Ref, Ap_Art, Ap_Mat, Ap_ColN, Ap_ColNn, Ap_Tc, Ap_Maq, Ap_Cli, Ap_Cln, Ap_norma, Ap_obs, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPTAPAR WHERE EmprCod = ? AND Ap_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID8", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID9", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID10", "SELECT /*+ FIRST_ROWS(100) */ TM1.Ap_numero, T2.EmprNom, TM1.Ap_fec, TM1.Ap_Disp, TM1.Ap_Ref, TM1.Ap_Art, TM1.Ap_Mat, TM1.Ap_ColN, TM1.Ap_ColNn, TM1.Ap_Tc, TM1.Ap_Maq, TM1.Ap_Cli, TM1.Ap_Cln, TM1.Ap_norma, T3.OpeNom, TM1.Ap_obs, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.OpeCod FROM ((TXPTAPAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.Ap_numero = ? ORDER BY TM1.EmprCod, TM1.Ap_numero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID11", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID12", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND Ap_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ap_numero FROM TXPTAPAR WHERE ( Ap_numero > ?) and EmprCod = ? ORDER BY EmprCod, Ap_numero) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ID15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ap_numero FROM TXPTAPAR WHERE ( Ap_numero < ?) and EmprCod = ? ORDER BY EmprCod DESC, Ap_numero DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01ID16", "INSERT INTO TXPTAPAR(Ap_numero, Ap_fec, Ap_Disp, Ap_Ref, Ap_Art, Ap_Mat, Ap_ColN, Ap_ColNn, Ap_Tc, Ap_Maq, Ap_Cli, Ap_Cln, Ap_norma, Ap_obs, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTAPAR")
         ,new UpdateCursor("T01ID17", "UPDATE TXPTAPAR SET Ap_fec=?, Ap_Disp=?, Ap_Ref=?, Ap_Art=?, Ap_Mat=?, Ap_ColN=?, Ap_ColNn=?, Ap_Tc=?, Ap_Maq=?, Ap_Cli=?, Ap_Cln=?, Ap_norma=?, Ap_obs=?, BarCod=?, BarCodReo=?, BarCodPar=?, OpeCod=?  WHERE EmprCod = ? AND Ap_numero = ?", GX_NOMASK, "TXPTAPAR")
         ,new UpdateCursor("T01ID18", "DELETE FROM TXPTAPAR  WHERE EmprCod = ? AND Ap_numero = ?", GX_NOMASK, "TXPTAPAR")
         ,new ForEachCursor("T01ID19", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? ORDER BY EmprCod, Ap_numero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID21", "SELECT T1.Ap_numero, T2.CodApPm, T2.CodApSt, T2.CodApUn, T1.Ap_NA, T1.AP_St, T1.EmprCod, T1.CodApId FROM (TXPTAPARL T1 INNER JOIN TXPTValAp T2 ON T2.EmprCod = T1.EmprCod AND T2.CodApId = T1.CodApId) WHERE T1.EmprCod = ? and T1.Ap_numero = ? and T1.CodApId = ? ORDER BY T1.EmprCod, T1.Ap_numero, T1.CodApId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID22", "SELECT CodApPm, CodApSt, CodApUn FROM TXPTValAp WHERE EmprCod = ? AND CodApId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID23", "SELECT EmprCod, Ap_numero, CodApId FROM TXPTAPARL WHERE EmprCod = ? AND Ap_numero = ? AND CodApId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01ID24", "INSERT INTO TXPTAPARL(Ap_numero, Ap_NA, AP_St, EmprCod, CodApId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPTAPARL")
         ,new UpdateCursor("T01ID25", "UPDATE TXPTAPARL SET Ap_NA=?, AP_St=?  WHERE EmprCod = ? AND Ap_numero = ? AND CodApId = ?", GX_NOMASK, "TXPTAPARL")
         ,new UpdateCursor("T01ID26", "DELETE FROM TXPTAPARL  WHERE EmprCod = ? AND Ap_numero = ? AND CodApId = ?", GX_NOMASK, "TXPTAPARL")
         ,new ForEachCursor("T01ID27", "SELECT CodApPm, CodApSt, CodApUn FROM TXPTValAp WHERE EmprCod = ? AND CodApId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID28", "SELECT EmprCod, Ap_numero, CodApId FROM TXPTAPARL WHERE EmprCod = ? and Ap_numero = ? ORDER BY EmprCod, Ap_numero, CodApId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID29", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ID30", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((int[]) buf[32])[0] = rslt.getInt(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((short[]) buf[12])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
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
                  stmt.setString(3, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 15);
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
                  stmt.setString(6, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 6);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 30);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 800);
               }
               stmt.setString(15, (String)parms[27], 3);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[35]).intValue());
               }
               return;
            case 15 :
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
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 15);
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
                  stmt.setString(5, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 6);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 30);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 800);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[33]).intValue());
               }
               stmt.setString(18, (String)parms[34], 3);
               stmt.setInt(19, ((Number) parms[35]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
               stmt.setString(4, (String)parms[5], 3);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 23 :
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
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
      }
   }

}

